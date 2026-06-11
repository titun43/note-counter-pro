.class public final synthetic Lcom/getcapacitor/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcom/getcapacitor/PluginCall;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/Bridge;Lcom/getcapacitor/PluginHandle;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/getcapacitor/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    iput-object p2, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    iput-object p3, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    iput-object p4, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/getcapacitor/community/admob/models/Executor;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;I)V
    .locals 0

    .line 2
    iput p5, p0, Lcom/getcapacitor/a;->g:I

    iput-object p1, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    iput-object p2, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    iput-object p3, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    iput-object p4, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput v0, p0, Lcom/getcapacitor/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    iput-object p2, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    iput-object p3, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    iput-object p4, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/getcapacitor/a;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/plugin/SystemBars;

    iget-object v1, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, v2, v3}, Lcom/getcapacitor/plugin/SystemBars;->e(Lcom/getcapacitor/plugin/SystemBars;Ljava/lang/String;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;

    iget-object v1, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    check-cast v1, Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v2, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    check-cast v2, Lx2/a;

    iget-object v3, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, v3, v2}, Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;->b(Lcom/getcapacitor/community/admob/rewardedinterstitial/AdRewardInterstitialExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;

    iget-object v1, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    check-cast v1, Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v2, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    check-cast v2, Lx2/a;

    iget-object v3, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, v3, v2}, Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;->b(Lcom/getcapacitor/community/admob/rewarded/AdRewardExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;

    iget-object v1, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    check-cast v1, Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v2, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    check-cast v2, Lx2/a;

    iget-object v3, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, v3, v2}, Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;->a(Lcom/getcapacitor/community/admob/interstitial/AdInterstitialExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Lcom/getcapacitor/PluginCall;Lx2/a;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/getcapacitor/a;->i:Ljava/lang/Object;

    check-cast v0, Lcom/getcapacitor/Bridge;

    iget-object v1, p0, Lcom/getcapacitor/a;->j:Ljava/lang/Object;

    check-cast v1, Lcom/getcapacitor/PluginHandle;

    iget-object v2, p0, Lcom/getcapacitor/a;->k:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/getcapacitor/a;->h:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, v2, v3}, Lcom/getcapacitor/Bridge;->a(Lcom/getcapacitor/Bridge;Lcom/getcapacitor/PluginHandle;Ljava/lang/String;Lcom/getcapacitor/PluginCall;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
