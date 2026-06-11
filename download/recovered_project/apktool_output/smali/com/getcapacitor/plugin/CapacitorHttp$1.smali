.class Lcom/getcapacitor/plugin/CapacitorHttp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/plugin/CapacitorHttp;->http(Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/getcapacitor/plugin/CapacitorHttp;

.field final synthetic val$call:Lcom/getcapacitor/PluginCall;

.field final synthetic val$httpMethod:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/plugin/CapacitorHttp;Lcom/getcapacitor/PluginCall;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->this$0:Lcom/getcapacitor/plugin/CapacitorHttp;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->val$call:Lcom/getcapacitor/PluginCall;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->val$httpMethod:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->val$call:Lcom/getcapacitor/PluginCall;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->val$httpMethod:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->this$0:Lcom/getcapacitor/plugin/CapacitorHttp;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v0, v1, v2}, Lcom/getcapacitor/plugin/util/HttpRequestHandler;->request(Lcom/getcapacitor/PluginCall;Ljava/lang/String;Lcom/getcapacitor/Bridge;)Lcom/getcapacitor/JSObject;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->val$call:Lcom/getcapacitor/PluginCall;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lcom/getcapacitor/PluginCall;->resolve(Lcom/getcapacitor/JSObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-object v0, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->this$0:Lcom/getcapacitor/plugin/CapacitorHttp;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/getcapacitor/plugin/CapacitorHttp;->c(Lcom/getcapacitor/plugin/CapacitorHttp;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception v0

    .line 33
    :try_start_1
    iget-object v1, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->val$call:Lcom/getcapacitor/PluginCall;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1, v2, v3, v0}, Lcom/getcapacitor/PluginCall;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :goto_1
    iget-object v1, p0, Lcom/getcapacitor/plugin/CapacitorHttp$1;->this$0:Lcom/getcapacitor/plugin/CapacitorHttp;

    .line 52
    .line 53
    invoke-static {v1}, Lcom/getcapacitor/plugin/CapacitorHttp;->c(Lcom/getcapacitor/plugin/CapacitorHttp;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    throw v0
.end method
