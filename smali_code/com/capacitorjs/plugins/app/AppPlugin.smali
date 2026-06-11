.class public Lcom/capacitorjs/plugins/app/AppPlugin;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    name = "App"
.end annotation


# static fields
.field private static final EVENT_BACK_BUTTON:Ljava/lang/String; = "backButton"

.field private static final EVENT_PAUSE:Ljava/lang/String; = "pause"

.field private static final EVENT_RESTORED_RESULT:Ljava/lang/String; = "appRestoredResult"

.field private static final EVENT_RESUME:Ljava/lang/String; = "resume"

.field private static final EVENT_STATE_CHANGE:Ljava/lang/String; = "appStateChange"

.field private static final EVENT_URL_OPEN:Ljava/lang/String; = "appUrlOpen"


# instance fields
.field private hasPausedEver:Z

.field private onBackPressedCallback:Landroidx/activity/y;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->hasPausedEver:Z

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic access$000(Lcom/capacitorjs/plugins/app/AppPlugin;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/getcapacitor/Plugin;->hasListeners(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$100(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lcom/capacitorjs/plugins/app/AppPlugin;Ljava/lang/String;Lcom/getcapacitor/JSObject;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$500(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/capacitorjs/plugins/app/AppPlugin;Lcom/getcapacitor/PluginResult;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/capacitorjs/plugins/app/AppPlugin;->lambda$load$1(Lcom/getcapacitor/PluginResult;)V

    return-void
.end method

.method public static synthetic d(Lcom/capacitorjs/plugins/app/AppPlugin;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/capacitorjs/plugins/app/AppPlugin;->lambda$load$0(Ljava/lang/Boolean;)V

    return-void
.end method

.method private synthetic lambda$load$0(Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "Firing change: "

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lcom/getcapacitor/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "isActive"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    .line 30
    .line 31
    .line 32
    const-string p1, "appStateChange"

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p0, p1, v0, v1}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private synthetic lambda$load$1(Lcom/getcapacitor/PluginResult;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getLogTag()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "Firing restored result"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/getcapacitor/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/getcapacitor/PluginResult;->getWrappedResult()Lcom/getcapacitor/JSObject;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x1

    .line 15
    const-string v1, "appRestoredResult"

    .line 16
    .line 17
    invoke-virtual {p0, v1, p1, v0}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private unsetAppListeners()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getApp()Lcom/getcapacitor/App;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lcom/getcapacitor/App;->setStatusChangeListener(Lcom/getcapacitor/App$AppStatusChangeListener;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getApp()Lcom/getcapacitor/App;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, v1}, Lcom/getcapacitor/App;->setAppRestoredListener(Lcom/getcapacitor/App$AppRestoredListener;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public exitApp(Lcom/getcapacitor/PluginCall;)V
    .locals 0
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/capacitorjs/plugins/app/AppPlugin;->unsetAppListeners()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/getcapacitor/Bridge;->getActivity()Lg/k;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public getAppLanguage(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lg/r;->a()Lb0/g;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lb0/g;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object v1, v1, Lb0/g;->a:Lb0/h;

    .line 17
    .line 18
    iget-object v1, v1, Lb0/h;->a:Landroid/os/LocaleList;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    :goto_1
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_1

    .line 39
    :goto_2
    const-string v2, "value"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public getInfo(Lcom/getcapacitor/PluginCall;)V
    .locals 5
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v1, v2}, Lcom/getcapacitor/util/InternalUtils;->getPackageInfo(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget v3, v2, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 35
    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :goto_0
    const-string v3, "name"

    .line 54
    .line 55
    invoke-virtual {v0, v3, v2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 56
    .line 57
    .line 58
    const-string v2, "id"

    .line 59
    .line 60
    iget-object v3, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v2, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 63
    .line 64
    .line 65
    const-string v2, "build"

    .line 66
    .line 67
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 68
    .line 69
    const/16 v4, 0x1c

    .line 70
    .line 71
    if-lt v3, v4, :cond_1

    .line 72
    .line 73
    invoke-static {v1}, Lb0/e;->d(Landroid/content/pm/PackageInfo;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 79
    .line 80
    int-to-long v3, v3

    .line 81
    :goto_1
    long-to-int v3, v3

    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0, v2, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 87
    .line 88
    .line 89
    const-string v2, "version"

    .line 90
    .line 91
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :catch_0
    const-string v0, "Unable to get App Info"

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public getLaunchUrl(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getIntentUri()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lcom/getcapacitor/JSObject;

    .line 10
    .line 11
    invoke-direct {v1}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "url"

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v1, v2, v0}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public getState(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/getcapacitor/Bridge;->getApp()Lcom/getcapacitor/App;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lcom/getcapacitor/App;->isActive()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "isActive"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public handleOnDestroy()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/capacitorjs/plugins/app/AppPlugin;->unsetAppListeners()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public handleOnNewIntent(Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/getcapacitor/Plugin;->handleOnNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v1, "android.intent.action.VIEW"

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "url"

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, v1, p1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 35
    .line 36
    .line 37
    const-string p1, "appUrlOpen"

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {p0, p1, v0, v1}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;Z)V

    .line 41
    .line 42
    .line 43
    :cond_1
    :goto_0
    return-void
.end method

.method public handleOnPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->handleOnPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->hasPausedEver:Z

    .line 6
    .line 7
    const-string v0, "pause"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public handleOnResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->handleOnResume()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->hasPausedEver:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "resume"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/getcapacitor/Plugin;->notifyListeners(Ljava/lang/String;Lcom/getcapacitor/JSObject;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public load()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getConfig()Lcom/getcapacitor/PluginConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "disableBackButtonHandler"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/PluginConfig;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/getcapacitor/Bridge;->getApp()Lcom/getcapacitor/App;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lcom/capacitorjs/plugins/app/a;

    .line 19
    .line 20
    invoke-direct {v2, p0}, Lcom/capacitorjs/plugins/app/a;-><init>(Lcom/capacitorjs/plugins/app/AppPlugin;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/getcapacitor/App;->setStatusChangeListener(Lcom/getcapacitor/App$AppStatusChangeListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/getcapacitor/Plugin;->bridge:Lcom/getcapacitor/Bridge;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/getcapacitor/Bridge;->getApp()Lcom/getcapacitor/App;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Lcom/capacitorjs/plugins/app/a;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lcom/capacitorjs/plugins/app/a;-><init>(Lcom/capacitorjs/plugins/app/AppPlugin;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lcom/getcapacitor/App;->setAppRestoredListener(Lcom/getcapacitor/App$AppRestoredListener;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lcom/capacitorjs/plugins/app/AppPlugin$1;

    .line 41
    .line 42
    xor-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    invoke-direct {v1, p0, v0}, Lcom/capacitorjs/plugins/app/AppPlugin$1;-><init>(Lcom/capacitorjs/plugins/app/AppPlugin;Z)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->onBackPressedCallback:Landroidx/activity/y;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Landroidx/activity/s;->getOnBackPressedDispatcher()Landroidx/activity/f0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-object v2, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->onBackPressedCallback:Landroidx/activity/y;

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroidx/activity/f0;->a(Landroidx/lifecycle/t;Landroidx/activity/y;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public minimizeApp(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getActivity()Lg/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public toggleBackButtonHandler(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->onBackPressedCallback:Landroidx/activity/y;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "onBackPressedCallback is not set"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string v0, "enabled"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/capacitorjs/plugins/app/AppPlugin;->onBackPressedCallback:Landroidx/activity/y;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {v1, v0}, Landroidx/activity/y;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
