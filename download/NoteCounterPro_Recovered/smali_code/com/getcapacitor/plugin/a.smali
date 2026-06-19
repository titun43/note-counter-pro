.class public final synthetic Lcom/getcapacitor/plugin/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/getcapacitor/plugin/a;->a:I

    iput-object p1, p0, Lcom/getcapacitor/plugin/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/getcapacitor/plugin/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/plugin/a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/plugin/SystemBars;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/getcapacitor/plugin/SystemBars;->j(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/plugin/a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/PluginCall;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/getcapacitor/plugin/CapacitorCookies;->c(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
