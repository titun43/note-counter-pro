package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes.dex */
public final class g0 implements h3.d {

    /* renamed from: g, reason: collision with root package name */
    public final g f983g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final a f984i;

    /* renamed from: j, reason: collision with root package name */
    public final long f985j;

    /* renamed from: k, reason: collision with root package name */
    public final long f986k;

    public g0(g gVar, int i5, a aVar, long j2, long j5) {
        this.f983g = gVar;
        this.h = i5;
        this.f984i = aVar;
        this.f985j = j2;
        this.f986k = j5;
    }

    public static com.google.android.gms.common.internal.j a(a0 a0Var, com.google.android.gms.common.internal.f fVar, int i5) {
        com.google.android.gms.common.internal.j telemetryConfiguration = fVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.h) {
            return null;
        }
        int[] iArr = telemetryConfiguration.f1062j;
        int i6 = 0;
        if (iArr != null) {
            while (i6 < iArr.length) {
                if (iArr[i6] != i5) {
                    i6++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f1064l;
        if (iArr2 != null) {
            while (i6 < iArr2.length) {
                if (iArr2[i6] == i5) {
                    return null;
                }
                i6++;
            }
        }
        if (a0Var.f950r < telemetryConfiguration.f1063k) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // h3.d
    public final void onComplete(h3.g gVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        long j5;
        if (this.f983g.a()) {
            com.google.android.gms.common.internal.s sVar = (com.google.android.gms.common.internal.s) com.google.android.gms.common.internal.r.b().f1116a;
            if (sVar == null || sVar.h) {
                a0 a0Var = (a0) this.f983g.f978p.get(this.f984i);
                if (a0Var != null) {
                    Object obj = a0Var.h;
                    if (obj instanceof com.google.android.gms.common.internal.f) {
                        com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) obj;
                        int i9 = 0;
                        boolean z4 = this.f985j > 0;
                        int gCoreServiceId = fVar.getGCoreServiceId();
                        int i10 = 100;
                        if (sVar != null) {
                            z4 &= sVar.f1118i;
                            int i11 = sVar.f1119j;
                            int i12 = sVar.f1120k;
                            i5 = sVar.f1117g;
                            if (fVar.hasConnectionInfo() && !fVar.isConnecting()) {
                                com.google.android.gms.common.internal.j a5 = a(a0Var, fVar, this.h);
                                if (a5 == null) {
                                    return;
                                }
                                boolean z5 = a5.f1061i && this.f985j > 0;
                                i12 = a5.f1063k;
                                z4 = z5;
                            }
                            i7 = i11;
                            i6 = i12;
                        } else {
                            i5 = 0;
                            i6 = 100;
                            i7 = 5000;
                        }
                        g gVar2 = this.f983g;
                        int i13 = -1;
                        if (gVar.c()) {
                            i8 = 0;
                        } else {
                            if (!((h3.n) gVar).f1730d) {
                                Exception a6 = gVar.a();
                                if (a6 instanceof com.google.android.gms.common.api.j) {
                                    Status status = ((com.google.android.gms.common.api.j) a6).f1032g;
                                    i10 = status.f929g;
                                    t2.b bVar = status.f931j;
                                    if (bVar != null) {
                                        i8 = bVar.h;
                                        i9 = i10;
                                    }
                                } else {
                                    i9 = 101;
                                    i8 = -1;
                                }
                            }
                            i9 = i10;
                            i8 = -1;
                        }
                        if (z4) {
                            long j6 = this.f985j;
                            long j7 = this.f986k;
                            long currentTimeMillis = System.currentTimeMillis();
                            i13 = (int) (SystemClock.elapsedRealtime() - j7);
                            j5 = currentTimeMillis;
                            j2 = j6;
                        } else {
                            j2 = 0;
                            j5 = 0;
                        }
                        h0 h0Var = new h0(new com.google.android.gms.common.internal.q(this.h, i9, i8, j2, j5, null, null, gCoreServiceId, i13), i5, i7, i6);
                        zau zauVar = gVar2.f981s;
                        zauVar.sendMessage(zauVar.obtainMessage(18, h0Var));
                    }
                }
            }
        }
    }
}
