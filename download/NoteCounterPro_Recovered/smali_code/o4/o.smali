.class public final synthetic Lo4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo4/o;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lo4/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw3/h;

    .line 7
    .line 8
    check-cast p2, Lw3/f;

    .line 9
    .line 10
    const-string v0, "acc"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "element"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p2}, Lw3/f;->getKey()Lw3/g;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Lw3/h;->i(Lw3/g;)Lw3/h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v0, Lw3/i;->g:Lw3/i;

    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sget-object v1, Lw3/d;->g:Lw3/d;

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lw3/e;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    new-instance v0, Lw3/b;

    .line 44
    .line 45
    invoke-direct {v0, p1, p2}, Lw3/b;-><init>(Lw3/h;Lw3/f;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    move-object p2, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-interface {p1, v1}, Lw3/h;->i(Lw3/g;)Lw3/h;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-ne p1, v0, :cond_2

    .line 55
    .line 56
    new-instance p1, Lw3/b;

    .line 57
    .line 58
    invoke-direct {p1, p2, v2}, Lw3/b;-><init>(Lw3/h;Lw3/f;)V

    .line 59
    .line 60
    .line 61
    move-object p2, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v0, Lw3/b;

    .line 64
    .line 65
    new-instance v1, Lw3/b;

    .line 66
    .line 67
    invoke-direct {v1, p1, p2}, Lw3/b;-><init>(Lw3/h;Lw3/f;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v1, v2}, Lw3/b;-><init>(Lw3/h;Lw3/f;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    return-object p2

    .line 75
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    check-cast p2, Lw3/f;

    .line 78
    .line 79
    const-string v0, "acc"

    .line 80
    .line 81
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v0, "element"

    .line 85
    .line 86
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string p1, ", "

    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :goto_2
    return-object p1

    .line 121
    :pswitch_1
    check-cast p1, Lt4/w;

    .line 122
    .line 123
    check-cast p2, Lw3/f;

    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_2
    check-cast p1, Lo4/f1;

    .line 127
    .line 128
    check-cast p2, Lw3/f;

    .line 129
    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    instance-of p1, p2, Lo4/f1;

    .line 134
    .line 135
    if-eqz p1, :cond_5

    .line 136
    .line 137
    move-object p1, p2

    .line 138
    check-cast p1, Lo4/f1;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_5
    const/4 p1, 0x0

    .line 142
    :goto_3
    return-object p1

    .line 143
    :pswitch_3
    check-cast p2, Lw3/f;

    .line 144
    .line 145
    instance-of v0, p2, Lo4/f1;

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    instance-of v0, p1, Ljava/lang/Integer;

    .line 150
    .line 151
    if-eqz v0, :cond_6

    .line 152
    .line 153
    check-cast p1, Ljava/lang/Integer;

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    const/4 p1, 0x0

    .line 157
    :goto_4
    const/4 v0, 0x1

    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    goto :goto_5

    .line 165
    :cond_7
    move p1, v0

    .line 166
    :goto_5
    if-nez p1, :cond_8

    .line 167
    .line 168
    move-object p1, p2

    .line 169
    goto :goto_6

    .line 170
    :cond_8
    add-int/2addr p1, v0

    .line 171
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    :cond_9
    :goto_6
    return-object p1

    .line 176
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    check-cast p2, Lw3/f;

    .line 183
    .line 184
    add-int/lit8 p1, p1, 0x1

    .line 185
    .line 186
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    return-object p1

    .line 191
    :pswitch_5
    check-cast p1, Lw3/h;

    .line 192
    .line 193
    check-cast p2, Lw3/f;

    .line 194
    .line 195
    invoke-interface {p1, p2}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1

    .line 200
    :pswitch_6
    check-cast p1, Lw3/h;

    .line 201
    .line 202
    check-cast p2, Lw3/f;

    .line 203
    .line 204
    invoke-interface {p1, p2}, Lw3/h;->l(Lw3/h;)Lw3/h;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    return-object p1

    .line 209
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    check-cast p2, Lw3/f;

    .line 215
    .line 216
    return-object p1

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
