import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import com.sun.deploy.net.HttpResponse;
import koreatech.cse.service.UserService;
import mypackage.*;
import org.apache.ibatis.annotations.ResultType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
        {"file:src/main/resources/common/services.xml",
                "file:src/main/resources/common/security.xml",
                "file:src/main/resources/common/mybatis.xml"}
)
public class Testfortest {
    private MockMvc mockMvc;
    @Inject
    private WebApplicationContext wac;
    @Autowired
    private UserService userService;
    @Value("${env.text}")
    private String envText;
    private JobType jobType;

    int a;

    @Test
    public void jobTest() {
        String jobUrl = "http://api.saramin.co.kr/job-search?";

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(jobUrl)
                    .queryParam("keywords", "프로그래밍+IT")
                    .queryParam("job_category", "4")///it관련
                    .queryParam("loc_cd", "101000")//서울
                    .queryParam("edu_lv", "8")//대학교 졸업 이상
                    .queryParam("fields", "posting-date")//게시일 순으로 정렬
                    .queryParam("count", "110");//max count

            System.out.println("job :" + builder.build().encode().toUri());

            JobSearchType jobType= restTemplate.getForObject(builder.build().encode().toUri(), JobSearchType.class);

            String count = jobType.getJobs().getCount();


            System.out.println("Total count :" + count);

            for(int i=0; i < Integer.parseInt(count); i++) {
                String keyword = jobType.getJobs().getJob().get(i).getKeyword();
                String company = jobType.getJobs().getJob().get(i).getCompany().getName().getHref();//링크 누르면 이동
                String salary = jobType.getJobs().getJob().get(i).getSalary().getCode();

                System.out.println(company);
                System.out.println(keyword);
                System.out.println(salary);
            }


        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
    }
}