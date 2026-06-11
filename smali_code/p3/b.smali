.class public final Lp3/b;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Comparable;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lk1/j;Landroid/net/Uri;Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lp3/b;->g:I

    iput-object p1, p0, Lp3/b;->i:Ljava/lang/Object;

    iput-object p2, p0, Lp3/b;->j:Ljava/lang/Comparable;

    iput-object p3, p0, Lp3/b;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public constructor <init>(Lr1/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/Boolean;Lw3/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lp3/b;->g:I

    .line 2
    iput-object p1, p0, Lp3/b;->h:Ljava/lang/Object;

    iput-object p2, p0, Lp3/b;->i:Ljava/lang/Object;

    iput-object p3, p0, Lp3/b;->k:Ljava/lang/Object;

    iput-object p4, p0, Lp3/b;->j:Ljava/lang/Comparable;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 8

    .line 1
    iget v0, p0, Lp3/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp3/b;

    .line 7
    .line 8
    iget-object p1, p0, Lp3/b;->h:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Lr1/h;

    .line 12
    .line 13
    iget-object p1, p0, Lp3/b;->i:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Ljava/io/File;

    .line 17
    .line 18
    iget-object p1, p0, Lp3/b;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p0, Lp3/b;->j:Ljava/lang/Comparable;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    check-cast v5, Ljava/lang/Boolean;

    .line 27
    .line 28
    move-object v6, p2

    .line 29
    invoke-direct/range {v1 .. v6}, Lp3/b;-><init>(Lr1/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/Boolean;Lw3/c;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_0
    move-object v6, p2

    .line 34
    new-instance v2, Lp3/b;

    .line 35
    .line 36
    iget-object p2, p0, Lp3/b;->i:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v3, p2

    .line 39
    check-cast v3, Lk1/j;

    .line 40
    .line 41
    iget-object p2, p0, Lp3/b;->j:Ljava/lang/Comparable;

    .line 42
    .line 43
    move-object v4, p2

    .line 44
    check-cast v4, Landroid/net/Uri;

    .line 45
    .line 46
    iget-object p2, p0, Lp3/b;->k:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v5, p2

    .line 49
    check-cast v5, Lr3/a0;

    .line 50
    .line 51
    const/4 v7, 0x1

    .line 52
    invoke-direct/range {v2 .. v7}, Lp3/b;-><init>(Lk1/j;Landroid/net/Uri;Ljava/lang/Object;Lw3/c;I)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v2, Lp3/b;->h:Ljava/lang/Object;

    .line 56
    .line 57
    return-object v2

    .line 58
    :pswitch_1
    move-object v6, p2

    .line 59
    new-instance v2, Lp3/b;

    .line 60
    .line 61
    iget-object p2, p0, Lp3/b;->i:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v3, p2

    .line 64
    check-cast v3, Lk1/j;

    .line 65
    .line 66
    iget-object p2, p0, Lp3/b;->j:Ljava/lang/Comparable;

    .line 67
    .line 68
    move-object v4, p2

    .line 69
    check-cast v4, Landroid/net/Uri;

    .line 70
    .line 71
    iget-object p2, p0, Lp3/b;->k:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v5, p2

    .line 74
    check-cast v5, Ljava/lang/String;

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    invoke-direct/range {v2 .. v7}, Lp3/b;-><init>(Lk1/j;Landroid/net/Uri;Ljava/lang/Object;Lw3/c;I)V

    .line 78
    .line 79
    .line 80
    iput-object p1, v2, Lp3/b;->h:Ljava/lang/Object;

    .line 81
    .line 82
    return-object v2

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp3/b;->g:I

    .line 2
    .line 3
    check-cast p1, Lo4/t;

    .line 4
    .line 5
    check-cast p2, Lw3/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lp3/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lp3/b;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lp3/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp3/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lp3/b;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lp3/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lp3/b;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lp3/b;

    .line 41
    .line 42
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lp3/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lp3/b;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lp3/b;->j:Ljava/lang/Comparable;

    .line 5
    .line 6
    iget-object v3, p0, Lp3/b;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lp3/b;->i:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 14
    .line 15
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lp3/b;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lr1/h;

    .line 21
    .line 22
    check-cast v4, Ljava/io/File;

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    new-instance v0, Ljava/io/File;

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-direct {v0, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v2, Ljava/lang/Boolean;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v4, "getAbsolutePath(...)"

    .line 55
    .line 56
    invoke-static {v2, v4}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v5, Lr3/x;->q:Lz3/b;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v6, Lg4/a;

    .line 65
    .line 66
    const/4 v7, 0x1

    .line 67
    invoke-direct {v6, v5, v7}, Lg4/a;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {v6}, Lg4/a;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    invoke-virtual {v6}, Lg4/a;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    move-object v8, v5

    .line 81
    check-cast v8, Lr3/x;

    .line 82
    .line 83
    invoke-virtual {p1, v8}, Lr1/h;->l(Lr3/x;)Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    if-eqz v8, :cond_3

    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v8, v4}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v2, v8}, Ln4/i;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const/4 v8, 0x0

    .line 102
    :goto_1
    if-eqz v8, :cond_2

    .line 103
    .line 104
    move-object v1, v5

    .line 105
    :cond_4
    check-cast v1, Lr3/x;

    .line 106
    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    iget-boolean p1, v1, Lr3/x;->g:Z

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move p1, v7

    .line 113
    :goto_2
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v2, "getPath(...)"

    .line 118
    .line 119
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 123
    .line 124
    const-string v4, "separator"

    .line 125
    .line 126
    invoke-static {v2, v4}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_6

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_8

    .line 140
    .line 141
    :cond_6
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_7

    .line 146
    .line 147
    invoke-static {v0}, Ld4/l;->D(Ljava/io/File;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, Ln4/i;->X(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    const-string v2, ""

    .line 159
    .line 160
    :cond_8
    :goto_3
    new-instance v1, Lr3/e0;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v4, v2}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v3}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    new-instance v6, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {v5, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    const-string v3, "build(...)"

    .line 202
    .line 203
    invoke-static {v2, v3}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-nez v3, :cond_9

    .line 211
    .line 212
    sget-object v0, Lr3/h0;->i:Lr3/h0;

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_9
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_a

    .line 220
    .line 221
    sget-object v0, Lr3/h0;->h:Lr3/h0;

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_a
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_b

    .line 229
    .line 230
    sget-object v0, Lr3/h0;->g:Lr3/h0;

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_b
    sget-object v0, Lr3/h0;->i:Lr3/h0;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    .line 235
    goto :goto_4

    .line 236
    :catch_0
    sget-object v0, Lr3/h0;->i:Lr3/h0;

    .line 237
    .line 238
    :goto_4
    invoke-direct {v1, v4, v2, v0, p1}, Lr3/e0;-><init>(Ljava/lang/String;Landroid/net/Uri;Lr3/h0;Z)V

    .line 239
    .line 240
    .line 241
    return-object v1

    .line 242
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 243
    .line 244
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Lp3/b;->h:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, Lo4/t;

    .line 250
    .line 251
    check-cast v4, Lk1/j;

    .line 252
    .line 253
    check-cast v2, Landroid/net/Uri;

    .line 254
    .line 255
    check-cast v3, Lr3/a0;

    .line 256
    .line 257
    :try_start_1
    iget-object p1, v4, Lk1/j;->h:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p1, Landroid/content/ContentResolver;

    .line 260
    .line 261
    invoke-virtual {p1, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 262
    .line 263
    .line 264
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    if-eqz p1, :cond_c

    .line 266
    .line 267
    :try_start_2
    invoke-static {p1, v3}, Ly4/b;->J(Ljava/io/InputStream;Lr3/a0;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 271
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 272
    .line 273
    .line 274
    if-eqz v0, :cond_c

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :catchall_0
    move-exception p1

    .line 278
    goto :goto_5

    .line 279
    :catchall_1
    move-exception v0

    .line 280
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 281
    :catchall_2
    move-exception v1

    .line 282
    :try_start_5
    invoke-static {p1, v0}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    throw v1

    .line 286
    :cond_c
    new-instance p1, Lr3/s;

    .line 287
    .line 288
    invoke-direct {p1, v1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 292
    :goto_5
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :goto_6
    invoke-static {v4, v0, v2}, Lk1/j;->r(Lk1/j;Ljava/lang/Object;Landroid/net/Uri;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    new-instance v0, Lt3/e;

    .line 301
    .line 302
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    return-object v0

    .line 306
    :pswitch_1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 307
    .line 308
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    iget-object p1, p0, Lp3/b;->h:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast p1, Lo4/t;

    .line 314
    .line 315
    check-cast v4, Lk1/j;

    .line 316
    .line 317
    check-cast v3, Ljava/lang/String;

    .line 318
    .line 319
    check-cast v2, Landroid/net/Uri;

    .line 320
    .line 321
    :try_start_6
    new-instance p1, Ljava/io/File;

    .line 322
    .line 323
    invoke-direct {p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-nez v0, :cond_12

    .line 331
    .line 332
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    if-eqz v0, :cond_e

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_d

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_d
    new-instance p1, Lr3/i;

    .line 346
    .line 347
    invoke-direct {p1}, Lr3/i;-><init>()V

    .line 348
    .line 349
    .line 350
    throw p1

    .line 351
    :catchall_3
    move-exception p1

    .line 352
    goto :goto_a

    .line 353
    :cond_e
    :goto_7
    iget-object v0, v4, Lk1/j;->h:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, Landroid/content/ContentResolver;

    .line 356
    .line 357
    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 358
    .line 359
    .line 360
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 361
    sget-object v3, Lt3/h;->a:Lt3/h;

    .line 362
    .line 363
    if-eqz v0, :cond_10

    .line 364
    .line 365
    :try_start_7
    new-instance v5, Ljava/io/FileOutputStream;

    .line 366
    .line 367
    invoke-direct {v5, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 368
    .line 369
    .line 370
    :try_start_8
    invoke-static {v0, v5}, Lz2/b;->e(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 371
    .line 372
    .line 373
    move-result-wide v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 374
    const-wide/16 v8, 0x0

    .line 375
    .line 376
    cmp-long p1, v6, v8

    .line 377
    .line 378
    if-lez p1, :cond_f

    .line 379
    .line 380
    :try_start_9
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 381
    .line 382
    .line 383
    :try_start_a
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 384
    .line 385
    .line 386
    move-object p1, v3

    .line 387
    goto :goto_9

    .line 388
    :catchall_4
    move-exception p1

    .line 389
    goto :goto_8

    .line 390
    :cond_f
    :try_start_b
    new-instance p1, Lr3/s;

    .line 391
    .line 392
    invoke-direct {p1, v1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 393
    .line 394
    .line 395
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 396
    :catchall_5
    move-exception p1

    .line 397
    :try_start_c
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 398
    :catchall_6
    move-exception v1

    .line 399
    :try_start_d
    invoke-static {v5, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 403
    :goto_8
    :try_start_e
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 404
    :catchall_7
    move-exception v1

    .line 405
    :try_start_f
    invoke-static {v0, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 406
    .line 407
    .line 408
    throw v1

    .line 409
    :cond_10
    move-object p1, v1

    .line 410
    :goto_9
    if-eqz p1, :cond_11

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_11
    new-instance p1, Lr3/s;

    .line 414
    .line 415
    invoke-direct {p1, v1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    throw p1

    .line 419
    :cond_12
    new-instance p1, Lr3/h;

    .line 420
    .line 421
    invoke-direct {p1}, Lr3/h;-><init>()V

    .line 422
    .line 423
    .line 424
    throw p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 425
    :goto_a
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    :goto_b
    invoke-static {v4, v3, v2}, Lk1/j;->r(Lk1/j;Ljava/lang/Object;Landroid/net/Uri;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    new-instance v0, Lt3/e;

    .line 434
    .line 435
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    return-object v0

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
