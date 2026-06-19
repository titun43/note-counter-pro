.class public final Lcom/google/android/gms/common/api/internal/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/d;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ly1/i;Landroidx/emoji2/text/p;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/c0;->d:Ljava/lang/Object;

    new-instance p1, Ly1/c0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Ly1/c0;-><init>(Lcom/google/android/gms/common/api/internal/c0;Z)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->e:Ljava/lang/Object;

    new-instance p1, Ly1/c0;

    const/4 p2, 0x0

    .line 3
    invoke-direct {p1, p0, p2}, Ly1/c0;-><init>(Lcom/google/android/gms/common/api/internal/c0;Z)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/internal/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->d:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/c0;->a:Z

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lt2/b;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/g;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 6
    .line 7
    new-instance v1, Lc0/a;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, p1, v2, v3}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public b(Lt2/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/g;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lcom/google/android/gms/common/api/internal/a;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/a0;->o(Lt2/b;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public c(Z)V
    .locals 6

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    const-string v1, "com.android.vending.billing.PURCHASES_UPDATED"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/content/IntentFilter;

    .line 9
    .line 10
    const-string v2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED"

    .line 11
    .line 12
    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "com.android.vending.billing.ALTERNATIVE_BILLING"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/c0;->a:Z

    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ly1/c0;

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {p1, v2, v1}, Ly1/c0;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 31
    .line 32
    .line 33
    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/c0;->a:Z

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Ly1/c0;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/content/Context;

    .line 44
    .line 45
    monitor-enter p1

    .line 46
    :try_start_0
    iget-boolean v2, p1, Ly1/c0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    monitor-exit p1

    .line 51
    return-void

    .line 52
    :cond_0
    :try_start_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const-string v3, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST"

    .line 55
    .line 56
    const/16 v4, 0x21

    .line 57
    .line 58
    const/4 v5, 0x1

    .line 59
    if-lt v2, v4, :cond_2

    .line 60
    .line 61
    iget-boolean v2, p1, Ly1/c0;->b:Z

    .line 62
    .line 63
    if-eq v5, v2, :cond_1

    .line 64
    .line 65
    const/4 v2, 0x4

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v2, 0x2

    .line 68
    :goto_0
    invoke-static {v1, p1, v0, v2}, Lg0/b;->p(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v1, p1, v0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    :goto_1
    iput-boolean v5, p1, Ly1/c0;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    monitor-exit p1

    .line 81
    return-void

    .line 82
    :goto_2
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    throw v0

    .line 84
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/c0;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Ly1/c0;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/c0;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {p1, v1, v0}, Ly1/c0;->a(Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
