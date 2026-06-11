.class Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder$1;
.super Lcom/getcapacitor/community/admob/models/AdOptions;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->build()Lcom/getcapacitor/community/admob/models/AdOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;Ljava/lang/String;ZLjava/lang/String;IZLcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;)V
    .locals 9

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder$1;->this$0:Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;

    .line 2
    .line 3
    const/4 v8, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p2

    .line 6
    move v2, p3

    .line 7
    move-object v3, p4

    .line 8
    move v4, p5

    .line 9
    move v5, p6

    .line 10
    move-object/from16 v6, p7

    .line 11
    .line 12
    move-object/from16 v7, p8

    .line 13
    .line 14
    invoke-direct/range {v0 .. v8}, Lcom/getcapacitor/community/admob/models/AdOptions;-><init>(Ljava/lang/String;ZLjava/lang/String;IZLcom/getcapacitor/community/admob/banner/BannerAdSizeEnum;Lcom/getcapacitor/community/admob/rewarded/models/SsvInfo;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public getTestingId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder$1;->this$0:Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;->a(Lcom/getcapacitor/community/admob/models/AdOptions$TesterAdOptionsBuilder;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
