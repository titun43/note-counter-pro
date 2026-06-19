package com.getcapacitor;

import com.google.android.gms.ads.RequestConfiguration;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class PluginResult {
    private final JSObject json;

    public PluginResult() {
        this(new JSObject());
    }

    public JSObject getWrappedResult() {
        JSObject jSObject = new JSObject();
        jSObject.put("pluginId", this.json.getString("pluginId"));
        jSObject.put("methodName", this.json.getString("methodName"));
        jSObject.put("success", (Object) this.json.getBoolean("success", Boolean.FALSE));
        jSObject.put("data", (Object) this.json.getJSObject("data"));
        jSObject.put("error", (Object) this.json.getJSObject("error"));
        return jSObject;
    }

    public PluginResult jsonPut(String str, Object obj) {
        try {
            this.json.put(str, obj);
            return this;
        } catch (Exception e4) {
            Logger.error(Logger.tags("Plugin"), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e4);
            return this;
        }
    }

    public PluginResult put(String str, boolean z4) {
        return jsonPut(str, Boolean.valueOf(z4));
    }

    public String toString() {
        return this.json.toString();
    }

    public PluginResult(JSObject jSObject) {
        this.json = jSObject;
    }

    public PluginResult put(String str, double d5) {
        return jsonPut(str, Double.valueOf(d5));
    }

    public PluginResult put(String str, int i5) {
        return jsonPut(str, Integer.valueOf(i5));
    }

    public PluginResult put(String str, long j2) {
        return jsonPut(str, Long.valueOf(j2));
    }

    public PluginResult put(String str, Date date) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        return jsonPut(str, simpleDateFormat.format(date));
    }

    public PluginResult put(String str, Object obj) {
        return jsonPut(str, obj);
    }

    public PluginResult put(String str, PluginResult pluginResult) {
        return jsonPut(str, pluginResult.json);
    }
}
