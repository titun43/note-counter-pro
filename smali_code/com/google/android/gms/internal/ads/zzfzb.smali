.class public final Lcom/google/android/gms/internal/ads/zzfzb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/i;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzfzb;

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzfyy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzb;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfzb;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfzb;->zza:Lcom/google/android/gms/internal/ads/zzfzb;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfyy;->zzd()Lcom/google/android/gms/internal/ads/zzfyy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getDefaultInstance(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfzb;->zzb:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic getDefaultValue()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzfzb;->zzb:Lcom/google/android/gms/internal/ads/zzfyy;

    return-object v0
.end method

.method public final readFrom(Ljava/io/InputStream;Lw3/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfyy;->zzc(Ljava/io/InputStream;)Lcom/google/android/gms/internal/ads/zzfyy;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lg4/i;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-object p1

    .line 9
    :catch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzfzb;->zzb:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 10
    .line 11
    return-object p1
.end method

.method public final synthetic writeTo(Ljava/lang/Object;Ljava/io/OutputStream;Lw3/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzfyy;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzhzw;->zzaO(Ljava/io/OutputStream;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 7
    .line 8
    return-object p1
.end method
