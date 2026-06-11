.class public final Lcom/google/android/gms/internal/ads/zzajh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaeu;


# static fields
.field public static final synthetic zza:I

.field private static final zzb:[B

.field private static final zzc:[B

.field private static final zzd:[B

.field private static final zze:[B

.field private static final zzf:Ljava/util/UUID;

.field private static final zzg:Ljava/util/Map;


# instance fields
.field private zzA:J

.field private zzB:J

.field private zzC:Z

.field private zzD:Z

.field private zzE:Lcom/google/android/gms/internal/ads/zzajg;

.field private zzF:Z

.field private zzG:I

.field private zzH:J

.field private final zzI:Landroid/util/SparseArray;

.field private zzJ:Z

.field private zzK:J

.field private zzL:I

.field private zzM:J

.field private zzN:J

.field private zzO:I

.field private zzP:Z

.field private zzQ:J

.field private zzR:J

.field private zzS:J

.field private zzT:Z

.field private zzU:I

.field private zzV:J

.field private zzW:J

.field private zzX:I

.field private zzY:I

.field private zzZ:[I

.field private zzaa:I

.field private zzab:I

.field private zzac:I

.field private zzad:I

.field private zzae:Z

.field private zzaf:J

.field private zzag:I

.field private zzah:I

.field private zzai:I

.field private zzaj:Z

.field private zzak:Z

.field private zzal:Z

.field private zzam:I

.field private zzan:B

.field private zzao:Z

.field private zzap:Lcom/google/android/gms/internal/ads/zzaex;

.field private final zzaq:Lcom/google/android/gms/internal/ads/zzaja;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzajj;

.field private final zzi:Landroid/util/SparseArray;

.field private final zzj:Z

.field private final zzk:Z

.field private final zzl:Lcom/google/android/gms/internal/ads/zzamd;

.field private final zzm:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzn:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzo:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzp:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzq:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzr:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzs:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzt:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzu:Lcom/google/android/gms/internal/ads/zzer;

.field private final zzv:Lcom/google/android/gms/internal/ads/zzer;

.field private zzw:Ljava/nio/ByteBuffer;

.field private zzx:J

.field private zzy:J

.field private zzz:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, Lcom/google/android/gms/internal/ads/zzajh;->zzb:[B

    .line 9
    .line 10
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    const-string v2, "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sput-object v1, Lcom/google/android/gms/internal/ads/zzajh;->zzc:[B

    .line 21
    .line 22
    new-array v0, v0, [B

    .line 23
    .line 24
    fill-array-data v0, :array_1

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zzd:[B

    .line 28
    .line 29
    const/16 v0, 0x26

    .line 30
    .line 31
    new-array v0, v0, [B

    .line 32
    .line 33
    fill-array-data v0, :array_2

    .line 34
    .line 35
    .line 36
    sput-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zze:[B

    .line 37
    .line 38
    new-instance v0, Ljava/util/UUID;

    .line 39
    .line 40
    const-wide v1, 0x100000000001000L

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-wide v3, -0x7fffff55ffc7648fL    # -3.607411173533E-312

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zzf:Ljava/util/UUID;

    .line 54
    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "htc_video_rotA-000"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x5a

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "htc_video_rotA-090"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const/16 v1, 0xb4

    .line 82
    .line 83
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "htc_video_rotA-180"

    .line 88
    .line 89
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    const/16 v1, 0x10e

    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v2, "htc_video_rotA-270"

    .line 99
    .line 100
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zzg:Ljava/util/Map;

    .line 108
    .line 109
    return-void

    .line 110
    nop

    .line 111
    :array_0
    .array-data 1
        0x31t
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    :array_1
    .array-data 1
        0x44t
        0x69t
        0x61t
        0x6ct
        0x6ft
        0x67t
        0x75t
        0x65t
        0x3at
        0x20t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2ct
    .end array-data

    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :array_2
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x56t
        0x54t
        0x54t
        0xat
        0xat
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0x20t
        0x2dt
        0x2dt
        0x3et
        0x20t
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x3at
        0x30t
        0x30t
        0x2et
        0x30t
        0x30t
        0x30t
        0xat
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaja;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaja;-><init>()V

    const/4 v1, 0x2

    sget-object v2, Lcom/google/android/gms/internal/ads/zzamd;->zza:Lcom/google/android/gms/internal/ads/zzamd;

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzajh;-><init>(Lcom/google/android/gms/internal/ads/zzaja;ILcom/google/android/gms/internal/ads/zzamd;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaja;ILcom/google/android/gms/internal/ads/zzamd;)V
    .locals 5

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzz:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzA:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzK:J

    const/4 v4, -0x1

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzL:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzN:J

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzQ:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzR:J

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzS:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaq:Lcom/google/android/gms/internal/ads/zzaja;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzajc;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzajc;-><init>(Lcom/google/android/gms/internal/ads/zzajh;[B)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaja;->zza(Lcom/google/android/gms/internal/ads/zzajb;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzl:Lcom/google/android/gms/internal/ads/zzamd;

    new-instance p1, Landroid/util/SparseArray;

    .line 3
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzI:Landroid/util/SparseArray;

    and-int/lit8 p1, p2, 0x1

    const/4 p3, 0x1

    xor-int/2addr p1, p3

    const/4 v0, 0x0

    if-eq p3, p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzj:Z

    and-int/lit8 p1, p2, 0x2

    if-nez p1, :cond_1

    move v0, p3

    :cond_1
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzk:Z

    .line 4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzajj;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzajj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzh:Lcom/google/android/gms/internal/ads/zzajj;

    new-instance p1, Landroid/util/SparseArray;

    .line 5
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/4 p2, 0x4

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 7
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzp:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 8
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzq:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgm;->zza:[B

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzer;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 10
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 11
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzr:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 12
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzs:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    const/16 p2, 0x8

    .line 13
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzt:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 14
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzu:Lcom/google/android/gms/internal/ads/zzer;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzer;

    .line 15
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzer;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzv:Lcom/google/android/gms/internal/ads/zzer;

    new-array p1, p3, [I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzD:Z

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzamd;I)V
    .locals 1

    .line 16
    new-instance p2, Lcom/google/android/gms/internal/ads/zzaja;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzaja;-><init>()V

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzajh;-><init>(Lcom/google/android/gms/internal/ads/zzaja;ILcom/google/android/gms/internal/ads/zzamd;)V

    return-void
.end method

.method private static zzA([II)[I
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-array p0, p1, [I

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    array-length v0, p0

    .line 7
    if-lt v0, p1, :cond_1

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_1
    add-int/2addr v0, v0

    .line 11
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    new-array p0, p0, [I

    .line 16
    .line 17
    return-object p0
.end method

.method private final zzB()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzD:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ge v1, v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/google/android/gms/internal/ads/zzajg;

    .line 20
    .line 21
    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzV:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaex;->zzv()V

    .line 35
    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzD:Z

    .line 38
    .line 39
    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic zzn()[B
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zzc:[B

    return-object v0
.end method

.method public static synthetic zzo()Ljava/util/UUID;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zzf:Ljava/util/UUID;

    return-object v0
.end method

.method public static synthetic zzp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzajh;->zzg:Ljava/util/Map;

    return-object v0
.end method

.method private final zzq(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x20

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in a TrackEntry"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method private final zzr(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzJ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    add-int/lit8 v0, v0, 0x1a

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "Element "

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p1, " must be in a Cues"

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    throw p1
.end method

.method private final zzs(Lcom/google/android/gms/internal/ads/zzajg;JIII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzU:Lcom/google/android/gms/internal/ads/zzagi;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 12
    .line 13
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzagg;

    .line 14
    .line 15
    move/from16 v5, p4

    .line 16
    .line 17
    move/from16 v6, p5

    .line 18
    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    move-wide/from16 v3, p2

    .line 23
    .line 24
    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzagi;->zzc(Lcom/google/android/gms/internal/ads/zzagh;JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "S_TEXT/UTF8"

    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, 0x0

    .line 38
    const-string v6, "S_TEXT/WEBVTT"

    .line 39
    .line 40
    const-string v7, "S_TEXT/SSA"

    .line 41
    .line 42
    const-string v8, "S_TEXT/ASS"

    .line 43
    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    :cond_1
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 65
    .line 66
    const-string v10, "MatroskaExtractor"

    .line 67
    .line 68
    if-le v4, v9, :cond_2

    .line 69
    .line 70
    const-string v2, "Skipping subtitle sample in laced block."

    .line 71
    .line 72
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzW:J

    .line 77
    .line 78
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    cmp-long v4, v11, v13

    .line 84
    .line 85
    if-nez v4, :cond_4

    .line 86
    .line 87
    const-string v2, "Skipping subtitle sample with no duration."

    .line 88
    .line 89
    invoke-static {v10, v2}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_0
    move/from16 v2, p5

    .line 93
    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_4
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzs:Lcom/google/android/gms/internal/ads/zzer;

    .line 97
    .line 98
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    const-wide/16 v14, 0x3e8

    .line 107
    .line 108
    sparse-switch v13, :sswitch_data_0

    .line 109
    .line 110
    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_9

    .line 118
    .line 119
    const-string v2, "%02d:%02d:%02d,%03d"

    .line 120
    .line 121
    invoke-static {v11, v12, v2, v14, v15}, Lcom/google/android/gms/internal/ads/zzajh;->zzx(JLjava/lang/String;J)[B

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const/16 v3, 0x13

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :sswitch_1
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_9

    .line 133
    .line 134
    const-string v2, "%02d:%02d:%02d.%03d"

    .line 135
    .line 136
    invoke-static {v11, v12, v2, v14, v15}, Lcom/google/android/gms/internal/ads/zzajh;->zzx(JLjava/lang/String;J)[B

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const/16 v3, 0x19

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :sswitch_2
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_9

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :sswitch_3
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    :goto_1
    const-string v2, "%01d:%02d:%02d:%02d"

    .line 157
    .line 158
    const-wide/16 v6, 0x2710

    .line 159
    .line 160
    invoke-static {v11, v12, v2, v6, v7}, Lcom/google/android/gms/internal/ads/zzajh;->zzx(JLjava/lang/String;J)[B

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    const/16 v3, 0x15

    .line 165
    .line 166
    :goto_2
    array-length v6, v2

    .line 167
    invoke-static {v2, v5, v10, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzg()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    :goto_3
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-ge v2, v3, :cond_6

    .line 179
    .line 180
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    aget-byte v3, v3, v2

    .line 185
    .line 186
    if-nez v3, :cond_5

    .line 187
    .line 188
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_6
    :goto_4
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    invoke-interface {v2, v4, v3}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    add-int v2, v2, p5

    .line 209
    .line 210
    :goto_5
    const/high16 v3, 0x10000000

    .line 211
    .line 212
    and-int v3, p4, v3

    .line 213
    .line 214
    if-eqz v3, :cond_8

    .line 215
    .line 216
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 217
    .line 218
    if-le v3, v9, :cond_7

    .line 219
    .line 220
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzv:Lcom/google/android/gms/internal/ads/zzer;

    .line 221
    .line 222
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_7
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzv:Lcom/google/android/gms/internal/ads/zzer;

    .line 227
    .line 228
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 233
    .line 234
    const/4 v6, 0x2

    .line 235
    invoke-interface {v5, v3, v4, v6}, Lcom/google/android/gms/internal/ads/zzagh;->zzd(Lcom/google/android/gms/internal/ads/zzer;II)V

    .line 236
    .line 237
    .line 238
    add-int/2addr v2, v4

    .line 239
    :cond_8
    :goto_6
    move v14, v2

    .line 240
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 241
    .line 242
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzagg;

    .line 243
    .line 244
    move-wide/from16 v11, p2

    .line 245
    .line 246
    move/from16 v13, p4

    .line 247
    .line 248
    move/from16 v15, p6

    .line 249
    .line 250
    move-object/from16 v16, v1

    .line 251
    .line 252
    invoke-interface/range {v10 .. v16}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 253
    .line 254
    .line 255
    :goto_7
    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzT:Z

    .line 256
    .line 257
    return-void

    .line 258
    :cond_9
    :goto_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 259
    .line 260
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 261
    .line 262
    .line 263
    throw v1

    .line 264
    nop

    .line 265
    :sswitch_data_0
    .sparse-switch
        0x2c0618eb -> :sswitch_3
        0x2c065c6b -> :sswitch_2
        0x3e4ca2d8 -> :sswitch_1
        0x54c61e47 -> :sswitch_0
    .end sparse-switch
.end method

.method private final zzt(Lcom/google/android/gms/internal/ads/zzaev;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lt v1, p2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzj()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-ge v1, p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzj()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/2addr v1, v1

    .line 21
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzc(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int v3, p2, v3

    .line 41
    .line 42
    invoke-interface {p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method private final zzu(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzajg;IZ)I
    .locals 11

    .line 1
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "S_TEXT/UTF8"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object p2, Lcom/google/android/gms/internal/ads/zzajh;->zzb:[B

    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzw(Lcom/google/android/gms/internal/ads/zzaev;[BI)V

    .line 14
    .line 15
    .line 16
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajh;->zzv()V

    .line 19
    .line 20
    .line 21
    return p1

    .line 22
    :cond_0
    const-string v1, "S_TEXT/ASS"

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1d

    .line 29
    .line 30
    const-string v1, "S_TEXT/SSA"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto/16 :goto_c

    .line 39
    .line 40
    :cond_1
    const-string v1, "S_TEXT/WEBVTT"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    sget-object p2, Lcom/google/android/gms/internal/ads/zzajh;->zze:[B

    .line 49
    .line 50
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzw(Lcom/google/android/gms/internal/ads/zzaev;[BI)V

    .line 51
    .line 52
    .line 53
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 54
    .line 55
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajh;->zzv()V

    .line 56
    .line 57
    .line 58
    return p1

    .line 59
    :cond_2
    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzV:Z

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    const/4 v2, 0x1

    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcom/google/android/gms/internal/ads/zzer;

    .line 72
    .line 73
    invoke-direct {v0, p3}, Lcom/google/android/gms/internal/ads/zzer;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {p1, v4, v3, p3, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzh([BIIZ)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-nez v4, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzl()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzr()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzaet;->zza(I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-ne v4, v2, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    const/16 v5, 0xa

    .line 105
    .line 106
    if-lt v4, v5, :cond_4

    .line 107
    .line 108
    new-array v4, v5, [B

    .line 109
    .line 110
    invoke-virtual {v0, v4, v3, v5}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzaet;->zzc([B)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    add-int/lit8 v6, v4, 0x4

    .line 125
    .line 126
    if-lt v5, v6, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzk(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzB()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaet;->zza(I)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-ne v0, v1, :cond_4

    .line 140
    .line 141
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    const-string v4, "audio/vnd.dts.hd"

    .line 148
    .line 149
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 157
    .line 158
    :cond_4
    :goto_0
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 159
    .line 160
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 161
    .line 162
    invoke-interface {v0, v4}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 163
    .line 164
    .line 165
    iput-boolean v3, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzV:Z

    .line 166
    .line 167
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajh;->zzB()V

    .line 168
    .line 169
    .line 170
    :cond_5
    iget-object v0, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 171
    .line 172
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaj:Z

    .line 173
    .line 174
    const/4 v5, 0x4

    .line 175
    if-nez v4, :cond_14

    .line 176
    .line 177
    iget-boolean v4, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Z

    .line 178
    .line 179
    if-eqz v4, :cond_10

    .line 180
    .line 181
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 182
    .line 183
    const v6, -0x40000001    # -1.9999999f

    .line 184
    .line 185
    .line 186
    and-int/2addr v4, v6

    .line 187
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 188
    .line 189
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzak:Z

    .line 190
    .line 191
    const/16 v6, 0x80

    .line 192
    .line 193
    if-nez v4, :cond_7

    .line 194
    .line 195
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-interface {p1, v7, v3, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 202
    .line 203
    .line 204
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 205
    .line 206
    add-int/2addr v7, v2

    .line 207
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 208
    .line 209
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    aget-byte v7, v7, v3

    .line 214
    .line 215
    and-int/2addr v7, v6

    .line 216
    if-eq v7, v6, :cond_6

    .line 217
    .line 218
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    aget-byte v4, v4, v3

    .line 223
    .line 224
    iput-byte v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzan:B

    .line 225
    .line 226
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzak:Z

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_6
    const-string p1, "Extension bit is set in signal byte"

    .line 230
    .line 231
    const/4 p2, 0x0

    .line 232
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    throw p1

    .line 237
    :cond_7
    :goto_1
    iget-byte v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzan:B

    .line 238
    .line 239
    and-int/lit8 v7, v4, 0x1

    .line 240
    .line 241
    if-ne v7, v2, :cond_11

    .line 242
    .line 243
    and-int/2addr v4, v1

    .line 244
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 245
    .line 246
    const/high16 v8, 0x40000000    # 2.0f

    .line 247
    .line 248
    or-int/2addr v7, v8

    .line 249
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 250
    .line 251
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzao:Z

    .line 252
    .line 253
    if-nez v7, :cond_9

    .line 254
    .line 255
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzt:Lcom/google/android/gms/internal/ads/zzer;

    .line 256
    .line 257
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    const/16 v9, 0x8

    .line 262
    .line 263
    invoke-interface {p1, v8, v3, v9}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 264
    .line 265
    .line 266
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 267
    .line 268
    add-int/2addr v8, v9

    .line 269
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 270
    .line 271
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzao:Z

    .line 272
    .line 273
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 274
    .line 275
    if-ne v4, v1, :cond_8

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_8
    move v6, v3

    .line 279
    :goto_2
    or-int/2addr v6, v9

    .line 280
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    int-to-byte v6, v6

    .line 285
    aput-byte v6, v10, v3

    .line 286
    .line 287
    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, v8, v2, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzd(Lcom/google/android/gms/internal/ads/zzer;II)V

    .line 291
    .line 292
    .line 293
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 294
    .line 295
    add-int/2addr v6, v2

    .line 296
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 297
    .line 298
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 299
    .line 300
    .line 301
    invoke-interface {v0, v7, v9, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzd(Lcom/google/android/gms/internal/ads/zzer;II)V

    .line 302
    .line 303
    .line 304
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 305
    .line 306
    add-int/2addr v6, v9

    .line 307
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 308
    .line 309
    :cond_9
    if-ne v4, v1, :cond_11

    .line 310
    .line 311
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzal:Z

    .line 312
    .line 313
    if-nez v4, :cond_a

    .line 314
    .line 315
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 316
    .line 317
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-interface {p1, v6, v3, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 322
    .line 323
    .line 324
    iget v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 325
    .line 326
    add-int/2addr v6, v2

    .line 327
    iput v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 328
    .line 329
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzs()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzam:I

    .line 337
    .line 338
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzal:Z

    .line 339
    .line 340
    :cond_a
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzam:I

    .line 341
    .line 342
    mul-int/2addr v4, v5

    .line 343
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 344
    .line 345
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    invoke-interface {p1, v7, v3, v4}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 353
    .line 354
    .line 355
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 356
    .line 357
    add-int/2addr v7, v4

    .line 358
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 359
    .line 360
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzam:I

    .line 361
    .line 362
    shr-int/2addr v4, v2

    .line 363
    add-int/2addr v4, v2

    .line 364
    mul-int/lit8 v7, v4, 0x6

    .line 365
    .line 366
    add-int/2addr v7, v1

    .line 367
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    if-eqz v8, :cond_b

    .line 370
    .line 371
    invoke-virtual {v8}, Ljava/nio/Buffer;->capacity()I

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    if-ge v8, v7, :cond_c

    .line 376
    .line 377
    :cond_b
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    iput-object v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 382
    .line 383
    :cond_c
    int-to-short v4, v4

    .line 384
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 385
    .line 386
    invoke-virtual {v8, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 387
    .line 388
    .line 389
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 390
    .line 391
    invoke-virtual {v8, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 392
    .line 393
    .line 394
    move v4, v3

    .line 395
    move v8, v4

    .line 396
    :goto_3
    iget v9, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzam:I

    .line 397
    .line 398
    if-ge v4, v9, :cond_e

    .line 399
    .line 400
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    sub-int v8, v9, v8

    .line 405
    .line 406
    rem-int/lit8 v10, v4, 0x2

    .line 407
    .line 408
    if-nez v10, :cond_d

    .line 409
    .line 410
    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    int-to-short v8, v8

    .line 413
    invoke-virtual {v10, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 414
    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_d
    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 418
    .line 419
    invoke-virtual {v10, v8}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 420
    .line 421
    .line 422
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 423
    .line 424
    move v8, v9

    .line 425
    goto :goto_3

    .line 426
    :cond_e
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 427
    .line 428
    sub-int v4, p3, v4

    .line 429
    .line 430
    sub-int/2addr v4, v8

    .line 431
    and-int/lit8 v6, v9, 0x1

    .line 432
    .line 433
    if-ne v6, v2, :cond_f

    .line 434
    .line 435
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 436
    .line 437
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 438
    .line 439
    .line 440
    goto :goto_5

    .line 441
    :cond_f
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 442
    .line 443
    int-to-short v4, v4

    .line 444
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 445
    .line 446
    .line 447
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 450
    .line 451
    .line 452
    :goto_5
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzu:Lcom/google/android/gms/internal/ads/zzer;

    .line 453
    .line 454
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzw:Ljava/nio/ByteBuffer;

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    invoke-virtual {v4, v6, v7}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v0, v4, v7, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzd(Lcom/google/android/gms/internal/ads/zzer;II)V

    .line 464
    .line 465
    .line 466
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 467
    .line 468
    add-int/2addr v4, v7

    .line 469
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_10
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzi:[B

    .line 473
    .line 474
    if-eqz v4, :cond_11

    .line 475
    .line 476
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzr:Lcom/google/android/gms/internal/ads/zzer;

    .line 477
    .line 478
    array-length v7, v4

    .line 479
    invoke-virtual {v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 480
    .line 481
    .line 482
    :cond_11
    :goto_6
    iget-object v4, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 483
    .line 484
    const-string v6, "A_OPUS"

    .line 485
    .line 486
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    if-eqz v4, :cond_12

    .line 491
    .line 492
    if-eqz p4, :cond_13

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_12
    iget p4, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzg:I

    .line 496
    .line 497
    if-lez p4, :cond_13

    .line 498
    .line 499
    :goto_7
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 500
    .line 501
    const/high16 v4, 0x10000000

    .line 502
    .line 503
    or-int/2addr p4, v4

    .line 504
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 505
    .line 506
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzv:Lcom/google/android/gms/internal/ads/zzer;

    .line 507
    .line 508
    invoke-virtual {p4, v3}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 509
    .line 510
    .line 511
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzr:Lcom/google/android/gms/internal/ads/zzer;

    .line 512
    .line 513
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 514
    .line 515
    .line 516
    move-result p4

    .line 517
    add-int/2addr p4, p3

    .line 518
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 519
    .line 520
    sub-int/2addr p4, v4

    .line 521
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 522
    .line 523
    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 524
    .line 525
    .line 526
    shr-int/lit8 v6, p4, 0x18

    .line 527
    .line 528
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 529
    .line 530
    .line 531
    move-result-object v7

    .line 532
    and-int/lit16 v6, v6, 0xff

    .line 533
    .line 534
    int-to-byte v6, v6

    .line 535
    aput-byte v6, v7, v3

    .line 536
    .line 537
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    shr-int/lit8 v7, p4, 0x10

    .line 542
    .line 543
    and-int/lit16 v7, v7, 0xff

    .line 544
    .line 545
    int-to-byte v7, v7

    .line 546
    aput-byte v7, v6, v2

    .line 547
    .line 548
    shr-int/lit8 v6, p4, 0x8

    .line 549
    .line 550
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    and-int/lit16 v6, v6, 0xff

    .line 555
    .line 556
    int-to-byte v6, v6

    .line 557
    aput-byte v6, v7, v1

    .line 558
    .line 559
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 560
    .line 561
    .line 562
    move-result-object v6

    .line 563
    and-int/lit16 p4, p4, 0xff

    .line 564
    .line 565
    int-to-byte p4, p4

    .line 566
    const/4 v7, 0x3

    .line 567
    aput-byte p4, v6, v7

    .line 568
    .line 569
    invoke-interface {v0, v4, v5, v1}, Lcom/google/android/gms/internal/ads/zzagh;->zzd(Lcom/google/android/gms/internal/ads/zzer;II)V

    .line 570
    .line 571
    .line 572
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 573
    .line 574
    add-int/2addr p4, v5

    .line 575
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 576
    .line 577
    :cond_13
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaj:Z

    .line 578
    .line 579
    :cond_14
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzr:Lcom/google/android/gms/internal/ads/zzer;

    .line 580
    .line 581
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    add-int/2addr v4, p3

    .line 586
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 587
    .line 588
    const-string v6, "V_MPEG4/ISO/AVC"

    .line 589
    .line 590
    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v6

    .line 594
    if-nez v6, :cond_18

    .line 595
    .line 596
    const-string v6, "V_MPEGH/ISO/HEVC"

    .line 597
    .line 598
    invoke-virtual {v6, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result p3

    .line 602
    if-eqz p3, :cond_15

    .line 603
    .line 604
    goto :goto_a

    .line 605
    :cond_15
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzU:Lcom/google/android/gms/internal/ads/zzagi;

    .line 606
    .line 607
    if-nez p3, :cond_16

    .line 608
    .line 609
    goto :goto_9

    .line 610
    :cond_16
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzer;->zze()I

    .line 611
    .line 612
    .line 613
    move-result p3

    .line 614
    if-nez p3, :cond_17

    .line 615
    .line 616
    goto :goto_8

    .line 617
    :cond_17
    move v2, v3

    .line 618
    :goto_8
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgrc;->zzi(Z)V

    .line 619
    .line 620
    .line 621
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzU:Lcom/google/android/gms/internal/ads/zzagi;

    .line 622
    .line 623
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzagi;->zzb(Lcom/google/android/gms/internal/ads/zzaev;)V

    .line 624
    .line 625
    .line 626
    :goto_9
    iget p3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 627
    .line 628
    if-ge p3, v4, :cond_1b

    .line 629
    .line 630
    sub-int p3, v4, p3

    .line 631
    .line 632
    invoke-direct {p0, p1, v0, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzy(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzagh;I)I

    .line 633
    .line 634
    .line 635
    move-result p3

    .line 636
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 637
    .line 638
    add-int/2addr p4, p3

    .line 639
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 640
    .line 641
    iget p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 642
    .line 643
    add-int/2addr p4, p3

    .line 644
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 645
    .line 646
    goto :goto_9

    .line 647
    :cond_18
    :goto_a
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzn:Lcom/google/android/gms/internal/ads/zzer;

    .line 648
    .line 649
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 650
    .line 651
    .line 652
    move-result-object v6

    .line 653
    aput-byte v3, v6, v3

    .line 654
    .line 655
    aput-byte v3, v6, v2

    .line 656
    .line 657
    aput-byte v3, v6, v1

    .line 658
    .line 659
    iget v1, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzaa:I

    .line 660
    .line 661
    rsub-int/lit8 v2, v1, 0x4

    .line 662
    .line 663
    :goto_b
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 664
    .line 665
    if-ge v7, v4, :cond_1b

    .line 666
    .line 667
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzai:I

    .line 668
    .line 669
    if-nez v7, :cond_1a

    .line 670
    .line 671
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 672
    .line 673
    .line 674
    move-result v7

    .line 675
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 676
    .line 677
    .line 678
    move-result v7

    .line 679
    add-int v8, v2, v7

    .line 680
    .line 681
    sub-int v9, v1, v7

    .line 682
    .line 683
    invoke-interface {p1, v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 684
    .line 685
    .line 686
    if-lez v7, :cond_19

    .line 687
    .line 688
    invoke-virtual {p4, v6, v2, v7}, Lcom/google/android/gms/internal/ads/zzer;->zzm([BII)V

    .line 689
    .line 690
    .line 691
    :cond_19
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 692
    .line 693
    add-int/2addr v7, v1

    .line 694
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 695
    .line 696
    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 697
    .line 698
    .line 699
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzer;->zzH()I

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzai:I

    .line 704
    .line 705
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzm:Lcom/google/android/gms/internal/ads/zzer;

    .line 706
    .line 707
    invoke-virtual {v7, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 708
    .line 709
    .line 710
    invoke-interface {v0, v7, v5}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 711
    .line 712
    .line 713
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 714
    .line 715
    add-int/2addr v7, v5

    .line 716
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 717
    .line 718
    goto :goto_b

    .line 719
    :cond_1a
    invoke-direct {p0, p1, v0, v7}, Lcom/google/android/gms/internal/ads/zzajh;->zzy(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzagh;I)I

    .line 720
    .line 721
    .line 722
    move-result v7

    .line 723
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 724
    .line 725
    add-int/2addr v8, v7

    .line 726
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 727
    .line 728
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 729
    .line 730
    add-int/2addr v8, v7

    .line 731
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 732
    .line 733
    iget v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzai:I

    .line 734
    .line 735
    sub-int/2addr v8, v7

    .line 736
    iput v8, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzai:I

    .line 737
    .line 738
    goto :goto_b

    .line 739
    :cond_1b
    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 740
    .line 741
    const-string p2, "A_VORBIS"

    .line 742
    .line 743
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result p1

    .line 747
    if-eqz p1, :cond_1c

    .line 748
    .line 749
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzp:Lcom/google/android/gms/internal/ads/zzer;

    .line 750
    .line 751
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 752
    .line 753
    .line 754
    invoke-interface {v0, p1, v5}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 755
    .line 756
    .line 757
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 758
    .line 759
    add-int/2addr p1, v5

    .line 760
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 761
    .line 762
    :cond_1c
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 763
    .line 764
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajh;->zzv()V

    .line 765
    .line 766
    .line 767
    return p1

    .line 768
    :cond_1d
    :goto_c
    sget-object p2, Lcom/google/android/gms/internal/ads/zzajh;->zzd:[B

    .line 769
    .line 770
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzw(Lcom/google/android/gms/internal/ads/zzaev;[BI)V

    .line 771
    .line 772
    .line 773
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 774
    .line 775
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajh;->zzv()V

    .line 776
    .line 777
    .line 778
    return p1
.end method

.method private final zzv()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzag:I

    .line 3
    .line 4
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzah:I

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzai:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaj:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzak:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzal:Z

    .line 13
    .line 14
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzam:I

    .line 15
    .line 16
    iput-byte v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzan:B

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzao:Z

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzr:Lcom/google/android/gms/internal/ads/zzer;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final zzw(Lcom/google/android/gms/internal/ads/zzaev;[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    add-int v1, v0, p3

    .line 3
    .line 4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzs:Lcom/google/android/gms/internal/ads/zzer;

    .line 5
    .line 6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzj()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x0

    .line 11
    if-ge v3, v1, :cond_0

    .line 12
    .line 13
    add-int v3, v1, p3

    .line 14
    .line 15
    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    array-length v3, p2

    .line 20
    invoke-virtual {v2, p2, v3}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {p2, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p1, p2, v0, p3}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzer;->zzf(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private static zzx(JLjava/lang/String;J)[B
    .locals 9

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgrc;->zza(Z)V

    .line 14
    .line 15
    .line 16
    const-wide v0, 0xd693a400L

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    div-long v2, p0, v0

    .line 22
    .line 23
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 24
    .line 25
    long-to-int v2, v2

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    int-to-long v5, v2

    .line 31
    mul-long/2addr v5, v0

    .line 32
    sub-long/2addr p0, v5

    .line 33
    const-wide/32 v0, 0x3938700

    .line 34
    .line 35
    .line 36
    div-long v5, p0, v0

    .line 37
    .line 38
    long-to-int v2, v5

    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    int-to-long v6, v2

    .line 44
    mul-long/2addr v6, v0

    .line 45
    sub-long/2addr p0, v6

    .line 46
    const-wide/32 v0, 0xf4240

    .line 47
    .line 48
    .line 49
    div-long v6, p0, v0

    .line 50
    .line 51
    long-to-int v2, v6

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    int-to-long v7, v2

    .line 57
    mul-long/2addr v7, v0

    .line 58
    sub-long/2addr p0, v7

    .line 59
    div-long/2addr p0, p3

    .line 60
    long-to-int p0, p0

    .line 61
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    filled-new-array {v3, v5, v6, p0}, [Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {v4, p2, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 74
    .line 75
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method private final zzy(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzagh;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzr:Lcom/google/android/gms/internal/ads/zzer;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzer;->zzd()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzagh;->zzc(Lcom/google/android/gms/internal/ads/zzer;I)V

    .line 14
    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-interface {p2, p1, p3, v0}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1
.end method

.method private final zzz(J)J
    .locals 7

    .line 1
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzz:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v2, v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v4, 0x3e8

    .line 13
    .line 14
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 15
    .line 16
    move-wide v0, p1

    .line 17
    invoke-static/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    return-wide p1

    .line 22
    :cond_0
    const-string p1, "Can\'t scale timecode prior to timecodeScale being set."

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    throw p1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaev;)Z
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaji;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaji;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzaji;->zza(Lcom/google/android/gms/internal/ads/zzaev;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaex;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzk:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzl:Lcom/google/android/gms/internal/ads/zzamd;

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzamg;

    .line 8
    .line 9
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzamg;-><init>(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzamd;)V

    .line 10
    .line 11
    .line 12
    move-object p1, v1

    .line 13
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 14
    .line 15
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzafv;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzT:Z

    .line 3
    .line 4
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzT:Z

    .line 5
    .line 6
    if-nez v1, :cond_5

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaq:Lcom/google/android/gms/internal/ads/zzaja;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzaja;->zzc(Lcom/google/android/gms/internal/ads/zzaev;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaev;->zzn()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzP:Z

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzR:J

    .line 25
    .line 26
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzQ:J

    .line 27
    .line 28
    iput-wide v1, p2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzP:Z

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzR:J

    .line 38
    .line 39
    const-wide/16 v3, -0x1

    .line 40
    .line 41
    cmp-long v5, v1, v3

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    iput-wide v1, p2, Lcom/google/android/gms/internal/ads/zzafv;->zza:J

    .line 46
    .line 47
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzR:J

    .line 48
    .line 49
    :goto_0
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-ge v0, p2, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lcom/google/android/gms/internal/ads/zzajg;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzajg;->zzb()V

    .line 66
    .line 67
    .line 68
    iget-object p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzU:Lcom/google/android/gms/internal/ads/zzagi;

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzagg;

    .line 75
    .line 76
    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/ads/zzagi;->zzd(Lcom/google/android/gms/internal/ads/zzagh;Lcom/google/android/gms/internal/ads/zzagg;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const/4 p1, -0x1

    .line 83
    return p1

    .line 84
    :cond_5
    return v0
.end method

.method public final zze(JJ)V
    .locals 0

    .line 1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzS:J

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 10
    .line 11
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaq:Lcom/google/android/gms/internal/ads/zzaja;

    .line 12
    .line 13
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzaja;->zzb()V

    .line 14
    .line 15
    .line 16
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzh:Lcom/google/android/gms/internal/ads/zzajj;

    .line 17
    .line 18
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzajj;->zza()V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzajh;->zzv()V

    .line 22
    .line 23
    .line 24
    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzJ:Z

    .line 25
    .line 26
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzK:J

    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzL:I

    .line 30
    .line 31
    const-wide/16 p1, -0x1

    .line 32
    .line 33
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    .line 34
    .line 35
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzN:J

    .line 36
    .line 37
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzI:Landroid/util/SparseArray;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 44
    .line 45
    .line 46
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-ge p3, p2, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1, p3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/google/android/gms/internal/ads/zzajg;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzU:Lcom/google/android/gms/internal/ads/zzagi;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzagi;->zza()V

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 p3, p3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final zzh(IJJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0xa0

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    if-eq p1, v1, :cond_d

    .line 11
    .line 12
    const/16 v1, 0xae

    .line 13
    .line 14
    if-eq p1, v1, :cond_c

    .line 15
    .line 16
    const/16 v1, 0xb7

    .line 17
    .line 18
    const/4 v4, -0x1

    .line 19
    const-wide/16 v5, -0x1

    .line 20
    .line 21
    if-eq p1, v1, :cond_a

    .line 22
    .line 23
    const/16 v1, 0xbb

    .line 24
    .line 25
    if-eq p1, v1, :cond_9

    .line 26
    .line 27
    const/16 v1, 0x4dbb

    .line 28
    .line 29
    if-eq p1, v1, :cond_8

    .line 30
    .line 31
    const/16 v1, 0x5035

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eq p1, v1, :cond_7

    .line 35
    .line 36
    const/16 v1, 0x55d0

    .line 37
    .line 38
    if-eq p1, v1, :cond_6

    .line 39
    .line 40
    const v1, 0x18538067

    .line 41
    .line 42
    .line 43
    if-eq p1, v1, :cond_3

    .line 44
    .line 45
    const p2, 0x1c53bb6b

    .line 46
    .line 47
    .line 48
    if-eq p1, p2, :cond_2

    .line 49
    .line 50
    const p2, 0x1f43b675

    .line 51
    .line 52
    .line 53
    if-eq p1, p2, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 57
    .line 58
    if-nez p1, :cond_b

    .line 59
    .line 60
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzj:Z

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    iget-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzQ:J

    .line 65
    .line 66
    cmp-long p1, p1, v5

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzP:Z

    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzafx;

    .line 74
    .line 75
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    .line 76
    .line 77
    invoke-direct {p1, p2, p3, v2, v3}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 87
    .line 88
    if-nez p1, :cond_b

    .line 89
    .line 90
    iput-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzJ:Z

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    .line 94
    .line 95
    cmp-long p1, v0, v5

    .line 96
    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    cmp-long p1, v0, p2

    .line 100
    .line 101
    if-nez p1, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    const-string p1, "Multiple Segment elements not supported"

    .line 105
    .line 106
    const/4 p2, 0x0

    .line 107
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    throw p1

    .line 112
    :cond_5
    :goto_0
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    .line 113
    .line 114
    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzx:J

    .line 115
    .line 116
    return-void

    .line 117
    :cond_6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 121
    .line 122
    iput-boolean v4, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzy:Z

    .line 123
    .line 124
    return-void

    .line 125
    :cond_7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 129
    .line 130
    iput-boolean v4, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Z

    .line 131
    .line 132
    return-void

    .line 133
    :cond_8
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzG:I

    .line 134
    .line 135
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzH:J

    .line 136
    .line 137
    return-void

    .line 138
    :cond_9
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 139
    .line 140
    if-nez p2, :cond_b

    .line 141
    .line 142
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 143
    .line 144
    .line 145
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzK:J

    .line 151
    .line 152
    return-void

    .line 153
    :cond_a
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 154
    .line 155
    if-nez p2, :cond_b

    .line 156
    .line 157
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 158
    .line 159
    .line 160
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzL:I

    .line 161
    .line 162
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    .line 163
    .line 164
    iput-wide v5, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzN:J

    .line 165
    .line 166
    :cond_b
    :goto_1
    return-void

    .line 167
    :cond_c
    new-instance p1, Lcom/google/android/gms/internal/ads/zzajg;

    .line 168
    .line 169
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzajg;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 173
    .line 174
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzC:Z

    .line 175
    .line 176
    iput-boolean p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zza:Z

    .line 177
    .line 178
    return-void

    .line 179
    :cond_d
    const/4 p1, 0x0

    .line 180
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzae:Z

    .line 181
    .line 182
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaf:J

    .line 183
    .line 184
    return-void
.end method

.method public final zzi(I)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 v2, 0xa0

    .line 11
    .line 12
    const-string v3, "A_OPUS"

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    const/4 v8, 0x0

    .line 19
    if-eq v1, v2, :cond_2d

    .line 20
    .line 21
    const/16 v2, 0xae

    .line 22
    .line 23
    const/4 v9, 0x0

    .line 24
    if-eq v1, v2, :cond_2a

    .line 25
    .line 26
    const/16 v2, 0xb7

    .line 27
    .line 28
    const-wide/16 v10, -0x1

    .line 29
    .line 30
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    if-eq v1, v2, :cond_28

    .line 36
    .line 37
    const/16 v2, 0x4dbb

    .line 38
    .line 39
    const v14, 0x1c53bb6b

    .line 40
    .line 41
    .line 42
    if-eq v1, v2, :cond_26

    .line 43
    .line 44
    const/16 v2, 0x6240

    .line 45
    .line 46
    if-eq v1, v2, :cond_24

    .line 47
    .line 48
    const/16 v2, 0x6d80

    .line 49
    .line 50
    if-eq v1, v2, :cond_22

    .line 51
    .line 52
    const v2, 0x1549a966

    .line 53
    .line 54
    .line 55
    if-eq v1, v2, :cond_20

    .line 56
    .line 57
    const v2, 0x1654ae6b

    .line 58
    .line 59
    .line 60
    if-eq v1, v2, :cond_11

    .line 61
    .line 62
    if-eq v1, v14, :cond_0

    .line 63
    .line 64
    goto/16 :goto_17

    .line 65
    .line 66
    :cond_0
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 67
    .line 68
    if-nez v1, :cond_33

    .line 69
    .line 70
    move v1, v8

    .line 71
    :goto_0
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzI:Landroid/util/SparseArray;

    .line 72
    .line 73
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-ge v1, v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v15, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_4

    .line 90
    .line 91
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    .line 92
    .line 93
    cmp-long v1, v1, v12

    .line 94
    .line 95
    if-nez v1, :cond_2

    .line 96
    .line 97
    :cond_1
    move-wide/from16 v23, v12

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    move v1, v8

    .line 101
    :goto_1
    invoke-virtual {v15}, Landroid/util/SparseArray;->size()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-ge v1, v2, :cond_3

    .line 106
    .line 107
    invoke-virtual {v15, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Ljava/util/List;

    .line 112
    .line 113
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    add-int/lit8 v1, v1, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    new-instance v14, Lcom/google/android/gms/internal/ads/zzajf;

    .line 120
    .line 121
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    .line 122
    .line 123
    iget v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    .line 124
    .line 125
    iget-wide v10, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    .line 126
    .line 127
    move-wide/from16 v23, v12

    .line 128
    .line 129
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzx:J

    .line 130
    .line 131
    move-wide/from16 v16, v1

    .line 132
    .line 133
    move/from16 v18, v9

    .line 134
    .line 135
    move-wide/from16 v19, v10

    .line 136
    .line 137
    move-wide/from16 v21, v12

    .line 138
    .line 139
    invoke-direct/range {v14 .. v22}, Lcom/google/android/gms/internal/ads/zzajf;-><init>(Landroid/util/SparseArray;JIJJ)V

    .line 140
    .line 141
    .line 142
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 143
    .line 144
    invoke-interface {v1, v14}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_4
    move-wide/from16 v23, v12

    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :goto_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 154
    .line 155
    new-instance v2, Lcom/google/android/gms/internal/ads/zzafx;

    .line 156
    .line 157
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    .line 158
    .line 159
    invoke-direct {v2, v9, v10, v5, v6}, Lcom/google/android/gms/internal/ads/zzafx;-><init>(JJ)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 163
    .line 164
    .line 165
    :goto_3
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 166
    .line 167
    iput-boolean v8, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzJ:Z

    .line 168
    .line 169
    move v1, v8

    .line 170
    :goto_4
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 171
    .line 172
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-ge v1, v9, :cond_10

    .line 177
    .line 178
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Lcom/google/android/gms/internal/ads/zzajg;

    .line 183
    .line 184
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    .line 185
    .line 186
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    .line 187
    .line 188
    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzx:J

    .line 189
    .line 190
    move-wide/from16 v16, v5

    .line 191
    .line 192
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 193
    .line 194
    if-eq v5, v4, :cond_6

    .line 195
    .line 196
    :cond_5
    move/from16 v18, v8

    .line 197
    .line 198
    goto/16 :goto_c

    .line 199
    .line 200
    :cond_6
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 201
    .line 202
    invoke-virtual {v15, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    check-cast v5, Ljava/util/List;

    .line 207
    .line 208
    if-eqz v5, :cond_5

    .line 209
    .line 210
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-nez v6, :cond_5

    .line 215
    .line 216
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_7

    .line 221
    .line 222
    move/from16 v18, v8

    .line 223
    .line 224
    :goto_5
    move-wide/from16 v3, v23

    .line 225
    .line 226
    goto/16 :goto_a

    .line 227
    .line 228
    :cond_7
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    move/from16 v18, v8

    .line 233
    .line 234
    const/16 v8, 0x14

    .line 235
    .line 236
    invoke-static {v6, v8}, Ljava/lang/Math;->min(II)I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    const-wide/16 v19, 0x0

    .line 241
    .line 242
    move/from16 v8, v18

    .line 243
    .line 244
    const/4 v4, -0x1

    .line 245
    :goto_6
    if-ge v8, v6, :cond_8

    .line 246
    .line 247
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v22

    .line 251
    check-cast v22, Lcom/google/android/gms/internal/ads/zzaje;

    .line 252
    .line 253
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zza()J

    .line 254
    .line 255
    .line 256
    move-result-wide v25

    .line 257
    const-wide/32 v27, 0x989680

    .line 258
    .line 259
    .line 260
    cmp-long v25, v25, v27

    .line 261
    .line 262
    if-lez v25, :cond_9

    .line 263
    .line 264
    :cond_8
    const/4 v3, -0x1

    .line 265
    goto/16 :goto_9

    .line 266
    .line 267
    :cond_9
    add-int/lit8 v7, v8, 0x1

    .line 268
    .line 269
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 270
    .line 271
    .line 272
    move-result v26

    .line 273
    const/16 v27, -0x1

    .line 274
    .line 275
    add-int/lit8 v3, v26, -0x1

    .line 276
    .line 277
    if-ge v8, v3, :cond_a

    .line 278
    .line 279
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    check-cast v3, Lcom/google/android/gms/internal/ads/zzaje;

    .line 284
    .line 285
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaje;->zzb()J

    .line 286
    .line 287
    .line 288
    move-result-wide v28

    .line 289
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaje;->zzc()J

    .line 290
    .line 291
    .line 292
    move-result-wide v30

    .line 293
    add-long v28, v28, v30

    .line 294
    .line 295
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zzb()J

    .line 296
    .line 297
    .line 298
    move-result-wide v30

    .line 299
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zzc()J

    .line 300
    .line 301
    .line 302
    move-result-wide v32

    .line 303
    add-long v30, v30, v32

    .line 304
    .line 305
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaje;->zza()J

    .line 306
    .line 307
    .line 308
    move-result-wide v32

    .line 309
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zza()J

    .line 310
    .line 311
    .line 312
    move-result-wide v34

    .line 313
    sub-long v32, v32, v34

    .line 314
    .line 315
    :goto_7
    sub-long v28, v28, v30

    .line 316
    .line 317
    move/from16 p1, v6

    .line 318
    .line 319
    move v3, v7

    .line 320
    move-wide/from16 v6, v28

    .line 321
    .line 322
    move-wide/from16 v28, v9

    .line 323
    .line 324
    move v10, v8

    .line 325
    move-wide/from16 v8, v32

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_a
    add-long v28, v11, v13

    .line 329
    .line 330
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zzb()J

    .line 331
    .line 332
    .line 333
    move-result-wide v30

    .line 334
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zzc()J

    .line 335
    .line 336
    .line 337
    move-result-wide v32

    .line 338
    add-long v30, v30, v32

    .line 339
    .line 340
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/ads/zzaje;->zza()J

    .line 341
    .line 342
    .line 343
    move-result-wide v32

    .line 344
    sub-long v32, v9, v32

    .line 345
    .line 346
    goto :goto_7

    .line 347
    :goto_8
    cmp-long v22, v8, v16

    .line 348
    .line 349
    if-lez v22, :cond_b

    .line 350
    .line 351
    long-to-double v6, v6

    .line 352
    long-to-double v8, v8

    .line 353
    div-double/2addr v6, v8

    .line 354
    cmpl-double v8, v6, v19

    .line 355
    .line 356
    if-lez v8, :cond_b

    .line 357
    .line 358
    move-wide/from16 v19, v6

    .line 359
    .line 360
    move v4, v10

    .line 361
    :cond_b
    move/from16 v6, p1

    .line 362
    .line 363
    move v8, v3

    .line 364
    move-wide/from16 v9, v28

    .line 365
    .line 366
    const/4 v7, 0x1

    .line 367
    goto :goto_6

    .line 368
    :goto_9
    if-ne v4, v3, :cond_c

    .line 369
    .line 370
    goto/16 :goto_5

    .line 371
    .line 372
    :cond_c
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    check-cast v3, Lcom/google/android/gms/internal/ads/zzaje;

    .line 377
    .line 378
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaje;->zza()J

    .line 379
    .line 380
    .line 381
    move-result-wide v3

    .line 382
    :goto_a
    cmp-long v5, v3, v23

    .line 383
    .line 384
    if-eqz v5, :cond_e

    .line 385
    .line 386
    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 387
    .line 388
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzv;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 392
    .line 393
    new-instance v6, Lcom/google/android/gms/internal/ads/zzahx;

    .line 394
    .line 395
    invoke-direct {v6, v3, v4}, Lcom/google/android/gms/internal/ads/zzahx;-><init>(J)V

    .line 396
    .line 397
    .line 398
    if-nez v5, :cond_d

    .line 399
    .line 400
    new-instance v3, Lcom/google/android/gms/internal/ads/zzap;

    .line 401
    .line 402
    const/4 v4, 0x1

    .line 403
    new-array v5, v4, [Lcom/google/android/gms/internal/ads/zzao;

    .line 404
    .line 405
    aput-object v6, v5, v18

    .line 406
    .line 407
    move-wide/from16 v6, v23

    .line 408
    .line 409
    invoke-direct {v3, v6, v7, v5}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 410
    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_d
    const/4 v4, 0x1

    .line 414
    new-array v3, v4, [Lcom/google/android/gms/internal/ads/zzao;

    .line 415
    .line 416
    aput-object v6, v3, v18

    .line 417
    .line 418
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzap;->zzg([Lcom/google/android/gms/internal/ads/zzao;)Lcom/google/android/gms/internal/ads/zzap;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    :goto_b
    iget-object v4, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 423
    .line 424
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzk(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    iput-object v3, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 436
    .line 437
    :cond_e
    :goto_c
    iget-boolean v3, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzV:Z

    .line 438
    .line 439
    if-nez v3, :cond_f

    .line 440
    .line 441
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzajg;->zzb()V

    .line 442
    .line 443
    .line 444
    iget-object v3, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 445
    .line 446
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 447
    .line 448
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 452
    .line 453
    .line 454
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 455
    .line 456
    move-wide/from16 v5, v16

    .line 457
    .line 458
    move/from16 v8, v18

    .line 459
    .line 460
    const/4 v4, 0x2

    .line 461
    const/4 v7, 0x1

    .line 462
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    goto/16 :goto_4

    .line 468
    .line 469
    :cond_10
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzajh;->zzB()V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :cond_11
    move/from16 v18, v8

    .line 474
    .line 475
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 476
    .line 477
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-eqz v2, :cond_1f

    .line 482
    .line 483
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzj:Z

    .line 484
    .line 485
    if-eqz v2, :cond_12

    .line 486
    .line 487
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzQ:J

    .line 488
    .line 489
    cmp-long v2, v2, v10

    .line 490
    .line 491
    if-nez v2, :cond_13

    .line 492
    .line 493
    :cond_12
    const/4 v2, 0x1

    .line 494
    goto :goto_d

    .line 495
    :cond_13
    move/from16 v2, v18

    .line 496
    .line 497
    :goto_d
    move/from16 v3, v18

    .line 498
    .line 499
    const/4 v4, -0x1

    .line 500
    const/4 v5, -0x1

    .line 501
    const/4 v6, -0x1

    .line 502
    const/4 v7, -0x1

    .line 503
    :goto_e
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 504
    .line 505
    .line 506
    move-result v8

    .line 507
    if-ge v3, v8, :cond_19

    .line 508
    .line 509
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v8

    .line 513
    check-cast v8, Lcom/google/android/gms/internal/ads/zzajg;

    .line 514
    .line 515
    iget v9, v8, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 516
    .line 517
    const/4 v10, 0x2

    .line 518
    if-ne v9, v10, :cond_15

    .line 519
    .line 520
    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzX:Z

    .line 521
    .line 522
    if-eqz v9, :cond_14

    .line 523
    .line 524
    iget v4, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 525
    .line 526
    :cond_14
    const/4 v10, -0x1

    .line 527
    if-ne v5, v10, :cond_17

    .line 528
    .line 529
    iget v5, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 530
    .line 531
    goto :goto_f

    .line 532
    :cond_15
    const/4 v10, -0x1

    .line 533
    const/4 v11, 0x1

    .line 534
    if-ne v9, v11, :cond_17

    .line 535
    .line 536
    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzX:Z

    .line 537
    .line 538
    if-eqz v9, :cond_16

    .line 539
    .line 540
    iget v6, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 541
    .line 542
    :cond_16
    if-ne v7, v10, :cond_17

    .line 543
    .line 544
    iget v7, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 545
    .line 546
    :cond_17
    :goto_f
    if-eqz v2, :cond_18

    .line 547
    .line 548
    invoke-virtual {v8}, Lcom/google/android/gms/internal/ads/zzajg;->zzb()V

    .line 549
    .line 550
    .line 551
    iget-boolean v9, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzV:Z

    .line 552
    .line 553
    if-nez v9, :cond_18

    .line 554
    .line 555
    iget-object v9, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 556
    .line 557
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzajg;->zzZ:Lcom/google/android/gms/internal/ads/zzv;

    .line 558
    .line 559
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    invoke-interface {v9, v8}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 563
    .line 564
    .line 565
    :cond_18
    add-int/lit8 v3, v3, 0x1

    .line 566
    .line 567
    goto :goto_e

    .line 568
    :cond_19
    const/4 v3, -0x1

    .line 569
    if-eq v4, v3, :cond_1a

    .line 570
    .line 571
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    .line 572
    .line 573
    goto :goto_11

    .line 574
    :cond_1a
    if-eq v5, v3, :cond_1b

    .line 575
    .line 576
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    .line 577
    .line 578
    goto :goto_11

    .line 579
    :cond_1b
    if-eq v6, v3, :cond_1c

    .line 580
    .line 581
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    .line 582
    .line 583
    goto :goto_11

    .line 584
    :cond_1c
    if-eq v7, v3, :cond_1d

    .line 585
    .line 586
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    .line 587
    .line 588
    goto :goto_11

    .line 589
    :cond_1d
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-lez v3, :cond_1e

    .line 594
    .line 595
    move/from16 v3, v18

    .line 596
    .line 597
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    check-cast v1, Lcom/google/android/gms/internal/ads/zzajg;

    .line 602
    .line 603
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 604
    .line 605
    goto :goto_10

    .line 606
    :cond_1e
    const/4 v3, -0x1

    .line 607
    :goto_10
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzO:I

    .line 608
    .line 609
    :goto_11
    if-eqz v2, :cond_33

    .line 610
    .line 611
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzajh;->zzB()V

    .line 612
    .line 613
    .line 614
    return-void

    .line 615
    :cond_1f
    const-string v1, "No valid tracks were found"

    .line 616
    .line 617
    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    throw v1

    .line 622
    :cond_20
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzz:J

    .line 623
    .line 624
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    cmp-long v1, v1, v23

    .line 630
    .line 631
    if-nez v1, :cond_21

    .line 632
    .line 633
    const-wide/32 v1, 0xf4240

    .line 634
    .line 635
    .line 636
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzz:J

    .line 637
    .line 638
    :cond_21
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzA:J

    .line 639
    .line 640
    cmp-long v3, v1, v23

    .line 641
    .line 642
    if-eqz v3, :cond_33

    .line 643
    .line 644
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzajh;->zzz(J)J

    .line 645
    .line 646
    .line 647
    move-result-wide v1

    .line 648
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzB:J

    .line 649
    .line 650
    return-void

    .line 651
    :cond_22
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 652
    .line 653
    .line 654
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 655
    .line 656
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Z

    .line 657
    .line 658
    if-eqz v2, :cond_33

    .line 659
    .line 660
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzi:[B

    .line 661
    .line 662
    if-nez v1, :cond_23

    .line 663
    .line 664
    goto/16 :goto_17

    .line 665
    .line 666
    :cond_23
    const-string v1, "Combining encryption and compression is not supported"

    .line 667
    .line 668
    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    throw v1

    .line 673
    :cond_24
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 674
    .line 675
    .line 676
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 677
    .line 678
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzh:Z

    .line 679
    .line 680
    if-eqz v2, :cond_33

    .line 681
    .line 682
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzagg;

    .line 683
    .line 684
    if-eqz v2, :cond_25

    .line 685
    .line 686
    new-instance v2, Lcom/google/android/gms/internal/ads/zzq;

    .line 687
    .line 688
    new-instance v3, Lcom/google/android/gms/internal/ads/zzp;

    .line 689
    .line 690
    sget-object v4, Lcom/google/android/gms/internal/ads/zzg;->zza:Ljava/util/UUID;

    .line 691
    .line 692
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 693
    .line 694
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzagg;

    .line 695
    .line 696
    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzagg;->zzb:[B

    .line 697
    .line 698
    const-string v6, "video/webm"

    .line 699
    .line 700
    invoke-direct {v3, v4, v9, v6, v5}, Lcom/google/android/gms/internal/ads/zzp;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 701
    .line 702
    .line 703
    filled-new-array {v3}, [Lcom/google/android/gms/internal/ads/zzp;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    invoke-direct {v2, v9, v3}, Lcom/google/android/gms/internal/ads/zzq;-><init>(Ljava/lang/String;[Lcom/google/android/gms/internal/ads/zzp;)V

    .line 708
    .line 709
    .line 710
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzl:Lcom/google/android/gms/internal/ads/zzq;

    .line 711
    .line 712
    return-void

    .line 713
    :cond_25
    const-string v1, "Encrypted Track found but ContentEncKeyID was not found"

    .line 714
    .line 715
    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    throw v1

    .line 720
    :cond_26
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzG:I

    .line 721
    .line 722
    const/4 v3, -0x1

    .line 723
    if-eq v1, v3, :cond_27

    .line 724
    .line 725
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzH:J

    .line 726
    .line 727
    cmp-long v4, v2, v10

    .line 728
    .line 729
    if-eqz v4, :cond_27

    .line 730
    .line 731
    if-ne v1, v14, :cond_33

    .line 732
    .line 733
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzQ:J

    .line 734
    .line 735
    return-void

    .line 736
    :cond_27
    const-string v1, "Mandatory element SeekID or SeekPosition not found"

    .line 737
    .line 738
    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    throw v1

    .line 743
    :cond_28
    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 744
    .line 745
    if-nez v2, :cond_33

    .line 746
    .line 747
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 748
    .line 749
    .line 750
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzK:J

    .line 751
    .line 752
    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    cmp-long v1, v1, v23

    .line 758
    .line 759
    if-eqz v1, :cond_33

    .line 760
    .line 761
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzL:I

    .line 762
    .line 763
    const/4 v3, -0x1

    .line 764
    if-eq v1, v3, :cond_33

    .line 765
    .line 766
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    .line 767
    .line 768
    cmp-long v2, v2, v10

    .line 769
    .line 770
    if-eqz v2, :cond_33

    .line 771
    .line 772
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzI:Landroid/util/SparseArray;

    .line 773
    .line 774
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    check-cast v1, Ljava/util/List;

    .line 779
    .line 780
    if-nez v1, :cond_29

    .line 781
    .line 782
    new-instance v1, Ljava/util/ArrayList;

    .line 783
    .line 784
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 785
    .line 786
    .line 787
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzL:I

    .line 788
    .line 789
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    :cond_29
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaje;

    .line 793
    .line 794
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzK:J

    .line 795
    .line 796
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    .line 797
    .line 798
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    .line 799
    .line 800
    add-long/2addr v5, v7

    .line 801
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzN:J

    .line 802
    .line 803
    const/4 v9, 0x0

    .line 804
    invoke-direct/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzaje;-><init>(JJJ[B)V

    .line 805
    .line 806
    .line 807
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    return-void

    .line 811
    :cond_2a
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 817
    .line 818
    if-eqz v2, :cond_2c

    .line 819
    .line 820
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    sparse-switch v4, :sswitch_data_0

    .line 825
    .line 826
    .line 827
    goto/16 :goto_13

    .line 828
    .line 829
    :sswitch_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    if-eqz v2, :cond_2b

    .line 834
    .line 835
    goto/16 :goto_12

    .line 836
    .line 837
    :sswitch_1
    const-string v3, "A_FLAC"

    .line 838
    .line 839
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    if-eqz v2, :cond_2b

    .line 844
    .line 845
    goto/16 :goto_12

    .line 846
    .line 847
    :sswitch_2
    const-string v3, "A_EAC3"

    .line 848
    .line 849
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v2

    .line 853
    if-eqz v2, :cond_2b

    .line 854
    .line 855
    goto/16 :goto_12

    .line 856
    .line 857
    :sswitch_3
    const-string v3, "V_MPEG2"

    .line 858
    .line 859
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v2

    .line 863
    if-eqz v2, :cond_2b

    .line 864
    .line 865
    goto/16 :goto_12

    .line 866
    .line 867
    :sswitch_4
    const-string v3, "S_TEXT/UTF8"

    .line 868
    .line 869
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v2

    .line 873
    if-eqz v2, :cond_2b

    .line 874
    .line 875
    goto/16 :goto_12

    .line 876
    .line 877
    :sswitch_5
    const-string v3, "S_TEXT/WEBVTT"

    .line 878
    .line 879
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    move-result v2

    .line 883
    if-eqz v2, :cond_2b

    .line 884
    .line 885
    goto/16 :goto_12

    .line 886
    .line 887
    :sswitch_6
    const-string v3, "V_MPEGH/ISO/HEVC"

    .line 888
    .line 889
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v2

    .line 893
    if-eqz v2, :cond_2b

    .line 894
    .line 895
    goto/16 :goto_12

    .line 896
    .line 897
    :sswitch_7
    const-string v3, "S_TEXT/SSA"

    .line 898
    .line 899
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v2

    .line 903
    if-eqz v2, :cond_2b

    .line 904
    .line 905
    goto/16 :goto_12

    .line 906
    .line 907
    :sswitch_8
    const-string v3, "S_TEXT/ASS"

    .line 908
    .line 909
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    move-result v2

    .line 913
    if-eqz v2, :cond_2b

    .line 914
    .line 915
    goto/16 :goto_12

    .line 916
    .line 917
    :sswitch_9
    const-string v3, "A_PCM/INT/LIT"

    .line 918
    .line 919
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v2

    .line 923
    if-eqz v2, :cond_2b

    .line 924
    .line 925
    goto/16 :goto_12

    .line 926
    .line 927
    :sswitch_a
    const-string v3, "A_PCM/INT/BIG"

    .line 928
    .line 929
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    move-result v2

    .line 933
    if-eqz v2, :cond_2b

    .line 934
    .line 935
    goto/16 :goto_12

    .line 936
    .line 937
    :sswitch_b
    const-string v3, "A_PCM/FLOAT/IEEE"

    .line 938
    .line 939
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 940
    .line 941
    .line 942
    move-result v2

    .line 943
    if-eqz v2, :cond_2b

    .line 944
    .line 945
    goto/16 :goto_12

    .line 946
    .line 947
    :sswitch_c
    const-string v3, "A_DTS/EXPRESS"

    .line 948
    .line 949
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    if-eqz v2, :cond_2b

    .line 954
    .line 955
    goto/16 :goto_12

    .line 956
    .line 957
    :sswitch_d
    const-string v3, "V_THEORA"

    .line 958
    .line 959
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v2

    .line 963
    if-eqz v2, :cond_2b

    .line 964
    .line 965
    goto/16 :goto_12

    .line 966
    .line 967
    :sswitch_e
    const-string v3, "S_HDMV/PGS"

    .line 968
    .line 969
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v2

    .line 973
    if-eqz v2, :cond_2b

    .line 974
    .line 975
    goto/16 :goto_12

    .line 976
    .line 977
    :sswitch_f
    const-string v3, "V_VP9"

    .line 978
    .line 979
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    move-result v2

    .line 983
    if-eqz v2, :cond_2b

    .line 984
    .line 985
    goto/16 :goto_12

    .line 986
    .line 987
    :sswitch_10
    const-string v3, "V_VP8"

    .line 988
    .line 989
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 990
    .line 991
    .line 992
    move-result v2

    .line 993
    if-eqz v2, :cond_2b

    .line 994
    .line 995
    goto/16 :goto_12

    .line 996
    .line 997
    :sswitch_11
    const-string v3, "V_AV1"

    .line 998
    .line 999
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    move-result v2

    .line 1003
    if-eqz v2, :cond_2b

    .line 1004
    .line 1005
    goto/16 :goto_12

    .line 1006
    .line 1007
    :sswitch_12
    const-string v3, "A_DTS"

    .line 1008
    .line 1009
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    if-eqz v2, :cond_2b

    .line 1014
    .line 1015
    goto/16 :goto_12

    .line 1016
    .line 1017
    :sswitch_13
    const-string v3, "A_AC3"

    .line 1018
    .line 1019
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v2

    .line 1023
    if-eqz v2, :cond_2b

    .line 1024
    .line 1025
    goto/16 :goto_12

    .line 1026
    .line 1027
    :sswitch_14
    const-string v3, "A_AAC"

    .line 1028
    .line 1029
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v2

    .line 1033
    if-eqz v2, :cond_2b

    .line 1034
    .line 1035
    goto/16 :goto_12

    .line 1036
    .line 1037
    :sswitch_15
    const-string v3, "A_DTS/LOSSLESS"

    .line 1038
    .line 1039
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v2

    .line 1043
    if-eqz v2, :cond_2b

    .line 1044
    .line 1045
    goto/16 :goto_12

    .line 1046
    .line 1047
    :sswitch_16
    const-string v3, "S_VOBSUB"

    .line 1048
    .line 1049
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v2

    .line 1053
    if-eqz v2, :cond_2b

    .line 1054
    .line 1055
    goto/16 :goto_12

    .line 1056
    .line 1057
    :sswitch_17
    const-string v3, "V_MPEG4/ISO/AVC"

    .line 1058
    .line 1059
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    if-eqz v2, :cond_2b

    .line 1064
    .line 1065
    goto :goto_12

    .line 1066
    :sswitch_18
    const-string v3, "V_MPEG4/ISO/ASP"

    .line 1067
    .line 1068
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    if-eqz v2, :cond_2b

    .line 1073
    .line 1074
    goto :goto_12

    .line 1075
    :sswitch_19
    const-string v3, "S_DVBSUB"

    .line 1076
    .line 1077
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v2

    .line 1081
    if-eqz v2, :cond_2b

    .line 1082
    .line 1083
    goto :goto_12

    .line 1084
    :sswitch_1a
    const-string v3, "V_MS/VFW/FOURCC"

    .line 1085
    .line 1086
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v2

    .line 1090
    if-eqz v2, :cond_2b

    .line 1091
    .line 1092
    goto :goto_12

    .line 1093
    :sswitch_1b
    const-string v3, "A_MPEG/L3"

    .line 1094
    .line 1095
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v2

    .line 1099
    if-eqz v2, :cond_2b

    .line 1100
    .line 1101
    goto :goto_12

    .line 1102
    :sswitch_1c
    const-string v3, "A_MPEG/L2"

    .line 1103
    .line 1104
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    move-result v2

    .line 1108
    if-eqz v2, :cond_2b

    .line 1109
    .line 1110
    goto :goto_12

    .line 1111
    :sswitch_1d
    const-string v3, "A_VORBIS"

    .line 1112
    .line 1113
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v2

    .line 1117
    if-eqz v2, :cond_2b

    .line 1118
    .line 1119
    goto :goto_12

    .line 1120
    :sswitch_1e
    const-string v3, "A_TRUEHD"

    .line 1121
    .line 1122
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    if-eqz v2, :cond_2b

    .line 1127
    .line 1128
    goto :goto_12

    .line 1129
    :sswitch_1f
    const-string v3, "A_MS/ACM"

    .line 1130
    .line 1131
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v2

    .line 1135
    if-eqz v2, :cond_2b

    .line 1136
    .line 1137
    goto :goto_12

    .line 1138
    :sswitch_20
    const-string v3, "V_MPEG4/ISO/SP"

    .line 1139
    .line 1140
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v2

    .line 1144
    if-eqz v2, :cond_2b

    .line 1145
    .line 1146
    goto :goto_12

    .line 1147
    :sswitch_21
    const-string v3, "V_MPEG4/ISO/AP"

    .line 1148
    .line 1149
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v2

    .line 1153
    if-eqz v2, :cond_2b

    .line 1154
    .line 1155
    :goto_12
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 1156
    .line 1157
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzajg;->zza(I)V

    .line 1158
    .line 1159
    .line 1160
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzap:Lcom/google/android/gms/internal/ads/zzaex;

    .line 1161
    .line 1162
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 1163
    .line 1164
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 1165
    .line 1166
    invoke-interface {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaex;->zzu(II)Lcom/google/android/gms/internal/ads/zzagh;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v2

    .line 1170
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzY:Lcom/google/android/gms/internal/ads/zzagh;

    .line 1171
    .line 1172
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 1173
    .line 1174
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 1175
    .line 1176
    invoke-virtual {v2, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1177
    .line 1178
    .line 1179
    :cond_2b
    :goto_13
    iput-object v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 1180
    .line 1181
    return-void

    .line 1182
    :cond_2c
    const-string v1, "CodecId is missing in TrackEntry element"

    .line 1183
    .line 1184
    invoke-static {v1, v9}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    throw v1

    .line 1189
    :cond_2d
    move-wide/from16 v16, v5

    .line 1190
    .line 1191
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 1192
    .line 1193
    const/4 v10, 0x2

    .line 1194
    if-ne v1, v10, :cond_33

    .line 1195
    .line 1196
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 1197
    .line 1198
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzaa:I

    .line 1199
    .line 1200
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    check-cast v1, Lcom/google/android/gms/internal/ads/zzajg;

    .line 1205
    .line 1206
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzajg;->zzb()V

    .line 1207
    .line 1208
    .line 1209
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzaf:J

    .line 1210
    .line 1211
    cmp-long v2, v4, v16

    .line 1212
    .line 1213
    if-lez v2, :cond_2e

    .line 1214
    .line 1215
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 1216
    .line 1217
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v2

    .line 1221
    if-eqz v2, :cond_2e

    .line 1222
    .line 1223
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzv:Lcom/google/android/gms/internal/ads/zzer;

    .line 1224
    .line 1225
    const/16 v3, 0x8

    .line 1226
    .line 1227
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v3

    .line 1231
    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 1232
    .line 1233
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v3

    .line 1237
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzaf:J

    .line 1238
    .line 1239
    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v3

    .line 1243
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 1244
    .line 1245
    .line 1246
    move-result-object v3

    .line 1247
    array-length v4, v3

    .line 1248
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzer;->zzb([BI)V

    .line 1249
    .line 1250
    .line 1251
    :cond_2e
    const/4 v2, 0x0

    .line 1252
    const/4 v3, 0x0

    .line 1253
    :goto_14
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 1254
    .line 1255
    if-ge v3, v4, :cond_2f

    .line 1256
    .line 1257
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 1258
    .line 1259
    aget v4, v4, v3

    .line 1260
    .line 1261
    add-int/2addr v2, v4

    .line 1262
    add-int/lit8 v3, v3, 0x1

    .line 1263
    .line 1264
    goto :goto_14

    .line 1265
    :cond_2f
    const/4 v3, 0x0

    .line 1266
    :goto_15
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 1267
    .line 1268
    if-ge v3, v4, :cond_32

    .line 1269
    .line 1270
    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzV:J

    .line 1271
    .line 1272
    iget v6, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzf:I

    .line 1273
    .line 1274
    mul-int/2addr v6, v3

    .line 1275
    div-int/lit16 v6, v6, 0x3e8

    .line 1276
    .line 1277
    int-to-long v6, v6

    .line 1278
    add-long/2addr v4, v6

    .line 1279
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 1280
    .line 1281
    if-nez v3, :cond_31

    .line 1282
    .line 1283
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzae:Z

    .line 1284
    .line 1285
    if-nez v3, :cond_30

    .line 1286
    .line 1287
    or-int/lit8 v6, v6, 0x1

    .line 1288
    .line 1289
    :cond_30
    const/4 v7, 0x0

    .line 1290
    goto :goto_16

    .line 1291
    :cond_31
    move v7, v3

    .line 1292
    :goto_16
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 1293
    .line 1294
    aget v3, v3, v7

    .line 1295
    .line 1296
    sub-int/2addr v2, v3

    .line 1297
    move/from16 v36, v6

    .line 1298
    .line 1299
    move v6, v2

    .line 1300
    move-wide/from16 v37, v4

    .line 1301
    .line 1302
    move v5, v3

    .line 1303
    move-wide/from16 v2, v37

    .line 1304
    .line 1305
    move/from16 v4, v36

    .line 1306
    .line 1307
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzajh;->zzs(Lcom/google/android/gms/internal/ads/zzajg;JIII)V

    .line 1308
    .line 1309
    .line 1310
    const/16 v25, 0x1

    .line 1311
    .line 1312
    add-int/lit8 v3, v7, 0x1

    .line 1313
    .line 1314
    move v2, v6

    .line 1315
    goto :goto_15

    .line 1316
    :cond_32
    const/4 v3, 0x0

    .line 1317
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 1318
    .line 1319
    :cond_33
    :goto_17
    return-void

    .line 1320
    nop

    .line 1321
    :sswitch_data_0
    .sparse-switch
        -0x7ce7f5de -> :sswitch_21
        -0x7ce7f3b0 -> :sswitch_20
        -0x76567dc0 -> :sswitch_1f
        -0x6a615338 -> :sswitch_1e
        -0x672350af -> :sswitch_1d
        -0x585f4fce -> :sswitch_1c
        -0x585f4fcd -> :sswitch_1b
        -0x51dc40b2 -> :sswitch_1a
        -0x37a9c464 -> :sswitch_19
        -0x2016c535 -> :sswitch_18
        -0x2016c4e5 -> :sswitch_17
        -0x19552dbd -> :sswitch_16
        -0x1538b2ba -> :sswitch_15
        0x3c02325 -> :sswitch_14
        0x3c02353 -> :sswitch_13
        0x3c030c5 -> :sswitch_12
        0x4e81333 -> :sswitch_11
        0x4e86155 -> :sswitch_10
        0x4e86156 -> :sswitch_f
        0x5e8da3e -> :sswitch_e
        0x1a8350d6 -> :sswitch_d
        0x2056f406 -> :sswitch_c
        0x25e26ee2 -> :sswitch_b
        0x2b45174d -> :sswitch_a
        0x2b453ce4 -> :sswitch_9
        0x2c0618eb -> :sswitch_8
        0x2c065c6b -> :sswitch_7
        0x32fdf009 -> :sswitch_6
        0x3e4ca2d8 -> :sswitch_5
        0x54c61e47 -> :sswitch_4
        0x6bd6c624 -> :sswitch_3
        0x7446132a -> :sswitch_2
        0x7446b0a6 -> :sswitch_1
        0x744ad97d -> :sswitch_0
    .end sparse-switch
.end method

.method public final zzj(IJ)V
    .locals 10

    .line 1
    const/16 v0, 0xf0

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_1a

    .line 6
    .line 7
    const/16 v0, 0xf1

    .line 8
    .line 9
    if-eq p1, v0, :cond_19

    .line 10
    .line 11
    const/16 v0, 0x5031

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const-string v2, " not supported"

    .line 15
    .line 16
    if-eq p1, v0, :cond_17

    .line 17
    .line 18
    const/16 v0, 0x5032

    .line 19
    .line 20
    const-wide/16 v3, 0x1

    .line 21
    .line 22
    if-eq p1, v0, :cond_15

    .line 23
    .line 24
    const/16 v0, 0x21

    .line 25
    .line 26
    const/4 v5, -0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x3

    .line 29
    const/4 v8, 0x2

    .line 30
    const/4 v9, 0x1

    .line 31
    sparse-switch p1, :sswitch_data_0

    .line 32
    .line 33
    .line 34
    packed-switch p1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :pswitch_0
    long-to-int p2, p2

    .line 40
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 44
    .line 45
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzD:I

    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    long-to-int p2, p2

    .line 49
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 53
    .line 54
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzC:I

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_2
    long-to-int p2, p2

    .line 58
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 62
    .line 63
    iput-boolean v9, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzy:Z

    .line 64
    .line 65
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzi;->zzb(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eq p1, v5, :cond_1b

    .line 70
    .line 71
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 72
    .line 73
    iput p1, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzz:I

    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_3
    long-to-int p2, p2

    .line 77
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzi;->zzc(I)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eq p1, v5, :cond_1b

    .line 85
    .line 86
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 87
    .line 88
    iput p1, p2, Lcom/google/android/gms/internal/ads/zzajg;->zzA:I

    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_4
    long-to-int p2, p2

    .line 92
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 93
    .line 94
    .line 95
    if-eq p2, v9, :cond_1

    .line 96
    .line 97
    if-eq p2, v8, :cond_0

    .line 98
    .line 99
    goto/16 :goto_0

    .line 100
    .line 101
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 102
    .line 103
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzB:I

    .line 104
    .line 105
    return-void

    .line 106
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 107
    .line 108
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzB:I

    .line 109
    .line 110
    return-void

    .line 111
    :sswitch_0
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzz:J

    .line 112
    .line 113
    return-void

    .line 114
    :sswitch_1
    long-to-int p2, p2

    .line 115
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 119
    .line 120
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzf:I

    .line 121
    .line 122
    return-void

    .line 123
    :sswitch_2
    long-to-int p2, p2

    .line 124
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 125
    .line 126
    .line 127
    if-eqz p2, :cond_5

    .line 128
    .line 129
    if-eq p2, v9, :cond_4

    .line 130
    .line 131
    if-eq p2, v8, :cond_3

    .line 132
    .line 133
    if-eq p2, v7, :cond_2

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 138
    .line 139
    iput v7, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzs:I

    .line 140
    .line 141
    return-void

    .line 142
    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 143
    .line 144
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzs:I

    .line 145
    .line 146
    return-void

    .line 147
    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 148
    .line 149
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzs:I

    .line 150
    .line 151
    return-void

    .line 152
    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 153
    .line 154
    iput v6, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzs:I

    .line 155
    .line 156
    return-void

    .line 157
    :sswitch_3
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzaf:J

    .line 158
    .line 159
    return-void

    .line 160
    :sswitch_4
    long-to-int p2, p2

    .line 161
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 165
    .line 166
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzQ:I

    .line 167
    .line 168
    return-void

    .line 169
    :sswitch_5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 173
    .line 174
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzT:J

    .line 175
    .line 176
    return-void

    .line 177
    :sswitch_6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 181
    .line 182
    iput-wide p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzS:J

    .line 183
    .line 184
    return-void

    .line 185
    :sswitch_7
    long-to-int p2, p2

    .line 186
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 190
    .line 191
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzg:I

    .line 192
    .line 193
    return-void

    .line 194
    :sswitch_8
    long-to-int p2, p2

    .line 195
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 199
    .line 200
    iput-boolean v9, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzy:Z

    .line 201
    .line 202
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzo:I

    .line 203
    .line 204
    return-void

    .line 205
    :sswitch_9
    cmp-long p2, p2, v3

    .line 206
    .line 207
    if-nez p2, :cond_6

    .line 208
    .line 209
    move v6, v9

    .line 210
    :cond_6
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 211
    .line 212
    .line 213
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 214
    .line 215
    iput-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzW:Z

    .line 216
    .line 217
    return-void

    .line 218
    :sswitch_a
    long-to-int p2, p2

    .line 219
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 220
    .line 221
    .line 222
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 223
    .line 224
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzq:I

    .line 225
    .line 226
    return-void

    .line 227
    :sswitch_b
    long-to-int p2, p2

    .line 228
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 232
    .line 233
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzr:I

    .line 234
    .line 235
    return-void

    .line 236
    :sswitch_c
    long-to-int p2, p2

    .line 237
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 241
    .line 242
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzp:I

    .line 243
    .line 244
    return-void

    .line 245
    :sswitch_d
    long-to-int p2, p2

    .line 246
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 247
    .line 248
    .line 249
    if-eqz p2, :cond_a

    .line 250
    .line 251
    if-eq p2, v9, :cond_9

    .line 252
    .line 253
    if-eq p2, v7, :cond_8

    .line 254
    .line 255
    const/16 p1, 0xf

    .line 256
    .line 257
    if-eq p2, p1, :cond_7

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 262
    .line 263
    iput v7, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzx:I

    .line 264
    .line 265
    return-void

    .line 266
    :cond_8
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 267
    .line 268
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzx:I

    .line 269
    .line 270
    return-void

    .line 271
    :cond_9
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 272
    .line 273
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzx:I

    .line 274
    .line 275
    return-void

    .line 276
    :cond_a
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 277
    .line 278
    iput v6, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzx:I

    .line 279
    .line 280
    return-void

    .line 281
    :sswitch_e
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzy:J

    .line 282
    .line 283
    add-long/2addr p2, v0

    .line 284
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzH:J

    .line 285
    .line 286
    return-void

    .line 287
    :sswitch_f
    cmp-long p1, p2, v3

    .line 288
    .line 289
    if-nez p1, :cond_b

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_b
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    new-instance v0, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    add-int/lit8 p1, p1, 0x24

    .line 304
    .line 305
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 306
    .line 307
    .line 308
    const-string p1, "AESSettingsCipherMode "

    .line 309
    .line 310
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    throw p1

    .line 328
    :sswitch_10
    const-wide/16 v3, 0x5

    .line 329
    .line 330
    cmp-long p1, p2, v3

    .line 331
    .line 332
    if-nez p1, :cond_c

    .line 333
    .line 334
    goto/16 :goto_0

    .line 335
    .line 336
    :cond_c
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    add-int/lit8 p1, p1, 0x1d

    .line 347
    .line 348
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 349
    .line 350
    .line 351
    const-string p1, "ContentEncAlgo "

    .line 352
    .line 353
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    throw p1

    .line 371
    :sswitch_11
    cmp-long p1, p2, v3

    .line 372
    .line 373
    if-nez p1, :cond_d

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :cond_d
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    add-int/lit8 p1, p1, 0x1e

    .line 386
    .line 387
    new-instance v0, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 390
    .line 391
    .line 392
    const-string p1, "EBMLReadVersion "

    .line 393
    .line 394
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    throw p1

    .line 412
    :sswitch_12
    cmp-long p1, p2, v3

    .line 413
    .line 414
    if-ltz p1, :cond_e

    .line 415
    .line 416
    const-wide/16 v3, 0x2

    .line 417
    .line 418
    cmp-long p1, p2, v3

    .line 419
    .line 420
    if-gtz p1, :cond_e

    .line 421
    .line 422
    goto/16 :goto_0

    .line 423
    .line 424
    :cond_e
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 429
    .line 430
    .line 431
    move-result p1

    .line 432
    new-instance v3, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    add-int/2addr p1, v0

    .line 435
    invoke-direct {v3, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 436
    .line 437
    .line 438
    const-string p1, "DocTypeReadVersion "

    .line 439
    .line 440
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    throw p1

    .line 458
    :sswitch_13
    const-wide/16 v3, 0x3

    .line 459
    .line 460
    cmp-long p1, p2, v3

    .line 461
    .line 462
    if-nez p1, :cond_f

    .line 463
    .line 464
    goto/16 :goto_0

    .line 465
    .line 466
    :cond_f
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 471
    .line 472
    .line 473
    move-result p1

    .line 474
    add-int/lit8 p1, p1, 0x1e

    .line 475
    .line 476
    new-instance v0, Ljava/lang/StringBuilder;

    .line 477
    .line 478
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 479
    .line 480
    .line 481
    const-string p1, "ContentCompAlgo "

    .line 482
    .line 483
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    throw p1

    .line 501
    :sswitch_14
    long-to-int p2, p2

    .line 502
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 503
    .line 504
    .line 505
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 506
    .line 507
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzajg;->zzd(I)V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :sswitch_15
    iput-boolean v9, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzae:Z

    .line 512
    .line 513
    return-void

    .line 514
    :sswitch_16
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 515
    .line 516
    if-nez v0, :cond_1b

    .line 517
    .line 518
    long-to-int p2, p2

    .line 519
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 520
    .line 521
    .line 522
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzL:I

    .line 523
    .line 524
    return-void

    .line 525
    :sswitch_17
    long-to-int p1, p2

    .line 526
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzad:I

    .line 527
    .line 528
    return-void

    .line 529
    :sswitch_18
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzz(J)J

    .line 530
    .line 531
    .line 532
    move-result-wide p1

    .line 533
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzS:J

    .line 534
    .line 535
    return-void

    .line 536
    :sswitch_19
    long-to-int p2, p2

    .line 537
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 538
    .line 539
    .line 540
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 541
    .line 542
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzd:I

    .line 543
    .line 544
    return-void

    .line 545
    :sswitch_1a
    long-to-int p2, p2

    .line 546
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 547
    .line 548
    .line 549
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 550
    .line 551
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzn:I

    .line 552
    .line 553
    return-void

    .line 554
    :sswitch_1b
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 555
    .line 556
    if-nez v0, :cond_1b

    .line 557
    .line 558
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 559
    .line 560
    .line 561
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzz(J)J

    .line 562
    .line 563
    .line 564
    move-result-wide p1

    .line 565
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzK:J

    .line 566
    .line 567
    return-void

    .line 568
    :sswitch_1c
    long-to-int p2, p2

    .line 569
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 570
    .line 571
    .line 572
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 573
    .line 574
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzm:I

    .line 575
    .line 576
    return-void

    .line 577
    :sswitch_1d
    long-to-int p2, p2

    .line 578
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 579
    .line 580
    .line 581
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 582
    .line 583
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzP:I

    .line 584
    .line 585
    return-void

    .line 586
    :sswitch_1e
    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/zzajh;->zzz(J)J

    .line 587
    .line 588
    .line 589
    move-result-wide p1

    .line 590
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzW:J

    .line 591
    .line 592
    return-void

    .line 593
    :sswitch_1f
    cmp-long p2, p2, v3

    .line 594
    .line 595
    if-nez p2, :cond_10

    .line 596
    .line 597
    move v6, v9

    .line 598
    :cond_10
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 599
    .line 600
    .line 601
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 602
    .line 603
    iput-boolean v6, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzX:Z

    .line 604
    .line 605
    return-void

    .line 606
    :sswitch_20
    long-to-int p2, p2

    .line 607
    if-eq p2, v9, :cond_14

    .line 608
    .line 609
    if-eq p2, v8, :cond_13

    .line 610
    .line 611
    const/16 p3, 0x11

    .line 612
    .line 613
    if-eq p2, p3, :cond_12

    .line 614
    .line 615
    if-eq p2, v0, :cond_11

    .line 616
    .line 617
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 618
    .line 619
    .line 620
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 621
    .line 622
    iput v5, p1, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 623
    .line 624
    return-void

    .line 625
    :cond_11
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 626
    .line 627
    .line 628
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 629
    .line 630
    const/4 p2, 0x5

    .line 631
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 632
    .line 633
    return-void

    .line 634
    :cond_12
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 635
    .line 636
    .line 637
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 638
    .line 639
    iput v7, p1, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 640
    .line 641
    return-void

    .line 642
    :cond_13
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 643
    .line 644
    .line 645
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 646
    .line 647
    iput v9, p1, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 648
    .line 649
    return-void

    .line 650
    :cond_14
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 651
    .line 652
    .line 653
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 654
    .line 655
    iput v8, p1, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 656
    .line 657
    return-void

    .line 658
    :cond_15
    cmp-long p1, p2, v3

    .line 659
    .line 660
    if-nez p1, :cond_16

    .line 661
    .line 662
    goto :goto_0

    .line 663
    :cond_16
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 668
    .line 669
    .line 670
    move-result p1

    .line 671
    add-int/lit8 p1, p1, 0x23

    .line 672
    .line 673
    new-instance v0, Ljava/lang/StringBuilder;

    .line 674
    .line 675
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 676
    .line 677
    .line 678
    const-string p1, "ContentEncodingScope "

    .line 679
    .line 680
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object p1

    .line 693
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 694
    .line 695
    .line 696
    move-result-object p1

    .line 697
    throw p1

    .line 698
    :cond_17
    const-wide/16 v3, 0x0

    .line 699
    .line 700
    cmp-long p1, p2, v3

    .line 701
    .line 702
    if-nez p1, :cond_18

    .line 703
    .line 704
    goto :goto_0

    .line 705
    :cond_18
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object p1

    .line 709
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 710
    .line 711
    .line 712
    move-result p1

    .line 713
    add-int/lit8 p1, p1, 0x23

    .line 714
    .line 715
    new-instance v0, Ljava/lang/StringBuilder;

    .line 716
    .line 717
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 718
    .line 719
    .line 720
    const-string p1, "ContentEncodingOrder "

    .line 721
    .line 722
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 736
    .line 737
    .line 738
    move-result-object p1

    .line 739
    throw p1

    .line 740
    :cond_19
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 741
    .line 742
    if-nez v0, :cond_1b

    .line 743
    .line 744
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 745
    .line 746
    .line 747
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    .line 748
    .line 749
    cmp-long p1, v3, v1

    .line 750
    .line 751
    if-nez p1, :cond_1b

    .line 752
    .line 753
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzM:J

    .line 754
    .line 755
    return-void

    .line 756
    :cond_1a
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzF:Z

    .line 757
    .line 758
    if-nez v0, :cond_1b

    .line 759
    .line 760
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzr(I)V

    .line 761
    .line 762
    .line 763
    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzN:J

    .line 764
    .line 765
    cmp-long p1, v3, v1

    .line 766
    .line 767
    if-nez p1, :cond_1b

    .line 768
    .line 769
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzN:J

    .line 770
    .line 771
    :cond_1b
    :goto_0
    return-void

    .line 772
    nop

    .line 773
    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_20
        0x88 -> :sswitch_1f
        0x9b -> :sswitch_1e
        0x9f -> :sswitch_1d
        0xb0 -> :sswitch_1c
        0xb3 -> :sswitch_1b
        0xba -> :sswitch_1a
        0xd7 -> :sswitch_19
        0xe7 -> :sswitch_18
        0xee -> :sswitch_17
        0xf7 -> :sswitch_16
        0xfb -> :sswitch_15
        0x41e7 -> :sswitch_14
        0x4254 -> :sswitch_13
        0x4285 -> :sswitch_12
        0x42f7 -> :sswitch_11
        0x47e1 -> :sswitch_10
        0x47e8 -> :sswitch_f
        0x53ac -> :sswitch_e
        0x53b8 -> :sswitch_d
        0x54b0 -> :sswitch_c
        0x54b2 -> :sswitch_b
        0x54ba -> :sswitch_a
        0x55aa -> :sswitch_9
        0x55b2 -> :sswitch_8
        0x55ee -> :sswitch_7
        0x56aa -> :sswitch_6
        0x56bb -> :sswitch_5
        0x6264 -> :sswitch_4
        0x75a2 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzk(ID)V
    .locals 1

    .line 1
    const/16 v0, 0xb5

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x4489

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_1

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    double-to-float p2, p2

    .line 17
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 21
    .line 22
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzv:F

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    double-to-float p2, p2

    .line 26
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 30
    .line 31
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzu:F

    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    double-to-float p2, p2

    .line 35
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 39
    .line 40
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzt:F

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_3
    double-to-float p2, p2

    .line 44
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 48
    .line 49
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzN:F

    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    double-to-float p2, p2

    .line 53
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 57
    .line 58
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzM:F

    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_5
    double-to-float p2, p2

    .line 62
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 66
    .line 67
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzL:F

    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_6
    double-to-float p2, p2

    .line 71
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 75
    .line 76
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzK:F

    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_7
    double-to-float p2, p2

    .line 80
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 84
    .line 85
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzJ:F

    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_8
    double-to-float p2, p2

    .line 89
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 93
    .line 94
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzI:F

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_9
    double-to-float p2, p2

    .line 98
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 102
    .line 103
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzH:F

    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_a
    double-to-float p2, p2

    .line 107
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 111
    .line 112
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzG:F

    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_b
    double-to-float p2, p2

    .line 116
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 120
    .line 121
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzF:F

    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_c
    double-to-float p2, p2

    .line 125
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 129
    .line 130
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzE:F

    .line 131
    .line 132
    return-void

    .line 133
    :cond_0
    double-to-long p1, p2

    .line 134
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzA:J

    .line 135
    .line 136
    return-void

    .line 137
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 138
    .line 139
    .line 140
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 141
    .line 142
    double-to-int p2, p2

    .line 143
    iput p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzR:I

    .line 144
    .line 145
    return-void

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x55d1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    :pswitch_data_1
    .packed-switch 0x7673
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzl(ILjava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x86

    .line 2
    .line 3
    if-eq p1, v0, :cond_5

    .line 4
    .line 5
    const/16 v0, 0x4282

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x536e

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const v0, 0x22b59c

    .line 14
    .line 15
    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzajg;->zze(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 32
    .line 33
    iput-object p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzb:Ljava/lang/String;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string p1, "webm"

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    const-string v0, "matroska"

    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    add-int/lit8 p1, p1, 0x16

    .line 60
    .line 61
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 62
    .line 63
    .line 64
    const-string p1, "DocType "

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p1, " not supported"

    .line 73
    .line 74
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    throw p1

    .line 87
    :cond_4
    :goto_0
    invoke-static {p2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzC:Z

    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 98
    .line 99
    iput-object p2, p1, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 100
    .line 101
    return-void
.end method

.method public final zzm(IILcom/google/android/gms/internal/ads/zzaev;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    const/16 v3, 0xa1

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x4

    .line 14
    const/16 v8, 0xa3

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    if-eq v1, v3, :cond_b

    .line 19
    .line 20
    if-eq v1, v8, :cond_b

    .line 21
    .line 22
    const/16 v3, 0xa5

    .line 23
    .line 24
    if-eq v1, v3, :cond_8

    .line 25
    .line 26
    const/16 v3, 0x41ed

    .line 27
    .line 28
    if-eq v1, v3, :cond_5

    .line 29
    .line 30
    const/16 v3, 0x4255

    .line 31
    .line 32
    if-eq v1, v3, :cond_4

    .line 33
    .line 34
    const/16 v3, 0x47e2

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    const/16 v3, 0x53ab

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    const/16 v3, 0x63a2

    .line 43
    .line 44
    if-eq v1, v3, :cond_1

    .line 45
    .line 46
    const/16 v3, 0x7672

    .line 47
    .line 48
    if-ne v1, v3, :cond_0

    .line 49
    .line 50
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 54
    .line 55
    new-array v3, v2, [B

    .line 56
    .line 57
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzw:[B

    .line 58
    .line 59
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    add-int/lit8 v2, v2, 0xf

    .line 74
    .line 75
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 76
    .line 77
    .line 78
    const-string v2, "Unexpected id: "

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    throw v1

    .line 95
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 99
    .line 100
    new-array v3, v2, [B

    .line 101
    .line 102
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzk:[B

    .line 103
    .line 104
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzq:Lcom/google/android/gms/internal/ads/zzer;

    .line 109
    .line 110
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3, v10}, Ljava/util/Arrays;->fill([BB)V

    .line 115
    .line 116
    .line 117
    rsub-int/lit8 v3, v2, 0x4

    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {v7, v4, v3, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/ads/zzer;->zzh(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzz()J

    .line 130
    .line 131
    .line 132
    move-result-wide v1

    .line 133
    long-to-int v1, v1

    .line 134
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzG:I

    .line 135
    .line 136
    return-void

    .line 137
    :cond_3
    new-array v3, v2, [B

    .line 138
    .line 139
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 140
    .line 141
    .line 142
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 146
    .line 147
    new-instance v2, Lcom/google/android/gms/internal/ads/zzagg;

    .line 148
    .line 149
    invoke-direct {v2, v9, v3, v10, v10}, Lcom/google/android/gms/internal/ads/zzagg;-><init>(I[BII)V

    .line 150
    .line 151
    .line 152
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzj:Lcom/google/android/gms/internal/ads/zzagg;

    .line 153
    .line 154
    return-void

    .line 155
    :cond_4
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 159
    .line 160
    new-array v3, v2, [B

    .line 161
    .line 162
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzi:[B

    .line 163
    .line 164
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzajh;->zzq(I)V

    .line 169
    .line 170
    .line 171
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzE:Lcom/google/android/gms/internal/ads/zzajg;

    .line 172
    .line 173
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzajg;->zzc()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const v4, 0x64767643

    .line 178
    .line 179
    .line 180
    if-eq v3, v4, :cond_7

    .line 181
    .line 182
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzajg;->zzc()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    const v4, 0x64766343

    .line 187
    .line 188
    .line 189
    if-ne v3, v4, :cond_6

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_6
    invoke-interface {v7, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_7
    :goto_0
    new-array v3, v2, [B

    .line 197
    .line 198
    iput-object v3, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzO:[B

    .line 199
    .line 200
    invoke-interface {v7, v3, v10, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_8
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 205
    .line 206
    if-eq v1, v5, :cond_9

    .line 207
    .line 208
    goto/16 :goto_d

    .line 209
    .line 210
    :cond_9
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 211
    .line 212
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzaa:I

    .line 213
    .line 214
    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Lcom/google/android/gms/internal/ads/zzajg;

    .line 219
    .line 220
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzad:I

    .line 221
    .line 222
    if-ne v3, v6, :cond_a

    .line 223
    .line 224
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzajg;->zzc:Ljava/lang/String;

    .line 225
    .line 226
    const-string v3, "V_VP9"

    .line 227
    .line 228
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_a

    .line 233
    .line 234
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzv:Lcom/google/android/gms/internal/ads/zzer;

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-interface {v7, v1, v10, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzc([BII)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_a
    invoke-interface {v7, v2}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_b
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 252
    .line 253
    const/16 v11, 0x8

    .line 254
    .line 255
    if-nez v3, :cond_c

    .line 256
    .line 257
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzh:Lcom/google/android/gms/internal/ads/zzajj;

    .line 258
    .line 259
    invoke-virtual {v3, v7, v10, v9, v11}, Lcom/google/android/gms/internal/ads/zzajj;->zzb(Lcom/google/android/gms/internal/ads/zzaev;ZZI)J

    .line 260
    .line 261
    .line 262
    move-result-wide v12

    .line 263
    long-to-int v12, v12

    .line 264
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzaa:I

    .line 265
    .line 266
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzajj;->zzc()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzab:I

    .line 271
    .line 272
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzW:J

    .line 278
    .line 279
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 280
    .line 281
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 282
    .line 283
    invoke-virtual {v3, v10}, Lcom/google/android/gms/internal/ads/zzer;->zza(I)V

    .line 284
    .line 285
    .line 286
    :cond_c
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzi:Landroid/util/SparseArray;

    .line 287
    .line 288
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzaa:I

    .line 289
    .line 290
    invoke-virtual {v3, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Lcom/google/android/gms/internal/ads/zzajg;

    .line 295
    .line 296
    if-nez v3, :cond_d

    .line 297
    .line 298
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzab:I

    .line 299
    .line 300
    sub-int v1, v2, v1

    .line 301
    .line 302
    invoke-interface {v7, v1}, Lcom/google/android/gms/internal/ads/zzaev;->zzf(I)V

    .line 303
    .line 304
    .line 305
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 306
    .line 307
    return-void

    .line 308
    :cond_d
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzajg;->zzb()V

    .line 309
    .line 310
    .line 311
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 312
    .line 313
    if-ne v12, v9, :cond_1f

    .line 314
    .line 315
    const/4 v12, 0x3

    .line 316
    invoke-direct {v0, v7, v12}, Lcom/google/android/gms/internal/ads/zzajh;->zzt(Lcom/google/android/gms/internal/ads/zzaev;I)V

    .line 317
    .line 318
    .line 319
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzo:Lcom/google/android/gms/internal/ads/zzer;

    .line 320
    .line 321
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 322
    .line 323
    .line 324
    move-result-object v14

    .line 325
    aget-byte v14, v14, v5

    .line 326
    .line 327
    and-int/lit8 v14, v14, 0x6

    .line 328
    .line 329
    shr-int/2addr v14, v9

    .line 330
    const/16 v15, 0xff

    .line 331
    .line 332
    if-nez v14, :cond_e

    .line 333
    .line 334
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 335
    .line 336
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 337
    .line 338
    invoke-static {v4, v9}, Lcom/google/android/gms/internal/ads/zzajh;->zzA([II)[I

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 343
    .line 344
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzab:I

    .line 345
    .line 346
    sub-int/2addr v2, v6

    .line 347
    add-int/lit8 v2, v2, -0x3

    .line 348
    .line 349
    aput v2, v4, v10

    .line 350
    .line 351
    :goto_1
    move/from16 v18, v5

    .line 352
    .line 353
    move/from16 v20, v9

    .line 354
    .line 355
    move/from16 v17, v10

    .line 356
    .line 357
    move/from16 v19, v11

    .line 358
    .line 359
    goto/16 :goto_8

    .line 360
    .line 361
    :cond_e
    invoke-direct {v0, v7, v6}, Lcom/google/android/gms/internal/ads/zzajh;->zzt(Lcom/google/android/gms/internal/ads/zzaev;I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 365
    .line 366
    .line 367
    move-result-object v16

    .line 368
    aget-byte v6, v16, v12

    .line 369
    .line 370
    and-int/2addr v6, v15

    .line 371
    add-int/2addr v6, v9

    .line 372
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 373
    .line 374
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 375
    .line 376
    invoke-static {v8, v6}, Lcom/google/android/gms/internal/ads/zzajh;->zzA([II)[I

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    iput-object v6, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 381
    .line 382
    if-ne v14, v5, :cond_f

    .line 383
    .line 384
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzab:I

    .line 385
    .line 386
    sub-int/2addr v2, v4

    .line 387
    add-int/lit8 v2, v2, -0x4

    .line 388
    .line 389
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 390
    .line 391
    div-int/2addr v2, v4

    .line 392
    invoke-static {v6, v10, v4, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 393
    .line 394
    .line 395
    goto :goto_1

    .line 396
    :cond_f
    if-ne v14, v9, :cond_12

    .line 397
    .line 398
    move v4, v10

    .line 399
    move v8, v4

    .line 400
    const/4 v6, 0x4

    .line 401
    :goto_2
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 402
    .line 403
    add-int/lit8 v12, v12, -0x1

    .line 404
    .line 405
    if-ge v4, v12, :cond_11

    .line 406
    .line 407
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 408
    .line 409
    aput v10, v12, v4

    .line 410
    .line 411
    :goto_3
    add-int/lit8 v12, v6, 0x1

    .line 412
    .line 413
    invoke-direct {v0, v7, v12}, Lcom/google/android/gms/internal/ads/zzajh;->zzt(Lcom/google/android/gms/internal/ads/zzaev;I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 417
    .line 418
    .line 419
    move-result-object v14

    .line 420
    aget-byte v6, v14, v6

    .line 421
    .line 422
    and-int/2addr v6, v15

    .line 423
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 424
    .line 425
    aget v17, v14, v4

    .line 426
    .line 427
    add-int v17, v17, v6

    .line 428
    .line 429
    aput v17, v14, v4

    .line 430
    .line 431
    if-eq v6, v15, :cond_10

    .line 432
    .line 433
    add-int v8, v8, v17

    .line 434
    .line 435
    add-int/lit8 v4, v4, 0x1

    .line 436
    .line 437
    move v6, v12

    .line 438
    goto :goto_2

    .line 439
    :cond_10
    move v6, v12

    .line 440
    goto :goto_3

    .line 441
    :cond_11
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 442
    .line 443
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzab:I

    .line 444
    .line 445
    sub-int/2addr v2, v14

    .line 446
    sub-int/2addr v2, v6

    .line 447
    sub-int/2addr v2, v8

    .line 448
    aput v2, v4, v12

    .line 449
    .line 450
    goto :goto_1

    .line 451
    :cond_12
    if-ne v14, v12, :cond_1e

    .line 452
    .line 453
    move v8, v10

    .line 454
    move v12, v8

    .line 455
    const/4 v6, 0x4

    .line 456
    :goto_4
    iget v14, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 457
    .line 458
    add-int/lit8 v14, v14, -0x1

    .line 459
    .line 460
    if-ge v8, v14, :cond_1a

    .line 461
    .line 462
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 463
    .line 464
    aput v10, v14, v8

    .line 465
    .line 466
    add-int/lit8 v14, v6, 0x1

    .line 467
    .line 468
    invoke-direct {v0, v7, v14}, Lcom/google/android/gms/internal/ads/zzajh;->zzt(Lcom/google/android/gms/internal/ads/zzaev;I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 472
    .line 473
    .line 474
    move-result-object v17

    .line 475
    aget-byte v17, v17, v6

    .line 476
    .line 477
    if-eqz v17, :cond_19

    .line 478
    .line 479
    move/from16 v17, v10

    .line 480
    .line 481
    :goto_5
    if-ge v10, v11, :cond_15

    .line 482
    .line 483
    rsub-int/lit8 v18, v10, 0x7

    .line 484
    .line 485
    move/from16 v19, v11

    .line 486
    .line 487
    shl-int v11, v9, v18

    .line 488
    .line 489
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 490
    .line 491
    .line 492
    move-result-object v18

    .line 493
    aget-byte v18, v18, v6

    .line 494
    .line 495
    and-int v18, v18, v11

    .line 496
    .line 497
    if-eqz v18, :cond_14

    .line 498
    .line 499
    add-int/2addr v14, v10

    .line 500
    invoke-direct {v0, v7, v14}, Lcom/google/android/gms/internal/ads/zzajh;->zzt(Lcom/google/android/gms/internal/ads/zzaev;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 504
    .line 505
    .line 506
    move-result-object v18

    .line 507
    add-int/lit8 v20, v6, 0x1

    .line 508
    .line 509
    aget-byte v6, v18, v6

    .line 510
    .line 511
    and-int/2addr v6, v15

    .line 512
    not-int v11, v11

    .line 513
    and-int/2addr v6, v11

    .line 514
    move v11, v5

    .line 515
    int-to-long v5, v6

    .line 516
    move/from16 v18, v11

    .line 517
    .line 518
    move/from16 v11, v20

    .line 519
    .line 520
    :goto_6
    if-ge v11, v14, :cond_13

    .line 521
    .line 522
    shl-long v5, v5, v19

    .line 523
    .line 524
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 525
    .line 526
    .line 527
    move-result-object v20

    .line 528
    add-int/lit8 v21, v11, 0x1

    .line 529
    .line 530
    aget-byte v11, v20, v11

    .line 531
    .line 532
    and-int/2addr v11, v15

    .line 533
    move/from16 v20, v9

    .line 534
    .line 535
    move/from16 v22, v10

    .line 536
    .line 537
    int-to-long v9, v11

    .line 538
    or-long/2addr v5, v9

    .line 539
    move/from16 v9, v20

    .line 540
    .line 541
    move/from16 v11, v21

    .line 542
    .line 543
    move/from16 v10, v22

    .line 544
    .line 545
    goto :goto_6

    .line 546
    :cond_13
    move/from16 v20, v9

    .line 547
    .line 548
    move/from16 v22, v10

    .line 549
    .line 550
    if-lez v8, :cond_16

    .line 551
    .line 552
    mul-int/lit8 v10, v22, 0x7

    .line 553
    .line 554
    add-int/lit8 v10, v10, 0x6

    .line 555
    .line 556
    const-wide/16 v21, 0x1

    .line 557
    .line 558
    shl-long v9, v21, v10

    .line 559
    .line 560
    const-wide/16 v21, -0x1

    .line 561
    .line 562
    add-long v9, v9, v21

    .line 563
    .line 564
    sub-long/2addr v5, v9

    .line 565
    goto :goto_7

    .line 566
    :cond_14
    move/from16 v18, v5

    .line 567
    .line 568
    move/from16 v20, v9

    .line 569
    .line 570
    move/from16 v22, v10

    .line 571
    .line 572
    add-int/lit8 v10, v22, 0x1

    .line 573
    .line 574
    move/from16 v11, v19

    .line 575
    .line 576
    goto :goto_5

    .line 577
    :cond_15
    move/from16 v18, v5

    .line 578
    .line 579
    move/from16 v20, v9

    .line 580
    .line 581
    move/from16 v19, v11

    .line 582
    .line 583
    const-wide/16 v5, 0x0

    .line 584
    .line 585
    :cond_16
    :goto_7
    const-wide/32 v9, -0x80000000

    .line 586
    .line 587
    .line 588
    cmp-long v9, v5, v9

    .line 589
    .line 590
    if-ltz v9, :cond_18

    .line 591
    .line 592
    const-wide/32 v9, 0x7fffffff

    .line 593
    .line 594
    .line 595
    cmp-long v9, v5, v9

    .line 596
    .line 597
    if-gtz v9, :cond_18

    .line 598
    .line 599
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 600
    .line 601
    long-to-int v5, v5

    .line 602
    if-eqz v8, :cond_17

    .line 603
    .line 604
    add-int/lit8 v6, v8, -0x1

    .line 605
    .line 606
    aget v6, v9, v6

    .line 607
    .line 608
    add-int/2addr v5, v6

    .line 609
    :cond_17
    aput v5, v9, v8

    .line 610
    .line 611
    add-int/2addr v12, v5

    .line 612
    add-int/lit8 v8, v8, 0x1

    .line 613
    .line 614
    move v6, v14

    .line 615
    move/from16 v10, v17

    .line 616
    .line 617
    move/from16 v5, v18

    .line 618
    .line 619
    move/from16 v11, v19

    .line 620
    .line 621
    move/from16 v9, v20

    .line 622
    .line 623
    goto/16 :goto_4

    .line 624
    .line 625
    :cond_18
    const-string v1, "EBML lacing sample size out of range."

    .line 626
    .line 627
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    throw v1

    .line 632
    :cond_19
    const-string v1, "No valid varint length mask found"

    .line 633
    .line 634
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    throw v1

    .line 639
    :cond_1a
    move/from16 v18, v5

    .line 640
    .line 641
    move/from16 v20, v9

    .line 642
    .line 643
    move/from16 v17, v10

    .line 644
    .line 645
    move/from16 v19, v11

    .line 646
    .line 647
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 648
    .line 649
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzab:I

    .line 650
    .line 651
    sub-int/2addr v2, v5

    .line 652
    sub-int/2addr v2, v6

    .line 653
    sub-int/2addr v2, v12

    .line 654
    aput v2, v4, v14

    .line 655
    .line 656
    :goto_8
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    aget-byte v2, v2, v17

    .line 661
    .line 662
    shl-int/lit8 v2, v2, 0x8

    .line 663
    .line 664
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    aget-byte v4, v4, v20

    .line 669
    .line 670
    and-int/2addr v4, v15

    .line 671
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzS:J

    .line 672
    .line 673
    or-int/2addr v2, v4

    .line 674
    int-to-long v8, v2

    .line 675
    invoke-direct {v0, v8, v9}, Lcom/google/android/gms/internal/ads/zzajh;->zzz(J)J

    .line 676
    .line 677
    .line 678
    move-result-wide v8

    .line 679
    add-long/2addr v5, v8

    .line 680
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzV:J

    .line 681
    .line 682
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzajg;->zze:I

    .line 683
    .line 684
    move/from16 v4, v20

    .line 685
    .line 686
    if-eq v2, v4, :cond_1b

    .line 687
    .line 688
    const/16 v2, 0xa3

    .line 689
    .line 690
    if-ne v1, v2, :cond_1d

    .line 691
    .line 692
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzer;->zzi()[B

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    aget-byte v1, v1, v18

    .line 697
    .line 698
    const/16 v2, 0x80

    .line 699
    .line 700
    and-int/2addr v1, v2

    .line 701
    if-ne v1, v2, :cond_1c

    .line 702
    .line 703
    const/16 v1, 0xa3

    .line 704
    .line 705
    :cond_1b
    const/4 v2, 0x1

    .line 706
    goto :goto_9

    .line 707
    :cond_1c
    move/from16 v2, v17

    .line 708
    .line 709
    const/16 v1, 0xa3

    .line 710
    .line 711
    goto :goto_9

    .line 712
    :cond_1d
    move/from16 v2, v17

    .line 713
    .line 714
    :goto_9
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 715
    .line 716
    move/from16 v11, v18

    .line 717
    .line 718
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 719
    .line 720
    move/from16 v2, v17

    .line 721
    .line 722
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 723
    .line 724
    const/16 v2, 0xa3

    .line 725
    .line 726
    goto :goto_a

    .line 727
    :cond_1e
    const-string v1, "Unexpected lacing value: 2"

    .line 728
    .line 729
    invoke-static {v1, v4}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    throw v1

    .line 734
    :cond_1f
    move v2, v8

    .line 735
    :goto_a
    if-ne v1, v2, :cond_21

    .line 736
    .line 737
    :goto_b
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 738
    .line 739
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 740
    .line 741
    if-ge v1, v2, :cond_20

    .line 742
    .line 743
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 744
    .line 745
    aget v1, v2, v1

    .line 746
    .line 747
    const/4 v2, 0x0

    .line 748
    invoke-direct {v0, v7, v3, v1, v2}, Lcom/google/android/gms/internal/ads/zzajh;->zzu(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzajg;IZ)I

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzV:J

    .line 753
    .line 754
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 755
    .line 756
    iget v6, v3, Lcom/google/android/gms/internal/ads/zzajg;->zzf:I

    .line 757
    .line 758
    mul-int/2addr v4, v6

    .line 759
    div-int/lit16 v4, v4, 0x3e8

    .line 760
    .line 761
    int-to-long v8, v4

    .line 762
    add-long/2addr v1, v8

    .line 763
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzac:I

    .line 764
    .line 765
    const/4 v6, 0x0

    .line 766
    move-wide/from16 v23, v1

    .line 767
    .line 768
    move-object v1, v3

    .line 769
    move-wide/from16 v2, v23

    .line 770
    .line 771
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzajh;->zzs(Lcom/google/android/gms/internal/ads/zzajg;JIII)V

    .line 772
    .line 773
    .line 774
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 775
    .line 776
    const/4 v4, 0x1

    .line 777
    add-int/2addr v2, v4

    .line 778
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 779
    .line 780
    move-object v3, v1

    .line 781
    goto :goto_b

    .line 782
    :cond_20
    const/4 v2, 0x0

    .line 783
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzU:I

    .line 784
    .line 785
    return-void

    .line 786
    :cond_21
    move-object v1, v3

    .line 787
    const/4 v4, 0x1

    .line 788
    :goto_c
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 789
    .line 790
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzY:I

    .line 791
    .line 792
    if-ge v2, v3, :cond_22

    .line 793
    .line 794
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzZ:[I

    .line 795
    .line 796
    aget v5, v3, v2

    .line 797
    .line 798
    invoke-direct {v0, v7, v1, v5, v4}, Lcom/google/android/gms/internal/ads/zzajh;->zzu(Lcom/google/android/gms/internal/ads/zzaev;Lcom/google/android/gms/internal/ads/zzajg;IZ)I

    .line 799
    .line 800
    .line 801
    move-result v5

    .line 802
    aput v5, v3, v2

    .line 803
    .line 804
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 805
    .line 806
    add-int/2addr v2, v4

    .line 807
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzX:I

    .line 808
    .line 809
    goto :goto_c

    .line 810
    :cond_22
    :goto_d
    return-void
.end method
