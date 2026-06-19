package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f1501g;
    public final /* synthetic */ e h;

    public d(e eVar, h hVar) {
        this.h = eVar;
        this.f1501g = hVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j2) {
        e eVar = this.h;
        DialogInterface.OnClickListener onClickListener = eVar.h;
        h hVar = this.f1501g;
        onClickListener.onClick(hVar.f1555b, i5);
        if (eVar.f1510i) {
            return;
        }
        hVar.f1555b.dismiss();
    }
}
