package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzbzs extends u2.a {
    public static final Parcelable.Creator<zzbzs> CREATOR = new zzbzt();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbzs(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e4) {
                    e = e4;
                    autoCloseOutputStream = null;
                }
                try {
                    zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzr
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<zzbzs> creator = zzbzs.CREATOR;
                            byte[] bArr = marshall;
                            OutputStream outputStream = autoCloseOutputStream;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e5) {
                                    e = e5;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                x2.d.c(dataOutputStream);
                            } catch (IOException e6) {
                                e = e6;
                                dataOutputStream2 = dataOutputStream;
                                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error transporting the ad response", e);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    x2.d.c(outputStream);
                                } else {
                                    x2.d.c(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    x2.d.c(outputStream);
                                } else {
                                    x2.d.c(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e5) {
                    e = e5;
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LargeParcelTeleporter.pipeData.2");
                    x2.d.c(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int O = z2.b.O(parcel, 20293);
                    z2.b.H(parcel, 2, this.zza, i5);
                    z2.b.P(parcel, O);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int O2 = z2.b.O(parcel, 20293);
        z2.b.H(parcel, 2, this.zza, i5);
        z2.b.P(parcel, O2);
    }

    public final u2.b zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    x2.d.c(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e4) {
                    int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not read from parcel file descriptor", e4);
                    x2.d.c(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                x2.d.c(dataInputStream);
                throw th2;
            }
        }
        return (u2.b) this.zzb;
    }
}
