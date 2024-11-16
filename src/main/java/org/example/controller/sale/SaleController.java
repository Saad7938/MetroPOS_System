package org.example.controller.sale;

import org.example.model.sale.Sale;
import org.example.service.sale.SaleService;

public class SaleController {
    private final SaleService saleService;

    public SaleController() {
        this.saleService = new SaleService();
    }

    public Sale createSale(Sale sale) {
        return saleService.createSale(sale);
    }
}
