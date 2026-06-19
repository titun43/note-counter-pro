package com.google.android.gms.internal.ads;

import androidx.emoji2.text.u;
import androidx.fragment.app.h1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzsl extends zzcp {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzk = zzk(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i5 : iArr) {
                int zzD = (zzfj.zzD(this.zzb.zzd) * i5) + position;
                int i6 = this.zzb.zzd;
                if (i6 != 2) {
                    if (i6 == 3) {
                        zzk.put(byteBuffer.get(zzD));
                    } else if (i6 != 4) {
                        if (i6 != 21) {
                            if (i6 != 22) {
                                if (i6 != 268435456) {
                                    if (i6 != 1342177280) {
                                        if (i6 != 1610612736) {
                                            throw new IllegalStateException(u.l(new StringBuilder(String.valueOf(i6).length() + 21), "Unexpected encoding: ", i6));
                                        }
                                    }
                                }
                            }
                            zzk.putInt(byteBuffer.getInt(zzD));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b2 = byteBuffer.get(order == byteOrder ? zzD : zzD + 2);
                        byte b5 = byteBuffer.get(zzD + 1);
                        if (byteBuffer.order() == byteOrder) {
                            zzD += 2;
                        }
                        int i7 = ((b2 << 24) & (-16777216)) | ((b5 << 16) & 16711680) | ((byteBuffer.get(zzD) << 8) & 65280);
                        int i8 = i7 >> 8;
                        zzgrc.zzf((i8 & (-16777216)) == 0 || (i8 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i8));
                        zzgrc.zza(zzk.remaining() >= 3);
                        zzk.put((byte) (zzk.order() == byteOrder ? (i7 >> 24) & 255 : i8 & 255)).put((byte) ((i7 >> 16) & 255)).put((byte) (zzk.order() == byteOrder ? i8 & 255 : (i7 >> 24) & 255));
                    } else {
                        zzk.putFloat(byteBuffer.getFloat(zzD));
                    }
                }
                zzk.putShort(byteBuffer.getShort(zzD));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i5 = zzclVar.zzd;
        if (!zzfj.zzA(i5)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i6 = zzclVar.zzc;
        boolean z4 = i6 != iArr.length;
        int i7 = 0;
        while (true) {
            int length = iArr.length;
            if (i7 >= length) {
                return z4 ? new zzcl(zzclVar.zzb, length, i5) : zzcl.zza;
            }
            int i8 = iArr[i7];
            if (i8 >= i6) {
                String arrays = Arrays.toString(iArr);
                throw new zzcn(h1.b(new StringBuilder(String.valueOf(arrays).length() + 59), "Channel map (", arrays, ") trying to access non-existent input channel."), zzclVar);
            }
            z4 |= i8 != i7;
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
