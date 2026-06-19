package d4;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final File f1202a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1203b;

    public b(File file, List list) {
        this.f1202a = file;
        this.f1203b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1202a.equals(bVar.f1202a) && this.f1203b.equals(bVar.f1203b);
    }

    public final int hashCode() {
        return this.f1203b.hashCode() + (this.f1202a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f1202a + ", segments=" + this.f1203b + ')';
    }
}
