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
/*
    @Before
    public void setup() {
        System.out.println("setup");
        this.mockMvc = webAppContextSetup(this.wac).build();
        int a = 10;

        System.out.println("wac: " + wac);
        System.out.println("this: " + this);
    }
*/
    @Test
    public void jobTest() {
        String jobUrl = "http://api.saramin.co.kr/job-search";

        RestTemplate restTemplate = new RestTemplate();
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(jobUrl);

            System.out.println("job :" + builder.build().encode().toUri());

            /*
            ResultType jobsType = restTemplate.getForObject(builder.build().encode().toUri(),
                    ResultType.class);

            String totalCnt = jobsType.toString();
            System.out.println(totalCnt);
            */

            JobType jobType = restTemplate.getForObject(builder.build().encode().toUri(), JobType.class);
            String id = jobType.getId();
            System.out.println(id);

            JobsType jobsType = restTemplate.getForObject(builder.build().encode().toUri(), JobsType.class);
            String count = jobsType.getCount();
            System.out.println(count);

            //SalaryType salaryType = restTemplate.getForObject(builder.build().encode().toUri(), SalaryType.class);
            //String value = salaryType.getValue();
            //System.out.println(value);

            //System.out.println(jobType.getCompany().getName().getValue().toString());
            //System.out.println(resultType.getMntInfo().get(0).getMntiName());

        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
    }

/*
    @Test
    public void diTest() throws Exception {
        assertNotEquals(userService, null);
    }

    @Test
    public void userServiceTest() throws Exception {
        assertEquals(userService.countAuthoritiesRoleUser(), userService.countUsers());
    }

    @Test
    public void printProperties() {
        System.out.println(userService);
    }

    @Test(expected = UsernameNotFoundException.class)
    public void getUsers() throws Exception {
        UserDetails userDetails = userService.loadUserByUsername("unknwn_id");
        System.out.println(userDetails);
    }

    @After
    public  void wrapup() {
        System.out.println("wrapup");
        System.out.println();
    }*/
}