package com.getcapacitor;

import android.content.res.AssetManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class PluginManager {
    private final AssetManager assetManager;

    public PluginManager(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    private JSONArray parsePluginsJSON() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.assetManager.open("capacitor.plugins.json")));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        JSONArray jSONArray = new JSONArray(sb.toString());
                        bufferedReader.close();
                        return jSONArray;
                    }
                    sb.append(readLine);
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            throw new PluginLoadException("Could not load capacitor.plugins.json");
        } catch (JSONException unused2) {
            throw new PluginLoadException("Could not parse capacitor.plugins.json as JSON");
        }
    }

    public List<Class<? extends Plugin>> loadPluginClasses() {
        JSONArray parsePluginsJSON = parsePluginsJSON();
        ArrayList arrayList = new ArrayList();
        try {
            int length = parsePluginsJSON.length();
            for (int i5 = 0; i5 < length; i5++) {
                arrayList.add(Class.forName(parsePluginsJSON.getJSONObject(i5).getString("classpath")).asSubclass(Plugin.class));
            }
            return arrayList;
        } catch (ClassNotFoundException e4) {
            throw new PluginLoadException("Could not find class by class path: " + e4.getMessage());
        } catch (JSONException unused) {
            throw new PluginLoadException("Could not parse capacitor.plugins.json as JSON");
        }
    }
}
