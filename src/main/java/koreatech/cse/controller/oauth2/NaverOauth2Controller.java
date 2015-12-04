package koreatech.cse.controller.oauth2;

/**
 * Created by user on 2015-12-01.
 */
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;

import koreatech.cse.domain.oauth2.naver.NaverProfile;
import koreatech.cse.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.GrantType;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

class Utils {

    public static String generateState(){
        SecureRandom random = new SecureRandom();
        return new BigInteger(130,random).toString();
    }
}

@Controller
@RequestMapping("/oauth2")
public class NaverOauth2Controller {
    private static final String REQUEST_TOKEN_URL = "https://nid.naver.com/naver.oauth?mode=req_req_token";
    private static final String AUTHORIZE_URL = "https://nid.naver.com/naver.oauth?mode=auth_req_token";
    private static final String ACCESS_TOKEN_URL = "https://nid.naver.com/naver.oauth?mode=req_acc_token";
    private static final String CONSUMER_KEY = "x_QwVS72ixMAc6ubahE2";
    private static final String CONSUMER_SECRET = "FKTAsSIUZ3";
    private static final int cafeid = 1111111111;

    private static String naver_redirect_uri = "http://test.java.com:8080/oauth2/naver_callback";//"http://localhost:8080/oauth2/naver_callback";
    private static String naver_client_id = "Il6niARmaHxJJ17qCyiK";
    private static String naver_client_secret = "jSQJqzirQX";
    private static String naver_authorization_endpoint = "https://nid.naver.com/oauth2.0/authorize";//"https://nid.naver.com/naver.oauth?mode=auth_req_token";;
    private static String naver_token_endpoint = "https://nid.naver.com/naver.oauth?mode=req_acc_token";

    private static final String mydomain = "http%3A%2F%2Ftest.java.com%3A8080%2Foauth2%2Fnaver_callback";
    private static final String clientId = "Il6niARmaHxJJ17qCyiK";
    private static final String clientSecret = "jSQJqzirQX";
    private static final String requestUrl = "https://nid.naver.com/oauth2.0/authorize?client_id=" + clientId + "&response_type=code&redirect_uri="+ mydomain + "&state=";




    @Inject
    private UserService userService;

    private OAuth2Template naverOAuth2Template = new OAuth2Template(
            naver_client_id,
            naver_client_secret,
            naver_authorization_endpoint,
            naver_token_endpoint
    );

    private HashMap<String, AccessGrant> naverAccessToken = new HashMap();



    @RequestMapping("/naver_authorization_code")
    public String naver_authorization_code(HttpSession session){

        OAuth2Parameters parameters = new OAuth2Parameters();
        parameters.setRedirectUri(naver_redirect_uri);
       // parameters.setScope("");
        String state = Utils.generateState();
        session.setAttribute("state",state);

        String authorizeUri = naverOAuth2Template.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE, parameters);
        System.out.println("authorizeUri: " + authorizeUri+"&state="+state);

        return "redirect:" + authorizeUri +"&state=" +state;
/*
        String state = Utils.generateState();
        session.setAttribute("state",state);
        return "redirect:" + requestUrl + state;*/
    }

    @RequestMapping("/naver_callback")
    public String naver_callback(Model model, @RequestParam(required=true) String code, HttpServletRequest request) throws Exception {
        System.out.println("Naver Callback is called!!");
        System.out.println(code);
        System.out.println("test1");
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setOutputStreaming(false);
        naverOAuth2Template.setRequestFactory(simpleClientHttpRequestFactory);

        System.out.println("test2");
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
        multiValueMap.add("client_id", naver_client_id);
        multiValueMap.add("client_secret", naver_client_secret);

        System.out.println("test3");
        AccessGrant accessGrant = naverOAuth2Template.exchangeForAccess(
                code,
                naver_redirect_uri,
                multiValueMap
        );
        System.out.println("test4");
        System.out.println("------ AccessGrant ------");
        System.out.println(accessGrant.getAccessToken());
        System.out.println(accessGrant.getRefreshToken());
        System.out.println(accessGrant.getExpireTime());
        System.out.println(accessGrant.getScope());
        System.out.println();

        NaverProfile naverProfile = getnaverProfile(accessGrant);
        if (naverProfile != null) {
            naverAccessToken.put(naverProfile.getId(), accessGrant);
        }

        return userService.naverLogin(request, naverProfile);
    }

    public NaverProfile getnaverProfile(AccessGrant accessGrant) {
        String naver_profile_url = String.format("https://graph.facebook.com/v2.5/me?access_token=%s",
                accessGrant.getAccessToken());
        RestTemplate restTemplate = new RestTemplate();
        NaverProfile naverProfile = null;
        try {
            ResponseEntity<NaverProfile> naverProfileResponseEntity
                    = restTemplate.getForEntity(naver_profile_url, NaverProfile.class);
            naverProfile = naverProfileResponseEntity.getBody();
            System.out.println(naverProfile);
        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }
        return naverProfile;
    }






/*
    public static void main(String[] args) throws Exception {

        OAuthConsumer consumer = new DefaultOAuthConsumer(
                CONSUMER_KEY,
                CONSUMER_SECRET,
                SignatureMethod.HMAC_SHA1);

        OAuthProvider provider = new DefaultOAuthProvider(consumer,
                REQUEST_TOKEN_URL,
                ACCESS_TOKEN_URL,
                AUTHORIZE_URL);

        System.out.println("Fetching request token from naver...");

        // we do not support callbacks, thus pass OOB
        String authUrl = provider.retrieveRequestToken(OAuth.OUT_OF_BAND);

        System.out.println("Request token: " + consumer.getToken());
        System.out.println("Token secret: " + consumer.getTokenSecret());

        System.out.println("Now visit (copy and past web brower):\n" + authUrl
                + "\n... and watch brower address find aouth_verifier. ");
        System.out.println("sample : https://nid.naver.com/oob?oauth_token=SbiibfFhUZRrxqe1&oauth_verifier=qweer1234");
        System.out.println("Enter the oauth_verifier code  and hit ENTER when you're done:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pin = br.readLine();

        System.out.println("Fetching access token from Twitter...");

        provider.retrieveAccessToken(pin);

        System.out.println("Access token: " + consumer.getToken());
        System.out.println("Token secret: " + consumer.getTokenSecret());

        URL url = new URL("http://twitter.com/statuses/mentions.xml");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();

        consumer.sign(request);

        System.out.println("Sending request to Twitter...");
        request.connect();

        System.out.println("Response: " + request.getResponseCode() + " "
                + request.getResponseMessage());
        System.out.println("cafe text");

        System.out.println(getCafeRecentPosts(consumer, cafeid, 1));

    }
    public static String getCafeRecentPosts(OAuthConsumer consumer, int clubId, int perPage)
    {
        URL url;
        StringBuffer buffer = new StringBuffer();
        Scanner scann = null;
        try {
            url = new URL("http://openapi.naver.com/cafe/getArticleList.xml?search.clubid="+clubId+"&search.perPage="+perPage);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            consumer.sign(request);
            request.connect();
            InputStream is = request.getInputStream();
            scann = new Scanner(is, "UTF-8");
            while(scann.hasNextLine())
            {
                buffer.append(scann.nextLine());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            if ( scann != null ) scann.close();
        }
        return buffer.toString();
    }*/
}
