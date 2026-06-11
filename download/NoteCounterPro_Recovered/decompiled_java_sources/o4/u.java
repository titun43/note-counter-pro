package o4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: g, reason: collision with root package name */
    public static final u f2832g;
    public static final u h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u[] f2833i;

    static {
        u uVar = new u("DEFAULT", 0);
        f2832g = uVar;
        u uVar2 = new u("LAZY", 1);
        u uVar3 = new u("ATOMIC", 2);
        h = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3, new u("UNDISPATCHED", 3)};
        f2833i = uVarArr;
        z2.b.g(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f2833i.clone();
    }
}
