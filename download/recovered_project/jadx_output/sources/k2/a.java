package k2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import b3.g;
import f2.i;
import f2.j;
import f2.n;
import i2.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m2.f;
import m2.h;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements n2.b, f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2426g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2427i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2428j;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i5) {
        this.f2426g = i5;
        this.f2428j = obj;
        this.f2427i = obj2;
        this.h = obj3;
    }

    @Override // n2.b
    public Object a() {
        b bVar = (b) this.f2428j;
        j jVar = (j) this.f2427i;
        i iVar = (i) this.h;
        h hVar = (h) bVar.f2433d;
        hVar.getClass();
        c2.c cVar = jVar.f1473c;
        String str = iVar.f1465a;
        String str2 = jVar.f1471a;
        String v5 = g.v("SQLiteEventStore");
        if (Log.isLoggable(v5, 3)) {
            Log.d(v5, "Storing event with priority=" + cVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar.d(new a(hVar, (Object) iVar, jVar, 1))).getClass();
        bVar.f2430a.w(jVar, 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[SYNTHETIC] */
    @Override // m2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        i2.c cVar;
        int i5 = this.f2426g;
        int i6 = 5;
        int i7 = 4;
        int i8 = 3;
        i2.c cVar2 = i2.c.CACHE_FULL;
        int i9 = 2;
        int i10 = 1;
        Object obj2 = this.h;
        Object obj3 = this.f2427i;
        int i11 = 0;
        h hVar = (h) this.f2428j;
        switch (i5) {
            case 1:
                i iVar = (i) obj2;
                n nVar = iVar.f1467c;
                String str = iVar.f1465a;
                j jVar = (j) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                m2.a aVar = hVar.f2579j;
                if (simpleQueryForLong >= aVar.f2565a) {
                    hVar.f(1L, cVar2, str);
                    return -1L;
                }
                Long b2 = h.b(sQLiteDatabase, jVar);
                if (b2 != null) {
                    insert = b2.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f1471a);
                    contentValues.put("priority", Integer.valueOf(p2.a.a(jVar.f1473c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.f1472b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i12 = aVar.f2569e;
                byte[] bArr2 = nVar.f1481b;
                boolean z4 = bArr2.length <= i12;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f1468d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f1469e));
                contentValues2.put("payload_encoding", nVar.f1480a.f787a);
                contentValues2.put("code", iVar.f1466b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z4));
                contentValues2.put("payload", z4 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z4) {
                    int ceil = (int) Math.ceil(bArr2.length / i12);
                    for (int i13 = 1; i13 <= ceil; i13++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i13 - 1) * i12, Math.min(i13 * i12, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i13));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f1470f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                j jVar2 = (j) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j2 = cursor2.getLong(0);
                    int i14 = cursor2.getInt(7) != 0 ? i10 : 0;
                    f2.h hVar2 = new f2.h();
                    hVar2.f1464f = new HashMap();
                    String string = cursor2.getString(i10);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar2.f1459a = string;
                    hVar2.f1462d = Long.valueOf(cursor2.getLong(i9));
                    hVar2.f1463e = Long.valueOf(cursor2.getLong(3));
                    if (i14 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar2.f1461c = new n(string2 == null ? h.f2576l : new c2.b(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        c2.b bVar = string3 == null ? h.f2576l : new c2.b(string3);
                        Cursor query = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i15 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i15 += blob.length;
                            }
                            byte[] bArr3 = new byte[i15];
                            int i16 = 0;
                            int i17 = 0;
                            while (i16 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i16);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i17, bArr4.length);
                                    i17 += bArr4.length;
                                    i16++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            hVar2.f1461c = new n(bVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar2.f1460b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new m2.b(j2, jVar2, hVar2.c()));
                    i9 = 2;
                    i10 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                r1.h hVar3 = (r1.h) obj2;
                ArrayList arrayList4 = (ArrayList) hVar3.h;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i11);
                    int i18 = cursor3.getInt(1);
                    i2.c cVar3 = i2.c.REASON_UNKNOWN;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            cVar3 = i2.c.MESSAGE_TOO_OLD;
                        } else if (i18 == 2) {
                            cVar = cVar2;
                            long j5 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new i2.d(j5, cVar));
                            i11 = 0;
                            i6 = 5;
                            i7 = 4;
                            i8 = 3;
                        } else if (i18 == i8) {
                            cVar3 = i2.c.PAYLOAD_TOO_BIG;
                        } else if (i18 == i7) {
                            cVar3 = i2.c.MAX_RETRIES_REACHED;
                        } else if (i18 == i6) {
                            cVar3 = i2.c.INVALID_PAYLOD;
                        } else if (i18 == 6) {
                            cVar3 = i2.c.SERVER_ERROR;
                        } else {
                            g.n("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i18));
                        }
                    }
                    cVar = cVar3;
                    long j52 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new i2.d(j52, cVar));
                    i11 = 0;
                    i6 = 5;
                    i7 = 4;
                    i8 = 3;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i19 = e.f1848c;
                    new ArrayList();
                    arrayList4.add(new e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long s5 = hVar.h.s();
                SQLiteDatabase a5 = hVar.a();
                a5.beginTransaction();
                try {
                    Cursor rawQuery = a5.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        i2.g gVar = new i2.g(rawQuery.getLong(0), s5);
                        rawQuery.close();
                        a5.setTransactionSuccessful();
                        a5.endTransaction();
                        hVar3.f3161g = gVar;
                        hVar3.f3162i = new i2.b(new i2.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), m2.a.f2564f.f2565a));
                        hVar3.f3163j = (String) hVar.f2580k.get();
                        return new i2.a((i2.g) hVar3.f3161g, Collections.unmodifiableList(arrayList4), (i2.b) hVar3.f3162i, (String) hVar3.f3163j);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a5.endTransaction();
                    throw th4;
                }
        }
    }

    public /* synthetic */ a(h hVar, Object obj, j jVar, int i5) {
        this.f2426g = i5;
        this.f2428j = hVar;
        this.h = obj;
        this.f2427i = jVar;
    }
}
