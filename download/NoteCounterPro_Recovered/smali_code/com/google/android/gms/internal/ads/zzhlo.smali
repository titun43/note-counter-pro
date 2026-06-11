.class public final Lcom/google/android/gms/internal/ads/zzhlo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzhlw;

.field private zzb:Lcom/google/android/gms/internal/ads/zzhyg;

.field private zzc:Ljava/lang/Integer;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzb:Lcom/google/android/gms/internal/ads/zzhyg;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>([B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzb:Lcom/google/android/gms/internal/ads/zzhyg;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzhlw;)Lcom/google/android/gms/internal/ads/zzhlo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhyg;)Lcom/google/android/gms/internal/ads/zzhlo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzb:Lcom/google/android/gms/internal/ads/zzhyg;

    return-object p0
.end method

.method public final zzc(Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/zzhlo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    return-object p0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzhlp;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzb:Lcom/google/android/gms/internal/ads/zzhyg;

    .line 6
    .line 7
    if-eqz v1, :cond_9

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zzc()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhyg;->zzd()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ne v2, v1, :cond_8

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zza()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 31
    .line 32
    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zza()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 52
    .line 53
    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf()Lcom/google/android/gms/internal/ads/zzhlv;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhlv;->zzd:Lcom/google/android/gms/internal/ads/zzhlv;

    .line 66
    .line 67
    if-ne v0, v1, :cond_4

    .line 68
    .line 69
    sget-object v0, Lcom/google/android/gms/internal/ads/zzhkh;->zza:Lcom/google/android/gms/internal/ads/zzhye;

    .line 70
    .line 71
    :goto_2
    move-object v4, v0

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf()Lcom/google/android/gms/internal/ads/zzhlv;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhlv;->zzc:Lcom/google/android/gms/internal/ads/zzhlv;

    .line 80
    .line 81
    if-eq v0, v1, :cond_7

    .line 82
    .line 83
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf()Lcom/google/android/gms/internal/ads/zzhlv;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhlv;->zzb:Lcom/google/android/gms/internal/ads/zzhlv;

    .line 90
    .line 91
    if-ne v0, v1, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf()Lcom/google/android/gms/internal/ads/zzhlv;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, Lcom/google/android/gms/internal/ads/zzhlv;->zza:Lcom/google/android/gms/internal/ads/zzhlv;

    .line 101
    .line 102
    if-ne v0, v1, :cond_6

    .line 103
    .line 104
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhkh;->zzb(I)Lcom/google/android/gms/internal/ads/zzhye;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_2

    .line 115
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhlw;->zzf()Lcom/google/android/gms/internal/ads/zzhlv;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    const-string v2, "Unknown AesCmacParametersParameters.Variant: "

    .line 128
    .line 129
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_7
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzhkh;->zza(I)Lcom/google/android/gms/internal/ads/zzhye;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_2

    .line 148
    :goto_4
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhlp;

    .line 149
    .line 150
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zza:Lcom/google/android/gms/internal/ads/zzhlw;

    .line 151
    .line 152
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzb:Lcom/google/android/gms/internal/ads/zzhyg;

    .line 153
    .line 154
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzhlo;->zzc:Ljava/lang/Integer;

    .line 155
    .line 156
    const/4 v6, 0x0

    .line 157
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzhlp;-><init>(Lcom/google/android/gms/internal/ads/zzhlw;Lcom/google/android/gms/internal/ads/zzhyg;Lcom/google/android/gms/internal/ads/zzhye;Ljava/lang/Integer;[B)V

    .line 158
    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 162
    .line 163
    const-string v1, "Key size mismatch"

    .line 164
    .line 165
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 170
    .line 171
    const-string v1, "Cannot build without parameters and/or key material"

    .line 172
    .line 173
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0
.end method
