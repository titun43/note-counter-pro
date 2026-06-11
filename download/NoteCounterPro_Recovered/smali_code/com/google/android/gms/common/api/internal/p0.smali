.class public final Lcom/google/android/gms/common/api/internal/p0;
.super Lcom/google/android/gms/common/api/internal/f0;
.source "SourceFile"


# instance fields
.field public final b:Lcom/google/android/gms/common/api/internal/u;

.field public final c:Lh3/h;

.field public final d:Lcom/google/android/gms/common/api/internal/s;


# direct methods
.method public constructor <init>(ILcom/google/android/gms/common/api/internal/u;Lh3/h;Lcom/google/android/gms/common/api/internal/s;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/r0;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lh3/h;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/p0;->b:Lcom/google/android/gms/common/api/internal/u;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/google/android/gms/common/api/internal/p0;->d:Lcom/google/android/gms/common/api/internal/s;

    .line 9
    .line 10
    const/4 p3, 0x2

    .line 11
    if-ne p1, p3, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p2, Lcom/google/android/gms/common/api/internal/u;->b:Z

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string p2, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p0;->d:Lcom/google/android/gms/common/api/internal/s;

    .line 2
    .line 3
    check-cast v0, Lt2/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->i:Landroid/app/PendingIntent;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/s;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/j;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lh3/h;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lh3/h;->b(Ljava/lang/Exception;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lh3/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh3/h;->b(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/internal/a0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lh3/h;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p0;->b:Lcom/google/android/gms/common/api/internal/u;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/gms/common/api/internal/k0;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/k0;->d:Lcom/google/android/gms/common/api/internal/t;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/t;->a:Lcom/google/android/gms/common/api/internal/q;

    .line 12
    .line 13
    invoke-interface {v1, p1, v0}, Lcom/google/android/gms/common/api/internal/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :catch_1
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :catch_2
    move-exception p1

    .line 22
    goto :goto_2

    .line 23
    :goto_0
    invoke-virtual {v0, p1}, Lh3/h;->b(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :goto_1
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/r0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/p0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :goto_2
    throw p1
.end method

.method public final d(Landroidx/emoji2/text/p;Z)V
    .locals 4

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p1, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p0;->c:Lh3/h;

    .line 10
    .line 11
    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p2, v1, Lh3/h;->a:Lh3/n;

    .line 15
    .line 16
    new-instance v0, Landroidx/emoji2/text/p;

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v0, p1, v1, v2, v3}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object p1, Lh3/i;->a:Lf2/q;

    .line 27
    .line 28
    new-instance v1, Lh3/j;

    .line 29
    .line 30
    invoke-direct {v1, p1, v0}, Lh3/j;-><init>(Ljava/util/concurrent/Executor;Lh3/d;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p2, Lh3/n;->b:Lh3/m;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lh3/m;->a(Lh3/l;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lh3/n;->h()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/a0;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/p0;->b:Lcom/google/android/gms/common/api/internal/u;

    .line 2
    .line 3
    iget-boolean p1, p1, Lcom/google/android/gms/common/api/internal/u;->b:Z

    .line 4
    .line 5
    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/a0;)[Lt2/d;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/p0;->b:Lcom/google/android/gms/common/api/internal/u;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/u;->a:[Lt2/d;

    .line 4
    .line 5
    return-object p1
.end method
