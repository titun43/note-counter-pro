package b1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f710a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f711b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f712c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f713d;

    public e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.f710a = str;
        this.f711b = Collections.unmodifiableMap(hashMap);
        this.f712c = Collections.unmodifiableSet(hashSet);
        this.f713d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(e1.b bVar, String str) {
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList;
        Cursor j2 = bVar.j(s.c.b("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (j2.getColumnCount() > 0) {
                int columnIndex = j2.getColumnIndex("name");
                int columnIndex2 = j2.getColumnIndex("type");
                int columnIndex3 = j2.getColumnIndex("notnull");
                int columnIndex4 = j2.getColumnIndex("pk");
                int columnIndex5 = j2.getColumnIndex("dflt_value");
                while (j2.moveToNext()) {
                    String string = j2.getString(columnIndex);
                    hashMap.put(string, new a(j2.getInt(columnIndex4), string, j2.getString(columnIndex2), j2.getString(columnIndex5), j2.getInt(columnIndex3) != 0, 2));
                }
            }
            j2.close();
            HashSet hashSet = new HashSet();
            j2 = bVar.j("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = j2.getColumnIndex("id");
                int columnIndex7 = j2.getColumnIndex("seq");
                int columnIndex8 = j2.getColumnIndex("table");
                int columnIndex9 = j2.getColumnIndex("on_delete");
                int columnIndex10 = j2.getColumnIndex("on_update");
                ArrayList b2 = b(j2);
                int count = j2.getCount();
                int i9 = 0;
                while (i9 < count) {
                    j2.moveToPosition(i9);
                    if (j2.getInt(columnIndex7) != 0) {
                        i5 = i9;
                        i6 = columnIndex6;
                        i7 = columnIndex7;
                        arrayList = b2;
                        i8 = count;
                    } else {
                        int i10 = j2.getInt(columnIndex6);
                        i5 = i9;
                        ArrayList arrayList2 = new ArrayList();
                        i6 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        i7 = columnIndex7;
                        int size = b2.size();
                        i8 = count;
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = b2.get(i11);
                            i11++;
                            int i12 = size;
                            c cVar = (c) obj;
                            ArrayList arrayList4 = b2;
                            if (cVar.f704g == i10) {
                                arrayList2.add(cVar.f705i);
                                arrayList3.add(cVar.f706j);
                            }
                            size = i12;
                            b2 = arrayList4;
                        }
                        arrayList = b2;
                        hashSet.add(new b(j2.getString(columnIndex8), j2.getString(columnIndex9), j2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i9 = i5 + 1;
                    columnIndex6 = i6;
                    columnIndex7 = i7;
                    count = i8;
                    b2 = arrayList;
                }
                j2.close();
                j2 = bVar.j("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = j2.getColumnIndex("name");
                    int columnIndex12 = j2.getColumnIndex("origin");
                    int columnIndex13 = j2.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (j2.moveToNext()) {
                            if ("c".equals(j2.getString(columnIndex12))) {
                                d c5 = c(bVar, j2.getString(columnIndex11), j2.getInt(columnIndex13) == 1);
                                if (c5 != null) {
                                    hashSet3.add(c5);
                                }
                            }
                        }
                        j2.close();
                        hashSet2 = hashSet3;
                        return new e(str, hashMap, hashSet, hashSet2);
                    }
                    return new e(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < count; i5++) {
            cursor.moveToPosition(i5);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(e1.b bVar, String str, boolean z4) {
        Cursor j2 = bVar.j(s.c.b("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = j2.getColumnIndex("seqno");
            int columnIndex2 = j2.getColumnIndex("cid");
            int columnIndex3 = j2.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (j2.moveToNext()) {
                    if (j2.getInt(columnIndex2) >= 0) {
                        int i5 = j2.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i5), j2.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(arrayList, str, z4);
                j2.close();
                return dVar;
            }
            j2.close();
            return null;
        } catch (Throwable th) {
            j2.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set set2 = eVar.f712c;
        Map map = eVar.f711b;
        String str = eVar.f710a;
        String str2 = this.f710a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map2 = this.f711b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set3 = this.f712c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f713d;
        if (set4 == null || (set = eVar.f713d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f710a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f711b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f712c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f710a + "', columns=" + this.f711b + ", foreignKeys=" + this.f712c + ", indices=" + this.f713d + '}';
    }
}
