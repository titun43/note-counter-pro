.class public Lcom/lokhnathtechnical/notecounterpro/MainActivity;
.super Lcom/getcapacitor/BridgeActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/BridgeActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-class v0, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/getcapacitor/BridgeActivity;->registerPlugin(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lcom/lokhnathtechnical/notecounterpro/plugins/ContactPickerPlugin;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/getcapacitor/BridgeActivity;->registerPlugin(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Lcom/getcapacitor/BridgeActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
