package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile z2.a zzB;
    p0 zza;
    final Handler zzb;
    protected d zzc;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private final Context zzl;
    private final Looper zzm;
    private final m zzn;
    private final t2.f zzo;
    private p zzr;
    private IInterface zzs;
    private g0 zzu;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final t2.d[] zze = new t2.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    private volatile String zzk = null;
    private final Object zzp = new Object();
    private final Object zzq = new Object();
    private final ArrayList zzt = new ArrayList();
    private int zzv = 1;
    private t2.b zzC = null;
    private boolean zzD = false;
    private volatile j0 zzE = null;
    protected AtomicInteger zzd = new AtomicInteger(0);

    public f(Context context, Looper looper, o0 o0Var, t2.f fVar, int i5, b bVar, c cVar, String str) {
        b0.h(context, "Context must not be null");
        this.zzl = context;
        b0.h(looper, "Looper must not be null");
        this.zzm = looper;
        b0.h(o0Var, "Supervisor must not be null");
        this.zzn = o0Var;
        b0.h(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new e0(this, looper);
        this.zzy = i5;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public final void a(int i5, IInterface iInterface) {
        p0 p0Var;
        b0.b((i5 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i5;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i5 == 1) {
                    g0 g0Var = this.zzu;
                    if (g0Var != null) {
                        m mVar = this.zzn;
                        String str = this.zza.f1103a;
                        b0.g(str);
                        String str2 = this.zza.f1104b;
                        zza();
                        mVar.c(str, str2, g0Var, this.zza.f1105c);
                        this.zzu = null;
                    }
                } else if (i5 == 2 || i5 == 3) {
                    g0 g0Var2 = this.zzu;
                    if (g0Var2 != null && (p0Var = this.zza) != null) {
                        String str3 = p0Var.f1103a;
                        String str4 = p0Var.f1104b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        m mVar2 = this.zzn;
                        String str5 = this.zza.f1103a;
                        b0.g(str5);
                        String str6 = this.zza.f1104b;
                        zza();
                        mVar2.c(str5, str6, g0Var2, this.zza.f1105c);
                        this.zzd.incrementAndGet();
                    }
                    g0 g0Var3 = new g0(this, this.zzd.get());
                    this.zzu = g0Var3;
                    p0 p0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new p0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new p0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = p0Var2;
                    if (p0Var2.f1105c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f1103a)));
                    }
                    m mVar3 = this.zzn;
                    String str7 = this.zza.f1103a;
                    b0.g(str7);
                    t2.b b2 = mVar3.b(new l0(str7, this.zza.f1104b, this.zza.f1105c), g0Var3, zza(), getBindServiceExecutor());
                    if (!(b2.h == 0)) {
                        p0 p0Var3 = this.zza;
                        String str8 = p0Var3.f1103a;
                        String str9 = p0Var3.f1104b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        Log.w("GmsClient", sb2.toString());
                        int i6 = b2.h;
                        if (i6 == -1) {
                            i6 = 16;
                        }
                        if (b2.f3363i != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, b2.f3363i);
                        }
                        zzb(i6, bundle, this.zzd.get());
                    }
                } else if (i5 == 4) {
                    b0.g(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c5 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c5 == 0) {
            connect(new r(this));
        } else {
            a(1, null);
            triggerNotAvailable(new r(this), c5, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(d dVar) {
        b0.h(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        a(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    z zVar = (z) arrayList.get(i5);
                    synchronized (zVar) {
                        zVar.f1134a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i5;
        IInterface iInterface;
        p pVar;
        long j2;
        synchronized (this.zzp) {
            i5 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            pVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i5 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i5 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i5 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i5 == 4) {
            printWriter.print("CONNECTED");
        } else if (i5 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((a0) pVar).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j5 = this.zzh;
            String format = simpleDateFormat.format(new Date(j5));
            j2 = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j5).length() + 1 + String.valueOf(format).length());
            sb.append(j5);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        } else {
            j2 = 0;
        }
        if (this.zzg > j2) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i6 = this.zzf;
            if (i6 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i6 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i6 != 3) {
                printWriter.append((CharSequence) String.valueOf(i6));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j6 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j6));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 1 + String.valueOf(format2).length());
            sb2.append(j6);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.zzj > j2) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) a.a.m(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j7 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j7));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j7).length() + 1 + String.valueOf(format3).length());
            sb3.append(j7);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public t2.d[] getApiFeatures() {
        return zze;
    }

    public z2.a getAttributionSourceWrapper() {
        return null;
    }

    public final t2.d[] getAvailableFeatures() {
        j0 j0Var = this.zzE;
        if (j0Var == null) {
            return null;
        }
        return j0Var.h;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        p0 p0Var;
        if (!isConnected() || (p0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return p0Var.f1104b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return t2.f.f3373a;
    }

    public void getRemoteService(n nVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i5 = this.zzy;
        int i6 = t2.f.f3373a;
        Scope[] scopeArr = k.f1068u;
        Bundle bundle = new Bundle();
        t2.d[] dVarArr = k.f1069v;
        k kVar = new k(6, i5, i6, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        kVar.f1072j = this.zzl.getPackageName();
        kVar.f1075m = getServiceRequestExtraArgs;
        if (set != null) {
            kVar.f1074l = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            kVar.f1076n = account;
            if (nVar != null) {
                kVar.f1073k = nVar.asBinder();
            }
        } else if (requiresAccount()) {
            kVar.f1076n = getAccount();
        }
        kVar.f1077o = zze;
        kVar.f1078p = getApiFeatures();
        if (usesClientTelemetry()) {
            kVar.f1081s = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    p pVar = this.zzr;
                    if (pVar != null) {
                        ((a0) pVar).a(new f0(this, this.zzd.get()), kVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            triggerConnectionSuspended(3);
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                b0.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                p pVar = this.zzr;
                if (pVar == null) {
                    return null;
                }
                return ((a0) pVar).asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public j getTelemetryConfiguration() {
        j0 j0Var = this.zzE;
        if (j0Var == null) {
            return null;
        }
        return j0Var.f1067j;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z4;
        synchronized (this.zzp) {
            z4 = this.zzv == 4;
        }
        return z4;
    }

    public boolean isConnecting() {
        boolean z4;
        synchronized (this.zzp) {
            int i5 = this.zzv;
            z4 = true;
            if (i5 != 2 && i5 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(t2.b bVar) {
        this.zzi = bVar.h;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i5) {
        this.zzf = i5;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i5, IBinder iBinder, Bundle bundle, int i6) {
        h0 h0Var = new h0(this, i5, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i6, -1, h0Var));
    }

    public void onUserSignOut(e eVar) {
        k1.j jVar = (k1.j) eVar;
        ((com.google.android.gms.common.api.internal.a0) jVar.h).f951s.f981s.post(new androidx.fragment.app.o(jVar, 6));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i5) {
        int i6 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i6, i5));
    }

    public void triggerNotAvailable(d dVar, int i5, PendingIntent pendingIntent) {
        b0.h(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        int i6 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i6, i5, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i5, Bundle bundle, int i6) {
        i0 i0Var = new i0(this, i5, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i6, -1, i0Var));
    }

    public final void zzc(j0 j0Var) {
        this.zzE = j0Var;
        if (usesClientTelemetry()) {
            j jVar = j0Var.f1067j;
            r b2 = r.b();
            s sVar = jVar == null ? null : jVar.f1060g;
            synchronized (b2) {
                if (sVar == null) {
                    b2.f1116a = r.f1115c;
                    return;
                }
                s sVar2 = (s) b2.f1116a;
                if (sVar2 == null || sVar2.f1117g < sVar.f1117g) {
                    b2.f1116a = sVar;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i5, IInterface iInterface) {
        a(i5, null);
    }

    public final /* synthetic */ boolean zze(int i5, int i6, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i5) {
                    return false;
                }
                a(i6, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i5) {
        int i6;
        int i7;
        synchronized (this.zzp) {
            i6 = this.zzv;
        }
        if (i6 == 3) {
            this.zzD = true;
            i7 = 5;
        } else {
            i7 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i7, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(p pVar) {
        this.zzr = pVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ b zzk() {
        return this.zzw;
    }

    public final /* synthetic */ c zzl() {
        return this.zzx;
    }

    public final /* synthetic */ t2.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(t2.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(z2.a aVar) {
    }
}
