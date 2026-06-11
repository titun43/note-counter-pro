.class public final synthetic Lcom/getcapacitor/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/b;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcom/getcapacitor/BridgeWebChromeClient;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/BridgeWebChromeClient;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/getcapacitor/j;->g:I

    iput-object p1, p0, Lcom/getcapacitor/j;->h:Lcom/getcapacitor/BridgeWebChromeClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/getcapacitor/j;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/j;->h:Lcom/getcapacitor/BridgeWebChromeClient;

    check-cast p1, Ld/a;

    invoke-static {v0, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->p(Lcom/getcapacitor/BridgeWebChromeClient;Ld/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/j;->h:Lcom/getcapacitor/BridgeWebChromeClient;

    check-cast p1, Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/getcapacitor/BridgeWebChromeClient;->a(Lcom/getcapacitor/BridgeWebChromeClient;Ljava/util/Map;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
