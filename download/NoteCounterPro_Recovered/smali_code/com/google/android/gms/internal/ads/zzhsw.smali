.class public final Lcom/google/android/gms/internal/ads/zzhsw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzhku;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzhku;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzhbq;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzhba;

.field private static final zzf:Lcom/google/android/gms/internal/ads/zzhjy;

.field private static final zzg:Lcom/google/android/gms/internal/ads/zzhjb;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhsu;->zza:Lcom/google/android/gms/internal/ads/zzhsu;

    .line 2
    .line 3
    const-class v1, Lcom/google/android/gms/internal/ads/zzhsr;

    .line 4
    .line 5
    const-class v2, Lcom/google/android/gms/internal/ads/zzhbr;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhku;->zzd(Lcom/google/android/gms/internal/ads/zzhkt;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhku;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zzb:Lcom/google/android/gms/internal/ads/zzhku;

    .line 12
    .line 13
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhsv;->zza:Lcom/google/android/gms/internal/ads/zzhsv;

    .line 14
    .line 15
    const-class v1, Lcom/google/android/gms/internal/ads/zzhsx;

    .line 16
    .line 17
    const-class v3, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 18
    .line 19
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzhku;->zzd(Lcom/google/android/gms/internal/ads/zzhkt;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhku;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zzc:Lcom/google/android/gms/internal/ads/zzhku;

    .line 24
    .line 25
    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    .line 26
    .line 27
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhpp;->zzg()Lcom/google/android/gms/internal/ads/zzidk;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzhjl;->zzf(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzidk;)Lcom/google/android/gms/internal/ads/zzhbq;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zzd:Lcom/google/android/gms/internal/ads/zzhbq;

    .line 36
    .line 37
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zzd:Lcom/google/android/gms/internal/ads/zzhqb;

    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhpr;->zzg()Lcom/google/android/gms/internal/ads/zzidk;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    .line 44
    .line 45
    invoke-static {v2, v3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhjl;->zze(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhqb;Lcom/google/android/gms/internal/ads/zzidk;)Lcom/google/android/gms/internal/ads/zzhba;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zze:Lcom/google/android/gms/internal/ads/zzhba;

    .line 50
    .line 51
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhst;->zza:Lcom/google/android/gms/internal/ads/zzhst;

    .line 52
    .line 53
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zzf:Lcom/google/android/gms/internal/ads/zzhjy;

    .line 54
    .line 55
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhss;->zza:Lcom/google/android/gms/internal/ads/zzhss;

    .line 56
    .line 57
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zzg:Lcom/google/android/gms/internal/ads/zzhjb;

    .line 58
    .line 59
    return-void
.end method

.method public static zza(Z)V
    .locals 5

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzhid;->zza(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget v0, Lcom/google/android/gms/internal/ads/zzhvm;->zza:I

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkg;->zza()Lcom/google/android/gms/internal/ads/zzhkg;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhvm;->zza(Lcom/google/android/gms/internal/ads/zzhkg;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkc;->zza()Lcom/google/android/gms/internal/ads/zzhkc;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v2, Lcom/google/android/gms/internal/ads/zzhsp;->zza:Lcom/google/android/gms/internal/ads/zzhsp;

    .line 27
    .line 28
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhsq;->zzb(Lcom/google/android/gms/internal/ads/zzhsp;)Lcom/google/android/gms/internal/ads/zzhsq;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "ED25519"

    .line 33
    .line 34
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object v2, Lcom/google/android/gms/internal/ads/zzhsp;->zzd:Lcom/google/android/gms/internal/ads/zzhsp;

    .line 38
    .line 39
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhsq;->zzb(Lcom/google/android/gms/internal/ads/zzhsp;)Lcom/google/android/gms/internal/ads/zzhsq;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v4, "ED25519_RAW"

    .line 44
    .line 45
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhsq;->zzb(Lcom/google/android/gms/internal/ads/zzhsp;)Lcom/google/android/gms/internal/ads/zzhsq;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "ED25519WithRawOutput"

    .line 53
    .line 54
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkc;->zzd(Ljava/util/Map;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjx;->zza()Lcom/google/android/gms/internal/ads/zzhjx;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhsw;->zzg:Lcom/google/android/gms/internal/ads/zzhjb;

    .line 69
    .line 70
    const-class v2, Lcom/google/android/gms/internal/ads/zzhsq;

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhjx;->zzb(Lcom/google/android/gms/internal/ads/zzhjb;Ljava/lang/Class;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjz;->zza()Lcom/google/android/gms/internal/ads/zzhjz;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhsw;->zzf:Lcom/google/android/gms/internal/ads/zzhjy;

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhjz;->zzb(Lcom/google/android/gms/internal/ads/zzhjy;Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkd;->zza()Lcom/google/android/gms/internal/ads/zzhkd;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhsw;->zzb:Lcom/google/android/gms/internal/ads/zzhku;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkd;->zzb(Lcom/google/android/gms/internal/ads/zzhku;)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkd;->zza()Lcom/google/android/gms/internal/ads/zzhkd;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhsw;->zzc:Lcom/google/android/gms/internal/ads/zzhku;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkd;->zzb(Lcom/google/android/gms/internal/ads/zzhku;)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjc;->zza()Lcom/google/android/gms/internal/ads/zzhjc;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhsw;->zzd:Lcom/google/android/gms/internal/ads/zzhbq;

    .line 107
    .line 108
    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzhjc;->zzb(Lcom/google/android/gms/internal/ads/zzhba;Z)V

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjc;->zza()Lcom/google/android/gms/internal/ads/zzhjc;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhsw;->zze:Lcom/google/android/gms/internal/ads/zzhba;

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzhjc;->zzb(Lcom/google/android/gms/internal/ads/zzhba;Z)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 123
    .line 124
    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    .line 125
    .line 126
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p0
.end method
