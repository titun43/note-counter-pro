package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class zzeci extends zzfyq {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzech zzf;
    private boolean zzg;

    public zzeci(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(zzech zzechVar) {
        this.zzf = zzechVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzku)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                        this.zzd = System.currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkw)).intValue();
                        this.zzg = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyq
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzku)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f5 = fArr[0] / 9.80665f;
            float f6 = fArr[1] / 9.80665f;
            float f7 = fArr[2] / 9.80665f;
            float f8 = f7 * f7;
            if (((float) Math.sqrt(f8 + (f6 * f6) + (f5 * f5))) >= ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkv)).floatValue()) {
                ((x2.c) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkw)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkx)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i5 = this.zze + 1;
                    this.zze = i5;
                    zzech zzechVar = this.zzf;
                    if (zzechVar != null) {
                        if (i5 == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzky)).intValue()) {
                            zzebf zzebfVar = (zzebf) zzechVar;
                            zzebfVar.zzo(new zzebc(zzebfVar), zzebe.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
