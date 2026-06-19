.class public abstract Lcom/getcapacitor/community/admob/models/AdOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;,
        Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    }
.end annotation


# static fields
.field public static final BANNER_TESTER_ID:Ljava/lang/String; = "ca-app-pub-3940256099942544/6300978111"

.field public static final INTERSTITIAL_TESTER_ID:Ljava/lang/String; = "ca-app-pub-3940256099942544/1033173712"

.field public static final REWARD_INTERSTITIAL_TESTER_ID:Ljava/lang/String; = "ca-app-pub-3940256099942544/5354046379"

.field public static final REWARD_VIDEO_TESTER_ID:Ljava/lang/String; = "ca-app-pub-3940256099942544/5224354917"

.field private static factory:Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;


# instance fields
.field public final adId:Ljava/lang/String;

.field public final adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field public final isTesting:Z

.field public final margin:I

.field public final npa:Z

.field public final position:Ljava/lang/String;

.field public final ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;


# direct methods
.method private constructor <init>(Lcom/getcapacitor/PluginCall;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, "adId"

    invoke-virtual {p0}, Lcom/getcapacitor/community/admob/models/AdOptions;->getTestingId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->adId:Ljava/lang/String;

    .line 5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "isTesting"

    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->isTesting:Z

    .line 6
    const-string v1, "position"

    const-string v2, "BOTTOM_CENTER"

    invoke-virtual {p1, v1, v2}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->position:Ljava/lang/String;

    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "margin"

    invoke-virtual {p1, v2, v1}, Lcom/getcapacitor/PluginCall;->getInt(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->margin:I

    .line 8
    const-string v1, "npa"

    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->getBoolean(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->npa:Z

    .line 9
    new-instance v0, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    invoke-direct {v0, p1}, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;-><init>(Lcom/getcapacitor/PluginCall;)V

    iput-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    .line 10
    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->ADAPTIVE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const-string v1, "adSize"

    invoke-virtual {p1, v1, v0}, Lcom/getcapacitor/PluginCall;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/getcapacitor/community/admob/models/AdOptions;->adSizeStringToAdSizeEnum(Ljava/lang/String;)Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    move-result-object p1

    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/getcapacitor/PluginCall;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/getcapacitor/community/admob/models/AdOptions;-><init>(Lcom/getcapacitor/PluginCall;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ZLjava/lang/String;IZLcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->adId:Ljava/lang/String;

    .line 14
    iput-boolean p2, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->isTesting:Z

    .line 15
    iput-object p3, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->position:Ljava/lang/String;

    .line 16
    iput p4, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->margin:I

    .line 17
    iput-boolean p5, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->npa:Z

    .line 18
    iput-object p6, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 19
    iput-object p7, p0, Lcom/getcapacitor/community/admob/models/AdOptions;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;IZLcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;I)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p7}, Lcom/getcapacitor/community/admob/models/AdOptions;-><init>(Ljava/lang/String;ZLjava/lang/String;IZLcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;)V

    return-void
.end method

.method private static adSizeStringToAdSizeEnum(Ljava/lang/String;)Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->valueOf(Ljava/lang/String;)Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    sget-object p0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->ADAPTIVE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 7
    .line 8
    return-object p0
.end method

.method public static getFactory()Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;
    .locals 2

    .line 1
    sget-object v0, Lcom/getcapacitor/community/admob/models/AdOptions;->factory:Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, v1}, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;-><init>(I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/getcapacitor/community/admob/models/AdOptions;->factory:Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public abstract getTestingId()Ljava/lang/String;
.end method
