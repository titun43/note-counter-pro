.class public final Ll1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final z:Ljava/lang/String;


# instance fields
.field public g:Landroid/content/Context;

.field public h:Ljava/lang/String;

.field public i:Ljava/util/List;

.field public j:Landroidx/emoji2/text/t;

.field public k:Lt1/i;

.field public l:Landroidx/work/ListenableWorker;

.field public m:Landroidx/emoji2/text/t;

.field public n:Landroidx/work/m;

.field public o:Landroidx/work/b;

.field public p:Ll1/b;

.field public q:Landroidx/work/impl/WorkDatabase;

.field public r:Ll2/j;

.field public s:Landroidx/emoji2/text/p;

.field public t:Landroidx/emoji2/text/p;

.field public u:Ljava/util/ArrayList;

.field public v:Ljava/lang/String;

.field public w:Lv1/j;

.field public x:Lj3/a;

.field public volatile y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkerWrapper"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ll1/l;->z:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroidx/work/m;)V
    .locals 14

    .line 1
    instance-of v0, p1, Landroidx/work/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ll1/l;->z:Ljava/lang/String;

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Ll1/l;->v:Ljava/lang/String;

    .line 13
    .line 14
    const-string v3, "Worker result SUCCESS for "

    .line 15
    .line 16
    invoke-static {v3, v0}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-array v3, v1, [Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-virtual {p1, v2, v0, v3}, Landroidx/work/n;->f(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Ll1/l;->k:Lt1/i;

    .line 26
    .line 27
    invoke-virtual {p1}, Lt1/i;->c()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Ll1/l;->d()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Ll1/l;->s:Landroidx/emoji2/text/p;

    .line 38
    .line 39
    iget-object v0, p0, Ll1/l;->h:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v3, p0, Ll1/l;->r:Ll2/j;

    .line 42
    .line 43
    iget-object v4, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 44
    .line 45
    invoke-virtual {v4}, Lz0/i;->c()V

    .line 46
    .line 47
    .line 48
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const/4 v6, 0x3

    .line 53
    invoke-virtual {v3, v6, v5}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v5, p0, Ll1/l;->n:Landroidx/work/m;

    .line 57
    .line 58
    check-cast v5, Landroidx/work/l;

    .line 59
    .line 60
    iget-object v5, v5, Landroidx/work/l;->a:Landroidx/work/g;

    .line 61
    .line 62
    invoke-virtual {v3, v0, v5}, Ll2/j;->m(Ljava/lang/String;Landroidx/work/g;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide v5

    .line 69
    invoke-virtual {p1, v0}, Landroidx/emoji2/text/p;->y(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    move v8, v1

    .line 78
    :cond_1
    :goto_0
    if-ge v8, v7, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    add-int/lit8 v8, v8, 0x1

    .line 85
    .line 86
    check-cast v9, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v3, v9}, Ll2/j;->e(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    const/4 v11, 0x5

    .line 93
    if-ne v10, v11, :cond_1

    .line 94
    .line 95
    iget-object v10, p1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 98
    .line 99
    const-string v11, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    .line 100
    .line 101
    const/4 v12, 0x1

    .line 102
    invoke-static {v12, v11}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    if-nez v9, :cond_2

    .line 107
    .line 108
    invoke-virtual {v11, v12}, Lz0/j;->f(I)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {v11, v12, v9}, Lz0/j;->g(ILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :goto_1
    invoke-virtual {v10}, Lz0/i;->b()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v11}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 119
    .line 120
    .line 121
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 122
    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 123
    .line 124
    .line 125
    move-result v13

    .line 126
    if-eqz v13, :cond_3

    .line 127
    .line 128
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 129
    .line 130
    .line 131
    move-result v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    if-eqz v13, :cond_3

    .line 133
    .line 134
    move v13, v12

    .line 135
    goto :goto_2

    .line 136
    :catchall_0
    move-exception p1

    .line 137
    goto :goto_3

    .line 138
    :cond_3
    move v13, v1

    .line 139
    :goto_2
    :try_start_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11}, Lz0/j;->h()V

    .line 143
    .line 144
    .line 145
    if-eqz v13, :cond_1

    .line 146
    .line 147
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    new-instance v11, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v13, "Setting status to enqueued for "

    .line 157
    .line 158
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    new-array v13, v1, [Ljava/lang/Throwable;

    .line 169
    .line 170
    invoke-virtual {v10, v2, v11, v13}, Landroidx/work/n;->f(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    filled-new-array {v9}, [Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v3, v12, v10}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v9, v5, v6}, Ll2/j;->n(Ljava/lang/String;J)V

    .line 181
    .line 182
    .line 183
    goto :goto_0

    .line 184
    :catchall_1
    move-exception p1

    .line 185
    goto :goto_4

    .line 186
    :goto_3
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v11}, Lz0/j;->h()V

    .line 190
    .line 191
    .line 192
    throw p1

    .line 193
    :cond_4
    invoke-virtual {v4}, Lz0/i;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, Lz0/i;->f()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v1}, Ll1/l;->e(Z)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :goto_4
    invoke-virtual {v4}, Lz0/i;->f()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v1}, Ll1/l;->e(Z)V

    .line 207
    .line 208
    .line 209
    throw p1

    .line 210
    :cond_5
    instance-of p1, p1, Landroidx/work/k;

    .line 211
    .line 212
    if-eqz p1, :cond_6

    .line 213
    .line 214
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iget-object v0, p0, Ll1/l;->v:Ljava/lang/String;

    .line 219
    .line 220
    const-string v3, "Worker result RETRY for "

    .line 221
    .line 222
    invoke-static {v3, v0}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 227
    .line 228
    invoke-virtual {p1, v2, v0, v1}, Landroidx/work/n;->f(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ll1/l;->c()V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_6
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iget-object v0, p0, Ll1/l;->v:Ljava/lang/String;

    .line 240
    .line 241
    const-string v3, "Worker result FAILURE for "

    .line 242
    .line 243
    invoke-static {v3, v0}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 248
    .line 249
    invoke-virtual {p1, v2, v0, v1}, Landroidx/work/n;->f(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p0, Ll1/l;->k:Lt1/i;

    .line 253
    .line 254
    invoke-virtual {p1}, Lt1/i;->c()Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-eqz p1, :cond_7

    .line 259
    .line 260
    invoke-virtual {p0}, Ll1/l;->d()V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_7
    invoke-virtual {p0}, Ll1/l;->g()V

    .line 265
    .line 266
    .line 267
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/l;->i:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Ll1/l;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {p0}, Ll1/l;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_4

    .line 12
    .line 13
    invoke-virtual {v2}, Lz0/i;->c()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v3, p0, Ll1/l;->r:Ll2/j;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, Ll2/j;->e(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->m()Lr1/h;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v5, v4, Lr1/h;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 29
    .line 30
    invoke-virtual {v5}, Lz0/i;->b()V

    .line 31
    .line 32
    .line 33
    iget-object v4, v4, Lr1/h;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lt1/e;

    .line 36
    .line 37
    invoke-virtual {v4}, Lz0/l;->a()Le1/f;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/4 v7, 0x1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v6, v7}, Le1/b;->e(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v6, v7, v1}, Le1/b;->f(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-virtual {v5}, Lz0/i;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :try_start_1
    invoke-virtual {v6}, Le1/f;->l()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Lz0/i;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    :try_start_2
    invoke-virtual {v5}, Lz0/i;->f()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6}, Lz0/l;->c(Le1/f;)V

    .line 64
    .line 65
    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    const/4 v4, 0x2

    .line 76
    if-ne v3, v4, :cond_2

    .line 77
    .line 78
    iget-object v3, p0, Ll1/l;->n:Landroidx/work/m;

    .line 79
    .line 80
    invoke-virtual {p0, v3}, Ll1/l;->a(Landroidx/work/m;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-static {v3}, Landroidx/emoji2/text/u;->a(I)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Ll1/l;->c()V

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    :try_start_3
    invoke-virtual {v5}, Lz0/i;->f()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v6}, Lz0/l;->c(Le1/f;)V

    .line 105
    .line 106
    .line 107
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    :goto_2
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_4
    :goto_3
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Ll1/c;

    .line 129
    .line 130
    invoke-interface {v4, v1}, Ll1/c;->d(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    iget-object v1, p0, Ll1/l;->o:Landroidx/work/b;

    .line 135
    .line 136
    invoke-static {v1, v2, v0}, Ll1/d;->a(Landroidx/work/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll1/l;->h:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ll1/l;->r:Ll2/j;

    .line 4
    .line 5
    iget-object v2, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lz0/i;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v1, v3, v4}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    invoke-virtual {v1, v0, v4, v5}, Ll2/j;->n(Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    const-wide/16 v4, -0x1

    .line 26
    .line 27
    invoke-virtual {v1, v0, v4, v5}, Ll2/j;->k(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final d()V
    .locals 6

    .line 1
    iget-object v0, p0, Ll1/l;->h:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ll1/l;->r:Ll2/j;

    .line 4
    .line 5
    iget-object v2, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lz0/i;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual {v1, v0, v4, v5}, Ll2/j;->n(Ljava/lang/String;J)V

    .line 16
    .line 17
    .line 18
    filled-new-array {v0}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-virtual {v1, v5, v4}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ll2/j;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 v4, -0x1

    .line 30
    .line 31
    invoke-virtual {v1, v0, v4, v5}, Ll2/j;->k(Ljava/lang/String;J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public final e(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->n()Ll2/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {v2, v1}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v0, v0, Ll2/j;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 25
    .line 26
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 41
    .line 42
    .line 43
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    move v3, v4

    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    move v3, v2

    .line 51
    :goto_0
    :try_start_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lz0/j;->h()V

    .line 55
    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    iget-object v0, p0, Ll1/l;->g:Landroid/content/Context;

    .line 60
    .line 61
    const-class v1, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    .line 62
    .line 63
    invoke-static {v0, v1, v2}, Lu1/g;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    move-exception p1

    .line 68
    goto :goto_4

    .line 69
    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    .line 70
    .line 71
    iget-object v0, p0, Ll1/l;->r:Ll2/j;

    .line 72
    .line 73
    iget-object v1, p0, Ll1/l;->h:Ljava/lang/String;

    .line 74
    .line 75
    filled-new-array {v1}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v4, v1}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Ll1/l;->r:Ll2/j;

    .line 83
    .line 84
    iget-object v1, p0, Ll1/l;->h:Ljava/lang/String;

    .line 85
    .line 86
    const-wide/16 v2, -0x1

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2, v3}, Ll2/j;->k(Ljava/lang/String;J)V

    .line 89
    .line 90
    .line 91
    :cond_2
    iget-object v0, p0, Ll1/l;->k:Lt1/i;

    .line 92
    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    iget-object v0, p0, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->isRunInForeground()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    iget-object v0, p0, Ll1/l;->p:Ll1/b;

    .line 106
    .line 107
    iget-object v1, p0, Ll1/l;->h:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v2, v0, Ll1/b;->q:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 112
    :try_start_3
    iget-object v3, v0, Ll1/b;->l:Ljava/util/HashMap;

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ll1/b;->h()V

    .line 118
    .line 119
    .line 120
    monitor-exit v2

    .line 121
    goto :goto_2

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 124
    :try_start_4
    throw p1

    .line 125
    :cond_3
    :goto_2
    iget-object v0, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 126
    .line 127
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 131
    .line 132
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, Ll1/l;->w:Lv1/j;

    .line 136
    .line 137
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v0, p1}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :goto_3
    :try_start_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Lz0/j;->h()V

    .line 149
    .line 150
    .line 151
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 152
    :goto_4
    iget-object v0, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 153
    .line 154
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 155
    .line 156
    .line 157
    throw p1
.end method

.method public final f()V
    .locals 7

    .line 1
    iget-object v0, p0, Ll1/l;->r:Ll2/j;

    .line 2
    .line 3
    iget-object v1, p0, Ll1/l;->h:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ll2/j;->e(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x2

    .line 10
    const-string v3, "Status for "

    .line 11
    .line 12
    sget-object v4, Ll1/l;->z:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v2, " is RUNNING;not doing any work and rescheduling for later execution"

    .line 22
    .line 23
    invoke-static {v3, v1, v2}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-array v2, v5, [Ljava/lang/Throwable;

    .line 28
    .line 29
    invoke-virtual {v0, v4, v1, v2}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Ll1/l;->e(Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v6, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, " is "

    .line 50
    .line 51
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Landroidx/emoji2/text/u;->B(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, "; not doing any work"

    .line 62
    .line 63
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    new-array v1, v5, [Ljava/lang/Throwable;

    .line 71
    .line 72
    invoke-virtual {v2, v4, v0, v1}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v5}, Ll1/l;->e(Z)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    iget-object v0, p0, Ll1/l;->r:Ll2/j;

    .line 2
    .line 3
    iget-object v1, p0, Ll1/l;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    invoke-virtual {v2}, Lz0/i;->c()V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    new-instance v4, Ljava/util/LinkedList;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-nez v5, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v0, v5}, Ll2/j;->e(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x6

    .line 36
    if-eq v6, v7, :cond_0

    .line 37
    .line 38
    filled-new-array {v5}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const/4 v7, 0x4

    .line 43
    invoke-virtual {v0, v7, v6}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    iget-object v6, p0, Ll1/l;->s:Landroidx/emoji2/text/p;

    .line 47
    .line 48
    invoke-virtual {v6, v5}, Landroidx/emoji2/text/p;->y(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v4, v5}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v4, p0, Ll1/l;->n:Landroidx/work/m;

    .line 57
    .line 58
    check-cast v4, Landroidx/work/j;

    .line 59
    .line 60
    iget-object v4, v4, Landroidx/work/j;->a:Landroidx/work/g;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4}, Ll2/j;->m(Ljava/lang/String;Landroidx/work/g;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v3}, Ll1/l;->e(Z)V

    .line 80
    .line 81
    .line 82
    throw v0
.end method

.method public final h()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Ll1/l;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v2, Ll1/l;->z:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p0, Ll1/l;->v:Ljava/lang/String;

    .line 13
    .line 14
    const-string v4, "Work interrupted for "

    .line 15
    .line 16
    invoke-static {v4, v3}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-array v4, v1, [Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-virtual {v0, v2, v3, v4}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ll1/l;->r:Ll2/j;

    .line 26
    .line 27
    iget-object v2, p0, Ll1/l;->h:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ll2/j;->e(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v2, 0x1

    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ll1/l;->e(Z)V

    .line 37
    .line 38
    .line 39
    return v2

    .line 40
    :cond_0
    invoke-static {v0}, Landroidx/emoji2/text/u;->a(I)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    xor-int/2addr v0, v2

    .line 45
    invoke-virtual {p0, v0}, Ll1/l;->e(Z)V

    .line 46
    .line 47
    .line 48
    return v2

    .line 49
    :cond_1
    return v1
.end method

.method public final run()V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ll1/l;->t:Landroidx/emoji2/text/p;

    .line 4
    .line 5
    iget-object v2, v1, Ll1/l;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Landroidx/emoji2/text/p;->A(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, v1, Ll1/l;->u:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v3, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v4, "Work [ id="

    .line 16
    .line 17
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v4, ", tags={ "

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x1

    .line 34
    move v8, v5

    .line 35
    move v7, v6

    .line 36
    :goto_0
    if-ge v8, v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    add-int/lit8 v8, v8, 0x1

    .line 43
    .line 44
    check-cast v9, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v7, :cond_0

    .line 47
    .line 48
    move v7, v5

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const-string v10, ", "

    .line 51
    .line 52
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string v0, " } ]"

    .line 60
    .line 61
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, v1, Ll1/l;->v:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, v1, Ll1/l;->o:Landroidx/work/b;

    .line 71
    .line 72
    iget-object v4, v1, Ll1/l;->r:Ll2/j;

    .line 73
    .line 74
    iget-object v7, v1, Ll1/l;->m:Landroidx/emoji2/text/t;

    .line 75
    .line 76
    iget-object v8, v1, Ll1/l;->q:Landroidx/work/impl/WorkDatabase;

    .line 77
    .line 78
    const-string v0, "Delaying execution for "

    .line 79
    .line 80
    const-string v9, "Didn\'t find WorkSpec for id "

    .line 81
    .line 82
    invoke-virtual {v1}, Ll1/l;->h()Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_2

    .line 87
    .line 88
    goto/16 :goto_9

    .line 89
    .line 90
    :cond_2
    invoke-virtual {v8}, Lz0/i;->c()V

    .line 91
    .line 92
    .line 93
    :try_start_0
    invoke-virtual {v4, v2}, Ll2/j;->h(Ljava/lang/String;)Lt1/i;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    iput-object v10, v1, Ll1/l;->k:Lt1/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    sget-object v11, Ll1/l;->z:Ljava/lang/String;

    .line 100
    .line 101
    if-nez v10, :cond_3

    .line 102
    .line 103
    :try_start_1
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v3, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 120
    .line 121
    invoke-virtual {v0, v11, v2, v3}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v5}, Ll1/l;->e(Z)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8}, Lz0/i;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto/16 :goto_c

    .line 136
    .line 137
    :cond_3
    :try_start_2
    iget v9, v10, Lt1/i;->b:I

    .line 138
    .line 139
    if-eq v9, v6, :cond_4

    .line 140
    .line 141
    invoke-virtual {v1}, Ll1/l;->f()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8}, Lz0/i;->h()V

    .line 145
    .line 146
    .line 147
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v2, v1, Ll1/l;->k:Lt1/i;

    .line 152
    .line 153
    iget-object v2, v2, Lt1/i;->c:Ljava/lang/String;

    .line 154
    .line 155
    new-instance v3, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v2, " is not in ENQUEUED state. Nothing more to do."

    .line 164
    .line 165
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 173
    .line 174
    invoke-virtual {v0, v11, v2, v3}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    :try_start_3
    invoke-virtual {v10}, Lt1/i;->c()Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-nez v9, :cond_6

    .line 186
    .line 187
    iget-object v9, v1, Ll1/l;->k:Lt1/i;

    .line 188
    .line 189
    iget v10, v9, Lt1/i;->b:I

    .line 190
    .line 191
    if-ne v10, v6, :cond_5

    .line 192
    .line 193
    iget v9, v9, Lt1/i;->k:I

    .line 194
    .line 195
    if-lez v9, :cond_5

    .line 196
    .line 197
    move v9, v6

    .line 198
    goto :goto_2

    .line 199
    :cond_5
    move v9, v5

    .line 200
    :goto_2
    if-eqz v9, :cond_8

    .line 201
    .line 202
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 203
    .line 204
    .line 205
    move-result-wide v9

    .line 206
    iget-object v12, v1, Ll1/l;->k:Lt1/i;

    .line 207
    .line 208
    iget-wide v13, v12, Lt1/i;->n:J

    .line 209
    .line 210
    const-wide/16 v15, 0x0

    .line 211
    .line 212
    cmp-long v13, v13, v15

    .line 213
    .line 214
    if-nez v13, :cond_7

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_7
    invoke-virtual {v12}, Lt1/i;->a()J

    .line 218
    .line 219
    .line 220
    move-result-wide v12

    .line 221
    cmp-long v9, v9, v12

    .line 222
    .line 223
    if-gez v9, :cond_8

    .line 224
    .line 225
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    iget-object v3, v1, Ll1/l;->k:Lt1/i;

    .line 230
    .line 231
    iget-object v3, v3, Lt1/i;->c:Ljava/lang/String;

    .line 232
    .line 233
    new-instance v4, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v0, " because it is being executed before schedule."

    .line 242
    .line 243
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 251
    .line 252
    invoke-virtual {v2, v11, v0, v3}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v6}, Ll1/l;->e(Z)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8}, Lz0/i;->h()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 259
    .line 260
    .line 261
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :cond_8
    :goto_3
    :try_start_4
    invoke-virtual {v8}, Lz0/i;->h()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 269
    .line 270
    .line 271
    iget-object v0, v1, Ll1/l;->k:Lt1/i;

    .line 272
    .line 273
    invoke-virtual {v0}, Lt1/i;->c()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_9

    .line 278
    .line 279
    iget-object v0, v1, Ll1/l;->k:Lt1/i;

    .line 280
    .line 281
    iget-object v0, v0, Lt1/i;->e:Landroidx/work/g;

    .line 282
    .line 283
    goto/16 :goto_7

    .line 284
    .line 285
    :cond_9
    iget-object v0, v3, Landroidx/work/b;->d:Lt2/i;

    .line 286
    .line 287
    iget-object v9, v1, Ll1/l;->k:Lt1/i;

    .line 288
    .line 289
    iget-object v9, v9, Lt1/i;->d:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    sget-object v0, Landroidx/work/i;->a:Ljava/lang/String;

    .line 295
    .line 296
    :try_start_5
    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, Landroidx/work/i;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :catch_0
    move-exception v0

    .line 308
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    sget-object v12, Landroidx/work/i;->a:Ljava/lang/String;

    .line 313
    .line 314
    const-string v13, "Trouble instantiating + "

    .line 315
    .line 316
    invoke-static {v13, v9}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    new-array v13, v6, [Ljava/lang/Throwable;

    .line 321
    .line 322
    aput-object v0, v13, v5

    .line 323
    .line 324
    invoke-virtual {v10, v12, v9, v13}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 325
    .line 326
    .line 327
    const/4 v0, 0x0

    .line 328
    :goto_4
    if-nez v0, :cond_a

    .line 329
    .line 330
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    iget-object v2, v1, Ll1/l;->k:Lt1/i;

    .line 335
    .line 336
    iget-object v2, v2, Lt1/i;->d:Ljava/lang/String;

    .line 337
    .line 338
    const-string v3, "Could not create Input Merger "

    .line 339
    .line 340
    invoke-static {v3, v2}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    new-array v3, v5, [Ljava/lang/Throwable;

    .line 345
    .line 346
    invoke-virtual {v0, v11, v2, v3}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v1}, Ll1/l;->g()V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_9

    .line 353
    .line 354
    :cond_a
    new-instance v9, Ljava/util/ArrayList;

    .line 355
    .line 356
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 357
    .line 358
    .line 359
    iget-object v10, v1, Ll1/l;->k:Lt1/i;

    .line 360
    .line 361
    iget-object v10, v10, Lt1/i;->e:Landroidx/work/g;

    .line 362
    .line 363
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    iget-object v10, v4, Ll2/j;->a:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 369
    .line 370
    const-string v12, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 371
    .line 372
    invoke-static {v6, v12}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    if-nez v2, :cond_b

    .line 377
    .line 378
    invoke-virtual {v12, v6}, Lz0/j;->f(I)V

    .line 379
    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_b
    invoke-virtual {v12, v6, v2}, Lz0/j;->g(ILjava/lang/String;)V

    .line 383
    .line 384
    .line 385
    :goto_5
    invoke-virtual {v10}, Lz0/i;->b()V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v10, v12}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    :try_start_6
    new-instance v13, Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    .line 395
    .line 396
    .line 397
    move-result v14

    .line 398
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 399
    .line 400
    .line 401
    :goto_6
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 402
    .line 403
    .line 404
    move-result v14

    .line 405
    if-eqz v14, :cond_c

    .line 406
    .line 407
    invoke-interface {v10, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 408
    .line 409
    .line 410
    move-result-object v14

    .line 411
    invoke-static {v14}, Landroidx/work/g;->a([B)Landroidx/work/g;

    .line 412
    .line 413
    .line 414
    move-result-object v14

    .line 415
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 416
    .line 417
    .line 418
    goto :goto_6

    .line 419
    :catchall_1
    move-exception v0

    .line 420
    goto/16 :goto_b

    .line 421
    .line 422
    :cond_c
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Lz0/j;->h()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v9}, Landroidx/work/i;->a(Ljava/util/ArrayList;)Landroidx/work/g;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    :goto_7
    new-instance v9, Landroidx/work/WorkerParameters;

    .line 436
    .line 437
    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 438
    .line 439
    .line 440
    move-result-object v10

    .line 441
    iget-object v12, v1, Ll1/l;->u:Ljava/util/ArrayList;

    .line 442
    .line 443
    iget-object v13, v1, Ll1/l;->j:Landroidx/emoji2/text/t;

    .line 444
    .line 445
    iget-object v14, v1, Ll1/l;->k:Lt1/i;

    .line 446
    .line 447
    iget v14, v14, Lt1/i;->k:I

    .line 448
    .line 449
    iget-object v15, v3, Landroidx/work/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 450
    .line 451
    iget-object v3, v3, Landroidx/work/b;->c:Landroidx/work/u;

    .line 452
    .line 453
    new-instance v6, Lu1/p;

    .line 454
    .line 455
    invoke-direct {v6, v8, v7}, Lu1/p;-><init>(Landroidx/work/impl/WorkDatabase;Landroidx/emoji2/text/t;)V

    .line 456
    .line 457
    .line 458
    new-instance v5, Lu1/o;

    .line 459
    .line 460
    move-object/from16 v18, v2

    .line 461
    .line 462
    iget-object v2, v1, Ll1/l;->p:Ll1/b;

    .line 463
    .line 464
    invoke-direct {v5, v8, v2, v7}, Lu1/o;-><init>(Landroidx/work/impl/WorkDatabase;Ll1/b;Landroidx/emoji2/text/t;)V

    .line 465
    .line 466
    .line 467
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 468
    .line 469
    .line 470
    iput-object v10, v9, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 471
    .line 472
    iput-object v0, v9, Landroidx/work/WorkerParameters;->b:Landroidx/work/g;

    .line 473
    .line 474
    new-instance v0, Ljava/util/HashSet;

    .line 475
    .line 476
    invoke-direct {v0, v12}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 477
    .line 478
    .line 479
    iput-object v0, v9, Landroidx/work/WorkerParameters;->c:Ljava/util/HashSet;

    .line 480
    .line 481
    iput-object v13, v9, Landroidx/work/WorkerParameters;->d:Landroidx/emoji2/text/t;

    .line 482
    .line 483
    iput v14, v9, Landroidx/work/WorkerParameters;->e:I

    .line 484
    .line 485
    iput-object v15, v9, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/ExecutorService;

    .line 486
    .line 487
    iput-object v7, v9, Landroidx/work/WorkerParameters;->g:Landroidx/emoji2/text/t;

    .line 488
    .line 489
    iput-object v3, v9, Landroidx/work/WorkerParameters;->h:Landroidx/work/u;

    .line 490
    .line 491
    iput-object v6, v9, Landroidx/work/WorkerParameters;->i:Lu1/p;

    .line 492
    .line 493
    iput-object v5, v9, Landroidx/work/WorkerParameters;->j:Lu1/o;

    .line 494
    .line 495
    iget-object v0, v1, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 496
    .line 497
    if-nez v0, :cond_d

    .line 498
    .line 499
    iget-object v0, v1, Ll1/l;->g:Landroid/content/Context;

    .line 500
    .line 501
    iget-object v2, v1, Ll1/l;->k:Lt1/i;

    .line 502
    .line 503
    iget-object v2, v2, Lt1/i;->c:Ljava/lang/String;

    .line 504
    .line 505
    invoke-virtual {v3, v0, v2, v9}, Landroidx/work/v;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    iput-object v0, v1, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 510
    .line 511
    :cond_d
    iget-object v0, v1, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 512
    .line 513
    if-nez v0, :cond_e

    .line 514
    .line 515
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    iget-object v2, v1, Ll1/l;->k:Lt1/i;

    .line 520
    .line 521
    iget-object v2, v2, Lt1/i;->c:Ljava/lang/String;

    .line 522
    .line 523
    const-string v3, "Could not create Worker "

    .line 524
    .line 525
    invoke-static {v3, v2}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/4 v3, 0x0

    .line 530
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 531
    .line 532
    invoke-virtual {v0, v11, v2, v3}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1}, Ll1/l;->g()V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_9

    .line 539
    .line 540
    :cond_e
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->isUsed()Z

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-eqz v0, :cond_f

    .line 545
    .line 546
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    iget-object v2, v1, Ll1/l;->k:Lt1/i;

    .line 551
    .line 552
    iget-object v2, v2, Lt1/i;->c:Ljava/lang/String;

    .line 553
    .line 554
    const-string v3, "Received an already-used Worker "

    .line 555
    .line 556
    const-string v4, "; WorkerFactory should return new instances"

    .line 557
    .line 558
    invoke-static {v3, v2, v4}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const/4 v3, 0x0

    .line 563
    new-array v3, v3, [Ljava/lang/Throwable;

    .line 564
    .line 565
    invoke-virtual {v0, v11, v2, v3}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v1}, Ll1/l;->g()V

    .line 569
    .line 570
    .line 571
    goto/16 :goto_9

    .line 572
    .line 573
    :cond_f
    const/4 v3, 0x0

    .line 574
    iget-object v0, v1, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 575
    .line 576
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->setUsed()V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v8}, Lz0/i;->c()V

    .line 580
    .line 581
    .line 582
    move-object/from16 v2, v18

    .line 583
    .line 584
    :try_start_7
    invoke-virtual {v4, v2}, Ll2/j;->e(Ljava/lang/String;)I

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    const/4 v6, 0x2

    .line 589
    const/4 v9, 0x1

    .line 590
    if-ne v0, v9, :cond_10

    .line 591
    .line 592
    filled-new-array {v2}, [Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {v4, v6, v0}, Ll2/j;->o(I[Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v4, v2}, Ll2/j;->i(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    move v3, v9

    .line 603
    goto :goto_8

    .line 604
    :catchall_2
    move-exception v0

    .line 605
    goto :goto_a

    .line 606
    :cond_10
    :goto_8
    invoke-virtual {v8}, Lz0/i;->h()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 607
    .line 608
    .line 609
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 610
    .line 611
    .line 612
    if-eqz v3, :cond_12

    .line 613
    .line 614
    invoke-virtual {v1}, Ll1/l;->h()Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-eqz v0, :cond_11

    .line 619
    .line 620
    goto :goto_9

    .line 621
    :cond_11
    new-instance v0, Lv1/j;

    .line 622
    .line 623
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 624
    .line 625
    .line 626
    new-instance v17, Lu1/m;

    .line 627
    .line 628
    iget-object v2, v1, Ll1/l;->g:Landroid/content/Context;

    .line 629
    .line 630
    iget-object v3, v1, Ll1/l;->k:Lt1/i;

    .line 631
    .line 632
    iget-object v4, v1, Ll1/l;->l:Landroidx/work/ListenableWorker;

    .line 633
    .line 634
    iget-object v8, v1, Ll1/l;->m:Landroidx/emoji2/text/t;

    .line 635
    .line 636
    move-object/from16 v18, v2

    .line 637
    .line 638
    move-object/from16 v19, v3

    .line 639
    .line 640
    move-object/from16 v20, v4

    .line 641
    .line 642
    move-object/from16 v21, v5

    .line 643
    .line 644
    move-object/from16 v22, v8

    .line 645
    .line 646
    invoke-direct/range {v17 .. v22}, Lu1/m;-><init>(Landroid/content/Context;Lt1/i;Landroidx/work/ListenableWorker;Lu1/o;Landroidx/emoji2/text/t;)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v2, v17

    .line 650
    .line 651
    iget-object v3, v7, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v3, Lf2/q;

    .line 654
    .line 655
    invoke-virtual {v3, v2}, Lf2/q;->execute(Ljava/lang/Runnable;)V

    .line 656
    .line 657
    .line 658
    new-instance v3, Lc0/n;

    .line 659
    .line 660
    iget-object v2, v2, Lu1/m;->g:Lv1/j;

    .line 661
    .line 662
    invoke-direct {v3, v1, v2, v0, v6}, Lc0/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 663
    .line 664
    .line 665
    iget-object v4, v7, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v4, Lf2/q;

    .line 668
    .line 669
    invoke-virtual {v2, v3, v4}, Lv1/h;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 670
    .line 671
    .line 672
    iget-object v2, v1, Ll1/l;->v:Ljava/lang/String;

    .line 673
    .line 674
    new-instance v3, Lc0/n;

    .line 675
    .line 676
    const/4 v4, 0x3

    .line 677
    invoke-direct {v3, v1, v0, v2, v4}, Lc0/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 678
    .line 679
    .line 680
    iget-object v2, v7, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v2, Lu1/i;

    .line 683
    .line 684
    invoke-virtual {v0, v3, v2}, Lv1/h;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 685
    .line 686
    .line 687
    goto :goto_9

    .line 688
    :cond_12
    invoke-virtual {v1}, Ll1/l;->f()V

    .line 689
    .line 690
    .line 691
    :goto_9
    return-void

    .line 692
    :goto_a
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 693
    .line 694
    .line 695
    throw v0

    .line 696
    :goto_b
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12}, Lz0/j;->h()V

    .line 700
    .line 701
    .line 702
    throw v0

    .line 703
    :goto_c
    invoke-virtual {v8}, Lz0/i;->f()V

    .line 704
    .line 705
    .line 706
    throw v0
.end method
