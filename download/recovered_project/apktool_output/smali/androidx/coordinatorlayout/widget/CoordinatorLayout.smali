.class public Landroidx/coordinatorlayout/widget/CoordinatorLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Lf0/q;
.implements Lf0/r;


# static fields
.field public static final A:Lc3/c0;

.field public static final B:Le0/c;

.field public static final x:Ljava/lang/String;

.field public static final y:[Ljava/lang/Class;

.field public static final z:Ljava/lang/ThreadLocal;


# instance fields
.field public final g:Ljava/util/ArrayList;

.field public final h:Lr1/h;

.field public final i:Ljava/util/ArrayList;

.field public final j:[I

.field public final k:[I

.field public l:Z

.field public m:Z

.field public final n:[I

.field public o:Landroid/view/View;

.field public p:Ls/e;

.field public q:Z

.field public r:Lf0/q1;

.field public s:Z

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:Landroid/view/ViewGroup$OnHierarchyChangeListener;

.field public v:Lk1/j;

.field public final w:Lf0/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->x:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Lc3/c0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lc3/c0;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->A:Lc3/c0;

    .line 24
    .line 25
    const-class v0, Landroid/content/Context;

    .line 26
    .line 27
    const-class v1, Landroid/util/AttributeSet;

    .line 28
    .line 29
    filled-new-array {v0, v1}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->y:[Ljava/lang/Class;

    .line 34
    .line 35
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 38
    .line 39
    .line 40
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->z:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    new-instance v0, Le0/c;

    .line 43
    .line 44
    invoke-direct {v0}, Le0/c;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->B:Le0/c;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    .line 1
    const v5, 0x7f03006a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v5}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lr1/h;

    .line 15
    .line 16
    const/16 v1, 0x9

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lr1/h;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->h:Lr1/h;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->i:Ljava/util/ArrayList;

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    new-array v1, v0, [I

    .line 32
    .line 33
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->j:[I

    .line 34
    .line 35
    new-array v0, v0, [I

    .line 36
    .line 37
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k:[I

    .line 38
    .line 39
    new-instance v0, Lf0/s;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->w:Lf0/s;

    .line 45
    .line 46
    sget-object v2, Lr/a;->a:[I

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-virtual {p1, p2, v2, v5, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    const/4 v6, 0x0

    .line 54
    move-object v0, p0

    .line 55
    move-object v1, p1

    .line 56
    move-object v3, p2

    .line 57
    invoke-static/range {v0 .. v6}, Lf0/r0;->h(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v7, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getIntArray(I)[I

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:[I

    .line 75
    .line 76
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 81
    .line 82
    array-length p1, p1

    .line 83
    :goto_0
    if-ge v7, p1, :cond_0

    .line 84
    .line 85
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:[I

    .line 86
    .line 87
    aget v2, v1, v7

    .line 88
    .line 89
    int-to-float v2, v2

    .line 90
    mul-float/2addr v2, p2

    .line 91
    float-to-int v2, v2

    .line 92
    aput v2, v1, v7

    .line 93
    .line 94
    add-int/lit8 v7, v7, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    const/4 p1, 0x1

    .line 98
    invoke-virtual {v4, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->u()V

    .line 108
    .line 109
    .line 110
    new-instance p2, Ls/b;

    .line 111
    .line 112
    invoke-direct {p2, p0}, Ls/b;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    .line 113
    .line 114
    .line 115
    invoke-super {p0, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-nez p2, :cond_1

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 125
    .line 126
    .line 127
    :cond_1
    return-void
.end method

.method public static g()Landroid/graphics/Rect;
    .locals 1

    .line 1
    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->B:Le0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/c;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/graphics/Rect;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method private getFullContentHeight()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v0, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ls/d;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 24
    .line 25
    add-int/2addr v2, v4

    .line 26
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 27
    .line 28
    add-int/2addr v2, v3

    .line 29
    add-int/2addr v1, v2

    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1
.end method

.method public static k(ILandroid/graphics/Rect;Landroid/graphics/Rect;Ls/d;II)V
    .locals 6

    .line 1
    iget v0, p3, Ls/d;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x11

    .line 6
    .line 7
    :cond_0
    invoke-static {v0, p0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget p3, p3, Ls/d;->c:I

    .line 12
    .line 13
    and-int/lit8 v1, p3, 0x7

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const v1, 0x800003

    .line 18
    .line 19
    .line 20
    or-int/2addr p3, v1

    .line 21
    :cond_1
    and-int/lit8 v1, p3, 0x70

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    or-int/lit8 p3, p3, 0x30

    .line 26
    .line 27
    :cond_2
    invoke-static {p3, p0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    and-int/lit8 p3, v0, 0x7

    .line 32
    .line 33
    and-int/lit8 v0, v0, 0x70

    .line 34
    .line 35
    and-int/lit8 v1, p0, 0x7

    .line 36
    .line 37
    and-int/lit8 p0, p0, 0x70

    .line 38
    .line 39
    const/4 v2, 0x5

    .line 40
    const/4 v3, 0x1

    .line 41
    if-eq v1, v3, :cond_4

    .line 42
    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    iget v1, p1, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    div-int/lit8 v4, v4, 0x2

    .line 58
    .line 59
    add-int/2addr v1, v4

    .line 60
    :goto_0
    const/16 v4, 0x50

    .line 61
    .line 62
    const/16 v5, 0x10

    .line 63
    .line 64
    if-eq p0, v5, :cond_6

    .line 65
    .line 66
    if-eq p0, v4, :cond_5

    .line 67
    .line 68
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_5
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_6
    iget p0, p1, Landroid/graphics/Rect;->top:I

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    div-int/lit8 p1, p1, 0x2

    .line 81
    .line 82
    add-int/2addr p0, p1

    .line 83
    :goto_1
    if-eq p3, v3, :cond_7

    .line 84
    .line 85
    if-eq p3, v2, :cond_8

    .line 86
    .line 87
    sub-int/2addr v1, p4

    .line 88
    goto :goto_2

    .line 89
    :cond_7
    div-int/lit8 p1, p4, 0x2

    .line 90
    .line 91
    sub-int/2addr v1, p1

    .line 92
    :cond_8
    :goto_2
    if-eq v0, v5, :cond_9

    .line 93
    .line 94
    if-eq v0, v4, :cond_a

    .line 95
    .line 96
    sub-int/2addr p0, p5

    .line 97
    goto :goto_3

    .line 98
    :cond_9
    div-int/lit8 p1, p5, 0x2

    .line 99
    .line 100
    sub-int/2addr p0, p1

    .line 101
    :cond_a
    :goto_3
    add-int/2addr p4, v1

    .line 102
    add-int/2addr p5, p0

    .line 103
    invoke-virtual {p2, v1, p0, p4, p5}, Landroid/graphics/Rect;->set(IIII)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public static m(Landroid/view/View;)Ls/d;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ls/d;

    .line 6
    .line 7
    iget-boolean v1, v0, Ls/d;->a:Z

    .line 8
    .line 9
    if-nez v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v1, 0x0

    .line 16
    move-object v2, v1

    .line 17
    :goto_0
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const-class v2, Ls/a;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ls/a;

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    if-eqz v2, :cond_2

    .line 35
    .line 36
    :try_start_0
    invoke-interface {v2}, Ls/a;->value()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 52
    .line 53
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "Default behavior class "

    .line 61
    .line 62
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2}, Ls/a;->value()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v2, " could not be instantiated. Did you forget a default constructor?"

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v2, "CoordinatorLayout"

    .line 86
    .line 87
    invoke-static {v2, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 88
    .line 89
    .line 90
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 91
    iput-boolean p0, v0, Ls/d;->a:Z

    .line 92
    .line 93
    :cond_3
    return-object v0
.end method

.method public static s(Landroid/view/View;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ls/d;

    .line 6
    .line 7
    iget v1, v0, Ls/d;->h:I

    .line 8
    .line 9
    if-eq v1, p1, :cond_0

    .line 10
    .line 11
    sub-int v1, p1, v1

    .line 12
    .line 13
    sget-object v2, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 16
    .line 17
    .line 18
    iput p1, v0, Ls/d;->h:I

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static t(Landroid/view/View;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ls/d;

    .line 6
    .line 7
    iget v1, v0, Ls/d;->i:I

    .line 8
    .line 9
    if-eq v1, p1, :cond_0

    .line 10
    .line 11
    sub-int v1, p1, v1

    .line 12
    .line 13
    sget-object v2, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 16
    .line 17
    .line 18
    iput p1, v0, Ls/d;->i:I

    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    move p3, p2

    .line 7
    :goto_0
    if-ge p3, p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result p5

    .line 17
    const/16 p6, 0x8

    .line 18
    .line 19
    if-ne p5, p6, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    check-cast p4, Ls/d;

    .line 27
    .line 28
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    aget p1, p7, p2

    .line 35
    .line 36
    aput p1, p7, p2

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aget p2, p7, p1

    .line 40
    .line 41
    aput p2, p7, p1

    .line 42
    .line 43
    return-void
.end method

.method public final b(Landroid/view/View;IIIII)V
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    iget-object v7, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->j:[I

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move v5, p5

    .line 10
    invoke-virtual/range {v0 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;IIIII[I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/View;II)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    move p3, p2

    .line 7
    :goto_0
    if-ge p3, p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    check-cast p4, Ls/d;

    .line 27
    .line 28
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return p2
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ls/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public final d(Landroid/view/View;Landroid/view/View;II)V
    .locals 1

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->w:Lf0/s;

    .line 3
    .line 4
    if-ne p4, p1, :cond_0

    .line 5
    .line 6
    iput p3, v0, Lf0/s;->b:I

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iput p3, v0, Lf0/s;->a:I

    .line 10
    .line 11
    :goto_0
    iput-object p2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 p2, 0x0

    .line 18
    :goto_1
    if-ge p2, p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, Ls/d;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    add-int/lit8 p2, p2, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_a

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_a

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x13

    .line 18
    .line 19
    const v3, 0x3e4ccccd    # 0.2f

    .line 20
    .line 21
    .line 22
    if-eq v1, v2, :cond_8

    .line 23
    .line 24
    const/16 v2, 0x14

    .line 25
    .line 26
    if-eq v1, v2, :cond_6

    .line 27
    .line 28
    const/16 v2, 0x3e

    .line 29
    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    const/16 p1, 0x5c

    .line 33
    .line 34
    if-eq v1, p1, :cond_3

    .line 35
    .line 36
    const/16 p1, 0x5d

    .line 37
    .line 38
    if-eq v1, p1, :cond_2

    .line 39
    .line 40
    const/16 p1, 0x7a

    .line 41
    .line 42
    if-eq v1, p1, :cond_1

    .line 43
    .line 44
    const/16 p1, 0x7b

    .line 45
    .line 46
    if-eq v1, p1, :cond_0

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :cond_0
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getFullContentHeight()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    sub-int/2addr p1, v0

    .line 59
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    return p1

    .line 64
    :cond_1
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getFullContentHeight()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    neg-int p1, p1

    .line 69
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1

    .line 74
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1

    .line 83
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    neg-int p1, p1

    .line 88
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    return p1

    .line 93
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getFullContentHeight()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    neg-int p1, p1

    .line 104
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    return p1

    .line 109
    :cond_5
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getFullContentHeight()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    sub-int/2addr p1, v0

    .line 118
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    return p1

    .line 123
    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_7

    .line 128
    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    return p1

    .line 138
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    int-to-float p1, p1

    .line 143
    mul-float/2addr p1, v3

    .line 144
    float-to-int p1, p1

    .line 145
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    return p1

    .line 150
    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_9

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    neg-int p1, p1

    .line 161
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    return p1

    .line 166
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    int-to-float p1, p1

    .line 171
    mul-float/2addr p1, v3

    .line 172
    float-to-int p1, p1

    .line 173
    neg-int p1, p1

    .line 174
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n(I)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    return p1

    .line 179
    :cond_a
    :goto_0
    return v0
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ls/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final drawableStateChanged()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final e(Landroid/view/View;I)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->w:Lf0/s;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    iput v1, v0, Lf0/s;->b:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iput v1, v0, Lf0/s;->a:I

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :goto_1
    if-ge v1, p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    check-cast p2, Ls/d;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Landroid/view/View;

    .line 36
    .line 37
    return-void
.end method

.method public final f([IIII)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, 0x0

    .line 6
    move p4, p3

    .line 7
    :goto_0
    if-ge p4, p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ls/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_1
    add-int/lit8 p4, p4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    aput p3, p1, p3

    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    aput p3, p1, p2

    .line 38
    .line 39
    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    new-instance v0, Ls/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ls/d;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Ls/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ls/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    instance-of v0, p1, Ls/d;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ls/d;

    check-cast p1, Ls/d;

    invoke-direct {v0, p1}, Ls/d;-><init>(Ls/d;)V

    return-object v0

    .line 4
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 5
    new-instance v0, Ls/d;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Ls/d;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 6
    :cond_1
    new-instance v0, Ls/d;

    invoke-direct {v0, p1}, Ls/d;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final getDependencySortedChildren()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final getLastWindowInsets()Lf0/q1;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->w:Lf0/s;

    .line 2
    .line 3
    iget v1, v0, Lf0/s;->a:I

    .line 4
    .line 5
    iget v0, v0, Lf0/s;->b:I

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    return v0
.end method

.method public getStatusBarBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSuggestedMinimumHeight()I
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    add-int/2addr v2, v1

    .line 14
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public getSuggestedMinimumWidth()I
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    add-int/2addr v2, v1

    .line 14
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final h(Ls/d;Landroid/graphics/Rect;II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 14
    .line 15
    add-int/2addr v2, v3

    .line 16
    iget v3, p2, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    sub-int/2addr v0, v4

    .line 23
    sub-int/2addr v0, p3

    .line 24
    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 25
    .line 26
    sub-int/2addr v0, v4

    .line 27
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 40
    .line 41
    add-int/2addr v2, v3

    .line 42
    iget v3, p2, Landroid/graphics/Rect;->top:I

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    sub-int/2addr v1, v4

    .line 49
    sub-int/2addr v1, p4

    .line 50
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 51
    .line 52
    sub-int/2addr v1, p1

    .line 53
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    add-int/2addr p3, v0

    .line 62
    add-int/2addr p4, p1

    .line 63
    invoke-virtual {p2, v0, p1, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final i(Landroid/view/View;Landroid/graphics/Rect;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->j(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p2, p3, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    :goto_0
    invoke-virtual {p2}, Landroid/graphics/Rect;->setEmpty()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final j(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    sget-object v0, Ls/g;->a:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Ls/g;->a:Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/graphics/Matrix;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-static {p0, p1, v1}, Ls/g;->a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Ls/g;->b:Ljava/lang/ThreadLocal;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Landroid/graphics/RectF;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    new-instance v0, Landroid/graphics/RectF;

    .line 51
    .line 52
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v0, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 62
    .line 63
    .line 64
    iget p1, v0, Landroid/graphics/RectF;->left:F

    .line 65
    .line 66
    const/high16 v1, 0x3f000000    # 0.5f

    .line 67
    .line 68
    add-float/2addr p1, v1

    .line 69
    float-to-int p1, p1

    .line 70
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 71
    .line 72
    add-float/2addr v2, v1

    .line 73
    float-to-int v2, v2

    .line 74
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    add-float/2addr v3, v1

    .line 77
    float-to-int v3, v3

    .line 78
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 79
    .line 80
    add-float/2addr v0, v1

    .line 81
    float-to-int v0, v0

    .line 82
    invoke-virtual {p2, p1, v2, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final l(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "CoordinatorLayout"

    .line 3
    .line 4
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:[I

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v3, "No keylines defined for "

    .line 11
    .line 12
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v3, " - attempted index lookup "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return v0

    .line 34
    :cond_0
    if-ltz p1, :cond_2

    .line 35
    .line 36
    array-length v3, v2

    .line 37
    if-lt p1, v3, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    aget p1, v2, p1

    .line 41
    .line 42
    return p1

    .line 43
    :cond_2
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v3, "Keyline index "

    .line 46
    .line 47
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p1, " out of range for "

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    return v0
.end method

.method public final n(I)Z
    .locals 10

    .line 1
    move-object v0, p0

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    check-cast v0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v0, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    move-object v2, v1

    .line 27
    :goto_1
    const/4 v0, 0x2

    .line 28
    const/4 v9, 0x1

    .line 29
    invoke-virtual {p0, p0, v2, v0, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->c(Landroid/view/View;Landroid/view/View;II)Z

    .line 30
    .line 31
    .line 32
    iget-object v8, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k:[I

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v8, v0, p1, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->f([IIII)V

    .line 36
    .line 37
    .line 38
    aget v4, v8, v9

    .line 39
    .line 40
    aput v0, v8, v0

    .line 41
    .line 42
    aput v0, v8, v9

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v7, 0x1

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v1, p0

    .line 48
    move v6, p1

    .line 49
    invoke-virtual/range {v1 .. v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->a(Landroid/view/View;IIIII[I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2, v9}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->e(Landroid/view/View;I)V

    .line 53
    .line 54
    .line 55
    aget p1, v8, v9

    .line 56
    .line 57
    if-lez p1, :cond_3

    .line 58
    .line 59
    return v9

    .line 60
    :cond_3
    return v0
.end method

.method public final o(I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v8, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v9

    .line 15
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object v10

    .line 19
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 24
    .line 25
    .line 26
    move-result-object v12

    .line 27
    const/4 v14, 0x0

    .line 28
    :goto_0
    sget-object v15, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->B:Le0/c;

    .line 29
    .line 30
    if-ge v14, v9, :cond_18

    .line 31
    .line 32
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, Landroid/view/View;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ls/d;

    .line 43
    .line 44
    if-nez v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const/16 v6, 0x8

    .line 51
    .line 52
    if-ne v5, v6, :cond_0

    .line 53
    .line 54
    move-object v5, v8

    .line 55
    move v3, v9

    .line 56
    move-object v4, v12

    .line 57
    move/from16 v19, v14

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    goto/16 :goto_c

    .line 61
    .line 62
    :cond_0
    const/4 v5, 0x0

    .line 63
    :goto_1
    if-ge v5, v14, :cond_5

    .line 64
    .line 65
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Landroid/view/View;

    .line 70
    .line 71
    iget-object v7, v4, Ls/d;->k:Landroid/view/View;

    .line 72
    .line 73
    if-ne v7, v6, :cond_4

    .line 74
    .line 75
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Ls/d;

    .line 80
    .line 81
    iget-object v7, v6, Ls/d;->j:Landroid/view/View;

    .line 82
    .line 83
    if-eqz v7, :cond_4

    .line 84
    .line 85
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 90
    .line 91
    .line 92
    move-result-object v13

    .line 93
    move-object/from16 v16, v4

    .line 94
    .line 95
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    move/from16 v17, v2

    .line 100
    .line 101
    iget-object v2, v6, Ls/d;->j:Landroid/view/View;

    .line 102
    .line 103
    invoke-virtual {v0, v2, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->j(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-virtual {v0, v3, v13, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->i(Landroid/view/View;Landroid/graphics/Rect;Z)V

    .line 108
    .line 109
    .line 110
    move v2, v5

    .line 111
    move-object v5, v6

    .line 112
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    move-object/from16 v18, v3

    .line 117
    .line 118
    move-object v3, v7

    .line 119
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getMeasuredHeight()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    move/from16 v19, v17

    .line 124
    .line 125
    move/from16 v17, v2

    .line 126
    .line 127
    move/from16 v2, v19

    .line 128
    .line 129
    move-object/from16 v19, v16

    .line 130
    .line 131
    move-object/from16 v16, v8

    .line 132
    .line 133
    move-object/from16 v8, v19

    .line 134
    .line 135
    move/from16 v19, v14

    .line 136
    .line 137
    move-object/from16 v14, v18

    .line 138
    .line 139
    invoke-static/range {v2 .. v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k(ILandroid/graphics/Rect;Landroid/graphics/Rect;Ls/d;II)V

    .line 140
    .line 141
    .line 142
    move/from16 v18, v9

    .line 143
    .line 144
    iget v9, v4, Landroid/graphics/Rect;->left:I

    .line 145
    .line 146
    move-object/from16 v20, v12

    .line 147
    .line 148
    iget v12, v13, Landroid/graphics/Rect;->left:I

    .line 149
    .line 150
    if-ne v9, v12, :cond_1

    .line 151
    .line 152
    iget v9, v4, Landroid/graphics/Rect;->top:I

    .line 153
    .line 154
    iget v12, v13, Landroid/graphics/Rect;->top:I

    .line 155
    .line 156
    :cond_1
    invoke-virtual {v0, v5, v4, v6, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->h(Ls/d;Landroid/graphics/Rect;II)V

    .line 157
    .line 158
    .line 159
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 160
    .line 161
    iget v6, v13, Landroid/graphics/Rect;->left:I

    .line 162
    .line 163
    sub-int/2addr v5, v6

    .line 164
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 165
    .line 166
    iget v7, v13, Landroid/graphics/Rect;->top:I

    .line 167
    .line 168
    sub-int/2addr v6, v7

    .line 169
    if-eqz v5, :cond_2

    .line 170
    .line 171
    sget-object v7, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 172
    .line 173
    invoke-virtual {v14, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 174
    .line 175
    .line 176
    :cond_2
    if-eqz v6, :cond_3

    .line 177
    .line 178
    sget-object v5, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 179
    .line 180
    invoke-virtual {v14, v6}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 181
    .line 182
    .line 183
    :cond_3
    invoke-virtual {v3}, Landroid/graphics/Rect;->setEmpty()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v15, v3}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    invoke-virtual {v13}, Landroid/graphics/Rect;->setEmpty()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v15, v13}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v15, v4}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_4
    move/from16 v17, v5

    .line 203
    .line 204
    move-object/from16 v16, v8

    .line 205
    .line 206
    move/from16 v18, v9

    .line 207
    .line 208
    move-object/from16 v20, v12

    .line 209
    .line 210
    move/from16 v19, v14

    .line 211
    .line 212
    move-object v14, v3

    .line 213
    move-object v8, v4

    .line 214
    :goto_2
    add-int/lit8 v5, v17, 0x1

    .line 215
    .line 216
    move-object v4, v8

    .line 217
    move-object v3, v14

    .line 218
    move-object/from16 v8, v16

    .line 219
    .line 220
    move/from16 v9, v18

    .line 221
    .line 222
    move/from16 v14, v19

    .line 223
    .line 224
    move-object/from16 v12, v20

    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :cond_5
    move-object/from16 v16, v8

    .line 229
    .line 230
    move/from16 v18, v9

    .line 231
    .line 232
    move-object/from16 v20, v12

    .line 233
    .line 234
    move/from16 v19, v14

    .line 235
    .line 236
    move-object v14, v3

    .line 237
    move-object v8, v4

    .line 238
    const/4 v3, 0x1

    .line 239
    invoke-virtual {v0, v14, v11, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->i(Landroid/view/View;Landroid/graphics/Rect;Z)V

    .line 240
    .line 241
    .line 242
    iget v4, v8, Ls/d;->f:I

    .line 243
    .line 244
    const/4 v5, 0x5

    .line 245
    const/4 v6, 0x3

    .line 246
    const/16 v7, 0x50

    .line 247
    .line 248
    const/16 v9, 0x30

    .line 249
    .line 250
    if-eqz v4, :cond_a

    .line 251
    .line 252
    invoke-virtual {v11}, Landroid/graphics/Rect;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-nez v4, :cond_a

    .line 257
    .line 258
    iget v4, v8, Ls/d;->f:I

    .line 259
    .line 260
    invoke-static {v4, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    and-int/lit8 v12, v4, 0x70

    .line 265
    .line 266
    if-eq v12, v9, :cond_7

    .line 267
    .line 268
    if-eq v12, v7, :cond_6

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_6
    iget v12, v10, Landroid/graphics/Rect;->bottom:I

    .line 272
    .line 273
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    iget v3, v11, Landroid/graphics/Rect;->top:I

    .line 278
    .line 279
    sub-int/2addr v13, v3

    .line 280
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    iput v3, v10, Landroid/graphics/Rect;->bottom:I

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_7
    iget v3, v10, Landroid/graphics/Rect;->top:I

    .line 288
    .line 289
    iget v12, v11, Landroid/graphics/Rect;->bottom:I

    .line 290
    .line 291
    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    iput v3, v10, Landroid/graphics/Rect;->top:I

    .line 296
    .line 297
    :goto_3
    and-int/lit8 v3, v4, 0x7

    .line 298
    .line 299
    if-eq v3, v6, :cond_9

    .line 300
    .line 301
    if-eq v3, v5, :cond_8

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_8
    iget v3, v10, Landroid/graphics/Rect;->right:I

    .line 305
    .line 306
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    iget v12, v11, Landroid/graphics/Rect;->left:I

    .line 311
    .line 312
    sub-int/2addr v4, v12

    .line 313
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    iput v3, v10, Landroid/graphics/Rect;->right:I

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_9
    iget v3, v10, Landroid/graphics/Rect;->left:I

    .line 321
    .line 322
    iget v4, v11, Landroid/graphics/Rect;->right:I

    .line 323
    .line 324
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    iput v3, v10, Landroid/graphics/Rect;->left:I

    .line 329
    .line 330
    :cond_a
    :goto_4
    iget v3, v8, Ls/d;->g:I

    .line 331
    .line 332
    if-eqz v3, :cond_14

    .line 333
    .line 334
    invoke-virtual {v14}, Landroid/view/View;->getVisibility()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    if-nez v3, :cond_14

    .line 339
    .line 340
    invoke-virtual {v14}, Landroid/view/View;->isLaidOut()Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-nez v3, :cond_b

    .line 345
    .line 346
    goto/16 :goto_8

    .line 347
    .line 348
    :cond_b
    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-lez v3, :cond_14

    .line 353
    .line 354
    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-gtz v3, :cond_c

    .line 359
    .line 360
    goto/16 :goto_8

    .line 361
    .line 362
    :cond_c
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    check-cast v3, Ls/d;

    .line 367
    .line 368
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    .line 380
    .line 381
    .line 382
    move-result v12

    .line 383
    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    .line 384
    .line 385
    .line 386
    move-result v13

    .line 387
    invoke-virtual {v14}, Landroid/view/View;->getRight()I

    .line 388
    .line 389
    .line 390
    move-result v5

    .line 391
    invoke-virtual {v14}, Landroid/view/View;->getBottom()I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    invoke-virtual {v8, v12, v13, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v8}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8}, Landroid/graphics/Rect;->setEmpty()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v15, v8}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    invoke-virtual {v4}, Landroid/graphics/Rect;->isEmpty()Z

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    if-eqz v5, :cond_d

    .line 412
    .line 413
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v15, v4}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto/16 :goto_8

    .line 420
    .line 421
    :cond_d
    iget v5, v3, Ls/d;->g:I

    .line 422
    .line 423
    invoke-static {v5, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 424
    .line 425
    .line 426
    move-result v5

    .line 427
    and-int/lit8 v6, v5, 0x30

    .line 428
    .line 429
    if-ne v6, v9, :cond_e

    .line 430
    .line 431
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 432
    .line 433
    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 434
    .line 435
    sub-int/2addr v6, v8

    .line 436
    iget v8, v3, Ls/d;->i:I

    .line 437
    .line 438
    sub-int/2addr v6, v8

    .line 439
    iget v8, v10, Landroid/graphics/Rect;->top:I

    .line 440
    .line 441
    if-ge v6, v8, :cond_e

    .line 442
    .line 443
    sub-int/2addr v8, v6

    .line 444
    invoke-static {v14, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t(Landroid/view/View;I)V

    .line 445
    .line 446
    .line 447
    const/4 v6, 0x1

    .line 448
    goto :goto_5

    .line 449
    :cond_e
    const/4 v6, 0x0

    .line 450
    :goto_5
    and-int/lit8 v8, v5, 0x50

    .line 451
    .line 452
    if-ne v8, v7, :cond_f

    .line 453
    .line 454
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 455
    .line 456
    .line 457
    move-result v7

    .line 458
    iget v8, v4, Landroid/graphics/Rect;->bottom:I

    .line 459
    .line 460
    sub-int/2addr v7, v8

    .line 461
    iget v8, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 462
    .line 463
    sub-int/2addr v7, v8

    .line 464
    iget v8, v3, Ls/d;->i:I

    .line 465
    .line 466
    add-int/2addr v7, v8

    .line 467
    iget v8, v10, Landroid/graphics/Rect;->bottom:I

    .line 468
    .line 469
    if-ge v7, v8, :cond_f

    .line 470
    .line 471
    sub-int/2addr v7, v8

    .line 472
    invoke-static {v14, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t(Landroid/view/View;I)V

    .line 473
    .line 474
    .line 475
    const/4 v6, 0x1

    .line 476
    :cond_f
    if-nez v6, :cond_10

    .line 477
    .line 478
    const/4 v6, 0x0

    .line 479
    invoke-static {v14, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t(Landroid/view/View;I)V

    .line 480
    .line 481
    .line 482
    :cond_10
    and-int/lit8 v6, v5, 0x3

    .line 483
    .line 484
    const/4 v7, 0x3

    .line 485
    if-ne v6, v7, :cond_11

    .line 486
    .line 487
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 488
    .line 489
    iget v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 490
    .line 491
    sub-int/2addr v6, v7

    .line 492
    iget v7, v3, Ls/d;->h:I

    .line 493
    .line 494
    sub-int/2addr v6, v7

    .line 495
    iget v7, v10, Landroid/graphics/Rect;->left:I

    .line 496
    .line 497
    if-ge v6, v7, :cond_11

    .line 498
    .line 499
    sub-int/2addr v7, v6

    .line 500
    invoke-static {v14, v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->s(Landroid/view/View;I)V

    .line 501
    .line 502
    .line 503
    const/4 v6, 0x1

    .line 504
    goto :goto_6

    .line 505
    :cond_11
    const/4 v6, 0x0

    .line 506
    :goto_6
    and-int/lit8 v5, v5, 0x5

    .line 507
    .line 508
    const/4 v7, 0x5

    .line 509
    if-ne v5, v7, :cond_12

    .line 510
    .line 511
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    iget v7, v4, Landroid/graphics/Rect;->right:I

    .line 516
    .line 517
    sub-int/2addr v5, v7

    .line 518
    iget v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 519
    .line 520
    sub-int/2addr v5, v7

    .line 521
    iget v3, v3, Ls/d;->h:I

    .line 522
    .line 523
    add-int/2addr v5, v3

    .line 524
    iget v3, v10, Landroid/graphics/Rect;->right:I

    .line 525
    .line 526
    if-ge v5, v3, :cond_12

    .line 527
    .line 528
    sub-int/2addr v5, v3

    .line 529
    invoke-static {v14, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->s(Landroid/view/View;I)V

    .line 530
    .line 531
    .line 532
    const/4 v3, 0x1

    .line 533
    goto :goto_7

    .line 534
    :cond_12
    move v3, v6

    .line 535
    :goto_7
    const/4 v6, 0x0

    .line 536
    if-nez v3, :cond_13

    .line 537
    .line 538
    invoke-static {v14, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->s(Landroid/view/View;I)V

    .line 539
    .line 540
    .line 541
    :cond_13
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v15, v4}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    goto :goto_9

    .line 548
    :cond_14
    :goto_8
    const/4 v6, 0x0

    .line 549
    :goto_9
    const/4 v3, 0x2

    .line 550
    if-eq v1, v3, :cond_16

    .line 551
    .line 552
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    check-cast v3, Ls/d;

    .line 557
    .line 558
    iget-object v3, v3, Ls/d;->l:Landroid/graphics/Rect;

    .line 559
    .line 560
    move-object/from16 v4, v20

    .line 561
    .line 562
    invoke-virtual {v4, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v4, v11}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-eqz v3, :cond_15

    .line 570
    .line 571
    move-object/from16 v5, v16

    .line 572
    .line 573
    move/from16 v3, v18

    .line 574
    .line 575
    goto :goto_c

    .line 576
    :cond_15
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    check-cast v3, Ls/d;

    .line 581
    .line 582
    iget-object v3, v3, Ls/d;->l:Landroid/graphics/Rect;

    .line 583
    .line 584
    invoke-virtual {v3, v11}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 585
    .line 586
    .line 587
    goto :goto_a

    .line 588
    :cond_16
    move-object/from16 v4, v20

    .line 589
    .line 590
    :goto_a
    add-int/lit8 v14, v19, 0x1

    .line 591
    .line 592
    move/from16 v3, v18

    .line 593
    .line 594
    :goto_b
    move-object/from16 v5, v16

    .line 595
    .line 596
    if-ge v14, v3, :cond_17

    .line 597
    .line 598
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v7

    .line 602
    check-cast v7, Landroid/view/View;

    .line 603
    .line 604
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    check-cast v7, Ls/d;

    .line 609
    .line 610
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    add-int/lit8 v14, v14, 0x1

    .line 614
    .line 615
    goto :goto_b

    .line 616
    :cond_17
    :goto_c
    add-int/lit8 v14, v19, 0x1

    .line 617
    .line 618
    move v9, v3

    .line 619
    move-object v12, v4

    .line 620
    move-object v8, v5

    .line 621
    goto/16 :goto_0

    .line 622
    .line 623
    :cond_18
    move-object v4, v12

    .line 624
    invoke-virtual {v10}, Landroid/graphics/Rect;->setEmpty()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v15, v10}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    invoke-virtual {v11}, Landroid/graphics/Rect;->setEmpty()V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v15, v11}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 634
    .line 635
    .line 636
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v15, v4}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ls/e;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ls/e;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-static {p0}, Lf0/i0;->c(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->m:Z

    .line 48
    .line 49
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Landroid/view/View;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->e(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-boolean v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->m:Z

    .line 33
    .line 34
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->s:Z

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lf0/q1;->d()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    if-lez v0, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eq v0, p1, :cond_2

    .line 16
    .line 17
    const/4 p1, 0x3

    .line 18
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v1

    .line 22
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r()V

    .line 23
    .line 24
    .line 25
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 p3, 0x0

    .line 12
    move p4, p3

    .line 13
    :goto_0
    if-ge p4, p2, :cond_e

    .line 14
    .line 15
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p5

    .line 19
    check-cast p5, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ls/d;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ls/d;

    .line 45
    .line 46
    iget-object v2, v1, Ls/d;->j:Landroid/view/View;

    .line 47
    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    iget v3, v1, Ls/d;->e:I

    .line 51
    .line 52
    const/4 v4, -0x1

    .line 53
    if-ne v3, v4, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    :goto_1
    sget-object v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->B:Le0/c;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v3, v2

    .line 73
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :try_start_0
    invoke-virtual {p0, v3, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->j(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    check-cast v3, Ls/d;

    .line 85
    .line 86
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-static/range {v0 .. v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->k(ILandroid/graphics/Rect;Landroid/graphics/Rect;Ls/d;II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v3, v2, v4, v5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->h(Ls/d;Landroid/graphics/Rect;II)V

    .line 98
    .line 99
    .line 100
    iget v3, v2, Landroid/graphics/Rect;->left:I

    .line 101
    .line 102
    iget v4, v2, Landroid/graphics/Rect;->top:I

    .line 103
    .line 104
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 105
    .line 106
    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 107
    .line 108
    invoke-virtual {p5, v3, v4, v5, v7}, Landroid/view/View;->layout(IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v1}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v6, v2}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :catchall_0
    move-exception v0

    .line 126
    move-object p1, v0

    .line 127
    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v1}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroid/graphics/Rect;->setEmpty()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v2}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_3
    iget v1, v1, Ls/d;->d:I

    .line 141
    .line 142
    if-ltz v1, :cond_a

    .line 143
    .line 144
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Ls/d;

    .line 149
    .line 150
    iget v3, v2, Ls/d;->b:I

    .line 151
    .line 152
    if-nez v3, :cond_4

    .line 153
    .line 154
    const v3, 0x800035

    .line 155
    .line 156
    .line 157
    :cond_4
    invoke-static {v3, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    and-int/lit8 v4, v3, 0x7

    .line 162
    .line 163
    and-int/lit8 v3, v3, 0x70

    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 178
    .line 179
    .line 180
    move-result v8

    .line 181
    const/4 v9, 0x1

    .line 182
    if-ne v0, v9, :cond_5

    .line 183
    .line 184
    sub-int v1, v5, v1

    .line 185
    .line 186
    :cond_5
    invoke-virtual {p0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->l(I)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    sub-int/2addr v1, v7

    .line 191
    if-eq v4, v9, :cond_7

    .line 192
    .line 193
    const/4 v9, 0x5

    .line 194
    if-eq v4, v9, :cond_6

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_6
    add-int/2addr v1, v7

    .line 198
    goto :goto_2

    .line 199
    :cond_7
    div-int/lit8 v4, v7, 0x2

    .line 200
    .line 201
    add-int/2addr v1, v4

    .line 202
    :goto_2
    const/16 v4, 0x10

    .line 203
    .line 204
    if-eq v3, v4, :cond_9

    .line 205
    .line 206
    const/16 v4, 0x50

    .line 207
    .line 208
    if-eq v3, v4, :cond_8

    .line 209
    .line 210
    move v3, p3

    .line 211
    goto :goto_3

    .line 212
    :cond_8
    move v3, v8

    .line 213
    goto :goto_3

    .line 214
    :cond_9
    div-int/lit8 v3, v8, 0x2

    .line 215
    .line 216
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 221
    .line 222
    add-int/2addr v4, v9

    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    sub-int/2addr v5, v9

    .line 228
    sub-int/2addr v5, v7

    .line 229
    iget v9, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 230
    .line 231
    sub-int/2addr v5, v9

    .line 232
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 245
    .line 246
    add-int/2addr v4, v5

    .line 247
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    sub-int/2addr v6, v5

    .line 252
    sub-int/2addr v6, v8

    .line 253
    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 254
    .line 255
    sub-int/2addr v6, v2

    .line 256
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    add-int/2addr v7, v1

    .line 265
    add-int/2addr v8, v2

    .line 266
    invoke-virtual {p5, v1, v2, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_4

    .line 270
    .line 271
    :cond_a
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    check-cast v1, Ls/d;

    .line 276
    .line 277
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 286
    .line 287
    add-int/2addr v2, v4

    .line 288
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 293
    .line 294
    add-int/2addr v4, v5

    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 300
    .line 301
    .line 302
    move-result v7

    .line 303
    sub-int/2addr v5, v7

    .line 304
    iget v7, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 305
    .line 306
    sub-int/2addr v5, v7

    .line 307
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    sub-int/2addr v7, v8

    .line 316
    iget v8, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 317
    .line 318
    sub-int/2addr v7, v8

    .line 319
    invoke-virtual {v3, v2, v4, v5, v7}, Landroid/graphics/Rect;->set(IIII)V

    .line 320
    .line 321
    .line 322
    iget-object v2, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 323
    .line 324
    if-eqz v2, :cond_b

    .line 325
    .line 326
    sget-object v2, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 327
    .line 328
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_b

    .line 333
    .line 334
    invoke-virtual {p5}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-nez v2, :cond_b

    .line 339
    .line 340
    iget v2, v3, Landroid/graphics/Rect;->left:I

    .line 341
    .line 342
    iget-object v4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 343
    .line 344
    invoke-virtual {v4}, Lf0/q1;->b()I

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    add-int/2addr v4, v2

    .line 349
    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 350
    .line 351
    iget v2, v3, Landroid/graphics/Rect;->top:I

    .line 352
    .line 353
    iget-object v4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 354
    .line 355
    invoke-virtual {v4}, Lf0/q1;->d()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    add-int/2addr v4, v2

    .line 360
    iput v4, v3, Landroid/graphics/Rect;->top:I

    .line 361
    .line 362
    iget v2, v3, Landroid/graphics/Rect;->right:I

    .line 363
    .line 364
    iget-object v4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 365
    .line 366
    invoke-virtual {v4}, Lf0/q1;->c()I

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    sub-int/2addr v2, v4

    .line 371
    iput v2, v3, Landroid/graphics/Rect;->right:I

    .line 372
    .line 373
    iget v2, v3, Landroid/graphics/Rect;->bottom:I

    .line 374
    .line 375
    iget-object v4, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 376
    .line 377
    invoke-virtual {v4}, Lf0/q1;->a()I

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    sub-int/2addr v2, v4

    .line 382
    iput v2, v3, Landroid/graphics/Rect;->bottom:I

    .line 383
    .line 384
    :cond_b
    invoke-static {}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g()Landroid/graphics/Rect;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    iget v1, v1, Ls/d;->b:I

    .line 389
    .line 390
    and-int/lit8 v2, v1, 0x7

    .line 391
    .line 392
    if-nez v2, :cond_c

    .line 393
    .line 394
    const v2, 0x800003

    .line 395
    .line 396
    .line 397
    or-int/2addr v1, v2

    .line 398
    :cond_c
    and-int/lit8 v2, v1, 0x70

    .line 399
    .line 400
    if-nez v2, :cond_d

    .line 401
    .line 402
    or-int/lit8 v1, v1, 0x30

    .line 403
    .line 404
    :cond_d
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    move v5, v0

    .line 409
    move v0, v1

    .line 410
    move v1, v2

    .line 411
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-static/range {v0 .. v5}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 416
    .line 417
    .line 418
    move v0, v5

    .line 419
    iget v1, v4, Landroid/graphics/Rect;->left:I

    .line 420
    .line 421
    iget v2, v4, Landroid/graphics/Rect;->top:I

    .line 422
    .line 423
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 424
    .line 425
    iget v7, v4, Landroid/graphics/Rect;->bottom:I

    .line 426
    .line 427
    invoke-virtual {p5, v1, v2, v5, v7}, Landroid/view/View;->layout(IIII)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3}, Landroid/graphics/Rect;->setEmpty()V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v6, v3}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v6, v4}, Le0/c;->d(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    :goto_4
    add-int/lit8 p4, p4, 0x1

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :cond_e
    return-void
.end method

.method public final onMeasure(II)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v6, 0x0

    .line 11
    move v2, v6

    .line 12
    :goto_0
    const/4 v3, 0x1

    .line 13
    if-ge v2, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-object v5, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->h:Lr1/h;

    .line 20
    .line 21
    iget-object v5, v5, Lr1/h;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Lo/l;

    .line 24
    .line 25
    iget v7, v5, Lo/l;->i:I

    .line 26
    .line 27
    move v8, v6

    .line 28
    :goto_1
    if-ge v8, v7, :cond_1

    .line 29
    .line 30
    invoke-virtual {v5, v8}, Lo/l;->i(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    check-cast v9, Ljava/util/ArrayList;

    .line 35
    .line 36
    if-eqz v9, :cond_0

    .line 37
    .line 38
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_0

    .line 43
    .line 44
    move v1, v3

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    move v1, v6

    .line 53
    :goto_2
    iget-boolean v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Z

    .line 54
    .line 55
    if-eq v1, v2, :cond_7

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->m:Z

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    new-instance v1, Ls/e;

    .line 68
    .line 69
    invoke-direct {v1, v0}, Ls/e;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V

    .line 70
    .line 71
    .line 72
    iput-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    iput-boolean v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Z

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    iget-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->m:Z

    .line 87
    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 91
    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Ls/e;

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 101
    .line 102
    .line 103
    :cond_6
    iput-boolean v6, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q:Z

    .line 104
    .line 105
    :cond_7
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 106
    .line 107
    .line 108
    move-result v7

    .line 109
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-ne v9, v3, :cond_8

    .line 126
    .line 127
    move v10, v3

    .line 128
    goto :goto_4

    .line 129
    :cond_8
    move v10, v6

    .line 130
    :goto_4
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    add-int v15, v7, v8

    .line 147
    .line 148
    add-int v16, v1, v2

    .line 149
    .line 150
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getSuggestedMinimumWidth()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->getSuggestedMinimumHeight()I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    iget-object v4, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 159
    .line 160
    if-eqz v4, :cond_9

    .line 161
    .line 162
    sget-object v4, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 163
    .line 164
    invoke-virtual {v0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_9

    .line 169
    .line 170
    move/from16 v17, v3

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_9
    move/from16 v17, v6

    .line 174
    .line 175
    :goto_5
    iget-object v3, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g:Ljava/util/ArrayList;

    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    move v5, v6

    .line 182
    move/from16 v18, v5

    .line 183
    .line 184
    :goto_6
    if-ge v5, v4, :cond_14

    .line 185
    .line 186
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v19

    .line 190
    check-cast v19, Landroid/view/View;

    .line 191
    .line 192
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getVisibility()I

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    move/from16 v21, v1

    .line 197
    .line 198
    const/16 v1, 0x8

    .line 199
    .line 200
    if-ne v6, v1, :cond_a

    .line 201
    .line 202
    move-object/from16 v22, v3

    .line 203
    .line 204
    move/from16 v19, v4

    .line 205
    .line 206
    move/from16 v24, v5

    .line 207
    .line 208
    move/from16 v20, v7

    .line 209
    .line 210
    move/from16 v1, v21

    .line 211
    .line 212
    const/16 v23, 0x0

    .line 213
    .line 214
    move/from16 v21, v8

    .line 215
    .line 216
    goto/16 :goto_d

    .line 217
    .line 218
    :cond_a
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    move-object v6, v1

    .line 223
    check-cast v6, Ls/d;

    .line 224
    .line 225
    iget v1, v6, Ls/d;->d:I

    .line 226
    .line 227
    if-ltz v1, :cond_12

    .line 228
    .line 229
    if-eqz v11, :cond_12

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->l(I)I

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    move/from16 v22, v1

    .line 236
    .line 237
    iget v1, v6, Ls/d;->b:I

    .line 238
    .line 239
    if-nez v1, :cond_b

    .line 240
    .line 241
    const v1, 0x800035

    .line 242
    .line 243
    .line 244
    :cond_b
    invoke-static {v1, v9}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    and-int/lit8 v1, v1, 0x7

    .line 249
    .line 250
    move/from16 v23, v2

    .line 251
    .line 252
    const/4 v2, 0x3

    .line 253
    if-ne v1, v2, :cond_c

    .line 254
    .line 255
    if-eqz v10, :cond_d

    .line 256
    .line 257
    :cond_c
    const/4 v2, 0x5

    .line 258
    if-ne v1, v2, :cond_e

    .line 259
    .line 260
    if-eqz v10, :cond_e

    .line 261
    .line 262
    :cond_d
    sub-int v1, v12, v8

    .line 263
    .line 264
    sub-int v1, v1, v22

    .line 265
    .line 266
    const/4 v2, 0x0

    .line 267
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    :goto_7
    move-object/from16 v25, v3

    .line 272
    .line 273
    move v3, v1

    .line 274
    move-object/from16 v1, v25

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_e
    if-ne v1, v2, :cond_f

    .line 278
    .line 279
    if-eqz v10, :cond_10

    .line 280
    .line 281
    :cond_f
    const/4 v2, 0x3

    .line 282
    if-ne v1, v2, :cond_11

    .line 283
    .line 284
    if-eqz v10, :cond_11

    .line 285
    .line 286
    :cond_10
    sub-int v1, v22, v7

    .line 287
    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    goto :goto_7

    .line 294
    :cond_11
    :goto_8
    const/4 v2, 0x0

    .line 295
    goto :goto_9

    .line 296
    :cond_12
    move/from16 v23, v2

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :goto_9
    move-object v1, v3

    .line 300
    move v3, v2

    .line 301
    :goto_a
    if-eqz v17, :cond_13

    .line 302
    .line 303
    sget-object v20, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 304
    .line 305
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 306
    .line 307
    .line 308
    move-result v20

    .line 309
    if-nez v20, :cond_13

    .line 310
    .line 311
    iget-object v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 312
    .line 313
    invoke-virtual {v2}, Lf0/q1;->b()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    move-object/from16 v22, v1

    .line 318
    .line 319
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 320
    .line 321
    invoke-virtual {v1}, Lf0/q1;->c()I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    add-int/2addr v1, v2

    .line 326
    iget-object v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 327
    .line 328
    invoke-virtual {v2}, Lf0/q1;->d()I

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    move/from16 v24, v1

    .line 333
    .line 334
    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r:Lf0/q1;

    .line 335
    .line 336
    invoke-virtual {v1}, Lf0/q1;->a()I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    add-int/2addr v1, v2

    .line 341
    sub-int v2, v12, v24

    .line 342
    .line 343
    invoke-static {v2, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    sub-int v1, v14, v1

    .line 348
    .line 349
    invoke-static {v1, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    :goto_b
    move/from16 v24, v5

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_13
    move-object/from16 v22, v1

    .line 357
    .line 358
    move/from16 v2, p1

    .line 359
    .line 360
    move/from16 v1, p2

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :goto_c
    const/4 v5, 0x0

    .line 364
    move/from16 v20, v4

    .line 365
    .line 366
    move v4, v1

    .line 367
    move-object/from16 v1, v19

    .line 368
    .line 369
    move/from16 v19, v20

    .line 370
    .line 371
    move/from16 v20, v7

    .line 372
    .line 373
    move/from16 v7, v21

    .line 374
    .line 375
    move/from16 v21, v8

    .line 376
    .line 377
    move/from16 v8, v23

    .line 378
    .line 379
    const/16 v23, 0x0

    .line 380
    .line 381
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    add-int/2addr v2, v15

    .line 389
    iget v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 390
    .line 391
    add-int/2addr v2, v3

    .line 392
    iget v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 393
    .line 394
    add-int/2addr v2, v3

    .line 395
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 400
    .line 401
    .line 402
    move-result v3

    .line 403
    add-int v3, v3, v16

    .line 404
    .line 405
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 406
    .line 407
    add-int/2addr v3, v4

    .line 408
    iget v4, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 409
    .line 410
    add-int/2addr v3, v4

    .line 411
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    move/from16 v6, v18

    .line 420
    .line 421
    invoke-static {v6, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 422
    .line 423
    .line 424
    move-result v18

    .line 425
    move v1, v2

    .line 426
    move v2, v3

    .line 427
    :goto_d
    add-int/lit8 v5, v24, 0x1

    .line 428
    .line 429
    move/from16 v4, v19

    .line 430
    .line 431
    move/from16 v7, v20

    .line 432
    .line 433
    move/from16 v8, v21

    .line 434
    .line 435
    move-object/from16 v3, v22

    .line 436
    .line 437
    move/from16 v6, v23

    .line 438
    .line 439
    goto/16 :goto_6

    .line 440
    .line 441
    :cond_14
    move v7, v1

    .line 442
    move v8, v2

    .line 443
    move/from16 v6, v18

    .line 444
    .line 445
    const/high16 v1, -0x1000000

    .line 446
    .line 447
    and-int/2addr v1, v6

    .line 448
    move/from16 v2, p1

    .line 449
    .line 450
    invoke-static {v7, v2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    shl-int/lit8 v2, v6, 0x10

    .line 455
    .line 456
    move/from16 v3, p2

    .line 457
    .line 458
    invoke-static {v8, v3, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 463
    .line 464
    .line 465
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    move p3, p2

    .line 7
    :goto_0
    if-ge p3, p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    check-cast p4, Ls/d;

    .line 27
    .line 28
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return p2
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p2, 0x0

    .line 6
    move p3, p2

    .line 7
    :goto_0
    if-ge p3, p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x8

    .line 18
    .line 19
    if-ne v1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ls/d;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_1
    add-int/lit8 p3, p3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return p2
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p4, p2, p3, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->f([IIII)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 7

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-virtual/range {v0 .. v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->b(Landroid/view/View;IIIII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->d(Landroid/view/View;Landroid/view/View;II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    instance-of v0, p1, Ls/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Ls/f;

    .line 10
    .line 11
    iget-object p1, p1, Lj0/c;->g:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-ge v0, p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->m(Landroid/view/View;)Ls/d;

    .line 31
    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 1
    new-instance v0, Ls/f;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lj0/c;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    if-ge v3, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ls/d;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iput-object v1, v0, Ls/f;->i:Landroid/util/SparseArray;

    .line 42
    .line 43
    return-object v0
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->c(Landroid/view/View;Landroid/view/View;II)Z

    .line 3
    .line 4
    .line 5
    return v0
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->e(Landroid/view/View;I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p(Landroid/view/MotionEvent;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return p1

    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r()V

    .line 21
    .line 22
    .line 23
    return p1
.end method

.method public final p(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isChildrenDrawingOrderEnabled()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v2, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v2, :cond_1

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v3, v2

    .line 29
    :goto_1
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->A:Lc3/c0;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const/4 v1, 0x0

    .line 51
    :goto_2
    if-ge v1, v0, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ls/d;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final q()V
    .locals 15

    .line 1
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->h:Lr1/h;

    .line 7
    .line 8
    iget-object v2, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lo/l;

    .line 11
    .line 12
    iget-object v3, v1, Lr1/h;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lc0/j;

    .line 15
    .line 16
    iget-object v4, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Lo/l;

    .line 19
    .line 20
    iget v5, v2, Lo/l;->i:I

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    move v7, v6

    .line 24
    :goto_0
    if-ge v7, v5, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2, v7}, Lo/l;->i(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    check-cast v8, Ljava/util/ArrayList;

    .line 31
    .line 32
    if-eqz v8, :cond_0

    .line 33
    .line 34
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v8}, Lc0/j;->d(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2}, Lo/l;->clear()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    move v5, v6

    .line 51
    :goto_1
    if-ge v5, v2, :cond_1a

    .line 52
    .line 53
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v7}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->m(Landroid/view/View;)Ls/d;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    iget v9, v8, Ls/d;->e:I

    .line 62
    .line 63
    const/4 v10, -0x1

    .line 64
    const/4 v11, 0x0

    .line 65
    if-ne v9, v10, :cond_2

    .line 66
    .line 67
    iput-object v11, v8, Ls/d;->k:Landroid/view/View;

    .line 68
    .line 69
    iput-object v11, v8, Ls/d;->j:Landroid/view/View;

    .line 70
    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_2
    iget-object v10, v8, Ls/d;->j:Landroid/view/View;

    .line 74
    .line 75
    if-eqz v10, :cond_8

    .line 76
    .line 77
    invoke-virtual {v10}, Landroid/view/View;->getId()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eq v10, v9, :cond_3

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_3
    iget-object v10, v8, Ls/d;->j:Landroid/view/View;

    .line 85
    .line 86
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    :goto_2
    if-eq v12, p0, :cond_7

    .line 91
    .line 92
    if-eqz v12, :cond_6

    .line 93
    .line 94
    if-ne v12, v7, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    instance-of v13, v12, Landroid/view/View;

    .line 98
    .line 99
    if-eqz v13, :cond_5

    .line 100
    .line 101
    move-object v10, v12

    .line 102
    check-cast v10, Landroid/view/View;

    .line 103
    .line 104
    :cond_5
    invoke-interface {v12}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    goto :goto_2

    .line 109
    :cond_6
    :goto_3
    iput-object v11, v8, Ls/d;->k:Landroid/view/View;

    .line 110
    .line 111
    iput-object v11, v8, Ls/d;->j:Landroid/view/View;

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    iput-object v10, v8, Ls/d;->k:Landroid/view/View;

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    :goto_4
    invoke-virtual {p0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    iput-object v10, v8, Ls/d;->j:Landroid/view/View;

    .line 122
    .line 123
    if-eqz v10, :cond_f

    .line 124
    .line 125
    if-ne v10, p0, :cond_a

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_9

    .line 132
    .line 133
    iput-object v11, v8, Ls/d;->k:Landroid/view/View;

    .line 134
    .line 135
    iput-object v11, v8, Ls/d;->j:Landroid/view/View;

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    const-string v1, "View can not be anchored to the the parent CoordinatorLayout"

    .line 141
    .line 142
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v0

    .line 146
    :cond_a
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    :goto_5
    if-eq v9, p0, :cond_e

    .line 151
    .line 152
    if-eqz v9, :cond_e

    .line 153
    .line 154
    if-ne v9, v7, :cond_c

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-eqz v9, :cond_b

    .line 161
    .line 162
    iput-object v11, v8, Ls/d;->k:Landroid/view/View;

    .line 163
    .line 164
    iput-object v11, v8, Ls/d;->j:Landroid/view/View;

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    const-string v1, "Anchor must not be a descendant of the anchored view"

    .line 170
    .line 171
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw v0

    .line 175
    :cond_c
    instance-of v12, v9, Landroid/view/View;

    .line 176
    .line 177
    if-eqz v12, :cond_d

    .line 178
    .line 179
    move-object v10, v9

    .line 180
    check-cast v10, Landroid/view/View;

    .line 181
    .line 182
    :cond_d
    invoke-interface {v9}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    goto :goto_5

    .line 187
    :cond_e
    iput-object v10, v8, Ls/d;->k:Landroid/view/View;

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-eqz v10, :cond_19

    .line 195
    .line 196
    iput-object v11, v8, Ls/d;->k:Landroid/view/View;

    .line 197
    .line 198
    iput-object v11, v8, Ls/d;->j:Landroid/view/View;

    .line 199
    .line 200
    :goto_6
    invoke-virtual {v4, v7}, Lo/l;->containsKey(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-nez v9, :cond_10

    .line 205
    .line 206
    invoke-virtual {v4, v7, v11}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_10
    move v9, v6

    .line 210
    :goto_7
    if-ge v9, v2, :cond_18

    .line 211
    .line 212
    if-ne v9, v5, :cond_11

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_11
    invoke-virtual {p0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    iget-object v12, v8, Ls/d;->k:Landroid/view/View;

    .line 220
    .line 221
    if-eq v10, v12, :cond_12

    .line 222
    .line 223
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    check-cast v13, Ls/d;

    .line 232
    .line 233
    iget v13, v13, Ls/d;->f:I

    .line 234
    .line 235
    invoke-static {v13, v12}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-eqz v13, :cond_16

    .line 240
    .line 241
    iget v14, v8, Ls/d;->g:I

    .line 242
    .line 243
    invoke-static {v14, v12}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    and-int/2addr v12, v13

    .line 248
    if-ne v12, v13, :cond_16

    .line 249
    .line 250
    :cond_12
    invoke-virtual {v4, v10}, Lo/l;->containsKey(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v12

    .line 254
    if-nez v12, :cond_13

    .line 255
    .line 256
    invoke-virtual {v4, v10}, Lo/l;->containsKey(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v12

    .line 260
    if-nez v12, :cond_13

    .line 261
    .line 262
    invoke-virtual {v4, v10, v11}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    :cond_13
    invoke-virtual {v4, v10}, Lo/l;->containsKey(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    if-eqz v12, :cond_17

    .line 270
    .line 271
    invoke-virtual {v4, v7}, Lo/l;->containsKey(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v12

    .line 275
    if-eqz v12, :cond_17

    .line 276
    .line 277
    invoke-virtual {v4, v10}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    check-cast v12, Ljava/util/ArrayList;

    .line 282
    .line 283
    if-nez v12, :cond_15

    .line 284
    .line 285
    invoke-virtual {v3}, Lc0/j;->a()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    check-cast v12, Ljava/util/ArrayList;

    .line 290
    .line 291
    if-nez v12, :cond_14

    .line 292
    .line 293
    new-instance v12, Ljava/util/ArrayList;

    .line 294
    .line 295
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 296
    .line 297
    .line 298
    :cond_14
    invoke-virtual {v4, v10, v12}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    :cond_15
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_16
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 308
    .line 309
    const-string v1, "All nodes must be present in the graph before being added as an edge"

    .line 310
    .line 311
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :cond_18
    add-int/lit8 v5, v5, 0x1

    .line 316
    .line 317
    goto/16 :goto_1

    .line 318
    .line 319
    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 320
    .line 321
    new-instance v1, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v2, "Could not find CoordinatorLayout descendant view with id "

    .line 324
    .line 325
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-virtual {v2, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v2, " to anchor view "

    .line 340
    .line 341
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_1a
    iget-object v2, v1, Lr1/h;->i:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v2, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 360
    .line 361
    .line 362
    iget-object v3, v1, Lr1/h;->j:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v3, Ljava/util/HashSet;

    .line 365
    .line 366
    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    .line 367
    .line 368
    .line 369
    iget v5, v4, Lo/l;->i:I

    .line 370
    .line 371
    :goto_9
    if-ge v6, v5, :cond_1b

    .line 372
    .line 373
    invoke-virtual {v4, v6}, Lo/l;->f(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    invoke-virtual {v1, v7, v2, v3}, Lr1/h;->d(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 378
    .line 379
    .line 380
    add-int/lit8 v6, v6, 0x1

    .line 381
    .line 382
    goto :goto_9

    .line 383
    :cond_1b
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 384
    .line 385
    .line 386
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 387
    .line 388
    .line 389
    return-void
.end method

.method public final r()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ls/d;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput-boolean v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->l:Z

    .line 26
    .line 27
    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ls/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->l:Z

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ls/d;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->r()V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    iput-boolean p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->l:Z

    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public setFitsSystemWindows(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->u()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->u:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 2
    .line 3
    return-void
.end method

.method public setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_5

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_1
    iput-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v1, 0x0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    move v0, v1

    .line 57
    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 63
    .line 64
    .line 65
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 66
    .line 67
    .line 68
    :cond_5
    return-void
.end method

.method public setStatusBarBackgroundColor(I)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setStatusBarBackgroundResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lv/a;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p1, v0

    .line 10
    :goto_0
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eq v1, p1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    sget-object v0, Lf0/r0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->v:Lk1/j;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lk1/j;

    .line 14
    .line 15
    const/16 v1, 0x14

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lk1/j;-><init>(Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->v:Lk1/j;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->v:Lk1/j;

    .line 23
    .line 24
    invoke-static {p0, v0}, Lf0/k0;->i(Landroid/view/View;Lf0/t;)V

    .line 25
    .line 26
    .line 27
    const/16 v0, 0x500

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    invoke-static {p0, v0}, Lf0/k0;->i(Landroid/view/View;Lf0/t;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->t:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1

    .line 14
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 15
    return p1
.end method
