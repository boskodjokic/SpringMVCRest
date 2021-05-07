package com.bosko.springrest.api.v1.mapper;

import com.bosko.springrest.api.v1.model.VendorDTO;
import com.bosko.springrest.domain.Vendor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VendorMapperTest {

    public static final String NAME = "someName";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    void vendorToVendorDTO() {

        Vendor vendor = new Vendor();
        vendor.setName(NAME);

        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        assertEquals(vendor.getName(), vendorDTO.getName());
    }

    @Test
    void vendorDtoToVendor() {

        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);

        Vendor vendor = vendorMapper.vendorDtoToVendor(vendorDTO);

        assertEquals(vendorDTO.getName(), vendor.getName());
    }
}