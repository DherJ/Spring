package dao;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.ApplicationConfiguration;
import com.tutorial.dao.UserDao;
import com.tutorial.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfiguration.class)
@SpringApplicationConfiguration(classes = ApplicationConfiguration.class)
public class UserDAOTest {

	private final String NAME_SEARCH = "test";
	private final int ID_SEARCH = 9;
	private final String ID_SEARCH_NAME = "ooo";
	private final String ID_SEARCH_FIRSTNAME = "ooo";
	private final String ID_SEARCH_EMAIL = "ooo@ooo";
	private final int ID_SEARCH_AGE = 10;

	private int id_last;

	@Autowired
	public UserDao userDao;

	private User userAdd;

	@Before
	public void init() {
		userAdd = new User();
		userAdd.setId(userDao.countUsers() + 1);
		userAdd.setName("test");
		userAdd.setFirstName("test");
		userAdd.setEmail("test@test");
		userAdd.setAge(1);
		id_last = userDao.countUsers() + 1;
	}

	@Test
	@Transactional
	public void testAddUser() {
		userDao.insertUser(userAdd);
		User newUser = userDao.getUserById(id_last);
		assertEquals(newUser.getId(), userAdd.getId());
		assertEquals(newUser.getName(), userAdd.getName());
		assertEquals(newUser.getFirstName(), userAdd.getFirstName());
		assertEquals(newUser.getEmail(), userAdd.getEmail());
		assertEquals(newUser.getAge(), userAdd.getAge());
	}

	@Test
	public void testUpdateUser() {
		int id = 14;
		String newName = "newName";
		User oldUser = userDao.getUserById(id);
		User newUser = new User(id, newName, oldUser.getFirstName(),
				oldUser.getEmail(), oldUser.getAge());

		userDao.updateUser(newUser);
		User lastUser = userDao.getUserById(id);

		assertEquals(oldUser.getId(), lastUser.getId());
		assertEquals(newName, lastUser.getName());
		assertEquals(oldUser.getFirstName(), lastUser.getFirstName());
		assertEquals(oldUser.getEmail(), lastUser.getEmail());
		assertEquals(oldUser.getAge(), lastUser.getAge());
	}

	@Test
	public void testDeleteUser() {
		int id_delete = id_last - 1;
		User user = userDao.getUserById(id_delete);
		userDao.deleteUser(id_last);
		assertThat(user).isNotIn(userDao.listUsers());
	}

	@Test
	@Transactional
	public void testSearchById() {
		User userExpected = new User(ID_SEARCH, ID_SEARCH_NAME,
				ID_SEARCH_FIRSTNAME, ID_SEARCH_EMAIL, ID_SEARCH_AGE);
		User userRes = userDao.getUserById(ID_SEARCH);
		assertEquals(userExpected.getId(), userRes.getId());
		assertEquals(userExpected.getName(), userRes.getName());
		assertEquals(userExpected.getFirstName(), userRes.getFirstName());
		assertEquals(userExpected.getEmail(), userRes.getEmail());
		assertEquals(userExpected.getAge(), userRes.getAge());
	}

	@Test
	@Transactional
	public void testSearchUsersByName() {
		List<User> userRes = userDao.getUsersByName(NAME_SEARCH);
		assertThat(userRes).hasSize(3);
		// test si la propriété "name" de tous les éléments de la liste sont
		// égaux à la variable "name"
		assertThat(userRes.getClass().getName().contains(NAME_SEARCH));
	}
}