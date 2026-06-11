.class public abstract Lo4/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/emoji2/text/r;

.field public static final b:Landroidx/emoji2/text/r;

.field public static final c:Landroidx/emoji2/text/r;

.field public static final d:Landroidx/emoji2/text/r;

.field public static final e:Landroidx/emoji2/text/r;

.field public static final f:Landroidx/emoji2/text/r;

.field public static final g:Landroidx/emoji2/text/r;

.field public static final h:Lo4/h0;

.field public static final i:Lo4/h0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/emoji2/text/r;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lo4/w;->a:Landroidx/emoji2/text/r;

    .line 10
    .line 11
    new-instance v0, Landroidx/emoji2/text/r;

    .line 12
    .line 13
    const-string v1, "CLOSED_EMPTY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lo4/w;->b:Landroidx/emoji2/text/r;

    .line 19
    .line 20
    new-instance v0, Landroidx/emoji2/text/r;

    .line 21
    .line 22
    const-string v1, "COMPLETING_ALREADY"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lo4/w;->c:Landroidx/emoji2/text/r;

    .line 28
    .line 29
    new-instance v0, Landroidx/emoji2/text/r;

    .line 30
    .line 31
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lo4/w;->d:Landroidx/emoji2/text/r;

    .line 37
    .line 38
    new-instance v0, Landroidx/emoji2/text/r;

    .line 39
    .line 40
    const-string v1, "COMPLETING_RETRY"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lo4/w;->e:Landroidx/emoji2/text/r;

    .line 46
    .line 47
    new-instance v0, Landroidx/emoji2/text/r;

    .line 48
    .line 49
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 50
    .line 51
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lo4/w;->f:Landroidx/emoji2/text/r;

    .line 55
    .line 56
    new-instance v0, Landroidx/emoji2/text/r;

    .line 57
    .line 58
    const-string v1, "SEALED"

    .line 59
    .line 60
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lo4/w;->g:Landroidx/emoji2/text/r;

    .line 64
    .line 65
    new-instance v0, Lo4/h0;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, v1}, Lo4/h0;-><init>(Z)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lo4/w;->h:Lo4/h0;

    .line 72
    .line 73
    new-instance v0, Lo4/h0;

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-direct {v0, v1}, Lo4/h0;-><init>(Z)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lo4/w;->i:Lo4/h0;

    .line 80
    .line 81
    return-void
.end method

