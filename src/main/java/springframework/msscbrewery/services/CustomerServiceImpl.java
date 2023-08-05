package springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springframework.msscbrewery.web.model.BeerDto;
import springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;
@Slf4j
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
    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating...");

    }
    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting...");

    }
}
