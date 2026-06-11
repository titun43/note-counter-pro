.class public final Lcom/google/android/gms/internal/ads/zzhya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# static fields
.field static final zza:Lcom/google/android/gms/internal/ads/zzhiu;

.field private static final zzb:[B

.field private static final zzc:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhiu;->zza()Lcom/google/android/gms/internal/ads/zzhit;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxn;->zzc:Lcom/google/android/gms/internal/ads/zzhxn;

    .line 6
    .line 7
    sget-object v2, Lcom/google/android/gms/internal/ads/zzhui;->zza:Lcom/google/android/gms/internal/ads/zzhui;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhit;->zza(Ljava/lang/Enum;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhit;

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxn;->zzd:Lcom/google/android/gms/internal/ads/zzhxn;

    .line 13
    .line 14
    sget-object v2, Lcom/google/android/gms/internal/ads/zzhui;->zzb:Lcom/google/android/gms/internal/ads/zzhui;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhit;->zza(Ljava/lang/Enum;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhit;

    .line 17
    .line 18
    .line 19
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhxn;->zze:Lcom/google/android/gms/internal/ads/zzhxn;

    .line 20
    .line 21
    sget-object v2, Lcom/google/android/gms/internal/ads/zzhui;->zzc:Lcom/google/android/gms/internal/ads/zzhui;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhit;->zza(Ljava/lang/Enum;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzhit;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhit;->zzb()Lcom/google/android/gms/internal/ads/zzhiu;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhya;->zza:Lcom/google/android/gms/internal/ads/zzhiu;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    new-array v1, v0, [B

    .line 34
    .line 35
    sput-object v1, Lcom/google/android/gms/internal/ads/zzhya;->zzb:[B

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    new-array v1, v1, [B

    .line 39
    .line 40
    aput-byte v0, v1, v0

    .line 41
    .line 42
    sput-object v1, Lcom/google/android/gms/internal/ads/zzhya;->zzc:[B

    .line 43
    .line 44
    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzhuo;)Lcom/google/android/gms/internal/ads/zzhbs;
    .locals 10

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhwi;->zze(Lcom/google/android/gms/internal/ads/zzhuo;)Lcom/google/android/gms/internal/ads/zzhbs;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhxe;->zzf:Lcom/google/android/gms/internal/ads/zzhxe;

    .line 7
    .line 8
    const-string v1, "RSA"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhxe;->zzb(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/security/KeyFactory;

    .line 15
    .line 16
    new-instance v1, Ljava/security/spec/RSAPublicKeySpec;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhuo;->zzd()Ljava/math/BigInteger;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhuo;->zzf()Lcom/google/android/gms/internal/ads/zzhuk;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzhuk;->zzd()Ljava/math/BigInteger;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-direct {v1, v2, v3}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v2, v0

    .line 38
    check-cast v2, Ljava/security/interfaces/RSAPublicKey;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhuo;->zzf()Lcom/google/android/gms/internal/ads/zzhuk;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhxz;

    .line 45
    .line 46
    sget-object v3, Lcom/google/android/gms/internal/ads/zzhya;->zza:Lcom/google/android/gms/internal/ads/zzhiu;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhuk;->zzf()Lcom/google/android/gms/internal/ads/zzhui;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzhiu;->zzb(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Lcom/google/android/gms/internal/ads/zzhxn;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhuk;->zzg()Lcom/google/android/gms/internal/ads/zzhui;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/ads/zzhiu;->zzb(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lcom/google/android/gms/internal/ads/zzhxn;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhuk;->zzh()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhuo;->zze()Lcom/google/android/gms/internal/ads/zzhye;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhye;->zzc()[B

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhuo;->zzf()Lcom/google/android/gms/internal/ads/zzhuk;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhuk;->zze()Lcom/google/android/gms/internal/ads/zzhuj;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhuj;->zzc:Lcom/google/android/gms/internal/ads/zzhuj;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhya;->zzc:[B

    .line 97
    .line 98
    :goto_0
    move-object v7, p0

    .line 99
    goto :goto_1

    .line 100
    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzhya;->zzb:[B

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :goto_1
    const/4 v8, 0x0

    .line 104
    move-object v9, v4

    .line 105
    move-object v4, v3

    .line 106
    move-object v3, v9

    .line 107
    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/internal/ads/zzhxz;-><init>(Ljava/security/interfaces/RSAPublicKey;Lcom/google/android/gms/internal/ads/zzhxn;Lcom/google/android/gms/internal/ads/zzhxn;I[B[B[B)V

    .line 108
    .line 109
    .line 110
    return-object v1
.end method


# virtual methods
.method public final zza([B[B)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
