.class final Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgzl;


# instance fields
.field final synthetic zza:Lj3/a;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcdh;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcda;

.field final synthetic zzd:Lcom/google/android/gms/internal/ads/zzfoe;

.field final synthetic zze:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;Lj3/a;Lcom/google/android/gms/internal/ads/zzcdh;Lcom/google/android/gms/internal/ads/zzcda;Lcom/google/android/gms/internal/ads/zzfoe;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zza:Lj3/a;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzb:Lcom/google/android/gms/internal/ads/zzcdh;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 6
    .line 7
    iput-object p5, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zze:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zziL:Lcom/google/android/gms/internal/ads/zzbgv;

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
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const-string v2, "Internal error. "

    .line 22
    .line 23
    const-string v3, "SignalGeneratorImpl.generateSignals"

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzcdu;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, p1, v3}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zza:Lj3/a;

    .line 43
    .line 44
    iget-object v3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzb:Lcom/google/android/gms/internal/ads/zzcdh;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzy(Lj3/a;Lcom/google/android/gms/internal/ads/zzcdh;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    iget-object v3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 67
    .line 68
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfoe;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 82
    .line 83
    if-nez p1, :cond_2

    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    :try_start_0
    const-string v1, "Unknown format is no longer supported."

    .line 87
    .line 88
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    add-int/lit8 v1, v1, 0x10

    .line 104
    .line 105
    new-instance v3, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_1
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzcda;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :catch_0
    move-exception p1

    .line 125
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 126
    .line 127
    const-string v0, ""

    .line 128
    .line 129
    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 10

    .line 1
    const-string v0, "QueryInfo generation has been disabled."

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zza:Lj3/a;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zze:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzN()Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzb:Lcom/google/android/gms/internal/ads/zzcdh;

    .line 14
    .line 15
    invoke-static {v1, v3}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzy(Lj3/a;Lcom/google/android/gms/internal/ads/zzcdh;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbhe;->zziF:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 24
    .line 25
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const-string v4, "Internal error for request JSON: "

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzcda;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    sget v2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 62
    .line 63
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzf(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_d

    .line 79
    .line 80
    if-eqz v1, :cond_d

    .line 81
    .line 82
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 83
    .line 84
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzfoe;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v5}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_1
    const-string v0, "SignalGeneratorImpl.generateSignals.onSuccess"

    .line 98
    .line 99
    const-string v2, ""

    .line 100
    .line 101
    if-nez p1, :cond_3

    .line 102
    .line 103
    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 104
    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-interface {p1, v4, v4, v4}, Lcom/google/android/gms/internal/ads/zzcda;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catchall_0
    move-exception p1

    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :catch_1
    move-exception p1

    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 119
    .line 120
    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    .line 122
    .line 123
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_d

    .line 136
    .line 137
    if-eqz v1, :cond_d

    .line 138
    .line 139
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_3
    :try_start_2
    iget-object v6, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzc:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-nez v6, :cond_4

    .line 153
    .line 154
    new-instance v6, Lorg/json/JSONObject;

    .line 155
    .line 156
    iget-object v7, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzc:Ljava/lang/String;

    .line 157
    .line 158
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :catch_2
    move-exception p1

    .line 163
    goto/16 :goto_4

    .line 164
    .line 165
    :cond_4
    new-instance v6, Lorg/json/JSONObject;

    .line 166
    .line 167
    iget-object v7, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzb:Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    :goto_2
    :try_start_3
    const-string v4, "request_id"

    .line 173
    .line 174
    invoke-virtual {v6, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_6

    .line 183
    .line 184
    const-string p1, "The request ID is empty in request JSON."

    .line 185
    .line 186
    sget v3, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 187
    .line 188
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 192
    .line 193
    if-eqz p1, :cond_5

    .line 194
    .line 195
    const-string v3, "Internal error: request ID is empty in request JSON."

    .line 196
    .line 197
    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/zzcda;->zzb(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 201
    .line 202
    const-string v3, "Request ID empty"

    .line 203
    .line 204
    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/zzfoe;->zzk(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 205
    .line 206
    .line 207
    invoke-interface {p1, v5}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 208
    .line 209
    .line 210
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/lang/Boolean;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_d

    .line 223
    .line 224
    if-eqz v1, :cond_d

    .line 225
    .line 226
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_6
    :try_start_4
    iget-object v4, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzf:Landroid/os/Bundle;

    .line 234
    .line 235
    iget-object v6, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zze:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;

    .line 236
    .line 237
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzF()Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_7

    .line 242
    .line 243
    if-eqz v4, :cond_7

    .line 244
    .line 245
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzH()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    const/4 v8, -0x1

    .line 250
    invoke-virtual {v4, v7, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-ne v7, v8, :cond_7

    .line 255
    .line 256
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzH()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzI()Ljava/util/concurrent/atomic/AtomicInteger;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 265
    .line 266
    .line 267
    move-result v8

    .line 268
    invoke-virtual {v4, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 269
    .line 270
    .line 271
    :cond_7
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzE()Z

    .line 272
    .line 273
    .line 274
    move-result v7

    .line 275
    if-eqz v7, :cond_9

    .line 276
    .line 277
    if-eqz v4, :cond_9

    .line 278
    .line 279
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzG()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v7

    .line 287
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 288
    .line 289
    .line 290
    move-result v7

    .line 291
    if-eqz v7, :cond_9

    .line 292
    .line 293
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzK()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v7

    .line 301
    if-eqz v7, :cond_8

    .line 302
    .line 303
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzz()Landroid/content/Context;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzJ()Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    iget-object v9, v9, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {v7, v8, v9}, Lcom/google/android/gms/ads/internal/util/zzs;->zze(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    invoke-virtual {v6, v7}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzL(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :cond_8
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzG()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v7

    .line 328
    invoke-virtual {v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzau;->zzK()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    invoke-virtual {v4, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    :cond_9
    iget-object v6, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 336
    .line 337
    if-eqz v6, :cond_b

    .line 338
    .line 339
    iget-object v7, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzc:Ljava/lang/String;

    .line 340
    .line 341
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    if-nez v7, :cond_a

    .line 346
    .line 347
    iget-object v7, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zza:Ljava/lang/String;

    .line 348
    .line 349
    iget-object p1, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzc:Ljava/lang/String;

    .line 350
    .line 351
    invoke-interface {v6, v7, p1, v4}, Lcom/google/android/gms/internal/ads/zzcda;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 352
    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_a
    iget-object v7, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zza:Ljava/lang/String;

    .line 356
    .line 357
    iget-object p1, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzbj;->zzb:Ljava/lang/String;

    .line 358
    .line 359
    invoke-interface {v6, v7, p1, v4}, Lcom/google/android/gms/internal/ads/zzcda;->zzc(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 360
    .line 361
    .line 362
    :cond_b
    :goto_3
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 363
    .line 364
    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 365
    .line 366
    .line 367
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 368
    .line 369
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    check-cast p1, Ljava/lang/Boolean;

    .line 374
    .line 375
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    if-eqz p1, :cond_d

    .line 380
    .line 381
    if-eqz v1, :cond_d

    .line 382
    .line 383
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 384
    .line 385
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :goto_4
    :try_start_5
    const-string v3, "Failed to create JSON object from the request string."

    .line 393
    .line 394
    sget v6, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 395
    .line 396
    invoke-static {v3}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    iget-object v3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzc:Lcom/google/android/gms/internal/ads/zzcda;

    .line 400
    .line 401
    if-eqz v3, :cond_c

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    add-int/lit8 v7, v7, 0x21

    .line 412
    .line 413
    new-instance v8, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-interface {v3, v4}, Lcom/google/android/gms/internal/ads/zzcda;->zzb(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :cond_c
    iget-object v3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 432
    .line 433
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfoe;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 434
    .line 435
    .line 436
    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 437
    .line 438
    .line 439
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-virtual {v4, p1, v0}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 444
    .line 445
    .line 446
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 447
    .line 448
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    check-cast p1, Ljava/lang/Boolean;

    .line 453
    .line 454
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    if-eqz p1, :cond_d

    .line 459
    .line 460
    if-eqz v1, :cond_d

    .line 461
    .line 462
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :goto_5
    :try_start_6
    iget-object v3, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 470
    .line 471
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/ads/zzfoe;->zzj(Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 472
    .line 473
    .line 474
    invoke-interface {v3, v5}, Lcom/google/android/gms/internal/ads/zzfoe;->zzd(Z)Lcom/google/android/gms/internal/ads/zzfoe;

    .line 475
    .line 476
    .line 477
    sget v3, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 478
    .line 479
    invoke-static {v2, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 480
    .line 481
    .line 482
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzh()Lcom/google/android/gms/internal/ads/zzcdu;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    invoke-virtual {v2, p1, v0}, Lcom/google/android/gms/internal/ads/zzcdu;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 487
    .line 488
    .line 489
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 490
    .line 491
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    check-cast p1, Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result p1

    .line 501
    if-eqz p1, :cond_d

    .line 502
    .line 503
    if-eqz v1, :cond_d

    .line 504
    .line 505
    iget-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 506
    .line 507
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 511
    .line 512
    .line 513
    :cond_d
    return-void

    .line 514
    :goto_6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 515
    .line 516
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    check-cast v0, Ljava/lang/Boolean;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-eqz v0, :cond_e

    .line 527
    .line 528
    if-eqz v1, :cond_e

    .line 529
    .line 530
    iget-object v0, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzad;->zzd:Lcom/google/android/gms/internal/ads/zzfoe;

    .line 531
    .line 532
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfoo;->zza(Lcom/google/android/gms/internal/ads/zzfoe;)Lcom/google/android/gms/internal/ads/zzfoo;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfoo;->zzh()V

    .line 536
    .line 537
    .line 538
    :cond_e
    throw p1
.end method
