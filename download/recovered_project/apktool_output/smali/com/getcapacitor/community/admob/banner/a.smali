.class public final synthetic Lcom/getcapacitor/community/admob/banner/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic a:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

.field public final synthetic b:Lcom/getcapacitor/community/admob/models/AdOptions;

.field public final synthetic c:Ls/d;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Ls/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/getcapacitor/community/admob/banner/a;->a:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    iput-object p2, p0, Lcom/getcapacitor/community/admob/banner/a;->b:Lcom/getcapacitor/community/admob/models/AdOptions;

    iput-object p3, p0, Lcom/getcapacitor/community/admob/banner/a;->c:Ls/d;

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/a;->b:Lcom/getcapacitor/community/admob/models/AdOptions;

    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/a;->c:Ls/d;

    iget-object v2, p0, Lcom/getcapacitor/community/admob/banner/a;->a:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    invoke-static {v2, v0, v1, p1, p2}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->a(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;Ls/d;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
