package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zztd extends zzcp {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzq(int i5, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i5 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer zzk;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i5 = limit - position;
        int i6 = this.zzb.zzd;
        if (i6 == 2) {
            zzk = zzk(i5 + i5);
            while (position < limit) {
                zzq(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), zzk);
                position += 2;
            }
        } else if (i6 == 1342177280) {
            zzk = zzk((i5 / 3) * 4);
            while (position < limit) {
                zzq(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzk);
                position += 3;
            }
        } else if (i6 == 1610612736) {
            zzk = zzk(i5);
            while (position < limit) {
                int i7 = byteBuffer.get(position + 3) & 255;
                int i8 = (byteBuffer.get(position + 2) & 255) << 8;
                zzq(i7 | i8 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), zzk);
                position += 4;
            }
        } else if (i6 == 21) {
            zzk = zzk((i5 / 3) * 4);
            while (position < limit) {
                zzq(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzk);
                position += 3;
            }
        } else {
            if (i6 != 22) {
                throw new IllegalStateException();
            }
            zzk = zzk(i5);
            while (position < limit) {
                int i9 = byteBuffer.get(position) & 255;
                int i10 = (byteBuffer.get(position + 1) & 255) << 8;
                zzq(i9 | i10 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzk);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) {
        int i5 = zzclVar.zzd;
        String str = zzfj.zza;
        if (i5 != 21 && i5 != 1342177280 && i5 != 22 && i5 != 1610612736) {
            if (i5 == 4) {
                return zzcl.zza;
            }
            if (i5 != 2) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 4);
    }
}
