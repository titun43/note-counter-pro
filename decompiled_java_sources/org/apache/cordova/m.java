package org.apache.cordova;

import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditText f2949g;
    public final /* synthetic */ u1.f h;

    public m(EditText editText, u1.f fVar) {
        this.f2949g = editText;
        this.h = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        this.h.k(this.f2949g.getText().toString(), true);
    }
}
