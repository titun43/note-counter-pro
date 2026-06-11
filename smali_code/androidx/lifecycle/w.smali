.class public abstract Landroidx/lifecycle/w;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/t;


# instance fields
.field public final g:Landroidx/emoji2/text/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/emoji2/text/t;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/w;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/lifecycle/w;->g:Landroidx/emoji2/text/t;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final getLifecycle()Landroidx/lifecycle/o;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/w;->g:Landroidx/emoji2/text/t;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/lifecycle/v;

    .line 6
    .line 7
    return-object v0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 1
    const-string v0, "intent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/lifecycle/w;->g:Landroidx/emoji2/text/t;

    .line 7
    .line 8
    sget-object v0, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroidx/emoji2/text/t;->s(Landroidx/lifecycle/m;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1
.end method

.method public onCreate()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/w;->g:Landroidx/emoji2/text/t;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/t;->s(Landroidx/lifecycle/m;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/w;->g:Landroidx/emoji2/text/t;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/t;->s(Landroidx/lifecycle/m;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/t;->s(Landroidx/lifecycle/m;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onStart(Landroid/content/Intent;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/w;->g:Landroidx/emoji2/text/t;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/t;->s(Landroidx/lifecycle/m;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
