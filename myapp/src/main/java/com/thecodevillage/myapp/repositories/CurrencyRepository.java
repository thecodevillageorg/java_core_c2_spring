package com.thecodevillage.myapp.repositories;

import com.thecodevillage.myapp.models.Currency;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CurrencyRepository extends PagingAndSortingRepository<Currency,Long> {
}
