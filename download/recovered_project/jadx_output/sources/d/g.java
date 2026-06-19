package d;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f1166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e.a f1168d;

    public /* synthetic */ g(h hVar, String str, e.a aVar, int i5) {
        this.f1165a = i5;
        this.f1166b = hVar;
        this.f1167c = str;
        this.f1168d = aVar;
    }

    @Override // d.c
    public final void a(Object obj) {
        switch (this.f1165a) {
            case 0:
                h hVar = this.f1166b;
                ArrayList arrayList = hVar.f1172d;
                LinkedHashMap linkedHashMap = hVar.f1170b;
                String str = this.f1167c;
                Object obj2 = linkedHashMap.get(str);
                e.a aVar = this.f1168d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    hVar.b(intValue, aVar, obj);
                    return;
                } catch (Exception e4) {
                    arrayList.remove(str);
                    throw e4;
                }
            default:
                h hVar2 = this.f1166b;
                ArrayList arrayList2 = hVar2.f1172d;
                LinkedHashMap linkedHashMap2 = hVar2.f1170b;
                String str2 = this.f1167c;
                Object obj3 = linkedHashMap2.get(str2);
                e.a aVar2 = this.f1168d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    hVar2.b(intValue2, aVar2, obj);
                    return;
                } catch (Exception e5) {
                    arrayList2.remove(str2);
                    throw e5;
                }
        }
    }

    public void b() {
        this.f1166b.f(this.f1167c);
    }
}
