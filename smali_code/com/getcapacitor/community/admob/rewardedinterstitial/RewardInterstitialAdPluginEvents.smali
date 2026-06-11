.class public final Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;


# static fields
.field private static final Dismissed:Ljava/lang/String;

.field public static final FailedToLoad:Ljava/lang/String; = "onRewardedInterstitialAdFailedToLoad"

.field private static final FailedToShow:Ljava/lang/String;

.field public static final INSTANCE:Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;

.field public static final Loaded:Ljava/lang/String; = "onRewardedInterstitialAdLoaded"

.field public static final Rewarded:Ljava/lang/String; = "onRewardedInterstitialAdReward"

.field private static final Showed:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->INSTANCE:Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;

    .line 7
    .line 8
    const-string v0, "onRewardedInterstitialAdShowed"

    .line 9
    .line 10
    sput-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->Showed:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "onRewardedInterstitialAdFailedToShow"

    .line 13
    .line 14
    sput-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->FailedToShow:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "onRewardedInterstitialAdDismissed"

    .line 17
    .line 18
    sput-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->Dismissed:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getDismissed()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->Dismissed:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFailedToShow()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->FailedToShow:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowed()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/rewardedinterstitial/RewardInterstitialAdPluginEvents;->Showed:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
