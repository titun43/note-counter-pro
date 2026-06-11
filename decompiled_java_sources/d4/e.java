package d4;

import java.io.File;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1204b;

    /* renamed from: c, reason: collision with root package name */
    public File[] f1205c;

    /* renamed from: d, reason: collision with root package name */
    public int f1206d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f1208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, File file) {
        super(file);
        this.f1208f = hVar;
    }

    @Override // d4.i
    public final File a() {
        boolean z4 = this.f1207e;
        File file = this.f1217a;
        if (!z4 && this.f1205c == null) {
            File[] listFiles = file.listFiles();
            this.f1205c = listFiles;
            if (listFiles == null) {
                f4.p pVar = this.f1208f.f1216j.f1220c;
                if (pVar != null) {
                    pVar.invoke(file, new a(file, null, "Cannot list files in a directory"));
                }
                this.f1207e = true;
            }
        }
        File[] fileArr = this.f1205c;
        if (fileArr == null || this.f1206d >= fileArr.length) {
            if (this.f1204b) {
                return null;
            }
            this.f1204b = true;
            return file;
        }
        g4.i.b(fileArr);
        int i5 = this.f1206d;
        this.f1206d = i5 + 1;
        return fileArr[i5];
    }
}
