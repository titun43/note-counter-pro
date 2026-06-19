.class public final synthetic Lcom/getcapacitor/community/admob/banner/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/getcapacitor/community/admob/banner/b;->g:I

    iput-object p1, p0, Lcom/getcapacitor/community/admob/banner/b;->h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/getcapacitor/community/admob/banner/b;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/b;->h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->c(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/b;->h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    invoke-static {v0}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->e(Lcom/getcapacitor/community/admob/banner/BannerExecutor;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
