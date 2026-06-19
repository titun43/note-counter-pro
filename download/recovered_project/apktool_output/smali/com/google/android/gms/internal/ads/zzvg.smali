.class public final Lcom/google/android/gms/internal/ads/zzvg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzvg;->zzb:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzun;
    .locals 3

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzvg;->zzb(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/google/android/gms/internal/ads/zzun;

    .line 21
    .line 22
    return-object v0
.end method

.method public static declared-synchronized zzb(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 13

    .line 1
    const-class v1, Lcom/google/android/gms/internal/ads/zzvg;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzux;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzux;-><init>(Ljava/lang/String;ZZ)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lcom/google/android/gms/internal/ads/zzvg;->zzb:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-object v3

    .line 21
    :cond_0
    :try_start_1
    const-string v3, "video/mv-hevc"

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, Lcom/google/android/gms/internal/ads/zzvb;

    .line 28
    .line 29
    invoke-direct {v4, p1, p2, v3}, Lcom/google/android/gms/internal/ads/zzvb;-><init>(ZZZ)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/ads/zzvg;->zzh(Lcom/google/android/gms/internal/ads/zzux;Lcom/google/android/gms/internal/ads/zzuz;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_1
    :goto_0
    const-string p1, "audio/raw"

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 p1, 0x1

    .line 53
    const/4 v3, 0x0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v4, 0x1a

    .line 59
    .line 60
    if-ge p0, v4, :cond_2

    .line 61
    .line 62
    sget-object p0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 63
    .line 64
    const-string v4, "R9"

    .line 65
    .line 66
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_2

    .line 71
    .line 72
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-ne p0, p1, :cond_2

    .line 77
    .line 78
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lcom/google/android/gms/internal/ads/zzun;

    .line 83
    .line 84
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzun;->zza:Ljava/lang/String;

    .line 85
    .line 86
    const-string v4, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 87
    .line 88
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    const-string v4, "OMX.google.raw.decoder"

    .line 95
    .line 96
    const-string v5, "audio/raw"

    .line 97
    .line 98
    const-string v6, "audio/raw"

    .line 99
    .line 100
    const/4 v11, 0x0

    .line 101
    const/4 v12, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v8, 0x0

    .line 104
    const/4 v9, 0x1

    .line 105
    const/4 v10, 0x0

    .line 106
    invoke-static/range {v4 .. v12}, Lcom/google/android/gms/internal/ads/zzun;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzun;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzvc;->zza:Lcom/google/android/gms/internal/ads/zzvc;

    .line 114
    .line 115
    invoke-static {p2, p0}, Lcom/google/android/gms/internal/ads/zzvg;->zzj(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzvf;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    const/16 v4, 0x20

    .line 121
    .line 122
    if-ge p0, v4, :cond_4

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-le p0, p1, :cond_4

    .line 129
    .line 130
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Lcom/google/android/gms/internal/ads/zzun;

    .line 135
    .line 136
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzun;->zza:Ljava/lang/String;

    .line 137
    .line 138
    const-string p1, "OMX.qti.audio.decoder.flac"

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_4

    .line 145
    .line 146
    invoke-interface {p2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Lcom/google/android/gms/internal/ads/zzun;

    .line 151
    .line 152
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzguf;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    .line 161
    .line 162
    monitor-exit v1

    .line 163
    return-object p0

    .line 164
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    throw p0
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {p0, v0, p2, p3}, Lcom/google/android/gms/internal/ads/zzuw;->zza(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzvg;->zzd(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget p1, Lcom/google/android/gms/internal/ads/zzguf;->zzd:I

    .line 12
    .line 13
    new-instance p1, Lcom/google/android/gms/internal/ads/zzguc;

    .line 14
    .line 15
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzguc;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzguc;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzguc;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzguc;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzguc;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static zzd(Lcom/google/android/gms/internal/ads/zzuw;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzvg;->zzg(Lcom/google/android/gms/internal/ads/zzv;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzguf;->zzi()Lcom/google/android/gms/internal/ads/zzguf;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzuw;->zza(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static zze(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzv;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lcom/google/android/gms/internal/ads/zzve;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzve;-><init>(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzvg;->zzj(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzvf;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static zzf(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;
    .locals 1

    .line 1
    new-instance v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p0, v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 7
    .line 8
    iput p1, v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 9
    .line 10
    return-object v0
.end method

.method public static zzg(Lcom/google/android/gms/internal/ads/zzv;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzv;->zzo:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string p0, "audio/eac3"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v1, "video/dolby-vision"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdo;->zzd(Lcom/google/android/gms/internal/ads/zzv;)Landroid/util/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_4

    .line 27
    .line 28
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const/16 v1, 0x10

    .line 37
    .line 38
    if-eq p0, v1, :cond_5

    .line 39
    .line 40
    const/16 v1, 0x100

    .line 41
    .line 42
    if-ne p0, v1, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v1, 0x200

    .line 46
    .line 47
    if-ne p0, v1, :cond_2

    .line 48
    .line 49
    const-string p0, "video/avc"

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    const/16 v1, 0x400

    .line 53
    .line 54
    if-eq p0, v1, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const-string p0, "video/av01"

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_4
    :goto_0
    const-string p0, "video/mv-hevc"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_5

    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0

    .line 70
    :cond_5
    :goto_1
    const-string p0, "video/hevc"

    .line 71
    .line 72
    return-object p0
.end method

.method private static zzh(Lcom/google/android/gms/internal/ads/zzux;Lcom/google/android/gms/internal/ads/zzuz;)Ljava/util/ArrayList;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "secure-playback"

    .line 6
    .line 7
    const-string v3, "tunneled-playback"

    .line 8
    .line 9
    const-string v4, ")"

    .line 10
    .line 11
    const-string v5, " ("

    .line 12
    .line 13
    const-string v6, "Failed to query codec "

    .line 14
    .line 15
    :try_start_0
    new-instance v8, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzux;->zza:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzuz;->zza()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzuz;->zzc()Z

    .line 27
    .line 28
    .line 29
    move-result v18

    .line 30
    const/16 v19, 0x0

    .line 31
    .line 32
    move/from16 v11, v19

    .line 33
    .line 34
    :goto_0
    if-ge v11, v9, :cond_1a

    .line 35
    .line 36
    invoke-interface {v1, v11}, Lcom/google/android/gms/internal/ads/zzuz;->zzb(I)Landroid/media/MediaCodecInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v14, 0x1d

    .line 43
    .line 44
    if-lt v13, v14, :cond_0

    .line 45
    .line 46
    invoke-static {v12}, Landroidx/lifecycle/g0;->u(Landroid/media/MediaCodecInfo;)Z

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    if-eqz v13, :cond_0

    .line 51
    .line 52
    move-object/from16 v21, v2

    .line 53
    .line 54
    move-object/from16 v22, v3

    .line 55
    .line 56
    move v0, v9

    .line 57
    move v1, v11

    .line 58
    goto/16 :goto_d

    .line 59
    .line 60
    :cond_0
    move v13, v9

    .line 61
    goto :goto_1

    .line 62
    :catch_0
    move-exception v0

    .line 63
    goto/16 :goto_e

    .line 64
    .line 65
    :goto_1
    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 70
    .line 71
    .line 72
    move-result v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    if-nez v15, :cond_1

    .line 74
    .line 75
    const-string v15, ".secure"

    .line 76
    .line 77
    if-nez v18, :cond_2

    .line 78
    .line 79
    :try_start_1
    invoke-virtual {v9, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v16

    .line 83
    if-nez v16, :cond_1

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_1
    move-object/from16 v21, v2

    .line 87
    .line 88
    move-object/from16 v22, v3

    .line 89
    .line 90
    :goto_2
    move v1, v11

    .line 91
    move v0, v13

    .line 92
    goto/16 :goto_d

    .line 93
    .line 94
    :cond_2
    :goto_3
    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    array-length v14, v7

    .line 99
    move-object/from16 v17, v7

    .line 100
    .line 101
    move/from16 v7, v19

    .line 102
    .line 103
    :goto_4
    if-ge v7, v14, :cond_4

    .line 104
    .line 105
    move/from16 v20, v7

    .line 106
    .line 107
    aget-object v7, v17, v20

    .line 108
    .line 109
    invoke-virtual {v7, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v21

    .line 113
    if-eqz v21, :cond_3

    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_3
    add-int/lit8 v7, v20, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_4
    const-string v7, "video/dolby-vision"

    .line 121
    .line 122
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-eqz v7, :cond_8

    .line 127
    .line 128
    const-string v7, "OMX.MS.HEVCDV.Decoder"

    .line 129
    .line 130
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_5

    .line 135
    .line 136
    const-string v7, "video/hevcdv"

    .line 137
    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_5
    const-string v7, "OMX.RTK.video.decoder"

    .line 141
    .line 142
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-nez v7, :cond_7

    .line 147
    .line 148
    const-string v7, "OMX.realtek.video.decoder.tunneled"

    .line 149
    .line 150
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_6
    const/4 v7, 0x0

    .line 158
    goto :goto_6

    .line 159
    :cond_7
    :goto_5
    const-string v7, "video/dv_hevc"

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_8
    const-string v7, "video/mv-hevc"

    .line 163
    .line 164
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_a

    .line 169
    .line 170
    const-string v7, "c2.qti.mvhevc.decoder"

    .line 171
    .line 172
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-nez v7, :cond_9

    .line 177
    .line 178
    const-string v7, "c2.qti.mvhevc.decoder.secure"

    .line 179
    .line 180
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-eqz v7, :cond_6

    .line 185
    .line 186
    :cond_9
    const-string v7, "video/x-mvhevc"

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_a
    const-string v7, "audio/alac"

    .line 190
    .line 191
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_b

    .line 196
    .line 197
    const-string v7, "OMX.lge.alac.decoder"

    .line 198
    .line 199
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-eqz v7, :cond_b

    .line 204
    .line 205
    const-string v7, "audio/x-lg-alac"

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_b
    const-string v7, "audio/flac"

    .line 209
    .line 210
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_c

    .line 215
    .line 216
    const-string v7, "OMX.lge.flac.decoder"

    .line 217
    .line 218
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eqz v7, :cond_c

    .line 223
    .line 224
    const-string v7, "audio/x-lg-flac"

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_c
    const-string v7, "audio/ac3"

    .line 228
    .line 229
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    if-eqz v7, :cond_6

    .line 234
    .line 235
    const-string v7, "OMX.lge.ac3.decoder"

    .line 236
    .line 237
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_6

    .line 242
    .line 243
    const-string v7, "audio/lg-ac3"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 244
    .line 245
    :goto_6
    if-eqz v7, :cond_1

    .line 246
    .line 247
    const/16 v20, 0x1

    .line 248
    .line 249
    :try_start_2
    invoke-virtual {v12, v7}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 250
    .line 251
    .line 252
    move-result-object v14

    .line 253
    invoke-interface {v1, v3, v7, v14}, Lcom/google/android/gms/internal/ads/zzuz;->zzd(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 254
    .line 255
    .line 256
    move-result v17

    .line 257
    invoke-interface {v1, v3, v7, v14}, Lcom/google/android/gms/internal/ads/zzuz;->zze(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 258
    .line 259
    .line 260
    move-result v21

    .line 261
    move-object/from16 v22, v3

    .line 262
    .line 263
    iget-boolean v3, v0, Lcom/google/android/gms/internal/ads/zzux;->zzc:Z

    .line 264
    .line 265
    if-nez v3, :cond_e

    .line 266
    .line 267
    if-nez v21, :cond_d

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_d
    :goto_7
    move-object/from16 v21, v2

    .line 271
    .line 272
    goto/16 :goto_2

    .line 273
    .line 274
    :cond_e
    if-nez v17, :cond_f

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_f
    :goto_8
    invoke-interface {v1, v2, v7, v14}, Lcom/google/android/gms/internal/ads/zzuz;->zzd(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-interface {v1, v2, v7, v14}, Lcom/google/android/gms/internal/ads/zzuz;->zze(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 282
    .line 283
    .line 284
    move-result v17

    .line 285
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzux;->zzb:Z

    .line 286
    .line 287
    if-nez v1, :cond_10

    .line 288
    .line 289
    if-nez v17, :cond_d

    .line 290
    .line 291
    :cond_10
    if-eqz v1, :cond_11

    .line 292
    .line 293
    if-eqz v3, :cond_d

    .line 294
    .line 295
    move/from16 v3, v20

    .line 296
    .line 297
    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 298
    .line 299
    move-object/from16 v21, v2

    .line 300
    .line 301
    const/16 v2, 0x1d

    .line 302
    .line 303
    if-lt v0, v2, :cond_12

    .line 304
    .line 305
    invoke-static {v12}, Landroidx/lifecycle/g0;->y(Landroid/media/MediaCodecInfo;)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    move-object/from16 v17, v14

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :catch_1
    move-exception v0

    .line 313
    move-object v11, v7

    .line 314
    :goto_9
    move-object v7, v9

    .line 315
    goto/16 :goto_c

    .line 316
    .line 317
    :cond_12
    invoke-static {v12, v10}, Lcom/google/android/gms/internal/ads/zzvg;->zzi(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    move-object/from16 v17, v14

    .line 322
    .line 323
    if-nez v2, :cond_13

    .line 324
    .line 325
    move/from16 v2, v20

    .line 326
    .line 327
    goto :goto_a

    .line 328
    :cond_13
    move/from16 v2, v19

    .line 329
    .line 330
    :goto_a
    invoke-static {v12, v10}, Lcom/google/android/gms/internal/ads/zzvg;->zzi(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v14

    .line 334
    move/from16 v23, v2

    .line 335
    .line 336
    const/16 v2, 0x1d

    .line 337
    .line 338
    if-lt v0, v2, :cond_14

    .line 339
    .line 340
    invoke-static {v12}, Landroidx/lifecycle/g0;->A(Landroid/media/MediaCodecInfo;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    goto :goto_b

    .line 345
    :cond_14
    invoke-virtual {v12}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgql;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    const-string v2, "omx.google."

    .line 354
    .line 355
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    if-nez v2, :cond_15

    .line 360
    .line 361
    const-string v2, "c2.android."

    .line 362
    .line 363
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-nez v2, :cond_15

    .line 368
    .line 369
    const-string v2, "c2.google."

    .line 370
    .line 371
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 372
    .line 373
    .line 374
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 375
    if-nez v0, :cond_15

    .line 376
    .line 377
    move/from16 v0, v20

    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_15
    move/from16 v0, v19

    .line 381
    .line 382
    :goto_b
    if-eqz v18, :cond_16

    .line 383
    .line 384
    if-eq v1, v3, :cond_17

    .line 385
    .line 386
    move/from16 v3, v20

    .line 387
    .line 388
    :cond_16
    if-nez v18, :cond_18

    .line 389
    .line 390
    if-nez v1, :cond_18

    .line 391
    .line 392
    :cond_17
    const/16 v16, 0x0

    .line 393
    .line 394
    move-object/from16 v12, v17

    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    move v15, v0

    .line 399
    move v1, v11

    .line 400
    move v0, v13

    .line 401
    move/from16 v13, v23

    .line 402
    .line 403
    move-object v11, v7

    .line 404
    :try_start_3
    invoke-static/range {v9 .. v17}, Lcom/google/android/gms/internal/ads/zzun;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzun;

    .line 405
    .line 406
    .line 407
    move-result-object v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 408
    move-object v7, v9

    .line 409
    :try_start_4
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_d

    .line 413
    :catch_2
    move-exception v0

    .line 414
    goto :goto_c

    .line 415
    :catch_3
    move-exception v0

    .line 416
    goto :goto_9

    .line 417
    :cond_18
    move v2, v0

    .line 418
    move v1, v11

    .line 419
    move v0, v13

    .line 420
    move-object/from16 v12, v17

    .line 421
    .line 422
    move/from16 v13, v23

    .line 423
    .line 424
    move-object v11, v7

    .line 425
    move-object v7, v9

    .line 426
    if-nez v18, :cond_19

    .line 427
    .line 428
    if-eqz v3, :cond_19

    .line 429
    .line 430
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    add-int/lit8 v0, v0, 0x7

    .line 439
    .line 440
    new-instance v1, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    const/16 v16, 0x0

    .line 456
    .line 457
    const/16 v17, 0x1

    .line 458
    .line 459
    move v15, v2

    .line 460
    invoke-static/range {v9 .. v17}, Lcom/google/android/gms/internal/ads/zzun;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzun;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 465
    .line 466
    .line 467
    return-object v8

    .line 468
    :goto_c
    :try_start_5
    const-string v1, "MediaCodecUtil"

    .line 469
    .line 470
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    add-int/lit8 v2, v2, 0x18

    .line 479
    .line 480
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 481
    .line 482
    .line 483
    move-result v3

    .line 484
    add-int/2addr v2, v3

    .line 485
    add-int/lit8 v2, v2, 0x1

    .line 486
    .line 487
    new-instance v3, Ljava/lang/StringBuilder;

    .line 488
    .line 489
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzee;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 515
    :cond_19
    :goto_d
    add-int/lit8 v11, v1, 0x1

    .line 516
    .line 517
    move-object/from16 v1, p1

    .line 518
    .line 519
    move v9, v0

    .line 520
    move-object/from16 v2, v21

    .line 521
    .line 522
    move-object/from16 v3, v22

    .line 523
    .line 524
    move-object/from16 v0, p0

    .line 525
    .line 526
    goto/16 :goto_0

    .line 527
    .line 528
    :cond_1a
    return-object v8

    .line 529
    :goto_e
    new-instance v1, Lcom/google/android/gms/internal/ads/zzuy;

    .line 530
    .line 531
    const/4 v2, 0x0

    .line 532
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzuy;-><init>(Ljava/lang/Throwable;[B)V

    .line 533
    .line 534
    .line 535
    throw v1
.end method

.method private static zzi(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroidx/lifecycle/g0;->C(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzas;->zza(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgql;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "arc."

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p1, "omx.google."

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    const-string p1, "omx.ffmpeg."

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    const-string p1, "omx.sec."

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const-string p1, ".sw."

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    const-string p1, "c2.android."

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    const-string p1, "c2.google."

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    const-string p1, "omx."

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    const-string p1, "c2."

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 110
    return p0

    .line 111
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 112
    return p0
.end method

.method private static zzj(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzvf;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvd;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzvd;-><init>(Lcom/google/android/gms/internal/ads/zzvf;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
