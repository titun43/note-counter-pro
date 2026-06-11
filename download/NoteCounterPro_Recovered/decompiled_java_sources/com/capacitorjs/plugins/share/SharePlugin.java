package com.capacitorjs.plugins.share;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import androidx.emoji2.text.u;
import com.getcapacitor.Bridge;
import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.ActivityCallback;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.ads.RequestConfiguration;
import d.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@CapacitorPlugin(name = "Share")
/* loaded from: classes.dex */
public class SharePlugin extends Plugin {
    private BroadcastReceiver broadcastReceiver;
    private ComponentName chosenComponent;
    private boolean stopped = false;
    private boolean isPresenting = false;

    @ActivityCallback
    private void activityResult(PluginCall pluginCall, a aVar) {
        if (aVar.f1157g != 0 || this.stopped) {
            JSObject jSObject = new JSObject();
            ComponentName componentName = this.chosenComponent;
            jSObject.put("activityType", componentName != null ? componentName.getPackageName() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            pluginCall.resolve(jSObject);
        } else {
            pluginCall.reject("Share canceled");
        }
        this.isPresenting = false;
    }

    public static /* bridge */ /* synthetic */ ComponentName d(SharePlugin sharePlugin, Intent intent) {
        return sharePlugin.getParcelableExtraLegacy(intent, "android.intent.extra.CHOSEN_COMPONENT");
    }

    private String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private ComponentName getParcelableExtraLegacy(Intent intent, String str) {
        return (ComponentName) intent.getParcelableExtra(str);
    }

    private boolean isFileUrl(String str) {
        return str.startsWith("file:");
    }

    private boolean isHttpUrl(String str) {
        return str.startsWith(Bridge.CAPACITOR_HTTP_SCHEME);
    }

    private void shareFiles(JSArray jSArray, Intent intent, PluginCall pluginCall) {
        ArrayList arrayList = new ArrayList();
        try {
            List list = jSArray.toList();
            for (int i5 = 0; i5 < list.size(); i5++) {
                String str = (String) list.get(i5);
                if (!isFileUrl(str)) {
                    pluginCall.reject("only file urls are supported");
                    return;
                }
                String mimeType = getMimeType(str);
                if (mimeType != null && list.size() <= 1) {
                    intent.setType(mimeType);
                    arrayList.add(FileProvider.d(getActivity(), getContext().getPackageName() + ".fileprovider", new File(Uri.parse(str).getPath())));
                }
                mimeType = "*/*";
                intent.setType(mimeType);
                arrayList.add(FileProvider.d(getActivity(), getContext().getPackageName() + ".fileprovider", new File(Uri.parse(str).getPath())));
            }
            if (arrayList.size() > 1) {
                intent.putExtra("android.intent.extra.STREAM", arrayList);
            } else if (arrayList.size() == 1) {
                if (Build.VERSION.SDK_INT >= 29) {
                    intent.setClipData(ClipData.newRawUri(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (Uri) arrayList.get(0)));
                }
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
            }
            intent.setFlags(1);
        } catch (Exception e4) {
            pluginCall.reject(e4.getLocalizedMessage());
        }
    }

    @PluginMethod
    public void canShare(PluginCall pluginCall) {
        JSObject jSObject = new JSObject();
        jSObject.put("value", true);
        pluginCall.resolve(jSObject);
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnDestroy() {
        if (this.broadcastReceiver != null) {
            getActivity().unregisterReceiver(this.broadcastReceiver);
        }
    }

    @Override // com.getcapacitor.Plugin
    public void handleOnStop() {
        super.handleOnStop();
        this.stopped = true;
    }

    @Override // com.getcapacitor.Plugin
    public void load() {
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.capacitorjs.plugins.share.SharePlugin.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Object parcelableExtra;
                if (Build.VERSION.SDK_INT < 33) {
                    SharePlugin sharePlugin = SharePlugin.this;
                    sharePlugin.chosenComponent = SharePlugin.d(sharePlugin, intent);
                } else {
                    SharePlugin sharePlugin2 = SharePlugin.this;
                    parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
                    sharePlugin2.chosenComponent = (ComponentName) parcelableExtra;
                }
            }
        };
        v.a.registerReceiver(getContext(), this.broadcastReceiver, new IntentFilter("android.intent.extra.CHOSEN_COMPONENT"), 2);
    }

    @PluginMethod
    public void share(PluginCall pluginCall) {
        if (this.isPresenting) {
            pluginCall.reject("Can't share while sharing is in progress");
            return;
        }
        String string = pluginCall.getString("title", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        String string2 = pluginCall.getString("text");
        String string3 = pluginCall.getString("url");
        JSArray array = pluginCall.getArray("files");
        String string4 = pluginCall.getString("dialogTitle", "Share");
        if (string2 == null && string3 == null && (array == null || array.length() == 0)) {
            pluginCall.reject("Must provide a URL or Message or files");
            return;
        }
        if (string3 != null && !isFileUrl(string3) && !isHttpUrl(string3)) {
            pluginCall.reject("Unsupported url");
            return;
        }
        Intent intent = new Intent((array == null || array.length() <= 1) ? "android.intent.action.SEND" : "android.intent.action.SEND_MULTIPLE");
        if (string2 != null) {
            if (string3 != null && isHttpUrl(string3)) {
                string2 = u.k(string2, " ", string3);
            }
            intent.putExtra("android.intent.extra.TEXT", string2);
            intent.setTypeAndNormalize("text/plain");
        }
        if (string3 != null && isHttpUrl(string3) && string2 == null) {
            intent.putExtra("android.intent.extra.TEXT", string3);
            intent.setTypeAndNormalize("text/plain");
        } else if (string3 != null && isFileUrl(string3)) {
            JSArray jSArray = new JSArray();
            jSArray.put(string3);
            shareFiles(jSArray, intent, pluginCall);
        }
        if (string != null) {
            intent.putExtra("android.intent.extra.SUBJECT", string);
        }
        if (array != null && array.length() != 0) {
            shareFiles(array, intent, pluginCall);
        }
        int i5 = Build.VERSION.SDK_INT;
        int i6 = i5 >= 31 ? 167772160 : 134217728;
        if (i5 >= 34) {
            i6 |= 16777216;
        }
        Intent createChooser = Intent.createChooser(intent, string4, PendingIntent.getBroadcast(getContext(), 0, new Intent("android.intent.extra.CHOSEN_COMPONENT"), i6).getIntentSender());
        this.chosenComponent = null;
        createChooser.addCategory("android.intent.category.DEFAULT");
        this.stopped = false;
        this.isPresenting = true;
        startActivityForResult(pluginCall, createChooser, "activityResult");
    }
}
