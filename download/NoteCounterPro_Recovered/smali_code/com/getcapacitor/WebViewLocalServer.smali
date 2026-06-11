.class public Lcom/getcapacitor/WebViewLocalServer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/getcapacitor/WebViewLocalServer$PathHandler;,
        Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;,
        Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;
    }
.end annotation


# static fields
.field private static final capacitorContentStart:Ljava/lang/String; = "/_capacitor_content_"

.field private static final capacitorFileStart:Ljava/lang/String; = "/_capacitor_file_"


# instance fields
.field private final authorities:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private basePath:Ljava/lang/String;

.field private final bridge:Lcom/getcapacitor/Bridge;

.field private final html5mode:Z

.field private isAsset:Z

.field private final jsInjector:Lcom/getcapacitor/JSInjector;

.field private final protocolHandler:Lcom/getcapacitor/AndroidProtocolHandler;

.field private final uriMatcher:Lcom/getcapacitor/UriMatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/getcapacitor/Bridge;Lcom/getcapacitor/JSInjector;Ljava/util/ArrayList;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/getcapacitor/Bridge;",
            "Lcom/getcapacitor/JSInjector;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/getcapacitor/UriMatcher;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/getcapacitor/UriMatcher;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->uriMatcher:Lcom/getcapacitor/UriMatcher;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/getcapacitor/WebViewLocalServer;->html5mode:Z

    .line 13
    .line 14
    new-instance p5, Lcom/getcapacitor/AndroidProtocolHandler;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {p5, p1}, Lcom/getcapacitor/AndroidProtocolHandler;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iput-object p5, p0, Lcom/getcapacitor/WebViewLocalServer;->protocolHandler:Lcom/getcapacitor/AndroidProtocolHandler;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/getcapacitor/WebViewLocalServer;->authorities:Ljava/util/ArrayList;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 28
    .line 29
    iput-object p3, p0, Lcom/getcapacitor/WebViewLocalServer;->jsInjector:Lcom/getcapacitor/JSInjector;

    .line 30
    .line 31
    return-void
.end method

.method public static bridge synthetic a(Lcom/getcapacitor/WebViewLocalServer;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/getcapacitor/WebViewLocalServer;)Lcom/getcapacitor/Bridge;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/getcapacitor/WebViewLocalServer;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/getcapacitor/WebViewLocalServer;->isAsset:Z

    return p0
.end method

