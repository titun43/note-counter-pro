package r3;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: g, reason: collision with root package name */
    public final String f3183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super("Cannot copy/rename to an existing directory (" + str + ")", null);
        g4.i.e(str, "path");
        this.f3183g = str;
    }
}
