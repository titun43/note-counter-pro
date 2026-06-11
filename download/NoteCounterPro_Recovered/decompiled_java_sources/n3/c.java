package n3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static final c f2689g;
    public static final /* synthetic */ c[] h;

    static {
        c cVar = new c("DEFAULT", 0);
        f2689g = cVar;
        h = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) h.clone();
    }
}
