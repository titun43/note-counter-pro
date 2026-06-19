.class public final Lorg/apache/cordova/z;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final g:Lorg/apache/cordova/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lorg/apache/cordova/w;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lorg/apache/cordova/z;->g:Lorg/apache/cordova/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/cordova/z;->g:Lorg/apache/cordova/w;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/apache/cordova/w;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    return v0
.end method
