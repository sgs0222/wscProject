package koreatech.cse.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import mypackage.JobSearchType;
import mypackage.saramIn;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

@Controller
@RequestMapping("/")
public class HomeController {

    @Value("${env.text}")
    private String env;

    @ModelAttribute("name")
    private String getName() {
        return "IamHomeControllerModelAttribute";
    }

    @RequestMapping
    public String home(Model model) {
        model.addAttribute("textFromController", "World");
        return "hello";
    }

    @RequestMapping("/env")
    public String env(Model model) {
        model.addAttribute("textFromController", env);
        return "hello";
    }

    @RequestMapping("/test")
    public String env2(Model model) {
        model.addAttribute("textFromController", env);
        return "hello";
    }

    @RequestMapping("/requestParamTest")
    public String requestParamTest(@RequestParam(name = "a", required=false, defaultValue = "0") int a,
                                   @RequestParam("b") String b,
                                   @RequestParam(value= "c", defaultValue = "true") boolean c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        return "hello";
    }

    @RequestMapping("/pathVariableTest/{a}/{b}/{c}")
    public String pathVariableTest(@PathVariable(value="a") String a, @PathVariable String b, @PathVariable int c) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        return "hello";
    }

    @RequestMapping("/requestParamMapTest")
    public String requestParamMapTest(@RequestParam Map<String, String> map) {
        for(Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        return "hello";
        }

    @RequestMapping(value = "/requestMappingGetTest",
            method = RequestMethod.GET,
            params ="test=true")
    public String requestMappingGetTest(Model model) {
        model.addAttribute("textFromController", "World");
        return "hello";
    }

    @RequestMapping(value = "/requestMappingPostTest",
            method = RequestMethod.POST)
    @ResponseBody
    public String requestMappingPostTest() {
        return "hello";
    }

    @RequestMapping(value = "/daum_book_request", method = RequestMethod.GET)
    public String daumBookRequest(Model model, @RequestParam(name = "userId") String userId) {
        model.addAttribute("userId", userId);
        return "daumBookRequest";
    }

    @RequestMapping(value = "/facebook_likes_request", method = RequestMethod.GET)
    public String facebookFriendsRequest(Model model, @RequestParam(name = "userId") String userId) {
        model.addAttribute("userId", userId);
        return "facebookLikesRequest";
    }

    @RequestMapping(value = "/testJobState")
    public String jobTest(Model model){
        String jobUrl = "http://api.saramin.co.kr/job-search?";

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        saramIn test = null;
        List<saramIn> temp = new ArrayList<saramIn>();

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
                saramIn temp1 = new saramIn(keyword,company,salary);
               // System.out.println(temp1.toString());
                temp.add(temp1);
            }
            System.out.println("tempSize = " + temp.size());
        } catch (HttpClientErrorException e) {
            System.out.println("Exception : " + e.getStatusCode() + ": " + e.getStatusText());
        }
        model.addAttribute("jobsList", temp);
        return "testJobState";

    }





}
