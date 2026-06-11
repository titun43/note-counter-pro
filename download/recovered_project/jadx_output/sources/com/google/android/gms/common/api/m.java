package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.p0;
import com.google.android.gms.common.api.internal.q0;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class m {
    protected final com.google.android.gms.common.api.internal.g zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final com.google.android.gms.common.api.internal.a zaf;
    private final Looper zag;
    private final int zah;
    private final p zai;
    private final com.google.android.gms.common.api.internal.s zaj;

    public m(Context context, i iVar, e eVar, l lVar) {
        b0.h(context, "Null context is not permitted.");
        b0.h(iVar, "Api must not be null.");
        b0.h(lVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        b0.h(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : getApiFallbackAttributionTag(context);
        this.zac = attributionTag;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = lVar.f1035b;
        this.zaf = new com.google.android.gms.common.api.internal.a(iVar, eVar, attributionTag);
        this.zai = new d0(this);
        com.google.android.gms.common.api.internal.g f5 = com.google.android.gms.common.api.internal.g.f(applicationContext);
        this.zaa = f5;
        this.zah = f5.f976n.getAndIncrement();
        this.zaj = lVar.f1034a;
        zau zauVar = f5.f981s;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    public final void a(int i5, com.google.android.gms.common.api.internal.c cVar) {
        cVar.zak();
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        i0 i0Var = new i0(new o0(i5, cVar), gVar.f977o.get(), this);
        zau zauVar = gVar.f981s;
        zauVar.sendMessage(zauVar.obtainMessage(4, i0Var));
    }

    public p asGoogleApiClient() {
        return this.zai;
    }

    public final h3.n b(int i5, com.google.android.gms.common.api.internal.u uVar) {
        h3.h hVar = new h3.h();
        com.google.android.gms.common.api.internal.s sVar = this.zaj;
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        gVar.e(hVar, uVar.f1026c, this);
        i0 i0Var = new i0(new p0(i5, uVar, hVar, sVar), gVar.f977o.get(), this);
        zau zauVar = gVar.f981s;
        zauVar.sendMessage(zauVar.obtainMessage(4, i0Var));
        return hVar.f1713a;
    }

    public com.google.android.gms.common.internal.h createClientSettingsBuilder() {
        com.google.android.gms.common.internal.h hVar = new com.google.android.gms.common.internal.h();
        Set set = Collections.EMPTY_SET;
        if (hVar.f1049a == null) {
            hVar.f1049a = new o.g(0);
        }
        hVar.f1049a.addAll(set);
        hVar.f1051c = this.zab.getClass().getName();
        hVar.f1050b = this.zab.getPackageName();
        return hVar;
    }

    public h3.g disconnectService() {
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        y yVar = new y(getApiKey());
        zau zauVar = gVar.f981s;
        zauVar.sendMessage(zauVar.obtainMessage(14, yVar));
        return yVar.f1030b.f1713a;
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.c> T doBestEffortWrite(T t5) {
        a(2, t5);
        return t5;
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.c> T doRead(T t5) {
        a(0, t5);
        return t5;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends com.google.android.gms.common.api.internal.o, U extends com.google.android.gms.common.api.internal.v> h3.g doRegisterEventListener(T t5, U u4) {
        b0.g(t5);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public h3.g doUnregisterEventListener(com.google.android.gms.common.api.internal.j jVar) {
        return doUnregisterEventListener(jVar, 0);
    }

    public <A extends b, T extends com.google.android.gms.common.api.internal.c> T doWrite(T t5) {
        a(1, t5);
        return t5;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final com.google.android.gms.common.api.internal.a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> com.google.android.gms.common.api.internal.l registerListener(L l5, String str) {
        return b3.g.m(this.zag, l5, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g zab(Looper looper, a0 a0Var) {
        com.google.android.gms.common.internal.h createClientSettingsBuilder = createClientSettingsBuilder();
        com.google.android.gms.common.internal.i iVar = new com.google.android.gms.common.internal.i(createClientSettingsBuilder.f1049a, null, createClientSettingsBuilder.f1050b, createClientSettingsBuilder.f1051c, f3.a.f1490b);
        a aVar = this.zad.f933a;
        b0.g(aVar);
        g buildClient = aVar.buildClient(this.zab, looper, iVar, (Object) this.zae, (n) a0Var, (o) a0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.f)) {
            ((com.google.android.gms.common.internal.f) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof com.google.android.gms.common.api.internal.m)) {
            return buildClient;
        }
        androidx.emoji2.text.u.p(buildClient);
        throw null;
    }

    public final j0 zac(Context context, Handler handler) {
        com.google.android.gms.common.internal.h createClientSettingsBuilder = createClientSettingsBuilder();
        return new j0(context, handler, new com.google.android.gms.common.internal.i(createClientSettingsBuilder.f1049a, null, createClientSettingsBuilder.f1050b, createClientSettingsBuilder.f1051c, f3.a.f1490b));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> h3.g doBestEffortWrite(com.google.android.gms.common.api.internal.u uVar) {
        return b(2, uVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> h3.g doRead(com.google.android.gms.common.api.internal.u uVar) {
        return b(0, uVar);
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> h3.g doRegisterEventListener(com.google.android.gms.common.api.internal.p pVar) {
        b0.g(pVar);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public h3.g doUnregisterEventListener(com.google.android.gms.common.api.internal.j jVar, int i5) {
        b0.h(jVar, "Listener key cannot be null.");
        com.google.android.gms.common.api.internal.g gVar = this.zaa;
        gVar.getClass();
        h3.h hVar = new h3.h();
        gVar.e(hVar, i5, this);
        i0 i0Var = new i0(new q0(jVar, hVar), gVar.f977o.get(), this);
        zau zauVar = gVar.f981s;
        zauVar.sendMessage(zauVar.obtainMessage(13, i0Var));
        return hVar.f1713a;
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> h3.g doWrite(com.google.android.gms.common.api.internal.u uVar) {
        return b(1, uVar);
    }
}
