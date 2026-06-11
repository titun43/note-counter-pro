.class public final Landroidx/emoji2/text/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/b;
.implements Lh0/g;
.implements Lw1/a;


# static fields
.field public static k:Landroidx/emoji2/text/t;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Landroidx/emoji2/text/t;->g:I

    packed-switch p1, :pswitch_data_0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 54
    iput-object p1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    return-void

    .line 55
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 29
    iput-object p2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Lg/p0;

    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 34
    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/w0;Landroidx/lifecycle/u0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    const-string v0, "store"

    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget-object v0, Lq0/a;->b:Lq0/a;

    .line 26
    invoke-direct {p0, p1, p2, v0}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/w0;Landroidx/lifecycle/u0;Lq0/b;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/w0;Landroidx/lifecycle/u0;Lq0/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    const-string v0, "store"

    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/w;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Landroidx/lifecycle/v;

    invoke-direct {v0, p1}, Landroidx/lifecycle/v;-><init>(Landroidx/lifecycle/t;)V

    iput-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 12
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    const/16 v0, 0x11

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 4
    new-instance v0, Lt1/b;

    const/4 v1, 0x2

    .line 5
    invoke-direct {v0, p1, v1}, Lt1/b;-><init>(Lz0/i;I)V

    .line 6
    iput-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 7
    new-instance v0, Lt1/e;

    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p1, v1}, Lt1/e;-><init>(Lz0/i;I)V

    .line 9
    iput-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf2/j;Lc2/b;Ly0/c;Lf2/r;)V
    .locals 0

    const/16 p3, 0x8

    iput p3, p0, Landroidx/emoji2/text/t;->g:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 16
    iput-object p4, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 38
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    iput-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 39
    new-instance v1, Lt1/i;

    iget-object v2, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    check-cast v2, Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lt1/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 40
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object p1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    check-cast p1, Lt1/i;

    const-class v0, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lt1/i;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Landroidx/emoji2/text/t;->g:I

    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 2

    const/16 v0, 0x12

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 19
    new-instance v0, Lf2/q;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lf2/q;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 20
    new-instance v0, Lu1/i;

    invoke-direct {v0, p1}, Lu1/i;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr1/h;Lt2/i;Landroidx/emoji2/text/e;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p2, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 45
    iput-object p1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 46
    iput-object p3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 47
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 49
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 50
    new-instance v6, Landroidx/emoji2/text/r;

    const/4 p2, 0x0

    invoke-direct {v6, v1, p2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 51
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Landroidx/emoji2/text/t;->t(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/q;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static g(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Landroidx/emoji2/text/b0;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Landroidx/emoji2/text/b0;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method

.method public static r(Landroid/content/Context;Landroid/util/AttributeSet;[II)Landroidx/emoji2/text/t;
    .locals 2

    .line 1
    new-instance v0, Landroidx/emoji2/text/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, Landroidx/emoji2/text/t;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public e()Landroidx/work/o;
    .locals 8

    .line 1
    new-instance v0, Landroidx/work/o;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/UUID;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lt1/i;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, v0, Landroidx/work/o;->a:Ljava/util/UUID;

    .line 19
    .line 20
    iput-object v2, v0, Landroidx/work/o;->b:Lt1/i;

    .line 21
    .line 22
    iput-object v3, v0, Landroidx/work/o;->c:Ljava/util/HashSet;

    .line 23
    .line 24
    iget-object v1, v2, Lt1/i;->j:Landroidx/work/c;

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/work/c;->h:Landroidx/work/e;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/work/e;->a:Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-lez v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-boolean v2, v1, Landroidx/work/c;->d:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    iget-boolean v2, v1, Landroidx/work/c;->b:Z

    .line 43
    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    iget-boolean v1, v1, Landroidx/work/c;->c:Z

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    move v1, v3

    .line 54
    :goto_1
    iget-object v2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Lt1/i;

    .line 57
    .line 58
    iget-boolean v2, v2, Lt1/i;->q:Z

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string v1, "Expedited jobs only support network and storage constraints"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 78
    .line 79
    new-instance v1, Lt1/i;

    .line 80
    .line 81
    iget-object v2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Lt1/i;

    .line 84
    .line 85
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput v3, v1, Lt1/i;->b:I

    .line 89
    .line 90
    sget-object v4, Landroidx/work/g;->c:Landroidx/work/g;

    .line 91
    .line 92
    iput-object v4, v1, Lt1/i;->e:Landroidx/work/g;

    .line 93
    .line 94
    iput-object v4, v1, Lt1/i;->f:Landroidx/work/g;

    .line 95
    .line 96
    sget-object v4, Landroidx/work/c;->i:Landroidx/work/c;

    .line 97
    .line 98
    iput-object v4, v1, Lt1/i;->j:Landroidx/work/c;

    .line 99
    .line 100
    iput v3, v1, Lt1/i;->l:I

    .line 101
    .line 102
    const-wide/16 v4, 0x7530

    .line 103
    .line 104
    iput-wide v4, v1, Lt1/i;->m:J

    .line 105
    .line 106
    const-wide/16 v4, -0x1

    .line 107
    .line 108
    iput-wide v4, v1, Lt1/i;->p:J

    .line 109
    .line 110
    iput v3, v1, Lt1/i;->r:I

    .line 111
    .line 112
    iget-object v6, v2, Lt1/i;->a:Ljava/lang/String;

    .line 113
    .line 114
    iput-object v6, v1, Lt1/i;->a:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v6, v2, Lt1/i;->c:Ljava/lang/String;

    .line 117
    .line 118
    iput-object v6, v1, Lt1/i;->c:Ljava/lang/String;

    .line 119
    .line 120
    iget v6, v2, Lt1/i;->b:I

    .line 121
    .line 122
    iput v6, v1, Lt1/i;->b:I

    .line 123
    .line 124
    iget-object v6, v2, Lt1/i;->d:Ljava/lang/String;

    .line 125
    .line 126
    iput-object v6, v1, Lt1/i;->d:Ljava/lang/String;

    .line 127
    .line 128
    new-instance v6, Landroidx/work/g;

    .line 129
    .line 130
    iget-object v7, v2, Lt1/i;->e:Landroidx/work/g;

    .line 131
    .line 132
    invoke-direct {v6, v7}, Landroidx/work/g;-><init>(Landroidx/work/g;)V

    .line 133
    .line 134
    .line 135
    iput-object v6, v1, Lt1/i;->e:Landroidx/work/g;

    .line 136
    .line 137
    new-instance v6, Landroidx/work/g;

    .line 138
    .line 139
    iget-object v7, v2, Lt1/i;->f:Landroidx/work/g;

    .line 140
    .line 141
    invoke-direct {v6, v7}, Landroidx/work/g;-><init>(Landroidx/work/g;)V

    .line 142
    .line 143
    .line 144
    iput-object v6, v1, Lt1/i;->f:Landroidx/work/g;

    .line 145
    .line 146
    iget-wide v6, v2, Lt1/i;->g:J

    .line 147
    .line 148
    iput-wide v6, v1, Lt1/i;->g:J

    .line 149
    .line 150
    iget-wide v6, v2, Lt1/i;->h:J

    .line 151
    .line 152
    iput-wide v6, v1, Lt1/i;->h:J

    .line 153
    .line 154
    iget-wide v6, v2, Lt1/i;->i:J

    .line 155
    .line 156
    iput-wide v6, v1, Lt1/i;->i:J

    .line 157
    .line 158
    new-instance v6, Landroidx/work/c;

    .line 159
    .line 160
    iget-object v7, v2, Lt1/i;->j:Landroidx/work/c;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    iput v3, v6, Landroidx/work/c;->a:I

    .line 166
    .line 167
    iput-wide v4, v6, Landroidx/work/c;->f:J

    .line 168
    .line 169
    iput-wide v4, v6, Landroidx/work/c;->g:J

    .line 170
    .line 171
    new-instance v3, Landroidx/work/e;

    .line 172
    .line 173
    invoke-direct {v3}, Landroidx/work/e;-><init>()V

    .line 174
    .line 175
    .line 176
    iput-object v3, v6, Landroidx/work/c;->h:Landroidx/work/e;

    .line 177
    .line 178
    iget-boolean v3, v7, Landroidx/work/c;->b:Z

    .line 179
    .line 180
    iput-boolean v3, v6, Landroidx/work/c;->b:Z

    .line 181
    .line 182
    iget-boolean v3, v7, Landroidx/work/c;->c:Z

    .line 183
    .line 184
    iput-boolean v3, v6, Landroidx/work/c;->c:Z

    .line 185
    .line 186
    iget v3, v7, Landroidx/work/c;->a:I

    .line 187
    .line 188
    iput v3, v6, Landroidx/work/c;->a:I

    .line 189
    .line 190
    iget-boolean v3, v7, Landroidx/work/c;->d:Z

    .line 191
    .line 192
    iput-boolean v3, v6, Landroidx/work/c;->d:Z

    .line 193
    .line 194
    iget-boolean v3, v7, Landroidx/work/c;->e:Z

    .line 195
    .line 196
    iput-boolean v3, v6, Landroidx/work/c;->e:Z

    .line 197
    .line 198
    iget-object v3, v7, Landroidx/work/c;->h:Landroidx/work/e;

    .line 199
    .line 200
    iput-object v3, v6, Landroidx/work/c;->h:Landroidx/work/e;

    .line 201
    .line 202
    iput-object v6, v1, Lt1/i;->j:Landroidx/work/c;

    .line 203
    .line 204
    iget v3, v2, Lt1/i;->k:I

    .line 205
    .line 206
    iput v3, v1, Lt1/i;->k:I

    .line 207
    .line 208
    iget v3, v2, Lt1/i;->l:I

    .line 209
    .line 210
    iput v3, v1, Lt1/i;->l:I

    .line 211
    .line 212
    iget-wide v3, v2, Lt1/i;->m:J

    .line 213
    .line 214
    iput-wide v3, v1, Lt1/i;->m:J

    .line 215
    .line 216
    iget-wide v3, v2, Lt1/i;->n:J

    .line 217
    .line 218
    iput-wide v3, v1, Lt1/i;->n:J

    .line 219
    .line 220
    iget-wide v3, v2, Lt1/i;->o:J

    .line 221
    .line 222
    iput-wide v3, v1, Lt1/i;->o:J

    .line 223
    .line 224
    iget-wide v3, v2, Lt1/i;->p:J

    .line 225
    .line 226
    iput-wide v3, v1, Lt1/i;->p:J

    .line 227
    .line 228
    iget-boolean v3, v2, Lt1/i;->q:Z

    .line 229
    .line 230
    iput-boolean v3, v1, Lt1/i;->q:Z

    .line 231
    .line 232
    iget v2, v2, Lt1/i;->r:I

    .line 233
    .line 234
    iput v2, v1, Lt1/i;->r:I

    .line 235
    .line 236
    iput-object v1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 237
    .line 238
    iget-object v2, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v2, Ljava/util/UUID;

    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iput-object v2, v1, Lt1/i;->a:Ljava/lang/String;

    .line 247
    .line 248
    return-object v0
.end method

.method public f()Lf2/j;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, " backendName"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ""

    .line 11
    .line 12
    :goto_0
    iget-object v1, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lc2/c;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, " priority"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    new-instance v0, Lf2/j;

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, [B

    .line 39
    .line 40
    iget-object v3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Lc2/c;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, v3}, Lf2/j;-><init>(Ljava/lang/String;[BLc2/c;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v2, "Missing required properties:"

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1
.end method

.method public get()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Landroidx/emoji2/text/t;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls3/a;

    .line 9
    .line 10
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/content/Context;

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ls3/a;

    .line 19
    .line 20
    invoke-interface {v1}, Ls3/a;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lm2/d;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lt2/i;

    .line 29
    .line 30
    invoke-virtual {v2}, Lt2/i;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ll2/b;

    .line 35
    .line 36
    new-instance v3, Landroidx/emoji2/text/t;

    .line 37
    .line 38
    const/16 v4, 0xf

    .line 39
    .line 40
    invoke-direct {v3, v0, v1, v2, v4}, Landroidx/emoji2/text/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    return-object v3

    .line 44
    :pswitch_0
    new-instance v6, Lt2/i;

    .line 45
    .line 46
    const/16 v0, 0x18

    .line 47
    .line 48
    invoke-direct {v6, v0}, Lt2/i;-><init>(I)V

    .line 49
    .line 50
    .line 51
    new-instance v7, Lt2/i;

    .line 52
    .line 53
    const/16 v0, 0x17

    .line 54
    .line 55
    invoke-direct {v7, v0}, Lt2/i;-><init>(I)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lk2/c;

    .line 61
    .line 62
    invoke-virtual {v0}, Lk2/c;->get()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v8, v0

    .line 67
    check-cast v8, Lk2/d;

    .line 68
    .line 69
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lk/h3;

    .line 72
    .line 73
    invoke-virtual {v0}, Lk/h3;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v9, v0

    .line 78
    check-cast v9, Ll2/j;

    .line 79
    .line 80
    iget-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lr1/h;

    .line 83
    .line 84
    invoke-virtual {v0}, Lr1/h;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v10, v0

    .line 89
    check-cast v10, Lr1/h;

    .line 90
    .line 91
    new-instance v5, Lf2/r;

    .line 92
    .line 93
    invoke-direct/range {v5 .. v10}, Lf2/r;-><init>(Lt2/i;Lt2/i;Lk2/d;Ll2/j;Lr1/h;)V

    .line 94
    .line 95
    .line 96
    return-object v5

    .line 97
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public getDescription()Landroid/content/ClipDescription;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object v0
.end method

.method public h(Li2/a;Ljava/io/ByteArrayOutputStream;)V
    .locals 4

    .line 1
    new-instance v0, Ln3/e;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lk3/d;

    .line 14
    .line 15
    invoke-direct {v0, p2, v1, v2, v3}, Ln3/e;-><init>(Ljava/io/ByteArrayOutputStream;Ljava/util/HashMap;Ljava/util/HashMap;Lk3/d;)V

    .line 16
    .line 17
    .line 18
    const-class p2, Li2/a;

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lk3/d;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {v1, p1, v0}, Lk3/a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p1, Lk3/b;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "No encoder for "

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method

.method public i(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu1/i;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lu1/i;->execute(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public j(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/r0;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/u0;

    .line 4
    .line 5
    const-string v1, "key"

    .line 6
    .line 7
    invoke-static {p1, v1}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroidx/lifecycle/w0;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Landroidx/lifecycle/w0;->a:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroidx/lifecycle/r0;

    .line 24
    .line 25
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    instance-of p1, v0, Landroidx/lifecycle/o0;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    check-cast v0, Landroidx/lifecycle/o0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    :goto_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-static {v2}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, Landroidx/lifecycle/o0;->d:Landroidx/lifecycle/o;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object p2, v0, Landroidx/lifecycle/o0;->e:Lc1/d;

    .line 49
    .line 50
    invoke-static {p2}, Lg4/i;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2, p2, p1}, Landroidx/lifecycle/k0;->a(Landroidx/lifecycle/r0;Lc1/d;Landroidx/lifecycle/o;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 57
    .line 58
    invoke-static {v2, p1}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_2
    new-instance v2, Lq0/d;

    .line 63
    .line 64
    iget-object v3, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Lq0/b;

    .line 67
    .line 68
    invoke-direct {v2, v3}, Lq0/d;-><init>(Lq0/b;)V

    .line 69
    .line 70
    .line 71
    sget-object v3, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/s0;

    .line 72
    .line 73
    iget-object v4, v2, Lq0/b;->a:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-interface {v4, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :try_start_0
    invoke-interface {v0, p2, v2}, Landroidx/lifecycle/u0;->b(Ljava/lang/Class;Lq0/d;)Landroidx/lifecycle/r0;

    .line 79
    .line 80
    .line 81
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    goto :goto_1

    .line 83
    :catch_0
    invoke-interface {v0, p2}, Landroidx/lifecycle/u0;->a(Ljava/lang/Class;)Landroidx/lifecycle/r0;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    :goto_1
    const-string v0, "viewModel"

    .line 88
    .line 89
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Landroidx/lifecycle/r0;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/lifecycle/r0;->b()V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-object p2
.end method

.method public k(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v2, v1}, Lv/a;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public l(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p1, v1}, Lb3/g;->t(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public m(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lk/v;->a()Lk/v;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v2, v0, Lk/v;->a:Lk/n2;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-virtual {v2, v1, p1, v3}, Lk/n2;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return-object p1
.end method

.method public n(IILk/u0;)Landroid/graphics/Typeface;
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/util/TypedValue;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/util/TypedValue;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Landroid/content/Context;

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object v1, Lx/k;->a:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    :goto_0
    return-object p1

    .line 45
    :cond_2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-virtual {v4, v5, v0, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 51
    .line 52
    .line 53
    const-string v1, "ResourcesCompat"

    .line 54
    .line 55
    iget-object v3, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz v3, :cond_9

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v3, "res/"

    .line 64
    .line 65
    invoke-virtual {v6, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {p3}, Lk/u0;->a()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_3
    iget v3, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 77
    .line 78
    sget-object v8, Ly/f;->b:Lo/k;

    .line 79
    .line 80
    invoke-static {v4, v5, v6, v3, p2}, Ly/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v8, v3}, Lo/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Landroid/graphics/Typeface;

    .line 89
    .line 90
    const/16 v9, 0xa

    .line 91
    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 101
    .line 102
    .line 103
    new-instance p2, La2/b;

    .line 104
    .line 105
    invoke-direct {p2, v9, p3, v3}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 109
    .line 110
    .line 111
    move-object p1, v3

    .line 112
    goto/16 :goto_7

    .line 113
    .line 114
    :cond_4
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    const-string v7, ".xml"

    .line 119
    .line 120
    invoke-virtual {v3, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_6

    .line 125
    .line 126
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v3, v4}, Lx/b;->c(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lx/d;

    .line 131
    .line 132
    .line 133
    move-result-object v3
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 134
    if-nez v3, :cond_5

    .line 135
    .line 136
    :try_start_1
    const-string p2, "Failed to find font-family tag"

    .line 137
    .line 138
    invoke-static {v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p3}, Lk/u0;->a()V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 142
    .line 143
    .line 144
    goto/16 :goto_7

    .line 145
    .line 146
    :catch_0
    move-exception v0

    .line 147
    move-object p2, v0

    .line 148
    move-object v10, p3

    .line 149
    move-object p3, p2

    .line 150
    move-object p2, v10

    .line 151
    goto/16 :goto_4

    .line 152
    .line 153
    :catch_1
    move-exception v0

    .line 154
    move-object p2, v0

    .line 155
    move-object v10, p3

    .line 156
    move-object p3, p2

    .line 157
    move-object p2, v10

    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_5
    :try_start_2
    iget v7, v0, Landroid/util/TypedValue;->assetCookie:I
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 161
    .line 162
    move v8, p2

    .line 163
    move-object v9, p3

    .line 164
    :try_start_3
    invoke-static/range {v2 .. v9}, Ly/f;->a(Landroid/content/Context;Lx/d;Landroid/content/res/Resources;ILjava/lang/String;IILk/u0;)Landroid/graphics/Typeface;

    .line 165
    .line 166
    .line 167
    move-result-object p1
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 168
    goto/16 :goto_7

    .line 169
    .line 170
    :catch_2
    move-exception v0

    .line 171
    move-object p2, v9

    .line 172
    :goto_1
    move-object p3, v0

    .line 173
    goto :goto_4

    .line 174
    :catch_3
    move-exception v0

    .line 175
    move-object p2, v9

    .line 176
    :goto_2
    move-object p3, v0

    .line 177
    goto :goto_5

    .line 178
    :catch_4
    move-exception v0

    .line 179
    move-object p2, p3

    .line 180
    goto :goto_1

    .line 181
    :catch_5
    move-exception v0

    .line 182
    move-object p2, p3

    .line 183
    goto :goto_2

    .line 184
    :cond_6
    move v7, p2

    .line 185
    move-object p2, p3

    .line 186
    :try_start_4
    iget p3, v0, Landroid/util/TypedValue;->assetCookie:I

    .line 187
    .line 188
    move-object v3, v2

    .line 189
    sget-object v2, Ly/f;->a:Lb3/g;

    .line 190
    .line 191
    invoke-virtual/range {v2 .. v7}, Lb3/g;->l(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-eqz v0, :cond_7

    .line 196
    .line 197
    invoke-static {v4, v5, v6, p3, v7}, Ly/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    invoke-virtual {v8, p3, v0}, Lo/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :cond_7
    if-eqz v0, :cond_8

    .line 205
    .line 206
    new-instance p3, Landroid/os/Handler;

    .line 207
    .line 208
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-direct {p3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 213
    .line 214
    .line 215
    new-instance v2, La2/b;

    .line 216
    .line 217
    invoke-direct {v2, v9, p2, v0}, La2/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 221
    .line 222
    .line 223
    :goto_3
    move-object p1, v0

    .line 224
    goto :goto_7

    .line 225
    :cond_8
    invoke-virtual {p2}, Lk/u0;->a()V
    :try_end_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :catch_6
    move-exception v0

    .line 230
    goto :goto_1

    .line 231
    :catch_7
    move-exception v0

    .line 232
    goto :goto_2

    .line 233
    :goto_4
    const-string v0, "Failed to read xml resource "

    .line 234
    .line 235
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v1, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 240
    .line 241
    .line 242
    goto :goto_6

    .line 243
    :goto_5
    const-string v0, "Failed to parse xml resource "

    .line 244
    .line 245
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v1, v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 250
    .line 251
    .line 252
    :goto_6
    invoke-virtual {p2}, Lk/u0;->a()V

    .line 253
    .line 254
    .line 255
    :goto_7
    return-object p1

    .line 256
    :cond_9
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    .line 257
    .line 258
    new-instance p2, Ljava/lang/StringBuilder;

    .line 259
    .line 260
    const-string p3, "Resource \""

    .line 261
    .line 262
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string p3, "\" ("

    .line 273
    .line 274
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string p3, ") is not a Font: "

    .line 285
    .line 286
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object p2

    .line 296
    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw p1
.end method

.method public o(Ljava/lang/String;)Lt1/d;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const-string v2, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?"

    .line 7
    .line 8
    invoke-static {v1, v2}, Lz0/j;->d(ILjava/lang/String;)Lz0/j;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lz0/j;->f(I)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v2, v1, p1}, Lz0/j;->g(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lz0/i;->g(Ld1/d;)Landroid/database/Cursor;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    const-string v0, "work_spec_id"

    .line 29
    .line 30
    invoke-static {p1, v0}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const-string v1, "system_id"

    .line 35
    .line 36
    invoke-static {p1, v1}, Lz2/b;->i(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    new-instance v3, Lt1/d;

    .line 55
    .line 56
    invoke-direct {v3, v0, v1}, Lt1/d;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    const/4 v3, 0x0

    .line 63
    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 67
    .line 68
    .line 69
    return-object v3

    .line 70
    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lz0/j;->h()V

    .line 74
    .line 75
    .line 76
    throw v0
.end method

.method public p(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z
    .locals 7

    .line 1
    iget v0, p4, Landroidx/emoji2/text/a0;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroidx/emoji2/text/h;

    .line 13
    .line 14
    invoke-virtual {p4}, Landroidx/emoji2/text/a0;->b()Lm0/a;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Lf0/h0;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iget-object v6, v4, Lf0/h0;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v4, v4, Lf0/h0;->a:I

    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    check-cast v0, Landroidx/emoji2/text/e;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v4, Landroidx/emoji2/text/e;->b:Ljava/lang/ThreadLocal;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    new-instance v5, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 64
    .line 65
    .line 66
    :goto_0
    if-ge p2, p3, :cond_2

    .line 67
    .line 68
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    add-int/lit8 p2, p2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    iget-object p1, v0, Landroidx/emoji2/text/e;->a:Landroid/text/TextPaint;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget p3, Ly/d;->a:I

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iget p2, p4, Landroidx/emoji2/text/a0;->c:I

    .line 91
    .line 92
    and-int/lit8 p2, p2, 0x4

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    or-int/lit8 p1, p2, 0x2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    or-int/lit8 p1, p2, 0x1

    .line 100
    .line 101
    :goto_1
    iput p1, p4, Landroidx/emoji2/text/a0;->c:I

    .line 102
    .line 103
    :cond_4
    iget p1, p4, Landroidx/emoji2/text/a0;->c:I

    .line 104
    .line 105
    and-int/lit8 p1, p1, 0x3

    .line 106
    .line 107
    if-ne p1, v1, :cond_5

    .line 108
    .line 109
    return v3

    .line 110
    :cond_5
    return v2
.end method

.method public q(Lt1/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lt1/b;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lt1/b;->e(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public s(Landroidx/lifecycle/m;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/lifecycle/q0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/lifecycle/q0;->run()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Landroidx/lifecycle/q0;

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroidx/lifecycle/v;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/q0;-><init>(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public t(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/q;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Landroidx/emoji2/text/s;

    .line 12
    .line 13
    iget-object v6, v0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Lr1/h;

    .line 16
    .line 17
    iget-object v6, v6, Lr1/h;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Landroidx/emoji2/text/x;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Landroidx/emoji2/text/s;-><init>(Landroidx/emoji2/text/x;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 44
    .line 45
    iget-object v13, v13, Landroidx/emoji2/text/x;->a:Landroid/util/SparseArray;

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    check-cast v13, Landroidx/emoji2/text/x;

    .line 56
    .line 57
    :goto_2
    iget v14, v5, Landroidx/emoji2/text/s;->a:I

    .line 58
    .line 59
    const/4 v15, 0x3

    .line 60
    if-eq v14, v12, :cond_3

    .line 61
    .line 62
    if-nez v13, :cond_2

    .line 63
    .line 64
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 65
    .line 66
    .line 67
    :goto_3
    move v13, v8

    .line 68
    goto :goto_6

    .line 69
    :cond_2
    iput v12, v5, Landroidx/emoji2/text/s;->a:I

    .line 70
    .line 71
    iput-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 72
    .line 73
    iput v8, v5, Landroidx/emoji2/text/s;->f:I

    .line 74
    .line 75
    :goto_4
    move v13, v12

    .line 76
    goto :goto_6

    .line 77
    :cond_3
    if-eqz v13, :cond_4

    .line 78
    .line 79
    iput-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 80
    .line 81
    iget v13, v5, Landroidx/emoji2/text/s;->f:I

    .line 82
    .line 83
    add-int/2addr v13, v8

    .line 84
    iput v13, v5, Landroidx/emoji2/text/s;->f:I

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    const v13, 0xfe0e

    .line 88
    .line 89
    .line 90
    if-ne v9, v13, :cond_5

    .line 91
    .line 92
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const v13, 0xfe0f

    .line 97
    .line 98
    .line 99
    if-ne v9, v13, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 103
    .line 104
    iget-object v14, v13, Landroidx/emoji2/text/x;->b:Landroidx/emoji2/text/a0;

    .line 105
    .line 106
    if-eqz v14, :cond_9

    .line 107
    .line 108
    iget v14, v5, Landroidx/emoji2/text/s;->f:I

    .line 109
    .line 110
    if-ne v14, v8, :cond_8

    .line 111
    .line 112
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->b()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_7

    .line 117
    .line 118
    iget-object v13, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 119
    .line 120
    iput-object v13, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/x;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 123
    .line 124
    .line 125
    :goto_5
    move v13, v15

    .line 126
    goto :goto_6

    .line 127
    :cond_7
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iput-object v13, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/x;

    .line 132
    .line 133
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->a()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_6
    iput v9, v5, Landroidx/emoji2/text/s;->e:I

    .line 142
    .line 143
    if-eq v13, v8, :cond_e

    .line 144
    .line 145
    if-eq v13, v12, :cond_c

    .line 146
    .line 147
    if-eq v13, v15, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    if-nez p5, :cond_b

    .line 151
    .line 152
    iget-object v12, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/x;

    .line 153
    .line 154
    iget-object v12, v12, Landroidx/emoji2/text/x;->b:Landroidx/emoji2/text/a0;

    .line 155
    .line 156
    invoke-virtual {v0, v1, v7, v6, v12}, Landroidx/emoji2/text/t;->p(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_0

    .line 161
    .line 162
    :cond_b
    iget-object v11, v5, Landroidx/emoji2/text/s;->d:Landroidx/emoji2/text/x;

    .line 163
    .line 164
    iget-object v11, v11, Landroidx/emoji2/text/x;->b:Landroidx/emoji2/text/a0;

    .line 165
    .line 166
    invoke-interface {v4, v1, v7, v6, v11}, Landroidx/emoji2/text/q;->e(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    add-int/lit8 v10, v10, 0x1

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    add-int/2addr v12, v6

    .line 179
    if-ge v12, v2, :cond_d

    .line 180
    .line 181
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    move v9, v6

    .line 186
    :cond_d
    move v6, v12

    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    add-int/2addr v6, v7

    .line 198
    if-ge v6, v2, :cond_0

    .line 199
    .line 200
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    move v9, v7

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_f
    iget v2, v5, Landroidx/emoji2/text/s;->a:I

    .line 208
    .line 209
    if-ne v2, v12, :cond_12

    .line 210
    .line 211
    iget-object v2, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 212
    .line 213
    iget-object v2, v2, Landroidx/emoji2/text/x;->b:Landroidx/emoji2/text/a0;

    .line 214
    .line 215
    if-eqz v2, :cond_12

    .line 216
    .line 217
    iget v2, v5, Landroidx/emoji2/text/s;->f:I

    .line 218
    .line 219
    if-gt v2, v8, :cond_10

    .line 220
    .line 221
    invoke-virtual {v5}, Landroidx/emoji2/text/s;->b()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_12

    .line 226
    .line 227
    :cond_10
    if-ge v10, v3, :cond_12

    .line 228
    .line 229
    if-eqz v11, :cond_12

    .line 230
    .line 231
    if-nez p5, :cond_11

    .line 232
    .line 233
    iget-object v2, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 234
    .line 235
    iget-object v2, v2, Landroidx/emoji2/text/x;->b:Landroidx/emoji2/text/a0;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v7, v6, v2}, Landroidx/emoji2/text/t;->p(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-nez v2, :cond_12

    .line 242
    .line 243
    :cond_11
    iget-object v2, v5, Landroidx/emoji2/text/s;->c:Landroidx/emoji2/text/x;

    .line 244
    .line 245
    iget-object v2, v2, Landroidx/emoji2/text/x;->b:Landroidx/emoji2/text/a0;

    .line 246
    .line 247
    invoke-interface {v4, v1, v7, v6, v2}, Landroidx/emoji2/text/q;->e(Ljava/lang/CharSequence;IILandroidx/emoji2/text/a0;)Z

    .line 248
    .line 249
    .line 250
    :cond_12
    invoke-interface {v4}, Landroidx/emoji2/text/q;->c()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    return-object v1
.end method

.method public u()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz0/i;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lt1/e;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz0/l;->a()Le1/f;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Le1/b;->e(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v2, v3, p1}, Le1/b;->f(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0}, Lz0/i;->c()V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v2}, Le1/f;->l()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lz0/i;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    invoke-virtual {v0}, Lz0/i;->f()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lz0/l;->c(Le1/f;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method public w(Lf2/j;IZ)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v1, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ll2/b;

    .line 10
    .line 11
    new-instance v4, Landroid/content/ComponentName;

    .line 12
    .line 13
    iget-object v5, v1, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Landroid/content/Context;

    .line 16
    .line 17
    const-class v6, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 18
    .line 19
    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    const-string v6, "jobscheduler"

    .line 23
    .line 24
    invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    check-cast v6, Landroid/app/job/JobScheduler;

    .line 29
    .line 30
    new-instance v7, Ljava/util/zip/Adler32;

    .line 31
    .line 32
    invoke-direct {v7}, Ljava/util/zip/Adler32;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const-string v8, "UTF-8"

    .line 40
    .line 41
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual {v5, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    .line 50
    .line 51
    .line 52
    iget-object v5, v0, Lf2/j;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v9, v0, Lf2/j;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v5, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    .line 65
    .line 66
    .line 67
    const/4 v5, 0x4

    .line 68
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iget-object v8, v0, Lf2/j;->c:Lc2/c;

    .line 73
    .line 74
    invoke-static {v8}, Lp2/a;->a(Lc2/c;)I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    invoke-virtual {v5, v10}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    .line 87
    .line 88
    .line 89
    iget-object v5, v0, Lf2/j;->b:[B

    .line 90
    .line 91
    if-eqz v5, :cond_0

    .line 92
    .line 93
    invoke-virtual {v7, v5}, Ljava/util/zip/Adler32;->update([B)V

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-virtual {v7}, Ljava/util/zip/Adler32;->getValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v10

    .line 100
    long-to-int v7, v10

    .line 101
    const-string v10, "JobInfoScheduler"

    .line 102
    .line 103
    const-string v11, "attemptNumber"

    .line 104
    .line 105
    if-nez p3, :cond_2

    .line 106
    .line 107
    invoke-virtual {v6}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    :cond_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-eqz v13, :cond_2

    .line 120
    .line 121
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    check-cast v13, Landroid/app/job/JobInfo;

    .line 126
    .line 127
    invoke-virtual {v13}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    invoke-virtual {v14, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    invoke-virtual {v13}, Landroid/app/job/JobInfo;->getId()I

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-ne v13, v7, :cond_1

    .line 140
    .line 141
    if-lt v14, v2, :cond_2

    .line 142
    .line 143
    const-string v2, "Upload for context %s is already scheduled. Returning..."

    .line 144
    .line 145
    invoke-static {v10, v2, v0}, Lb3/g;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    iget-object v12, v1, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v12, Lm2/d;

    .line 152
    .line 153
    check-cast v12, Lm2/h;

    .line 154
    .line 155
    invoke-virtual {v12}, Lm2/h;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    invoke-static {v8}, Lp2/a;->a(Lc2/c;)I

    .line 160
    .line 161
    .line 162
    move-result v13

    .line 163
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    filled-new-array {v9, v13}, [Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    const-string v14, "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"

    .line 172
    .line 173
    invoke-virtual {v12, v14, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    :try_start_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    const/4 v14, 0x0

    .line 182
    if-eqz v13, :cond_3

    .line 183
    .line 184
    invoke-interface {v12, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v15

    .line 188
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    goto :goto_0

    .line 193
    :cond_3
    const-wide/16 v15, 0x0

    .line 194
    .line 195
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :goto_0
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 203
    .line 204
    .line 205
    move-result-wide v14

    .line 206
    new-instance v12, Landroid/app/job/JobInfo$Builder;

    .line 207
    .line 208
    invoke-direct {v12, v7, v4}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 209
    .line 210
    .line 211
    move-object v4, v6

    .line 212
    move/from16 v16, v7

    .line 213
    .line 214
    invoke-virtual {v3, v8, v14, v15, v2}, Ll2/b;->a(Lc2/c;JI)J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    invoke-virtual {v12, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 219
    .line 220
    .line 221
    iget-object v6, v3, Ll2/b;->b:Ljava/util/HashMap;

    .line 222
    .line 223
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    check-cast v6, Ll2/c;

    .line 228
    .line 229
    iget-object v6, v6, Ll2/c;->c:Ljava/util/Set;

    .line 230
    .line 231
    sget-object v7, Ll2/d;->g:Ll2/d;

    .line 232
    .line 233
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    const/4 v1, 0x1

    .line 238
    if-eqz v7, :cond_4

    .line 239
    .line 240
    const/4 v7, 0x2

    .line 241
    invoke-virtual {v12, v7}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_4
    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 246
    .line 247
    .line 248
    :goto_1
    sget-object v7, Ll2/d;->i:Ll2/d;

    .line 249
    .line 250
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-eqz v7, :cond_5

    .line 255
    .line 256
    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 257
    .line 258
    .line 259
    :cond_5
    sget-object v7, Ll2/d;->h:Ll2/d;

    .line 260
    .line 261
    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-eqz v6, :cond_6

    .line 266
    .line 267
    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 268
    .line 269
    .line 270
    :cond_6
    new-instance v1, Landroid/os/PersistableBundle;

    .line 271
    .line 272
    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v11, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 276
    .line 277
    .line 278
    const-string v6, "backendName"

    .line 279
    .line 280
    invoke-virtual {v1, v6, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    const-string v6, "priority"

    .line 284
    .line 285
    invoke-static {v8}, Lp2/a;->a(Lc2/c;)I

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    invoke-virtual {v1, v6, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 290
    .line 291
    .line 292
    if-eqz v5, :cond_7

    .line 293
    .line 294
    const-string v6, "extras"

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    invoke-static {v5, v7}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-virtual {v1, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    :cond_7
    invoke-virtual {v12, v1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 305
    .line 306
    .line 307
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v3, v8, v14, v15, v2}, Ll2/b;->a(Lc2/c;JI)J

    .line 312
    .line 313
    .line 314
    move-result-wide v5

    .line 315
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    filled-new-array {v0, v1, v3, v13, v2}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-static {v10}, Lb3/g;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    const/4 v2, 0x3

    .line 332
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-eqz v2, :cond_8

    .line 337
    .line 338
    const-string v2, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"

    .line 339
    .line 340
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    :cond_8
    invoke-virtual {v12}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v4, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :catchall_0
    move-exception v0

    .line 356
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 357
    .line 358
    .line 359
    throw v0
.end method

.method public x(Lc2/a;)V
    .locals 8

    .line 1
    new-instance v0, Lf0/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lf2/r;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lf2/j;

    .line 13
    .line 14
    iget-object v3, p0, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lc2/b;

    .line 17
    .line 18
    iget-object v4, v1, Lf2/r;->c:Lk2/d;

    .line 19
    .line 20
    invoke-static {}, Lf2/j;->a()Landroidx/emoji2/text/t;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    iget-object v6, v2, Lf2/j;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v5, v6}, Landroidx/emoji2/text/t;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v6, Lc2/c;->g:Lc2/c;

    .line 30
    .line 31
    iput-object v6, v5, Landroidx/emoji2/text/t;->j:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v2, v2, Lf2/j;->b:[B

    .line 34
    .line 35
    iput-object v2, v5, Landroidx/emoji2/text/t;->i:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {v5}, Landroidx/emoji2/text/t;->f()Lf2/j;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v5, Lf2/h;

    .line 42
    .line 43
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v6, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v6, v5, Lf2/h;->f:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v6, v1, Lf2/r;->a:Lt2/i;

    .line 54
    .line 55
    invoke-virtual {v6}, Lt2/i;->s()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    iput-object v6, v5, Lf2/h;->d:Ljava/io/Serializable;

    .line 64
    .line 65
    iget-object v1, v1, Lf2/r;->b:Lt2/i;

    .line 66
    .line 67
    invoke-virtual {v1}, Lt2/i;->s()J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, v5, Lf2/h;->e:Ljava/io/Serializable;

    .line 76
    .line 77
    const-string v1, "PLAY_BILLING_LIBRARY"

    .line 78
    .line 79
    iput-object v1, v5, Lf2/h;->a:Ljava/io/Serializable;

    .line 80
    .line 81
    new-instance v1, Lf2/n;

    .line 82
    .line 83
    iget-object p1, p1, Lc2/a;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lcom/google/android/gms/internal/play_billing/zzlk;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/zzfv;->zzh()[B

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {v1, v3, p1}, Lf2/n;-><init>(Lc2/b;[B)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v5, Lf2/h;->c:Ljava/lang/Object;

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    iput-object p1, v5, Lf2/h;->b:Ljava/io/Serializable;

    .line 98
    .line 99
    invoke-virtual {v5}, Lf2/h;->c()Lf2/i;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast v4, Lk2/b;

    .line 104
    .line 105
    iget-object v1, v4, Lk2/b;->b:Ljava/util/concurrent/Executor;

    .line 106
    .line 107
    new-instance v3, La2/f;

    .line 108
    .line 109
    invoke-direct {v3, v4, v2, v0, p1}, La2/f;-><init>(Lk2/b;Lf2/j;Lf0/g;Lf2/i;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/emoji2/text/t;->h:Ljava/lang/Object;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null backendName"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method
