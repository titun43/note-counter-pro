.class public Lcom/capacitorjs/plugins/haptics/HapticsPlugin;
.super Lcom/getcapacitor/Plugin;
.source "SourceFile"


# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    name = "Haptics"
.end annotation


# instance fields
.field private implementation:Lcom/capacitorjs/plugins/haptics/Haptics;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public impact(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 2
    .line 3
    const-string v1, "style"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;->fromString(Ljava/lang/String;)Lcom/capacitorjs/plugins/haptics/arguments/HapticsImpactType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/haptics/Haptics;->performHaptics(Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public load()V
    .locals 2

    .line 1
    new-instance v0, Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/getcapacitor/Plugin;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/capacitorjs/plugins/haptics/Haptics;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 11
    .line 12
    return-void
.end method

.method public notification(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 2
    .line 3
    const-string v1, "type"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;->fromString(Ljava/lang/String;)Lcom/capacitorjs/plugins/haptics/arguments/HapticsNotificationType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/capacitorjs/plugins/haptics/Haptics;->performHaptics(Lcom/capacitorjs/plugins/haptics/arguments/HapticsVibrationType;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public selectionChanged(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionChanged()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public selectionEnd(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionEnd()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public selectionStart(Lcom/getcapacitor/PluginCall;)V
    .locals 1
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/capacitorjs/plugins/haptics/Haptics;->selectionStart()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public vibrate(Lcom/getcapacitor/PluginCall;)V
    .locals 2
    .annotation runtime Lcom/getcapacitor/PluginMethod;
    .end annotation

    .line 1
    const/16 v0, 0x12c

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "duration"

    .line 8
    .line 9
    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/capacitorjs/plugins/haptics/HapticsPlugin;->implementation:Lcom/capacitorjs/plugins/haptics/Haptics;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lcom/capacitorjs/plugins/haptics/Haptics;->vibrate(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/getcapacitor/PluginCall;->resolve()V

    .line 23
    .line 24
    .line 25
    return-void
.end method
