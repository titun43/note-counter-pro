.class public final Lh3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/l;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/Object;

.field public final d:Lh3/j;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lh3/j;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh3/k;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p3, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lh3/k;->c:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, p0, Lh3/k;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    iput-object p2, p0, Lh3/k;->d:Lh3/j;

    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance p3, Ljava/lang/Object;

    .line 25
    .line 26
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lh3/k;->c:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object p1, p0, Lh3/k;->b:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    iput-object p2, p0, Lh3/k;->d:Lh3/j;

    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lh3/g;)V
    .locals 4

    .line 1
    iget v0, p0, Lh3/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lh3/g;->c()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lh3/k;->c:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-object v0, p0, Lh3/k;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance v1, Lc0/a;

    .line 19
    .line 20
    const/16 v2, 0x9

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, p0, p1, v2, v3}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1

    .line 33
    :cond_0
    :goto_0
    return-void

    .line 34
    :pswitch_0
    check-cast p1, Lh3/n;

    .line 35
    .line 36
    iget-boolean p1, p1, Lh3/n;->d:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, Lh3/k;->c:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter p1

    .line 43
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 44
    iget-object p1, p0, Lh3/k;->b:Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    new-instance v0, Landroidx/fragment/app/o;

    .line 47
    .line 48
    const/16 v1, 0xb

    .line 49
    .line 50
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    move-exception v0

    .line 58
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    throw v0

    .line 60
    :cond_1
    :goto_1
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
