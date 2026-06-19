package com.capacitorjs.plugins.filesystem;

import android.net.Uri;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import g4.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import r3.b0;
import r3.f0;
import r3.v;
import r3.y;

/* loaded from: classes.dex */
public final class FilesystemMethodResultsKt {
    private static final String OUTPUT_CREATED_TIME = "ctime";
    private static final String OUTPUT_DATA = "data";
    private static final String OUTPUT_FILES = "files";
    private static final String OUTPUT_MODIFIED_TIME = "mtime";
    private static final String OUTPUT_NAME = "name";
    private static final String OUTPUT_SIZE = "size";
    private static final String OUTPUT_TYPE = "type";
    private static final String OUTPUT_URI = "uri";

    public static final JSObject createReadDirResultObject(List<y> list) {
        i.e(list, "list");
        JSObject jSObject = new JSObject();
        String str = OUTPUT_FILES;
        ArrayList arrayList = new ArrayList(u3.i.T(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toResultObject((y) it.next()));
        }
        jSObject.put(str, (Object) new JSArray((Collection) arrayList));
        return jSObject;
    }

    public static final JSObject createReadResultObject(String str) {
        i.e(str, "readData");
        JSObject jSObject = new JSObject();
        jSObject.putOpt(OUTPUT_DATA, str);
        return jSObject;
    }

    public static final JSObject createUriResultObject(Uri uri) {
        i.e(uri, OUTPUT_URI);
        JSObject jSObject = new JSObject();
        jSObject.put(OUTPUT_URI, uri.toString());
        return jSObject;
    }

    public static final JSObject createWriteResultObject(Uri uri, b0 b0Var) {
        i.e(uri, OUTPUT_URI);
        i.e(b0Var, "mode");
        if (b0Var == b0.h) {
            return null;
        }
        return createUriResultObject(uri);
    }

    public static final JSObject toResultObject(y yVar) {
        i.e(yVar, "<this>");
        JSObject jSObject = new JSObject();
        jSObject.put(OUTPUT_NAME, yVar.f3207b);
        jSObject.put(OUTPUT_TYPE, yVar.f3210e instanceof v ? "directory" : "file");
        jSObject.put(OUTPUT_SIZE, yVar.f3209d);
        jSObject.put(OUTPUT_MODIFIED_TIME, yVar.f3212g);
        jSObject.put(OUTPUT_CREATED_TIME, (Object) yVar.f3211f);
        jSObject.put(OUTPUT_URI, (Object) yVar.f3208c);
        return jSObject;
    }

    public static final JSObject toResultObject(f0 f0Var) {
        i.e(f0Var, "<this>");
        return createUriResultObject(f0Var.C());
    }
}
