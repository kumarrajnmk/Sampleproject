
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.nmk.ecomm.model.User;
import com.nmk.ecomm.web.controller.UserController;
@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class UserWebControllerTest {
	@Autowired
	private static UserController mockUser;
	private static User user1;
	private static User user2;

	@BeforeClass
	public static void init() throws IllegalAccessException, InvocationTargetException {
		mockUser = mock(UserController.class);
 
		// Stubbing

		final BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		user1 = new User("36","hello","katta","john","son","siva.nmkglobal@gmail.com","2565459245","0406525435","96548542533","ameerpet","active","gopi",new Date(2017,8,9),"sathish",new Date());
		user2 = new User("36","hello","katta","john","son","siva.nmkglobal@gmail.com","2565459245","0406525435","96548542533","ameerpet","active","gopi",new Date(2017,8,9),"sathish",new Date());
		final Model model = null;
		 String value2="Getall";
		when(mockUser.getAllUsers(model)).thenReturn(value2);
		String value ="GET";
		
	//	  when(mockUser.userInfo(user1, model)).thenReturn(value); 
		
	//	when(mockUser.submitForm(user1, result, model)).thenReturn(user1.getCreatedBy());
		System.out.println(user1.getCreatedBy());
	}

	
	// Post Operation
	
	  @Test 
	  public void addUserAndupdate() throws IllegalAccessException,
	  InvocationTargetException { 
	  final BindingResult result =  mock(BindingResult.class); 
	  when(result.hasErrors()).thenReturn(true);
	//  mockUser.submitForm(user1, result, null); assertEquals("gopi",
	//  user1.getCreatedBy());
	  }
	 
	@Test
	public void GetUserTest() throws IllegalAccessException, InvocationTargetException {
		Model model = null;
		//final String status = mockUser.userInfo(user1, model);
	/*	System.out.println(status);
		assertEquals("GET", status);*/
	}
	
}
