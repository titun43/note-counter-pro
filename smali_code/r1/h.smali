.class public final Lr1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/a;
.implements Lh2/b;


# static fields
.field public static k:Lr1/h;


# instance fields
.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 5
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lr1/h;->i:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance p1, Lc0/j;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lc0/j;-><init>(I)V

    iput-object p1, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 8
    new-instance p1, Lo/l;

    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Lo/l;-><init>(I)V

    .line 10
    iput-object p1, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lr1/h;->i:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lr1/h;->j:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lm0/b;)V
    .locals 7

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 15
    iput-object p2, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 16
    new-instance p1, Landroidx/emoji2/text/x;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Landroidx/emoji2/text/x;-><init>(I)V

    iput-object p1, p0, Lr1/h;->i:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 17
    invoke-virtual {p2, p1}, Lf0/h0;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 18
    iget v2, p2, Lf0/h0;->a:I

    add-int/2addr v0, v2

    .line 19
    iget-object v2, p2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 20
    iget-object v0, p2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 21
    new-array v0, v0, [C

    iput-object v0, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 22
    invoke-virtual {p2, p1}, Lf0/h0;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 23
    iget v0, p2, Lf0/h0;->a:I

    add-int/2addr p1, v0

    .line 24
    iget-object v0, p2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 25
    iget-object p1, p2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_7

    .line 26
    new-instance v0, Landroidx/emoji2/text/a0;

    invoke-direct {v0, p0, p2}, Landroidx/emoji2/text/a0;-><init>(Lr1/h;I)V

    .line 27
    invoke-virtual {v0}, Landroidx/emoji2/text/a0;->b()Lm0/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 28
    invoke-virtual {v2, v3}, Lf0/h0;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lf0/h0;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    .line 29
    :goto_3
    iget-object v3, p0, Lr1/h;->h:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 30
    invoke-virtual {v0}, Landroidx/emoji2/text/a0;->b()Lm0/a;

    move-result-object v2

    const/16 v3, 0x10

    .line 31
    invoke-virtual {v2, v3}, Lf0/h0;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 32
    iget v5, v2, Lf0/h0;->a:I

    add-int/2addr v4, v5

    .line 33
    iget-object v5, v2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 34
    iget-object v2, v2, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_5

    :cond_4
    move v2, v1

    :goto_5
    if-eqz v2, :cond_6

    .line 35
    iget-object v2, p0, Lr1/h;->i:Ljava/lang/Object;

    check-cast v2, Landroidx/emoji2/text/x;

    .line 36
    invoke-virtual {v0}, Landroidx/emoji2/text/a0;->b()Lm0/a;

    move-result-object v5

    .line 37
    invoke-virtual {v5, v3}, Lf0/h0;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 38
    iget v6, v5, Lf0/h0;->a:I

    add-int/2addr v3, v6

    .line 39
    iget-object v6, v5, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    add-int/2addr v6, v3

    .line 40
    iget-object v3, v5, Lf0/h0;->d:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v1

    :goto_6
    sub-int/2addr v3, v4

    .line 41
    invoke-virtual {v2, v0, v1, v3}, Landroidx/emoji2/text/x;->a(Landroidx/emoji2/text/a0;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 42
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid metadata codepoint length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr1/h;->g:Ljava/lang/Object;

    iput-object p2, p0, Lr1/h;->h:Ljava/lang/Object;

    iput-object p3, p0, Lr1/h;->i:Ljava/lang/Object;

    iput-object p4, p0, Lr1/h;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized n(Landroid/content/Context;Lw1/a;)Lr1/h;
    .locals 3

    .line 1
    const-class v0, Lr1/h;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr1/h;->k:Lr1/h;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lr1/h;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v2, Lr1/a;

    .line 18
    .line 19
    invoke-direct {v2, p0, p1}, Lr1/c;-><init>(Landroid/content/Context;Lw1/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, v1, Lr1/h;->g:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v2, Lr1/b;

    .line 25
    .line 26
    invoke-direct {v2, p0, p1}, Lr1/c;-><init>(Landroid/content/Context;Lw1/a;)V

    .line 27
    .line 28
    .line 29
    iput-object v2, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance v2, Lr1/f;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Lr1/f;-><init>(Landroid/content/Context;Lw1/a;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, v1, Lr1/h;->i:Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v2, Lr1/g;

    .line 39
    .line 40
    invoke-direct {v2, p0, p1}, Lr1/c;-><init>(Landroid/content/Context;Lw1/a;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, v1, Lr1/h;->j:Ljava/lang/Object;

    .line 44
    .line 45
    sput-object v1, Lr1/h;->k:Lr1/h;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    sget-object p0, Lr1/h;->k:Lr1/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    return-object p0

    .line 54
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    throw p0
.end method


# virtual methods
.method public a(Li/b;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr1/h;->i(Li/b;)Li/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v1, Lj/u;

    .line 10
    .line 11
    iget-object v2, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroid/content/Context;

    .line 14
    .line 15
    check-cast p2, La0/a;

    .line 16
    .line 17
    invoke-direct {v1, v2, p2}, Lj/u;-><init>(Landroid/content/Context;La0/a;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public b(Li/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr1/h;->i(Li/b;)Li/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public c(Landroidx/fragment/app/z;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p1, Landroidx/fragment/app/z;->q:Z

    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "Fragment already added: "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public d(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lo/l;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    if-ge v2, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {p0, v3, p2, p3}, Lr1/h;->d(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    .line 54
    .line 55
    const-string p2, "This graph contains cyclic dependencies"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public e(Ljava/lang/String;)Landroidx/fragment/app/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/fragment/app/b1;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
.end method

.method public f(Li/b;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr1/h;->i(Li/b;)Li/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lo/l;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/Menu;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Lj/c0;

    .line 22
    .line 23
    iget-object v3, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Landroid/content/Context;

    .line 26
    .line 27
    move-object v4, p2

    .line 28
    check-cast v4, Lj/n;

    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Lj/c0;-><init>(Landroid/content/Context;Lj/n;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p2, v2}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public g(Li/b;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/ActionMode$Callback;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lr1/h;->i(Li/b;)Li/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lo/l;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Lo/l;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/view/Menu;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Lj/c0;

    .line 22
    .line 23
    iget-object v3, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Landroid/content/Context;

    .line 26
    .line 27
    move-object v4, p2

    .line 28
    check-cast v4, Lj/n;

    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Lj/c0;-><init>(Landroid/content/Context;Lj/n;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p2, v2}, Lo/l;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public get()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls3/a;

    .line 4
    .line 5
    invoke-interface {v0}, Ls3/a;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    iget-object v1, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ls3/a;

    .line 14
    .line 15
    invoke-interface {v1}, Ls3/a;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lm2/d;

    .line 20
    .line 21
    iget-object v2, p0, Lr1/h;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroidx/emoji2/text/t;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/emoji2/text/t;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroidx/emoji2/text/t;

    .line 30
    .line 31
    iget-object v3, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ls3/a;

    .line 34
    .line 35
    invoke-interface {v3}, Ls3/a;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ln2/c;

    .line 40
    .line 41
    new-instance v4, Lr1/h;

    .line 42
    .line 43
    invoke-direct {v4, v0, v1, v2, v3}, Lr1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v4
.end method

.method public h(Ljava/lang/String;)Landroidx/fragment/app/z;
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroidx/fragment/app/b1;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 39
    .line 40
    iget-object v1, v1, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Lr1/h;->h(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    if-eqz v1, :cond_0

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return-object p1
.end method

.method public i(Li/b;)Li/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lr1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Li/f;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v4, v3, Li/f;->b:Li/b;

    .line 21
    .line 22
    if-ne v4, p1, :cond_0

    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v1, Li/f;

    .line 29
    .line 30
    iget-object v2, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Landroid/content/Context;

    .line 33
    .line 34
    invoke-direct {v1, v2, p1}, Li/f;-><init>(Landroid/content/Context;Li/b;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public j()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/fragment/app/b1;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public k()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroidx/fragment/app/b1;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0
.end method

.method public l(Lr3/x;)Ljava/io/File;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lp3/z;->a:[I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    :goto_0
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    :pswitch_0
    new-instance p1, Landroidx/fragment/app/x;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :pswitch_1
    sget-object p1, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :pswitch_3
    iget-object p1, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ljava/io/File;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_4
    iget-object p1, p0, Lr1/h;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/io/File;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_5
    iget-object p1, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/io/File;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_6
    iget-object p1, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/io/File;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_7
    const/4 p1, 0x0

    .line 55
    return-object p1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public m()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object v1

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1
.end method

.method public o(Landroidx/fragment/app/b1;)V
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-static {p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Added fragment to active set "

    .line 31
    .line 32
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string v0, "FragmentManager"

    .line 43
    .line 44
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public p(Landroidx/fragment/app/b1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p1, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 6
    .line 7
    iget-boolean v2, v1, Landroidx/fragment/app/z;->I:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroidx/fragment/app/y0;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Landroidx/fragment/app/y0;->f(Landroidx/fragment/app/z;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v2, v1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eq v2, p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p1, v1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroidx/fragment/app/b1;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 p1, 0x2

    .line 40
    invoke-static {p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    new-instance p1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v0, "Removed fragment from active set "

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "FragmentManager"

    .line 61
    .line 62
    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_0
    return-void
.end method

.method public q(Lk0/m;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq4/c;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lq4/q;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, Lq4/h;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p1, Lq4/h;

    .line 14
    .line 15
    iget-object p1, p1, Lq4/h;->a:Ljava/lang/Throwable;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Lh3/c;

    .line 20
    .line 21
    const-string v0, "Channel was closed normally"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    throw p1

    .line 27
    :cond_1
    instance-of p1, p1, Lq4/i;

    .line 28
    .line 29
    if-nez p1, :cond_3

    .line 30
    .line 31
    iget-object p1, p0, Lr1/h;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Lr1/h;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lo4/t;

    .line 44
    .line 45
    new-instance v0, Lk0/b;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-direct {v0, p0, v1, v2}, Lk0/b;-><init>(Ljava/lang/Object;Lw3/c;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Lo4/w;->i(Lo4/t;Lf4/p;)Lo4/z;

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void

    .line 56
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "Check failed."

    .line 59
    .line 60
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1
.end method

.method public r(Lr3/g0;Ly3/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v3, "/synthetic/"

    .line 2
    .line 3
    instance-of v4, p2, Lp3/a0;

    .line 4
    .line 5
    if-eqz v4, :cond_0

    .line 6
    .line 7
    move-object v4, p2

    .line 8
    check-cast v4, Lp3/a0;

    .line 9
    .line 10
    iget v5, v4, Lp3/a0;->i:I

    .line 11
    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    and-int v7, v5, v6

    .line 15
    .line 16
    if-eqz v7, :cond_0

    .line 17
    .line 18
    sub-int/2addr v5, v6

    .line 19
    iput v5, v4, Lp3/a0;->i:I

    .line 20
    .line 21
    :goto_0
    move-object v6, v4

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v4, Lp3/a0;

    .line 24
    .line 25
    invoke-direct {v4, p0, p2}, Lp3/a0;-><init>(Lr1/h;Ly3/c;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v2, v6, Lp3/a0;->g:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v7, Lx3/a;->g:Lx3/a;

    .line 32
    .line 33
    iget v4, v6, Lp3/a0;->i:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v8, 0x1

    .line 37
    const/4 v9, 0x2

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v8, :cond_3

    .line 41
    .line 42
    if-eq v4, v9, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    :try_start_0
    invoke-static {v2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v0

    .line 62
    :cond_2
    :try_start_1
    invoke-static {v2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_3
    invoke-static {v2}, Lb3/g;->x(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :cond_4
    invoke-static {v2}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :try_start_2
    iget-object v2, p1, Lr3/g0;->c:Lr3/x;

    .line 76
    .line 77
    iget-object v4, p1, Lr3/g0;->d:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p0, v2}, Lr1/h;->l(Lr3/x;)Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-nez v2, :cond_e

    .line 84
    .line 85
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v10, "content"

    .line 94
    .line 95
    invoke-static {v5, v10}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_5

    .line 100
    .line 101
    new-instance v0, Lr3/d0;

    .line 102
    .line 103
    invoke-direct {v0, v2}, Lr3/d0;-><init>(Landroid/net/Uri;)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_5
    invoke-static {v4, v3}, Ln4/i;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_8

    .line 112
    .line 113
    iget-object v2, p1, Lr3/g0;->d:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v2}, Ln4/i;->T(Ljava/lang/CharSequence;)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    const-string v0, "<this>"

    .line 120
    .line 121
    invoke-static {v2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    instance-of v0, v2, Ljava/lang/String;

    .line 125
    .line 126
    if-nez v0, :cond_6

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    const/4 v7, 0x1

    .line 130
    const/4 v6, 0x0

    .line 131
    invoke-static/range {v2 .. v7}, Ln4/i;->V(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    goto :goto_2

    .line 136
    :cond_6
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    :goto_2
    add-int/lit8 v0, v0, 0xb

    .line 141
    .line 142
    invoke-static {v2}, Ln4/i;->Y(Ljava/lang/CharSequence;)I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-lt v3, v0, :cond_7

    .line 147
    .line 148
    invoke-virtual {v2, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v2, "substring(...)"

    .line 153
    .line 154
    invoke-static {v0, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v2, "content://media/"

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v2, Lr3/d0;

    .line 168
    .line 169
    invoke-direct {v2, v0}, Lr3/d0;-><init>(Landroid/net/Uri;)V

    .line 170
    .line 171
    .line 172
    return-object v2

    .line 173
    :cond_7
    new-instance v0, Lr3/t;

    .line 174
    .line 175
    invoke-direct {v0, v2}, Lr3/t;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_8
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    const-string v5, "file"

    .line 184
    .line 185
    invoke-static {v3, v5}, Lg4/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_b

    .line 190
    .line 191
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    if-nez v0, :cond_9

    .line 196
    .line 197
    const-string v0, ""

    .line 198
    .line 199
    :cond_9
    move-object v3, v0

    .line 200
    iput v8, v6, Lp3/a0;->i:I

    .line 201
    .line 202
    sget-object v0, Lo4/e0;->a:Lv4/e;

    .line 203
    .line 204
    sget-object v8, Lv4/d;->i:Lv4/d;

    .line 205
    .line 206
    new-instance v0, Lp3/b;

    .line 207
    .line 208
    const/4 v5, 0x0

    .line 209
    const/4 v4, 0x0

    .line 210
    const/4 v2, 0x0

    .line 211
    move-object v1, p0

    .line 212
    invoke-direct/range {v0 .. v5}, Lp3/b;-><init>(Lr1/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/Boolean;Lw3/c;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0, v8, v6}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-ne v2, v7, :cond_a

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_a
    :goto_3
    check-cast v2, Lr3/f0;

    .line 223
    .line 224
    return-object v2

    .line 225
    :cond_b
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    if-nez v1, :cond_d

    .line 230
    .line 231
    iget-object v3, p1, Lr3/g0;->d:Ljava/lang/String;

    .line 232
    .line 233
    iput v9, v6, Lp3/a0;->i:I

    .line 234
    .line 235
    sget-object v0, Lo4/e0;->a:Lv4/e;

    .line 236
    .line 237
    sget-object v8, Lv4/d;->i:Lv4/d;

    .line 238
    .line 239
    new-instance v0, Lp3/b;

    .line 240
    .line 241
    const/4 v5, 0x0

    .line 242
    const/4 v4, 0x0

    .line 243
    const/4 v2, 0x0

    .line 244
    move-object v1, p0

    .line 245
    invoke-direct/range {v0 .. v5}, Lp3/b;-><init>(Lr1/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/Boolean;Lw3/c;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v8, v6}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    if-ne v2, v7, :cond_c

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_c
    :goto_4
    check-cast v2, Lr3/f0;

    .line 256
    .line 257
    return-object v2

    .line 258
    :cond_d
    new-instance v0, Lr3/t;

    .line 259
    .line 260
    invoke-direct {v0, v4}, Lr3/t;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v0

    .line 264
    :cond_e
    iget-object v0, p1, Lr3/g0;->c:Lr3/x;

    .line 265
    .line 266
    if-eqz v0, :cond_f

    .line 267
    .line 268
    iget-boolean v0, v0, Lr3/x;->g:Z

    .line 269
    .line 270
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    goto :goto_5

    .line 275
    :cond_f
    const/4 v0, 0x0

    .line 276
    :goto_5
    iput v5, v6, Lp3/a0;->i:I

    .line 277
    .line 278
    sget-object v1, Lo4/e0;->a:Lv4/e;

    .line 279
    .line 280
    sget-object v8, Lv4/d;->i:Lv4/d;

    .line 281
    .line 282
    move-object v3, v4

    .line 283
    move-object v4, v0

    .line 284
    new-instance v0, Lp3/b;

    .line 285
    .line 286
    const/4 v5, 0x0

    .line 287
    move-object v1, p0

    .line 288
    invoke-direct/range {v0 .. v5}, Lp3/b;-><init>(Lr1/h;Ljava/io/File;Ljava/lang/String;Ljava/lang/Boolean;Lw3/c;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v0, v8, v6}, Lo4/w;->p(Lf4/p;Lw3/h;Ly3/c;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    if-ne v2, v7, :cond_10

    .line 296
    .line 297
    :goto_6
    return-object v7

    .line 298
    :cond_10
    :goto_7
    check-cast v2, Lr3/f0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 299
    .line 300
    return-object v2

    .line 301
    :goto_8
    invoke-static {v0}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    return-object v0
.end method

.method public s(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 1

    .line 1
    iget-object v0, p0, Lr1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/os/Bundle;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/os/Bundle;

    .line 19
    .line 20
    return-object p1
.end method
