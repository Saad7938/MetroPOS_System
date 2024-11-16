package org.example.model.sale;

import java.util.Date;
import java.util.List;

public class Sale {
    private String saleId;
    private Date saleDate;
    private List<SaleItem> items;
    private double totalAmount;
    private String cashierId;
    private String branchId;

    void calculateTotal(){

    }
    void generateBill(){

    }
}

