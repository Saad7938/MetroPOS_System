package org.example.service.vendor;

import org.example.model.vendor.Vendor;
import org.example.repository.vendor.VendorRepository;

public class VendorService {
    private final VendorRepository vendorRepository;

    public VendorService() {
        this.vendorRepository = new VendorRepository();
    }

    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }
}
