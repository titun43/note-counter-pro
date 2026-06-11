package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.base.zac;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class j0 extends g3.c implements com.google.android.gms.common.api.n, com.google.android.gms.common.api.o {

    /* renamed from: n, reason: collision with root package name */
    public static final c3.m f996n = f3.b.f1491a;

    /* renamed from: g, reason: collision with root package name */
    public final Context f997g;
    public final Handler h;

    /* renamed from: i, reason: collision with root package name */
    public final c3.m f998i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f999j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.common.internal.i f1000k;

    /* renamed from: l, reason: collision with root package name */
    public g3.a f1001l;

    /* renamed from: m, reason: collision with root package name */
    public c0 f1002m;

    public j0(Context context, Handler handler, com.google.android.gms.common.internal.i iVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f997g = context;
        this.h = handler;
        this.f1000k = iVar;
        this.f999j = iVar.f1053a;
        this.f998i = f996n;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void a() {
        GoogleSignInAccount googleSignInAccount;
        g3.a aVar = this.f1001l;
        aVar.getClass();
        try {
            aVar.f1679b.getClass();
            Account account = new Account(com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT, "com.google");
            if (com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT.equals(account.name)) {
                Context context = aVar.getContext();
                ReentrantLock reentrantLock = s2.a.f3298c;
                com.google.android.gms.common.internal.b0.g(context);
                ReentrantLock reentrantLock2 = s2.a.f3298c;
                reentrantLock2.lock();
                try {
                    if (s2.a.f3299d == null) {
                        s2.a.f3299d = new s2.a(context.getApplicationContext());
                    }
                    s2.a aVar2 = s2.a.f3299d;
                    reentrantLock2.unlock();
                    String a5 = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a5)) {
                        String a6 = aVar2.a("googleSignInAccount:" + a5);
                        if (a6 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a6);
                            } catch (JSONException unused) {
                            }
                            Integer num = aVar.f1681d;
                            com.google.android.gms.common.internal.b0.g(num);
                            com.google.android.gms.common.internal.x xVar = new com.google.android.gms.common.internal.x(2, account, num.intValue(), googleSignInAccount);
                            g3.d dVar = (g3.d) aVar.getService();
                            g3.f fVar = new g3.f(1, xVar);
                            Parcel zaa = dVar.zaa();
                            zac.zac(zaa, fVar);
                            zac.zad(zaa, this);
                            dVar.zac(12, zaa);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = aVar.f1681d;
            com.google.android.gms.common.internal.b0.g(num2);
            com.google.android.gms.common.internal.x xVar2 = new com.google.android.gms.common.internal.x(2, account, num2.intValue(), googleSignInAccount);
            g3.d dVar2 = (g3.d) aVar.getService();
            g3.f fVar2 = new g3.f(1, xVar2);
            Parcel zaa2 = dVar2.zaa();
            zac.zac(zaa2, fVar2);
            zac.zad(zaa2, this);
            dVar2.zac(12, zaa2);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.h.post(new c0.a(this, new g3.g(1, new t2.b(8, null, null), null), 4, false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onConnectionFailed(t2.b bVar) {
        this.f1002m.b(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i5) {
        c0 c0Var = this.f1002m;
        a0 a0Var = (a0) ((g) c0Var.f963f).f978p.get((a) c0Var.f960c);
        if (a0Var != null) {
            if (a0Var.f947o) {
                a0Var.o(new t2.b(17, null, null));
            } else {
                a0Var.onConnectionSuspended(i5);
            }
        }
    }
}
