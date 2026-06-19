package r3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f3169g;
    public static final b0 h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b0[] f3170i;

    static {
        b0 b0Var = new b0("WRITE", 0);
        f3169g = b0Var;
        b0 b0Var2 = new b0("APPEND", 1);
        h = b0Var2;
        b0[] b0VarArr = {b0Var, b0Var2};
        f3170i = b0VarArr;
        z2.b.g(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f3170i.clone();
    }
}
