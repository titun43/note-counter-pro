.class Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$1;
.super Lcom/getcapacitor/community/admob/models/AdOptions;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;->createBannerOptions(Lcom/getcapacitor/PluginCall;)Lcom/getcapacitor/community/admob/models/AdOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p2, p1}, Lcom/getcapacitor/community/admob/models/AdOptions;-><init>(Lcom/getcapacitor/PluginCall;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public getTestingId()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ca-app-pub-3940256099942544/6300978111"

    .line 2
    .line 3
    return-object v0
.end method
