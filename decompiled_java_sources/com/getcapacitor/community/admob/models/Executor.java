package com.getcapacitor.community.admob.models;

import androidx.emoji2.text.u;
import com.getcapacitor.JSObject;
import e0.d;
import x2.a;

/* loaded from: classes.dex */
public abstract class Executor {
    protected final d activitySupplier;
    protected final d contextSupplier;
    protected final String logTag;
    protected a notifyListenersFunction;

    public Executor(d dVar, d dVar2, a aVar, String str, String str2) {
        this.contextSupplier = dVar;
        this.activitySupplier = dVar2;
        this.notifyListenersFunction = aVar;
        this.logTag = u.k(str, "|", str2);
    }

    public void notifyListeners(String str, JSObject jSObject) {
        this.notifyListenersFunction.a(str, jSObject);
    }
}
