import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.lang.reflect.InvocationTargetException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.nmk.ecomm.model.UserAddress;
import com.nmk.ecomm.web.controller.UserAddressWebController;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class UserAddressTypeControllerTest {
	@Autowired
	private static UserAddressWebController mockUser;
	private static UserAddress userAddress1;
	private static UserAddress userAddress2;

	@BeforeClass
	public static void init() throws IllegalAccessException, InvocationTargetException {
		mockUser = mock(UserAddressWebController.class);
		final BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		// userAddress1 = new
		// UserAddress("36","hello","katta","john","son","siva.nmkglobal@gmail.com","2565459245","0406525435","96548542533","ameerpet","active","gopi",new
		// Date(2017,8,9),"sathish",new Date());
		// userAddress2 = new
		// UserAddress("36","hello","katta","john","son","siva.nmkglobal@gmail.com","2565459245","0406525435","96548542533","ameerpet","active","gopi",new
		// Date(2017,8,9),"sathish",new Date());
		final Model model = null;
		String value2 = "Getall";
		when(mockUser.addNewAddress(userAddress1, result, model)).thenReturn(value2);
		String value = "GET";

		// when(mockUser.userInfo(userAddress1, model)).thenReturn(value);

		when(mockUser.myAddresses(userAddress1, result, model)).thenReturn(userAddress1.getCity());
		System.out.println(userAddress1.getCity());
	}

	@Test
	public void addUserAddressAndupdate() throws IllegalAccessException, InvocationTargetException {
		final BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
		mockUser.addNewAddress(userAddress1, result, null);
		assertEquals(null, userAddress1.getCity());
	}

	@Test
	public void GetUserTest() throws IllegalAccessException, InvocationTargetException {
		Model model = null;
		final String status = mockUser.userInfo(userAddress1, model);
		System.out.println(status);
		assertEquals("GET", status);
	}

}
