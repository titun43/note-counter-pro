.class public final synthetic La2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, La2/b;->g:I

    iput-object p2, p0, La2/b;->h:Ljava/lang/Object;

    iput-object p3, p0, La2/b;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, La2/b;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La2/b;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La2/b;->h:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lk/u0;

    .line 12
    .line 13
    check-cast v2, Landroid/graphics/Typeface;

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Lk/u0;->b(Landroid/graphics/Typeface;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast v3, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 20
    .line 21
    check-cast v2, Landroid/app/job/JobParameters;

    .line 22
    .line 23
    sget v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->g:I

    .line 24
    .line 25
    invoke-virtual {v3, v2, v1}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast v3, Lg/p;

    .line 30
    .line 31
    check-cast v2, Ljava/lang/Runnable;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lg/p;->a()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    invoke-virtual {v3}, Lg/p;->a()V

    .line 45
    .line 46
    .line 47
    throw v0

    .line 48
    :pswitch_2
    check-cast v3, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl$CapacitorEvalBridgeMode;

    .line 49
    .line 50
    check-cast v2, Lorg/apache/cordova/h0;

    .line 51
    .line 52
    invoke-static {v3, v2}, Lcom/getcapacitor/cordova/MockCordovaWebViewImpl$CapacitorEvalBridgeMode;->a(Lcom/getcapacitor/cordova/MockCordovaWebViewImpl$CapacitorEvalBridgeMode;Lorg/apache/cordova/h0;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_3
    check-cast v3, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

    .line 57
    .line 58
    check-cast v2, Lcom/getcapacitor/PluginCall;

    .line 59
    .line 60
    invoke-static {v3, v2}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->b(Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;Lcom/getcapacitor/PluginCall;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_4
    check-cast v3, Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    .line 65
    .line 66
    check-cast v2, Lcom/getcapacitor/PluginCall;

    .line 67
    .line 68
    invoke-static {v3, v2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->d(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/PluginCall;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_5
    check-cast v3, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;

    .line 73
    .line 74
    check-cast v2, Ljava/lang/Exception;

    .line 75
    .line 76
    invoke-static {v3, v2}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->b(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Ljava/lang/Exception;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_6
    check-cast v3, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;

    .line 81
    .line 82
    check-cast v2, Lcom/getcapacitor/JSObject;

    .line 83
    .line 84
    invoke-static {v3, v2}, Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation;->c(Lcom/capacitorjs/plugins/filesystem/LegacyFilesystemImplementation$FilesystemDownloadCallback;Lcom/getcapacitor/JSObject;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_7
    check-cast v3, Landroid/view/ViewGroup;

    .line 89
    .line 90
    const-string v0, "$container"

    .line 91
    .line 92
    invoke-static {v3, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :pswitch_8
    check-cast v3, Landroidx/activity/s;

    .line 101
    .line 102
    check-cast v2, Landroidx/activity/f0;

    .line 103
    .line 104
    invoke-virtual {v3}, Landroidx/activity/s;->getLifecycle()Landroidx/lifecycle/o;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v4, Landroidx/activity/g;

    .line 109
    .line 110
    invoke-direct {v4, v1, v2, v3}, Landroidx/activity/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v4}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_9
    check-cast v3, Landroid/app/Activity;

    .line 118
    .line 119
    check-cast v2, Lcom/getcapacitor/PluginCall;

    .line 120
    .line 121
    invoke-static {v3, v2}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->d(Landroid/app/Activity;Lcom/getcapacitor/PluginCall;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
