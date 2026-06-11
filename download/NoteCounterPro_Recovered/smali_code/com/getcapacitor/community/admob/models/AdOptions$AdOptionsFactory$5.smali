.class Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$5;
.super Lcom/getcapacitor/community/admob/models/AdOptions;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;->createGenericOptions(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)Lcom/getcapacitor/community/admob/models/AdOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$testingID:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory;Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$5;->val$testingID:Ljava/lang/String;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p2, p1}, Lcom/getcapacitor/community/admob/models/AdOptions;-><init>(Lcom/getcapacitor/PluginCall;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public getTestingId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/models/AdOptions$AdOptionsFactory$5;->val$testingID:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
