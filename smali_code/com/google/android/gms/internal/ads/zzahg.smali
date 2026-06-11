.class public final Lcom/google/android/gms/internal/ads/zzahg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# instance fields
.field private final zza:[B

.field private final zzb:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzafb;

.field private zzd:Lcom/google/android/gms/internal/ads/zzaex;

.field private zze:Lcom/google/android/gms/internal/ads/zzagh;

.field private zzf:I

.field private zzg:Lcom/google/android/gms/internal/ads/zzap;

.field private zzh:Lcom/google/android/gms/internal/ads/zzafh;

.field private zzi:I

.field private zzj:I

.field private zzk:Lcom/google/android/gms/internal/ads/zzahe;

.field private zzl:I

.field private zzm:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x2a

    new-array p1, p1, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zza:[B

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const v0, 0x8000

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzer;-><init>([BI)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzafb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzafb;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzc:Lcom/google/android/gms/internal/ads/zzafb;

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    return-void
.end method

.method private final zzh(Lcom/google/android/gms/internal/ads/zzer;Z)J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x10

    .line 15
    .line 16
    if-gt v0, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 22
    .line 23
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzj:I

    .line 24
    .line 25
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzc:Lcom/google/android/gms/internal/ads/zzafb;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzafc;->zza(Lcom/google/android/gms/internal/ads/zzer;Lcom/google/android/gms/internal/ads/zzafh;ILcom/google/android/gms/internal/ads/zzafb;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 34
    .line 35
    .line 36
    iget-wide p1, v3, Lcom/google/android/gms/internal/ads/zzafb;->zza:J

    .line 37
    .line 38
    return-wide p1

    .line 39
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    if-eqz p2, :cond_5

    .line 43
    .line 44
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzi:I

    .line 49
    .line 50
    sub-int/2addr p2, v1

    .line 51
    if-gt v0, p2, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 57
    .line 58
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzj:I

    .line 59
    .line 60
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzc:Lcom/google/android/gms/internal/ads/zzafb;

    .line 61
    .line 62
    invoke-static {p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzafc;->zza(Lcom/google/android/gms/internal/ads/zzer;Lcom/google/android/gms/internal/ads/zzafh;ILcom/google/android/gms/internal/ads/zzafb;)Z

    .line 63
    .line 64
    .line 65
    move-result p2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    goto :goto_2

    .line 67
    :catch_0
    const/4 p2, 0x0

    .line 68
    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-le v1, v2, :cond_2

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    if-eqz p2, :cond_3

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzc:Lcom/google/android/gms/internal/ads/zzafb;

    .line 85
    .line 86
    iget-wide p1, p1, Lcom/google/android/gms/internal/ads/zzafb;->zza:J

    .line 87
    .line 88
    return-wide p1

    .line 89
    :cond_3
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 101
    .line 102
    .line 103
    :goto_4
    const-wide/16 p1, -0x1

    .line 104
    .line 105
    return-wide p1
.end method

.method private final zzi()V
    .locals 11

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzm:J

    .line 2
    .line 3
    const-wide/32 v2, 0xf4240

    .line 4
    .line 5
    .line 6
    mul-long/2addr v0, v2

    .line 7
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 8
    .line 9
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 10
    .line 11
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzafh;->zze:I

    .line 12
    .line 13
    int-to-long v2, v2

    .line 14
    div-long v5, v0, v2

    .line 15
    .line 16
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzahg;->zze:Lcom/google/android/gms/internal/ads/zzagh;

    .line 17
    .line 18
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzl:I

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v7, 0x1

    .line 23
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzafe;->zza(Lcom/google/android/gms/internal/ads/zzaev;Z)Lcom/google/android/gms/internal/ads/zzap;

    .line 3
    .line 4
    .line 5
    new-instance v1, Lcom/google/android/gms/internal/ads/zzer;

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast p1, Lcom/google/android/gms/internal/ads/zzael;

    .line 16
    .line 17
    invoke-virtual {p1, v3, v0, v2, v0}, Lcom/google/android/gms/internal/ads/zzael;->zzh([BIIZ)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    const-wide/32 v3, 0x664c6143

    .line 25
    .line 26
    .line 27
    cmp-long p1, v1, v3

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :cond_0
    return v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzd:Lcom/google/android/gms/internal/ads/zzaex;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzahg;->zze:Lcom/google/android/gms/internal/ads/zzagh;

    .line 10
    .line 11
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_13

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    if-eq v2, v3, :cond_12

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x3

    .line 16
    const/4 v8, 0x4

    .line 17
    if-eq v2, v5, :cond_10

    .line 18
    .line 19
    if-eq v2, v7, :cond_e

    .line 20
    .line 21
    const-wide/16 v9, -0x1

    .line 22
    .line 23
    if-eq v2, v8, :cond_a

    .line 24
    .line 25
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zze:Lcom/google/android/gms/internal/ads/zzagh;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzk:Lcom/google/android/gms/internal/ads/zzahe;

    .line 36
    .line 37
    if-eqz v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzaeg;->zzc()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    move-object/from16 v6, p2

    .line 46
    .line 47
    invoke-virtual {v5, v1, v6}, Lcom/google/android/gms/internal/ads/zzaeg;->zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    return v1

    .line 52
    :cond_0
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzm:J

    .line 53
    .line 54
    cmp-long v5, v5, v9

    .line 55
    .line 56
    if-nez v5, :cond_1

    .line 57
    .line 58
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzafc;->zzb(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafh;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v1

    .line 62
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzm:J

    .line 63
    .line 64
    return v4

    .line 65
    :cond_1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    .line 66
    .line 67
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    const v6, 0x8000

    .line 72
    .line 73
    .line 74
    if-ge v5, v6, :cond_4

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    sub-int/2addr v6, v5

    .line 81
    invoke-interface {v1, v7, v5, v6}, Lcom/google/android/gms/internal/ads/zzaev;->zza([BII)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/4 v6, -0x1

    .line 86
    if-ne v1, v6, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    move v3, v4

    .line 90
    :goto_0
    if-nez v3, :cond_3

    .line 91
    .line 92
    add-int/2addr v5, v1

    .line 93
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzi()V

    .line 104
    .line 105
    .line 106
    return v6

    .line 107
    :cond_4
    move v3, v4

    .line 108
    :cond_5
    :goto_1
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzl:I

    .line 113
    .line 114
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzi:I

    .line 115
    .line 116
    if-ge v5, v6, :cond_6

    .line 117
    .line 118
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    sub-int/2addr v6, v5

    .line 123
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 128
    .line 129
    .line 130
    :cond_6
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzahg;->zzh(Lcom/google/android/gms/internal/ads/zzer;Z)J

    .line 131
    .line 132
    .line 133
    move-result-wide v5

    .line 134
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sub-int/2addr v3, v1

    .line 139
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zze:Lcom/google/android/gms/internal/ads/zzagh;

    .line 143
    .line 144
    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 145
    .line 146
    .line 147
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzl:I

    .line 148
    .line 149
    add-int/2addr v1, v3

    .line 150
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzl:I

    .line 151
    .line 152
    cmp-long v1, v5, v9

    .line 153
    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzahg;->zzi()V

    .line 157
    .line 158
    .line 159
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzl:I

    .line 160
    .line 161
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzm:J

    .line 162
    .line 163
    :cond_7
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    array-length v1, v1

    .line 168
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    sub-int/2addr v1, v3

    .line 173
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/16 v5, 0x10

    .line 178
    .line 179
    if-ge v3, v5, :cond_9

    .line 180
    .line 181
    if-lt v1, v5, :cond_8

    .line 182
    .line 183
    return v4

    .line 184
    :cond_8
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-static {v3, v5, v6, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 207
    .line 208
    .line 209
    :cond_9
    return v4

    .line 210
    :cond_a
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 211
    .line 212
    .line 213
    new-instance v2, Lcom/google/android/gms/internal/ads/zzer;

    .line 214
    .line 215
    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-interface {v1, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    shr-int/lit8 v3, v2, 0x2

    .line 230
    .line 231
    const/16 v5, 0x3ffe

    .line 232
    .line 233
    if-ne v3, v5, :cond_d

    .line 234
    .line 235
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 236
    .line 237
    .line 238
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzj:I

    .line 239
    .line 240
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzd:Lcom/google/android/gms/internal/ads/zzaex;

    .line 241
    .line 242
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 243
    .line 244
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 245
    .line 246
    .line 247
    move-result-wide v14

    .line 248
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    .line 249
    .line 250
    .line 251
    move-result-wide v16

    .line 252
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 253
    .line 254
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object v1, v12, Lcom/google/android/gms/internal/ads/zzafh;->zzk:Lcom/google/android/gms/internal/ads/zzafg;

    .line 258
    .line 259
    if-eqz v1, :cond_b

    .line 260
    .line 261
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzafg;->zza:[J

    .line 262
    .line 263
    array-length v1, v1

    .line 264
    if-lez v1, :cond_b

    .line 265
    .line 266
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaff;

    .line 267
    .line 268
    invoke-direct {v1, v12, v14, v15}, Lcom/google/android/gms/internal/ads/zzaff;-><init>(Lcom/google/android/gms/internal/ads/zzafh;J)V

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_b
    cmp-long v1, v16, v9

    .line 273
    .line 274
    const-wide/16 v5, 0x0

    .line 275
    .line 276
    if-eqz v1, :cond_c

    .line 277
    .line 278
    iget-wide v7, v12, Lcom/google/android/gms/internal/ads/zzafh;->zzj:J

    .line 279
    .line 280
    cmp-long v1, v7, v5

    .line 281
    .line 282
    if-lez v1, :cond_c

    .line 283
    .line 284
    new-instance v11, Lcom/google/android/gms/internal/ads/zzahe;

    .line 285
    .line 286
    iget v13, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzj:I

    .line 287
    .line 288
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(Lcom/google/android/gms/internal/ads/zzafh;IJJ)V

    .line 289
    .line 290
    .line 291
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzk:Lcom/google/android/gms/internal/ads/zzahe;

    .line 292
    .line 293
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzaeg;->zza()Lcom/google/android/gms/internal/ads/zzafy;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    goto :goto_2

    .line 298
    :cond_c
    new-instance v1, Lcom/google/android/gms/internal/ads/zzafx;

    .line 299
    .line 300
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzafh;->zza()J

    .line 301
    .line 302
    .line 303
    move-result-wide v7

    .line 304
    invoke-direct {v1, v7, v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    .line 305
    .line 306
    .line 307
    :goto_2
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 308
    .line 309
    .line 310
    const/4 v1, 0x5

    .line 311
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 312
    .line 313
    return v4

    .line 314
    :cond_d
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 315
    .line 316
    .line 317
    const-string v1, "First frame does not start with sync code."

    .line 318
    .line 319
    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    throw v1

    .line 324
    :cond_e
    new-instance v2, Lcom/google/android/gms/internal/ads/zzafd;

    .line 325
    .line 326
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 327
    .line 328
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzafd;-><init>(Lcom/google/android/gms/internal/ads/zzafh;)V

    .line 329
    .line 330
    .line 331
    :cond_f
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzafe;->zzb(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafd;)Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzafd;->zza:Lcom/google/android/gms/internal/ads/zzafh;

    .line 336
    .line 337
    sget-object v6, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 338
    .line 339
    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 340
    .line 341
    if-eqz v3, :cond_f

    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget v1, v5, Lcom/google/android/gms/internal/ads/zzafh;->zzc:I

    .line 347
    .line 348
    const/4 v2, 0x6

    .line 349
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzi:I

    .line 354
    .line 355
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 356
    .line 357
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zza:[B

    .line 358
    .line 359
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzg:Lcom/google/android/gms/internal/ads/zzap;

    .line 360
    .line 361
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzafh;->zzc([BLcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzv;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zze:Lcom/google/android/gms/internal/ads/zzagh;

    .line 366
    .line 367
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v3, "audio/flac"

    .line 372
    .line 373
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 381
    .line 382
    .line 383
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahg;->zze:Lcom/google/android/gms/internal/ads/zzagh;

    .line 384
    .line 385
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzh:Lcom/google/android/gms/internal/ads/zzafh;

    .line 386
    .line 387
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzafh;->zza()J

    .line 388
    .line 389
    .line 390
    move-result-wide v2

    .line 391
    invoke-interface {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzagh;->zzN(J)V

    .line 392
    .line 393
    .line 394
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 395
    .line 396
    return v4

    .line 397
    :cond_10
    new-instance v2, Lcom/google/android/gms/internal/ads/zzer;

    .line 398
    .line 399
    invoke-direct {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-interface {v1, v3, v4, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 410
    .line 411
    .line 412
    move-result-wide v1

    .line 413
    const-wide/32 v8, 0x664c6143

    .line 414
    .line 415
    .line 416
    cmp-long v1, v1, v8

    .line 417
    .line 418
    if-nez v1, :cond_11

    .line 419
    .line 420
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 421
    .line 422
    return v4

    .line 423
    :cond_11
    const-string v1, "Failed to read FLAC stream marker."

    .line 424
    .line 425
    invoke-static {v1, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    throw v1

    .line 430
    :cond_12
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zza:[B

    .line 431
    .line 432
    const/16 v3, 0x2a

    .line 433
    .line 434
    invoke-interface {v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 438
    .line 439
    .line 440
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 441
    .line 442
    return v4

    .line 443
    :cond_13
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 444
    .line 445
    .line 446
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    .line 447
    .line 448
    .line 449
    move-result-wide v5

    .line 450
    invoke-static {v1, v3}, Lcom/google/android/gms/internal/ads/zzafe;->zza(Lcom/google/android/gms/internal/ads/zzaev;Z)Lcom/google/android/gms/internal/ads/zzap;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    .line 455
    .line 456
    .line 457
    move-result-wide v7

    .line 458
    sub-long/2addr v7, v5

    .line 459
    long-to-int v5, v7

    .line 460
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 461
    .line 462
    .line 463
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzg:Lcom/google/android/gms/internal/ads/zzap;

    .line 464
    .line 465
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 466
    .line 467
    return v4
.end method

.method public final zze(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzf:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzk:Lcom/google/android/gms/internal/ads/zzahe;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzaeg;->zzb(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzm:J

    .line 26
    .line 27
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzl:I

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzahg;->zzb:Lcom/google/android/gms/internal/ads/zzer;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method
