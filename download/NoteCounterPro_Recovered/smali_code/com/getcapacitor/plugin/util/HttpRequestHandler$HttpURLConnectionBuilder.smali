.class public Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/plugin/util/HttpRequestHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HttpURLConnectionBuilder"
.end annotation


# instance fields
.field public connectTimeout:Ljava/lang/Integer;

.field public connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

.field public disableRedirects:Ljava/lang/Boolean;

.field public headers:Lcom/getcapacitor/JSObject;

.field public method:Ljava/lang/String;

.field public readTimeout:Ljava/lang/Integer;

.field public url:Ljava/net/URL;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static addUrlParam(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p0

    .line 15
    new-instance p1, Ljava/lang/RuntimeException;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p1, "="

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public build()Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 2
    .line 3
    return-object v0
.end method

.method public openConnection()Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 2

    .line 1
    new-instance v0, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->url:Ljava/net/URL;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/net/HttpURLConnection;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;-><init>(Ljava/net/HttpURLConnection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setAllowUserInteraction(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->method:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connectTimeout:Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {v1, v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setConnectTimeout(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->readTimeout:Ljava/lang/Integer;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {v1, v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setReadTimeout(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->disableRedirects:Ljava/lang/Boolean;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {v1, v0}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setDisableRedirects(Z)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connection:Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->headers:Lcom/getcapacitor/JSObject;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/getcapacitor/plugin/util/CapacitorHttpUrlConnection;->setRequestHeaders(Lcom/getcapacitor/JSObject;)V

    .line 71
    .line 72
    .line 73
    return-object p0
.end method

.method public setConnectTimeout(Ljava/lang/Integer;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->connectTimeout:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public setDisableRedirects(Ljava/lang/Boolean;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->disableRedirects:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public setHeaders(Lcom/getcapacitor/JSObject;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->headers:Lcom/getcapacitor/JSObject;

    .line 2
    .line 3
    return-object p0
.end method

.method public setMethod(Ljava/lang/String;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->method:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setReadTimeout(Ljava/lang/Integer;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->readTimeout:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public setUrl(Ljava/net/URL;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->url:Ljava/net/URL;

    .line 2
    .line 3
    return-object p0
.end method

.method public setUrlParams(Lcom/getcapacitor/JSObject;)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->setUrlParams(Lcom/getcapacitor/JSObject;Z)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;

    move-result-object p1

    return-object p1
.end method

.method public setUrlParams(Lcom/getcapacitor/JSObject;Z)Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;
    .locals 9

    .line 2
    const-string v0, "&"

    iget-object v1, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->url:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    move-result-object v1

    .line 3
    const-string v2, ""

    if-nez v1, :cond_0

    move-object v1, v2

    .line 4
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    return-object p0

    .line 6
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 8
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 9
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    const/4 v7, 0x0

    .line 11
    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v7, v8, :cond_3

    .line 12
    invoke-virtual {v6, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v1, v8, p2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->addUrlParam(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 13
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-eq v7, v8, :cond_2

    .line 14
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 15
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-lez v6, :cond_4

    .line 16
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    :cond_4
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 18
    :catch_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v5

    if-lez v5, :cond_5

    .line 19
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    :cond_5
    invoke-virtual {p1, v1}, Lcom/getcapacitor/JSObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v1, v5, p2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->addUrlParam(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 21
    :cond_6
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 22
    iget-object p2, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->url:Ljava/net/URL;

    invoke-virtual {p2}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object p2

    .line 23
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    invoke-virtual {p2}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {p2}, Ljava/net/URI;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    invoke-virtual {p2}, Ljava/net/URI;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "?"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_7
    move-object p1, v2

    :goto_2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {p2}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Ljava/net/URI;->getFragment()Ljava/lang/String;

    move-result-object v2

    :cond_8
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    new-instance p2, Ljava/net/URL;

    invoke-direct {p2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/getcapacitor/plugin/util/HttpRequestHandler$HttpURLConnectionBuilder;->url:Ljava/net/URL;

    return-object p0
.end method
