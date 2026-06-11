.class final synthetic Lcom/google/android/gms/internal/ads/zzboc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzboh;


# static fields
.field static final synthetic zza:Lcom/google/android/gms/internal/ads/zzboc;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzboc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzboc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzboc;->zza:Lcom/google/android/gms/internal/ads/zzboc;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 6

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzckx;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbog;->zza:Lcom/google/android/gms/internal/ads/zzboh;

    .line 4
    .line 5
    const-string v0, "u"

    .line 6
    .line 7
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    move-object v3, p2

    .line 12
    check-cast v3, Ljava/lang/String;

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 17
    .line 18
    const-string p1, "URL missing from httpTrack GMSG."

    .line 19
    .line 20
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbhe;->zzg:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 25
    .line 26
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 50
    .line 51
    const-string p1, "URL is empty from httpTrack GMSG."

    .line 52
    .line 53
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    :goto_0
    move-object p2, p1

    .line 58
    check-cast p2, Lcom/google/android/gms/internal/ads/zzcjc;

    .line 59
    .line 60
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzcjc;->zzC()Lcom/google/android/gms/internal/ads/zzfir;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzcjc;->zzC()Lcom/google/android/gms/internal/ads/zzfir;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzfir;->zzax:Lcom/google/android/gms/ads/internal/util/client/zzv;

    .line 71
    .line 72
    :goto_1
    move-object v5, p2

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 p2, 0x0

    .line 75
    goto :goto_1

    .line 76
    :goto_2
    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzbt;

    .line 77
    .line 78
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzckx;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast p1, Lcom/google/android/gms/internal/ads/zzclf;

    .line 83
    .line 84
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzclf;->zzs()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iget-object v2, p1, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/util/zzbt;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzfqc;Lcom/google/android/gms/ads/internal/util/client/zzv;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/util/zzb;->zzb()Lj3/a;

    .line 95
    .line 96
    .line 97
    return-void
.end method
