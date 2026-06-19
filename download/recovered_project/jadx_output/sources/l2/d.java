package l2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final d f2518g;
    public static final d h;

    /* renamed from: i, reason: collision with root package name */
    public static final d f2519i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d[] f2520j;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f2518g = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        h = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f2519i = dVar3;
        f2520j = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2520j.clone();
    }
}
