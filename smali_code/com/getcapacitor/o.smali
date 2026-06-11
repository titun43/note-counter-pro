.class public final synthetic Lcom/getcapacitor/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/b;
.implements Lcom/getcapacitor/BridgeWebChromeClient$ActivityResultListener;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/getcapacitor/o;->g:I

    iput-object p2, p0, Lcom/getcapacitor/o;->h:Ljava/lang/Object;

    iput-object p3, p0, Lcom/getcapacitor/o;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/getcapacitor/o;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/o;->h:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/Plugin;

    iget-object v1, p0, Lcom/getcapacitor/o;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Method;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, v1, p1}, Lcom/getcapacitor/Plugin;->b(Lcom/getcapacitor/Plugin;Ljava/lang/reflect/Method;Ljava/util/Map;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/o;->h:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/Plugin;

    iget-object v1, p0, Lcom/getcapacitor/o;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Method;

    check-cast p1, Ld/a;

    invoke-static {v0, v1, p1}, Lcom/getcapacitor/Plugin;->a(Lcom/getcapacitor/Plugin;Ljava/lang/reflect/Method;Ld/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onActivityResult(Ld/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/o;->h:Ljava/lang/Object;

    check-cast v0, Landroid/net/Uri;

    iget-object v1, p0, Lcom/getcapacitor/o;->i:Ljava/lang/Object;

    check-cast v1, Landroid/webkit/ValueCallback;

    invoke-static {v0, v1, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->n(Landroid/net/Uri;Landroid/webkit/ValueCallback;Ld/a;)V

    return-void
.end method
