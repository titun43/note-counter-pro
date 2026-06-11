package p3;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class d extends y3.g implements f4.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2993g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2994i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2995j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, w3.c cVar, int i5) {
        super(2, cVar);
        this.f2993g = i5;
        this.f2994i = obj;
        this.f2995j = obj2;
    }

    @Override // y3.a
    public final w3.c create(Object obj, w3.c cVar) {
        switch (this.f2993g) {
            case 0:
                d dVar = new d((k1.j) this.f2994i, (Uri) this.f2995j, cVar, 0);
                dVar.h = obj;
                return dVar;
            case 1:
                d dVar2 = new d((k1.j) this.f2994i, (Uri) this.f2995j, cVar, 1);
                dVar2.h = obj;
                return dVar2;
            default:
                d dVar3 = new d((String) this.f2994i, (r3.a0) this.f2995j, cVar, 2);
                dVar3.h = obj;
                return dVar3;
        }
    }

    @Override // f4.p
    public final Object invoke(Object obj, Object obj2) {
        o4.t tVar = (o4.t) obj;
        w3.c cVar = (w3.c) obj2;
        switch (this.f2993g) {
        }
        return ((d) create(tVar, cVar)).invokeSuspend(t3.h.f3400a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g5;
        Object g6;
        ContentResolver contentResolver;
        Cursor query;
        long w;
        String type;
        String path;
        Object g7;
        File file;
        int i5 = this.f2993g;
        Object obj2 = this.f2994i;
        Object obj3 = this.f2995j;
        switch (i5) {
            case 0:
                x3.a aVar = x3.a.f3712g;
                b3.g.x(obj);
                k1.j jVar = (k1.j) obj2;
                Uri uri = (Uri) obj3;
                try {
                } catch (Throwable th) {
                    g5 = b3.g.g(th);
                }
                if (((ContentResolver) jVar.h).delete(uri, null, null) <= 0) {
                    throw new r3.s(null);
                }
                g5 = t3.h.f3400a;
                return new t3.e(k1.j.r(jVar, g5, uri));
            case 1:
                x3.a aVar2 = x3.a.f3712g;
                b3.g.x(obj);
                k1.j jVar2 = (k1.j) obj2;
                Uri uri2 = (Uri) obj3;
                try {
                    contentResolver = (ContentResolver) jVar2.h;
                    query = contentResolver.query(uri2, null, null, null, null);
                } catch (Throwable th2) {
                    g6 = b3.g.g(th2);
                }
                if (query == null) {
                    throw new r3.s(null);
                }
                try {
                    if (!query.moveToFirst()) {
                        String uri3 = uri2.toString();
                        g4.i.d(uri3, "toString(...)");
                        throw new r3.o(uri3, null);
                    }
                    contentResolver.getPersistedUriPermissions();
                    Integer v5 = k1.j.v(query, u3.h.S("_display_name", "_display_name", "_display_name"));
                    String string = v5 != null ? query.getString(v5.intValue()) : null;
                    if (string == null) {
                        throw new r3.s(null);
                    }
                    long q5 = k1.j.q(jVar2, query, uri2);
                    Integer v6 = k1.j.v(query, u3.h.S("date_modified", "last_modified"));
                    if (v6 != null) {
                        String string2 = query.getString(v6.intValue());
                        g4.i.d(string2, "getString(...)");
                        Long a02 = n4.i.a0(string2);
                        if (a02 != null) {
                            w = a02.longValue();
                            long j2 = w;
                            long w5 = k1.j.w(query);
                            type = contentResolver.getType(uri2);
                            if (type == null) {
                                type = "application/octet-binary";
                            }
                            path = uri2.getPath();
                            if (path == null) {
                                path = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                            }
                            Object yVar = new r3.y(path, string, uri2, q5, new r3.w(type), new Long(w5), j2);
                            query.close();
                            g6 = yVar;
                            return new t3.e(k1.j.r(jVar2, g6, (Uri) obj3));
                        }
                    }
                    w = k1.j.w(query);
                    long j22 = w;
                    long w52 = k1.j.w(query);
                    type = contentResolver.getType(uri2);
                    if (type == null) {
                    }
                    path = uri2.getPath();
                    if (path == null) {
                    }
                    Object yVar2 = new r3.y(path, string, uri2, q5, new r3.w(type), new Long(w52), j22);
                    query.close();
                    g6 = yVar2;
                    return new t3.e(k1.j.r(jVar2, g6, (Uri) obj3));
                } finally {
                }
            default:
                x3.a aVar3 = x3.a.f3712g;
                b3.g.x(obj);
                String str = (String) obj2;
                r3.a0 a0Var = (r3.a0) obj3;
                try {
                    file = new File(str);
                } catch (Throwable th3) {
                    g7 = b3.g.g(th3);
                }
                if (!file.exists()) {
                    throw new r3.o(str, null);
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    g7 = y4.b.J(fileInputStream, a0Var);
                    fileInputStream.close();
                    return new t3.e(g7);
                } finally {
                }
        }
    }
}
