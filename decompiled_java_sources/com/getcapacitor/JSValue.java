package com.getcapacitor;

import org.json.JSONException;

/* loaded from: classes.dex */
public class JSValue {
    private final Object value;

    public JSValue(PluginCall pluginCall, String str) {
        this.value = toValue(pluginCall, str);
    }

    private Object toValue(PluginCall pluginCall, String str) {
        JSArray array = pluginCall.getArray(str, null);
        if (array != null) {
            return array;
        }
        JSObject object = pluginCall.getObject(str, null);
        if (object != null) {
            return object;
        }
        String string = pluginCall.getString(str, null);
        return string != null ? string : pluginCall.getData().opt(str);
    }

    public Object getValue() {
        return this.value;
    }

    public JSArray toJSArray() {
        Object obj = this.value;
        if (obj instanceof JSArray) {
            return (JSArray) obj;
        }
        throw new JSONException("JSValue could not be coerced to JSArray.");
    }

    public JSObject toJSObject() {
        Object obj = this.value;
        if (obj instanceof JSObject) {
            return (JSObject) obj;
        }
        throw new JSONException("JSValue could not be coerced to JSObject.");
    }

    public String toString() {
        return getValue().toString();
    }
}
