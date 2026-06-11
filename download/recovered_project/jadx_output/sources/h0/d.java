package h0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import k1.j;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.getcapacitor.plugin.c f1707a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, com.getcapacitor.plugin.c cVar) {
        super(inputConnection, false);
        this.f1707a = cVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i5, Bundle bundle) {
        j jVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            jVar = new j(new f(inputContentInfo), 8);
        }
        if (this.f1707a.e(jVar, i5, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i5, bundle);
    }
}
