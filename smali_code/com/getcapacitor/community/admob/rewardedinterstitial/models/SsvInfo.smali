.class public final Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final customData:Ljava/lang/String;

.field private final userId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0}, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/getcapacitor/PluginCall;)V
    .locals 4

    const/4 v0, 0x0

    .line 5
    const-string v1, "ssv"

    if-eqz p1, :cond_0

    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->getObject(Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "customData"

    invoke-virtual {v2, v3}, Lcom/getcapacitor/JSObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1, v1}, Lcom/getcapacitor/PluginCall;->getObject(Ljava/lang/String;)Lcom/getcapacitor/JSObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "userId"

    invoke-virtual {p1, v0}, Lcom/getcapacitor/JSObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7
    :cond_1
    invoke-direct {p0, v2, v0}, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;->customData:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;->userId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILg4/f;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getCustomData()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;->customData:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHasInfo()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;->customData:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;->userId:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/rewardedinterstitial/models/SsvInfo;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
