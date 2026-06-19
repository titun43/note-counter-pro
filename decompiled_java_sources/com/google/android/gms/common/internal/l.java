package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class l extends f implements com.google.android.gms.common.api.g {
    private static volatile Executor zaa;
    private final i zab;
    private final Set zac;
    private final Account zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Context context, Looper looper, int i5, i iVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.n nVar) {
        super(context, looper, r3, r4, i5, new r(fVar), new r(nVar), iVar.f1056d);
        o0 a5 = m.a(context);
        t2.e eVar = t2.e.f3372d;
        b0.g(fVar);
        b0.g(nVar);
        this.zab = iVar;
        this.zad = null;
        Set<Scope> set = iVar.f1054b;
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.zac = validateScopes;
    }

    @Override // com.google.android.gms.common.internal.f
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.f
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final i getClientSettings() {
        return this.zab;
    }

    public t2.d[] getRequiredFeatures() {
        return new t2.d[0];
    }

    @Override // com.google.android.gms.common.internal.f
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.g
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }
}
