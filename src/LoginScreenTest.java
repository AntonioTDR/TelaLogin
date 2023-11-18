import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {

	@Test
	public void testSuccessfulLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertTrue(loginScreen.login("Zaga", "PalmeirasSemMundial"));
	}
	
	@Test
	public void testFailedLogin() {
		LoginScreen loginScreen = new LoginScreen();
		assertFalse(loginScreen.login("Zaga", "PalmeirasTemMundial"));
	}
	
	@Test
	public void testAddUser() {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.addUser("Teste", "Teste1");
		assertTrue(loginScreen.login("Teste", "Teste1"));
	}
}