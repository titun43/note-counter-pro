.class final Lcom/google/android/gms/internal/ads/zzaqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqh;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzaex;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzagh;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzaql;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzv;

.field private final zze:I

.field private zzf:J

.field private zzg:I

.field private zzh:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaex;Lcom/google/android/gms/internal/ads/zzagh;Lcom/google/android/gms/internal/ads/zzaql;Ljava/lang/String;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zza:Lcom/google/android/gms/internal/ads/zzaex;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzb:Lcom/google/android/gms/internal/ads/zzagh;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzc:Lcom/google/android/gms/internal/ads/zzaql;

    .line 9
    .line 10
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzaql;->zzb:I

    .line 11
    .line 12
    iget p2, p3, Lcom/google/android/gms/internal/ads/zzaql;->zze:I

    .line 13
    .line 14
    mul-int/2addr p1, p2

    .line 15
    iget p2, p3, Lcom/google/android/gms/internal/ads/zzaql;->zzd:I

    .line 16
    .line 17
    div-int/lit8 p1, p1, 0x8

    .line 18
    .line 19
    if-ne p2, p1, :cond_0

    .line 20
    .line 21
    iget p2, p3, Lcom/google/android/gms/internal/ads/zzaql;->zzc:I

    .line 22
    .line 23
    mul-int/2addr p2, p1

    .line 24
    mul-int/lit8 v0, p2, 0x8

    .line 25
    .line 26
    div-int/lit8 p2, p2, 0xa

    .line 27
    .line 28
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zze:I

    .line 33
    .line 34
    new-instance p2, Lcom/google/android/gms/internal/ads/zzt;

    .line 35
    .line 36
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v1, "audio/wav"

    .line 40
    .line 41
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/ads/zzt;->zzm(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzh(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzn(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 54
    .line 55
    .line 56
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzaql;->zzb:I

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzE(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 59
    .line 60
    .line 61
    iget p1, p3, Lcom/google/android/gms/internal/ads/zzaql;->zzc:I

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzt;->zzF(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p5}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzt;->zzM()Lcom/google/android/gms/internal/ads/zzv;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzd:Lcom/google/android/gms/internal/ads/zzv;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result p3

    .line 84
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    add-int/lit8 p3, p3, 0x1c

    .line 89
    .line 90
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    new-instance p5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    add-int/2addr p3, p4

    .line 97
    invoke-direct {p5, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 98
    .line 99
    .line 100
    const-string p3, "Expected block size: "

    .line 101
    .line 102
    const-string p4, "; got: "

    .line 103
    .line 104
    invoke-static {p5, p3, p1, p4, p2}, Ls/c;->c(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const/4 p2, 0x0

    .line 109
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    throw p1
.end method


# virtual methods
.method public final zza(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzf:J

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzh:J

    return-void
.end method

.method public final zzb(IJ)V
    .locals 7

    .line 1
    int-to-long v3, p1

    .line 2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaqo;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzc:Lcom/google/android/gms/internal/ads/zzaql;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    move-wide v5, p2

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzaqo;-><init>(Lcom/google/android/gms/internal/ads/zzaql;IJJ)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zza:Lcom/google/android/gms/internal/ads/zzaex;

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzaex;->zzw(Lcom/google/android/gms/internal/ads/zzafy;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzb:Lcom/google/android/gms/internal/ads/zzagh;

    .line 17
    .line 18
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzaqi;->zzd:Lcom/google/android/gms/internal/ads/zzv;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzagh;->zzz(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqo;->zza()J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzagh;->zzN(J)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzaev;J)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    :goto_0
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    const/4 v6, 0x1

    .line 10
    if-lez v5, :cond_1

    .line 11
    .line 12
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    .line 13
    .line 14
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zze:I

    .line 15
    .line 16
    if-ge v7, v8, :cond_1

    .line 17
    .line 18
    sub-int/2addr v8, v7

    .line 19
    int-to-long v7, v8

    .line 20
    invoke-static {v7, v8, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    long-to-int v5, v7

    .line 25
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzb:Lcom/google/android/gms/internal/ads/zzagh;

    .line 26
    .line 27
    move-object/from16 v8, p1

    .line 28
    .line 29
    invoke-interface {v7, v8, v5, v6}, Lcom/google/android/gms/internal/ads/zzagh;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, -0x1

    .line 34
    if-ne v5, v6, :cond_0

    .line 35
    .line 36
    move-wide v1, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    .line 39
    .line 40
    add-int/2addr v3, v5

    .line 41
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    .line 42
    .line 43
    int-to-long v3, v5

    .line 44
    sub-long/2addr v1, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzc:Lcom/google/android/gms/internal/ads/zzaql;

    .line 47
    .line 48
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    .line 49
    .line 50
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzaql;->zzd:I

    .line 51
    .line 52
    div-int/2addr v2, v3

    .line 53
    if-lez v2, :cond_2

    .line 54
    .line 55
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzf:J

    .line 56
    .line 57
    iget-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzh:J

    .line 58
    .line 59
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzaql;->zzc:I

    .line 60
    .line 61
    int-to-long v13, v1

    .line 62
    sget-object v15, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 63
    .line 64
    const-wide/32 v11, 0xf4240

    .line 65
    .line 66
    .line 67
    invoke-static/range {v9 .. v15}, Lcom/google/android/gms/internal/ads/zzfj;->zzt(JJJLjava/math/RoundingMode;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v9

    .line 71
    add-long v12, v7, v9

    .line 72
    .line 73
    mul-int v15, v2, v3

    .line 74
    .line 75
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    .line 76
    .line 77
    sub-int v16, v1, v15

    .line 78
    .line 79
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzb:Lcom/google/android/gms/internal/ads/zzagh;

    .line 80
    .line 81
    const/4 v14, 0x1

    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    invoke-interface/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzagh;->zze(JIIILcom/google/android/gms/internal/ads/zzagg;)V

    .line 85
    .line 86
    .line 87
    move/from16 v1, v16

    .line 88
    .line 89
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzh:J

    .line 90
    .line 91
    int-to-long v7, v2

    .line 92
    add-long/2addr v3, v7

    .line 93
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzh:J

    .line 94
    .line 95
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzaqi;->zzg:I

    .line 96
    .line 97
    :cond_2
    if-gtz v5, :cond_3

    .line 98
    .line 99
    return v6

    .line 100
    :cond_3
    const/4 v1, 0x0

    .line 101
    return v1
.end method
