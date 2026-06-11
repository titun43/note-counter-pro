package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class p0 extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f416a;

    public /* synthetic */ p0(int i5) {
        this.f416a = i5;
    }

    @Override // e.a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f416a) {
            case 0:
                d.i iVar = (d.i) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = iVar.h;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = iVar.f1176g;
                        g4.i.e(intentSender, "intentSender");
                        iVar = new d.i(intentSender, null, iVar.f1177i, iVar.f1178j);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar);
                if (u0.J(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                g4.i.e(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                g4.i.d(putExtra, "putExtra(...)");
                return putExtra;
            case 2:
                Intent intent3 = (Intent) obj;
                g4.i.e(intent3, "input");
                return intent3;
            default:
                d.i iVar2 = (d.i) obj;
                g4.i.e(iVar2, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", iVar2);
                g4.i.d(putExtra2, "putExtra(...)");
                return putExtra2;
        }
    }

    @Override // e.a
    public k1.j b(Context context, Object obj) {
        switch (this.f416a) {
            case 1:
                String[] strArr = (String[]) obj;
                g4.i.e(strArr, "input");
                if (strArr.length == 0) {
                    return new k1.j(u3.p.f3548g, 4);
                }
                for (String str : strArr) {
                    if (v.a.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int Q = u3.r.Q(strArr.length);
                if (Q < 16) {
                    Q = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(Q);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new k1.j(linkedHashMap, 4);
            default:
                return super.b(context, obj);
        }
    }

    @Override // e.a
    public final Object c(Intent intent, int i5) {
        switch (this.f416a) {
            case 1:
                if (i5 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i6 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i6 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(u3.i.T(arrayList2), u3.i.T(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new t3.c(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new d.a(intent, i5);
    }
}
