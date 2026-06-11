.class public final Lcom/google/android/gms/common/api/internal/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/d;


# instance fields
.field public final g:Lcom/google/android/gms/common/api/internal/g;

.field public final h:I

.field public final i:Lcom/google/android/gms/common/api/internal/a;

.field public final j:J

.field public final k:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/internal/g;ILcom/google/android/gms/common/api/internal/a;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g0;->g:Lcom/google/android/gms/common/api/internal/g;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/gms/common/api/internal/g0;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/g0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/google/android/gms/common/api/internal/g0;->j:J

    .line 11
    .line 12
    iput-wide p6, p0, Lcom/google/android/gms/common/api/internal/g0;->k:J

    .line 13
    .line 14
    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/internal/a0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/j;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/f;->getTelemetryConfiguration()Lcom/google/android/gms/common/internal/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    iget-boolean v0, p1, Lcom/google/android/gms/common/internal/j;->h:Z

    .line 8
    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    iget-object v0, p1, Lcom/google/android/gms/common/internal/j;->j:[I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p1, Lcom/google/android/gms/common/internal/j;->l:[I

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    :goto_0
    array-length v2, v0

    .line 22
    if-ge v1, v2, :cond_3

    .line 23
    .line 24
    aget v2, v0, v1

    .line 25
    .line 26
    if-ne v2, p2, :cond_1

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_1
    array-length v2, v0

    .line 33
    if-ge v1, v2, :cond_5

    .line 34
    .line 35
    aget v2, v0, v1

    .line 36
    .line 37
    if-ne v2, p2, :cond_4

    .line 38
    .line 39
    :cond_3
    :goto_2
    iget p0, p0, Lcom/google/android/gms/common/api/internal/a0;->r:I

    .line 40
    .line 41
    iget p2, p1, Lcom/google/android/gms/common/internal/j;->k:I

    .line 42
    .line 43
    if-ge p0, p2, :cond_5

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_5
    :goto_3
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method


# virtual methods
.method public final onComplete(Lh3/g;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/g0;->g:Lcom/google/android/gms/common/api/internal/g;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/g;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/internal/r;->b()Lcom/google/android/gms/common/internal/r;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, Lcom/google/android/gms/common/internal/r;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lcom/google/android/gms/common/internal/s;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-boolean v2, v1, Lcom/google/android/gms/common/internal/s;->h:Z

    .line 24
    .line 25
    if-eqz v2, :cond_b

    .line 26
    .line 27
    :cond_1
    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/g0;->g:Lcom/google/android/gms/common/api/internal/g;

    .line 28
    .line 29
    iget-object v3, v0, Lcom/google/android/gms/common/api/internal/g0;->i:Lcom/google/android/gms/common/api/internal/a;

    .line 30
    .line 31
    iget-object v2, v2, Lcom/google/android/gms/common/api/internal/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/google/android/gms/common/api/internal/a0;

    .line 38
    .line 39
    if-eqz v2, :cond_b

    .line 40
    .line 41
    iget-object v3, v2, Lcom/google/android/gms/common/api/internal/a0;->h:Lcom/google/android/gms/common/api/g;

    .line 42
    .line 43
    instance-of v4, v3, Lcom/google/android/gms/common/internal/f;

    .line 44
    .line 45
    if-eqz v4, :cond_b

    .line 46
    .line 47
    check-cast v3, Lcom/google/android/gms/common/internal/f;

    .line 48
    .line 49
    iget-wide v4, v0, Lcom/google/android/gms/common/api/internal/g0;->j:J

    .line 50
    .line 51
    const-wide/16 v6, 0x0

    .line 52
    .line 53
    cmp-long v4, v4, v6

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    const/4 v8, 0x0

    .line 57
    if-lez v4, :cond_2

    .line 58
    .line 59
    move v4, v5

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v4, v8

    .line 62
    :goto_0
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/f;->getGCoreServiceId()I

    .line 63
    .line 64
    .line 65
    move-result v19

    .line 66
    const/16 v9, 0x64

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    iget-boolean v10, v1, Lcom/google/android/gms/common/internal/s;->i:Z

    .line 71
    .line 72
    and-int/2addr v4, v10

    .line 73
    iget v10, v1, Lcom/google/android/gms/common/internal/s;->j:I

    .line 74
    .line 75
    iget v11, v1, Lcom/google/android/gms/common/internal/s;->k:I

    .line 76
    .line 77
    iget v1, v1, Lcom/google/android/gms/common/internal/s;->g:I

    .line 78
    .line 79
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/f;->hasConnectionInfo()Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    if-eqz v12, :cond_4

    .line 84
    .line 85
    invoke-virtual {v3}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    if-nez v12, :cond_4

    .line 90
    .line 91
    iget v4, v0, Lcom/google/android/gms/common/api/internal/g0;->h:I

    .line 92
    .line 93
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/common/api/internal/g0;->a(Lcom/google/android/gms/common/api/internal/a0;Lcom/google/android/gms/common/internal/f;I)Lcom/google/android/gms/common/internal/j;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-eqz v2, :cond_b

    .line 98
    .line 99
    iget-boolean v3, v2, Lcom/google/android/gms/common/internal/j;->i:Z

    .line 100
    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    iget-wide v3, v0, Lcom/google/android/gms/common/api/internal/g0;->j:J

    .line 104
    .line 105
    cmp-long v3, v3, v6

    .line 106
    .line 107
    if-lez v3, :cond_3

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move v5, v8

    .line 111
    :goto_1
    iget v11, v2, Lcom/google/android/gms/common/internal/j;->k:I

    .line 112
    .line 113
    move v4, v5

    .line 114
    :cond_4
    move v2, v10

    .line 115
    move v3, v11

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    const/16 v10, 0x1388

    .line 118
    .line 119
    move v1, v8

    .line 120
    move v3, v9

    .line 121
    move v2, v10

    .line 122
    :goto_2
    iget-object v5, v0, Lcom/google/android/gms/common/api/internal/g0;->g:Lcom/google/android/gms/common/api/internal/g;

    .line 123
    .line 124
    invoke-virtual/range {p1 .. p1}, Lh3/g;->c()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    const/4 v11, -0x1

    .line 129
    if-eqz v10, :cond_6

    .line 130
    .line 131
    move v12, v8

    .line 132
    goto :goto_5

    .line 133
    :cond_6
    move-object/from16 v8, p1

    .line 134
    .line 135
    check-cast v8, Lh3/n;

    .line 136
    .line 137
    iget-boolean v8, v8, Lh3/n;->d:Z

    .line 138
    .line 139
    if-eqz v8, :cond_7

    .line 140
    .line 141
    :goto_3
    move v8, v9

    .line 142
    :goto_4
    move v12, v11

    .line 143
    goto :goto_5

    .line 144
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lh3/g;->a()Ljava/lang/Exception;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    instance-of v9, v8, Lcom/google/android/gms/common/api/j;

    .line 149
    .line 150
    if-eqz v9, :cond_9

    .line 151
    .line 152
    check-cast v8, Lcom/google/android/gms/common/api/j;

    .line 153
    .line 154
    iget-object v8, v8, Lcom/google/android/gms/common/api/j;->g:Lcom/google/android/gms/common/api/Status;

    .line 155
    .line 156
    iget v9, v8, Lcom/google/android/gms/common/api/Status;->g:I

    .line 157
    .line 158
    iget-object v8, v8, Lcom/google/android/gms/common/api/Status;->j:Lt2/b;

    .line 159
    .line 160
    if-nez v8, :cond_8

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_8
    iget v8, v8, Lt2/b;->h:I

    .line 164
    .line 165
    move v12, v8

    .line 166
    move v8, v9

    .line 167
    goto :goto_5

    .line 168
    :cond_9
    const/16 v8, 0x65

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :goto_5
    if-eqz v4, :cond_a

    .line 172
    .line 173
    iget-wide v6, v0, Lcom/google/android/gms/common/api/internal/g0;->j:J

    .line 174
    .line 175
    iget-wide v9, v0, Lcom/google/android/gms/common/api/internal/g0;->k:J

    .line 176
    .line 177
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 178
    .line 179
    .line 180
    move-result-wide v13

    .line 181
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 182
    .line 183
    .line 184
    move-result-wide v15

    .line 185
    sub-long v9, v15, v9

    .line 186
    .line 187
    long-to-int v11, v9

    .line 188
    move-wide v15, v13

    .line 189
    move-wide v13, v6

    .line 190
    :goto_6
    move/from16 v20, v11

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_a
    move-wide v13, v6

    .line 194
    move-wide v15, v13

    .line 195
    goto :goto_6

    .line 196
    :goto_7
    iget v10, v0, Lcom/google/android/gms/common/api/internal/g0;->h:I

    .line 197
    .line 198
    new-instance v9, Lcom/google/android/gms/common/internal/q;

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    const/16 v18, 0x0

    .line 203
    .line 204
    move v11, v8

    .line 205
    invoke-direct/range {v9 .. v20}, Lcom/google/android/gms/common/internal/q;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 206
    .line 207
    .line 208
    int-to-long v14, v2

    .line 209
    new-instance v11, Lcom/google/android/gms/common/api/internal/h0;

    .line 210
    .line 211
    move v13, v1

    .line 212
    move/from16 v16, v3

    .line 213
    .line 214
    move-object v12, v9

    .line 215
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/api/internal/h0;-><init>(Lcom/google/android/gms/common/internal/q;IJI)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v5, Lcom/google/android/gms/common/api/internal/g;->s:Lcom/google/android/gms/internal/base/zau;

    .line 219
    .line 220
    const/16 v2, 0x12

    .line 221
    .line 222
    invoke-virtual {v1, v2, v11}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 227
    .line 228
    .line 229
    :cond_b
    :goto_8
    return-void
.end method
