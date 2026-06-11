package g4;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements g, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public final int f1700g;

    public j(int i5) {
        this.f1700g = i5;
    }

    @Override // g4.g
    public final int getArity() {
        return this.f1700g;
    }

    public final String toString() {
        o.f1705a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
