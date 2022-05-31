import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class accountmanageTest {

    @Test
    public void testcreation() {
        account testaccount = new account("accounta",0,false);

        Assertions.assertNotNull(testaccount);

    }
    @Test
    public void testloggedin() {
        account testaccount = new account("accounta",0,false);

        testaccount.login();
        Assertions.assertTrue(testaccount.checkLoggedIn());

    }
    @Test
    public void testloggedout() {
        account testaccount = new account("accounta",0,false);

        testaccount.logout();
        Assertions.assertFalse(testaccount.checkLoggedIn());
    }

}

