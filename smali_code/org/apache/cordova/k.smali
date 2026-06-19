.class public final Lorg/apache/cordova/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/apache/cordova/k;->g:I

    iput-object p1, p0, Lorg/apache/cordova/k;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    iget p1, p0, Lorg/apache/cordova/k;->g:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    if-ne p2, p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lorg/apache/cordova/k;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lk1/j;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-virtual {p1, p2, p3}, Lk1/j;->y(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p3, 0x1

    .line 20
    :goto_0
    return p3

    .line 21
    :pswitch_0
    const/4 p1, 0x4

    .line 22
    const/4 p3, 0x1

    .line 23
    if-ne p2, p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lorg/apache/cordova/k;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lu1/f;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {p1, p2, p3}, Lu1/f;->k(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    :cond_1
    return p3

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
