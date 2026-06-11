.class public final Lcom/google/android/gms/internal/ads/zzcbz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcce;


# static fields
.field public static final synthetic zzb:I

.field private static final zzc:Ljava/util/List;


# instance fields
.field zza:Z

.field private final zzd:Lcom/google/android/gms/internal/ads/zzifv;

.field private final zze:Ljava/util/LinkedHashMap;

.field private final zzf:Ljava/util/List;

.field private final zzg:Ljava/util/List;

.field private final zzh:Landroid/content/Context;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzccb;

.field private final zzj:Ljava/lang/Object;

.field private zzk:Ljava/util/HashSet;

.field private zzl:Z

.field private zzm:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/google/android/gms/internal/ads/zzcbz;->zzc:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ads/zzccb;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcca;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p5, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzf:Ljava/util/List;

    .line 10
    .line 11
    new-instance p5, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzg:Ljava/util/List;

    .line 17
    .line 18
    new-instance p5, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance p5, Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-direct {p5}, Ljava/util/HashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzk:Ljava/util/HashSet;

    .line 31
    .line 32
    const/4 p5, 0x0

    .line 33
    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzl:Z

    .line 34
    .line 35
    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzm:Z

    .line 36
    .line 37
    const-string p5, "SafeBrowsing config is not present."

    .line 38
    .line 39
    invoke-static {p3, p5}, Lcom/google/android/gms/common/internal/b0;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p5

    .line 46
    if-eqz p5, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzh:Landroid/content/Context;

    .line 53
    .line 54
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zze:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 62
    .line 63
    iget-object p1, p3, Lcom/google/android/gms/internal/ads/zzccb;->zze:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    if-eqz p3, :cond_1

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    check-cast p3, Ljava/lang/String;

    .line 80
    .line 81
    iget-object p5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzk:Ljava/util/HashSet;

    .line 82
    .line 83
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 84
    .line 85
    invoke-virtual {p3, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {p5, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzk:Ljava/util/HashSet;

    .line 94
    .line 95
    const-string p3, "cookie"

    .line 96
    .line 97
    sget-object p5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 98
    .line 99
    invoke-virtual {p3, p5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p3

    .line 103
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihz;->zzg()Lcom/google/android/gms/internal/ads/zzifv;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/16 p3, 0x9

    .line 111
    .line 112
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzifv;->zzn(I)Lcom/google/android/gms/internal/ads/zzifv;

    .line 113
    .line 114
    .line 115
    if-eqz p4, :cond_2

    .line 116
    .line 117
    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/ads/zzifv;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p4}, Lcom/google/android/gms/internal/ads/zzifv;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzifx;->zzc()Lcom/google/android/gms/internal/ads/zzifw;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 128
    .line 129
    iget-object p4, p4, Lcom/google/android/gms/internal/ads/zzccb;->zza:Ljava/lang/String;

    .line 130
    .line 131
    if-eqz p4, :cond_3

    .line 132
    .line 133
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/ads/zzifw;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzifw;

    .line 134
    .line 135
    .line 136
    :cond_3
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    check-cast p3, Lcom/google/android/gms/internal/ads/zzifx;

    .line 141
    .line 142
    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/ads/zzifv;->zzd(Lcom/google/android/gms/internal/ads/zzifx;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihm;->zzc()Lcom/google/android/gms/internal/ads/zzihl;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzh:Landroid/content/Context;

    .line 150
    .line 151
    invoke-static {p4}, Lz2/c;->a(Landroid/content/Context;)Lf2/k;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    invoke-virtual {p4}, Lf2/k;->d()Z

    .line 156
    .line 157
    .line 158
    move-result p4

    .line 159
    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/ads/zzihl;->zzc(Z)Lcom/google/android/gms/internal/ads/zzihl;

    .line 160
    .line 161
    .line 162
    iget-object p2, p2, Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;->afmaVersion:Ljava/lang/String;

    .line 163
    .line 164
    if-eqz p2, :cond_4

    .line 165
    .line 166
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzihl;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzihl;

    .line 167
    .line 168
    .line 169
    :cond_4
    sget-object p2, Lt2/f;->b:Lt2/f;

    .line 170
    .line 171
    iget-object p4, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzh:Landroid/content/Context;

    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-static {p4}, Lt2/f;->a(Landroid/content/Context;)I

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    int-to-long p4, p2

    .line 181
    const-wide/16 v0, 0x0

    .line 182
    .line 183
    cmp-long p2, p4, v0

    .line 184
    .line 185
    if-lez p2, :cond_5

    .line 186
    .line 187
    invoke-virtual {p3, p4, p5}, Lcom/google/android/gms/internal/ads/zzihl;->zzb(J)Lcom/google/android/gms/internal/ads/zzihl;

    .line 188
    .line 189
    .line 190
    :cond_5
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Lcom/google/android/gms/internal/ads/zzihm;

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzifv;->zzk(Lcom/google/android/gms/internal/ads/zzihm;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 197
    .line 198
    .line 199
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 200
    .line 201
    return-void
.end method

.method public static synthetic zzi()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcbz;->zzc:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzccb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    return-object v0
.end method

.method public final zzb(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzifv;->zzi()Lcom/google/android/gms/internal/ads/zzifv;

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzifv;->zzh(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 17
    .line 18
    .line 19
    :goto_0
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p1
.end method

.method public final zzc()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzccb;->zzc:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzl:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzd(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzccb;->zzc:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_7

    .line 8
    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzl:Z

    .line 10
    .line 11
    if-nez v0, :cond_7

    .line 12
    .line 13
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzc()Lcom/google/android/gms/ads/internal/util/zzs;

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    goto/16 :goto_6

    .line 21
    .line 22
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->isDrawingCacheEnabled()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-static {v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    goto :goto_0

    .line 40
    :catch_0
    move-exception v2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v3, v1

    .line 43
    :goto_0
    :try_start_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :catch_1
    move-exception v2

    .line 48
    goto :goto_2

    .line 49
    :goto_1
    move-object v3, v1

    .line 50
    :goto_2
    sget v4, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 51
    .line 52
    const-string v4, "Fail to capture the web view"

    .line 53
    .line 54
    invoke-static {v4, v2}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :goto_3
    if-nez v3, :cond_5

    .line 58
    .line 59
    :try_start_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    sget-object v6, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 81
    .line 82
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    new-instance v5, Landroid/graphics/Canvas;

    .line 87
    .line 88
    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 89
    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-virtual {p1, v6, v6, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 96
    .line 97
    .line 98
    move-object v1, v4

    .line 99
    goto :goto_6

    .line 100
    :catch_2
    move-exception p1

    .line 101
    goto :goto_5

    .line 102
    :cond_4
    :goto_4
    const-string p1, "Width or height of view is zero"

    .line 103
    .line 104
    sget v2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 105
    .line 106
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzi(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2

    .line 107
    .line 108
    .line 109
    goto :goto_6

    .line 110
    :goto_5
    sget v2, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 111
    .line 112
    const-string v2, "Fail to capture the webview"

    .line 113
    .line 114
    invoke-static {v2, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzg(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_5
    move-object v1, v3

    .line 119
    :goto_6
    if-nez v1, :cond_6

    .line 120
    .line 121
    const-string p1, "Failed to capture the webview bitmap."

    .line 122
    .line 123
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzccd;->zza(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzl:Z

    .line 128
    .line 129
    new-instance p1, Lcom/google/android/gms/internal/ads/zzcby;

    .line 130
    .line 131
    invoke-direct {p1, p0, v1}, Lcom/google/android/gms/internal/ads/zzcby;-><init>(Lcom/google/android/gms/internal/ads/zzcbz;Landroid/graphics/Bitmap;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzh(Ljava/lang/Runnable;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    :goto_7
    return-void
.end method

.method public final zze(Ljava/lang/String;Ljava/util/Map;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x3

    .line 5
    if-ne p3, v1, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    :try_start_0
    iput-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzm:Z

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zze:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_2

    .line 21
    .line 22
    if-ne p3, v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/google/android/gms/internal/ads/zzihj;

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzihj;->zze(I)Lcom/google/android/gms/internal/ads/zzihj;

    .line 32
    .line 33
    .line 34
    :cond_1
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihk;->zze()Lcom/google/android/gms/internal/ads/zzihj;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {p3}, Lcom/google/android/gms/internal/ads/zzihi;->zza(I)I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/zzihj;->zze(I)Lcom/google/android/gms/internal/ads/zzihj;

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {v1, p3}, Lcom/google/android/gms/internal/ads/zzihj;->zza(I)Lcom/google/android/gms/internal/ads/zzihj;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzihj;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzihj;

    .line 57
    .line 58
    .line 59
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzigl;->zzc()Lcom/google/android/gms/internal/ads/zzigi;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzk:Ljava/util/HashSet;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_7

    .line 70
    .line 71
    if-eqz p2, :cond_7

    .line 72
    .line 73
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/util/Map$Entry;

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    const-string v4, ""

    .line 107
    .line 108
    :goto_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    if-eqz v5, :cond_6

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    const-string v3, ""

    .line 122
    .line 123
    :goto_3
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 124
    .line 125
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzk:Ljava/util/HashSet;

    .line 130
    .line 131
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzigh;->zzc()Lcom/google/android/gms/internal/ads/zzigg;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzian;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzian;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzigg;->zza(Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzigg;

    .line 146
    .line 147
    .line 148
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzian;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzian;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzigg;->zzb(Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzigg;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    check-cast v3, Lcom/google/android/gms/internal/ads/zzigh;

    .line 160
    .line 161
    invoke-virtual {p3, v3}, Lcom/google/android/gms/internal/ads/zzigi;->zza(Lcom/google/android/gms/internal/ads/zzigh;)Lcom/google/android/gms/internal/ads/zzigi;

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_7
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, Lcom/google/android/gms/internal/ads/zzigl;

    .line 170
    .line 171
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzihj;->zzc(Lcom/google/android/gms/internal/ads/zzigl;)Lcom/google/android/gms/internal/ads/zzihj;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, p1, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    monitor-exit v0

    .line 178
    return-void

    .line 179
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    throw p1
.end method

.method public final zzf()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zze:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 10
    .line 11
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcbv;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/zzcbv;-><init>(Lcom/google/android/gms/internal/ads/zzcbz;)V

    .line 18
    .line 19
    .line 20
    sget-object v3, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 21
    .line 22
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj(Lj3/a;Lcom/google/android/gms/internal/ads/zzgyw;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 27
    .line 28
    sget-object v4, Lcom/google/android/gms/internal/ads/zzcei;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 29
    .line 30
    const-wide/16 v5, 0xa

    .line 31
    .line 32
    invoke-static {v1, v5, v6, v2, v4}, Lcom/google/android/gms/internal/ads/zzgzo;->zzi(Lj3/a;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lj3/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v4, Lcom/google/android/gms/internal/ads/zzcbu;

    .line 37
    .line 38
    invoke-direct {v4, p0, v2}, Lcom/google/android/gms/internal/ads/zzcbu;-><init>(Lcom/google/android/gms/internal/ads/zzcbz;Lj3/a;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v4, v3}, Lcom/google/android/gms/internal/ads/zzgzo;->zzr(Lj3/a;Lcom/google/android/gms/internal/ads/zzgzl;Ljava/util/concurrent/Executor;)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcbz;->zzc:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw v1
.end method

.method public final synthetic zzg(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzian;->zzA()Lcom/google/android/gms/internal/ads/zziam;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzihf;->zzc()Lcom/google/android/gms/internal/ads/zzihd;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zziam;->zza()Lcom/google/android/gms/internal/ads/zzian;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzihd;->zzb(Lcom/google/android/gms/internal/ads/zzian;)Lcom/google/android/gms/internal/ads/zzihd;

    .line 25
    .line 26
    .line 27
    const-string v0, "image/png"

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzihd;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzihd;

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzihd;->zzc(I)Lcom/google/android/gms/internal/ads/zzihd;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/google/android/gms/internal/ads/zzihf;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzifv;->zzj(Lcom/google/android/gms/internal/ads/zzihf;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 43
    .line 44
    .line 45
    monitor-exit p1

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw v0
.end method

.method public final synthetic zzh(Ljava/util/Map;)Lj3/a;
    .locals 11

    .line 1
    :try_start_0
    const-string v0, "Cannot find the corresponding resource object for "

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_5

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v5, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v4, "matches"

    .line 40
    .line 41
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v5
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    :try_start_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    :try_start_2
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zze:Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    invoke-virtual {v7, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Lcom/google/android/gms/internal/ads/zzihj;

    .line 62
    .line 63
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    if-nez v7, :cond_2

    .line 65
    .line 66
    :try_start_3
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    add-int/lit8 v4, v4, 0x32

    .line 75
    .line 76
    new-instance v6, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzccd;->zza(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    monitor-exit v5

    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception p1

    .line 97
    goto :goto_2

    .line 98
    :cond_2
    const/4 v3, 0x0

    .line 99
    move v8, v3

    .line 100
    :goto_1
    if-ge v8, v6, :cond_3

    .line 101
    .line 102
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    const-string v10, "threat_type"

    .line 107
    .line 108
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v7, v9}, Lcom/google/android/gms/internal/ads/zzihj;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzihj;

    .line 113
    .line 114
    .line 115
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zza:Z

    .line 119
    .line 120
    if-lez v6, :cond_4

    .line 121
    .line 122
    move v3, v1

    .line 123
    :cond_4
    or-int/2addr v3, v4

    .line 124
    iput-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zza:Z

    .line 125
    .line 126
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    goto :goto_0

    .line 128
    :catchall_1
    move-exception p1

    .line 129
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 130
    :try_start_5
    throw p1

    .line 131
    :goto_2
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 132
    :try_start_6
    throw p1

    .line 133
    :catch_0
    move-exception p1

    .line 134
    goto/16 :goto_8

    .line 135
    .line 136
    :cond_5
    :goto_3
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zza:Z

    .line 137
    .line 138
    if-eqz p1, :cond_6

    .line 139
    .line 140
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 141
    .line 142
    monitor-enter p1
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    .line 143
    :try_start_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 144
    .line 145
    const/16 v2, 0xa

    .line 146
    .line 147
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzifv;->zzn(I)Lcom/google/android/gms/internal/ads/zzifv;

    .line 148
    .line 149
    .line 150
    monitor-exit p1

    .line 151
    goto :goto_4

    .line 152
    :catchall_2
    move-exception v0

    .line 153
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 154
    :try_start_8
    throw v0

    .line 155
    :cond_6
    :goto_4
    const-string p1, "Sending SB report\n  url: "

    .line 156
    .line 157
    const-string v0, "\n  clickUrl: "

    .line 158
    .line 159
    const-string v2, "\n  resources: \n"

    .line 160
    .line 161
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zza:Z

    .line 162
    .line 163
    const/4 v4, 0x0

    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 167
    .line 168
    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/zzccb;->zzg:Z

    .line 169
    .line 170
    if-nez v5, :cond_9

    .line 171
    .line 172
    :cond_7
    iget-boolean v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzm:Z

    .line 173
    .line 174
    if-eqz v5, :cond_8

    .line 175
    .line 176
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 177
    .line 178
    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/zzccb;->zzf:Z

    .line 179
    .line 180
    if-nez v5, :cond_9

    .line 181
    .line 182
    :cond_8
    if-nez v3, :cond_e

    .line 183
    .line 184
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 185
    .line 186
    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzccb;->zzd:Z

    .line 187
    .line 188
    if-eqz v3, :cond_e

    .line 189
    .line 190
    :cond_9
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzj:Ljava/lang/Object;

    .line 191
    .line 192
    monitor-enter v3
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_0

    .line 193
    :try_start_9
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zze:Ljava/util/LinkedHashMap;

    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-eqz v6, :cond_a

    .line 208
    .line 209
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    check-cast v6, Lcom/google/android/gms/internal/ads/zzihj;

    .line 214
    .line 215
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 216
    .line 217
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    check-cast v6, Lcom/google/android/gms/internal/ads/zzihk;

    .line 222
    .line 223
    invoke-virtual {v7, v6}, Lcom/google/android/gms/internal/ads/zzifv;->zzf(Lcom/google/android/gms/internal/ads/zzihk;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 224
    .line 225
    .line 226
    goto :goto_5

    .line 227
    :catchall_3
    move-exception p1

    .line 228
    goto/16 :goto_7

    .line 229
    .line 230
    :cond_a
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzd:Lcom/google/android/gms/internal/ads/zzifv;

    .line 231
    .line 232
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzf:Ljava/util/List;

    .line 233
    .line 234
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzifv;->zzl(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 235
    .line 236
    .line 237
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzg:Ljava/util/List;

    .line 238
    .line 239
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzifv;->zzm(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzifv;

    .line 240
    .line 241
    .line 242
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzccd;->zzb()Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-eqz v6, :cond_c

    .line 247
    .line 248
    new-instance v6, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzifv;->zza()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzifv;->zzg()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    add-int/lit8 v9, v9, 0x26

    .line 267
    .line 268
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    add-int/2addr v9, v10

    .line 277
    add-int/lit8 v9, v9, 0xf

    .line 278
    .line 279
    new-instance v10, Ljava/lang/StringBuilder;

    .line 280
    .line 281
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-direct {v6, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzifv;->zze()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_b

    .line 319
    .line 320
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Lcom/google/android/gms/internal/ads/zzihk;

    .line 325
    .line 326
    const-string v2, "    ["

    .line 327
    .line 328
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzihk;->zzd()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v2, "] "

    .line 339
    .line 340
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzihk;->zzc()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_b
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzccd;->zza(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    :cond_c
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzibl;->zzbm()Lcom/google/android/gms/internal/ads/zzibr;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    check-cast p1, Lcom/google/android/gms/internal/ads/zzihz;

    .line 363
    .line 364
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzhzw;->zzaN()[B

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzi:Lcom/google/android/gms/internal/ads/zzccb;

    .line 369
    .line 370
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzccb;->zzb:Ljava/lang/String;

    .line 371
    .line 372
    new-instance v2, Lcom/google/android/gms/ads/internal/util/zzbl;

    .line 373
    .line 374
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzcbz;->zzh:Landroid/content/Context;

    .line 375
    .line 376
    invoke-direct {v2, v5}, Lcom/google/android/gms/ads/internal/util/zzbl;-><init>(Landroid/content/Context;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v1, v0, v4, p1}, Lcom/google/android/gms/ads/internal/util/zzbl;->zzb(ILjava/lang/String;Ljava/util/Map;[B)Lj3/a;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzccd;->zzb()Z

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-eqz v0, :cond_d

    .line 388
    .line 389
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcbx;->zza:Lcom/google/android/gms/internal/ads/zzcbx;

    .line 390
    .line 391
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcei;->zza:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 392
    .line 393
    invoke-interface {p1, v0, v1}, Lj3/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 394
    .line 395
    .line 396
    :cond_d
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcbw;->zza:Lcom/google/android/gms/internal/ads/zzcbw;

    .line 397
    .line 398
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcei;->zzg:Lcom/google/android/gms/internal/ads/zzgzy;

    .line 399
    .line 400
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzk(Lj3/a;Lcom/google/android/gms/internal/ads/zzgqt;Ljava/util/concurrent/Executor;)Lj3/a;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    monitor-exit v3

    .line 405
    return-object p1

    .line 406
    :goto_7
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 407
    :try_start_a
    throw p1

    .line 408
    :cond_e
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzgzo;->zza(Ljava/lang/Object;)Lj3/a;

    .line 409
    .line 410
    .line 411
    move-result-object p1
    :try_end_a
    .catch Lorg/json/JSONException; {:try_start_a .. :try_end_a} :catch_0

    .line 412
    return-object p1

    .line 413
    :goto_8
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbjm;->zza:Lcom/google/android/gms/internal/ads/zzbio;

    .line 414
    .line 415
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbio;->zze()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Ljava/lang/Boolean;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_f

    .line 426
    .line 427
    sget v0, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 428
    .line 429
    const-string v0, "Failed to get SafeBrowsing metadata"

    .line 430
    .line 431
    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zze(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 432
    .line 433
    .line 434
    :cond_f
    new-instance p1, Ljava/lang/Exception;

    .line 435
    .line 436
    const-string v0, "Safebrowsing report transmission failed."

    .line 437
    .line 438
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgzo;->zzc(Ljava/lang/Throwable;)Lj3/a;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    return-object p1
.end method
