package org.apache.cordova;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import java.io.FileNotFoundException;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public r f2953a;

    /* renamed from: b, reason: collision with root package name */
    public String f2954b;
    public n cordova;
    public u webView;

    public boolean execute(String str, h hVar, e eVar) {
        return false;
    }

    public q getPathHandler() {
        return null;
    }

    public String getServiceName() {
        return this.f2954b;
    }

    public s handleOpenForRead(Uri uri) {
        throw new FileNotFoundException("Plugin can't handle uri: " + uri);
    }

    public boolean hasPermisssion() {
        return true;
    }

    @Deprecated
    public void initialize(n nVar, u uVar) {
    }

    public void onActivityResult(int i5, int i6, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onDestroy() {
    }

    public Object onMessage(String str, Object obj) {
        return null;
    }

    public void onNewIntent(Intent intent) {
    }

    public boolean onOverrideUrlLoading(String str) {
        return false;
    }

    public void onPause(boolean z4) {
    }

    public boolean onReceivedClientCertRequest(u uVar, b0 b0Var) {
        return false;
    }

    public boolean onReceivedHttpAuthRequest(u uVar, d0 d0Var, String str, String str2) {
        return false;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return false;
    }

    @Deprecated
    public void onRequestPermissionResult(int i5, String[] strArr, int[] iArr) {
    }

    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
    }

    public void onReset() {
    }

    public void onRestoreStateForActivityResult(Bundle bundle, e eVar) {
    }

    public void onResume(boolean z4) {
    }

    public Bundle onSaveInstanceState() {
        return null;
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void pluginInitialize() {
    }

    public final void privateInitialize(String str, n nVar, u uVar, r rVar) {
        this.f2954b = str;
        this.cordova = nVar;
        this.webView = uVar;
        this.f2953a = rVar;
        initialize(nVar, uVar);
        pluginInitialize();
    }

    public Uri remapUri(Uri uri) {
        return null;
    }

    public void requestPermissions(int i5) {
    }

    public Boolean shouldAllowBridgeAccess(String str) {
        return shouldAllowNavigation(str);
    }

    public Boolean shouldAllowNavigation(String str) {
        return null;
    }

    public Boolean shouldAllowRequest(String str) {
        return null;
    }

    public Boolean shouldOpenExternalUrl(String str) {
        return null;
    }

    public boolean execute(String str, String str2, e eVar) {
        return execute(str, new JSONArray(str2), eVar);
    }

    public boolean execute(String str, JSONArray jSONArray, e eVar) {
        return execute(str, new h(), eVar);
    }
}
