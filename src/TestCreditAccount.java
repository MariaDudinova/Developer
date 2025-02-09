import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.math.BigDecimal;

public class TestCreditAccount extends TestDataGeneratorUtil{

    @ParameterizedTest
    @MethodSource("creditAccountTestData")
    @DisplayName("Проверка снятия с CreditAccount")
    public void testWithdraw(CreditAccount creditAccount) {
        BigDecimal actual = creditAccount.withdraw(new BigDecimal("4000"));
        Assertions.assertTrue(actual.compareTo(new BigDecimal("960")) == 0 || actual.compareTo(new BigDecimal("-4090")) == 0);
    }

    @ParameterizedTest
    @MethodSource("creditAccountTestData")
    @DisplayName("Проверка снятия с CreditAccount в случае итогового баланса, выходящего за лимит(-5000)")
    public void withdrawWithLim(CreditAccount creditAccount) {
        BigDecimal actual2 = creditAccount.withdraw(new BigDecimal("4950"));
        Assertions.assertTrue(actual2.compareTo(new BigDecimal("0.50")) == 0 || actual2.compareTo(new BigDecimal("-50")) == 0);
    }

    @ParameterizedTest
    @MethodSource("creditAccountTestData")
    @DisplayName("Проверка снятия с CreditAccount суммы превышающей лимит (5000)")
    public void withdrawWithValid(CreditAccount creditAccount) {
        BigDecimal actual3 = creditAccount.withdraw(BigDecimal.valueOf(10000));
        Assertions.assertTrue(actual3.compareTo(new BigDecimal("5000")) == 0 || actual3.compareTo(new BigDecimal("-50")) == 0);
    }

    @ParameterizedTest
    @MethodSource("creditAccountTestData")
    @DisplayName("Проверка взятия комиссии 1% от суммы")
    public void applyFee(CreditAccount creditAccount) {
        BigDecimal actual = creditAccount.applyFee(new BigDecimal("5000"));
        Assertions.assertTrue(actual.compareTo(new BigDecimal("5050")) == 0);
    }
}