package com.getcapacitor;

import com.getcapacitor.util.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PluginConfig {
    private final JSONObject config;

    public PluginConfig(JSONObject jSONObject) {
        this.config = jSONObject;
    }

    public String[] getArray(String str) {
        return getArray(str, null);
    }

    public boolean getBoolean(String str, boolean z4) {
        return JSONUtils.getBoolean(this.config, str, z4);
    }

    public JSONObject getConfigJSON() {
        return this.config;
    }

    public double getDouble(String str, double d5) {
        return JSONUtils.getDouble(this.config, str, d5);
    }

    public int getInt(String str, int i5) {
        return JSONUtils.getInt(this.config, str, i5);
    }

    public JSONObject getObject(String str) {
        return JSONUtils.getObject(this.config, str);
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public boolean isEmpty() {
        return this.config.length() == 0;
    }

    public String[] getArray(String str, String[] strArr) {
        return JSONUtils.getArray(this.config, str, strArr);
    }

    public String getString(String str, String str2) {
        return JSONUtils.getString(this.config, str, str2);
    }
}
