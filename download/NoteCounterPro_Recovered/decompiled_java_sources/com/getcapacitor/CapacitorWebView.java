package com.getcapacitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class CapacitorWebView extends WebView {
    private Bridge bridge;
    private BaseInputConnection capInputConnection;

    public CapacitorWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 2) {
            return super.dispatchKeyEvent(keyEvent);
        }
        evaluateJavascript("document.activeElement.value = document.activeElement.value + '" + keyEvent.getCharacters() + "';", null);
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Bridge bridge = this.bridge;
        if (!(bridge != null ? bridge.getConfig() : CapConfig.loadDefault(getContext())).isInputCaptured()) {
            return super.onCreateInputConnection(editorInfo);
        }
        if (this.capInputConnection == null) {
            this.capInputConnection = new BaseInputConnection(this, false);
        }
        return this.capInputConnection;
    }

    public void setBridge(Bridge bridge) {
        this.bridge = bridge;
    }
}
