.class public final Lf2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld1/b;


# instance fields
.field public g:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf2/k;->g:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf2/l;
    .locals 11

    .line 1
    iget-object v0, p0, Lf2/k;->g:Landroid/content/Context;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lf2/l;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lf2/o;->a:Lt2/i;

    .line 11
    .line 12
    invoke-static {v2}, Lh2/a;->a(Lh2/b;)Ls3/a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iput-object v2, v1, Lf2/l;->g:Ls3/a;

    .line 17
    .line 18
    new-instance v2, Lu1/f;

    .line 19
    .line 20
    const/16 v3, 0x9

    .line 21
    .line 22
    invoke-direct {v2, v0, v3}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    iput-object v2, v1, Lf2/l;->h:Lu1/f;

    .line 26
    .line 27
    new-instance v0, Lu1/f;

    .line 28
    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    invoke-direct {v0, v2, v3}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Landroidx/emoji2/text/p;

    .line 35
    .line 36
    const/16 v4, 0xb

    .line 37
    .line 38
    invoke-direct {v3, v4, v2, v0}, Landroidx/emoji2/text/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Lh2/a;->a(Lh2/b;)Ls3/a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, v1, Lf2/l;->i:Ls3/a;

    .line 46
    .line 47
    iget-object v0, v1, Lf2/l;->h:Lu1/f;

    .line 48
    .line 49
    new-instance v2, Lk1/j;

    .line 50
    .line 51
    const/16 v3, 0x11

    .line 52
    .line 53
    invoke-direct {v2, v0, v3}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v1, Lf2/l;->j:Lk1/j;

    .line 57
    .line 58
    new-instance v2, Lu1/f;

    .line 59
    .line 60
    const/16 v3, 0x10

    .line 61
    .line 62
    invoke-direct {v2, v0, v3}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lh2/a;->a(Lh2/b;)Ls3/a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v2, v1, Lf2/l;->j:Lk1/j;

    .line 70
    .line 71
    new-instance v3, Landroidx/emoji2/text/p;

    .line 72
    .line 73
    const/16 v4, 0xd

    .line 74
    .line 75
    invoke-direct {v3, v4, v2, v0}, Landroidx/emoji2/text/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Lh2/a;->a(Lh2/b;)Ls3/a;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    iput-object v9, v1, Lf2/l;->k:Ls3/a;

    .line 83
    .line 84
    new-instance v0, Lt2/i;

    .line 85
    .line 86
    const/16 v2, 0x11

    .line 87
    .line 88
    invoke-direct {v0, v2}, Lt2/i;-><init>(I)V

    .line 89
    .line 90
    .line 91
    iget-object v2, v1, Lf2/l;->h:Lu1/f;

    .line 92
    .line 93
    new-instance v8, Landroidx/emoji2/text/t;

    .line 94
    .line 95
    const/16 v3, 0xe

    .line 96
    .line 97
    invoke-direct {v8, v2, v9, v0, v3}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    iget-object v6, v1, Lf2/l;->g:Ls3/a;

    .line 101
    .line 102
    iget-object v7, v1, Lf2/l;->i:Ls3/a;

    .line 103
    .line 104
    new-instance v5, Lk2/c;

    .line 105
    .line 106
    move-object v10, v9

    .line 107
    invoke-direct/range {v5 .. v10}, Lk2/c;-><init>(Ls3/a;Ls3/a;Landroidx/emoji2/text/t;Ls3/a;Ls3/a;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Lk/h3;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v2, v0, Lk/h3;->g:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v7, v0, Lk/h3;->h:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v9, v0, Lk/h3;->i:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v8, v0, Lk/h3;->j:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v6, v0, Lk/h3;->k:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v9, v0, Lk/h3;->l:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v9, v0, Lk/h3;->m:Ljava/lang/Object;

    .line 128
    .line 129
    new-instance v2, Lr1/h;

    .line 130
    .line 131
    invoke-direct {v2, v6, v9, v8, v9}, Lr1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v3, Landroidx/emoji2/text/t;

    .line 135
    .line 136
    const/16 v4, 0x9

    .line 137
    .line 138
    invoke-direct {v3, v5, v0, v2, v4}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {v3}, Lh2/a;->a(Lh2/b;)Ls3/a;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, v1, Lf2/l;->l:Ls3/a;

    .line 146
    .line 147
    return-object v1

    .line 148
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-class v2, Landroid/content/Context;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v2, " must be set"

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method

.method public b(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/k;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2, p1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/k;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p2, p1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lf2/k;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lz2/b;->q(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_0
    invoke-static {}, Lx2/d;->f()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getNameForUid(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0, v1}, Lg0/b;->t(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    return v0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    return v0
.end method

.method public f(Ld1/a;)Ld1/c;
    .locals 4

    .line 1
    iget-object v0, p0, Lf2/k;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p1, Ld1/a;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p1, p1, Ld1/a;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroidx/emoji2/text/p;

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ld1/a;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v2, v0, v1, p1, v3}, Ld1/a;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/emoji2/text/p;Z)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Le1/e;

    .line 28
    .line 29
    iget-object v0, v2, Ld1/a;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Landroid/content/Context;

    .line 32
    .line 33
    iget-object v1, v2, Ld1/a;->c:Ljava/io/Serializable;

    .line 34
    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, v2, Ld1/a;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, Landroidx/emoji2/text/p;

    .line 40
    .line 41
    iget-boolean v2, v2, Ld1/a;->a:Z

    .line 42
    .line 43
    invoke-direct {p1, v0, v1, v3, v2}, Le1/e;-><init>(Landroid/content/Context;Ljava/lang/String;Landroidx/emoji2/text/p;Z)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string v0, "Must set a non-null context to create the configuration."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string v0, "Must set a callback to create the configuration."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1
.end method
