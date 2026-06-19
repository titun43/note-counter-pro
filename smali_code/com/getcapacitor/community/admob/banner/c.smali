.class public final synthetic Lcom/getcapacitor/community/admob/banner/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

.field public final synthetic i:Lcom/getcapacitor/community/admob/models/AdOptions;


# direct methods
.method public synthetic constructor <init>(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/getcapacitor/community/admob/banner/c;->g:I

    iput-object p1, p0, Lcom/getcapacitor/community/admob/banner/c;->h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    iput-object p2, p0, Lcom/getcapacitor/community/admob/banner/c;->i:Lcom/getcapacitor/community/admob/models/AdOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/getcapacitor/community/admob/banner/c;->g:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/c;->h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/c;->i:Lcom/getcapacitor/community/admob/models/AdOptions;

    invoke-static {v0, v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->f(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/getcapacitor/community/admob/banner/c;->h:Lcom/getcapacitor/community/admob/banner/BannerExecutor;

    iget-object v1, p0, Lcom/getcapacitor/community/admob/banner/c;->i:Lcom/getcapacitor/community/admob/models/AdOptions;

    invoke-static {v0, v1}, Lcom/getcapacitor/community/admob/banner/BannerExecutor;->b(Lcom/getcapacitor/community/admob/banner/BannerExecutor;Lcom/getcapacitor/community/admob/models/AdOptions;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
