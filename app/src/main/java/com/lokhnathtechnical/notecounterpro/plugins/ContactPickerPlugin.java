package com.lokhnathtechnical.notecounterpro.plugins;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.p0;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.google.android.gms.ads.RequestConfiguration;
import d.a;
import d.c;
import g.k;

@CapacitorPlugin(name = "ContactPicker", permissions = {@Permission(alias = "contacts", strings = {"android.permission.READ_CONTACTS"})})
/* loaded from: classes.dex */
public class ContactPickerPlugin extends Plugin {
    private static final String TAG = "ContactPickerPlugin";
    private c contactPickerLauncher;
    private PluginCall savedCall = null;

    private JSObject getContactData(Uri uri) {
        JSObject jSObject = new JSObject();
        k activity = getActivity();
        if (activity == null) {
            jSObject.put("cancelled", true);
            return jSObject;
        }
        ContentResolver contentResolver = activity.getContentResolver();
        Cursor cursor = null;
        try {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    Log.w(TAG, "Cursor is null or empty");
                    jSObject.put("cancelled", true);
                } else {
                    int columnIndex = query.getColumnIndex("data1");
                    String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    String string = columnIndex >= 0 ? query.getString(columnIndex) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    int columnIndex2 = query.getColumnIndex("display_name");
                    String string2 = columnIndex2 >= 0 ? query.getString(columnIndex2) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    if (string != null) {
                        string = string.replaceAll("[\\s\\-\\(\\)]", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    Log.d(TAG, "Raw - Name: " + string2 + ", Phone: " + string);
                    if (string == null) {
                        string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                    jSObject.put("mobile", string);
                    if (string2 != null) {
                        str = string2;
                    }
                    jSObject.put("name", str);
                    jSObject.put("cancelled", false);
                }
                if (query != null) {
                    query.close();
                    return jSObject;
                }
            } catch (Exception e4) {
                Log.e(TAG, "Error querying contact data", e4);
                jSObject.put("cancelled", true);
                jSObject.put("error", e4.getMessage());
                if (0 != 0) {
                    cursor.close();
                }
            }
            return jSObject;
        } finally {
        }
    }

    private void handleActivityResult(a aVar) {
        Intent intent;
        if (this.savedCall == null) {
            Log.w(TAG, "No saved call, ignoring result");
            return;
        }
        if (aVar.f1157g != -1 || (intent = aVar.h) == null) {
            Log.d(TAG, "Contact picker cancelled");
            JSObject jSObject = new JSObject();
            jSObject.put("cancelled", true);
            this.savedCall.resolve(jSObject);
        } else {
            Uri data = intent.getData();
            Log.d(TAG, "Contact selected: " + data);
            if (data == null) {
                JSObject jSObject2 = new JSObject();
                jSObject2.put("cancelled", true);
                this.savedCall.resolve(jSObject2);
                this.savedCall = null;
                return;
            }
            try {
                JSObject contactData = getContactData(data);
                Log.d(TAG, "Contact data: " + contactData.toString());
                this.savedCall.resolve(contactData);
            } catch (Exception e4) {
                Log.e(TAG, "Failed to read contact data", e4);
                this.savedCall.reject("Failed to read contact: " + e4.getMessage());
            }
        }
        this.savedCall = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$load$0(a aVar) {
        Log.d(TAG, "ActivityResult received: resultCode=" + aVar.f1157g);
        handleActivityResult(aVar);
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        super.load();
        try {
            this.contactPickerLauncher = getActivity().registerForActivityResult(new p0(2), new com.getcapacitor.plugin.c(this, 1));
            Log.d(TAG, "ContactPickerLauncher registered successfully");
        } catch (Exception e4) {
            Log.e(TAG, "Failed to register ActivityResultLauncher", e4);
        }
    }

    @PluginMethod
    public void pickContact(PluginCall pluginCall) {
        if (this.contactPickerLauncher == null) {
            Log.e(TAG, "Launcher is null, cannot pick contact");
            pluginCall.reject("Contact picker not available");
            return;
        }
        this.savedCall = pluginCall;
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("vnd.android.cursor.dir/phone_v2");
            this.contactPickerLauncher.a(intent);
            Log.d(TAG, "Contact picker launched");
        } catch (Exception e4) {
            Log.e(TAG, "Failed to open contact picker", e4);
            this.savedCall = null;
            pluginCall.reject("Failed to open contact picker: " + e4.getMessage());
        }
    }
}
