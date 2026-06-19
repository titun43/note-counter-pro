package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final n f558g;
    public static final n h;

    /* renamed from: i, reason: collision with root package name */
    public static final n f559i;

    /* renamed from: j, reason: collision with root package name */
    public static final n f560j;

    /* renamed from: k, reason: collision with root package name */
    public static final n f561k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n[] f562l;

    static {
        n nVar = new n("DESTROYED", 0);
        f558g = nVar;
        n nVar2 = new n("INITIALIZED", 1);
        h = nVar2;
        n nVar3 = new n("CREATED", 2);
        f559i = nVar3;
        n nVar4 = new n("STARTED", 3);
        f560j = nVar4;
        n nVar5 = new n("RESUMED", 4);
        f561k = nVar5;
        f562l = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f562l.clone();
    }
}
