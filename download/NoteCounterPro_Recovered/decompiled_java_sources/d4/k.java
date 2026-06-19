package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final k f1221g;
    public static final k h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f1222i;

    static {
        k kVar = new k("TOP_DOWN", 0);
        f1221g = kVar;
        k kVar2 = new k("BOTTOM_UP", 1);
        h = kVar2;
        k[] kVarArr = {kVar, kVar2};
        f1222i = kVarArr;
        z2.b.g(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f1222i.clone();
    }
}
