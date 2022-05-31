import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class accountbalanceTest {



        @Test
        public void testcreationname() {
            account testaccount = new account("accounta",0,false);
            Assertions.assertNotNull(testaccount.GetName());

        }
        @Test
        public void testbalance() {
            account testaccount = new account("accounta",0,false);
            Assertions.assertEquals(0, testaccount.getBalance());

        }
        @Test
        public void testcredit() {
            account testaccount = new account("accounta",0,false);
            Assertions.assertEquals(1000, testaccount.credit(1000));

        }

}

