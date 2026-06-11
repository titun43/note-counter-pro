package org.apache.cordova;

import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f2911a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f2912b;

    public final synchronized Pair a(int i5) {
        Pair pair;
        pair = (Pair) this.f2912b.get(i5);
        this.f2912b.remove(i5);
        return pair;
    }
}