.method private createHostingDetails()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x2a

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-ne v1, v2, :cond_2

    .line 11
    .line 12
    new-instance v1, Lcom/getcapacitor/WebViewLocalServer$1;

    .line 13
    .line 14
    invoke-direct {v1, p0, v0}, Lcom/getcapacitor/WebViewLocalServer$1;-><init>(Lcom/getcapacitor/WebViewLocalServer;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->authorities:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    check-cast v4, Ljava/lang/String;

    .line 33
    .line 34
    const-string v5, "http"

    .line 35
    .line 36
    invoke-direct {p0, v5, v1, v4}, Lcom/getcapacitor/WebViewLocalServer;->registerUriForScheme(Ljava/lang/String;Lcom/getcapacitor/WebViewLocalServer$PathHandler;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v6, "https"

    .line 40
    .line 41
    invoke-direct {p0, v6, v1, v4}, Lcom/getcapacitor/WebViewLocalServer;->registerUriForScheme(Ljava/lang/String;Lcom/getcapacitor/WebViewLocalServer$PathHandler;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v7, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 45
    .line 46
    invoke-virtual {v7}, Lcom/getcapacitor/Bridge;->getScheme()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-nez v5, :cond_0

    .line 61
    .line 62
    invoke-direct {p0, v7, v1, v4}, Lcom/getcapacitor/WebViewLocalServer;->registerUriForScheme(Ljava/lang/String;Lcom/getcapacitor/WebViewLocalServer$PathHandler;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-void

    .line 67
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string v1, "assetPath cannot contain the \'*\' character."

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public static bridge synthetic d(Lcom/getcapacitor/WebViewLocalServer;)Lcom/getcapacitor/AndroidProtocolHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/WebViewLocalServer;->protocolHandler:Lcom/getcapacitor/AndroidProtocolHandler;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/getcapacitor/WebViewLocalServer;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/WebViewLocalServer;->isAsset:Z

    return-void
.end method

.method private getMimeType(Ljava/lang/String;Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    invoke-static {p1}, Ljava/net/URLConnection;->guessContentTypeFromName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 5
    const-string v1, ".js"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-string v2, "image/x-icon"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const-string v2, "We shouldn\'t be here"

    .line 24
    .line 25
    invoke-static {v2}, Lcom/getcapacitor/Logger;->debug(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception p2

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    :goto_0
    if-nez v0, :cond_4

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    const-string v1, ".mjs"

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string v1, ".wasm"

    .line 49
    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    const-string p1, "application/wasm"

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_2
    invoke-static {p2}, Ljava/net/URLConnection;->guessContentTypeFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1

    .line 64
    :cond_3
    :goto_1
    const-string p1, "application/javascript"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_4
    return-object v0

    .line 68
    :catch_1
    move-exception p2

    .line 69
    const/4 v0, 0x0

    .line 70
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v2, "Unable to get mime type"

    .line 73
    .line 74
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1, p2}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method private getReasonPhraseFromResponseCode(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    const/16 v0, 0x65

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x190

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x191

    .line 14
    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    packed-switch p1, :pswitch_data_1

    .line 21
    .line 22
    .line 23
    packed-switch p1, :pswitch_data_2

    .line 24
    .line 25
    .line 26
    packed-switch p1, :pswitch_data_3

    .line 27
    .line 28
    .line 29
    const-string p1, "Unknown"

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_0
    const-string p1, "HTTP Version Not Supported"

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_1
    const-string p1, "Gateway Timeout"

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_2
    const-string p1, "Service Unavailable"

    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_3
    const-string p1, "Bad Gateway"

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_4
    const-string p1, "Not Implemented"

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_5
    const-string p1, "Internal Server Error"

    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_6
    const-string p1, "Gone"

    .line 51
    .line 52
    return-object p1

    .line 53
    :pswitch_7
    const-string p1, "Conflict"

    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_8
    const-string p1, "Request Timeout"

    .line 57
    .line 58
    return-object p1

    .line 59
    :pswitch_9
    const-string p1, "Proxy Authentication Required"

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_a
    const-string p1, "Not Acceptable"

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_b
    const-string p1, "Method Not Allowed"

    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_c
    const-string p1, "Not Found"

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_d
    const-string p1, "Forbidden"

    .line 72
    .line 73
    return-object p1

    .line 74
    :pswitch_e
    const-string p1, "Not Modified"

    .line 75
    .line 76
    return-object p1

    .line 77
    :pswitch_f
    const-string p1, "See Other"

    .line 78
    .line 79
    return-object p1

    .line 80
    :pswitch_10
    const-string p1, "Found"

    .line 81
    .line 82
    return-object p1

    .line 83
    :pswitch_11
    const-string p1, "Moved Permanently"

    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_12
    const-string p1, "Multiple Choices"

    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_13
    const-string p1, "Partial Content"

    .line 90
    .line 91
    return-object p1

    .line 92
    :pswitch_14
    const-string p1, "Reset Content"

    .line 93
    .line 94
    return-object p1

    .line 95
    :pswitch_15
    const-string p1, "No Content"

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_16
    const-string p1, "Non-Authoritative Information"

    .line 99
    .line 100
    return-object p1

    .line 101
    :pswitch_17
    const-string p1, "Accepted"

    .line 102
    .line 103
    return-object p1

    .line 104
    :pswitch_18
    const-string p1, "Created"

    .line 105
    .line 106
    return-object p1

    .line 107
    :pswitch_19
    const-string p1, "OK"

    .line 108
    .line 109
    return-object p1

    .line 110
    :cond_0
    const-string p1, "Unauthorized"

    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_1
    const-string p1, "Bad Request"

    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_2
    const-string p1, "Switching Protocols"

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_3
    const-string p1, "Continue"

    .line 120
    .line 121
    return-object p1

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0xc8
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    :pswitch_data_1
    .packed-switch 0x12c
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    :pswitch_data_2
    .packed-switch 0x193
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    :pswitch_data_3
    .packed-switch 0x1f4
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getStatusCode(Ljava/io/InputStream;I)I
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    .line 2
    .line 3
    .line 4
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x194

    .line 9
    .line 10
    return p1

    .line 11
    :cond_0
    return p2

    .line 12
    :catch_0
    const/16 p1, 0x1f4

    .line 13
    .line 14
    return p1
.end method

.method private handleCapacitorHttpRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 9

    .line 1
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "u"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/net/URL;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/util/Map$Entry;

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v4, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string v2, "x-cap-user-agent"

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lcom/getcapacitor/JSObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    const-string v4, "User-Agent"

    .line 70
    .line 71
    invoke-virtual {v0, v4, v3}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v2, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 78
    .line 79
    invoke-direct {v2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setUrl(Ljava/net/URL;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v2, v3}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setMethod(Ljava/lang/String;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2, v0}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setHeaders(Lcom/getcapacitor/JSObject;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->openConnection()Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->build()Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v2, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 107
    .line 108
    invoke-static {v2, v1}, Lcom/getcapacitor/plugin/util/HttpRequestHandler;->isDomainExcludedFromSSL(Lcom/getcapacitor/Bridge;Ljava/net/URL;)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_2

    .line 117
    .line 118
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setSSLSocketFactory(Lcom/getcapacitor/Bridge;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->connect()V

    .line 124
    .line 125
    .line 126
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->getHeaderFields()Ljava/util/Map;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    const/4 v2, 0x0

    .line 144
    move-object v4, v2

    .line 145
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_6

    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, Ljava/util/Map$Entry;

    .line 156
    .line 157
    new-instance v5, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Ljava/util/List;

    .line 167
    .line 168
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    if-eqz v8, :cond_3

    .line 177
    .line 178
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    check-cast v8, Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v8, ", "

    .line 188
    .line 189
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_3
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    add-int/lit8 v6, v6, -0x2

    .line 198
    .line 199
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Ljava/lang/String;

    .line 207
    .line 208
    const-string v8, "Content-Type"

    .line 209
    .line 210
    invoke-virtual {v8, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    if-eqz v6, :cond_5

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    const-string v3, ";"

    .line 221
    .line 222
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    const/4 v3, 0x0

    .line 227
    aget-object v3, v2, v3

    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    array-length v5, v2

    .line 234
    const/4 v6, 0x1

    .line 235
    if-le v5, v6, :cond_4

    .line 236
    .line 237
    aget-object v2, v2, v6

    .line 238
    .line 239
    const-string v5, "="

    .line 240
    .line 241
    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    array-length v5, v2

    .line 246
    if-le v5, v6, :cond_4

    .line 247
    .line 248
    aget-object v2, v2, v6

    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    :cond_4
    move-object v2, v3

    .line 255
    goto :goto_1

    .line 256
    :cond_5
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    check-cast v3, Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-interface {v7, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_6
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->getErrorStream()Ljava/io/InputStream;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    if-nez v1, :cond_7

    .line 275
    .line 276
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->getInputStream()Ljava/io/InputStream;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    :cond_7
    move-object v8, v1

    .line 281
    if-nez v2, :cond_8

    .line 282
    .line 283
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-direct {p0, p1, v8}, Lcom/getcapacitor/WebViewLocalServer;->getMimeType(Ljava/lang/String;Ljava/io/InputStream;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    :cond_8
    move-object v3, v2

    .line 296
    invoke-virtual {v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->getResponseCode()I

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    invoke-direct {p0, v5}, Lcom/getcapacitor/WebViewLocalServer;->getReasonPhraseFromResponseCode(I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    new-instance v2, Landroid/webkit/WebResourceResponse;

    .line 305
    .line 306
    invoke-direct/range {v2 .. v8}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 307
    .line 308
    .line 309
    return-object v2
.end method

.method private handleLocalRequest(Landroid/webkit/WebResourceRequest;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)Landroid/webkit/WebResourceResponse;
    .locals 13

    .line 1
    const-string v0, "/index.html"

    .line 2
    .line 3
    const-string v1, "-"

    .line 4
    .line 5
    const-string v2, "bytes "

    .line 6
    .line 7
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "Range"

    .line 20
    .line 21
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    :goto_0
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const-string v5, "range"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    const-string v5, "/"

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    new-instance v12, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;

    .line 42
    .line 43
    invoke-direct {v12, p2, p1}, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;-><init>(Lcom/getcapacitor/WebViewLocalServer$PathHandler;Landroid/webkit/WebResourceRequest;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, v3, v12}, Lcom/getcapacitor/WebViewLocalServer;->getMimeType(Ljava/lang/String;Ljava/io/InputStream;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->buildDefaultResponseHeaders()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    :try_start_0
    invoke-virtual {v12}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->available()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const-string v0, "="

    .line 59
    .line 60
    invoke-virtual {v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v3, 0x1

    .line 65
    aget-object v0, v0, v3

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v4, 0x0

    .line 72
    aget-object v4, v0, v4

    .line 73
    .line 74
    add-int/lit8 v6, p1, -0x1

    .line 75
    .line 76
    array-length v8, v0

    .line 77
    if-le v8, v3, :cond_1

    .line 78
    .line 79
    aget-object v0, v0, v3

    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    :cond_1
    const-string v0, "Accept-Ranges"

    .line 86
    .line 87
    const-string v3, "bytes"

    .line 88
    .line 89
    invoke-interface {v11, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    const-string v0, "Content-Range"

    .line 93
    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-interface {v11, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    .line 121
    const/16 p1, 0xce

    .line 122
    .line 123
    :goto_2
    move v9, p1

    .line 124
    goto :goto_3

    .line 125
    :catch_0
    const/16 p1, 0x194

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :goto_3
    new-instance v6, Landroid/webkit/WebResourceResponse;

    .line 129
    .line 130
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getEncoding()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getReasonPhrase()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-direct/range {v6 .. v12}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 139
    .line 140
    .line 141
    return-object v6

    .line 142
    :cond_2
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-direct {p0, v1}, Lcom/getcapacitor/WebViewLocalServer;->isLocalFile(Landroid/net/Uri;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-nez v1, :cond_d

    .line 151
    .line 152
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-direct {p0, v1}, Lcom/getcapacitor/WebViewLocalServer;->isErrorUrl(Landroid/net/Uri;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_3

    .line 161
    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_3
    const-string v1, "/cordova.js"

    .line 165
    .line 166
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_4

    .line 171
    .line 172
    new-instance v6, Landroid/webkit/WebResourceResponse;

    .line 173
    .line 174
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getEncoding()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getStatusCode()I

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getReasonPhrase()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->buildDefaultResponseHeaders()Ljava/util/Map;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    const/4 v12, 0x0

    .line 191
    const-string v7, "application/javascript"

    .line 192
    .line 193
    invoke-direct/range {v6 .. v12}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 194
    .line 195
    .line 196
    return-object v6

    .line 197
    :cond_4
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    const/4 v2, 0x0

    .line 202
    if-nez v1, :cond_9

    .line 203
    .line 204
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-string v4, "."

    .line 213
    .line 214
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-nez v1, :cond_5

    .line 219
    .line 220
    iget-boolean v1, p0, Lcom/getcapacitor/WebViewLocalServer;->html5mode:Z

    .line 221
    .line 222
    if-eqz v1, :cond_5

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_5
    const-string v0, "/favicon.ico"

    .line 226
    .line 227
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_6

    .line 232
    .line 233
    :try_start_1
    new-instance v0, Landroid/webkit/WebResourceResponse;

    .line 234
    .line 235
    const-string v1, "image/png"

    .line 236
    .line 237
    invoke-direct {v0, v1, v2, v2}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 238
    .line 239
    .line 240
    return-object v0

    .line 241
    :catch_1
    move-exception v0

    .line 242
    const-string v1, "favicon handling failed"

    .line 243
    .line 244
    invoke-static {v1, v0}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    :cond_6
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-ltz v0, :cond_8

    .line 252
    .line 253
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    new-instance v1, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;

    .line 262
    .line 263
    invoke-direct {v1, p2, p1}, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;-><init>(Lcom/getcapacitor/WebViewLocalServer$PathHandler;Landroid/webkit/WebResourceRequest;)V

    .line 264
    .line 265
    .line 266
    const-string p1, ".html"

    .line 267
    .line 268
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    if-eqz p1, :cond_7

    .line 273
    .line 274
    iget-object p1, p0, Lcom/getcapacitor/WebViewLocalServer;->jsInjector:Lcom/getcapacitor/JSInjector;

    .line 275
    .line 276
    if-eqz p1, :cond_7

    .line 277
    .line 278
    invoke-virtual {p1, v1}, Lcom/getcapacitor/JSInjector;->getInjectedStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    :cond_7
    move-object v10, v1

    .line 283
    invoke-direct {p0, v3, v10}, Lcom/getcapacitor/WebViewLocalServer;->getMimeType(Ljava/lang/String;Ljava/io/InputStream;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getStatusCode()I

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    invoke-direct {p0, v10, p1}, Lcom/getcapacitor/WebViewLocalServer;->getStatusCode(Ljava/io/InputStream;I)I

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    new-instance v4, Landroid/webkit/WebResourceResponse;

    .line 296
    .line 297
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getEncoding()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getReasonPhrase()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->buildDefaultResponseHeaders()Ljava/util/Map;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-direct/range {v4 .. v10}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 310
    .line 311
    .line 312
    return-object v4

    .line 313
    :cond_8
    return-object v2

    .line 314
    :cond_9
    :goto_4
    :try_start_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    .line 320
    .line 321
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 332
    .line 333
    invoke-virtual {v1}, Lcom/getcapacitor/Bridge;->getRouteProcessor()Lcom/getcapacitor/RouteProcessor;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    if-eqz v1, :cond_a

    .line 338
    .line 339
    iget-object p1, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 340
    .line 341
    invoke-virtual {p1}, Lcom/getcapacitor/Bridge;->getRouteProcessor()Lcom/getcapacitor/RouteProcessor;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    .line 346
    .line 347
    invoke-interface {p1, v1, v0}, Lcom/getcapacitor/RouteProcessor;->process(Ljava/lang/String;Ljava/lang/String;)Lcom/getcapacitor/ProcessedRoute;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    invoke-virtual {p1}, Lcom/getcapacitor/ProcessedRoute;->getPath()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {p1}, Lcom/getcapacitor/ProcessedRoute;->isAsset()Z

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    iput-boolean p1, p0, Lcom/getcapacitor/WebViewLocalServer;->isAsset:Z

    .line 360
    .line 361
    move-object p1, v0

    .line 362
    goto :goto_5

    .line 363
    :catch_2
    move-exception v0

    .line 364
    move-object p1, v0

    .line 365
    goto :goto_7

    .line 366
    :cond_a
    :goto_5
    iget-boolean v0, p0, Lcom/getcapacitor/WebViewLocalServer;->isAsset:Z

    .line 367
    .line 368
    if-eqz v0, :cond_b

    .line 369
    .line 370
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->protocolHandler:Lcom/getcapacitor/AndroidProtocolHandler;

    .line 371
    .line 372
    invoke-virtual {v0, p1}, Lcom/getcapacitor/AndroidProtocolHandler;->openAsset(Ljava/lang/String;)Ljava/io/InputStream;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    goto :goto_6

    .line 377
    :cond_b
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->protocolHandler:Lcom/getcapacitor/AndroidProtocolHandler;

    .line 378
    .line 379
    invoke-virtual {v0, p1}, Lcom/getcapacitor/AndroidProtocolHandler;->openFile(Ljava/lang/String;)Ljava/io/InputStream;

    .line 380
    .line 381
    .line 382
    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 383
    :goto_6
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->jsInjector:Lcom/getcapacitor/JSInjector;

    .line 384
    .line 385
    if-eqz v0, :cond_c

    .line 386
    .line 387
    invoke-virtual {v0, p1}, Lcom/getcapacitor/JSInjector;->getInjectedStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    :cond_c
    move-object v6, p1

    .line 392
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getStatusCode()I

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    invoke-direct {p0, v6, p1}, Lcom/getcapacitor/WebViewLocalServer;->getStatusCode(Ljava/io/InputStream;I)I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    new-instance v0, Landroid/webkit/WebResourceResponse;

    .line 401
    .line 402
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getEncoding()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getReasonPhrase()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->buildDefaultResponseHeaders()Ljava/util/Map;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    const-string v1, "text/html"

    .line 415
    .line 416
    invoke-direct/range {v0 .. v6}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 417
    .line 418
    .line 419
    return-object v0

    .line 420
    :goto_7
    const-string p2, "Unable to open index.html"

    .line 421
    .line 422
    invoke-static {p2, p1}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    return-object v2

    .line 426
    :cond_d
    :goto_8
    new-instance v9, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;

    .line 427
    .line 428
    invoke-direct {v9, p2, p1}, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;-><init>(Lcom/getcapacitor/WebViewLocalServer$PathHandler;Landroid/webkit/WebResourceRequest;)V

    .line 429
    .line 430
    .line 431
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-direct {p0, p1, v9}, Lcom/getcapacitor/WebViewLocalServer;->getMimeType(Ljava/lang/String;Ljava/io/InputStream;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getStatusCode()I

    .line 444
    .line 445
    .line 446
    move-result p1

    .line 447
    invoke-direct {p0, v9, p1}, Lcom/getcapacitor/WebViewLocalServer;->getStatusCode(Ljava/io/InputStream;I)I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    new-instance v3, Landroid/webkit/WebResourceResponse;

    .line 452
    .line 453
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getEncoding()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getReasonPhrase()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->buildDefaultResponseHeaders()Ljava/util/Map;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    invoke-direct/range {v3 .. v9}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V

    .line 466
    .line 467
    .line 468
    return-object v3
.end method

.method private handleProxyRequest(Landroid/webkit/WebResourceRequest;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)Landroid/webkit/WebResourceResponse;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->jsInjector:Lcom/getcapacitor/JSInjector;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "GET"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    :try_start_0
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Ljava/lang/String;

    .line 54
    .line 55
    const-string v6, "Accept"

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_0

    .line 62
    .line 63
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "text/html"

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_0

    .line 80
    .line 81
    new-instance v3, Ljava/net/URL;

    .line 82
    .line 83
    invoke-direct {v3, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_1

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Ljava/util/Map$Entry;

    .line 111
    .line 112
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    check-cast v4, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v3, v5, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catch_0
    move-exception v0

    .line 129
    move-object p1, v0

    .line 130
    goto/16 :goto_2

    .line 131
    .line 132
    :cond_1
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2, v1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    const-string v4, "Cookie"

    .line 143
    .line 144
    invoke-virtual {v3, v4, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const/16 v0, 0x7530

    .line 151
    .line 152
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    .line 168
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Landroid/net/Uri;->getUserInfo()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 177
    .line 178
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const/4 v0, 0x2

    .line 183
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    const-string v0, "Authorization"

    .line 188
    .line 189
    new-instance v2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v4, "Basic "

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {v3, v0, p1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_3
    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    const-string v0, "Set-Cookie"

    .line 214
    .line 215
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    check-cast p1, Ljava/util/List;

    .line 220
    .line 221
    if-eqz p1, :cond_4

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_4

    .line 232
    .line 233
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, Ljava/lang/String;

    .line 238
    .line 239
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v2, v1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_4
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->jsInjector:Lcom/getcapacitor/JSInjector;

    .line 252
    .line 253
    invoke-virtual {v0, p1}, Lcom/getcapacitor/JSInjector;->getInjectedStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    new-instance v1, Landroid/webkit/WebResourceResponse;

    .line 258
    .line 259
    const-string v2, "text/html"

    .line 260
    .line 261
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getEncoding()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getStatusCode()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->getReasonPhrase()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {p2}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->buildDefaultResponseHeaders()Ljava/util/Map;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    invoke-direct/range {v1 .. v7}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    .line 279
    .line 280
    return-object v1

    .line 281
    :goto_2
    iget-object p2, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 282
    .line 283
    invoke-virtual {p2, p1}, Lcom/getcapacitor/Bridge;->handleAppUrlLoadError(Ljava/lang/Exception;)V

    .line 284
    .line 285
    .line 286
    :cond_5
    const/4 p1, 0x0

    .line 287
    return-object p1
.end method

.method private isAllowedUrl(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getServerUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getAppAllowNavigationMask()Lcom/getcapacitor/util/HostMask;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {v0, p1}, Lcom/getcapacitor/util/HostMask;->matches(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 29
    return p1
.end method

.method private isErrorUrl(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getErrorUrl()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method private isLocalFile(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "/_capacitor_content_"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "/_capacitor_file_"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method private isMainUrl(Landroid/net/Uri;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getServerUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->bridge:Lcom/getcapacitor/Bridge;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getHost()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method private static parseAndVerifyUrl(Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    const-string v1, "Malformed URL: "

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-object v1

    .line 35
    :cond_3
    :goto_0
    const-string v1, "URL does not have a path: "

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method private registerUriForScheme(Ljava/lang/String;Lcom/getcapacitor/WebViewLocalServer$PathHandler;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/net/Uri$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p3}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 10
    .line 11
    .line 12
    const-string p1, ""

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p3, "/"

    .line 22
    .line 23
    invoke-static {p1, p3}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p0, p3, p2}, Lcom/getcapacitor/WebViewLocalServer;->register(Landroid/net/Uri;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)V

    .line 28
    .line 29
    .line 30
    const-string p3, "**"

    .line 31
    .line 32
    invoke-static {p1, p3}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/getcapacitor/WebViewLocalServer;->register(Landroid/net/Uri;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public getBasePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getJavaScriptInjectedStream(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->jsInjector:Lcom/getcapacitor/JSInjector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/getcapacitor/JSInjector;->getInjectedStream(Ljava/io/InputStream;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    return-object p1
.end method

.method public hostAssets(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/getcapacitor/WebViewLocalServer;->isAsset:Z

    .line 3
    .line 4
    iput-object p1, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer;->createHostingDetails()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public hostFiles(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/getcapacitor/WebViewLocalServer;->isAsset:Z

    .line 3
    .line 4
    iput-object p1, p0, Lcom/getcapacitor/WebViewLocalServer;->basePath:Ljava/lang/String;

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer;->createHostingDetails()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public register(Landroid/net/Uri;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer;->uriMatcher:Lcom/getcapacitor/UriMatcher;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer;->uriMatcher:Lcom/getcapacitor/UriMatcher;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v1, v2, v3, p1, p2}, Lcom/getcapacitor/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p1
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 5

    .line 1
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v3, "/_capacitor_http_interceptor_"

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "Handling CapacitorHttp request: "

    .line 27
    .line 28
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lcom/getcapacitor/Logger;->debug(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    invoke-direct {p0, p1}, Lcom/getcapacitor/WebViewLocalServer;->handleCapacitorHttpRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    return-object p1

    .line 46
    :catch_0
    move-exception p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lcom/getcapacitor/Logger;->error(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v2

    .line 55
    :cond_0
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer;->uriMatcher:Lcom/getcapacitor/UriMatcher;

    .line 56
    .line 57
    monitor-enter v1

    .line 58
    :try_start_1
    iget-object v3, p0, Lcom/getcapacitor/WebViewLocalServer;->uriMatcher:Lcom/getcapacitor/UriMatcher;

    .line 59
    .line 60
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v3, v4}, Lcom/getcapacitor/UriMatcher;->match(Landroid/net/Uri;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    check-cast v3, Lcom/getcapacitor/WebViewLocalServer$PathHandler;

    .line 69
    .line 70
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    if-nez v3, :cond_1

    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_1
    invoke-direct {p0, v0}, Lcom/getcapacitor/WebViewLocalServer;->isLocalFile(Landroid/net/Uri;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    invoke-direct {p0, v0}, Lcom/getcapacitor/WebViewLocalServer;->isMainUrl(Landroid/net/Uri;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    invoke-direct {p0, v0}, Lcom/getcapacitor/WebViewLocalServer;->isAllowedUrl(Landroid/net/Uri;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-direct {p0, v0}, Lcom/getcapacitor/WebViewLocalServer;->isErrorUrl(Landroid/net/Uri;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    invoke-direct {p0, p1, v3}, Lcom/getcapacitor/WebViewLocalServer;->handleProxyRequest(Landroid/webkit/WebResourceRequest;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)Landroid/webkit/WebResourceResponse;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v1, "Handling local request: "

    .line 107
    .line 108
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v0}, Lcom/getcapacitor/Logger;->debug(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {p0, p1, v3}, Lcom/getcapacitor/WebViewLocalServer;->handleLocalRequest(Landroid/webkit/WebResourceRequest;Lcom/getcapacitor/WebViewLocalServer$PathHandler;)Landroid/webkit/WebResourceResponse;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    return-object p1

    .line 134
    :catchall_0
    move-exception p1

    .line 135
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    throw p1
.end method
