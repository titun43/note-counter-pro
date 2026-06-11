.class final synthetic Lcom/google/android/gms/internal/ads/zzcht;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfxz;


# instance fields
.field private final synthetic zza:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcht;->zza:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/net/URLConnection;
    .locals 8

    .line 1
    sget v0, Lcom/google/android/gms/internal/ads/zzchu;->zzd:I

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzq()Lcom/google/android/gms/internal/ads/zzceo;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhe;->zzaj:Lcom/google/android/gms/internal/ads/zzbgv;

    .line 7
    .line 8
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzbd;->zzc()Lcom/google/android/gms/internal/ads/zzbhc;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbhc;->zzd(Lcom/google/android/gms/internal/ads/zzbgv;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-instance v1, Ljava/net/URL;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcht;->zza:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    move v3, v2

    .line 31
    :goto_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    const/16 v4, 0x14

    .line 34
    .line 35
    if-gt v3, v4, :cond_6

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 45
    .line 46
    .line 47
    instance-of v5, v4, Ljava/net/HttpURLConnection;

    .line 48
    .line 49
    if-eqz v5, :cond_5

    .line 50
    .line 51
    check-cast v4, Ljava/net/HttpURLConnection;

    .line 52
    .line 53
    new-instance v5, Lcom/google/android/gms/ads/internal/util/client/zzl;

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-direct {v5, v6}, Lcom/google/android/gms/ads/internal/util/client/zzl;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v4, v6}, Lcom/google/android/gms/ads/internal/util/client/zzl;->zza(Ljava/net/HttpURLConnection;[B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    invoke-virtual {v5, v4, v6}, Lcom/google/android/gms/ads/internal/util/client/zzl;->zzc(Ljava/net/HttpURLConnection;I)V

    .line 70
    .line 71
    .line 72
    div-int/lit8 v6, v6, 0x64

    .line 73
    .line 74
    const/4 v5, 0x3

    .line 75
    if-ne v6, v5, :cond_4

    .line 76
    .line 77
    const-string v5, "Location"

    .line 78
    .line 79
    invoke-virtual {v4, v5}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    new-instance v6, Ljava/net/URL;

    .line 86
    .line 87
    invoke-direct {v6, v1, v5}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    const-string v7, "http"

    .line 97
    .line 98
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-nez v7, :cond_1

    .line 103
    .line 104
    const-string v7, "https"

    .line 105
    .line 106
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-eqz v7, :cond_0

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_0
    const-string v0, "Unsupported scheme: "

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v1, Ljava/io/IOException;

    .line 120
    .line 121
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v1

    .line 125
    :cond_1
    :goto_1
    const-string v1, "Redirecting to "

    .line 126
    .line 127
    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget v5, Lcom/google/android/gms/ads/internal/util/zze;->zza:I

    .line 132
    .line 133
    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/client/zzo;->zzd(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 137
    .line 138
    .line 139
    move-object v1, v6

    .line 140
    goto :goto_0

    .line 141
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 142
    .line 143
    const-string v1, "Protocol is null"

    .line 144
    .line 145
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0

    .line 149
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 150
    .line 151
    const-string v1, "Missing Location header in redirect"

    .line 152
    .line 153
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :cond_4
    return-object v4

    .line 158
    :cond_5
    new-instance v0, Ljava/io/IOException;

    .line 159
    .line 160
    const-string v1, "Invalid protocol."

    .line 161
    .line 162
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw v0

    .line 166
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 167
    .line 168
    const-string v1, "Too many redirects (20)"

    .line 169
    .line 170
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw v0
.end method
