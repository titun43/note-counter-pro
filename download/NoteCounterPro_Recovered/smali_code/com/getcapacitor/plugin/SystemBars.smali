.class public Lcom/getcapacitor/plugin/SystemBars;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
.end annotation


# static fields
.field static final BAR_GESTURE_BAR:Ljava/lang/String; = "NavigationBar"

.field static final BAR_STATUS_BAR:Ljava/lang/String; = "StatusBar"

.field static final INSETS_HANDLING_CSS:Ljava/lang/String; = "css"

.field static final INSETS_HANDLING_DISABLE:Ljava/lang/String; = "disable"

.field static final STYLE_DARK:Ljava/lang/String; = "DARK"

.field static final STYLE_DEFAULT:Ljava/lang/String; = "DEFAULT"

.field static final STYLE_LIGHT:Ljava/lang/String; = "LIGHT"

.field private static final WEBVIEW_VERSION_WITH_SAFE_AREA_FIX:I = 0x8c

.field private static final WEBVIEW_VERSION_WITH_SAFE_AREA_KEYBOARD_FIX:I = 0x90

.field static final viewportMetaJSFunction:Ljava/lang/String; = "function capacitorSystemBarsCheckMetaViewport() {\n    const meta = document.querySelectorAll(\"meta[name=viewport]\");\n    if (meta.length == 0) {\n        return false;\n    }\n    // get the last found meta viewport tag\n    const metaContent = meta[meta.length - 1].content;\n    return metaContent.includes(\"viewport-fit=cover\");\n}\ncapacitorSystemBarsCheckMetaViewport();\n"


# instance fields
.field private currentGestureBarStyle:Ljava/lang/String;

.field private currentStatusBarStyle:Ljava/lang/String;

.field private hasViewportCover:Z

