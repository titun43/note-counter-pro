package p3;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import r3.e0;
import r3.h0;

/* loaded from: classes.dex */
public final class b extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2987g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2988i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Comparable f2989j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2990k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(k1.j jVar, Uri uri, Object obj, w3.c cVar, int i5) {
        super(2, cVar);
        this.f2987g = i5;
        this.f2988i = jVar;
        this.f2989j = uri;
        this.f2990k = obj;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2987g) {
            case 0:
                b bVar = new b((k1.j) this.f2988i, (Uri) this.f2989j, (String) this.f2990k, cVar, 0);
                bVar.h = obj;
                return bVar;
            case 1:
                b bVar2 = new b((k1.j) this.f2988i, (Uri) this.f2989j, (r3.a0) this.f2990k, cVar, 1);
                bVar2.h = obj;
                return bVar2;
            default:
                return new b((r1.h) this.h, (File) this.f2988i, (String) this.f2990k, (Boolean) this.f2989j, cVar);
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        o4.t tVar = (o4.t) obj;
        w3.c cVar = (w3.c) obj2;
        switch (this.f2987g) {
        }
        return ((b) create(tVar, cVar)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0111, code lost:
    
        if (r0 != null) goto L66;
     */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g5;
        File file;
        InputStream openInputStream;
        Object obj2;
        k1.j jVar;
        Uri uri;
        Object g6;
        boolean z4;
        boolean z5;
        h0 h0Var;
        int i5 = this.f2987g;
        Object obj3 = null;
        Comparable comparable = this.f2989j;
        Object obj4 = this.f2990k;
        Object obj5 = this.f2988i;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                b3.g.x(obj);
                k1.j jVar2 = (k1.j) obj5;
                Uri uri2 = (Uri) comparable;
                try {
                    file = new File((String) obj4);
                } catch (Throwable th) {
                    g5 = b3.g.g(th);
                }
                if (file.isDirectory()) {
                    throw new r3.h();
                }
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    throw new r3.i();
                }
                openInputStream = ((ContentResolver) jVar2.h).openInputStream(uri2);
                g5 = t3.h.f3400a;
                if (openInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            if (z2.b.e(openInputStream, fileOutputStream) <= 0) {
                                throw new r3.s(null);
                            }
                            fileOutputStream.close();
                            openInputStream.close();
                            obj2 = g5;
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    return new t3.e(k1.j.r(jVar2, g5, uri2));
                }
                throw new r3.s(null);
            case 1:
                x3.a aVar2 = x3.a.f3712g;
                b3.g.x(obj);
                jVar = (k1.j) obj5;
                uri = (Uri) comparable;
                r3.a0 a0Var = (r3.a0) obj4;
                try {
                    openInputStream = ((ContentResolver) jVar.h).openInputStream(uri);
                    if (openInputStream != null) {
                        try {
                            g6 = y4.b.J(openInputStream, a0Var);
                            openInputStream.close();
                            break;
                        } finally {
                        }
                    }
                    throw new r3.s(null);
                } catch (Throwable th2) {
                    g6 = b3.g.g(th2);
                    break;
                }
            default:
                x3.a aVar3 = x3.a.f3712g;
                b3.g.x(obj);
                r1.h hVar = (r1.h) this.h;
                File file2 = (File) obj5;
                String str = (String) obj4;
                File file3 = file2 != null ? new File(file2, str) : new File(str);
                Uri fromFile = Uri.fromFile(file3);
                Boolean bool = (Boolean) comparable;
                if (bool != null) {
                    z4 = bool.booleanValue();
                } else {
                    String absolutePath = file3.getAbsolutePath();
                    g4.i.d(absolutePath, "getAbsolutePath(...)");
                    z3.b bVar = r3.x.f3204q;
                    bVar.getClass();
                    g4.a aVar4 = new g4.a(bVar, 1);
                    while (true) {
                        if (aVar4.hasNext()) {
                            Object next = aVar4.next();
                            File l5 = hVar.l((r3.x) next);
                            if (l5 != null) {
                                String absolutePath2 = l5.getAbsolutePath();
                                g4.i.d(absolutePath2, "getAbsolutePath(...)");
                                z5 = n4.i.S(absolutePath, absolutePath2);
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                obj3 = next;
                            }
                        }
                    }
                    r3.x xVar = (r3.x) obj3;
                    z4 = xVar != null ? xVar.f3205g : true;
                }
                String path = file3.getPath();
                g4.i.d(path, "getPath(...)");
                String str2 = File.separator;
                g4.i.d(str2, "separator");
                if ((path.endsWith(str2) || !file3.isDirectory()) && (file3.exists() || !n4.i.X(d4.l.D(file3)))) {
                    str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                String j2 = androidx.emoji2.text.u.j(file3.getPath(), str2);
                Uri build = fromFile.buildUpon().path(fromFile.getPath() + str2).build();
                g4.i.d(build, "build(...)");
                try {
                    h0Var = !file3.exists() ? h0.f3188i : file3.isDirectory() ? h0.h : file3.isFile() ? h0.f3187g : h0.f3188i;
                } catch (SecurityException unused) {
                    h0Var = h0.f3188i;
                }
                return new e0(j2, build, h0Var, z4);
        }
        return new t3.e(k1.j.r(jVar, g6, uri));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r1.h hVar, File file, String str, Boolean bool, w3.c cVar) {
        super(2, cVar);
        this.f2987g = 2;
        this.h = hVar;
        this.f2988i = file;
        this.f2990k = str;
        this.f2989j = bool;
    }
}
