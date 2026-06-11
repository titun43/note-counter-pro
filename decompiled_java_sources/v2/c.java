package v2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.base.zaf;
import t2.d;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: a, reason: collision with root package name */
    public final u f3580a;

    public c(Context context, Looper looper, i iVar, u uVar, f fVar, n nVar) {
        super(context, looper, 270, iVar, fVar, nVar);
        this.f3580a = uVar;
    }

    @Override // com.google.android.gms.common.internal.f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.f
    public final d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        this.f3580a.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
