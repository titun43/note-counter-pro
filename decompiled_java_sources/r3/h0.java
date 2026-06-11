package r3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f3187g;
    public static final h0 h;

    /* renamed from: i, reason: collision with root package name */
    public static final h0 f3188i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ h0[] f3189j;

    static {
        h0 h0Var = new h0("FILE", 0);
        f3187g = h0Var;
        h0 h0Var2 = new h0("DIRECTORY", 1);
        h = h0Var2;
        h0 h0Var3 = new h0("UNKNOWN", 2);
        f3188i = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        f3189j = h0VarArr;
        z2.b.g(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f3189j.clone();
    }
}
