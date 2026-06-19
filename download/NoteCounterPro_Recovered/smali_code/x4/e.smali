.class public final Lx4/e;
.super Landroid/webkit/ServiceWorkerClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lx4/f;


# direct methods
.method public constructor <init>(Lx4/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx4/e;->a:Lx4/f;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/webkit/ServiceWorkerClient;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/e;->a:Lx4/f;

    .line 2
    .line 3
    iget-object v0, v0, Lx4/f;->b:Lu1/f;

    .line 4
    .line 5
    invoke-interface {p1}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p1}, Lu1/f;->n(Landroid/net/Uri;)Landroid/webkit/WebResourceResponse;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
