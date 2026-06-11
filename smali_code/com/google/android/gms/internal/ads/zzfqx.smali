.class public final Lcom/google/android/gms/internal/ads/zzfqx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zze:Lcom/google/android/gms/internal/ads/zzikp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zzd:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zze:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzfqx;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfqx;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzfqx;-><init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lcom/google/android/gms/internal/ads/zzfsb;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/gms/internal/ads/zzfrg;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfrg;->zza()Lcom/google/android/gms/internal/ads/zzfrf;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    .line 19
    .line 20
    check-cast v0, Lcom/google/android/gms/internal/ads/zzcmj;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcmj;->zza()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zzd:Lcom/google/android/gms/internal/ads/zzikp;

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    move-object v5, v0

    .line 33
    check-cast v5, Lx2/b;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfqx;->zze:Lcom/google/android/gms/internal/ads/zzikp;

    .line 36
    .line 37
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v6, v0

    .line 42
    check-cast v6, Lcom/google/android/gms/internal/ads/zzfqr;

    .line 43
    .line 44
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfqw;

    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzfqw;-><init>(Lcom/google/android/gms/internal/ads/zzfsb;Lcom/google/android/gms/internal/ads/zzfrf;Landroid/content/Context;Lx2/b;Lcom/google/android/gms/internal/ads/zzfqr;)V

    .line 47
    .line 48
    .line 49
    return-object v1
.end method
