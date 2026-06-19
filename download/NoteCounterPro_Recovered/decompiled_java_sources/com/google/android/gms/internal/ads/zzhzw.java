package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhzv;
import com.google.android.gms.internal.ads.zzhzw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzhzw<MessageType extends zzhzw<MessageType, BuilderType>, BuilderType extends zzhzv<MessageType, BuilderType>> implements zzidc {
    protected transient int zzq = 0;

    public static void zzaV(zzian zzianVar) {
        if (!zzianVar.zzi()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    public static <T> void zzaW(Iterable<T> iterable, List<? super T> list) {
        zzhzv.zzaT(iterable, list);
    }

    private String zzdU(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 18 + String.valueOf(str).length() + 44);
        s.c.e(sb, "Serializing ", name, " to a ", str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public zzian zzaM() {
        try {
            int zzbr = zzbr();
            zzian zzianVar = zzian.zza;
            byte[] bArr = new byte[zzbr];
            int i5 = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, zzbr);
            zzcX(zziatVar);
            return zziaj.zza(zziatVar, bArr);
        } catch (IOException e4) {
            throw new RuntimeException(zzdU("ByteString"), e4);
        }
    }

    public byte[] zzaN() {
        try {
            int zzbr = zzbr();
            byte[] bArr = new byte[zzbr];
            int i5 = zziaw.zzf;
            zziat zziatVar = new zziat(bArr, 0, zzbr);
            zzcX(zziatVar);
            zziatVar.zzD();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(zzdU("byte array"), e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzidc
    public void zzaO(OutputStream outputStream) {
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zzbr()));
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    public void zzaP(OutputStream outputStream) {
        int zzbr = zzbr();
        zziav zziavVar = new zziav(outputStream, zziaw.zzz(zziaw.zzA(zzbr) + zzbr));
        zziavVar.zzs(zzbr);
        zzcX(zziavVar);
        zziavVar.zzy();
    }

    public int zzaQ() {
        throw new UnsupportedOperationException();
    }

    public void zzaR(int i5) {
        throw new UnsupportedOperationException();
    }

    public zzidh zzaS() {
        throw new UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    public int zzaT(zzidu zziduVar) {
        return zzaQ();
    }

    public zziee zzaU() {
        return new zziee(this);
    }
}