.method public static final a(Lw3/h;)Lt4/d;
    .locals 2

    .line 1
    new-instance v0, Lt4/d;

    .line 2
    .line 3
    sget-object v1, Lo4/s;->h:Lo4/s;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lo4/t0;

    .line 13
    .line 14
    invoke-direct {v1}, Lo4/t0;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v1}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-direct {v0, p0}, Lt4/d;-><init>(Lw3/h;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static b(Lt4/d;Lf4/p;)Lo4/z;
    .locals 4

    .line 1
    sget-object v0, Lo4/u;->g:Lo4/u;

    .line 2
    .line 3
    sget-object v1, Lw3/i;->g:Lw3/i;

    .line 4
    .line 5
    invoke-static {p0, v1}, Lo4/w;->j(Lo4/t;Lw3/h;)Lw3/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Lo4/u;->g:Lo4/u;

    .line 10
    .line 11
    new-instance v1, Lo4/z;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v1, p0, v3, v2}, Lo4/z;-><init>(Lw3/h;ZI)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v1, p1}, Lo4/a;->U(Lo4/u;Lo4/a;Lf4/p;)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public static final c(Lw3/h;)V
    .locals 1

    .line 1
    sget-object v0, Lo4/s;->h:Lo4/s;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lo4/r0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Lo4/r0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, Lo4/r0;->g()Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public static final d(Lw3/h;Lw3/h;Z)Lw3/h;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, Lo4/o;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Lo4/o;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2, v0}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, Lo4/o;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, v2}, Lo4/o;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2, v1}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0, p1}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance v0, Lo4/o;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, v1}, Lo4/o;-><init>(I)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lw3/i;->g:Lw3/i;

    .line 51
    .line 52
    invoke-interface {p0, v1, v0}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lw3/h;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    check-cast p1, Lw3/h;

    .line 61
    .line 62
    new-instance p2, Lo4/o;

    .line 63
    .line 64
    const/4 v0, 0x2

    .line 65
    invoke-direct {p2, v0}, Lo4/o;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v1, p2}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_1
    check-cast p1, Lw3/h;

    .line 73
    .line 74
    invoke-interface {p0, p1}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final f(Lw3/c;)Lo4/f;
    .locals 6

    .line 1
    instance-of v0, p0, Lt4/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo4/f;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Lo4/f;-><init>(ILw3/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Lt4/g;

    .line 14
    .line 15
    sget-object v1, Lt4/b;->c:Landroidx/emoji2/text/r;

    .line 16
    .line 17
    sget-object v2, Lt4/g;->n:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v3, Lo4/f;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v2, v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v3, Lo4/f;

    .line 42
    .line 43
    :goto_1
    if-eqz v3, :cond_6

    .line 44
    .line 45
    sget-object v0, Lo4/f;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v2, v1, Lo4/m;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    check-cast v1, Lo4/m;

    .line 56
    .line 57
    iget-object v1, v1, Lo4/m;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v3}, Lo4/f;->m()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    sget-object v1, Lo4/f;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 66
    .line 67
    const v2, 0x1fffffff

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Lo4/b;->a:Lo4/b;

    .line 74
    .line 75
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v3

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, Lo4/f;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, Lo4/f;-><init>(ILw3/c;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v3, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v3, v1, :cond_1

    .line 98
    .line 99
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v4, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Inconsistent state "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final g(Ljava/lang/Throwable;Lw3/h;)V
    .locals 3

    .line 1
    instance-of v0, p0, Lo4/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lo4/b0;

    .line 6
    .line 7
    iget-object p0, p0, Lo4/b0;->g:Ljava/lang/Throwable;

    .line 8
    .line 9
    :cond_0
    :try_start_0
    sget-object v0, Lo4/s;->g:Lo4/s;

    .line 10
    .line 11
    invoke-interface {p1, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lp4/b;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lp4/b;->f(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p0, p1}, Lt4/b;->d(Ljava/lang/Throwable;Lw3/h;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    if-ne p0, v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 35
    .line 36
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p0}, La/a;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object p0, v1

    .line 43
    :goto_1
    invoke-static {p0, p1}, Lt4/b;->d(Ljava/lang/Throwable;Lw3/h;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final h(Lo4/r0;ZLo4/v0;)Lo4/f0;
    .locals 9

    .line 1
    instance-of v0, p0, Lo4/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lo4/z0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lo4/z0;->E(ZLo4/v0;)Lo4/f0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, Lo4/v0;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, Lo4/u0;

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, Lo4/v0;

    .line 22
    .line 23
    const-string v5, "invoke"

    .line 24
    .line 25
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 26
    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v1 .. v8}, Lg4/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0, p1, v1}, Lo4/r0;->e(ZZLo4/u0;)Lo4/f0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static i(Lo4/t;Lf4/p;)Lo4/z;
    .locals 3

    .line 1
    sget-object v0, Lo4/u;->g:Lo4/u;

    .line 2
    .line 3
    sget-object v1, Lw3/i;->g:Lw3/i;

    .line 4
    .line 5
    invoke-static {p0, v1}, Lo4/w;->j(Lo4/t;Lw3/h;)Lw3/h;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v1, Lo4/u;->g:Lo4/u;

    .line 10
    .line 11
    new-instance v1, Lo4/z;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, p0, v2, v2}, Lo4/z;-><init>(Lw3/h;ZI)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0, v1, p1}, Lo4/a;->U(Lo4/u;Lo4/a;Lf4/p;)V

    .line 18
    .line 19
    .line 20
    return-object v1
.end method

