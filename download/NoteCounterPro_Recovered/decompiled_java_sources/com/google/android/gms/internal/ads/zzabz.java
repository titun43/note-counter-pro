package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes.dex */
final class zzabz {
    public static boolean zza(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr && (hdrCapabilities = display.getHdrCapabilities()) != null) {
                for (int i5 : hdrCapabilities.getSupportedHdrTypes()) {
                    if (i5 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
