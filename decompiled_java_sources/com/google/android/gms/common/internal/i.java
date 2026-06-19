package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f1053a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f1054b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1055c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1056d;

    /* renamed from: e, reason: collision with root package name */
    public final f3.a f1057e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f1058f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public i(Set set, o.f fVar, String str, String str2, f3.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f1053a = unmodifiableSet;
        o.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f1055c = str;
        this.f1056d = str2;
        this.f1057e = aVar == null ? f3.a.f1490b : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.f1054b = Collections.unmodifiableSet(hashSet);
    }
}
