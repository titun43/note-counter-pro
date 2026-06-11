package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final c f788g;
    public static final c h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f789i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ c[] f790j;

    static {
        c cVar = new c("DEFAULT", 0);
        f788g = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        h = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f789i = cVar3;
        f790j = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f790j.clone();
    }
}
