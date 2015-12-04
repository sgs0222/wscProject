package koreatech.cse.controller.oauth2;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import koreatech.cse.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by hyemi on 2015-12-01.
 */
@Controller
@RequestMapping("/oauth2")
public class NaverOauth2Controller {

    private static final String mydomain = "http%3A%2F%2Ftestoauth2.com%3A8080%2Foauth2%2FnaverCallback";
    private static final String clientId = "2kx5uG4jHnTuzOWWbXag";
    private static final String clientSecret = "_8lrsS0rNh";
    private static final String requestUrl = "https://nid.naver.com/oauth2.0/authorize?client_id=" + clientId + "&response_type=code&redirect_uri="+ mydomain + "&state=";
    private static final String userProfileUrl = "https://apis.naver.com/nidlogin/nid/getUserProfile.xml";

    @Inject
    private UserService userService;

    public static String generateState() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }
    public static Map<String, String> JSONStringToMap(String str){
        Map<String,String> map = new HashMap<String,String>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            map = mapper.readValue(str, new TypeReference<HashMap<String,String>>() {});
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static String getHtml(String url, String authorization) {
        HttpURLConnection httpRequest = null;
        String resultValue = null;
        try {
            URL u = new URL(url);
            httpRequest = (HttpURLConnection) u.openConnection();
            httpRequest.setRequestProperty("Content-type", "text/xml; charset=UTF-8");
            if(authorization != null){
                httpRequest.setRequestProperty("Authorization", authorization);
            }
            httpRequest.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(httpRequest.getInputStream(), "UTF-8"));
            StringBuffer sb = new StringBuffer();
            String line = null;
            while((line = in.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }
            resultValue = sb.toString();
        } catch (IOException e) {
        } finally {
            if (httpRequest != null) {
                httpRequest.disconnect();
            }
        }
        return resultValue;
    }

    private String getAccessUrl(String state, String code) {
        String accessUrl = "https://nid.naver.com/oauth2.0/token?client_id=" + clientId + "&client_secret=" + clientSecret
                + "&grant_type=authorization_code" + "&state=" + state + "&code=" + code;
        return accessUrl;
    }

    @RequestMapping(value = "/naverLogin")
    public String naverLogin(HttpSession session) {
        String state = generateState();     //토큰을 생성합니다.
        session.setAttribute("state", state);      //세션에 토큰을 저장합니다.
        return "redirect:" + requestUrl + state;   //만들어진 URL로 인증을 요청합니다.

    }



    @RequestMapping("/naverCallback")//call_back 함수
    public String callback(@RequestParam String code,@RequestParam String state, HttpServletRequest request) /*throws UnsupportedEncodingException*/ {
        System.out.println("naver Callback is called!!");
        System.out.println(code);
       String storedState = (String) request.getSession().getAttribute("state");  //세션에 저장된 토큰을 받아옵니다.
        if (!state.equals(storedState)) {             //세션에 저장된 토큰과 인증을 요청해서 받은 토큰이 일치하는지 검증합니다.
            System.out.println("401 unauthorized");   //인증이 실패했을 때의 처리 부분입니다.
            return "redirect:/";
        }
        String data = getHtml(getAccessUrl(state, code), null);           //AccessToken을 요청하고 그 값을 가져옵니다.
        Map<String, String> map = JSONStringToMap(data);               //JSON의 형태로 받아온 값을 Map으로 저장합니다.
        String accessToken = map.get("access_token");
        String tokenType = map.get("token_type");
        return "redirect:/";

    }



}
