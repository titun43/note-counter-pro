package com.getcapacitor;

/* loaded from: classes.dex */
public class ProcessedRoute {
    private boolean ignoreAssetPath;
    private boolean isAsset;
    private String path;

    public String getPath() {
        return this.path;
    }

    public boolean isAsset() {
        return this.isAsset;
    }

    public boolean isIgnoreAssetPath() {
        return this.ignoreAssetPath;
    }

    public void setAsset(boolean z4) {
        this.isAsset = z4;
    }

    public void setIgnoreAssetPath(boolean z4) {
        this.ignoreAssetPath = z4;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
