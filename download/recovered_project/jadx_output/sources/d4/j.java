package d4;

import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements m4.d {

    /* renamed from: a, reason: collision with root package name */
    public final File f1218a;

    /* renamed from: b, reason: collision with root package name */
    public final k f1219b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.p f1220c;

    public j(File file, k kVar, m mVar) {
        this.f1218a = file;
        this.f1219b = kVar;
        this.f1220c = mVar;
    }

    @Override // m4.d
    public final Iterator iterator() {
        return new h(this);
    }
}
