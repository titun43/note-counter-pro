.class public final Ly1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Ly1/c;

.field public final synthetic b:Ly1/b;


# direct methods
.method public synthetic constructor <init>(Ly1/b;Ly1/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/p;->b:Ly1/b;

    .line 5
    .line 6
    iput-object p2, p0, Ly1/p;->a:Ly1/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ly1/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 2
    .line 3
    iget-object v0, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ly1/p;->b:Ly1/b;

    .line 7
    .line 8
    iget v1, v1, Ly1/b;->b:I

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    iget-object v0, p0, Ly1/p;->a:Ly1/c;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ly1/c;->onBillingSetupFinished(Ly1/e;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
.end method

.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service died."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 10
    .line 11
    iget-object v1, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    iget v0, v0, Ly1/b;->b:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, p1

    .line 21
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    :try_start_2
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 25
    .line 26
    iget-object v0, v0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzc()Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/16 v3, 0x7a

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 61
    .line 62
    iget-object v0, v0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 63
    .line 64
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzkl;->zzB()Lcom/google/android/gms/internal/play_billing/zzkl;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    .line 71
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v3, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzn(Lcom/google/android/gms/internal/play_billing/zzkl;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 90
    .line 91
    iget-object v0, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lg/m0;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lg/m0;->a(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :catchall_1
    move-exception v0

    .line 100
    :try_start_4
    const-string v1, "BillingLogger"

    .line 101
    .line 102
    const-string v2, "Unable to log."

    .line 103
    .line 104
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_2
    move-exception v0

    .line 109
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 110
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 111
    :goto_1
    const-string v1, "BillingClient"

    .line 112
    .line 113
    const-string v2, "Unable to log."

    .line 114
    .line 115
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 119
    .line 120
    iget-object v0, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 121
    .line 122
    monitor-enter v0

    .line 123
    :try_start_7
    iget-object v1, p0, Ly1/p;->b:Ly1/b;

    .line 124
    .line 125
    iget v1, v1, Ly1/b;->b:I

    .line 126
    .line 127
    const/4 v2, 0x3

    .line 128
    if-eq v1, v2, :cond_3

    .line 129
    .line 130
    iget-object v1, p0, Ly1/p;->b:Ly1/b;

    .line 131
    .line 132
    iget v1, v1, Ly1/b;->b:I

    .line 133
    .line 134
    if-nez v1, :cond_2

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_2
    iget-object v1, p0, Ly1/p;->b:Ly1/b;

    .line 138
    .line 139
    invoke-virtual {v1, p1}, Ly1/b;->m(I)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Ly1/p;->b:Ly1/b;

    .line 143
    .line 144
    invoke-virtual {p1}, Ly1/b;->n()V

    .line 145
    .line 146
    .line 147
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 148
    iget-object p1, p0, Ly1/p;->a:Ly1/c;

    .line 149
    .line 150
    invoke-interface {p1}, Ly1/c;->onBillingServiceDisconnected()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :catchall_3
    move-exception p1

    .line 155
    goto :goto_4

    .line 156
    :cond_3
    :goto_3
    :try_start_8
    monitor-exit v0

    .line 157
    return-void

    .line 158
    :goto_4
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 159
    throw p1
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service connected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzk(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ly1/p;->b:Ly1/b;

    .line 9
    .line 10
    iget-object p1, p1, Ly1/b;->a:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter p1

    .line 13
    :try_start_0
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 14
    .line 15
    iget v0, v0, Ly1/b;->b:I

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    monitor-exit p1

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    move-object p2, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 26
    .line 27
    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/zzam;->zzu(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/zzan;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, v0, Ly1/b;->h:Lcom/google/android/gms/internal/play_billing/zzan;

    .line 32
    .line 33
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iget-object p1, p0, Ly1/p;->b:Ly1/b;

    .line 35
    .line 36
    new-instance v0, Ly1/o;

    .line 37
    .line 38
    invoke-direct {v0, p0}, Ly1/o;-><init>(Ly1/p;)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Landroidx/fragment/app/o;

    .line 42
    .line 43
    const/16 p2, 0x12

    .line 44
    .line 45
    invoke-direct {v3, p0, p2}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ly1/b;->r()Landroid/os/Handler;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const-wide/16 v1, 0x7530

    .line 53
    .line 54
    invoke-virtual {p1}, Ly1/b;->j()Ljava/util/concurrent/ExecutorService;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static/range {v0 .. v5}, Ly1/b;->f(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-nez p1, :cond_1

    .line 63
    .line 64
    iget-object p1, p0, Ly1/p;->b:Ly1/b;

    .line 65
    .line 66
    invoke-virtual {p1}, Ly1/b;->g()Ly1/e;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const/16 v0, 0x19

    .line 71
    .line 72
    const/4 v1, 0x6

    .line 73
    invoke-virtual {p1, v0, v1, p2}, Ly1/b;->t(IILy1/e;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p2}, Ly1/p;->a(Ly1/e;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    throw p2
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service disconnected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzl(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 10
    .line 11
    iget-object v1, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    iget v0, v0, Ly1/b;->b:I

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, p1

    .line 21
    :goto_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    :try_start_2
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 25
    .line 26
    iget-object v0, v0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjz;->zzc()Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x6

    .line 33
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zzn(I)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzki;->zzc()Lcom/google/android/gms/internal/play_billing/zzke;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const/16 v3, 0x79

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzke;->zzo(I)Lcom/google/android/gms/internal/play_billing/zzke;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzjx;->zza(Lcom/google/android/gms/internal/play_billing/zzke;)Lcom/google/android/gms/internal/play_billing/zzjx;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzjz;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/p;->H(Lcom/google/android/gms/internal/play_billing/zzjz;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 61
    .line 62
    iget-object v0, v0, Ly1/b;->g:Landroidx/emoji2/text/p;

    .line 63
    .line 64
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlu;->zzB()Lcom/google/android/gms/internal/play_billing/zzlu;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzlk;->zzc()Lcom/google/android/gms/internal/play_billing/zzli;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v3, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzku;

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/play_billing/zzli;->zzo(Lcom/google/android/gms/internal/play_billing/zzku;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/play_billing/zzli;->zzq(Lcom/google/android/gms/internal/play_billing/zzlu;)Lcom/google/android/gms/internal/play_billing/zzli;

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lg/m0;

    .line 91
    .line 92
    invoke-virtual {v2}, Lcom/google/android/gms/internal/play_billing/zzhg;->zzf()Lcom/google/android/gms/internal/play_billing/zzhk;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lg/m0;->a(Lcom/google/android/gms/internal/play_billing/zzlk;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    :try_start_4
    const-string v1, "BillingLogger"

    .line 104
    .line 105
    const-string v2, "Unable to log."

    .line 106
    .line 107
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catchall_2
    move-exception v0

    .line 112
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 113
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 114
    :goto_1
    const-string v1, "BillingClient"

    .line 115
    .line 116
    const-string v2, "Unable to log."

    .line 117
    .line 118
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/play_billing/zze;->zzm(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    iget-object v0, p0, Ly1/p;->b:Ly1/b;

    .line 122
    .line 123
    iget-object v0, v0, Ly1/b;->a:Ljava/lang/Object;

    .line 124
    .line 125
    monitor-enter v0

    .line 126
    :try_start_7
    iget-object v1, p0, Ly1/p;->b:Ly1/b;

    .line 127
    .line 128
    iget v1, v1, Ly1/b;->b:I

    .line 129
    .line 130
    const/4 v2, 0x3

    .line 131
    if-ne v1, v2, :cond_3

    .line 132
    .line 133
    monitor-exit v0

    .line 134
    return-void

    .line 135
    :catchall_3
    move-exception p1

    .line 136
    goto :goto_3

    .line 137
    :cond_3
    iget-object v1, p0, Ly1/p;->b:Ly1/b;

    .line 138
    .line 139
    invoke-virtual {v1, p1}, Ly1/b;->m(I)V

    .line 140
    .line 141
    .line 142
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 143
    iget-object p1, p0, Ly1/p;->a:Ly1/c;

    .line 144
    .line 145
    invoke-interface {p1}, Ly1/c;->onBillingServiceDisconnected()V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :goto_3
    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 150
    throw p1
.end method
