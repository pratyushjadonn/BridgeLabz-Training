package functional_interface;
interface SensitiveData {
    // marker interface
}

class BankAccount implements SensitiveData {

    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class EncryptionService {

    static void encrypt(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("No encryption needed");
        }
    }
}

public class SecurityApp {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("123456789", 50000);
        String normalData = "Public Info";

        EncryptionService.encrypt(acc);
        EncryptionService.encrypt(normalData);
    }
}
