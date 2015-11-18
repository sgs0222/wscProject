import koreatech.cse.service.UserService;
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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

import static org.junit.Assert.*;
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
public class MyTest{
    private MockMvc mockMvc;
    @Inject
    private WebApplicationContext wac;
    @Autowired
    private UserService userService;
    @Value("${env.text}")
    private String envText;

    int a;

    @Before
    public void setup() {
        System.out.println("setup");
        this.mockMvc = webAppContextSetup(this.wac).build();
        int a = 10;

        System.out.println("wac: " + wac);
        System.out.println("this: " + this);
    }
    @Test
    public void mvcTest() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk()).andExpect(view().name("hello"));

     //   assertEquals(userService, null);
    }

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
    }
}