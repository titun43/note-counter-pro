.class public final Lp1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq1/b;


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lp1/b;

.field public final b:[Lq1/c;

.field public final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkConstraintsTracker"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lp1/c;->d:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw1/a;Lp1/b;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p3, p0, Lp1/c;->a:Lp1/b;

    .line 9
    .line 10
    new-instance p3, Lq1/a;

    .line 11
    .line 12
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lr1/a;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {p3, v0, v1}, Lq1/a;-><init>(Lr1/d;I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lq1/a;

    .line 25
    .line 26
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v2, v2, Lr1/h;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lr1/b;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v0, v2, v3}, Lq1/a;-><init>(Lr1/d;I)V

    .line 36
    .line 37
    .line 38
    new-instance v2, Lq1/a;

    .line 39
    .line 40
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v4, v4, Lr1/h;->j:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Lr1/g;

    .line 47
    .line 48
    const/4 v5, 0x4

    .line 49
    invoke-direct {v2, v4, v5}, Lq1/a;-><init>(Lr1/d;I)V

    .line 50
    .line 51
    .line 52
    new-instance v4, Lq1/a;

    .line 53
    .line 54
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v6, v6, Lr1/h;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Lr1/f;

    .line 61
    .line 62
    const/4 v7, 0x2

    .line 63
    invoke-direct {v4, v6, v7}, Lq1/a;-><init>(Lr1/d;I)V

    .line 64
    .line 65
    .line 66
    new-instance v6, Lq1/a;

    .line 67
    .line 68
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    iget-object v8, v8, Lr1/h;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, Lr1/f;

    .line 75
    .line 76
    const/4 v9, 0x3

    .line 77
    invoke-direct {v6, v8, v9}, Lq1/a;-><init>(Lr1/d;I)V

    .line 78
    .line 79
    .line 80
    new-instance v8, Lq1/e;

    .line 81
    .line 82
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    iget-object v10, v10, Lr1/h;->i:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v10, Lr1/f;

    .line 89
    .line 90
    invoke-direct {v8, v10}, Lq1/c;-><init>(Lr1/d;)V

    .line 91
    .line 92
    .line 93
    new-instance v10, Lq1/d;

    .line 94
    .line 95
    invoke-static {p1, p2}, Lr1/h;->n(Landroid/content/Context;Lw1/a;)Lr1/h;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object p1, p1, Lr1/h;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Lr1/f;

    .line 102
    .line 103
    invoke-direct {v10, p1}, Lq1/c;-><init>(Lr1/d;)V

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x7

    .line 107
    new-array p1, p1, [Lq1/c;

    .line 108
    .line 109
    aput-object p3, p1, v1

    .line 110
    .line 111
    aput-object v0, p1, v3

    .line 112
    .line 113
    aput-object v2, p1, v7

    .line 114
    .line 115
    aput-object v4, p1, v9

    .line 116
    .line 117
    aput-object v6, p1, v5

    .line 118
    .line 119
    const/4 p2, 0x5

    .line 120
    aput-object v8, p1, p2

    .line 121
    .line 122
    const/4 p2, 0x6

    .line 123
    aput-object v10, p1, p2

    .line 124
    .line 125
    iput-object p1, p0, Lp1/c;->b:[Lq1/c;

    .line 126
    .line 127
    new-instance p1, Ljava/lang/Object;

    .line 128
    .line 129
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object p1, p0, Lp1/c;->c:Ljava/lang/Object;

    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lp1/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp1/c;->b:[Lq1/c;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    move v4, v3

    .line 9
    :goto_0
    if-ge v4, v2, :cond_1

    .line 10
    .line 11
    aget-object v5, v1, v4

    .line 12
    .line 13
    iget-object v6, v5, Lq1/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    invoke-virtual {v5, v6}, Lq1/c;->b(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    iget-object v6, v5, Lq1/c;->a:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v2, Lp1/c;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v5, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v6, "Work "

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p1, " constrained by "

    .line 59
    .line 60
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-array v4, v3, [Ljava/lang/Throwable;

    .line 71
    .line 72
    invoke-virtual {v1, v2, p1, v4}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    monitor-exit v0

    .line 76
    return v3

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_1

    .line 79
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/4 p1, 0x1

    .line 83
    monitor-exit v0

    .line 84
    return p1

    .line 85
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    throw p1
.end method

.method public final b(Ljava/util/Collection;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lp1/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp1/c;->b:[Lq1/c;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    move v4, v3

    .line 9
    :goto_0
    if-ge v4, v2, :cond_1

    .line 10
    .line 11
    aget-object v5, v1, v4

    .line 12
    .line 13
    iget-object v6, v5, Lq1/c;->d:Lq1/b;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    iput-object v6, v5, Lq1/c;->d:Lq1/b;

    .line 19
    .line 20
    iget-object v7, v5, Lq1/c;->b:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v5, v6, v7}, Lq1/c;->d(Lq1/b;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_3

    .line 30
    :cond_1
    iget-object v1, p0, Lp1/c;->b:[Lq1/c;

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    move v4, v3

    .line 34
    :goto_1
    if-ge v4, v2, :cond_2

    .line 35
    .line 36
    aget-object v5, v1, v4

    .line 37
    .line 38
    invoke-virtual {v5, p1}, Lq1/c;->c(Ljava/lang/Iterable;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v4, v4, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object p1, p0, Lp1/c;->b:[Lq1/c;

    .line 45
    .line 46
    array-length v1, p1

    .line 47
    :goto_2
    if-ge v3, v1, :cond_4

    .line 48
    .line 49
    aget-object v2, p1, v3

    .line 50
    .line 51
    iget-object v4, v2, Lq1/c;->d:Lq1/b;

    .line 52
    .line 53
    if-eq v4, p0, :cond_3

    .line 54
    .line 55
    iput-object p0, v2, Lq1/c;->d:Lq1/b;

    .line 56
    .line 57
    iget-object v4, v2, Lq1/c;->b:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {v2, p0, v4}, Lq1/c;->d(Lq1/b;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p1
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lp1/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lp1/c;->b:[Lq1/c;

    .line 5
    .line 6
    array-length v2, v1

    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v2, :cond_1

    .line 9
    .line 10
    aget-object v4, v1, v3

    .line 11
    .line 12
    iget-object v5, v4, Lq1/c;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    iget-object v5, v4, Lq1/c;->c:Lr1/d;

    .line 24
    .line 25
    invoke-virtual {v5, v4}, Lr1/d;->b(Lq1/c;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    monitor-exit v0

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw v1
.end method
