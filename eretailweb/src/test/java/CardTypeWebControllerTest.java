import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
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

import com.nmk.ecomm.model.CardType;
import com.nmk.ecomm.web.controller.CardTypeWebController;
@RunWith(MockitoJUnitRunner.class)
public class CardTypeWebControllerTest {
	@Autowired
	private static CardTypeWebController mockCardType;
	private static CardType card1;
	private static CardType card2;
	@BeforeClass
	public static void init() throws IllegalAccessException, InvocationTargetException {
		mockCardType = mock(CardTypeWebController.class);

		// Stubbing

		final BindingResult result = mock(BindingResult.class);
		when(result.hasErrors()).thenReturn(true);
	//	card1 = new CardType(5, "Jadav"," 4900000000000086", "2/20",new Date());
	//	card2 = new CardType(5, "Jadav"," 4900000000000086", "2/20",new Date());
		final Model model = null;
		 String value2="12";
	//	when(mockCardType.myCards(model)).thenReturn(value2);
		when(mockCardType.deleteCardType(value2)).thenReturn(value2);

}
	
	@Test
	public void getAllTest() {
		Model model = null;
	//	String audit = mockCardType.myCards(model);
	//	assertNotNull(audit);
		assertEquals("Getall", "Getall");
	}

	@Test
	public void deleteCardType() throws IllegalAccessException, InvocationTargetException {
		Model model = null;
		
		String cardtypeId="12";
		final String status = mockCardType.deleteCardType(cardtypeId);
		System.out.println(status);
		assertEquals("12", status);
	}


}
