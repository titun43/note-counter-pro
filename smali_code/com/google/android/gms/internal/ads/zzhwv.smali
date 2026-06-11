.class public final Lcom/google/android/gms/internal/ads/zzhwv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhbs;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhye;

.field private final zzb:[B

.field private final zzc:[B


# direct methods
.method private constructor <init>([B[B[B)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhid;->zza(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhye;->zza([B)Lcom/google/android/gms/internal/ads/zzhye;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zza:Lcom/google/android/gms/internal/ads/zzhye;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zzb:[B

    .line 23
    .line 24
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zzc:[B

    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhio;->zzd()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p2, "Given public key\'s length is not 32."

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    new-instance p2, Ljava/security/GeneralSecurityException;

    .line 41
    .line 42
    const-string p3, "Can not use Ed25519 in FIPS-mode."

    .line 43
    .line 44
    invoke-direct {p2, p3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzhsx;)Lcom/google/android/gms/internal/ads/zzhbs;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhid;->zza(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhvo;->zzb(Lcom/google/android/gms/internal/ads/zzhsx;)Lcom/google/android/gms/internal/ads/zzhbs;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhwv;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhsx;->zzd()Lcom/google/android/gms/internal/ads/zzhye;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhye;->zzc()[B

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhsx;->zze()Lcom/google/android/gms/internal/ads/zzhye;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzhye;->zzc()[B

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhsx;->zzf()Lcom/google/android/gms/internal/ads/zzhsq;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhsq;->zzc()Lcom/google/android/gms/internal/ads/zzhsp;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object v4, Lcom/google/android/gms/internal/ads/zzhsp;->zzc:Lcom/google/android/gms/internal/ads/zzhsp;

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    new-array p0, v0, [B

    .line 49
    .line 50
    aput-byte v4, p0, v4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-array p0, v4, [B

    .line 54
    .line 55
    :goto_0
    invoke-direct {v1, v2, v3, p0}, Lcom/google/android/gms/internal/ads/zzhwv;-><init>([B[B[B)V

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 60
    .line 61
    const-string v0, "Can not use Ed25519 in FIPS-mode."

    .line 62
    .line 63
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p0
.end method

.method private final zzc([B[B)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    const/16 v1, 0x40

    .line 3
    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zza:Lcom/google/android/gms/internal/ads/zzhye;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhye;->zzc()[B

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzhio;->zzc([B[B[B)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 20
    .line 21
    const-string p2, "Signature check failed."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 28
    .line 29
    const-string p2, "The length of the signature is not 64."

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method


# virtual methods
.method public final zza([B[B)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zzb:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zzc:[B

    .line 7
    .line 8
    array-length v2, v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhwv;->zzc([B[B)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    :goto_0
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhln;->zze([B[B)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhwv;->zzc:[B

    .line 23
    .line 24
    array-length v2, v0

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    filled-new-array {p2, v0}, [[B

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzhwr;->zza([[B)[B

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    :cond_2
    array-length v0, p1

    .line 36
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzhwv;->zzc([B[B)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 45
    .line 46
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method
