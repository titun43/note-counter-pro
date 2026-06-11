.class public Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/getcapacitor/community/admob/models/AdOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TesterAdOptionsBuilder"
.end annotation


# instance fields
.field private adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

.field private id:Ljava/lang/String;

.field private isTesting:Z

.field private margin:I

.field private npa:Z

.field private position:Ljava/lang/String;

.field private ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

.field private testingID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "TesterAdOptionsBuilder__defaultID"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->id:Ljava/lang/String;

    .line 7
    .line 8
    const-string v0, "TesterAdOptionsBuilder__testingID"

    .line 9
    .line 10
    iput-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->testingID:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->isTesting:Z

    .line 14
    .line 15
    const-string v1, "TesterAdOptionsBuilder__position"

    .line 16
    .line 17
    iput-object v1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->position:Ljava/lang/String;

    .line 18
    .line 19
    iput v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->margin:I

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->npa:Z

    .line 23
    .line 24
    sget-object v0, Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;->ADAPTIVE_BANNER:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 27
    .line 28
    new-instance v0, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    .line 29
    .line 30
    invoke-direct {v0}, Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    .line 34
    .line 35
    return-void
.end method

.method public static bridge synthetic a(Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->testingID:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/getcapacitor/community/admob/models/AdOptions;
    .locals 9

    .line 1
    new-instance v0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder$1;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->id:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v3, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->isTesting:Z

    .line 6
    .line 7
    iget-object v4, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->position:Ljava/lang/String;

    .line 8
    .line 9
    iget v5, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->margin:I

    .line 10
    .line 11
    iget-boolean v6, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->npa:Z

    .line 12
    .line 13
    iget-object v7, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 14
    .line 15
    iget-object v8, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    invoke-direct/range {v0 .. v8}, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder$1;-><init>(Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;Ljava/lang/String;ZLjava/lang/String;IZLcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public setAdSize(Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->adSize:Lcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;

    .line 2
    .line 3
    return-object p0
.end method

.method public setID(Ljava/lang/String;)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setIsTesting(Z)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->isTesting:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setMargin(I)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->margin:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setNpa(Z)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->npa:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public setPosition(Ljava/lang/String;)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->position:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setSsvInfo(Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->ssvInfo:Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public setTestingID(Ljava/lang/String;)Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->testingID:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
