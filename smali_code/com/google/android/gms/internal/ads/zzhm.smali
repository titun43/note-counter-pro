.class public final Lcom/google/android/gms/internal/ads/zzhm;
.super Lcom/google/android/gms/internal/ads/zzgt;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhu;


# instance fields
.field private final zza:Z

.field private final zzb:I

.field private final zzc:I

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/ads/zzht;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzht;

.field private zzg:Lcom/google/android/gms/internal/ads/zzhf;

.field private zzh:Ljava/net/HttpURLConnection;

.field private zzi:Ljava/io/InputStream;

.field private zzj:Z

.field private zzk:I

.field private zzl:J

.field private zzm:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IIZZLcom/google/android/gms/internal/ads/zzht;Lcom/google/android/gms/internal/ads/zzgrd;Z[B)V
    .locals 0

    .line 1
    const/4 p5, 0x1

    .line 2
    invoke-direct {p0, p5}, Lcom/google/android/gms/internal/ads/zzgt;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzd:Ljava/lang/String;

    .line 6
    .line 7
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzb:I

    .line 8
    .line 9
    iput p3, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzc:I

    .line 10
    .line 11
    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzhm;->zza:Z

    .line 12
    .line 13
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzhm;->zze:Lcom/google/android/gms/internal/ads/zzht;

    .line 14
    .line 15
    new-instance p1, Lcom/google/android/gms/internal/ads/zzht;

    .line 16
    .line 17
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzht;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzf:Lcom/google/android/gms/internal/ads/zzht;

    .line 21
    .line 22
    return-void
.end method

