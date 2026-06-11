package com.capacitorjs.plugins.haptics;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.capacitorjs.plugins.haptics.arguments.HapticsSelectionType;
import com.capacitorjs.plugins.haptics.arguments.HapticsVibrationType;
import y.e;

/* loaded from: classes.dex */
public class Haptics {
    private boolean selectionStarted = false;
    private final Vibrator vibrator;

    public Haptics(Context context) {
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT < 31) {
            this.vibrator = getDeprecatedVibrator(context);
        } else {
            defaultVibrator = e.d(context.getSystemService("vibrator_manager")).getDefaultVibrator();
            this.vibrator = defaultVibrator;
        }
    }

    private Vibrator getDeprecatedVibrator(Context context) {
        return (Vibrator) context.getSystemService("vibrator");
    }

    private void vibratePre26(int i5) {
        this.vibrator.vibrate(i5);
    }

    public void performHaptics(HapticsVibrationType hapticsVibrationType) {
        VibrationEffect createWaveform;
        if (Build.VERSION.SDK_INT < 26) {
            vibratePre26(hapticsVibrationType.getOldSDKPattern());
            return;
        }
        Vibrator vibrator = this.vibrator;
        createWaveform = VibrationEffect.createWaveform(hapticsVibrationType.getTimings(), hapticsVibrationType.getAmplitudes(), -1);
        vibrator.vibrate(createWaveform);
    }

    public void selectionChanged() {
        if (this.selectionStarted) {
            performHaptics(new HapticsSelectionType());
        }
    }

    public void selectionEnd() {
        this.selectionStarted = false;
    }

    public void selectionStart() {
        this.selectionStarted = true;
    }

    public void vibrate(int i5) {
        VibrationEffect createOneShot;
        if (Build.VERSION.SDK_INT < 26) {
            vibratePre26(i5);
            return;
        }
        Vibrator vibrator = this.vibrator;
        createOneShot = VibrationEffect.createOneShot(i5, -1);
        vibrator.vibrate(createOneShot);
    }

    private void vibratePre26(long[] jArr) {
        this.vibrator.vibrate(jArr, -1);
    }
}
