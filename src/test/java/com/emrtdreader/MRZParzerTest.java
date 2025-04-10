package com.emrtdreader; // Make sure this matches exactly with your MRZParzer class

import org.jmrtd.BACKey;
import org.jmrtd.lds.icao.MRZInfo;
import org.junit.Test;
import static org.junit.Assert.*;

public class MRZParzerTest {
    
    @Test
    public void testValidMRZ() {
        String mrz = "P<UTOERIKSSON<<ANNA<MARIA<<<<<<<<<<<<<<<<<<<\n" +
        "L898902C36UTO7408122F1204159ZE184226B<<<<<10";
        new CreateBacKey();
        BACKey bacKey = CreateBacKey.createBacKey(mrz);

        assertEquals("L898902C3", bacKey.getDocumentNumber());
        assertEquals("740812", bacKey.getDateOfBirth());
        assertEquals("120415", bacKey.getDateOfExpiry());
    }
    
    // Add other test methods as needed
}