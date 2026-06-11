package i3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final g f1860g;
    public static final g h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f1861i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ g[] f1862j;

    static {
        g gVar = new g("UNKNOWN", 0);
        f1860g = gVar;
        g gVar2 = new g("NOT_REQUIRED", 1);
        h = gVar2;
        g gVar3 = new g("REQUIRED", 2);
        f1861i = gVar3;
        f1862j = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1862j.clone();
    }
}
