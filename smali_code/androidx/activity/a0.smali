.class public final synthetic Landroidx/activity/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/a0;->g:I

    iput-object p1, p0, Landroidx/activity/a0;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/activity/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/a0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;->c(Lcom/capacitorjs/plugins/filesystem/FilesystemPlugin;)Lo3/k;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Landroidx/activity/a0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/activity/f0;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/activity/f0;->c()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    iget-object v0, p0, Landroidx/activity/a0;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroidx/activity/f0;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/activity/f0;->b()V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    iget-object v0, p0, Landroidx/activity/a0;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Landroidx/activity/f0;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/activity/f0;->c()V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lt3/h;->a:Lt3/h;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
