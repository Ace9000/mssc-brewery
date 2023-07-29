package springframework.msscbrewery.services;

import org.springframework.stereotype.Service;
import springframework.msscbrewery.web.model.BeerDto;
import springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl  implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Anastas")
                .build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
