package com.google.android.gms.internal.ads;

import g4.i;
import java.util.List;
import java.util.Map;
import k0.d0;
import o4.t;
import o4.w;
import t3.h;

/* loaded from: classes.dex */
public final class zzgaf implements zzfyv {
    private final t zza;
    private final w4.a zzb;
    private final w4.a zzc;
    private final w4.a zzd;
    private boolean zze;
    private zzfyt zzf;
    private boolean zzg;
    private final k0.f zzh;
    private final zzdvj zzi;

    public zzgaf(k0.f fVar, zzfzh zzfzhVar, zzdvj zzdvjVar, zzfze zzfzeVar) {
        i.e(fVar, "adQualityDataStore");
        i.e(zzfzhVar, "coroutineScopeProvider");
        i.e(zzdvjVar, "dataPinger");
        i.e(zzfzeVar, "clock");
        this.zzi = zzdvjVar;
        this.zza = zzfzhVar.zza();
        this.zzb = new w4.c();
        this.zzc = new w4.c();
        this.zzd = new w4.c();
        this.zzh = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r9.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v13, types: [w4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzs(String str, w3.c cVar) {
        zzfzk zzfzkVar;
        x3.a aVar;
        int i5;
        w4.c cVar2;
        Throwable th;
        w4.a aVar2;
        Object i6;
        try {
            if (cVar instanceof zzfzk) {
                zzfzkVar = (zzfzk) cVar;
                int i7 = zzfzkVar.zze;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    zzfzkVar.zze = i7 - Integer.MIN_VALUE;
                    Object obj = zzfzkVar.zzc;
                    aVar = x3.a.f3712g;
                    i5 = zzfzkVar.zze;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        w4.a aVar3 = this.zzd;
                        zzfzkVar.zza = str;
                        zzfzkVar.zzb = aVar3;
                        zzfzkVar.zze = 1;
                        cVar2 = (w4.c) aVar3;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (w4.a) zzfzkVar.zza;
                            try {
                                b3.g.x(obj);
                                ((w4.c) aVar2).d(null);
                                return h.f3400a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((w4.c) aVar2).d(null);
                                throw th;
                            }
                        }
                        ?? r8 = (w4.a) zzfzkVar.zzb;
                        String str2 = (String) zzfzkVar.zza;
                        b3.g.x(obj);
                        cVar2 = r8;
                        str = str2;
                    }
                    k0.f fVar = this.zzh;
                    zzfzl zzfzlVar = new zzfzl(str, null);
                    zzfzkVar.zza = cVar2;
                    zzfzkVar.zzb = null;
                    zzfzkVar.zze = 2;
                    i6 = ((d0) fVar).i(zzfzlVar, zzfzkVar);
                    if (i6 != aVar) {
                        w4.c cVar3 = cVar2;
                        obj = i6;
                        aVar2 = cVar3;
                        ((w4.c) aVar2).d(null);
                        return h.f3400a;
                    }
                    return aVar;
                }
            }
            k0.f fVar2 = this.zzh;
            zzfzl zzfzlVar2 = new zzfzl(str, null);
            zzfzkVar.zza = cVar2;
            zzfzkVar.zzb = null;
            zzfzkVar.zze = 2;
            i6 = ((d0) fVar2).i(zzfzlVar2, zzfzkVar);
            if (i6 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            w4.c cVar4 = cVar2;
            th = th3;
            aVar2 = cVar4;
            ((w4.c) aVar2).d(null);
            throw th;
        }
        zzfzkVar = new zzfzk(this, cVar);
        Object obj2 = zzfzkVar.zzc;
        aVar = x3.a.f3712g;
        i5 = zzfzkVar.zze;
        if (i5 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.c(r0) != r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [w4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzt(w3.c cVar) {
        zzfzn zzfznVar;
        x3.a aVar;
        int i5;
        w4.c cVar2;
        w4.a aVar2;
        Throwable th;
        Object i6;
        try {
            if (cVar instanceof zzfzn) {
                zzfznVar = (zzfzn) cVar;
                int i7 = zzfznVar.zzd;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    zzfznVar.zzd = i7 - Integer.MIN_VALUE;
                    Object obj = zzfznVar.zzb;
                    aVar = x3.a.f3712g;
                    i5 = zzfznVar.zzd;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        w4.a aVar3 = this.zzd;
                        zzfznVar.zza = aVar3;
                        zzfznVar.zzd = 1;
                        cVar2 = (w4.c) aVar3;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (w4.a) zzfznVar.zza;
                            try {
                                b3.g.x(obj);
                                ((w4.c) aVar2).d(null);
                                return h.f3400a;
                            } catch (Throwable th2) {
                                th = th2;
                                ((w4.c) aVar2).d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (w4.a) zzfznVar.zza;
                        b3.g.x(obj);
                        cVar2 = r2;
                    }
                    k0.f fVar = this.zzh;
                    zzfzo zzfzoVar = new zzfzo(null);
                    zzfznVar.zza = cVar2;
                    zzfznVar.zzd = 2;
                    i6 = ((d0) fVar).i(zzfzoVar, zzfznVar);
                    if (i6 != aVar) {
                        aVar2 = cVar2;
                        obj = i6;
                        ((w4.c) aVar2).d(null);
                        return h.f3400a;
                    }
                    return aVar;
                }
            }
            k0.f fVar2 = this.zzh;
            zzfzo zzfzoVar2 = new zzfzo(null);
            zzfznVar.zza = cVar2;
            zzfznVar.zzd = 2;
            i6 = ((d0) fVar2).i(zzfzoVar2, zzfznVar);
            if (i6 != aVar) {
            }
            return aVar;
        } catch (Throwable th3) {
            aVar2 = cVar2;
            th = th3;
            ((w4.c) aVar2).d(null);
            throw th;
        }
        zzfznVar = new zzfzn(this, cVar);
        Object obj2 = zzfznVar.zzb;
        aVar = x3.a.f3712g;
        i5 = zzfznVar.zzd;
        if (i5 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #0 {all -> 0x0069, blocks: (B:12:0x004a, B:15:0x0050, B:17:0x0059, B:21:0x006b, B:22:0x006e, B:23:0x006f, B:24:0x0072), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:12:0x004a, B:15:0x0050, B:17:0x0059, B:21:0x006b, B:22:0x006e, B:23:0x006f, B:24:0x0072), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(long j2, w3.c cVar) {
        zzfzm zzfzmVar;
        int i5;
        w4.a aVar;
        zzfyt zzfytVar;
        try {
            if (cVar instanceof zzfzm) {
                zzfzmVar = (zzfzm) cVar;
                int i6 = zzfzmVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzfzmVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj = zzfzmVar.zzc;
                    x3.a aVar2 = x3.a.f3712g;
                    i5 = zzfzmVar.zze;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        w4.a aVar3 = this.zzb;
                        zzfzmVar.zzb = aVar3;
                        zzfzmVar.zza = j2;
                        zzfzmVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar3;
                        if (cVar2.c(zzfzmVar) == aVar2) {
                            return aVar2;
                        }
                        aVar = cVar2;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = zzfzmVar.zza;
                        aVar = (w4.a) zzfzmVar.zzb;
                        b3.g.x(obj);
                    }
                    zzfytVar = this.zzf;
                    if (zzfytVar != null) {
                        i.g("adQualityDataBuilder");
                        throw null;
                    }
                    long zzi = j2 - zzfytVar.zzi();
                    zzfyt zzfytVar2 = this.zzf;
                    if (zzfytVar2 == null) {
                        i.g("adQualityDataBuilder");
                        throw null;
                    }
                    zzfytVar.zzb(zzi - zzfytVar2.zzg());
                    ((w4.c) aVar).d(null);
                    return h.f3400a;
                }
            }
            zzfytVar = this.zzf;
            if (zzfytVar != null) {
            }
        } catch (Throwable th) {
            ((w4.c) aVar).d(null);
            throw th;
        }
        zzfzmVar = new zzfzm(this, cVar);
        Object obj2 = zzfzmVar.zzc;
        x3.a aVar22 = x3.a.f3712g;
        i5 = zzfzmVar.zze;
        if (i5 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0061, code lost:
    
        if (r8 != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #2 {all -> 0x00ae, blocks: (B:35:0x0063, B:37:0x0067, B:41:0x00b0, B:42:0x00b5), top: B:34:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0 A[Catch: all -> 0x00ae, TRY_ENTER, TryCatch #2 {all -> 0x00ae, blocks: (B:35:0x0063, B:37:0x0067, B:41:0x00b0, B:42:0x00b5), top: B:34:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(w3.c cVar) {
        zzfzr zzfzrVar;
        int i5;
        Object obj;
        zzfyt zzfytVar;
        zzfyu zzfyuVar;
        Object obj2;
        Object obj3;
        try {
            if (cVar instanceof zzfzr) {
                zzfzrVar = (zzfzr) cVar;
                int i6 = zzfzrVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzfzrVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj4 = zzfzrVar.zzc;
                    x3.a aVar = x3.a.f3712g;
                    i5 = zzfzrVar.zze;
                    if (i5 != 0) {
                        b3.g.x(obj4);
                        w4.a aVar2 = this.zzb;
                        zzfzrVar.zza = aVar2;
                        zzfzrVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar2;
                        Object c5 = cVar2.c(zzfzrVar);
                        obj = cVar2;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj3 = (w4.a) zzfzrVar.zza;
                                try {
                                    b3.g.x(obj4);
                                    ((w4.c) obj3).d(null);
                                    return h.f3400a;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            Object obj5 = (w4.a) zzfzrVar.zzb;
                            zzfyuVar = (zzfyu) zzfzrVar.zza;
                            b3.g.x(obj4);
                            obj2 = obj5;
                            try {
                                k0.f fVar = this.zzh;
                                zzfzs zzfzsVar = new zzfzs(zzfyuVar, null);
                                zzfzrVar.zza = obj2;
                                zzfzrVar.zzb = null;
                                zzfzrVar.zze = 3;
                                obj4 = ((d0) fVar).i(zzfzsVar, zzfzrVar);
                                if (obj4 != aVar) {
                                    obj3 = obj2;
                                    ((w4.c) obj3).d(null);
                                    return h.f3400a;
                                }
                                return aVar;
                            } catch (Throwable th2) {
                                th = th2;
                                obj3 = obj2;
                                throw th;
                            }
                        }
                        Object obj6 = (w4.a) zzfzrVar.zza;
                        b3.g.x(obj4);
                        obj = obj6;
                    }
                    zzfytVar = this.zzf;
                    if (zzfytVar != null) {
                        i.g("adQualityDataBuilder");
                        throw null;
                    }
                    zzfyu zzfyuVar2 = (zzfyu) zzfytVar.zzbu();
                    ((w4.c) obj).d(null);
                    i.b(zzfyuVar2);
                    w4.a aVar3 = this.zzd;
                    zzfzrVar.zza = zzfyuVar2;
                    zzfzrVar.zzb = aVar3;
                    zzfzrVar.zze = 2;
                    w4.c cVar3 = (w4.c) aVar3;
                    if (cVar3.c(zzfzrVar) != aVar) {
                        zzfyuVar = zzfyuVar2;
                        obj2 = cVar3;
                        k0.f fVar2 = this.zzh;
                        zzfzs zzfzsVar2 = new zzfzs(zzfyuVar, null);
                        zzfzrVar.zza = obj2;
                        zzfzrVar.zzb = null;
                        zzfzrVar.zze = 3;
                        obj4 = ((d0) fVar2).i(zzfzsVar2, zzfzrVar);
                        if (obj4 != aVar) {
                        }
                    }
                    return aVar;
                }
            }
            zzfytVar = this.zzf;
            if (zzfytVar != null) {
            }
        } finally {
            ((w4.c) obj).d(null);
        }
        zzfzrVar = new zzfzr(this, cVar);
        Object obj42 = zzfzrVar.zzc;
        x3.a aVar4 = x3.a.f3712g;
        i5 = zzfzrVar.zze;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean zzw(zzfyu zzfyuVar) {
        Object[] objArr;
        List zzk = zzfyuVar.zzk();
        Long l5 = null;
        if (zzk != null) {
            l5 = (Long) (zzk.isEmpty() ? null : zzk.get(zzk.size() - 1));
        }
        Object[] objArr2 = zzfyuVar.zzl() > zzfyuVar.zzm() && !zzfyuVar.zzd();
        if (l5 != null) {
            if (zzfyuVar.zzi() - l5.longValue() > 5000) {
                objArr = true;
                return !objArr2 == true || objArr == true;
            }
        }
        objArr = false;
        if (objArr2 == true) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zza() {
        w.i(this.zza, new zzgaa(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzb(String str) {
        i.e(str, "gwsQueryId");
        w.i(this.zza, new zzfzu(this, str, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzc() {
        w.i(this.zza, new zzfzq(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzd() {
        w.i(this.zza, new zzgae(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zze() {
        w.i(this.zza, new zzfzy(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzf() {
        w.i(this.zza, new zzgac(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfyv
    public final void zzg() {
        w.i(this.zza, new zzfzw(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x006b, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.ads.zzgaf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(w3.c cVar) {
        zzfzz zzfzzVar;
        ?? r2;
        Object obj;
        try {
            if (cVar instanceof zzfzz) {
                zzfzzVar = (zzfzz) cVar;
                int i5 = zzfzzVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzfzzVar.zzd = i5 - Integer.MIN_VALUE;
                    Object obj2 = zzfzzVar.zzb;
                    x3.a aVar = x3.a.f3712g;
                    r2 = zzfzzVar.zzd;
                    h hVar = h.f3400a;
                    if (r2 != 0) {
                        b3.g.x(obj2);
                        w4.a aVar2 = this.zzd;
                        zzfzzVar.zza = aVar2;
                        zzfzzVar.zzd = 1;
                        w4.c cVar2 = (w4.c) aVar2;
                        if (cVar2.c(zzfzzVar) != aVar) {
                            obj = cVar2;
                        }
                        return aVar;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b3.g.x(obj2);
                            return hVar;
                        }
                        w4.a aVar3 = (w4.a) zzfzzVar.zza;
                        b3.g.x(obj2);
                        r2 = aVar3;
                        zzfyy zzfyyVar = (zzfyy) obj2;
                        if (zzfyyVar != null && zzfyyVar.zza() != 0) {
                            for (Map.Entry entry : zzfyyVar.zzb().entrySet()) {
                                zzibl zzcc = ((zzfyu) entry.getValue()).zzcc();
                                i.d(zzcc, "toBuilder(...)");
                                zzfyt zzfytVar = (zzfyt) zzcc;
                                Object value = entry.getValue();
                                i.d(value, "<get-value>(...)");
                                if (zzw((zzfyu) value)) {
                                    zzfytVar.zzf(true);
                                }
                                zzdvj zzdvjVar = this.zzi;
                                zzibr zzbu = zzfytVar.zzbu();
                                i.d(zzbu, "build(...)");
                                zzdvjVar.zza((zzfyu) zzbu);
                            }
                            zzfzzVar.zza = null;
                            zzfzzVar.zzd = 3;
                            if (zzt(zzfzzVar) == aVar) {
                                return aVar;
                            }
                        }
                        return hVar;
                    }
                    Object obj3 = (w4.a) zzfzzVar.zza;
                    b3.g.x(obj2);
                    obj = obj3;
                    u1.f fVar = ((d0) this.zzh).f2338c;
                    zzfzzVar.zza = obj;
                    zzfzzVar.zzd = 2;
                    obj2 = r4.t.d(fVar, zzfzzVar);
                    r2 = obj;
                }
            }
            if (r2 != 0) {
            }
            u1.f fVar2 = ((d0) this.zzh).f2338c;
            zzfzzVar.zza = obj;
            zzfzzVar.zzd = 2;
            obj2 = r4.t.d(fVar2, zzfzzVar);
            r2 = obj;
        } finally {
            ((w4.c) r2).d(null);
        }
        zzfzzVar = new zzfzz(this, cVar);
        Object obj22 = zzfzzVar.zzb;
        x3.a aVar4 = x3.a.f3712g;
        r2 = zzfzzVar.zzd;
        h hVar2 = h.f3400a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x007a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:12:0x0054, B:18:0x0060), top: B:11:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(String str, w3.c cVar) {
        zzfzt zzfztVar;
        int i5;
        String str2;
        w4.a aVar;
        long j2;
        boolean z4;
        try {
            if (cVar instanceof zzfzt) {
                zzfztVar = (zzfzt) cVar;
                int i6 = zzfztVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzfztVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj = zzfztVar.zzc;
                    x3.a aVar2 = x3.a.f3712g;
                    i5 = zzfztVar.zze;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        w4.a aVar3 = this.zzb;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzfztVar.zzf = str;
                        zzfztVar.zza = aVar3;
                        zzfztVar.zzb = currentTimeMillis;
                        zzfztVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar3;
                        if (cVar2.c(zzfztVar) == aVar2) {
                            return aVar2;
                        }
                        str2 = str;
                        aVar = cVar2;
                        j2 = currentTimeMillis;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = zzfztVar.zzb;
                        aVar = (w4.a) zzfztVar.zza;
                        str2 = zzfztVar.zzf;
                        b3.g.x(obj);
                    }
                    z4 = this.zze;
                    h hVar = h.f3400a;
                    if (!z4) {
                        this.zze = true;
                        zzibl zzcc = zzfyu.zzp().zzcc();
                        i.d(zzcc, "toBuilder(...)");
                        zzfyt zzfytVar = (zzfyt) zzcc;
                        this.zzf = zzfytVar;
                        zzfytVar.zza(str2);
                        zzfytVar.zzj(j2);
                    }
                    return hVar;
                }
            }
            z4 = this.zze;
            h hVar2 = h.f3400a;
            if (!z4) {
            }
            return hVar2;
        } finally {
            ((w4.c) aVar).d(null);
        }
        zzfztVar = new zzfzt(this, cVar);
        Object obj2 = zzfztVar.zzc;
        x3.a aVar22 = x3.a.f3712g;
        i5 = zzfztVar.zze;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (zzu(r6, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0061, code lost:
    
        if (r12 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[Catch: all -> 0x00aa, TRY_LEAVE, TryCatch #1 {all -> 0x00aa, blocks: (B:24:0x008a, B:26:0x008e, B:29:0x00ac, B:30:0x00b1), top: B:23:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #1 {all -> 0x00aa, blocks: (B:24:0x008a, B:26:0x008e, B:29:0x00ac, B:30:0x00b1), top: B:23:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d A[Catch: all -> 0x00b8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:36:0x0063, B:40:0x006d), top: B:35:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(w3.c cVar) {
        zzfzp zzfzpVar;
        int i5;
        Object obj;
        long j2;
        Object obj2;
        zzfyt zzfytVar;
        try {
            if (cVar instanceof zzfzp) {
                zzfzpVar = (zzfzp) cVar;
                int i6 = zzfzpVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzfzpVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj3 = zzfzpVar.zzc;
                    Object obj4 = x3.a.f3712g;
                    i5 = zzfzpVar.zze;
                    h hVar = h.f3400a;
                    if (i5 != 0) {
                        b3.g.x(obj3);
                        w4.a aVar = this.zzc;
                        zzfzpVar.zza = aVar;
                        zzfzpVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar;
                        Object c5 = cVar2.c(zzfzpVar);
                        obj = cVar2;
                    } else if (i5 == 1) {
                        Object obj5 = (w4.a) zzfzpVar.zza;
                        b3.g.x(obj3);
                        obj = obj5;
                    } else {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                b3.g.x(obj3);
                                zzfzpVar.zze = 4;
                                return zzv(zzfzpVar) == obj4 ? obj4 : hVar;
                            }
                            if (i5 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            b3.g.x(obj3);
                            return hVar;
                        }
                        j2 = zzfzpVar.zzb;
                        Object obj6 = (w4.a) zzfzpVar.zza;
                        b3.g.x(obj3);
                        obj2 = obj6;
                        try {
                            zzfytVar = this.zzf;
                            if (zzfytVar != null) {
                                i.g("adQualityDataBuilder");
                                throw null;
                            }
                            zzfytVar.zzo(j2);
                            ((w4.c) obj2).d(null);
                            zzfzpVar.zza = null;
                            zzfzpVar.zze = 3;
                        } finally {
                        }
                    }
                    if (!this.zzg) {
                        return hVar;
                    }
                    this.zzg = true;
                    ((w4.c) obj).d(null);
                    w4.a aVar2 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzfzpVar.zza = aVar2;
                    zzfzpVar.zzb = currentTimeMillis;
                    zzfzpVar.zze = 2;
                    w4.c cVar3 = (w4.c) aVar2;
                    if (cVar3.c(zzfzpVar) != obj4) {
                        j2 = currentTimeMillis;
                        obj2 = cVar3;
                        zzfytVar = this.zzf;
                        if (zzfytVar != null) {
                        }
                    }
                }
            }
            if (!this.zzg) {
            }
        } finally {
        }
        zzfzpVar = new zzfzp(this, cVar);
        Object obj32 = zzfzpVar.zzc;
        Object obj42 = x3.a.f3712g;
        i5 = zzfzpVar.zze;
        h hVar2 = h.f3400a;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0053, code lost:
    
        if (r13 != r1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:12:0x007d, B:15:0x0083, B:18:0x008b, B:20:0x008f, B:22:0x00ab, B:24:0x00b4, B:26:0x00b8, B:27:0x00c3, B:28:0x00c6, B:30:0x00c7, B:31:0x00ca, B:32:0x00cb, B:33:0x00ce, B:34:0x00cf, B:36:0x00d3, B:38:0x00d9, B:40:0x00dd, B:42:0x00f9, B:43:0x0102, B:44:0x0105, B:45:0x0106, B:46:0x0109, B:47:0x010a, B:49:0x010e, B:52:0x0117, B:53:0x011a, B:54:0x011b, B:55:0x011e, B:56:0x011f, B:57:0x0122), top: B:11:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:12:0x007d, B:15:0x0083, B:18:0x008b, B:20:0x008f, B:22:0x00ab, B:24:0x00b4, B:26:0x00b8, B:27:0x00c3, B:28:0x00c6, B:30:0x00c7, B:31:0x00ca, B:32:0x00cb, B:33:0x00ce, B:34:0x00cf, B:36:0x00d3, B:38:0x00d9, B:40:0x00dd, B:42:0x00f9, B:43:0x0102, B:44:0x0105, B:45:0x0106, B:46:0x0109, B:47:0x010a, B:49:0x010e, B:52:0x0117, B:53:0x011a, B:54:0x011b, B:55:0x011e, B:56:0x011f, B:57:0x0122), top: B:11:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzk(w3.c cVar) {
        zzgad zzgadVar;
        int i5;
        Object obj;
        w4.a aVar;
        long j2;
        zzfyt zzfytVar;
        try {
            if (cVar instanceof zzgad) {
                zzgadVar = (zzgad) cVar;
                int i6 = zzgadVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzgadVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj2 = zzgadVar.zzc;
                    x3.a aVar2 = x3.a.f3712g;
                    i5 = zzgadVar.zze;
                    h hVar = h.f3400a;
                    if (i5 != 0) {
                        b3.g.x(obj2);
                        w4.a aVar3 = this.zzc;
                        zzgadVar.zza = aVar3;
                        zzgadVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar3;
                        Object c5 = cVar2.c(zzgadVar);
                        obj = cVar2;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j2 = zzgadVar.zzb;
                            aVar = (w4.a) zzgadVar.zza;
                            b3.g.x(obj2);
                            try {
                                zzfytVar = this.zzf;
                                if (zzfytVar != null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                if (zzfytVar.zzr() > 0) {
                                    zzfyt zzfytVar2 = this.zzf;
                                    if (zzfytVar2 == null) {
                                        i.g("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List zzq = zzfytVar2.zzq();
                                    i.d(zzq, "getAdClickTimestampsMsList(...)");
                                    Object Y = u3.g.Y(zzq);
                                    i.d(Y, "last(...)");
                                    long longValue = j2 - ((Number) Y).longValue();
                                    zzfyt zzfytVar3 = this.zzf;
                                    if (zzfytVar3 == null) {
                                        i.g("adQualityDataBuilder");
                                        throw null;
                                    }
                                    zzfytVar3.zzt();
                                    if (longValue < 5000) {
                                        zzfyt zzfytVar4 = this.zzf;
                                        if (zzfytVar4 == null) {
                                            i.g("adQualityDataBuilder");
                                            throw null;
                                        }
                                        zzfytVar4.zzd(zzfytVar4.zzc() + 1);
                                    }
                                }
                                zzfyt zzfytVar5 = this.zzf;
                                if (zzfytVar5 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                if (zzfytVar5.zzn() > 0) {
                                    zzfyt zzfytVar6 = this.zzf;
                                    if (zzfytVar6 == null) {
                                        i.g("adQualityDataBuilder");
                                        throw null;
                                    }
                                    List zzm = zzfytVar6.zzm();
                                    i.d(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    Object Y2 = u3.g.Y(zzm);
                                    i.d(Y2, "last(...)");
                                    long longValue2 = j2 - ((Number) Y2).longValue();
                                    zzfyt zzfytVar7 = this.zzf;
                                    if (zzfytVar7 == null) {
                                        i.g("adQualityDataBuilder");
                                        throw null;
                                    }
                                    zzfytVar7.zzh(zzfytVar7.zzg() + longValue2);
                                }
                                zzfyt zzfytVar8 = this.zzf;
                                if (zzfytVar8 != null) {
                                    zzfytVar8.zzp(j2);
                                    return hVar;
                                }
                                i.g("adQualityDataBuilder");
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        Object obj3 = (w4.a) zzgadVar.zza;
                        b3.g.x(obj2);
                        obj = obj3;
                    }
                    if (this.zzg) {
                        return hVar;
                    }
                    this.zzg = false;
                    ((w4.c) obj).d(null);
                    w4.a aVar4 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgadVar.zza = aVar4;
                    zzgadVar.zzb = currentTimeMillis;
                    zzgadVar.zze = 2;
                    w4.c cVar3 = (w4.c) aVar4;
                    if (cVar3.c(zzgadVar) != aVar2) {
                        aVar = cVar3;
                        j2 = currentTimeMillis;
                        zzfytVar = this.zzf;
                        if (zzfytVar != null) {
                        }
                    }
                    return aVar2;
                }
            }
            if (this.zzg) {
            }
        } finally {
            ((w4.c) obj).d(null);
        }
        zzgadVar = new zzgad(this, cVar);
        Object obj22 = zzgadVar.zzc;
        x3.a aVar22 = x3.a.f3712g;
        i5 = zzgadVar.zze;
        h hVar2 = h.f3400a;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0066, code lost:
    
        if (r15 != r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #1 {all -> 0x00e9, blocks: (B:26:0x0090, B:29:0x0096, B:31:0x00a0, B:33:0x00ac, B:35:0x00b3, B:39:0x00eb, B:40:0x00ee, B:41:0x00ef, B:42:0x00f2, B:43:0x00f3, B:44:0x00f6, B:45:0x00f7, B:46:0x00fa), top: B:25:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7 A[Catch: all -> 0x00e9, TryCatch #1 {all -> 0x00e9, blocks: (B:26:0x0090, B:29:0x0096, B:31:0x00a0, B:33:0x00ac, B:35:0x00b3, B:39:0x00eb, B:40:0x00ee, B:41:0x00ef, B:42:0x00f2, B:43:0x00f3, B:44:0x00f6, B:45:0x00f7, B:46:0x00fa), top: B:25:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(w3.c cVar) {
        zzfzx zzfzxVar;
        int i5;
        Object obj;
        long j2;
        Object obj2;
        zzfyt zzfytVar;
        zzfyu zzfyuVar;
        try {
            if (cVar instanceof zzfzx) {
                zzfzxVar = (zzfzx) cVar;
                int i6 = zzfzxVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzfzxVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj3 = zzfzxVar.zzc;
                    Object obj4 = x3.a.f3712g;
                    i5 = zzfzxVar.zze;
                    h hVar = h.f3400a;
                    if (i5 != 0) {
                        b3.g.x(obj3);
                        w4.a aVar = this.zzb;
                        zzfzxVar.zza = aVar;
                        zzfzxVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar;
                        Object c5 = cVar2.c(zzfzxVar);
                        obj = cVar2;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    b3.g.x(obj3);
                                    return hVar;
                                }
                                zzfyuVar = (zzfyu) zzfzxVar.zza;
                                b3.g.x(obj3);
                                if (this.zzi.zza(zzfyuVar)) {
                                    String zza = zzfyuVar.zza();
                                    i.d(zza, "getGwsQueryId(...)");
                                    zzfzxVar.zza = null;
                                    zzfzxVar.zze = 4;
                                    if (zzs(zza, zzfzxVar) == obj4) {
                                        return obj4;
                                    }
                                }
                                return hVar;
                            }
                            j2 = zzfzxVar.zzb;
                            Object obj5 = (w4.a) zzfzxVar.zza;
                            b3.g.x(obj3);
                            obj2 = obj5;
                            try {
                                zzfytVar = this.zzf;
                                if (zzfytVar != null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                long zzi = j2 - zzfytVar.zzi();
                                zzfyt zzfytVar2 = this.zzf;
                                if (zzfytVar2 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfytVar.zzb(zzi - zzfytVar2.zzg());
                                zzfyt zzfytVar3 = this.zzf;
                                if (zzfytVar3 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfytVar3.zzl(j2);
                                zzfyt zzfytVar4 = this.zzf;
                                if (zzfytVar4 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfyu zzfyuVar2 = (zzfyu) zzfytVar4.zzbu();
                                ((w4.c) obj2).d(null);
                                i.b(zzfyuVar2);
                                zzfzxVar.zza = zzfyuVar2;
                                zzfzxVar.zze = 3;
                                if (zzv(zzfzxVar) != obj4) {
                                    zzfyuVar = zzfyuVar2;
                                    if (this.zzi.zza(zzfyuVar)) {
                                    }
                                    return hVar;
                                }
                                return obj4;
                            } finally {
                            }
                        }
                        Object obj6 = (w4.a) zzfzxVar.zza;
                        b3.g.x(obj3);
                        obj = obj6;
                    }
                    if (this.zze) {
                        return hVar;
                    }
                    this.zze = false;
                    ((w4.c) obj).d(null);
                    w4.a aVar2 = this.zzb;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzfzxVar.zza = aVar2;
                    zzfzxVar.zzb = currentTimeMillis;
                    zzfzxVar.zze = 2;
                    w4.c cVar3 = (w4.c) aVar2;
                    if (cVar3.c(zzfzxVar) != obj4) {
                        j2 = currentTimeMillis;
                        obj2 = cVar3;
                        zzfytVar = this.zzf;
                        if (zzfytVar != null) {
                        }
                    }
                    return obj4;
                }
            }
            if (this.zze) {
            }
        } finally {
        }
        zzfzxVar = new zzfzx(this, cVar);
        Object obj32 = zzfzxVar.zzc;
        Object obj42 = x3.a.f3712g;
        i5 = zzfzxVar.zze;
        h hVar2 = h.f3400a;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0091, code lost:
    
        if (r0 != r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006a, code lost:
    
        if (r0 != r3) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0070 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(w3.c cVar) {
        zzgab zzgabVar;
        int i5;
        Object obj;
        long currentTimeMillis;
        Object obj2;
        zzfyu zzfyuVar;
        try {
            if (cVar instanceof zzgab) {
                zzgabVar = (zzgab) cVar;
                int i6 = zzgabVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzgabVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj3 = zzgabVar.zzc;
                    Object obj4 = x3.a.f3712g;
                    i5 = zzgabVar.zze;
                    h hVar = h.f3400a;
                    if (i5 != 0) {
                        b3.g.x(obj3);
                        w4.a aVar = this.zzb;
                        zzgabVar.zza = aVar;
                        zzgabVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar;
                        Object c5 = cVar2.c(zzgabVar);
                        obj = cVar2;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    b3.g.x(obj3);
                                    return hVar;
                                }
                                zzfyuVar = (zzfyu) zzgabVar.zza;
                                b3.g.x(obj3);
                                if (this.zzi.zza(zzfyuVar)) {
                                    String zza = zzfyuVar.zza();
                                    i.d(zza, "getGwsQueryId(...)");
                                    zzgabVar.zza = null;
                                    zzgabVar.zze = 4;
                                    if (zzs(zza, zzgabVar) == obj4) {
                                        return obj4;
                                    }
                                }
                                return hVar;
                            }
                            currentTimeMillis = zzgabVar.zzb;
                            Object obj5 = (w4.a) zzgabVar.zza;
                            b3.g.x(obj3);
                            obj2 = obj5;
                            try {
                                zzfyt zzfytVar = this.zzf;
                                if (zzfytVar == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                long zzi = currentTimeMillis - zzfytVar.zzi();
                                zzfyt zzfytVar2 = this.zzf;
                                if (zzfytVar2 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfytVar.zzb(zzi - zzfytVar2.zzg());
                                zzfyt zzfytVar3 = this.zzf;
                                if (zzfytVar3 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfytVar3.zzk(currentTimeMillis);
                                zzfyt zzfytVar4 = this.zzf;
                                if (zzfytVar4 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfytVar4.zze(true);
                                zzfyt zzfytVar5 = this.zzf;
                                if (zzfytVar5 == null) {
                                    i.g("adQualityDataBuilder");
                                    throw null;
                                }
                                zzfyu zzfyuVar2 = (zzfyu) zzfytVar5.zzbu();
                                ((w4.c) obj2).d(null);
                                i.b(zzfyuVar2);
                                zzgabVar.zza = zzfyuVar2;
                                zzgabVar.zze = 3;
                                if (zzv(zzgabVar) != obj4) {
                                    zzfyuVar = zzfyuVar2;
                                    if (this.zzi.zza(zzfyuVar)) {
                                    }
                                    return hVar;
                                }
                                return obj4;
                            } finally {
                            }
                        }
                        Object obj6 = (w4.a) zzgabVar.zza;
                        b3.g.x(obj3);
                        obj = obj6;
                    }
                    if (this.zze) {
                        return hVar;
                    }
                    this.zze = false;
                    ((w4.c) obj).d(null);
                    w4.a aVar2 = this.zzb;
                    currentTimeMillis = System.currentTimeMillis();
                    zzgabVar.zza = aVar2;
                    zzgabVar.zzb = currentTimeMillis;
                    zzgabVar.zze = 2;
                    w4.c cVar3 = (w4.c) aVar2;
                    Object c6 = cVar3.c(zzgabVar);
                    obj2 = cVar3;
                }
            }
            if (this.zze) {
            }
        } finally {
        }
        zzgabVar = new zzgab(this, cVar);
        Object obj32 = zzgabVar.zzc;
        Object obj42 = x3.a.f3712g;
        i5 = zzgabVar.zze;
        h hVar2 = h.f3400a;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x004f, B:14:0x0053, B:18:0x0060, B:19:0x0065), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x004f, B:14:0x0053, B:18:0x0060, B:19:0x0065), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(w3.c cVar) {
        zzfzv zzfzvVar;
        int i5;
        w4.a aVar;
        long j2;
        zzfyt zzfytVar;
        try {
            if (cVar instanceof zzfzv) {
                zzfzvVar = (zzfzv) cVar;
                int i6 = zzfzvVar.zze;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    zzfzvVar.zze = i6 - Integer.MIN_VALUE;
                    Object obj = zzfzvVar.zzc;
                    x3.a aVar2 = x3.a.f3712g;
                    i5 = zzfzvVar.zze;
                    if (i5 != 0) {
                        b3.g.x(obj);
                        w4.a aVar3 = this.zzb;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzfzvVar.zzb = aVar3;
                        zzfzvVar.zza = currentTimeMillis;
                        zzfzvVar.zze = 1;
                        w4.c cVar2 = (w4.c) aVar3;
                        if (cVar2.c(zzfzvVar) == aVar2) {
                            return aVar2;
                        }
                        aVar = cVar2;
                        j2 = currentTimeMillis;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j2 = zzfzvVar.zza;
                        aVar = (w4.a) zzfzvVar.zzb;
                        b3.g.x(obj);
                    }
                    zzfytVar = this.zzf;
                    if (zzfytVar != null) {
                        i.g("adQualityDataBuilder");
                        throw null;
                    }
                    zzfytVar.zzs(j2);
                    ((w4.c) aVar).d(null);
                    return h.f3400a;
                }
            }
            zzfytVar = this.zzf;
            if (zzfytVar != null) {
            }
        } catch (Throwable th) {
            ((w4.c) aVar).d(null);
            throw th;
        }
        zzfzvVar = new zzfzv(this, cVar);
        Object obj2 = zzfzvVar.zzc;
        x3.a aVar22 = x3.a.f3712g;
        i5 = zzfzvVar.zze;
        if (i5 != 0) {
        }
    }
}
