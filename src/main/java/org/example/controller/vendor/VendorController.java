package org.example.controller.vendor;

import org.example.model.vendor.Vendor;
import org.example.service.vendor.VendorService;

public class VendorController {
    private final VendorService vendorService;

    public VendorController() {
        this.vendorService = new VendorService();
    }

    public Vendor createVendor(Vendor vendor) {
        return vendorService.createVendor(vendor);
    }
}
