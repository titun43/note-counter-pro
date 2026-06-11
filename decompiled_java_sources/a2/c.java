package a2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.emoji2.text.t;
import com.android.billingclient.api.Purchase;
import com.capacitorjs.plugins.filesystem.FilesystemPlugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.community.admob.consent.AdConsentExecutor;
import com.getcapacitor.plugin.util.HttpRequestHandler;
import com.lokhnathtechnical.notecounterpro.plugins.PremiumPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import l2.j;
import m2.g;
import m2.h;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements i3.f, HttpRequestHandler.ProgressEmitter, n2.b, m2.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11g;
    public final /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12i;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f11g = i5;
        this.f12i = obj;
        this.h = obj2;
    }

    @Override // n2.b
    public Object a() {
        switch (this.f11g) {
            case 3:
                j jVar = (j) this.f12i;
                Iterable iterable = (Iterable) this.h;
                h hVar = (h) ((m2.d) jVar.f2535c);
                hVar.getClass();
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + h.h(iterable)).execute();
                    break;
                }
                break;
            default:
                j jVar2 = (j) this.f12i;
                for (Map.Entry entry : ((HashMap) this.h).entrySet()) {
                    ((h) ((m2.c) jVar2.f2540i)).f(((Integer) entry.getValue()).intValue(), i2.c.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // m2.f
    public Object apply(Object obj) {
        h hVar = (h) this.f12i;
        f2.j jVar = (f2.j) this.h;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        m2.a aVar = hVar.f2579j;
        ArrayList e4 = hVar.e(sQLiteDatabase, jVar, aVar.f2566b);
        for (c2.c cVar : c2.c.values()) {
            if (cVar != jVar.f1473c) {
                int size = aVar.f2566b - e4.size();
                if (size <= 0) {
                    break;
                }
                t a5 = f2.j.a();
                a5.y(jVar.f1471a);
                if (cVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a5.f285j = cVar;
                a5.f284i = jVar.f1472b;
                e4.addAll(hVar.e(sQLiteDatabase, a5.f(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i5 = 0; i5 < e4.size(); i5++) {
            sb.append(((m2.b) e4.get(i5)).f2570a);
            if (i5 < e4.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j2 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j2));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j2), set);
                }
                set.add(new g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = e4.listIterator();
        while (listIterator.hasNext()) {
            m2.b bVar = (m2.b) listIterator.next();
            long j5 = bVar.f2570a;
            if (hashMap.containsKey(Long.valueOf(j5))) {
                f2.h c5 = bVar.f2572c.c();
                for (g gVar : (Set) hashMap.get(Long.valueOf(j5))) {
                    c5.a(gVar.f2574a, gVar.f2575b);
                }
                listIterator.set(new m2.b(j5, bVar.f2571b, c5.c()));
            }
        }
        return e4;
    }

    public void b(y1.e eVar, String str) {
        ((PremiumPlugin) this.f12i).lambda$handlePurchase$1((Purchase) this.h, eVar, str);
    }

    @Override // com.getcapacitor.plugin.util.HttpRequestHandler.ProgressEmitter
    public void emit(Integer num, Integer num2) {
        FilesystemPlugin.downloadFile$lambda$0((PluginCall) this.h, (FilesystemPlugin) this.f12i, num, num2);
    }

    @Override // i3.f
    public void onConsentInfoUpdateSuccess() {
        ((AdConsentExecutor) this.f12i).lambda$requestConsentInfo$0((PluginCall) this.h);
    }

    public /* synthetic */ c(PluginCall pluginCall, FilesystemPlugin filesystemPlugin) {
        this.f11g = 1;
        this.h = pluginCall;
        this.f12i = filesystemPlugin;
    }
}
