.class public final Lcom/google/android/gms/internal/ads/zzift;
.super Lcom/google/android/gms/internal/ads/zzibr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzidd;


# static fields
.field private static final zzy:Lcom/google/android/gms/internal/ads/zzift;

.field private static volatile zzz:Lcom/google/android/gms/internal/ads/zzidk;


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:Z

.field private zzd:Ljava/lang/String;

.field private zze:Lcom/google/android/gms/internal/ads/zzicd;

.field private zzf:I

.field private zzg:Z

.field private zzh:Z

.field private zzi:Z

.field private zzj:Ljava/lang/String;

.field private zzk:I

.field private zzl:I

.field private zzm:I

.field private zzn:Z

.field private zzo:Lcom/google/android/gms/internal/ads/zzicd;

.field private zzp:Z

.field private zzu:J

.field private zzv:Lcom/google/android/gms/internal/ads/zzibz;

.field private zzw:Z

.field private zzx:Lcom/google/android/gms/internal/ads/zzibz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzift;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzift;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzift;->zzy:Lcom/google/android/gms/internal/ads/zzift;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/ads/zzift;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbu(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzibr;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzift;->zzd:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibr;->zzbM()Lcom/google/android/gms/internal/ads/zzicd;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzift;->zze:Lcom/google/android/gms/internal/ads/zzicd;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzift;->zzj:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibr;->zzbM()Lcom/google/android/gms/internal/ads/zzicd;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzift;->zzo:Lcom/google/android/gms/internal/ads/zzicd;

    .line 21
    .line 22
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibr;->zzbC()Lcom/google/android/gms/internal/ads/zzibz;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzift;->zzv:Lcom/google/android/gms/internal/ads/zzibz;

    .line 27
    .line 28
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibr;->zzbC()Lcom/google/android/gms/internal/ads/zzibz;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzift;->zzx:Lcom/google/android/gms/internal/ads/zzibz;

    .line 33
    .line 34
    return-void
.end method

.method public static synthetic zzc()Lcom/google/android/gms/internal/ads/zzift;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzift;->zzy:Lcom/google/android/gms/internal/ads/zzift;

    return-object v0
.end method


# virtual methods
.method public final zzdc(Lcom/google/android/gms/internal/ads/zzibq;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_6

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    if-eq v0, v1, :cond_5

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    if-eq v0, v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x6

    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    sget-object v0, Lcom/google/android/gms/internal/ads/zzift;->zzz:Lcom/google/android/gms/internal/ads/zzidk;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-class v1, Lcom/google/android/gms/internal/ads/zzift;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzift;->zzz:Lcom/google/android/gms/internal/ads/zzidk;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Lcom/google/android/gms/internal/ads/zzibm;

    .line 35
    .line 36
    sget-object v2, Lcom/google/android/gms/internal/ads/zzift;->zzy:Lcom/google/android/gms/internal/ads/zzift;

    .line 37
    .line 38
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/google/android/gms/internal/ads/zzift;->zzz:Lcom/google/android/gms/internal/ads/zzidk;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    monitor-exit v1

    .line 47
    return-object v0

    .line 48
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw v0

    .line 50
    :cond_1
    return-object v0

    .line 51
    :cond_2
    throw v2

    .line 52
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzift;->zzy:Lcom/google/android/gms/internal/ads/zzift;

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzifm;

    .line 56
    .line 57
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzifm;-><init>([B)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzift;

    .line 62
    .line 63
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzift;-><init>()V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_6
    const-string v2, "zza"

    .line 68
    .line 69
    const-string v3, "zzb"

    .line 70
    .line 71
    sget-object v4, Lcom/google/android/gms/internal/ads/zzifs;->zza:Lcom/google/android/gms/internal/ads/zzibx;

    .line 72
    .line 73
    const-string v5, "zzc"

    .line 74
    .line 75
    const-string v6, "zzd"

    .line 76
    .line 77
    const-string v7, "zze"

    .line 78
    .line 79
    const-string v8, "zzf"

    .line 80
    .line 81
    sget-object v9, Lcom/google/android/gms/internal/ads/zzifq;->zza:Lcom/google/android/gms/internal/ads/zzibx;

    .line 82
    .line 83
    const-string v10, "zzg"

    .line 84
    .line 85
    const-string v11, "zzh"

    .line 86
    .line 87
    const-string v12, "zzi"

    .line 88
    .line 89
    const-string v13, "zzj"

    .line 90
    .line 91
    const-string v14, "zzk"

    .line 92
    .line 93
    const-string v15, "zzl"

    .line 94
    .line 95
    const-string v16, "zzm"

    .line 96
    .line 97
    const-string v17, "zzn"

    .line 98
    .line 99
    const-string v18, "zzo"

    .line 100
    .line 101
    const-class v19, Lcom/google/android/gms/internal/ads/zzifp;

    .line 102
    .line 103
    const-string v20, "zzp"

    .line 104
    .line 105
    const-string v21, "zzu"

    .line 106
    .line 107
    const-string v22, "zzv"

    .line 108
    .line 109
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzifh;->zza()Lcom/google/android/gms/internal/ads/zzibx;

    .line 110
    .line 111
    .line 112
    move-result-object v23

    .line 113
    const-string v24, "zzw"

    .line 114
    .line 115
    const-string v25, "zzx"

    .line 116
    .line 117
    sget-object v26, Lcom/google/android/gms/internal/ads/zzifr;->zza:Lcom/google/android/gms/internal/ads/zzibx;

    .line 118
    .line 119
    filled-new-array/range {v2 .. v26}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sget-object v1, Lcom/google/android/gms/internal/ads/zzift;->zzy:Lcom/google/android/gms/internal/ads/zzift;

    .line 124
    .line 125
    const-string v2, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u001a\u0005\u180c\u0003\u0006\u1007\u0004\u0007\u1007\u0005\u0008\u1007\u0006\t\u1008\u0007\n\u1004\u0008\u000b\u1004\t\u000c\u1004\n\r\u1007\u000b\u000e\u001b\u000f\u1007\u000c\u0010\u1002\r\u0011\u082c\u0012\u1007\u000e\u0013\u082c"

    .line 126
    .line 127
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbv(Lcom/google/android/gms/internal/ads/zzidc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0

    .line 132
    :cond_7
    const/4 v0, 0x1

    .line 133
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0
.end method
