package m2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2573g;
    public final /* synthetic */ f2.j h;

    public /* synthetic */ e(long j2, f2.j jVar) {
        this.f2573g = j2;
        this.h = jVar;
    }

    @Override // m2.f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f2573g));
        f2.j jVar = this.h;
        String str = jVar.f1471a;
        c2.c cVar = jVar.f1473c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(p2.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", jVar.f1471a);
            contentValues.put("priority", Integer.valueOf(p2.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
