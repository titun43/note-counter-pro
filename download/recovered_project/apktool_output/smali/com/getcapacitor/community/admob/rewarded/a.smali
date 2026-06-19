.class public final synthetic Lcom/getcapacitor/community/admob/rewarded/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/OnUserEarnedRewardListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx2/a;

.field public final synthetic c:Lcom/getcapacitor/PluginCall;


# direct methods
.method public synthetic constructor <init>(Lx2/a;Lcom/getcapacitor/PluginCall;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/getcapacitor/community/admob/rewarded/a;->a:I

    iput-object p1, p0, Lcom/getcapacitor/community/admob/rewarded/a;->b:Lx2/a;

    iput-object p2, p0, Lcom/getcapacitor/community/admob/rewarded/a;->c:Lcom/getcapacitor/PluginCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onUserEarnedReward(Lcom/google/android/gms/ads/rewarded/RewardItem;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/getcapacitor/community/admob/rewarded/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewarded/a;->b:Lx2/a;

    iget-object v1, p0, Lcom/getcapacitor/community/admob/rewarded/a;->c:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, p1}, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardedInterstitialAdCallbackAndListeners;->a(Lx2/a;Lcom/getcapacitor/PluginCall;Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewarded/a;->b:Lx2/a;

    iget-object v1, p0, Lcom/getcapacitor/community/admob/rewarded/a;->c:Lcom/getcapacitor/PluginCall;

    invoke-static {v0, v1, p1}, Lcom/getcapacitor/community/admob/rewarded/RewardedAdCallbackAndListeners;->a(Lx2/a;Lcom/getcapacitor/PluginCall;Lcom/google/android/gms/ads/rewarded/RewardItem;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
