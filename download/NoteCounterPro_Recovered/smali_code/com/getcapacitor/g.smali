.class public final synthetic Lcom/getcapacitor/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsResult;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/getcapacitor/g;->g:I

    iput-object p1, p0, Lcom/getcapacitor/g;->h:Landroid/webkit/JsResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/getcapacitor/g;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/g;->h:Landroid/webkit/JsResult;

    check-cast v0, Landroid/webkit/JsPromptResult;

    invoke-static {v0, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->e(Landroid/webkit/JsPromptResult;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/g;->h:Landroid/webkit/JsResult;

    invoke-static {v0, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->f(Landroid/webkit/JsResult;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/getcapacitor/g;->h:Landroid/webkit/JsResult;

    invoke-static {v0, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->l(Landroid/webkit/JsResult;Landroid/content/DialogInterface;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
