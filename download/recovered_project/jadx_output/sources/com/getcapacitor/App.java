package com.getcapacitor;

/* loaded from: classes.dex */
public class App {
    private AppRestoredListener appRestoredListener;
    private boolean isActive = false;
    private AppStatusChangeListener statusChangeListener;

    public interface AppRestoredListener {
        void onAppRestored(PluginResult pluginResult);
    }

    public interface AppStatusChangeListener {
        void onAppStatusChanged(Boolean bool);
    }

    public void fireRestoredResult(PluginResult pluginResult) {
        AppRestoredListener appRestoredListener = this.appRestoredListener;
        if (appRestoredListener != null) {
            appRestoredListener.onAppRestored(pluginResult);
        }
    }

    public void fireStatusChange(boolean z4) {
        this.isActive = z4;
        AppStatusChangeListener appStatusChangeListener = this.statusChangeListener;
        if (appStatusChangeListener != null) {
            appStatusChangeListener.onAppStatusChanged(Boolean.valueOf(z4));
        }
    }

    public boolean isActive() {
        return this.isActive;
    }

    public void setAppRestoredListener(AppRestoredListener appRestoredListener) {
        this.appRestoredListener = appRestoredListener;
    }

    public void setStatusChangeListener(AppStatusChangeListener appStatusChangeListener) {
        this.statusChangeListener = appStatusChangeListener;
    }
}
