.class public Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/community/admob/models/AdOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AdOptionsFactory"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public createBannerOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$1;-><init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public createGenericOptions(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Lcom/getcapacitor/community/admob/models/AdOptions;
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$5;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$5;-><init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public createInterstitialOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$2;-><init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public createRewardInterstitialOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$4;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$4;-><init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public createRewardVideoOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;
    .locals 1

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$3;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$3;-><init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
