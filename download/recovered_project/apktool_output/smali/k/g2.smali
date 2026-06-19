.class public abstract Lk/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/d0;


# static fields
.field public static final F:Ljava/lang/reflect/Method;

.field public static final G:Ljava/lang/reflect/Method;


# instance fields
.field public final A:Landroid/os/Handler;

.field public final B:Landroid/graphics/Rect;

.field public C:Landroid/graphics/Rect;

.field public D:Z

.field public final E:Lk/c0;

.field public final g:Landroid/content/Context;

.field public h:Landroid/widget/ListAdapter;

.field public i:Lk/t1;

.field public final j:I

.field public k:I

.field public l:I

.field public m:I

.field public final n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public final s:I

.field public t:Lk/d2;

.field public u:Landroid/view/View;

.field public v:Landroid/widget/AdapterView$OnItemClickListener;

.field public final w:Lk/c2;

.field public final x:Lk/f2;

.field public final y:Lk/e2;

.field public final z:Lk/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "ListPopupWindow"

    .line 2
    .line 3
    const-class v1, Landroid/widget/PopupWindow;

    .line 4
    .line 5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v3, 0x1c

    .line 8
    .line 9
    if-gt v2, v3, :cond_0

    .line 10
    .line 11
    :try_start_0
    const-string v2, "setClipToScreenEnabled"

    .line 12
    .line 13
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, Lk/g2;->F:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    const-string v2, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 27
    .line 28
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :goto_0
    :try_start_1
    const-string v2, "setEpicenterBounds"

    .line 32
    .line 33
    const-class v3, Landroid/graphics/Rect;

    .line 34
    .line 35
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lk/g2;->G:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_1
    const-string v1, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."

    .line 47
    .line 48
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x2

    .line 5
    iput v0, p0, Lk/g2;->j:I

    .line 6
    .line 7
    iput v0, p0, Lk/g2;->k:I

    .line 8
    .line 9
    const/16 v0, 0x3ea

    .line 10
    .line 11
    iput v0, p0, Lk/g2;->n:I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lk/g2;->r:I

    .line 15
    .line 16
    const v1, 0x7fffffff

    .line 17
    .line 18
    .line 19
    iput v1, p0, Lk/g2;->s:I

    .line 20
    .line 21
    new-instance v1, Lk/c2;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, Lk/c2;-><init>(Lk/g2;I)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lk/g2;->w:Lk/c2;

    .line 28
    .line 29
    new-instance v1, Lk/f2;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lk/f2;-><init>(Lk/g2;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lk/g2;->x:Lk/f2;

    .line 35
    .line 36
    new-instance v1, Lk/e2;

    .line 37
    .line 38
    invoke-direct {v1, p0}, Lk/e2;-><init>(Lk/g2;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lk/g2;->y:Lk/e2;

    .line 42
    .line 43
    new-instance v1, Lk/c2;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v1, p0, v2}, Lk/c2;-><init>(Lk/g2;I)V

    .line 47
    .line 48
    .line 49
    iput-object v1, p0, Lk/g2;->z:Lk/c2;

    .line 50
    .line 51
    new-instance v1, Landroid/graphics/Rect;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lk/g2;->B:Landroid/graphics/Rect;

    .line 57
    .line 58
    iput-object p1, p0, Lk/g2;->g:Landroid/content/Context;

    .line 59
    .line 60
    new-instance v1, Landroid/os/Handler;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lk/g2;->A:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v1, Lf/a;->o:[I

    .line 72
    .line 73
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iput v2, p0, Lk/g2;->l:I

    .line 82
    .line 83
    const/4 v2, 0x1

    .line 84
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    iput v3, p0, Lk/g2;->m:I

    .line 89
    .line 90
    if-eqz v3, :cond_0

    .line 91
    .line 92
    iput-boolean v2, p0, Lk/g2;->o:Z

    .line 93
    .line 94
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lk/c0;

    .line 98
    .line 99
    invoke-direct {v1, p1, p2, p3, v0}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 100
    .line 101
    .line 102
    sget-object v3, Lf/a;->s:[I

    .line 103
    .line 104
    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    const/4 p3, 0x2

    .line 109
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_1

    .line 114
    .line 115
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    invoke-virtual {v1, p3}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-eqz p3, :cond_2

    .line 127
    .line 128
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    if-eqz p3, :cond_2

    .line 133
    .line 134
    invoke-static {p1, p3}, Lb3/g;->t(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 147
    .line 148
    .line 149
    iput-object v1, p0, Lk/g2;->E:Lk/c0;

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 152
    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g2;->E:Lk/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lk/g2;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk/g2;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/g2;->E:Lk/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lk/g2;->i:Lk/t1;

    .line 11
    .line 12
    iget-object v0, p0, Lk/g2;->A:Landroid/os/Handler;

    .line 13
    .line 14
    iget-object v1, p0, Lk/g2;->w:Lk/c2;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final f()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g2;->E:Lk/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final g()V
    .locals 13

    .line 1
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 2
    .line 3
    iget-object v1, p0, Lk/g2;->g:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lk/g2;->E:Lk/c0;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lk/g2;->D:Z

    .line 11
    .line 12
    xor-int/2addr v0, v2

    .line 13
    invoke-virtual {p0, v1, v0}, Lk/g2;->q(Landroid/content/Context;Z)Lk/t1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 18
    .line 19
    iget-object v4, p0, Lk/g2;->h:Landroid/widget/ListAdapter;

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 25
    .line 26
    iget-object v4, p0, Lk/g2;->v:Landroid/widget/AdapterView$OnItemClickListener;

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 42
    .line 43
    new-instance v4, Lk/z1;

    .line 44
    .line 45
    invoke-direct {v4, p0}, Lk/z1;-><init>(Lk/g2;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 52
    .line 53
    iget-object v4, p0, Lk/g2;->y:Lk/e2;

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Landroid/view/ViewGroup;

    .line 69
    .line 70
    :goto_0
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v4, p0, Lk/g2;->B:Landroid/graphics/Rect;

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 80
    .line 81
    .line 82
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 83
    .line 84
    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    .line 85
    .line 86
    add-int/2addr v6, v0

    .line 87
    iget-boolean v7, p0, Lk/g2;->o:Z

    .line 88
    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    neg-int v0, v0

    .line 92
    iput v0, p0, Lk/g2;->m:I

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 96
    .line 97
    .line 98
    move v6, v5

    .line 99
    :cond_2
    :goto_1
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v7, 0x2

    .line 104
    if-ne v0, v7, :cond_3

    .line 105
    .line 106
    move v0, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    move v0, v5

    .line 109
    :goto_2
    iget-object v8, p0, Lk/g2;->u:Landroid/view/View;

    .line 110
    .line 111
    iget v9, p0, Lk/g2;->m:I

    .line 112
    .line 113
    invoke-static {v3, v8, v9, v0}, Lk/a2;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget v8, p0, Lk/g2;->j:I

    .line 118
    .line 119
    const/4 v9, -0x2

    .line 120
    const/4 v10, -0x1

    .line 121
    if-ne v8, v10, :cond_4

    .line 122
    .line 123
    add-int/2addr v0, v6

    .line 124
    goto :goto_5

    .line 125
    :cond_4
    iget v11, p0, Lk/g2;->k:I

    .line 126
    .line 127
    if-eq v11, v9, :cond_6

    .line 128
    .line 129
    const/high16 v12, 0x40000000    # 2.0f

    .line 130
    .line 131
    if-eq v11, v10, :cond_5

    .line 132
    .line 133
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 147
    .line 148
    iget v11, v4, Landroid/graphics/Rect;->left:I

    .line 149
    .line 150
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 151
    .line 152
    add-int/2addr v11, v4

    .line 153
    sub-int/2addr v1, v11

    .line 154
    invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 168
    .line 169
    iget v11, v4, Landroid/graphics/Rect;->left:I

    .line 170
    .line 171
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 172
    .line 173
    add-int/2addr v11, v4

    .line 174
    sub-int/2addr v1, v11

    .line 175
    const/high16 v4, -0x80000000

    .line 176
    .line 177
    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    :goto_3
    iget-object v4, p0, Lk/g2;->i:Lk/t1;

    .line 182
    .line 183
    invoke-virtual {v4, v1, v0}, Lk/t1;->a(II)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-lez v0, :cond_7

    .line 188
    .line 189
    iget-object v1, p0, Lk/g2;->i:Lk/t1;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    iget-object v4, p0, Lk/g2;->i:Lk/t1;

    .line 196
    .line 197
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    add-int/2addr v4, v1

    .line 202
    add-int/2addr v4, v6

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move v4, v5

    .line 205
    :goto_4
    add-int/2addr v0, v4

    .line 206
    :goto_5
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-ne v1, v7, :cond_8

    .line 211
    .line 212
    move v1, v2

    .line 213
    goto :goto_6

    .line 214
    :cond_8
    move v1, v5

    .line 215
    :goto_6
    iget v4, p0, Lk/g2;->n:I

    .line 216
    .line 217
    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_14

    .line 225
    .line 226
    iget-object v4, p0, Lk/g2;->u:Landroid/view/View;

    .line 227
    .line 228
    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-nez v4, :cond_9

    .line 233
    .line 234
    goto/16 :goto_10

    .line 235
    .line 236
    :cond_9
    iget v4, p0, Lk/g2;->k:I

    .line 237
    .line 238
    if-ne v4, v10, :cond_a

    .line 239
    .line 240
    move v4, v10

    .line 241
    goto :goto_7

    .line 242
    :cond_a
    if-ne v4, v9, :cond_b

    .line 243
    .line 244
    iget-object v4, p0, Lk/g2;->u:Landroid/view/View;

    .line 245
    .line 246
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    :cond_b
    :goto_7
    if-ne v8, v10, :cond_10

    .line 251
    .line 252
    if-eqz v1, :cond_c

    .line 253
    .line 254
    move v8, v0

    .line 255
    goto :goto_8

    .line 256
    :cond_c
    move v8, v10

    .line 257
    :goto_8
    if-eqz v1, :cond_e

    .line 258
    .line 259
    iget v0, p0, Lk/g2;->k:I

    .line 260
    .line 261
    if-ne v0, v10, :cond_d

    .line 262
    .line 263
    move v0, v10

    .line 264
    goto :goto_9

    .line 265
    :cond_d
    move v0, v5

    .line 266
    :goto_9
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_a

    .line 273
    :cond_e
    iget v0, p0, Lk/g2;->k:I

    .line 274
    .line 275
    if-ne v0, v10, :cond_f

    .line 276
    .line 277
    move v5, v10

    .line 278
    :cond_f
    invoke-virtual {v3, v5}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v10}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 282
    .line 283
    .line 284
    goto :goto_a

    .line 285
    :cond_10
    if-ne v8, v9, :cond_11

    .line 286
    .line 287
    move v8, v0

    .line 288
    :cond_11
    :goto_a
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 289
    .line 290
    .line 291
    move v0, v4

    .line 292
    iget-object v4, p0, Lk/g2;->u:Landroid/view/View;

    .line 293
    .line 294
    iget v5, p0, Lk/g2;->l:I

    .line 295
    .line 296
    iget v6, p0, Lk/g2;->m:I

    .line 297
    .line 298
    if-gez v0, :cond_12

    .line 299
    .line 300
    move v7, v10

    .line 301
    goto :goto_b

    .line 302
    :cond_12
    move v7, v0

    .line 303
    :goto_b
    if-gez v8, :cond_13

    .line 304
    .line 305
    move v8, v10

    .line 306
    :cond_13
    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_14
    iget v1, p0, Lk/g2;->k:I

    .line 311
    .line 312
    if-ne v1, v10, :cond_15

    .line 313
    .line 314
    move v1, v10

    .line 315
    goto :goto_c

    .line 316
    :cond_15
    if-ne v1, v9, :cond_16

    .line 317
    .line 318
    iget-object v1, p0, Lk/g2;->u:Landroid/view/View;

    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    :cond_16
    :goto_c
    if-ne v8, v10, :cond_17

    .line 325
    .line 326
    move v8, v10

    .line 327
    goto :goto_d

    .line 328
    :cond_17
    if-ne v8, v9, :cond_18

    .line 329
    .line 330
    move v8, v0

    .line 331
    :cond_18
    :goto_d
    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 335
    .line 336
    .line 337
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 338
    .line 339
    const-string v1, "ListPopupWindow"

    .line 340
    .line 341
    const/16 v4, 0x1c

    .line 342
    .line 343
    if-gt v0, v4, :cond_19

    .line 344
    .line 345
    sget-object v0, Lk/g2;->F:Ljava/lang/reflect/Method;

    .line 346
    .line 347
    if-eqz v0, :cond_1a

    .line 348
    .line 349
    :try_start_0
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 350
    .line 351
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    invoke-virtual {v0, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    .line 357
    .line 358
    goto :goto_e

    .line 359
    :catch_0
    const-string v0, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."

    .line 360
    .line 361
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 362
    .line 363
    .line 364
    goto :goto_e

    .line 365
    :cond_19
    invoke-static {v3, v2}, Lk/b2;->b(Landroid/widget/PopupWindow;Z)V

    .line 366
    .line 367
    .line 368
    :cond_1a
    :goto_e
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 369
    .line 370
    .line 371
    iget-object v0, p0, Lk/g2;->x:Lk/f2;

    .line 372
    .line 373
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 374
    .line 375
    .line 376
    iget-boolean v0, p0, Lk/g2;->q:Z

    .line 377
    .line 378
    if-eqz v0, :cond_1b

    .line 379
    .line 380
    iget-boolean v0, p0, Lk/g2;->p:Z

    .line 381
    .line 382
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V

    .line 383
    .line 384
    .line 385
    :cond_1b
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 386
    .line 387
    if-gt v0, v4, :cond_1c

    .line 388
    .line 389
    sget-object v0, Lk/g2;->G:Ljava/lang/reflect/Method;

    .line 390
    .line 391
    if-eqz v0, :cond_1d

    .line 392
    .line 393
    :try_start_1
    iget-object v4, p0, Lk/g2;->C:Landroid/graphics/Rect;

    .line 394
    .line 395
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v0, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 400
    .line 401
    .line 402
    goto :goto_f

    .line 403
    :catch_1
    move-exception v0

    .line 404
    const-string v4, "Could not invoke setEpicenterBounds on PopupWindow"

    .line 405
    .line 406
    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 407
    .line 408
    .line 409
    goto :goto_f

    .line 410
    :cond_1c
    iget-object v0, p0, Lk/g2;->C:Landroid/graphics/Rect;

    .line 411
    .line 412
    invoke-static {v3, v0}, Lk/b2;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 413
    .line 414
    .line 415
    :cond_1d
    :goto_f
    iget-object v0, p0, Lk/g2;->u:Landroid/view/View;

    .line 416
    .line 417
    iget v1, p0, Lk/g2;->l:I

    .line 418
    .line 419
    iget v4, p0, Lk/g2;->m:I

    .line 420
    .line 421
    iget v5, p0, Lk/g2;->r:I

    .line 422
    .line 423
    invoke-virtual {v3, v0, v1, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 424
    .line 425
    .line 426
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 427
    .line 428
    invoke-virtual {v0, v10}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 429
    .line 430
    .line 431
    iget-boolean v0, p0, Lk/g2;->D:Z

    .line 432
    .line 433
    if-eqz v0, :cond_1e

    .line 434
    .line 435
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 436
    .line 437
    invoke-virtual {v0}, Lk/t1;->isInTouchMode()Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_1f

    .line 442
    .line 443
    :cond_1e
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 444
    .line 445
    if-eqz v0, :cond_1f

    .line 446
    .line 447
    invoke-virtual {v0, v2}, Lk/t1;->setListSelectionHidden(Z)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 451
    .line 452
    .line 453
    :cond_1f
    iget-boolean v0, p0, Lk/g2;->D:Z

    .line 454
    .line 455
    if-nez v0, :cond_20

    .line 456
    .line 457
    iget-object v0, p0, Lk/g2;->A:Landroid/os/Handler;

    .line 458
    .line 459
    iget-object v1, p0, Lk/g2;->z:Lk/c2;

    .line 460
    .line 461
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 462
    .line 463
    .line 464
    :cond_20
    :goto_10
    return-void
.end method

.method public final j()Lk/t1;
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g2;->i:Lk/t1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/g2;->E:Lk/c0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk/g2;->m:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lk/g2;->o:Z

    .line 5
    .line 6
    return-void
.end method

.method public final o()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk/g2;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lk/g2;->m:I

    .line 8
    .line 9
    return v0
.end method

.method public p(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/g2;->t:Lk/d2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lk/d2;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lk/d2;-><init>(Lk/g2;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk/g2;->t:Lk/d2;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lk/g2;->h:Landroid/widget/ListAdapter;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    iput-object p1, p0, Lk/g2;->h:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lk/g2;->t:Lk/d2;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p1, p0, Lk/g2;->i:Lk/t1;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Lk/g2;->h:Landroid/widget/ListAdapter;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public q(Landroid/content/Context;Z)Lk/t1;
    .locals 1

    .line 1
    new-instance v0, Lk/t1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lk/t1;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final r(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk/g2;->E:Lk/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lk/g2;->B:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget v0, v1, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    add-int/2addr v0, p1

    .line 20
    iput v0, p0, Lk/g2;->k:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iput p1, p0, Lk/g2;->k:I

    .line 24
    .line 25
    return-void
.end method
