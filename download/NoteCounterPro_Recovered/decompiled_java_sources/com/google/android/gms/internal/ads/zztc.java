package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbgj;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zztc extends zzcp {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    public zztc() {
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final void zzs(boolean z4) {
        int i5;
        int i6;
        int i7 = this.zzk;
        int length = this.zzi.length;
        if (i7 != length) {
            if (!z4) {
                return;
            } else {
                z4 = true;
            }
        }
        if (this.zzh == 0) {
            if (z4) {
                zzu(i7, 3);
                i6 = i7;
            } else {
                zzgrc.zzi(i7 >= (length >> 1));
                i6 = this.zzi.length >> 1;
                zzu(i6, 0);
            }
            i5 = i6;
        } else {
            int i8 = length >> 1;
            int i9 = i7 - i8;
            if (z4) {
                int zzt = zzt(i9) + (this.zzi.length >> 1);
                zzu(zzt, 2);
                int i10 = i8 + i9;
                i5 = zzt;
                i6 = i10;
            } else {
                int zzt2 = zzt(i9);
                zzu(zzt2, 1);
                i5 = zzt2;
                i6 = i9;
            }
        }
        if (i6 % this.zzd != 0) {
            throw new IllegalStateException(zzgrt.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(i6)));
        }
        zzgrc.zzi(i7 >= i5);
        this.zzk -= i6;
        int i11 = this.zzj + i6;
        this.zzj = i11;
        this.zzj = i11 % this.zzi.length;
        this.zzh = (i5 / this.zzd) + this.zzh;
        this.zzg += (i6 - i5) / r2;
    }

    private final int zzt(int i5) {
        int zzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        zzgrc.zzi(zzw >= 0);
        int min = (int) Math.min((i5 * 0.2f) + 0.5f, zzw);
        int i6 = this.zzd;
        return (min / i6) * i6;
    }

    private final void zzu(int i5, int i6) {
        int i7;
        if (i5 == 0) {
            return;
        }
        zzgrc.zza(this.zzk >= i5);
        if (i6 == 2) {
            int i8 = this.zzj;
            int i9 = this.zzk;
            int i10 = i8 + i9;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i10 <= length) {
                System.arraycopy(bArr, i10 - i5, this.zzl, 0, i5);
            } else {
                int i11 = i9 - (length - i8);
                if (i11 >= i5) {
                    System.arraycopy(bArr, i11 - i5, this.zzl, 0, i5);
                } else {
                    int i12 = i5 - i11;
                    System.arraycopy(bArr, length - i12, this.zzl, 0, i12);
                    System.arraycopy(this.zzi, 0, this.zzl, i12, i11);
                }
            }
        } else {
            int i13 = this.zzj;
            int i14 = i13 + i5;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i14 <= length2) {
                System.arraycopy(bArr2, i13, this.zzl, 0, i5);
            } else {
                int i15 = length2 - i13;
                System.arraycopy(bArr2, i13, this.zzl, 0, i15);
                System.arraycopy(this.zzi, 0, this.zzl, i15, i5 - i15);
            }
        }
        zzgrc.zzd(i5 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i5);
        zzgrc.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgrc.zzd(i5 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i5);
        if (i6 != 3) {
            for (int i16 = 0; i16 < i5; i16 += 2) {
                int i17 = i16 + 1;
                int zzv = zzv(bArr3[i17], bArr3[i16]);
                if (i6 == 0) {
                    i7 = ((((i16 * zzbgj.zzq.zzf) / (i5 - 1)) * (-90)) / zzbgj.zzq.zzf) + 100;
                } else {
                    i7 = 10;
                    if (i6 == 2) {
                        i7 = 10 + (((90000 * i16) / (i5 - 1)) / zzbgj.zzq.zzf);
                    }
                }
                int i18 = (zzv * i7) / 100;
                if (i18 >= 32767) {
                    bArr3[i16] = -1;
                    bArr3[i17] = Byte.MAX_VALUE;
                } else if (i18 <= -32768) {
                    bArr3[i16] = 0;
                    bArr3[i17] = Byte.MIN_VALUE;
                } else {
                    bArr3[i16] = (byte) (i18 & 255);
                    bArr3[i17] = (byte) (i18 >> 8);
                }
            }
        }
        zzk(i5).put(bArr3, 0, i5).flip();
    }

    private static int zzv(byte b2, byte b5) {
        return (b2 << 8) | (b5 & 255);
    }

    private final int zzw(long j2) {
        return (int) ((j2 * this.zzb.zzb) / 1000000);
    }

    private static final boolean zzx(byte b2, byte b5) {
        return Math.abs(zzv(b2, b5)) > 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        return super.zzc() && this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int limit;
        int i5;
        int position;
        while (byteBuffer.hasRemaining() && !zzl()) {
            if (this.zzf != 0) {
                zzgrc.zzi(this.zzj < this.zzi.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i6 = this.zzd;
                            limit = (position2 / i6) * i6;
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i7 = this.zzj;
                int i8 = this.zzk;
                int i9 = i7 + i8;
                int length = this.zzi.length;
                if (i9 < length) {
                    i5 = length - i9;
                } else {
                    i9 = i8 - (length - i7);
                    i5 = i7 - i9;
                }
                int min = Math.min(position3, i5);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.zzi, i9, min);
                int i10 = this.zzk + min;
                this.zzk = i10;
                zzgrc.zzi(i10 <= this.zzi.length);
                boolean z4 = limit < limit2 && position3 < i5;
                zzs(z4);
                if (z4) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.zzi.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (zzx(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i11 = this.zzd;
                            position = ((limit4 / i11) * i11) + i11;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        if (zzc()) {
            int i5 = this.zzb.zzc;
            this.zzd = i5 + i5;
            int zzw = zzw(100000L) / 2;
            int i6 = this.zzd;
            int i7 = (zzw / i6) * i6;
            int i8 = i7 + i7;
            if (this.zzi.length != i8) {
                this.zzi = new byte[i8];
                this.zzl = new byte[i8];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z4) {
        this.zze = z4;
    }

    public final long zzr() {
        return this.zzg;
    }
}
