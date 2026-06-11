.class final synthetic Lcom/google/android/gms/internal/ads/zzhmd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhjb;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzhmd;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzhmd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhmd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzhmd;->zza:Lcom/google/android/gms/internal/ads/zzhmd;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzhbp;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhaz;
    .locals 2

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzhmk;

    .line 2
    .line 3
    sget v0, Lcom/google/android/gms/internal/ads/zzhmg;->zza:I

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhma;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzhma;-><init>([B)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhma;->zza(Lcom/google/android/gms/internal/ads/zzhmk;)Lcom/google/android/gms/internal/ads/zzhma;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhmk;->zzc()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzhyg;->zzb(I)Lcom/google/android/gms/internal/ads/zzhyg;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzhma;->zzb(Lcom/google/android/gms/internal/ads/zzhyg;)Lcom/google/android/gms/internal/ads/zzhma;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzhma;->zzc(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhma;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhma;->zzd()Lcom/google/android/gms/internal/ads/zzhmb;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method
