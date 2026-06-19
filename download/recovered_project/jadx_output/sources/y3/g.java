package y3;

import g4.i;
import g4.o;

/* loaded from: classes.dex */
public abstract class g extends c implements g4.g {
    private final int arity;

    public g(int i5, w3.c cVar) {
        super(cVar);
        this.arity = i5;
    }

    @Override // g4.g
    public int getArity() {
        return this.arity;
    }

    @Override // y3.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        o.f1705a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
