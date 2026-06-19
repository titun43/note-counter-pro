.class public final Lcom/google/android/gms/internal/ads/zzhsg;
.super Lcom/google/android/gms/internal/ads/zzhuu;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhse;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhsc;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzhsd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzhsf;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzhse;Lcom/google/android/gms/internal/ads/zzhsc;Lcom/google/android/gms/internal/ads/zzhsd;Lcom/google/android/gms/internal/ads/zzhsf;[B)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhuu;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zza:Lcom/google/android/gms/internal/ads/zzhse;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzb:Lcom/google/android/gms/internal/ads/zzhsc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzc:Lcom/google/android/gms/internal/ads/zzhsd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    return-void
.end method

.method public static zzb()Lcom/google/android/gms/internal/ads/zzhsb;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhsb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhsb;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzhsg;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhsg;

    .line 8
    .line 9
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhsg;->zza:Lcom/google/android/gms/internal/ads/zzhse;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zza:Lcom/google/android/gms/internal/ads/zzhse;

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhsg;->zzb:Lcom/google/android/gms/internal/ads/zzhsc;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzb:Lcom/google/android/gms/internal/ads/zzhsc;

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhsg;->zzc:Lcom/google/android/gms/internal/ads/zzhsd;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzc:Lcom/google/android/gms/internal/ads/zzhsd;

    .line 24
    .line 25
    if-ne v0, v2, :cond_1

    .line 26
    .line 27
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    .line 30
    .line 31
    if-ne p1, v0, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zza:Lcom/google/android/gms/internal/ads/zzhse;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzb:Lcom/google/android/gms/internal/ads/zzhsc;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzc:Lcom/google/android/gms/internal/ads/zzhsd;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    .line 8
    .line 9
    const-class v4, Lcom/google/android/gms/internal/ads/zzhsg;

    .line 10
    .line 11
    filled-new-array {v4, v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhsf;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzc:Lcom/google/android/gms/internal/ads/zzhsd;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhsd;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zza:Lcom/google/android/gms/internal/ads/zzhse;

    .line 22
    .line 23
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzhse;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzb:Lcom/google/android/gms/internal/ads/zzhsc;

    .line 32
    .line 33
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzhsc;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    add-int/lit8 v1, v1, 0x27

    .line 42
    .line 43
    add-int/2addr v1, v3

    .line 44
    add-int/lit8 v1, v1, 0xc

    .line 45
    .line 46
    add-int/2addr v1, v5

    .line 47
    add-int/lit8 v1, v1, 0x9

    .line 48
    .line 49
    add-int/2addr v1, v7

    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const-string v1, "ECDSA Parameters (variant: "

    .line 58
    .line 59
    const-string v5, ", hashType: "

    .line 60
    .line 61
    invoke-static {v3, v1, v0, v5, v2}, Ls/c;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, ", encoding: "

    .line 65
    .line 66
    const-string v1, ", curve: "

    .line 67
    .line 68
    invoke-static {v3, v0, v4, v1, v6}, Ls/c;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, ")"

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0
.end method

.method public final zza()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzhsf;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzhse;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zza:Lcom/google/android/gms/internal/ads/zzhse;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzhsc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzb:Lcom/google/android/gms/internal/ads/zzhsc;

    return-object v0
.end method

.method public final zze()Lcom/google/android/gms/internal/ads/zzhsd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzc:Lcom/google/android/gms/internal/ads/zzhsd;

    return-object v0
.end method

.method public final zzf()Lcom/google/android/gms/internal/ads/zzhsf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhsg;->zzd:Lcom/google/android/gms/internal/ads/zzhsf;

    return-object v0
.end method
