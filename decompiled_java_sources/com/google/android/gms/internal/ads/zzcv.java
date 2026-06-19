package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzcv extends zzcp {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9 A[ADDED_TO_REGION, LOOP:6: B:42:0x00e9->B:43:0x00eb, LOOP_START, PHI: r0
      0x00e9: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003d, B:43:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(ByteBuffer byteBuffer) {
        int i5;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        int i7 = this.zzb.zzd;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 21) {
                    if (i7 != 22) {
                        if (i7 != 268435456) {
                            if (i7 != 1342177280) {
                                if (i7 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer zzk = zzk(i6);
                        i5 = this.zzb.zzd;
                        if (i5 == 3) {
                            while (position < limit) {
                                zzk.put((byte) 0);
                                zzk.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i5 == 4) {
                            while (position < limit) {
                                float f5 = byteBuffer.getFloat(position);
                                String str = zzfj.zza;
                                short max = (short) (Math.max(-1.0f, Math.min(f5, 1.0f)) * 32767.0f);
                                zzk.put((byte) (max & 255));
                                zzk.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i5 == 21) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i5 == 22) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 2));
                                zzk.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i5 == 268435456) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i5 == 1342177280) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else {
                            if (i5 != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 4;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        zzk.flip();
                    }
                }
                i6 /= 3;
            }
            i6 /= 2;
            ByteBuffer zzk2 = zzk(i6);
            i5 = this.zzb.zzd;
            if (i5 == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzk2.flip();
        }
        i6 += i6;
        ByteBuffer zzk22 = zzk(i6);
        i5 = this.zzb.zzd;
        if (i5 == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzk22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) {
        int i5 = zzclVar.zzd;
        if (i5 != 3) {
            if (i5 == 2) {
                return zzcl.zza;
            }
            if (i5 != 268435456 && i5 != 21 && i5 != 1342177280 && i5 != 22 && i5 != 1610612736 && i5 != 4) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 2);
    }
}
