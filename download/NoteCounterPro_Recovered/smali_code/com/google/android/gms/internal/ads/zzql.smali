.class public final Lcom/google/android/gms/internal/ads/zzql;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:I

.field public final zzb:I

.field public final zzc:I

.field public final zzd:Z

.field public final zze:I

.field public final zzf:Lcom/google/android/gms/internal/ads/zzd;

.field public final zzg:I

.field public final zzh:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzqk;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzi()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzj()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzb:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzk()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzd:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzl()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzm()Lcom/google/android/gms/internal/ads/zzd;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzn()I

    move-result p2

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzg:I

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqk;->zzo()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzql;->zzh:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lcom/google/android/gms/internal/ads/zzql;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzql;

    .line 18
    .line 19
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 20
    .line 21
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzb:I

    .line 26
    .line 27
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzql;->zzb:I

    .line 28
    .line 29
    if-ne v2, v3, :cond_2

    .line 30
    .line 31
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    .line 32
    .line 33
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    .line 34
    .line 35
    if-ne v2, v3, :cond_2

    .line 36
    .line 37
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 38
    .line 39
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 40
    .line 41
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzg:I

    .line 44
    .line 45
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzql;->zzg:I

    .line 46
    .line 47
    if-ne v2, v3, :cond_2

    .line 48
    .line 49
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzh:I

    .line 50
    .line 51
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzql;->zzh:I

    .line 52
    .line 53
    if-ne v2, v3, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzql;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzql;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzd;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    return v0

    .line 66
    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 12

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzql;->zza:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzql;->zzb:I

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzql;->zzc:I

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzql;->zze:I

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzql;->zzf:Lcom/google/android/gms/internal/ads/zzd;

    .line 28
    .line 29
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzql;->zzg:I

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzql;->zzh:I

    .line 36
    .line 37
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    move-object v5, v4

    .line 42
    move-object v10, v4

    .line 43
    move-object v11, v4

    .line 44
    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    return v0
.end method
