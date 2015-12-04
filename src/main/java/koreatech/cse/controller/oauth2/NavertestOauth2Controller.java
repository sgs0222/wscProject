package koreatech.cse.controller.oauth2;

import koreatech.cse.domain.oauth2.facebook.FacebookLike;
import koreatech.cse.domain.oauth2.facebook.FacebookProfile;
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
import java.util.HashMap;

@Controller
@RequestMapping("/oauth2")
public class NavertestOauth2Controller {

    private static String naver_redirect_uri = "http://testoauth2.com:8080/oauth2/naver_callback";
    private static String naver_client_id = "RD3eJvWPpsFxZpOGove0";
    private static String naver_client_secret = "dESVGc3bu1";
    private static String naver_authorization_endpoint = "https://nid.naver.com/oauth2.0/authorize";
    private static String naver_token_endpoint = "https://nid.naver.com/oauth2.0/token";

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
    public String naver_authorization_code() {
        OAuth2Parameters parameters = new OAuth2Parameters();
        parameters.setRedirectUri(naver_redirect_uri);
        parameters.setScope("public_profile,email,user_friends,user_likes");

        String authorizeUrl = naverOAuth2Template.buildAuthorizeUrl(GrantType.AUTHORIZATION_CODE, parameters);
        System.out.println("authorizeUrl: " + authorizeUrl);

        return "redirect:" + authorizeUrl;
    }

    @RequestMapping("/naver_callback")
    public String naver_callback(Model model, HttpServletRequest request, @RequestParam(required = true) String code) throws Exception {

        System.out.println("naver Callback is called!!");
        System.out.println(code);

        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setOutputStreaming(false);
        naverOAuth2Template.setRequestFactory(simpleClientHttpRequestFactory);

        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<String, String>();
        multiValueMap.add("client_id", naver_client_id);
        multiValueMap.add("client_secret", naver_client_secret);

        AccessGrant accessGrant = naverOAuth2Template.exchangeForAccess(
                code,
                naver_redirect_uri,
                multiValueMap
        );

        System.out.println("------ AccessGrant ------");
        System.out.println(accessGrant.getAccessToken());
        System.out.println(accessGrant.getRefreshToken());
        System.out.println(accessGrant.getExpireTime());
        System.out.println(accessGrant.getScope());
        return null;
    }
}





