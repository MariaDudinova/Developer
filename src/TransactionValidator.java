import java.math.BigDecimal;

interface TransactionValidator {
    boolean validate(BigDecimal amount);
}