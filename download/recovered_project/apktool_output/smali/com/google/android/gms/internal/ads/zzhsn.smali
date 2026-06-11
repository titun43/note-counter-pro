.class final synthetic Lcom/google/android/gms/internal/ads/zzhsn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhkt;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzhsn;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhsn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhsn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsn;->zza:Lcom/google/android/gms/internal/ads/zzhsn;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzhaz;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhsk;

    .line 2
    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzhvf;->zzd:I

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhih;->zza()Ljava/security/Provider;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzhvf;->zzb(Lcom/google/android/gms/internal/ads/zzhsk;Ljava/security/Provider;)Lcom/google/android/gms/internal/ads/zzhbs;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
