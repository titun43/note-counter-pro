.class public final Lcom/google/android/gms/internal/ads/zzsm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private zzb:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzsm;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsm;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzd;)Lcom/google/android/gms/internal/ads/zzpz;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_b

    .line 12
    .line 13
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzH:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsm;->zza:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsm;->zzb:Ljava/lang/Boolean;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x1

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    if-eqz v2, :cond_3

    .line 34
    .line 35
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzcj;->zza(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "offloadVariableRateSupported"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    const-string v3, "offloadVariableRateSupported=1"

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    move v2, v5

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move v2, v4

    .line 58
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzsm;->zzb:Ljava/lang/Boolean;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzsm;->zzb:Ljava/lang/Boolean;

    .line 68
    .line 69
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsm;->zzb:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    :goto_2
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzas;->zzg(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_a

    .line 87
    .line 88
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzC(I)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-ge v0, v6, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzG:I

    .line 96
    .line 97
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfj;->zzB(I)I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_9

    .line 102
    .line 103
    :try_start_0
    new-instance v6, Landroid/media/AudioFormat$Builder;

    .line 104
    .line 105
    invoke-direct {v6}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 121
    .line 122
    .line 123
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    const/16 v1, 0x1f

    .line 125
    .line 126
    if-lt v0, v1, :cond_7

    .line 127
    .line 128
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/g;->b(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_5

    .line 137
    .line 138
    sget-object p1, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 139
    .line 140
    return-object p1

    .line 141
    :cond_5
    new-instance p2, Lcom/google/android/gms/internal/ads/zzpy;

    .line 142
    .line 143
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzpy;-><init>()V

    .line 144
    .line 145
    .line 146
    const/16 v1, 0x20

    .line 147
    .line 148
    if-le v0, v1, :cond_6

    .line 149
    .line 150
    const/4 v0, 0x2

    .line 151
    if-ne p1, v0, :cond_6

    .line 152
    .line 153
    move v4, v5

    .line 154
    :cond_6
    invoke-virtual {p2, v5}, Lcom/google/android/gms/internal/ads/zzpy;->zza(Z)Lcom/google/android/gms/internal/ads/zzpy;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/zzpy;->zzb(Z)Lcom/google/android/gms/internal/ads/zzpy;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzpy;->zzc(Z)Lcom/google/android/gms/internal/ads/zzpy;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzpy;->zzd()Lcom/google/android/gms/internal/ads/zzpz;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    return-object p1

    .line 168
    :cond_7
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-static {p1, p2}, Landroidx/lifecycle/g0;->x(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-nez p1, :cond_8

    .line 177
    .line 178
    sget-object p1, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 179
    .line 180
    return-object p1

    .line 181
    :cond_8
    new-instance p1, Lcom/google/android/gms/internal/ads/zzpy;

    .line 182
    .line 183
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzpy;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzpy;->zza(Z)Lcom/google/android/gms/internal/ads/zzpy;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzpy;->zzc(Z)Lcom/google/android/gms/internal/ads/zzpy;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzpy;->zzd()Lcom/google/android/gms/internal/ads/zzpz;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1

    .line 197
    :catch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_9
    sget-object p1, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_a
    :goto_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 204
    .line 205
    return-object p1

    .line 206
    :cond_b
    :goto_4
    sget-object p1, Lcom/google/android/gms/internal/ads/zzpz;->zza:Lcom/google/android/gms/internal/ads/zzpz;

    .line 207
    .line 208
    return-object p1
.end method
