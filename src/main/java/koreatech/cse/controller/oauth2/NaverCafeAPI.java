package koreatech.cse.controller.oauth2;
import koreatech.cse.service.UserService;
import mypackage.competitionType;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;

import org.dom4j.Element;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

/**
 * Created by hyemi on 2015-12-06.
 */
@Controller
@RequestMapping("/oauth")
public class NaverCafeAPI {

    //-----------------------setting dev

    private static final String callbackUrl = "http://testoauth2.com:8080/oauth/callback";
    private static final String requestTokenUrl = "https://nid.naver.com/naver.oauth?mode=req_req_token";
    private static final String authorizeUrl = "https://nid.naver.com/naver.oauth?mode=auth_req_token";
    private static final String accessTokenUrl = "https://nid.naver.com/naver.oauth?mode=req_acc_token";
    private static final String consumerKey = "rd3ah1kSKs8f3Fvx5Zms";
    private static final String consumerSecret = "U60pO2DexD";

    //---------------------------setting deploy
/*
    private static final String callbackUrl = "http://default-environment-3xvzmdjgmm.elasticbeanstalk.com/oauth/callback";
    private static final String requestTokenUrl = "https://nid.naver.com/naver.oauth?mode=req_req_token";
    private static final String authorizeUrl = "https://nid.naver.com/naver.oauth?mode=auth_req_token";
    private static final String accessTokenUrl = "https://nid.naver.com/naver.oauth?mode=req_acc_token";
    private static final String consumerKey = " rWQULw77nGPfThBJh4pq";
    private static final String consumerSecret = "atjmuOKZdE";
*/
    @Inject
    private UserService userService;



    @RequestMapping(value = "/naverLogin")
    public String naverLogin(HttpSession session) throws OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException,
            OAuthCommunicationException {
        System.out.println("Login is Called");
        OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
        OAuthProvider provider = new DefaultOAuthProvider(requestTokenUrl, accessTokenUrl, authorizeUrl);

        String oAuthUrl = provider.retrieveRequestToken(consumer, callbackUrl);
        session.setAttribute("consumer", consumer);
        session.setAttribute("provider", provider);
        return "redirect:" + oAuthUrl;
    }

    @RequestMapping("/callback")
    public String callback(@RequestParam String oauth_verifier, HttpSession session)
            throws
            OAuthMessageSignerException, OAuthNotAuthorizedException, OAuthExpectationFailedException, OAuthCommunicationException {

        OAuthConsumer consumer = (DefaultOAuthConsumer) session.getAttribute("consumer");
        OAuthProvider provider = (DefaultOAuthProvider) session.getAttribute("provider");
        if (oauth_verifier != null) {
            provider.retrieveAccessToken(consumer, oauth_verifier.trim());
            session.setAttribute("accessToken", consumer.getToken());
            session.setAttribute("accessTokenSecret", consumer.getTokenSecret());
        }
        System.out.println("accessToken" + consumer.toString());

        String accessToken = (String) session.getAttribute("accessToken");
        String accessTokenSecret = (String) session.getAttribute("accessTokenSecret");
        consumer.setTokenWithSecret(accessToken, accessTokenSecret);

        return "redirect:" + "getNaverCafeInfo2";
    }

    @RequestMapping("/getNaverCafeInfo")
    public String getCafeInfo(HttpSession session) throws IOException, OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
        System.out.println("test2");
        OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
        String accessToken = (String) session.getAttribute("accessToken");
        String accessTokenSecret = (String) session.getAttribute("accessTokenSecret");
        consumer.setTokenWithSecret(accessToken, accessTokenSecret);
        String cafeAPIUrl = " http://openapi.naver.com/cafe/getArticleList.xml?search.clubid=15754634&search.menuid=485&search.page=1&search.perPage=20 ";

        HttpURLConnection httpRequest = null;
        String resultValue = null;

        try {
            URL url = new URL(cafeAPIUrl);
            httpRequest = (HttpURLConnection) url.openConnection();
            httpRequest.setRequestProperty("Content-type", "text/xml; charset=UTF-8");
            consumer.sign(httpRequest);
            httpRequest.connect();

            StringBuffer sb = new StringBuffer();
            byte[] b = new byte[1024];
            for (int n; (n = httpRequest.getInputStream().read(b)) != -1; ) {
                sb.append(new String(b, 0, n));
            }
            resultValue = sb.toString();
        } finally {
            if (httpRequest != null) {
                httpRequest.disconnect();
            }
        }
        System.out.println("resultValue :" + resultValue);
        return "redirect:/";
    }

    //--------------------------------------------------------여기서부터 테스트


    @RequestMapping("/getNaverCafeInfo2")
    public String getCafeInfo2(HttpSession session) throws IOException, OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {
        System.out.println("test2");
        OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);
        String accessToken = (String) session.getAttribute("accessToken");
        String accessTokenSecret = (String) session.getAttribute("accessTokenSecret");
        consumer.setTokenWithSecret(accessToken, accessTokenSecret);
        String cafeAPIUrl = " http://openapi.naver.com/cafe/getArticleList.xml?search.clubid=15754634&search.menuid=485&search.page=1&search.perPage=20 ";

        HttpURLConnection httpRequest = null;
        String resultValue = null;
        List<competitionType> competitions = new ArrayList<competitionType>();

        try {
            URL url = new URL(cafeAPIUrl);
            httpRequest = (HttpURLConnection) url.openConnection();
            httpRequest.setRequestProperty("Content-type", "text/xml; charset=UTF-8");
            httpRequest.setRequestProperty("pageEncoding", "UTF-8");

            consumer.sign(httpRequest);
            httpRequest.connect();

            /*

            StringBuffer sb = new StringBuffer();
            byte[] b = new byte[1024];
            for (int n; (n = httpRequest.getInputStream().read(b)) != -1; ) {
                sb.append(new String(b, 0, n));
            }
            resultValue = sb.toString();
            */
            BufferedReader br = new BufferedReader(new InputStreamReader(httpRequest.getInputStream(),"UTF-8"));
            StringBuilder sb = new StringBuilder();
            while(true){
                String str = br.readLine();
                if(str == null) break;
                sb.append(str);
                sb.append("\n");
            }

            resultValue = sb.toString();
            br.close();

        } finally {
            if (httpRequest != null) {
                httpRequest.disconnect();
            }
        }

        System.out.println(resultValue);

        try {

            SAXReader reader = new SAXReader();
            InputStream is = new ByteArrayInputStream(resultValue.getBytes("utf-8"));
            System.out.println("doc parser");

            Document document = reader.read(is);
            Element root = document.getRootElement();

            Element result = root.element("result");
            Element error = root.element("error_code");
            if(error==null)
            {
                Element articles = result.element("articles");
                List list = new ArrayList();
                for(Iterator i = articles.elementIterator("article"); i.hasNext();)
                {
                    Map map = new HashMap();
                    Element articleElement = (Element) i.next();
                    String articleId = articleElement.element("articleid").getStringValue();
                    String subject = articleElement.element("subject").getStringValue();
                    String writedate = articleElement.element("writedate").getStringValue();
                    map.put("articleId",articleId);
                    map.put("subject",subject);
                    map.put("writedate", writedate);
                    list.add(map);
                    System.out.println(map.toString());
                    competitions.add(new competitionType(articleId,subject,writedate));
                }
            }
            else
            {
                Map map = new HashMap();
                map.put("error",error.getStringValue());
            }
        }catch (Exception e)
        {
            System.out.println("parse error" + e.getMessage());
        }




        return userService.naverDBsave(competitions);
    }
}