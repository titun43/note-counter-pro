.class public Lx4/c;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Lorg/apache/cordova/engine/SystemWebViewEngine;

.field public c:Landroid/widget/LinearLayout;

.field public final d:Landroidx/emoji2/text/p;


# direct methods
.method public constructor <init>(Lorg/apache/cordova/engine/SystemWebViewEngine;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/32 v0, 0x6400000

    .line 5
    .line 6
    .line 7
    iput-wide v0, p0, Lx4/c;->a:J

    .line 8
    .line 9
    iput-object p1, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 10
    .line 11
    iget-object p1, p1, Lorg/apache/cordova/engine/SystemWebViewEngine;->a:Lorg/apache/cordova/engine/SystemWebView;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Landroidx/emoji2/text/p;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Landroidx/emoji2/text/p;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lx4/c;->d:Landroidx/emoji2/text/p;

    .line 23
    .line 24
    return-void
.end method

.method private createTempFile(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    const-string v0, ".jpg"

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "temp"

    .line 8
    .line 9
    invoke-static {v1, v0, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private createUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, ".cdv.core.file.provider"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {p1, v0, p2}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method


# virtual methods
.method public destroyLastDialog()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/c;->d:Landroidx/emoji2/text/p;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/AlertDialog;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public getVideoLoadingProgressView()Landroid/view/View;
    .locals 5

    .line 1
    iget-object v0, p0, Lx4/c;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    iget-object v1, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/apache/cordova/engine/SystemWebViewEngine;->getView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 25
    .line 26
    const/4 v3, -0x2

    .line 27
    invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 28
    .line 29
    .line 30
    const/16 v4, 0xd

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Landroid/widget/ProgressBar;

    .line 39
    .line 40
    invoke-virtual {v1}, Lorg/apache/cordova/engine/SystemWebViewEngine;->getView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v2, v1}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 52
    .line 53
    invoke-direct {v1, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 54
    .line 55
    .line 56
    const/16 v3, 0x11

    .line 57
    .line 58
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lx4/c;->c:Landroid/widget/LinearLayout;

    .line 67
    .line 68
    :cond_0
    iget-object v0, p0, Lx4/c;->c:Landroid/widget/LinearLayout;

    .line 69
    .line 70
    return-object v0
.end method

.method public onExceededDatabaseQuota(Ljava/lang/String;Ljava/lang/String;JJJLandroid/webkit/WebStorage$QuotaUpdater;)V
    .locals 0

    .line 1
    iget-wide p1, p0, Lx4/c;->a:J

    .line 2
    .line 3
    invoke-interface {p9, p1, p2}, Landroid/webkit/WebStorage$QuotaUpdater;->updateQuota(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {p2, p1, v0, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 10
    .line 11
    iget-object p1, p1, Lorg/apache/cordova/engine/SystemWebViewEngine;->h:Lorg/apache/cordova/k0;

    .line 12
    .line 13
    const-string p2, "Geolocation"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lorg/apache/cordova/k0;->c(Ljava/lang/String;)Lorg/apache/cordova/p;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lorg/apache/cordova/p;->hasPermisssion()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lorg/apache/cordova/p;->requestPermissions(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public onHideCustomView()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/cordova/engine/SystemWebViewEngine;->getCordovaWebView()Lorg/apache/cordova/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lorg/apache/cordova/u;->hideCustomView()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .line 1
    new-instance p1, Lu1/f;

    .line 2
    .line 3
    const/16 p2, 0x15

    .line 4
    .line 5
    invoke-direct {p1, p4, p2}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lx4/c;->d:Landroidx/emoji2/text/p;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p4, Landroid/app/AlertDialog$Builder;

    .line 14
    .line 15
    iget-object v0, p2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {p4, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 23
    .line 24
    .line 25
    const-string p3, "Alert"

    .line 26
    .line 27
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 28
    .line 29
    .line 30
    const/4 p3, 0x1

    .line 31
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lorg/apache/cordova/j;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p1, v1}, Lorg/apache/cordova/j;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    const v1, 0x104000a

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 44
    .line 45
    .line 46
    new-instance v0, Landroidx/fragment/app/p;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/p;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 53
    .line 54
    .line 55
    new-instance v0, Lorg/apache/cordova/k;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {v0, p1, v1}, Lorg/apache/cordova/k;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4, v0}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p4}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p2, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 69
    .line 70
    return p3
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .line 1
    new-instance p1, Lk1/j;

    .line 2
    .line 3
    const/16 p2, 0x17

    .line 4
    .line 5
    invoke-direct {p1, p4, p2}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, Lx4/c;->d:Landroidx/emoji2/text/p;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance p4, Landroid/app/AlertDialog$Builder;

    .line 14
    .line 15
    iget-object v0, p2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/content/Context;

    .line 18
    .line 19
    invoke-direct {p4, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 23
    .line 24
    .line 25
    const-string p3, "Confirm"

    .line 26
    .line 27
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 28
    .line 29
    .line 30
    const/4 p3, 0x1

    .line 31
    invoke-virtual {p4, p3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 32
    .line 33
    .line 34
    new-instance v0, Lorg/apache/cordova/l;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p1, v1}, Lorg/apache/cordova/l;-><init>(Lk1/j;I)V

    .line 38
    .line 39
    .line 40
    const v1, 0x104000a

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 44
    .line 45
    .line 46
    new-instance v0, Lorg/apache/cordova/l;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, p1, v1}, Lorg/apache/cordova/l;-><init>(Lk1/j;I)V

    .line 50
    .line 51
    .line 52
    const/high16 v1, 0x1040000

    .line 53
    .line 54
    invoke-virtual {p4, v1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 55
    .line 56
    .line 57
    new-instance v0, Landroidx/fragment/app/p;

    .line 58
    .line 59
    const/4 v1, 0x2

    .line 60
    invoke-direct {v0, p1, v1}, Landroidx/fragment/app/p;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p4, v0}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 64
    .line 65
    .line 66
    new-instance v0, Lorg/apache/cordova/k;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v0, p1, v1}, Lorg/apache/cordova/k;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, v0}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p4}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p2, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 80
    .line 81
    return p3
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 8

    .line 1
    iget-object p1, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 2
    .line 3
    iget-object v0, p1, Lorg/apache/cordova/engine/SystemWebViewEngine;->d:Lorg/apache/cordova/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    const-string v1, "gap:"

    .line 13
    .line 14
    invoke-virtual {p4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_0
    new-instance p2, Lorg/json/JSONArray;

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    invoke-virtual {p4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {p2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->getInt(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p2, p1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x3

    .line 44
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    .line 48
    move-object v5, p3

    .line 49
    :try_start_1
    invoke-virtual/range {v0 .. v5}, Lorg/apache/cordova/i;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-nez p2, :cond_9

    .line 54
    .line 55
    const-string p2, ""
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 56
    .line 57
    goto/16 :goto_b

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    :goto_0
    move-object p2, v0

    .line 61
    goto :goto_2

    .line 62
    :catch_1
    move-exception v0

    .line 63
    :goto_1
    move-object p2, v0

    .line 64
    goto :goto_3

    .line 65
    :catch_2
    move-exception v0

    .line 66
    move-object v5, p3

    .line 67
    goto :goto_0

    .line 68
    :catch_3
    move-exception v0

    .line 69
    move-object v5, p3

    .line 70
    goto :goto_1

    .line 71
    :goto_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    goto :goto_4

    .line 75
    :goto_3
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    :goto_4
    const-string p2, ""

    .line 79
    .line 80
    goto/16 :goto_b

    .line 81
    .line 82
    :cond_0
    move-object v5, p3

    .line 83
    if-eqz p4, :cond_2

    .line 84
    .line 85
    const-string p3, "gap_bridge_mode:"

    .line 86
    .line 87
    invoke-virtual {p4, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-eqz p3, :cond_2

    .line 92
    .line 93
    const/16 p2, 0x10

    .line 94
    .line 95
    :try_start_2
    invoke-virtual {p4, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    invoke-virtual {v0, p2}, Lorg/apache/cordova/i;->b(I)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-nez p2, :cond_1

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_1
    iget-object p2, v0, Lorg/apache/cordova/i;->b:Lorg/apache/cordova/h0;

    .line 115
    .line 116
    invoke-virtual {p2, p3}, Lorg/apache/cordova/h0;->f(I)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_4

    .line 117
    .line 118
    .line 119
    goto :goto_7

    .line 120
    :catch_4
    move-exception v0

    .line 121
    move-object p2, v0

    .line 122
    goto :goto_5

    .line 123
    :catch_5
    move-exception v0

    .line 124
    move-object p2, v0

    .line 125
    goto :goto_6

    .line 126
    :goto_5
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 127
    .line 128
    .line 129
    goto :goto_7

    .line 130
    :goto_6
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 131
    .line 132
    .line 133
    :goto_7
    const-string p2, ""

    .line 134
    .line 135
    goto/16 :goto_b

    .line 136
    .line 137
    :cond_2
    const/4 p3, 0x0

    .line 138
    const/16 v1, 0x9

    .line 139
    .line 140
    if-eqz p4, :cond_4

    .line 141
    .line 142
    const-string v2, "gap_poll:"

    .line 143
    .line 144
    invoke-virtual {p4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eqz v2, :cond_4

    .line 149
    .line 150
    invoke-virtual {p4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    :try_start_3
    const-string v1, "1"

    .line 159
    .line 160
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    invoke-virtual {v0, p2}, Lorg/apache/cordova/i;->b(I)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-nez p2, :cond_3

    .line 169
    .line 170
    move-object p2, p3

    .line 171
    goto :goto_8

    .line 172
    :cond_3
    iget-object p2, v0, Lorg/apache/cordova/i;->b:Lorg/apache/cordova/h0;

    .line 173
    .line 174
    invoke-virtual {p2, v1}, Lorg/apache/cordova/h0;->d(Z)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    :goto_8
    if-nez p2, :cond_9

    .line 179
    .line 180
    const-string p2, ""
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_6

    .line 181
    .line 182
    goto/16 :goto_b

    .line 183
    .line 184
    :catch_6
    move-exception v0

    .line 185
    move-object p2, v0

    .line 186
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 187
    .line 188
    .line 189
    const-string p2, ""

    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_4
    if-eqz p4, :cond_8

    .line 194
    .line 195
    const-string v2, "gap_init:"

    .line 196
    .line 197
    invoke-virtual {p4, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_8

    .line 202
    .line 203
    iget-object p3, v0, Lorg/apache/cordova/i;->a:Lorg/apache/cordova/k0;

    .line 204
    .line 205
    iget-object v2, p3, Lorg/apache/cordova/k0;->b:Ljava/util/Map;

    .line 206
    .line 207
    monitor-enter v2

    .line 208
    :try_start_4
    iget-object v3, p3, Lorg/apache/cordova/k0;->b:Ljava/util/Map;

    .line 209
    .line 210
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_6

    .line 223
    .line 224
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Lorg/apache/cordova/i0;

    .line 229
    .line 230
    iget-object v7, p3, Lorg/apache/cordova/k0;->a:Ljava/util/Map;

    .line 231
    .line 232
    iget-object v4, v4, Lorg/apache/cordova/i0;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, Lorg/apache/cordova/p;

    .line 239
    .line 240
    if-eqz v4, :cond_5

    .line 241
    .line 242
    invoke-virtual {v4, p2}, Lorg/apache/cordova/p;->shouldAllowBridgeAccess(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-eqz v4, :cond_5

    .line 247
    .line 248
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 249
    .line 250
    .line 251
    move-result p3

    .line 252
    monitor-exit v2

    .line 253
    goto :goto_9

    .line 254
    :catchall_0
    move-exception v0

    .line 255
    move-object p1, v0

    .line 256
    goto :goto_a

    .line 257
    :cond_6
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 258
    invoke-virtual {p3}, Lorg/apache/cordova/k0;->b()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p3

    .line 262
    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 263
    .line 264
    .line 265
    move-result p3

    .line 266
    :goto_9
    if-eqz p3, :cond_7

    .line 267
    .line 268
    invoke-virtual {p4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    iget-object p3, v0, Lorg/apache/cordova/i;->b:Lorg/apache/cordova/h0;

    .line 277
    .line 278
    invoke-virtual {p3, p2}, Lorg/apache/cordova/h0;->f(I)V

    .line 279
    .line 280
    .line 281
    new-instance p2, Ljava/security/SecureRandom;

    .line 282
    .line 283
    invoke-direct {p2}, Ljava/security/SecureRandom;-><init>()V

    .line 284
    .line 285
    .line 286
    const p3, 0x7fffffff

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2, p3}, Ljava/util/Random;->nextInt(I)I

    .line 290
    .line 291
    .line 292
    move-result p2

    .line 293
    iput p2, v0, Lorg/apache/cordova/i;->c:I

    .line 294
    .line 295
    iget p2, v0, Lorg/apache/cordova/i;->c:I

    .line 296
    .line 297
    const-string p3, ""

    .line 298
    .line 299
    invoke-static {p2, p3}, Landroidx/emoji2/text/u;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    goto :goto_b

    .line 304
    :cond_7
    const-string p3, "CordovaBridge"

    .line 305
    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v1, "gap_init called from restricted origin: "

    .line 309
    .line 310
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    const-string p2, ""

    .line 324
    .line 325
    goto :goto_b

    .line 326
    :goto_a
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 327
    throw p1

    .line 328
    :cond_8
    move-object p2, p3

    .line 329
    :cond_9
    :goto_b
    if-eqz p2, :cond_a

    .line 330
    .line 331
    invoke-virtual {p5, p2}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_a
    iget-object p2, p0, Lx4/c;->d:Landroidx/emoji2/text/p;

    .line 336
    .line 337
    new-instance p3, Lu1/f;

    .line 338
    .line 339
    const/16 v0, 0x16

    .line 340
    .line 341
    invoke-direct {p3, p5, v0}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    new-instance p5, Landroid/app/AlertDialog$Builder;

    .line 348
    .line 349
    iget-object v0, p2, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, Landroid/content/Context;

    .line 352
    .line 353
    invoke-direct {p5, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p5, v5}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 357
    .line 358
    .line 359
    new-instance v1, Landroid/widget/EditText;

    .line 360
    .line 361
    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 362
    .line 363
    .line 364
    if-eqz p4, :cond_b

    .line 365
    .line 366
    invoke-virtual {v1, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 367
    .line 368
    .line 369
    :cond_b
    invoke-virtual {p5, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p5, v6}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 373
    .line 374
    .line 375
    new-instance p4, Lorg/apache/cordova/m;

    .line 376
    .line 377
    invoke-direct {p4, v1, p3}, Lorg/apache/cordova/m;-><init>(Landroid/widget/EditText;Lu1/f;)V

    .line 378
    .line 379
    .line 380
    const v0, 0x104000a

    .line 381
    .line 382
    .line 383
    invoke-virtual {p5, v0, p4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 384
    .line 385
    .line 386
    new-instance p4, Lorg/apache/cordova/j;

    .line 387
    .line 388
    const/4 v0, 0x1

    .line 389
    invoke-direct {p4, p3, v0}, Lorg/apache/cordova/j;-><init>(Ljava/lang/Object;I)V

    .line 390
    .line 391
    .line 392
    const/high16 p3, 0x1040000

    .line 393
    .line 394
    invoke-virtual {p5, p3, p4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {p5}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 398
    .line 399
    .line 400
    move-result-object p3

    .line 401
    iput-object p3, p2, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 402
    .line 403
    :goto_c
    return p1
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/apache/cordova/engine/SystemWebViewEngine;->getCordovaWebView()Lorg/apache/cordova/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1, p2}, Lorg/apache/cordova/u;->showCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->createIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    :cond_0
    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    .line 17
    .line 18
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    array-length v1, v0

    .line 26
    if-le v1, v2, :cond_1

    .line 27
    .line 28
    const-string v1, "*/*"

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    const-string v1, "android.intent.extra.MIME_TYPES"

    .line 34
    .line 35
    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    iget-object v0, p0, Lx4/c;->b:Lorg/apache/cordova/engine/SystemWebViewEngine;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz p3, :cond_2

    .line 46
    .line 47
    new-instance p3, Landroid/content/Intent;

    .line 48
    .line 49
    const-string v3, "android.media.action.IMAGE_CAPTURE"

    .line 50
    .line 51
    invoke-direct {p3, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lorg/apache/cordova/engine/SystemWebViewEngine;->getView()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const-string v5, "android.hardware.camera.any"

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {p3, v4}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    :try_start_0
    invoke-direct {p0, v3}, Lx4/c;->createTempFile(Landroid/content/Context;)Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v3, v4}, Lx4/c;->createUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 92
    .line 93
    .line 94
    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 95
    :try_start_1
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    const-string v4, "output"

    .line 99
    .line 100
    invoke-virtual {p3, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catch_0
    move-exception p3

    .line 105
    goto :goto_0

    .line 106
    :catch_1
    move-exception p3

    .line 107
    move-object v3, v1

    .line 108
    :goto_0
    const-string v4, "SystemWebChromeClient"

    .line 109
    .line 110
    const-string v5, "Unable to create temporary file for photo capture"

    .line 111
    .line 112
    invoke-static {v4, v5, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 113
    .line 114
    .line 115
    move-object p3, v1

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    move-object p3, v1

    .line 118
    move-object v3, p3

    .line 119
    :goto_1
    invoke-static {p1, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p3, :cond_3

    .line 124
    .line 125
    const-string v4, "android.intent.extra.INITIAL_INTENTS"

    .line 126
    .line 127
    filled-new-array {p3}, [Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    invoke-virtual {p1, v4, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    :cond_3
    :try_start_2
    iget-object p3, v0, Lorg/apache/cordova/engine/SystemWebViewEngine;->g:Lorg/apache/cordova/n;

    .line 135
    .line 136
    new-instance v0, Lx4/b;

    .line 137
    .line 138
    invoke-direct {v0, v3, p2}, Lx4/b;-><init>(Landroid/net/Uri;Landroid/webkit/ValueCallback;)V

    .line 139
    .line 140
    .line 141
    const/16 v3, 0x1435

    .line 142
    .line 143
    invoke-interface {p3, v0, p1, v3}, Lorg/apache/cordova/n;->startActivityForResult(Lorg/apache/cordova/p;Landroid/content/Intent;I)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catch_2
    invoke-interface {p2, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_2
    return v2
.end method
