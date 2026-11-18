enum AccountType {
    SAVINGS("SA", 2.5),
    CREDIT("CR", 15.0),
    DEPOSIT("DP", 5.0);

    private final String code;
    private final double interestRate;

    private AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

public class MainHandsOn2 {
    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            System.out.println("Tipe: " + type.name() +
                               " | Kode: " + type.getCode() +
                               " | Suku Bunga: " + type.getInterestRate() + "%");
        }
    }
}