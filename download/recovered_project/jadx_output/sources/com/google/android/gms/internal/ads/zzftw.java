package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzftw implements zzftt {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzftt
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfud.zzb(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzfud.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb(View view, JSONObject jSONObject, zzfts zzftsVar, boolean z4, boolean z5) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z4) {
                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                    zzftsVar.zza(viewGroup.getChildAt(i6), this, jSONObject, z5);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i8 = 0;
            while (i8 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i8));
                int size2 = arrayList3.size();
                int i9 = 0;
                while (true) {
                    i5 = i8 + 1;
                    if (i9 < size2) {
                        zzftsVar.zza((View) arrayList3.get(i9), this, jSONObject, z5);
                        i9++;
                    }
                }
                i8 = i5;
            }
        }
    }
}
