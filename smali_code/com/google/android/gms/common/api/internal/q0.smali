.class public final Lcom/google/android/gms/common/api/internal/q0;
.super Lcom/google/android/gms/common/api/internal/f0;
.source "SourceFile"


# instance fields
.field public final b:Lh3/h;

.field public final c:Lcom/google/android/gms/common/api/internal/j;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/j;Lh3/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/internal/r0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Lh3/h;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/q0;->c:Lcom/google/android/gms/common/api/internal/j;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/j;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/j;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Lh3/h;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lh3/h;->b(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Lh3/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh3/h;->b(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/internal/a0;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/q0;->h(Lcom/google/android/gms/common/api/internal/a0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Lh3/h;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lh3/h;->b(Ljava/lang/Exception;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_1
    move-exception p1

    .line 13
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/r0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/q0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_2
    move-exception p1

    .line 22
    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/r0;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/q0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public final bridge synthetic d(Landroidx/emoji2/text/p;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/internal/a0;)Z
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q0;->c:Lcom/google/android/gms/common/api/internal/j;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroidx/emoji2/text/u;->p(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public final g(Lcom/google/android/gms/common/api/internal/a0;)[Lt2/d;
    .locals 1

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q0;->c:Lcom/google/android/gms/common/api/internal/j;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroidx/emoji2/text/u;->p(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public final h(Lcom/google/android/gms/common/api/internal/a0;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/q0;->c:Lcom/google/android/gms/common/api/internal/j;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroidx/emoji2/text/u;->p(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/q0;->b:Lh3/h;

    .line 13
    .line 14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object p1, p1, Lh3/h;->a:Lh3/n;

    .line 17
    .line 18
    iget-object v1, p1, Lh3/n;->a:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iget-boolean v2, p1, Lh3/n;->c:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    monitor-exit v1

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v2, 0x1

    .line 30
    iput-boolean v2, p1, Lh3/n;->c:Z

    .line 31
    .line 32
    iput-object v0, p1, Lh3/n;->e:Ljava/lang/Object;

    .line 33
    .line 34
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    iget-object v0, p1, Lh3/n;->b:Lh3/m;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lh3/m;->b(Lh3/g;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :goto_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method
