.class public final synthetic Lcom/getcapacitor/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/webkit/WebView;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/m;->g:Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/getcapacitor/m;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/m;->g:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/getcapacitor/m;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/getcapacitor/MessageHandler;->c(Landroid/webkit/WebView;Ljava/lang/String;)V

    return-void
.end method
