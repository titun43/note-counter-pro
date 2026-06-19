package g3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;

/* loaded from: classes.dex */
public final class a extends l implements com.google.android.gms.common.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1678a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1679b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1680c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1681d;

    public a(Context context, Looper looper, i iVar, Bundle bundle, n nVar, o oVar) {
        super(context, looper, 44, iVar, nVar, oVar);
        this.f1678a = true;
        this.f1679b = iVar;
        this.f1680c = bundle;
        this.f1681d = iVar.f1058f;
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        i iVar = this.f1679b;
        boolean equals = getContext().getPackageName().equals(iVar.f1055c);
        Bundle bundle = this.f1680c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", iVar.f1055c);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f1678a;
    }
}
