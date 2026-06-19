package com.getcapacitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class JSArray extends JSONArray {
    public JSArray() {
    }

    public static JSArray from(Object obj) {
        try {
            return new JSArray(obj);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <E> List<E> toList() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < length(); i5++) {
            get(i5);
            try {
                arrayList.add(get(i5));
            } catch (Exception unused) {
                throw new JSONException("Not all items are instances of the given type");
            }
        }
        return arrayList;
    }

    public JSArray(String str) {
        super(str);
    }

    public JSArray(Collection collection) {
        super(collection);
    }

    public JSArray(Object obj) {
        super(obj);
    }
}
