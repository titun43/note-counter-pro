package l2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements n2.b, m2.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2531g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2532i;

    public /* synthetic */ i(Object obj, Object obj2, long j2) {
        this.h = obj;
        this.f2532i = obj2;
        this.f2531g = j2;
    }

    @Override // n2.b
    public Object a() {
        j jVar = (j) this.h;
        f2.j jVar2 = (f2.j) this.f2532i;
        m2.d dVar = (m2.d) jVar.f2535c;
        long s5 = ((t2.i) jVar.f2539g).s() + this.f2531g;
        m2.h hVar = (m2.h) dVar;
        hVar.getClass();
        hVar.d(new m2.e(s5, jVar2));
        return null;
    }

    @Override // m2.f
    public Object apply(Object obj) {
        String str = (String) this.h;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i5 = ((i2.c) this.f2532i).f1845g;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i5)});
        try {
            boolean z4 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j2 = this.f2531g;
            if (z4) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i5)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i5));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
