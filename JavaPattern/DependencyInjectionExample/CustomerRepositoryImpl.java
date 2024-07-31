package DependencyInjectionExample;

// File: CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // For demonstration purposes, returning a mock customer detail
        return "Customer with ID: " + id;
    }
}
