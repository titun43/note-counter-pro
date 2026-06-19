package f0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements m2.f {
    @Override // m2.f
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                androidx.emoji2.text.t a5 = f2.j.a();
                a5.y(rawQuery.getString(1));
                a5.f285j = p2.a.b(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                a5.f284i = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a5.f());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }
}
