.class final synthetic Lcom/google/android/gms/internal/ads/zzfvd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zza:Landroid/content/Context;

.field private final synthetic zzb:Lh3/h;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lh3/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfvd;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfvd;->zzb:Lh3/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfvd;->zza:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfvd;->zzb:Lh3/h;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "GLAS"

    .line 7
    .line 8
    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzfxd;->zzb(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfxd;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v1, v0}, Lh3/h;->a(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
