package r3;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: g, reason: collision with root package name */
    public final String f3190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super("The file/directory at " + str + " already exists", null);
        g4.i.e(str, "path");
        this.f3190g = str;
    }
}
