package com.thecodevillage.myapp.customer.repositories;

import com.thecodevillage.myapp.customer.models.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CurrencyRepository extends PagingAndSortingRepository<Currency,Long> {
}
