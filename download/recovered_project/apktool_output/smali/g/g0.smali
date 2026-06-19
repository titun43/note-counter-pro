.class public final synthetic Lg/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/j;


# instance fields
.field public final synthetic g:Lg/i;


# direct methods
.method public synthetic constructor <init>(Lg/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/g0;->g:Lg/i;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg/g0;->g:Lg/i;

    invoke-virtual {v0, p1}, Lg/i;->g(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
