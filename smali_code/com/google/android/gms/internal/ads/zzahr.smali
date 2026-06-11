.class final Lcom/google/android/gms/internal/ads/zzahr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzer;

.field private zzb:Lcom/google/android/gms/internal/ads/zzaex;

.field private zzc:I

.field private zzd:I

.field private zze:I

.field private zzf:J

.field private zzg:Lcom/google/android/gms/internal/ads/zzahv;

.field private zzh:Lcom/google/android/gms/internal/ads/zzaev;

.field private zzi:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzj:Lcom/google/android/gms/internal/ads/zzakw;


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
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 15
    .line 16
    return-void
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzaev;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast p1, Lcom/google/android/gms/internal/ads/zzael;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {p1, v2, v3, v1, v3}, Lcom/google/android/gms/internal/ads/zzael;->zzh([BIIZ)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method private final zzi(Lcom/google/android/gms/internal/ads/zzaev;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-interface {p1, v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int/lit8 p1, p1, -0x2

    .line 20
    .line 21
    return p1
.end method

.method private final zzj()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

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
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

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
    const/4 v0, 0x6

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzahr;->zzh(Lcom/google/android/gms/internal/ads/zzaev;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0xffd8

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v0, v1, :cond_3

    .line 10
    .line 11
    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzahr;->zzh(Lcom/google/android/gms/internal/ads/zzaev;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzd:I

    .line 16
    .line 17
    const v1, 0xffda

    .line 18
    .line 19
    .line 20
    if-ne v0, v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzahr;->zzi(Lcom/google/android/gms/internal/ads/zzaev;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_3

    .line 28
    .line 29
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzd:I

    .line 30
    .line 31
    const v3, 0xffe1

    .line 32
    .line 33
    .line 34
    if-eq v1, v3, :cond_2

    .line 35
    .line 36
    move-object v1, p1

    .line 37
    check-cast v1, Lcom/google/android/gms/internal/ads/zzael;

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzael;->zzj(IZ)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzahr;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    move-object v4, p1

    .line 53
    check-cast v4, Lcom/google/android/gms/internal/ads/zzael;

    .line 54
    .line 55
    invoke-virtual {v4, v3, v2, v0, v2}, Lcom/google/android/gms/internal/ads/zzael;->zzh([BIIZ)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v3, "http://ns.adobe.com/xap/1.0/"

    .line 63
    .line 64
    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzahu;->zzb(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    const/4 p1, 0x1

    .line 81
    return p1

    .line 82
    :cond_3
    :goto_1
    return v2
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 25

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
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x2

    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    if-eqz v3, :cond_1a

    .line 16
    .line 17
    if-eq v3, v8, :cond_19

    .line 18
    .line 19
    const/4 v10, -0x1

    .line 20
    if-eq v3, v5, :cond_a

    .line 21
    .line 22
    const/4 v5, 0x5

    .line 23
    if-eq v3, v4, :cond_5

    .line 24
    .line 25
    if-eq v3, v5, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    if-ne v3, v1, :cond_0

    .line 29
    .line 30
    return v10

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzi:Lcom/google/android/gms/internal/ads/zzagd;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzh:Lcom/google/android/gms/internal/ads/zzaev;

    .line 42
    .line 43
    if-eq v1, v3, :cond_3

    .line 44
    .line 45
    :cond_2
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzh:Lcom/google/android/gms/internal/ads/zzaev;

    .line 46
    .line 47
    new-instance v3, Lcom/google/android/gms/internal/ads/zzagd;

    .line 48
    .line 49
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 50
    .line 51
    invoke-direct {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzagd;-><init>(Lcom/google/android/gms/internal/ads/zzaev;J)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzi:Lcom/google/android/gms/internal/ads/zzagd;

    .line 55
    .line 56
    :cond_3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzi:Lcom/google/android/gms/internal/ads/zzagd;

    .line 62
    .line 63
    invoke-virtual {v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzakw;->zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v8, :cond_4

    .line 68
    .line 69
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 70
    .line 71
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 72
    .line 73
    add-long/2addr v3, v5

    .line 74
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 75
    .line 76
    :cond_4
    return v1

    .line 77
    :cond_5
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 82
    .line 83
    cmp-long v3, v6, v10

    .line 84
    .line 85
    if-nez v3, :cond_9

    .line 86
    .line 87
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v1, v2, v9, v8, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahr;->zzj()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 104
    .line 105
    .line 106
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 107
    .line 108
    if-nez v2, :cond_7

    .line 109
    .line 110
    new-instance v2, Lcom/google/android/gms/internal/ads/zzakw;

    .line 111
    .line 112
    sget-object v3, Lcom/google/android/gms/internal/ads/zzamd;->zza:Lcom/google/android/gms/internal/ads/zzamd;

    .line 113
    .line 114
    const/16 v6, 0x8

    .line 115
    .line 116
    invoke-direct {v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzakw;-><init>(Lcom/google/android/gms/internal/ads/zzamd;I)V

    .line 117
    .line 118
    .line 119
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 120
    .line 121
    :cond_7
    new-instance v2, Lcom/google/android/gms/internal/ads/zzagd;

    .line 122
    .line 123
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 124
    .line 125
    invoke-direct {v2, v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzagd;-><init>(Lcom/google/android/gms/internal/ads/zzaev;J)V

    .line 126
    .line 127
    .line 128
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzi:Lcom/google/android/gms/internal/ads/zzagd;

    .line 129
    .line 130
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzakw;->zza(Lcom/google/android/gms/internal/ads/zzaev;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 139
    .line 140
    new-instance v2, Lcom/google/android/gms/internal/ads/zzagf;

    .line 141
    .line 142
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 143
    .line 144
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-direct {v2, v6, v7, v3}, Lcom/google/android/gms/internal/ads/zzagf;-><init>(JLcom/google/android/gms/internal/ads/zzaex;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzakw;->zzc(Lcom/google/android/gms/internal/ads/zzaex;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzg:Lcom/google/android/gms/internal/ads/zzahv;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzb:Lcom/google/android/gms/internal/ads/zzaex;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/16 v3, 0x400

    .line 166
    .line 167
    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 172
    .line 173
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v4, "image/jpeg"

    .line 177
    .line 178
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 179
    .line 180
    .line 181
    new-instance v4, Lcom/google/android/gms/internal/ads/zzap;

    .line 182
    .line 183
    new-array v6, v8, [Lcom/google/android/gms/internal/ads/zzao;

    .line 184
    .line 185
    aput-object v1, v6, v9

    .line 186
    .line 187
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    invoke-direct {v4, v7, v8, v6}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 203
    .line 204
    .line 205
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_8
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahr;->zzj()V

    .line 209
    .line 210
    .line 211
    :goto_0
    return v9

    .line 212
    :cond_9
    iput-wide v10, v2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 213
    .line 214
    return v8

    .line 215
    :cond_a
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzd:I

    .line 216
    .line 217
    const v3, 0xffe1

    .line 218
    .line 219
    .line 220
    if-ne v2, v3, :cond_17

    .line 221
    .line 222
    new-instance v2, Lcom/google/android/gms/internal/ads/zzer;

    .line 223
    .line 224
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zze:I

    .line 225
    .line 226
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzahr;->zze:I

    .line 234
    .line 235
    invoke-interface {v1, v3, v9, v4}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 236
    .line 237
    .line 238
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzg:Lcom/google/android/gms/internal/ads/zzahv;

    .line 239
    .line 240
    if-nez v3, :cond_18

    .line 241
    .line 242
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    const-string v4, "http://ns.adobe.com/xap/1.0/"

    .line 247
    .line 248
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_18

    .line 253
    .line 254
    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-eqz v2, :cond_18

    .line 259
    .line 260
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 261
    .line 262
    .line 263
    move-result-wide v3

    .line 264
    cmp-long v1, v3, v6

    .line 265
    .line 266
    if-nez v1, :cond_c

    .line 267
    .line 268
    :cond_b
    :goto_1
    const/4 v11, 0x0

    .line 269
    goto/16 :goto_6

    .line 270
    .line 271
    :cond_c
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzahu;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaht;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-nez v1, :cond_d

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_d
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzaht;->zzb:Ljava/util/List;

    .line 279
    .line 280
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 281
    .line 282
    .line 283
    move-result v12

    .line 284
    if-ge v12, v5, :cond_e

    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_e
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 288
    .line 289
    .line 290
    move-result v5

    .line 291
    add-int/2addr v5, v10

    .line 292
    move-wide v13, v6

    .line 293
    move-wide v15, v13

    .line 294
    move-wide/from16 v19, v15

    .line 295
    .line 296
    move-wide/from16 v21, v19

    .line 297
    .line 298
    :goto_2
    if-ltz v5, :cond_15

    .line 299
    .line 300
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    check-cast v10, Lcom/google/android/gms/internal/ads/zzahs;

    .line 305
    .line 306
    iget-object v12, v10, Lcom/google/android/gms/internal/ads/zzahs;->zza:Ljava/lang/String;

    .line 307
    .line 308
    move-wide/from16 v17, v6

    .line 309
    .line 310
    const-string v6, "video/mp4"

    .line 311
    .line 312
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-nez v6, :cond_f

    .line 317
    .line 318
    const-string v6, "video/quicktime"

    .line 319
    .line 320
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-eqz v6, :cond_10

    .line 325
    .line 326
    :cond_f
    move v6, v8

    .line 327
    goto :goto_3

    .line 328
    :cond_10
    move v6, v9

    .line 329
    :goto_3
    if-nez v5, :cond_11

    .line 330
    .line 331
    iget-wide v11, v10, Lcom/google/android/gms/internal/ads/zzahs;->zzc:J

    .line 332
    .line 333
    sub-long/2addr v3, v11

    .line 334
    const-wide/16 v10, 0x0

    .line 335
    .line 336
    :goto_4
    move-wide/from16 v23, v10

    .line 337
    .line 338
    move-wide v10, v3

    .line 339
    move-wide/from16 v3, v23

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_11
    iget-wide v10, v10, Lcom/google/android/gms/internal/ads/zzahs;->zzb:J

    .line 343
    .line 344
    sub-long v10, v3, v10

    .line 345
    .line 346
    goto :goto_4

    .line 347
    :goto_5
    if-eqz v6, :cond_12

    .line 348
    .line 349
    cmp-long v6, v3, v10

    .line 350
    .line 351
    if-eqz v6, :cond_12

    .line 352
    .line 353
    sub-long v21, v10, v3

    .line 354
    .line 355
    move-wide/from16 v19, v3

    .line 356
    .line 357
    :cond_12
    if-nez v5, :cond_13

    .line 358
    .line 359
    move-wide v15, v10

    .line 360
    :cond_13
    if-nez v5, :cond_14

    .line 361
    .line 362
    move-wide v13, v3

    .line 363
    :cond_14
    add-int/lit8 v5, v5, -0x1

    .line 364
    .line 365
    move-wide/from16 v6, v17

    .line 366
    .line 367
    goto :goto_2

    .line 368
    :cond_15
    move-wide/from16 v17, v6

    .line 369
    .line 370
    cmp-long v2, v19, v17

    .line 371
    .line 372
    if-eqz v2, :cond_b

    .line 373
    .line 374
    cmp-long v2, v21, v17

    .line 375
    .line 376
    if-eqz v2, :cond_b

    .line 377
    .line 378
    cmp-long v2, v13, v17

    .line 379
    .line 380
    if-eqz v2, :cond_b

    .line 381
    .line 382
    cmp-long v2, v15, v17

    .line 383
    .line 384
    if-nez v2, :cond_16

    .line 385
    .line 386
    goto :goto_1

    .line 387
    :cond_16
    iget-wide v1, v1, Lcom/google/android/gms/internal/ads/zzaht;->zza:J

    .line 388
    .line 389
    new-instance v12, Lcom/google/android/gms/internal/ads/zzahv;

    .line 390
    .line 391
    move-wide/from16 v17, v1

    .line 392
    .line 393
    invoke-direct/range {v12 .. v22}, Lcom/google/android/gms/internal/ads/zzahv;-><init>(JJJJJ)V

    .line 394
    .line 395
    .line 396
    move-object v11, v12

    .line 397
    :goto_6
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzg:Lcom/google/android/gms/internal/ads/zzahv;

    .line 398
    .line 399
    if-eqz v11, :cond_18

    .line 400
    .line 401
    iget-wide v1, v11, Lcom/google/android/gms/internal/ads/zzaiu;->zzd:J

    .line 402
    .line 403
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_17
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zze:I

    .line 407
    .line 408
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 409
    .line 410
    .line 411
    :cond_18
    :goto_7
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 412
    .line 413
    return v9

    .line 414
    :cond_19
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzahr;->zzi(Lcom/google/android/gms/internal/ads/zzaev;)I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zze:I

    .line 419
    .line 420
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 421
    .line 422
    .line 423
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 424
    .line 425
    return v9

    .line 426
    :cond_1a
    move-wide/from16 v17, v6

    .line 427
    .line 428
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahr;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 429
    .line 430
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-interface {v1, v3, v9, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzd:I

    .line 445
    .line 446
    const v2, 0xffda

    .line 447
    .line 448
    .line 449
    if-ne v1, v2, :cond_1c

    .line 450
    .line 451
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzf:J

    .line 452
    .line 453
    cmp-long v1, v1, v17

    .line 454
    .line 455
    if-eqz v1, :cond_1b

    .line 456
    .line 457
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 458
    .line 459
    goto :goto_8

    .line 460
    :cond_1b
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahr;->zzj()V

    .line 461
    .line 462
    .line 463
    goto :goto_8

    .line 464
    :cond_1c
    const v2, 0xffd0

    .line 465
    .line 466
    .line 467
    if-lt v1, v2, :cond_1d

    .line 468
    .line 469
    const v2, 0xffd9

    .line 470
    .line 471
    .line 472
    if-le v1, v2, :cond_1e

    .line 473
    .line 474
    :cond_1d
    const v2, 0xff01

    .line 475
    .line 476
    .line 477
    if-eq v1, v2, :cond_1e

    .line 478
    .line 479
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 480
    .line 481
    :cond_1e
    :goto_8
    return v9
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
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzc:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahr;->zzj:Lcom/google/android/gms/internal/ads/zzakw;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzakw;->zze(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method
