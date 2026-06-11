.class public final Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;

    invoke-direct {v0}, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;-><init>()V

    sput-object v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;->INSTANCE:Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners;

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
.method public final getInterstitialAdLoadCallback(Lcom/getcapacitor/PluginCall;Lx2/a;)Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/getcapacitor/PluginCall;",
            "Lx2/a;",
            ")",
            "Lcom/google/android/gms/ads/interstitial/InterstitialAdLoadCallback;"
        }
    .end annotation

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notifyListenersFunction"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners$getInterstitialAdLoadCallback$1;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/getcapacitor/community/admob/interstitial/InterstitialAdCallbackAndListeners$getInterstitialAdLoadCallback$1;-><init>(Lcom/getcapacitor/PluginCall;Lx2/a;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
