.class public final Lcom/google/android/gms/internal/ads/zzaok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqa;


# instance fields
.field private final zza:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzaok;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaok;->zza:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaok;->zza:Ljava/util/List;

    return-void
.end method

.method private final zzc(Lcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzapq;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapq;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaok;->zze(Lcom/google/android/gms/internal/ads/zzapz;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "video/mp2t"

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzapq;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private final zzd(Lcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzaqf;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaqf;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaok;->zze(Lcom/google/android/gms/internal/ads/zzapz;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v1, "video/mp2t"

    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzaqf;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private final zze(Lcom/google/android/gms/internal/ads/zzapz;)Ljava/util/List;
    .locals 11

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzapz;->zze:[B

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaok;->zza:Ljava/util/List;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-lez v1, :cond_5

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    add-int/2addr v3, v2

    .line 29
    const/16 v2, 0x86

    .line 30
    .line 31
    if-ne v1, v2, :cond_4

    .line 32
    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    and-int/lit8 v1, v1, 0x1f

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    move v4, v2

    .line 46
    :goto_1
    if-ge v4, v1, :cond_4

    .line 47
    .line 48
    const/4 v5, 0x3

    .line 49
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 50
    .line 51
    invoke-virtual {v0, v5, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzK(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    and-int/lit16 v7, v6, 0x80

    .line 60
    .line 61
    const/4 v8, 0x1

    .line 62
    if-eqz v7, :cond_0

    .line 63
    .line 64
    move v7, v8

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    move v7, v2

    .line 67
    :goto_2
    if-eqz v7, :cond_1

    .line 68
    .line 69
    and-int/lit8 v6, v6, 0x3f

    .line 70
    .line 71
    const-string v9, "application/cea-708"

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_1
    const-string v9, "application/cea-608"

    .line 75
    .line 76
    move v6, v8

    .line 77
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    int-to-byte v10, v10

    .line 82
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 83
    .line 84
    .line 85
    if-eqz v7, :cond_3

    .line 86
    .line 87
    and-int/lit8 v7, v10, 0x40

    .line 88
    .line 89
    sget v10, Lcom/google/android/gms/internal/ads/zzdo;->zza:I

    .line 90
    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    new-array v7, v8, [B

    .line 94
    .line 95
    aput-byte v8, v7, v2

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_2
    new-array v7, v8, [B

    .line 99
    .line 100
    aput-byte v2, v7, v2

    .line 101
    .line 102
    :goto_4
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    goto :goto_5

    .line 107
    :cond_3
    const/4 v7, 0x0

    .line 108
    :goto_5
    new-instance v8, Lcom/google/android/gms/internal/ads/zzt;

    .line 109
    .line 110
    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzt;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzt;->zzJ(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzp(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    add-int/lit8 v4, v4, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_0

    .line 139
    .line 140
    :cond_5
    return-object p1
.end method


# virtual methods
.method public final zza()Landroid/util/SparseArray;
    .locals 1

    .line 1
    new-instance v0, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final zzb(ILcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzaqc;
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const-string v1, "video/mp2t"

    .line 3
    .line 4
    if-eq p1, v0, :cond_b

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    if-eq p1, v0, :cond_a

    .line 11
    .line 12
    const/16 v0, 0x15

    .line 13
    .line 14
    if-eq p1, v0, :cond_9

    .line 15
    .line 16
    const/16 v0, 0x1b

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eq p1, v0, :cond_8

    .line 20
    .line 21
    const/16 v0, 0x24

    .line 22
    .line 23
    if-eq p1, v0, :cond_7

    .line 24
    .line 25
    const/16 v0, 0x2d

    .line 26
    .line 27
    if-eq p1, v0, :cond_6

    .line 28
    .line 29
    const/16 v0, 0x59

    .line 30
    .line 31
    if-eq p1, v0, :cond_5

    .line 32
    .line 33
    const/16 v0, 0xac

    .line 34
    .line 35
    if-eq p1, v0, :cond_4

    .line 36
    .line 37
    const/16 v0, 0x101

    .line 38
    .line 39
    if-eq p1, v0, :cond_3

    .line 40
    .line 41
    const/16 v0, 0x80

    .line 42
    .line 43
    if-eq p1, v0, :cond_b

    .line 44
    .line 45
    const/16 v0, 0x81

    .line 46
    .line 47
    if-eq p1, v0, :cond_2

    .line 48
    .line 49
    const/16 v0, 0x8a

    .line 50
    .line 51
    if-eq p1, v0, :cond_1

    .line 52
    .line 53
    const/16 v0, 0x8b

    .line 54
    .line 55
    if-eq p1, v0, :cond_0

    .line 56
    .line 57
    packed-switch p1, :pswitch_data_0

    .line 58
    .line 59
    .line 60
    packed-switch p1, :pswitch_data_1

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    return-object p1

    .line 65
    :pswitch_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapo;

    .line 66
    .line 67
    new-instance p2, Lcom/google/android/gms/internal/ads/zzapf;

    .line 68
    .line 69
    const-string v0, "application/x-scte35"

    .line 70
    .line 71
    invoke-direct {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzapf;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzapo;-><init>(Lcom/google/android/gms/internal/ads/zzapn;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_1
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 79
    .line 80
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 81
    .line 82
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaoy;

    .line 83
    .line 84
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-direct {v2, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzaoy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapg;

    .line 96
    .line 97
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaos;

    .line 98
    .line 99
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzaok;->zzd(Lcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzaqf;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/ads/zzaos;-><init>(Lcom/google/android/gms/internal/ads/zzaqf;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_3
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 113
    .line 114
    new-instance v3, Lcom/google/android/gms/internal/ads/zzaoj;

    .line 115
    .line 116
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    invoke-direct {v3, v2, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>(ZLjava/lang/String;ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :cond_0
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 128
    .line 129
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 130
    .line 131
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaol;

    .line 132
    .line 133
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    const/16 v3, 0x1520

    .line 138
    .line 139
    invoke-direct {v2, p1, p2, v3, v1}, Lcom/google/android/gms/internal/ads/zzaol;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 143
    .line 144
    .line 145
    return-object v0

    .line 146
    :cond_1
    :pswitch_4
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 147
    .line 148
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 149
    .line 150
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaol;

    .line 151
    .line 152
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    const/16 v3, 0x1000

    .line 157
    .line 158
    invoke-direct {v2, p1, p2, v3, v1}, Lcom/google/android/gms/internal/ads/zzaol;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_2
    :pswitch_5
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 166
    .line 167
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 168
    .line 169
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaod;

    .line 170
    .line 171
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    invoke-direct {v2, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzaod;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapo;

    .line 183
    .line 184
    new-instance p2, Lcom/google/android/gms/internal/ads/zzapf;

    .line 185
    .line 186
    const-string v0, "application/vnd.dvb.ait"

    .line 187
    .line 188
    invoke-direct {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzapf;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzapo;-><init>(Lcom/google/android/gms/internal/ads/zzapn;)V

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :cond_4
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 196
    .line 197
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 198
    .line 199
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaog;

    .line 200
    .line 201
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    invoke-direct {v2, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzaog;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :cond_5
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzd:Ljava/util/List;

    .line 213
    .line 214
    new-instance p2, Lcom/google/android/gms/internal/ads/zzapg;

    .line 215
    .line 216
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaom;

    .line 217
    .line 218
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzaom;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 222
    .line 223
    .line 224
    return-object p2

    .line 225
    :cond_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapg;

    .line 226
    .line 227
    new-instance p2, Lcom/google/android/gms/internal/ads/zzapa;

    .line 228
    .line 229
    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/zzapa;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 233
    .line 234
    .line 235
    return-object p1

    .line 236
    :cond_7
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapg;

    .line 237
    .line 238
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaow;

    .line 239
    .line 240
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzaok;->zzc(Lcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzapq;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/ads/zzaow;-><init>(Lcom/google/android/gms/internal/ads/zzapq;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 248
    .line 249
    .line 250
    return-object p1

    .line 251
    :cond_8
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapg;

    .line 252
    .line 253
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaou;

    .line 254
    .line 255
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzaok;->zzc(Lcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzapq;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-direct {v0, p2, v2, v2, v1}, Lcom/google/android/gms/internal/ads/zzaou;-><init>(Lcom/google/android/gms/internal/ads/zzapq;ZZLjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 263
    .line 264
    .line 265
    return-object p1

    .line 266
    :cond_9
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapg;

    .line 267
    .line 268
    new-instance p2, Lcom/google/android/gms/internal/ads/zzaox;

    .line 269
    .line 270
    invoke-direct {p2, v1}, Lcom/google/android/gms/internal/ads/zzaox;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 274
    .line 275
    .line 276
    return-object p1

    .line 277
    :cond_a
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzapz;->zzb:Ljava/lang/String;

    .line 278
    .line 279
    new-instance v0, Lcom/google/android/gms/internal/ads/zzapg;

    .line 280
    .line 281
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaoz;

    .line 282
    .line 283
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzapz;->zza()I

    .line 284
    .line 285
    .line 286
    move-result p2

    .line 287
    invoke-direct {v2, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzaoz;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_b
    new-instance p1, Lcom/google/android/gms/internal/ads/zzapg;

    .line 295
    .line 296
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaop;

    .line 297
    .line 298
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/zzaok;->zzd(Lcom/google/android/gms/internal/ads/zzapz;)Lcom/google/android/gms/internal/ads/zzaqf;

    .line 299
    .line 300
    .line 301
    move-result-object p2

    .line 302
    invoke-direct {v0, p2, v1}, Lcom/google/android/gms/internal/ads/zzaop;-><init>(Lcom/google/android/gms/internal/ads/zzaqf;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzapg;-><init>(Lcom/google/android/gms/internal/ads/zzaon;)V

    .line 306
    .line 307
    .line 308
    return-object p1

    .line 309
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    :pswitch_data_1
    .packed-switch 0x86
        :pswitch_0
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
