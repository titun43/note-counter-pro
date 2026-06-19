.class final Lcom/google/android/gms/internal/ads/zzaho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzer;

.field private zzb:Lcom/google/android/gms/internal/ads/zzaex;

.field private zzc:Lcom/google/android/gms/internal/ads/zzahv;

.field private zzd:Lcom/google/android/gms/internal/ads/zzaev;

.field private zze:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzf:Lcom/google/android/gms/internal/ads/zzakw;

.field private zzg:I

.field private zzh:I

.field private zzi:J

.field private zzj:I

.field private zzk:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 12
    .line 13
    const-wide/16 v0, -0x1

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 19
    .line 20
    return-void
.end method

.method private final zzh()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzafx;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 12

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    move v3, v2

    .line 10
    :goto_0
    const/16 v4, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    const/4 v6, 0x0

    .line 20
    invoke-interface {p1, v5, v6, v4, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    return v6

    .line 27
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 28
    .line 29
    .line 30
    move-result-wide v7

    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const-wide/16 v9, 0x1

    .line 36
    .line 37
    cmp-long v9, v7, v9

    .line 38
    .line 39
    if-nez v9, :cond_2

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-interface {p1, v7, v4, v4, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    return v6

    .line 52
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    move v9, v1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v9, v4

    .line 59
    :goto_1
    int-to-long v9, v9

    .line 60
    cmp-long v11, v7, v9

    .line 61
    .line 62
    if-gez v11, :cond_3

    .line 63
    .line 64
    return v6

    .line 65
    :cond_3
    sub-long/2addr v7, v9

    .line 66
    long-to-int v7, v7

    .line 67
    if-eqz v3, :cond_8

    .line 68
    .line 69
    const v3, 0x66747970

    .line 70
    .line 71
    .line 72
    if-ne v5, v3, :cond_7

    .line 73
    .line 74
    if-ge v7, v4, :cond_4

    .line 75
    .line 76
    return v6

    .line 77
    :cond_4
    const/4 v3, 0x4

    .line 78
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    move-object v5, p1

    .line 86
    check-cast v5, Lcom/google/android/gms/internal/ads/zzael;

    .line 87
    .line 88
    invoke-virtual {v5, v4, v6, v3, v6}, Lcom/google/android/gms/internal/ads/zzael;->zzh([BIIZ)Z

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const v4, 0x68656963

    .line 96
    .line 97
    .line 98
    if-eq v3, v4, :cond_5

    .line 99
    .line 100
    return v6

    .line 101
    :cond_5
    add-int/lit8 v7, v7, -0x4

    .line 102
    .line 103
    invoke-virtual {v5, v7, v6}, Lcom/google/android/gms/internal/ads/zzael;->zzj(IZ)Z

    .line 104
    .line 105
    .line 106
    :cond_6
    :goto_2
    move v3, v6

    .line 107
    goto :goto_0

    .line 108
    :cond_7
    return v6

    .line 109
    :cond_8
    const v3, 0x6d707664

    .line 110
    .line 111
    .line 112
    if-ne v5, v3, :cond_9

    .line 113
    .line 114
    return v2

    .line 115
    :cond_9
    if-eqz v7, :cond_6

    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, Lcom/google/android/gms/internal/ads/zzael;

    .line 119
    .line 120
    invoke-virtual {v3, v7, v6}, Lcom/google/android/gms/internal/ads/zzael;->zzj(IZ)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    :goto_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    const/16 v8, 0x8

    .line 14
    .line 15
    if-eqz v3, :cond_8

    .line 16
    .line 17
    if-eq v3, v7, :cond_7

    .line 18
    .line 19
    const/4 v6, 0x3

    .line 20
    if-eq v3, v5, :cond_4

    .line 21
    .line 22
    if-eq v3, v6, :cond_0

    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zze:Lcom/google/android/gms/internal/ads/zzagd;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzd:Lcom/google/android/gms/internal/ads/zzaev;

    .line 30
    .line 31
    if-eq v1, v3, :cond_2

    .line 32
    .line 33
    :cond_1
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzd:Lcom/google/android/gms/internal/ads/zzaev;

    .line 34
    .line 35
    new-instance v3, Lcom/google/android/gms/internal/ads/zzagd;

    .line 36
    .line 37
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 38
    .line 39
    invoke-direct {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzagd;-><init>(Lcom/google/android/gms/internal/ads/zzaev;J)V

    .line 40
    .line 41
    .line 42
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zze:Lcom/google/android/gms/internal/ads/zzagd;

    .line 43
    .line 44
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zze:Lcom/google/android/gms/internal/ads/zzagd;

    .line 50
    .line 51
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzakw;->zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ne v1, v7, :cond_3

    .line 56
    .line 57
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 58
    .line 59
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 60
    .line 61
    add-long/2addr v3, v5

    .line 62
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 63
    .line 64
    :cond_3
    return v1

    .line 65
    :cond_4
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 66
    .line 67
    if-nez v3, :cond_5

    .line 68
    .line 69
    new-instance v3, Lcom/google/android/gms/internal/ads/zzakw;

    .line 70
    .line 71
    sget-object v4, Lcom/google/android/gms/internal/ads/zzamd;->zza:Lcom/google/android/gms/internal/ads/zzamd;

    .line 72
    .line 73
    invoke-direct {v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzakw;-><init>(Lcom/google/android/gms/internal/ads/zzamd;I)V

    .line 74
    .line 75
    .line 76
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 77
    .line 78
    :cond_5
    new-instance v3, Lcom/google/android/gms/internal/ads/zzagd;

    .line 79
    .line 80
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 81
    .line 82
    invoke-direct {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzagd;-><init>(Lcom/google/android/gms/internal/ads/zzaev;J)V

    .line 83
    .line 84
    .line 85
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zze:Lcom/google/android/gms/internal/ads/zzagd;

    .line 86
    .line 87
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 88
    .line 89
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzakw;->zza(Lcom/google/android/gms/internal/ads/zzaev;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 96
    .line 97
    new-instance v4, Lcom/google/android/gms/internal/ads/zzagf;

    .line 98
    .line 99
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 100
    .line 101
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-direct {v4, v7, v8, v5}, Lcom/google/android/gms/internal/ads/zzagf;-><init>(JLcom/google/android/gms/internal/ads/zzaex;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzakw;->zzc(Lcom/google/android/gms/internal/ads/zzaex;)V

    .line 110
    .line 111
    .line 112
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaho;->zzh()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:J

    .line 120
    .line 121
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 122
    .line 123
    int-to-long v7, v5

    .line 124
    sub-long/2addr v3, v7

    .line 125
    long-to-int v3, v3

    .line 126
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 127
    .line 128
    .line 129
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 130
    .line 131
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 135
    .line 136
    if-nez v3, :cond_a

    .line 137
    .line 138
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 139
    .line 140
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-interface {v1, v9, v6, v8, v7}, Lcom/google/android/gms/internal/ads/zzaev;->zzb([BIIZ)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-nez v9, :cond_9

    .line 149
    .line 150
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaho;->zzh()V

    .line 151
    .line 152
    .line 153
    return v4

    .line 154
    :cond_9
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 155
    .line 156
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 160
    .line 161
    .line 162
    move-result-wide v9

    .line 163
    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:J

    .line 164
    .line 165
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzh:I

    .line 170
    .line 171
    :cond_a
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:J

    .line 172
    .line 173
    const-wide/16 v9, 0x1

    .line 174
    .line 175
    cmp-long v9, v3, v9

    .line 176
    .line 177
    if-nez v9, :cond_b

    .line 178
    .line 179
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-interface {v1, v4, v8, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 186
    .line 187
    .line 188
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 189
    .line 190
    add-int/2addr v4, v8

    .line 191
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 192
    .line 193
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 194
    .line 195
    .line 196
    move-result-wide v3

    .line 197
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzi:J

    .line 198
    .line 199
    :cond_b
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzh:I

    .line 200
    .line 201
    const v9, 0x6d707664

    .line 202
    .line 203
    .line 204
    if-ne v8, v9, :cond_c

    .line 205
    .line 206
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 207
    .line 208
    .line 209
    move-result-wide v8

    .line 210
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 211
    .line 212
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 213
    .line 214
    int-to-long v10, v10

    .line 215
    sub-long v13, v8, v10

    .line 216
    .line 217
    sub-long v19, v3, v10

    .line 218
    .line 219
    new-instance v10, Lcom/google/android/gms/internal/ads/zzahv;

    .line 220
    .line 221
    const-wide/16 v11, 0x0

    .line 222
    .line 223
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    move-wide/from16 v17, v8

    .line 229
    .line 230
    invoke-direct/range {v10 .. v20}, Lcom/google/android/gms/internal/ads/zzahv;-><init>(JJJJJ)V

    .line 231
    .line 232
    .line 233
    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzc:Lcom/google/android/gms/internal/ads/zzahv;

    .line 234
    .line 235
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    const/16 v4, 0x400

    .line 241
    .line 242
    const/4 v8, 0x4

    .line 243
    invoke-interface {v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    new-instance v4, Lcom/google/android/gms/internal/ads/zzt;

    .line 248
    .line 249
    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 250
    .line 251
    .line 252
    const-string v8, "image/heic"

    .line 253
    .line 254
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 255
    .line 256
    .line 257
    new-instance v8, Lcom/google/android/gms/internal/ads/zzap;

    .line 258
    .line 259
    new-array v7, v7, [Lcom/google/android/gms/internal/ads/zzao;

    .line 260
    .line 261
    aput-object v10, v7, v6

    .line 262
    .line 263
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    invoke-direct {v8, v9, v10, v7}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v4, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 279
    .line 280
    .line 281
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_c
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 286
    .line 287
    goto/16 :goto_0
.end method

.method public final zze(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 9
    .line 10
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzj:I

    .line 11
    .line 12
    const-wide/16 p1, -0x1

    .line 13
    .line 14
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzk:J

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzg:I

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzakw;->zze(JJ)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final zzf()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaho;->zzf:Lcom/google/android/gms/internal/ads/zzakw;

    :cond_0
    return-void
.end method
