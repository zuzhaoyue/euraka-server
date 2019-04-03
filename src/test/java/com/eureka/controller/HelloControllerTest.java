package test.com.eureka.controller;

import com.eureka.EurekaServerApplication;
import com.eureka.controller.HelloController;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers. content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers. status;
/**
* HelloController Tester.
*
* @author <Authors name>
* @since <pre>四月 2, 2019</pre>
* @version 1.0
*/
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnitæ¯æï¼ç±æ­¤å¼å¥Spring-Testæ¡æ¶æ¯æï¼
@SpringBootTest(classes = EurekaServerApplication.class) // æå®æä»¬SpringBootå·¥ç¨çApplicationå¯å¨ç±»
@WebAppConfiguration
public class HelloControllerTest {
    MockMvc mvc;

@Before
public void before() throws Exception {
    mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
}

@After
public void after() throws Exception {
}

/**
*
* Method: hello()
*
*/
@Test
public void testHello() throws Exception {
//TODO: Test goes here...
    mvc.perform(MockMvcRequestBuilders.get("").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(equalTo("hi zzy ")));
}

    /*@Test
	public void contextLoads() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("hello zzy")));

	}
*/


}
