.class public final Lh3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/l;
.implements Lh3/e;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lh3/b;Lh3/n;I)V
    .locals 0

    .line 1
    iput p4, p0, Lh3/j;->a:I

    iput-object p1, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lh3/j;->d:Ljava/lang/Object;

    iput-object p3, p0, Lh3/j;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lh3/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lh3/j;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh3/j;->d:Ljava/lang/Object;

    iput-object p1, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lh3/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lh3/e;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lh3/j;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lh3/j;->d:Ljava/lang/Object;

    iput-object p1, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lh3/j;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lh3/g;)V
    .locals 4

    .line 1
    iget v0, p0, Lh3/j;->a:I

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
    if-nez v0, :cond_0

    .line 11
    .line 12
    move-object v0, p1

    .line 13
    check-cast v0, Lh3/n;

    .line 14
    .line 15
    iget-boolean v0, v0, Lh3/n;->d:Z

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lh3/j;->d:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iget-object v0, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    new-instance v1, Lc0/a;

    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-direct {v1, p0, p1, v2, v3}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_0
    :goto_0
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, Lh3/j;->d:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter v0

    .line 44
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    iget-object v0, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    new-instance v1, Lc0/a;

    .line 48
    .line 49
    const/4 v2, 0x7

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v1, p0, p1, v2, v3}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 60
    throw p1

    .line 61
    :pswitch_1
    new-instance v0, Lc0/a;

    .line 62
    .line 63
    const/4 v1, 0x6

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-direct {v0, p0, p1, v1, v2}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    .line 69
    .line 70
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_2
    new-instance v0, Lc0/a;

    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-direct {v0, p0, p1, v1, v2}, Lc0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lh3/j;->b:Ljava/util/concurrent/Executor;

    .line 82
    .line 83
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh3/j;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh3/n;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lh3/n;->d(Ljava/lang/Exception;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
