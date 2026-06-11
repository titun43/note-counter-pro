.class public Lorg/apache/cordova/engine/SystemWebViewEngine;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/cordova/w;


# static fields
.field public static final TAG:Ljava/lang/String; = "SystemWebViewEngine"


# instance fields
.field public final a:Lorg/apache/cordova/engine/SystemWebView;

.field public final b:Lk1/j;

.field public c:Lorg/apache/cordova/r;

.field public d:Lorg/apache/cordova/i;

.field public e:Lorg/apache/cordova/v;

.field public f:Lorg/apache/cordova/u;

.field public g:Lorg/apache/cordova/n;

.field public h:Lorg/apache/cordova/k0;

.field public i:Lorg/apache/cordova/t;

.field public j:Lg/b0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/apache/cordova/r;)V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/cordova/engine/SystemWebView;

    invoke-direct {v0, p1}, Lorg/apache/cordova/engine/SystemWebView;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p2}, Lorg/apache/cordova/engine/SystemWebViewEngine;-><init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/r;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/engine/SystemWebView;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/engine/SystemWebViewEngine;-><init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/r;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/cordova/engine/SystemWebView;Lorg/apache/cordova/r;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p2, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 5
    iput-object p1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 6
    new-instance p2, Lk1/j;

    invoke-direct {p2, p1}, Lk1/j;-><init>(Lorg/apache/cordova/engine/SystemWebView;)V

    iput-object p2, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->b:Lk1/j;

    return-void
.end method


# virtual methods
.method public canGoBack()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public clearCache()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public clearHistory()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public destroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    iget-object v1, v0, Lorg/apache/cordova/engine/SystemWebView;->h:Lx4/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Lx4/c;->destroyLastDialog()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->j:Lg/b0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->j:Lg/b0;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catch_0
    move-exception v0

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "Error unregistering configuration receiver: "

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "SystemWebViewEngine"

    .line 45
    .line 46
    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/webkit/ValueCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getCookieManager()Lorg/apache/cordova/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->b:Lk1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCordovaWebView()Lorg/apache/cordova/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->f:Lorg/apache/cordova/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    return-object v0
.end method

