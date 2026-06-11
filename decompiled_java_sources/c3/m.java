package c3;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.location.zzaz;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class m extends com.google.android.gms.common.api.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f823a;

    public /* synthetic */ m(int i5) {
        this.f823a = i5;
    }

    @Override // com.google.android.gms.common.api.a
    public /* synthetic */ com.google.android.gms.common.api.g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
        switch (this.f823a) {
            case 4:
                return new v2.c(context, looper, iVar, (com.google.android.gms.common.internal.u) obj, fVar, nVar);
            default:
                return super.buildClient(context, looper, iVar, obj, fVar, nVar);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.i iVar, Object obj, com.google.android.gms.common.api.n nVar, com.google.android.gms.common.api.o oVar) {
        f3.a aVar;
        switch (this.f823a) {
            case 0:
                HashSet hashSet = new HashSet();
                new HashSet();
                o.f fVar = new o.f(0);
                o.f fVar2 = new o.f(0);
                Object obj2 = t2.e.f3371c;
                m mVar = f3.b.f1491a;
                new ArrayList();
                new ArrayList();
                context.getMainLooper();
                String packageName = context.getPackageName();
                String name = context.getClass().getName();
                com.google.android.gms.common.api.i iVar2 = f3.b.f1492b;
                if (fVar2.containsKey(iVar2)) {
                    aVar = (f3.a) fVar2.get(iVar2);
                } else {
                    aVar = f3.a.f1490b;
                }
                return new zzaz(context, looper, nVar, oVar, "activity_recognition", new com.google.android.gms.common.internal.i(hashSet, fVar, packageName, name, aVar));
            case 1:
                return new zzaz(context, looper, nVar, oVar, "locationServices", iVar);
            case 2:
                iVar.getClass();
                Integer num = iVar.f1058f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new g3.a(context, looper, iVar, bundle, nVar, oVar);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.buildClient(context, looper, iVar, obj, nVar, oVar);
        }
    }
}
