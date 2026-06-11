package y1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzv;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class w extends b {
    public volatile int A;
    public volatile zzav B;
    public volatile v C;
    public volatile zzew D;

    /* renamed from: z, reason: collision with root package name */
    public final Context f3875z;

    public w(y0.c cVar, Context context) {
        super(cVar, context);
        this.A = 0;
        this.f3875z = context;
    }

    public final void A(int i5, int i6, e eVar) {
        zzjz b2 = z.b(i5, i6, eVar);
        Objects.requireNonNull(b2, "ApiFailure should not be null");
        this.f3794g.H(b2);
    }

    public final void B(int i5, Consumer consumer, Runnable runnable) {
        zzew zzewVar;
        zzev zzevVar;
        zzeu z4 = z(i5);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.D == null) {
                    this.D = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
                }
                zzewVar = this.D;
            } finally {
            }
        }
        zzeu zzb = zzel.zzb(z4, 28500L, timeUnit, zzewVar);
        t tVar = new t(this, i5, consumer, runnable);
        synchronized (this) {
            try {
                if (this.f3809x == null) {
                    this.f3809x = zzfb.zza(j());
                }
                zzevVar = this.f3809x;
            } finally {
            }
        }
        zzel.zzc(zzb, tVar, zzevVar);
    }

    @Override // y1.b, y1.a
    public final void a(final a2.c cVar, final androidx.emoji2.text.r rVar) {
        B(4, new Consumer() { // from class: y1.r
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str = rVar.h;
                a2.c.this.b((e) obj, str);
            }
        }, new c0.n(this, rVar, cVar, 9, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y1.b, y1.a
    public final e b(g.k kVar, d1.a aVar) {
        int i5 = 0;
        try {
            i5 = ((Integer) z(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e4) {
            A(114, 28, b0.f3826q);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e4);
        } catch (Exception e5) {
            if (e5 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            A(107, 28, b0.f3826q);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e5);
        }
        if (i5 > 0) {
            e a5 = b0.a(i5, "Billing override value was set by a license tester.");
            A(105, 2, a5);
            v(a5);
            return a5;
        }
        try {
            return super.b(kVar, aVar);
        } catch (Exception e6) {
            e eVar = b0.f3817g;
            A(115, 2, eVar);
            zze.zzm("BillingClientTesting", "An internal error occurred.", e6);
            return eVar;
        }
    }

    @Override // y1.b, y1.a
    public final void c(u1.f fVar, final com.getcapacitor.plugin.c cVar) {
        B(7, new Consumer() { // from class: y1.q
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ArrayList arrayList = new ArrayList();
                com.getcapacitor.plugin.c.this.f((e) obj, arrayList);
            }
        }, new c0.n(this, fVar, cVar, 8, false));
    }

    @Override // y1.b
    public final void e(c cVar) {
        synchronized (this) {
            if (y()) {
                zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                zzkd d5 = z.d(26);
                Objects.requireNonNull(d5, "ApiSuccess should not be null");
                this.f3794g.I(d5);
            } else {
                int i5 = 1;
                if (this.A == 1) {
                    zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.A == 3) {
                    zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    A(38, 26, b0.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.A = 1;
                    zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.C = new v(this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.f3875z.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i5 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f3875z.bindService(intent2, this.C, 1)) {
                                    zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i5 = 39;
                        }
                    }
                    this.A = 0;
                    zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
                    A(i5, 26, b0.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.e(cVar);
    }

    public final /* synthetic */ void w(a2.c cVar, androidx.emoji2.text.r rVar) {
        super.a(cVar, rVar);
    }

    public final /* synthetic */ void x(u1.f fVar, com.getcapacitor.plugin.c cVar) {
        super.c(fVar, cVar);
    }

    public final synchronized boolean y() {
        if (this.A == 2 && this.B != null) {
            if (this.C != null) {
                return true;
            }
        }
        return false;
    }

    public final zzeu z(int i5) {
        if (y()) {
            return zzv.zza(new s(this, i5));
        }
        zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
        A(106, 28, b0.a(-1, "Billing Override Service connection is disconnected."));
        return zzel.zza(0);
    }

    public w(y0.c cVar, Context context, i iVar) {
        super(cVar, context, iVar);
        this.A = 0;
        this.f3875z = context;
    }
}
