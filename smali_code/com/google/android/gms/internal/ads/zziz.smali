.class final synthetic Lcom/google/android/gms/internal/ads/zziz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgru;


# instance fields
.field private final synthetic zza:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zziz;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvx;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaeq;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzaeq;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zziz;->zza:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzvx;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzafa;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
