package controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tutorial.ApplicationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@SpringApplicationConfiguration(classes = ApplicationConfiguration.class)
@WebAppConfiguration
public class UserControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
				.build();
	}

	@Test
	public void showUsersView() throws Exception {
		mockMvc.perform(get("/users")).andExpect(status().isOk())
				.andExpect(view().name("listUser"))
				.andExpect(forwardedUrl("/WEB-INF/jsp/listUser.jsp"));
	}

	@Test
	public void showFormView() throws Exception {
		mockMvc.perform(get("/form")).andExpect(status().isOk())
				.andExpect(view().name("formUser"))
				.andExpect(forwardedUrl("/WEB-INF/jsp/formUser.jsp"));
	}

	@Test
	public void showFormSearchUserView() throws Exception {
		mockMvc.perform(get("/searchUsers")).andExpect(status().isOk())
				.andExpect(view().name("formSearchUsers"))
				.andExpect(forwardedUrl("/WEB-INF/jsp/formSearchUsers.jsp"));
	}

	@Test
	public void showResultSearchUserView() throws Exception {
		mockMvc.perform(get("/resultSearchUsers")).andExpect(status().isOk())
				.andExpect(view().name("formSearchUsers"))
				.andExpect(forwardedUrl("/WEB-INF/jsp/formSearchUsers.jsp"));
	}
}