.class public Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;
.super Lcom/getcapacitor/Plugin;
.source "PremiumPlugin.java"

# annotations
.annotation runtime Lcom/getcapacitor/annotation/CapacitorPlugin;
    name = "PremiumPlugin"
    permissions = {}
.end annotation

# static fields
.field private static final TAG:Ljava/lang/String; = "PremiumPlugin"

# direct methods
.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Lcom/getcapacitor/Plugin;-><init>()V
    return-void
.end method

# virtual methods
.method public load()V
    .locals 0
    invoke-super {p0}, Lcom/getcapacitor/Plugin;->load()V
    return-void
.end method

# Premium is always available - IAP disabled in this build
.method public isPremiumAvailable(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/annotation/PluginMethod;
    .end annotation

    new-instance v0, Lcom/getcapacitor/JSObject;
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    const/4 v1, 0x1
    const-string v2, "available"
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    const-string v2, "productId"
    const-string v1, "note_counter_pro_premium"
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/getcapacitor/JSObject;

    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V
    return-void
.end method

# Premium purchase - always succeed (premium already unlocked in this build)
.method public purchasePremium(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/annotation/PluginMethod;
    .end annotation

    new-instance v0, Lcom/getcapacitor/JSObject;
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    const/4 v1, 0x1
    const-string v2, "success"
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    const-string v2, "owned"
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V
    return-void
.end method

# Restore purchases - always succeed (premium already unlocked in this build)
.method public restorePurchases(Lcom/getcapacitor/PluginCall;)V
    .locals 3
    .annotation runtime Lcom/getcapacitor/annotation/PluginMethod;
    .end annotation

    new-instance v0, Lcom/getcapacitor/JSObject;
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    const/4 v1, 0x1
    const-string v2, "restored"
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    const-string v2, "owned"
    invoke-virtual {v0, v2, v1}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    invoke-virtual {p1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V
    return-void
.end method
