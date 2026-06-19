.class public final Ly1/w;
.super Ly1/b;
.source "SourceFile"


# instance fields
.field public volatile A:I

.field public volatile B:Lcom/google/android/gms/internal/play_billing/zzav;

.field public volatile C:Ly1/v;

.field public volatile D:Lcom/google/android/gms/internal/play_billing/zzew;

.field public final z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ly0/c;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ly1/b;-><init>(Ly0/c;Landroid/content/Context;)V

    const/4 p1, 0x0

    iput p1, p0, Ly1/w;->A:I

    iput-object p2, p0, Ly1/w;->z:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>(Ly0/c;Landroid/content/Context;Ly1/i;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Ly1/b;-><init>(Ly0/c;Landroid/content/Context;Ly1/i;)V

    const/4 p1, 0x0

    iput p1, p0, Ly1/w;->A:I

    iput-object p2, p0, Ly1/w;->z:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final A(IILy1/e;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3}, Ly1/z;->b(IILy1/e;)Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string p2, "ApiFailure should not be null"

    .line 6
    .line 7
    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final B(ILjava/util/function/Consumer;Ljava/lang/Runnable;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Ly1/w;->z(I)Lcom/google/android/gms/internal/play_billing/zzeu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v2, p0, Ly1/w;->D:Lcom/google/android/gms/internal/play_billing/zzew;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lcom/google/android/gms/internal/play_billing/zzfb;->zzb(Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/play_billing/zzew;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iput-object v2, p0, Ly1/w;->D:Lcom/google/android/gms/internal/play_billing/zzew;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_3

    .line 25
    :cond_0
    :goto_0
    iget-object v2, p0, Ly1/w;->D:Lcom/google/android/gms/internal/play_billing/zzew;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    const-wide/16 v3, 0x6f54

    .line 29
    .line 30
    invoke-static {v0, v3, v4, v1, v2}, Lcom/google/android/gms/internal/play_billing/zzel;->zzb(Lcom/google/android/gms/internal/play_billing/zzeu;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/android/gms/internal/play_billing/zzeu;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Ly1/t;

    .line 35
    .line 36
    invoke-direct {v1, p0, p1, p2, p3}, Ly1/t;-><init>(Ly1/w;ILjava/util/function/Consumer;Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    monitor-enter p0

    .line 40
    :try_start_1
    iget-object p1, p0, Ly1/b;->x:Lcom/google/android/gms/internal/play_billing/zzev;

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/zzfb;->zza(Ljava/util/concurrent/ExecutorService;)Lcom/google/android/gms/internal/play_billing/zzev;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Ly1/b;->x:Lcom/google/android/gms/internal/play_billing/zzev;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception p1

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_1
    iget-object p1, p0, Ly1/b;->x:Lcom/google/android/gms/internal/play_billing/zzev;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/play_billing/zzel;->zzc(Lcom/google/android/gms/internal/play_billing/zzeu;Lcom/google/android/gms/internal/play_billing/zzej;Ljava/util/concurrent/Executor;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    throw p1

    .line 66
    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    throw p1
.end method

.method public final a(La2/c;Landroidx/emoji2/text/r;)V
    .locals 7

    .line 1
    new-instance v0, Ly1/r;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Ly1/r;-><init>(La2/c;Landroidx/emoji2/text/r;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lc0/n;

    .line 7
    .line 8
    const/16 v5, 0x9

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v2, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v3, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lc0/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x4

    .line 18
    invoke-virtual {p0, p1, v0, v1}, Ly1/w;->B(ILjava/util/function/Consumer;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final b(Lg/k;Ld1/a;)Ly1/e;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Ly1/w;->z(I)Lcom/google/android/gms/internal/play_billing/zzeu;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "BillingClientTesting"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x1c

    .line 10
    .line 11
    :try_start_0
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v6, 0x6f54

    .line 14
    .line 15
    invoke-interface {v1, v6, v7, v5}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v3
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_2

    .line 26
    :catch_0
    move-exception v1

    .line 27
    goto :goto_0

    .line 28
    :catch_1
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :goto_0
    instance-of v5, v1, Ljava/lang/InterruptedException;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 39
    .line 40
    .line 41
    :cond_0
    const/16 v5, 0x6b

    .line 42
    .line 43
    sget-object v6, Ly1/b0;->q:Ly1/e;

    .line 44
    .line 45
    invoke-virtual {p0, v5, v4, v6}, Ly1/w;->A(IILy1/e;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "An error occurred while retrieving billing override."

    .line 49
    .line 50
    invoke-static {v2, v4, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :goto_1
    const/16 v5, 0x72

    .line 55
    .line 56
    sget-object v6, Ly1/b0;->q:Ly1/e;

    .line 57
    .line 58
    invoke-virtual {p0, v5, v4, v6}, Ly1/w;->A(IILy1/e;)V

    .line 59
    .line 60
    .line 61
    const-string v4, "Asynchronous call to Billing Override Service timed out."

    .line 62
    .line 63
    invoke-static {v2, v4, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    if-lez v3, :cond_1

    .line 67
    .line 68
    const-string p1, "Billing override value was set by a license tester."

    .line 69
    .line 70
    invoke-static {v3, p1}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/16 p2, 0x69

    .line 75
    .line 76
    invoke-virtual {p0, p2, v0, p1}, Ly1/w;->A(IILy1/e;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Ly1/b;->v(Ly1/e;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_1
    :try_start_1
    invoke-super {p0, p1, p2}, Ly1/b;->b(Lg/k;Ld1/a;)Ly1/e;

    .line 84
    .line 85
    .line 86
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 87
    goto :goto_3

    .line 88
    :catch_2
    move-exception p1

    .line 89
    sget-object p2, Ly1/b0;->g:Ly1/e;

    .line 90
    .line 91
    const/16 v1, 0x73

    .line 92
    .line 93
    invoke-virtual {p0, v1, v0, p2}, Ly1/w;->A(IILy1/e;)V

    .line 94
    .line 95
    .line 96
    const-string v0, "An internal error occurred."

    .line 97
    .line 98
    invoke-static {v2, v0, p1}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    move-object p1, p2

    .line 102
    :goto_3
    return-object p1
.end method

.method public final c(Lu1/f;Lcom/getcapacitor/plugin/c;)V
    .locals 7

    .line 1
    new-instance v0, Ly1/q;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ly1/q;-><init>(Lcom/getcapacitor/plugin/c;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lc0/n;

    .line 7
    .line 8
    const/16 v5, 0x8

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    move-object v2, p0

    .line 12
    move-object v3, p1

    .line 13
    move-object v4, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lc0/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x7

    .line 18
    invoke-virtual {p0, p1, v0, v1}, Ly1/w;->B(ILjava/util/function/Consumer;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final e(Ly1/c;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ly1/w;->y()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "BillingClientTesting"

    .line 11
    .line 12
    const-string v2, "Billing Override Service connection is valid. No need to re-initialize."

    .line 13
    .line 14
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ly1/z;->d(I)Lcom/google/android/gms/internal/play_billing/zzkd;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "ApiSuccess should not be null"

    .line 22
    .line 23
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/p;->I(Lcom/google/android/gms/internal/play_billing/zzkd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    monitor-exit p0

    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    :try_start_1
    iget v0, p0, Ly1/w;->A:I

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    if-ne v0, v2, :cond_1

    .line 41
    .line 42
    const-string v0, "BillingClientTesting"

    .line 43
    .line 44
    const-string v1, "Client is already in the process of connecting to Billing Override Service."

    .line 45
    .line 46
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit p0

    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :cond_1
    :try_start_2
    iget v0, p0, Ly1/w;->A:I

    .line 53
    .line 54
    const/4 v3, 0x3

    .line 55
    if-ne v0, v3, :cond_2

    .line 56
    .line 57
    const-string v0, "BillingClientTesting"

    .line 58
    .line 59
    const-string v2, "Billing Override Service Client was already closed and can\'t be reused. Please create another instance."

    .line 60
    .line 61
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "Billing Override Service connection is disconnected."

    .line 65
    .line 66
    const/4 v2, -0x1

    .line 67
    invoke-static {v2, v0}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/16 v2, 0x26

    .line 72
    .line 73
    invoke-virtual {p0, v2, v1, v0}, Ly1/w;->A(IILy1/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    monitor-exit p0

    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :cond_2
    :try_start_3
    iput v2, p0, Ly1/w;->A:I

    .line 80
    .line 81
    const-string v0, "BillingClientTesting"

    .line 82
    .line 83
    const-string v3, "Starting Billing Override Service setup."

    .line 84
    .line 85
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ly1/v;

    .line 89
    .line 90
    invoke-direct {v0, p0}, Ly1/v;-><init>(Ly1/w;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Ly1/w;->C:Ly1/v;

    .line 94
    .line 95
    new-instance v0, Landroid/content/Intent;

    .line 96
    .line 97
    const-string v3, "com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND"

    .line 98
    .line 99
    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v3, "com.google.android.apps.play.billingtestcompanion"

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    iget-object v3, p0, Ly1/w;->z:Landroid/content/Context;

    .line 108
    .line 109
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const/16 v5, 0x29

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_5

    .line 127
    .line 128
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 133
    .line 134
    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 135
    .line 136
    if-eqz v3, :cond_6

    .line 137
    .line 138
    iget-object v5, v3, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 141
    .line 142
    const-string v6, "com.google.android.apps.play.billingtestcompanion"

    .line 143
    .line 144
    invoke-static {v5, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    const/16 v7, 0x27

    .line 149
    .line 150
    if-eqz v6, :cond_4

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    new-instance v6, Landroid/content/ComponentName;

    .line 155
    .line 156
    invoke-direct {v6, v5, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v3, Landroid/content/Intent;

    .line 160
    .line 161
    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Ly1/w;->z:Landroid/content/Context;

    .line 168
    .line 169
    iget-object v5, p0, Ly1/w;->C:Ly1/v;

    .line 170
    .line 171
    invoke-virtual {v0, v3, v5, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_3

    .line 176
    .line 177
    const-string v0, "BillingClientTesting"

    .line 178
    .line 179
    const-string v1, "Billing Override Service was bonded successfully."

    .line 180
    .line 181
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    .line 183
    .line 184
    monitor-exit p0

    .line 185
    goto :goto_2

    .line 186
    :cond_3
    :try_start_4
    const-string v0, "BillingClientTesting"

    .line 187
    .line 188
    const-string v2, "Connection to Billing Override Service is blocked."

    .line 189
    .line 190
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :goto_0
    move v2, v7

    .line 194
    goto :goto_1

    .line 195
    :cond_4
    const-string v0, "BillingClientTesting"

    .line 196
    .line 197
    const-string v2, "The device doesn\'t have valid Play Billing Lab."

    .line 198
    .line 199
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_5
    move v2, v5

    .line 204
    :cond_6
    :goto_1
    iput v4, p0, Ly1/w;->A:I

    .line 205
    .line 206
    const-string v0, "BillingClientTesting"

    .line 207
    .line 208
    const-string v3, "Billing Override Service unavailable on device."

    .line 209
    .line 210
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const-string v0, "Billing Override Service unavailable on device."

    .line 214
    .line 215
    const/4 v3, 0x2

    .line 216
    invoke-static {v3, v0}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {p0, v2, v1, v0}, Ly1/w;->A(IILy1/e;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 221
    .line 222
    .line 223
    monitor-exit p0

    .line 224
    :goto_2
    invoke-super {p0, p1}, Ly1/b;->e(Ly1/c;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :goto_3
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 229
    throw p1
.end method

.method public final synthetic w(La2/c;Landroidx/emoji2/text/r;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ly1/b;->a(La2/c;Landroidx/emoji2/text/r;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic x(Lu1/f;Lcom/getcapacitor/plugin/c;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Ly1/b;->c(Lu1/f;Lcom/getcapacitor/plugin/c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final declared-synchronized y()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ly1/w;->A:I

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ly1/w;->B:Lcom/google/android/gms/internal/play_billing/zzav;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ly1/w;->C:Ly1/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit p0

    .line 21
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    throw v0
.end method

.method public final z(I)Lcom/google/android/gms/internal/play_billing/zzeu;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ly1/w;->y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "BillingClientTesting"

    .line 8
    .line 9
    const-string v0, "Billing Override Service is not ready."

    .line 10
    .line 11
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, -0x1

    .line 15
    const-string v0, "Billing Override Service connection is disconnected."

    .line 16
    .line 17
    invoke-static {p1, v0}, Ly1/b0;->a(ILjava/lang/String;)Ly1/e;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/16 v0, 0x6a

    .line 22
    .line 23
    const/16 v1, 0x1c

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, p1}, Ly1/w;->A(IILy1/e;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lcom/google/android/gms/internal/play_billing/zzel;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/zzeu;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance v0, Ly1/s;

    .line 39
    .line 40
    invoke-direct {v0, p0, p1}, Ly1/s;-><init>(Ly1/w;I)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/google/android/gms/internal/play_billing/zzv;->zza(Ly1/s;)Lcom/google/android/gms/internal/play_billing/zzeu;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
.end method
