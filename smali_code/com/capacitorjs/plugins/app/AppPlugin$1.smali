.class Lcom/capacitorjs/plugins/app/AppPlugin$1;
.super Landroidx/activity/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capacitorjs/plugins/app/AppPlugin;->load()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capacitorjs/plugins/app/AppPlugin;


# direct methods
.method public constructor <init>(Lcom/capacitorjs/plugins/app/AppPlugin;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/activity/y;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 2
    .line 3
    const-string v1, "backButton"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/capacitorjs/plugins/app/AppPlugin;->access$000(Lcom/capacitorjs/plugins/app/AppPlugin;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/capacitorjs/plugins/app/AppPlugin;->access$100(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/capacitorjs/plugins/app/AppPlugin;->access$200(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void

    .line 41
    :cond_1
    new-instance v0, Lcom/getcapacitor/JSObject;

    .line 42
    .line 43
    invoke-direct {v0}, Lcom/getcapacitor/JSObject;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object v2, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 47
    .line 48
    invoke-static {v2}, Lcom/capacitorjs/plugins/app/AppPlugin;->access$300(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Landroid/webkit/WebView;->canGoBack()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const-string v3, "canGoBack"

    .line 61
    .line 62
    invoke-virtual {v0, v3, v2}, Lcom/getcapacitor/JSObject;->put(Ljava/lang/String;Z)Lcom/getcapacitor/JSObject;

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    invoke-static {v2, v1, v0, v3}, Lcom/capacitorjs/plugins/app/AppPlugin;->access$400(Lcom/capacitorjs/plugins/app/AppPlugin;Ljava/lang/String;Lcom/getcapacitor/JSObject;Z)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/capacitorjs/plugins/app/AppPlugin$1;->this$0:Lcom/capacitorjs/plugins/app/AppPlugin;

    .line 72
    .line 73
    invoke-static {v0}, Lcom/capacitorjs/plugins/app/AppPlugin;->access$500(Lcom/capacitorjs/plugins/app/AppPlugin;)Lcom/getcapacitor/Bridge;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "backbutton"

    .line 78
    .line 79
    const-string v2, "document"

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Lcom/getcapacitor/Bridge;->triggerJSEvent(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method
