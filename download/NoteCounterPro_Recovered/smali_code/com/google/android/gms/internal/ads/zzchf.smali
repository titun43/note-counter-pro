.class public final Lcom/google/android/gms/internal/ads/zzchf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzboh;


# instance fields
.field private zza:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I
    .locals 2

    .line 1
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbb;->zza()Lcom/google/android/gms/ads/internal/util/client/zzf;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p0, v0}, Lcom/google/android/gms/ads/internal/util/client/zzf;->zzC(Landroid/content/Context;I)I

    .line 17
    .line 18
    .line 19
    move-result p3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    add-int/lit8 p0, p0, 0x22

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    add-int/2addr p0, v0

    .line 34
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 35
    .line 36
    .line 37
    const-string p0, "Could not parse "

    .line 38
    .line 39
    const-string v0, " in a video GMSG: "

    .line 40
    .line 41
    invoke-static {v1, p0, p2, v0, p1}, Landroidx/emoji2/text/u;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 46
    .line 47
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    add-int/lit8 p0, p0, 0x1e

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    add-int/2addr p0, v0

    .line 75
    add-int/lit8 p0, p0, 0x6

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v0, p0

    .line 82
    new-instance p0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 87
    .line 88
    .line 89
    const-string v0, "Parse pixels for "

    .line 90
    .line 91
    const-string v1, ", got string "

    .line 92
    .line 93
    invoke-static {p0, v0, p2, v1, p1}, Ls/c;->e(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string p1, ", int "

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, "."

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_1
    return p3
.end method

.method private static zzc(Lcom/google/android/gms/internal/ads/zzcfs;Ljava/util/Map;)V
    .locals 5

    .line 1
    const-string v0, "minBufferMs"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "maxBufferMs"

    .line 10
    .line 11
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, "bufferForPlaybackMs"

    .line 18
    .line 19
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    const-string v3, "bufferForPlaybackAfterRebufferMs"

    .line 26
    .line 27
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    const-string v4, "socketReceiveBufferSize"

    .line 34
    .line 35
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzcfs;->zzx(I)V

    .line 48
    .line 49
    .line 50
    :cond_0
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzcfs;->zzy(I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcfs;->zzz(I)V

    .line 66
    .line 67
    .line 68
    :cond_2
    if-eqz v3, :cond_3

    .line 69
    .line 70
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcfs;->zzA(I)V

    .line 75
    .line 76
    .line 77
    :cond_3
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzcfs;->zzB(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string p1, "Could not parse buffer parameters in loadControl video GMSG: ("

    .line 90
    .line 91
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p1, ", "

    .line 98
    .line 99
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p1, ")"

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    sget p1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 115
    .line 116
    invoke-static {p0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    check-cast v2, Lcom/google/android/gms/internal/ads/zzcge;

    .line 8
    .line 9
    const-string v3, "action"

    .line 10
    .line 11
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "All demuxed URLs are empty for playback: "

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 22
    .line 23
    const-string v1, "Action missing from video GMSG."

    .line 24
    .line 25
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string v5, "playerId"

    .line 30
    .line 31
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v5, 0x0

    .line 53
    :goto_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzdm()Lcom/google/android/gms/internal/ads/zzcft;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzdm()Lcom/google/android/gms/internal/ads/zzcft;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcft;->zza()Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/4 v6, 0x0

    .line 69
    :goto_1
    const-string v8, "load"

    .line 70
    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-nez v9, :cond_4

    .line 80
    .line 81
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "Event intended for player "

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, ", but sent to player "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v2, " - event ignored"

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    sget v2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 118
    .line 119
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzh(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    :goto_2
    const/4 v6, 0x3

    .line 124
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzm(I)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_5

    .line 129
    .line 130
    new-instance v6, Lorg/json/JSONObject;

    .line 131
    .line 132
    invoke-direct {v6, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 133
    .line 134
    .line 135
    const-string v9, "google.afma.Notify_dt"

    .line 136
    .line 137
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    add-int/lit8 v9, v9, 0xd

    .line 153
    .line 154
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    new-instance v11, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    add-int/2addr v9, v10

    .line 161
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 162
    .line 163
    .line 164
    const-string v9, "Video GMSG: "

    .line 165
    .line 166
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v9, " "

    .line 173
    .line 174
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-static {v6}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    :cond_5
    const-string v6, "background"

    .line 188
    .line 189
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    const-string v9, "color"

    .line 194
    .line 195
    if-eqz v6, :cond_7

    .line 196
    .line 197
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_6

    .line 208
    .line 209
    const-string v1, "Color parameter missing from background video GMSG."

    .line 210
    .line 211
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_6
    :try_start_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzcge;->setBackgroundColor(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :catch_0
    const-string v1, "Invalid color parameter in background video GMSG."

    .line 224
    .line 225
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_7
    const-string v6, "playerBackground"

    .line 230
    .line 231
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    if-eqz v6, :cond_9

    .line 236
    .line 237
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_8

    .line 248
    .line 249
    const-string v1, "Color parameter missing from playerBackground video GMSG."

    .line 250
    .line 251
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_8
    :try_start_1
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzcge;->zzv(I)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :catch_1
    const-string v1, "Invalid color parameter in playerBackground video GMSG."

    .line 264
    .line 265
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :cond_9
    const-string v6, "decoderProps"

    .line 270
    .line 271
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    const-string v10, "onVideoEvent"

    .line 276
    .line 277
    const-string v11, "event"

    .line 278
    .line 279
    const/4 v12, 0x0

    .line 280
    if-eqz v9, :cond_c

    .line 281
    .line 282
    const-string v3, "mimeTypes"

    .line 283
    .line 284
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Ljava/lang/String;

    .line 289
    .line 290
    if-nez v1, :cond_a

    .line 291
    .line 292
    const-string v1, "No MIME types specified for decoder properties inspection."

    .line 293
    .line 294
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    new-instance v1, Ljava/util/HashMap;

    .line 298
    .line 299
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    const-string v3, "error"

    .line 306
    .line 307
    const-string v4, "missingMimeTypes"

    .line 308
    .line 309
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    invoke-interface {v2, v10, v1}, Lcom/google/android/gms/internal/ads/zzbrd;->zze(Ljava/lang/String;Ljava/util/Map;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :cond_a
    new-instance v4, Ljava/util/HashMap;

    .line 317
    .line 318
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v5, ","

    .line 322
    .line 323
    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    array-length v5, v1

    .line 328
    :goto_3
    if-ge v12, v5, :cond_b

    .line 329
    .line 330
    aget-object v7, v1, v12

    .line 331
    .line 332
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    invoke-static {v8}, Lcom/google/android/gms/ads/internal/util/zzch;->zza(Ljava/lang/String;)Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    invoke-virtual {v4, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    add-int/lit8 v12, v12, 0x1

    .line 344
    .line 345
    goto :goto_3

    .line 346
    :cond_b
    new-instance v1, Ljava/util/HashMap;

    .line 347
    .line 348
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    invoke-interface {v2, v10, v1}, Lcom/google/android/gms/internal/ads/zzbrd;->zze(Ljava/lang/String;Ljava/util/Map;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_c
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzdm()Lcom/google/android/gms/internal/ads/zzcft;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    if-nez v6, :cond_d

    .line 366
    .line 367
    const-string v1, "Could not get underlay container for a video GMSG."

    .line 368
    .line 369
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :cond_d
    const-string v9, "new"

    .line 374
    .line 375
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v9

    .line 379
    const-string v13, "position"

    .line 380
    .line 381
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    const-string v14, "y"

    .line 386
    .line 387
    const-string v15, "x"

    .line 388
    .line 389
    if-nez v9, :cond_2e

    .line 390
    .line 391
    if-eqz v13, :cond_e

    .line 392
    .line 393
    goto/16 :goto_a

    .line 394
    .line 395
    :cond_e
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzh()Lcom/google/android/gms/internal/ads/zzckr;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    const-string v13, "currentTime"

    .line 400
    .line 401
    if-eqz v9, :cond_12

    .line 402
    .line 403
    const-string v7, "timeupdate"

    .line 404
    .line 405
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    if-eqz v7, :cond_10

    .line 410
    .line 411
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    check-cast v1, Ljava/lang/String;

    .line 416
    .line 417
    if-nez v1, :cond_f

    .line 418
    .line 419
    const-string v1, "currentTime parameter missing from timeupdate video GMSG."

    .line 420
    .line 421
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_f
    :try_start_2
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/ads/zzckr;->zzd(F)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :catch_2
    const-string v2, "Could not parse currentTime parameter from timeupdate video GMSG: "

    .line 434
    .line 435
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :cond_10
    const-string v7, "skip"

    .line 444
    .line 445
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    if-nez v7, :cond_11

    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_11
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzckr;->zzr()V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :cond_12
    :goto_4
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcft;->zzd()Lcom/google/android/gms/internal/ads/zzcfs;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    if-nez v6, :cond_13

    .line 461
    .line 462
    new-instance v1, Ljava/util/HashMap;

    .line 463
    .line 464
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 465
    .line 466
    .line 467
    const-string v3, "no_video_view"

    .line 468
    .line 469
    invoke-virtual {v1, v11, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    invoke-interface {v2, v10, v1}, Lcom/google/android/gms/internal/ads/zzbrd;->zze(Ljava/lang/String;Ljava/util/Map;)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :cond_13
    const-string v7, "click"

    .line 477
    .line 478
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    if-eqz v7, :cond_14

    .line 483
    .line 484
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->getContext()Landroid/content/Context;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    invoke-static {v2, v1, v15, v12}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    invoke-static {v2, v1, v14, v12}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 493
    .line 494
    .line 495
    move-result v1

    .line 496
    int-to-float v12, v3

    .line 497
    int-to-float v13, v1

    .line 498
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 499
    .line 500
    .line 501
    move-result-wide v7

    .line 502
    const/4 v11, 0x0

    .line 503
    const/4 v14, 0x0

    .line 504
    move-wide v9, v7

    .line 505
    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-virtual {v6, v1}, Lcom/google/android/gms/internal/ads/zzcfs;->zzC(Landroid/view/MotionEvent;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :cond_14
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v7

    .line 520
    if-eqz v7, :cond_16

    .line 521
    .line 522
    const-string v2, "time"

    .line 523
    .line 524
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    check-cast v1, Ljava/lang/String;

    .line 529
    .line 530
    if-nez v1, :cond_15

    .line 531
    .line 532
    const-string v1, "Time parameter missing from currentTime video GMSG."

    .line 533
    .line 534
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :cond_15
    :try_start_3
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 543
    .line 544
    mul-float/2addr v2, v3

    .line 545
    float-to-int v2, v2

    .line 546
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzcfs;->zzt(I)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    .line 547
    .line 548
    .line 549
    return-void

    .line 550
    :catch_3
    const-string v2, "Could not parse time parameter from currentTime video GMSG: "

    .line 551
    .line 552
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    return-void

    .line 560
    :cond_16
    const-string v7, "hide"

    .line 561
    .line 562
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v7

    .line 566
    if-eqz v7, :cond_17

    .line 567
    .line 568
    const/4 v7, 0x4

    .line 569
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 570
    .line 571
    .line 572
    return-void

    .line 573
    :cond_17
    const-string v7, "remove"

    .line 574
    .line 575
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    if-eqz v7, :cond_18

    .line 580
    .line 581
    const/16 v1, 0x8

    .line 582
    .line 583
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :cond_18
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    if-eqz v7, :cond_19

    .line 592
    .line 593
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzcfs;->zzq(Ljava/lang/Integer;)V

    .line 594
    .line 595
    .line 596
    return-void

    .line 597
    :cond_19
    const-string v5, "loadControl"

    .line 598
    .line 599
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v5

    .line 603
    if-eqz v5, :cond_1a

    .line 604
    .line 605
    invoke-static {v6, v1}, Lcom/google/android/gms/internal/ads/zzchf;->zzc(Lcom/google/android/gms/internal/ads/zzcfs;Ljava/util/Map;)V

    .line 606
    .line 607
    .line 608
    return-void

    .line 609
    :cond_1a
    const-string v5, "muted"

    .line 610
    .line 611
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v7

    .line 615
    if-eqz v7, :cond_1c

    .line 616
    .line 617
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    check-cast v1, Ljava/lang/String;

    .line 622
    .line 623
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-eqz v1, :cond_1b

    .line 628
    .line 629
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfs;->zzu()V

    .line 630
    .line 631
    .line 632
    return-void

    .line 633
    :cond_1b
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfs;->zzv()V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :cond_1c
    const-string v5, "pause"

    .line 638
    .line 639
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v5

    .line 643
    if-eqz v5, :cond_1d

    .line 644
    .line 645
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfs;->zzr()V

    .line 646
    .line 647
    .line 648
    return-void

    .line 649
    :cond_1d
    const-string v5, "play"

    .line 650
    .line 651
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v5

    .line 655
    if-eqz v5, :cond_1e

    .line 656
    .line 657
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfs;->zzs()V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :cond_1e
    const-string v5, "show"

    .line 662
    .line 663
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    if-eqz v5, :cond_1f

    .line 668
    .line 669
    invoke-virtual {v6, v12}, Landroid/view/View;->setVisibility(I)V

    .line 670
    .line 671
    .line 672
    return-void

    .line 673
    :cond_1f
    const-string v5, "src"

    .line 674
    .line 675
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v7

    .line 679
    if-eqz v7, :cond_29

    .line 680
    .line 681
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    check-cast v3, Ljava/lang/String;

    .line 686
    .line 687
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzcH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 688
    .line 689
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 690
    .line 691
    .line 692
    move-result-object v7

    .line 693
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    check-cast v5, Ljava/lang/Boolean;

    .line 698
    .line 699
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 700
    .line 701
    .line 702
    move-result v5

    .line 703
    if-eqz v5, :cond_21

    .line 704
    .line 705
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-nez v5, :cond_20

    .line 710
    .line 711
    goto :goto_5

    .line 712
    :cond_20
    const-string v1, "Src parameter missing from src video GMSG."

    .line 713
    .line 714
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    return-void

    .line 718
    :cond_21
    :goto_5
    const-string v5, "periodicReportIntervalMs"

    .line 719
    .line 720
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v7

    .line 724
    if-nez v7, :cond_22

    .line 725
    .line 726
    :goto_6
    const/4 v5, 0x1

    .line 727
    const/4 v7, 0x0

    .line 728
    goto :goto_7

    .line 729
    :cond_22
    :try_start_4
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v7

    .line 733
    check-cast v7, Ljava/lang/String;

    .line 734
    .line 735
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 736
    .line 737
    .line 738
    move-result v7

    .line 739
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 740
    .line 741
    .line 742
    move-result-object v7
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_4

    .line 743
    const/4 v5, 0x1

    .line 744
    goto :goto_7

    .line 745
    :catch_4
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v5

    .line 749
    check-cast v5, Ljava/lang/String;

    .line 750
    .line 751
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    const-string v7, "Video gmsg invalid numeric parameter \'periodicReportIntervalMs\': "

    .line 756
    .line 757
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    invoke-static {v5}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    goto :goto_6

    .line 765
    :goto_7
    new-array v8, v5, [Ljava/lang/String;

    .line 766
    .line 767
    aput-object v3, v8, v12

    .line 768
    .line 769
    const-string v5, "demuxed"

    .line 770
    .line 771
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    check-cast v1, Ljava/lang/String;

    .line 776
    .line 777
    if-eqz v1, :cond_27

    .line 778
    .line 779
    :try_start_5
    new-instance v5, Lorg/json/JSONArray;

    .line 780
    .line 781
    invoke-direct {v5, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    new-instance v8, Ljava/util/ArrayList;

    .line 785
    .line 786
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 787
    .line 788
    .line 789
    move v9, v12

    .line 790
    :goto_8
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 791
    .line 792
    .line 793
    move-result v10

    .line 794
    if-ge v9, v10, :cond_25

    .line 795
    .line 796
    invoke-virtual {v5, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v10

    .line 800
    sget-object v11, Lcom/google/android/gms/internal/ads/zzbhe;->zzcH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 801
    .line 802
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 803
    .line 804
    .line 805
    move-result-object v13

    .line 806
    invoke-virtual {v13, v11}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v11

    .line 810
    check-cast v11, Ljava/lang/Boolean;

    .line 811
    .line 812
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 813
    .line 814
    .line 815
    move-result v11

    .line 816
    if-eqz v11, :cond_23

    .line 817
    .line 818
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 819
    .line 820
    .line 821
    move-result v11

    .line 822
    if-nez v11, :cond_24

    .line 823
    .line 824
    :cond_23
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    :cond_24
    add-int/lit8 v9, v9, 0x1

    .line 828
    .line 829
    goto :goto_8

    .line 830
    :cond_25
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzcH:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 831
    .line 832
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 833
    .line 834
    .line 835
    move-result-object v9

    .line 836
    invoke-virtual {v9, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v5

    .line 840
    check-cast v5, Ljava/lang/Boolean;

    .line 841
    .line 842
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 843
    .line 844
    .line 845
    move-result v5

    .line 846
    if-eqz v5, :cond_26

    .line 847
    .line 848
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    if-eqz v5, :cond_26

    .line 853
    .line 854
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 855
    .line 856
    .line 857
    move-result v5

    .line 858
    add-int/lit8 v5, v5, 0x29

    .line 859
    .line 860
    new-instance v8, Ljava/lang/StringBuilder;

    .line 861
    .line 862
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    .line 870
    .line 871
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v4

    .line 875
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    goto/16 :goto_10

    .line 879
    .line 880
    :cond_26
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    new-array v4, v4, [Ljava/lang/String;

    .line 885
    .line 886
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v4

    .line 890
    move-object v8, v4

    .line 891
    check-cast v8, [Ljava/lang/String;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 892
    .line 893
    goto :goto_9

    .line 894
    :catch_5
    const-string v4, "Malformed demuxed URL list for playback: "

    .line 895
    .line 896
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    const/4 v5, 0x1

    .line 904
    new-array v8, v5, [Ljava/lang/String;

    .line 905
    .line 906
    aput-object v3, v8, v12

    .line 907
    .line 908
    :cond_27
    :goto_9
    if-eqz v7, :cond_28

    .line 909
    .line 910
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 911
    .line 912
    .line 913
    move-result v1

    .line 914
    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/ads/zzcge;->zzo(I)V

    .line 915
    .line 916
    .line 917
    :cond_28
    invoke-virtual {v6, v3, v8}, Lcom/google/android/gms/internal/ads/zzcfs;->zzo(Ljava/lang/String;[Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    return-void

    .line 921
    :cond_29
    const-string v4, "touchMove"

    .line 922
    .line 923
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result v4

    .line 927
    if-eqz v4, :cond_2a

    .line 928
    .line 929
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->getContext()Landroid/content/Context;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    const-string v4, "dx"

    .line 934
    .line 935
    invoke-static {v3, v1, v4, v12}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 936
    .line 937
    .line 938
    move-result v4

    .line 939
    const-string v5, "dy"

    .line 940
    .line 941
    invoke-static {v3, v1, v5, v12}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 942
    .line 943
    .line 944
    move-result v1

    .line 945
    int-to-float v3, v4

    .line 946
    int-to-float v1, v1

    .line 947
    invoke-virtual {v6, v3, v1}, Lcom/google/android/gms/internal/ads/zzcfs;->zzp(FF)V

    .line 948
    .line 949
    .line 950
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzchf;->zza:Z

    .line 951
    .line 952
    if-nez v1, :cond_35

    .line 953
    .line 954
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzl()V

    .line 955
    .line 956
    .line 957
    const/4 v5, 0x1

    .line 958
    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzchf;->zza:Z

    .line 959
    .line 960
    return-void

    .line 961
    :cond_2a
    const-string v2, "volume"

    .line 962
    .line 963
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 964
    .line 965
    .line 966
    move-result v4

    .line 967
    if-eqz v4, :cond_2c

    .line 968
    .line 969
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v1

    .line 973
    check-cast v1, Ljava/lang/String;

    .line 974
    .line 975
    if-nez v1, :cond_2b

    .line 976
    .line 977
    const-string v1, "Level parameter missing from volume video GMSG."

    .line 978
    .line 979
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    return-void

    .line 983
    :cond_2b
    :try_start_6
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 984
    .line 985
    .line 986
    move-result v2

    .line 987
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzcfs;->zzw(F)V
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_6

    .line 988
    .line 989
    .line 990
    return-void

    .line 991
    :catch_6
    const-string v2, "Could not parse volume parameter from volume video GMSG: "

    .line 992
    .line 993
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    return-void

    .line 1001
    :cond_2c
    const-string v1, "watermark"

    .line 1002
    .line 1003
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v1

    .line 1007
    if-eqz v1, :cond_2d

    .line 1008
    .line 1009
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcfs;->zzD()V

    .line 1010
    .line 1011
    .line 1012
    return-void

    .line 1013
    :cond_2d
    const-string v1, "Unknown video action: "

    .line 1014
    .line 1015
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    return-void

    .line 1023
    :cond_2e
    :goto_a
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->getContext()Landroid/content/Context;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v3

    .line 1027
    invoke-static {v3, v1, v15, v12}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1028
    .line 1029
    .line 1030
    move-result v13

    .line 1031
    invoke-static {v3, v1, v14, v12}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1032
    .line 1033
    .line 1034
    move-result v14

    .line 1035
    const-string v4, "w"

    .line 1036
    .line 1037
    const/4 v5, -0x1

    .line 1038
    invoke-static {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1039
    .line 1040
    .line 1041
    move-result v4

    .line 1042
    sget-object v7, Lcom/google/android/gms/internal/ads/zzbhe;->zzeK:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 1043
    .line 1044
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v8

    .line 1048
    invoke-virtual {v8, v7}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v8

    .line 1052
    check-cast v8, Ljava/lang/Boolean;

    .line 1053
    .line 1054
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v8

    .line 1058
    const-string v10, "."

    .line 1059
    .line 1060
    if-eqz v8, :cond_30

    .line 1061
    .line 1062
    if-ne v4, v5, :cond_2f

    .line 1063
    .line 1064
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzy()I

    .line 1065
    .line 1066
    .line 1067
    move-result v4

    .line 1068
    :goto_b
    move v15, v4

    .line 1069
    goto :goto_c

    .line 1070
    :cond_2f
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzy()I

    .line 1071
    .line 1072
    .line 1073
    move-result v8

    .line 1074
    invoke-static {v4, v8}, Ljava/lang/Math;->min(II)I

    .line 1075
    .line 1076
    .line 1077
    move-result v4

    .line 1078
    goto :goto_b

    .line 1079
    :cond_30
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    .line 1080
    .line 1081
    .line 1082
    move-result v8

    .line 1083
    if-eqz v8, :cond_31

    .line 1084
    .line 1085
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzy()I

    .line 1086
    .line 1087
    .line 1088
    move-result v8

    .line 1089
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v11

    .line 1093
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 1094
    .line 1095
    .line 1096
    move-result v11

    .line 1097
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v15

    .line 1101
    add-int/lit8 v11, v11, 0x48

    .line 1102
    .line 1103
    const/4 v12, 0x4

    .line 1104
    invoke-static {v15, v11, v12}, Landroidx/emoji2/text/u;->e(Ljava/lang/String;II)I

    .line 1105
    .line 1106
    .line 1107
    move-result v11

    .line 1108
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v12

    .line 1112
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 1113
    .line 1114
    .line 1115
    move-result v12

    .line 1116
    add-int/2addr v12, v11

    .line 1117
    const/16 v17, 0x1

    .line 1118
    .line 1119
    add-int/lit8 v12, v12, 0x1

    .line 1120
    .line 1121
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1122
    .line 1123
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1124
    .line 1125
    .line 1126
    const-string v12, "Calculate width with original width "

    .line 1127
    .line 1128
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1132
    .line 1133
    .line 1134
    const-string v12, ", videoHost.getVideoBoundingWidth() "

    .line 1135
    .line 1136
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    const-string v8, ", x "

    .line 1143
    .line 1144
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1145
    .line 1146
    .line 1147
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v8

    .line 1157
    invoke-static {v8}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    :cond_31
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzy()I

    .line 1161
    .line 1162
    .line 1163
    move-result v8

    .line 1164
    sub-int/2addr v8, v13

    .line 1165
    invoke-static {v4, v8}, Ljava/lang/Math;->min(II)I

    .line 1166
    .line 1167
    .line 1168
    move-result v4

    .line 1169
    goto :goto_b

    .line 1170
    :goto_c
    const-string v4, "h"

    .line 1171
    .line 1172
    invoke-static {v3, v1, v4, v5}, Lcom/google/android/gms/internal/ads/zzchf;->zzb(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;I)I

    .line 1173
    .line 1174
    .line 1175
    move-result v3

    .line 1176
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v4

    .line 1180
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    check-cast v4, Ljava/lang/Boolean;

    .line 1185
    .line 1186
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1187
    .line 1188
    .line 1189
    move-result v4

    .line 1190
    if-eqz v4, :cond_33

    .line 1191
    .line 1192
    if-ne v3, v5, :cond_32

    .line 1193
    .line 1194
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzx()I

    .line 1195
    .line 1196
    .line 1197
    move-result v2

    .line 1198
    :goto_d
    move/from16 v16, v2

    .line 1199
    .line 1200
    goto :goto_e

    .line 1201
    :cond_32
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzx()I

    .line 1202
    .line 1203
    .line 1204
    move-result v2

    .line 1205
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1206
    .line 1207
    .line 1208
    move-result v2

    .line 1209
    goto :goto_d

    .line 1210
    :cond_33
    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v4

    .line 1214
    if-eqz v4, :cond_34

    .line 1215
    .line 1216
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzx()I

    .line 1217
    .line 1218
    .line 1219
    move-result v4

    .line 1220
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v5

    .line 1224
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1225
    .line 1226
    .line 1227
    move-result v5

    .line 1228
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v7

    .line 1232
    add-int/lit8 v5, v5, 0x4b

    .line 1233
    .line 1234
    const/4 v12, 0x4

    .line 1235
    invoke-static {v7, v5, v12}, Landroidx/emoji2/text/u;->e(Ljava/lang/String;II)I

    .line 1236
    .line 1237
    .line 1238
    move-result v5

    .line 1239
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v7

    .line 1243
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1244
    .line 1245
    .line 1246
    move-result v7

    .line 1247
    add-int/2addr v7, v5

    .line 1248
    const/16 v17, 0x1

    .line 1249
    .line 1250
    add-int/lit8 v7, v7, 0x1

    .line 1251
    .line 1252
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1253
    .line 1254
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1255
    .line 1256
    .line 1257
    const-string v7, "Calculate height with original height "

    .line 1258
    .line 1259
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    .line 1265
    const-string v7, ", videoHost.getVideoBoundingHeight() "

    .line 1266
    .line 1267
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1271
    .line 1272
    .line 1273
    const-string v4, ", y "

    .line 1274
    .line 1275
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v4

    .line 1288
    invoke-static {v4}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    :cond_34
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzcge;->zzx()I

    .line 1292
    .line 1293
    .line 1294
    move-result v2

    .line 1295
    sub-int/2addr v2, v14

    .line 1296
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1297
    .line 1298
    .line 1299
    move-result v2

    .line 1300
    goto :goto_d

    .line 1301
    :goto_e
    :try_start_7
    const-string v2, "player"

    .line 1302
    .line 1303
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    check-cast v2, Ljava/lang/String;

    .line 1308
    .line 1309
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1310
    .line 1311
    .line 1312
    move-result v12
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    .line 1313
    move/from16 v17, v12

    .line 1314
    .line 1315
    goto :goto_f

    .line 1316
    :catch_7
    const/16 v17, 0x0

    .line 1317
    .line 1318
    :goto_f
    const-string v2, "spherical"

    .line 1319
    .line 1320
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, Ljava/lang/String;

    .line 1325
    .line 1326
    invoke-static {v2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1327
    .line 1328
    .line 1329
    move-result v18

    .line 1330
    if-eqz v9, :cond_36

    .line 1331
    .line 1332
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzcft;->zzd()Lcom/google/android/gms/internal/ads/zzcfs;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    if-nez v2, :cond_36

    .line 1337
    .line 1338
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcgd;

    .line 1339
    .line 1340
    const-string v3, "flags"

    .line 1341
    .line 1342
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    check-cast v3, Ljava/lang/String;

    .line 1347
    .line 1348
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzcgd;-><init>(Ljava/lang/String;)V

    .line 1349
    .line 1350
    .line 1351
    move-object/from16 v19, v2

    .line 1352
    .line 1353
    move-object v12, v6

    .line 1354
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/gms/internal/ads/zzcft;->zzc(IIIIIZLcom/google/android/gms/internal/ads/zzcgd;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzcft;->zzd()Lcom/google/android/gms/internal/ads/zzcfs;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v2

    .line 1361
    if-eqz v2, :cond_35

    .line 1362
    .line 1363
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzchf;->zzc(Lcom/google/android/gms/internal/ads/zzcfs;Ljava/util/Map;)V

    .line 1364
    .line 1365
    .line 1366
    :cond_35
    :goto_10
    return-void

    .line 1367
    :cond_36
    move-object v12, v6

    .line 1368
    move/from16 v2, v16

    .line 1369
    .line 1370
    invoke-virtual {v12, v13, v14, v15, v2}, Lcom/google/android/gms/internal/ads/zzcft;->zzb(IIII)V

    .line 1371
    .line 1372
    .line 1373
    return-void
.end method
