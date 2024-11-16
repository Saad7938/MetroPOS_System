package org.example.service.sale;

import org.example.model.sale.Sale;
import org.example.repository.sale.SaleRepository;

public class SaleService {
    private final SaleRepository saleRepository;

    public SaleService() {
        this.saleRepository = new SaleRepository();
    }

    public Sale createSale(Sale sale) {
        return saleRepository.save(sale);
    }
}
