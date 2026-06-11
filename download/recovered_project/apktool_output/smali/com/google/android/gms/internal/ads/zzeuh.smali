.class final synthetic Lcom/google/android/gms/internal/ads/zzeuh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgyw;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzeuh;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzeuh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzeuh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzeuh;->zza:Lcom/google/android/gms/internal/ads/zzeuh;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lj3/a;
    .locals 2

    .line 1
    check-cast p1, Lq2/b;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeul;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, -0x1

    .line 9
    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzeul;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeul;

    .line 18
    .line 19
    iget-object v1, p1, Lq2/b;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget p1, p1, Lq2/b;->b:I

    .line 22
    .line 23
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzeul;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method