.field private insetsHandling:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "css"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/getcapacitor/plugin/SystemBars;->insetsHandling:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/getcapacitor/plugin/SystemBars;->hasViewportCover:Z

    .line 10
    .line 11
    const-string v0, "DEFAULT"

    .line 12
    .line 13
    iput-object v0, p0, Lcom/getcapacitor/plugin/SystemBars;->currentStatusBarStyle:Ljava/lang/String;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/getcapacitor/plugin/SystemBars;->currentGestureBarStyle:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic c(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/plugin/SystemBars;->lambda$initSystemBars$0(Ljava/lang/String;Z)V

    return-void
.end method

.method private calcSafeAreaInsets(Lf0/q1;)Ly/c;
    .locals 3

    .line 1
    const/16 v0, 0x287

    .line 2
    .line 3
    iget-object v1, p1, Lf0/q1;->a:Lf0/m1;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lf0/m1;->f(I)Ly/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    iget-object p1, p1, Lf0/q1;->a:Lf0/m1;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lf0/m1;->o(I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget p1, v0, Ly/c;->a:I

    .line 20
    .line 21
    iget v1, v0, Ly/c;->b:I

    .line 22
    .line 23
    iget v0, v0, Ly/c;->c:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {p1, v1, v0, v2}, Ly/c;->b(IIII)Ly/c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_0
    iget p1, v0, Ly/c;->a:I

    .line 32
    .line 33
    iget v1, v0, Ly/c;->b:I

    .line 34
    .line 35
    iget v2, v0, Ly/c;->c:I

    .line 36
    .line 37
    iget v0, v0, Ly/c;->d:I

    .line 38
    .line 39
    invoke-static {p1, v1, v2, v0}, Ly/c;->b(IIII)Ly/c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method

.method public static synthetic d(Lcom/getcapacitor/plugin/SystemBars;FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/getcapacitor/plugin/SystemBars;->lambda$injectSafeAreaCSS$7(FFFF)V

    return-void
.end method

.method public static synthetic e(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/getcapacitor/plugin/SystemBars;->lambda$setStyle$1(Ljava/lang/String;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method public static synthetic f(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/plugin/SystemBars;->lambda$hide$3(Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method public static synthetic g(Lcom/getcapacitor/plugin/SystemBars;Landroid/view/View;Lf0/q1;)Lf0/q1;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/plugin/SystemBars;->lambda$initWindowInsetsListener$6(Landroid/view/View;Lf0/q1;)Lf0/q1;

    move-result-object p0

    return-object p0
.end method

.method private getBottomInset(Ly/c;Z)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->getWebViewMajorVersion()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x90

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_0
    iget p1, p1, Ly/c;->d:I

    .line 18
    .line 19
    return p1
.end method

.method private getStyleForTheme()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg/k;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 14
    .line 15
    and-int/lit8 v0, v0, 0x30

    .line 16
    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const-string v0, "LIGHT"

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_0
    const-string v0, "DARK"

    .line 25
    .line 26
    return-object v0
.end method

.method private getWebViewMajorVersion()Ljava/lang/Integer;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-boolean v1, Lj1/f;->a:Z

    .line 6
    .line 7
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v2, 0x1a

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-lt v1, v2, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lg0/b;->d()Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    invoke-static {}, Lj1/f;->c()Landroid/content/pm/PackageInfo;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-object v1, v3

    .line 25
    :goto_0
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object v3, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :try_start_1
    const-string v1, "android.webkit.WebViewUpdateService"

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v4, "getCurrentWebViewPackageName"

    .line 37
    .line 38
    invoke-virtual {v1, v4, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    .line 48
    if-nez v1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :try_start_2
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 56
    .line 57
    .line 58
    move-result-object v3
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 59
    :catch_1
    :goto_1
    if-eqz v3, :cond_3

    .line 60
    .line 61
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    const-string v1, "\\."

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    aget-object v0, v0, v2

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :cond_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public static synthetic h(Lcom/getcapacitor/plugin/SystemBars;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->lambda$onDOMReady$5()V

    return-void
.end method

.method public static synthetic i(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/plugin/SystemBars;->lambda$show$2(Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method private initSafeAreaCSSVariables()V
    .locals 4

    .line 1
    const-string v0, "css"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/plugin/SystemBars;->insetsHandling:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x23

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/View;

    .line 30
    .line 31
    sget-object v1, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-static {v0}, Lf0/l0;->a(Landroid/view/View;)Lf0/q1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v0, Lf0/q1;->b:Lf0/q1;

    .line 39
    .line 40
    :goto_0
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-direct {p0, v0}, Lcom/getcapacitor/plugin/SystemBars;->calcSafeAreaInsets(Lf0/q1;)Ly/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget v1, v0, Ly/c;->b:I

    .line 47
    .line 48
    iget v2, v0, Ly/c;->c:I

    .line 49
    .line 50
    iget v3, v0, Ly/c;->d:I

    .line 51
    .line 52
    iget v0, v0, Ly/c;->a:I

    .line 53
    .line 54
    invoke-direct {p0, v1, v2, v3, v0}, Lcom/getcapacitor/plugin/SystemBars;->injectSafeAreaCSS(IIII)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method

.method private initSystemBars()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getConfig()Lcom/getcapacitor/PluginConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "style"

    .line 6
    .line 7
    const-string v2, "DEFAULT"

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/PluginConfig;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getConfig()Lcom/getcapacitor/PluginConfig;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "hidden"

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v1, v2, v3}, Lcom/getcapacitor/PluginConfig;->getBoolean(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getConfig()Lcom/getcapacitor/PluginConfig;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "insetsHandling"

    .line 35
    .line 36
    const-string v4, "css"

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Lcom/getcapacitor/PluginConfig;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    const-string v3, "disable"

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v5, "Unknown insetsHandling value \'"

    .line 60
    .line 61
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v2, "\'. Falling back to \'css\'."

    .line 68
    .line 69
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "SystemBars"

    .line 77
    .line 78
    invoke-static {v3, v2}, Lcom/getcapacitor/Logger;->warn(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v4, p0, Lcom/getcapacitor/plugin/SystemBars;->insetsHandling:Ljava/lang/String;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    :goto_0
    iput-object v2, p0, Lcom/getcapacitor/plugin/SystemBars;->insetsHandling:Ljava/lang/String;

    .line 85
    .line 86
    :goto_1
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->initWindowInsetsListener()V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->initSafeAreaCSSVariables()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, Lcom/getcapacitor/plugin/e;

    .line 97
    .line 98
    invoke-direct {v3, p0, v0, v1}, Lcom/getcapacitor/plugin/e;-><init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v3}, Lcom/getcapacitor/Bridge;->executeOnMainThread(Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method private initWindowInsetsListener()V
    .locals 3

    .line 1
    const-string v0, "disable"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/plugin/SystemBars;->insetsHandling:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/View;

    .line 25
    .line 26
    new-instance v1, Lcom/getcapacitor/plugin/c;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/plugin/c;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    sget-object v2, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lf0/k0;->i(Landroid/view/View;Lf0/t;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private injectSafeAreaCSS(IIII)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lg/k;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 14
    .line 15
    int-to-float p1, p1

    .line 16
    div-float v3, p1, v0

    .line 17
    .line 18
    int-to-float p1, p2

    .line 19
    div-float v4, p1, v0

    .line 20
    .line 21
    int-to-float p1, p3

    .line 22
    div-float v5, p1, v0

    .line 23
    .line 24
    int-to-float p1, p4

    .line 25
    div-float v6, p1, v0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v1, Lcom/getcapacitor/plugin/d;

    .line 32
    .line 33
    move-object v2, p0

    .line 34
    invoke-direct/range {v1 .. v6}, Lcom/getcapacitor/plugin/d;-><init>(Lcom/getcapacitor/plugin/SystemBars;FFFF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lcom/getcapacitor/Bridge;->executeOnMainThread(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static synthetic j(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/plugin/SystemBars;->lambda$onDOMReady$4(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$hide$3(Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/getcapacitor/plugin/SystemBars;->setHidden(ZLjava/lang/String;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private synthetic lambda$initSystemBars$0(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/getcapacitor/plugin/SystemBars;->setStyle(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p2, v0}, Lcom/getcapacitor/plugin/SystemBars;->setHidden(ZLjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private lambda$initWindowInsetsListener$6(Landroid/view/View;Lf0/q1;)Lf0/q1;
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->getWebViewMajorVersion()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x8c

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-lt v0, v1, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, Lcom/getcapacitor/plugin/SystemBars;->hasViewportCover:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    :goto_0
    iget-object v1, p2, Lf0/q1;->a:Lf0/m1;

    .line 22
    .line 23
    iget-object v3, p2, Lf0/q1;->a:Lf0/m1;

    .line 24
    .line 25
    const/16 v4, 0x287

    .line 26
    .line 27
    invoke-virtual {v1, v4}, Lf0/m1;->f(I)Ly/c;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/16 v5, 0x8

    .line 32
    .line 33
    invoke-virtual {v3, v5}, Lf0/m1;->f(I)Ly/c;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v3, v5}, Lf0/m1;->o(I)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v5, 0x1d

    .line 42
    .line 43
    const/16 v7, 0x1e

    .line 44
    .line 45
    const/16 v8, 0x1f

    .line 46
    .line 47
    const/16 v9, 0x22

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    iget v0, v6, Ly/c;->d:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v0, v2

    .line 57
    :goto_1
    invoke-virtual {p1, v2, v2, v2, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p2}, Lcom/getcapacitor/plugin/SystemBars;->calcSafeAreaInsets(Lf0/q1;)Ly/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget v0, p1, Ly/c;->b:I

    .line 65
    .line 66
    iget v2, p1, Ly/c;->c:I

    .line 67
    .line 68
    iget v6, p1, Ly/c;->d:I

    .line 69
    .line 70
    iget p1, p1, Ly/c;->a:I

    .line 71
    .line 72
    invoke-direct {p0, v0, v2, v6, p1}, Lcom/getcapacitor/plugin/SystemBars;->injectSafeAreaCSS(IIII)V

    .line 73
    .line 74
    .line 75
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    if-lt p1, v9, :cond_2

    .line 78
    .line 79
    new-instance p1, Lf0/c1;

    .line 80
    .line 81
    invoke-direct {p1, p2}, Lf0/c1;-><init>(Lf0/q1;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    if-lt p1, v8, :cond_3

    .line 86
    .line 87
    new-instance p1, Lf0/b1;

    .line 88
    .line 89
    invoke-direct {p1, p2}, Lf0/b1;-><init>(Lf0/q1;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    if-lt p1, v7, :cond_4

    .line 94
    .line 95
    new-instance p1, Lf0/a1;

    .line 96
    .line 97
    invoke-direct {p1, p2}, Lf0/a1;-><init>(Lf0/q1;)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    if-lt p1, v5, :cond_5

    .line 102
    .line 103
    new-instance p1, Lf0/z0;

    .line 104
    .line 105
    invoke-direct {p1, p2}, Lf0/z0;-><init>(Lf0/q1;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    new-instance p1, Lf0/y0;

    .line 110
    .line 111
    invoke-direct {p1, p2}, Lf0/y0;-><init>(Lf0/q1;)V

    .line 112
    .line 113
    .line 114
    :goto_2
    iget p2, v1, Ly/c;->a:I

    .line 115
    .line 116
    iget v0, v1, Ly/c;->b:I

    .line 117
    .line 118
    iget v2, v1, Ly/c;->c:I

    .line 119
    .line 120
    invoke-direct {p0, v1, v3}, Lcom/getcapacitor/plugin/SystemBars;->getBottomInset(Ly/c;Z)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-static {p2, v0, v2, v1}, Ly/c;->b(IIII)Ly/c;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p1, v4, p2}, Lf0/d1;->c(ILy/c;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lf0/d1;->b()Lf0/q1;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :cond_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 137
    .line 138
    const/16 v10, 0x23

    .line 139
    .line 140
    if-lt v0, v10, :cond_8

    .line 141
    .line 142
    iget v0, v1, Ly/c;->a:I

    .line 143
    .line 144
    iget v10, v1, Ly/c;->b:I

    .line 145
    .line 146
    iget v11, v1, Ly/c;->c:I

    .line 147
    .line 148
    if-eqz v3, :cond_7

    .line 149
    .line 150
    iget v1, v6, Ly/c;->d:I

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_7
    iget v1, v1, Ly/c;->d:I

    .line 154
    .line 155
    :goto_3
    invoke-virtual {p1, v0, v10, v11, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 156
    .line 157
    .line 158
    :cond_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 159
    .line 160
    if-lt p1, v9, :cond_9

    .line 161
    .line 162
    new-instance p1, Lf0/c1;

    .line 163
    .line 164
    invoke-direct {p1, p2}, Lf0/c1;-><init>(Lf0/q1;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_9
    if-lt p1, v8, :cond_a

    .line 169
    .line 170
    new-instance p1, Lf0/b1;

    .line 171
    .line 172
    invoke-direct {p1, p2}, Lf0/b1;-><init>(Lf0/q1;)V

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_a
    if-lt p1, v7, :cond_b

    .line 177
    .line 178
    new-instance p1, Lf0/a1;

    .line 179
    .line 180
    invoke-direct {p1, p2}, Lf0/a1;-><init>(Lf0/q1;)V

    .line 181
    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_b
    if-lt p1, v5, :cond_c

    .line 185
    .line 186
    new-instance p1, Lf0/z0;

    .line 187
    .line 188
    invoke-direct {p1, p2}, Lf0/z0;-><init>(Lf0/q1;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_c
    new-instance p1, Lf0/y0;

    .line 193
    .line 194
    invoke-direct {p1, p2}, Lf0/y0;-><init>(Lf0/q1;)V

    .line 195
    .line 196
    .line 197
    :goto_4
    invoke-static {v2, v2, v2, v2}, Ly/c;->b(IIII)Ly/c;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-virtual {p1, v4, p2}, Lf0/d1;->c(ILy/c;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, Lf0/d1;->b()Lf0/q1;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-direct {p0, p1}, Lcom/getcapacitor/plugin/SystemBars;->calcSafeAreaInsets(Lf0/q1;)Ly/c;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    iget v0, p2, Ly/c;->b:I

    .line 213
    .line 214
    iget v1, p2, Ly/c;->c:I

    .line 215
    .line 216
    iget v2, p2, Ly/c;->d:I

    .line 217
    .line 218
    iget p2, p2, Ly/c;->a:I

    .line 219
    .line 220
    invoke-direct {p0, v0, v1, v2, p2}, Lcom/getcapacitor/plugin/SystemBars;->injectSafeAreaCSS(IIII)V

    .line 221
    .line 222
    .line 223
    return-object p1
.end method

.method private synthetic lambda$injectSafeAreaCSS$7(FFFF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 12
    .line 13
    float-to-int p1, p1

    .line 14
    float-to-int p2, p2

    .line 15
    float-to-int p3, p3

    .line 16
    float-to-int p4, p4

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "try {\n  document.documentElement.style.setProperty(\"--safe-area-inset-top\", \""

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "px\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-right\", \""

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, "px\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-bottom\", \""

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p1, "px\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-left\", \""

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p1, "px\");\n} catch(e) { console.error(\'Error injecting safe area CSS:\', e); }\n"

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object p2, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 61
    .line 62
    invoke-virtual {p2}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    const/4 p3, 0x0

    .line 67
    invoke-virtual {p2, p1, p3}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method

.method private synthetic lambda$onDOMReady$4(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "true"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput-boolean p1, p0, Lcom/getcapacitor/plugin/SystemBars;->hasViewportCover:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private synthetic lambda$onDOMReady$5()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/getcapacitor/plugin/a;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, v2}, Lcom/getcapacitor/plugin/a;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    const-string v2, "function capacitorSystemBarsCheckMetaViewport() {\n    const meta = document.querySelectorAll(\"meta[name=viewport]\");\n    if (meta.length == 0) {\n        return false;\n    }\n    // get the last found meta viewport tag\n    const metaContent = meta[meta.length - 1].content;\n    return metaContent.includes(\"viewport-fit=cover\");\n}\ncapacitorSystemBarsCheckMetaViewport();\n"

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private synthetic lambda$setStyle$1(Ljava/lang/String;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/plugin/SystemBars;->setStyle(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private synthetic lambda$show$2(Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/getcapacitor/plugin/SystemBars;->setHidden(ZLjava/lang/String;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private setHidden(ZLjava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lk1/j;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lk1/j;-><init>(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v3, 0x23

    .line 21
    .line 22
    if-lt v1, v3, :cond_0

    .line 23
    .line 24
    new-instance v1, Lf0/t1;

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/16 v3, 0x1e

    .line 32
    .line 33
    if-lt v1, v3, :cond_1

    .line 34
    .line 35
    new-instance v1, Lf0/r1;

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 v3, 0x1a

    .line 43
    .line 44
    if-lt v1, v3, :cond_2

    .line 45
    .line 46
    new-instance v1, Lf0/s1;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    new-instance v1, Lf0/r1;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    .line 57
    .line 58
    .line 59
    :goto_0
    const/4 v0, 0x2

    .line 60
    const-string v2, "NavigationBar"

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    const-string v4, "StatusBar"

    .line 64
    .line 65
    const/16 v5, 0x207

    .line 66
    .line 67
    if-eqz p1, :cond_5

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {v1, v5}, La/a;->n(I)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    invoke-virtual {v1, v3}, La/a;->n(I)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_8

    .line 94
    .line 95
    invoke-virtual {v1, v0}, La/a;->n(I)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_5
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    invoke-virtual {v1, v5}, La/a;->x(I)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    invoke-virtual {v1, v3}, La/a;->x(I)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_8

    .line 124
    .line 125
    invoke-virtual {v1, v0}, La/a;->x(I)V

    .line 126
    .line 127
    .line 128
    :cond_8
    return-void
.end method

.method private setStyle(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 4
    const-string v0, "DEFAULT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->getStyleForTheme()Ljava/lang/String;

    move-result-object p1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    .line 8
    new-instance v2, Lk1/j;

    invoke-direct {v2, v1}, Lk1/j;-><init>(Landroid/view/View;)V

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x23

    if-lt v1, v3, :cond_1

    .line 10
    new-instance v1, Lf0/t1;

    const/4 v3, 0x1

    .line 11
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    goto :goto_0

    :cond_1
    const/16 v3, 0x1e

    if-lt v1, v3, :cond_2

    .line 12
    new-instance v1, Lf0/r1;

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    goto :goto_0

    :cond_2
    const/16 v3, 0x1a

    if-lt v1, v3, :cond_3

    .line 13
    new-instance v1, Lf0/s1;

    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    goto :goto_0

    .line 15
    :cond_3
    new-instance v1, Lf0/r1;

    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, v0, v2, v3}, Lf0/r1;-><init>(Landroid/view/Window;Lk1/j;I)V

    .line 17
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const-string v2, "DARK"

    if-nez v0, :cond_4

    const-string v0, "StatusBar"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 18
    :cond_4
    iput-object p1, p0, Lcom/getcapacitor/plugin/SystemBars;->currentStatusBarStyle:Ljava/lang/String;

    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 20
    invoke-virtual {v1, v0}, La/a;->v(Z)V

    .line 21
    :cond_5
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "NavigationBar"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 22
    :cond_6
    iput-object p1, p0, Lcom/getcapacitor/plugin/SystemBars;->currentGestureBarStyle:Ljava/lang/String;

    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    .line 24
    invoke-virtual {v1, p1}, La/a;->u(Z)V

    .line 25
    :cond_7
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x1010054

    invoke-virtual {p0, p2, v0}, Lcom/getcapacitor/plugin/SystemBars;->getThemeColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method


# virtual methods
.method public getThemeColor(Landroid/content/Context;I)I
    .locals 2

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {p1, p2, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 12
    .line 13
    .line 14
    iget p1, v0, Landroid/util/TypedValue;->data:I

    .line 15
    .line 16
    return p1
.end method

.method public handleOnConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/getcapacitor/Plugin;->handleOnConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/getcapacitor/plugin/SystemBars;->currentGestureBarStyle:Ljava/lang/String;

    .line 5
    .line 6
    const-string v0, "NavigationBar"

    .line 7
    .line 8
    invoke-direct {p0, p1, v0}, Lcom/getcapacitor/plugin/SystemBars;->setStyle(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/getcapacitor/plugin/SystemBars;->currentStatusBarStyle:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "StatusBar"

    .line 14
    .line 15
    invoke-direct {p0, p1, v0}, Lcom/getcapacitor/plugin/SystemBars;->setStyle(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public handleOnStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->handleOnStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Lcom/getcapacitor/plugin/SystemBars$1;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/getcapacitor/plugin/SystemBars$1;-><init>(Lcom/getcapacitor/plugin/SystemBars;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/getcapacitor/Bridge;->addWebViewListener(Lcom/getcapacitor/WebViewListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public hide(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "bar"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/getcapacitor/plugin/b;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/getcapacitor/plugin/b;-><init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/getcapacitor/Bridge;->executeOnMainThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public load()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "CapacitorSystemBarsAndroidInterface"

    .line 10
    .line 11
    invoke-virtual {v0, p0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->load()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/getcapacitor/plugin/SystemBars;->initSystemBars()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onDOMReady()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "css"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/plugin/SystemBars;->insetsHandling:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroidx/activity/o;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, p0, v2}, Landroidx/activity/o;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public setAnimation(Lcom/getcapacitor/PluginCall;)V
    .locals 0
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setStyle(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "bar"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2
    const-string v1, "style"

    const-string v2, "DEFAULT"

    invoke-virtual {p1, v1, v2}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    move-result-object v2

    new-instance v3, Lcom/getcapacitor/a;

    invoke-direct {v3, p0, v1, v0, p1}, Lcom/getcapacitor/a;-><init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    invoke-virtual {v2, v3}, Lcom/getcapacitor/Bridge;->executeOnMainThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public show(Lcom/getcapacitor/PluginCall;)V
    .locals 4
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const-string v0, "bar"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lcom/getcapacitor/plugin/b;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, p0, v0, p1, v3}, Lcom/getcapacitor/plugin/b;-><init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/getcapacitor/Bridge;->executeOnMainThread(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
