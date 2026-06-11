.class public final Lk0/e;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 1
    iput p5, p0, Lk0/e;->g:I

    iput-object p1, p0, Lk0/e;->k:Ljava/lang/Object;

    iput-object p2, p0, Lk0/e;->l:Ljava/lang/Object;

    iput-object p3, p0, Lk0/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Lw3/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk0/e;->g:I

    .line 2
    iput-object p1, p0, Lk0/e;->l:Ljava/lang/Object;

    iput-object p2, p0, Lk0/e;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 8

    .line 1
    iget v0, p0, Lk0/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lk0/e;

    .line 7
    .line 8
    iget-object v0, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, Lk0/e;->l:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Lt2/i;

    .line 17
    .line 18
    iget-object v0, p0, Lk0/e;->m:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Lr3/c0;

    .line 22
    .line 23
    const/4 v6, 0x3

    .line 24
    move-object v5, p2

    .line 25
    invoke-direct/range {v1 .. v6}, Lk0/e;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v1, Lk0/e;->i:Ljava/lang/Object;

    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    move-object v6, p2

    .line 32
    new-instance v2, Lk0/e;

    .line 33
    .line 34
    iget-object p2, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, p2

    .line 37
    check-cast v3, Ljava/lang/String;

    .line 38
    .line 39
    iget-object p2, p0, Lk0/e;->l:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v4, p2

    .line 42
    check-cast v4, Ljava/lang/String;

    .line 43
    .line 44
    iget-object p2, p0, Lk0/e;->m:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v5, p2

    .line 47
    check-cast v5, Lt2/i;

    .line 48
    .line 49
    const/4 v7, 0x2

    .line 50
    invoke-direct/range {v2 .. v7}, Lk0/e;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v2, Lk0/e;->i:Ljava/lang/Object;

    .line 54
    .line 55
    return-object v2

    .line 56
    :pswitch_1
    move-object v6, p2

    .line 57
    new-instance v2, Lk0/e;

    .line 58
    .line 59
    iget-object p2, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v3, p2

    .line 62
    check-cast v3, Ljava/lang/String;

    .line 63
    .line 64
    iget-object p2, p0, Lk0/e;->l:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v4, p2

    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    iget-object p2, p0, Lk0/e;->m:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v5, p2

    .line 72
    check-cast v5, Lt2/i;

    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    invoke-direct/range {v2 .. v7}, Lk0/e;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 76
    .line 77
    .line 78
    iput-object p1, v2, Lk0/e;->i:Ljava/lang/Object;

    .line 79
    .line 80
    return-object v2

    .line 81
    :pswitch_2
    move-object v6, p2

    .line 82
    new-instance p2, Lk0/e;

    .line 83
    .line 84
    iget-object v0, p0, Lk0/e;->l:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, Lk0/e;->m:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p2, v0, v1, v6}, Lk0/e;-><init>(Ljava/util/List;Ljava/util/ArrayList;Lw3/c;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p2, Lk0/e;->k:Ljava/lang/Object;

    .line 96
    .line 97
    return-object p2

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk0/e;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lo4/t;

    .line 7
    .line 8
    check-cast p2, Lw3/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lk0/e;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk0/e;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk0/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lo4/t;

    .line 24
    .line 25
    check-cast p2, Lw3/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lk0/e;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lk0/e;

    .line 32
    .line 33
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lk0/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lo4/t;

    .line 41
    .line 42
    check-cast p2, Lw3/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lk0/e;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lk0/e;

    .line 49
    .line 50
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lk0/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p2, Lw3/c;

    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Lk0/e;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lk0/e;

    .line 64
    .line 65
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lk0/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lk0/e;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 5
    .line 6
    iget-object v3, p0, Lk0/e;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Lk0/e;->l:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 18
    .line 19
    iget v1, p0, Lk0/e;->h:I

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    if-ne v1, v7, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ljava/io/File;

    .line 28
    .line 29
    iget-object v1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lr3/c0;

    .line 32
    .line 33
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Lt3/e;

    .line 37
    .line 38
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_a

    .line 43
    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lo4/t;

    .line 56
    .line 57
    iget-object p1, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    check-cast v4, Lt2/i;

    .line 62
    .line 63
    move-object v1, v3

    .line 64
    check-cast v1, Lr3/c0;

    .line 65
    .line 66
    :try_start_1
    new-instance v3, Ljava/io/File;

    .line 67
    .line 68
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-nez v5, :cond_4

    .line 76
    .line 77
    new-instance v5, Lr3/a;

    .line 78
    .line 79
    iget-boolean v8, v1, Lr3/c0;->d:Z

    .line 80
    .line 81
    invoke-direct {v5, v8}, Lr3/a;-><init>(Z)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v3, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 87
    .line 88
    iput v7, p0, Lk0/e;->h:I

    .line 89
    .line 90
    invoke-virtual {v4, p1, v5, p0}, Lt2/i;->m(Ljava/lang/String;Lr3/a;Ly3/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_2

    .line 95
    .line 96
    goto/16 :goto_c

    .line 97
    .line 98
    :cond_2
    move-object v0, v3

    .line 99
    :goto_0
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    move-object v3, v0

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    throw p1

    .line 108
    :cond_4
    :goto_1
    new-instance p1, Ljava/io/FileOutputStream;

    .line 109
    .line 110
    iget-object v0, v1, Lr3/c0;->c:Lr3/b0;

    .line 111
    .line 112
    iget-object v4, v1, Lr3/c0;->a:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v1, v1, Lr3/c0;->b:Lr3/e;

    .line 115
    .line 116
    sget-object v5, Lr3/b0;->h:Lr3/b0;

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    if-ne v0, v5, :cond_5

    .line 120
    .line 121
    move v0, v7

    .line 122
    goto :goto_2

    .line 123
    :cond_5
    move v0, v8

    .line 124
    :goto_2
    invoke-direct {p1, v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    .line 126
    .line 127
    :try_start_2
    instance-of v0, v1, Lr3/d;

    .line 128
    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    new-instance v0, Ljava/io/BufferedWriter;

    .line 132
    .line 133
    new-instance v3, Ljava/io/OutputStreamWriter;

    .line 134
    .line 135
    check-cast v1, Lr3/d;

    .line 136
    .line 137
    iget-object v1, v1, Lr3/d;->b:Ljava/nio/charset/Charset;

    .line 138
    .line 139
    invoke-direct {v3, p1, v1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {v0, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 143
    .line 144
    .line 145
    :try_start_3
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 146
    .line 147
    .line 148
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 149
    .line 150
    .line 151
    goto/16 :goto_8

    .line 152
    .line 153
    :catchall_1
    move-exception v0

    .line 154
    goto/16 :goto_9

    .line 155
    .line 156
    :catchall_2
    move-exception v1

    .line 157
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 158
    :catchall_3
    move-exception v2

    .line 159
    :try_start_6
    invoke-static {v0, v1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    throw v2

    .line 163
    :cond_6
    const-string v0, ","

    .line 164
    .line 165
    invoke-static {v4, v0}, Ln4/i;->Z(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    sub-int/2addr v1, v7

    .line 174
    move v3, v8

    .line 175
    move v4, v3

    .line 176
    :goto_3
    if-gt v3, v1, :cond_d

    .line 177
    .line 178
    if-nez v4, :cond_7

    .line 179
    .line 180
    move v5, v3

    .line 181
    goto :goto_4

    .line 182
    :cond_7
    move v5, v1

    .line 183
    :goto_4
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    invoke-static {v5}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 188
    .line 189
    .line 190
    move-result v9

    .line 191
    if-nez v9, :cond_9

    .line 192
    .line 193
    invoke-static {v5}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_8

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_8
    move v5, v8

    .line 201
    goto :goto_6

    .line 202
    :cond_9
    :goto_5
    move v5, v7

    .line 203
    :goto_6
    if-nez v4, :cond_b

    .line 204
    .line 205
    if-nez v5, :cond_a

    .line 206
    .line 207
    move v4, v7

    .line 208
    goto :goto_3

    .line 209
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_b
    if-nez v5, :cond_c

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_c
    add-int/lit8 v1, v1, -0x1

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_d
    :goto_7
    add-int/2addr v1, v7

    .line 219
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0, v6}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    new-instance v1, Ljava/io/BufferedOutputStream;

    .line 232
    .line 233
    invoke-direct {v1, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 234
    .line 235
    .line 236
    :try_start_7
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 237
    .line 238
    .line 239
    :try_start_8
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 240
    .line 241
    .line 242
    :goto_8
    :try_start_9
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 243
    .line 244
    .line 245
    goto :goto_b

    .line 246
    :catchall_4
    move-exception v0

    .line 247
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 248
    :catchall_5
    move-exception v2

    .line 249
    :try_start_b
    invoke-static {v1, v0}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 250
    .line 251
    .line 252
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 253
    :goto_9
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 254
    :catchall_6
    move-exception v1

    .line 255
    :try_start_d
    invoke-static {p1, v0}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 259
    :goto_a
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    :goto_b
    new-instance v0, Lt3/e;

    .line 264
    .line 265
    invoke-direct {v0, v2}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :goto_c
    return-object v0

    .line 269
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 270
    .line 271
    iget v8, p0, Lk0/e;->h:I

    .line 272
    .line 273
    if-eqz v8, :cond_10

    .line 274
    .line 275
    if-eq v8, v7, :cond_f

    .line 276
    .line 277
    if-ne v8, v6, :cond_e

    .line 278
    .line 279
    :try_start_e
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    check-cast p1, Lt3/e;

    .line 283
    .line 284
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 285
    .line 286
    goto/16 :goto_f

    .line 287
    .line 288
    :catchall_7
    move-exception p1

    .line 289
    goto/16 :goto_10

    .line 290
    .line 291
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :cond_f
    iget-object v3, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, Lt2/i;

    .line 300
    .line 301
    iget-object v4, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v4, Ljava/lang/String;

    .line 304
    .line 305
    :try_start_f
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    check-cast p1, Lt3/e;

    .line 309
    .line 310
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 311
    .line 312
    goto :goto_e

    .line 313
    :cond_10
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    iget-object p1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast p1, Lo4/t;

    .line 319
    .line 320
    iget-object p1, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast p1, Ljava/lang/String;

    .line 323
    .line 324
    check-cast v4, Ljava/lang/String;

    .line 325
    .line 326
    check-cast v3, Lt2/i;

    .line 327
    .line 328
    :try_start_10
    new-instance v5, Ljava/io/File;

    .line 329
    .line 330
    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    new-instance v8, Ljava/io/File;

    .line 334
    .line 335
    invoke-direct {v8, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-nez v9, :cond_19

    .line 343
    .line 344
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    if-eqz v9, :cond_18

    .line 349
    .line 350
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 351
    .line 352
    .line 353
    move-result v9

    .line 354
    if-nez v9, :cond_17

    .line 355
    .line 356
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    if-nez v9, :cond_17

    .line 361
    .line 362
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    if-eqz v9, :cond_12

    .line 367
    .line 368
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    if-eqz v9, :cond_11

    .line 373
    .line 374
    goto :goto_d

    .line 375
    :cond_11
    new-instance p1, Lr3/i;

    .line 376
    .line 377
    invoke-direct {p1}, Lr3/i;-><init>()V

    .line 378
    .line 379
    .line 380
    throw p1

    .line 381
    :cond_12
    :goto_d
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 382
    .line 383
    .line 384
    invoke-virtual {v5, v8}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-nez v5, :cond_19

    .line 389
    .line 390
    iput-object p1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v3, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 393
    .line 394
    iput v7, p0, Lk0/e;->h:I

    .line 395
    .line 396
    invoke-virtual {v3, p1, v4, p0}, Lt2/i;->j(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    if-ne v4, v0, :cond_13

    .line 401
    .line 402
    goto :goto_12

    .line 403
    :cond_13
    move-object v10, v4

    .line 404
    move-object v4, p1

    .line 405
    move-object p1, v10

    .line 406
    :goto_e
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    if-nez p1, :cond_16

    .line 411
    .line 412
    iput-object v1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 413
    .line 414
    iput-object v1, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 415
    .line 416
    iput v6, p0, Lk0/e;->h:I

    .line 417
    .line 418
    invoke-virtual {v3, v4, p0}, Lt2/i;->o(Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    if-ne p1, v0, :cond_14

    .line 423
    .line 424
    goto :goto_12

    .line 425
    :cond_14
    :goto_f
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    if-nez p1, :cond_15

    .line 430
    .line 431
    goto :goto_11

    .line 432
    :cond_15
    new-instance v0, Lr3/s;

    .line 433
    .line 434
    invoke-direct {v0, p1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 435
    .line 436
    .line 437
    throw v0

    .line 438
    :cond_16
    new-instance v0, Lr3/s;

    .line 439
    .line 440
    invoke-direct {v0, p1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    throw v0

    .line 444
    :cond_17
    new-instance p1, Lr3/h;

    .line 445
    .line 446
    invoke-direct {p1}, Lr3/h;-><init>()V

    .line 447
    .line 448
    .line 449
    throw p1

    .line 450
    :cond_18
    new-instance v0, Lr3/o;

    .line 451
    .line 452
    invoke-direct {v0, p1, v1}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 456
    :goto_10
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    :cond_19
    :goto_11
    new-instance v0, Lt3/e;

    .line 461
    .line 462
    invoke-direct {v0, v2}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    :goto_12
    return-object v0

    .line 466
    :pswitch_1
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 467
    .line 468
    iget v8, p0, Lk0/e;->h:I

    .line 469
    .line 470
    if-eqz v8, :cond_1c

    .line 471
    .line 472
    if-eq v8, v7, :cond_1b

    .line 473
    .line 474
    if-ne v8, v6, :cond_1a

    .line 475
    .line 476
    :try_start_11
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    check-cast p1, Lt3/e;

    .line 480
    .line 481
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    .line 482
    .line 483
    goto/16 :goto_15

    .line 484
    .line 485
    :catchall_8
    move-exception p1

    .line 486
    goto/16 :goto_16

    .line 487
    .line 488
    :cond_1a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 489
    .line 490
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    throw p1

    .line 494
    :cond_1b
    iget-object v3, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v3, Lt2/i;

    .line 497
    .line 498
    iget-object v4, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v4, Ljava/lang/String;

    .line 501
    .line 502
    :try_start_12
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    check-cast p1, Lt3/e;

    .line 506
    .line 507
    iget-object p1, p1, Lt3/e;->g:Ljava/lang/Object;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 508
    .line 509
    goto :goto_14

    .line 510
    :cond_1c
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    iget-object p1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast p1, Lo4/t;

    .line 516
    .line 517
    iget-object p1, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast p1, Ljava/lang/String;

    .line 520
    .line 521
    check-cast v4, Ljava/lang/String;

    .line 522
    .line 523
    check-cast v3, Lt2/i;

    .line 524
    .line 525
    :try_start_13
    new-instance v5, Ljava/io/File;

    .line 526
    .line 527
    invoke-direct {v5, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    new-instance v8, Ljava/io/File;

    .line 531
    .line 532
    invoke-direct {v8, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v9

    .line 539
    if-nez v9, :cond_26

    .line 540
    .line 541
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 542
    .line 543
    .line 544
    move-result v9

    .line 545
    if-eqz v9, :cond_25

    .line 546
    .line 547
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    if-nez v9, :cond_24

    .line 552
    .line 553
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    if-nez v9, :cond_24

    .line 558
    .line 559
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    if-eqz v9, :cond_1e

    .line 564
    .line 565
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 566
    .line 567
    .line 568
    move-result v9

    .line 569
    if-eqz v9, :cond_1d

    .line 570
    .line 571
    goto :goto_13

    .line 572
    :cond_1d
    new-instance p1, Lr3/i;

    .line 573
    .line 574
    invoke-direct {p1}, Lr3/i;-><init>()V

    .line 575
    .line 576
    .line 577
    throw p1

    .line 578
    :cond_1e
    :goto_13
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 579
    .line 580
    .line 581
    move-result v9

    .line 582
    if-nez v9, :cond_23

    .line 583
    .line 584
    invoke-virtual {v5, v8}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    if-nez v5, :cond_26

    .line 589
    .line 590
    iput-object p1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 591
    .line 592
    iput-object v3, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 593
    .line 594
    iput v7, p0, Lk0/e;->h:I

    .line 595
    .line 596
    invoke-virtual {v3, p1, v4, p0}, Lt2/i;->i(Ljava/lang/String;Ljava/lang/String;Ly3/c;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    if-ne v4, v0, :cond_1f

    .line 601
    .line 602
    goto :goto_18

    .line 603
    :cond_1f
    move-object v10, v4

    .line 604
    move-object v4, p1

    .line 605
    move-object p1, v10

    .line 606
    :goto_14
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 607
    .line 608
    .line 609
    move-result-object p1

    .line 610
    if-nez p1, :cond_22

    .line 611
    .line 612
    new-instance p1, Lr3/b;

    .line 613
    .line 614
    invoke-direct {p1, v7}, Lr3/b;-><init>(Z)V

    .line 615
    .line 616
    .line 617
    iput-object v1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 618
    .line 619
    iput-object v1, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 620
    .line 621
    iput v6, p0, Lk0/e;->h:I

    .line 622
    .line 623
    invoke-virtual {v3, v4, p1, p0}, Lt2/i;->n(Ljava/lang/String;Lr3/b;Ly3/c;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    if-ne p1, v0, :cond_20

    .line 628
    .line 629
    goto :goto_18

    .line 630
    :cond_20
    :goto_15
    invoke-static {p1}, Lt3/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 631
    .line 632
    .line 633
    move-result-object p1

    .line 634
    if-nez p1, :cond_21

    .line 635
    .line 636
    goto :goto_17

    .line 637
    :cond_21
    new-instance v0, Lr3/s;

    .line 638
    .line 639
    invoke-direct {v0, p1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 640
    .line 641
    .line 642
    throw v0

    .line 643
    :cond_22
    new-instance v0, Lr3/s;

    .line 644
    .line 645
    invoke-direct {v0, p1}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :cond_23
    new-instance p1, Lr3/f;

    .line 650
    .line 651
    invoke-direct {p1, v4}, Lr3/f;-><init>(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    throw p1

    .line 655
    :cond_24
    new-instance p1, Lr3/h;

    .line 656
    .line 657
    invoke-direct {p1}, Lr3/h;-><init>()V

    .line 658
    .line 659
    .line 660
    throw p1

    .line 661
    :cond_25
    new-instance v0, Lr3/o;

    .line 662
    .line 663
    invoke-direct {v0, p1, v1}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 667
    :goto_16
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    :cond_26
    :goto_17
    new-instance v0, Lt3/e;

    .line 672
    .line 673
    invoke-direct {v0, v2}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    :goto_18
    return-object v0

    .line 677
    :pswitch_2
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 678
    .line 679
    iget v0, p0, Lk0/e;->h:I

    .line 680
    .line 681
    if-eqz v0, :cond_2a

    .line 682
    .line 683
    if-eq v0, v7, :cond_28

    .line 684
    .line 685
    if-ne v0, v6, :cond_27

    .line 686
    .line 687
    iget-object v0, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, Ljava/util/Iterator;

    .line 690
    .line 691
    iget-object v2, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v2, Ljava/util/List;

    .line 694
    .line 695
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    goto :goto_19

    .line 699
    :cond_27
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 700
    .line 701
    invoke-direct {p1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    throw p1

    .line 705
    :cond_28
    iget-object v0, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 706
    .line 707
    iget-object v2, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v2, Ljava/util/Iterator;

    .line 710
    .line 711
    iget-object v3, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v3, Ljava/util/List;

    .line 714
    .line 715
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    check-cast p1, Ljava/lang/Boolean;

    .line 719
    .line 720
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 721
    .line 722
    .line 723
    move-result p1

    .line 724
    if-nez p1, :cond_29

    .line 725
    .line 726
    move-object p1, v0

    .line 727
    move-object v0, v2

    .line 728
    move-object v2, v3

    .line 729
    goto :goto_19

    .line 730
    :cond_29
    new-instance p1, Lk0/d;

    .line 731
    .line 732
    invoke-direct {p1, v7, v1}, Ly3/g;-><init>(ILw3/c;)V

    .line 733
    .line 734
    .line 735
    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    iput-object v3, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 739
    .line 740
    iput-object v2, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 741
    .line 742
    iput-object v1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 743
    .line 744
    iput v6, p0, Lk0/e;->h:I

    .line 745
    .line 746
    throw v1

    .line 747
    :cond_2a
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    iget-object p1, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast v4, Ljava/util/List;

    .line 753
    .line 754
    move-object v2, v3

    .line 755
    check-cast v2, Ljava/util/ArrayList;

    .line 756
    .line 757
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 762
    .line 763
    .line 764
    move-result v3

    .line 765
    if-nez v3, :cond_2b

    .line 766
    .line 767
    return-object p1

    .line 768
    :cond_2b
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    if-nez v3, :cond_2c

    .line 773
    .line 774
    iput-object v2, p0, Lk0/e;->k:Ljava/lang/Object;

    .line 775
    .line 776
    iput-object v0, p0, Lk0/e;->j:Ljava/lang/Object;

    .line 777
    .line 778
    iput-object p1, p0, Lk0/e;->i:Ljava/lang/Object;

    .line 779
    .line 780
    iput v7, p0, Lk0/e;->h:I

    .line 781
    .line 782
    throw v1

    .line 783
    :cond_2c
    new-instance p1, Ljava/lang/ClassCastException;

    .line 784
    .line 785
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 786
    .line 787
    .line 788
    throw p1

    .line 789
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
