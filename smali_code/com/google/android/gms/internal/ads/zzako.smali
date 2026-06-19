.class public final Lcom/google/android/gms/internal/ads/zzako;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# static fields
.field private static final zza:[B

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzv;


# instance fields
.field private zzA:J

.field private zzB:J

.field private zzC:Lcom/google/android/gms/internal/ads/zzakn;

.field private zzD:I

.field private zzE:I

.field private zzF:I

.field private zzG:Z

.field private zzH:Z

.field private zzI:Lcom/google/android/gms/internal/ads/zzaex;

.field private zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

.field private zzK:[Lcom/google/android/gms/internal/ads/zzagh;

.field private zzL:Z

.field private zzM:J

.field private final zzc:Lcom/google/android/gms/internal/ads/zzamd;

.field private final zzd:I

.field private final zze:Ljava/util/List;

.field private final zzf:Landroid/util/SparseArray;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzj:[B

.field private final zzk:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzl:Lcom/google/android/gms/internal/ads/zzahz;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzn:Ljava/util/ArrayDeque;

.field private final zzo:Ljava/util/ArrayDeque;

.field private final zzp:Lcom/google/android/gms/internal/ads/zzgq;

.field private final zzq:Lcom/google/android/gms/internal/ads/zzaej;

.field private zzr:Lcom/google/android/gms/internal/ads/zzguf;

.field private zzs:I

.field private zzt:I

.field private zzu:J

.field private zzv:I

.field private zzw:Lcom/google/android/gms/internal/ads/zzer;

.field private zzx:J

.field private zzy:I

.field private zzz:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/internal/ads/zzako;->zza:[B

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/internal/ads/zzt;

    .line 11
    .line 12
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/google/android/gms/internal/ads/zzako;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    .line 25
    .line 26
    return-void

    .line 27
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzamd;->zza:Lcom/google/android/gms/internal/ads/zzamd;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    .line 2
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzako;-><init>(Lcom/google/android/gms/internal/ads/zzamd;ILcom/google/android/gms/internal/ads/zzfg;Lcom/google/android/gms/internal/ads/zzalc;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzagh;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzamd;ILcom/google/android/gms/internal/ads/zzfg;Lcom/google/android/gms/internal/ads/zzalc;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzagh;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzc:Lcom/google/android/gms/internal/ads/zzamd;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzako;->zzd:I

    invoke-static {p5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zze:Ljava/util/List;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzahz;

    .line 4
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzahz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzl:Lcom/google/android/gms/internal/ads/zzahz;

    .line 5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 6
    sget-object p3, Lcom/google/android/gms/internal/ads/zzgm;->zza:[B

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzg:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/4 p3, 0x6

    .line 7
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzh:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 8
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzi:Lcom/google/android/gms/internal/ads/zzer;

    new-array p1, p2, [B

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzj:[B

    new-instance p2, Lcom/google/android/gms/internal/ads/zzer;

    .line 9
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzako;->zzk:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 10
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzn:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    .line 11
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzo:Ljava/util/ArrayDeque;

    new-instance p1, Landroid/util/SparseArray;

    .line 12
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    .line 13
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzr:Lcom/google/android/gms/internal/ads/zzguf;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzA:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzz:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzB:J

    sget-object p1, Lcom/google/android/gms/internal/ads/zzaex;->zza:Lcom/google/android/gms/internal/ads/zzaex;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/google/android/gms/internal/ads/zzagh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzagh;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzgq;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzakl;

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzakl;-><init>(Lcom/google/android/gms/internal/ads/zzako;)V

    .line 14
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzgq;-><init>(Lcom/google/android/gms/internal/ads/zzgp;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzp:Lcom/google/android/gms/internal/ads/zzgq;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaej;

    .line 15
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaej;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzq:Lcom/google/android/gms/internal/ads/zzaej;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzM:J

    return-void
.end method

.method private final zzi()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    return-void
.end method

.method private final zzj(J)V
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzn:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_52

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/google/android/gms/internal/ads/zzfu;

    .line 16
    .line 17
    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzfu;->zza:J

    .line 18
    .line 19
    cmp-long v2, v2, p1

    .line 20
    .line 21
    if-nez v2, :cond_52

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Lcom/google/android/gms/internal/ads/zzfu;

    .line 29
    .line 30
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 31
    .line 32
    const v4, 0x6d6f6f76

    .line 33
    .line 34
    .line 35
    const/16 v5, 0xc

    .line 36
    .line 37
    const/16 v10, 0x8

    .line 38
    .line 39
    const/4 v12, 0x1

    .line 40
    if-ne v2, v4, :cond_b

    .line 41
    .line 42
    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzfu;->zzb:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzako;->zzn(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzq;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const v2, 0x6d766578

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzd(I)Lcom/google/android/gms/internal/ads/zzfu;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v14, Landroid/util/SparseArray;

    .line 59
    .line 60
    invoke-direct {v14}, Landroid/util/SparseArray;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfu;->zzb:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v11, 0x0

    .line 70
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :goto_1
    if-ge v11, v4, :cond_4

    .line 76
    .line 77
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v17

    .line 81
    const/16 v18, 0x10

    .line 82
    .line 83
    move-object/from16 v8, v17

    .line 84
    .line 85
    check-cast v8, Lcom/google/android/gms/internal/ads/zzfv;

    .line 86
    .line 87
    iget v9, v8, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 88
    .line 89
    const/16 v19, 0x0

    .line 90
    .line 91
    const v13, 0x74726578

    .line 92
    .line 93
    .line 94
    if-ne v9, v13, :cond_1

    .line 95
    .line 96
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 97
    .line 98
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    add-int/lit8 v13, v13, -0x1

    .line 110
    .line 111
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    new-instance v9, Lcom/google/android/gms/internal/ads/zzaki;

    .line 128
    .line 129
    invoke-direct {v9, v13, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzaki;-><init>(IIII)V

    .line 130
    .line 131
    .line 132
    invoke-static {v8, v9}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v5, Lcom/google/android/gms/internal/ads/zzaki;

    .line 147
    .line 148
    invoke-virtual {v14, v6, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_1
    const v5, 0x6d656864

    .line 153
    .line 154
    .line 155
    if-ne v9, v5, :cond_3

    .line 156
    .line 157
    iget-object v5, v8, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 158
    .line 159
    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-nez v6, :cond_2

    .line 171
    .line 172
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    :goto_2
    move-wide v15, v5

    .line 177
    goto :goto_3

    .line 178
    :cond_2
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 179
    .line 180
    .line 181
    move-result-wide v5

    .line 182
    goto :goto_2

    .line 183
    :cond_3
    :goto_3
    add-int/lit8 v11, v11, 0x1

    .line 184
    .line 185
    const/16 v5, 0xc

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    const/16 v18, 0x10

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    const v2, 0x6d657461

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zzd(I)Lcom/google/android/gms/internal/ads/zzfu;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    if-eqz v2, :cond_5

    .line 200
    .line 201
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzakh;->zze(Lcom/google/android/gms/internal/ads/zzfu;)Lcom/google/android/gms/internal/ads/zzap;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    goto :goto_4

    .line 206
    :cond_5
    const/4 v2, 0x0

    .line 207
    :goto_4
    new-instance v4, Lcom/google/android/gms/internal/ads/zzafn;

    .line 208
    .line 209
    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/zzafn;-><init>()V

    .line 210
    .line 211
    .line 212
    const v5, 0x75647461

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    if-eqz v5, :cond_6

    .line 220
    .line 221
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzakh;->zzc(Lcom/google/android/gms/internal/ads/zzfv;)Lcom/google/android/gms/internal/ads/zzap;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/ads/zzafn;->zza(Lcom/google/android/gms/internal/ads/zzap;)Z

    .line 226
    .line 227
    .line 228
    move-object v13, v9

    .line 229
    goto :goto_5

    .line 230
    :cond_6
    const/4 v13, 0x0

    .line 231
    :goto_5
    new-instance v5, Lcom/google/android/gms/internal/ads/zzap;

    .line 232
    .line 233
    const v6, 0x6d766864

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 244
    .line 245
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzakh;->zzd(Lcom/google/android/gms/internal/ads/zzer;)Lcom/google/android/gms/internal/ads/zzfy;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    new-array v7, v12, [Lcom/google/android/gms/internal/ads/zzao;

    .line 250
    .line 251
    aput-object v6, v7, v19

    .line 252
    .line 253
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    invoke-direct {v5, v8, v9, v7}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 259
    .line 260
    .line 261
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzako;->zzd:I

    .line 262
    .line 263
    and-int/lit8 v6, v6, 0x10

    .line 264
    .line 265
    if-eqz v6, :cond_7

    .line 266
    .line 267
    move v8, v12

    .line 268
    goto :goto_6

    .line 269
    :cond_7
    move/from16 v8, v19

    .line 270
    .line 271
    :goto_6
    new-instance v10, Lcom/google/android/gms/internal/ads/zzakj;

    .line 272
    .line 273
    invoke-direct {v10, v0}, Lcom/google/android/gms/internal/ads/zzakj;-><init>(Lcom/google/android/gms/internal/ads/zzako;)V

    .line 274
    .line 275
    .line 276
    const/4 v11, 0x0

    .line 277
    const/4 v9, 0x0

    .line 278
    move-object v7, v1

    .line 279
    move-object v1, v5

    .line 280
    move-wide v5, v15

    .line 281
    invoke-static/range {v3 .. v11}, Lcom/google/android/gms/internal/ads/zzakh;->zzb(Lcom/google/android/gms/internal/ads/zzfu;Lcom/google/android/gms/internal/ads/zzafn;JLcom/google/android/gms/internal/ads/zzq;ZZLcom/google/android/gms/internal/ads/zzgqt;Z)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 286
    .line 287
    .line 288
    move-result v5

    .line 289
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    .line 290
    .line 291
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    if-nez v7, :cond_9

    .line 296
    .line 297
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzakr;->zza(Ljava/util/List;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    move/from16 v8, v19

    .line 302
    .line 303
    :goto_7
    if-ge v8, v5, :cond_8

    .line 304
    .line 305
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    check-cast v9, Lcom/google/android/gms/internal/ads/zzalf;

    .line 310
    .line 311
    iget-object v10, v9, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 312
    .line 313
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    .line 314
    .line 315
    iget v12, v10, Lcom/google/android/gms/internal/ads/zzalc;->zzb:I

    .line 316
    .line 317
    invoke-interface {v11, v8, v12}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 318
    .line 319
    .line 320
    move-result-object v11

    .line 321
    move v15, v5

    .line 322
    move-object/from16 v16, v6

    .line 323
    .line 324
    iget-wide v5, v10, Lcom/google/android/gms/internal/ads/zzalc;->zze:J

    .line 325
    .line 326
    invoke-interface {v11, v5, v6}, Lcom/google/android/gms/internal/ads/zzagh;->zzN(J)V

    .line 327
    .line 328
    .line 329
    move/from16 v17, v8

    .line 330
    .line 331
    iget-object v8, v10, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 332
    .line 333
    move/from16 v18, v15

    .line 334
    .line 335
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 336
    .line 337
    .line 338
    move-result-object v15

    .line 339
    invoke-virtual {v15, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 340
    .line 341
    .line 342
    invoke-static {v12, v4, v15}, Lcom/google/android/gms/internal/ads/zzakq;->zzb(ILcom/google/android/gms/internal/ads/zzafn;Lcom/google/android/gms/internal/ads/zzt;)V

    .line 343
    .line 344
    .line 345
    move-object/from16 v20, v4

    .line 346
    .line 347
    filled-new-array {v13, v1}, [Lcom/google/android/gms/internal/ads/zzap;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 352
    .line 353
    invoke-static {v12, v2, v15, v8, v4}, Lcom/google/android/gms/internal/ads/zzakq;->zza(ILcom/google/android/gms/internal/ads/zzap;Lcom/google/android/gms/internal/ads/zzt;Lcom/google/android/gms/internal/ads/zzap;[Lcom/google/android/gms/internal/ads/zzap;)V

    .line 354
    .line 355
    .line 356
    iget v4, v10, Lcom/google/android/gms/internal/ads/zzalc;->zza:I

    .line 357
    .line 358
    new-instance v8, Lcom/google/android/gms/internal/ads/zzakn;

    .line 359
    .line 360
    invoke-static {v14, v4}, Lcom/google/android/gms/internal/ads/zzako;->zzo(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzaki;

    .line 361
    .line 362
    .line 363
    move-result-object v10

    .line 364
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 365
    .line 366
    .line 367
    move-result-object v12

    .line 368
    invoke-direct {v8, v11, v9, v10, v12}, Lcom/google/android/gms/internal/ads/zzakn;-><init>(Lcom/google/android/gms/internal/ads/zzagh;Lcom/google/android/gms/internal/ads/zzalf;Lcom/google/android/gms/internal/ads/zzaki;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v9, v16

    .line 372
    .line 373
    invoke-virtual {v9, v4, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzako;->zzA:J

    .line 377
    .line 378
    invoke-static {v10, v11, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 379
    .line 380
    .line 381
    move-result-wide v4

    .line 382
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzA:J

    .line 383
    .line 384
    add-int/lit8 v8, v17, 0x1

    .line 385
    .line 386
    move-object v6, v9

    .line 387
    move/from16 v5, v18

    .line 388
    .line 389
    move-object/from16 v4, v20

    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_8
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    .line 393
    .line 394
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 395
    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    .line 399
    :cond_9
    move/from16 v18, v5

    .line 400
    .line 401
    move-object v9, v6

    .line 402
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    .line 403
    .line 404
    .line 405
    move-result v1

    .line 406
    move/from16 v15, v18

    .line 407
    .line 408
    if-ne v1, v15, :cond_a

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_a
    move/from16 v12, v19

    .line 412
    .line 413
    :goto_8
    invoke-static {v12}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 414
    .line 415
    .line 416
    move/from16 v13, v19

    .line 417
    .line 418
    :goto_9
    if-ge v13, v15, :cond_0

    .line 419
    .line 420
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, Lcom/google/android/gms/internal/ads/zzalf;

    .line 425
    .line 426
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 427
    .line 428
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzalc;->zza:I

    .line 429
    .line 430
    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    check-cast v4, Lcom/google/android/gms/internal/ads/zzakn;

    .line 435
    .line 436
    invoke-static {v14, v2}, Lcom/google/android/gms/internal/ads/zzako;->zzo(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzaki;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v4, v1, v2}, Lcom/google/android/gms/internal/ads/zzakn;->zza(Lcom/google/android/gms/internal/ads/zzalf;Lcom/google/android/gms/internal/ads/zzaki;)V

    .line 441
    .line 442
    .line 443
    add-int/lit8 v13, v13, 0x1

    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_b
    const/16 v18, 0x10

    .line 447
    .line 448
    const/16 v19, 0x0

    .line 449
    .line 450
    const v4, 0x6d6f6f66

    .line 451
    .line 452
    .line 453
    if-ne v2, v4, :cond_51

    .line 454
    .line 455
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    .line 456
    .line 457
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzd:I

    .line 458
    .line 459
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzj:[B

    .line 460
    .line 461
    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzfu;->zzc:Ljava/util/List;

    .line 462
    .line 463
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 464
    .line 465
    .line 466
    move-result v6

    .line 467
    move/from16 v7, v19

    .line 468
    .line 469
    :goto_a
    if-ge v7, v6, :cond_4c

    .line 470
    .line 471
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    check-cast v8, Lcom/google/android/gms/internal/ads/zzfu;

    .line 476
    .line 477
    iget v9, v8, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 478
    .line 479
    const v11, 0x74726166

    .line 480
    .line 481
    .line 482
    if-ne v9, v11, :cond_4b

    .line 483
    .line 484
    const v9, 0x74666864

    .line 485
    .line 486
    .line 487
    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    iget-object v9, v9, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 495
    .line 496
    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 500
    .line 501
    .line 502
    move-result v11

    .line 503
    sget v13, Lcom/google/android/gms/internal/ads/zzakh;->zza:I

    .line 504
    .line 505
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 506
    .line 507
    .line 508
    move-result v13

    .line 509
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v13

    .line 513
    check-cast v13, Lcom/google/android/gms/internal/ads/zzakn;

    .line 514
    .line 515
    if-nez v13, :cond_c

    .line 516
    .line 517
    const/4 v13, 0x0

    .line 518
    goto :goto_f

    .line 519
    :cond_c
    and-int/lit8 v14, v11, 0x1

    .line 520
    .line 521
    if-eqz v14, :cond_d

    .line 522
    .line 523
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 524
    .line 525
    .line 526
    move-result-wide v14

    .line 527
    iget-object v10, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    .line 528
    .line 529
    iput-wide v14, v10, Lcom/google/android/gms/internal/ads/zzale;->zzb:J

    .line 530
    .line 531
    iput-wide v14, v10, Lcom/google/android/gms/internal/ads/zzale;->zzc:J

    .line 532
    .line 533
    :cond_d
    iget-object v10, v13, Lcom/google/android/gms/internal/ads/zzakn;->zze:Lcom/google/android/gms/internal/ads/zzaki;

    .line 534
    .line 535
    and-int/lit8 v14, v11, 0x2

    .line 536
    .line 537
    if-eqz v14, :cond_e

    .line 538
    .line 539
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 540
    .line 541
    .line 542
    move-result v14

    .line 543
    add-int/lit8 v14, v14, -0x1

    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_e
    iget v14, v10, Lcom/google/android/gms/internal/ads/zzaki;->zza:I

    .line 547
    .line 548
    :goto_b
    and-int/lit8 v15, v11, 0x8

    .line 549
    .line 550
    if-eqz v15, :cond_f

    .line 551
    .line 552
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 553
    .line 554
    .line 555
    move-result v15

    .line 556
    goto :goto_c

    .line 557
    :cond_f
    iget v15, v10, Lcom/google/android/gms/internal/ads/zzaki;->zzb:I

    .line 558
    .line 559
    :goto_c
    and-int/lit8 v23, v11, 0x10

    .line 560
    .line 561
    if-eqz v23, :cond_10

    .line 562
    .line 563
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 564
    .line 565
    .line 566
    move-result v23

    .line 567
    move/from16 v12, v23

    .line 568
    .line 569
    goto :goto_d

    .line 570
    :cond_10
    iget v12, v10, Lcom/google/android/gms/internal/ads/zzaki;->zzc:I

    .line 571
    .line 572
    :goto_d
    and-int/lit8 v11, v11, 0x20

    .line 573
    .line 574
    if-eqz v11, :cond_11

    .line 575
    .line 576
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 577
    .line 578
    .line 579
    move-result v9

    .line 580
    goto :goto_e

    .line 581
    :cond_11
    iget v9, v10, Lcom/google/android/gms/internal/ads/zzaki;->zzd:I

    .line 582
    .line 583
    :goto_e
    iget-object v10, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    .line 584
    .line 585
    new-instance v11, Lcom/google/android/gms/internal/ads/zzaki;

    .line 586
    .line 587
    invoke-direct {v11, v14, v15, v12, v9}, Lcom/google/android/gms/internal/ads/zzaki;-><init>(IIII)V

    .line 588
    .line 589
    .line 590
    iput-object v11, v10, Lcom/google/android/gms/internal/ads/zzale;->zza:Lcom/google/android/gms/internal/ads/zzaki;

    .line 591
    .line 592
    :goto_f
    if-nez v13, :cond_12

    .line 593
    .line 594
    move/from16 v24, v2

    .line 595
    .line 596
    move-object/from16 v26, v5

    .line 597
    .line 598
    move/from16 v25, v6

    .line 599
    .line 600
    move/from16 v32, v7

    .line 601
    .line 602
    move/from16 v13, v18

    .line 603
    .line 604
    move/from16 v8, v19

    .line 605
    .line 606
    const/4 v5, 0x0

    .line 607
    const/16 v11, 0x8

    .line 608
    .line 609
    const/16 v12, 0xc

    .line 610
    .line 611
    const/4 v14, 0x1

    .line 612
    goto/16 :goto_31

    .line 613
    .line 614
    :cond_12
    iget-object v9, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    .line 615
    .line 616
    iget-wide v10, v9, Lcom/google/android/gms/internal/ads/zzale;->zzp:J

    .line 617
    .line 618
    iget-boolean v12, v9, Lcom/google/android/gms/internal/ads/zzale;->zzq:Z

    .line 619
    .line 620
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzakn;->zzc()V

    .line 621
    .line 622
    .line 623
    const/4 v14, 0x1

    .line 624
    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/ads/zzakn;->zzl(Z)V

    .line 625
    .line 626
    .line 627
    const v15, 0x74666474

    .line 628
    .line 629
    .line 630
    invoke-virtual {v8, v15}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 631
    .line 632
    .line 633
    move-result-object v15

    .line 634
    if-eqz v15, :cond_14

    .line 635
    .line 636
    and-int/lit8 v23, v2, 0x2

    .line 637
    .line 638
    if-nez v23, :cond_14

    .line 639
    .line 640
    iget-object v10, v15, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 641
    .line 642
    const/16 v11, 0x8

    .line 643
    .line 644
    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 648
    .line 649
    .line 650
    move-result v11

    .line 651
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 652
    .line 653
    .line 654
    move-result v11

    .line 655
    if-ne v11, v14, :cond_13

    .line 656
    .line 657
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 658
    .line 659
    .line 660
    move-result-wide v10

    .line 661
    goto :goto_10

    .line 662
    :cond_13
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 663
    .line 664
    .line 665
    move-result-wide v10

    .line 666
    :goto_10
    iput-wide v10, v9, Lcom/google/android/gms/internal/ads/zzale;->zzp:J

    .line 667
    .line 668
    iput-boolean v14, v9, Lcom/google/android/gms/internal/ads/zzale;->zzq:Z

    .line 669
    .line 670
    goto :goto_11

    .line 671
    :cond_14
    iput-wide v10, v9, Lcom/google/android/gms/internal/ads/zzale;->zzp:J

    .line 672
    .line 673
    iput-boolean v12, v9, Lcom/google/android/gms/internal/ads/zzale;->zzq:Z

    .line 674
    .line 675
    :goto_11
    iget-object v10, v8, Lcom/google/android/gms/internal/ads/zzfu;->zzb:Ljava/util/List;

    .line 676
    .line 677
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 678
    .line 679
    .line 680
    move-result v11

    .line 681
    move/from16 v24, v2

    .line 682
    .line 683
    move/from16 v12, v19

    .line 684
    .line 685
    move v14, v12

    .line 686
    move v15, v14

    .line 687
    :goto_12
    const v2, 0x7472756e

    .line 688
    .line 689
    .line 690
    if-ge v12, v11, :cond_16

    .line 691
    .line 692
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v25

    .line 696
    move-object/from16 v26, v5

    .line 697
    .line 698
    move-object/from16 v5, v25

    .line 699
    .line 700
    check-cast v5, Lcom/google/android/gms/internal/ads/zzfv;

    .line 701
    .line 702
    move/from16 v25, v6

    .line 703
    .line 704
    iget v6, v5, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 705
    .line 706
    if-ne v6, v2, :cond_15

    .line 707
    .line 708
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 709
    .line 710
    const/16 v5, 0xc

    .line 711
    .line 712
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    if-lez v2, :cond_15

    .line 720
    .line 721
    add-int/2addr v15, v2

    .line 722
    add-int/lit8 v14, v14, 0x1

    .line 723
    .line 724
    :cond_15
    add-int/lit8 v12, v12, 0x1

    .line 725
    .line 726
    move/from16 v6, v25

    .line 727
    .line 728
    move-object/from16 v5, v26

    .line 729
    .line 730
    goto :goto_12

    .line 731
    :cond_16
    move-object/from16 v26, v5

    .line 732
    .line 733
    move/from16 v25, v6

    .line 734
    .line 735
    move/from16 v5, v19

    .line 736
    .line 737
    iput v5, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzh:I

    .line 738
    .line 739
    iput v5, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzg:I

    .line 740
    .line 741
    iput v5, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzf:I

    .line 742
    .line 743
    iput v14, v9, Lcom/google/android/gms/internal/ads/zzale;->zzd:I

    .line 744
    .line 745
    iput v15, v9, Lcom/google/android/gms/internal/ads/zzale;->zze:I

    .line 746
    .line 747
    iget-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzg:[I

    .line 748
    .line 749
    array-length v5, v5

    .line 750
    if-ge v5, v14, :cond_17

    .line 751
    .line 752
    new-array v5, v14, [J

    .line 753
    .line 754
    iput-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzf:[J

    .line 755
    .line 756
    new-array v5, v14, [I

    .line 757
    .line 758
    iput-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzg:[I

    .line 759
    .line 760
    :cond_17
    iget-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzh:[I

    .line 761
    .line 762
    array-length v5, v5

    .line 763
    if-ge v5, v15, :cond_18

    .line 764
    .line 765
    mul-int/lit8 v15, v15, 0x7d

    .line 766
    .line 767
    div-int/lit8 v15, v15, 0x64

    .line 768
    .line 769
    new-array v5, v15, [I

    .line 770
    .line 771
    iput-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzh:[I

    .line 772
    .line 773
    new-array v5, v15, [J

    .line 774
    .line 775
    iput-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzi:[J

    .line 776
    .line 777
    new-array v5, v15, [Z

    .line 778
    .line 779
    iput-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzj:[Z

    .line 780
    .line 781
    new-array v5, v15, [Z

    .line 782
    .line 783
    iput-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzl:[Z

    .line 784
    .line 785
    :cond_18
    const/4 v5, 0x0

    .line 786
    const/4 v6, 0x0

    .line 787
    const/4 v12, 0x0

    .line 788
    :goto_13
    const-wide/16 v27, 0x0

    .line 789
    .line 790
    if-ge v5, v11, :cond_2d

    .line 791
    .line 792
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v15

    .line 796
    check-cast v15, Lcom/google/android/gms/internal/ads/zzfv;

    .line 797
    .line 798
    iget v14, v15, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 799
    .line 800
    if-ne v14, v2, :cond_2c

    .line 801
    .line 802
    add-int/lit8 v14, v6, 0x1

    .line 803
    .line 804
    iget-object v15, v15, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 805
    .line 806
    const/16 v2, 0x8

    .line 807
    .line 808
    invoke-virtual {v15, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    move/from16 v30, v5

    .line 816
    .line 817
    iget-object v5, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    .line 818
    .line 819
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 820
    .line 821
    move/from16 v31, v6

    .line 822
    .line 823
    iget-object v6, v9, Lcom/google/android/gms/internal/ads/zzale;->zza:Lcom/google/android/gms/internal/ads/zzaki;

    .line 824
    .line 825
    sget-object v32, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 826
    .line 827
    move/from16 v32, v7

    .line 828
    .line 829
    iget-object v7, v9, Lcom/google/android/gms/internal/ads/zzale;->zzg:[I

    .line 830
    .line 831
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 832
    .line 833
    .line 834
    move-result v33

    .line 835
    aput v33, v7, v31

    .line 836
    .line 837
    iget-object v7, v9, Lcom/google/android/gms/internal/ads/zzale;->zzf:[J

    .line 838
    .line 839
    move/from16 v33, v11

    .line 840
    .line 841
    move/from16 v34, v12

    .line 842
    .line 843
    iget-wide v11, v9, Lcom/google/android/gms/internal/ads/zzale;->zzb:J

    .line 844
    .line 845
    aput-wide v11, v7, v31

    .line 846
    .line 847
    and-int/lit8 v35, v2, 0x1

    .line 848
    .line 849
    if-eqz v35, :cond_19

    .line 850
    .line 851
    move-object/from16 v35, v7

    .line 852
    .line 853
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 854
    .line 855
    .line 856
    move-result v7

    .line 857
    move-wide/from16 v36, v11

    .line 858
    .line 859
    int-to-long v11, v7

    .line 860
    add-long v11, v36, v11

    .line 861
    .line 862
    aput-wide v11, v35, v31

    .line 863
    .line 864
    :cond_19
    and-int/lit8 v7, v2, 0x4

    .line 865
    .line 866
    if-eqz v7, :cond_1a

    .line 867
    .line 868
    const/4 v7, 0x1

    .line 869
    goto :goto_14

    .line 870
    :cond_1a
    const/4 v7, 0x0

    .line 871
    :goto_14
    iget v11, v6, Lcom/google/android/gms/internal/ads/zzaki;->zzd:I

    .line 872
    .line 873
    if-eqz v7, :cond_1b

    .line 874
    .line 875
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 876
    .line 877
    .line 878
    move-result v12

    .line 879
    goto :goto_15

    .line 880
    :cond_1b
    move v12, v11

    .line 881
    :goto_15
    move/from16 v35, v7

    .line 882
    .line 883
    and-int/lit16 v7, v2, 0x100

    .line 884
    .line 885
    move/from16 v36, v7

    .line 886
    .line 887
    and-int/lit16 v7, v2, 0x200

    .line 888
    .line 889
    move/from16 v37, v7

    .line 890
    .line 891
    and-int/lit16 v7, v2, 0x400

    .line 892
    .line 893
    and-int/lit16 v2, v2, 0x800

    .line 894
    .line 895
    move/from16 v38, v2

    .line 896
    .line 897
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzalc;->zzi:[J

    .line 898
    .line 899
    if-eqz v2, :cond_20

    .line 900
    .line 901
    move/from16 v39, v7

    .line 902
    .line 903
    array-length v7, v2

    .line 904
    move-object/from16 v40, v2

    .line 905
    .line 906
    const/4 v2, 0x1

    .line 907
    if-ne v7, v2, :cond_1c

    .line 908
    .line 909
    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzalc;->zzj:[J

    .line 910
    .line 911
    if-nez v2, :cond_1d

    .line 912
    .line 913
    :cond_1c
    :goto_16
    move v7, v11

    .line 914
    move/from16 v40, v12

    .line 915
    .line 916
    goto :goto_18

    .line 917
    :cond_1d
    const/16 v19, 0x0

    .line 918
    .line 919
    aget-wide v41, v40, v19

    .line 920
    .line 921
    cmp-long v7, v41, v27

    .line 922
    .line 923
    if-nez v7, :cond_1e

    .line 924
    .line 925
    move v7, v11

    .line 926
    move/from16 v40, v12

    .line 927
    .line 928
    goto :goto_17

    .line 929
    :cond_1e
    move v7, v11

    .line 930
    move/from16 v40, v12

    .line 931
    .line 932
    iget-wide v11, v5, Lcom/google/android/gms/internal/ads/zzalc;->zzd:J

    .line 933
    .line 934
    sget-object v47, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 935
    .line 936
    const-wide/32 v43, 0xf4240

    .line 937
    .line 938
    .line 939
    move-wide/from16 v45, v11

    .line 940
    .line 941
    invoke-static/range {v41 .. v47}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 942
    .line 943
    .line 944
    move-result-wide v11

    .line 945
    aget-wide v43, v2, v19

    .line 946
    .line 947
    const-wide/32 v45, 0xf4240

    .line 948
    .line 949
    .line 950
    move-wide/from16 v41, v11

    .line 951
    .line 952
    iget-wide v11, v5, Lcom/google/android/gms/internal/ads/zzalc;->zzc:J

    .line 953
    .line 954
    move-object/from16 v49, v47

    .line 955
    .line 956
    move-wide/from16 v47, v11

    .line 957
    .line 958
    invoke-static/range {v43 .. v49}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 959
    .line 960
    .line 961
    move-result-wide v11

    .line 962
    add-long v11, v41, v11

    .line 963
    .line 964
    move-wide/from16 v41, v11

    .line 965
    .line 966
    iget-wide v11, v5, Lcom/google/android/gms/internal/ads/zzalc;->zze:J

    .line 967
    .line 968
    cmp-long v11, v41, v11

    .line 969
    .line 970
    if-gez v11, :cond_1f

    .line 971
    .line 972
    goto :goto_18

    .line 973
    :cond_1f
    :goto_17
    aget-wide v27, v2, v19

    .line 974
    .line 975
    goto :goto_18

    .line 976
    :cond_20
    move/from16 v39, v7

    .line 977
    .line 978
    goto :goto_16

    .line 979
    :goto_18
    iget-object v2, v9, Lcom/google/android/gms/internal/ads/zzale;->zzh:[I

    .line 980
    .line 981
    iget-object v11, v9, Lcom/google/android/gms/internal/ads/zzale;->zzi:[J

    .line 982
    .line 983
    iget-object v12, v9, Lcom/google/android/gms/internal/ads/zzale;->zzj:[Z

    .line 984
    .line 985
    move-object/from16 v41, v2

    .line 986
    .line 987
    iget v2, v5, Lcom/google/android/gms/internal/ads/zzalc;->zzb:I

    .line 988
    .line 989
    move/from16 v42, v7

    .line 990
    .line 991
    const/4 v7, 0x2

    .line 992
    if-ne v2, v7, :cond_21

    .line 993
    .line 994
    and-int/lit8 v2, v24, 0x1

    .line 995
    .line 996
    if-eqz v2, :cond_21

    .line 997
    .line 998
    const/4 v2, 0x1

    .line 999
    goto :goto_19

    .line 1000
    :cond_21
    const/4 v2, 0x0

    .line 1001
    :goto_19
    iget-object v7, v9, Lcom/google/android/gms/internal/ads/zzale;->zzg:[I

    .line 1002
    .line 1003
    aget v7, v7, v31

    .line 1004
    .line 1005
    add-int v7, v34, v7

    .line 1006
    .line 1007
    move-object/from16 v29, v11

    .line 1008
    .line 1009
    move-object/from16 v50, v12

    .line 1010
    .line 1011
    iget-wide v11, v5, Lcom/google/android/gms/internal/ads/zzalc;->zzc:J

    .line 1012
    .line 1013
    move-wide/from16 v47, v11

    .line 1014
    .line 1015
    iget-wide v11, v9, Lcom/google/android/gms/internal/ads/zzale;->zzp:J

    .line 1016
    .line 1017
    move/from16 v5, v34

    .line 1018
    .line 1019
    :goto_1a
    if-ge v5, v7, :cond_2b

    .line 1020
    .line 1021
    if-eqz v36, :cond_22

    .line 1022
    .line 1023
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1024
    .line 1025
    .line 1026
    move-result v31

    .line 1027
    move/from16 v51, v2

    .line 1028
    .line 1029
    move/from16 v2, v31

    .line 1030
    .line 1031
    goto :goto_1b

    .line 1032
    :cond_22
    move/from16 v51, v2

    .line 1033
    .line 1034
    iget v2, v6, Lcom/google/android/gms/internal/ads/zzaki;->zzb:I

    .line 1035
    .line 1036
    :goto_1b
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzako;->zzk(I)I

    .line 1037
    .line 1038
    .line 1039
    if-eqz v37, :cond_23

    .line 1040
    .line 1041
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1042
    .line 1043
    .line 1044
    move-result v31

    .line 1045
    move/from16 v54, v31

    .line 1046
    .line 1047
    move/from16 v31, v5

    .line 1048
    .line 1049
    move/from16 v5, v54

    .line 1050
    .line 1051
    goto :goto_1c

    .line 1052
    :cond_23
    move/from16 v31, v5

    .line 1053
    .line 1054
    iget v5, v6, Lcom/google/android/gms/internal/ads/zzaki;->zzc:I

    .line 1055
    .line 1056
    :goto_1c
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzako;->zzk(I)I

    .line 1057
    .line 1058
    .line 1059
    if-eqz v39, :cond_24

    .line 1060
    .line 1061
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1062
    .line 1063
    .line 1064
    move-result v34

    .line 1065
    goto :goto_1d

    .line 1066
    :cond_24
    if-nez v31, :cond_26

    .line 1067
    .line 1068
    if-eqz v35, :cond_25

    .line 1069
    .line 1070
    move/from16 v34, v40

    .line 1071
    .line 1072
    const/16 v31, 0x0

    .line 1073
    .line 1074
    goto :goto_1d

    .line 1075
    :cond_25
    const/16 v31, 0x0

    .line 1076
    .line 1077
    :cond_26
    move/from16 v34, v42

    .line 1078
    .line 1079
    :goto_1d
    if-eqz v38, :cond_27

    .line 1080
    .line 1081
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1082
    .line 1083
    .line 1084
    move-result v43

    .line 1085
    move/from16 v52, v5

    .line 1086
    .line 1087
    move/from16 v5, v43

    .line 1088
    .line 1089
    :goto_1e
    move-object/from16 v53, v6

    .line 1090
    .line 1091
    goto :goto_1f

    .line 1092
    :cond_27
    move/from16 v52, v5

    .line 1093
    .line 1094
    const/4 v5, 0x0

    .line 1095
    goto :goto_1e

    .line 1096
    :goto_1f
    int-to-long v5, v5

    .line 1097
    add-long/2addr v5, v11

    .line 1098
    sub-long v43, v5, v27

    .line 1099
    .line 1100
    const-wide/32 v45, 0xf4240

    .line 1101
    .line 1102
    .line 1103
    sget-object v49, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1104
    .line 1105
    invoke-static/range {v43 .. v49}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v5

    .line 1109
    aput-wide v5, v29, v31

    .line 1110
    .line 1111
    move-wide/from16 v43, v5

    .line 1112
    .line 1113
    iget-boolean v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzq:Z

    .line 1114
    .line 1115
    if-nez v5, :cond_28

    .line 1116
    .line 1117
    iget-object v5, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    .line 1118
    .line 1119
    iget-wide v5, v5, Lcom/google/android/gms/internal/ads/zzalf;->zzi:J

    .line 1120
    .line 1121
    add-long v5, v43, v5

    .line 1122
    .line 1123
    aput-wide v5, v29, v31

    .line 1124
    .line 1125
    :cond_28
    aput v52, v41, v31

    .line 1126
    .line 1127
    shr-int/lit8 v5, v34, 0x10

    .line 1128
    .line 1129
    const/16 v23, 0x1

    .line 1130
    .line 1131
    and-int/lit8 v5, v5, 0x1

    .line 1132
    .line 1133
    if-nez v5, :cond_29

    .line 1134
    .line 1135
    if-eqz v51, :cond_2a

    .line 1136
    .line 1137
    if-nez v31, :cond_29

    .line 1138
    .line 1139
    move/from16 v5, v23

    .line 1140
    .line 1141
    const/16 v31, 0x0

    .line 1142
    .line 1143
    goto :goto_20

    .line 1144
    :cond_29
    const/4 v5, 0x0

    .line 1145
    goto :goto_20

    .line 1146
    :cond_2a
    move/from16 v5, v23

    .line 1147
    .line 1148
    :goto_20
    aput-boolean v5, v50, v31

    .line 1149
    .line 1150
    int-to-long v5, v2

    .line 1151
    add-long/2addr v11, v5

    .line 1152
    add-int/lit8 v5, v31, 0x1

    .line 1153
    .line 1154
    move/from16 v2, v51

    .line 1155
    .line 1156
    move-object/from16 v6, v53

    .line 1157
    .line 1158
    goto/16 :goto_1a

    .line 1159
    .line 1160
    :cond_2b
    iput-wide v11, v9, Lcom/google/android/gms/internal/ads/zzale;->zzp:J

    .line 1161
    .line 1162
    move v12, v7

    .line 1163
    move v6, v14

    .line 1164
    goto :goto_21

    .line 1165
    :cond_2c
    move/from16 v30, v5

    .line 1166
    .line 1167
    move/from16 v31, v6

    .line 1168
    .line 1169
    move/from16 v32, v7

    .line 1170
    .line 1171
    move/from16 v33, v11

    .line 1172
    .line 1173
    move/from16 v34, v12

    .line 1174
    .line 1175
    :goto_21
    add-int/lit8 v5, v30, 0x1

    .line 1176
    .line 1177
    move/from16 v7, v32

    .line 1178
    .line 1179
    move/from16 v11, v33

    .line 1180
    .line 1181
    const v2, 0x7472756e

    .line 1182
    .line 1183
    .line 1184
    goto/16 :goto_13

    .line 1185
    .line 1186
    :cond_2d
    move/from16 v32, v7

    .line 1187
    .line 1188
    iget-object v2, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    .line 1189
    .line 1190
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 1191
    .line 1192
    iget-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zza:Lcom/google/android/gms/internal/ads/zzaki;

    .line 1193
    .line 1194
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzaki;->zza:I

    .line 1198
    .line 1199
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzalc;->zza(I)Lcom/google/android/gms/internal/ads/zzald;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v2

    .line 1203
    const v5, 0x7361697a

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v5

    .line 1210
    if-eqz v5, :cond_34

    .line 1211
    .line 1212
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1213
    .line 1214
    .line 1215
    iget v6, v2, Lcom/google/android/gms/internal/ads/zzald;->zzd:I

    .line 1216
    .line 1217
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 1218
    .line 1219
    const/16 v11, 0x8

    .line 1220
    .line 1221
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1225
    .line 1226
    .line 1227
    move-result v7

    .line 1228
    const/4 v14, 0x1

    .line 1229
    and-int/2addr v7, v14

    .line 1230
    if-ne v7, v14, :cond_2e

    .line 1231
    .line 1232
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1233
    .line 1234
    .line 1235
    :cond_2e
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 1236
    .line 1237
    .line 1238
    move-result v7

    .line 1239
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 1240
    .line 1241
    .line 1242
    move-result v11

    .line 1243
    iget v12, v9, Lcom/google/android/gms/internal/ads/zzale;->zze:I

    .line 1244
    .line 1245
    if-gt v11, v12, :cond_33

    .line 1246
    .line 1247
    if-nez v7, :cond_31

    .line 1248
    .line 1249
    iget-object v7, v9, Lcom/google/android/gms/internal/ads/zzale;->zzl:[Z

    .line 1250
    .line 1251
    const/4 v12, 0x0

    .line 1252
    const/4 v13, 0x0

    .line 1253
    :goto_22
    if-ge v12, v11, :cond_30

    .line 1254
    .line 1255
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 1256
    .line 1257
    .line 1258
    move-result v14

    .line 1259
    add-int/2addr v13, v14

    .line 1260
    if-le v14, v6, :cond_2f

    .line 1261
    .line 1262
    const/4 v14, 0x1

    .line 1263
    goto :goto_23

    .line 1264
    :cond_2f
    const/4 v14, 0x0

    .line 1265
    :goto_23
    aput-boolean v14, v7, v12

    .line 1266
    .line 1267
    add-int/lit8 v12, v12, 0x1

    .line 1268
    .line 1269
    goto :goto_22

    .line 1270
    :cond_30
    const/4 v7, 0x0

    .line 1271
    goto :goto_25

    .line 1272
    :cond_31
    if-le v7, v6, :cond_32

    .line 1273
    .line 1274
    const/4 v5, 0x1

    .line 1275
    goto :goto_24

    .line 1276
    :cond_32
    const/4 v5, 0x0

    .line 1277
    :goto_24
    mul-int v13, v7, v11

    .line 1278
    .line 1279
    iget-object v6, v9, Lcom/google/android/gms/internal/ads/zzale;->zzl:[Z

    .line 1280
    .line 1281
    const/4 v7, 0x0

    .line 1282
    invoke-static {v6, v7, v11, v5}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1283
    .line 1284
    .line 1285
    :goto_25
    iget-object v5, v9, Lcom/google/android/gms/internal/ads/zzale;->zzl:[Z

    .line 1286
    .line 1287
    iget v6, v9, Lcom/google/android/gms/internal/ads/zzale;->zze:I

    .line 1288
    .line 1289
    invoke-static {v5, v11, v6, v7}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1290
    .line 1291
    .line 1292
    if-lez v13, :cond_34

    .line 1293
    .line 1294
    invoke-virtual {v9, v13}, Lcom/google/android/gms/internal/ads/zzale;->zza(I)V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_26

    .line 1298
    :cond_33
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v1

    .line 1302
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1303
    .line 1304
    .line 1305
    move-result v1

    .line 1306
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    add-int/lit8 v1, v1, 0x38

    .line 1311
    .line 1312
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1313
    .line 1314
    .line 1315
    move-result v2

    .line 1316
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1317
    .line 1318
    add-int/2addr v1, v2

    .line 1319
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1320
    .line 1321
    .line 1322
    const-string v1, "Saiz sample count "

    .line 1323
    .line 1324
    const-string v2, " is greater than fragment sample count"

    .line 1325
    .line 1326
    invoke-static {v3, v1, v11, v2, v12}, Ls/c;->c(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v1

    .line 1330
    const/4 v2, 0x0

    .line 1331
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    throw v1

    .line 1336
    :cond_34
    :goto_26
    const v5, 0x7361696f

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v5

    .line 1343
    if-eqz v5, :cond_37

    .line 1344
    .line 1345
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 1346
    .line 1347
    const/16 v11, 0x8

    .line 1348
    .line 1349
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1353
    .line 1354
    .line 1355
    move-result v6

    .line 1356
    and-int/lit8 v7, v6, 0x1

    .line 1357
    .line 1358
    const/4 v14, 0x1

    .line 1359
    if-ne v7, v14, :cond_35

    .line 1360
    .line 1361
    invoke-virtual {v5, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1362
    .line 1363
    .line 1364
    :cond_35
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 1365
    .line 1366
    .line 1367
    move-result v7

    .line 1368
    if-ne v7, v14, :cond_38

    .line 1369
    .line 1370
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 1371
    .line 1372
    .line 1373
    move-result v6

    .line 1374
    iget-wide v11, v9, Lcom/google/android/gms/internal/ads/zzale;->zzc:J

    .line 1375
    .line 1376
    if-nez v6, :cond_36

    .line 1377
    .line 1378
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 1379
    .line 1380
    .line 1381
    move-result-wide v5

    .line 1382
    goto :goto_27

    .line 1383
    :cond_36
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 1384
    .line 1385
    .line 1386
    move-result-wide v5

    .line 1387
    :goto_27
    add-long/2addr v11, v5

    .line 1388
    iput-wide v11, v9, Lcom/google/android/gms/internal/ads/zzale;->zzc:J

    .line 1389
    .line 1390
    :cond_37
    const/4 v5, 0x0

    .line 1391
    goto :goto_28

    .line 1392
    :cond_38
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v1

    .line 1396
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1397
    .line 1398
    .line 1399
    move-result v1

    .line 1400
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1401
    .line 1402
    add-int/lit8 v1, v1, 0x1d

    .line 1403
    .line 1404
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1405
    .line 1406
    .line 1407
    const-string v1, "Unexpected saio entry count: "

    .line 1408
    .line 1409
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1416
    .line 1417
    .line 1418
    move-result-object v1

    .line 1419
    const/4 v5, 0x0

    .line 1420
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v1

    .line 1424
    throw v1

    .line 1425
    :goto_28
    const v6, 0x73656e63

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzfu;->zzc(I)Lcom/google/android/gms/internal/ads/zzfv;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v6

    .line 1432
    if-eqz v6, :cond_39

    .line 1433
    .line 1434
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 1435
    .line 1436
    const/4 v7, 0x0

    .line 1437
    invoke-static {v6, v7, v9}, Lcom/google/android/gms/internal/ads/zzako;->zzl(Lcom/google/android/gms/internal/ads/zzer;ILcom/google/android/gms/internal/ads/zzale;)V

    .line 1438
    .line 1439
    .line 1440
    :cond_39
    if-eqz v2, :cond_3a

    .line 1441
    .line 1442
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzald;->zzb:Ljava/lang/String;

    .line 1443
    .line 1444
    move-object/from16 v35, v2

    .line 1445
    .line 1446
    goto :goto_29

    .line 1447
    :cond_3a
    move-object/from16 v35, v5

    .line 1448
    .line 1449
    :goto_29
    move-object v2, v5

    .line 1450
    move-object v6, v2

    .line 1451
    const/4 v7, 0x0

    .line 1452
    :goto_2a
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1453
    .line 1454
    .line 1455
    move-result v8

    .line 1456
    if-ge v7, v8, :cond_3d

    .line 1457
    .line 1458
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v8

    .line 1462
    check-cast v8, Lcom/google/android/gms/internal/ads/zzfv;

    .line 1463
    .line 1464
    iget-object v11, v8, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 1465
    .line 1466
    iget v8, v8, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 1467
    .line 1468
    const v12, 0x73626770

    .line 1469
    .line 1470
    .line 1471
    const v13, 0x73656967

    .line 1472
    .line 1473
    .line 1474
    if-ne v8, v12, :cond_3b

    .line 1475
    .line 1476
    const/16 v12, 0xc

    .line 1477
    .line 1478
    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1482
    .line 1483
    .line 1484
    move-result v8

    .line 1485
    if-ne v8, v13, :cond_3c

    .line 1486
    .line 1487
    move-object v2, v11

    .line 1488
    goto :goto_2b

    .line 1489
    :cond_3b
    const/16 v12, 0xc

    .line 1490
    .line 1491
    const v14, 0x73677064

    .line 1492
    .line 1493
    .line 1494
    if-ne v8, v14, :cond_3c

    .line 1495
    .line 1496
    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1500
    .line 1501
    .line 1502
    move-result v8

    .line 1503
    if-ne v8, v13, :cond_3c

    .line 1504
    .line 1505
    move-object v6, v11

    .line 1506
    :cond_3c
    :goto_2b
    add-int/lit8 v7, v7, 0x1

    .line 1507
    .line 1508
    goto :goto_2a

    .line 1509
    :cond_3d
    const/16 v12, 0xc

    .line 1510
    .line 1511
    if-eqz v2, :cond_3e

    .line 1512
    .line 1513
    if-nez v6, :cond_3f

    .line 1514
    .line 1515
    :cond_3e
    const/4 v14, 0x1

    .line 1516
    goto/16 :goto_2e

    .line 1517
    .line 1518
    :cond_3f
    const/16 v11, 0x8

    .line 1519
    .line 1520
    invoke-virtual {v2, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1524
    .line 1525
    .line 1526
    move-result v7

    .line 1527
    invoke-static {v7}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 1528
    .line 1529
    .line 1530
    move-result v7

    .line 1531
    const/4 v8, 0x4

    .line 1532
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1533
    .line 1534
    .line 1535
    const/4 v14, 0x1

    .line 1536
    if-ne v7, v14, :cond_40

    .line 1537
    .line 1538
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1539
    .line 1540
    .line 1541
    :cond_40
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1542
    .line 1543
    .line 1544
    move-result v2

    .line 1545
    if-ne v2, v14, :cond_46

    .line 1546
    .line 1547
    invoke-virtual {v6, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 1551
    .line 1552
    .line 1553
    move-result v2

    .line 1554
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 1555
    .line 1556
    .line 1557
    move-result v2

    .line 1558
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1559
    .line 1560
    .line 1561
    if-ne v2, v14, :cond_42

    .line 1562
    .line 1563
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 1564
    .line 1565
    .line 1566
    move-result-wide v13

    .line 1567
    cmp-long v2, v13, v27

    .line 1568
    .line 1569
    if-eqz v2, :cond_41

    .line 1570
    .line 1571
    goto :goto_2c

    .line 1572
    :cond_41
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 1573
    .line 1574
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v1

    .line 1578
    throw v1

    .line 1579
    :cond_42
    const/4 v7, 0x2

    .line 1580
    if-lt v2, v7, :cond_43

    .line 1581
    .line 1582
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1583
    .line 1584
    .line 1585
    :cond_43
    :goto_2c
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 1586
    .line 1587
    .line 1588
    move-result-wide v13

    .line 1589
    const-wide/16 v27, 0x1

    .line 1590
    .line 1591
    cmp-long v2, v13, v27

    .line 1592
    .line 1593
    if-nez v2, :cond_45

    .line 1594
    .line 1595
    const/4 v14, 0x1

    .line 1596
    invoke-virtual {v6, v14}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 1600
    .line 1601
    .line 1602
    move-result v2

    .line 1603
    and-int/lit16 v7, v2, 0xf0

    .line 1604
    .line 1605
    shr-int/lit8 v38, v7, 0x4

    .line 1606
    .line 1607
    and-int/lit8 v39, v2, 0xf

    .line 1608
    .line 1609
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 1610
    .line 1611
    .line 1612
    move-result v2

    .line 1613
    if-ne v2, v14, :cond_47

    .line 1614
    .line 1615
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 1616
    .line 1617
    .line 1618
    move-result v36

    .line 1619
    move/from16 v2, v18

    .line 1620
    .line 1621
    new-array v7, v2, [B

    .line 1622
    .line 1623
    const/4 v8, 0x0

    .line 1624
    invoke-virtual {v6, v7, v8, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 1625
    .line 1626
    .line 1627
    if-nez v36, :cond_44

    .line 1628
    .line 1629
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 1630
    .line 1631
    .line 1632
    move-result v2

    .line 1633
    new-array v11, v2, [B

    .line 1634
    .line 1635
    invoke-virtual {v6, v11, v8, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 1636
    .line 1637
    .line 1638
    move-object/from16 v40, v11

    .line 1639
    .line 1640
    goto :goto_2d

    .line 1641
    :cond_44
    move-object/from16 v40, v5

    .line 1642
    .line 1643
    :goto_2d
    iput-boolean v14, v9, Lcom/google/android/gms/internal/ads/zzale;->zzk:Z

    .line 1644
    .line 1645
    new-instance v33, Lcom/google/android/gms/internal/ads/zzald;

    .line 1646
    .line 1647
    const/16 v34, 0x1

    .line 1648
    .line 1649
    move-object/from16 v37, v7

    .line 1650
    .line 1651
    invoke-direct/range {v33 .. v40}, Lcom/google/android/gms/internal/ads/zzald;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1652
    .line 1653
    .line 1654
    move-object/from16 v2, v33

    .line 1655
    .line 1656
    iput-object v2, v9, Lcom/google/android/gms/internal/ads/zzale;->zzm:Lcom/google/android/gms/internal/ads/zzald;

    .line 1657
    .line 1658
    goto :goto_2e

    .line 1659
    :cond_45
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 1660
    .line 1661
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v1

    .line 1665
    throw v1

    .line 1666
    :cond_46
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 1667
    .line 1668
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v1

    .line 1672
    throw v1

    .line 1673
    :cond_47
    :goto_2e
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 1674
    .line 1675
    .line 1676
    move-result v2

    .line 1677
    const/4 v6, 0x0

    .line 1678
    :goto_2f
    if-ge v6, v2, :cond_4a

    .line 1679
    .line 1680
    invoke-interface {v10, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v7

    .line 1684
    check-cast v7, Lcom/google/android/gms/internal/ads/zzfv;

    .line 1685
    .line 1686
    iget v8, v7, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 1687
    .line 1688
    const v11, 0x75756964

    .line 1689
    .line 1690
    .line 1691
    if-ne v8, v11, :cond_48

    .line 1692
    .line 1693
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 1694
    .line 1695
    const/16 v11, 0x8

    .line 1696
    .line 1697
    invoke-virtual {v7, v11}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 1698
    .line 1699
    .line 1700
    const/4 v8, 0x0

    .line 1701
    const/16 v13, 0x10

    .line 1702
    .line 1703
    invoke-virtual {v7, v4, v8, v13}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 1704
    .line 1705
    .line 1706
    sget-object v15, Lcom/google/android/gms/internal/ads/zzako;->zza:[B

    .line 1707
    .line 1708
    invoke-static {v4, v15}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1709
    .line 1710
    .line 1711
    move-result v15

    .line 1712
    if-eqz v15, :cond_49

    .line 1713
    .line 1714
    invoke-static {v7, v13, v9}, Lcom/google/android/gms/internal/ads/zzako;->zzl(Lcom/google/android/gms/internal/ads/zzer;ILcom/google/android/gms/internal/ads/zzale;)V

    .line 1715
    .line 1716
    .line 1717
    goto :goto_30

    .line 1718
    :cond_48
    const/4 v8, 0x0

    .line 1719
    const/16 v11, 0x8

    .line 1720
    .line 1721
    const/16 v13, 0x10

    .line 1722
    .line 1723
    :cond_49
    :goto_30
    add-int/lit8 v6, v6, 0x1

    .line 1724
    .line 1725
    goto :goto_2f

    .line 1726
    :cond_4a
    const/4 v8, 0x0

    .line 1727
    const/16 v11, 0x8

    .line 1728
    .line 1729
    const/16 v13, 0x10

    .line 1730
    .line 1731
    goto :goto_31

    .line 1732
    :cond_4b
    move/from16 v24, v2

    .line 1733
    .line 1734
    move-object/from16 v26, v5

    .line 1735
    .line 1736
    move/from16 v25, v6

    .line 1737
    .line 1738
    move/from16 v32, v7

    .line 1739
    .line 1740
    move v11, v10

    .line 1741
    move v14, v12

    .line 1742
    move/from16 v13, v18

    .line 1743
    .line 1744
    move/from16 v8, v19

    .line 1745
    .line 1746
    const/4 v5, 0x0

    .line 1747
    const/16 v12, 0xc

    .line 1748
    .line 1749
    :goto_31
    add-int/lit8 v7, v32, 0x1

    .line 1750
    .line 1751
    move/from16 v19, v8

    .line 1752
    .line 1753
    move v10, v11

    .line 1754
    move/from16 v18, v13

    .line 1755
    .line 1756
    move v12, v14

    .line 1757
    move/from16 v2, v24

    .line 1758
    .line 1759
    move/from16 v6, v25

    .line 1760
    .line 1761
    move-object/from16 v5, v26

    .line 1762
    .line 1763
    goto/16 :goto_a

    .line 1764
    .line 1765
    :cond_4c
    move/from16 v8, v19

    .line 1766
    .line 1767
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzfu;->zzb:Ljava/util/List;

    .line 1768
    .line 1769
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzako;->zzn(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzq;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v2

    .line 1773
    if-eqz v2, :cond_4d

    .line 1774
    .line 1775
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1776
    .line 1777
    .line 1778
    move-result v3

    .line 1779
    move v5, v8

    .line 1780
    :goto_32
    if-ge v5, v3, :cond_4d

    .line 1781
    .line 1782
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v4

    .line 1786
    check-cast v4, Lcom/google/android/gms/internal/ads/zzakn;

    .line 1787
    .line 1788
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzb(Lcom/google/android/gms/internal/ads/zzq;)V

    .line 1789
    .line 1790
    .line 1791
    add-int/lit8 v5, v5, 0x1

    .line 1792
    .line 1793
    goto :goto_32

    .line 1794
    :cond_4d
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzz:J

    .line 1795
    .line 1796
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    cmp-long v2, v2, v21

    .line 1802
    .line 1803
    if-eqz v2, :cond_0

    .line 1804
    .line 1805
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 1806
    .line 1807
    .line 1808
    move-result v2

    .line 1809
    move v13, v8

    .line 1810
    :goto_33
    if-ge v13, v2, :cond_50

    .line 1811
    .line 1812
    invoke-virtual {v1, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v3

    .line 1816
    check-cast v3, Lcom/google/android/gms/internal/ads/zzakn;

    .line 1817
    .line 1818
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzz:J

    .line 1819
    .line 1820
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzakn;->zzf:I

    .line 1821
    .line 1822
    :goto_34
    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    .line 1823
    .line 1824
    iget v8, v7, Lcom/google/android/gms/internal/ads/zzale;->zze:I

    .line 1825
    .line 1826
    if-ge v6, v8, :cond_4f

    .line 1827
    .line 1828
    iget-object v8, v7, Lcom/google/android/gms/internal/ads/zzale;->zzi:[J

    .line 1829
    .line 1830
    aget-wide v9, v8, v6

    .line 1831
    .line 1832
    cmp-long v8, v9, v4

    .line 1833
    .line 1834
    if-gtz v8, :cond_4f

    .line 1835
    .line 1836
    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzale;->zzj:[Z

    .line 1837
    .line 1838
    aget-boolean v7, v7, v6

    .line 1839
    .line 1840
    if-eqz v7, :cond_4e

    .line 1841
    .line 1842
    iput v6, v3, Lcom/google/android/gms/internal/ads/zzakn;->zzi:I

    .line 1843
    .line 1844
    :cond_4e
    add-int/lit8 v6, v6, 0x1

    .line 1845
    .line 1846
    goto :goto_34

    .line 1847
    :cond_4f
    add-int/lit8 v13, v13, 0x1

    .line 1848
    .line 1849
    goto :goto_33

    .line 1850
    :cond_50
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzako;->zzz:J

    .line 1856
    .line 1857
    goto/16 :goto_0

    .line 1858
    .line 1859
    :cond_51
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v2

    .line 1863
    if-nez v2, :cond_0

    .line 1864
    .line 1865
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v1

    .line 1869
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfu;

    .line 1870
    .line 1871
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfu;->zzb(Lcom/google/android/gms/internal/ads/zzfu;)V

    .line 1872
    .line 1873
    .line 1874
    goto/16 :goto_0

    .line 1875
    .line 1876
    :cond_52
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzako;->zzi()V

    .line 1877
    .line 1878
    .line 1879
    return-void
.end method

.method private static zzk(I)I
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    return p0

    .line 4
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1b

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const-string v0, "Unexpected negative value: "

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0
.end method

.method private static zzl(Lcom/google/android/gms/internal/ads/zzer;ILcom/google/android/gms/internal/ads/zzale;)V
    .locals 3

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget v0, Lcom/google/android/gms/internal/ads/zzakh;->zza:I

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p1, v0

    .line 24
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    iget-object p0, p2, Lcom/google/android/gms/internal/ads/zzale;->zzl:[Z

    .line 31
    .line 32
    iget p1, p2, Lcom/google/android/gms/internal/ads/zzale;->zze:I

    .line 33
    .line 34
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget v2, p2, Lcom/google/android/gms/internal/ads/zzale;->zze:I

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    iget-object v2, p2, Lcom/google/android/gms/internal/ads/zzale;->zzl:[Z

    .line 43
    .line 44
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzale;->zza(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzale;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {p0, v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 68
    .line 69
    .line 70
    iput-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzale;->zzo:Z

    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    add-int/lit8 p0, p0, 0x3a

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    new-instance p2, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    add-int/2addr p0, p1

    .line 94
    invoke-direct {p2, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 95
    .line 96
    .line 97
    const-string p0, "Senc sample count "

    .line 98
    .line 99
    const-string p1, " is different from fragment sample count"

    .line 100
    .line 101
    invoke-static {p2, p0, v1, p1, v2}, Ls/c;->c(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const/4 p1, 0x0

    .line 106
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    throw p0

    .line 111
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 112
    .line 113
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    throw p0
.end method

.method private static zzm(Lcom/google/android/gms/internal/ads/zzer;J)Landroid/util/Pair;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_0
    add-long v5, v5, p1

    .line 35
    .line 36
    move-wide v10, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    const-wide/32 v5, 0xf4240

    .line 48
    .line 49
    .line 50
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 51
    .line 52
    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v12

    .line 56
    const/4 v1, 0x2

    .line 57
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    new-array v14, v1, [I

    .line 65
    .line 66
    new-array v15, v1, [J

    .line 67
    .line 68
    new-array v5, v1, [J

    .line 69
    .line 70
    new-array v6, v1, [J

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    move-wide/from16 v16, v10

    .line 74
    .line 75
    move-wide/from16 v18, v12

    .line 76
    .line 77
    move v10, v9

    .line 78
    :goto_2
    if-ge v10, v1, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    const/high16 v11, -0x80000000

    .line 85
    .line 86
    and-int/2addr v11, v9

    .line 87
    if-nez v11, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 90
    .line 91
    .line 92
    move-result-wide v20

    .line 93
    const v11, 0x7fffffff

    .line 94
    .line 95
    .line 96
    and-int/2addr v9, v11

    .line 97
    aput v9, v14, v10

    .line 98
    .line 99
    aput-wide v16, v15, v10

    .line 100
    .line 101
    aput-wide v18, v6, v10

    .line 102
    .line 103
    add-long v3, v3, v20

    .line 104
    .line 105
    move-object v9, v5

    .line 106
    move-object v11, v6

    .line 107
    const-wide/32 v5, 0xf4240

    .line 108
    .line 109
    .line 110
    move-object/from16 v18, v9

    .line 111
    .line 112
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 113
    .line 114
    move-object v2, v11

    .line 115
    move-object/from16 v11, v18

    .line 116
    .line 117
    invoke-static/range {v3 .. v9}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    aget-wide v19, v2, v10

    .line 122
    .line 123
    sub-long v19, v5, v19

    .line 124
    .line 125
    aput-wide v19, v11, v10

    .line 126
    .line 127
    const/4 v9, 0x4

    .line 128
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 129
    .line 130
    .line 131
    aget v9, v14, v10

    .line 132
    .line 133
    move/from16 p1, v1

    .line 134
    .line 135
    int-to-long v0, v9

    .line 136
    add-long v16, v16, v0

    .line 137
    .line 138
    add-int/lit8 v10, v10, 0x1

    .line 139
    .line 140
    move-object/from16 v0, p0

    .line 141
    .line 142
    move/from16 v1, p1

    .line 143
    .line 144
    move-wide/from16 v18, v5

    .line 145
    .line 146
    move-object v5, v11

    .line 147
    move-object v6, v2

    .line 148
    const/4 v2, 0x4

    .line 149
    goto :goto_2

    .line 150
    :cond_1
    const-string v0, "Unhandled indirect reference"

    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    throw v0

    .line 158
    :cond_2
    move-object v11, v5

    .line 159
    move-object v2, v6

    .line 160
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaei;

    .line 165
    .line 166
    invoke-direct {v1, v14, v15, v11, v2}, Lcom/google/android/gms/internal/ads/zzaei;-><init>([I[J[J[J)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    return-object v0
.end method

.method private static zzn(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzq;
    .locals 19

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v3, v1

    .line 7
    const/4 v4, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_b

    .line 9
    .line 10
    move-object/from16 v5, p0

    .line 11
    .line 12
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    check-cast v6, Lcom/google/android/gms/internal/ads/zzfv;

    .line 17
    .line 18
    iget v7, v6, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    .line 19
    .line 20
    const v8, 0x70737368    # 3.013775E29f

    .line 21
    .line 22
    .line 23
    if-ne v7, v8, :cond_a

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    .line 33
    .line 34
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-instance v7, Lcom/google/android/gms/internal/ads/zzer;

    .line 39
    .line 40
    invoke-direct {v7, v6}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    const/16 v10, 0x20

    .line 48
    .line 49
    if-ge v9, v10, :cond_1

    .line 50
    .line 51
    :goto_1
    move/from16 v16, v3

    .line 52
    .line 53
    :goto_2
    const/4 v2, 0x0

    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    invoke-virtual {v7, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    const-string v11, "PsshAtomUtil"

    .line 68
    .line 69
    if-eq v10, v9, :cond_2

    .line 70
    .line 71
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    add-int/lit8 v7, v7, 0x34

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    new-instance v12, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    add-int/2addr v7, v8

    .line 92
    invoke-direct {v12, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const-string v7, "Advertised atom size ("

    .line 96
    .line 97
    const-string v8, ") does not match buffer size: "

    .line 98
    .line 99
    invoke-static {v12, v7, v10, v8, v9}, Ls/c;->c(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {v11, v7}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-eq v9, v8, :cond_3

    .line 112
    .line 113
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    new-instance v8, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    add-int/lit8 v7, v7, 0x17

    .line 124
    .line 125
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 126
    .line 127
    .line 128
    const-string v7, "Atom type is not pssh: "

    .line 129
    .line 130
    invoke-static {v8, v7, v9, v11}, Landroidx/emoji2/text/u;->r(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    const/4 v9, 0x1

    .line 143
    if-le v8, v9, :cond_4

    .line 144
    .line 145
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    new-instance v9, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    add-int/lit8 v7, v7, 0x1a

    .line 156
    .line 157
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 158
    .line 159
    .line 160
    const-string v7, "Unsupported pssh version: "

    .line 161
    .line 162
    invoke-static {v9, v7, v8, v11}, Landroidx/emoji2/text/u;->r(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    new-instance v10, Ljava/util/UUID;

    .line 167
    .line 168
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzD()J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzD()J

    .line 173
    .line 174
    .line 175
    move-result-wide v14

    .line 176
    invoke-direct {v10, v12, v13, v14, v15}, Ljava/util/UUID;-><init>(JJ)V

    .line 177
    .line 178
    .line 179
    if-ne v8, v9, :cond_6

    .line 180
    .line 181
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    new-array v12, v9, [Ljava/util/UUID;

    .line 186
    .line 187
    move v13, v1

    .line 188
    :goto_3
    if-ge v13, v9, :cond_5

    .line 189
    .line 190
    new-instance v14, Ljava/util/UUID;

    .line 191
    .line 192
    move/from16 v16, v3

    .line 193
    .line 194
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzD()J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    move-object/from16 v17, v12

    .line 199
    .line 200
    move/from16 v18, v13

    .line 201
    .line 202
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzD()J

    .line 203
    .line 204
    .line 205
    move-result-wide v12

    .line 206
    invoke-direct {v14, v2, v3, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    .line 207
    .line 208
    .line 209
    aput-object v14, v17, v18

    .line 210
    .line 211
    add-int/lit8 v13, v18, 0x1

    .line 212
    .line 213
    move/from16 v3, v16

    .line 214
    .line 215
    move-object/from16 v12, v17

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_5
    move-object/from16 v17, v12

    .line 219
    .line 220
    :goto_4
    move/from16 v16, v3

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_6
    const/4 v12, 0x0

    .line 224
    goto :goto_4

    .line 225
    :goto_5
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-eq v2, v3, :cond_7

    .line 234
    .line 235
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    add-int/lit8 v7, v7, 0x31

    .line 248
    .line 249
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v8

    .line 253
    new-instance v9, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    add-int/2addr v7, v8

    .line 256
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 257
    .line 258
    .line 259
    const-string v7, "Atom data size ("

    .line 260
    .line 261
    const-string v8, ") does not match the bytes left: "

    .line 262
    .line 263
    invoke-static {v9, v7, v2, v8, v3}, Ls/c;->c(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_2

    .line 271
    .line 272
    :cond_7
    new-array v3, v2, [B

    .line 273
    .line 274
    invoke-virtual {v7, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 275
    .line 276
    .line 277
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaky;

    .line 278
    .line 279
    invoke-direct {v2, v10, v8, v3, v12}, Lcom/google/android/gms/internal/ads/zzaky;-><init>(Ljava/util/UUID;I[B[Ljava/util/UUID;)V

    .line 280
    .line 281
    .line 282
    :goto_6
    if-nez v2, :cond_8

    .line 283
    .line 284
    const/4 v2, 0x0

    .line 285
    goto :goto_7

    .line 286
    :cond_8
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaky;->zza:Ljava/util/UUID;

    .line 287
    .line 288
    :goto_7
    if-nez v2, :cond_9

    .line 289
    .line 290
    const-string v2, "FragmentedMp4Extractor"

    .line 291
    .line 292
    const-string v3, "Skipped pssh atom (failed to extract uuid)"

    .line 293
    .line 294
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto :goto_8

    .line 298
    :cond_9
    new-instance v3, Lcom/google/android/gms/internal/ads/zzp;

    .line 299
    .line 300
    const-string v7, "video/mp4"

    .line 301
    .line 302
    const/4 v15, 0x0

    .line 303
    invoke-direct {v3, v2, v15, v7, v6}, Lcom/google/android/gms/internal/ads/zzp;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_a
    move/from16 v16, v3

    .line 311
    .line 312
    :goto_8
    const/4 v15, 0x0

    .line 313
    :goto_9
    add-int/lit8 v3, v16, 0x1

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_b
    const/4 v15, 0x0

    .line 318
    if-nez v4, :cond_c

    .line 319
    .line 320
    return-object v15

    .line 321
    :cond_c
    new-instance v0, Lcom/google/android/gms/internal/ads/zzq;

    .line 322
    .line 323
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/zzq;-><init>(Ljava/util/List;)V

    .line 324
    .line 325
    .line 326
    return-object v0
.end method

.method private static final zzo(Landroid/util/SparseArray;I)Lcom/google/android/gms/internal/ads/zzaki;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/google/android/gms/internal/ads/zzaki;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lcom/google/android/gms/internal/ads/zzaki;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzalb;->zza(Lcom/google/android/gms/internal/ads/zzaev;)Lcom/google/android/gms/internal/ads/zzagc;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzguf;->zzj(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzr:Lcom/google/android/gms/internal/ads/zzguf;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzr:Lcom/google/android/gms/internal/ads/zzguf;

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzd:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzc:Lcom/google/android/gms/internal/ads/zzamd;

    .line 8
    .line 9
    new-instance v2, Lcom/google/android/gms/internal/ads/zzamg;

    .line 10
    .line 11
    invoke-direct {v2, p1, v1}, Lcom/google/android/gms/internal/ads/zzamg;-><init>(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzamd;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v2

    .line 15
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzako;->zzi()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    new-array p1, p1, [Lcom/google/android/gms/internal/ads/zzagh;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 24
    .line 25
    and-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    .line 33
    .line 34
    const/4 v3, 0x5

    .line 35
    invoke-interface {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    aput-object v0, p1, v2

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    const/16 v1, 0x65

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p1, v2

    .line 46
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 47
    .line 48
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzfj;->zzb([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, [Lcom/google/android/gms/internal/ads/zzagh;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 55
    .line 56
    array-length v0, p1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    if-ge v3, v0, :cond_2

    .line 59
    .line 60
    aget-object v4, p1, v3

    .line 61
    .line 62
    sget-object v5, Lcom/google/android/gms/internal/ads/zzako;->zzb:Lcom/google/android/gms/internal/ads/zzv;

    .line 63
    .line 64
    invoke-interface {v4, v5}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zze:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    new-array v0, v0, [Lcom/google/android/gms/internal/ads/zzagh;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 79
    .line 80
    :goto_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 81
    .line 82
    array-length v0, v0

    .line 83
    if-ge v2, v0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    .line 86
    .line 87
    add-int/lit8 v3, v1, 0x1

    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    invoke-interface {v0, v1, v4}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Lcom/google/android/gms/internal/ads/zzv;

    .line 99
    .line 100
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 104
    .line 105
    aput-object v0, v1, v2

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    move v1, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    :goto_0
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    const v4, 0x656d7367

    const/4 v5, 0x2

    const v6, 0x73696478

    const/4 v7, 0x0

    const/16 v8, 0x8

    const/4 v9, 0x1

    if-eqz v2, :cond_34

    const-string v11, "FragmentedMp4Extractor"

    if-eq v2, v9, :cond_29

    const-wide v12, 0x7fffffffffffffffL

    const/4 v4, 0x3

    if-eq v2, v5, :cond_24

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzC:Lcom/google/android/gms/internal/ads/zzakn;

    if-nez v2, :cond_7

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v6

    move-wide v13, v12

    const/4 v15, 0x0

    move-object v12, v7

    :goto_1
    if-ge v15, v6, :cond_3

    .line 2
    invoke-virtual {v2, v15}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move/from16 v17, v5

    move-object/from16 v5, v16

    check-cast v5, Lcom/google/android/gms/internal/ads/zzakn;

    .line 3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzakn;->zzk()Z

    move-result v16

    if-nez v16, :cond_0

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzakn;->zzf:I

    iget-object v10, v5, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    iget v10, v10, Lcom/google/android/gms/internal/ads/zzalf;->zzb:I

    if-eq v3, v10, :cond_2

    :cond_0
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzakn;->zzk()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, v5, Lcom/google/android/gms/internal/ads/zzakn;->zzh:I

    iget-object v10, v5, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    iget v10, v10, Lcom/google/android/gms/internal/ads/zzale;->zzd:I

    if-ne v3, v10, :cond_1

    goto :goto_2

    .line 4
    :cond_1
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzakn;->zze()J

    move-result-wide v19

    cmp-long v3, v19, v13

    if-gez v3, :cond_2

    move-object v12, v5

    move-wide/from16 v13, v19

    :cond_2
    :goto_2
    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v17

    goto :goto_1

    :cond_3
    move/from16 v17, v5

    if-nez v12, :cond_5

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzx:J

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v4

    sub-long/2addr v2, v4

    long-to-int v2, v2

    if-ltz v2, :cond_4

    .line 5
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzako;->zzi()V

    goto :goto_0

    .line 7
    :cond_4
    const-string v1, "Offset to end of mdat was negative."

    .line 8
    invoke-static {v1, v7}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 9
    :cond_5
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzakn;->zze()J

    move-result-wide v2

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v5

    sub-long/2addr v2, v5

    long-to-int v2, v2

    if-gez v2, :cond_6

    const-string v2, "Ignoring negative offset to sample data."

    .line 10
    invoke-static {v11, v2}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 11
    :cond_6
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    iput-object v12, v0, Lcom/google/android/gms/internal/ads/zzako;->zzC:Lcom/google/android/gms/internal/ads/zzakn;

    move-object v2, v12

    goto :goto_3

    :cond_7
    move/from16 v17, v5

    :goto_3
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    const/4 v5, 0x4

    if-ne v3, v4, :cond_10

    .line 12
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzf()I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    .line 13
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    const-string v6, "video/avc"

    .line 14
    invoke-static {v3, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "video/hevc"

    .line 15
    invoke-static {v3, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_8
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzG:Z

    .line 16
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzf:I

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzi:I

    if-ge v3, v6, :cond_d

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    .line 17
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 18
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzj()Lcom/google/android/gms/internal/ads/zzald;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_4

    .line 19
    :cond_9
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzale;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzald;->zzd:I

    if-eqz v1, :cond_a

    .line 20
    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    :cond_a
    iget v1, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzf:I

    .line 21
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzale;->zzb(I)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 22
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzt()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    invoke-virtual {v5, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 23
    :cond_b
    :goto_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzh()Z

    move-result v1

    if-nez v1, :cond_c

    iput-object v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzC:Lcom/google/android/gms/internal/ads/zzakn;

    :cond_c
    move v1, v4

    goto/16 :goto_11

    .line 24
    :cond_d
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzh:I

    if-ne v3, v9, :cond_e

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    add-int/lit8 v3, v3, -0x8

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    .line 25
    invoke-interface {v1, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 26
    :cond_e
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    const-string v6, "audio/ac4"

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    const/4 v6, 0x7

    .line 27
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzakn;->zzi(II)I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzako;->zzk:Lcom/google/android/gms/internal/ads/zzer;

    .line 28
    invoke-static {v3, v8}, Lcom/google/android/gms/internal/ads/zzady;->zzc(ILcom/google/android/gms/internal/ads/zzer;)V

    .line 29
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zza:Lcom/google/android/gms/internal/ads/zzagh;

    invoke-interface {v3, v8, v6}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    add-int/2addr v3, v6

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    const/4 v6, 0x0

    goto :goto_5

    .line 30
    :cond_f
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    const/4 v6, 0x0

    .line 31
    invoke-virtual {v2, v3, v6}, Lcom/google/android/gms/internal/ads/zzakn;->zzi(II)I

    move-result v3

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    .line 32
    :goto_5
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    add-int/2addr v8, v3

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    iput v6, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    .line 33
    :cond_10
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzakn;->zzd:Lcom/google/android/gms/internal/ads/zzalf;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzalf;->zza:Lcom/google/android/gms/internal/ads/zzalc;

    .line 34
    iget-object v6, v2, Lcom/google/android/gms/internal/ads/zzakn;->zza:Lcom/google/android/gms/internal/ads/zzagh;

    .line 35
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzd()J

    move-result-wide v10

    iget v8, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzk:I

    if-nez v8, :cond_11

    :goto_6
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    if-ge v3, v5, :cond_1d

    sub-int/2addr v5, v3

    const/4 v12, 0x0

    .line 36
    invoke-interface {v6, v1, v5, v12}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    move-result v3

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    add-int/2addr v5, v3

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    goto :goto_6

    :cond_11
    const/4 v12, 0x0

    .line 37
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzako;->zzh:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v14

    .line 38
    aput-byte v12, v14, v12

    .line 39
    aput-byte v12, v14, v9

    .line 40
    aput-byte v12, v14, v17

    rsub-int/lit8 v12, v8, 0x4

    :goto_7
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    if-ge v15, v4, :cond_1d

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    if-nez v4, :cond_18

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 41
    array-length v4, v4

    if-gtz v4, :cond_13

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzG:Z

    if-nez v4, :cond_12

    goto :goto_9

    :cond_12
    :goto_8
    const/4 v4, 0x0

    goto :goto_a

    :cond_13
    :goto_9
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 42
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgm;->zzc(Lcom/google/android/gms/internal/ads/zzv;)I

    move-result v4

    add-int v15, v8, v4

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    sub-int/2addr v7, v9

    if-le v15, v7, :cond_14

    goto :goto_8

    :cond_14
    :goto_a
    add-int v7, v8, v4

    .line 43
    invoke-interface {v1, v14, v12, v7}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    const/4 v7, 0x0

    .line 44
    invoke-virtual {v13, v7}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 45
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    move-result v9

    if-ltz v9, :cond_17

    sub-int/2addr v9, v4

    .line 46
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzg:Lcom/google/android/gms/internal/ads/zzer;

    .line 47
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 48
    invoke-interface {v6, v9, v5}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    add-int/2addr v7, v5

    iput v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    add-int/2addr v7, v12

    iput v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 49
    array-length v7, v7

    if-lez v7, :cond_15

    if-lez v4, :cond_15

    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    aget-byte v9, v14, v5

    .line 50
    invoke-static {v7, v9}, Lcom/google/android/gms/internal/ads/zzgm;->zzb(Lcom/google/android/gms/internal/ads/zzv;B)Z

    move-result v7

    if-eqz v7, :cond_15

    const/4 v7, 0x1

    goto :goto_b

    :cond_15
    const/4 v7, 0x0

    :goto_b
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzH:Z

    .line 51
    invoke-interface {v6, v13, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    add-int/2addr v7, v4

    iput v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    if-lez v4, :cond_16

    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzG:Z

    if-nez v7, :cond_16

    iget-object v7, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    .line 52
    invoke-static {v14, v5, v4, v7}, Lcom/google/android/gms/internal/ads/zzgm;->zzd([BIILcom/google/android/gms/internal/ads/zzv;)Z

    move-result v4

    if-eqz v4, :cond_16

    const/4 v4, 0x1

    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzG:Z

    move v9, v4

    const/4 v4, 0x3

    const/4 v7, 0x0

    goto :goto_7

    :cond_16
    :goto_c
    const/4 v4, 0x3

    const/4 v7, 0x0

    const/4 v9, 0x1

    goto/16 :goto_7

    .line 53
    :cond_17
    const-string v1, "Invalid NAL length"

    const/4 v2, 0x0

    .line 54
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 55
    :cond_18
    iget-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzH:Z

    if-eqz v7, :cond_1b

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzi:Lcom/google/android/gms/internal/ads/zzer;

    .line 56
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v4

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    const/4 v15, 0x0

    .line 57
    invoke-interface {v1, v4, v15, v9}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    .line 58
    invoke-interface {v6, v7, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    iget v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v9

    move/from16 p2, v5

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    move-result v5

    .line 59
    invoke-static {v9, v5}, Lcom/google/android/gms/internal/ads/zzgm;->zza([BI)I

    move-result v5

    .line 60
    invoke-virtual {v7, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 61
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzalc;->zzg:Lcom/google/android/gms/internal/ads/zzv;

    iget v5, v5, Lcom/google/android/gms/internal/ads/zzv;->zzq:I

    const/4 v9, -0x1

    if-ne v5, v9, :cond_19

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzp:Lcom/google/android/gms/internal/ads/zzgq;

    .line 62
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgq;->zzb()I

    move-result v9

    if-eqz v9, :cond_1a

    .line 63
    invoke-virtual {v5, v15}, Lcom/google/android/gms/internal/ads/zzgq;->zza(I)V

    goto :goto_d

    .line 64
    :cond_19
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzp:Lcom/google/android/gms/internal/ads/zzgq;

    .line 65
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzgq;->zzb()I

    move-result v15

    if-eq v15, v5, :cond_1a

    .line 66
    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/ads/zzgq;->zza(I)V

    .line 67
    :cond_1a
    :goto_d
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzp:Lcom/google/android/gms/internal/ads/zzgq;

    .line 68
    invoke-virtual {v5, v10, v11, v7}, Lcom/google/android/gms/internal/ads/zzgq;->zzc(JLcom/google/android/gms/internal/ads/zzer;)V

    .line 69
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzg()I

    move-result v7

    and-int/lit8 v7, v7, 0x4

    if-eqz v7, :cond_1c

    .line 70
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzgq;->zze()V

    goto :goto_e

    :cond_1b
    move/from16 p2, v5

    const/4 v15, 0x0

    .line 71
    invoke-interface {v6, v1, v4, v15}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    move-result v4

    .line 72
    :cond_1c
    :goto_e
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    add-int/2addr v5, v4

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzE:I

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    sub-int/2addr v5, v4

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzF:I

    move/from16 v5, p2

    goto :goto_c

    .line 73
    :cond_1d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzg()I

    move-result v1

    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzG:Z

    if-nez v3, :cond_1e

    const/high16 v3, 0x4000000

    or-int/2addr v1, v3

    :cond_1e
    move/from16 v22, v1

    .line 74
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzj()Lcom/google/android/gms/internal/ads/zzald;

    move-result-object v1

    if-eqz v1, :cond_1f

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzald;->zzc:Lcom/google/android/gms/internal/ads/zzagg;

    move-object/from16 v25, v1

    goto :goto_f

    :cond_1f
    const/16 v25, 0x0

    :goto_f
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzD:I

    const/16 v24, 0x0

    move/from16 v23, v1

    move-object/from16 v19, v6

    move-wide/from16 v20, v10

    .line 75
    invoke-interface/range {v19 .. v25}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    :cond_20
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzo:Ljava/util/ArrayDeque;

    .line 76
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_22

    .line 77
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzakm;

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    .line 78
    iget v8, v1, Lcom/google/android/gms/internal/ads/zzakm;->zzc:I

    sub-int/2addr v3, v8

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    .line 79
    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/zzakm;->zza:J

    .line 80
    iget-boolean v1, v1, Lcom/google/android/gms/internal/ads/zzakm;->zzb:Z

    if-eqz v1, :cond_21

    add-long v3, v3, v20

    :cond_21
    move-wide v5, v3

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 81
    array-length v3, v1

    const/4 v11, 0x0

    :goto_10
    if-ge v11, v3, :cond_20

    aget-object v4, v1, v11

    iget v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    const/4 v10, 0x0

    const/4 v7, 0x1

    .line 82
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_10

    .line 83
    :cond_22
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzh()Z

    move-result v1

    if-nez v1, :cond_23

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzC:Lcom/google/android/gms/internal/ads/zzakn;

    :cond_23
    const/4 v1, 0x3

    .line 84
    :goto_11
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    const/16 v18, 0x0

    return v18

    .line 85
    :cond_24
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    .line 86
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_12
    if-ge v4, v3, :cond_26

    .line 87
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/ads/zzakn;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    iget-boolean v7, v6, Lcom/google/android/gms/internal/ads/zzale;->zzo:Z

    if-eqz v7, :cond_25

    iget-wide v6, v6, Lcom/google/android/gms/internal/ads/zzale;->zzc:J

    cmp-long v8, v6, v12

    if-gez v8, :cond_25

    .line 88
    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzakn;

    move-wide v12, v6

    :cond_25
    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :cond_26
    if-nez v5, :cond_27

    const/4 v2, 0x3

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    goto/16 :goto_0

    :cond_27
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v2

    sub-long/2addr v12, v2

    long-to-int v2, v12

    if-ltz v2, :cond_28

    .line 89
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    iget-object v2, v5, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzale;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    move-result v5

    const/4 v15, 0x0

    .line 90
    invoke-interface {v1, v4, v15, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 91
    invoke-virtual {v3, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    iput-boolean v15, v2, Lcom/google/android/gms/internal/ads/zzale;->zzo:Z

    goto/16 :goto_0

    .line 92
    :cond_28
    const-string v1, "Offset to encryption data was negative."

    const/4 v2, 0x0

    .line 93
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 94
    :cond_29
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    int-to-long v9, v5

    sub-long/2addr v2, v9

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzw:Lcom/google/android/gms/internal/ads/zzer;

    long-to-int v2, v2

    if-eqz v5, :cond_32

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v3

    .line 95
    invoke-interface {v1, v3, v8, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzfv;

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    invoke-direct {v2, v3, v5}, Lcom/google/android/gms/internal/ads/zzfv;-><init>(ILcom/google/android/gms/internal/ads/zzer;)V

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzn:Ljava/util/ArrayDeque;

    .line 96
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2a

    .line 97
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzfu;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzfu;->zza(Lcom/google/android/gms/internal/ads/zzfv;)V

    goto/16 :goto_18

    .line 98
    :cond_2a
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzfw;->zzd:I

    if-ne v3, v6, :cond_2b

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v3

    .line 99
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzako;->zzm(Lcom/google/android/gms/internal/ads/zzer;J)Landroid/util/Pair;

    move-result-object v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzq:Lcom/google/android/gms/internal/ads/zzaej;

    .line 100
    iget-object v4, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/gms/internal/ads/zzaei;

    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzaej;->zza(Lcom/google/android/gms/internal/ads/zzaei;)V

    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzL:Z

    if-nez v3, :cond_33

    .line 101
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzB:J

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    .line 102
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzafy;

    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    const/4 v4, 0x1

    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzL:Z

    goto/16 :goto_18

    :cond_2b
    if-ne v3, v4, :cond_33

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 103
    array-length v3, v3

    if-eqz v3, :cond_33

    .line 104
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 105
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    move-result v3

    .line 106
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzakh;->zza(I)I

    move-result v3

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v3, :cond_2d

    const/4 v6, 0x1

    if-eq v3, v6, :cond_2c

    .line 107
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x23

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Skipping unsupported emsg version: "

    .line 108
    invoke-static {v4, v2, v3, v11}, Landroidx/emoji2/text/u;->r(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)V

    goto/16 :goto_18

    .line 109
    :cond_2c
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v24

    .line 110
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    move-result-wide v20

    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v22, 0xf4240

    .line 111
    invoke-static/range {v20 .. v26}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    .line 112
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v20

    const-wide/16 v22, 0x3e8

    .line 113
    invoke-static/range {v20 .. v26}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    .line 114
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v10

    const/4 v15, 0x0

    .line 115
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    move-result-object v3

    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    move-result-object v12

    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide/from16 v23, v8

    move-wide/from16 v25, v10

    move-wide v9, v4

    move-wide v7, v6

    :goto_13
    move-object/from16 v21, v3

    move-object/from16 v22, v12

    goto :goto_15

    :cond_2d
    const/4 v15, 0x0

    .line 119
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzM(C)Ljava/lang/String;

    move-result-object v12

    .line 122
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v24

    .line 124
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v20

    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v22, 0xf4240

    .line 125
    invoke-static/range {v20 .. v26}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v6

    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzako;->zzB:J

    cmp-long v10, v8, v4

    if-eqz v10, :cond_2e

    add-long/2addr v8, v6

    goto :goto_14

    :cond_2e
    move-wide v8, v4

    .line 126
    :goto_14
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v20

    const-wide/16 v22, 0x3e8

    .line 127
    invoke-static/range {v20 .. v26}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    move-result-wide v10

    .line 128
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v13

    move-wide/from16 v23, v10

    move-wide/from16 v25, v13

    move-wide/from16 v28, v8

    move-wide v9, v6

    move-wide/from16 v7, v28

    goto :goto_13

    .line 129
    :goto_15
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    move-result v3

    new-array v3, v3, [B

    .line 130
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    move-result v6

    const/4 v15, 0x0

    invoke-virtual {v2, v3, v15, v6}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 131
    new-instance v20, Lcom/google/android/gms/internal/ads/zzahy;

    move-object/from16 v27, v3

    invoke-direct/range {v20 .. v27}, Lcom/google/android/gms/internal/ads/zzahy;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    move-object/from16 v2, v20

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzl:Lcom/google/android/gms/internal/ads/zzahz;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzer;

    .line 132
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzahz;->zza(Lcom/google/android/gms/internal/ads/zzahy;)[B

    move-result-object v2

    invoke-direct {v6, v2}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    .line 133
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    move-result v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 134
    array-length v11, v3

    const/4 v12, 0x0

    :goto_16
    if-ge v12, v11, :cond_2f

    aget-object v13, v3, v12

    const/4 v15, 0x0

    .line 135
    invoke-virtual {v6, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 136
    invoke-interface {v13, v6, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_16

    :cond_2f
    cmp-long v3, v7, v4

    if-nez v3, :cond_30

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzo:Ljava/util/ArrayDeque;

    new-instance v4, Lcom/google/android/gms/internal/ads/zzakm;

    const/4 v6, 0x1

    invoke-direct {v4, v9, v10, v6, v2}, Lcom/google/android/gms/internal/ads/zzakm;-><init>(JZI)V

    .line 137
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    goto :goto_18

    :cond_30
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzo:Ljava/util/ArrayDeque;

    .line 138
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_31

    new-instance v4, Lcom/google/android/gms/internal/ads/zzakm;

    const/4 v15, 0x0

    invoke-direct {v4, v7, v8, v15, v2}, Lcom/google/android/gms/internal/ads/zzakm;-><init>(JZI)V

    .line 139
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    add-int/2addr v3, v2

    iput v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    goto :goto_18

    :cond_31
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzako;->zzJ:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 140
    array-length v4, v3

    const/4 v5, 0x0

    :goto_17
    if-ge v5, v4, :cond_33

    aget-object v6, v3, v5

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x1

    move v10, v2

    .line 141
    invoke-interface/range {v6 .. v12}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_17

    .line 142
    :cond_32
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 143
    :cond_33
    :goto_18
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v2

    .line 144
    invoke-direct {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzako;->zzj(J)V

    goto/16 :goto_0

    :cond_34
    move/from16 v17, v5

    .line 145
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    const-wide/16 v9, 0x0

    const-wide/16 v11, -0x1

    if-nez v2, :cond_37

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v3

    const/4 v5, 0x1

    const/4 v15, 0x0

    .line 146
    invoke-interface {v1, v3, v15, v8, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzb([BIIZ)Z

    move-result v3

    if-nez v3, :cond_36

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzM:J

    cmp-long v1, v1, v11

    if-eqz v1, :cond_35

    move-object/from16 v3, p2

    iput-wide v9, v3, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzako;->zzM:J

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzq:Lcom/google/android/gms/internal/ads/zzaej;

    .line 147
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzaej;->zzb()Lcom/google/android/gms/internal/ads/zzaei;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    return v5

    :cond_35
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzako;->zzp:Lcom/google/android/gms/internal/ads/zzgq;

    .line 148
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgq;->zze()V

    const/16 v16, -0x1

    return v16

    :cond_36
    move-object/from16 v3, p2

    iput v8, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    const/4 v15, 0x0

    .line 149
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 150
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    move-result-wide v13

    iput-wide v13, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    .line 151
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    goto :goto_19

    :cond_37
    move-object/from16 v3, p2

    :goto_19
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    const-wide/16 v15, 0x1

    cmp-long v2, v13, v15

    if-nez v2, :cond_38

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v5

    .line 152
    invoke-interface {v1, v5, v8, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    add-int/2addr v5, v8

    iput v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    .line 153
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzJ()J

    move-result-wide v9

    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    goto :goto_1b

    :cond_38
    cmp-long v2, v13, v9

    if-nez v2, :cond_3b

    .line 154
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzo()J

    move-result-wide v9

    cmp-long v2, v9, v11

    if-nez v2, :cond_3a

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzn:Ljava/util/ArrayDeque;

    .line 155
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_39

    .line 156
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzfu;

    iget-wide v9, v2, Lcom/google/android/gms/internal/ads/zzfu;->zza:J

    goto :goto_1a

    :cond_39
    move-wide v9, v11

    :cond_3a
    :goto_1a
    cmp-long v2, v9, v11

    if-eqz v2, :cond_3b

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v13

    sub-long/2addr v9, v13

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    int-to-long v13, v2

    add-long/2addr v9, v13

    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    .line 157
    :cond_3b
    :goto_1b
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    int-to-long v13, v2

    cmp-long v5, v9, v13

    if-gez v5, :cond_3c

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    const v7, 0x66726565

    if-ne v5, v7, :cond_3d

    if-ne v2, v8, :cond_3d

    iput-wide v13, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    move-wide v9, v13

    :cond_3c
    move-wide v15, v11

    goto :goto_1c

    .line 158
    :cond_3d
    const-string v1, "Atom size less than header length (unsupported)."

    .line 159
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 160
    :goto_1c
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzako;->zzM:J

    cmp-long v2, v11, v15

    if-eqz v2, :cond_3f

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    if-ne v2, v6, :cond_3e

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzk:Lcom/google/android/gms/internal/ads/zzer;

    long-to-int v4, v9

    .line 161
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v5

    const/4 v15, 0x0

    .line 162
    invoke-static {v4, v15, v5, v15, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v4

    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    iget v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    int-to-long v11, v5

    sub-long/2addr v9, v11

    long-to-int v5, v9

    .line 163
    invoke-interface {v1, v4, v8, v5}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    new-instance v4, Lcom/google/android/gms/internal/ads/zzfv;

    invoke-direct {v4, v6, v2}, Lcom/google/android/gms/internal/ads/zzfv;-><init>(ILcom/google/android/gms/internal/ads/zzer;)V

    iget-object v2, v4, Lcom/google/android/gms/internal/ads/zzfv;->zza:Lcom/google/android/gms/internal/ads/zzer;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzm()J

    move-result-wide v4

    .line 164
    invoke-static {v2, v4, v5}, Lcom/google/android/gms/internal/ads/zzako;->zzm(Lcom/google/android/gms/internal/ads/zzer;J)Landroid/util/Pair;

    move-result-object v2

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzq:Lcom/google/android/gms/internal/ads/zzaej;

    .line 165
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/internal/ads/zzaei;

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzaej;->zza(Lcom/google/android/gms/internal/ads/zzaei;)V

    goto :goto_1d

    :cond_3e
    sub-long/2addr v9, v13

    long-to-int v2, v9

    const/4 v4, 0x1

    .line 166
    invoke-interface {v1, v2, v4}, Lcom/google/android/gms/internal/ads/zzaev;->zze(IZ)Z

    .line 167
    :goto_1d
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzako;->zzi()V

    goto/16 :goto_0

    .line 168
    :cond_3f
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v9

    sub-long/2addr v9, v13

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    const v5, 0x6d646174

    const v7, 0x6d6f6f66

    if-eq v2, v7, :cond_40

    if-ne v2, v5, :cond_41

    :cond_40
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzL:Z

    if-nez v2, :cond_41

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzI:Lcom/google/android/gms/internal/ads/zzaex;

    new-instance v11, Lcom/google/android/gms/internal/ads/zzafx;

    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzako;->zzA:J

    .line 169
    invoke-direct {v11, v12, v13, v9, v10}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    invoke-interface {v2, v11}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    const/4 v2, 0x1

    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzL:Z

    :cond_41
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    if-ne v2, v7, :cond_42

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    .line 170
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_1e
    if-ge v12, v11, :cond_42

    .line 171
    invoke-virtual {v2, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/zzakn;

    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzakn;->zzb:Lcom/google/android/gms/internal/ads/zzale;

    iput-wide v9, v13, Lcom/google/android/gms/internal/ads/zzale;->zzc:J

    iput-wide v9, v13, Lcom/google/android/gms/internal/ads/zzale;->zzb:J

    add-int/lit8 v12, v12, 0x1

    goto :goto_1e

    :cond_42
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    if-ne v2, v5, :cond_43

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzako;->zzC:Lcom/google/android/gms/internal/ads/zzakn;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    add-long/2addr v9, v4

    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzako;->zzx:J

    move/from16 v2, v17

    iput v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    goto/16 :goto_0

    :cond_43
    const v5, 0x6d6f6f76

    const v9, 0x6d657461

    if-eq v2, v5, :cond_4a

    const v5, 0x7472616b

    if-eq v2, v5, :cond_4a

    const v5, 0x6d646961

    if-eq v2, v5, :cond_4a

    const v5, 0x6d696e66

    if-eq v2, v5, :cond_4a

    const v5, 0x7374626c

    if-eq v2, v5, :cond_4a

    if-eq v2, v7, :cond_4a

    const v5, 0x74726166

    if-eq v2, v5, :cond_4a

    const v5, 0x6d766578

    if-eq v2, v5, :cond_4a

    const v5, 0x65647473

    if-eq v2, v5, :cond_4a

    if-ne v2, v9, :cond_44

    goto/16 :goto_20

    :cond_44
    const v5, 0x68646c72    # 4.3148E24f

    const-wide/32 v9, 0x7fffffff

    if-eq v2, v5, :cond_47

    const v5, 0x6d646864

    if-eq v2, v5, :cond_47

    const v5, 0x6d766864

    if-eq v2, v5, :cond_47

    if-eq v2, v6, :cond_47

    const v5, 0x73747364

    if-eq v2, v5, :cond_47

    const v5, 0x73747473

    if-eq v2, v5, :cond_47

    const v5, 0x63747473

    if-eq v2, v5, :cond_47

    const v5, 0x73747363

    if-eq v2, v5, :cond_47

    const v5, 0x7374737a

    if-eq v2, v5, :cond_47

    const v5, 0x73747a32

    if-eq v2, v5, :cond_47

    const v5, 0x7374636f

    if-eq v2, v5, :cond_47

    const v5, 0x636f3634

    if-eq v2, v5, :cond_47

    const v5, 0x73747373

    if-eq v2, v5, :cond_47

    const v5, 0x74666474

    if-eq v2, v5, :cond_47

    const v5, 0x74666864

    if-eq v2, v5, :cond_47

    const v5, 0x746b6864

    if-eq v2, v5, :cond_47

    const v5, 0x74726578

    if-eq v2, v5, :cond_47

    const v5, 0x7472756e

    if-eq v2, v5, :cond_47

    const v5, 0x70737368    # 3.013775E29f

    if-eq v2, v5, :cond_47

    const v5, 0x7361697a

    if-eq v2, v5, :cond_47

    const v5, 0x7361696f

    if-eq v2, v5, :cond_47

    const v5, 0x73656e63

    if-eq v2, v5, :cond_47

    const v5, 0x75756964

    if-eq v2, v5, :cond_47

    const v5, 0x73626770

    if-eq v2, v5, :cond_47

    const v5, 0x73677064

    if-eq v2, v5, :cond_47

    const v5, 0x656c7374

    if-eq v2, v5, :cond_47

    const v5, 0x6d656864

    if-eq v2, v5, :cond_47

    if-eq v2, v4, :cond_47

    const v4, 0x75647461

    if-eq v2, v4, :cond_47

    const v4, 0x6b657973

    if-eq v2, v4, :cond_47

    const v4, 0x696c7374

    if-ne v2, v4, :cond_45

    goto :goto_1f

    .line 172
    :cond_45
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    cmp-long v2, v4, v9

    if-gtz v2, :cond_46

    const/4 v2, 0x0

    .line 173
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzw:Lcom/google/android/gms/internal/ads/zzer;

    const/4 v4, 0x1

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    goto/16 :goto_0

    .line 174
    :cond_46
    const-string v1, "Skipping atom with length > 2147483647 (unsupported)."

    .line 175
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 176
    :cond_47
    :goto_1f
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    if-ne v2, v8, :cond_49

    .line 177
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    cmp-long v2, v4, v9

    if-gtz v2, :cond_48

    .line 178
    new-instance v2, Lcom/google/android/gms/internal/ads/zzer;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    long-to-int v4, v4

    invoke-direct {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v5

    const/4 v15, 0x0

    .line 179
    invoke-static {v4, v15, v5, v15, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzw:Lcom/google/android/gms/internal/ads/zzer;

    const/4 v4, 0x1

    iput v4, v0, Lcom/google/android/gms/internal/ads/zzako;->zzs:I

    goto/16 :goto_0

    .line 180
    :cond_48
    const-string v1, "Leaf atom with length > 2147483647 (unsupported)."

    .line 181
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 182
    :cond_49
    const-string v1, "Leaf atom defines extended atom size (unsupported)."

    .line 183
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    move-result-object v1

    throw v1

    .line 184
    :cond_4a
    :goto_20
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    move-result-wide v4

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    add-long/2addr v4, v6

    iget v10, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    int-to-long v10, v10

    cmp-long v6, v6, v10

    if-eqz v6, :cond_4b

    if-ne v2, v9, :cond_4b

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzk:Lcom/google/android/gms/internal/ads/zzer;

    .line 185
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    move-result-object v6

    const/4 v15, 0x0

    .line 186
    invoke-interface {v1, v6, v15, v8}, Lcom/google/android/gms/internal/ads/zzaev;->zzi([BII)V

    .line 187
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzakh;->zzf(Lcom/google/android/gms/internal/ads/zzer;)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    move-result v2

    .line 188
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 189
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    :cond_4b
    const-wide/16 v6, -0x8

    add-long/2addr v4, v6

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzn:Ljava/util/ArrayDeque;

    new-instance v6, Lcom/google/android/gms/internal/ads/zzfu;

    iget v7, v0, Lcom/google/android/gms/internal/ads/zzako;->zzt:I

    .line 190
    invoke-direct {v6, v7, v4, v5}, Lcom/google/android/gms/internal/ads/zzfu;-><init>(IJ)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzako;->zzu:J

    iget v2, v0, Lcom/google/android/gms/internal/ads/zzako;->zzv:I

    int-to-long v8, v2

    cmp-long v2, v6, v8

    if-nez v2, :cond_4c

    .line 191
    invoke-direct {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzako;->zzj(J)V

    goto/16 :goto_0

    .line 192
    :cond_4c
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzako;->zzi()V

    goto/16 :goto_0
.end method

.method public final zze(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzf:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/google/android/gms/internal/ads/zzakn;

    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzakn;->zzc()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzo:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzy:I

    .line 29
    .line 30
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzp:Lcom/google/android/gms/internal/ads/zzgq;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgq;->zzd()V

    .line 33
    .line 34
    .line 35
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzako;->zzz:J

    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzako;->zzn:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzako;->zzi()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final synthetic zzh(JLcom/google/android/gms/internal/ads/zzer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzako;->zzK:[Lcom/google/android/gms/internal/ads/zzagh;

    .line 2
    .line 3
    invoke-static {p1, p2, p3, v0}, Lcom/google/android/gms/internal/ads/zzaeh;->zza(JLcom/google/android/gms/internal/ads/zzer;[Lcom/google/android/gms/internal/ads/zzagh;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
