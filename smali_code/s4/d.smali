.class public final Ls4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls4/f;


# instance fields
.field public final g:Lw3/h;

.field public final h:I

.field public final i:Lq4/a;

.field public final j:Lr4/b;


# direct methods
.method public constructor <init>(Lr4/b;Lw3/h;ILq4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ls4/d;->g:Lw3/h;

    .line 5
    .line 6
    iput p3, p0, Ls4/d;->h:I

    .line 7
    .line 8
    iput-object p4, p0, Ls4/d;->i:Lq4/a;

    .line 9
    .line 10
    iput-object p1, p0, Ls4/d;->j:Lr4/b;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lw3/i;->g:Lw3/i;

    .line 8
    .line 9
    iget-object v2, p0, Ls4/d;->g:Lw3/h;

    .line 10
    .line 11
    if-eq v2, v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "context="

    .line 16
    .line 17
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v1, -0x3

    .line 31
    iget v2, p0, Ls4/d;->h:I

    .line 32
    .line 33
    if-eq v2, v1, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "capacity="

    .line 38
    .line 39
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    sget-object v1, Lq4/a;->g:Lq4/a;

    .line 53
    .line 54
    iget-object v2, p0, Ls4/d;->i:Lq4/a;

    .line 55
    .line 56
    if-eq v2, v1, :cond_2

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "onBufferOverflow="

    .line 61
    .line 62
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v2, 0x5b

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    const/16 v3, 0x3e

    .line 98
    .line 99
    invoke-static {v0, v2, v3}, Lu3/g;->X(Ljava/util/Collection;Lm4/g;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const/16 v0, 0x5d

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method

.method public final d(Lw3/h;Lq4/a;)Lr4/b;
    .locals 5

    .line 1
    iget-object v0, p0, Ls4/d;->g:Lw3/h;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, Lq4/a;->g:Lq4/a;

    .line 8
    .line 9
    const/4 v2, -0x3

    .line 10
    iget-object v3, p0, Ls4/d;->i:Lq4/a;

    .line 11
    .line 12
    iget v4, p0, Ls4/d;->h:I

    .line 13
    .line 14
    if-eq p2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-ne v4, v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v2, v4

    .line 21
    :goto_0
    move-object p2, v3

    .line 22
    :goto_1
    invoke-static {p1, v0}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    if-ne v2, v4, :cond_2

    .line 29
    .line 30
    if-ne p2, v3, :cond_2

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    new-instance v0, Ls4/d;

    .line 34
    .line 35
    iget-object v1, p0, Ls4/d;->j:Lr4/b;

    .line 36
    .line 37
    invoke-direct {v0, v1, p1, v2, p2}, Ls4/d;-><init>(Lr4/b;Lw3/h;ILq4/a;)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public final j(Lr4/c;Lw3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ls4/d;->h:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lt3/h;->a:Lt3/h;

    .line 6
    .line 7
    if-ne v0, v1, :cond_5

    .line 8
    .line 9
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    new-instance v4, Lo4/o;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v4, v5}, Lo4/o;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, Ls4/d;->g:Lw3/h;

    .line 22
    .line 23
    invoke-interface {v5, v1, v4}, Lw3/h;->j(Ljava/lang/Object;Lf4/p;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, v5}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 41
    invoke-static {v0, v5, v1}, Lo4/w;->d(Lw3/h;Lw3/h;Z)Lw3/h;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-static {v1, v0}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    check-cast p2, Ly3/c;

    .line 52
    .line 53
    iget-object v0, p0, Ls4/d;->j:Lr4/b;

    .line 54
    .line 55
    invoke-interface {v0, p1, p2}, Lr4/b;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 60
    .line 61
    if-ne p1, p2, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object p1, v3

    .line 65
    :goto_1
    if-ne p1, p2, :cond_7

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_2
    sget-object v4, Lw3/d;->g:Lw3/d;

    .line 69
    .line 70
    invoke-interface {v1, v4}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v0, v4}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v5, v0}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    instance-of v4, p1, Ls4/m;

    .line 89
    .line 90
    if-nez v4, :cond_4

    .line 91
    .line 92
    instance-of v4, p1, Ls4/h;

    .line 93
    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    new-instance v4, Lr4/n;

    .line 98
    .line 99
    invoke-direct {v4, p1, v0}, Lr4/n;-><init>(Lr4/c;Lw3/h;)V

    .line 100
    .line 101
    .line 102
    move-object p1, v4

    .line 103
    :cond_4
    :goto_2
    new-instance v0, Ls4/c;

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    invoke-direct {v0, p0, v2, v4}, Ls4/c;-><init>(Ls4/d;Lw3/c;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Lt4/b;->l(Lw3/h;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v1, p1, v2, v0, p2}, Ls4/i;->a(Lw3/h;Ljava/lang/Object;Ljava/lang/Object;Lf4/p;Lw3/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 118
    .line 119
    if-ne p1, p2, :cond_7

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_5
    new-instance v0, Lp3/w;

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    invoke-direct {v0, p1, p0, v2, v1}, Lp3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 126
    .line 127
    .line 128
    check-cast p2, Ly3/c;

    .line 129
    .line 130
    new-instance p1, Lt4/r;

    .line 131
    .line 132
    invoke-interface {p2}, Lw3/c;->getContext()Lw3/h;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-direct {p1, v1, p2}, Lt4/r;-><init>(Lw3/h;Ly3/c;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p1, v0}, La/a;->y(Lt4/r;Lt4/r;Lf4/p;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    sget-object p2, Lx3/a;->g:Lx3/a;

    .line 144
    .line 145
    if-ne p1, p2, :cond_6

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_6
    move-object p1, v3

    .line 149
    :goto_3
    if-ne p1, p2, :cond_7

    .line 150
    .line 151
    return-object p1

    .line 152
    :cond_7
    return-object v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ls4/d;->j:Lr4/b;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ls4/d;->a()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
