package y1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzam;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlo;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;
import g.m0;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final c f3862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3863b;

    public /* synthetic */ p(b bVar, c cVar) {
        this.f3863b = bVar;
        this.f3862a = cVar;
    }

    public final void a(e eVar) {
        synchronized (this.f3863b.f3788a) {
            try {
                if (this.f3863b.f3789b == 3) {
                    return;
                }
                this.f3862a.onBillingSetupFinished(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z4;
        zze.zzl("BillingClient", "Billing service died.");
        try {
            b bVar = this.f3863b;
            synchronized (bVar.f3788a) {
                z4 = true;
                if (bVar.f3789b != 1) {
                    z4 = false;
                }
            }
            if (z4) {
                androidx.emoji2.text.p pVar = this.f3863b.f3794g;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(122);
                zzc.zza(zzc2);
                pVar.H((zzjz) zzc.zzf());
            } else {
                androidx.emoji2.text.p pVar2 = this.f3863b.f3794g;
                zzkl zzB = zzkl.zzB();
                pVar2.getClass();
                try {
                    zzli zzc3 = zzlk.zzc();
                    zzc3.zzo((zzku) pVar2.h);
                    zzc3.zzn(zzB);
                    ((m0) pVar2.f274i).a((zzlk) zzc3.zzf());
                } catch (Throwable th) {
                    zze.zzm("BillingLogger", "Unable to log.", th);
                }
            }
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f3863b.f3788a) {
            if (this.f3863b.f3789b != 3 && this.f3863b.f3789b != 0) {
                this.f3863b.m(0);
                this.f3863b.n();
                this.f3862a.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zze.zzk("BillingClient", "Billing service connected.");
        synchronized (this.f3863b.f3788a) {
            try {
                if (this.f3863b.f3789b == 3) {
                    return;
                }
                this.f3863b.h = zzam.zzu(iBinder);
                b bVar = this.f3863b;
                if (b.f(new Callable() { // from class: y1.o
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:160:0x01b8  */
                    /* JADX WARN: Removed duplicated region for block: B:162:0x01bd  */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        Bundle bundle;
                        String str;
                        int i5;
                        int i6;
                        String str2;
                        boolean z4;
                        int i7;
                        zzan zzanVar;
                        p pVar = p.this;
                        synchronized (pVar.f3863b.f3788a) {
                            try {
                                if (pVar.f3863b.f3789b == 3) {
                                    return null;
                                }
                                int i8 = pVar.f3863b.f3789b;
                                if (TextUtils.isEmpty(null)) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("accountName", null);
                                    b bVar2 = pVar.f3863b;
                                    zze.zzc(bundle, bVar2.f3790c, bVar2.f3810y.longValue());
                                }
                                try {
                                    synchronized (pVar.f3863b.f3788a) {
                                        try {
                                            try {
                                                zzanVar = pVar.f3863b.h;
                                            } catch (Throwable th) {
                                                th = th;
                                                while (true) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            boolean z5 = i8 != 1;
                                            zze.zzm("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                            if (e instanceof DeadObjectException) {
                                                i6 = 101;
                                            } else if (e instanceof RemoteException) {
                                                i6 = 100;
                                            } else {
                                                if (!(e instanceof SecurityException)) {
                                                    i5 = 42;
                                                    String a5 = i5 != 42 ? z.a(e) : str;
                                                    pVar.f3863b.m(0);
                                                    boolean z6 = z5;
                                                    str2 = a5;
                                                    z4 = z6;
                                                    i7 = 6;
                                                    if (i7 == 0) {
                                                    }
                                                    return str;
                                                }
                                                i6 = 102;
                                            }
                                            i5 = i6;
                                            if (i5 != 42) {
                                            }
                                            pVar.f3863b.m(0);
                                            boolean z62 = z5;
                                            str2 = a5;
                                            z4 = z62;
                                            i7 = 6;
                                            if (i7 == 0) {
                                            }
                                            return str;
                                        }
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str = null;
                                }
                                if (zzanVar == null) {
                                    pVar.f3863b.m(0);
                                    b bVar3 = pVar.f3863b;
                                    e eVar = b0.f3818i;
                                    bVar3.t(119, 6, eVar);
                                    pVar.a(eVar);
                                    return null;
                                }
                                String packageName = pVar.f3863b.f3793f.getPackageName();
                                int i9 = 23;
                                i7 = 3;
                                int i10 = 23;
                                while (true) {
                                    if (i10 < 3) {
                                        str = null;
                                        i10 = 0;
                                        break;
                                    }
                                    i7 = bundle == null ? zzanVar.zzy(i10, packageName, "subs") : zzanVar.zzc(i10, packageName, "subs", bundle);
                                    if (i7 == 0) {
                                        StringBuilder sb = new StringBuilder();
                                        str = null;
                                        sb.append("highestLevelSupportedForSubs: ");
                                        sb.append(i10);
                                        zze.zzk("BillingClient", sb.toString());
                                        break;
                                    }
                                    i10--;
                                }
                                pVar.f3863b.f3796j = i10 >= 3;
                                if (i10 < 3) {
                                    zze.zzk("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i5 = 9;
                                } else {
                                    i5 = 1;
                                }
                                while (true) {
                                    if (i9 < 3) {
                                        break;
                                    }
                                    i7 = bundle == null ? zzanVar.zzy(i9, packageName, "inapp") : zzanVar.zzc(i9, packageName, "inapp", bundle);
                                    if (i7 == 0) {
                                        pVar.f3863b.f3797k = i9;
                                        zze.zzk("BillingClient", "mHighestLevelSupportedForInApp: " + i9);
                                        break;
                                    }
                                    i9--;
                                }
                                b bVar4 = pVar.f3863b;
                                int i11 = bVar4.f3797k;
                                bVar4.f3806t = i11 >= 21;
                                bVar4.f3805s = i11 >= 20;
                                bVar4.f3804r = i11 >= 19;
                                bVar4.f3803q = i11 >= 17;
                                bVar4.f3802p = i11 >= 16;
                                bVar4.f3801o = i11 >= 15;
                                bVar4.f3800n = i11 >= 14;
                                bVar4.f3799m = i11 >= 9;
                                bVar4.f3798l = i11 >= 6;
                                if (i11 < 3) {
                                    zze.zzl("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i5 = 36;
                                }
                                if (i7 == 0) {
                                    synchronized (pVar.f3863b.f3788a) {
                                        try {
                                            if (pVar.f3863b.f3789b == 3) {
                                                return str;
                                            }
                                            z4 = i8 != 1;
                                            pVar.f3863b.m(2);
                                            com.google.android.gms.common.api.internal.c0 c0Var = pVar.f3863b.f3792e != null ? pVar.f3863b.f3792e : str;
                                            if (c0Var != 0) {
                                                c0Var.c(pVar.f3863b.f3806t);
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    z4 = i8 != 1;
                                    pVar.f3863b.m(0);
                                }
                                str2 = str;
                                if (i7 == 0) {
                                    try {
                                        if (true != z4) {
                                            try {
                                                pVar.f3863b.l(z.d(6));
                                            } catch (Throwable th3) {
                                                zze.zzm("BillingClient", "Unable to log.", th3);
                                            }
                                        } else {
                                            androidx.emoji2.text.p pVar2 = pVar.f3863b.f3794g;
                                            zzlo zzc = zzlq.zzc();
                                            zzke zzc2 = zzki.zzc();
                                            zzc2.zzn(0);
                                            zzc.zza(zzc2);
                                            pVar2.J((zzlq) zzc.zzf());
                                        }
                                    } catch (Throwable th4) {
                                        zze.zzm("BillingClient", "Unable to log.", th4);
                                    }
                                    pVar.a(b0.h);
                                } else {
                                    e eVar2 = b0.f3811a;
                                    try {
                                        if (true != z4) {
                                            pVar.f3863b.u(i5, 6, eVar2, str2);
                                        } else {
                                            zzke zzc3 = zzki.zzc();
                                            zzc3.zzn(eVar2.f3832a);
                                            zzc3.zzm(eVar2.f3833b);
                                            zzc3.zzo(i5);
                                            if (str2 != null) {
                                                zzc3.zza(str2);
                                            }
                                            androidx.emoji2.text.p pVar3 = pVar.f3863b.f3794g;
                                            zzlo zzc4 = zzlq.zzc();
                                            zzc4.zzm((zzki) zzc3.zzf());
                                            pVar3.J((zzlq) zzc4.zzf());
                                        }
                                    } catch (Throwable th5) {
                                        zze.zzm("BillingClient", "Unable to log.", th5);
                                    }
                                    pVar.a(b0.f3811a);
                                }
                                return str;
                            } finally {
                            }
                        }
                    }
                }, 30000L, new androidx.fragment.app.o(this, 18), bVar.r(), bVar.j()) == null) {
                    b bVar2 = this.f3863b;
                    e g5 = bVar2.g();
                    bVar2.t(25, 6, g5);
                    a(g5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z4;
        zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            b bVar = this.f3863b;
            synchronized (bVar.f3788a) {
                z4 = true;
                if (bVar.f3789b != 1) {
                    z4 = false;
                }
            }
            if (z4) {
                androidx.emoji2.text.p pVar = this.f3863b.f3794g;
                zzjx zzc = zzjz.zzc();
                zzc.zzn(6);
                zzke zzc2 = zzki.zzc();
                zzc2.zzo(121);
                zzc.zza(zzc2);
                pVar.H((zzjz) zzc.zzf());
            } else {
                androidx.emoji2.text.p pVar2 = this.f3863b.f3794g;
                zzlu zzB = zzlu.zzB();
                pVar2.getClass();
                if (zzB != null) {
                    try {
                        zzli zzc3 = zzlk.zzc();
                        zzc3.zzo((zzku) pVar2.h);
                        zzc3.zzq(zzB);
                        ((m0) pVar2.f274i).a((zzlk) zzc3.zzf());
                    } catch (Throwable th) {
                        zze.zzm("BillingLogger", "Unable to log.", th);
                    }
                }
            }
        } catch (Throwable th2) {
            zze.zzm("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f3863b.f3788a) {
            try {
                if (this.f3863b.f3789b == 3) {
                    return;
                }
                this.f3863b.m(0);
                this.f3862a.onBillingServiceDisconnected();
            } finally {
            }
        }
    }
}
