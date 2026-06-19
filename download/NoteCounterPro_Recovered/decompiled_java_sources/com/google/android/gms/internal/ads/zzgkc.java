package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzgkc implements zzgjf {
    private final zzgmu zza;
    private final zzgmg zzb;
    private final ExecutorService zzc;
    private final zzgmz zzd;
    private final zzgoe zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgkb zzj;

    public zzgkc(zzikv zzikvVar, zzgmu zzgmuVar, zzgmg zzgmgVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgbf zzgbfVar, ExecutorService executorService) {
        this.zza = zzgmuVar;
        this.zzb = zzgmgVar;
        this.zzc = executorService;
        this.zzd = zzgmzVar;
        this.zze = zzgoeVar;
        this.zzg = zzgbfVar.zzb();
        this.zzh = zzgbfVar.zzk();
        this.zzi = zzgbfVar.zzj();
    }

    private final String zzq(Map map) {
        String zzb;
        zzgoe zzgoeVar = this.zze;
        try {
            zzgoeVar.zza(20110).zza();
            synchronized (this.zzf) {
                try {
                    zzgkb zzgkbVar = this.zzj;
                    if (zzgkbVar == null) {
                        zzgoeVar.zzb(20109);
                        zzb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } else {
                        zzb = zzgkbVar.zzb(map);
                    }
                } finally {
                }
            }
            return zzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final String zza() {
        synchronized (this.zzf) {
            try {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar == null) {
                    return "3.825731049.-1";
                }
                return zzgkbVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final j3.a zzb() {
        zzgzg zzw = zzgzg.zzw(this.zzb.zzb());
        zzgka zzgkaVar = zzgka.zza;
        ExecutorService executorService = this.zzc;
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzw, Throwable.class, zzgkaVar, executorService), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ j3.a zza(Object obj) {
                return zzgkc.this.zzi((zzgdu) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final j3.a zzc(final Context context) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkc.this.zzj(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final j3.a zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgzo.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgju
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkc.this.zzk(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final j3.a zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgzo.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgjv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgkc.this.zzl(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                try {
                    zzgkb zzgkbVar = this.zzj;
                    if (zzgkbVar != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        zzgkbVar.zzc(hashMap);
                    } else {
                        this.zze.zzb(20105);
                    }
                } finally {
                }
            }
        } catch (zzatp | zzatt e4) {
            this.zze.zzd(20104, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Map map) {
        String str;
        zzgoc zza;
        String str2;
        map.put("v", this.zzg);
        j3.a aVar = (j3.a) map.get("gs");
        j3.a aVar2 = (j3.a) map.get("ai");
        byte[] bArr = null;
        long j2 = -1;
        if (aVar != null) {
            zza = this.zze.zza(20107);
            try {
                try {
                    zza.zza();
                    zzaxg zzaxgVar = (zzaxg) aVar.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (zzaxgVar != null) {
                        bArr = zzaxgVar.zzh().zzaN();
                        str = zzaxgVar.zzb().length() > 1 ? zzaxgVar.zzb() : "E";
                        try {
                            if (zzaxgVar.zzc()) {
                                j2 = zzaxgVar.zzd();
                            }
                        } catch (ClassCastException e4) {
                            e = e4;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j2));
                        } catch (InterruptedException e5) {
                            e = e5;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j2));
                        } catch (ExecutionException e6) {
                            e = e6;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j2));
                        } catch (TimeoutException e7) {
                            e = e7;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals("E")) {
                            }
                            map.put("int", str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j2));
                        }
                    } else {
                        str = "E";
                    }
                } finally {
                }
            } catch (ClassCastException e8) {
                e = e8;
                str = "E";
                zza.zzb(e);
                zza.zzc();
                if (str.equals("E")) {
                    zza = this.zze.zza(20108);
                    try {
                        try {
                            zza.zza();
                            str2 = (String) aVar2.get(this.zzh, TimeUnit.MILLISECONDS);
                            if (true != zzgrt.zzc(str2)) {
                            }
                        } catch (ClassCastException e9) {
                            e = e9;
                            zza.zzb(e);
                        } catch (InterruptedException e10) {
                            e = e10;
                            zza.zzb(e);
                        } catch (ExecutionException e11) {
                            e = e11;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zza.zzb(e);
                        } catch (TimeoutException e12) {
                            e = e12;
                            zza.zzb(e);
                        }
                    } finally {
                    }
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j2));
            } catch (InterruptedException e13) {
                e = e13;
                str = "E";
                zza.zzb(e);
                zza.zzc();
                if (str.equals("E")) {
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j2));
            } catch (ExecutionException e14) {
                e = e14;
                str = "E";
            } catch (TimeoutException e15) {
                e = e15;
                str = "E";
                zza.zzb(e);
                zza.zzc();
                if (str.equals("E")) {
                }
                map.put("int", str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j2));
            }
            zza.zzc();
        } else {
            str = "E";
        }
        if (str.equals("E") && aVar2 != null) {
            zza = this.zze.zza(20108);
            zza.zza();
            str2 = (String) aVar2.get(this.zzh, TimeUnit.MILLISECONDS);
            if (true != zzgrt.zzc(str2)) {
                str = str2;
            }
        }
        map.put("int", str);
        if (bArr != null) {
            map.put("att", bArr);
        }
        map.put("gv", Long.valueOf(j2));
    }

    public final /* synthetic */ j3.a zzi(zzgdu zzgduVar) {
        if (this.zza.zzb(zzgduVar)) {
            return zzgzo.zzk(this.zzb.zze(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgjw
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    zzgkc.this.zzm((byte[]) obj);
                    return null;
                }
            }, zzhaf.zza());
        }
        this.zze.zzb(20103);
        throw new zzgjg(1);
    }

    public final /* synthetic */ String zzj(final Context context) {
        final HashMap hashMap = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkc.this.zzn(hashMap, context);
            }
        });
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    public final /* synthetic */ String zzk(final Context context, String str, final View view, final Activity activity) {
        final HashMap hashMap = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(hashMap, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgjy
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkc.this.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    public final /* synthetic */ String zzl(final Context context, final String str, final View view, Activity activity) {
        final HashMap hashMap = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(hashMap, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgjz
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgkc.this.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String zzq = zzq(hashMap);
        hashMap.clear();
        return zzq;
    }

    public final /* synthetic */ Void zzm(byte[] bArr) {
        zzatr zzc = zzgkf.zzc();
        zzgoc zza = this.zze.zza(20102);
        try {
            try {
                zza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgkb.zza(zzc, bArr);
                }
                zza.zzc();
                return null;
            } catch (zzatp e4) {
                e = e4;
                zza.zzb(e);
                throw new zzgjg(2, e);
            } catch (zzatt e5) {
                e = e5;
                zza.zzb(e);
                throw new zzgjg(2, e);
            } catch (Throwable th) {
                zza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    public final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    public final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