.method public goBack()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public init(Lorg/apache/cordova/u;Lorg/apache/cordova/n;Lorg/apache/cordova/v;Lorg/apache/cordova/t;Lorg/apache/cordova/k0;Lorg/apache/cordova/h0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->g:Lorg/apache/cordova/n;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Lorg/apache/cordova/u;->getPreferences()Lorg/apache/cordova/r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->f:Lorg/apache/cordova/u;

    .line 16
    .line 17
    iput-object p2, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->g:Lorg/apache/cordova/n;

    .line 18
    .line 19
    iput-object p3, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->e:Lorg/apache/cordova/v;

    .line 20
    .line 21
    iput-object p4, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->i:Lorg/apache/cordova/t;

    .line 22
    .line 23
    iput-object p5, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->h:Lorg/apache/cordova/k0;

    .line 24
    .line 25
    iget-object p1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 26
    .line 27
    iput-object p0, p1, Lorg/apache/cordova/engine/SystemWebView;->i:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 28
    .line 29
    iget-object p3, p1, Lorg/apache/cordova/engine/SystemWebView;->g:Lx4/f;

    .line 30
    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    new-instance p3, Lx4/f;

    .line 34
    .line 35
    invoke-direct {p3, p0}, Lx4/f;-><init>(Lorg/apache/cordova/engine/SystemWebViewEngine;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p3}, Lorg/apache/cordova/engine/SystemWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p3, p1, Lorg/apache/cordova/engine/SystemWebView;->h:Lx4/c;

    .line 42
    .line 43
    if-nez p3, :cond_2

    .line 44
    .line 45
    new-instance p3, Lx4/c;

    .line 46
    .line 47
    invoke-direct {p3, p0}, Lx4/c;-><init>(Lorg/apache/cordova/engine/SystemWebViewEngine;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p3}, Lorg/apache/cordova/engine/SystemWebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object p1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 54
    .line 55
    const/4 p3, 0x0

    .line 56
    invoke-virtual {p1, p3}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p3}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Landroid/webkit/WebSettings$LayoutAlgorithm;->NORMAL:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 74
    .line 75
    invoke-virtual {p4, v1}, Landroid/webkit/WebSettings;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    .line 76
    .line 77
    .line 78
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p4, p3}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 84
    .line 85
    const-string v2, "AndroidInsecureFileModeEnabled"

    .line 86
    .line 87
    invoke-virtual {v1, v2, p3}, Lorg/apache/cordova/r;->a(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->b:Lk1/j;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Landroid/webkit/CookieManager;->setAcceptFileSchemeCookies(Z)V

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-virtual {p4, p3}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v2, "database"

    .line 119
    .line 120
    invoke-virtual {v1, v2, p3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    invoke-virtual {p3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 129
    .line 130
    .line 131
    iget-object v1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 132
    .line 133
    const-string v2, "InspectableWebview"

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    invoke-virtual {v1, v2, v3}, Lorg/apache/cordova/r;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-nez v1, :cond_4

    .line 141
    .line 142
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 155
    .line 156
    and-int/lit8 v1, v1, 0x2

    .line 157
    .line 158
    if-eqz v1, :cond_5

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_4
    const-string v2, "true"

    .line 162
    .line 163
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_5

    .line 168
    .line 169
    :goto_0
    :try_start_0
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :catch_0
    move-exception v1

    .line 174
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 175
    .line 176
    .line 177
    :cond_5
    :goto_1
    invoke-virtual {p4, p3}, Landroid/webkit/WebSettings;->setGeolocationDatabasePath(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p4}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p3

    .line 190
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 191
    .line 192
    const-string v1, "OverrideUserAgent"

    .line 193
    .line 194
    invoke-virtual {v0, v1, v3}, Lorg/apache/cordova/r;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-eqz v0, :cond_6

    .line 199
    .line 200
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_6
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->c:Lorg/apache/cordova/r;

    .line 205
    .line 206
    const-string v1, "AppendUserAgent"

    .line 207
    .line 208
    invoke-virtual {v0, v1, v3}, Lorg/apache/cordova/r;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    if-eqz v0, :cond_7

    .line 213
    .line 214
    new-instance v1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string p3, " "

    .line 223
    .line 224
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p3

    .line 234
    invoke-virtual {p4, p3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_7
    :goto_2
    new-instance p3, Landroid/content/IntentFilter;

    .line 238
    .line 239
    invoke-direct {p3}, Landroid/content/IntentFilter;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v0, "android.intent.action.CONFIGURATION_CHANGED"

    .line 243
    .line 244
    invoke-virtual {p3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->j:Lg/b0;

    .line 248
    .line 249
    if-nez v0, :cond_8

    .line 250
    .line 251
    new-instance v0, Lg/b0;

    .line 252
    .line 253
    const/4 v1, 0x3

    .line 254
    invoke-direct {v0, p4, v1}, Lg/b0;-><init>(Ljava/lang/Object;I)V

    .line 255
    .line 256
    .line 257
    iput-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->j:Lg/b0;

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    iget-object p4, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->j:Lg/b0;

    .line 264
    .line 265
    invoke-virtual {p1, p4, p3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 266
    .line 267
    .line 268
    :cond_8
    new-instance p1, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;

    .line 269
    .line 270
    new-instance p3, Lk1/j;

    .line 271
    .line 272
    const/16 p4, 0x18

    .line 273
    .line 274
    invoke-direct {p3, p0, p4}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 275
    .line 276
    .line 277
    invoke-direct {p1, p3}, Lorg/apache/cordova/NativeToJsMessageQueue$OnlineEventsBridgeMode;-><init>(Lorg/apache/cordova/g0;)V

    .line 278
    .line 279
    .line 280
    iget-object p3, p6, Lorg/apache/cordova/h0;->c:Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    new-instance p1, Lorg/apache/cordova/NativeToJsMessageQueue$EvalBridgeMode;

    .line 286
    .line 287
    invoke-direct {p1, p0, p2}, Lorg/apache/cordova/NativeToJsMessageQueue$EvalBridgeMode;-><init>(Lorg/apache/cordova/w;Lorg/apache/cordova/n;)V

    .line 288
    .line 289
    .line 290
    iget-object p2, p6, Lorg/apache/cordova/h0;->c:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    new-instance p1, Lorg/apache/cordova/i;

    .line 296
    .line 297
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 298
    .line 299
    .line 300
    const/4 p2, -0x1

    .line 301
    iput p2, p1, Lorg/apache/cordova/i;->c:I

    .line 302
    .line 303
    iput-object p5, p1, Lorg/apache/cordova/i;->a:Lorg/apache/cordova/k0;

    .line 304
    .line 305
    iput-object p6, p1, Lorg/apache/cordova/i;->b:Lorg/apache/cordova/h0;

    .line 306
    .line 307
    iput-object p1, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->d:Lorg/apache/cordova/i;

    .line 308
    .line 309
    iget-object p2, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 310
    .line 311
    new-instance p3, Lx4/a;

    .line 312
    .line 313
    invoke-direct {p3, p1}, Lx4/a;-><init>(Lorg/apache/cordova/i;)V

    .line 314
    .line 315
    .line 316
    const-string p1, "_cordovaNative"

    .line 317
    .line 318
    invoke-virtual {p2, p3, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 323
    .line 324
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 325
    .line 326
    .line 327
    throw p1
.end method

.method public loadUrl(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p2, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setPaused(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/webkit/WebView;->onPause()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/webkit/WebView;->pauseTimers()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->onResume()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/webkit/WebView;->resumeTimers()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public stopLoading()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
