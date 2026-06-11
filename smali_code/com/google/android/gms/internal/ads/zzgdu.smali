.class public final Lcom/google/android/gms/internal/ads/zzgdu;
.super Lcom/google/android/gms/internal/ads/zzibr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzidd;


# static fields
.field private static final zze:Lcom/google/android/gms/internal/ads/zzgdu;

.field private static volatile zzf:Lcom/google/android/gms/internal/ads/zzidk;


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:Ljava/lang/Object;

.field private zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgdu;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgdu;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/ads/zzgdu;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbu(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzibr;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzb:I

    .line 6
    .line 7
    return-void
.end method

.method public static zzd(Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzgdu;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbS(Lcom/google/android/gms/internal/ads/zzibr;Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzibr;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/ads/zzgdu;

    .line 8
    .line 9
    return-object p0
.end method

.method public static zze()Lcom/google/android/gms/internal/ads/zzgdt;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbn()Lcom/google/android/gms/internal/ads/zzibl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgdt;

    .line 8
    .line 9
    return-object v0
.end method

.method public static zzg()Lcom/google/android/gms/internal/ads/zzgdu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    return-object v0
.end method

.method public static synthetic zzk()Lcom/google/android/gms/internal/ads/zzgdu;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    return-object v0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzbcp;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzb:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzc:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbcp;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcp;->zzj()Lcom/google/android/gms/internal/ads/zzbcp;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzbcn;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzb:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzc:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbcn;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbcn;->zzd()Lcom/google/android/gms/internal/ads/zzbcn;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzbch;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzd:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbch;->zzb(I)Lcom/google/android/gms/internal/ads/zzbch;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbch;->zza:Lcom/google/android/gms/internal/ads/zzbch;

    :cond_0
    return-object v0
.end method

.method public final zzdc(Lcom/google/android/gms/internal/ads/zzibq;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_7

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    if-eq p1, p2, :cond_6

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    if-eq p1, p2, :cond_5

    .line 12
    .line 13
    const/4 p2, 0x4

    .line 14
    const/4 p3, 0x0

    .line 15
    if-eq p1, p2, :cond_4

    .line 16
    .line 17
    const/4 p2, 0x5

    .line 18
    if-eq p1, p2, :cond_3

    .line 19
    .line 20
    const/4 p2, 0x6

    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    sget-object p1, Lcom/google/android/gms/internal/ads/zzgdu;->zzf:Lcom/google/android/gms/internal/ads/zzidk;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-class p2, Lcom/google/android/gms/internal/ads/zzgdu;

    .line 28
    .line 29
    monitor-enter p2

    .line 30
    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzgdu;->zzf:Lcom/google/android/gms/internal/ads/zzidk;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibm;

    .line 35
    .line 36
    sget-object p3, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    .line 37
    .line 38
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 39
    .line 40
    .line 41
    sput-object p1, Lcom/google/android/gms/internal/ads/zzgdu;->zzf:Lcom/google/android/gms/internal/ads/zzidk;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    monitor-exit p2

    .line 48
    return-object p1

    .line 49
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw p1

    .line 51
    :cond_1
    return-object p1

    .line 52
    :cond_2
    throw p3

    .line 53
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgdt;

    .line 57
    .line 58
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzgdt;-><init>([B)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgdu;

    .line 63
    .line 64
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzgdu;-><init>()V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_6
    const-string v0, "zzc"

    .line 69
    .line 70
    const-string v1, "zzb"

    .line 71
    .line 72
    const-string v2, "zza"

    .line 73
    .line 74
    const-class v3, Lcom/google/android/gms/internal/ads/zzbcp;

    .line 75
    .line 76
    const-class v4, Lcom/google/android/gms/internal/ads/zzbcn;

    .line 77
    .line 78
    const-string v5, "zzd"

    .line 79
    .line 80
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbch;->zzc()Lcom/google/android/gms/internal/ads/zzibx;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object p2, Lcom/google/android/gms/internal/ads/zzgdu;->zze:Lcom/google/android/gms/internal/ads/zzgdu;

    .line 89
    .line 90
    const-string p3, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\u180c\u0000"

    .line 91
    .line 92
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbv(Lcom/google/android/gms/internal/ads/zzidc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1

    .line 97
    :cond_7
    const/4 p1, 0x1

    .line 98
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    return-object p1
.end method

.method public final synthetic zzh(Lcom/google/android/gms/internal/ads/zzbcp;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzc:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzb:I

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic zzi(Lcom/google/android/gms/internal/ads/zzbcn;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzc:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzb:I

    .line 8
    .line 9
    return-void
.end method

.method public final synthetic zzj(Lcom/google/android/gms/internal/ads/zzbch;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbch;->zza()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zzd:I

    .line 6
    .line 7
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zza:I

    .line 8
    .line 9
    or-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgdu;->zza:I

    .line 12
    .line 13
    return-void
.end method
