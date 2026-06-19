package androidx.lifecycle;

/* loaded from: classes.dex */
public interface u0 {
    default r0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default r0 b(Class cls, q0.d dVar) {
        return a(cls);
    }
}
