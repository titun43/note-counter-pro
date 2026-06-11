.class public final synthetic La2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/e;


# instance fields
.field public final synthetic a:Lcom/getcapacitor/PluginCall;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    iput-object p1, p0, La2/d;->a:Lcom/getcapacitor/PluginCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ly1/e;Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/d;->a:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, p1, p2}, Lcom/lokhnathtechnical/notecounterpro/plugins/PremiumPlugin;->e(Lcom/getcapacitor/PluginCall;Ly1/e;Ljava/util/List;)V

    return-void
.end method

.method public onConsentInfoUpdateFailure(Li3/j;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/d;->a:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, p1}, Lcom/getcapacitor/community/admob/consent/AdConsentExecutor;->e(Lcom/getcapacitor/PluginCall;Li3/j;)V

    return-void
.end method
