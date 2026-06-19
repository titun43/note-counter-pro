.class public final Lk/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/b;


# instance fields
.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lk/h3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls3/a;

    .line 4
    .line 5
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Landroid/content/Context;

    .line 11
    .line 12
    iget-object v0, p0, Lk/h3;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ls3/a;

    .line 15
    .line 16
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, Lg2/d;

    .line 22
    .line 23
    iget-object v0, p0, Lk/h3;->i:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ls3/a;

    .line 26
    .line 27
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v4, v0

    .line 32
    check-cast v4, Lm2/d;

    .line 33
    .line 34
    iget-object v0, p0, Lk/h3;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroidx/emoji2/text/t;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/emoji2/text/t;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v5, v0

    .line 43
    check-cast v5, Landroidx/emoji2/text/t;

    .line 44
    .line 45
    iget-object v0, p0, Lk/h3;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ls3/a;

    .line 48
    .line 49
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v6, v0

    .line 54
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    iget-object v0, p0, Lk/h3;->l:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ls3/a;

    .line 59
    .line 60
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v7, v0

    .line 65
    check-cast v7, Ln2/c;

    .line 66
    .line 67
    new-instance v8, Lt2/i;

    .line 68
    .line 69
    const/16 v0, 0x18

    .line 70
    .line 71
    invoke-direct {v8, v0}, Lt2/i;-><init>(I)V

    .line 72
    .line 73
    .line 74
    new-instance v9, Lt2/i;

    .line 75
    .line 76
    const/16 v0, 0x17

    .line 77
    .line 78
    invoke-direct {v9, v0}, Lt2/i;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lk/h3;->m:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ls3/a;

    .line 84
    .line 85
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v10, v0

    .line 90
    check-cast v10, Lm2/c;

    .line 91
    .line 92
    new-instance v1, Ll2/j;

    .line 93
    .line 94
    invoke-direct/range {v1 .. v10}, Ll2/j;-><init>(Landroid/content/Context;Lg2/d;Lm2/d;Landroidx/emoji2/text/t;Ljava/util/concurrent/Executor;Ln2/c;Lt2/i;Lt2/i;Lm2/c;)V

    .line 95
    .line 96
    .line 97
    return-object v1
.end method
