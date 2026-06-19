package c0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f752c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f754e;

    public /* synthetic */ f(String str, Context context, Object obj, int i5, int i6) {
        this.f750a = i6;
        this.f751b = str;
        this.f752c = context;
        this.f754e = obj;
        this.f753d = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f750a) {
            case 0:
                Object[] objArr = {(e) this.f754e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return i.b(this.f751b, this.f752c, Collections.unmodifiableList(arrayList), this.f753d);
            default:
                try {
                    return i.b(this.f751b, this.f752c, (ArrayList) this.f754e, this.f753d);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
