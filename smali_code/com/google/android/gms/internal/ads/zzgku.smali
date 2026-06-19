.class final Lcom/google/android/gms/internal/ads/zzgku;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Ljava/util/Optional;

.field private zzb:Ljava/util/Optional;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbcf;)Z
    .locals 4

    .line 1
    const-class v0, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbcf;->zza()Lcom/google/android/gms/internal/ads/zzbcl;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcl;->zzb()Lcom/google/android/gms/internal/ads/zzbcn;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbcn;->zzb()Lcom/google/android/gms/internal/ads/zzian;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzian;->zzy()[B

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbcf;->zza()Lcom/google/android/gms/internal/ads/zzbcl;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbcl;->zzd()Lcom/google/android/gms/internal/ads/zzian;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzian;->zzy()[B

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgku;->zza:Ljava/util/Optional;

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgku;->zzb:Ljava/util/Optional;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhut;->zza()V

    .line 40
    .line 41
    .line 42
    new-instance v2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {}, Lcom/getcapacitor/plugin/util/a;->q()Ljava/util/Base64$Decoder;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3}, Lcom/getcapacitor/plugin/util/a;->B(Ljava/util/Base64$Decoder;)[B

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhbu;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhbk;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhlf;->zzc()Lcom/google/android/gms/internal/ads/zzhlf;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzhbk;->zzg(Lcom/google/android/gms/internal/ads/zzhaw;Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 68
    .line 69
    invoke-static {v2}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgku;->zza:Ljava/util/Optional;

    .line 74
    .line 75
    new-instance v2, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {}, Lcom/getcapacitor/plugin/util/a;->q()Ljava/util/Base64$Decoder;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3}, Lcom/getcapacitor/plugin/util/a;->D(Ljava/util/Base64$Decoder;)[B

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzhbu;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzhbk;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhlf;->zzc()Lcom/google/android/gms/internal/ads/zzhlf;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzhbk;->zzg(Lcom/google/android/gms/internal/ads/zzhaw;Ljava/lang/Class;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 101
    .line 102
    invoke-static {v0}, Ljava/util/Optional;->of(Ljava/lang/Object;)Ljava/util/Optional;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgku;->zzb:Ljava/util/Optional;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    :try_start_2
    new-instance v2, Ljava/security/GeneralSecurityException;

    .line 111
    .line 112
    const-string v3, "Failed to verify program"

    .line 113
    .line 114
    invoke-direct {v2, v3, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v2

    .line 118
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgku;->zza:Ljava/util/Optional;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgku;->zza:Ljava/util/Optional;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 130
    .line 131
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzhbs;->zza([B[B)V
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :catch_1
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgku;->zzb:Ljava/util/Optional;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/util/Optional;->isPresent()Z

    .line 138
    .line 139
    .line 140
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgku;->zzb:Ljava/util/Optional;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    check-cast v0, Lcom/google/android/gms/internal/ads/zzhbs;

    .line 147
    .line 148
    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzhbs;->zza([B[B)V
    :try_end_3
    .catch Ljava/security/GeneralSecurityException; {:try_start_3 .. :try_end_3} :catch_2

    .line 149
    .line 150
    .line 151
    :goto_1
    const/4 p1, 0x1

    .line 152
    return p1

    .line 153
    :catch_2
    const/4 p1, 0x0

    .line 154
    return p1
.end method
