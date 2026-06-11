.class final synthetic Lcom/google/android/gms/internal/ads/zzheg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhkt;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzheg;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzheg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzheg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzheg;->zza:Lcom/google/android/gms/internal/ads/zzheg;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzhaz;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzher;

    .line 2
    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzhei;->zza:I

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzher;->zze()Lcom/google/android/gms/internal/ads/zzhev;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhev;->zzb()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzher;->zze()Lcom/google/android/gms/internal/ads/zzhev;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhev;->zzd()Lcom/google/android/gms/internal/ads/zzhch;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhbn;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhbm;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhbm;->zzb()Lcom/google/android/gms/internal/ads/zzhas;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget v2, Lcom/google/android/gms/internal/ads/zzhef;->zza:I

    .line 30
    .line 31
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzhbv;->zza(Lcom/google/android/gms/internal/ads/zzhbp;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzibb;->zza()Lcom/google/android/gms/internal/ads/zzibb;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzhqf;->zzd([BLcom/google/android/gms/internal/ads/zzibb;)Lcom/google/android/gms/internal/ads/zzhqf;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzicg; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhef;

    .line 44
    .line 45
    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/internal/ads/zzhef;-><init>(Lcom/google/android/gms/internal/ads/zzhqf;Lcom/google/android/gms/internal/ads/zzhas;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzher;->zzc()Lcom/google/android/gms/internal/ads/zzhye;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {v2, p1}, Lcom/google/android/gms/internal/ads/zzhhj;->zzc(Lcom/google/android/gms/internal/ads/zzhas;Lcom/google/android/gms/internal/ads/zzhye;)Lcom/google/android/gms/internal/ads/zzhas;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :catch_0
    move-exception p1

    .line 58
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method
