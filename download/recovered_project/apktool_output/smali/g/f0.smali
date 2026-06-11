.class public final Lg/f0;
.super Lg/r;
.source "SourceFile"

# interfaces
.implements Lj/l;
.implements Landroid/view/LayoutInflater$Factory2;


# static fields
.field public static final n0:Lo/l;

.field public static final o0:[I

.field public static final p0:Z


# instance fields
.field public A:Li/b;

.field public B:Landroidx/appcompat/widget/ActionBarContextView;

.field public C:Landroid/widget/PopupWindow;

.field public D:Lg/s;

.field public E:Lf0/w0;

.field public F:Z

.field public G:Landroid/view/ViewGroup;

.field public H:Landroid/widget/TextView;

.field public I:Landroid/view/View;

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:[Lg/e0;

.field public S:Lg/e0;

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Landroid/content/res/Configuration;

.field public final Y:I

.field public Z:I

.field public a0:I

.field public b0:Z

.field public c0:Lg/a0;

.field public d0:Lg/a0;

.field public e0:Z

.field public f0:I

.field public final g0:Lg/s;

.field public h0:Z

.field public i0:Landroid/graphics/Rect;

.field public j0:Landroid/graphics/Rect;

.field public k0:Lg/i0;

.field public l0:Landroid/window/OnBackInvokedDispatcher;

.field public m0:Landroid/window/OnBackInvokedCallback;

.field public final p:Ljava/lang/Object;

.field public final q:Landroid/content/Context;

.field public r:Landroid/view/Window;

.field public s:Lg/z;

.field public final t:Ljava/lang/Object;

.field public u:Lg/a;

.field public v:Li/i;

.field public w:Ljava/lang/CharSequence;

.field public x:Lk/l1;

.field public y:Lg/t;

.field public z:Lg/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lo/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lg/f0;->n0:Lo/l;

    .line 8
    .line 9
    const v0, 0x1010054

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lg/f0;->o0:[I

    .line 17
    .line 18
    const-string v0, "robolectric"

    .line 19
    .line 20
    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    xor-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    sput-boolean v0, Lg/f0;->p0:Z

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lg/l;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lg/f0;->E:Lf0/w0;

    .line 6
    .line 7
    const/16 v1, -0x64

    .line 8
    .line 9
    iput v1, p0, Lg/f0;->Y:I

    .line 10
    .line 11
    new-instance v2, Lg/s;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p0, v3}, Lg/s;-><init>(Lg/f0;I)V

    .line 15
    .line 16
    .line 17
    iput-object v2, p0, Lg/f0;->g0:Lg/s;

    .line 18
    .line 19
    iput-object p1, p0, Lg/f0;->q:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p3, p0, Lg/f0;->t:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p4, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 24
    .line 25
    instance-of p3, p4, Landroid/app/Dialog;

    .line 26
    .line 27
    if-eqz p3, :cond_2

    .line 28
    .line 29
    :goto_0
    if-eqz p1, :cond_1

    .line 30
    .line 31
    instance-of p3, p1, Lg/k;

    .line 32
    .line 33
    if-eqz p3, :cond_0

    .line 34
    .line 35
    move-object v0, p1

    .line 36
    check-cast v0, Lg/k;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    instance-of p3, p1, Landroid/content/ContextWrapper;

    .line 40
    .line 41
    if-eqz p3, :cond_1

    .line 42
    .line 43
    check-cast p1, Landroid/content/ContextWrapper;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0}, Lg/k;->getDelegate()Lg/r;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Lg/f0;

    .line 57
    .line 58
    iget p1, p1, Lg/f0;->Y:I

    .line 59
    .line 60
    iput p1, p0, Lg/f0;->Y:I

    .line 61
    .line 62
    :cond_2
    iget p1, p0, Lg/f0;->Y:I

    .line 63
    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object p3, Lg/f0;->n0:Lo/l;

    .line 77
    .line 78
    invoke-virtual {p3, p1}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput p1, p0, Lg/f0;->Y:I

    .line 91
    .line 92
    iget-object p1, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p3, p1}, Lo/l;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_3
    if-eqz p2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0, p2}, Lg/f0;->q(Landroid/view/Window;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-static {}, Lk/v;->c()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static r(Landroid/content/Context;)Lb0/g;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lg/r;->i:Lb0/g;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    iget-object v1, v0, Lb0/g;->a:Lb0/h;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lg/x;->b(Landroid/content/res/Configuration;)Lb0/g;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0}, Lb0/g;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object v0, Lb0/g;->b:Lb0/g;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    :goto_1
    iget-object v3, v1, Lb0/h;->a:Landroid/os/LocaleList;

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    iget-object v4, p0, Lb0/g;->a:Lb0/h;

    .line 54
    .line 55
    iget-object v4, v4, Lb0/h;->a:Landroid/os/LocaleList;

    .line 56
    .line 57
    invoke-virtual {v4}, Landroid/os/LocaleList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    add-int/2addr v4, v3

    .line 62
    if-ge v2, v4, :cond_5

    .line 63
    .line 64
    iget-object v3, v1, Lb0/h;->a:Landroid/os/LocaleList;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-ge v2, v3, :cond_3

    .line 71
    .line 72
    iget-object v3, v1, Lb0/h;->a:Landroid/os/LocaleList;

    .line 73
    .line 74
    invoke-virtual {v3, v2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iget-object v3, v1, Lb0/h;->a:Landroid/os/LocaleList;

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/os/LocaleList;->size()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    sub-int v3, v2, v3

    .line 86
    .line 87
    iget-object v4, p0, Lb0/g;->a:Lb0/h;

    .line 88
    .line 89
    iget-object v4, v4, Lb0/h;->a:Landroid/os/LocaleList;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    :goto_2
    if-eqz v3, :cond_4

    .line 96
    .line 97
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    new-array v1, v1, [Ljava/util/Locale;

    .line 108
    .line 109
    invoke-interface {v0, v1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, [Ljava/util/Locale;

    .line 114
    .line 115
    new-instance v1, Landroid/os/LocaleList;

    .line 116
    .line 117
    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 118
    .line 119
    .line 120
    new-instance v0, Lb0/g;

    .line 121
    .line 122
    new-instance v2, Lb0/h;

    .line 123
    .line 124
    invoke-direct {v2, v1}, Lb0/h;-><init>(Landroid/os/LocaleList;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v2}, Lb0/g;-><init>(Lb0/h;)V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-virtual {v0}, Lb0/g;->b()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_6
    return-object v0
.end method

.method public static v(Landroid/content/Context;ILb0/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_2

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 24
    .line 25
    and-int/lit8 p0, p0, 0x30

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/16 p0, 0x20

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/16 p0, 0x10

    .line 32
    .line 33
    :goto_0
    new-instance p1, Landroid/content/res/Configuration;

    .line 34
    .line 35
    invoke-direct {p1}, Landroid/content/res/Configuration;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 p4, 0x0

    .line 39
    iput p4, p1, Landroid/content/res/Configuration;->fontScale:F

    .line 40
    .line 41
    if-eqz p3, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    iget p3, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p3, p3, -0x31

    .line 49
    .line 50
    or-int/2addr p0, p3

    .line 51
    iput p0, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    invoke-static {p1, p2}, Lg/x;->d(Landroid/content/res/Configuration;Lb0/g;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return-object p1
.end method


# virtual methods
.method public final A(Landroid/content/Context;)Lg/c0;
    .locals 3

    .line 1
    iget-object v0, p0, Lg/f0;->c0:Lg/a0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lg/a0;

    .line 6
    .line 7
    sget-object v1, Landroidx/emoji2/text/t;->k:Landroidx/emoji2/text/t;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v1, Landroidx/emoji2/text/t;

    .line 16
    .line 17
    const-string v2, "location"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Landroid/location/LocationManager;

    .line 24
    .line 25
    invoke-direct {v1, p1, v2}, Landroidx/emoji2/text/t;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Landroidx/emoji2/text/t;->k:Landroidx/emoji2/text/t;

    .line 29
    .line 30
    :cond_0
    sget-object p1, Landroidx/emoji2/text/t;->k:Landroidx/emoji2/text/t;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Lg/a0;-><init>(Lg/f0;Landroidx/emoji2/text/t;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lg/f0;->c0:Lg/a0;

    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lg/f0;->c0:Lg/a0;

    .line 38
    .line 39
    return-object p1
.end method

.method public final B(I)Lg/e0;
    .locals 4

    .line 1
    iget-object v0, p0, Lg/f0;->R:[Lg/e0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p1, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p1, 0x1

    .line 10
    .line 11
    new-array v2, v2, [Lg/e0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    array-length v3, v0

    .line 16
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iput-object v2, p0, Lg/f0;->R:[Lg/e0;

    .line 20
    .line 21
    move-object v0, v2

    .line 22
    :cond_2
    aget-object v2, v0, p1

    .line 23
    .line 24
    if-nez v2, :cond_3

    .line 25
    .line 26
    new-instance v2, Lg/e0;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput p1, v2, Lg/e0;->a:I

    .line 32
    .line 33
    iput-boolean v1, v2, Lg/e0;->n:Z

    .line 34
    .line 35
    aput-object v2, v0, p1

    .line 36
    .line 37
    :cond_3
    return-object v2
.end method

.method public final C()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg/f0;->y()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lg/f0;->L:Z

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v0, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lg/s0;

    .line 20
    .line 21
    check-cast v0, Landroid/app/Activity;

    .line 22
    .line 23
    iget-boolean v2, p0, Lg/f0;->M:Z

    .line 24
    .line 25
    invoke-direct {v1, v2, v0}, Lg/s0;-><init>(ZLandroid/app/Activity;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lg/f0;->u:Lg/a;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroid/app/Dialog;

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    new-instance v1, Lg/s0;

    .line 36
    .line 37
    check-cast v0, Landroid/app/Dialog;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lg/s0;-><init>(Landroid/app/Dialog;)V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lg/f0;->u:Lg/a;

    .line 43
    .line 44
    :cond_2
    :goto_0
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-boolean v1, p0, Lg/f0;->h0:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lg/a;->l(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    return-void
.end method

.method public final D(I)V
    .locals 2

    .line 1
    iget v0, p0, Lg/f0;->f0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    shl-int p1, v1, p1

    .line 5
    .line 6
    or-int/2addr p1, v0

    .line 7
    iput p1, p0, Lg/f0;->f0:I

    .line 8
    .line 9
    iget-boolean p1, p0, Lg/f0;->e0:Z

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lg/f0;->r:Landroid/view/Window;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    iget-object v0, p0, Lg/f0;->g0:Lg/s;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Lg/f0;->e0:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final E(Landroid/content/Context;I)I
    .locals 2

    .line 1
    const/16 v0, -0x64

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq p2, v0, :cond_5

    .line 5
    .line 6
    if-eq p2, v1, :cond_4

    .line 7
    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p2, v0, :cond_4

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p2, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Lg/f0;->d0:Lg/a0;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    new-instance p2, Lg/a0;

    .line 24
    .line 25
    invoke-direct {p2, p0, p1}, Lg/a0;-><init>(Lg/f0;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lg/f0;->d0:Lg/a0;

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lg/f0;->d0:Lg/a0;

    .line 31
    .line 32
    invoke-virtual {p1}, Lg/a0;->e()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const-string v0, "uimode"

    .line 50
    .line 51
    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Landroid/app/UiModeManager;

    .line 56
    .line 57
    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p0, p1}, Lg/f0;->A(Landroid/content/Context;)Lg/c0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lg/c0;->e()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    return p1

    .line 73
    :cond_4
    return p2

    .line 74
    :cond_5
    :goto_0
    return v1
.end method

.method public final F()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lg/f0;->T:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Lg/f0;->T:Z

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iget-boolean v3, v2, Lg/e0;->m:Z

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0, v2, v4}, Lg/f0;->u(Lg/e0;Z)V

    .line 18
    .line 19
    .line 20
    return v4

    .line 21
    :cond_0
    iget-object v0, p0, Lg/f0;->A:Li/b;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Li/b;->a()V

    .line 26
    .line 27
    .line 28
    return v4

    .line 29
    :cond_1
    invoke-virtual {p0}, Lg/f0;->C()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Lg/a;->b()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    :cond_2
    return v4

    .line 43
    :cond_3
    return v1
.end method

.method public final G(Lg/e0;Landroid/view/KeyEvent;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lg/e0;->m:Z

    .line 6
    .line 7
    iget v3, v1, Lg/e0;->a:I

    .line 8
    .line 9
    if-nez v2, :cond_1a

    .line 10
    .line 11
    iget-boolean v2, v0, Lg/f0;->W:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_9

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Lg/f0;->q:Landroid/content/Context;

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v4, v4, Landroid/content/res/Configuration;->screenLayout:I

    .line 30
    .line 31
    and-int/lit8 v4, v4, 0xf

    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    if-ne v4, v5, :cond_1

    .line 35
    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_1
    iget-object v4, v0, Lg/f0;->r:Landroid/view/Window;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x1

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    iget-object v6, v1, Lg/e0;->h:Lj/n;

    .line 48
    .line 49
    invoke-interface {v4, v3, v6}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0, v1, v5}, Lg/f0;->u(Lg/e0;Z)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string v4, "window"

    .line 60
    .line 61
    invoke-virtual {v2, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Landroid/view/WindowManager;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    invoke-virtual/range {p0 .. p2}, Lg/f0;->I(Lg/e0;Landroid/view/KeyEvent;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-nez v6, :cond_4

    .line 76
    .line 77
    goto/16 :goto_9

    .line 78
    .line 79
    :cond_4
    iget-object v6, v1, Lg/e0;->e:Lg/d0;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    const/4 v8, -0x2

    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    iget-boolean v9, v1, Lg/e0;->n:Z

    .line 86
    .line 87
    if-eqz v9, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    iget-object v2, v1, Lg/e0;->g:Landroid/view/View;

    .line 91
    .line 92
    if-eqz v2, :cond_18

    .line 93
    .line 94
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_18

    .line 99
    .line 100
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 101
    .line 102
    const/4 v6, -0x1

    .line 103
    if-ne v2, v6, :cond_18

    .line 104
    .line 105
    move v10, v6

    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_6
    :goto_0
    if-nez v6, :cond_b

    .line 109
    .line 110
    invoke-virtual {v0}, Lg/f0;->C()V

    .line 111
    .line 112
    .line 113
    iget-object v6, v0, Lg/f0;->u:Lg/a;

    .line 114
    .line 115
    if-eqz v6, :cond_7

    .line 116
    .line 117
    invoke-virtual {v6}, Lg/a;->e()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    goto :goto_1

    .line 122
    :cond_7
    const/4 v6, 0x0

    .line 123
    :goto_1
    if-nez v6, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    move-object v2, v6

    .line 127
    :goto_2
    new-instance v6, Landroid/util/TypedValue;

    .line 128
    .line 129
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v9, v10}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 145
    .line 146
    .line 147
    const v10, 0x7f030002

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 151
    .line 152
    .line 153
    iget v10, v6, Landroid/util/TypedValue;->resourceId:I

    .line 154
    .line 155
    if-eqz v10, :cond_9

    .line 156
    .line 157
    invoke-virtual {v9, v10, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 158
    .line 159
    .line 160
    :cond_9
    const v10, 0x7f0300d1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9, v10, v6, v5}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 164
    .line 165
    .line 166
    iget v6, v6, Landroid/util/TypedValue;->resourceId:I

    .line 167
    .line 168
    if-eqz v6, :cond_a

    .line 169
    .line 170
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    const v6, 0x7f0f00ff

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v6, v5}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 178
    .line 179
    .line 180
    :goto_3
    new-instance v6, Li/d;

    .line 181
    .line 182
    invoke-direct {v6, v2, v7}, Li/d;-><init>(Landroid/content/Context;I)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Li/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 190
    .line 191
    .line 192
    iput-object v6, v1, Lg/e0;->j:Li/d;

    .line 193
    .line 194
    sget-object v2, Lf/a;->j:[I

    .line 195
    .line 196
    invoke-virtual {v6, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v6, 0x56

    .line 201
    .line 202
    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    iput v6, v1, Lg/e0;->b:I

    .line 207
    .line 208
    invoke-virtual {v2, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    iput v6, v1, Lg/e0;->d:I

    .line 213
    .line 214
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 215
    .line 216
    .line 217
    new-instance v2, Lg/d0;

    .line 218
    .line 219
    iget-object v6, v1, Lg/e0;->j:Li/d;

    .line 220
    .line 221
    invoke-direct {v2, v0, v6}, Lg/d0;-><init>(Lg/f0;Li/d;)V

    .line 222
    .line 223
    .line 224
    iput-object v2, v1, Lg/e0;->e:Lg/d0;

    .line 225
    .line 226
    const/16 v2, 0x51

    .line 227
    .line 228
    iput v2, v1, Lg/e0;->c:I

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_b
    iget-boolean v2, v1, Lg/e0;->n:Z

    .line 232
    .line 233
    if-eqz v2, :cond_c

    .line 234
    .line 235
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-lez v2, :cond_c

    .line 240
    .line 241
    iget-object v2, v1, Lg/e0;->e:Lg/d0;

    .line 242
    .line 243
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 244
    .line 245
    .line 246
    :cond_c
    :goto_4
    iget-object v2, v1, Lg/e0;->g:Landroid/view/View;

    .line 247
    .line 248
    if-eqz v2, :cond_d

    .line 249
    .line 250
    iput-object v2, v1, Lg/e0;->f:Landroid/view/View;

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_d
    iget-object v2, v1, Lg/e0;->h:Lj/n;

    .line 254
    .line 255
    if-nez v2, :cond_e

    .line 256
    .line 257
    goto/16 :goto_8

    .line 258
    .line 259
    :cond_e
    iget-object v2, v0, Lg/f0;->z:Lg/u;

    .line 260
    .line 261
    if-nez v2, :cond_f

    .line 262
    .line 263
    new-instance v2, Lg/u;

    .line 264
    .line 265
    invoke-direct {v2, v0}, Lg/u;-><init>(Lg/f0;)V

    .line 266
    .line 267
    .line 268
    iput-object v2, v0, Lg/f0;->z:Lg/u;

    .line 269
    .line 270
    :cond_f
    iget-object v2, v0, Lg/f0;->z:Lg/u;

    .line 271
    .line 272
    iget-object v6, v1, Lg/e0;->i:Lj/j;

    .line 273
    .line 274
    if-nez v6, :cond_10

    .line 275
    .line 276
    new-instance v6, Lj/j;

    .line 277
    .line 278
    iget-object v9, v1, Lg/e0;->j:Li/d;

    .line 279
    .line 280
    invoke-direct {v6, v9}, Lj/j;-><init>(Landroid/content/ContextWrapper;)V

    .line 281
    .line 282
    .line 283
    iput-object v6, v1, Lg/e0;->i:Lj/j;

    .line 284
    .line 285
    iput-object v2, v6, Lj/j;->k:Lj/y;

    .line 286
    .line 287
    iget-object v2, v1, Lg/e0;->h:Lj/n;

    .line 288
    .line 289
    iget-object v9, v2, Lj/n;->a:Landroid/content/Context;

    .line 290
    .line 291
    invoke-virtual {v2, v6, v9}, Lj/n;->b(Lj/z;Landroid/content/Context;)V

    .line 292
    .line 293
    .line 294
    :cond_10
    iget-object v2, v1, Lg/e0;->i:Lj/j;

    .line 295
    .line 296
    iget-object v6, v1, Lg/e0;->e:Lg/d0;

    .line 297
    .line 298
    iget-object v9, v2, Lj/j;->j:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 299
    .line 300
    if-nez v9, :cond_12

    .line 301
    .line 302
    iget-object v9, v2, Lj/j;->h:Landroid/view/LayoutInflater;

    .line 303
    .line 304
    const v10, 0x7f0b000d

    .line 305
    .line 306
    .line 307
    invoke-virtual {v9, v10, v6, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    check-cast v6, Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 312
    .line 313
    iput-object v6, v2, Lj/j;->j:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 314
    .line 315
    iget-object v6, v2, Lj/j;->l:Lj/i;

    .line 316
    .line 317
    if-nez v6, :cond_11

    .line 318
    .line 319
    new-instance v6, Lj/i;

    .line 320
    .line 321
    invoke-direct {v6, v2}, Lj/i;-><init>(Lj/j;)V

    .line 322
    .line 323
    .line 324
    iput-object v6, v2, Lj/j;->l:Lj/i;

    .line 325
    .line 326
    :cond_11
    iget-object v6, v2, Lj/j;->j:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 327
    .line 328
    iget-object v9, v2, Lj/j;->l:Lj/i;

    .line 329
    .line 330
    invoke-virtual {v6, v9}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 331
    .line 332
    .line 333
    iget-object v6, v2, Lj/j;->j:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 334
    .line 335
    invoke-virtual {v6, v2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 336
    .line 337
    .line 338
    :cond_12
    iget-object v2, v2, Lj/j;->j:Landroidx/appcompat/view/menu/ExpandedMenuView;

    .line 339
    .line 340
    iput-object v2, v1, Lg/e0;->f:Landroid/view/View;

    .line 341
    .line 342
    if-eqz v2, :cond_19

    .line 343
    .line 344
    :goto_5
    iget-object v2, v1, Lg/e0;->f:Landroid/view/View;

    .line 345
    .line 346
    if-nez v2, :cond_13

    .line 347
    .line 348
    goto/16 :goto_8

    .line 349
    .line 350
    :cond_13
    iget-object v2, v1, Lg/e0;->g:Landroid/view/View;

    .line 351
    .line 352
    if-eqz v2, :cond_14

    .line 353
    .line 354
    goto :goto_6

    .line 355
    :cond_14
    iget-object v2, v1, Lg/e0;->i:Lj/j;

    .line 356
    .line 357
    iget-object v6, v2, Lj/j;->l:Lj/i;

    .line 358
    .line 359
    if-nez v6, :cond_15

    .line 360
    .line 361
    new-instance v6, Lj/i;

    .line 362
    .line 363
    invoke-direct {v6, v2}, Lj/i;-><init>(Lj/j;)V

    .line 364
    .line 365
    .line 366
    iput-object v6, v2, Lj/j;->l:Lj/i;

    .line 367
    .line 368
    :cond_15
    iget-object v2, v2, Lj/j;->l:Lj/i;

    .line 369
    .line 370
    invoke-virtual {v2}, Lj/i;->getCount()I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    if-lez v2, :cond_19

    .line 375
    .line 376
    :goto_6
    iget-object v2, v1, Lg/e0;->f:Landroid/view/View;

    .line 377
    .line 378
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    if-nez v2, :cond_16

    .line 383
    .line 384
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 385
    .line 386
    invoke-direct {v2, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 387
    .line 388
    .line 389
    :cond_16
    iget v6, v1, Lg/e0;->b:I

    .line 390
    .line 391
    iget-object v9, v1, Lg/e0;->e:Lg/d0;

    .line 392
    .line 393
    invoke-virtual {v9, v6}, Lg/d0;->setBackgroundResource(I)V

    .line 394
    .line 395
    .line 396
    iget-object v6, v1, Lg/e0;->f:Landroid/view/View;

    .line 397
    .line 398
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 399
    .line 400
    .line 401
    move-result-object v6

    .line 402
    instance-of v9, v6, Landroid/view/ViewGroup;

    .line 403
    .line 404
    if-eqz v9, :cond_17

    .line 405
    .line 406
    check-cast v6, Landroid/view/ViewGroup;

    .line 407
    .line 408
    iget-object v9, v1, Lg/e0;->f:Landroid/view/View;

    .line 409
    .line 410
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 411
    .line 412
    .line 413
    :cond_17
    iget-object v6, v1, Lg/e0;->e:Lg/d0;

    .line 414
    .line 415
    iget-object v9, v1, Lg/e0;->f:Landroid/view/View;

    .line 416
    .line 417
    invoke-virtual {v6, v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 418
    .line 419
    .line 420
    iget-object v2, v1, Lg/e0;->f:Landroid/view/View;

    .line 421
    .line 422
    invoke-virtual {v2}, Landroid/view/View;->hasFocus()Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-nez v2, :cond_18

    .line 427
    .line 428
    iget-object v2, v1, Lg/e0;->f:Landroid/view/View;

    .line 429
    .line 430
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 431
    .line 432
    .line 433
    :cond_18
    move v10, v8

    .line 434
    :goto_7
    iput-boolean v7, v1, Lg/e0;->l:Z

    .line 435
    .line 436
    new-instance v9, Landroid/view/WindowManager$LayoutParams;

    .line 437
    .line 438
    const/high16 v15, 0x820000

    .line 439
    .line 440
    const/16 v16, -0x3

    .line 441
    .line 442
    const/4 v11, -0x2

    .line 443
    const/4 v12, 0x0

    .line 444
    const/4 v13, 0x0

    .line 445
    const/16 v14, 0x3ea

    .line 446
    .line 447
    invoke-direct/range {v9 .. v16}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    .line 448
    .line 449
    .line 450
    iget v2, v1, Lg/e0;->c:I

    .line 451
    .line 452
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 453
    .line 454
    iget v2, v1, Lg/e0;->d:I

    .line 455
    .line 456
    iput v2, v9, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    .line 457
    .line 458
    iget-object v2, v1, Lg/e0;->e:Lg/d0;

    .line 459
    .line 460
    invoke-interface {v4, v2, v9}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 461
    .line 462
    .line 463
    iput-boolean v5, v1, Lg/e0;->m:Z

    .line 464
    .line 465
    if-nez v3, :cond_1a

    .line 466
    .line 467
    invoke-virtual {v0}, Lg/f0;->K()V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :cond_19
    :goto_8
    iput-boolean v5, v1, Lg/e0;->n:Z

    .line 472
    .line 473
    :cond_1a
    :goto_9
    return-void
.end method

.method public final H(Lg/e0;ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p1, Lg/e0;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3}, Lg/f0;->I(Lg/e0;Landroid/view/KeyEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    :cond_1
    iget-object p1, p1, Lg/e0;->h:Lj/n;

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p2, p3, v0}, Lj/n;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    return v1
.end method

.method public final I(Lg/e0;Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    iget-boolean v0, p0, Lg/f0;->W:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_5

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p1, Lg/e0;->k:Z

    .line 9
    .line 10
    iget v2, p1, Lg/e0;->a:I

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v3

    .line 16
    :cond_1
    iget-object v0, p0, Lg/f0;->S:Lg/e0;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-eq v0, p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lg/f0;->u(Lg/e0;Z)V

    .line 23
    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0, v2}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iput-object v4, p1, Lg/e0;->g:Landroid/view/View;

    .line 38
    .line 39
    :cond_3
    const/16 v4, 0x6c

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    if-ne v2, v4, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    move v5, v1

    .line 47
    goto :goto_1

    .line 48
    :cond_5
    :goto_0
    move v5, v3

    .line 49
    :goto_1
    if-eqz v5, :cond_6

    .line 50
    .line 51
    iget-object v6, p0, Lg/f0;->x:Lk/l1;

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    check-cast v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 56
    .line 57
    invoke-virtual {v6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 58
    .line 59
    .line 60
    iget-object v6, v6, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 61
    .line 62
    check-cast v6, Lk/d3;

    .line 63
    .line 64
    iput-boolean v3, v6, Lk/d3;->l:Z

    .line 65
    .line 66
    :cond_6
    iget-object v6, p1, Lg/e0;->g:Landroid/view/View;

    .line 67
    .line 68
    if-nez v6, :cond_1e

    .line 69
    .line 70
    if-eqz v5, :cond_7

    .line 71
    .line 72
    iget-object v6, p0, Lg/f0;->u:Lg/a;

    .line 73
    .line 74
    instance-of v6, v6, Lg/n0;

    .line 75
    .line 76
    if-nez v6, :cond_1e

    .line 77
    .line 78
    :cond_7
    iget-object v6, p1, Lg/e0;->h:Lj/n;

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    if-eqz v6, :cond_8

    .line 82
    .line 83
    iget-boolean v8, p1, Lg/e0;->o:Z

    .line 84
    .line 85
    if-eqz v8, :cond_18

    .line 86
    .line 87
    :cond_8
    if-nez v6, :cond_11

    .line 88
    .line 89
    iget-object v6, p0, Lg/f0;->q:Landroid/content/Context;

    .line 90
    .line 91
    if-eqz v2, :cond_9

    .line 92
    .line 93
    if-ne v2, v4, :cond_d

    .line 94
    .line 95
    :cond_9
    iget-object v4, p0, Lg/f0;->x:Lk/l1;

    .line 96
    .line 97
    if-eqz v4, :cond_d

    .line 98
    .line 99
    new-instance v4, Landroid/util/TypedValue;

    .line 100
    .line 101
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    const v9, 0x7f030009

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8, v9, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 112
    .line 113
    .line 114
    iget v9, v4, Landroid/util/TypedValue;->resourceId:I

    .line 115
    .line 116
    const v10, 0x7f03000a

    .line 117
    .line 118
    .line 119
    if-eqz v9, :cond_a

    .line 120
    .line 121
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 130
    .line 131
    .line 132
    iget v11, v4, Landroid/util/TypedValue;->resourceId:I

    .line 133
    .line 134
    invoke-virtual {v9, v11, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v9, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_a
    invoke-virtual {v8, v10, v4, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 142
    .line 143
    .line 144
    move-object v9, v7

    .line 145
    :goto_2
    iget v10, v4, Landroid/util/TypedValue;->resourceId:I

    .line 146
    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    if-nez v9, :cond_b

    .line 150
    .line 151
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-virtual {v9}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v9, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 160
    .line 161
    .line 162
    :cond_b
    iget v4, v4, Landroid/util/TypedValue;->resourceId:I

    .line 163
    .line 164
    invoke-virtual {v9, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 165
    .line 166
    .line 167
    :cond_c
    if-eqz v9, :cond_d

    .line 168
    .line 169
    new-instance v4, Li/d;

    .line 170
    .line 171
    invoke-direct {v4, v6, v1}, Li/d;-><init>(Landroid/content/Context;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Li/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v6, v9}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 179
    .line 180
    .line 181
    move-object v6, v4

    .line 182
    :cond_d
    new-instance v4, Lj/n;

    .line 183
    .line 184
    invoke-direct {v4, v6}, Lj/n;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    iput-object p0, v4, Lj/n;->e:Lj/l;

    .line 188
    .line 189
    iget-object v6, p1, Lg/e0;->h:Lj/n;

    .line 190
    .line 191
    if-ne v4, v6, :cond_e

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_e
    if-eqz v6, :cond_f

    .line 195
    .line 196
    iget-object v8, p1, Lg/e0;->i:Lj/j;

    .line 197
    .line 198
    invoke-virtual {v6, v8}, Lj/n;->r(Lj/z;)V

    .line 199
    .line 200
    .line 201
    :cond_f
    iput-object v4, p1, Lg/e0;->h:Lj/n;

    .line 202
    .line 203
    iget-object v6, p1, Lg/e0;->i:Lj/j;

    .line 204
    .line 205
    if-eqz v6, :cond_10

    .line 206
    .line 207
    iget-object v8, v4, Lj/n;->a:Landroid/content/Context;

    .line 208
    .line 209
    invoke-virtual {v4, v6, v8}, Lj/n;->b(Lj/z;Landroid/content/Context;)V

    .line 210
    .line 211
    .line 212
    :cond_10
    :goto_3
    iget-object v4, p1, Lg/e0;->h:Lj/n;

    .line 213
    .line 214
    if-nez v4, :cond_11

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_11
    if-eqz v5, :cond_13

    .line 218
    .line 219
    iget-object v4, p0, Lg/f0;->x:Lk/l1;

    .line 220
    .line 221
    if-eqz v4, :cond_13

    .line 222
    .line 223
    iget-object v6, p0, Lg/f0;->y:Lg/t;

    .line 224
    .line 225
    if-nez v6, :cond_12

    .line 226
    .line 227
    new-instance v6, Lg/t;

    .line 228
    .line 229
    invoke-direct {v6, p0}, Lg/t;-><init>(Lg/f0;)V

    .line 230
    .line 231
    .line 232
    iput-object v6, p0, Lg/f0;->y:Lg/t;

    .line 233
    .line 234
    :cond_12
    iget-object v6, p1, Lg/e0;->h:Lj/n;

    .line 235
    .line 236
    iget-object v8, p0, Lg/f0;->y:Lg/t;

    .line 237
    .line 238
    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 239
    .line 240
    invoke-virtual {v4, v6, v8}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;Lj/y;)V

    .line 241
    .line 242
    .line 243
    :cond_13
    iget-object v4, p1, Lg/e0;->h:Lj/n;

    .line 244
    .line 245
    invoke-virtual {v4}, Lj/n;->w()V

    .line 246
    .line 247
    .line 248
    iget-object v4, p1, Lg/e0;->h:Lj/n;

    .line 249
    .line 250
    invoke-interface {v0, v2, v4}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-nez v2, :cond_17

    .line 255
    .line 256
    iget-object p2, p1, Lg/e0;->h:Lj/n;

    .line 257
    .line 258
    if-nez p2, :cond_14

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_14
    if-eqz p2, :cond_15

    .line 262
    .line 263
    iget-object v0, p1, Lg/e0;->i:Lj/j;

    .line 264
    .line 265
    invoke-virtual {p2, v0}, Lj/n;->r(Lj/z;)V

    .line 266
    .line 267
    .line 268
    :cond_15
    iput-object v7, p1, Lg/e0;->h:Lj/n;

    .line 269
    .line 270
    :goto_4
    if-eqz v5, :cond_16

    .line 271
    .line 272
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 273
    .line 274
    if-eqz p1, :cond_16

    .line 275
    .line 276
    iget-object p2, p0, Lg/f0;->y:Lg/t;

    .line 277
    .line 278
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 279
    .line 280
    invoke-virtual {p1, v7, p2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;Lj/y;)V

    .line 281
    .line 282
    .line 283
    :cond_16
    :goto_5
    return v1

    .line 284
    :cond_17
    iput-boolean v1, p1, Lg/e0;->o:Z

    .line 285
    .line 286
    :cond_18
    iget-object v2, p1, Lg/e0;->h:Lj/n;

    .line 287
    .line 288
    invoke-virtual {v2}, Lj/n;->w()V

    .line 289
    .line 290
    .line 291
    iget-object v2, p1, Lg/e0;->p:Landroid/os/Bundle;

    .line 292
    .line 293
    if-eqz v2, :cond_19

    .line 294
    .line 295
    iget-object v4, p1, Lg/e0;->h:Lj/n;

    .line 296
    .line 297
    invoke-virtual {v4, v2}, Lj/n;->s(Landroid/os/Bundle;)V

    .line 298
    .line 299
    .line 300
    iput-object v7, p1, Lg/e0;->p:Landroid/os/Bundle;

    .line 301
    .line 302
    :cond_19
    iget-object v2, p1, Lg/e0;->g:Landroid/view/View;

    .line 303
    .line 304
    iget-object v4, p1, Lg/e0;->h:Lj/n;

    .line 305
    .line 306
    invoke-interface {v0, v1, v2, v4}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_1b

    .line 311
    .line 312
    if-eqz v5, :cond_1a

    .line 313
    .line 314
    iget-object p2, p0, Lg/f0;->x:Lk/l1;

    .line 315
    .line 316
    if-eqz p2, :cond_1a

    .line 317
    .line 318
    iget-object v0, p0, Lg/f0;->y:Lg/t;

    .line 319
    .line 320
    check-cast p2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 321
    .line 322
    invoke-virtual {p2, v7, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->l(Landroid/view/Menu;Lj/y;)V

    .line 323
    .line 324
    .line 325
    :cond_1a
    iget-object p1, p1, Lg/e0;->h:Lj/n;

    .line 326
    .line 327
    invoke-virtual {p1}, Lj/n;->v()V

    .line 328
    .line 329
    .line 330
    return v1

    .line 331
    :cond_1b
    if-eqz p2, :cond_1c

    .line 332
    .line 333
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 334
    .line 335
    .line 336
    move-result p2

    .line 337
    goto :goto_6

    .line 338
    :cond_1c
    const/4 p2, -0x1

    .line 339
    :goto_6
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    if-eq p2, v3, :cond_1d

    .line 348
    .line 349
    move p2, v3

    .line 350
    goto :goto_7

    .line 351
    :cond_1d
    move p2, v1

    .line 352
    :goto_7
    iget-object v0, p1, Lg/e0;->h:Lj/n;

    .line 353
    .line 354
    invoke-virtual {v0, p2}, Lj/n;->setQwertyMode(Z)V

    .line 355
    .line 356
    .line 357
    iget-object p2, p1, Lg/e0;->h:Lj/n;

    .line 358
    .line 359
    invoke-virtual {p2}, Lj/n;->v()V

    .line 360
    .line 361
    .line 362
    :cond_1e
    iput-boolean v3, p1, Lg/e0;->k:Z

    .line 363
    .line 364
    iput-boolean v1, p1, Lg/e0;->l:Z

    .line 365
    .line 366
    iput-object p1, p0, Lg/f0;->S:Lg/e0;

    .line 367
    .line 368
    return v3
.end method

.method public final J()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg/f0;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 7
    .line 8
    const-string v1, "Window feature must be requested before adding content"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final K()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    if-lt v0, v1, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lg/f0;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-boolean v0, v0, Lg/e0;->m:Z

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :goto_0
    move v1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    iget-object v0, p0, Lg/f0;->A:Li/b;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v0, p0, Lg/f0;->m0:Landroid/window/OnBackInvokedCallback;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    iget-object v0, p0, Lg/f0;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 36
    .line 37
    invoke-static {v0, p0}, Lg/y;->b(Ljava/lang/Object;Lg/f0;)Landroid/window/OnBackInvokedCallback;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lg/f0;->m0:Landroid/window/OnBackInvokedCallback;

    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    if-nez v1, :cond_4

    .line 45
    .line 46
    iget-object v0, p0, Lg/f0;->m0:Landroid/window/OnBackInvokedCallback;

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    iget-object v1, p0, Lg/f0;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 51
    .line 52
    invoke-static {v1, v0}, Lg/y;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-object v0, p0, Lg/f0;->m0:Landroid/window/OnBackInvokedCallback;

    .line 57
    .line 58
    :cond_4
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg/f0;->q:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    instance-of v0, v0, Lg/f0;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "AppCompatDelegate"

    .line 26
    .line 27
    const-string v1, "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s"

    .line 28
    .line 29
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lg/f0;->C()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lg/a;->f()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Lg/f0;->D(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lg/f0;->U:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v1, v0}, Lg/f0;->p(ZZ)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lg/f0;->z()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v2, v1, Landroid/app/Activity;

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    :try_start_0
    check-cast v1, Landroid/app/Activity;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1, v2}, Lu/e;->c(Landroid/content/Context;Landroid/content/ComponentName;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_2
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v2
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    .line 35
    :catch_1
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, Lg/f0;->u:Lg/a;

    .line 39
    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    iput-boolean v0, p0, Lg/f0;->h0:Z

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v1, v0}, Lg/a;->l(Z)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_1
    sget-object v1, Lg/r;->n:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v1

    .line 51
    :try_start_3
    invoke-static {p0}, Lg/r;->i(Lg/f0;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Lg/r;->m:Lo/g;

    .line 55
    .line 56
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    invoke-direct {v3, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Lo/g;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    monitor-exit v1

    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw v0

    .line 69
    :cond_2
    :goto_2
    new-instance v1, Landroid/content/res/Configuration;

    .line 70
    .line 71
    iget-object v2, p0, Lg/f0;->q:Landroid/content/Context;

    .line 72
    .line 73
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Lg/f0;->X:Landroid/content/res/Configuration;

    .line 85
    .line 86
    iput-boolean v0, p0, Lg/f0;->V:Z

    .line 87
    .line 88
    return-void
.end method

.method public final f(Lj/n;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 13
    .line 14
    check-cast p1, Lk/d3;

    .line 15
    .line 16
    iget-object p1, p1, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActionMenuView;->y:Z

    .line 29
    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    iget-object p1, p0, Lg/f0;->q:Landroid/content/Context;

    .line 33
    .line 34
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 45
    .line 46
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 52
    .line 53
    check-cast p1, Lk/d3;

    .line 54
    .line 55
    iget-object p1, p1, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 58
    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->z:Lk/l;

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    iget-object v2, p1, Lk/l;->A:Lk/j;

    .line 66
    .line 67
    if-nez v2, :cond_0

    .line 68
    .line 69
    invoke-virtual {p1}, Lk/l;->j()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    :cond_0
    iget-object p1, p0, Lg/f0;->r:Landroid/view/Window;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v2, p0, Lg/f0;->x:Lk/l1;

    .line 82
    .line 83
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 86
    .line 87
    .line 88
    iget-object v2, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 89
    .line 90
    check-cast v2, Lk/d3;

    .line 91
    .line 92
    iget-object v2, v2, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 93
    .line 94
    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->o()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    const/16 v3, 0x6c

    .line 99
    .line 100
    if-eqz v2, :cond_2

    .line 101
    .line 102
    iget-object v0, p0, Lg/f0;->x:Lk/l1;

    .line 103
    .line 104
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 110
    .line 111
    check-cast v0, Lk/d3;

    .line 112
    .line 113
    iget-object v0, v0, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 114
    .line 115
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 116
    .line 117
    if-eqz v0, :cond_1

    .line 118
    .line 119
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->z:Lk/l;

    .line 120
    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    invoke-virtual {v0}, Lk/l;->g()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    :cond_1
    iget-boolean v0, p0, Lg/f0;->W:Z

    .line 128
    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v0, v0, Lg/e0;->h:Lj/n;

    .line 136
    .line 137
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_2
    if-eqz p1, :cond_4

    .line 142
    .line 143
    iget-boolean v2, p0, Lg/f0;->W:Z

    .line 144
    .line 145
    if-nez v2, :cond_4

    .line 146
    .line 147
    iget-boolean v2, p0, Lg/f0;->e0:Z

    .line 148
    .line 149
    if-eqz v2, :cond_3

    .line 150
    .line 151
    iget v2, p0, Lg/f0;->f0:I

    .line 152
    .line 153
    and-int/2addr v0, v2

    .line 154
    if-eqz v0, :cond_3

    .line 155
    .line 156
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v2, p0, Lg/f0;->g0:Lg/s;

    .line 163
    .line 164
    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Lg/s;->run()V

    .line 168
    .line 169
    .line 170
    :cond_3
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v2, v0, Lg/e0;->h:Lj/n;

    .line 175
    .line 176
    if-eqz v2, :cond_4

    .line 177
    .line 178
    iget-boolean v4, v0, Lg/e0;->o:Z

    .line 179
    .line 180
    if-nez v4, :cond_4

    .line 181
    .line 182
    iget-object v4, v0, Lg/e0;->g:Landroid/view/View;

    .line 183
    .line 184
    invoke-interface {p1, v1, v4, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_4

    .line 189
    .line 190
    iget-object v0, v0, Lg/e0;->h:Lj/n;

    .line 191
    .line 192
    invoke-interface {p1, v3, v0}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 193
    .line 194
    .line 195
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 196
    .line 197
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 198
    .line 199
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 200
    .line 201
    .line 202
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 203
    .line 204
    check-cast p1, Lk/d3;

    .line 205
    .line 206
    iget-object p1, p1, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 207
    .line 208
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 209
    .line 210
    .line 211
    :cond_4
    return-void

    .line 212
    :cond_5
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iput-boolean v0, p1, Lg/e0;->n:Z

    .line 217
    .line 218
    invoke-virtual {p0, p1, v1}, Lg/f0;->u(Lg/e0;Z)V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    invoke-virtual {p0, p1, v0}, Lg/f0;->G(Lg/e0;Landroid/view/KeyEvent;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final g(Lj/n;Landroid/view/MenuItem;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-boolean v2, p0, Lg/f0;->W:Z

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Lj/n;->k()Lj/n;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v2, p0, Lg/f0;->R:[Lg/e0;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    array-length v3, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v1

    .line 25
    :goto_0
    move v4, v1

    .line 26
    :goto_1
    if-ge v4, v3, :cond_2

    .line 27
    .line 28
    aget-object v5, v2, v4

    .line 29
    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    iget-object v6, v5, Lg/e0;->h:Lj/n;

    .line 33
    .line 34
    if-ne v6, p1, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v5, 0x0

    .line 41
    :goto_2
    if-eqz v5, :cond_3

    .line 42
    .line 43
    iget p1, v5, Lg/e0;->a:I

    .line 44
    .line 45
    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_3
    return v1
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, v0, Landroid/app/Activity;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lg/r;->n:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-static {p0}, Lg/r;->i(Lg/f0;)V

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1

    .line 18
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lg/f0;->e0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lg/f0;->g0:Lg/s;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lg/f0;->W:Z

    .line 35
    .line 36
    iget v0, p0, Lg/f0;->Y:I

    .line 37
    .line 38
    const/16 v1, -0x64

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v1, v0, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    check-cast v0, Landroid/app/Activity;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Lg/f0;->n0:Lo/l;

    .line 57
    .line 58
    iget-object v1, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v2, p0, Lg/f0;->Y:I

    .line 69
    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    sget-object v0, Lg/f0;->n0:Lo/l;

    .line 79
    .line 80
    iget-object v1, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, v1}, Lo/l;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Lg/a;->h()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object v0, p0, Lg/f0;->c0:Lg/a0;

    .line 101
    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-virtual {v0}, Lg/c0;->c()V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v0, p0, Lg/f0;->d0:Lg/a0;

    .line 108
    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-virtual {v0}, Lg/c0;->c()V

    .line 112
    .line 113
    .line 114
    :cond_5
    return-void
.end method

.method public final j(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/16 v1, 0x6d

    .line 4
    .line 5
    const/16 v2, 0x6c

    .line 6
    .line 7
    const-string v3, "AppCompatDelegate"

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."

    .line 12
    .line 13
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v0, 0x9

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    const-string p1, "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."

    .line 23
    .line 24
    invoke-static {v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move p1, v1

    .line 28
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lg/f0;->P:Z

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    if-ne p1, v2, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-boolean v0, p0, Lg/f0;->L:Z

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    if-ne p1, v4, :cond_3

    .line 42
    .line 43
    iput-boolean v3, p0, Lg/f0;->L:Z

    .line 44
    .line 45
    :cond_3
    if-eq p1, v4, :cond_9

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    if-eq p1, v0, :cond_8

    .line 49
    .line 50
    const/4 v0, 0x5

    .line 51
    if-eq p1, v0, :cond_7

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    if-eq p1, v0, :cond_6

    .line 56
    .line 57
    if-eq p1, v2, :cond_5

    .line 58
    .line 59
    if-eq p1, v1, :cond_4

    .line 60
    .line 61
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_4
    invoke-virtual {p0}, Lg/f0;->J()V

    .line 69
    .line 70
    .line 71
    iput-boolean v4, p0, Lg/f0;->M:Z

    .line 72
    .line 73
    return v4

    .line 74
    :cond_5
    invoke-virtual {p0}, Lg/f0;->J()V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Lg/f0;->L:Z

    .line 78
    .line 79
    return v4

    .line 80
    :cond_6
    invoke-virtual {p0}, Lg/f0;->J()V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, p0, Lg/f0;->N:Z

    .line 84
    .line 85
    return v4

    .line 86
    :cond_7
    invoke-virtual {p0}, Lg/f0;->J()V

    .line 87
    .line 88
    .line 89
    iput-boolean v4, p0, Lg/f0;->K:Z

    .line 90
    .line 91
    return v4

    .line 92
    :cond_8
    invoke-virtual {p0}, Lg/f0;->J()V

    .line 93
    .line 94
    .line 95
    iput-boolean v4, p0, Lg/f0;->J:Z

    .line 96
    .line 97
    return v4

    .line 98
    :cond_9
    invoke-virtual {p0}, Lg/f0;->J()V

    .line 99
    .line 100
    .line 101
    iput-boolean v4, p0, Lg/f0;->P:Z

    .line 102
    .line 103
    return v4
.end method

.method public final k(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg/f0;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lg/f0;->q:Landroid/content/Context;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lg/f0;->s:Lg/z;

    .line 28
    .line 29
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lg/z;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final l(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg/f0;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lg/f0;->s:Lg/z;

    .line 22
    .line 23
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1, v0}, Lg/z;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final m(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lg/f0;->y()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 5
    .line 6
    const v1, 0x1020002

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lg/f0;->s:Lg/z;

    .line 22
    .line 23
    iget-object p2, p0, Lg/f0;->r:Landroid/view/Window;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p1, p2}, Lg/z;->a(Landroid/view/Window$Callback;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final n(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lg/f0;->w:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget-object v0, p0, Lg/f0;->x:Lk/l1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lk/l1;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lg/f0;->u:Lg/a;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lg/a;->n(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Lg/f0;->H:Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final o(Li/a;)Li/b;
    .locals 8

    .line 1
    if-eqz p1, :cond_12

    .line 2
    .line 3
    iget-object v0, p0, Lg/f0;->A:Li/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Li/b;->a()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, Landroidx/emoji2/text/p;

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v0, p0, p1, v1, v2}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lg/f0;->C()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lg/f0;->u:Lg/a;

    .line 22
    .line 23
    iget-object v1, p0, Lg/f0;->t:Ljava/lang/Object;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lg/a;->o(Landroidx/emoji2/text/p;)Li/b;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lg/f0;->A:Li/b;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-interface {v1, p1}, Lg/l;->onSupportActionModeStarted(Li/b;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p1, p0, Lg/f0;->A:Li/b;

    .line 39
    .line 40
    if-nez p1, :cond_11

    .line 41
    .line 42
    iget-object p1, p0, Lg/f0;->E:Lf0/w0;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Lf0/w0;->b()V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, Lg/f0;->A:Li/b;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1}, Li/b;->a()V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-boolean p1, p0, Lg/f0;->W:Z

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    :try_start_0
    invoke-interface {v1, v0}, Lg/l;->onWindowStartingSupportActionMode(Li/a;)Li/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    goto :goto_0

    .line 66
    :catch_0
    :cond_4
    move-object p1, v3

    .line 67
    :goto_0
    if-eqz p1, :cond_5

    .line 68
    .line 69
    iput-object p1, p0, Lg/f0;->A:Li/b;

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_5
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    if-nez p1, :cond_a

    .line 77
    .line 78
    iget-boolean p1, p0, Lg/f0;->O:Z

    .line 79
    .line 80
    iget-object v5, p0, Lg/f0;->q:Landroid/content/Context;

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    new-instance p1, Landroid/util/TypedValue;

    .line 85
    .line 86
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    const v7, 0x7f030009

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v7, p1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 97
    .line 98
    .line 99
    iget v7, p1, Landroid/util/TypedValue;->resourceId:I

    .line 100
    .line 101
    if-eqz v7, :cond_6

    .line 102
    .line 103
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v7}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v7, v6}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 112
    .line 113
    .line 114
    iget v6, p1, Landroid/util/TypedValue;->resourceId:I

    .line 115
    .line 116
    invoke-virtual {v7, v6, v4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 117
    .line 118
    .line 119
    new-instance v6, Li/d;

    .line 120
    .line 121
    invoke-direct {v6, v5, v2}, Li/d;-><init>(Landroid/content/Context;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Li/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-virtual {v5, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 129
    .line 130
    .line 131
    move-object v5, v6

    .line 132
    :cond_6
    new-instance v6, Landroidx/appcompat/widget/ActionBarContextView;

    .line 133
    .line 134
    invoke-direct {v6, v5, v3}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 135
    .line 136
    .line 137
    iput-object v6, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 138
    .line 139
    new-instance v6, Landroid/widget/PopupWindow;

    .line 140
    .line 141
    const v7, 0x7f030018

    .line 142
    .line 143
    .line 144
    invoke-direct {v6, v5, v3, v7}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 145
    .line 146
    .line 147
    iput-object v6, p0, Lg/f0;->C:Landroid/widget/PopupWindow;

    .line 148
    .line 149
    const/4 v7, 0x2

    .line 150
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 151
    .line 152
    .line 153
    iget-object v6, p0, Lg/f0;->C:Landroid/widget/PopupWindow;

    .line 154
    .line 155
    iget-object v7, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 156
    .line 157
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    iget-object v6, p0, Lg/f0;->C:Landroid/widget/PopupWindow;

    .line 161
    .line 162
    const/4 v7, -0x1

    .line 163
    invoke-virtual {v6, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    const v7, 0x7f030003

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6, v7, p1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 174
    .line 175
    .line 176
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 177
    .line 178
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-static {p1, v5}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    iget-object v5, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 191
    .line 192
    invoke-virtual {v5, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 193
    .line 194
    .line 195
    iget-object p1, p0, Lg/f0;->C:Landroid/widget/PopupWindow;

    .line 196
    .line 197
    const/4 v5, -0x2

    .line 198
    invoke-virtual {p1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 199
    .line 200
    .line 201
    new-instance p1, Lg/s;

    .line 202
    .line 203
    invoke-direct {p1, p0, v4}, Lg/s;-><init>(Lg/f0;I)V

    .line 204
    .line 205
    .line 206
    iput-object p1, p0, Lg/f0;->D:Lg/s;

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_7
    iget-object p1, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 210
    .line 211
    const v6, 0x7f080035

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Landroidx/appcompat/widget/ViewStubCompat;

    .line 219
    .line 220
    if-eqz p1, :cond_a

    .line 221
    .line 222
    invoke-virtual {p0}, Lg/f0;->C()V

    .line 223
    .line 224
    .line 225
    iget-object v6, p0, Lg/f0;->u:Lg/a;

    .line 226
    .line 227
    if-eqz v6, :cond_8

    .line 228
    .line 229
    invoke-virtual {v6}, Lg/a;->e()Landroid/content/Context;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    goto :goto_1

    .line 234
    :cond_8
    move-object v6, v3

    .line 235
    :goto_1
    if-nez v6, :cond_9

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_9
    move-object v5, v6

    .line 239
    :goto_2
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-virtual {p1, v5}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    check-cast p1, Landroidx/appcompat/widget/ActionBarContextView;

    .line 251
    .line 252
    iput-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 253
    .line 254
    :cond_a
    :goto_3
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 255
    .line 256
    if-eqz p1, :cond_f

    .line 257
    .line 258
    iget-object p1, p0, Lg/f0;->E:Lf0/w0;

    .line 259
    .line 260
    if-eqz p1, :cond_b

    .line 261
    .line 262
    invoke-virtual {p1}, Lf0/w0;->b()V

    .line 263
    .line 264
    .line 265
    :cond_b
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 266
    .line 267
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 268
    .line 269
    .line 270
    new-instance p1, Li/e;

    .line 271
    .line 272
    iget-object v5, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 273
    .line 274
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    iget-object v6, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 279
    .line 280
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 281
    .line 282
    .line 283
    iput-object v5, p1, Li/e;->i:Landroid/content/Context;

    .line 284
    .line 285
    iput-object v6, p1, Li/e;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 286
    .line 287
    iput-object v0, p1, Li/e;->k:Landroidx/emoji2/text/p;

    .line 288
    .line 289
    new-instance v5, Lj/n;

    .line 290
    .line 291
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-direct {v5, v6}, Lj/n;-><init>(Landroid/content/Context;)V

    .line 296
    .line 297
    .line 298
    iput v4, v5, Lj/n;->l:I

    .line 299
    .line 300
    iput-object v5, p1, Li/e;->n:Lj/n;

    .line 301
    .line 302
    iput-object p1, v5, Lj/n;->e:Lj/l;

    .line 303
    .line 304
    iget-object v0, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v0, Li/a;

    .line 307
    .line 308
    invoke-interface {v0, p1, v5}, Li/a;->g(Li/b;Landroid/view/Menu;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_e

    .line 313
    .line 314
    invoke-virtual {p1}, Li/e;->i()V

    .line 315
    .line 316
    .line 317
    iget-object v0, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 318
    .line 319
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->c(Li/b;)V

    .line 320
    .line 321
    .line 322
    iput-object p1, p0, Lg/f0;->A:Li/b;

    .line 323
    .line 324
    iget-boolean p1, p0, Lg/f0;->F:Z

    .line 325
    .line 326
    const/high16 v0, 0x3f800000    # 1.0f

    .line 327
    .line 328
    if-eqz p1, :cond_c

    .line 329
    .line 330
    iget-object p1, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 331
    .line 332
    if-eqz p1, :cond_c

    .line 333
    .line 334
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    .line 335
    .line 336
    .line 337
    move-result p1

    .line 338
    if-eqz p1, :cond_c

    .line 339
    .line 340
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 341
    .line 342
    const/4 v2, 0x0

    .line 343
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 344
    .line 345
    .line 346
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 347
    .line 348
    invoke-static {p1}, Lf0/r0;->a(Landroid/view/View;)Lf0/w0;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    invoke-virtual {p1, v0}, Lf0/w0;->a(F)V

    .line 353
    .line 354
    .line 355
    iput-object p1, p0, Lg/f0;->E:Lf0/w0;

    .line 356
    .line 357
    new-instance v0, Lg/v;

    .line 358
    .line 359
    invoke-direct {v0, p0, v4}, Lg/v;-><init>(Ljava/lang/Object;I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, v0}, Lf0/w0;->d(Lf0/x0;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_c
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 367
    .line 368
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 369
    .line 370
    .line 371
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 372
    .line 373
    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 374
    .line 375
    .line 376
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 377
    .line 378
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    instance-of p1, p1, Landroid/view/View;

    .line 383
    .line 384
    if-eqz p1, :cond_d

    .line 385
    .line 386
    iget-object p1, p0, Lg/f0;->B:Landroidx/appcompat/widget/ActionBarContextView;

    .line 387
    .line 388
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    check-cast p1, Landroid/view/View;

    .line 393
    .line 394
    sget-object v0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 395
    .line 396
    invoke-static {p1}, Lf0/i0;->c(Landroid/view/View;)V

    .line 397
    .line 398
    .line 399
    :cond_d
    :goto_4
    iget-object p1, p0, Lg/f0;->C:Landroid/widget/PopupWindow;

    .line 400
    .line 401
    if-eqz p1, :cond_f

    .line 402
    .line 403
    iget-object p1, p0, Lg/f0;->r:Landroid/view/Window;

    .line 404
    .line 405
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    iget-object v0, p0, Lg/f0;->D:Lg/s;

    .line 410
    .line 411
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_5

    .line 415
    :cond_e
    iput-object v3, p0, Lg/f0;->A:Li/b;

    .line 416
    .line 417
    :cond_f
    :goto_5
    iget-object p1, p0, Lg/f0;->A:Li/b;

    .line 418
    .line 419
    if-eqz p1, :cond_10

    .line 420
    .line 421
    invoke-interface {v1, p1}, Lg/l;->onSupportActionModeStarted(Li/b;)V

    .line 422
    .line 423
    .line 424
    :cond_10
    invoke-virtual {p0}, Lg/f0;->K()V

    .line 425
    .line 426
    .line 427
    iget-object p1, p0, Lg/f0;->A:Li/b;

    .line 428
    .line 429
    iput-object p1, p0, Lg/f0;->A:Li/b;

    .line 430
    .line 431
    :cond_11
    invoke-virtual {p0}, Lg/f0;->K()V

    .line 432
    .line 433
    .line 434
    iget-object p1, p0, Lg/f0;->A:Li/b;

    .line 435
    .line 436
    return-object p1

    .line 437
    :cond_12
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 438
    .line 439
    const-string v0, "ActionMode callback can not be null."

    .line 440
    .line 441
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw p1
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 8

    .line 1
    iget-object p1, p0, Lg/f0;->k0:Lg/i0;

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 2
    sget-object p1, Lf/a;->j:[I

    iget-object v0, p0, Lg/f0;->q:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 v2, 0x74

    .line 3
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-nez v2, :cond_0

    .line 5
    new-instance p1, Lg/i0;

    invoke-direct {p1}, Lg/i0;-><init>()V

    iput-object p1, p0, Lg/f0;->k0:Lg/i0;

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg/i0;

    iput-object p1, p0, Lg/f0;->k0:Lg/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Failed to instantiate custom view inflater "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ". Falling back to default."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "AppCompatDelegate"

    invoke-static {v2, v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 10
    new-instance p1, Lg/i0;

    invoke-direct {p1}, Lg/i0;-><init>()V

    iput-object p1, p0, Lg/f0;->k0:Lg/i0;

    .line 11
    :cond_1
    :goto_0
    iget-object p1, p0, Lg/f0;->k0:Lg/i0;

    .line 12
    sget v0, Lk/i3;->a:I

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    sget-object v0, Lf/a;->x:[I

    const/4 v5, 0x0

    invoke-virtual {p3, p4, v0, v5, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v2, 0x4

    .line 15
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_2

    .line 16
    const-string v4, "AppCompatViewInflater"

    const-string v6, "app:theme is now deprecated. Please move to using android:theme instead."

    invoke-static {v4, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    :cond_2
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v3, :cond_4

    .line 18
    instance-of v0, p3, Li/d;

    if-eqz v0, :cond_3

    move-object v0, p3

    check-cast v0, Li/d;

    .line 19
    iget v0, v0, Li/d;->a:I

    if-eq v0, v3, :cond_4

    .line 20
    :cond_3
    new-instance v0, Li/d;

    invoke-direct {v0, p3, v3}, Li/d;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_4
    move-object v0, p3

    .line 21
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x3

    const/4 v6, 0x1

    const/4 v7, -0x1

    sparse-switch v3, :sswitch_data_0

    :goto_2
    move v2, v7

    goto/16 :goto_3

    :sswitch_0
    const-string v2, "Button"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v2, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v2, "EditText"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    const/16 v2, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v2, "CheckBox"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    const/16 v2, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v2, "AutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    const/16 v2, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v2, "ImageView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_2

    :cond_9
    const/16 v2, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v2, "ToggleButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_a
    const/16 v2, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v2, "RadioButton"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_2

    :cond_b
    const/4 v2, 0x7

    goto :goto_3

    :sswitch_7
    const-string v2, "Spinner"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_2

    :cond_c
    const/4 v2, 0x6

    goto :goto_3

    :sswitch_8
    const-string v2, "SeekBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_2

    :cond_d
    const/4 v2, 0x5

    goto :goto_3

    :sswitch_9
    const-string v3, "ImageButton"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_2

    :sswitch_a
    const-string v2, "TextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_2

    :cond_e
    move v2, v4

    goto :goto_3

    :sswitch_b
    const-string v2, "MultiAutoCompleteTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_2

    :cond_f
    const/4 v2, 0x2

    goto :goto_3

    :sswitch_c
    const-string v2, "CheckedTextView"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_2

    :cond_10
    move v2, v6

    goto :goto_3

    :sswitch_d
    const-string v2, "RatingBar"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto/16 :goto_2

    :cond_11
    const/4 v2, 0x0

    :cond_12
    :goto_3
    packed-switch v2, :pswitch_data_0

    move-object v2, v1

    goto :goto_4

    .line 22
    :pswitch_0
    new-instance v2, Lk/r;

    invoke-direct {v2, v0, p4}, Lk/r;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 23
    :pswitch_1
    new-instance v2, Lk/x;

    invoke-direct {v2, v0, p4}, Lk/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 24
    :pswitch_2
    new-instance v2, Lk/s;

    invoke-direct {v2, v0, p4}, Lk/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 25
    :pswitch_3
    new-instance v2, Lk/p;

    .line 26
    invoke-direct {v2, v0, p4}, Lk/p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 27
    :pswitch_4
    new-instance v2, Lk/a0;

    .line 28
    invoke-direct {v2, v0, p4, v5}, Lk/a0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 29
    :pswitch_5
    new-instance v2, Lk/j1;

    invoke-direct {v2, v0, p4}, Lk/j1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 30
    :pswitch_6
    new-instance v2, Lk/e0;

    invoke-direct {v2, v0, p4}, Lk/e0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 31
    :pswitch_7
    new-instance v2, Lk/s0;

    invoke-direct {v2, v0, p4}, Lk/s0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 32
    :pswitch_8
    new-instance v2, Lk/h0;

    invoke-direct {v2, v0, p4}, Lk/h0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 33
    :pswitch_9
    new-instance v2, Lk/z;

    const v3, 0x7f0300a1

    .line 34
    invoke-direct {v2, v0, p4, v3}, Lk/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    goto :goto_4

    .line 35
    :pswitch_a
    new-instance v2, Lk/d1;

    invoke-direct {v2, v0, p4}, Lk/d1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 36
    :pswitch_b
    new-instance v2, Lk/b0;

    invoke-direct {v2, v0, p4}, Lk/b0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 37
    :pswitch_c
    new-instance v2, Lk/t;

    invoke-direct {v2, v0, p4}, Lk/t;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_4

    .line 38
    :pswitch_d
    new-instance v2, Lk/f0;

    invoke-direct {v2, v0, p4}, Lk/f0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    :goto_4
    if-nez v2, :cond_17

    if-eq p3, v0, :cond_17

    .line 39
    iget-object p3, p1, Lg/i0;->a:[Ljava/lang/Object;

    const-string v2, "view"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 40
    const-string p2, "class"

    invoke-interface {p4, v1, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 41
    :cond_13
    :try_start_1
    aput-object v0, p3, v5

    .line 42
    aput-object p4, p3, v6

    const/16 v2, 0x2e

    .line 43
    invoke-virtual {p2, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ne v7, v2, :cond_16

    move v2, v5

    .line 44
    :goto_5
    sget-object v3, Lg/i0;->g:[Ljava/lang/String;

    if-ge v2, v4, :cond_15

    .line 45
    aget-object v3, v3, v2

    invoke-virtual {p1, v0, p2, v3}, Lg/i0;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_14

    .line 46
    aput-object v1, p3, v5

    .line 47
    aput-object v1, p3, v6

    move-object v1, v3

    goto :goto_7

    :cond_14
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_6

    .line 48
    :cond_15
    aput-object v1, p3, v5

    .line 49
    aput-object v1, p3, v6

    goto :goto_7

    .line 50
    :cond_16
    :try_start_2
    invoke-virtual {p1, v0, p2, v1}, Lg/i0;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    aput-object v1, p3, v5

    .line 52
    aput-object v1, p3, v6

    move-object v1, p1

    goto :goto_7

    .line 53
    :goto_6
    aput-object v1, p3, v5

    .line 54
    aput-object v1, p3, v6

    .line 55
    throw p1

    .line 56
    :catch_0
    aput-object v1, p3, v5

    .line 57
    aput-object v1, p3, v6

    goto :goto_7

    :cond_17
    move-object v1, v2

    :goto_7
    if-eqz v1, :cond_1f

    .line 58
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 59
    instance-of p2, p1, Landroid/content/ContextWrapper;

    if-eqz p2, :cond_1a

    invoke-virtual {v1}, Landroid/view/View;->hasOnClickListeners()Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_8

    .line 60
    :cond_18
    sget-object p2, Lg/i0;->c:[I

    invoke-virtual {p1, p4, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 61
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_19

    .line 62
    new-instance p3, Lg/h0;

    invoke-direct {p3, p2, v1}, Lg/h0;-><init>(Ljava/lang/String;Landroid/view/View;)V

    invoke-virtual {v1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    :cond_19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 64
    :cond_1a
    :goto_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-le p1, v6, :cond_1b

    goto :goto_9

    .line 65
    :cond_1b
    sget-object p1, Lg/i0;->d:[I

    invoke-virtual {v0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 66
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    const-class v4, Ljava/lang/Boolean;

    if-eqz p2, :cond_1c

    .line 67
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 68
    sget-object p3, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 69
    new-instance v2, Lf0/f0;

    const v3, 0x7f0800b0

    const/4 v7, 0x2

    .line 70
    invoke-direct/range {v2 .. v7}, Lf0/f0;-><init>(ILjava/lang/Class;III)V

    .line 71
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v2, v1, p2}, Lf0/h0;->d(Landroid/view/View;Ljava/lang/Object;)V

    .line 72
    :cond_1c
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    sget-object p1, Lg/i0;->e:[I

    invoke-virtual {v0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 74
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1d

    .line 75
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lf0/r0;->j(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 76
    :cond_1d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 77
    sget-object p1, Lg/i0;->f:[I

    invoke-virtual {v0, p4, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 78
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1e

    .line 79
    invoke-virtual {p1, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 80
    sget-object p3, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 81
    new-instance v2, Lf0/f0;

    const v3, 0x7f0800b6

    const/4 v7, 0x0

    .line 82
    invoke-direct/range {v2 .. v7}, Lf0/f0;-><init>(ILjava/lang/Class;III)V

    .line 83
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v2, v1, p2}, Lf0/h0;->d(Landroid/view/View;Ljava/lang/Object;)V

    .line 84
    :cond_1e
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1f
    :goto_9
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x7404ceea -> :sswitch_d
        -0x56c015e7 -> :sswitch_c
        -0x503aa7ad -> :sswitch_b
        -0x37f7066e -> :sswitch_a
        -0x37e04bb3 -> :sswitch_9
        -0x274065a5 -> :sswitch_8
        -0x1440b607 -> :sswitch_7
        0x2e46a6ed -> :sswitch_6
        0x2fa453c6 -> :sswitch_5
        0x431b5280 -> :sswitch_4
        0x5445f9ba -> :sswitch_3
        0x5f7507c3 -> :sswitch_2
        0x63577677 -> :sswitch_1
        0x77471352 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0, p1, p2, p3}, Lg/f0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final p(ZZ)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lg/f0;->W:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/16 v0, -0x64

    .line 10
    .line 11
    iget v3, v1, Lg/f0;->Y:I

    .line 12
    .line 13
    if-eq v3, v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    sget v3, Lg/r;->h:I

    .line 17
    .line 18
    :goto_0
    iget-object v4, v1, Lg/f0;->q:Landroid/content/Context;

    .line 19
    .line 20
    invoke-virtual {v1, v4, v3}, Lg/f0;->E(Landroid/content/Context;I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v6, 0x21

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    if-ge v0, v6, :cond_2

    .line 30
    .line 31
    invoke-static {v4}, Lg/f0;->r(Landroid/content/Context;)Lb0/g;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-object v6, v7

    .line 37
    :goto_1
    if-nez p2, :cond_3

    .line 38
    .line 39
    if-eqz v6, :cond_3

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6}, Lg/x;->b(Landroid/content/res/Configuration;)Lb0/g;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    :cond_3
    invoke-static {v4, v5, v6, v7, v2}, Lg/f0;->v(Landroid/content/Context;ILb0/g;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    iget-boolean v9, v1, Lg/f0;->b0:Z

    .line 58
    .line 59
    const/4 v10, 0x1

    .line 60
    iget-object v11, v1, Lg/f0;->p:Ljava/lang/Object;

    .line 61
    .line 62
    if-nez v9, :cond_6

    .line 63
    .line 64
    instance-of v9, v11, Landroid/app/Activity;

    .line 65
    .line 66
    if-eqz v9, :cond_6

    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    if-nez v9, :cond_4

    .line 73
    .line 74
    move v0, v2

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/16 v12, 0x1d

    .line 77
    .line 78
    if-lt v0, v12, :cond_5

    .line 79
    .line 80
    const/high16 v0, 0x100c0000

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    const/high16 v0, 0xc0000

    .line 84
    .line 85
    :goto_2
    :try_start_0
    new-instance v12, Landroid/content/ComponentName;

    .line 86
    .line 87
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    invoke-direct {v12, v4, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, v12, v0}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    .line 101
    .line 102
    iput v0, v1, Lg/f0;->a0:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :catch_0
    move-exception v0

    .line 106
    const-string v9, "AppCompatDelegate"

    .line 107
    .line 108
    const-string v12, "Exception while getting ActivityInfo"

    .line 109
    .line 110
    invoke-static {v9, v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 111
    .line 112
    .line 113
    iput v2, v1, Lg/f0;->a0:I

    .line 114
    .line 115
    :cond_6
    :goto_3
    iput-boolean v10, v1, Lg/f0;->b0:Z

    .line 116
    .line 117
    iget v0, v1, Lg/f0;->a0:I

    .line 118
    .line 119
    :goto_4
    iget-object v9, v1, Lg/f0;->X:Landroid/content/res/Configuration;

    .line 120
    .line 121
    if-nez v9, :cond_7

    .line 122
    .line 123
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    :cond_7
    iget v12, v9, Landroid/content/res/Configuration;->uiMode:I

    .line 132
    .line 133
    and-int/lit8 v12, v12, 0x30

    .line 134
    .line 135
    iget v13, v8, Landroid/content/res/Configuration;->uiMode:I

    .line 136
    .line 137
    and-int/lit8 v13, v13, 0x30

    .line 138
    .line 139
    invoke-static {v9}, Lg/x;->b(Landroid/content/res/Configuration;)Lb0/g;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-nez v6, :cond_8

    .line 144
    .line 145
    move-object v14, v7

    .line 146
    goto :goto_5

    .line 147
    :cond_8
    invoke-static {v8}, Lg/x;->b(Landroid/content/res/Configuration;)Lb0/g;

    .line 148
    .line 149
    .line 150
    move-result-object v14

    .line 151
    :goto_5
    if-eq v12, v13, :cond_9

    .line 152
    .line 153
    const/16 v12, 0x200

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_9
    move v12, v2

    .line 157
    :goto_6
    if-eqz v14, :cond_a

    .line 158
    .line 159
    invoke-virtual {v9, v14}, Lb0/g;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-nez v9, :cond_a

    .line 164
    .line 165
    or-int/lit16 v12, v12, 0x2004

    .line 166
    .line 167
    :cond_a
    not-int v9, v0

    .line 168
    and-int/2addr v9, v12

    .line 169
    const/16 v15, 0x1c

    .line 170
    .line 171
    if-eqz v9, :cond_e

    .line 172
    .line 173
    if-eqz p1, :cond_e

    .line 174
    .line 175
    iget-boolean v9, v1, Lg/f0;->U:Z

    .line 176
    .line 177
    if-eqz v9, :cond_e

    .line 178
    .line 179
    sget-boolean v9, Lg/f0;->p0:Z

    .line 180
    .line 181
    if-nez v9, :cond_b

    .line 182
    .line 183
    iget-boolean v9, v1, Lg/f0;->V:Z

    .line 184
    .line 185
    if-eqz v9, :cond_e

    .line 186
    .line 187
    :cond_b
    instance-of v9, v11, Landroid/app/Activity;

    .line 188
    .line 189
    if-eqz v9, :cond_e

    .line 190
    .line 191
    move-object v9, v11

    .line 192
    check-cast v9, Landroid/app/Activity;

    .line 193
    .line 194
    invoke-virtual {v9}, Landroid/app/Activity;->isChild()Z

    .line 195
    .line 196
    .line 197
    move-result v16

    .line 198
    if-nez v16, :cond_e

    .line 199
    .line 200
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    const/16 v10, 0x1f

    .line 203
    .line 204
    if-lt v2, v10, :cond_c

    .line 205
    .line 206
    and-int/lit16 v10, v12, 0x2000

    .line 207
    .line 208
    if-eqz v10, :cond_c

    .line 209
    .line 210
    invoke-virtual {v9}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-virtual {v10}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-virtual {v8}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    invoke-virtual {v10, v8}, Landroid/view/View;->setLayoutDirection(I)V

    .line 223
    .line 224
    .line 225
    :cond_c
    if-lt v2, v15, :cond_d

    .line 226
    .line 227
    invoke-virtual {v9}, Landroid/app/Activity;->recreate()V

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_d
    new-instance v2, Landroid/os/Handler;

    .line 232
    .line 233
    invoke-virtual {v9}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 234
    .line 235
    .line 236
    move-result-object v8

    .line 237
    invoke-direct {v2, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 238
    .line 239
    .line 240
    new-instance v8, Landroidx/activity/o;

    .line 241
    .line 242
    const/4 v10, 0x7

    .line 243
    invoke-direct {v8, v9, v10}, Landroidx/activity/o;-><init>(Ljava/lang/Object;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 247
    .line 248
    .line 249
    :goto_7
    const/4 v2, 0x1

    .line 250
    goto :goto_8

    .line 251
    :cond_e
    const/4 v2, 0x0

    .line 252
    :goto_8
    if-nez v2, :cond_1f

    .line 253
    .line 254
    if-eqz v12, :cond_1f

    .line 255
    .line 256
    and-int/2addr v0, v12

    .line 257
    if-ne v0, v12, :cond_f

    .line 258
    .line 259
    const/4 v2, 0x1

    .line 260
    goto :goto_9

    .line 261
    :cond_f
    const/4 v2, 0x0

    .line 262
    :goto_9
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    new-instance v9, Landroid/content/res/Configuration;

    .line 267
    .line 268
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-direct {v9, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 280
    .line 281
    and-int/lit8 v0, v0, -0x31

    .line 282
    .line 283
    or-int/2addr v0, v13

    .line 284
    iput v0, v9, Landroid/content/res/Configuration;->uiMode:I

    .line 285
    .line 286
    if-eqz v14, :cond_10

    .line 287
    .line 288
    invoke-static {v9, v14}, Lg/x;->d(Landroid/content/res/Configuration;Lb0/g;)V

    .line 289
    .line 290
    .line 291
    :cond_10
    invoke-virtual {v8, v9, v7}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 292
    .line 293
    .line 294
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 295
    .line 296
    const/16 v10, 0x1a

    .line 297
    .line 298
    if-ge v0, v10, :cond_1b

    .line 299
    .line 300
    if-lt v0, v15, :cond_11

    .line 301
    .line 302
    goto/16 :goto_15

    .line 303
    .line 304
    :cond_11
    sget-boolean v0, Ly4/b;->h:Z

    .line 305
    .line 306
    const-string v10, "ResourcesFlusher"

    .line 307
    .line 308
    if-nez v0, :cond_12

    .line 309
    .line 310
    :try_start_1
    const-class v0, Landroid/content/res/Resources;

    .line 311
    .line 312
    const-string v13, "mResourcesImpl"

    .line 313
    .line 314
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    sput-object v0, Ly4/b;->g:Ljava/lang/reflect/Field;

    .line 319
    .line 320
    const/4 v13, 0x1

    .line 321
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 322
    .line 323
    .line 324
    :goto_a
    const/4 v13, 0x1

    .line 325
    goto :goto_b

    .line 326
    :catch_1
    move-exception v0

    .line 327
    const-string v13, "Could not retrieve Resources#mResourcesImpl field"

    .line 328
    .line 329
    invoke-static {v10, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 330
    .line 331
    .line 332
    goto :goto_a

    .line 333
    :goto_b
    sput-boolean v13, Ly4/b;->h:Z

    .line 334
    .line 335
    :cond_12
    sget-object v0, Ly4/b;->g:Ljava/lang/reflect/Field;

    .line 336
    .line 337
    if-nez v0, :cond_13

    .line 338
    .line 339
    goto/16 :goto_15

    .line 340
    .line 341
    :cond_13
    :try_start_2
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2

    .line 345
    move-object v8, v0

    .line 346
    goto :goto_c

    .line 347
    :catch_2
    move-exception v0

    .line 348
    const-string v8, "Could not retrieve value from Resources#mResourcesImpl"

    .line 349
    .line 350
    invoke-static {v10, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 351
    .line 352
    .line 353
    move-object v8, v7

    .line 354
    :goto_c
    if-nez v8, :cond_14

    .line 355
    .line 356
    goto/16 :goto_15

    .line 357
    .line 358
    :cond_14
    sget-boolean v0, Ly4/b;->b:Z

    .line 359
    .line 360
    if-nez v0, :cond_15

    .line 361
    .line 362
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v13, "mDrawableCache"

    .line 367
    .line 368
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    sput-object v0, Ly4/b;->a:Ljava/lang/reflect/Field;

    .line 373
    .line 374
    const/4 v13, 0x1

    .line 375
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_3

    .line 376
    .line 377
    .line 378
    :goto_d
    const/4 v13, 0x1

    .line 379
    goto :goto_e

    .line 380
    :catch_3
    move-exception v0

    .line 381
    const-string v13, "Could not retrieve ResourcesImpl#mDrawableCache field"

    .line 382
    .line 383
    invoke-static {v10, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 384
    .line 385
    .line 386
    goto :goto_d

    .line 387
    :goto_e
    sput-boolean v13, Ly4/b;->b:Z

    .line 388
    .line 389
    :cond_15
    sget-object v0, Ly4/b;->a:Ljava/lang/reflect/Field;

    .line 390
    .line 391
    if-eqz v0, :cond_16

    .line 392
    .line 393
    :try_start_4
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_4

    .line 397
    move-object v8, v0

    .line 398
    goto :goto_f

    .line 399
    :catch_4
    move-exception v0

    .line 400
    const-string v8, "Could not retrieve value from ResourcesImpl#mDrawableCache"

    .line 401
    .line 402
    invoke-static {v10, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 403
    .line 404
    .line 405
    :cond_16
    move-object v8, v7

    .line 406
    :goto_f
    if-eqz v8, :cond_1b

    .line 407
    .line 408
    sget-boolean v0, Ly4/b;->d:Z

    .line 409
    .line 410
    if-nez v0, :cond_17

    .line 411
    .line 412
    :try_start_5
    const-string v0, "android.content.res.ThemedResourceCache"

    .line 413
    .line 414
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    sput-object v0, Ly4/b;->c:Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    .line 419
    .line 420
    :goto_10
    const/4 v13, 0x1

    .line 421
    goto :goto_11

    .line 422
    :catch_5
    move-exception v0

    .line 423
    const-string v13, "Could not find ThemedResourceCache class"

    .line 424
    .line 425
    invoke-static {v10, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 426
    .line 427
    .line 428
    goto :goto_10

    .line 429
    :goto_11
    sput-boolean v13, Ly4/b;->d:Z

    .line 430
    .line 431
    :cond_17
    sget-object v0, Ly4/b;->c:Ljava/lang/Class;

    .line 432
    .line 433
    if-nez v0, :cond_18

    .line 434
    .line 435
    goto :goto_15

    .line 436
    :cond_18
    sget-boolean v13, Ly4/b;->f:Z

    .line 437
    .line 438
    if-nez v13, :cond_19

    .line 439
    .line 440
    :try_start_6
    const-string v13, "mUnthemedEntries"

    .line 441
    .line 442
    invoke-virtual {v0, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    sput-object v0, Ly4/b;->e:Ljava/lang/reflect/Field;

    .line 447
    .line 448
    const/4 v13, 0x1

    .line 449
    invoke-virtual {v0, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_6
    .catch Ljava/lang/NoSuchFieldException; {:try_start_6 .. :try_end_6} :catch_6

    .line 450
    .line 451
    .line 452
    :goto_12
    const/4 v13, 0x1

    .line 453
    goto :goto_13

    .line 454
    :catch_6
    move-exception v0

    .line 455
    const-string v13, "Could not retrieve ThemedResourceCache#mUnthemedEntries field"

    .line 456
    .line 457
    invoke-static {v10, v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 458
    .line 459
    .line 460
    goto :goto_12

    .line 461
    :goto_13
    sput-boolean v13, Ly4/b;->f:Z

    .line 462
    .line 463
    :cond_19
    sget-object v0, Ly4/b;->e:Ljava/lang/reflect/Field;

    .line 464
    .line 465
    if-nez v0, :cond_1a

    .line 466
    .line 467
    goto :goto_15

    .line 468
    :cond_1a
    :try_start_7
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    check-cast v0, Landroid/util/LongSparseArray;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_7

    .line 473
    .line 474
    move-object v7, v0

    .line 475
    goto :goto_14

    .line 476
    :catch_7
    move-exception v0

    .line 477
    const-string v8, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"

    .line 478
    .line 479
    invoke-static {v10, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 480
    .line 481
    .line 482
    :goto_14
    if-eqz v7, :cond_1b

    .line 483
    .line 484
    invoke-virtual {v7}, Landroid/util/LongSparseArray;->clear()V

    .line 485
    .line 486
    .line 487
    :cond_1b
    :goto_15
    iget v0, v1, Lg/f0;->Z:I

    .line 488
    .line 489
    if-eqz v0, :cond_1c

    .line 490
    .line 491
    invoke-virtual {v4, v0}, Landroid/content/Context;->setTheme(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    iget v7, v1, Lg/f0;->Z:I

    .line 499
    .line 500
    const/4 v13, 0x1

    .line 501
    invoke-virtual {v0, v7, v13}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 502
    .line 503
    .line 504
    goto :goto_16

    .line 505
    :cond_1c
    const/4 v13, 0x1

    .line 506
    :goto_16
    if-eqz v2, :cond_1e

    .line 507
    .line 508
    instance-of v0, v11, Landroid/app/Activity;

    .line 509
    .line 510
    if-eqz v0, :cond_1e

    .line 511
    .line 512
    move-object v0, v11

    .line 513
    check-cast v0, Landroid/app/Activity;

    .line 514
    .line 515
    instance-of v2, v0, Landroidx/lifecycle/t;

    .line 516
    .line 517
    if-eqz v2, :cond_1d

    .line 518
    .line 519
    move-object v2, v0

    .line 520
    check-cast v2, Landroidx/lifecycle/t;

    .line 521
    .line 522
    invoke-interface {v2}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    check-cast v2, Landroidx/lifecycle/v;

    .line 527
    .line 528
    iget-object v2, v2, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 529
    .line 530
    sget-object v7, Landroidx/lifecycle/n;->i:Landroidx/lifecycle/n;

    .line 531
    .line 532
    invoke-virtual {v2, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    if-ltz v2, :cond_1e

    .line 537
    .line 538
    invoke-virtual {v0, v9}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 539
    .line 540
    .line 541
    goto :goto_17

    .line 542
    :cond_1d
    iget-boolean v2, v1, Lg/f0;->V:Z

    .line 543
    .line 544
    if-eqz v2, :cond_1e

    .line 545
    .line 546
    iget-boolean v2, v1, Lg/f0;->W:Z

    .line 547
    .line 548
    if-nez v2, :cond_1e

    .line 549
    .line 550
    invoke-virtual {v0, v9}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 551
    .line 552
    .line 553
    :cond_1e
    :goto_17
    move v10, v13

    .line 554
    goto :goto_18

    .line 555
    :cond_1f
    move v10, v2

    .line 556
    :goto_18
    if-eqz v10, :cond_21

    .line 557
    .line 558
    instance-of v0, v11, Lg/k;

    .line 559
    .line 560
    if-eqz v0, :cond_21

    .line 561
    .line 562
    and-int/lit16 v0, v12, 0x200

    .line 563
    .line 564
    if-eqz v0, :cond_20

    .line 565
    .line 566
    move-object v0, v11

    .line 567
    check-cast v0, Lg/k;

    .line 568
    .line 569
    invoke-virtual {v0, v5}, Lg/k;->onNightModeChanged(I)V

    .line 570
    .line 571
    .line 572
    :cond_20
    and-int/lit8 v0, v12, 0x4

    .line 573
    .line 574
    if-eqz v0, :cond_21

    .line 575
    .line 576
    check-cast v11, Lg/k;

    .line 577
    .line 578
    invoke-virtual {v11, v6}, Lg/k;->onLocalesChanged(Lb0/g;)V

    .line 579
    .line 580
    .line 581
    :cond_21
    if-eqz v14, :cond_22

    .line 582
    .line 583
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-static {v0}, Lg/x;->b(Landroid/content/res/Configuration;)Lb0/g;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-static {v0}, Lg/x;->c(Lb0/g;)V

    .line 596
    .line 597
    .line 598
    :cond_22
    if-nez v3, :cond_23

    .line 599
    .line 600
    invoke-virtual {v1, v4}, Lg/f0;->A(Landroid/content/Context;)Lg/c0;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0}, Lg/c0;->h()V

    .line 605
    .line 606
    .line 607
    goto :goto_19

    .line 608
    :cond_23
    iget-object v0, v1, Lg/f0;->c0:Lg/a0;

    .line 609
    .line 610
    if-eqz v0, :cond_24

    .line 611
    .line 612
    invoke-virtual {v0}, Lg/c0;->c()V

    .line 613
    .line 614
    .line 615
    :cond_24
    :goto_19
    const/4 v0, 0x3

    .line 616
    if-ne v3, v0, :cond_26

    .line 617
    .line 618
    iget-object v0, v1, Lg/f0;->d0:Lg/a0;

    .line 619
    .line 620
    if-nez v0, :cond_25

    .line 621
    .line 622
    new-instance v0, Lg/a0;

    .line 623
    .line 624
    invoke-direct {v0, v1, v4}, Lg/a0;-><init>(Lg/f0;Landroid/content/Context;)V

    .line 625
    .line 626
    .line 627
    iput-object v0, v1, Lg/f0;->d0:Lg/a0;

    .line 628
    .line 629
    :cond_25
    iget-object v0, v1, Lg/f0;->d0:Lg/a0;

    .line 630
    .line 631
    invoke-virtual {v0}, Lg/c0;->h()V

    .line 632
    .line 633
    .line 634
    goto :goto_1a

    .line 635
    :cond_26
    iget-object v0, v1, Lg/f0;->d0:Lg/a0;

    .line 636
    .line 637
    if-eqz v0, :cond_27

    .line 638
    .line 639
    invoke-virtual {v0}, Lg/c0;->c()V

    .line 640
    .line 641
    .line 642
    :cond_27
    :goto_1a
    return v10
.end method

.method public final q(Landroid/view/Window;)V
    .locals 7

    .line 1
    const-string v0, "AppCompat has already installed itself into the Window"

    .line 2
    .line 3
    iget-object v1, p0, Lg/f0;->r:Landroid/view/Window;

    .line 4
    .line 5
    if-nez v1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Lg/z;

    .line 12
    .line 13
    if-nez v2, :cond_5

    .line 14
    .line 15
    new-instance v0, Lg/z;

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lg/z;-><init>(Lg/f0;Landroid/view/Window$Callback;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lg/f0;->s:Lg/z;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lg/f0;->q:Landroid/content/Context;

    .line 26
    .line 27
    sget-object v1, Lg/f0;->o0:[I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-static {}, Lk/v;->a()Lk/v;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    monitor-enter v4

    .line 52
    :try_start_0
    iget-object v5, v4, Lk/v;->a:Lk/n2;

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    invoke-virtual {v5, v0, v3, v6}, Lk/n2;->d(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 56
    .line 57
    .line 58
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p1

    .line 64
    :cond_0
    move-object v0, v2

    .line 65
    :goto_0
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lg/f0;->r:Landroid/view/Window;

    .line 74
    .line 75
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 76
    .line 77
    const/16 v0, 0x21

    .line 78
    .line 79
    if-lt p1, v0, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Lg/f0;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 82
    .line 83
    if-nez p1, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    iget-object v1, p0, Lg/f0;->m0:Landroid/window/OnBackInvokedCallback;

    .line 90
    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    invoke-static {p1, v1}, Lg/y;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p0, Lg/f0;->m0:Landroid/window/OnBackInvokedCallback;

    .line 97
    .line 98
    :cond_2
    instance-of p1, v0, Landroid/app/Activity;

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    check-cast v0, Landroid/app/Activity;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-static {v0}, Lg/y;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Lg/f0;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    iput-object v2, p0, Lg/f0;->l0:Landroid/window/OnBackInvokedDispatcher;

    .line 118
    .line 119
    :goto_1
    invoke-virtual {p0}, Lg/f0;->K()V

    .line 120
    .line 121
    .line 122
    :cond_4
    return-void

    .line 123
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1

    .line 129
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 130
    .line 131
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1
.end method

.method public final s(ILg/e0;Lj/n;)V
    .locals 3

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lg/f0;->R:[Lg/e0;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget-object p2, v0, p1

    .line 13
    .line 14
    :cond_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p3, p2, Lg/e0;->h:Lj/n;

    .line 17
    .line 18
    :cond_1
    if-eqz p2, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p2, Lg/e0;->m:Z

    .line 21
    .line 22
    if-nez p2, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean p2, p0, Lg/f0;->W:Z

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    iget-object p2, p0, Lg/f0;->s:Lg/z;

    .line 30
    .line 31
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    const/4 v2, 0x0

    .line 42
    :try_start_0
    iput-boolean v1, p2, Lg/z;->k:Z

    .line 43
    .line 44
    invoke-interface {v0, p1, p3}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    iput-boolean v2, p2, Lg/z;->k:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iput-boolean v2, p2, Lg/z;->k:Z

    .line 52
    .line 53
    throw p1

    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public final t(Lj/n;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lg/f0;->Q:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lg/f0;->Q:Z

    .line 8
    .line 9
    iget-object v0, p0, Lg/f0;->x:Lk/l1;

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 17
    .line 18
    check-cast v0, Lk/d3;

    .line 19
    .line 20
    iget-object v0, v0, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->z:Lk/l;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Lk/l;->g()Z

    .line 31
    .line 32
    .line 33
    iget-object v0, v0, Lk/l;->z:Lk/h;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lj/x;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lj/x;->i:Lj/v;

    .line 44
    .line 45
    invoke-interface {v0}, Lj/d0;->dismiss()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    iget-boolean v1, p0, Lg/f0;->W:Z

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    const/16 v1, 0x6c

    .line 61
    .line 62
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    const/4 p1, 0x0

    .line 66
    iput-boolean p1, p0, Lg/f0;->Q:Z

    .line 67
    .line 68
    return-void
.end method

.method public final u(Lg/e0;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p1, Lg/e0;->a:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lg/f0;->x:Lk/l1;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 17
    .line 18
    check-cast v0, Lk/d3;

    .line 19
    .line 20
    iget-object v0, v0, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->o()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, Lg/e0;->h:Lj/n;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lg/f0;->t(Lj/n;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iget-object v0, p0, Lg/f0;->q:Landroid/content/Context;

    .line 35
    .line 36
    const-string v1, "window"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/view/WindowManager;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-boolean v2, p1, Lg/e0;->m:Z

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    iget-object v2, p1, Lg/e0;->e:Lg/d0;

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-interface {v0, v2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    iget p2, p1, Lg/e0;->a:I

    .line 61
    .line 62
    invoke-virtual {p0, p2, p1, v1}, Lg/f0;->s(ILg/e0;Lj/n;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    const/4 p2, 0x0

    .line 66
    iput-boolean p2, p1, Lg/e0;->k:Z

    .line 67
    .line 68
    iput-boolean p2, p1, Lg/e0;->l:Z

    .line 69
    .line 70
    iput-boolean p2, p1, Lg/e0;->m:Z

    .line 71
    .line 72
    iput-object v1, p1, Lg/e0;->f:Landroid/view/View;

    .line 73
    .line 74
    const/4 p2, 0x1

    .line 75
    iput-boolean p2, p1, Lg/e0;->n:Z

    .line 76
    .line 77
    iget-object p2, p0, Lg/f0;->S:Lg/e0;

    .line 78
    .line 79
    if-ne p2, p1, :cond_2

    .line 80
    .line 81
    iput-object v1, p0, Lg/f0;->S:Lg/e0;

    .line 82
    .line 83
    :cond_2
    iget p1, p1, Lg/e0;->a:I

    .line 84
    .line 85
    if-nez p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Lg/f0;->K()V

    .line 88
    .line 89
    .line 90
    :cond_3
    return-void
.end method

.method public final w(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Lf0/j;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    instance-of v0, v0, Lg/i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {v0, p1}, La/a;->h(Landroid/view/View;Landroid/view/KeyEvent;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v3, 0x52

    .line 34
    .line 35
    if-ne v0, v3, :cond_2

    .line 36
    .line 37
    iget-object v0, p0, Lg/f0;->s:Lg/z;

    .line 38
    .line 39
    iget-object v4, p0, Lg/f0;->r:Landroid/view/Window;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    :try_start_0
    iput-boolean v2, v0, Lg/z;->j:Z

    .line 49
    .line 50
    invoke-interface {v4, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 51
    .line 52
    .line 53
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    iput-boolean v1, v0, Lg/z;->j:Z

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :catchall_0
    move-exception p1

    .line 61
    iput-boolean v1, v0, Lg/z;->j:Z

    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x4

    .line 73
    if-nez v4, :cond_6

    .line 74
    .line 75
    if-eq v0, v5, :cond_4

    .line 76
    .line 77
    if-eq v0, v3, :cond_3

    .line 78
    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_11

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-boolean v1, v0, Lg/e0;->m:Z

    .line 92
    .line 93
    if-nez v1, :cond_11

    .line 94
    .line 95
    invoke-virtual {p0, v0, p1}, Lg/f0;->I(Lg/e0;Landroid/view/KeyEvent;)Z

    .line 96
    .line 97
    .line 98
    return v2

    .line 99
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    and-int/lit16 p1, p1, 0x80

    .line 104
    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_5
    move v2, v1

    .line 109
    :goto_0
    iput-boolean v2, p0, Lg/f0;->T:Z

    .line 110
    .line 111
    return v1

    .line 112
    :cond_6
    if-eq v0, v5, :cond_10

    .line 113
    .line 114
    if-eq v0, v3, :cond_7

    .line 115
    .line 116
    goto/16 :goto_6

    .line 117
    .line 118
    :cond_7
    iget-object v0, p0, Lg/f0;->A:Li/b;

    .line 119
    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    goto/16 :goto_5

    .line 123
    .line 124
    :cond_8
    invoke-virtual {p0, v1}, Lg/f0;->B(I)Lg/e0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 129
    .line 130
    iget-object v4, p0, Lg/f0;->q:Landroid/content/Context;

    .line 131
    .line 132
    if-eqz v3, :cond_a

    .line 133
    .line 134
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 137
    .line 138
    .line 139
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 140
    .line 141
    check-cast v3, Lk/d3;

    .line 142
    .line 143
    iget-object v3, v3, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 144
    .line 145
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-nez v5, :cond_a

    .line 150
    .line 151
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 152
    .line 153
    if-eqz v3, :cond_a

    .line 154
    .line 155
    iget-boolean v3, v3, Landroidx/appcompat/widget/ActionMenuView;->y:Z

    .line 156
    .line 157
    if-eqz v3, :cond_a

    .line 158
    .line 159
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-nez v3, :cond_a

    .line 168
    .line 169
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 170
    .line 171
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 172
    .line 173
    invoke-virtual {v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 174
    .line 175
    .line 176
    iget-object v3, v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 177
    .line 178
    check-cast v3, Lk/d3;

    .line 179
    .line 180
    iget-object v3, v3, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 181
    .line 182
    invoke-virtual {v3}, Landroidx/appcompat/widget/Toolbar;->o()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-nez v3, :cond_9

    .line 187
    .line 188
    iget-boolean v3, p0, Lg/f0;->W:Z

    .line 189
    .line 190
    if-nez v3, :cond_d

    .line 191
    .line 192
    invoke-virtual {p0, v0, p1}, Lg/f0;->I(Lg/e0;Landroid/view/KeyEvent;)Z

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-eqz p1, :cond_d

    .line 197
    .line 198
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 199
    .line 200
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 201
    .line 202
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 203
    .line 204
    .line 205
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 206
    .line 207
    check-cast p1, Lk/d3;

    .line 208
    .line 209
    iget-object p1, p1, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 210
    .line 211
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    goto :goto_4

    .line 216
    :cond_9
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 217
    .line 218
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 219
    .line 220
    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k()V

    .line 221
    .line 222
    .line 223
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->k:Lk/m1;

    .line 224
    .line 225
    check-cast p1, Lk/d3;

    .line 226
    .line 227
    iget-object p1, p1, Lk/d3;->a:Landroidx/appcompat/widget/Toolbar;

    .line 228
    .line 229
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 230
    .line 231
    if-eqz p1, :cond_d

    .line 232
    .line 233
    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->z:Lk/l;

    .line 234
    .line 235
    if-eqz p1, :cond_d

    .line 236
    .line 237
    invoke-virtual {p1}, Lk/l;->g()Z

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    if-eqz p1, :cond_d

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_a
    iget-boolean v3, v0, Lg/e0;->m:Z

    .line 245
    .line 246
    if-nez v3, :cond_e

    .line 247
    .line 248
    iget-boolean v5, v0, Lg/e0;->l:Z

    .line 249
    .line 250
    if-eqz v5, :cond_b

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_b
    iget-boolean v3, v0, Lg/e0;->k:Z

    .line 254
    .line 255
    if-eqz v3, :cond_d

    .line 256
    .line 257
    iget-boolean v3, v0, Lg/e0;->o:Z

    .line 258
    .line 259
    if-eqz v3, :cond_c

    .line 260
    .line 261
    iput-boolean v1, v0, Lg/e0;->k:Z

    .line 262
    .line 263
    invoke-virtual {p0, v0, p1}, Lg/f0;->I(Lg/e0;Landroid/view/KeyEvent;)Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    goto :goto_1

    .line 268
    :cond_c
    move v3, v2

    .line 269
    :goto_1
    if-eqz v3, :cond_d

    .line 270
    .line 271
    invoke-virtual {p0, v0, p1}, Lg/f0;->G(Lg/e0;Landroid/view/KeyEvent;)V

    .line 272
    .line 273
    .line 274
    :goto_2
    move p1, v2

    .line 275
    goto :goto_4

    .line 276
    :cond_d
    move p1, v1

    .line 277
    goto :goto_4

    .line 278
    :cond_e
    :goto_3
    invoke-virtual {p0, v0, v2}, Lg/f0;->u(Lg/e0;Z)V

    .line 279
    .line 280
    .line 281
    move p1, v3

    .line 282
    :goto_4
    if-eqz p1, :cond_11

    .line 283
    .line 284
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    const-string v0, "audio"

    .line 289
    .line 290
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    check-cast p1, Landroid/media/AudioManager;

    .line 295
    .line 296
    if-eqz p1, :cond_f

    .line 297
    .line 298
    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 299
    .line 300
    .line 301
    return v2

    .line 302
    :cond_f
    const-string p1, "AppCompatDelegate"

    .line 303
    .line 304
    const-string v0, "Couldn\'t get audio manager"

    .line 305
    .line 306
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    return v2

    .line 310
    :cond_10
    invoke-virtual {p0}, Lg/f0;->F()Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-eqz p1, :cond_12

    .line 315
    .line 316
    :cond_11
    :goto_5
    return v2

    .line 317
    :cond_12
    :goto_6
    return v1
.end method

.method public final x(I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lg/f0;->B(I)Lg/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lg/e0;->h:Lj/n;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    new-instance v1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lg/e0;->h:Lj/n;

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Lj/n;->t(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-lez v2, :cond_0

    .line 24
    .line 25
    iput-object v1, v0, Lg/e0;->p:Landroid/os/Bundle;

    .line 26
    .line 27
    :cond_0
    iget-object v1, v0, Lg/e0;->h:Lj/n;

    .line 28
    .line 29
    invoke-virtual {v1}, Lj/n;->w()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lg/e0;->h:Lj/n;

    .line 33
    .line 34
    invoke-virtual {v1}, Lj/n;->clear()V

    .line 35
    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, v0, Lg/e0;->o:Z

    .line 39
    .line 40
    iput-boolean v1, v0, Lg/e0;->n:Z

    .line 41
    .line 42
    const/16 v0, 0x6c

    .line 43
    .line 44
    if-eq p1, v0, :cond_2

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Lg/f0;->x:Lk/l1;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, Lg/f0;->B(I)Lg/e0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-boolean p1, v0, Lg/e0;->k:Z

    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    invoke-virtual {p0, v0, p1}, Lg/f0;->I(Lg/e0;Landroid/view/KeyEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_3
    return-void
.end method

.method public final y()V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lg/f0;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_1b

    .line 4
    .line 5
    iget-object v0, p0, Lg/f0;->q:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v1, Lf/a;->j:[I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/16 v3, 0x75

    .line 14
    .line 15
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_1a

    .line 20
    .line 21
    const/16 v4, 0x7e

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/16 v6, 0x6c

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v7}, Lg/f0;->j(I)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v6}, Lg/f0;->j(I)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    const/16 v3, 0x76

    .line 47
    .line 48
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0x6d

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v4}, Lg/f0;->j(I)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    const/16 v3, 0x77

    .line 60
    .line 61
    invoke-virtual {v2, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    const/16 v3, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, v3}, Lg/f0;->j(I)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-virtual {v2, v5, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    iput-boolean v3, p0, Lg/f0;->O:Z

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lg/f0;->z()V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lg/f0;->r:Landroid/view/Window;

    .line 85
    .line 86
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 87
    .line 88
    .line 89
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    iget-boolean v3, p0, Lg/f0;->P:Z

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    if-nez v3, :cond_9

    .line 97
    .line 98
    iget-boolean v3, p0, Lg/f0;->O:Z

    .line 99
    .line 100
    if-eqz v3, :cond_4

    .line 101
    .line 102
    const v3, 0x7f0b000c

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Landroid/view/ViewGroup;

    .line 110
    .line 111
    iput-boolean v5, p0, Lg/f0;->M:Z

    .line 112
    .line 113
    iput-boolean v5, p0, Lg/f0;->L:Z

    .line 114
    .line 115
    goto/16 :goto_2

    .line 116
    .line 117
    :cond_4
    iget-boolean v2, p0, Lg/f0;->L:Z

    .line 118
    .line 119
    if-eqz v2, :cond_8

    .line 120
    .line 121
    new-instance v2, Landroid/util/TypedValue;

    .line 122
    .line 123
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v9, 0x7f030009

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v9, v2, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 134
    .line 135
    .line 136
    iget v3, v2, Landroid/util/TypedValue;->resourceId:I

    .line 137
    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    new-instance v3, Li/d;

    .line 141
    .line 142
    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    .line 143
    .line 144
    invoke-direct {v3, v0, v2}, Li/d;-><init>(Landroid/content/Context;I)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object v3, v0

    .line 149
    :goto_1
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const v3, 0x7f0b0017

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Landroid/view/ViewGroup;

    .line 161
    .line 162
    const v3, 0x7f080059

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lk/l1;

    .line 170
    .line 171
    iput-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 172
    .line 173
    iget-object v9, p0, Lg/f0;->r:Landroid/view/Window;

    .line 174
    .line 175
    invoke-virtual {v9}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-interface {v3, v9}, Lk/l1;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v3, p0, Lg/f0;->M:Z

    .line 183
    .line 184
    if-eqz v3, :cond_6

    .line 185
    .line 186
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 187
    .line 188
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 189
    .line 190
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    iget-boolean v3, p0, Lg/f0;->J:Z

    .line 194
    .line 195
    if-eqz v3, :cond_7

    .line 196
    .line 197
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 198
    .line 199
    const/4 v4, 0x2

    .line 200
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 203
    .line 204
    .line 205
    :cond_7
    iget-boolean v3, p0, Lg/f0;->K:Z

    .line 206
    .line 207
    if-eqz v3, :cond_b

    .line 208
    .line 209
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 210
    .line 211
    const/4 v4, 0x5

    .line 212
    check-cast v3, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 213
    .line 214
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->j(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_8
    move-object v2, v8

    .line 219
    goto :goto_2

    .line 220
    :cond_9
    iget-boolean v3, p0, Lg/f0;->N:Z

    .line 221
    .line 222
    if-eqz v3, :cond_a

    .line 223
    .line 224
    const v3, 0x7f0b0016

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Landroid/view/ViewGroup;

    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_a
    const v3, 0x7f0b0015

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    check-cast v2, Landroid/view/ViewGroup;

    .line 242
    .line 243
    :cond_b
    :goto_2
    if-eqz v2, :cond_19

    .line 244
    .line 245
    new-instance v3, Lg/t;

    .line 246
    .line 247
    invoke-direct {v3, p0}, Lg/t;-><init>(Lg/f0;)V

    .line 248
    .line 249
    .line 250
    sget-object v4, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 251
    .line 252
    invoke-static {v2, v3}, Lf0/k0;->i(Landroid/view/View;Lf0/t;)V

    .line 253
    .line 254
    .line 255
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 256
    .line 257
    if-nez v3, :cond_c

    .line 258
    .line 259
    const v3, 0x7f0800c3

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    check-cast v3, Landroid/widget/TextView;

    .line 267
    .line 268
    iput-object v3, p0, Lg/f0;->H:Landroid/widget/TextView;

    .line 269
    .line 270
    :cond_c
    sget-boolean v3, Lk/l3;->a:Z

    .line 271
    .line 272
    const-string v3, "Could not invoke makeOptionalFitsSystemWindows"

    .line 273
    .line 274
    const-string v4, "ViewUtils"

    .line 275
    .line 276
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    const-string v10, "makeOptionalFitsSystemWindows"

    .line 281
    .line 282
    invoke-virtual {v9, v10, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    invoke-virtual {v9}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    if-nez v10, :cond_d

    .line 291
    .line 292
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 293
    .line 294
    .line 295
    goto :goto_3

    .line 296
    :catch_0
    move-exception v9

    .line 297
    goto :goto_4

    .line 298
    :catch_1
    move-exception v9

    .line 299
    goto :goto_5

    .line 300
    :cond_d
    :goto_3
    invoke-virtual {v9, v2, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :goto_4
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :goto_5
    invoke-static {v4, v3, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :catch_2
    const-string v3, "Could not find method makeOptionalFitsSystemWindows. Oh well..."

    .line 313
    .line 314
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    :goto_6
    const v3, 0x7f080028

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    check-cast v3, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 325
    .line 326
    iget-object v4, p0, Lg/f0;->r:Landroid/view/Window;

    .line 327
    .line 328
    const v9, 0x1020002

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    check-cast v4, Landroid/view/ViewGroup;

    .line 336
    .line 337
    if-eqz v4, :cond_f

    .line 338
    .line 339
    :goto_7
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    if-lez v10, :cond_e

    .line 344
    .line 345
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 346
    .line 347
    .line 348
    move-result-object v10

    .line 349
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v3, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 353
    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_e
    const/4 v10, -0x1

    .line 357
    invoke-virtual {v4, v10}, Landroid/view/View;->setId(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v3, v9}, Landroid/view/View;->setId(I)V

    .line 361
    .line 362
    .line 363
    instance-of v10, v4, Landroid/widget/FrameLayout;

    .line 364
    .line 365
    if-eqz v10, :cond_f

    .line 366
    .line 367
    check-cast v4, Landroid/widget/FrameLayout;

    .line 368
    .line 369
    invoke-virtual {v4, v8}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 370
    .line 371
    .line 372
    :cond_f
    iget-object v4, p0, Lg/f0;->r:Landroid/view/Window;

    .line 373
    .line 374
    invoke-virtual {v4, v2}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 375
    .line 376
    .line 377
    new-instance v4, Lg/u;

    .line 378
    .line 379
    invoke-direct {v4, p0}, Lg/u;-><init>(Lg/f0;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Lk/k1;)V

    .line 383
    .line 384
    .line 385
    iput-object v2, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 386
    .line 387
    iget-object v2, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 388
    .line 389
    instance-of v3, v2, Landroid/app/Activity;

    .line 390
    .line 391
    if-eqz v3, :cond_10

    .line 392
    .line 393
    check-cast v2, Landroid/app/Activity;

    .line 394
    .line 395
    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    goto :goto_8

    .line 400
    :cond_10
    iget-object v2, p0, Lg/f0;->w:Ljava/lang/CharSequence;

    .line 401
    .line 402
    :goto_8
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-nez v3, :cond_13

    .line 407
    .line 408
    iget-object v3, p0, Lg/f0;->x:Lk/l1;

    .line 409
    .line 410
    if-eqz v3, :cond_11

    .line 411
    .line 412
    invoke-interface {v3, v2}, Lk/l1;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 413
    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_11
    iget-object v3, p0, Lg/f0;->u:Lg/a;

    .line 417
    .line 418
    if-eqz v3, :cond_12

    .line 419
    .line 420
    invoke-virtual {v3, v2}, Lg/a;->n(Ljava/lang/CharSequence;)V

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_12
    iget-object v3, p0, Lg/f0;->H:Landroid/widget/TextView;

    .line 425
    .line 426
    if-eqz v3, :cond_13

    .line 427
    .line 428
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    .line 430
    .line 431
    :cond_13
    :goto_9
    iget-object v2, p0, Lg/f0;->G:Landroid/view/ViewGroup;

    .line 432
    .line 433
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    check-cast v2, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 438
    .line 439
    iget-object v3, p0, Lg/f0;->r:Landroid/view/Window;

    .line 440
    .line 441
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 446
    .line 447
    .line 448
    move-result v4

    .line 449
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 450
    .line 451
    .line 452
    move-result v8

    .line 453
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    iget-object v10, v2, Landroidx/appcompat/widget/ContentFrameLayout;->m:Landroid/graphics/Rect;

    .line 462
    .line 463
    invoke-virtual {v10, v4, v8, v9, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    if-eqz v3, :cond_14

    .line 471
    .line 472
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 473
    .line 474
    .line 475
    :cond_14
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    const/16 v1, 0x7c

    .line 480
    .line 481
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 486
    .line 487
    .line 488
    const/16 v1, 0x7d

    .line 489
    .line 490
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 495
    .line 496
    .line 497
    const/16 v1, 0x7a

    .line 498
    .line 499
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    if-eqz v3, :cond_15

    .line 504
    .line 505
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 510
    .line 511
    .line 512
    :cond_15
    const/16 v1, 0x7b

    .line 513
    .line 514
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    if-eqz v3, :cond_16

    .line 519
    .line 520
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 525
    .line 526
    .line 527
    :cond_16
    const/16 v1, 0x78

    .line 528
    .line 529
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 530
    .line 531
    .line 532
    move-result v3

    .line 533
    if-eqz v3, :cond_17

    .line 534
    .line 535
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 540
    .line 541
    .line 542
    :cond_17
    const/16 v1, 0x79

    .line 543
    .line 544
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 545
    .line 546
    .line 547
    move-result v3

    .line 548
    if-eqz v3, :cond_18

    .line 549
    .line 550
    invoke-virtual {v2}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 555
    .line 556
    .line 557
    :cond_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    .line 561
    .line 562
    .line 563
    iput-boolean v7, p0, Lg/f0;->F:Z

    .line 564
    .line 565
    invoke-virtual {p0, v5}, Lg/f0;->B(I)Lg/e0;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    iget-boolean v1, p0, Lg/f0;->W:Z

    .line 570
    .line 571
    if-nez v1, :cond_1b

    .line 572
    .line 573
    iget-object v0, v0, Lg/e0;->h:Lj/n;

    .line 574
    .line 575
    if-nez v0, :cond_1b

    .line 576
    .line 577
    invoke-virtual {p0, v6}, Lg/f0;->D(I)V

    .line 578
    .line 579
    .line 580
    goto :goto_a

    .line 581
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 582
    .line 583
    new-instance v1, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    .line 586
    .line 587
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    iget-boolean v2, p0, Lg/f0;->L:Z

    .line 591
    .line 592
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 593
    .line 594
    .line 595
    const-string v2, ", windowActionBarOverlay: "

    .line 596
    .line 597
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    iget-boolean v2, p0, Lg/f0;->M:Z

    .line 601
    .line 602
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    const-string v2, ", android:windowIsFloating: "

    .line 606
    .line 607
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    iget-boolean v2, p0, Lg/f0;->O:Z

    .line 611
    .line 612
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 613
    .line 614
    .line 615
    const-string v2, ", windowActionModeOverlay: "

    .line 616
    .line 617
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    iget-boolean v2, p0, Lg/f0;->N:Z

    .line 621
    .line 622
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string v2, ", windowNoTitle: "

    .line 626
    .line 627
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    .line 629
    .line 630
    iget-boolean v2, p0, Lg/f0;->P:Z

    .line 631
    .line 632
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    const-string v2, " }"

    .line 636
    .line 637
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    throw v0

    .line 648
    :cond_1a
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 649
    .line 650
    .line 651
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 652
    .line 653
    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    .line 654
    .line 655
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    throw v0

    .line 659
    :cond_1b
    :goto_a
    return-void
.end method

.method public final z()V
    .locals 2

    .line 1
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg/f0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/app/Activity;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lg/f0;->q(Landroid/view/Window;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lg/f0;->r:Landroid/view/Window;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "We have not been given a Window"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method
