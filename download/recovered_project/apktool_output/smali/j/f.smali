.class public final Lj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lj/f;->g:I

    iput-object p1, p0, Lj/f;->k:Ljava/lang/Object;

    iput-object p2, p0, Lj/f;->h:Ljava/lang/Object;

    iput-object p3, p0, Lj/f;->i:Ljava/lang/Object;

    iput-object p4, p0, Lj/f;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lj/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj/f;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv1/j;

    .line 9
    .line 10
    const-string v1, "Ignoring setProgressAsync(...). WorkSpec ("

    .line 11
    .line 12
    iget-object v2, p0, Lj/f;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/UUID;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    sget-object v5, Lu1/p;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v6, p0, Lj/f;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Landroidx/work/g;

    .line 29
    .line 30
    new-instance v7, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v8, "Updating progress for "

    .line 33
    .line 34
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, " ("

    .line 41
    .line 42
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ")"

    .line 49
    .line 50
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/4 v7, 0x0

    .line 58
    new-array v8, v7, [Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-virtual {v4, v5, v2, v8}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lj/f;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lu1/p;

    .line 66
    .line 67
    iget-object v4, v2, Lu1/p;->a:Landroidx/work/impl/WorkDatabase;

    .line 68
    .line 69
    iget-object v2, v2, Lu1/p;->a:Landroidx/work/impl/WorkDatabase;

    .line 70
    .line 71
    invoke-virtual {v4}, Lz0/i;->c()V

    .line 72
    .line 73
    .line 74
    :try_start_0
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->n()Ll2/j;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4, v3}, Ll2/j;->h(Ljava/lang/String;)Lt1/i;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    iget v4, v4, Lt1/i;->b:I

    .line 85
    .line 86
    const/4 v8, 0x2

    .line 87
    if-ne v4, v8, :cond_0

    .line 88
    .line 89
    new-instance v1, Lt1/g;

    .line 90
    .line 91
    invoke-direct {v1, v3, v6}, Lt1/g;-><init>(Ljava/lang/String;Landroidx/work/g;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->m()Lr1/h;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-object v4, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 101
    .line 102
    invoke-virtual {v4}, Lz0/i;->b()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4}, Lz0/i;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 106
    .line 107
    .line 108
    :try_start_1
    iget-object v3, v3, Lr1/h;->h:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Lt1/b;

    .line 111
    .line 112
    invoke-virtual {v3, v1}, Lt1/b;->e(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Lz0/i;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    .line 117
    .line 118
    :try_start_2
    invoke-virtual {v4}, Lz0/i;->f()V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception v1

    .line 123
    invoke-virtual {v4}, Lz0/i;->f()V

    .line 124
    .line 125
    .line 126
    throw v1

    .line 127
    :catchall_1
    move-exception v1

    .line 128
    goto :goto_2

    .line 129
    :cond_0
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    new-instance v6, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v1, ") is not in a RUNNING state."

    .line 142
    .line 143
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    new-array v3, v7, [Ljava/lang/Throwable;

    .line 151
    .line 152
    invoke-virtual {v4, v5, v1, v3}, Landroidx/work/n;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :goto_0
    const/4 v1, 0x0

    .line 156
    invoke-virtual {v0, v1}, Lv1/j;->h(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Lz0/i;->h()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 160
    .line 161
    .line 162
    :goto_1
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_1
    :try_start_3
    const-string v1, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 167
    .line 168
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 174
    :goto_2
    :try_start_4
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    sget-object v4, Lu1/p;->c:Ljava/lang/String;

    .line 179
    .line 180
    const-string v5, "Error updating Worker progress"

    .line 181
    .line 182
    filled-new-array {v1}, [Ljava/lang/Throwable;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {v3, v4, v5, v6}, Landroidx/work/n;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lv1/j;->i(Ljava/lang/Throwable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :goto_3
    return-void

    .line 194
    :catchall_2
    move-exception v0

    .line 195
    invoke-virtual {v2}, Lz0/i;->f()V

    .line 196
    .line 197
    .line 198
    throw v0

    .line 199
    :pswitch_0
    iget-object v0, p0, Lj/f;->k:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, Lu1/f;

    .line 202
    .line 203
    iget-object v0, v0, Lu1/f;->h:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lj/h;

    .line 206
    .line 207
    iget-object v1, p0, Lj/f;->i:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Lj/p;

    .line 210
    .line 211
    iget-object v2, p0, Lj/f;->h:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v2, Lj/g;

    .line 214
    .line 215
    if-eqz v2, :cond_2

    .line 216
    .line 217
    const/4 v3, 0x1

    .line 218
    iput-boolean v3, v0, Lj/h;->F:Z

    .line 219
    .line 220
    iget-object v2, v2, Lj/g;->b:Lj/n;

    .line 221
    .line 222
    const/4 v3, 0x0

    .line 223
    invoke-virtual {v2, v3}, Lj/n;->c(Z)V

    .line 224
    .line 225
    .line 226
    iput-boolean v3, v0, Lj/h;->F:Z

    .line 227
    .line 228
    :cond_2
    invoke-virtual {v1}, Lj/p;->isEnabled()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_3

    .line 233
    .line 234
    invoke-virtual {v1}, Lj/p;->hasSubMenu()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_3

    .line 239
    .line 240
    iget-object v0, p0, Lj/f;->j:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, Lj/n;

    .line 243
    .line 244
    const/4 v2, 0x4

    .line 245
    const/4 v3, 0x0

    .line 246
    invoke-virtual {v0, v1, v3, v2}, Lj/n;->q(Landroid/view/MenuItem;Lj/z;I)Z

    .line 247
    .line 248
    .line 249
    :cond_3
    return-void

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
