package q4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3098g;
    public static final a h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f3099i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f3100j;

    static {
        a aVar = new a("SUSPEND", 0);
        f3098g = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        h = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f3099i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f3100j = aVarArr;
        z2.b.g(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3100j.clone();
    }
}
