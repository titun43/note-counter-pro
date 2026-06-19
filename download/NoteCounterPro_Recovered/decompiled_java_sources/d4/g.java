package d4;

import java.io.File;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1210b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f1211c;

    /* renamed from: d, reason: collision with root package name */
    public int f1212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f1213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, File file) {
        super(file);
        this.f1213e = hVar;
    }

    @Override // d4.i
    public final File a() {
        f4.p pVar;
        boolean z4 = this.f1210b;
        File file = this.f1217a;
        if (!z4) {
            this.f1210b = true;
            return file;
        }
        File[] fileArr = this.f1211c;
        if (fileArr != null && this.f1212d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f1211c = listFiles;
            if (listFiles == null && (pVar = this.f1213e.f1216j.f1220c) != null) {
                pVar.invoke(file, new a(file, null, "Cannot list files in a directory"));
            }
            File[] fileArr2 = this.f1211c;
            if (fileArr2 == null || fileArr2.length == 0) {
                return null;
            }
        }
        File[] fileArr3 = this.f1211c;
        g4.i.b(fileArr3);
        int i5 = this.f1212d;
        this.f1212d = i5 + 1;
        return fileArr3[i5];
    }
}
