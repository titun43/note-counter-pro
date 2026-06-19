.class public final Lcom/google/android/gms/internal/ads/zzaow;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaon;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzapq;

.field private zzb:Ljava/lang/String;

.field private zzc:Lcom/google/android/gms/internal/ads/zzagh;

.field private zzd:Lcom/google/android/gms/internal/ads/zzaov;

.field private zze:Z

.field private final zzf:[Z

.field private final zzg:Lcom/google/android/gms/internal/ads/zzape;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzape;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzape;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzape;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzape;

.field private zzl:J

.field private zzm:J

.field private final zzn:Lcom/google/android/gms/internal/ads/zzer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzapq;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzf:[Z

    .line 10
    .line 11
    new-instance p1, Lcom/google/android/gms/internal/ads/zzape;

    .line 12
    .line 13
    const/16 p2, 0x20

    .line 14
    .line 15
    const/16 v0, 0x80

    .line 16
    .line 17
    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzape;-><init>(II)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzg:Lcom/google/android/gms/internal/ads/zzape;

    .line 21
    .line 22
    new-instance p1, Lcom/google/android/gms/internal/ads/zzape;

    .line 23
    .line 24
    const/16 p2, 0x21

    .line 25
    .line 26
    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzape;-><init>(II)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzh:Lcom/google/android/gms/internal/ads/zzape;

    .line 30
    .line 31
    new-instance p1, Lcom/google/android/gms/internal/ads/zzape;

    .line 32
    .line 33
    const/16 p2, 0x22

    .line 34
    .line 35
    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzape;-><init>(II)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzi:Lcom/google/android/gms/internal/ads/zzape;

    .line 39
    .line 40
    new-instance p1, Lcom/google/android/gms/internal/ads/zzape;

    .line 41
    .line 42
    const/16 p2, 0x27

    .line 43
    .line 44
    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzape;-><init>(II)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzj:Lcom/google/android/gms/internal/ads/zzape;

    .line 48
    .line 49
    new-instance p1, Lcom/google/android/gms/internal/ads/zzape;

    .line 50
    .line 51
    const/16 p2, 0x28

    .line 52
    .line 53
    invoke-direct {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzape;-><init>(II)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzk:Lcom/google/android/gms/internal/ads/zzape;

    .line 57
    .line 58
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    .line 64
    .line 65
    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 66
    .line 67
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    .line 71
    .line 72
    return-void
.end method

.method private final zzf(JIIJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzd:Lcom/google/android/gms/internal/ads/zzaov;

    .line 2
    .line 3
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzaow;->zze:Z

    .line 4
    .line 5
    move-wide v1, p1

    .line 6
    move v3, p3

    .line 7
    move v4, p4

    .line 8
    move-wide v5, p5

    .line 9
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzaov;->zzb(JIIJZ)V

    .line 10
    .line 11
    .line 12
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zze:Z

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzg:Lcom/google/android/gms/internal/ads/zzape;

    .line 17
    .line 18
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzape;->zzc(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzh:Lcom/google/android/gms/internal/ads/zzape;

    .line 22
    .line 23
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzape;->zzc(I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzi:Lcom/google/android/gms/internal/ads/zzape;

    .line 27
    .line 28
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzape;->zzc(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzj:Lcom/google/android/gms/internal/ads/zzape;

    .line 32
    .line 33
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzape;->zzc(I)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzk:Lcom/google/android/gms/internal/ads/zzape;

    .line 37
    .line 38
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzape;->zzc(I)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private final zzg([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzd:Lcom/google/android/gms/internal/ads/zzaov;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzaov;->zzc([BII)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zze:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzg:Lcom/google/android/gms/internal/ads/zzape;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzape;->zzd([BII)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzh:Lcom/google/android/gms/internal/ads/zzape;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzape;->zzd([BII)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzi:Lcom/google/android/gms/internal/ads/zzape;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzape;->zzd([BII)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzj:Lcom/google/android/gms/internal/ads/zzape;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzape;->zzd([BII)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzk:Lcom/google/android/gms/internal/ads/zzape;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzape;->zzd([BII)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private final zzh(JIIJ)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    move-wide/from16 v2, p5

    .line 6
    .line 7
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzd:Lcom/google/android/gms/internal/ads/zzaov;

    .line 8
    .line 9
    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzaow;->zze:Z

    .line 10
    .line 11
    move-wide/from16 v6, p1

    .line 12
    .line 13
    move/from16 v8, p3

    .line 14
    .line 15
    invoke-virtual {v4, v6, v7, v8, v5}, Lcom/google/android/gms/internal/ads/zzaov;->zzd(JIZ)V

    .line 16
    .line 17
    .line 18
    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzaow;->zze:Z

    .line 19
    .line 20
    if-nez v4, :cond_2

    .line 21
    .line 22
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzg:Lcom/google/android/gms/internal/ads/zzape;

    .line 23
    .line 24
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzape;->zze(I)Z

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzh:Lcom/google/android/gms/internal/ads/zzape;

    .line 28
    .line 29
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzape;->zze(I)Z

    .line 30
    .line 31
    .line 32
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzi:Lcom/google/android/gms/internal/ads/zzape;

    .line 33
    .line 34
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzape;->zze(I)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzape;->zzb()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzape;->zzb()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzape;->zzb()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_2

    .line 54
    .line 55
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzb:Ljava/lang/String;

    .line 56
    .line 57
    iget v8, v4, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 58
    .line 59
    iget v9, v5, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 60
    .line 61
    add-int/2addr v9, v8

    .line 62
    iget v10, v6, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 63
    .line 64
    add-int/2addr v9, v10

    .line 65
    new-array v9, v9, [B

    .line 66
    .line 67
    iget-object v10, v4, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    invoke-static {v10, v11, v9, v11, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    .line 72
    .line 73
    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 74
    .line 75
    iget v10, v4, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 76
    .line 77
    iget v12, v5, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 78
    .line 79
    invoke-static {v8, v11, v9, v10, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 80
    .line 81
    .line 82
    iget-object v8, v6, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 83
    .line 84
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 85
    .line 86
    iget v10, v5, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 87
    .line 88
    add-int/2addr v4, v10

    .line 89
    iget v6, v6, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 90
    .line 91
    invoke-static {v8, v11, v9, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    iget-object v4, v5, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 95
    .line 96
    const/4 v6, 0x3

    .line 97
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 98
    .line 99
    const/4 v8, 0x0

    .line 100
    invoke-static {v4, v6, v5, v8}, Lcom/google/android/gms/internal/ads/zzgm;->zzg([BIILcom/google/android/gms/internal/ads/zzgj;)Lcom/google/android/gms/internal/ads/zzgg;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzb:Lcom/google/android/gms/internal/ads/zzgb;

    .line 105
    .line 106
    if-eqz v5, :cond_0

    .line 107
    .line 108
    iget v6, v5, Lcom/google/android/gms/internal/ads/zzgb;->zzf:I

    .line 109
    .line 110
    iget-object v8, v5, Lcom/google/android/gms/internal/ads/zzgb;->zze:[I

    .line 111
    .line 112
    iget v15, v5, Lcom/google/android/gms/internal/ads/zzgb;->zzd:I

    .line 113
    .line 114
    iget v14, v5, Lcom/google/android/gms/internal/ads/zzgb;->zzc:I

    .line 115
    .line 116
    iget-boolean v13, v5, Lcom/google/android/gms/internal/ads/zzgb;->zzb:Z

    .line 117
    .line 118
    iget v12, v5, Lcom/google/android/gms/internal/ads/zzgb;->zza:I

    .line 119
    .line 120
    move/from16 v17, v6

    .line 121
    .line 122
    move-object/from16 v16, v8

    .line 123
    .line 124
    invoke-static/range {v12 .. v17}, Lcom/google/android/gms/internal/ads/zzdo;->zzb(IZII[II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    :cond_0
    new-instance v5, Lcom/google/android/gms/internal/ads/zzt;

    .line 129
    .line 130
    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 134
    .line 135
    .line 136
    const-string v6, "video/mp2t"

    .line 137
    .line 138
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 139
    .line 140
    .line 141
    const-string v6, "video/hevc"

    .line 142
    .line 143
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzj(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 147
    .line 148
    .line 149
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgg;->zze:I

    .line 150
    .line 151
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzt(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 152
    .line 153
    .line 154
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzf:I

    .line 155
    .line 156
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzu(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 157
    .line 158
    .line 159
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzg:I

    .line 160
    .line 161
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzv(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 162
    .line 163
    .line 164
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzh:I

    .line 165
    .line 166
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzw(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 167
    .line 168
    .line 169
    new-instance v6, Lcom/google/android/gms/internal/ads/zzh;

    .line 170
    .line 171
    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzh;-><init>()V

    .line 172
    .line 173
    .line 174
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzk:I

    .line 175
    .line 176
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzh;->zza(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 177
    .line 178
    .line 179
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzl:I

    .line 180
    .line 181
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzh;->zzb(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 182
    .line 183
    .line 184
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzm:I

    .line 185
    .line 186
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzh;->zzc(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 187
    .line 188
    .line 189
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzc:I

    .line 190
    .line 191
    add-int/lit8 v7, v7, 0x8

    .line 192
    .line 193
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzh;->zze(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 194
    .line 195
    .line 196
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzd:I

    .line 197
    .line 198
    add-int/lit8 v7, v7, 0x8

    .line 199
    .line 200
    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/zzh;->zzf(I)Lcom/google/android/gms/internal/ads/zzh;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzh;->zzg()Lcom/google/android/gms/internal/ads/zzi;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzC(Lcom/google/android/gms/internal/ads/zzi;)Lcom/google/android/gms/internal/ads/zzt;

    .line 208
    .line 209
    .line 210
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzi:F

    .line 211
    .line 212
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzz(F)Lcom/google/android/gms/internal/ads/zzt;

    .line 213
    .line 214
    .line 215
    iget v6, v4, Lcom/google/android/gms/internal/ads/zzgg;->zzj:I

    .line 216
    .line 217
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzo(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 218
    .line 219
    .line 220
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzgg;->zza:I

    .line 221
    .line 222
    const/4 v6, 0x1

    .line 223
    add-int/2addr v4, v6

    .line 224
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzD(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 225
    .line 226
    .line 227
    invoke-static {v9}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzp(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 239
    .line 240
    invoke-interface {v5, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 241
    .line 242
    .line 243
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzv;->zzq:I

    .line 244
    .line 245
    const/4 v5, -0x1

    .line 246
    if-eq v4, v5, :cond_1

    .line 247
    .line 248
    move v11, v6

    .line 249
    :cond_1
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 253
    .line 254
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzapq;->zzb(I)V

    .line 255
    .line 256
    .line 257
    iput-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzaow;->zze:Z

    .line 258
    .line 259
    :cond_2
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzj:Lcom/google/android/gms/internal/ads/zzape;

    .line 260
    .line 261
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzape;->zze(I)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    const/4 v6, 0x5

    .line 266
    if-eqz v5, :cond_3

    .line 267
    .line 268
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 269
    .line 270
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 271
    .line 272
    invoke-static {v5, v7}, Lcom/google/android/gms/internal/ads/zzgm;->zza([BI)I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    .line 277
    .line 278
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 279
    .line 280
    invoke-virtual {v7, v4, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 284
    .line 285
    .line 286
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 287
    .line 288
    invoke-virtual {v4, v2, v3, v7}, Lcom/google/android/gms/internal/ads/zzapq;->zzc(JLcom/google/android/gms/internal/ads/zzer;)V

    .line 289
    .line 290
    .line 291
    :cond_3
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzk:Lcom/google/android/gms/internal/ads/zzape;

    .line 292
    .line 293
    invoke-virtual {v4, v1}, Lcom/google/android/gms/internal/ads/zzape;->zze(I)Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_4

    .line 298
    .line 299
    iget-object v1, v4, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 300
    .line 301
    iget v5, v4, Lcom/google/android/gms/internal/ads/zzape;->zzb:I

    .line 302
    .line 303
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/ads/zzgm;->zza([BI)I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    .line 308
    .line 309
    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzape;->zza:[B

    .line 310
    .line 311
    invoke-virtual {v5, v4, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 315
    .line 316
    .line 317
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 318
    .line 319
    invoke-virtual {v1, v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzapq;->zzc(JLcom/google/android/gms/internal/ads/zzer;)V

    .line 320
    .line 321
    .line 322
    :cond_4
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzl:J

    .line 4
    .line 5
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzf:[Z

    .line 13
    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgm;->zzj([Z)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzg:Lcom/google/android/gms/internal/ads/zzape;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzape;->zza()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzh:Lcom/google/android/gms/internal/ads/zzape;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzape;->zza()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzi:Lcom/google/android/gms/internal/ads/zzape;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzape;->zza()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzj:Lcom/google/android/gms/internal/ads/zzape;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzape;->zza()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzk:Lcom/google/android/gms/internal/ads/zzape;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzape;->zza()V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzapq;->zze()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzd:Lcom/google/android/gms/internal/ads/zzaov;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaov;->zza()V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzaqb;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaqb;->zza()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaqb;->zzc()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzb:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaqb;->zzb()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaov;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzaov;-><init>(Lcom/google/android/gms/internal/ads/zzagh;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzd:Lcom/google/android/gms/internal/ads/zzaov;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzapq;->zza(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzaqb;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final zzc(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzer;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_5

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzl:J

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    int-to-long v5, v5

    .line 33
    add-long/2addr v3, v5

    .line 34
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzl:J

    .line 35
    .line 36
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-interface {v3, p1, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 43
    .line 44
    .line 45
    :goto_1
    if-ge v0, v1, :cond_4

    .line 46
    .line 47
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzf:[Z

    .line 48
    .line 49
    invoke-static {v2, v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzgm;->zzi([BII[Z)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eq v3, v1, :cond_3

    .line 54
    .line 55
    add-int/lit8 v4, v3, 0x3

    .line 56
    .line 57
    aget-byte v4, v2, v4

    .line 58
    .line 59
    and-int/lit8 v4, v4, 0x7e

    .line 60
    .line 61
    const/4 v5, 0x3

    .line 62
    if-lez v3, :cond_0

    .line 63
    .line 64
    add-int/lit8 v6, v3, -0x1

    .line 65
    .line 66
    aget-byte v7, v2, v6

    .line 67
    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    const/4 v5, 0x4

    .line 71
    move v3, v6

    .line 72
    :cond_0
    sub-int v6, v3, v0

    .line 73
    .line 74
    if-lez v6, :cond_1

    .line 75
    .line 76
    invoke-direct {p0, v2, v0, v3}, Lcom/google/android/gms/internal/ads/zzaow;->zzg([BII)V

    .line 77
    .line 78
    .line 79
    :cond_1
    sub-int v10, v1, v3

    .line 80
    .line 81
    iget-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzl:J

    .line 82
    .line 83
    int-to-long v11, v10

    .line 84
    sub-long v8, v7, v11

    .line 85
    .line 86
    if-gez v6, :cond_2

    .line 87
    .line 88
    neg-int v0, v6

    .line 89
    :goto_2
    move v11, v0

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    const/4 v0, 0x0

    .line 92
    goto :goto_2

    .line 93
    :goto_3
    shr-int/lit8 v0, v4, 0x1

    .line 94
    .line 95
    iget-wide v12, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    .line 96
    .line 97
    move-object v7, p0

    .line 98
    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzaow;->zzh(JIIJ)V

    .line 99
    .line 100
    .line 101
    iget-wide v12, v7, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    .line 102
    .line 103
    move v11, v0

    .line 104
    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzaow;->zzf(JIIJ)V

    .line 105
    .line 106
    .line 107
    add-int v0, v3, v5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    move-object v7, p0

    .line 111
    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzaow;->zzg([BII)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    move-object v7, p0

    .line 116
    goto :goto_0

    .line 117
    :cond_5
    move-object v7, p0

    .line 118
    return-void
.end method

.method public final zze(Z)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzc:Lcom/google/android/gms/internal/ads/zzagh;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zza:Lcom/google/android/gms/internal/ads/zzapq;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzapq;->zzd()V

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzl:J

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzaow;->zzh(JIIJ)V

    .line 23
    .line 24
    .line 25
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzl:J

    .line 26
    .line 27
    const/16 v11, 0x30

    .line 28
    .line 29
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzaow;->zzm:J

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    move-object v7, v0

    .line 33
    invoke-direct/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzaow;->zzf(JIIJ)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
