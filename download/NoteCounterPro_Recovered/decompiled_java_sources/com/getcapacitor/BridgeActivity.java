package com.getcapacitor;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.getcapacitor.Bridge;
import com.getcapacitor.android.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class BridgeActivity extends g.k {
    protected int activityDepth;
    protected Bridge bridge;
    protected final Bridge.Builder bridgeBuilder;
    protected CapConfig config;
    protected List<Class<? extends Plugin>> initialPlugins;
    protected boolean keepRunning;

    public BridgeActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new c1.a(this));
        addOnContextAvailableListener(new g.j(this));
        this.keepRunning = true;
        this.activityDepth = 0;
        this.initialPlugins = new ArrayList();
        this.bridgeBuilder = new Bridge.Builder(this);
    }

    public Bridge getBridge() {
        return this.bridge;
    }

    public void load() {
        Logger.debug("Starting BridgeActivity");
        Bridge create = this.bridgeBuilder.addPlugins(this.initialPlugins).setConfig(this.config).create();
        this.bridge = create;
        this.keepRunning = create.shouldKeepRunning();
        onNewIntent(getIntent());
    }

    @Override // androidx.fragment.app.e0, androidx.activity.s, android.app.Activity
    public void onActivityResult(int i5, int i6, Intent intent) {
        Bridge bridge = this.bridge;
        if (bridge == null || bridge.onActivityResult(i5, i6, intent)) {
            return;
        }
        super.onActivityResult(i5, i6, intent);
    }

    @Override // g.k, androidx.activity.s, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Bridge bridge = this.bridge;
        if (bridge == null) {
            return;
        }
        bridge.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.e0, androidx.activity.s, u.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.bridgeBuilder.setInstanceState(bundle);
        getApplication().setTheme(R.style.AppTheme_NoActionBar);
        setTheme(R.style.AppTheme_NoActionBar);
        try {
            setContentView(R.layout.capacitor_bridge_layout_main);
            try {
                this.bridgeBuilder.addPlugins(new PluginManager(getAssets()).loadPluginClasses());
            } catch (PluginLoadException e4) {
                Logger.error("Error loading plugins.", e4);
            }
            load();
        } catch (Exception unused) {
            setContentView(R.layout.no_webview);
        }
    }

    @Override // g.k, androidx.fragment.app.e0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onDestroy();
            Logger.debug("App destroyed");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onDetachedFromWindow();
        }
    }

    @Override // androidx.activity.s, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onPause() {
        super.onPause();
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onPause();
            Logger.debug("App paused");
        }
    }

    @Override // androidx.fragment.app.e0, androidx.activity.s, android.app.Activity
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        Bridge bridge = this.bridge;
        if (bridge == null || bridge.onRequestPermissionsResult(i5, strArr, iArr)) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onRestart();
            Logger.debug("App restarted");
        }
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onResume() {
        super.onResume();
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.getApp().fireStatusChange(true);
            this.bridge.onResume();
            Logger.debug("App resumed");
        }
    }

    @Override // androidx.activity.s, u.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.saveInstanceState(bundle);
        }
    }

    @Override // g.k, androidx.fragment.app.e0, android.app.Activity
    public void onStart() {
        super.onStart();
        this.activityDepth++;
        Bridge bridge = this.bridge;
        if (bridge != null) {
            bridge.onStart();
            Logger.debug("App started");
        }
    }

    @Override // g.k, androidx.fragment.app.e0, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.bridge != null) {
            int max = Math.max(0, this.activityDepth - 1);
            this.activityDepth = max;
            if (max == 0) {
                this.bridge.getApp().fireStatusChange(false);
            }
            this.bridge.onStop();
            Logger.debug("App stopped");
        }
    }

    public void registerPlugin(Class<? extends Plugin> cls) {
        this.bridgeBuilder.addPlugin(cls);
    }

    public void registerPlugins(List<Class<? extends Plugin>> list) {
        this.bridgeBuilder.addPlugins(list);
    }
}