.method private final zzk(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzb:I

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzc:I

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzhm;->zze:Lcom/google/android/gms/internal/ads/zzht;

    .line 23
    .line 24
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzht;->zza()Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzf:Lcom/google/android/gms/internal/ads/zzht;

    .line 32
    .line 33
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzht;->zza()Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p2, p3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, p10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_0

    .line 56
    .line 57
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    check-cast p3, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p10

    .line 67
    check-cast p10, Ljava/lang/String;

    .line 68
    .line 69
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    check-cast p3, Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, p10, p3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const-wide/16 p2, 0x0

    .line 80
    .line 81
    cmp-long p10, p4, p2

    .line 82
    .line 83
    const-wide/16 v0, -0x1

    .line 84
    .line 85
    if-nez p10, :cond_2

    .line 86
    .line 87
    cmp-long p4, p6, v0

    .line 88
    .line 89
    if-nez p4, :cond_1

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-wide p4, p2

    .line 94
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string p3, "bytes="

    .line 97
    .line 98
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p3, "-"

    .line 105
    .line 106
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    cmp-long p3, p6, v0

    .line 110
    .line 111
    if-eqz p3, :cond_3

    .line 112
    .line 113
    add-long/2addr p4, p6

    .line 114
    add-long/2addr p4, v0

    .line 115
    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    :goto_1
    if-eqz p2, :cond_4

    .line 123
    .line 124
    const-string p3, "Range"

    .line 125
    .line 126
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzd:Ljava/lang/String;

    .line 130
    .line 131
    if-eqz p2, :cond_5

    .line 132
    .line 133
    const-string p3, "User-Agent"

    .line 134
    .line 135
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_5
    const/4 p2, 0x1

    .line 139
    if-eq p2, p8, :cond_6

    .line 140
    .line 141
    const-string p2, "identity"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    const-string p2, "gzip"

    .line 145
    .line 146
    :goto_2
    const-string p3, "Accept-Encoding"

    .line 147
    .line 148
    invoke-virtual {p1, p3, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 152
    .line 153
    .line 154
    const/4 p2, 0x0

    .line 155
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 156
    .line 157
    .line 158
    sget p2, Lcom/google/android/gms/internal/ads/zzhf;->zzh:I

    .line 159
    .line 160
    const-string p2, "GET"

    .line 161
    .line 162
    invoke-virtual {p1, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 166
    .line 167
    .line 168
    return-object p1
.end method

.method private final zzl(Ljava/net/URL;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhf;)Ljava/net/URL;
    .locals 5

    .line 1
    const/16 v0, 0x7d1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p2, :cond_4

    .line 5
    .line 6
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 7
    .line 8
    invoke-direct {v2, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v3, "https"

    .line 16
    .line 17
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    const-string v3, "http"

    .line 24
    .line 25
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhq;

    .line 33
    .line 34
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const-string v2, "Unsupported protocol redirect: "

    .line 39
    .line 40
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p1, p2, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    :goto_0
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzhm;->zza:Z

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzhq;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    add-int/lit8 v3, v3, 0x28

    .line 78
    .line 79
    invoke-static {p2, v3, v1}, Landroidx/emoji2/text/u;->e(Ljava/lang/String;II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    new-instance v4, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 86
    .line 87
    .line 88
    const-string v3, "Disallowed cross-protocol redirect ("

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, " to "

    .line 97
    .line 98
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, ")"

    .line 105
    .line 106
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {v2, p1, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 114
    .line 115
    .line 116
    throw v2

    .line 117
    :cond_3
    :goto_1
    return-object v2

    .line 118
    :catch_0
    move-exception p1

    .line 119
    new-instance p2, Lcom/google/android/gms/internal/ads/zzhq;

    .line 120
    .line 121
    invoke-direct {p2, p1, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 122
    .line 123
    .line 124
    throw p2

    .line 125
    :cond_4
    new-instance p1, Lcom/google/android/gms/internal/ads/zzhq;

    .line 126
    .line 127
    const-string p2, "Null location redirect"

    .line 128
    .line 129
    invoke-direct {p1, p2, p3, v0, v1}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 130
    .line 131
    .line 132
    throw p1
.end method

.method private final zzm()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzh:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    const-string v1, "DefaultHttpDataSource"

    .line 11
    .line 12
    const-string v2, "Unexpected error while disconnecting"

    .line 13
    .line 14
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzee;->zzf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza([BII)I
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    :try_start_0
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzl:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzm:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    return v3

    .line 24
    :cond_1
    int-to-long v4, p3

    .line 25
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p3, v0

    .line 30
    goto :goto_0

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;

    .line 34
    .line 35
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-ne p1, v3, :cond_3

    .line 42
    .line 43
    return v3

    .line 44
    :cond_3
    iget-wide p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzm:J

    .line 45
    .line 46
    int-to-long v0, p1

    .line 47
    add-long/2addr p2, v0

    .line 48
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzm:J

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzh(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return p1

    .line 54
    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzg:Lcom/google/android/gms/internal/ads/zzhf;

    .line 55
    .line 56
    sget-object p3, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 57
    .line 58
    const/4 p3, 0x2

    .line 59
    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzhq;->zza(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;I)Lcom/google/android/gms/internal/ads/zzhq;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhf;)J
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    iput-object v12, v1, Lcom/google/android/gms/internal/ads/zzhm;->zzg:Lcom/google/android/gms/internal/ads/zzhf;

    .line 6
    .line 7
    const-wide/16 v13, 0x0

    .line 8
    .line 9
    iput-wide v13, v1, Lcom/google/android/gms/internal/ads/zzhm;->zzm:J

    .line 10
    .line 11
    iput-wide v13, v1, Lcom/google/android/gms/internal/ads/zzhm;->zzl:J

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzf(Lcom/google/android/gms/internal/ads/zzhf;)V

    .line 14
    .line 15
    .line 16
    const/4 v15, 0x1

    .line 17
    :try_start_0
    const-string v0, "Too many redirects: "

    .line 18
    .line 19
    new-instance v2, Ljava/net/URL;

    .line 20
    .line 21
    iget-object v3, v12, Lcom/google/android/gms/internal/ads/zzhf;->zza:Landroid/net/Uri;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-wide v5, v12, Lcom/google/android/gms/internal/ads/zzhf;->zze:J

    .line 31
    .line 32
    iget-wide v7, v12, Lcom/google/android/gms/internal/ads/zzhf;->zzf:J

    .line 33
    .line 34
    invoke-virtual {v12, v15}, Lcom/google/android/gms/internal/ads/zzhf;->zza(I)Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzhm;->zza:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    :try_start_1
    iget-object v11, v12, Lcom/google/android/gms/internal/ads/zzhf;->zzd:Ljava/util/Map;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    move v0, v4

    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v10, 0x1

    .line 49
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzhm;->zzk(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    move-object/from16 v7, p0

    .line 54
    .line 55
    move-wide/from16 v18, v13

    .line 56
    .line 57
    move v13, v0

    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception v0

    .line 60
    move-object/from16 v7, p0

    .line 61
    .line 62
    goto/16 :goto_d

    .line 63
    .line 64
    :cond_0
    move v1, v4

    .line 65
    :goto_0
    add-int/lit8 v3, v4, 0x1

    .line 66
    .line 67
    const/16 v10, 0x14

    .line 68
    .line 69
    if-gt v4, v10, :cond_14

    .line 70
    .line 71
    iget-object v11, v12, Lcom/google/android/gms/internal/ads/zzhf;->zzd:Ljava/util/Map;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    .line 73
    move v4, v3

    .line 74
    const/4 v3, 0x1

    .line 75
    move v10, v4

    .line 76
    const/4 v4, 0x0

    .line 77
    move/from16 v16, v10

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    move-wide/from16 v18, v13

    .line 81
    .line 82
    move/from16 v17, v16

    .line 83
    .line 84
    move v13, v1

    .line 85
    move-object/from16 v1, p0

    .line 86
    .line 87
    :try_start_2
    invoke-direct/range {v1 .. v11}, Lcom/google/android/gms/internal/ads/zzhm;->zzk(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 88
    .line 89
    .line 90
    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5

    .line 91
    move-object v4, v2

    .line 92
    move-wide/from16 v20, v7

    .line 93
    .line 94
    move-object v7, v1

    .line 95
    move-wide/from16 v1, v20

    .line 96
    .line 97
    :try_start_3
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    const-string v10, "Location"

    .line 102
    .line 103
    invoke-virtual {v3, v10}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const/16 v11, 0x12c

    .line 108
    .line 109
    if-eq v8, v11, :cond_13

    .line 110
    .line 111
    const/16 v11, 0x12d

    .line 112
    .line 113
    if-eq v8, v11, :cond_13

    .line 114
    .line 115
    const/16 v11, 0x12e

    .line 116
    .line 117
    if-eq v8, v11, :cond_13

    .line 118
    .line 119
    const/16 v11, 0x12f

    .line 120
    .line 121
    if-eq v8, v11, :cond_13

    .line 122
    .line 123
    const/16 v11, 0x133

    .line 124
    .line 125
    if-eq v8, v11, :cond_13

    .line 126
    .line 127
    const/16 v11, 0x134

    .line 128
    .line 129
    if-ne v8, v11, :cond_1

    .line 130
    .line 131
    goto/16 :goto_c

    .line 132
    .line 133
    :cond_1
    move-object v2, v3

    .line 134
    :goto_1
    iput-object v2, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzh:Ljava/net/HttpURLConnection;

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iput v0, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzk:I

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    .line 146
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzk:I

    .line 147
    .line 148
    const/16 v3, 0x7d8

    .line 149
    .line 150
    const-string v4, "Content-Range"

    .line 151
    .line 152
    const/16 v5, 0xc8

    .line 153
    .line 154
    const-wide/16 v8, -0x1

    .line 155
    .line 156
    if-lt v1, v5, :cond_e

    .line 157
    .line 158
    const/16 v6, 0x12b

    .line 159
    .line 160
    if-le v1, v6, :cond_2

    .line 161
    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_2
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    iget v0, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzk:I

    .line 168
    .line 169
    if-ne v0, v5, :cond_3

    .line 170
    .line 171
    iget-wide v0, v12, Lcom/google/android/gms/internal/ads/zzhf;->zze:J

    .line 172
    .line 173
    cmp-long v5, v0, v18

    .line 174
    .line 175
    if-nez v5, :cond_4

    .line 176
    .line 177
    :cond_3
    move-wide/from16 v0, v18

    .line 178
    .line 179
    :cond_4
    const-string v5, "Content-Encoding"

    .line 180
    .line 181
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    const-string v6, "gzip"

    .line 186
    .line 187
    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-nez v5, :cond_7

    .line 192
    .line 193
    iget-wide v10, v12, Lcom/google/android/gms/internal/ads/zzhf;->zzf:J

    .line 194
    .line 195
    cmp-long v6, v10, v8

    .line 196
    .line 197
    if-eqz v6, :cond_5

    .line 198
    .line 199
    iput-wide v10, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzl:J

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_5
    const-string v6, "Content-Length"

    .line 203
    .line 204
    invoke-virtual {v2, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v6, v4}, Lcom/google/android/gms/internal/ads/zzhv;->zzb(Ljava/lang/String;Ljava/lang/String;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v10

    .line 216
    cmp-long v4, v10, v8

    .line 217
    .line 218
    if-eqz v4, :cond_6

    .line 219
    .line 220
    sub-long v8, v10, v0

    .line 221
    .line 222
    :cond_6
    iput-wide v8, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzl:J

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_7
    iget-wide v8, v12, Lcom/google/android/gms/internal/ads/zzhf;->zzf:J

    .line 226
    .line 227
    iput-wide v8, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzl:J

    .line 228
    .line 229
    :goto_2
    const/16 v4, 0x7d0

    .line 230
    .line 231
    :try_start_4
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    iput-object v2, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;

    .line 236
    .line 237
    if-eqz v5, :cond_8

    .line 238
    .line 239
    new-instance v2, Ljava/util/zip/GZIPInputStream;

    .line 240
    .line 241
    iget-object v5, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;

    .line 242
    .line 243
    invoke-direct {v2, v5}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 244
    .line 245
    .line 246
    iput-object v2, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 247
    .line 248
    goto :goto_3

    .line 249
    :catch_1
    move-exception v0

    .line 250
    goto :goto_7

    .line 251
    :cond_8
    :goto_3
    iput-boolean v15, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzj:Z

    .line 252
    .line 253
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzg(Lcom/google/android/gms/internal/ads/zzhf;)V

    .line 254
    .line 255
    .line 256
    cmp-long v2, v0, v18

    .line 257
    .line 258
    if-nez v2, :cond_9

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_9
    const/16 v2, 0x1000

    .line 262
    .line 263
    :try_start_5
    new-array v2, v2, [B

    .line 264
    .line 265
    :goto_4
    cmp-long v5, v0, v18

    .line 266
    .line 267
    if-lez v5, :cond_c

    .line 268
    .line 269
    const-wide/16 v5, 0x1000

    .line 270
    .line 271
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 272
    .line 273
    .line 274
    move-result-wide v5

    .line 275
    long-to-int v5, v5

    .line 276
    iget-object v6, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;

    .line 277
    .line 278
    sget-object v8, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {v6, v2, v13, v5}, Ljava/io/InputStream;->read([BII)I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    invoke-virtual {v6}, Ljava/lang/Thread;->isInterrupted()Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-nez v6, :cond_b

    .line 293
    .line 294
    const/4 v6, -0x1

    .line 295
    if-eq v5, v6, :cond_a

    .line 296
    .line 297
    int-to-long v8, v5

    .line 298
    sub-long/2addr v0, v8

    .line 299
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzgt;->zzh(I)V

    .line 300
    .line 301
    .line 302
    goto :goto_4

    .line 303
    :catch_2
    move-exception v0

    .line 304
    goto :goto_6

    .line 305
    :cond_a
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhq;

    .line 306
    .line 307
    invoke-direct {v0, v12, v3, v15}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhq;

    .line 312
    .line 313
    new-instance v1, Ljava/io/InterruptedIOException;

    .line 314
    .line 315
    invoke-direct {v1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-direct {v0, v1, v12, v4, v15}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 319
    .line 320
    .line 321
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 322
    :cond_c
    :goto_5
    iget-wide v0, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzl:J

    .line 323
    .line 324
    return-wide v0

    .line 325
    :goto_6
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzhm;->zzm()V

    .line 326
    .line 327
    .line 328
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzhq;

    .line 329
    .line 330
    if-eqz v1, :cond_d

    .line 331
    .line 332
    check-cast v0, Lcom/google/android/gms/internal/ads/zzhq;

    .line 333
    .line 334
    throw v0

    .line 335
    :cond_d
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhq;

    .line 336
    .line 337
    invoke-direct {v1, v0, v12, v4, v15}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 338
    .line 339
    .line 340
    throw v1

    .line 341
    :goto_7
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzhm;->zzm()V

    .line 342
    .line 343
    .line 344
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhq;

    .line 345
    .line 346
    invoke-direct {v1, v0, v12, v4, v15}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 347
    .line 348
    .line 349
    throw v1

    .line 350
    :cond_e
    :goto_8
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    iget v5, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzk:I

    .line 355
    .line 356
    const/16 v6, 0x1a0

    .line 357
    .line 358
    if-ne v5, v6, :cond_10

    .line 359
    .line 360
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzhv;->zza(Ljava/lang/String;)J

    .line 365
    .line 366
    .line 367
    move-result-wide v4

    .line 368
    iget-wide v10, v12, Lcom/google/android/gms/internal/ads/zzhf;->zze:J

    .line 369
    .line 370
    cmp-long v4, v10, v4

    .line 371
    .line 372
    if-nez v4, :cond_10

    .line 373
    .line 374
    iput-boolean v15, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzj:Z

    .line 375
    .line 376
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzgt;->zzg(Lcom/google/android/gms/internal/ads/zzhf;)V

    .line 377
    .line 378
    .line 379
    iget-wide v0, v12, Lcom/google/android/gms/internal/ads/zzhf;->zzf:J

    .line 380
    .line 381
    cmp-long v2, v0, v8

    .line 382
    .line 383
    if-eqz v2, :cond_f

    .line 384
    .line 385
    return-wide v0

    .line 386
    :cond_f
    return-wide v18

    .line 387
    :cond_10
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    if-eqz v2, :cond_11

    .line 392
    .line 393
    :try_start_6
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzgxf;->zza(Ljava/io/InputStream;)[B

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    goto :goto_9

    .line 398
    :cond_11
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfj;->zzb:[B
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 399
    .line 400
    goto :goto_9

    .line 401
    :catch_3
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfj;->zzb:[B

    .line 402
    .line 403
    :goto_9
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzhm;->zzm()V

    .line 404
    .line 405
    .line 406
    iget v4, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzk:I

    .line 407
    .line 408
    if-ne v4, v6, :cond_12

    .line 409
    .line 410
    new-instance v4, Lcom/google/android/gms/internal/ads/zzhc;

    .line 411
    .line 412
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/zzhc;-><init>(I)V

    .line 413
    .line 414
    .line 415
    :goto_a
    move-object v6, v2

    .line 416
    move-object v3, v4

    .line 417
    move-object v2, v0

    .line 418
    goto :goto_b

    .line 419
    :cond_12
    const/4 v4, 0x0

    .line 420
    goto :goto_a

    .line 421
    :goto_b
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhs;

    .line 422
    .line 423
    move-object v4, v1

    .line 424
    iget v1, v7, Lcom/google/android/gms/internal/ads/zzhm;->zzk:I

    .line 425
    .line 426
    move-object v5, v12

    .line 427
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzhs;-><init>(ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map;Lcom/google/android/gms/internal/ads/zzhf;[B)V

    .line 428
    .line 429
    .line 430
    throw v0

    .line 431
    :catch_4
    move-exception v0

    .line 432
    goto :goto_d

    .line 433
    :cond_13
    :goto_c
    :try_start_7
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 434
    .line 435
    .line 436
    invoke-direct {v7, v4, v10, v12}, Lcom/google/android/gms/internal/ads/zzhm;->zzl(Ljava/net/URL;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhf;)Ljava/net/URL;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    move-wide v7, v1

    .line 441
    move-object v2, v3

    .line 442
    move v1, v13

    .line 443
    move/from16 v4, v17

    .line 444
    .line 445
    move-wide/from16 v13, v18

    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :catch_5
    move-exception v0

    .line 450
    move-object v7, v1

    .line 451
    goto :goto_d

    .line 452
    :cond_14
    move-object/from16 v7, p0

    .line 453
    .line 454
    move/from16 v17, v3

    .line 455
    .line 456
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhq;

    .line 457
    .line 458
    new-instance v2, Ljava/net/NoRouteToHostException;

    .line 459
    .line 460
    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    add-int/2addr v3, v10

    .line 469
    new-instance v4, Ljava/lang/StringBuilder;

    .line 470
    .line 471
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    move/from16 v10, v17

    .line 478
    .line 479
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-direct {v2, v0}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    const/16 v0, 0x7d1

    .line 490
    .line 491
    invoke-direct {v1, v2, v12, v0, v15}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 492
    .line 493
    .line 494
    throw v1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 495
    :goto_d
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzhm;->zzm()V

    .line 496
    .line 497
    .line 498
    invoke-static {v0, v12, v15}, Lcom/google/android/gms/internal/ads/zzhq;->zza(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;I)Lcom/google/android/gms/internal/ads/zzhq;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    throw v0
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzh:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzg:Lcom/google/android/gms/internal/ads/zzhf;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzhf;->zza:Landroid/net/Uri;

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method

.method public final zzd()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v2

    .line 12
    goto :goto_1

    .line 13
    :catch_0
    move-exception v2

    .line 14
    :try_start_2
    new-instance v3, Lcom/google/android/gms/internal/ads/zzhq;

    .line 15
    .line 16
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzg:Lcom/google/android/gms/internal/ads/zzhf;

    .line 17
    .line 18
    sget-object v5, Lcom/google/android/gms/internal/ads/zzfj;->zza:Ljava/lang/String;

    .line 19
    .line 20
    const/16 v5, 0x7d0

    .line 21
    .line 22
    const/4 v6, 0x3

    .line 23
    invoke-direct {v3, v2, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzhq;-><init>(Ljava/io/IOException;Lcom/google/android/gms/internal/ads/zzhf;II)V

    .line 24
    .line 25
    .line 26
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhm;->zzm()V

    .line 30
    .line 31
    .line 32
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzj:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzj:Z

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgt;->zzi()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzh:Ljava/net/HttpURLConnection;

    .line 42
    .line 43
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzg:Lcom/google/android/gms/internal/ads/zzhf;

    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzi:Ljava/io/InputStream;

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhm;->zzm()V

    .line 49
    .line 50
    .line 51
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzj:Z

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzj:Z

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgt;->zzi()V

    .line 58
    .line 59
    .line 60
    :cond_2
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzh:Ljava/net/HttpURLConnection;

    .line 61
    .line 62
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzg:Lcom/google/android/gms/internal/ads/zzhf;

    .line 63
    .line 64
    throw v2
.end method

.method public final zzj()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhm;->zzh:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgui;->zza()Lcom/google/android/gms/internal/ads/zzgui;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhl;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzhl;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method
