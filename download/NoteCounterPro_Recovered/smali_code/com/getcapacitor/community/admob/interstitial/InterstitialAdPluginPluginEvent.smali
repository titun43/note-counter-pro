.class public final Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/getcapacitor/community/admob/models/LoadPluginEventNames;


# static fields
.field private static final Dismissed:Ljava/lang/String;

.field public static final FailedToLoad:Ljava/lang/String; = "interstitialAdFailedToLoad"

.field private static final FailedToShow:Ljava/lang/String;

.field public static final INSTANCE:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;

.field public static final Loaded:Ljava/lang/String; = "interstitialAdLoaded"

.field private static final Showed:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->INSTANCE:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;

    .line 7
    .line 8
    const-string v0, "interstitialAdShowed"

    .line 9
    .line 10
    sput-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->Showed:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "interstitialAdFailedToShow"

    .line 13
    .line 14
    sput-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->FailedToShow:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "interstitialAdDismissed"

    .line 17
    .line 18
    sput-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->Dismissed:Ljava/lang/String;

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
    sget-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->Dismissed:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFailedToShow()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->FailedToShow:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getShowed()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdPluginPluginEvent;->Showed:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
