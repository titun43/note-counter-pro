.class public final synthetic Lcom/getcapacitor/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/getcapacitor/Bridge;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Landroid/webkit/ValueCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/Bridge;Ljava/lang/String;Landroid/webkit/ValueCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/b;->g:Lcom/getcapacitor/Bridge;

    iput-object p2, p0, Lcom/getcapacitor/b;->h:Ljava/lang/String;

    iput-object p3, p0, Lcom/getcapacitor/b;->i:Landroid/webkit/ValueCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/b;->h:Ljava/lang/String;

    iget-object v1, p0, Lcom/getcapacitor/b;->i:Landroid/webkit/ValueCallback;

    iget-object v2, p0, Lcom/getcapacitor/b;->g:Lcom/getcapacitor/Bridge;

    invoke-static {v2, v0, v1}, Lcom/getcapacitor/Bridge;->e(Lcom/getcapacitor/Bridge;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method
