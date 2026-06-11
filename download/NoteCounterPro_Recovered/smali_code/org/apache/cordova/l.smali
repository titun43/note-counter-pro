.class public final Lorg/apache/cordova/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lk1/j;


# direct methods
.method public synthetic constructor <init>(Lk1/j;I)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/apache/cordova/l;->g:I

    iput-object p1, p0, Lorg/apache/cordova/l;->h:Lk1/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget p1, p0, Lorg/apache/cordova/l;->g:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 p2, 0x0

    .line 8
    iget-object v0, p0, Lorg/apache/cordova/l;->h:Lk1/j;

    .line 9
    .line 10
    invoke-virtual {v0, p2, p1}, Lk1/j;->y(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    const/4 p1, 0x1

    .line 15
    const/4 p2, 0x0

    .line 16
    iget-object v0, p0, Lorg/apache/cordova/l;->h:Lk1/j;

    .line 17
    .line 18
    invoke-virtual {v0, p2, p1}, Lk1/j;->y(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