.method public static final j(Lo4/t;Lw3/h;)Lw3/h;
    .locals 1

    .line 1
    invoke-interface {p0}, Lo4/t;->k()Lw3/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, v0}, Lo4/w;->d(Lw3/h;Lw3/h;Z)Lw3/h;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lo4/e0;->a:Lv4/e;

    .line 11
    .line 12
    if-eq p0, p1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lw3/d;->g:Lw3/d;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lo4/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lo4/n;

    .line 6
    .line 7
    iget-object p0, p0, Lo4/n;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final l(Lo4/f;Lw3/c;Z)V
    .locals 2

    .line 1
    sget-object v0, Lo4/f;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Lo4/f;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, Lo4/f;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    if-eqz p2, :cond_6

    .line 23
    .line 24
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Lt4/g;

    .line 30
    .line 31
    iget-object p2, p1, Lt4/g;->k:Ly3/c;

    .line 32
    .line 33
    iget-object p1, p1, Lt4/g;->m:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0, p1}, Lt4/b;->m(Lw3/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, Lt4/b;->d:Landroidx/emoji2/text/r;

    .line 44
    .line 45
    if-eq p1, v1, :cond_1

    .line 46
    .line 47
    invoke-static {p2, v0, p1}, Lo4/w;->o(Ly3/c;Lw3/h;Ljava/lang/Object;)Lo4/i1;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, Lw3/c;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1}, Lo4/i1;->W()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    return-void

    .line 66
    :cond_3
    :goto_2
    invoke-static {v0, p1}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, Lo4/i1;->W()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-static {v0, p1}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    throw p0

    .line 83
    :cond_6
    invoke-interface {p1, p0}, Lw3/c;->resumeWith(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static final m(Lw3/c;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, Lt4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lt4/g;

    .line 6
    .line 7
    invoke-virtual {p0}, Lt4/g;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x40

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Lo4/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-static {v1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, Lo4/w;->e(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    return-object v1
.end method

.method public static final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lo4/p0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lo4/p0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, Lo4/p0;->a:Lo4/o0;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final o(Ly3/c;Lw3/h;Ljava/lang/Object;)Lo4/i1;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    sget-object v1, Lo4/j1;->g:Lo4/j1;

    .line 6
    .line 7
    invoke-interface {p1, v1}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    :cond_1
    instance-of v1, p0, Lo4/c0;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    invoke-interface {p0}, Ly3/d;->getCallerFrame()Ly3/d;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    instance-of v1, p0, Lo4/i1;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    check-cast v0, Lo4/i1;

    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lo4/i1;->Y(Lw3/h;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static final p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 6
    .line 7
    new-instance v2, Lo4/o;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v3}, Lo4/o;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v1, v2}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v0, p1, v3}, Lo4/w;->d(Lw3/h;Lw3/h;Z)Lw3/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-static {p1}, Lo4/w;->c(Lw3/h;)V

    .line 35
    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    new-instance v0, Lt4/r;

    .line 40
    .line 41
    invoke-direct {v0, p1, p2}, Lt4/r;-><init>(Lw3/h;Ly3/c;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v0, p0}, La/a;->y(Lt4/r;Lt4/r;Lf4/p;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    sget-object v1, Lw3/d;->g:Lw3/d;

    .line 50
    .line 51
    invoke-interface {p1, v1}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-interface {v0, v1}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v2, v0}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Lo4/i1;

    .line 66
    .line 67
    invoke-direct {v0, p1, p2}, Lo4/i1;-><init>(Lw3/h;Ly3/c;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    iget-object p2, v0, Lo4/a;->i:Lw3/h;

    .line 72
    .line 73
    invoke-static {p2, p1}, Lt4/b;->m(Lw3/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :try_start_0
    invoke-static {v0, v0, p0}, La/a;->y(Lt4/r;Lt4/r;Lf4/p;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    invoke-static {p2, p1}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    invoke-static {p2, p1}, Lt4/b;->g(Lw3/h;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw p0

    .line 90
    :cond_2
    new-instance v0, Lo4/c0;

    .line 91
    .line 92
    invoke-direct {v0, p1, p2}, Lt4/r;-><init>(Lw3/h;Ly3/c;)V

    .line 93
    .line 94
    .line 95
    :try_start_1
    check-cast p0, Ly3/a;

    .line 96
    .line 97
    invoke-virtual {p0, v0, v0}, Ly3/a;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/a;->o(Lw3/c;)Lw3/c;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 106
    .line 107
    invoke-static {p1, p0}, Lt4/b;->h(Ljava/lang/Object;Lw3/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    .line 110
    sget-object p0, Lo4/c0;->k:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 111
    .line 112
    :cond_3
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    const/4 p0, 0x2

    .line 119
    if-ne p1, p0, :cond_5

    .line 120
    .line 121
    sget-object p0, Lo4/z0;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lo4/w;->n(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    instance-of p1, p0, Lo4/n;

    .line 132
    .line 133
    if-nez p1, :cond_4

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    check-cast p0, Lo4/n;

    .line 137
    .line 138
    iget-object p0, p0, Lo4/n;->a:Ljava/lang/Throwable;

    .line 139
    .line 140
    throw p0

    .line 141
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    const-string p1, "Already suspended"

    .line 144
    .line 145
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :cond_6
    const/4 p1, 0x1

    .line 150
    invoke-virtual {p0, v0, v3, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_3

    .line 155
    .line 156
    sget-object p0, Lx3/a;->g:Lx3/a;

    .line 157
    .line 158
    :goto_1
    sget-object p1, Lx3/a;->g:Lx3/a;

    .line 159
    .line 160
    return-object p0

    .line 161
    :catchall_1
    move-exception p0

    .line 162
    instance-of p1, p0, Lo4/b0;

    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    check-cast p0, Lo4/b0;

    .line 167
    .line 168
    iget-object p0, p0, Lo4/b0;->g:Ljava/lang/Throwable;

    .line 169
    .line 170
    :cond_7
    invoke-static {p0}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v0, p1}, Lo4/a;->resumeWith(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    throw p0
.end method
