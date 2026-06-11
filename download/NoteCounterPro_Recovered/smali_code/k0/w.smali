.class public final Lk0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lw4/a;

.field public final synthetic b:Lg4/l;

.field public final synthetic c:Lg4/n;

.field public final synthetic d:Lk0/d0;


# direct methods
.method public constructor <init>(Lw4/a;Lg4/l;Lg4/n;Lk0/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/w;->a:Lw4/a;

    .line 5
    .line 6
    iput-object p2, p0, Lk0/w;->b:Lg4/l;

    .line 7
    .line 8
    iput-object p3, p0, Lk0/w;->c:Lg4/n;

    .line 9
    .line 10
    iput-object p4, p0, Lk0/w;->d:Lk0/d0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lk0/e;Ly3/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lk0/v;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lk0/v;

    .line 7
    .line 8
    iget v1, v0, Lk0/v;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lk0/v;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk0/v;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lk0/v;-><init>(Lk0/w;Ly3/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lk0/v;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 28
    .line 29
    iget v2, v0, Lk0/v;->n:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Lk0/v;->i:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v1, v0, Lk0/v;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lg4/n;

    .line 48
    .line 49
    iget-object v0, v0, Lk0/v;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lw4/a;

    .line 52
    .line 53
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object p1, v0, Lk0/v;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lk0/d0;

    .line 72
    .line 73
    iget-object v2, v0, Lk0/v;->h:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Lg4/n;

    .line 76
    .line 77
    iget-object v4, v0, Lk0/v;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v4, Lw4/a;

    .line 80
    .line 81
    :try_start_1
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :catchall_1
    move-exception p1

    .line 86
    move-object v0, v4

    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_3
    iget-object p1, v0, Lk0/v;->k:Lk0/d0;

    .line 90
    .line 91
    iget-object v2, v0, Lk0/v;->j:Lg4/n;

    .line 92
    .line 93
    iget-object v5, v0, Lk0/v;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Lg4/l;

    .line 96
    .line 97
    iget-object v7, v0, Lk0/v;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v7, Lw4/a;

    .line 100
    .line 101
    iget-object v8, v0, Lk0/v;->g:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v8, Lf4/p;

    .line 104
    .line 105
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object p2, v8

    .line 109
    move-object v8, p1

    .line 110
    move-object p1, p2

    .line 111
    move-object p2, v7

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, v0, Lk0/v;->g:Ljava/lang/Object;

    .line 117
    .line 118
    iget-object p2, p0, Lk0/w;->a:Lw4/a;

    .line 119
    .line 120
    iput-object p2, v0, Lk0/v;->h:Ljava/lang/Object;

    .line 121
    .line 122
    iget-object v2, p0, Lk0/w;->b:Lg4/l;

    .line 123
    .line 124
    iput-object v2, v0, Lk0/v;->i:Ljava/lang/Object;

    .line 125
    .line 126
    iget-object v7, p0, Lk0/w;->c:Lg4/n;

    .line 127
    .line 128
    iput-object v7, v0, Lk0/v;->j:Lg4/n;

    .line 129
    .line 130
    iget-object v8, p0, Lk0/w;->d:Lk0/d0;

    .line 131
    .line 132
    iput-object v8, v0, Lk0/v;->k:Lk0/d0;

    .line 133
    .line 134
    iput v5, v0, Lk0/v;->n:I

    .line 135
    .line 136
    check-cast p2, Lw4/c;

    .line 137
    .line 138
    invoke-virtual {p2, v0}, Lw4/c;->c(Ly3/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    if-ne v5, v1, :cond_5

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move-object v5, v2

    .line 146
    move-object v2, v7

    .line 147
    :goto_1
    :try_start_2
    iget-boolean v5, v5, Lg4/l;->g:Z

    .line 148
    .line 149
    if-nez v5, :cond_9

    .line 150
    .line 151
    iget-object v5, v2, Lg4/n;->g:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p2, v0, Lk0/v;->g:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v2, v0, Lk0/v;->h:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v8, v0, Lk0/v;->i:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v6, v0, Lk0/v;->j:Lg4/n;

    .line 160
    .line 161
    iput-object v6, v0, Lk0/v;->k:Lk0/d0;

    .line 162
    .line 163
    iput v4, v0, Lk0/v;->n:I

    .line 164
    .line 165
    invoke-interface {p1, v5, v0}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 169
    if-ne p1, v1, :cond_6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    move-object v4, p2

    .line 173
    move-object p2, p1

    .line 174
    move-object p1, v8

    .line 175
    :goto_2
    :try_start_3
    iget-object v5, v2, Lg4/n;->g:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-static {p2, v5}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-nez v5, :cond_8

    .line 182
    .line 183
    iput-object v4, v0, Lk0/v;->g:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v2, v0, Lk0/v;->h:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p2, v0, Lk0/v;->i:Ljava/lang/Object;

    .line 188
    .line 189
    iput v3, v0, Lk0/v;->n:I

    .line 190
    .line 191
    invoke-virtual {p1, p2, v0}, Lk0/d0;->j(Ljava/lang/Object;Ly3/c;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 195
    if-ne p1, v1, :cond_7

    .line 196
    .line 197
    :goto_3
    return-object v1

    .line 198
    :cond_7
    move-object p1, p2

    .line 199
    move-object v1, v2

    .line 200
    move-object v0, v4

    .line 201
    :goto_4
    :try_start_4
    iput-object p1, v1, Lg4/n;->g:Ljava/lang/Object;

    .line 202
    .line 203
    move-object v2, v1

    .line 204
    goto :goto_5

    .line 205
    :cond_8
    move-object v0, v4

    .line 206
    :goto_5
    iget-object p1, v2, Lg4/n;->g:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 207
    .line 208
    check-cast v0, Lw4/c;

    .line 209
    .line 210
    invoke-virtual {v0, v6}, Lw4/c;->d(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    return-object p1

    .line 214
    :catchall_2
    move-exception p1

    .line 215
    move-object v0, p2

    .line 216
    goto :goto_6

    .line 217
    :cond_9
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    const-string v0, "InitializerApi.updateData should not be called after initialization is complete."

    .line 220
    .line 221
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 225
    :goto_6
    check-cast v0, Lw4/c;

    .line 226
    .line 227
    invoke-virtual {v0, v6}, Lw4/c;->d(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    throw p1
.end method
