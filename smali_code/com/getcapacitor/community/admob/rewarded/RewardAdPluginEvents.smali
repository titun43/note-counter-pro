.class public final Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;


# static fields
.field private static final Dismissed:Ljava/lang/String;

.field public static final FailedToLoad:Ljava/lang/String; = "onRewardedVideoAdFailedToLoad"

.field private static final FailedToShow:Ljava/lang/String;

.field public static final INSTANCE:Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;

.field public static final Loaded:Ljava/lang/String; = "onRewardedVideoAdLoaded"

.field public static final Rewarded:Ljava/lang/String; = "onRewardedVideoAdReward"

.field private static final Showed:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->INSTANCE:Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;

    .line 7
    .line 8
    const-string v0, "onRewardedVideoAdShowed"

    .line 9
    .line 10
    sput-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->Showed:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "onRewardedVideoAdFailedToShow"

    .line 13
    .line 14
    sput-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->FailedToShow:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "onRewardedVideoAdDismissed"

    .line 17
    .line 18
    sput-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->Dismissed:Ljava/lang/String;

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
    sget-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->Dismissed:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFailedToShow()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->FailedToShow:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowed()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/rewarded/RewardAdPluginEvents;->Showed:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
