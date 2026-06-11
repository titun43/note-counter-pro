.class public final Lcom/google/android/gms/internal/ads/zzdno;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzikg;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzikp;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzikp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdno;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdno;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdno;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdno;->zzd:Lcom/google/android/gms/internal/ads/zzikp;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)Lcom/google/android/gms/internal/ads/zzdno;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzdno;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzdno;-><init>(Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;Lcom/google/android/gms/internal/ads/zzikp;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdno;->zza:Lcom/google/android/gms/internal/ads/zzikp;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzbdb;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdno;->zzb:Lcom/google/android/gms/internal/ads/zzikp;

    .line 10
    .line 11
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdno;->zzc:Lcom/google/android/gms/internal/ads/zzikp;

    .line 18
    .line 19
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/content/Context;

    .line 24
    .line 25
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdno;->zzd:Lcom/google/android/gms/internal/ads/zzikp;

    .line 26
    .line 27
    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzikv;->zzb()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lx2/b;

    .line 32
    .line 33
    new-instance v4, Lcom/google/android/gms/internal/ads/zzctc;

    .line 34
    .line 35
    new-instance v5, Lcom/google/android/gms/internal/ads/zzcso;

    .line 36
    .line 37
    invoke-direct {v5, v2, v0}, Lcom/google/android/gms/internal/ads/zzcso;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbdb;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1, v5, v3}, Lcom/google/android/gms/internal/ads/zzctc;-><init>(Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzcso;Lx2/b;)V

    .line 41
    .line 42
    .line 43
    return-object v4
.end method
