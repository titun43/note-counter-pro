.class public final Lcom/google/android/gms/internal/ads/zzbtd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbsp;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzbsr;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbss;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbsl;

.field private final zzd:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbsl;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbss;Lcom/google/android/gms/internal/ads/zzbsr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zzc:Lcom/google/android/gms/internal/ads/zzbsl;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zzd:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zzb:Lcom/google/android/gms/internal/ads/zzbss;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zza:Lcom/google/android/gms/internal/ads/zzbsr;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lj3/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzbtd;->zzb(Ljava/lang/Object;)Lj3/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final zzb(Ljava/lang/Object;)Lj3/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzcen;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzcen;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zzc:Lcom/google/android/gms/internal/ads/zzbsl;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzbsl;->zzb(Lcom/google/android/gms/internal/ads/zzazh;)Lcom/google/android/gms/internal/ads/zzbsf;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "callJs > getEngine: Promise created"

    .line 14
    .line 15
    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbta;

    .line 19
    .line 20
    invoke-direct {v2, p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzbta;-><init>(Lcom/google/android/gms/internal/ads/zzbtd;Lcom/google/android/gms/internal/ads/zzbsf;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcen;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lcom/google/android/gms/internal/ads/zzbtb;

    .line 24
    .line 25
    invoke-direct {p1, p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzbtb;-><init>(Lcom/google/android/gms/internal/ads/zzbtd;Lcom/google/android/gms/internal/ads/zzcen;Lcom/google/android/gms/internal/ads/zzbsf;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/internal/ads/zzceu;->zze(Lcom/google/android/gms/internal/ads/zzcer;Lcom/google/android/gms/internal/ads/zzcep;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public final synthetic zzc(Lcom/google/android/gms/internal/ads/zzbsf;Lcom/google/android/gms/internal/ads/zzbsm;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzcen;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbog;->zzo:Lcom/google/android/gms/internal/ads/zzboy;

    .line 13
    .line 14
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbtc;

    .line 15
    .line 16
    invoke-direct {v2, p0, p1, p4}, Lcom/google/android/gms/internal/ads/zzbtc;-><init>(Lcom/google/android/gms/internal/ads/zzbtd;Lcom/google/android/gms/internal/ads/zzbsf;Lcom/google/android/gms/internal/ads/zzcen;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzboy;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbox;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "id"

    .line 28
    .line 29
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    const-string v0, "args"

    .line 33
    .line 34
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zzb:Lcom/google/android/gms/internal/ads/zzbss;

    .line 35
    .line 36
    invoke-interface {v2, p3}, Lcom/google/android/gms/internal/ads/zzbss;->zzb(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {v1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zzd:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {p2, p3, v1}, Lcom/google/android/gms/internal/ads/zzbrp;->zzb(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p2

    .line 50
    :try_start_1
    invoke-virtual {p4, p2}, Lcom/google/android/gms/internal/ads/zzcen;->zzd(Ljava/lang/Throwable;)Z

    .line 51
    .line 52
    .line 53
    const-string p3, "Unable to invokeJavascript"

    .line 54
    .line 55
    sget p4, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 56
    .line 57
    invoke-static {p3, p2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbsf;->zza()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p2

    .line 65
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbsf;->zza()V

    .line 66
    .line 67
    .line 68
    throw p2
.end method

.method public final synthetic zzd()Lcom/google/android/gms/internal/ads/zzbsr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbtd;->zza:Lcom/google/android/gms/internal/ads/zzbsr;

    return-object v0
.end method
