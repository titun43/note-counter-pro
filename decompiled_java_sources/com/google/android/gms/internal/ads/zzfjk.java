package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzfjk {
    public final com.google.android.gms.ads.internal.client.zzga zza;
    public final zzbqs zzb;
    public final zzerp zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final Bundle zze;
    public final com.google.android.gms.ads.internal.client.zzr zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final ArrayList zzi;
    public final zzbkh zzj;
    public final com.google.android.gms.ads.internal.client.zzx zzk;
    public final int zzl;
    public final AdManagerAdViewOptions zzm;
    public final PublisherAdViewOptions zzn;
    public final com.google.android.gms.ads.internal.client.zzco zzo;
    public final zzfiy zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final boolean zzs;
    public final Bundle zzt;
    public final AtomicLong zzu;
    public final boolean zzv;
    public final com.google.android.gms.ads.internal.client.zzcs zzw;

    public /* synthetic */ zzfjk(zzfjj zzfjjVar, byte[] bArr) {
        this.zzf = zzfjjVar.zzE();
        this.zzg = zzfjjVar.zzF();
        this.zzw = zzfjjVar.zzaa();
        this.zze = zzfjjVar.zzD().zzB;
        com.google.android.gms.ads.internal.client.zzm zzD = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzD2 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzD3 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzD4 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzD5 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzD6 = zzfjjVar.zzD();
        com.google.android.gms.ads.internal.client.zzm zzD7 = zzfjjVar.zzD();
        int i5 = zzfjjVar.zzD().zza;
        long j2 = zzD7.zzb;
        Bundle bundle = zzD6.zzc;
        int i6 = zzD5.zzd;
        List list = zzD4.zze;
        boolean z4 = zzD3.zzf;
        int i7 = zzD2.zzg;
        boolean z5 = true;
        if (!zzD.zzh && !zzfjjVar.zzH()) {
            z5 = false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = new com.google.android.gms.ads.internal.client.zzm(i5, j2, bundle, i6, list, z4, i7, z5, zzfjjVar.zzD().zzi, zzfjjVar.zzD().zzj, zzfjjVar.zzD().zzk, zzfjjVar.zzD().zzl, zzfjjVar.zzD().zzm, zzfjjVar.zzD().zzn, zzfjjVar.zzD().zzo, zzfjjVar.zzD().zzp, zzfjjVar.zzD().zzq, zzfjjVar.zzD().zzr, zzfjjVar.zzD().zzs, zzfjjVar.zzD().zzt, zzfjjVar.zzD().zzu, zzfjjVar.zzD().zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfjjVar.zzD().zzw), zzfjjVar.zzD().zzx, zzfjjVar.zzD().zzy, zzfjjVar.zzD().zzz, zzfjjVar.zzD().zzA);
        this.zzd = zzmVar;
        this.zza = zzfjjVar.zzG() != null ? zzfjjVar.zzG() : zzfjjVar.zzK() != null ? zzfjjVar.zzK().zzf : null;
        this.zzh = zzfjjVar.zzI();
        this.zzi = zzfjjVar.zzJ();
        this.zzj = zzfjjVar.zzI() == null ? null : zzfjjVar.zzK() == null ? new zzbkh(new NativeAdOptions.Builder().build()) : zzfjjVar.zzK();
        this.zzk = zzfjjVar.zzL();
        this.zzl = zzfjjVar.zzP();
        this.zzm = zzfjjVar.zzM();
        this.zzn = zzfjjVar.zzN();
        this.zzo = zzfjjVar.zzO();
        this.zzb = zzfjjVar.zzQ();
        this.zzp = new zzfiy(zzfjjVar.zzR(), null);
        this.zzq = zzfjjVar.zzS();
        this.zzr = zzfjjVar.zzT();
        this.zzc = zzfjjVar.zzU();
        this.zzs = zzfjjVar.zzV();
        this.zzt = zzfjjVar.zzW();
        this.zzu = zzmVar.zzA != 0 ? new AtomicLong(zzmVar.zzA) : zzfjjVar.zzX();
        this.zzv = zzfjjVar.zzY();
    }

    public final boolean zza() {
        return this.zzg.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzea));
    }
}
