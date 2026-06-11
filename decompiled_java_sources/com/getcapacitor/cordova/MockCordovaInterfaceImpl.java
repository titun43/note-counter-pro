package com.getcapacitor.cordova;

import android.util.Pair;
import g.k;
import java.util.concurrent.Executors;
import org.apache.cordova.CordovaInterfaceImpl;
import org.apache.cordova.p;

/* loaded from: classes.dex */
public class MockCordovaInterfaceImpl extends CordovaInterfaceImpl {
    public MockCordovaInterfaceImpl(k kVar) {
        super(kVar, Executors.newCachedThreadPool());
    }

    public p getActivityResultCallback() {
        return this.activityResultCallback;
    }

    public boolean handlePermissionResult(int i5, String[] strArr, int[] iArr) {
        Pair a5 = this.permissionResultCallbacks.a(i5);
        if (a5 == null) {
            return false;
        }
        ((p) a5.first).onRequestPermissionResult(((Integer) a5.second).intValue(), strArr, iArr);
        return true;
    }
}
