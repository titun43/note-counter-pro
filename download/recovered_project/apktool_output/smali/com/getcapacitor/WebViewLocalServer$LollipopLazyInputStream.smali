.class Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;
.super Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/WebViewLocalServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LollipopLazyInputStream"
.end annotation


# instance fields
.field private is:Ljava/io/InputStream;

.field private request:Landroid/webkit/WebResourceRequest;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/WebViewLocalServer$PathHandler;Landroid/webkit/WebResourceRequest;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;-><init>(Lcom/getcapacitor/WebViewLocalServer$PathHandler;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;->request:Landroid/webkit/WebResourceRequest;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handle()Ljava/io/InputStream;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/WebViewLocalServer$LazyInputStream;->handler:Lcom/getcapacitor/WebViewLocalServer$PathHandler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/WebViewLocalServer$LollipopLazyInputStream;->request:Landroid/webkit/WebResourceRequest;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/getcapacitor/WebViewLocalServer$PathHandler;->handle(Landroid/webkit/WebResourceRequest;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
