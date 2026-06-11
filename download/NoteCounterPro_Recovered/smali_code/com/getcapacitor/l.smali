.class public final synthetic Lcom/getcapacitor/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/getcapacitor/BridgeWebChromeClient$PermissionListener;
.implements Lj1/e;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/l;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPermissionSelect(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/l;->a:Ljava/lang/Object;

    check-cast v0, Landroid/webkit/PermissionRequest;

    invoke-static {v0, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->d(Landroid/webkit/PermissionRequest;Ljava/lang/Boolean;)V

    return-void
.end method

.method public onPostMessage(Landroid/webkit/WebView;Lj1/c;Landroid/net/Uri;ZLj1/a;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/l;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/getcapacitor/MessageHandler;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Lcom/getcapacitor/MessageHandler;->a(Lcom/getcapacitor/MessageHandler;Landroid/webkit/WebView;Lj1/c;Landroid/net/Uri;ZLj1/a;)V

    return-void
.end method
