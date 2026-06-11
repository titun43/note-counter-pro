.class public final Lp3/w;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp3/w;->g:I

    iput-object p1, p0, Lp3/w;->j:Ljava/lang/Object;

    iput-object p2, p0, Lp3/w;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method

.method public constructor <init>(Lu0/a;Landroid/net/Uri;Landroid/view/InputEvent;Lw3/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lp3/w;->g:I

    .line 2
    iput-object p1, p0, Lp3/w;->i:Ljava/lang/Object;

    iput-object p2, p0, Lp3/w;->j:Ljava/lang/Object;

    iput-object p3, p0, Lp3/w;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 4

    .line 1
    iget v0, p0, Lp3/w;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lp3/w;

    .line 7
    .line 8
    iget-object v0, p0, Lp3/w;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lu0/a;

    .line 11
    .line 12
    iget-object v1, p0, Lp3/w;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v2, p0, Lp3/w;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/view/InputEvent;

    .line 19
    .line 20
    invoke-direct {p1, v0, v1, v2, p2}, Lp3/w;-><init>(Lu0/a;Landroid/net/Uri;Landroid/view/InputEvent;Lw3/c;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    new-instance v0, Lp3/w;

    .line 25
    .line 26
    iget-object v1, p0, Lp3/w;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lr4/c;

    .line 29
    .line 30
    iget-object v2, p0, Lp3/w;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ls4/d;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v0, v1, v2, p2, v3}, Lp3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, v0, Lp3/w;->i:Ljava/lang/Object;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_1
    new-instance v0, Lp3/w;

    .line 42
    .line 43
    iget-object v1, p0, Lp3/w;->j:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v2, p0, Lp3/w;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Lr3/z;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-direct {v0, v1, v2, p2, v3}, Lp3/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lw3/c;I)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, Lp3/w;->i:Ljava/lang/Object;

    .line 56
    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp3/w;->g:I

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
    invoke-virtual {p0, p1, p2}, Lp3/w;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lp3/w;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lp3/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lp3/w;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lp3/w;

    .line 32
    .line 33
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lp3/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lr4/c;

    .line 41
    .line 42
    check-cast p2, Lw3/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lp3/w;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lp3/w;

    .line 49
    .line 50
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lp3/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lp3/w;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 7
    .line 8
    iget v1, p0, Lp3/w;->h:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lp3/w;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lu0/a;

    .line 33
    .line 34
    iget-object p1, p1, Lu0/a;->a:Lw0/b;

    .line 35
    .line 36
    iget-object v1, p0, Lp3/w;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Landroid/net/Uri;

    .line 39
    .line 40
    iget-object v3, p0, Lp3/w;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Landroid/view/InputEvent;

    .line 43
    .line 44
    iput v2, p0, Lp3/w;->h:I

    .line 45
    .line 46
    invoke-virtual {p1, v1, v3, p0}, Lw0/b;->c(Landroid/net/Uri;Landroid/view/InputEvent;Lw3/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 54
    .line 55
    :goto_1
    return-object v0

    .line 56
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 57
    .line 58
    iget v1, p0, Lp3/w;->h:I

    .line 59
    .line 60
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    if-ne v1, v3, :cond_4

    .line 66
    .line 67
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    move-object v0, v2

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_5
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lp3/w;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lo4/t;

    .line 86
    .line 87
    iget-object v1, p0, Lp3/w;->j:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Lr4/c;

    .line 90
    .line 91
    iget-object v4, p0, Lp3/w;->k:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v4, Ls4/d;

    .line 94
    .line 95
    iget-object v5, v4, Ls4/d;->g:Lw3/h;

    .line 96
    .line 97
    iget v6, v4, Ls4/d;->h:I

    .line 98
    .line 99
    const/4 v7, -0x3

    .line 100
    if-ne v6, v7, :cond_6

    .line 101
    .line 102
    const/4 v6, -0x2

    .line 103
    :cond_6
    iget-object v7, v4, Ls4/d;->i:Lq4/a;

    .line 104
    .line 105
    sget-object v8, Lo4/u;->h:Lo4/u;

    .line 106
    .line 107
    new-instance v9, Ls4/c;

    .line 108
    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    invoke-direct {v9, v4, v11, v10}, Ls4/c;-><init>(Ls4/d;Lw3/c;I)V

    .line 112
    .line 113
    .line 114
    const/4 v4, 0x4

    .line 115
    invoke-static {v6, v7, v4}, Lq4/j;->a(ILq4/a;I)Lq4/c;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {p1, v5}, Lo4/w;->j(Lo4/t;Lw3/h;)Lw3/h;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance v5, Lq4/n;

    .line 124
    .line 125
    invoke-direct {v5, p1, v4}, Lq4/n;-><init>(Lw3/h;Lq4/c;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v8, v5, v9}, Lo4/a;->U(Lo4/u;Lo4/a;Lf4/p;)V

    .line 129
    .line 130
    .line 131
    iput v3, p0, Lp3/w;->h:I

    .line 132
    .line 133
    invoke-static {v1, v5, v3, p0}, Lr4/t;->c(Lr4/c;Lq4/n;ZLy3/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v0, :cond_7

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    move-object p1, v2

    .line 141
    :goto_2
    if-ne p1, v0, :cond_3

    .line 142
    .line 143
    :goto_3
    return-object v0

    .line 144
    :pswitch_1
    iget-object v0, p0, Lp3/w;->j:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 149
    .line 150
    iget v2, p0, Lp3/w;->h:I

    .line 151
    .line 152
    const/4 v3, 0x1

    .line 153
    const/4 v4, 0x0

    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    if-ne v2, v3, :cond_8

    .line 157
    .line 158
    iget-object v0, p0, Lp3/w;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ljava/io/Closeable;

    .line 161
    .line 162
    :try_start_0
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :catchall_0
    move-exception p1

    .line 167
    goto :goto_6

    .line 168
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 171
    .line 172
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_9
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p0, Lp3/w;->i:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, Lr4/c;

    .line 182
    .line 183
    new-instance v2, Ljava/io/File;

    .line 184
    .line 185
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_b

    .line 193
    .line 194
    new-instance v0, Ljava/io/FileInputStream;

    .line 195
    .line 196
    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, p0, Lp3/w;->k:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v2, Lr3/z;

    .line 202
    .line 203
    :try_start_1
    new-instance v5, Lp3/g;

    .line 204
    .line 205
    const/4 v6, 0x1

    .line 206
    invoke-direct {v5, p1, v4, v6}, Lp3/g;-><init>(Lr4/c;Lw3/c;I)V

    .line 207
    .line 208
    .line 209
    iput-object v0, p0, Lp3/w;->i:Ljava/lang/Object;

    .line 210
    .line 211
    iput v3, p0, Lp3/w;->h:I

    .line 212
    .line 213
    const/16 p1, 0x2000

    .line 214
    .line 215
    invoke-static {v0, v2, p1, v5, p0}, Ly4/b;->H(Ljava/io/InputStream;Lr3/z;ILf4/p;Ly3/c;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    if-ne p1, v1, :cond_a

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_a
    :goto_4
    invoke-static {v0, v4}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    sget-object v1, Lt3/h;->a:Lt3/h;

    .line 226
    .line 227
    :goto_5
    return-object v1

    .line 228
    :goto_6
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 229
    :catchall_1
    move-exception v1

    .line 230
    invoke-static {v0, p1}, La/a;->g(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    throw v1

    .line 234
    :cond_b
    new-instance p1, Lr3/o;

    .line 235
    .line 236
    invoke-direct {p1, v0, v4}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    throw p1

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
