.class public final Lcom/google/android/gms/common/api/internal/e;
.super Lcom/google/android/gms/internal/base/zau;
.source "SourceFile"


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/u;Lcom/google/android/gms/common/api/t;)V
    .locals 1

    .line 1
    sget v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zad:I

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/util/Pair;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const-string p1, "Don\'t know how to handle message: "

    .line 10
    .line 11
    invoke-static {v0, p1}, Landroidx/emoji2/text/u;->h(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Ljava/lang/Exception;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "BasePendingResult"

    .line 21
    .line 22
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lcom/google/android/gms/common/api/internal/BasePendingResult;

    .line 29
    .line 30
    sget-object v0, Lcom/google/android/gms/common/api/Status;->n:Lcom/google/android/gms/common/api/Status;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->forceFailureUnlessReady(Lcom/google/android/gms/common/api/Status;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Landroid/util/Pair;

    .line 39
    .line 40
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/google/android/gms/common/api/u;

    .line 43
    .line 44
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lcom/google/android/gms/common/api/t;

    .line 47
    .line 48
    :try_start_0
    check-cast v0, Lcom/google/android/gms/common/api/internal/m0;

    .line 49
    .line 50
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/m0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 53
    :try_start_1
    invoke-interface {p1}, Lcom/google/android/gms/common/api/t;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v3, v3, Lcom/google/android/gms/common/api/Status;->g:I

    .line 58
    .line 59
    if-gtz v3, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v1, 0x0

    .line 63
    :goto_0
    if-eqz v1, :cond_3

    .line 64
    .line 65
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/m0;->c:Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/google/android/gms/common/api/p;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/common/api/t;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/m0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 79
    .line 80
    .line 81
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzchr;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    :try_start_2
    move-object v0, p1

    .line 86
    check-cast v0, Lcom/google/android/gms/internal/ads/zzchr;

    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchr;->release()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catch_0
    move-exception v0

    .line 93
    :try_start_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v3, "Unable to release "

    .line 98
    .line 99
    const-string v4, "TransformedResultImpl"

    .line 100
    .line 101
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v4, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 106
    .line 107
    .line 108
    :cond_4
    :goto_1
    monitor-exit v2

    .line 109
    return-void

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 113
    :catch_1
    move-exception v0

    .line 114
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zal(Lcom/google/android/gms/common/api/t;)V

    .line 115
    .line 116
    .line 117
    throw v0
.end method
