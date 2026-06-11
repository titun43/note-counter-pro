.class public final Lcom/google/android/gms/internal/ads/zzhds;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzhku;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzhjb;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzhjy;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzhba;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhdp;->zza:Lcom/google/android/gms/internal/ads/zzhdp;

    .line 2
    .line 3
    const-class v1, Lcom/google/android/gms/internal/ads/zzhdo;

    .line 4
    .line 5
    const-class v2, Lcom/google/android/gms/internal/ads/zzhas;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhku;->zzd(Lcom/google/android/gms/internal/ads/zzhkt;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzhku;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhds;->zzb:Lcom/google/android/gms/internal/ads/zzhku;

    .line 12
    .line 13
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhdr;->zza:Lcom/google/android/gms/internal/ads/zzhdr;

    .line 14
    .line 15
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhds;->zzc:Lcom/google/android/gms/internal/ads/zzhjb;

    .line 16
    .line 17
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhdq;->zza:Lcom/google/android/gms/internal/ads/zzhdq;

    .line 18
    .line 19
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhds;->zzd:Lcom/google/android/gms/internal/ads/zzhjy;

    .line 20
    .line 21
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhqb;->zzb:Lcom/google/android/gms/internal/ads/zzhqb;

    .line 22
    .line 23
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhow;->zze()Lcom/google/android/gms/internal/ads/zzidk;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v3, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    .line 28
    .line 29
    invoke-static {v3, v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzhjl;->zze(Ljava/lang/String;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzhqb;Lcom/google/android/gms/internal/ads/zzidk;)Lcom/google/android/gms/internal/ads/zzhba;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lcom/google/android/gms/internal/ads/zzhds;->zze:Lcom/google/android/gms/internal/ads/zzhba;

    .line 34
    .line 35
    return-void
.end method

.method public static zza(Z)V
    .locals 7

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
    sget v0, Lcom/google/android/gms/internal/ads/zzhgv;->zza:I

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkg;->zza()Lcom/google/android/gms/internal/ads/zzhkg;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhgv;->zza(Lcom/google/android/gms/internal/ads/zzhkg;)V

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
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhdt;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhdt;-><init>([B)V

    .line 30
    .line 31
    .line 32
    const/16 v4, 0x10

    .line 33
    .line 34
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhdt;->zza(I)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 35
    .line 36
    .line 37
    sget-object v5, Lcom/google/android/gms/internal/ads/zzhdu;->zza:Lcom/google/android/gms/internal/ads/zzhdu;

    .line 38
    .line 39
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhdt;->zzb(Lcom/google/android/gms/internal/ads/zzhdu;)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhdt;->zzc()Lcom/google/android/gms/internal/ads/zzhdv;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v6, "AES128_GCM_SIV"

    .line 47
    .line 48
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhdt;

    .line 52
    .line 53
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhdt;-><init>([B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhdt;->zza(I)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 57
    .line 58
    .line 59
    sget-object v4, Lcom/google/android/gms/internal/ads/zzhdu;->zzc:Lcom/google/android/gms/internal/ads/zzhdu;

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhdt;->zzb(Lcom/google/android/gms/internal/ads/zzhdu;)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhdt;->zzc()Lcom/google/android/gms/internal/ads/zzhdv;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v6, "AES128_GCM_SIV_RAW"

    .line 69
    .line 70
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhdt;

    .line 74
    .line 75
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhdt;-><init>([B)V

    .line 76
    .line 77
    .line 78
    const/16 v6, 0x20

    .line 79
    .line 80
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzhdt;->zza(I)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzhdt;->zzb(Lcom/google/android/gms/internal/ads/zzhdu;)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhdt;->zzc()Lcom/google/android/gms/internal/ads/zzhdv;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v5, "AES256_GCM_SIV"

    .line 91
    .line 92
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhdt;

    .line 96
    .line 97
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzhdt;-><init>([B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzhdt;->zza(I)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzhdt;->zzb(Lcom/google/android/gms/internal/ads/zzhdu;)Lcom/google/android/gms/internal/ads/zzhdt;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzhdt;->zzc()Lcom/google/android/gms/internal/ads/zzhdv;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const-string v3, "AES256_GCM_SIV_RAW"

    .line 111
    .line 112
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkc;->zzd(Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjz;->zza()Lcom/google/android/gms/internal/ads/zzhjz;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhds;->zzd:Lcom/google/android/gms/internal/ads/zzhjy;

    .line 127
    .line 128
    const-class v2, Lcom/google/android/gms/internal/ads/zzhdv;

    .line 129
    .line 130
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhjz;->zzb(Lcom/google/android/gms/internal/ads/zzhjy;Ljava/lang/Class;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjx;->zza()Lcom/google/android/gms/internal/ads/zzhjx;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhds;->zzc:Lcom/google/android/gms/internal/ads/zzhjb;

    .line 138
    .line 139
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzhjx;->zzb(Lcom/google/android/gms/internal/ads/zzhjb;Ljava/lang/Class;)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhkd;->zza()Lcom/google/android/gms/internal/ads/zzhkd;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhds;->zzb:Lcom/google/android/gms/internal/ads/zzhku;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzhkd;->zzb(Lcom/google/android/gms/internal/ads/zzhku;)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhjc;->zza()Lcom/google/android/gms/internal/ads/zzhjc;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhds;->zze:Lcom/google/android/gms/internal/ads/zzhba;

    .line 156
    .line 157
    invoke-virtual {v0, v1, p0}, Lcom/google/android/gms/internal/ads/zzhjc;->zzb(Lcom/google/android/gms/internal/ads/zzhba;Z)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 162
    .line 163
    const-string v0, "Registering AES GCM SIV is not supported in FIPS mode"

    .line 164
    .line 165
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p0
.end method
