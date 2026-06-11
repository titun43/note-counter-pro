.class public final Lcom/google/android/gms/internal/ads/zzeci;
.super Lcom/google/android/gms/internal/ads/zzfyq;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private zzb:Landroid/hardware/SensorManager;

.field private zzc:Landroid/hardware/Sensor;

.field private zzd:J

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/ads/zzech;

.field private zzg:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "ShakeDetector"

    .line 2
    .line 3
    const-string v1, "ads"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzfyq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeci;->zza:Landroid/content/Context;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzech;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzf:Lcom/google/android/gms/internal/ads/zzech;

    return-void
.end method

.method public final zzb()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzku:Lcom/google/android/gms/internal/ads/zzbgv;

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
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzb:Landroid/hardware/SensorManager;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zza:Landroid/content/Context;

    .line 30
    .line 31
    const-string v2, "sensor"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/hardware/SensorManager;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzb:Landroid/hardware/SensorManager;

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const-string v0, "Shake detection failed to initialize. Failed to obtain accelerometer."

    .line 44
    .line 45
    sget v1, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 46
    .line 47
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-void

    .line 52
    :cond_1
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzc:Landroid/hardware/Sensor;

    .line 57
    .line 58
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzg:Z

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzb:Landroid/hardware/SensorManager;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzc:Landroid/hardware/Sensor;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    const/4 v3, 0x2

    .line 71
    invoke-virtual {v0, p0, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lx2/c;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 84
    .line 85
    .line 86
    move-result-wide v2

    .line 87
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzkw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 88
    .line 89
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    int-to-long v4, v0

    .line 104
    sub-long/2addr v2, v4

    .line 105
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzd:J

    .line 106
    .line 107
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzg:Z

    .line 108
    .line 109
    const-string v0, "Listening for shake gestures."

    .line 110
    .line 111
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    monitor-exit p0

    .line 115
    return-void

    .line 116
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    throw v0
.end method

.method public final zzc()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzg:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzb:Landroid/hardware/SensorManager;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzc:Landroid/hardware/Sensor;

    .line 11
    .line 12
    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "Stopped listening for shake gestures."

    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzg:Z

    .line 25
    .line 26
    :cond_1
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v0
.end method

.method public final zzd(Landroid/hardware/SensorEvent;)V
    .locals 9

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzku:Lcom/google/android/gms/internal/ads/zzbgv;

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
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_0
    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    aget v1, p1, v0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    aget v3, p1, v2

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    aget p1, p1, v4

    .line 31
    .line 32
    const v4, 0x411ce80a

    .line 33
    .line 34
    .line 35
    div-float/2addr v1, v4

    .line 36
    div-float/2addr v3, v4

    .line 37
    div-float/2addr p1, v4

    .line 38
    mul-float/2addr v1, v1

    .line 39
    mul-float/2addr v3, v3

    .line 40
    add-float/2addr v3, v1

    .line 41
    mul-float/2addr p1, p1

    .line 42
    add-float/2addr p1, v3

    .line 43
    float-to-double v3, p1

    .line 44
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    double-to-float p1, v3

    .line 49
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzkv:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 50
    .line 51
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/lang/Float;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    cmpg-float p1, p1, v1

    .line 66
    .line 67
    if-ltz p1, :cond_2

    .line 68
    .line 69
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzk()Lx2/b;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Lx2/c;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzd:J

    .line 83
    .line 84
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zzkw:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 85
    .line 86
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    int-to-long v7, p1

    .line 101
    add-long/2addr v5, v7

    .line 102
    cmp-long p1, v5, v3

    .line 103
    .line 104
    if-gtz p1, :cond_2

    .line 105
    .line 106
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzd:J

    .line 107
    .line 108
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbhe;->zzkx:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 109
    .line 110
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Ljava/lang/Integer;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    int-to-long v7, p1

    .line 125
    add-long/2addr v5, v7

    .line 126
    cmp-long p1, v5, v3

    .line 127
    .line 128
    if-gez p1, :cond_1

    .line 129
    .line 130
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zze:I

    .line 131
    .line 132
    :cond_1
    const-string p1, "Shake detected."

    .line 133
    .line 134
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzd:J

    .line 138
    .line 139
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzeci;->zze:I

    .line 140
    .line 141
    add-int/2addr p1, v2

    .line 142
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzeci;->zze:I

    .line 143
    .line 144
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeci;->zzf:Lcom/google/android/gms/internal/ads/zzech;

    .line 145
    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbhe;->zzky:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 149
    .line 150
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Ljava/lang/Integer;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-ne p1, v1, :cond_2

    .line 165
    .line 166
    new-instance p1, Lcom/google/android/gms/internal/ads/zzebc;

    .line 167
    .line 168
    check-cast v0, Lcom/google/android/gms/internal/ads/zzebf;

    .line 169
    .line 170
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzebc;-><init>(Lcom/google/android/gms/internal/ads/zzebf;)V

    .line 171
    .line 172
    .line 173
    sget-object v1, Lcom/google/android/gms/internal/ads/zzebe;->zzc:Lcom/google/android/gms/internal/ads/zzebe;

    .line 174
    .line 175
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzebf;->zzo(Lcom/google/android/gms/ads/internal/client/zzdn;Lcom/google/android/gms/internal/ads/zzebe;)V

    .line 176
    .line 177
    .line 178
    :cond_2
    :goto_0
    return-void
.end method
