import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.math.BigDecimal;


public class TestSavingsAccount extends TestDataGeneratorUtil{

    @ParameterizedTest
    @MethodSource("savingsAccountTestData")
    @DisplayName("Проверка ежемесячного начисления процентов на счет SavingsAccount")
    public void applyInterest(SavingsAccount savingsAccount) {
        BigDecimal actual = savingsAccount.applyInterest();
        Assertions.assertTrue(actual.compareTo(new BigDecimal("5012.5")) == 0 || actual.compareTo(new BigDecimal("3007.5")) == 0);
    }

    @ParameterizedTest
    @MethodSource("savingsAccountTestData")
    @DisplayName("Проверка снятия с SavingsAccount")
    public void withdraw(SavingsAccount savingsAccount) {
        BigDecimal actual = savingsAccount.withdraw(new BigDecimal("100"));
        Assertions.assertTrue(actual.compareTo(new BigDecimal("4900")) == 0 || actual.compareTo(new BigDecimal("2900")) == 0);
    }
}