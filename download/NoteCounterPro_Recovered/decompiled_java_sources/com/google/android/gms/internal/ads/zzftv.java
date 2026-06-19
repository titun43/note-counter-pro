package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzftv implements zzftt {
    private final zzftt zza;

    public zzftv(zzftt zzfttVar) {
        this.zza = zzfttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final JSONObject zza(View view) {
        JSONObject zzb = zzfud.zzb(0, 0, 0, 0);
        int zzb2 = zzfug.zzb();
        int i5 = zzb2 - 1;
        if (zzb2 == 0) {
            throw null;
        }
        try {
            zzb.put("noOutputDevice", i5 == 0);
            return zzb;
        } catch (JSONException e4) {
            zzfue.zza("Error with setting output device status", e4);
            return zzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb(View view, JSONObject jSONObject, zzfts zzftsVar, boolean z4, boolean z5) {
        ArrayList arrayList = new ArrayList();
        zzfth zza = zzfth.zza();
        if (zza != null) {
            Collection zzf = zza.zzf();
            int size = zzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = zzf.iterator();
            while (it.hasNext()) {
                View zzi = ((zzfsn) it.next()).zzi();
                if (zzi != null && zzi.isAttachedToWindow() && zzi.isShown()) {
                    View view2 = zzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = zzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z6 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i5 = size2 - 1;
                                    if (((View) arrayList.get(i5)).getZ() <= z6) {
                                        break;
                                    } else {
                                        size2 = i5;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i6 = 0; i6 < size3; i6++) {
            zzftsVar.zza((View) arrayList.get(i6), this.zza, jSONObject, z5);
        }
    }
}
