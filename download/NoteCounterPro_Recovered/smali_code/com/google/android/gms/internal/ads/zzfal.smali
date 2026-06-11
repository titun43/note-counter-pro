.class public final Lcom/google/android/gms/internal/ads/zzfal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfax;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgzy;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgzy;Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfal;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfal;->zzb:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfal;->zzc:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfal;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza()Lj3/a;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfak;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfak;-><init>(Lcom/google/android/gms/internal/ads/zzfal;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfal;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/zzgzy;->zzc(Ljava/util/concurrent/Callable;)Lj3/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final zzb()I
    .locals 1

    const/16 v0, 0x23

    return v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfam;
    .locals 10

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfam;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfal;->zzb:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Lf2/k;->d()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 14
    .line 15
    .line 16
    move-object v3, v1

    .line 17
    move v1, v2

    .line 18
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/zzs;->zzJ(Landroid/content/Context;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfal;->zzc:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 23
    .line 24
    iget-object v4, v4, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 27
    .line 28
    .line 29
    move-object v5, v3

    .line 30
    move-object v3, v4

    .line 31
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zzs;->zzK()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    const/4 v7, 0x0

    .line 43
    if-nez v6, :cond_0

    .line 44
    .line 45
    move v6, v7

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 48
    .line 49
    :goto_0
    const-string v8, "com.google.android.gms.ads.dynamite"

    .line 50
    .line 51
    invoke-static {v5, v8, v7}, Lb3/e;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-static {v5, v8}, Lb3/e;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzfal;->zzd:Ljava/lang/String;

    .line 60
    .line 61
    move v9, v7

    .line 62
    move v7, v5

    .line 63
    move v5, v6

    .line 64
    move v6, v9

    .line 65
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzfam;-><init>(ZZLjava/lang/String;ZIIILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method
