.class public final Lr4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr4/c;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lr4/c;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lr4/c;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr4/l;->g:I

    iput-object p1, p0, Lr4/l;->h:Lr4/c;

    iput-object p2, p0, Lr4/l;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lr4/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lr4/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lr4/p;

    .line 12
    .line 13
    iget v1, v0, Lr4/p;->h:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lr4/p;->h:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lr4/p;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lr4/p;-><init>(Lr4/l;Lw3/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lr4/p;->g:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 33
    .line 34
    iget v2, v0, Lr4/p;->h:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, Lr4/p;->k:Lr4/c;

    .line 57
    .line 58
    iget-object v2, v0, Lr4/p;->j:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, Lr4/l;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, Lf4/p;

    .line 70
    .line 71
    iput-object p1, v0, Lr4/p;->j:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v2, p0, Lr4/l;->h:Lr4/c;

    .line 74
    .line 75
    iput-object v2, v0, Lr4/p;->k:Lr4/c;

    .line 76
    .line 77
    iput v4, v0, Lr4/p;->h:I

    .line 78
    .line 79
    invoke-interface {p2, p1, v0}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-ne p2, v1, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-object v5, v2

    .line 87
    move-object v2, p1

    .line 88
    move-object p1, v5

    .line 89
    :goto_1
    const/4 p2, 0x0

    .line 90
    iput-object p2, v0, Lr4/p;->j:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p2, v0, Lr4/p;->k:Lr4/c;

    .line 93
    .line 94
    iput v3, v0, Lr4/p;->h:I

    .line 95
    .line 96
    invoke-interface {p1, v2, v0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-ne p1, v1, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    :goto_2
    sget-object v1, Lt3/h;->a:Lt3/h;

    .line 104
    .line 105
    :goto_3
    return-object v1

    .line 106
    :pswitch_0
    instance-of v0, p2, Lr4/k;

    .line 107
    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    move-object v0, p2

    .line 111
    check-cast v0, Lr4/k;

    .line 112
    .line 113
    iget v1, v0, Lr4/k;->j:I

    .line 114
    .line 115
    const/high16 v2, -0x80000000

    .line 116
    .line 117
    and-int v3, v1, v2

    .line 118
    .line 119
    if-eqz v3, :cond_6

    .line 120
    .line 121
    sub-int/2addr v1, v2

    .line 122
    iput v1, v0, Lr4/k;->j:I

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    new-instance v0, Lr4/k;

    .line 126
    .line 127
    invoke-direct {v0, p0, p2}, Lr4/k;-><init>(Lr4/l;Lw3/c;)V

    .line 128
    .line 129
    .line 130
    :goto_4
    iget-object p2, v0, Lr4/k;->h:Ljava/lang/Object;

    .line 131
    .line 132
    sget-object v1, Lx3/a;->g:Lx3/a;

    .line 133
    .line 134
    iget v2, v0, Lr4/k;->j:I

    .line 135
    .line 136
    const/4 v3, 0x1

    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    if-ne v2, v3, :cond_7

    .line 140
    .line 141
    iget-object p1, v0, Lr4/k;->g:Lr4/l;

    .line 142
    .line 143
    :try_start_0
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    goto :goto_5

    .line 147
    :catchall_0
    move-exception p2

    .line 148
    goto :goto_7

    .line 149
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 152
    .line 153
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_8
    invoke-static {p2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :try_start_1
    iget-object p2, p0, Lr4/l;->h:Lr4/c;

    .line 161
    .line 162
    iput-object p0, v0, Lr4/k;->g:Lr4/l;

    .line 163
    .line 164
    iput v3, v0, Lr4/k;->j:I

    .line 165
    .line 166
    invoke-interface {p2, p1, v0}, Lr4/c;->b(Ljava/lang/Object;Lw3/c;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    if-ne p1, v1, :cond_9

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_9
    :goto_5
    sget-object v1, Lt3/h;->a:Lt3/h;

    .line 174
    .line 175
    :goto_6
    return-object v1

    .line 176
    :catchall_1
    move-exception p2

    .line 177
    move-object p1, p0

    .line 178
    :goto_7
    iget-object p1, p1, Lr4/l;->i:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Lg4/n;

    .line 181
    .line 182
    iput-object p2, p1, Lg4/n;->g:Ljava/lang/Object;

    .line 183
    .line 184
    throw p2

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
