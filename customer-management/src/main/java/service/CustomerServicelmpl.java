package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicelmpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Son", "Son@gmail.com", "NamDinh"));
        customers.put(2, new Customer(2, "Long", "Long@gmail.com", "SaiGon"));
        customers.put(3, new Customer(3, "Linh", "Linh@gmail.com", "DaNang"));
        customers.put(4, new Customer(4, "Khuong", "Khuong@gmail.com", "KhanhHoa"));
        customers.put(5, new Customer(5, "Duy", "Duy@gmail.com", "BacNing"));
        customers.put(6, new Customer(6, "Yen", "Yen@gmail.com", "VinhPhuc"));
        customers.put(7, new Customer(7, "Ly", "Ly@gmail.com", "HaNoi"));
    }

    @Override
    public List<Customer> findsAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
