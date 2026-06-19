.class public final Lcom/google/android/gms/internal/ads/zzgbf;
.super Lcom/google/android/gms/internal/ads/zzibr;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzidd;


# static fields
.field private static volatile zzA:Lcom/google/android/gms/internal/ads/zzidk;

.field private static final zzz:Lcom/google/android/gms/internal/ads/zzgbf;


# instance fields
.field private zza:I

.field private zzb:I

.field private zzc:Z

.field private zzd:Ljava/lang/String;

.field private zze:Z

.field private zzf:Lcom/google/android/gms/internal/ads/zzgbx;

.field private zzg:Z

.field private zzh:J

.field private zzi:J

.field private zzj:Lcom/google/android/gms/internal/ads/zzgbz;

.field private zzk:J

.field private zzl:J

.field private zzm:J

.field private zzn:Ljava/lang/String;

.field private zzo:Ljava/lang/String;

.field private zzp:J

.field private zzu:J

.field private zzv:Z

.field private zzw:Z

.field private zzx:Z

.field private zzy:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbf;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbf;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzz:Lcom/google/android/gms/internal/ads/zzgbf;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/ads/zzgbf;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbu(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzibr;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzc:Z

    .line 6
    .line 7
    const-string v1, "unknown_host"

    .line 8
    .line 9
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzd:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zze:Z

    .line 12
    .line 13
    const-wide/16 v1, 0x64

    .line 14
    .line 15
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzh:J

    .line 16
    .line 17
    const-wide/16 v3, 0x7d0

    .line 18
    .line 19
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzi:J

    .line 20
    .line 21
    const-wide/16 v3, 0xa

    .line 22
    .line 23
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzk:J

    .line 24
    .line 25
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzl:J

    .line 26
    .line 27
    const-wide/16 v1, 0x4e20

    .line 28
    .line 29
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzm:J

    .line 30
    .line 31
    const-string v1, ""

    .line 32
    .line 33
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzn:Ljava/lang/String;

    .line 34
    .line 35
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzo:Ljava/lang/String;

    .line 36
    .line 37
    const-wide/16 v1, 0x1f4

    .line 38
    .line 39
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzp:J

    .line 40
    .line 41
    const-wide/16 v1, 0xbb8

    .line 42
    .line 43
    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzu:J

    .line 44
    .line 45
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzv:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzw:Z

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzx:Z

    .line 50
    .line 51
    return-void
.end method

.method public static synthetic zzD()Lcom/google/android/gms/internal/ads/zzgbf;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzz:Lcom/google/android/gms/internal/ads/zzgbf;

    return-object v0
.end method

.method public static zzu()Lcom/google/android/gms/internal/ads/zzgbe;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzz:Lcom/google/android/gms/internal/ads/zzgbf;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbn()Lcom/google/android/gms/internal/ads/zzibl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgbe;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final synthetic zzA(Lcom/google/android/gms/internal/ads/zzgbz;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzj:Lcom/google/android/gms/internal/ads/zzgbz;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    .line 7
    .line 8
    or-int/lit16 p1, p1, 0x100

    .line 9
    .line 10
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzB(J)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzu:J

    return-void
.end method

.method public final synthetic zzC(Z)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    const/high16 v1, 0x10000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzv:Z

    return-void
.end method

.method public final zzE()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzb:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgbh;->zza(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final synthetic zzF(I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzb:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    return-void
.end method

.method public final zza()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzc:Z

    return v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zze:Z

    return v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzgbx;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzf:Lcom/google/android/gms/internal/ads/zzgbx;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbx;->zzg()Lcom/google/android/gms/internal/ads/zzgbx;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public final zzdc(Lcom/google/android/gms/internal/ads/zzibq;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

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
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzA:Lcom/google/android/gms/internal/ads/zzidk;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const-class v1, Lcom/google/android/gms/internal/ads/zzgbf;

    .line 28
    .line 29
    monitor-enter v1

    .line 30
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzA:Lcom/google/android/gms/internal/ads/zzidk;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Lcom/google/android/gms/internal/ads/zzibm;

    .line 35
    .line 36
    sget-object v2, Lcom/google/android/gms/internal/ads/zzgbf;->zzz:Lcom/google/android/gms/internal/ads/zzgbf;

    .line 37
    .line 38
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzibm;-><init>(Lcom/google/android/gms/internal/ads/zzibr;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzA:Lcom/google/android/gms/internal/ads/zzidk;

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
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgbf;->zzz:Lcom/google/android/gms/internal/ads/zzgbf;

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbe;

    .line 56
    .line 57
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzgbe;-><init>([B)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgbf;

    .line 62
    .line 63
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgbf;-><init>()V

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
    sget-object v4, Lcom/google/android/gms/internal/ads/zzgbg;->zza:Lcom/google/android/gms/internal/ads/zzibx;

    .line 72
    .line 73
    const-string v5, "zzd"

    .line 74
    .line 75
    const-string v6, "zze"

    .line 76
    .line 77
    const-string v7, "zzf"

    .line 78
    .line 79
    const-string v8, "zzg"

    .line 80
    .line 81
    const-string v9, "zzi"

    .line 82
    .line 83
    const-string v10, "zzj"

    .line 84
    .line 85
    const-string v11, "zzc"

    .line 86
    .line 87
    const-string v12, "zzk"

    .line 88
    .line 89
    const-string v13, "zzl"

    .line 90
    .line 91
    const-string v14, "zzm"

    .line 92
    .line 93
    const-string v15, "zzn"

    .line 94
    .line 95
    const-string v16, "zzo"

    .line 96
    .line 97
    const-string v17, "zzp"

    .line 98
    .line 99
    const-string v18, "zzu"

    .line 100
    .line 101
    const-string v19, "zzv"

    .line 102
    .line 103
    const-string v20, "zzh"

    .line 104
    .line 105
    const-string v21, "zzw"

    .line 106
    .line 107
    const-string v22, "zzx"

    .line 108
    .line 109
    const-string v23, "zzy"

    .line 110
    .line 111
    filled-new-array/range {v2 .. v23}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sget-object v1, Lcom/google/android/gms/internal/ads/zzgbf;->zzz:Lcom/google/android/gms/internal/ads/zzgbf;

    .line 116
    .line 117
    const-string v2, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001\u180c\u0000\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u1009\u0004\u0006\u1007\u0005\u0007\u1002\u0007\u0008\u1009\u0008\t\u1007\u0001\n\u1002\t\u000b\u1002\n\u000c\u1002\u000b\r\u1008\u000c\u000e\u1008\r\u000f\u1002\u000e\u0010\u1002\u000f\u0011\u1007\u0010\u0012\u1002\u0006\u0013\u1007\u0011\u0014\u1007\u0012\u0015\u1007\u0013"

    .line 118
    .line 119
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzibr;->zzbv(Lcom/google/android/gms/internal/ads/zzidc;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :cond_7
    const/4 v0, 0x1

    .line 125
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0
.end method

.method public final zze()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzg:Z

    return v0
.end method

.method public final zzg()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzh:J

    return-wide v0
.end method

.method public final zzh()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzi:J

    return-wide v0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzgbz;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzj:Lcom/google/android/gms/internal/ads/zzgbz;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgbz;->zzj()Lcom/google/android/gms/internal/ads/zzgbz;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public final zzj()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzk:J

    return-wide v0
.end method

.method public final zzk()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzl:J

    return-wide v0
.end method

.method public final zzl()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzm:J

    return-wide v0
.end method

.method public final zzm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzn:Ljava/lang/String;

    return-object v0
.end method

.method public final zzn()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzo:Ljava/lang/String;

    return-object v0
.end method

.method public final zzo()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzp:J

    return-wide v0
.end method

.method public final zzp()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzu:J

    return-wide v0
.end method

.method public final zzq()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzv:Z

    return v0
.end method

.method public final zzr()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzw:Z

    return v0
.end method

.method public final zzs()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzx:Z

    return v0
.end method

.method public final zzt()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzy:Z

    return v0
.end method

.method public final synthetic zzv(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzc:Z

    return-void
.end method

.method public final synthetic zzw(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzx(Lcom/google/android/gms/internal/ads/zzgbx;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzf:Lcom/google/android/gms/internal/ads/zzgbx;

    .line 5
    .line 6
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x10

    .line 9
    .line 10
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    .line 11
    .line 12
    return-void
.end method

.method public final synthetic zzy(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzh:J

    return-void
.end method

.method public final synthetic zzz(J)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    or-int/lit16 v0, v0, 0x80

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zza:I

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzgbf;->zzi:J

    return-void
.end method
