.class public final Lk0/p;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lk0/d0;


# direct methods
.method public synthetic constructor <init>(Lk0/d0;Lw3/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lk0/p;->g:I

    iput-object p1, p0, Lk0/p;->j:Lk0/d0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3

    .line 1
    iget v0, p0, Lk0/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lk0/p;

    .line 7
    .line 8
    iget-object v1, p0, Lk0/p;->j:Lk0/d0;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, p2, v2}, Lk0/p;-><init>(Lk0/d0;Lw3/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lk0/p;->i:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lk0/p;

    .line 18
    .line 19
    iget-object v1, p0, Lk0/p;->j:Lk0/d0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, v1, p2, v2}, Lk0/p;-><init>(Lk0/d0;Lw3/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lk0/p;->i:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk0/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lr4/c;

    .line 7
    .line 8
    check-cast p2, Lw3/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lk0/p;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk0/p;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk0/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lk0/m;

    .line 24
    .line 25
    check-cast p2, Lw3/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lk0/p;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lk0/p;

    .line 32
    .line 33
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lk0/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lk0/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk0/p;->j:Lk0/d0;

    .line 7
    .line 8
    iget-object v1, v0, Lk0/d0;->f:Lr4/s;

    .line 9
    .line 10
    sget-object v2, Lx3/a;->g:Lx3/a;

    .line 11
    .line 12
    iget v3, p0, Lk0/p;->h:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lk0/p;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Lr4/c;

    .line 39
    .line 40
    invoke-virtual {v1}, Lr4/s;->a()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lk0/e0;

    .line 45
    .line 46
    instance-of v5, v3, Lk0/a;

    .line 47
    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    iget-object v0, v0, Lk0/d0;->h:Lr1/h;

    .line 51
    .line 52
    new-instance v5, Lk0/k;

    .line 53
    .line 54
    invoke-direct {v5, v3}, Lk0/k;-><init>(Lk0/e0;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v5}, Lr1/h;->q(Lk0/m;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    new-instance v0, Lk0/q;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-direct {v0, v3, v5}, Lk0/q;-><init>(Lk0/e0;Lw3/c;)V

    .line 64
    .line 65
    .line 66
    iput v4, p0, Lk0/p;->h:I

    .line 67
    .line 68
    instance-of v3, p1, Lr4/v;

    .line 69
    .line 70
    if-nez v3, :cond_3

    .line 71
    .line 72
    new-instance v3, Lk0/s;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct {v3, p1, v4}, Lk0/s;-><init>(Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lg4/l;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v4, Lr4/n;

    .line 84
    .line 85
    invoke-direct {v4, p1, v3, v0}, Lr4/n;-><init>(Lg4/l;Lr4/c;Lk0/q;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v4, p0}, Lr4/s;->j(Lr4/c;Lw3/c;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :goto_0
    return-object v2

    .line 92
    :cond_3
    check-cast p1, Lr4/v;

    .line 93
    .line 94
    iget-object p1, p1, Lr4/v;->g:Ljava/lang/Throwable;

    .line 95
    .line 96
    throw p1

    .line 97
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 98
    .line 99
    iget v1, p0, Lk0/p;->h:I

    .line 100
    .line 101
    sget-object v2, Lt3/h;->a:Lt3/h;

    .line 102
    .line 103
    const/4 v3, 0x2

    .line 104
    const/4 v4, 0x1

    .line 105
    if-eqz v1, :cond_7

    .line 106
    .line 107
    if-eq v1, v4, :cond_4

    .line 108
    .line 109
    if-ne v1, v3, :cond_6

    .line 110
    .line 111
    :cond_4
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    move-object v0, v2

    .line 115
    goto :goto_3

    .line 116
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 119
    .line 120
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_7
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, Lk0/p;->i:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Lk0/m;

    .line 130
    .line 131
    instance-of v1, p1, Lk0/k;

    .line 132
    .line 133
    iget-object v5, p0, Lk0/p;->j:Lk0/d0;

    .line 134
    .line 135
    if-eqz v1, :cond_d

    .line 136
    .line 137
    check-cast p1, Lk0/k;

    .line 138
    .line 139
    iput v4, p0, Lk0/p;->h:I

    .line 140
    .line 141
    iget-object v1, v5, Lk0/d0;->f:Lr4/s;

    .line 142
    .line 143
    invoke-virtual {v1}, Lr4/s;->a()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Lk0/e0;

    .line 148
    .line 149
    instance-of v3, v1, Lk0/a;

    .line 150
    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_8
    instance-of v3, v1, Lk0/h;

    .line 155
    .line 156
    if-eqz v3, :cond_9

    .line 157
    .line 158
    iget-object p1, p1, Lk0/k;->a:Lk0/e0;

    .line 159
    .line 160
    if-ne v1, p1, :cond_b

    .line 161
    .line 162
    invoke-virtual {v5, p0}, Lk0/d0;->e(Ly3/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v0, :cond_b

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_9
    sget-object p1, Lk0/f0;->a:Lk0/f0;

    .line 170
    .line 171
    invoke-static {v1, p1}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_a

    .line 176
    .line 177
    invoke-virtual {v5, p0}, Lk0/d0;->e(Ly3/c;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-ne p1, v0, :cond_b

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_a
    instance-of p1, v1, Lk0/g;

    .line 185
    .line 186
    if-nez p1, :cond_c

    .line 187
    .line 188
    :cond_b
    :goto_1
    move-object p1, v2

    .line 189
    :goto_2
    if-ne p1, v0, :cond_5

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 193
    .line 194
    const-string v0, "Can\'t read in final state."

    .line 195
    .line 196
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1

    .line 200
    :cond_d
    instance-of v1, p1, Lk0/l;

    .line 201
    .line 202
    if-eqz v1, :cond_5

    .line 203
    .line 204
    check-cast p1, Lk0/l;

    .line 205
    .line 206
    iput v3, p0, Lk0/p;->h:I

    .line 207
    .line 208
    invoke-static {v5, p1, p0}, Lk0/d0;->a(Lk0/d0;Lk0/l;Ly3/c;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-ne p1, v0, :cond_5

    .line 213
    .line 214
    :goto_3
    return-object v0

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
