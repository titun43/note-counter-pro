.class public final Lcom/google/android/gms/internal/ads/zzduv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzazh;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbil;

.field private final zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private final zze:Lcom/google/android/gms/ads/internal/zza;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzbgd;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzdeg;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzejf;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzfjo;

.field private final zzj:Lcom/google/android/gms/internal/ads/zzdxz;

.field private final zzk:Lcom/google/android/gms/internal/ads/zzclk;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzckb;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzazh;Lcom/google/android/gms/internal/ads/zzbil;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzbgd;Lcom/google/android/gms/internal/ads/zzdeg;Lcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzfjo;Lcom/google/android/gms/internal/ads/zzdxz;Lcom/google/android/gms/internal/ads/zzclk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzduv;->zza:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzb:Lcom/google/android/gms/internal/ads/zzazh;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzc:Lcom/google/android/gms/internal/ads/zzbil;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzduv;->zze:Lcom/google/android/gms/ads/internal/zza;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzf:Lcom/google/android/gms/internal/ads/zzbgd;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzg:Lcom/google/android/gms/internal/ads/zzdeg;

    iput-object p9, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzh:Lcom/google/android/gms/internal/ads/zzejf;

    iput-object p10, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzi:Lcom/google/android/gms/internal/ads/zzfjo;

    iput-object p11, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzj:Lcom/google/android/gms/internal/ads/zzdxz;

    iput-object p12, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzk:Lcom/google/android/gms/internal/ads/zzclk;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/ads/internal/client/zzr;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfiu;)Lcom/google/android/gms/internal/ads/zzcjl;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzclv;->zza(Lcom/google/android/gms/ads/internal/client/zzr;)Lcom/google/android/gms/internal/ads/zzclv;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    move-object/from16 v1, p1

    .line 8
    .line 9
    iget-object v3, v1, Lcom/google/android/gms/ads/internal/client/zzr;->zza:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v10, Lcom/google/android/gms/internal/ads/zzduk;

    .line 12
    .line 13
    invoke-direct {v10, v0}, Lcom/google/android/gms/internal/ads/zzduk;-><init>(Lcom/google/android/gms/internal/ads/zzduv;)V

    .line 14
    .line 15
    .line 16
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzb:Lcom/google/android/gms/internal/ads/zzazh;

    .line 17
    .line 18
    iget-object v15, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzh:Lcom/google/android/gms/internal/ads/zzejf;

    .line 19
    .line 20
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzc:Lcom/google/android/gms/internal/ads/zzbil;

    .line 21
    .line 22
    iget-object v11, v0, Lcom/google/android/gms/internal/ads/zzduv;->zze:Lcom/google/android/gms/ads/internal/zza;

    .line 23
    .line 24
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzi:Lcom/google/android/gms/internal/ads/zzfjo;

    .line 25
    .line 26
    move-object/from16 v16, v1

    .line 27
    .line 28
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzduv;->zza:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzd:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 31
    .line 32
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzf:Lcom/google/android/gms/internal/ads/zzbgd;

    .line 33
    .line 34
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzj:Lcom/google/android/gms/internal/ads/zzdxz;

    .line 35
    .line 36
    move-object/from16 v17, v4

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v9, 0x0

    .line 41
    move-object/from16 v13, p2

    .line 42
    .line 43
    move-object/from16 v14, p3

    .line 44
    .line 45
    invoke-static/range {v1 .. v17}, Lcom/google/android/gms/internal/ads/zzckb;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzclv;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzazh;Lcom/google/android/gms/internal/ads/zzbil;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzbht;Lcom/google/android/gms/ads/internal/zzn;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzbgd;Lcom/google/android/gms/internal/ads/zzfir;Lcom/google/android/gms/internal/ads/zzfiu;Lcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzfjo;Lcom/google/android/gms/internal/ads/zzdxz;)Lcom/google/android/gms/internal/ads/zzcjl;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zzpy:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 50
    .line 51
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzduv;->zzk:Lcom/google/android/gms/internal/ads/zzclk;

    .line 68
    .line 69
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzcjl;->zzD()Landroid/webkit/WebView;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzclk;->zza(Landroid/webkit/WebView;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    return-object v1
.end method

.method public final synthetic zzb()Lcom/google/android/gms/internal/ads/zzdeg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzduv;->zzg:Lcom/google/android/gms/internal/ads/zzdeg;

    return-object v0
.end method
