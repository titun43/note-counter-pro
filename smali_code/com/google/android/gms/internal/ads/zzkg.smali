.class final synthetic Lcom/google/android/gms/internal/ads/zzkg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdy;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzkg;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzkg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzkg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzkg;->zza:Lcom/google/android/gms/internal/ads/zzkg;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzaz;

    .line 2
    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzks;->zzd:I

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzlg;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzlg;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x3eb

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zziw;->zzc(Ljava/lang/RuntimeException;I)Lcom/google/android/gms/internal/ads/zziw;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzaz;->zzm(Lcom/google/android/gms/internal/ads/zzau;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
