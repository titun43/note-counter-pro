.class public final Lcom/google/android/gms/internal/ads/zzis;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzlj;


# static fields
.field public static final zza:Lcom/google/android/gms/internal/ads/zzguf;


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzbe;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzbd;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzaat;

.field private final zze:J

.field private final zzf:J

.field private final zzg:J

.field private final zzh:J

.field private final zzi:J

.field private final zzj:J

.field private final zzk:J

.field private final zzl:J

.field private final zzm:J

.field private final zzn:Lcom/google/android/gms/internal/ads/zzgui;

.field private final zzo:Ljava/util/concurrent/ConcurrentHashMap;

.field private zzp:J


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v4, "rawresource"

    .line 2
    .line 3
    const-string v5, "asset"

    .line 4
    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    const-string v1, "content"

    .line 8
    .line 9
    const-string v2, "data"

    .line 10
    .line 11
    const-string v3, "android.resource"

    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzguf;->zzn(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzguf;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/gms/internal/ads/zzis;->zza:Lcom/google/android/gms/internal/ads/zzguf;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaat;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/high16 v2, 0x10000

    .line 5
    .line 6
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaat;-><init>(ZI)V

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgui;->zza()Lcom/google/android/gms/internal/ads/zzgui;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x3e8

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const-string v4, "bufferForPlaybackMs"

    .line 20
    .line 21
    const-string v5, "0"

    .line 22
    .line 23
    invoke-static {v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v6, "bufferForPlaybackForLocalPlaybackMs"

    .line 27
    .line 28
    invoke-static {v2, v3, v6, v5}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/16 v7, 0x7d0

    .line 32
    .line 33
    const-string v8, "bufferForPlaybackAfterRebufferMs"

    .line 34
    .line 35
    invoke-static {v7, v3, v8, v5}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v9, "bufferForPlaybackAfterRebufferForLocalPlaybackMs"

    .line 39
    .line 40
    invoke-static {v2, v3, v9, v5}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const v10, 0xc350

    .line 44
    .line 45
    .line 46
    const-string v11, "minBufferMs"

    .line 47
    .line 48
    invoke-static {v10, v2, v11, v4}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v4, "minBufferForLocalPlaybackMs"

    .line 52
    .line 53
    invoke-static {v2, v2, v4, v6}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v10, v7, v11, v8}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v2, v4, v9}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v6, "maxBufferMs"

    .line 63
    .line 64
    invoke-static {v10, v10, v6, v11}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v6, "maxBufferForLocalPlaybackMs"

    .line 68
    .line 69
    invoke-static {v10, v2, v6, v4}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v2, "backBufferDurationMs"

    .line 73
    .line 74
    invoke-static {v3, v3, v2, v5}, Lcom/google/android/gms/internal/ads/zzis;->zzq(IILjava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbe;

    .line 78
    .line 79
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbe;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzb:Lcom/google/android/gms/internal/ads/zzbe;

    .line 83
    .line 84
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbd;

    .line 85
    .line 86
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbd;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzc:Lcom/google/android/gms/internal/ads/zzbd;

    .line 90
    .line 91
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzd:Lcom/google/android/gms/internal/ads/zzaat;

    .line 92
    .line 93
    const-wide/32 v2, 0xc350

    .line 94
    .line 95
    .line 96
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    iput-wide v4, p0, Lcom/google/android/gms/internal/ads/zzis;->zze:J

    .line 101
    .line 102
    const-wide/16 v4, 0x3e8

    .line 103
    .line 104
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzf:J

    .line 109
    .line 110
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    iput-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzg:J

    .line 115
    .line 116
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzh:J

    .line 121
    .line 122
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzi:J

    .line 127
    .line 128
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzj:J

    .line 133
    .line 134
    const-wide/16 v2, 0x7d0

    .line 135
    .line 136
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzk:J

    .line 141
    .line 142
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzl:J

    .line 147
    .line 148
    const-wide/16 v2, 0x0

    .line 149
    .line 150
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzq(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzm:J

    .line 155
    .line 156
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 162
    .line 163
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzgui;->zzc(Ljava/util/Map;)Lcom/google/android/gms/internal/ads/zzgui;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzn:Lcom/google/android/gms/internal/ads/zzgui;

    .line 168
    .line 169
    const-wide/16 v0, -0x1

    .line 170
    .line 171
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzp:J

    .line 172
    .line 173
    return-void
.end method

.method private final zzm(Lcom/google/android/gms/internal/ads/zzpq;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzn:Lcom/google/android/gms/internal/ads/zzgui;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzpq;->zzb:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgui;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_0
    return v0
.end method

.method private final zzn(Lcom/google/android/gms/internal/ads/zzpq;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/google/android/gms/internal/ads/zzir;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzir;->zza:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, -0x1

    .line 14
    .line 15
    iput v2, v1, Lcom/google/android/gms/internal/ads/zzir;->zza:I

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzis;->zzo()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private final zzo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzd:Lcom/google/android/gms/internal/ads/zzaat;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaat;->zze()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzis;->zzd:Lcom/google/android/gms/internal/ads/zzaat;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Lcom/google/android/gms/internal/ads/zzir;

    .line 37
    .line 38
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzir;->zzc:I

    .line 39
    .line 40
    add-int/2addr v2, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzaat;->zzf(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private final zzp(Lcom/google/android/gms/internal/ads/zzli;)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzli;->zzb:Lcom/google/android/gms/internal/ads/zzbf;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzli;->zzc:Lcom/google/android/gms/internal/ads/zzwk;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzwk;->zza:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzis;->zzc:Lcom/google/android/gms/internal/ads/zzbd;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzbf;->zzo(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzbd;)Lcom/google/android/gms/internal/ads/zzbd;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzbd;->zzc:I

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzis;->zzb:Lcom/google/android/gms/internal/ads/zzbe;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbf;->zzb(ILcom/google/android/gms/internal/ads/zzbe;J)Lcom/google/android/gms/internal/ads/zzbe;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzbe;->zzd:Lcom/google/android/gms/internal/ads/zzak;

    .line 24
    .line 25
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzak;->zzb:Lcom/google/android/gms/internal/ads/zzag;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    return v0

    .line 31
    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzag;->zza:Landroid/net/Uri;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    sget-object v1, Lcom/google/android/gms/internal/ads/zzis;->zza:Lcom/google/android/gms/internal/ads/zzguf;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzguf;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return v0

    .line 53
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 54
    return p1
.end method

.method private static zzq(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-lt p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    :goto_0
    const-string p1, "%s cannot be less than %s"

    .line 7
    .line 8
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzgrc;->zzh(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private final zzr(Lcom/google/android/gms/internal/ads/zzpq;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzir;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzir;->zzc()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/high16 v0, 0x10000

    .line 17
    .line 18
    mul-int/2addr p1, v0

    .line 19
    return p1
.end method

.method private final zzs(Lcom/google/android/gms/internal/ads/zzpq;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/android/gms/internal/ads/zzir;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget p1, p1, Lcom/google/android/gms/internal/ads/zzir;->zzc:I

    .line 13
    .line 14
    return p1
.end method

.method private static final zzt(Z)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzpq;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzp:J

    .line 10
    .line 11
    const-wide/16 v4, -0x1

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    cmp-long v2, v2, v0

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    :cond_0
    move v2, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v2, v5

    .line 26
    :goto_0
    const-string v3, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    .line 27
    .line 28
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzgrc;->zzj(ZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzp:J

    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/google/android/gms/internal/ads/zzir;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    new-instance v1, Lcom/google/android/gms/internal/ads/zzir;

    .line 44
    .line 45
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzir;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzir;->zza:I

    .line 53
    .line 54
    add-int/2addr v2, v6

    .line 55
    iput v2, v1, Lcom/google/android/gms/internal/ads/zzir;->zza:I

    .line 56
    .line 57
    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/google/android/gms/internal/ads/zzir;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzm(Lcom/google/android/gms/internal/ads/zzpq;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    const/4 v1, -0x1

    .line 71
    if-ne p1, v1, :cond_3

    .line 72
    .line 73
    const/high16 p1, 0xc80000

    .line 74
    .line 75
    :cond_3
    iput p1, v0, Lcom/google/android/gms/internal/ads/zzir;->zzc:I

    .line 76
    .line 77
    iput-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzir;->zzb:Z

    .line 78
    .line 79
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzli;Lcom/google/android/gms/internal/ads/zzyn;[Lcom/google/android/gms/internal/ads/zzaac;)V
    .locals 6

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzli;->zza:Lcom/google/android/gms/internal/ads/zzpq;

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzis;->zzm(Lcom/google/android/gms/internal/ads/zzpq;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lcom/google/android/gms/internal/ads/zzir;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    if-ne v1, v0, :cond_3

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzp(Lcom/google/android/gms/internal/ads/zzli;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    array-length v0, p3

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    const/high16 v3, 0xc80000

    .line 29
    .line 30
    if-ge v1, v0, :cond_2

    .line 31
    .line 32
    aget-object v4, p3, v1

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzaah;->zza()Lcom/google/android/gms/internal/ads/zzbg;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzbg;->zzc:I

    .line 41
    .line 42
    const/high16 v5, 0x20000

    .line 43
    .line 44
    packed-switch v4, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    :pswitch_0
    move v3, v5

    .line 48
    goto :goto_1

    .line 49
    :pswitch_1
    const/high16 v3, 0x1900000

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_2
    if-eqz p1, :cond_0

    .line 53
    .line 54
    const/high16 v3, 0x12c0000

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    const/high16 v3, 0x7d00000

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :pswitch_3
    const/high16 v3, 0x89a0000

    .line 61
    .line 62
    :goto_1
    :pswitch_4
    add-int/2addr v2, v3

    .line 63
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    :cond_3
    iput v1, p2, Lcom/google/android/gms/internal/ads/zzir;->zzc:I

    .line 71
    .line 72
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzis;->zzo()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzpq;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzn(Lcom/google/android/gms/internal/ads/zzpq;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzpq;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzn(Lcom/google/android/gms/internal/ads/zzpq;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzp:J

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzpq;)Lcom/google/android/gms/internal/ads/zzaan;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zziq;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/zziq;-><init>(Lcom/google/android/gms/internal/ads/zzis;Lcom/google/android/gms/internal/ads/zzpq;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzpq;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzm:J

    return-wide v0
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzpq;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final zzh(Lcom/google/android/gms/internal/ads/zzli;)Z
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzli;->zza:Lcom/google/android/gms/internal/ads/zzpq;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/google/android/gms/internal/ads/zzir;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzis;->zzr(Lcom/google/android/gms/internal/ads/zzpq;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzis;->zzs(Lcom/google/android/gms/internal/ads/zzpq;)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    sget-object v4, Lcom/google/android/gms/internal/ads/zzpq;->zza:Lcom/google/android/gms/internal/ads/zzpq;

    .line 23
    .line 24
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    if-ge v2, v3, :cond_0

    .line 33
    .line 34
    return v5

    .line 35
    :cond_0
    return v4

    .line 36
    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzp(Lcom/google/android/gms/internal/ads/zzli;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzf:J

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zze:J

    .line 46
    .line 47
    :goto_0
    if-eqz v1, :cond_3

    .line 48
    .line 49
    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/zzis;->zzh:J

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-wide v8, p0, Lcom/google/android/gms/internal/ads/zzis;->zzg:J

    .line 53
    .line 54
    :goto_1
    iget v10, p1, Lcom/google/android/gms/internal/ads/zzli;->zzf:F

    .line 55
    .line 56
    const/high16 v11, 0x3f800000    # 1.0f

    .line 57
    .line 58
    cmpl-float v11, v10, v11

    .line 59
    .line 60
    if-lez v11, :cond_4

    .line 61
    .line 62
    invoke-static {v6, v7, v10}, Lcom/google/android/gms/internal/ads/zzfj;->zzv(JF)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    :cond_4
    iget-wide v10, p1, Lcom/google/android/gms/internal/ads/zzli;->zze:J

    .line 71
    .line 72
    const-wide/32 v12, 0x7a120

    .line 73
    .line 74
    .line 75
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    cmp-long p1, v10, v6

    .line 80
    .line 81
    if-gez p1, :cond_7

    .line 82
    .line 83
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzis;->zzt(Z)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_5

    .line 88
    .line 89
    if-ge v2, v3, :cond_6

    .line 90
    .line 91
    :cond_5
    move v4, v5

    .line 92
    :cond_6
    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzir;->zzb:Z

    .line 93
    .line 94
    if-nez v4, :cond_9

    .line 95
    .line 96
    cmp-long p1, v10, v12

    .line 97
    .line 98
    if-gez p1, :cond_9

    .line 99
    .line 100
    const-string p1, "DefaultLoadControl"

    .line 101
    .line 102
    const-string v1, "Target buffer size reached with less than 500ms of buffered media data."

    .line 103
    .line 104
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzee;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_7
    cmp-long p1, v10, v8

    .line 109
    .line 110
    if-gez p1, :cond_8

    .line 111
    .line 112
    if-lt v2, v3, :cond_9

    .line 113
    .line 114
    :cond_8
    iput-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzir;->zzb:Z

    .line 115
    .line 116
    :cond_9
    :goto_2
    iget-boolean p1, v0, Lcom/google/android/gms/internal/ads/zzir;->zzb:Z

    .line 117
    .line 118
    return p1
.end method

.method public final zzi(Lcom/google/android/gms/internal/ads/zzli;)Z
    .locals 12

    .line 1
    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/zzli;->zzg:Z

    .line 2
    .line 3
    iget-wide v1, p1, Lcom/google/android/gms/internal/ads/zzli;->zze:J

    .line 4
    .line 5
    iget v3, p1, Lcom/google/android/gms/internal/ads/zzli;->zzf:F

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzp(Lcom/google/android/gms/internal/ads/zzli;)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzfj;->zzw(JF)J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzl:J

    .line 22
    .line 23
    :goto_0
    move v0, v5

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzk:J

    .line 26
    .line 27
    :goto_1
    move v0, v3

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    if-eqz v4, :cond_2

    .line 30
    .line 31
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzj:J

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-wide v6, p0, Lcom/google/android/gms/internal/ads/zzis;->zzi:J

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :goto_2
    iget-wide v8, p1, Lcom/google/android/gms/internal/ads/zzli;->zzh:J

    .line 38
    .line 39
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    cmp-long v4, v8, v10

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    const-wide/16 v10, 0x2

    .line 49
    .line 50
    div-long/2addr v8, v10

    .line 51
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    :cond_3
    const-wide/16 v8, 0x0

    .line 56
    .line 57
    cmp-long v4, v6, v8

    .line 58
    .line 59
    if-lez v4, :cond_5

    .line 60
    .line 61
    cmp-long v1, v1, v6

    .line 62
    .line 63
    if-gez v1, :cond_5

    .line 64
    .line 65
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzis;->zzt(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_4

    .line 70
    .line 71
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzli;->zza:Lcom/google/android/gms/internal/ads/zzpq;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzr(Lcom/google/android/gms/internal/ads/zzpq;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzis;->zzs(Lcom/google/android/gms/internal/ads/zzpq;)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-lt v0, p1, :cond_4

    .line 82
    .line 83
    return v5

    .line 84
    :cond_4
    return v3

    .line 85
    :cond_5
    return v5
.end method

.method public final zzj(Lcom/google/android/gms/internal/ads/zzpq;Lcom/google/android/gms/internal/ads/zzbf;Lcom/google/android/gms/internal/ads/zzwk;J)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lcom/google/android/gms/internal/ads/zzir;

    .line 22
    .line 23
    iget-boolean p2, p2, Lcom/google/android/gms/internal/ads/zzir;->zzb:Z

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public final synthetic zzk()Lcom/google/android/gms/internal/ads/zzaat;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzd:Lcom/google/android/gms/internal/ads/zzaat;

    return-object v0
.end method

.method public final synthetic zzl()Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzis;->zzo:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method
