.class public final Lcom/google/android/gms/common/api/internal/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final u:Lcom/google/android/gms/common/api/Status;

.field public static final v:Lcom/google/android/gms/common/api/Status;

.field public static final w:Ljava/lang/Object;

.field public static x:Lcom/google/android/gms/common/api/internal/g;


# instance fields
.field public g:J

.field public h:Z

.field public i:Lcom/google/android/gms/common/internal/t;

.field public j:Lv2/b;

.field public final k:Landroid/content/Context;

.field public final l:Lt2/e;

.field public final m:Landroidx/emoji2/text/p;

.field public final n:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final o:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final p:Ljava/util/concurrent/ConcurrentHashMap;

.field public final q:Lo/g;

.field public final r:Lo/g;

.field public final s:Lcom/google/android/gms/internal/base/zau;

.field public volatile t:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/google/android/gms/common/api/internal/g;->u:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/google/android/gms/common/api/internal/g;->v:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/google/android/gms/common/api/internal/g;->w:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Lt2/e;->d:Lt2/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lcom/google/android/gms/common/api/internal/g;->g:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/g;->h:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->n:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    new-instance v2, Lo/g;

    .line 39
    .line 40
    invoke-direct {v2, v1}, Lo/g;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->q:Lo/g;

    .line 44
    .line 45
    new-instance v2, Lo/g;

    .line 46
    .line 47
    invoke-direct {v2, v1}, Lo/g;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->r:Lo/g;

    .line 51
    .line 52
    iput-boolean v3, p0, Lcom/google/android/gms/common/api/internal/g;->t:Z

    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 55
    .line 56
    new-instance v2, Lcom/google/android/gms/internal/base/zau;

    .line 57
    .line 58
    invoke-direct {v2, p2, p0}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 62
    .line 63
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->l:Lt2/e;

    .line 64
    .line 65
    new-instance p2, Landroidx/emoji2/text/p;

    .line 66
    .line 67
    const/16 v0, 0x8

    .line 68
    .line 69
    invoke-direct {p2, v0}, Landroidx/emoji2/text/p;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/g;->m:Landroidx/emoji2/text/p;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    sget-object p2, Lx2/d;->f:Ljava/lang/Boolean;

    .line 79
    .line 80
    if-nez p2, :cond_1

    .line 81
    .line 82
    invoke-static {}, Lx2/d;->f()Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_0

    .line 87
    .line 88
    const-string p2, "android.hardware.type.automotive"

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_0

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    move v3, v1

    .line 98
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sput-object p1, Lx2/d;->f:Ljava/lang/Boolean;

    .line 103
    .line 104
    :cond_1
    sget-object p1, Lx2/d;->f:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_2

    .line 111
    .line 112
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/g;->t:Z

    .line 113
    .line 114
    :cond_2
    const/4 p1, 0x6

    .line 115
    invoke-virtual {v2, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public static c(Lcom/google/android/gms/common/api/internal/a;Lt2/b;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/a;->b:Lcom/google/android/gms/common/api/i;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/gms/common/api/i;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "API: "

    .line 14
    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, " is not available on this device. Connection failed with: "

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 v1, 0x11

    .line 34
    .line 35
    iget-object v2, p1, Lt2/b;->i:Landroid/app/PendingIntent;

    .line 36
    .line 37
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public static f(Landroid/content/Context;)Lcom/google/android/gms/common/api/internal/g;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/internal/g;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/common/api/internal/g;->x:Lcom/google/android/gms/common/api/internal/g;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Lcom/google/android/gms/common/internal/m;->a:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Lcom/google/android/gms/common/internal/m;->c:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lcom/google/android/gms/common/internal/m;->c:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lcom/google/android/gms/common/internal/m;->c:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lcom/google/android/gms/common/api/internal/g;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Lt2/e;->c:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/common/api/internal/g;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lcom/google/android/gms/common/api/internal/g;->x:Lcom/google/android/gms/common/api/internal/g;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Lcom/google/android/gms/common/api/internal/g;->x:Lcom/google/android/gms/common/api/internal/g;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/g;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/r;->b()Lcom/google/android/gms/common/internal/r;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lcom/google/android/gms/common/internal/r;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/common/internal/s;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Lcom/google/android/gms/common/internal/s;->h:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->m:Landroidx/emoji2/text/p;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    const v1, 0xc1fa340

    .line 27
    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->get(II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, v2, :cond_3

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public final b(Lt2/b;I)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->l:Lt2/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {v1}, Lz2/b;->q(Landroid/content/Context;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget v2, p1, Lt2/b;->h:I

    .line 17
    .line 18
    iget-object p1, p1, Lt2/b;->i:Landroid/app/PendingIntent;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move v5, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v5, v3

    .line 28
    :goto_0
    if-eqz v5, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 p1, 0x0

    .line 32
    invoke-virtual {v0, v1, p1, v2}, Lt2/f;->b(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/high16 p1, 0xc000000

    .line 40
    .line 41
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_1
    if-eqz p1, :cond_4

    .line 46
    .line 47
    sget v5, Lcom/google/android/gms/common/api/GoogleApiActivity;->h:I

    .line 48
    .line 49
    new-instance v5, Landroid/content/Intent;

    .line 50
    .line 51
    const-class v6, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 52
    .line 53
    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    const-string v6, "pending_intent"

    .line 57
    .line 58
    invoke-virtual {v5, v6, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    const-string p1, "failing_client_id"

    .line 62
    .line 63
    invoke-virtual {v5, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    const-string p1, "notify_manager"

    .line 67
    .line 68
    invoke-virtual {v5, p1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 69
    .line 70
    .line 71
    sget p1, Lcom/google/android/gms/internal/base/zap;->zaa:I

    .line 72
    .line 73
    const/high16 p2, 0x8000000

    .line 74
    .line 75
    or-int/2addr p1, p2

    .line 76
    invoke-static {v1, v3, v5, p1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v0, v1, v2, p1}, Lt2/e;->g(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 81
    .line 82
    .line 83
    return v4

    .line 84
    :cond_4
    :goto_2
    return v3
.end method

.method public final d(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/internal/a0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/m;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lcom/google/android/gms/common/api/internal/a0;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/common/api/internal/a0;

    .line 16
    .line 17
    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/common/api/internal/a0;-><init>(Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/m;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, v2, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->r:Lo/g;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lo/g;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v2}, Lcom/google/android/gms/common/api/internal/a0;->l()V

    .line 37
    .line 38
    .line 39
    return-object v2
.end method

.method public final e(Lh3/h;ILcom/google/android/gms/common/api/m;)V
    .locals 8

    .line 1
    if-eqz p2, :cond_6

    .line 2
    .line 3
    invoke-virtual {p3}, Lcom/google/android/gms/common/api/m;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g;->a()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/r;->b()Lcom/google/android/gms/common/internal/r;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    iget-object p3, p3, Lcom/google/android/gms/common/internal/r;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p3, Lcom/google/android/gms/common/internal/s;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    if-eqz p3, :cond_3

    .line 24
    .line 25
    iget-boolean v1, p3, Lcom/google/android/gms/common/internal/s;->h:Z

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    iget-boolean p3, p3, Lcom/google/android/gms/common/internal/s;->i:Z

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/google/android/gms/common/api/internal/a0;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 42
    .line 43
    instance-of v4, v2, Lcom/google/android/gms/common/internal/f;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    check-cast v2, Lcom/google/android/gms/common/internal/f;

    .line 48
    .line 49
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    invoke-static {v1, v2, p2}, Lcom/google/android/gms/common/api/internal/g0;->a(Lcom/google/android/gms/common/api/internal/a0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/j;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    if-eqz p3, :cond_2

    .line 66
    .line 67
    iget v2, v1, Lcom/google/android/gms/common/api/internal/a0;->r:I

    .line 68
    .line 69
    add-int/2addr v2, v0

    .line 70
    iput v2, v1, Lcom/google/android/gms/common/api/internal/a0;->r:I

    .line 71
    .line 72
    iget-boolean v0, p3, Lcom/google/android/gms/common/internal/j;->i:Z

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v0, p3

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    :goto_0
    const/4 p2, 0x0

    .line 78
    move-object v1, p0

    .line 79
    goto :goto_3

    .line 80
    :cond_3
    :goto_1
    new-instance p3, Lcom/google/android/gms/common/api/internal/g0;

    .line 81
    .line 82
    const-wide/16 v1, 0x0

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move-wide v4, v1

    .line 92
    :goto_2
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    :cond_5
    move-object v0, p3

    .line 99
    move-wide v6, v1

    .line 100
    move-object v1, p0

    .line 101
    move v2, p2

    .line 102
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/common/api/internal/g0;-><init>(Lcom/google/android/gms/common/api/internal/g;ILcom/google/android/gms/common/api/internal/a;JJ)V

    .line 103
    .line 104
    .line 105
    move-object p2, v0

    .line 106
    :goto_3
    if-eqz p2, :cond_7

    .line 107
    .line 108
    iget-object p1, p1, Lh3/h;->a:Lh3/n;

    .line 109
    .line 110
    iget-object p3, v1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 111
    .line 112
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v0, Lb0/d;

    .line 116
    .line 117
    const/4 v2, 0x2

    .line 118
    invoke-direct {v0, p3, v2}, Lb0/d;-><init>(Landroid/os/Handler;I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance p3, Lh3/j;

    .line 125
    .line 126
    invoke-direct {p3, v0, p2}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/d;)V

    .line 127
    .line 128
    .line 129
    iget-object p2, p1, Lh3/n;->b:Lh3/m;

    .line 130
    .line 131
    invoke-virtual {p2, p3}, Lh3/m;->a(Lh3/l;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lh3/n;->h()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_6
    move-object v1, p0

    .line 139
    :cond_7
    return-void
.end method

.method public final g(Lt2/b;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/common/api/internal/g;->b(Lt2/b;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 10
    .line 11
    invoke-virtual {v2, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 11

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    const-wide/32 v2, 0x493e0

    .line 6
    .line 7
    .line 8
    const/16 v4, 0x11

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "Unknown message id: "

    .line 19
    .line 20
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "GoogleApiManager"

    .line 31
    .line 32
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    return v6

    .line 36
    :pswitch_0
    iput-boolean v6, p0, Lcom/google/android/gms/common/api/internal/g;->h:Z

    .line 37
    .line 38
    return v7

    .line 39
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/google/android/gms/common/api/internal/h0;

    .line 42
    .line 43
    iget-wide v2, p1, Lcom/google/android/gms/common/api/internal/h0;->c:J

    .line 44
    .line 45
    const-wide/16 v8, 0x0

    .line 46
    .line 47
    cmp-long v0, v2, v8

    .line 48
    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Lcom/google/android/gms/common/internal/t;

    .line 52
    .line 53
    iget v2, p1, Lcom/google/android/gms/common/api/internal/h0;->b:I

    .line 54
    .line 55
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/internal/q;

    .line 56
    .line 57
    filled-new-array {p1}, [Lcom/google/android/gms/common/internal/q;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, v2, p1}, Lcom/google/android/gms/common/internal/t;-><init>(ILjava/util/List;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 69
    .line 70
    if-nez p1, :cond_0

    .line 71
    .line 72
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 73
    .line 74
    sget-object v2, Lcom/google/android/gms/common/internal/u;->b:Lcom/google/android/gms/common/internal/u;

    .line 75
    .line 76
    new-instance v3, Lv2/b;

    .line 77
    .line 78
    sget-object v4, Lv2/b;->a:Lcom/google/android/gms/common/api/i;

    .line 79
    .line 80
    sget-object v5, Lcom/google/android/gms/common/api/l;->c:Lcom/google/android/gms/common/api/l;

    .line 81
    .line 82
    invoke-direct {v3, p1, v4, v2, v5}, Lcom/google/android/gms/common/api/m;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/l;)V

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 86
    .line 87
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v2, Lcom/google/android/gms/common/api/internal/t;

    .line 93
    .line 94
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    iput v6, v2, Lcom/google/android/gms/common/api/internal/t;->d:I

    .line 98
    .line 99
    sget-object v3, Lcom/google/android/gms/internal/base/zaf;->zaa:Lt2/d;

    .line 100
    .line 101
    filled-new-array {v3}, [Lt2/d;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iput-object v3, v2, Lcom/google/android/gms/common/api/internal/t;->c:[Lt2/d;

    .line 106
    .line 107
    iput-boolean v6, v2, Lcom/google/android/gms/common/api/internal/t;->b:Z

    .line 108
    .line 109
    new-instance v4, Lu1/f;

    .line 110
    .line 111
    invoke-direct {v4, v0, v1}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 112
    .line 113
    .line 114
    iput-object v4, v2, Lcom/google/android/gms/common/api/internal/t;->a:Lcom/google/android/gms/common/api/internal/q;

    .line 115
    .line 116
    new-instance v0, Lcom/google/android/gms/common/api/internal/k0;

    .line 117
    .line 118
    invoke-direct {v0, v2, v3, v6, v6}, Lcom/google/android/gms/common/api/internal/k0;-><init>(Lcom/google/android/gms/common/api/internal/t;[Lt2/d;ZI)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/m;->doBestEffortWrite(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;

    .line 122
    .line 123
    .line 124
    return v7

    .line 125
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    iget-object v2, v0, Lcom/google/android/gms/common/internal/t;->h:Ljava/util/List;

    .line 130
    .line 131
    iget v0, v0, Lcom/google/android/gms/common/internal/t;->g:I

    .line 132
    .line 133
    iget v3, p1, Lcom/google/android/gms/common/api/internal/h0;->b:I

    .line 134
    .line 135
    if-ne v0, v3, :cond_4

    .line 136
    .line 137
    if-eqz v2, :cond_2

    .line 138
    .line 139
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    iget v2, p1, Lcom/google/android/gms/common/api/internal/h0;->d:I

    .line 144
    .line 145
    if-lt v0, v2, :cond_2

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 149
    .line 150
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/internal/q;

    .line 151
    .line 152
    iget-object v2, v0, Lcom/google/android/gms/common/internal/t;->h:Ljava/util/List;

    .line 153
    .line 154
    if-nez v2, :cond_3

    .line 155
    .line 156
    new-instance v2, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v2, v0, Lcom/google/android/gms/common/internal/t;->h:Ljava/util/List;

    .line 162
    .line 163
    :cond_3
    iget-object v0, v0, Lcom/google/android/gms/common/internal/t;->h:Ljava/util/List;

    .line 164
    .line 165
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 170
    .line 171
    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 175
    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    iget v2, v0, Lcom/google/android/gms/common/internal/t;->g:I

    .line 179
    .line 180
    if-gtz v2, :cond_5

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g;->a()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 189
    .line 190
    if-nez v2, :cond_6

    .line 191
    .line 192
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 193
    .line 194
    sget-object v3, Lcom/google/android/gms/common/internal/u;->b:Lcom/google/android/gms/common/internal/u;

    .line 195
    .line 196
    new-instance v8, Lv2/b;

    .line 197
    .line 198
    sget-object v9, Lv2/b;->a:Lcom/google/android/gms/common/api/i;

    .line 199
    .line 200
    sget-object v10, Lcom/google/android/gms/common/api/l;->c:Lcom/google/android/gms/common/api/l;

    .line 201
    .line 202
    invoke-direct {v8, v2, v9, v3, v10}, Lcom/google/android/gms/common/api/m;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/l;)V

    .line 203
    .line 204
    .line 205
    iput-object v8, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 206
    .line 207
    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 208
    .line 209
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v3, Lcom/google/android/gms/common/api/internal/t;

    .line 213
    .line 214
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 215
    .line 216
    .line 217
    iput v6, v3, Lcom/google/android/gms/common/api/internal/t;->d:I

    .line 218
    .line 219
    sget-object v8, Lcom/google/android/gms/internal/base/zaf;->zaa:Lt2/d;

    .line 220
    .line 221
    filled-new-array {v8}, [Lt2/d;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    iput-object v8, v3, Lcom/google/android/gms/common/api/internal/t;->c:[Lt2/d;

    .line 226
    .line 227
    iput-boolean v6, v3, Lcom/google/android/gms/common/api/internal/t;->b:Z

    .line 228
    .line 229
    new-instance v9, Lu1/f;

    .line 230
    .line 231
    invoke-direct {v9, v0, v1}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 232
    .line 233
    .line 234
    iput-object v9, v3, Lcom/google/android/gms/common/api/internal/t;->a:Lcom/google/android/gms/common/api/internal/q;

    .line 235
    .line 236
    new-instance v0, Lcom/google/android/gms/common/api/internal/k0;

    .line 237
    .line 238
    invoke-direct {v0, v3, v8, v6, v6}, Lcom/google/android/gms/common/api/internal/k0;-><init>(Lcom/google/android/gms/common/api/internal/t;[Lt2/d;ZI)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, Lcom/google/android/gms/common/api/m;->doBestEffortWrite(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;

    .line 242
    .line 243
    .line 244
    :cond_7
    iput-object v5, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 245
    .line 246
    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 247
    .line 248
    if-nez v0, :cond_22

    .line 249
    .line 250
    new-instance v0, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/h0;->a:Lcom/google/android/gms/common/internal/q;

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    new-instance v1, Lcom/google/android/gms/common/internal/t;

    .line 261
    .line 262
    iget v2, p1, Lcom/google/android/gms/common/api/internal/h0;->b:I

    .line 263
    .line 264
    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/common/internal/t;-><init>(ILjava/util/List;)V

    .line 265
    .line 266
    .line 267
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 268
    .line 269
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 270
    .line 271
    invoke-virtual {v0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iget-wide v2, p1, Lcom/google/android/gms/common/api/internal/h0;->c:J

    .line 276
    .line 277
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 278
    .line 279
    .line 280
    return v7

    .line 281
    :pswitch_2
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 282
    .line 283
    if-eqz p1, :cond_22

    .line 284
    .line 285
    iget v0, p1, Lcom/google/android/gms/common/internal/t;->g:I

    .line 286
    .line 287
    if-gtz v0, :cond_9

    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/g;->a()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_b

    .line 294
    .line 295
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 296
    .line 297
    if-nez v0, :cond_a

    .line 298
    .line 299
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 300
    .line 301
    sget-object v2, Lcom/google/android/gms/common/internal/u;->b:Lcom/google/android/gms/common/internal/u;

    .line 302
    .line 303
    new-instance v3, Lv2/b;

    .line 304
    .line 305
    sget-object v4, Lv2/b;->a:Lcom/google/android/gms/common/api/i;

    .line 306
    .line 307
    sget-object v8, Lcom/google/android/gms/common/api/l;->c:Lcom/google/android/gms/common/api/l;

    .line 308
    .line 309
    invoke-direct {v3, v0, v4, v2, v8}, Lcom/google/android/gms/common/api/m;-><init>(Landroid/content/Context;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/e;Lcom/google/android/gms/common/api/l;)V

    .line 310
    .line 311
    .line 312
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 313
    .line 314
    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->j:Lv2/b;

    .line 315
    .line 316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance v2, Lcom/google/android/gms/common/api/internal/t;

    .line 320
    .line 321
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 322
    .line 323
    .line 324
    iput v6, v2, Lcom/google/android/gms/common/api/internal/t;->d:I

    .line 325
    .line 326
    sget-object v3, Lcom/google/android/gms/internal/base/zaf;->zaa:Lt2/d;

    .line 327
    .line 328
    filled-new-array {v3}, [Lt2/d;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    iput-object v3, v2, Lcom/google/android/gms/common/api/internal/t;->c:[Lt2/d;

    .line 333
    .line 334
    iput-boolean v6, v2, Lcom/google/android/gms/common/api/internal/t;->b:Z

    .line 335
    .line 336
    new-instance v4, Lu1/f;

    .line 337
    .line 338
    invoke-direct {v4, p1, v1}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 339
    .line 340
    .line 341
    iput-object v4, v2, Lcom/google/android/gms/common/api/internal/t;->a:Lcom/google/android/gms/common/api/internal/q;

    .line 342
    .line 343
    new-instance p1, Lcom/google/android/gms/common/api/internal/k0;

    .line 344
    .line 345
    invoke-direct {p1, v2, v3, v6, v6}, Lcom/google/android/gms/common/api/internal/k0;-><init>(Lcom/google/android/gms/common/api/internal/t;[Lt2/d;ZI)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/m;->doBestEffortWrite(Lcom/google/android/gms/common/api/internal/u;)Lh3/g;

    .line 349
    .line 350
    .line 351
    :cond_b
    iput-object v5, p0, Lcom/google/android/gms/common/api/internal/g;->i:Lcom/google/android/gms/common/internal/t;

    .line 352
    .line 353
    return v7

    .line 354
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast p1, Lcom/google/android/gms/common/api/internal/b0;

    .line 357
    .line 358
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 359
    .line 360
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/b0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_22

    .line 367
    .line 368
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 369
    .line 370
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/b0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 371
    .line 372
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 377
    .line 378
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a0;->p:Ljava/util/ArrayList;

    .line 379
    .line 380
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 381
    .line 382
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 383
    .line 384
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_22

    .line 389
    .line 390
    iget-object v1, v2, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 391
    .line 392
    const/16 v4, 0xf

    .line 393
    .line 394
    invoke-virtual {v1, v4, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    iget-object v1, v2, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 398
    .line 399
    const/16 v2, 0x10

    .line 400
    .line 401
    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/b0;->b:Lt2/d;

    .line 405
    .line 406
    new-instance v1, Ljava/util/ArrayList;

    .line 407
    .line 408
    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 413
    .line 414
    .line 415
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    :cond_c
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    if-eqz v4, :cond_d

    .line 424
    .line 425
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    check-cast v4, Lcom/google/android/gms/common/api/internal/r0;

    .line 430
    .line 431
    instance-of v5, v4, Lcom/google/android/gms/common/api/internal/f0;

    .line 432
    .line 433
    if-eqz v5, :cond_c

    .line 434
    .line 435
    move-object v5, v4

    .line 436
    check-cast v5, Lcom/google/android/gms/common/api/internal/f0;

    .line 437
    .line 438
    invoke-virtual {v5, v0}, Lcom/google/android/gms/common/api/internal/f0;->g(Lcom/google/android/gms/common/api/internal/a0;)[Lt2/d;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    if-eqz v5, :cond_c

    .line 443
    .line 444
    invoke-static {v5, p1}, Lx2/d;->d([Ljava/lang/Object;Lt2/d;)Z

    .line 445
    .line 446
    .line 447
    move-result v5

    .line 448
    if-eqz v5, :cond_c

    .line 449
    .line 450
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    goto :goto_2

    .line 454
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    :goto_3
    if-ge v6, v0, :cond_22

    .line 459
    .line 460
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    check-cast v2, Lcom/google/android/gms/common/api/internal/r0;

    .line 465
    .line 466
    invoke-virtual {v3, v2}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    new-instance v4, Lcom/google/android/gms/common/api/x;

    .line 470
    .line 471
    invoke-direct {v4, p1}, Lcom/google/android/gms/common/api/x;-><init>(Lt2/d;)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, Lcom/google/android/gms/common/api/internal/r0;->b(Ljava/lang/Exception;)V

    .line 475
    .line 476
    .line 477
    add-int/lit8 v6, v6, 0x1

    .line 478
    .line 479
    goto :goto_3

    .line 480
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast p1, Lcom/google/android/gms/common/api/internal/b0;

    .line 483
    .line 484
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 485
    .line 486
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/b0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 487
    .line 488
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_22

    .line 493
    .line 494
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 495
    .line 496
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/b0;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 497
    .line 498
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 503
    .line 504
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a0;->p:Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    move-result p1

    .line 510
    if-nez p1, :cond_e

    .line 511
    .line 512
    goto/16 :goto_f

    .line 513
    .line 514
    :cond_e
    iget-boolean p1, v0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 515
    .line 516
    if-nez p1, :cond_22

    .line 517
    .line 518
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 519
    .line 520
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 521
    .line 522
    .line 523
    move-result p1

    .line 524
    if-nez p1, :cond_f

    .line 525
    .line 526
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/a0;->l()V

    .line 527
    .line 528
    .line 529
    return v7

    .line 530
    :cond_f
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/a0;->e()V

    .line 531
    .line 532
    .line 533
    return v7

    .line 534
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast p1, Lcom/google/android/gms/common/api/internal/y;

    .line 537
    .line 538
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/y;->a:Lcom/google/android/gms/common/api/internal/a;

    .line 539
    .line 540
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 541
    .line 542
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-nez v1, :cond_10

    .line 547
    .line 548
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/y;->b:Lh3/h;

    .line 549
    .line 550
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 551
    .line 552
    invoke-virtual {p1, v0}, Lh3/h;->a(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    return v7

    .line 556
    :cond_10
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 557
    .line 558
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 563
    .line 564
    invoke-virtual {v0, v6}, Lcom/google/android/gms/common/api/internal/a0;->k(Z)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/y;->b:Lh3/h;

    .line 569
    .line 570
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {p1, v0}, Lh3/h;->a(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    return v7

    .line 578
    :pswitch_6
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 579
    .line 580
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 581
    .line 582
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-eqz v0, :cond_22

    .line 587
    .line 588
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 589
    .line 590
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 591
    .line 592
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    check-cast p1, Lcom/google/android/gms/common/api/internal/a0;

    .line 597
    .line 598
    invoke-virtual {p1, v7}, Lcom/google/android/gms/common/api/internal/a0;->k(Z)Z

    .line 599
    .line 600
    .line 601
    return v7

    .line 602
    :pswitch_7
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 603
    .line 604
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 605
    .line 606
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_22

    .line 611
    .line 612
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 613
    .line 614
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 615
    .line 616
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object p1

    .line 620
    check-cast p1, Lcom/google/android/gms/common/api/internal/a0;

    .line 621
    .line 622
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 623
    .line 624
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 625
    .line 626
    invoke-static {v1}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 627
    .line 628
    .line 629
    iget-boolean v1, p1, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 630
    .line 631
    if-eqz v1, :cond_22

    .line 632
    .line 633
    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 634
    .line 635
    iget-object v3, p1, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 636
    .line 637
    iget-object v3, v3, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 638
    .line 639
    if-eqz v1, :cond_11

    .line 640
    .line 641
    const/16 v1, 0xb

    .line 642
    .line 643
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    const/16 v1, 0x9

    .line 647
    .line 648
    invoke-virtual {v3, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 649
    .line 650
    .line 651
    iput-boolean v6, p1, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 652
    .line 653
    :cond_11
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g;->l:Lt2/e;

    .line 654
    .line 655
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 656
    .line 657
    sget v2, Lt2/f;->a:I

    .line 658
    .line 659
    invoke-virtual {v1, v0, v2}, Lt2/f;->c(Landroid/content/Context;I)I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    const/16 v1, 0x12

    .line 664
    .line 665
    if-ne v0, v1, :cond_12

    .line 666
    .line 667
    const-string v0, "Connection timed out waiting for Google Play services update to complete."

    .line 668
    .line 669
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 670
    .line 671
    const/16 v2, 0x15

    .line 672
    .line 673
    invoke-direct {v1, v2, v0, v5, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 674
    .line 675
    .line 676
    goto :goto_4

    .line 677
    :cond_12
    const-string v0, "API failed to connect while resuming due to an unknown error."

    .line 678
    .line 679
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 680
    .line 681
    const/16 v2, 0x16

    .line 682
    .line 683
    invoke-direct {v1, v2, v0, v5, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 684
    .line 685
    .line 686
    :goto_4
    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 687
    .line 688
    .line 689
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 690
    .line 691
    const-string v0, "Timing out connection while resuming."

    .line 692
    .line 693
    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    return v7

    .line 697
    :pswitch_8
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->r:Lo/g;

    .line 698
    .line 699
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 700
    .line 701
    .line 702
    new-instance v0, Lo/b;

    .line 703
    .line 704
    invoke-direct {v0, p1}, Lo/b;-><init>(Lo/g;)V

    .line 705
    .line 706
    .line 707
    :cond_13
    :goto_5
    invoke-virtual {v0}, Lo/b;->hasNext()Z

    .line 708
    .line 709
    .line 710
    move-result p1

    .line 711
    if-eqz p1, :cond_14

    .line 712
    .line 713
    invoke-virtual {v0}, Lo/b;->next()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object p1

    .line 717
    check-cast p1, Lcom/google/android/gms/common/api/internal/a;

    .line 718
    .line 719
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 720
    .line 721
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object p1

    .line 725
    check-cast p1, Lcom/google/android/gms/common/api/internal/a0;

    .line 726
    .line 727
    if-eqz p1, :cond_13

    .line 728
    .line 729
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/a0;->p()V

    .line 730
    .line 731
    .line 732
    goto :goto_5

    .line 733
    :cond_14
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->r:Lo/g;

    .line 734
    .line 735
    invoke-virtual {p1}, Lo/g;->clear()V

    .line 736
    .line 737
    .line 738
    return v7

    .line 739
    :pswitch_9
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 740
    .line 741
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 742
    .line 743
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-eqz v0, :cond_22

    .line 748
    .line 749
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 750
    .line 751
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 752
    .line 753
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object p1

    .line 757
    check-cast p1, Lcom/google/android/gms/common/api/internal/a0;

    .line 758
    .line 759
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 760
    .line 761
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 762
    .line 763
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 764
    .line 765
    .line 766
    iget-boolean v0, p1, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 767
    .line 768
    if-eqz v0, :cond_22

    .line 769
    .line 770
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/internal/a0;->l()V

    .line 771
    .line 772
    .line 773
    return v7

    .line 774
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 775
    .line 776
    check-cast p1, Lcom/google/android/gms/common/api/m;

    .line 777
    .line 778
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/g;->d(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/internal/a0;

    .line 779
    .line 780
    .line 781
    return v7

    .line 782
    :pswitch_b
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 783
    .line 784
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 785
    .line 786
    .line 787
    move-result-object p1

    .line 788
    instance-of p1, p1, Landroid/app/Application;

    .line 789
    .line 790
    if-eqz p1, :cond_22

    .line 791
    .line 792
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 793
    .line 794
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    check-cast p1, Landroid/app/Application;

    .line 799
    .line 800
    sget-object v0, Lcom/google/android/gms/common/api/internal/b;->k:Lcom/google/android/gms/common/api/internal/b;

    .line 801
    .line 802
    monitor-enter v0

    .line 803
    :try_start_0
    iget-boolean v1, v0, Lcom/google/android/gms/common/api/internal/b;->j:Z

    .line 804
    .line 805
    if-nez v1, :cond_15

    .line 806
    .line 807
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 811
    .line 812
    .line 813
    iput-boolean v7, v0, Lcom/google/android/gms/common/api/internal/b;->j:Z

    .line 814
    .line 815
    goto :goto_6

    .line 816
    :catchall_0
    move-exception p1

    .line 817
    goto/16 :goto_a

    .line 818
    .line 819
    :cond_15
    :goto_6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 820
    new-instance p1, Lcom/google/android/gms/common/api/internal/z;

    .line 821
    .line 822
    invoke-direct {p1, p0}, Lcom/google/android/gms/common/api/internal/z;-><init>(Lcom/google/android/gms/common/api/internal/g;)V

    .line 823
    .line 824
    .line 825
    monitor-enter v0

    .line 826
    :try_start_1
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/b;->i:Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 832
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/b;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 833
    .line 834
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/b;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 837
    .line 838
    .line 839
    move-result v1

    .line 840
    if-nez v1, :cond_1a

    .line 841
    .line 842
    sget-object v1, Lx2/d;->h:Ljava/lang/Boolean;

    .line 843
    .line 844
    if-nez v1, :cond_18

    .line 845
    .line 846
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 847
    .line 848
    const/16 v4, 0x1c

    .line 849
    .line 850
    if-lt v1, v4, :cond_16

    .line 851
    .line 852
    invoke-static {}, Lo1/a;->e()Z

    .line 853
    .line 854
    .line 855
    move-result v1

    .line 856
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    goto :goto_7

    .line 861
    :cond_16
    :try_start_2
    const-class v1, Landroid/os/Process;

    .line 862
    .line 863
    const-string v4, "isIsolated"

    .line 864
    .line 865
    new-array v5, v6, [Lcom/google/android/gms/internal/common/zzi;

    .line 866
    .line 867
    invoke-static {v1, v4, v5}, Lcom/google/android/gms/internal/common/zzj;->zza(Ljava/lang/Class;Ljava/lang/String;[Lcom/google/android/gms/internal/common/zzi;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    new-array v4, v6, [Ljava/lang/Object;

    .line 872
    .line 873
    const-string v5, "expected a non-null reference"

    .line 874
    .line 875
    if-eqz v1, :cond_17

    .line 876
    .line 877
    check-cast v1, Ljava/lang/Boolean;

    .line 878
    .line 879
    goto :goto_7

    .line 880
    :cond_17
    new-instance v1, Lcom/google/android/gms/internal/common/zzy;

    .line 881
    .line 882
    invoke-static {v5, v4}, Lcom/google/android/gms/internal/common/zzx;->zza(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v4

    .line 886
    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/common/zzy;-><init>(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    throw v1
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 890
    :catch_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 891
    .line 892
    :goto_7
    sput-object v1, Lx2/d;->h:Ljava/lang/Boolean;

    .line 893
    .line 894
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 895
    .line 896
    .line 897
    move-result v1

    .line 898
    if-nez v1, :cond_19

    .line 899
    .line 900
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 901
    .line 902
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 903
    .line 904
    .line 905
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 909
    .line 910
    .line 911
    move-result v0

    .line 912
    if-nez v0, :cond_1a

    .line 913
    .line 914
    iget v0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 915
    .line 916
    const/16 v1, 0x64

    .line 917
    .line 918
    if-le v0, v1, :cond_1a

    .line 919
    .line 920
    invoke-virtual {p1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 921
    .line 922
    .line 923
    goto :goto_8

    .line 924
    :cond_19
    move p1, v7

    .line 925
    goto :goto_9

    .line 926
    :cond_1a
    :goto_8
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 927
    .line 928
    .line 929
    move-result p1

    .line 930
    :goto_9
    if-nez p1, :cond_22

    .line 931
    .line 932
    iput-wide v2, p0, Lcom/google/android/gms/common/api/internal/g;->g:J

    .line 933
    .line 934
    goto/16 :goto_f

    .line 935
    .line 936
    :catchall_1
    move-exception p1

    .line 937
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 938
    throw p1

    .line 939
    :goto_a
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 940
    throw p1

    .line 941
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 942
    .line 943
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast p1, Lt2/b;

    .line 946
    .line 947
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 948
    .line 949
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    :cond_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 958
    .line 959
    .line 960
    move-result v2

    .line 961
    if-eqz v2, :cond_1c

    .line 962
    .line 963
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    check-cast v2, Lcom/google/android/gms/common/api/internal/a0;

    .line 968
    .line 969
    iget v3, v2, Lcom/google/android/gms/common/api/internal/a0;->m:I

    .line 970
    .line 971
    if-ne v3, v0, :cond_1b

    .line 972
    .line 973
    goto :goto_b

    .line 974
    :cond_1c
    move-object v2, v5

    .line 975
    :goto_b
    if-eqz v2, :cond_1e

    .line 976
    .line 977
    iget v0, p1, Lt2/b;->h:I

    .line 978
    .line 979
    const/16 v1, 0xd

    .line 980
    .line 981
    if-ne v0, v1, :cond_1d

    .line 982
    .line 983
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->l:Lt2/e;

    .line 984
    .line 985
    new-instance v3, Lcom/google/android/gms/common/api/Status;

    .line 986
    .line 987
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    sget v1, Lt2/h;->c:I

    .line 991
    .line 992
    invoke-static {v0}, Lt2/b;->a(I)Ljava/lang/String;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    iget-object p1, p1, Lt2/b;->j:Ljava/lang/String;

    .line 997
    .line 998
    new-instance v1, Ljava/lang/StringBuilder;

    .line 999
    .line 1000
    const-string v6, "Error resolution was canceled by the user, original error message: "

    .line 1001
    .line 1002
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1006
    .line 1007
    .line 1008
    const-string v0, ": "

    .line 1009
    .line 1010
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object p1

    .line 1020
    invoke-direct {v3, v4, p1, v5, v5}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v2, v3}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 1024
    .line 1025
    .line 1026
    return v7

    .line 1027
    :cond_1d
    iget-object v0, v2, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 1028
    .line 1029
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/internal/g;->c(Lcom/google/android/gms/common/api/internal/a;Lt2/b;)Lcom/google/android/gms/common/api/Status;

    .line 1030
    .line 1031
    .line 1032
    move-result-object p1

    .line 1033
    invoke-virtual {v2, p1}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 1034
    .line 1035
    .line 1036
    return v7

    .line 1037
    :cond_1e
    const-string p1, "Could not find API instance "

    .line 1038
    .line 1039
    const-string v1, " while trying to fail enqueued calls."

    .line 1040
    .line 1041
    invoke-static {v0, p1, v1}, Landroidx/emoji2/text/u;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object p1

    .line 1045
    new-instance v0, Ljava/lang/Exception;

    .line 1046
    .line 1047
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 1048
    .line 1049
    .line 1050
    const-string v1, "GoogleApiManager"

    .line 1051
    .line 1052
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1053
    .line 1054
    .line 1055
    return v7

    .line 1056
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast p1, Lcom/google/android/gms/common/api/internal/i0;

    .line 1059
    .line 1060
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1061
    .line 1062
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/i0;->c:Lcom/google/android/gms/common/api/m;

    .line 1063
    .line 1064
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/m;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 1073
    .line 1074
    if-nez v0, :cond_1f

    .line 1075
    .line 1076
    iget-object v0, p1, Lcom/google/android/gms/common/api/internal/i0;->c:Lcom/google/android/gms/common/api/m;

    .line 1077
    .line 1078
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/g;->d(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/internal/a0;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    :cond_1f
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 1083
    .line 1084
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-eqz v1, :cond_20

    .line 1089
    .line 1090
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/g;->o:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1093
    .line 1094
    .line 1095
    move-result v1

    .line 1096
    iget v2, p1, Lcom/google/android/gms/common/api/internal/i0;->b:I

    .line 1097
    .line 1098
    if-eq v1, v2, :cond_20

    .line 1099
    .line 1100
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/i0;->a:Lcom/google/android/gms/common/api/internal/r0;

    .line 1101
    .line 1102
    sget-object v1, Lcom/google/android/gms/common/api/internal/g;->u:Lcom/google/android/gms/common/api/Status;

    .line 1103
    .line 1104
    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/internal/r0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/a0;->p()V

    .line 1108
    .line 1109
    .line 1110
    return v7

    .line 1111
    :cond_20
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/i0;->a:Lcom/google/android/gms/common/api/internal/r0;

    .line 1112
    .line 1113
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/a0;->m(Lcom/google/android/gms/common/api/internal/r0;)V

    .line 1114
    .line 1115
    .line 1116
    return v7

    .line 1117
    :pswitch_e
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1118
    .line 1119
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1120
    .line 1121
    .line 1122
    move-result-object p1

    .line 1123
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1124
    .line 1125
    .line 1126
    move-result-object p1

    .line 1127
    :goto_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-eqz v0, :cond_22

    .line 1132
    .line 1133
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v0

    .line 1137
    check-cast v0, Lcom/google/android/gms/common/api/internal/a0;

    .line 1138
    .line 1139
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 1140
    .line 1141
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 1142
    .line 1143
    invoke-static {v1}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 1144
    .line 1145
    .line 1146
    iput-object v5, v0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 1147
    .line 1148
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/a0;->l()V

    .line 1149
    .line 1150
    .line 1151
    goto :goto_c

    .line 1152
    :pswitch_f
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1153
    .line 1154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    new-instance p1, Ljava/lang/ClassCastException;

    .line 1158
    .line 1159
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1160
    .line 1161
    .line 1162
    throw p1

    .line 1163
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1164
    .line 1165
    check-cast p1, Ljava/lang/Boolean;

    .line 1166
    .line 1167
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1168
    .line 1169
    .line 1170
    move-result p1

    .line 1171
    if-eq v7, p1, :cond_21

    .line 1172
    .line 1173
    goto :goto_d

    .line 1174
    :cond_21
    const-wide/16 v2, 0x2710

    .line 1175
    .line 1176
    :goto_d
    iput-wide v2, p0, Lcom/google/android/gms/common/api/internal/g;->g:J

    .line 1177
    .line 1178
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 1179
    .line 1180
    const/16 v0, 0xc

    .line 1181
    .line 1182
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 1183
    .line 1184
    .line 1185
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1186
    .line 1187
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1188
    .line 1189
    .line 1190
    move-result-object p1

    .line 1191
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1192
    .line 1193
    .line 1194
    move-result-object p1

    .line 1195
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v1

    .line 1199
    if-eqz v1, :cond_22

    .line 1200
    .line 1201
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v1

    .line 1205
    check-cast v1, Lcom/google/android/gms/common/api/internal/a;

    .line 1206
    .line 1207
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 1208
    .line 1209
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    iget-wide v3, p0, Lcom/google/android/gms/common/api/internal/g;->g:J

    .line 1214
    .line 1215
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1216
    .line 1217
    .line 1218
    goto :goto_e

    .line 1219
    :cond_22
    :goto_f
    return v7

    .line 1220
    nop

    .line 1221
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
