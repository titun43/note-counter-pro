package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class c extends BasePendingResult implements d {
    private final com.google.android.gms.common.api.i api;
    private final com.google.android.gms.common.api.c clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.p pVar) {
        super(pVar);
        com.google.android.gms.common.internal.b0.h(pVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.b0.h(iVar, "Api must not be null");
        this.clientKey = iVar.f934b;
        this.api = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.api;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.t tVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e4) {
            setFailedResult(new Status(8, e4.getLocalizedMessage(), null, null));
            throw e4;
        } catch (RemoteException e5) {
            setFailedResult(new Status(8, e5.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.b0.a("Failed result must not be success", !(status.f929g <= 0));
        com.google.android.gms.common.api.t createFailedResult = createFailedResult(status);
        setResult((c) createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
