.class public final Lp3/d;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp3/d;->g:I

    iput-object p1, p0, Lp3/d;->i:Ljava/lang/Object;

    iput-object p2, p0, Lp3/d;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 4

    .line 1
    iget v0, p0, Lp3/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp3/d;

    .line 7
    .line 8
    iget-object v1, p0, Lp3/d;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lp3/d;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lr3/a0;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v0, v1, v2, p2, v3}, Lp3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lp3/d;->h:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, Lp3/d;

    .line 24
    .line 25
    iget-object v1, p0, Lp3/d;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lk1/j;

    .line 28
    .line 29
    iget-object v2, p0, Lp3/d;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Landroid/net/Uri;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {v0, v1, v2, p2, v3}, Lp3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, Lp3/d;->h:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_1
    new-instance v0, Lp3/d;

    .line 41
    .line 42
    iget-object v1, p0, Lp3/d;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lk1/j;

    .line 45
    .line 46
    iget-object v2, p0, Lp3/d;->j:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Landroid/net/Uri;

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-direct {v0, v1, v2, p2, v3}, Lp3/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v0, Lp3/d;->h:Ljava/lang/Object;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp3/d;->g:I

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
    invoke-virtual {p0, p1, p2}, Lp3/d;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lp3/d;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lp3/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp3/d;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lp3/d;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lp3/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lp3/d;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lp3/d;

    .line 41
    .line 42
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lp3/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget v0, p0, Lp3/d;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lp3/d;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, Lp3/d;->j:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 12
    .line 13
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lp3/d;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lo4/t;

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    check-cast v3, Lr3/a0;

    .line 23
    .line 24
    :try_start_0
    new-instance p1, Ljava/io/File;

    .line 25
    .line 26
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v1, Ljava/io/FileInputStream;

    .line 36
    .line 37
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-static {v1, v3}, Ly4/b;->J(Ljava/io/InputStream;Lr3/a0;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    goto :goto_0

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 54
    :catchall_2
    move-exception v0

    .line 55
    :try_start_4
    invoke-static {v1, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_0
    new-instance p1, Lr3/o;

    .line 60
    .line 61
    invoke-direct {p1, v2, v1}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 65
    :goto_0
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    new-instance v0, Lt3/e;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 76
    .line 77
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lp3/d;->h:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p1, Lo4/t;

    .line 83
    .line 84
    check-cast v2, Lk1/j;

    .line 85
    .line 86
    move-object v5, v3

    .line 87
    check-cast v5, Landroid/net/Uri;

    .line 88
    .line 89
    :try_start_5
    iget-object p1, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v4, p1

    .line 92
    check-cast v4, Landroid/content/ContentResolver;

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v9, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v7, 0x0

    .line 98
    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    :try_start_6
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    invoke-virtual {v4}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    const-string v0, "_display_name"

    .line 114
    .line 115
    filled-new-array {v0, v0, v0}, [Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Lu3/h;->S([Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {p1, v0}, Lk1/j;->v(Landroid/database/Cursor;Ljava/util/List;)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_1

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move-object v6, v0

    .line 138
    goto :goto_2

    .line 139
    :cond_1
    move-object v6, v1

    .line 140
    :goto_2
    if-eqz v6, :cond_5

    .line 141
    .line 142
    invoke-static {v2, p1, v5}, Lk1/j;->q(Lk1/j;Landroid/database/Cursor;Landroid/net/Uri;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v8

    .line 146
    const-string v0, "date_modified"

    .line 147
    .line 148
    const-string v1, "last_modified"

    .line 149
    .line 150
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Lu3/h;->S([Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {p1, v0}, Lk1/j;->v(Landroid/database/Cursor;Ljava/util/List;)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-eqz v0, :cond_2

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v1, "getString(...)"

    .line 173
    .line 174
    invoke-static {v0, v1}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, Ln4/i;->a0(Ljava/lang/String;)Ljava/lang/Long;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-eqz v0, :cond_2

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 184
    .line 185
    .line 186
    move-result-wide v0

    .line 187
    :goto_3
    move-wide v12, v0

    .line 188
    goto :goto_4

    .line 189
    :cond_2
    invoke-static {p1}, Lk1/j;->w(Landroid/database/Cursor;)J

    .line 190
    .line 191
    .line 192
    move-result-wide v0

    .line 193
    goto :goto_3

    .line 194
    :goto_4
    invoke-static {p1}, Lk1/j;->w(Landroid/database/Cursor;)J

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    invoke-virtual {v4, v5}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    if-nez v4, :cond_3

    .line 203
    .line 204
    const-string v4, "application/octet-binary"

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :catchall_3
    move-exception v0

    .line 208
    move-object v1, v0

    .line 209
    goto :goto_6

    .line 210
    :cond_3
    :goto_5
    new-instance v7, Lr3/y;

    .line 211
    .line 212
    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v10

    .line 216
    if-nez v10, :cond_4

    .line 217
    .line 218
    const-string v10, ""

    .line 219
    .line 220
    :cond_4
    new-instance v11, Lr3/w;

    .line 221
    .line 222
    invoke-direct {v11, v4}, Lr3/w;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    move-object v4, v7

    .line 226
    move-object v7, v5

    .line 227
    move-object v5, v10

    .line 228
    move-object v10, v11

    .line 229
    new-instance v11, Ljava/lang/Long;

    .line 230
    .line 231
    invoke-direct {v11, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 232
    .line 233
    .line 234
    invoke-direct/range {v4 .. v13}, Lr3/y;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;JLa/a;Ljava/lang/Long;J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 235
    .line 236
    .line 237
    :try_start_7
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 238
    .line 239
    .line 240
    move-object v7, v4

    .line 241
    goto :goto_8

    .line 242
    :catchall_4
    move-exception v0

    .line 243
    move-object p1, v0

    .line 244
    goto :goto_7

    .line 245
    :cond_5
    :try_start_8
    new-instance v0, Lr3/s;

    .line 246
    .line 247
    invoke-direct {v0, v1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :cond_6
    new-instance v0, Lr3/o;

    .line 252
    .line 253
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    const-string v5, "toString(...)"

    .line 258
    .line 259
    invoke-static {v4, v5}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {v0, v4, v1}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 263
    .line 264
    .line 265
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 266
    :goto_6
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 267
    :catchall_5
    move-exception v0

    .line 268
    :try_start_a
    invoke-static {p1, v1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_7
    new-instance p1, Lr3/s;

    .line 273
    .line 274
    invoke-direct {p1, v1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 275
    .line 276
    .line 277
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 278
    :goto_7
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    :goto_8
    check-cast v3, Landroid/net/Uri;

    .line 283
    .line 284
    invoke-static {v2, v7, v3}, Lk1/j;->r(Lk1/j;Ljava/lang/Object;Landroid/net/Uri;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    new-instance v0, Lt3/e;

    .line 289
    .line 290
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :pswitch_1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 295
    .line 296
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Lp3/d;->h:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast p1, Lo4/t;

    .line 302
    .line 303
    check-cast v2, Lk1/j;

    .line 304
    .line 305
    check-cast v3, Landroid/net/Uri;

    .line 306
    .line 307
    :try_start_b
    iget-object p1, v2, Lk1/j;->h:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast p1, Landroid/content/ContentResolver;

    .line 310
    .line 311
    invoke-virtual {p1, v3, v1, v1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-lez p1, :cond_8

    .line 316
    .line 317
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 318
    .line 319
    goto :goto_a

    .line 320
    :catchall_6
    move-exception v0

    .line 321
    move-object p1, v0

    .line 322
    goto :goto_9

    .line 323
    :cond_8
    new-instance p1, Lr3/s;

    .line 324
    .line 325
    invoke-direct {p1, v1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 329
    :goto_9
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    :goto_a
    invoke-static {v2, p1, v3}, Lk1/j;->r(Lk1/j;Ljava/lang/Object;Landroid/net/Uri;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    new-instance v0, Lt3/e;

    .line 338
    .line 339
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
