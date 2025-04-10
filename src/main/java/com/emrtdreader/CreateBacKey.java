package com.emrtdreader;

import org.jmrtd.BACKey;
import org.jmrtd.lds.icao.MRZInfo;

public class CreateBacKey {
    public static BACKey createBacKey(String mrz){
        MRZInfo mrzInfo = new MRZInfo(mrz);
        String document = mrzInfo.getDocumentNumber();
        String dob = mrzInfo.getDateOfBirth();
        String doe = mrzInfo.getDateOfExpiry();

        return new BACKey(document, dob, doe);
    }
}
