.class final Lcom/google/android/gms/internal/ads/zzgec;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzika;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzika;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzika;

.field private final zzd:Ljava/util/concurrent/ExecutorService;

.field private final zze:Lcom/google/android/gms/internal/ads/zzgoe;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzika;Lcom/google/android/gms/internal/ads/zzika;Lcom/google/android/gms/internal/ads/zzika;Ljava/util/concurrent/ExecutorService;Lcom/google/android/gms/internal/ads/zzgoe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgec;->zza:Lcom/google/android/gms/internal/ads/zzika;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgec;->zzb:Lcom/google/android/gms/internal/ads/zzika;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgec;->zzc:Lcom/google/android/gms/internal/ads/zzika;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzgec;->zzd:Ljava/util/concurrent/ExecutorService;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzgec;->zze:Lcom/google/android/gms/internal/ads/zzgoe;

    return-void
.end method

.method private final zze(I)Lj3/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgdy;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zzgdy;-><init>(Lcom/google/android/gms/internal/ads/zzgec;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgec;->zzd:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzd(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzg;->zzw(Lj3/a;)Lcom/google/android/gms/internal/ads/zzgzg;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgdz;->zza:Lcom/google/android/gms/internal/ads/zzgdz;

    .line 17
    .line 18
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 27
    .line 28
    return-object p1
.end method


# virtual methods
.method public final synthetic zza()Lcom/google/android/gms/internal/ads/zzgoe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgec;->zze:Lcom/google/android/gms/internal/ads/zzgoe;

    return-object v0
.end method

.method public final zzb(IZ)Lj3/a;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgec;->zze(I)Lj3/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    if-eq p1, p2, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzg;->zzw(Lj3/a;)Lcom/google/android/gms/internal/ads/zzgzg;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object p2, Lcom/google/android/gms/internal/ads/zzgeb;->zza:Lcom/google/android/gms/internal/ads/zzgeb;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-static {p1, v1, p2, v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzg(Lj3/a;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 27
    .line 28
    new-instance p2, Lcom/google/android/gms/internal/ads/zzgdx;

    .line 29
    .line 30
    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/ads/zzgdx;-><init>(Lcom/google/android/gms/internal/ads/zzgec;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhaf;->zza()Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgzg;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    return-object v0
.end method

.method public final synthetic zzc(I)Lcom/google/android/gms/internal/ads/zzgdv;
    .locals 1

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgec;->zzc:Lcom/google/android/gms/internal/ads/zzika;

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzika;->zzb()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgdv;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgec;->zzb:Lcom/google/android/gms/internal/ads/zzika;

    .line 28
    .line 29
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzika;->zzb()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgdv;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgec;->zza:Lcom/google/android/gms/internal/ads/zzika;

    .line 37
    .line 38
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzika;->zzb()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgdv;

    .line 43
    .line 44
    return-object p1
.end method

.method public final synthetic zzd(I)Lj3/a;
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgec;->zze(I)Lj3/a;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method
