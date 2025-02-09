import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.math.BigDecimal;

public class TestDebitAccount extends TestDataGeneratorUtil{

    @ParameterizedTest
    @MethodSource("debitAccountTestData")
    @DisplayName("Проверка снятия с DebitAccount")
    public void testWithdraw(DebitAccount debitAccount) {
        BigDecimal actual = debitAccount.withdraw(new BigDecimal("500"));
        Assertions.assertTrue(actual.compareTo(new BigDecimal("0")) == 0 || actual.compareTo(new BigDecimal("500")) == 0);
    }

    @ParameterizedTest
    @MethodSource("debitAccountTestData")
    @DisplayName("Проверка отказа в снятии с DebitAccount, в случае если баланс < запрашиваемой суммы")
    public void testWithdrawWithLim(DebitAccount debitAccount) {
        BigDecimal actual2 = debitAccount.withdraw(new BigDecimal("1001"));
        Assertions.assertTrue(actual2.compareTo(new BigDecimal("500")) == 0 || actual2.compareTo(new BigDecimal("1000")) == 0);
    }

    @ParameterizedTest
    @MethodSource("debitAccountTestData")
    @DisplayName("Проверка отказа в снятии с DebitAccount, в случае если сумма транзакции больше 10000")
    public void withdrawWithValid(DebitAccount debitAccount) {
        BigDecimal actual2 = debitAccount.withdraw(BigDecimal.valueOf(15000));
        Assertions.assertTrue(actual2.compareTo(new BigDecimal("500")) == 0 || actual2.compareTo(new BigDecimal("1000")) == 0);
    }
}