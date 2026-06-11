.class public final Lcom/google/android/gms/common/api/internal/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/n;
.implements Lcom/google/android/gms/common/api/o;


# instance fields
.field public final g:Ljava/util/LinkedList;

.field public final h:Lcom/google/android/gms/common/api/g;

.field public final i:Lcom/google/android/gms/common/api/internal/a;

.field public final j:Landroidx/emoji2/text/p;

.field public final k:Ljava/util/HashSet;

.field public final l:Ljava/util/HashMap;

.field public final m:I

.field public final n:Lcom/google/android/gms/common/api/internal/j0;

.field public o:Z

.field public final p:Ljava/util/ArrayList;

.field public q:Lt2/b;

.field public r:I

.field public final synthetic s:Lcom/google/android/gms/common/api/internal/g;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/m;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->k:Ljava/util/HashSet;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->p:Ljava/util/ArrayList;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput v1, p0, Lcom/google/android/gms/common/api/internal/a0;->r:I

    .line 39
    .line 40
    iget-object v1, p1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {p2, v2, p0}, Lcom/google/android/gms/common/api/m;->zab(Landroid/os/Looper;Lcom/google/android/gms/common/api/internal/a0;)Lcom/google/android/gms/common/api/g;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/m;->getApiKey()Lcom/google/android/gms/common/api/internal/a;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 57
    .line 58
    new-instance v3, Landroidx/emoji2/text/p;

    .line 59
    .line 60
    const/4 v4, 0x5

    .line 61
    invoke-direct {v3, v4}, Landroidx/emoji2/text/p;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iput-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->j:Landroidx/emoji2/text/p;

    .line 65
    .line 66
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/m;->zaa()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iput v3, p0, Lcom/google/android/gms/common/api/internal/a0;->m:I

    .line 71
    .line 72
    invoke-interface {v2}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/common/api/m;->zac(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/j0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/j0;

    .line 85
    .line 86
    return-void

    .line 87
    :cond_0
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/j0;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/a0;->f()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Landroidx/fragment/app/o;

    .line 20
    .line 21
    const/4 v2, 0x5

    .line 22
    invoke-direct {v0, p0, v2}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final b(Lt2/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->k:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_2

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Lt2/b;->l:Lt2/b;

    .line 20
    .line 21
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b0;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 28
    .line 29
    invoke-interface {p1}, Lcom/google/android/gms/common/api/g;->getEndpointPackageName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final c(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/common/api/internal/a0;->d(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v0

    .line 15
    :goto_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    :cond_1
    if-eq v2, v0, :cond_6

    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/google/android/gms/common/api/internal/r0;

    .line 37
    .line 38
    if-eqz p3, :cond_3

    .line 39
    .line 40
    iget v2, v1, Lcom/google/android/gms/common/api/internal/r0;->a:I

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    :cond_3
    if-eqz p1, :cond_4

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lcom/google/android/gms/common/api/internal/r0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    invoke-virtual {v1, p2}, Lcom/google/android/gms/common/api/internal/r0;->b(Ljava/lang/Exception;)V

    .line 52
    .line 53
    .line 54
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    return-void

    .line 59
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    const-string p2, "Status XOR exception should be null"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
.end method

.method public final e()V
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    :goto_0
    if-ge v3, v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, Lcom/google/android/gms/common/api/internal/r0;

    .line 20
    .line 21
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 22
    .line 23
    invoke-interface {v5}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {p0, v4}, Lcom/google/android/gms/common/api/internal/a0;->i(Lcom/google/android/gms/common/api/internal/r0;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_1
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 10
    .line 11
    sget-object v1, Lt2/b;->l:Lt2/b;

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/google/android/gms/common/api/internal/a0;->b(Lt2/b;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0xb

    .line 23
    .line 24
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x9

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/a0;->e()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/a0;->h()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v0, Ljava/lang/ClassCastException;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v0
.end method

.method public final g(I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 6
    .line 7
    invoke-static {v2}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput-object v2, p0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    iput-boolean v3, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 15
    .line 16
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 17
    .line 18
    invoke-interface {v4}, Lcom/google/android/gms/common/api/g;->getLastDisconnectMessage()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/a0;->j:Landroidx/emoji2/text/p;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v7, "The connection to Google Play services was lost"

    .line 30
    .line 31
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    if-ne p1, v3, :cond_0

    .line 35
    .line 36
    const-string p1, " due to service disconnection."

    .line 37
    .line 38
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v7, 0x3

    .line 43
    if-ne p1, v7, :cond_1

    .line 44
    .line 45
    const-string p1, " due to dead object exception."

    .line 46
    .line 47
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 51
    .line 52
    const-string p1, " Last reason for disconnect: "

    .line 53
    .line 54
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v4, Lcom/google/android/gms/common/api/Status;

    .line 65
    .line 66
    const/16 v6, 0x14

    .line 67
    .line 68
    invoke-direct {v4, v6, p1, v2, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lt2/b;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v3, v4}, Landroidx/emoji2/text/p;->G(ZLcom/google/android/gms/common/api/Status;)V

    .line 72
    .line 73
    .line 74
    const/16 p1, 0x9

    .line 75
    .line 76
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 77
    .line 78
    invoke-static {v1, p1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-wide/16 v4, 0x1388

    .line 83
    .line 84
    invoke-virtual {v1, p1, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 85
    .line 86
    .line 87
    const/16 p1, 0xb

    .line 88
    .line 89
    invoke-static {v1, p1, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-wide/32 v3, 0x1d4c0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 97
    .line 98
    .line 99
    iget-object p1, v0, Lcom/google/android/gms/common/api/internal/g;->m:Landroidx/emoji2/text/p;

    .line 100
    .line 101
    iget-object p1, p1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Landroid/util/SparseIntArray;

    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, Landroidx/emoji2/text/u;->p(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    throw v2
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-wide v3, v0, Lcom/google/android/gms/common/api/internal/g;->g:J

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final i(Lcom/google/android/gms/common/api/internal/r0;)Z
    .locals 14

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/common/api/internal/f0;

    .line 2
    .line 3
    const-string v1, "DeadObjectException thrown while running ApiCallRunner."

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->j:Landroidx/emoji2/text/p;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 11
    .line 12
    invoke-interface {v3}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-virtual {p1, v0, v4}, Lcom/google/android/gms/common/api/internal/r0;->d(Landroidx/emoji2/text/p;Z)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/r0;->c(Lcom/google/android/gms/common/api/internal/a0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :catch_0
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/a0;->onConnectionSuspended(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v3, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v2

    .line 30
    :cond_0
    move-object v0, p1

    .line 31
    check-cast v0, Lcom/google/android/gms/common/api/internal/f0;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/f0;->g(Lcom/google/android/gms/common/api/internal/a0;)[Lt2/d;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v3, :cond_5

    .line 40
    .line 41
    array-length v6, v3

    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 46
    .line 47
    invoke-interface {v6}, Lcom/google/android/gms/common/api/g;->getAvailableFeatures()[Lt2/d;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    new-array v6, v4, [Lt2/d;

    .line 54
    .line 55
    :cond_2
    new-instance v7, Lo/f;

    .line 56
    .line 57
    array-length v8, v6

    .line 58
    invoke-direct {v7, v8}, Lo/l;-><init>(I)V

    .line 59
    .line 60
    .line 61
    move v8, v4

    .line 62
    :goto_0
    array-length v9, v6

    .line 63
    if-ge v8, v9, :cond_3

    .line 64
    .line 65
    aget-object v9, v6, v8

    .line 66
    .line 67
    iget-object v10, v9, Lt2/d;->g:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v9}, Lt2/d;->a()J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    invoke-virtual {v7, v10, v9}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    array-length v6, v3

    .line 84
    move v8, v4

    .line 85
    :goto_1
    if-ge v8, v6, :cond_5

    .line 86
    .line 87
    aget-object v9, v3, v8

    .line 88
    .line 89
    iget-object v10, v9, Lt2/d;->g:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v7, v10}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    check-cast v10, Ljava/lang/Long;

    .line 96
    .line 97
    if-eqz v10, :cond_6

    .line 98
    .line 99
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    invoke-virtual {v9}, Lt2/d;->a()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    cmp-long v10, v10, v12

    .line 108
    .line 109
    if-gez v10, :cond_4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    :goto_2
    move-object v9, v5

    .line 116
    :cond_6
    :goto_3
    if-nez v9, :cond_7

    .line 117
    .line 118
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->j:Landroidx/emoji2/text/p;

    .line 119
    .line 120
    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 121
    .line 122
    invoke-interface {v3}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-virtual {p1, v0, v4}, Lcom/google/android/gms/common/api/internal/r0;->d(Landroidx/emoji2/text/p;Z)V

    .line 127
    .line 128
    .line 129
    :try_start_1
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/internal/r0;->c(Lcom/google/android/gms/common/api/internal/a0;)V
    :try_end_1
    .catch Landroid/os/DeadObjectException; {:try_start_1 .. :try_end_1} :catch_1

    .line 130
    .line 131
    .line 132
    return v2

    .line 133
    :catch_1
    invoke-virtual {p0, v2}, Lcom/google/android/gms/common/api/internal/a0;->onConnectionSuspended(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v3, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return v2

    .line 140
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object v1, v9, Lt2/d;->g:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v9}, Lt2/d;->a()J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    new-instance v3, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string p1, " could not execute call because it requires feature ("

    .line 165
    .line 166
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string p1, ", "

    .line 173
    .line 174
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string p1, ")."

    .line 181
    .line 182
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string v1, "GoogleApiManager"

    .line 190
    .line 191
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 195
    .line 196
    iget-boolean p1, p1, Lcom/google/android/gms/common/api/internal/g;->t:Z

    .line 197
    .line 198
    if-eqz p1, :cond_a

    .line 199
    .line 200
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/f0;->f(Lcom/google/android/gms/common/api/internal/a0;)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_a

    .line 205
    .line 206
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 207
    .line 208
    new-instance v0, Lcom/google/android/gms/common/api/internal/b0;

    .line 209
    .line 210
    invoke-direct {v0, p1, v9}, Lcom/google/android/gms/common/api/internal/b0;-><init>(Lcom/google/android/gms/common/api/internal/a;Lt2/d;)V

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->p:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    const-wide/16 v1, 0x1388

    .line 220
    .line 221
    const/16 v3, 0xf

    .line 222
    .line 223
    if-ltz p1, :cond_8

    .line 224
    .line 225
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->p:Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Lcom/google/android/gms/common/api/internal/b0;

    .line 232
    .line 233
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 234
    .line 235
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 236
    .line 237
    invoke-virtual {v0, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 241
    .line 242
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 243
    .line 244
    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->p:Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 258
    .line 259
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 260
    .line 261
    invoke-static {p1, v3, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {p1, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 266
    .line 267
    .line 268
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 269
    .line 270
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 271
    .line 272
    const/16 v1, 0x10

    .line 273
    .line 274
    invoke-static {p1, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-wide/32 v1, 0x1d4c0

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 282
    .line 283
    .line 284
    new-instance p1, Lt2/b;

    .line 285
    .line 286
    const/4 v0, 0x2

    .line 287
    invoke-direct {p1, v0, v5, v5}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->j(Lt2/b;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-nez v0, :cond_9

    .line 295
    .line 296
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 297
    .line 298
    iget v1, p0, Lcom/google/android/gms/common/api/internal/a0;->m:I

    .line 299
    .line 300
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/api/internal/g;->b(Lt2/b;I)Z

    .line 301
    .line 302
    .line 303
    :cond_9
    :goto_4
    return v4

    .line 304
    :cond_a
    new-instance p1, Lcom/google/android/gms/common/api/x;

    .line 305
    .line 306
    invoke-direct {p1, v9}, Lcom/google/android/gms/common/api/x;-><init>(Lt2/d;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/r0;->b(Ljava/lang/Exception;)V

    .line 310
    .line 311
    .line 312
    return v2
.end method

.method public final j(Lt2/b;)Z
    .locals 1

    .line 1
    sget-object p1, Lcom/google/android/gms/common/api/internal/g;->w:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    monitor-exit p1

    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    throw v0
.end method

.method public final k(Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->j:Landroidx/emoji2/text/p;

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iget-object v1, v1, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string p1, "Timing out service connection."

    .line 48
    .line 49
    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/a0;->h()V

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 p1, 0x0

    .line 60
    return p1
.end method

.method public final l()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v1}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_b

    .line 15
    .line 16
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->isConnecting()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto/16 :goto_6

    .line 23
    .line 24
    :cond_0
    const/16 v2, 0xa

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    :try_start_0
    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/g;->m:Landroidx/emoji2/text/p;

    .line 28
    .line 29
    iget-object v5, v0, Lcom/google/android/gms/common/api/internal/g;->k:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v6, v4, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, Landroid/util/SparseIntArray;

    .line 34
    .line 35
    invoke-static {v5}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresGooglePlayServices()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x0

    .line 43
    if-nez v7, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->getMinApkVersion()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    iget-object v9, v4, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v9, Landroid/util/SparseIntArray;

    .line 53
    .line 54
    const/4 v10, -0x1

    .line 55
    invoke-virtual {v9, v7, v10}, Landroid/util/SparseIntArray;->get(II)I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-eq v9, v10, :cond_2

    .line 60
    .line 61
    move v8, v9

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    move v9, v8

    .line 64
    :goto_0
    invoke-virtual {v6}, Landroid/util/SparseIntArray;->size()I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-ge v9, v11, :cond_4

    .line 69
    .line 70
    invoke-virtual {v6, v9}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    if-le v11, v7, :cond_3

    .line 75
    .line 76
    invoke-virtual {v6, v11}, Landroid/util/SparseIntArray;->get(I)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-nez v11, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    move v8, v10

    .line 87
    :goto_1
    if-ne v8, v10, :cond_5

    .line 88
    .line 89
    iget-object v4, v4, Landroidx/emoji2/text/p;->i:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Lt2/e;

    .line 92
    .line 93
    invoke-virtual {v4, v5, v7}, Lt2/f;->c(Landroid/content/Context;I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    move v8, v4

    .line 98
    :cond_5
    invoke-virtual {v6, v7, v8}, Landroid/util/SparseIntArray;->put(II)V

    .line 99
    .line 100
    .line 101
    :goto_2
    if-eqz v8, :cond_6

    .line 102
    .line 103
    new-instance v0, Lt2/b;

    .line 104
    .line 105
    invoke-direct {v0, v8, v3, v3}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const-string v4, "GoogleApiManager"

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0}, Lt2/b;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    new-instance v6, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v7, "The service for "

    .line 128
    .line 129
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, " is not available: "

    .line 136
    .line 137
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v0, v3}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :catch_0
    move-exception v0

    .line 155
    goto :goto_5

    .line 156
    :cond_6
    new-instance v4, Lcom/google/android/gms/common/api/internal/c0;

    .line 157
    .line 158
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 159
    .line 160
    invoke-direct {v4, v0, v1, v5}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Lcom/google/android/gms/common/api/internal/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/internal/a;)V

    .line 161
    .line 162
    .line 163
    invoke-interface {v1}, Lcom/google/android/gms/common/api/g;->requiresSignIn()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_a

    .line 168
    .line 169
    iget-object v10, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/j0;

    .line 170
    .line 171
    invoke-static {v10}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v10, Lcom/google/android/gms/common/api/internal/j0;->h:Landroid/os/Handler;

    .line 175
    .line 176
    iget-object v8, v10, Lcom/google/android/gms/common/api/internal/j0;->k:Lcom/google/android/gms/common/internal/i;

    .line 177
    .line 178
    iget-object v5, v10, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 179
    .line 180
    if-eqz v5, :cond_7

    .line 181
    .line 182
    invoke-interface {v5}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 183
    .line 184
    .line 185
    :cond_7
    invoke-static {v10}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    iput-object v5, v8, Lcom/google/android/gms/common/internal/i;->f:Ljava/lang/Integer;

    .line 194
    .line 195
    iget-object v5, v10, Lcom/google/android/gms/common/api/internal/j0;->i:Lc3/m;

    .line 196
    .line 197
    iget-object v6, v10, Lcom/google/android/gms/common/api/internal/j0;->g:Landroid/content/Context;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    iget-object v9, v8, Lcom/google/android/gms/common/internal/i;->e:Lf3/a;

    .line 204
    .line 205
    move-object v11, v10

    .line 206
    invoke-virtual/range {v5 .. v11}, Lc3/m;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/i;Ljava/lang/Object;Lcom/google/android/gms/common/api/n;Lcom/google/android/gms/common/api/o;)Lcom/google/android/gms/common/api/g;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    check-cast v5, Lg3/a;

    .line 211
    .line 212
    iput-object v5, v10, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 213
    .line 214
    iput-object v4, v10, Lcom/google/android/gms/common/api/internal/j0;->m:Lcom/google/android/gms/common/api/internal/c0;

    .line 215
    .line 216
    iget-object v5, v10, Lcom/google/android/gms/common/api/internal/j0;->j:Ljava/util/Set;

    .line 217
    .line 218
    if-eqz v5, :cond_9

    .line 219
    .line 220
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_8

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_8
    iget-object v0, v10, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    new-instance v5, Lcom/google/android/gms/common/internal/r;

    .line 233
    .line 234
    invoke-direct {v5, v0}, Lcom/google/android/gms/common/internal/r;-><init>(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v5}, Lcom/google/android/gms/common/internal/f;->connect(Lcom/google/android/gms/common/internal/d;)V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_9
    :goto_3
    new-instance v5, Landroidx/fragment/app/o;

    .line 242
    .line 243
    const/4 v6, 0x7

    .line 244
    invoke-direct {v5, v10, v6}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 248
    .line 249
    .line 250
    :cond_a
    :goto_4
    :try_start_1
    invoke-interface {v1, v4}, Lcom/google/android/gms/common/api/g;->connect(Lcom/google/android/gms/common/internal/d;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :catch_1
    move-exception v0

    .line 255
    new-instance v1, Lt2/b;

    .line 256
    .line 257
    invoke-direct {v1, v2, v3, v3}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :goto_5
    new-instance v1, Lt2/b;

    .line 265
    .line 266
    invoke-direct {v1, v2, v3, v3}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 270
    .line 271
    .line 272
    :cond_b
    :goto_6
    return-void
.end method

.method public final m(Lcom/google/android/gms/common/api/internal/r0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->i(Lcom/google/android/gms/common/api/internal/r0;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/a0;->h()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget v0, p1, Lt2/b;->h:I

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p1, Lt2/b;->i:Landroid/app/PendingIntent;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/common/api/internal/a0;->l()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final n(Lt2/b;Ljava/lang/RuntimeException;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->n:Lcom/google/android/gms/common/api/internal/j0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/j0;->l:Lg3/a;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->disconnect()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/g;->m:Landroidx/emoji2/text/p;

    .line 32
    .line 33
    iget-object v1, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Landroid/util/SparseIntArray;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->b(Lt2/b;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 44
    .line 45
    instance-of v1, v1, Lv2/c;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget v1, p1, Lt2/b;->h:I

    .line 51
    .line 52
    const/16 v3, 0x18

    .line 53
    .line 54
    if-eq v1, v3, :cond_1

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 57
    .line 58
    iput-boolean v2, v1, Lcom/google/android/gms/common/api/internal/g;->h:Z

    .line 59
    .line 60
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 61
    .line 62
    const/16 v3, 0x13

    .line 63
    .line 64
    invoke-virtual {v1, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-wide/32 v4, 0x493e0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    iget v1, p1, Lt2/b;->h:I

    .line 75
    .line 76
    const/4 v3, 0x4

    .line 77
    if-ne v1, v3, :cond_2

    .line 78
    .line 79
    sget-object p1, Lcom/google/android/gms/common/api/internal/g;->v:Lcom/google/android/gms/common/api/Status;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->q:Lt2/b;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    if-eqz p2, :cond_4

    .line 97
    .line 98
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 99
    .line 100
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 101
    .line 102
    invoke-static {p1}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 103
    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    invoke-virtual {p0, v0, p2, p1}, Lcom/google/android/gms/common/api/internal/a0;->d(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 111
    .line 112
    iget-boolean p2, p2, Lcom/google/android/gms/common/api/internal/g;->t:Z

    .line 113
    .line 114
    if-eqz p2, :cond_9

    .line 115
    .line 116
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 117
    .line 118
    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/g;->c(Lcom/google/android/gms/common/api/internal/a;Lt2/b;)Lcom/google/android/gms/common/api/Status;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p0, p2, v0, v2}, Lcom/google/android/gms/common/api/internal/a0;->d(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    .line 123
    .line 124
    .line 125
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->g:Ljava/util/LinkedList;

    .line 126
    .line 127
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_5

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->j(Lt2/b;)Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-nez p2, :cond_8

    .line 139
    .line 140
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 141
    .line 142
    iget v0, p0, Lcom/google/android/gms/common/api/internal/a0;->m:I

    .line 143
    .line 144
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/common/api/internal/g;->b(Lt2/b;I)Z

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    if-nez p2, :cond_8

    .line 149
    .line 150
    iget p2, p1, Lt2/b;->h:I

    .line 151
    .line 152
    const/16 v0, 0x12

    .line 153
    .line 154
    if-ne p2, v0, :cond_6

    .line 155
    .line 156
    iput-boolean v2, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 157
    .line 158
    :cond_6
    iget-boolean p2, p0, Lcom/google/android/gms/common/api/internal/a0;->o:Z

    .line 159
    .line 160
    if-eqz p2, :cond_7

    .line 161
    .line 162
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 163
    .line 164
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 165
    .line 166
    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 167
    .line 168
    const/16 v0, 0x9

    .line 169
    .line 170
    invoke-static {p1, v0, p2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    const-wide/16 v0, 0x1388

    .line 175
    .line 176
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 181
    .line 182
    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/g;->c(Lcom/google/android/gms/common/api/internal/a;Lt2/b;)Lcom/google/android/gms/common/api/Status;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 187
    .line 188
    .line 189
    :cond_8
    :goto_0
    return-void

    .line 190
    :cond_9
    iget-object p2, p0, Lcom/google/android/gms/common/api/internal/a0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 191
    .line 192
    invoke-static {p2, p1}, Lcom/google/android/gms/common/api/internal/g;->c(Lcom/google/android/gms/common/api/internal/a;Lt2/b;)Lcom/google/android/gms/common/api/Status;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final o(Lt2/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    new-instance v3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v4, "onSignInFailed for "

    .line 25
    .line 26
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " with "

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->disconnect(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final onConnectionFailed(Lt2/b;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/common/api/internal/a0;->n(Lt2/b;Ljava/lang/RuntimeException;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onConnectionSuspended(I)V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/a0;->g(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Landroidx/emoji2/text/j;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, p1, v2}, Landroidx/emoji2/text/j;-><init>(Ljava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final p()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->s:Lcom/google/android/gms/common/api/internal/g;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/common/internal/b0;->c(Landroid/os/Handler;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/google/android/gms/common/api/internal/g;->u:Lcom/google/android/gms/common/api/Status;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/a0;->c(Lcom/google/android/gms/common/api/Status;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/a0;->j:Landroidx/emoji2/text/p;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2, v0}, Landroidx/emoji2/text/p;->G(ZLcom/google/android/gms/common/api/Status;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->l:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-array v1, v2, [Lcom/google/android/gms/common/api/internal/j;

    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, [Lcom/google/android/gms/common/api/internal/j;

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_0

    .line 35
    .line 36
    aget-object v3, v0, v2

    .line 37
    .line 38
    new-instance v4, Lcom/google/android/gms/common/api/internal/q0;

    .line 39
    .line 40
    new-instance v5, Lh3/h;

    .line 41
    .line 42
    invoke-direct {v5}, Lh3/h;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-direct {v4, v3, v5}, Lcom/google/android/gms/common/api/internal/q0;-><init>(Lcom/google/android/gms/common/api/internal/j;Lh3/h;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v4}, Lcom/google/android/gms/common/api/internal/a0;->m(Lcom/google/android/gms/common/api/internal/r0;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance v0, Lt2/b;

    .line 55
    .line 56
    const/4 v1, 0x4

    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-direct {v0, v1, v2, v2}, Lt2/b;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/google/android/gms/common/api/internal/a0;->b(Lt2/b;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 65
    .line 66
    invoke-interface {v0}, Lcom/google/android/gms/common/api/g;->isConnected()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    new-instance v1, Lk1/j;

    .line 73
    .line 74
    const/4 v2, 0x3

    .line 75
    invoke-direct {v1, p0, v2}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/g;->onUserSignOut(Lcom/google/android/gms/common/internal/e;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void
.end method
