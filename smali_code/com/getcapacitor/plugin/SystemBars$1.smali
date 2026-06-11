.class Lcom/getcapacitor/plugin/SystemBars$1;
.super Lcom/getcapacitor/WebViewListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/getcapacitor/plugin/SystemBars;->handleOnStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/getcapacitor/plugin/SystemBars;


# direct methods
.method public constructor <init>(Lcom/getcapacitor/plugin/SystemBars;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/getcapacitor/plugin/SystemBars$1;->this$0:Lcom/getcapacitor/plugin/SystemBars;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/getcapacitor/WebViewListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/getcapacitor/WebViewListener;->onPageCommitVisible(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/getcapacitor/plugin/SystemBars$1;->this$0:Lcom/getcapacitor/plugin/SystemBars;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/getcapacitor/Plugin;->getBridge()Lcom/getcapacitor/Bridge;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Lcom/getcapacitor/Bridge;->getWebView()Landroid/webkit/WebView;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
