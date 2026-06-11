.class public final Lp3/j;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lw3/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lp3/j;->g:I

    iput-object p1, p0, Lp3/j;->i:Ljava/lang/String;

    iput-object p2, p0, Lp3/j;->j:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 4

    .line 1
    iget v0, p0, Lp3/j;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp3/j;

    .line 7
    .line 8
    iget-object v1, p0, Lp3/j;->j:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Lp3/j;->i:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {v0, v3, v1, p2, v2}, Lp3/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lw3/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lp3/j;->h:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Lp3/j;

    .line 20
    .line 21
    iget-object v1, p0, Lp3/j;->j:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v3, p0, Lp3/j;->i:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v0, v3, v1, p2, v2}, Lp3/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lw3/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lp3/j;->h:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp3/j;->g:I

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
    invoke-virtual {p0, p1, p2}, Lp3/j;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lp3/j;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lp3/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp3/j;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lp3/j;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lp3/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lp3/j;->g:I

    .line 2
    .line 3
    sget-object v1, Lt3/h;->a:Lt3/h;

    .line 4
    .line 5
    iget-object v2, p0, Lp3/j;->j:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lp3/j;->i:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v4, 0x0

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
    iget-object p1, p0, Lp3/j;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lo4/t;

    .line 21
    .line 22
    :try_start_0
    new-instance p1, Ljava/io/File;

    .line 23
    .line 24
    invoke-direct {p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ljava/io/File;

    .line 28
    .line 29
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_5

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    new-instance p1, Lr3/i;

    .line 70
    .line 71
    invoke-direct {p1}, Lr3/i;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :catchall_0
    move-exception p1

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    :goto_0
    const/4 v2, 0x1

    .line 78
    invoke-static {p1, v0, v2}, Ld4/l;->C(Ljava/io/File;Ljava/io/File;Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance p1, Lr3/s;

    .line 89
    .line 90
    invoke-direct {p1, v4}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_3
    new-instance p1, Lr3/h;

    .line 95
    .line 96
    invoke-direct {p1}, Lr3/h;-><init>()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_4
    new-instance p1, Lr3/o;

    .line 101
    .line 102
    invoke-direct {p1, v3, v4}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    :goto_1
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :cond_5
    :goto_2
    new-instance p1, Lt3/e;

    .line 111
    .line 112
    invoke-direct {p1, v1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 117
    .line 118
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Lp3/j;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, Lo4/t;

    .line 124
    .line 125
    :try_start_1
    new-instance p1, Ljava/io/File;

    .line 126
    .line 127
    invoke-direct {p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Ljava/io/File;

    .line 131
    .line 132
    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_c

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_b

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-nez v3, :cond_a

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-nez v3, :cond_a

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    if-eqz v3, :cond_7

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    new-instance p1, Lr3/i;

    .line 173
    .line 174
    invoke-direct {p1}, Lr3/i;-><init>()V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :catchall_1
    move-exception p1

    .line 179
    goto :goto_4

    .line 180
    :cond_7
    :goto_3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_9

    .line 185
    .line 186
    invoke-static {p1, v0}, Ld4/l;->B(Ljava/io/File;Ljava/io/File;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_8

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_8
    new-instance p1, Lr3/s;

    .line 194
    .line 195
    invoke-direct {p1, v4}, Lr3/s;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :cond_9
    new-instance p1, Lr3/f;

    .line 200
    .line 201
    invoke-direct {p1, v2}, Lr3/f;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw p1

    .line 205
    :cond_a
    new-instance p1, Lr3/h;

    .line 206
    .line 207
    invoke-direct {p1}, Lr3/h;-><init>()V

    .line 208
    .line 209
    .line 210
    throw p1

    .line 211
    :cond_b
    new-instance p1, Lr3/o;

    .line 212
    .line 213
    invoke-direct {p1, v3, v4}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    :goto_4
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :cond_c
    :goto_5
    new-instance p1, Lt3/e;

    .line 222
    .line 223
    invoke-direct {p1, v1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-object p1

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
