import java.math.BigDecimal;
import java.util.stream.Stream;

public abstract class TestDataGeneratorUtil {
    public static Stream<DebitAccount> debitAccountTestData() {
        return Stream.of(
                new DebitAccount("111", new BigDecimal("500"), "Dudinova"),
                new DebitAccount("222", new BigDecimal("1000"), "Kashkel")
        );
    }
    public static Stream<CreditAccount> creditAccountTestData() {
        return Stream.of(
                new CreditAccount("333", new BigDecimal("5000"), "Dudinova"),
                new CreditAccount("444", new BigDecimal("-50"), "Kashkel")
        );
    }
    public static Stream<SavingsAccount> savingsAccountTestData() {
        return Stream.of(
                new SavingsAccount("555", new BigDecimal("5000"), "Dudinova"),
                new SavingsAccount("666", new BigDecimal("3000"), "Kashkel")
        );
    }
}
