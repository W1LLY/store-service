package edu.umss.storeservice.utils;

import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.InputStream;

public class ImageUtils {

    public static byte[] inputStreamToByteArray(InputStream file) throws IOException {
        byte[] fileBytes = StreamUtils.copyToByteArray(file);
        byte[] bytes = new byte[fileBytes.length];
        int i = 0;
        for (Byte aByte : fileBytes) {
            bytes[i++] = aByte;
        }
        return bytes;
    }
}