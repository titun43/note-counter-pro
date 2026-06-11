.class public Lorg/apache/cordova/CordovaInterfaceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/cordova/n;


# static fields
.field private static final TAG:Ljava/lang/String; = "CordovaInterfaceImpl"


# instance fields
.field protected activity:Lg/k;

.field protected activityResultCallback:Lorg/apache/cordova/p;

.field protected activityResultRequestCode:I

.field protected activityWasDestroyed:Z

.field protected initCallbackService:Ljava/lang/String;

.field protected permissionResultCallbacks:Lorg/apache/cordova/f;

.field protected pluginManager:Lorg/apache/cordova/k0;

.field protected savedPluginState:Landroid/os/Bundle;

.field protected savedResult:Lorg/apache/cordova/o;

.field protected threadPool:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lg/k;)V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/apache/cordova/CordovaInterfaceImpl;-><init>(Lg/k;Ljava/util/concurrent/ExecutorService;)V

    return-void
.end method

.method public constructor <init>(Lg/k;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityWasDestroyed:Z

    .line 4
    iput-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activity:Lg/k;

    .line 5
    iput-object p2, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->threadPool:Ljava/util/concurrent/ExecutorService;

    .line 6
    new-instance p1, Lorg/apache/cordova/f;

    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    iput v0, p1, Lorg/apache/cordova/f;->a:I

    .line 9
    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p1, Lorg/apache/cordova/f;->b:Landroid/util/SparseArray;

    .line 10
    iput-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->permissionResultCallbacks:Lorg/apache/cordova/f;

    return-void
.end method


# virtual methods
.method public getActivity()Lg/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activity:Lg/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activity:Lg/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public getThreadPool()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->threadPool:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasPermission(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activity:Lg/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public onActivityResult(IILandroid/content/Intent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultCallback:Lorg/apache/cordova/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->initCallbackService:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Lorg/apache/cordova/o;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, v2, Lorg/apache/cordova/o;->a:I

    .line 15
    .line 16
    iput p2, v2, Lorg/apache/cordova/o;->b:I

    .line 17
    .line 18
    iput-object p3, v2, Lorg/apache/cordova/o;->c:Landroid/content/Intent;

    .line 19
    .line 20
    iput-object v2, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->savedResult:Lorg/apache/cordova/o;

    .line 21
    .line 22
    iget-object v2, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->pluginManager:Lorg/apache/cordova/k0;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Lorg/apache/cordova/k0;->c(Ljava/lang/String;)Lorg/apache/cordova/p;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->savedPluginState:Landroid/os/Bundle;

    .line 33
    .line 34
    invoke-virtual {v0}, Lorg/apache/cordova/p;->getServiceName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    new-instance v2, Lorg/apache/cordova/ResumeCallback;

    .line 43
    .line 44
    invoke-virtual {v0}, Lorg/apache/cordova/p;->getServiceName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object v4, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->pluginManager:Lorg/apache/cordova/k0;

    .line 49
    .line 50
    invoke-direct {v2, v3, v4}, Lorg/apache/cordova/ResumeCallback;-><init>(Ljava/lang/String;Lorg/apache/cordova/k0;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1, v2}, Lorg/apache/cordova/p;->onRestoreStateForActivityResult(Landroid/os/Bundle;Lorg/apache/cordova/e;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    const/4 v1, 0x0

    .line 57
    iput-object v1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultCallback:Lorg/apache/cordova/p;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    iput-object v1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->initCallbackService:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->savedResult:Lorg/apache/cordova/o;

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/cordova/p;->onActivityResult(IILandroid/content/Intent;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    :cond_1
    const/4 p1, 0x0

    .line 71
    return p1
.end method

.method public onCordovaInit(Lorg/apache/cordova/k0;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->pluginManager:Lorg/apache/cordova/k0;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->savedResult:Lorg/apache/cordova/o;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget p1, v0, Lorg/apache/cordova/o;->a:I

    .line 8
    .line 9
    iget v1, v0, Lorg/apache/cordova/o;->b:I

    .line 10
    .line 11
    iget-object v0, v0, Lorg/apache/cordova/o;->c:Landroid/content/Intent;

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, Lorg/apache/cordova/CordovaInterfaceImpl;->onActivityResult(IILandroid/content/Intent;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-boolean v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityWasDestroyed:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityWasDestroyed:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const-string v0, "CoreAndroid"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/apache/cordova/k0;->c(Ljava/lang/String;)Lorg/apache/cordova/p;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lorg/apache/cordova/CoreAndroid;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance v0, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .line 40
    .line 41
    :try_start_0
    const-string v1, "action"

    .line 42
    .line 43
    const-string v2, "resume"

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception v1

    .line 50
    const-string v2, "CordovaInterfaceImpl"

    .line 51
    .line 52
    const-string v3, "Failed to create event message"

    .line 53
    .line 54
    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_0
    new-instance v1, Lorg/apache/cordova/l0;

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    invoke-direct {v1, v2, v0}, Lorg/apache/cordova/l0;-><init>(ILorg/json/JSONObject;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1}, Lorg/apache/cordova/CoreAndroid;->sendResumeEvent(Lorg/apache/cordova/l0;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method public onMessage(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p2, "exit"

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activity:Lg/k;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public onRequestPermissionResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->permissionResultCallbacks:Lorg/apache/cordova/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/apache/cordova/f;->a(I)Landroid/util/Pair;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lorg/apache/cordova/p;

    .line 12
    .line 13
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lorg/apache/cordova/p;->onRequestPermissionResult(I[Ljava/lang/String;[I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultCallback:Lorg/apache/cordova/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/apache/cordova/p;->getServiceName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "callbackService"

    .line 10
    .line 11
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->pluginManager:Lorg/apache/cordova/k0;

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    const-string v1, "plugin"

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Lorg/apache/cordova/k0;->a:Ljava/util/Map;

    .line 29
    .line 30
    monitor-enter v3

    .line 31
    :try_start_0
    iget-object v0, v0, Lorg/apache/cordova/k0;->a:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lorg/apache/cordova/p;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4}, Lorg/apache/cordova/p;->onSaveInstanceState()Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    invoke-virtual {v4}, Lorg/apache/cordova/p;->getServiceName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v2, v4, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw p1

    .line 78
    :cond_3
    return-void
.end method

.method public requestPermission(Lorg/apache/cordova/p;ILjava/lang/String;)V
    .locals 0

    .line 1
    filled-new-array {p3}, [Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lorg/apache/cordova/CordovaInterfaceImpl;->requestPermissions(Lorg/apache/cordova/p;I[Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public requestPermissions(Lorg/apache/cordova/p;I[Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->permissionResultCallbacks:Lorg/apache/cordova/f;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, v0, Lorg/apache/cordova/f;->a:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    iput v2, v0, Lorg/apache/cordova/f;->a:I

    .line 9
    .line 10
    iget-object v2, v0, Lorg/apache/cordova/f;->b:Landroid/util/SparseArray;

    .line 11
    .line 12
    new-instance v3, Landroid/util/Pair;

    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {v3, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    invoke-virtual {p0}, Lorg/apache/cordova/CordovaInterfaceImpl;->getActivity()Lg/k;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p3, v1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p1
.end method

.method public restoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "callbackService"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->initCallbackService:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "plugin"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->savedPluginState:Landroid/os/Bundle;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityWasDestroyed:Z

    .line 19
    .line 20
    return-void
.end method

.method public setActivityResultCallback(Lorg/apache/cordova/p;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultCallback:Lorg/apache/cordova/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultRequestCode:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-virtual {v0, v1, v2, v3}, Lorg/apache/cordova/p;->onActivityResult(IILandroid/content/Intent;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultCallback:Lorg/apache/cordova/p;

    .line 13
    .line 14
    return-void
.end method

.method public setActivityResultRequestCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultRequestCode:I

    .line 2
    .line 3
    return-void
.end method

.method public startActivityForResult(Lorg/apache/cordova/p;Landroid/content/Intent;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/cordova/CordovaInterfaceImpl;->setActivityResultCallback(Lorg/apache/cordova/p;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object p1, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activity:Lg/k;

    .line 5
    .line 6
    invoke-virtual {p1, p2, p3}, Landroidx/activity/s;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception p1

    .line 11
    const/4 p2, 0x0

    .line 12
    iput-object p2, p0, Lorg/apache/cordova/CordovaInterfaceImpl;->activityResultCallback:Lorg/apache/cordova/p;

    .line 13
    .line 14
    throw p1
.end method
