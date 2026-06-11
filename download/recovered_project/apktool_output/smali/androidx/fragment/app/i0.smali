.class public final Landroidx/fragment/app/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final g:Landroidx/fragment/app/u0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/u0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/i0;->g:Landroidx/fragment/app/u0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 17

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 2
    const-class v3, Landroidx/fragment/app/g0;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v4, p0

    iget-object v5, v4, Landroidx/fragment/app/i0;->g:Landroidx/fragment/app/u0;

    if-eqz v3, :cond_0

    .line 3
    new-instance v0, Landroidx/fragment/app/g0;

    invoke-direct {v0, v1, v2, v5}, Landroidx/fragment/app/g0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/u0;)V

    return-object v0

    .line 4
    :cond_0
    const-string v3, "fragment"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    move-object/from16 p2, v3

    goto/16 :goto_b

    .line 5
    :cond_2
    const-string v0, "class"

    invoke-interface {v2, v3, v0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    sget-object v6, Lo0/a;->a:[I

    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v0, :cond_3

    .line 7
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_3
    const/4 v8, 0x1

    const/4 v9, -0x1

    .line 8
    invoke-virtual {v6, v8, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    const/4 v11, 0x2

    .line 9
    invoke-virtual {v6, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 10
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    .line 12
    :try_start_0
    invoke-static {v6, v0}, Landroidx/fragment/app/n0;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 13
    const-class v13, Landroidx/fragment/app/z;

    invoke-virtual {v13, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move v6, v7

    :goto_1
    if-nez v6, :cond_4

    goto :goto_0

    :cond_4
    if-eqz p1, :cond_5

    .line 14
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v6

    goto :goto_2

    :cond_5
    move v6, v7

    :goto_2
    if-ne v6, v9, :cond_7

    if-ne v10, v9, :cond_7

    if-eqz v12, :cond_6

    goto :goto_3

    .line 15
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    :goto_3
    if-eq v10, v9, :cond_8

    .line 16
    invoke-virtual {v5, v10}, Landroidx/fragment/app/u0;->C(I)Landroidx/fragment/app/z;

    move-result-object v13

    goto :goto_4

    :cond_8
    move-object v13, v3

    :goto_4
    if-nez v13, :cond_d

    if-eqz v12, :cond_d

    .line 17
    iget-object v13, v5, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 18
    iget-object v14, v13, Lr1/h;->g:Ljava/lang/Object;

    check-cast v14, Ljava/util/ArrayList;

    .line 19
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    sub-int/2addr v15, v8

    :goto_5
    if-ltz v15, :cond_a

    .line 20
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p2, v3

    move-object/from16 v3, v16

    check-cast v3, Landroidx/fragment/app/z;

    move/from16 v16, v11

    if-eqz v3, :cond_9

    .line 21
    iget-object v11, v3, Landroidx/fragment/app/z;->F:Ljava/lang/String;

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    move-object v13, v3

    goto :goto_6

    :cond_9
    add-int/lit8 v15, v15, -0x1

    move-object/from16 v3, p2

    move/from16 v11, v16

    goto :goto_5

    :cond_a
    move-object/from16 p2, v3

    move/from16 v16, v11

    .line 22
    iget-object v3, v13, Lr1/h;->h:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/b1;

    if-eqz v11, :cond_b

    .line 23
    iget-object v11, v11, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 24
    iget-object v13, v11, Landroidx/fragment/app/z;->F:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    move-object v13, v11

    goto :goto_6

    :cond_c
    move-object/from16 v13, p2

    goto :goto_6

    :cond_d
    move-object/from16 p2, v3

    move/from16 v16, v11

    :goto_6
    if-nez v13, :cond_e

    if-eq v6, v9, :cond_e

    .line 25
    invoke-virtual {v5, v6}, Landroidx/fragment/app/u0;->C(I)Landroidx/fragment/app/z;

    move-result-object v13

    .line 26
    :cond_e
    const-string v3, "Fragment "

    const-string v9, "FragmentManager"

    if-nez v13, :cond_12

    .line 27
    invoke-virtual {v5}, Landroidx/fragment/app/u0;->G()Landroidx/fragment/app/n0;

    move-result-object v2

    .line 28
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    invoke-virtual {v2, v0}, Landroidx/fragment/app/n0;->a(Ljava/lang/String;)Landroidx/fragment/app/z;

    move-result-object v13

    .line 30
    iput-boolean v8, v13, Landroidx/fragment/app/z;->t:Z

    if-eqz v10, :cond_f

    move v1, v10

    goto :goto_7

    :cond_f
    move v1, v6

    .line 31
    :goto_7
    iput v1, v13, Landroidx/fragment/app/z;->D:I

    .line 32
    iput v6, v13, Landroidx/fragment/app/z;->E:I

    .line 33
    iput-object v12, v13, Landroidx/fragment/app/z;->F:Ljava/lang/String;

    .line 34
    iput-boolean v8, v13, Landroidx/fragment/app/z;->u:Z

    .line 35
    iput-object v5, v13, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 36
    iget-object v1, v5, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 37
    iput-object v1, v13, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 38
    iget-object v2, v1, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 39
    iput-boolean v8, v13, Landroidx/fragment/app/z;->K:Z

    if-nez v1, :cond_10

    move-object/from16 v1, p2

    goto :goto_8

    .line 40
    :cond_10
    iget-object v1, v1, Landroidx/fragment/app/d0;->m:Lg/k;

    :goto_8
    if-eqz v1, :cond_11

    .line 41
    iput-boolean v8, v13, Landroidx/fragment/app/z;->K:Z

    .line 42
    :cond_11
    invoke-virtual {v5, v13}, Landroidx/fragment/app/u0;->a(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    move-result-object v1

    .line 43
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/u0;->J(I)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 46
    invoke-static {v9, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_a

    .line 47
    :cond_12
    iget-boolean v1, v13, Landroidx/fragment/app/z;->u:Z

    if-nez v1, :cond_16

    .line 48
    iput-boolean v8, v13, Landroidx/fragment/app/z;->u:Z

    .line 49
    iput-object v5, v13, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 50
    iget-object v1, v5, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 51
    iput-object v1, v13, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 52
    iget-object v2, v1, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 53
    iput-boolean v8, v13, Landroidx/fragment/app/z;->K:Z

    if-nez v1, :cond_13

    move-object/from16 v1, p2

    goto :goto_9

    .line 54
    :cond_13
    iget-object v1, v1, Landroidx/fragment/app/d0;->m:Lg/k;

    :goto_9
    if-eqz v1, :cond_14

    .line 55
    iput-boolean v8, v13, Landroidx/fragment/app/z;->K:Z

    .line 56
    :cond_14
    invoke-virtual {v5, v13}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    move-result-object v1

    .line 57
    invoke-static/range {v16 .. v16}, Landroidx/fragment/app/u0;->J(I)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "Retained Fragment "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 60
    invoke-static {v9, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    :cond_15
    :goto_a
    move-object/from16 v2, p1

    check-cast v2, Landroid/view/ViewGroup;

    sget-object v5, Lp0/c;->a:Lp0/b;

    .line 62
    new-instance v5, Lp0/d;

    invoke-direct {v5, v13, v2, v7}, Lp0/d;-><init>(Landroidx/fragment/app/z;Landroid/view/ViewGroup;I)V

    .line 63
    invoke-static {v5}, Lp0/c;->b(Lp0/e;)V

    .line 64
    invoke-static {v13}, Lp0/c;->a(Landroidx/fragment/app/z;)Lp0/b;

    move-result-object v5

    .line 65
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    iput-object v2, v13, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 67
    invoke-virtual {v1}, Landroidx/fragment/app/b1;->j()V

    .line 68
    invoke-virtual {v1}, Landroidx/fragment/app/b1;->i()V

    .line 69
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, " did not create a view."

    .line 70
    invoke-static {v3, v0, v2}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 71
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 72
    :cond_16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v2}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": Duplicate id 0x"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", tag "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", or parent id 0x"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with another fragment for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_b
    return-object p2
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/i0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
