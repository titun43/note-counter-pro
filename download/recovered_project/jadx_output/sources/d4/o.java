package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final o f1225g;
    public static final /* synthetic */ o[] h;

    static {
        o oVar = new o("SKIP", 0);
        o oVar2 = new o("TERMINATE", 1);
        f1225g = oVar2;
        o[] oVarArr = {oVar, oVar2};
        h = oVarArr;
        z2.b.g(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) h.clone();
    }
}
