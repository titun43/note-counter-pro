package com.getcapacitor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.core.content.FileProvider;
import androidx.fragment.app.p0;
import com.getcapacitor.util.PermissionHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class BridgeWebChromeClient extends WebChromeClient {
    private d.c activityLauncher;
    private ActivityResultListener activityListener;
    private Bridge bridge;
    private d.c permissionLauncher;
    private PermissionListener permissionListener;

    public interface ActivityResultListener {
        void onActivityResult(d.a aVar);
    }

    public interface PermissionListener {
        void onPermissionSelect(Boolean bool);
    }

    public BridgeWebChromeClient(Bridge bridge) {
        this.bridge = bridge;
        final int i5 = 0;
        final int i6 = 1;
        this.permissionLauncher = bridge.registerForActivityResult(new p0(i6), new d.b(this) { // from class: com.getcapacitor.j
            public final /* synthetic */ BridgeWebChromeClient h;

            {
                this.h = this;
            }

            @Override // d.b
            public final void c(Object obj) {
                switch (i5) {
                    case 0:
                        this.h.lambda$new$0((Map) obj);
                        break;
                    default:
                        this.h.lambda$new$1((d.a) obj);
                        break;
                }
            }
        });
        this.activityLauncher = bridge.registerForActivityResult(new p0(2), new d.b(this) { // from class: com.getcapacitor.j
            public final /* synthetic */ BridgeWebChromeClient h;

            {
                this.h = this;
            }

            @Override // d.b
            public final void c(Object obj) {
                switch (i6) {
                    case 0:
                        this.h.lambda$new$0((Map) obj);
                        break;
                    default:
                        this.h.lambda$new$1((d.a) obj);
                        break;
                }
            }
        });
    }

    private File createImageFile(Activity activity) {
        return File.createTempFile(s.c.b("JPEG_", new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), "_"), ".jpg", activity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    private Uri createImageFileUri() {
        g.k activity = this.bridge.getActivity();
        return FileProvider.d(activity, this.bridge.getContext().getPackageName() + ".fileprovider", createImageFile(activity));
    }

    private String[] getValidTypes(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        for (String str : strArr) {
            if (str.startsWith(".")) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(str.substring(1));
                if (mimeTypeFromExtension != null && !arrayList.contains(mimeTypeFromExtension)) {
                    arrayList.add(mimeTypeFromExtension);
                }
            } else if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        Object[] array = arrayList.toArray();
        return (String[]) Arrays.copyOf(array, array.length, String[].class);
    }

    private boolean isMediaCaptureSupported() {
        return PermissionHelper.hasPermissions(this.bridge.getContext(), new String[]{"android.permission.CAMERA"}) || !PermissionHelper.hasDefinedPermission(this.bridge.getContext(), "android.permission.CAMERA");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Map map) {
        if (this.permissionListener != null) {
            Iterator it = map.entrySet().iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z4 = false;
                }
            }
            this.permissionListener.onPermissionSelect(Boolean.valueOf(z4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(d.a aVar) {
        ActivityResultListener activityResultListener = this.activityListener;
        if (activityResultListener != null) {
            activityResultListener.onActivityResult(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$11(GeolocationPermissions.Callback callback, String str, Boolean bool) {
        if (bool.booleanValue()) {
            callback.invoke(str, true, false);
            return;
        }
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION"};
        if (Build.VERSION.SDK_INT < 31 || !PermissionHelper.hasPermissions(this.bridge.getContext(), strArr)) {
            callback.invoke(str, false, false);
        } else {
            callback.invoke(str, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsAlert$3(JsResult jsResult, DialogInterface dialogInterface, int i5) {
        dialogInterface.dismiss();
        jsResult.confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsAlert$4(JsResult jsResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$5(JsResult jsResult, DialogInterface dialogInterface, int i5) {
        dialogInterface.dismiss();
        jsResult.confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$6(JsResult jsResult, DialogInterface dialogInterface, int i5) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsConfirm$7(JsResult jsResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$10(JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        jsPromptResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$8(EditText editText, JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i5) {
        dialogInterface.dismiss();
        jsPromptResult.confirm(editText.getText().toString().trim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onJsPrompt$9(JsPromptResult jsPromptResult, DialogInterface dialogInterface, int i5) {
        dialogInterface.dismiss();
        jsPromptResult.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onPermissionRequest$2(PermissionRequest permissionRequest, Boolean bool) {
        if (bool.booleanValue()) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onShowFileChooser$12(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z4, Boolean bool) {
        if (bool.booleanValue()) {
            showMediaCaptureOrFilePicker(valueCallback, fileChooserParams, z4);
        } else {
            Logger.warn(Logger.tags("FileChooser"), "Camera permission not granted");
            valueCallback.onReceiveValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showFilePicker$15(ValueCallback valueCallback, d.a aVar) {
        Uri[] parseResult;
        Intent intent = aVar.h;
        int i5 = aVar.f1157g;
        if (i5 != -1 || intent.getClipData() == null) {
            parseResult = WebChromeClient.FileChooserParams.parseResult(i5, intent);
        } else {
            int itemCount = intent.getClipData().getItemCount();
            parseResult = new Uri[itemCount];
            for (int i6 = 0; i6 < itemCount; i6++) {
                parseResult[i6] = intent.getClipData().getItemAt(i6).getUri();
            }
        }
        valueCallback.onReceiveValue(parseResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showImageCapturePicker$13(Uri uri, ValueCallback valueCallback, d.a aVar) {
        valueCallback.onReceiveValue(aVar.f1157g == -1 ? new Uri[]{uri} : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showVideoCapturePicker$14(ValueCallback valueCallback, d.a aVar) {
        valueCallback.onReceiveValue(aVar.f1157g == -1 ? new Uri[]{aVar.h.getData()} : null);
    }

    private void showFilePicker(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent = fileChooserParams.createIntent();
        if (fileChooserParams.getMode() == 1) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        if (fileChooserParams.getAcceptTypes().length > 1 || createIntent.getType().startsWith(".")) {
            String[] validTypes = getValidTypes(fileChooserParams.getAcceptTypes());
            createIntent.putExtra("android.intent.extra.MIME_TYPES", validTypes);
            if (createIntent.getType().startsWith(".")) {
                createIntent.setType(validTypes[0]);
            }
        }
        try {
            this.activityListener = new e(valueCallback, 1);
            this.activityLauncher.a(createIntent);
        } catch (ActivityNotFoundException unused) {
            valueCallback.onReceiveValue(null);
        }
    }

    private boolean showImageCapturePicker(ValueCallback<Uri[]> valueCallback) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(this.bridge.getActivity().getPackageManager()) == null) {
            return false;
        }
        try {
            Uri createImageFileUri = createImageFileUri();
            intent.putExtra("output", createImageFileUri);
            this.activityListener = new o(2, createImageFileUri, valueCallback);
            this.activityLauncher.a(intent);
            return true;
        } catch (Exception e4) {
            Logger.error("Unable to create temporary media capture file: " + e4.getMessage());
            return false;
        }
    }

    private void showMediaCaptureOrFilePicker(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams, boolean z4) {
        if (z4 ? showVideoCapturePicker(valueCallback) : showImageCapturePicker(valueCallback)) {
            return;
        }
        Logger.warn(Logger.tags("FileChooser"), "Media capture intent could not be launched. Falling back to default file picker.");
        showFilePicker(valueCallback, fileChooserParams);
    }

    private boolean showVideoCapturePicker(ValueCallback<Uri[]> valueCallback) {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (intent.resolveActivity(this.bridge.getActivity().getPackageManager()) == null) {
            return false;
        }
        this.activityListener = new e(valueCallback, 0);
        this.activityLauncher.a(intent);
        return true;
    }

    public boolean isValidMsg(String str) {
        return (str.contains("%cresult %c") || str.contains("%cnative %c") || str.equalsIgnoreCase("console.groupEnd")) ? false : true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String tags = Logger.tags("Console");
        if (consoleMessage.message() == null || !isValidMsg(consoleMessage.message())) {
            return true;
        }
        String format = String.format("File: %s - Line %d - Msg: %s", consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()), consoleMessage.message());
        String name = consoleMessage.messageLevel().name();
        if ("ERROR".equalsIgnoreCase(name)) {
            Logger.error(tags, format, null);
            return true;
        }
        if ("WARNING".equalsIgnoreCase(name)) {
            Logger.warn(tags, format);
            return true;
        }
        if ("TIP".equalsIgnoreCase(name)) {
            Logger.debug(tags, format);
            return true;
        }
        Logger.info(tags, format);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        Logger.debug("onGeolocationPermissionsShowPrompt: DOING IT HERE FOR ORIGIN: " + str);
        String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
        if (PermissionHelper.hasPermissions(this.bridge.getContext(), strArr)) {
            callback.invoke(str, true, false);
            Logger.debug("onGeolocationPermissionsShowPrompt: has required permission");
        } else {
            this.permissionListener = new PermissionListener() { // from class: com.getcapacitor.i
                @Override // com.getcapacitor.BridgeWebChromeClient.PermissionListener
                public final void onPermissionSelect(Boolean bool) {
                    BridgeWebChromeClient.this.lambda$onGeolocationPermissionsShowPrompt$11(callback, str, bool);
                }
            };
            this.permissionLauncher.a(strArr);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.bridge.getActivity().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new f(jsResult, 0)).setOnCancelListener(new g(jsResult, 0));
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (this.bridge.getActivity().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        builder.setMessage(str2).setPositiveButton("OK", new f(jsResult, 1)).setNegativeButton("Cancel", new f(jsResult, 2)).setOnCancelListener(new g(jsResult, 1));
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
        if (this.bridge.getActivity().isFinishing()) {
            return true;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        builder.setMessage(str2).setView(editText).setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: com.getcapacitor.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                BridgeWebChromeClient.lambda$onJsPrompt$8(editText, jsPromptResult, dialogInterface, i5);
            }
        }).setNegativeButton("Cancel", new f(jsPromptResult, 3)).setOnCancelListener(new g(jsPromptResult, 2));
        builder.create().show();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.VIDEO_CAPTURE")) {
            arrayList.add("android.permission.CAMERA");
        }
        if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.AUDIO_CAPTURE")) {
            arrayList.add("android.permission.MODIFY_AUDIO_SETTINGS");
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant(permissionRequest.getResources());
            return;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.permissionListener = new l(permissionRequest);
        this.permissionLauncher.a(strArr);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
        super.onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, final WebChromeClient.FileChooserParams fileChooserParams) {
        List asList = Arrays.asList(fileChooserParams.getAcceptTypes());
        boolean isCaptureEnabled = fileChooserParams.isCaptureEnabled();
        final boolean z4 = false;
        boolean z5 = isCaptureEnabled && asList.contains("image/*");
        if (isCaptureEnabled && asList.contains("video/*")) {
            z4 = true;
        }
        if (!z5 && !z4) {
            showFilePicker(valueCallback, fileChooserParams);
            return true;
        }
        if (isMediaCaptureSupported()) {
            showMediaCaptureOrFilePicker(valueCallback, fileChooserParams, z4);
            return true;
        }
        this.permissionListener = new PermissionListener() { // from class: com.getcapacitor.h
            @Override // com.getcapacitor.BridgeWebChromeClient.PermissionListener
            public final void onPermissionSelect(Boolean bool) {
                BridgeWebChromeClient.this.lambda$onShowFileChooser$12(valueCallback, fileChooserParams, z4, bool);
            }
        };
        this.permissionLauncher.a(new String[]{"android.permission.CAMERA"});
        return true;
    }
}
