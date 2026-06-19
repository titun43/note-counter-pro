package org.apache.cordova;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CordovaInterfaceImpl implements n {
    private static final String TAG = "CordovaInterfaceImpl";
    protected g.k activity;
    protected p activityResultCallback;
    protected int activityResultRequestCode;
    protected boolean activityWasDestroyed;
    protected String initCallbackService;
    protected f permissionResultCallbacks;
    protected k0 pluginManager;
    protected Bundle savedPluginState;
    protected o savedResult;
    protected ExecutorService threadPool;

    public CordovaInterfaceImpl(g.k kVar) {
        this(kVar, Executors.newCachedThreadPool());
    }

    @Override // org.apache.cordova.n
    public g.k getActivity() {
        return this.activity;
    }

    public Context getContext() {
        return this.activity;
    }

    @Override // org.apache.cordova.n
    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    public boolean hasPermission(String str) {
        return this.activity.checkSelfPermission(str) == 0;
    }

    public boolean onActivityResult(int i5, int i6, Intent intent) {
        String str;
        p pVar = this.activityResultCallback;
        if (pVar == null && (str = this.initCallbackService) != null) {
            o oVar = new o();
            oVar.f2950a = i5;
            oVar.f2951b = i6;
            oVar.f2952c = intent;
            this.savedResult = oVar;
            k0 k0Var = this.pluginManager;
            if (k0Var != null && (pVar = k0Var.c(str)) != null) {
                pVar.onRestoreStateForActivityResult(this.savedPluginState.getBundle(pVar.getServiceName()), new ResumeCallback(pVar.getServiceName(), this.pluginManager));
            }
        }
        this.activityResultCallback = null;
        if (pVar == null) {
            return false;
        }
        this.initCallbackService = null;
        this.savedResult = null;
        pVar.onActivityResult(i5, i6, intent);
        return true;
    }

    public void onCordovaInit(k0 k0Var) {
        CoreAndroid coreAndroid;
        this.pluginManager = k0Var;
        o oVar = this.savedResult;
        if (oVar != null) {
            onActivityResult(oVar.f2950a, oVar.f2951b, oVar.f2952c);
            return;
        }
        if (this.activityWasDestroyed) {
            this.activityWasDestroyed = false;
            if (k0Var == null || (coreAndroid = (CoreAndroid) k0Var.c(CoreAndroid.PLUGIN_NAME)) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", "resume");
            } catch (JSONException e4) {
                Log.e(TAG, "Failed to create event message", e4);
            }
            coreAndroid.sendResumeEvent(new l0(2, jSONObject));
        }
    }

    @Override // org.apache.cordova.n
    public Object onMessage(String str, Object obj) {
        if (!"exit".equals(str)) {
            return null;
        }
        this.activity.finish();
        return null;
    }

    public void onRequestPermissionResult(int i5, String[] strArr, int[] iArr) {
        Pair a5 = this.permissionResultCallbacks.a(i5);
        if (a5 != null) {
            ((p) a5.first).onRequestPermissionResult(((Integer) a5.second).intValue(), strArr, iArr);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle onSaveInstanceState;
        p pVar = this.activityResultCallback;
        if (pVar != null) {
            bundle.putString("callbackService", pVar.getServiceName());
        }
        k0 k0Var = this.pluginManager;
        if (k0Var != null) {
            k0Var.getClass();
            Bundle bundle2 = new Bundle();
            synchronized (k0Var.f2936a) {
                try {
                    for (p pVar2 : k0Var.f2936a.values()) {
                        if (pVar2 != null && (onSaveInstanceState = pVar2.onSaveInstanceState()) != null) {
                            bundle2.putBundle(pVar2.getServiceName(), onSaveInstanceState);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            bundle.putBundle("plugin", bundle2);
        }
    }

    public void requestPermission(p pVar, int i5, String str) {
        requestPermissions(pVar, i5, new String[]{str});
    }

    public void requestPermissions(p pVar, int i5, String[] strArr) {
        int i6;
        f fVar = this.permissionResultCallbacks;
        synchronized (fVar) {
            i6 = fVar.f2911a;
            fVar.f2911a = i6 + 1;
            fVar.f2912b.put(i6, new Pair(pVar, Integer.valueOf(i5)));
        }
        getActivity().requestPermissions(strArr, i6);
    }

    public void restoreInstanceState(Bundle bundle) {
        this.initCallbackService = bundle.getString("callbackService");
        this.savedPluginState = bundle.getBundle("plugin");
        this.activityWasDestroyed = true;
    }

    public void setActivityResultCallback(p pVar) {
        p pVar2 = this.activityResultCallback;
        if (pVar2 != null) {
            pVar2.onActivityResult(this.activityResultRequestCode, 0, null);
        }
        this.activityResultCallback = pVar;
    }

    public void setActivityResultRequestCode(int i5) {
        this.activityResultRequestCode = i5;
    }

    @Override // org.apache.cordova.n
    public void startActivityForResult(p pVar, Intent intent, int i5) {
        setActivityResultCallback(pVar);
        try {
            this.activity.startActivityForResult(intent, i5);
        } catch (RuntimeException e4) {
            this.activityResultCallback = null;
            throw e4;
        }
    }

    public CordovaInterfaceImpl(g.k kVar, ExecutorService executorService) {
        this.activityWasDestroyed = false;
        this.activity = kVar;
        this.threadPool = executorService;
        f fVar = new f();
        fVar.f2911a = 0;
        fVar.f2912b = new SparseArray();
        this.permissionResultCallbacks = fVar;
    }
}
