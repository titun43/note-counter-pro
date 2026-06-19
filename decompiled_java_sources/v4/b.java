package v4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f3590g;
    public static final b h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f3591i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f3592j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f3593k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ b[] f3594l;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f3590g = bVar;
        b bVar2 = new b("BLOCKING", 1);
        h = bVar2;
        b bVar3 = new b("PARKING", 2);
        f3591i = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f3592j = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f3593k = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f3594l = bVarArr;
        z2.b.g(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3594l.clone();
    }
}
