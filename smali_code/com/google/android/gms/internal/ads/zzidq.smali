.class final Lcom/google/android/gms/internal/ads/zzidq;
.super Lcom/google/android/gms/internal/ads/zziag;
.source "SourceFile"


# instance fields
.field final zza:Lcom/google/android/gms/internal/ads/zzids;

.field zzb:Lcom/google/android/gms/internal/ads/zziai;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzidt;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzidt;)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzidq;->zzc:Lcom/google/android/gms/internal/ads/zzidt;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zziag;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/internal/ads/zzids;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzids;-><init>(Lcom/google/android/gms/internal/ads/zzian;[B)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzidq;->zza:Lcom/google/android/gms/internal/ads/zzids;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzidq;->zzb()Lcom/google/android/gms/internal/ads/zziai;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzidq;->zzb:Lcom/google/android/gms/internal/ads/zziai;

    .line 22
    .line 23
    return-void
.end method

.method private final zzb()Lcom/google/android/gms/internal/ads/zziai;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzidq;->zza:Lcom/google/android/gms/internal/ads/zzids;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzids;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzids;->zza()Lcom/google/android/gms/internal/ads/zziak;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzian;->zzr()Lcom/google/android/gms/internal/ads/zziai;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzidq;->zzb:Lcom/google/android/gms/internal/ads/zziai;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()B
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzidq;->zzb:Lcom/google/android/gms/internal/ads/zziai;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zziai;->zza()B

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzidq;->zzb:Lcom/google/android/gms/internal/ads/zziai;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzidq;->zzb()Lcom/google/android/gms/internal/ads/zziai;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzidq;->zzb:Lcom/google/android/gms/internal/ads/zziai;

    .line 22
    .line 23
    :cond_0
    return v0

    .line 24
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw v0
.end method
