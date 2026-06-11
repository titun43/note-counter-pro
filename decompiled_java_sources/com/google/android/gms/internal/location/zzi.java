package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import c3.e0;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.l;
import t2.d;

/* loaded from: classes.dex */
public class zzi extends l {
    protected final zzbg<zzam> zze;
    private final String zzf;

    public zzi(Context context, Looper looper, n nVar, o oVar, String str, i iVar) {
        super(context, looper, 23, iVar, nVar, oVar);
        this.zze = new zzh(this);
        this.zzf = str;
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzam ? (zzam) queryLocalInterface : new zzal(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final d[] getApiFeatures() {
        return e0.f811b;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
