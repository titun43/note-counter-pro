.class public final Lcom/google/android/gms/internal/ads/zzear;
.super Lcom/google/android/gms/internal/ads/zzfyq;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/hardware/SensorManager;

.field private final zzb:Landroid/hardware/Sensor;

.field private zzc:F

.field private zzd:Ljava/lang/Float;

.field private zze:J

.field private zzf:I

.field private zzg:Z

.field private zzh:Z

.field private zzi:Lcom/google/android/gms/internal/ads/zzeaq;

.field private zzj:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "FlickDetector"

    .line 2
    .line 3
    const-string v1, "ads"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzfyq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 16
    .line 17
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lx2/c;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zze:J

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzf:I

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzg:Z

    .line 36
    .line 37
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzh:Z

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzi:Lcom/google/android/gms/internal/ads/zzeaq;

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzj:Z

    .line 43
    .line 44
    const-string v0, "sensor"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Landroid/hardware/SensorManager;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zza:Landroid/hardware/SensorManager;

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const/4 v0, 0x4

    .line 57
    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzb:Landroid/hardware/Sensor;

    .line 62
    .line 63
    return-void

    .line 64
    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzb:Landroid/hardware/Sensor;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzeaq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzi:Lcom/google/android/gms/internal/ads/zzeaq;

    return-void
.end method

.method public final zzb()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzkz:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    monitor-exit p0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzj:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zza:Landroid/hardware/SensorManager;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzb:Landroid/hardware/Sensor;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzj:Z

    .line 42
    .line 43
    const-string v0, "Listening for flick gestures."

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zza:Landroid/hardware/SensorManager;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzb:Landroid/hardware/Sensor;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    return-void

    .line 59
    :cond_3
    :goto_0
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 60
    .line 61
    const-string v0, "Flick detection failed to initialize. Failed to obtain gyroscope."

    .line 62
    .line 63
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v0
.end method

.method public final zzc()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzj:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zza:Landroid/hardware/SensorManager;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzb:Landroid/hardware/Sensor;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzj:Z

    .line 19
    .line 20
    const-string v0, "Stopped listening for flick gestures."

    .line 21
    .line 22
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw v0
.end method

.method public final zzd(Landroid/hardware/SensorEvent;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzkz:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lx2/c;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzear;->zze:J

    .line 35
    .line 36
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbhe;->zzkB:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 37
    .line 38
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    int-to-long v4, v4

    .line 53
    add-long/2addr v2, v4

    .line 54
    cmp-long v2, v2, v0

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    if-gez v2, :cond_1

    .line 58
    .line 59
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzear;->zzf:I

    .line 60
    .line 61
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zze:J

    .line 62
    .line 63
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzear;->zzg:Z

    .line 64
    .line 65
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzear;->zzh:Z

    .line 66
    .line 67
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 74
    .line 75
    :cond_1
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    aget p1, p1, v2

    .line 79
    .line 80
    const/high16 v4, 0x40800000    # 4.0f

    .line 81
    .line 82
    mul-float/2addr p1, v4

    .line 83
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    add-float/2addr v4, p1

    .line 90
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 101
    .line 102
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbhe;->zzkA:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 103
    .line 104
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Ljava/lang/Float;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    add-float/2addr v6, v4

    .line 119
    cmpl-float p1, p1, v6

    .line 120
    .line 121
    if-lez p1, :cond_2

    .line 122
    .line 123
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 130
    .line 131
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzear;->zzh:Z

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 141
    .line 142
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Ljava/lang/Float;

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    sub-float/2addr v4, v5

    .line 157
    cmpg-float p1, p1, v4

    .line 158
    .line 159
    if-gez p1, :cond_3

    .line 160
    .line 161
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 168
    .line 169
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzear;->zzg:Z

    .line 170
    .line 171
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Float;->isInfinite()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_4

    .line 178
    .line 179
    const/4 p1, 0x0

    .line 180
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzear;->zzd:Ljava/lang/Float;

    .line 185
    .line 186
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzc:F

    .line 187
    .line 188
    :cond_4
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzg:Z

    .line 189
    .line 190
    if-eqz p1, :cond_5

    .line 191
    .line 192
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzh:Z

    .line 193
    .line 194
    if-eqz p1, :cond_5

    .line 195
    .line 196
    const-string p1, "Flick detected."

    .line 197
    .line 198
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zze:J

    .line 202
    .line 203
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzf:I

    .line 204
    .line 205
    add-int/2addr p1, v2

    .line 206
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzear;->zzf:I

    .line 207
    .line 208
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzear;->zzg:Z

    .line 209
    .line 210
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzear;->zzh:Z

    .line 211
    .line 212
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzear;->zzi:Lcom/google/android/gms/internal/ads/zzeaq;

    .line 213
    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzkC:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 217
    .line 218
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-ne p1, v1, :cond_5

    .line 233
    .line 234
    new-instance p1, Lcom/google/android/gms/internal/ads/zzebd;

    .line 235
    .line 236
    check-cast v0, Lcom/google/android/gms/internal/ads/zzebf;

    .line 237
    .line 238
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzebd;-><init>(Lcom/google/android/gms/internal/ads/zzebf;)V

    .line 239
    .line 240
    .line 241
    sget-object v1, Lcom/google/android/gms/internal/ads/zzebe;->zzc:Lcom/google/android/gms/internal/ads/zzebe;

    .line 242
    .line 243
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzebf;->zzo(Lcom/google/android/gms/ads/internal/client/zzdn;Lcom/google/android/gms/internal/ads/zzebe;)V

    .line 244
    .line 245
    .line 246
    :cond_5
    :goto_1
    return-void
.end method
