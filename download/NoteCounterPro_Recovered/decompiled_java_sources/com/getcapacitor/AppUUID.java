package com.getcapacitor;

import android.content.SharedPreferences;
import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AppUUID {
    private static final String KEY = "CapacitorAppUUID";

    private static void assertAppUUID(g.k kVar) {
        if (readUUID(kVar).equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            regenerateAppUUID(kVar);
        }
    }

    private static String bytesToHex(byte[] bArr) {
        byte[] bytes = "0123456789ABCDEF".getBytes(StandardCharsets.US_ASCII);
        byte[] bArr2 = new byte[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            byte b2 = bArr[i5];
            int i6 = i5 * 2;
            bArr2[i6] = bytes[(b2 & 255) >>> 4];
            bArr2[i6 + 1] = bytes[b2 & 15];
        }
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    private static String generateUUID() {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
        return bytesToHex(messageDigest.digest());
    }

    public static String getAppUUID(g.k kVar) {
        assertAppUUID(kVar);
        return readUUID(kVar);
    }

    private static String readUUID(g.k kVar) {
        return kVar.getPreferences(0).getString(KEY, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public static void regenerateAppUUID(g.k kVar) {
        try {
            writeUUID(kVar, generateUUID());
        } catch (NoSuchAlgorithmException unused) {
            throw new Exception("Capacitor App UUID could not be generated.");
        }
    }

    private static void writeUUID(g.k kVar, String str) {
        SharedPreferences.Editor edit = kVar.getPreferences(0).edit();
        edit.putString(KEY, str);
        edit.apply();
    }
}
