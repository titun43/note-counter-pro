.class abstract Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/WebViewLocalServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "LazyInputStream"
.end annotation


# instance fields
.field protected final handler:Lcom/getcapacitor/WebViewLocalServer$PathHandler;

.field private is:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/WebViewLocalServer$PathHandler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->is:Ljava/io/InputStream;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->handler:Lcom/getcapacitor/WebViewLocalServer$PathHandler;

    .line 8
    .line 9
    return-void
.end method

.method private getInputStream()Ljava/io/InputStream;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->is:Ljava/io/InputStream;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->handle()Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->is:Ljava/io/InputStream;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->is:Ljava/io/InputStream;

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public available()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->getInputStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, -0x1

    .line 13
    return v0
.end method

.method public abstract handle()Ljava/io/InputStream;
.end method

.method public read()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public read([B)I
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public read([BII)I
    .locals 1

    .line 5
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public skip(J)J
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->getInputStream()Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    return-wide p1

    .line 12
    :cond_0
    const-wide/16 p1, 0x0

    .line 13
    .line 14
    return-wide p1
.end method
