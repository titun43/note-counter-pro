package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzduy extends FrameLayout {
    private final com.google.android.gms.ads.internal.util.zzat zza;

    public zzduy(Context context, View view, com.google.android.gms.ads.internal.util.zzat zzatVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.zza = zzatVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.zza.zza(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            KeyEvent.Callback childAt = getChildAt(i5);
            if (childAt instanceof zzcjl) {
                arrayList.add((zzcjl) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((zzcjl) arrayList.get(i6)).destroy();
        }
    }
}
