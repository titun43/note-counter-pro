.class public final Lcom/google/android/gms/internal/ads/zzhqc;
.super Lcom/google/android/gms/internal/ads/zzibr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzidd;


# static fields
.field private static final zzd:Lcom/google/android/gms/internal/ads/zzhqc;

.field private static volatile zze:Lcom/google/android/gms/internal/ads/zzidk;


# instance fields
.field private zza:Ljava/lang/String;

.field private zzb:Lcom/google/android/gms/internal/ads/zzian;

.field private zzc:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhqc;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhqc;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/ads/zzhqc;

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
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zza:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v0, Lcom/google/android/gms/internal/ads/zzian;->zza:Lcom/google/android/gms/internal/ads/zzian;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zzb:Lcom/google/android/gms/internal/ads/zzian;

    .line 11
    .line 12
    return-void
.end method

.method public static zzd()Lcom/google/android/gms/internal/ads/zzhqa;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbn()Lcom/google/android/gms/internal/ads/zzibl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzhqa;

    .line 8
    .line 9
    return-object v0
.end method

.method public static zze()Lcom/google/android/gms/internal/ads/zzhqc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    return-object v0
.end method

.method public static synthetic zzj()Lcom/google/android/gms/internal/ads/zzhqc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    return-object v0
.end method


# virtual methods
.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzian;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zzb:Lcom/google/android/gms/internal/ads/zzian;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzhqb;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zzc:I

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zze:Lcom/google/android/gms/internal/ads/zzhqb;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zzd:Lcom/google/android/gms/internal/ads/zzhqb;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zzc:Lcom/google/android/gms/internal/ads/zzhqb;

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zzb:Lcom/google/android/gms/internal/ads/zzhqb;

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zza:Lcom/google/android/gms/internal/ads/zzhqb;

    :goto_0
    if-nez v0, :cond_5

    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zzf:Lcom/google/android/gms/internal/ads/zzhqb;

    :cond_5
    return-object v0
.end method

.method public final zzdc(Lcom/google/android/gms/internal/ads/zzibq;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzhqc;->zze:Lcom/google/android/gms/internal/ads/zzidk;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-class p2, Lcom/google/android/gms/internal/ads/zzhqc;

    .line 28
    .line 29
    monitor-enter p2

    .line 30
    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzhqc;->zze:Lcom/google/android/gms/internal/ads/zzidk;

    .line 31
    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    new-instance p1, Lcom/google/android/gms/internal/ads/zzibm;

    .line 35
    .line 36
    sget-object p3, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    .line 37
    .line 38
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 39
    .line 40
    .line 41
    sput-object p1, Lcom/google/android/gms/internal/ads/zzhqc;->zze:Lcom/google/android/gms/internal/ads/zzidk;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    monitor-exit p2

    .line 47
    return-object p1

    .line 48
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1

    .line 50
    :cond_1
    return-object p1

    .line 51
    :cond_2
    throw p3

    .line 52
    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhqa;

    .line 56
    .line 57
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzhqa;-><init>([B)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhqc;

    .line 62
    .line 63
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzhqc;-><init>()V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_6
    const-string p1, "zza"

    .line 68
    .line 69
    const-string p2, "zzb"

    .line 70
    .line 71
    const-string p3, "zzc"

    .line 72
    .line 73
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object p2, Lcom/google/android/gms/internal/ads/zzhqc;->zzd:Lcom/google/android/gms/internal/ads/zzhqc;

    .line 78
    .line 79
    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    .line 80
    .line 81
    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzibr;->zzbv(Lcom/google/android/gms/internal/ads/zzidc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1

    .line 86
    :cond_7
    const/4 p1, 0x1

    .line 87
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public final synthetic zzg(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zza:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzh(Lcom/google/android/gms/internal/ads/zzian;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zzb:Lcom/google/android/gms/internal/ads/zzian;

    .line 5
    .line 6
    return-void
.end method

.method public final synthetic zzi(Lcom/google/android/gms/internal/ads/zzhqb;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhqb;->zza()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzhqc;->zzc:I

    .line 6
    .line 7
    return-void
.end method
