.class public final synthetic Lcom/getcapacitor/plugin/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcom/getcapacitor/plugin/SystemBars;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lcom/getcapacitor/PluginCall;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/getcapacitor/plugin/b;->g:I

    iput-object p1, p0, Lcom/getcapacitor/plugin/b;->h:Lcom/getcapacitor/plugin/SystemBars;

    iput-object p2, p0, Lcom/getcapacitor/plugin/b;->i:Ljava/lang/String;

    iput-object p3, p0, Lcom/getcapacitor/plugin/b;->j:Lcom/getcapacitor/PluginCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/getcapacitor/plugin/b;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/plugin/b;->i:Ljava/lang/String;

    iget-object v1, p0, Lcom/getcapacitor/plugin/b;->j:Lcom/getcapacitor/PluginCall;

    iget-object v2, p0, Lcom/getcapacitor/plugin/b;->h:Lcom/getcapacitor/plugin/SystemBars;

    invoke-static {v2, v0, v1}, Lcom/getcapacitor/plugin/SystemBars;->f(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/plugin/b;->i:Ljava/lang/String;

    iget-object v1, p0, Lcom/getcapacitor/plugin/b;->j:Lcom/getcapacitor/PluginCall;

    iget-object v2, p0, Lcom/getcapacitor/plugin/b;->h:Lcom/getcapacitor/plugin/SystemBars;

    invoke-static {v2, v0, v1}, Lcom/getcapacitor/plugin/SystemBars;->i(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
