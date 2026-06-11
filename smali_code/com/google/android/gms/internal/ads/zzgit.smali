.class public final Lcom/google/android/gms/internal/ads/zzgit;
.super Lcom/google/android/gms/internal/ads/zzfvh;
.source "SourceFile"


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzgdh;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/google/android/gms/internal/ads/zzgdh;)V
    .locals 2

    .line 1
    new-instance v0, Lh3/n;

    .line 2
    .line 3
    invoke-direct {v0}, Lh3/n;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzfvh;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lh3/g;Z)V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgit;->zzb:Lcom/google/android/gms/internal/ads/zzgdh;

    .line 11
    .line 12
    return-void
.end method

.method private static zzh()Lh3/g;
    .locals 2

    .line 1
    new-instance v0, Lh3/n;

    .line 2
    .line 3
    invoke-direct {v0}, Lh3/n;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lh3/n;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public final zzb(IJ)Lh3/g;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgit;->zzb:Lcom/google/android/gms/internal/ads/zzgdh;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    move v1, p1

    .line 6
    move-wide v2, p2

    .line 7
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzgdh;->zzb(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgit;->zzh()Lh3/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final zzc(IJLjava/lang/Exception;)Lh3/g;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgit;->zzb:Lcom/google/android/gms/internal/ads/zzgdh;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move v1, p1

    .line 5
    move-wide v2, p2

    .line 6
    move-object v4, p4

    .line 7
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzgdh;->zzb(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgit;->zzh()Lh3/g;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final zze(ILjava/lang/String;)Lh3/g;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgit;->zzb:Lcom/google/android/gms/internal/ads/zzgdh;

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    move v1, p1

    .line 7
    move-object v5, p2

    .line 8
    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzgdh;->zzb(IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgit;->zzh()Lh3/g;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
