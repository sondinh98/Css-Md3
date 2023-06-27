import java.util.ArrayList;
import java.util.List;

public class Manager {
    private static List<Account> accounts;
    static {
        accounts = new ArrayList<>();
        accounts.add(new Account("Long", "Long123"));
        accounts.add(new Account("Quan", "Quan123"));
        accounts.add(new Account("Toan", "Toan123"));
        accounts.add(new Account("Suu", "Suu123"));
        accounts.add(new Account("Dan", "Dan123"));
    }
}
