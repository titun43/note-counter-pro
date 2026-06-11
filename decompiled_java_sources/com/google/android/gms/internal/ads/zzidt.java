package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzidt extends zzian {
    static final int[] zzb = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, com.google.android.gms.common.api.f.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzian zzd;
    private final zzian zze;
    private final int zzf;
    private final int zzg;

    public /* synthetic */ zzidt(zzian zzianVar, zzian zzianVar2, byte[] bArr) {
        this(zzianVar, zzianVar2);
    }

    private static zzian zzF(zzian zzianVar, zzian zzianVar2) {
        int zzc = zzianVar.zzc();
        int zzc2 = zzianVar2.zzc();
        byte[] bArr = new byte[zzc + zzc2];
        zzianVar.zzx(bArr, 0, 0, zzc);
        zzianVar2.zzx(bArr, 0, zzc, zzc2);
        return zzian.zzu(bArr);
    }

    public static zzian zzk(zzian zzianVar, zzian zzianVar2) {
        if (zzianVar2.zzc() == 0) {
            return zzianVar;
        }
        if (zzianVar.zzc() == 0) {
            return zzianVar2;
        }
        int zzc = zzianVar2.zzc() + zzianVar.zzc();
        if (zzc < 128) {
            return zzF(zzianVar, zzianVar2);
        }
        if (zzianVar instanceof zzidt) {
            zzidt zzidtVar = (zzidt) zzianVar;
            zzian zzianVar3 = zzidtVar.zze;
            if (zzianVar2.zzc() + zzianVar3.zzc() < 128) {
                return new zzidt(zzidtVar.zzd, zzF(zzianVar3, zzianVar2));
            }
            zzian zzianVar4 = zzidtVar.zzd;
            if (zzianVar4.zzp() > zzianVar3.zzp() && zzidtVar.zzg > zzianVar2.zzp()) {
                return new zzidt(zzianVar4, new zzidt(zzianVar3, zzianVar2));
            }
        }
        return zzc >= zzn(Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1) ? new zzidt(zzianVar, zzianVar2) : zzidr.zza(zzianVar, zzianVar2, new ArrayDeque());
    }

    public static int zzn(int i5) {
        int[] iArr = zzb;
        int length = iArr.length;
        return i5 >= 47 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : iArr[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzian, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzidq(this);
    }

    public final /* synthetic */ zzian zzE() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i5) {
        zzian.zzB(i5, this.zzc);
        return zzb(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zzb(int i5) {
        int i6 = this.zzf;
        return i5 < i6 ? this.zzd.zzb(i5) : this.zze.zzb(i5 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i5, int i6) {
        int i7 = this.zzc;
        int zzC = zzian.zzC(i5, i6, i7);
        if (zzC == 0) {
            return zzian.zza;
        }
        if (zzC == i7) {
            return this;
        }
        int i8 = this.zzf;
        if (i6 <= i8) {
            return this.zzd.zzd(i5, i6);
        }
        int i9 = i6 - i8;
        if (i5 >= i8) {
            return this.zze.zzd(i5 - i8, i9);
        }
        zzian zzianVar = this.zzd;
        return new zzidt(zzianVar.zzd(i5, zzianVar.zzc()), this.zze.zzd(0, i9));
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zze(byte[] bArr, int i5, int i6, int i7) {
        int i8 = i5 + i7;
        int i9 = this.zzf;
        if (i8 <= i9) {
            this.zzd.zze(bArr, i5, i6, i7);
        } else {
            if (i5 >= i9) {
                this.zze.zze(bArr, i5 - i9, i6, i7);
                return;
            }
            int i10 = i9 - i5;
            this.zzd.zze(bArr, i5, i6, i10);
            this.zze.zze(bArr, 0, i6 + i10, i7 - i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zzg(zziae zziaeVar) {
        this.zzd.zzg(zziaeVar);
        this.zze.zzg(zziaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final String zzh(Charset charset) {
        return new String(zzy(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            if (!zzidsVar.next().zzi()) {
                return zzier.zza(zzy());
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        byte[] bArr = null;
        zzids zzidsVar = new zzids(this, bArr);
        zziak next = zzidsVar.next();
        zzids zzidsVar2 = new zzids(zzianVar, bArr);
        zziak next2 = zzidsVar2.next();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int zzc = next.zzc() - i5;
            int zzc2 = next2.zzc() - i6;
            int min = Math.min(zzc, zzc2);
            if (!(i5 == 0 ? next.zzk(next2, i6, min) : next2.zzk(next, i5, min))) {
                return false;
            }
            i7 += min;
            int i8 = this.zzc;
            if (i7 >= i8) {
                if (i7 == i8) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzc) {
                i5 = 0;
                next = zzidsVar.next();
            } else {
                i5 += min;
                next = next;
            }
            if (min == zzc2) {
                next2 = zzidsVar2.next();
                i6 = 0;
            } else {
                i6 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzl(int i5, int i6, int i7) {
        int i8 = i6 + i7;
        int i9 = this.zzf;
        if (i8 <= i9) {
            return this.zzd.zzl(i5, i6, i7);
        }
        if (i6 >= i9) {
            return this.zze.zzl(i5, i6 - i9, i7);
        }
        int i10 = i9 - i6;
        return this.zze.zzl(this.zzd.zzl(i5, i6, i10), 0, i7 - i10);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        ArrayList arrayList = new ArrayList();
        zzids zzidsVar = new zzids(this, null);
        while (zzidsVar.hasNext()) {
            arrayList.add(zzidsVar.next().zzf());
        }
        return zziaq.zzF(new zzich(arrayList), 4096);
    }

    public final /* synthetic */ zzian zzo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzp() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzq() {
        return this.zzc >= zzn(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    /* renamed from: zzr */
    public final zziai iterator() {
        return new zzidq(this);
    }

    private zzidt(zzian zzianVar, zzian zzianVar2) {
        this.zzd = zzianVar;
        this.zze = zzianVar2;
        int zzc = zzianVar.zzc();
        this.zzf = zzc;
        this.zzc = zzianVar2.zzc() + zzc;
        this.zzg = Math.max(zzianVar.zzp(), zzianVar2.zzp()) + 1;
    }
}
