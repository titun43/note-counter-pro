.class final synthetic Lcom/google/android/gms/internal/ads/zzabh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzabh;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzabh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzabh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzabh;->zza:Lcom/google/android/gms/internal/ads/zzabh;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p2, Lcom/google/android/gms/internal/ads/zzabg;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/gms/internal/ads/zzabg;

    .line 4
    .line 5
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzabg;->zzc:F

    .line 6
    .line 7
    iget p2, p2, Lcom/google/android/gms/internal/ads/zzabg;->zzc:F

    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method
