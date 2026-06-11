package x4;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.content.FileProvider;
import androidx.emoji2.text.p;
import androidx.emoji2.text.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import org.apache.cordova.engine.SystemWebViewEngine;
import org.apache.cordova.i;
import org.apache.cordova.i0;
import org.apache.cordova.j;
import org.apache.cordova.k;
import org.apache.cordova.k0;
import org.apache.cordova.l;
import org.apache.cordova.m;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class c extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final long f3716a = 104857600;

    /* renamed from: b, reason: collision with root package name */
    public final SystemWebViewEngine f3717b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f3718c;

    /* renamed from: d, reason: collision with root package name */
    public final p f3719d;

    public c(SystemWebViewEngine systemWebViewEngine) {
        this.f3717b = systemWebViewEngine;
        this.f3719d = new p(systemWebViewEngine.f2902a.getContext());
    }

    private File createTempFile(Context context) {
        return File.createTempFile("temp", ".jpg", context.getCacheDir());
    }

    private Uri createUriForFile(Context context, File file) {
        return FileProvider.d(context, context.getPackageName() + ".cdv.core.file.provider", file);
    }

    public void destroyLastDialog() {
        AlertDialog alertDialog = (AlertDialog) this.f3719d.f274i;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        if (this.f3718c == null) {
            SystemWebViewEngine systemWebViewEngine = this.f3717b;
            LinearLayout linearLayout = new LinearLayout(systemWebViewEngine.getView().getContext());
            linearLayout.setOrientation(1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            linearLayout.setLayoutParams(layoutParams);
            View progressBar = new ProgressBar(systemWebViewEngine.getView().getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            progressBar.setLayoutParams(layoutParams2);
            linearLayout.addView(progressBar);
            this.f3718c = linearLayout;
        }
        return this.f3718c;
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j2, long j5, long j6, WebStorage.QuotaUpdater quotaUpdater) {
        quotaUpdater.updateQuota(this.f3716a);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        callback.invoke(str, true, false);
        org.apache.cordova.p c5 = this.f3717b.h.c("Geolocation");
        if (c5 == null || c5.hasPermisssion()) {
            return;
        }
        c5.requestPermissions(0);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.f3717b.getCordovaWebView().hideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        u1.f fVar = new u1.f(jsResult, 21);
        p pVar = this.f3719d;
        pVar.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder((Context) pVar.h);
        builder.setMessage(str2);
        builder.setTitle("Alert");
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.ok, new j(fVar, 0));
        builder.setOnCancelListener(new androidx.fragment.app.p(fVar, 1));
        builder.setOnKeyListener(new k(fVar, 0));
        pVar.f274i = builder.show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        k1.j jVar = new k1.j(jsResult, 23);
        p pVar = this.f3719d;
        pVar.getClass();
        AlertDialog.Builder builder = new AlertDialog.Builder((Context) pVar.h);
        builder.setMessage(str2);
        builder.setTitle("Confirm");
        builder.setCancelable(true);
        builder.setPositiveButton(R.string.ok, new l(jVar, 0));
        builder.setNegativeButton(R.string.cancel, new l(jVar, 1));
        builder.setOnCancelListener(new androidx.fragment.app.p(jVar, 2));
        builder.setOnKeyListener(new k(jVar, 1));
        pVar.f274i = builder.show();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014e  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String str4;
        String str5;
        boolean startsWith;
        Boolean shouldAllowBridgeAccess;
        JSONArray jSONArray;
        i iVar = this.f3717b.f2905d;
        iVar.getClass();
        if (str3 == null || !str3.startsWith("gap:")) {
            str4 = str2;
            if (str3 != null && str3.startsWith("gap_bridge_mode:")) {
                try {
                    int parseInt = Integer.parseInt(str3.substring(16));
                    int parseInt2 = Integer.parseInt(str4);
                    if (iVar.b(parseInt)) {
                        iVar.f2927b.f(parseInt2);
                    }
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (NumberFormatException e5) {
                    e5.printStackTrace();
                }
                str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            } else if (str3 != null && str3.startsWith("gap_poll:")) {
                try {
                    str5 = !iVar.b(Integer.parseInt(str3.substring(9))) ? null : iVar.f2927b.d("1".equals(str4));
                    if (str5 == null) {
                        str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    }
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                    str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            } else if (str3 == null || !str3.startsWith("gap_init:")) {
                str5 = null;
            } else {
                k0 k0Var = iVar.f2926a;
                synchronized (k0Var.f2937b) {
                    try {
                        Iterator it = k0Var.f2937b.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                startsWith = str.startsWith(k0Var.b());
                                break;
                            }
                            org.apache.cordova.p pVar = (org.apache.cordova.p) k0Var.f2936a.get(((i0) it.next()).f2929a);
                            if (pVar != null && (shouldAllowBridgeAccess = pVar.shouldAllowBridgeAccess(str)) != null) {
                                startsWith = shouldAllowBridgeAccess.booleanValue();
                                break;
                            }
                        }
                    } finally {
                    }
                }
                if (startsWith) {
                    iVar.f2927b.f(Integer.parseInt(str3.substring(9)));
                    iVar.f2928c = new SecureRandom().nextInt(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    str5 = u.h(iVar.f2928c, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                } else {
                    Log.e("CordovaBridge", "gap_init called from restricted origin: " + str);
                    str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            }
        } else {
            try {
                jSONArray = new JSONArray(str3.substring(4));
                str4 = str2;
            } catch (IllegalAccessException e7) {
                e = e7;
                str4 = str2;
            } catch (JSONException e8) {
                e = e8;
                str4 = str2;
            }
            try {
                str5 = iVar.a(jSONArray.getInt(0), jSONArray.getString(1), jSONArray.getString(2), jSONArray.getString(3), str4);
                if (str5 == null) {
                    str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
            } catch (IllegalAccessException e9) {
                e = e9;
                e.printStackTrace();
                str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (str5 != null) {
                }
                return true;
            } catch (JSONException e10) {
                e = e10;
                e.printStackTrace();
                str5 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                if (str5 != null) {
                }
                return true;
            }
        }
        if (str5 != null) {
            jsPromptResult.confirm(str5);
        } else {
            p pVar2 = this.f3719d;
            u1.f fVar = new u1.f(jsPromptResult, 22);
            pVar2.getClass();
            Context context = (Context) pVar2.h;
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(str4);
            EditText editText = new EditText(context);
            if (str3 != null) {
                editText.setText(str3);
            }
            builder.setView(editText);
            builder.setCancelable(false);
            builder.setPositiveButton(R.string.ok, new m(editText, fVar));
            builder.setNegativeButton(R.string.cancel, new j(fVar, 1));
            pVar2.f274i = builder.show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        Arrays.toString(permissionRequest.getResources());
        permissionRequest.grant(permissionRequest.getResources());
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.f3717b.getCordovaWebView().showCustomView(view, customViewCallback);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)|4|(1:6)|7|(2:9|(9:13|14|16|17|18|(1:20)|21|22|23))|32|18|(0)|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r8.onReceiveValue(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent intent;
        Uri uri;
        Intent createIntent = fileChooserParams.createIntent();
        Boolean bool = Boolean.FALSE;
        if (fileChooserParams.getMode() == 1) {
            bool = Boolean.TRUE;
        }
        createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bool);
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes.length > 1) {
            createIntent.setType("*/*");
            createIntent.putExtra("android.intent.extra.MIME_TYPES", acceptTypes);
        }
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        SystemWebViewEngine systemWebViewEngine = this.f3717b;
        if (isCaptureEnabled) {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            Context context = systemWebViewEngine.getView().getContext();
            if (context.getPackageManager().hasSystemFeature("android.hardware.camera.any") && intent.resolveActivity(context.getPackageManager()) != null) {
                try {
                    File createTempFile = createTempFile(context);
                    Objects.toString(createTempFile);
                    uri = createUriForFile(context, createTempFile);
                } catch (IOException e4) {
                    e = e4;
                    uri = null;
                }
                try {
                    Objects.toString(uri);
                    intent.putExtra("output", uri);
                } catch (IOException e5) {
                    e = e5;
                    Log.e("SystemWebChromeClient", "Unable to create temporary file for photo capture", e);
                    intent = null;
                    Intent createChooser = Intent.createChooser(createIntent, null);
                    if (intent != null) {
                    }
                    systemWebViewEngine.f2908g.startActivityForResult(new b(uri, valueCallback), createChooser, 5173);
                    return true;
                }
                Intent createChooser2 = Intent.createChooser(createIntent, null);
                if (intent != null) {
                    createChooser2.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
                }
                systemWebViewEngine.f2908g.startActivityForResult(new b(uri, valueCallback), createChooser2, 5173);
                return true;
            }
        }
        intent = null;
        uri = null;
        Intent createChooser22 = Intent.createChooser(createIntent, null);
        if (intent != null) {
        }
        systemWebViewEngine.f2908g.startActivityForResult(new b(uri, valueCallback), createChooser22, 5173);
        return true;
    }
}
