.class public final Lcom/google/android/gms/internal/ads/zzbbv;
.super Lcom/google/android/gms/internal/ads/zzbby;
.source "SourceFile"


# instance fields
.field private final zzh:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbak;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzawg;IILandroid/view/View;)V
    .locals 7

    .line 1
    const-string v3, "WvzwBqCGqiupQVgrtkQ81CPfk2zDbRT3OzniCOJeuxU="

    .line 2
    .line 3
    const/16 v6, 0x39

    .line 4
    .line 5
    const-string v2, "FW20C8Ai9koIlsaxQSE6ztByFAH2b9HaWXnzViOGstPwi5iqItbLmay/ubT2VSsg"

    .line 6
    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v4, p4

    .line 10
    move v5, p5

    .line 11
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbby;-><init>(Lcom/google/android/gms/internal/ads/zzbak;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzawg;II)V

    .line 12
    .line 13
    .line 14
    iput-object p7, v0, Lcom/google/android/gms/internal/ads/zzbbv;->zzh:Landroid/view/View;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbbv;->zzh:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzel:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zzmu:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Boolean;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbby;->zza:Lcom/google/android/gms/internal/ads/zzbak;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbak;->zzb()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzbby;->zze:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    filled-new-array {v0, v3, v1, v2}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v4, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbao;

    .line 57
    .line 58
    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/zzbao;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzaxf;->zza()Lcom/google/android/gms/internal/ads/zzaxe;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzbao;->zza:Ljava/lang/Long;

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxe;->zzb(J)Lcom/google/android/gms/internal/ads/zzaxe;

    .line 72
    .line 73
    .line 74
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzbao;->zzb:Ljava/lang/Long;

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxe;->zzc(J)Lcom/google/android/gms/internal/ads/zzaxe;

    .line 81
    .line 82
    .line 83
    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzbao;->zzc:Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxe;->zzd(J)Lcom/google/android/gms/internal/ads/zzaxe;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzbao;->zze:Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    invoke-virtual {v0, v4, v5}, Lcom/google/android/gms/internal/ads/zzaxe;->zza(J)Lcom/google/android/gms/internal/ads/zzaxe;

    .line 105
    .line 106
    .line 107
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    iget-object v1, v3, Lcom/google/android/gms/internal/ads/zzbao;->zzd:Ljava/lang/Long;

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v1

    .line 119
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaxe;->zze(J)Lcom/google/android/gms/internal/ads/zzaxe;

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbby;->zzd:Lcom/google/android/gms/internal/ads/zzawg;

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxf;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzawg;->zzM(Lcom/google/android/gms/internal/ads/zzaxf;)Lcom/google/android/gms/internal/ads/zzawg;

    .line 131
    .line 132
    .line 133
    :cond_2
    return-void
.end method
