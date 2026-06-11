.class public abstract Landroidx/fragment/app/e0;
.super Landroidx/activity/s;
.source "SourceFile"

# interfaces
.implements Lu/a;


# static fields
.field static final LIFECYCLE_TAG:Ljava/lang/String; = "android:support:lifecycle"


# instance fields
.field mCreated:Z

.field final mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

.field final mFragments:Landroidx/fragment/app/h0;

.field mResumed:Z

.field mStopped:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/activity/s;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/d0;

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    check-cast v1, Lg/k;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroidx/fragment/app/d0;-><init>(Lg/k;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroidx/fragment/app/h0;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Landroidx/fragment/app/h0;-><init>(Landroidx/fragment/app/d0;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 18
    .line 19
    new-instance v0, Landroidx/lifecycle/v;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Landroidx/lifecycle/v;-><init>(Landroidx/lifecycle/t;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->mStopped:Z

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/activity/s;->getSavedStateRegistry()Lc1/d;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v2, Landroidx/fragment/app/a0;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v1, v3}, Landroidx/fragment/app/a0;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    const-string v3, "android:support:lifecycle"

    .line 40
    .line 41
    invoke-virtual {v0, v3, v2}, Lc1/d;->c(Ljava/lang/String;Lc1/c;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroidx/fragment/app/b0;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/b0;-><init>(Lg/k;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroidx/activity/s;->addOnConfigurationChangedListener(Le0/a;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Landroidx/fragment/app/b0;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/b0;-><init>(Lg/k;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Landroidx/activity/s;->addOnNewIntentListener(Le0/a;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Landroidx/fragment/app/c0;

    .line 63
    .line 64
    invoke-direct {v0, v1}, Landroidx/fragment/app/c0;-><init>(Lg/k;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroidx/activity/s;->addOnContextAvailableListener(Lc/b;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static f(Landroidx/fragment/app/u0;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr1/h;->m()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroidx/fragment/app/z;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/z;->c()Landroidx/fragment/app/u0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroidx/fragment/app/e0;->f(Landroidx/fragment/app/u0;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/z;->T:Landroidx/lifecycle/v;

    .line 47
    .line 48
    iget-object v2, v2, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 49
    .line 50
    sget-object v3, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ltz v2, :cond_0

    .line 57
    .line 58
    iget-object v0, v1, Landroidx/fragment/app/z;->T:Landroidx/lifecycle/v;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroidx/lifecycle/v;->g()V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_4
    return v0
.end method


# virtual methods
.method public final dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/fragment/app/u0;->f:Landroidx/fragment/app/i0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/i0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p4}, Lu/h;->shouldDumpInternalState([Ljava/lang/String;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Local FragmentActivity "

    .line 15
    .line 16
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v0, " State:"

    .line 31
    .line 32
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, "  "

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v1, "mCreated="

    .line 56
    .line 57
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v1, p0, Landroidx/fragment/app/e0;->mCreated:Z

    .line 61
    .line 62
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 63
    .line 64
    .line 65
    const-string v1, " mResumed="

    .line 66
    .line 67
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-boolean v1, p0, Landroidx/fragment/app/e0;->mResumed:Z

    .line 71
    .line 72
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 73
    .line 74
    .line 75
    const-string v1, " mStopped="

    .line 76
    .line 77
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Landroidx/fragment/app/e0;->mStopped:Z

    .line 81
    .line 82
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-static {p0}, Lr0/a;->a(Landroidx/lifecycle/t;)Lr0/c;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1, v0, p3}, Lr0/c;->b(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 99
    .line 100
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 101
    .line 102
    iget-object v0, v0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 103
    .line 104
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/u0;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public getSupportFragmentManager()Landroidx/fragment/app/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 6
    .line 7
    return-object v0
.end method

.method public getSupportLoaderManager()Lr0/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0}, Lr0/a;->a(Landroidx/lifecycle/t;)Lr0/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public markFragmentsCreated()V
    .locals 1

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/e0;->getSupportFragmentManager()Landroidx/fragment/app/u0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/fragment/app/e0;->f(Landroidx/fragment/app/u0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/s;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/z;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/s;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 14
    .line 15
    iget-object p1, p1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p1, Landroidx/fragment/app/u0;->H:Z

    .line 19
    .line 20
    iput-boolean v0, p1, Landroidx/fragment/app/u0;->I:Z

    .line 21
    .line 22
    iget-object v1, p1, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 23
    .line 24
    iput-boolean v0, v1, Landroidx/fragment/app/y0;->i:Z

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p1, v0}, Landroidx/fragment/app/u0;->u(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/e0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/e0;->dispatchFragmentsOnCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->l()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 14
    .line 15
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/s;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/u0;->j()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    return p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->mResumed:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->u(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 18
    .line 19
    sget-object v1, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onPostResume()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/e0;->onResumeFragments()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/s;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->mResumed:Z

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 15
    .line 16
    iget-object v1, v1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onResumeFragments()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 2
    .line 3
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-boolean v1, v0, Landroidx/fragment/app/u0;->H:Z

    .line 16
    .line 17
    iput-boolean v1, v0, Landroidx/fragment/app/u0;->I:Z

    .line 18
    .line 19
    iget-object v2, v0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 20
    .line 21
    iput-boolean v1, v2, Landroidx/fragment/app/y0;->i:Z

    .line 22
    .line 23
    const/4 v1, 0x7

    .line 24
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->u(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->mStopped:Z

    .line 11
    .line 12
    iget-boolean v1, p0, Landroidx/fragment/app/e0;->mCreated:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iput-boolean v2, p0, Landroidx/fragment/app/e0;->mCreated:Z

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 20
    .line 21
    iget-object v1, v1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 22
    .line 23
    iget-object v1, v1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 24
    .line 25
    iput-boolean v0, v1, Landroidx/fragment/app/u0;->H:Z

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/u0;->I:Z

    .line 28
    .line 29
    iget-object v3, v1, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 30
    .line 31
    iput-boolean v0, v3, Landroidx/fragment/app/y0;->i:Z

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-virtual {v1, v3}, Landroidx/fragment/app/u0;->u(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 40
    .line 41
    iget-object v1, v1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 47
    .line 48
    sget-object v2, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 54
    .line 55
    iget-object v1, v1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 58
    .line 59
    iput-boolean v0, v1, Landroidx/fragment/app/u0;->H:Z

    .line 60
    .line 61
    iput-boolean v0, v1, Landroidx/fragment/app/u0;->I:Z

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 64
    .line 65
    iput-boolean v0, v2, Landroidx/fragment/app/y0;->i:Z

    .line 66
    .line 67
    const/4 v0, 0x5

    .line 68
    invoke-virtual {v1, v0}, Landroidx/fragment/app/u0;->u(I)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/h0;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->mStopped:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/e0;->markFragmentsCreated()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/e0;->mFragments:Landroidx/fragment/app/h0;

    .line 11
    .line 12
    iget-object v1, v1, Landroidx/fragment/app/h0;->a:Landroidx/fragment/app/d0;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/d0;->p:Landroidx/fragment/app/v0;

    .line 15
    .line 16
    iput-boolean v0, v1, Landroidx/fragment/app/u0;->I:Z

    .line 17
    .line 18
    iget-object v2, v1, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 19
    .line 20
    iput-boolean v0, v2, Landroidx/fragment/app/y0;->i:Z

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-virtual {v1, v0}, Landroidx/fragment/app/u0;->u(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Landroidx/fragment/app/e0;->mFragmentLifecycleRegistry:Landroidx/lifecycle/v;

    .line 27
    .line 28
    sget-object v1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public setEnterSharedElementCallback(Lu/x;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setEnterSharedElementCallback(Landroid/app/SharedElementCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setExitSharedElementCallback(Lu/x;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setExitSharedElementCallback(Landroid/app/SharedElementCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/z;Landroid/content/Intent;I)V
    .locals 1

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/fragment/app/e0;->startActivityFromFragment(Landroidx/fragment/app/z;Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityFromFragment(Landroidx/fragment/app/z;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 2

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 1
    invoke-virtual {p0, p2, v0, p4}, Landroidx/activity/s;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void

    .line 2
    :cond_0
    iget-object v0, p1, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_4

    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/z;->e()Landroidx/fragment/app/u0;

    move-result-object v0

    .line 4
    iget-object v1, v0, Landroidx/fragment/app/u0;->C:Ld/g;

    if-eqz v1, :cond_2

    .line 5
    new-instance v1, Landroidx/fragment/app/q0;

    iget-object p1, p1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    invoke-direct {v1, p1, p3}, Landroidx/fragment/app/q0;-><init>(Ljava/lang/String;I)V

    .line 6
    iget-object p1, v0, Landroidx/fragment/app/u0;->F:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p4, :cond_1

    .line 7
    const-string p1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {p2, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 8
    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/u0;->C:Ld/g;

    .line 9
    invoke-virtual {p1, p2}, Ld/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object p1, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "intent"

    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    if-ne p3, v0, :cond_3

    .line 11
    iget-object p1, p1, Landroidx/fragment/app/d0;->n:Lg/k;

    invoke-static {p1, p2, p4}, Lv/a;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :goto_0
    return-void

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Fragment "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not attached to Activity"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public startIntentSenderFromFragment(Landroidx/fragment/app/z;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 12
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v8, -0x1

    .line 2
    if-ne p3, v8, :cond_0

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p2

    .line 6
    move v2, p3

    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move/from16 v4, p5

    .line 10
    .line 11
    move/from16 v5, p6

    .line 12
    .line 13
    move/from16 v6, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    invoke-virtual/range {v0 .. v7}, Landroidx/activity/s;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v3, p4

    .line 22
    .line 23
    move-object/from16 v7, p8

    .line 24
    .line 25
    iget-object v0, p1, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 26
    .line 27
    const-string v4, "Fragment "

    .line 28
    .line 29
    if-eqz v0, :cond_9

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const-string v6, "FragmentManager"

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v9, " received the following in startIntentSenderForResult() requestCode: "

    .line 49
    .line 50
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v9, " IntentSender: "

    .line 57
    .line 58
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v9, " fillInIntent: "

    .line 65
    .line 66
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v9, " options: "

    .line 73
    .line 74
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/z;->e()Landroidx/fragment/app/u0;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    iget-object v9, v5, Landroidx/fragment/app/u0;->D:Ld/g;

    .line 92
    .line 93
    if-eqz v9, :cond_6

    .line 94
    .line 95
    if-eqz v7, :cond_4

    .line 96
    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    new-instance v3, Landroid/content/Intent;

    .line 100
    .line 101
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v8, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 105
    .line 106
    const/4 v9, 0x1

    .line 107
    invoke-virtual {v3, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    :cond_2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_3

    .line 115
    .line 116
    new-instance v8, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v9, "ActivityOptions "

    .line 119
    .line 120
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v9, " were added to fillInIntent "

    .line 127
    .line 128
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v9, " for fragment "

    .line 135
    .line 136
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-static {v6, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    :cond_3
    const-string v8, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 150
    .line 151
    invoke-virtual {v3, v8, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 152
    .line 153
    .line 154
    :cond_4
    const-string v7, "intentSender"

    .line 155
    .line 156
    invoke-static {p2, v7}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v7, Ld/i;

    .line 160
    .line 161
    move/from16 v9, p5

    .line 162
    .line 163
    move/from16 v10, p6

    .line 164
    .line 165
    invoke-direct {v7, p2, v3, v9, v10}, Ld/i;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 166
    .line 167
    .line 168
    new-instance p2, Landroidx/fragment/app/q0;

    .line 169
    .line 170
    iget-object v1, p1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 171
    .line 172
    invoke-direct {p2, v1, p3}, Landroidx/fragment/app/q0;-><init>(Ljava/lang/String;I)V

    .line 173
    .line 174
    .line 175
    iget-object p3, v5, Landroidx/fragment/app/u0;->F:Ljava/util/ArrayDeque;

    .line 176
    .line 177
    invoke-virtual {p3, p2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_5

    .line 185
    .line 186
    new-instance p2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p1, "is launching an IntentSender for result "

    .line 195
    .line 196
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {v6, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    :cond_5
    iget-object p1, v5, Landroidx/fragment/app/u0;->D:Ld/g;

    .line 207
    .line 208
    invoke-virtual {p1, v7}, Ld/g;->a(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_6
    move/from16 v9, p5

    .line 213
    .line 214
    move/from16 v10, p6

    .line 215
    .line 216
    iget-object p1, v5, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    const-string v0, "intent"

    .line 222
    .line 223
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v11, "Starting intent sender with a requestCode requires a FragmentActivity host"

    .line 227
    .line 228
    if-ne p3, v8, :cond_8

    .line 229
    .line 230
    iget-object v0, p1, Landroidx/fragment/app/d0;->m:Lg/k;

    .line 231
    .line 232
    if-eqz v0, :cond_7

    .line 233
    .line 234
    move-object v1, p2

    .line 235
    move v2, p3

    .line 236
    move/from16 v6, p7

    .line 237
    .line 238
    move v4, v9

    .line 239
    move v5, v10

    .line 240
    invoke-virtual/range {v0 .. v7}, Landroidx/activity/s;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    invoke-direct {p1, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    invoke-direct {p1, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p1

    .line 256
    :cond_9
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 257
    .line 258
    new-instance p3, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    invoke-direct {p3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string p1, " not attached to Activity"

    .line 267
    .line 268
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw p2
.end method

.method public supportFinishAfterTransition()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportPostponeEnterTransition()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->postponeEnterTransition()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public supportStartPostponedEnterTransition()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->startPostponedEnterTransition()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final validateRequestPermissionsRequestCode(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method
