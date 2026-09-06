package AccountValidation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountValidationTest {

    @Test
    void testValidDeposit() {
        AccountValidation account = new AccountValidation();

        account.deposit(500);

        assertEquals(500, account.getBalance(), 0.01);
    }

    @Test
    void testNegativeDeposit() {
        AccountValidation account = new AccountValidation();

        assertThrows(
            IllegalArgumentException.class,
            () -> account.deposit(-100)
        );
    }

    @Test
    void testOverdraft() {
        AccountValidation account = new AccountValidation();

        account.deposit(200);

        assertThrows(
            IllegalStateException.class,
            () -> account.withdraw(300)
        );
    }

    @Test
    void testAccountBecomesInactive() {
        AccountValidation account = new AccountValidation();

        account.deposit(150);
        account.withdraw(100);

        assertFalse(account.isActive());
    }

    @Test
    void testAccountRemainsActive() {
        AccountValidation account = new AccountValidation();

        account.deposit(500);
        account.withdraw(100);

        assertTrue(account.isActive());
    }
}