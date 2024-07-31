package DependencyInjectionExample;

// File: DependencyInjectionTest.java
public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use service to get customer details
        String customerDetails = service.getCustomer(1);
        System.out.println(customerDetails);
    }
}
