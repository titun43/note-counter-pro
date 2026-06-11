.class public abstract Landroidx/fragment/app/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Landroidx/fragment/app/n0;

.field public final B:Lt2/i;

.field public C:Ld/g;

.field public D:Ld/g;

.field public E:Ld/g;

.field public F:Ljava/util/ArrayDeque;

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public L:Ljava/util/ArrayList;

.field public M:Ljava/util/ArrayList;

.field public N:Ljava/util/ArrayList;

.field public O:Landroidx/fragment/app/y0;

.field public final P:Landroidx/fragment/app/o;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lr1/h;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/i0;

.field public g:Landroidx/activity/f0;

.field public h:Landroidx/fragment/app/a;

.field public i:Z

.field public final j:Landroidx/fragment/app/l0;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final l:Ljava/util/Map;

.field public final m:Ljava/util/Map;

.field public final n:Ljava/util/ArrayList;

.field public final o:Landroidx/emoji2/text/p;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final q:Landroidx/fragment/app/j0;

.field public final r:Landroidx/fragment/app/j0;

.field public final s:Landroidx/fragment/app/j0;

.field public final t:Landroidx/fragment/app/j0;

.field public final u:Landroidx/fragment/app/m0;

.field public v:I

.field public w:Landroidx/fragment/app/d0;

.field public x:La/a;

.field public y:Landroidx/fragment/app/z;

.field public z:Landroidx/fragment/app/z;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lr1/h;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, v1}, Lr1/h;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v0, Landroidx/fragment/app/i0;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Landroidx/fragment/app/i0;-><init>(Landroidx/fragment/app/u0;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/fragment/app/u0;->f:Landroidx/fragment/app/i0;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->i:Z

    .line 38
    .line 39
    new-instance v0, Landroidx/fragment/app/l0;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Landroidx/fragment/app/l0;-><init>(Landroidx/fragment/app/u0;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Landroidx/fragment/app/u0;->j:Landroidx/fragment/app/l0;

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Landroidx/fragment/app/u0;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Landroidx/fragment/app/u0;->l:Ljava/util/Map;

    .line 63
    .line 64
    new-instance v0, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Landroidx/fragment/app/u0;->m:Ljava/util/Map;

    .line 74
    .line 75
    new-instance v0, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    new-instance v0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, Landroidx/fragment/app/u0;->n:Ljava/util/ArrayList;

    .line 89
    .line 90
    new-instance v0, Landroidx/emoji2/text/p;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Landroidx/emoji2/text/p;-><init>(Landroidx/fragment/app/u0;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Landroidx/fragment/app/u0;->o:Landroidx/emoji2/text/p;

    .line 96
    .line 97
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Landroidx/fragment/app/u0;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 103
    .line 104
    new-instance v0, Landroidx/fragment/app/j0;

    .line 105
    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, Landroidx/fragment/app/u0;->q:Landroidx/fragment/app/j0;

    .line 111
    .line 112
    new-instance v0, Landroidx/fragment/app/j0;

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Landroidx/fragment/app/u0;->r:Landroidx/fragment/app/j0;

    .line 119
    .line 120
    new-instance v0, Landroidx/fragment/app/j0;

    .line 121
    .line 122
    const/4 v1, 0x2

    .line 123
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Landroidx/fragment/app/u0;->s:Landroidx/fragment/app/j0;

    .line 127
    .line 128
    new-instance v0, Landroidx/fragment/app/j0;

    .line 129
    .line 130
    const/4 v1, 0x3

    .line 131
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/j0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 132
    .line 133
    .line 134
    iput-object v0, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/j0;

    .line 135
    .line 136
    new-instance v0, Landroidx/fragment/app/m0;

    .line 137
    .line 138
    invoke-direct {v0, p0}, Landroidx/fragment/app/m0;-><init>(Landroidx/fragment/app/u0;)V

    .line 139
    .line 140
    .line 141
    iput-object v0, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/m0;

    .line 142
    .line 143
    const/4 v0, -0x1

    .line 144
    iput v0, p0, Landroidx/fragment/app/u0;->v:I

    .line 145
    .line 146
    new-instance v0, Landroidx/fragment/app/n0;

    .line 147
    .line 148
    invoke-direct {v0, p0}, Landroidx/fragment/app/n0;-><init>(Landroidx/fragment/app/u0;)V

    .line 149
    .line 150
    .line 151
    iput-object v0, p0, Landroidx/fragment/app/u0;->A:Landroidx/fragment/app/n0;

    .line 152
    .line 153
    new-instance v0, Lt2/i;

    .line 154
    .line 155
    const/4 v1, 0x5

    .line 156
    invoke-direct {v0, v1}, Lt2/i;-><init>(I)V

    .line 157
    .line 158
    .line 159
    iput-object v0, p0, Landroidx/fragment/app/u0;->B:Lt2/i;

    .line 160
    .line 161
    new-instance v0, Ljava/util/ArrayDeque;

    .line 162
    .line 163
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 164
    .line 165
    .line 166
    iput-object v0, p0, Landroidx/fragment/app/u0;->F:Ljava/util/ArrayDeque;

    .line 167
    .line 168
    new-instance v0, Landroidx/fragment/app/o;

    .line 169
    .line 170
    const/4 v1, 0x2

    .line 171
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p0, Landroidx/fragment/app/u0;->P:Landroidx/fragment/app/o;

    .line 175
    .line 176
    return-void
.end method

.method public static E(Landroidx/fragment/app/a;)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroidx/fragment/app/c1;

    .line 22
    .line 23
    iget-object v2, v2, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    iget-boolean v3, p0, Landroidx/fragment/app/a;->g:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-object v0
.end method

.method public static J(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static K(Landroidx/fragment/app/z;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 7
    .line 8
    invoke-virtual {p0}, Lr1/h;->k()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :cond_0
    if-ge v3, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    check-cast v4, Landroidx/fragment/app/z;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-static {v4}, Landroidx/fragment/app/u0;->K(Landroidx/fragment/app/z;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :cond_1
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    return v1
.end method

.method public static M(Landroidx/fragment/app/z;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/z;->J:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/z;->C:Landroidx/fragment/app/z;

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/fragment/app/u0;->M(Landroidx/fragment/app/z;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static N(Landroidx/fragment/app/z;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/fragment/app/u0;->N(Landroidx/fragment/app/z;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static b0(Landroidx/fragment/app/z;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/z;->G:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/z;->G:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/fragment/app/z;->P:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/fragment/app/z;->P:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Z)Z
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->z(Z)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->i:Z

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_3

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 11
    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    iput-boolean v1, p1, Landroidx/fragment/app/a;->r:Z

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/a;->d()V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    invoke-static {p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const-string p1, "FragmentManager"

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "Reversing mTransitioningOp "

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, " as part of execPendingActions for actions "

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v3, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {p1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 58
    .line 59
    invoke-virtual {p1, v1, v1}, Landroidx/fragment/app/a;->e(ZZ)I

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 63
    .line 64
    iget-object v2, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 65
    .line 66
    invoke-virtual {p1, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 70
    .line 71
    iget-object p1, p1, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    move v3, v1

    .line 78
    :cond_1
    :goto_0
    if-ge v3, v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    check-cast v4, Landroidx/fragment/app/c1;

    .line 87
    .line 88
    iget-object v4, v4, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 89
    .line 90
    if-eqz v4, :cond_1

    .line 91
    .line 92
    iput-boolean v1, v4, Landroidx/fragment/app/z;->s:Z

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iput-object v0, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 96
    .line 97
    :cond_3
    move p1, v1

    .line 98
    :goto_1
    iget-object v2, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 99
    .line 100
    iget-object v3, p0, Landroidx/fragment/app/u0;->M:Ljava/util/ArrayList;

    .line 101
    .line 102
    iget-object v4, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 103
    .line 104
    monitor-enter v4

    .line 105
    :try_start_0
    iget-object v5, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-eqz v5, :cond_4

    .line 112
    .line 113
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    move v7, v1

    .line 115
    goto :goto_3

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    :try_start_1
    iget-object v5, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    move v6, v1

    .line 125
    move v7, v6

    .line 126
    :goto_2
    if-ge v6, v5, :cond_5

    .line 127
    .line 128
    iget-object v8, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    check-cast v8, Landroidx/fragment/app/r0;

    .line 135
    .line 136
    invoke-interface {v8, v2, v3}, Landroidx/fragment/app/r0;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 137
    .line 138
    .line 139
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    or-int/2addr v7, v8

    .line 141
    add-int/lit8 v6, v6, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_1
    move-exception p1

    .line 145
    goto :goto_4

    .line 146
    :cond_5
    :try_start_2
    iget-object v2, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 152
    .line 153
    iget-object v2, v2, Landroidx/fragment/app/d0;->o:Landroid/os/Handler;

    .line 154
    .line 155
    iget-object v3, p0, Landroidx/fragment/app/u0;->P:Landroidx/fragment/app/o;

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 158
    .line 159
    .line 160
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    :goto_3
    if-eqz v7, :cond_6

    .line 162
    .line 163
    const/4 p1, 0x1

    .line 164
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 165
    .line 166
    :try_start_3
    iget-object v2, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 167
    .line 168
    iget-object v3, p0, Landroidx/fragment/app/u0;->M:Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-virtual {p0, v2, v3}, Landroidx/fragment/app/u0;->T(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :catchall_2
    move-exception p1

    .line 178
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e0()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->v()V

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 189
    .line 190
    iget-object v1, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Ljava/util/HashMap;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v1, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 203
    .line 204
    .line 205
    return p1

    .line 206
    :goto_4
    :try_start_4
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 209
    .line 210
    .line 211
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 212
    .line 213
    iget-object v0, v0, Landroidx/fragment/app/d0;->o:Landroid/os/Handler;

    .line 214
    .line 215
    iget-object v1, p0, Landroidx/fragment/app/u0;->P:Landroidx/fragment/app/o;

    .line 216
    .line 217
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :goto_5
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 222
    throw p1
.end method

.method public final B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    iget-object v5, v1, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 12
    .line 13
    iget-object v6, v1, Landroidx/fragment/app/u0;->n:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    check-cast v7, Landroidx/fragment/app/a;

    .line 20
    .line 21
    iget-boolean v7, v7, Landroidx/fragment/app/a;->o:Z

    .line 22
    .line 23
    iget-object v8, v1, Landroidx/fragment/app/u0;->N:Ljava/util/ArrayList;

    .line 24
    .line 25
    if-nez v8, :cond_0

    .line 26
    .line 27
    new-instance v8, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v8, v1, Landroidx/fragment/app/u0;->N:Ljava/util/ArrayList;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v8, v1, Landroidx/fragment/app/u0;->N:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5}, Lr1/h;->m()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    iget-object v8, v1, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 48
    .line 49
    move v10, v3

    .line 50
    const/4 v11, 0x0

    .line 51
    :goto_1
    if-ge v10, v4, :cond_13

    .line 52
    .line 53
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v14

    .line 57
    check-cast v14, Landroidx/fragment/app/a;

    .line 58
    .line 59
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    check-cast v15, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v15

    .line 69
    if-nez v15, :cond_d

    .line 70
    .line 71
    iget-object v15, v1, Landroidx/fragment/app/u0;->N:Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v9, v14, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 74
    .line 75
    const/4 v12, 0x0

    .line 76
    :goto_2
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-ge v12, v13, :cond_c

    .line 81
    .line 82
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    check-cast v13, Landroidx/fragment/app/c1;

    .line 87
    .line 88
    move/from16 v19, v7

    .line 89
    .line 90
    iget v7, v13, Landroidx/fragment/app/c1;->a:I

    .line 91
    .line 92
    move/from16 v20, v10

    .line 93
    .line 94
    const/4 v10, 0x1

    .line 95
    if-eq v7, v10, :cond_b

    .line 96
    .line 97
    const/4 v10, 0x2

    .line 98
    move/from16 v21, v11

    .line 99
    .line 100
    const/16 v11, 0x9

    .line 101
    .line 102
    if-eq v7, v10, :cond_5

    .line 103
    .line 104
    const/4 v10, 0x3

    .line 105
    if-eq v7, v10, :cond_4

    .line 106
    .line 107
    const/4 v10, 0x6

    .line 108
    if-eq v7, v10, :cond_4

    .line 109
    .line 110
    const/4 v10, 0x7

    .line 111
    if-eq v7, v10, :cond_3

    .line 112
    .line 113
    const/16 v10, 0x8

    .line 114
    .line 115
    if-eq v7, v10, :cond_1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_1
    new-instance v7, Landroidx/fragment/app/c1;

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    invoke-direct {v7, v11, v8, v10}, Landroidx/fragment/app/c1;-><init>(ILandroidx/fragment/app/z;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v9, v12, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    const/4 v10, 0x1

    .line 128
    iput-boolean v10, v13, Landroidx/fragment/app/c1;->c:Z

    .line 129
    .line 130
    add-int/lit8 v12, v12, 0x1

    .line 131
    .line 132
    iget-object v7, v13, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 133
    .line 134
    move-object v8, v7

    .line 135
    :cond_2
    :goto_3
    const/4 v10, 0x1

    .line 136
    goto/16 :goto_8

    .line 137
    .line 138
    :cond_3
    const/4 v10, 0x1

    .line 139
    goto/16 :goto_7

    .line 140
    .line 141
    :cond_4
    iget-object v7, v13, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 142
    .line 143
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    iget-object v7, v13, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 147
    .line 148
    if-ne v7, v8, :cond_2

    .line 149
    .line 150
    new-instance v8, Landroidx/fragment/app/c1;

    .line 151
    .line 152
    invoke-direct {v8, v11, v7}, Landroidx/fragment/app/c1;-><init>(ILandroidx/fragment/app/z;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9, v12, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v12, v12, 0x1

    .line 159
    .line 160
    const/4 v8, 0x0

    .line 161
    goto :goto_3

    .line 162
    :cond_5
    iget-object v7, v13, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 163
    .line 164
    iget v10, v7, Landroidx/fragment/app/z;->E:I

    .line 165
    .line 166
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result v22

    .line 170
    const/16 v18, 0x1

    .line 171
    .line 172
    add-int/lit8 v22, v22, -0x1

    .line 173
    .line 174
    move/from16 v11, v22

    .line 175
    .line 176
    const/16 v22, 0x0

    .line 177
    .line 178
    :goto_4
    if-ltz v11, :cond_9

    .line 179
    .line 180
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v24

    .line 184
    move/from16 v25, v11

    .line 185
    .line 186
    move-object/from16 v11, v24

    .line 187
    .line 188
    check-cast v11, Landroidx/fragment/app/z;

    .line 189
    .line 190
    iget v3, v11, Landroidx/fragment/app/z;->E:I

    .line 191
    .line 192
    if-ne v3, v10, :cond_8

    .line 193
    .line 194
    if-ne v11, v7, :cond_6

    .line 195
    .line 196
    move/from16 v23, v10

    .line 197
    .line 198
    const/4 v10, 0x1

    .line 199
    const/16 v22, 0x1

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_6
    if-ne v11, v8, :cond_7

    .line 203
    .line 204
    new-instance v3, Landroidx/fragment/app/c1;

    .line 205
    .line 206
    move/from16 v23, v10

    .line 207
    .line 208
    const/4 v8, 0x0

    .line 209
    const/16 v10, 0x9

    .line 210
    .line 211
    invoke-direct {v3, v10, v11, v8}, Landroidx/fragment/app/c1;-><init>(ILandroidx/fragment/app/z;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9, v12, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    add-int/lit8 v12, v12, 0x1

    .line 218
    .line 219
    move v3, v8

    .line 220
    const/4 v8, 0x0

    .line 221
    goto :goto_5

    .line 222
    :cond_7
    move/from16 v23, v10

    .line 223
    .line 224
    const/4 v3, 0x0

    .line 225
    const/16 v10, 0x9

    .line 226
    .line 227
    :goto_5
    new-instance v10, Landroidx/fragment/app/c1;

    .line 228
    .line 229
    move-object/from16 v26, v8

    .line 230
    .line 231
    const/4 v8, 0x3

    .line 232
    invoke-direct {v10, v8, v11, v3}, Landroidx/fragment/app/c1;-><init>(ILandroidx/fragment/app/z;I)V

    .line 233
    .line 234
    .line 235
    iget v3, v13, Landroidx/fragment/app/c1;->d:I

    .line 236
    .line 237
    iput v3, v10, Landroidx/fragment/app/c1;->d:I

    .line 238
    .line 239
    iget v3, v13, Landroidx/fragment/app/c1;->f:I

    .line 240
    .line 241
    iput v3, v10, Landroidx/fragment/app/c1;->f:I

    .line 242
    .line 243
    iget v3, v13, Landroidx/fragment/app/c1;->e:I

    .line 244
    .line 245
    iput v3, v10, Landroidx/fragment/app/c1;->e:I

    .line 246
    .line 247
    iget v3, v13, Landroidx/fragment/app/c1;->g:I

    .line 248
    .line 249
    iput v3, v10, Landroidx/fragment/app/c1;->g:I

    .line 250
    .line 251
    invoke-virtual {v9, v12, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    const/4 v10, 0x1

    .line 258
    add-int/2addr v12, v10

    .line 259
    move-object/from16 v8, v26

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_8
    move/from16 v23, v10

    .line 263
    .line 264
    const/4 v10, 0x1

    .line 265
    :goto_6
    add-int/lit8 v11, v25, -0x1

    .line 266
    .line 267
    move/from16 v3, p3

    .line 268
    .line 269
    move/from16 v10, v23

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_9
    const/4 v10, 0x1

    .line 273
    if-eqz v22, :cond_a

    .line 274
    .line 275
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    add-int/lit8 v12, v12, -0x1

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_a
    iput v10, v13, Landroidx/fragment/app/c1;->a:I

    .line 282
    .line 283
    iput-boolean v10, v13, Landroidx/fragment/app/c1;->c:Z

    .line 284
    .line 285
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_b
    move/from16 v21, v11

    .line 290
    .line 291
    :goto_7
    iget-object v3, v13, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 292
    .line 293
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    :goto_8
    add-int/2addr v12, v10

    .line 297
    move/from16 v3, p3

    .line 298
    .line 299
    move/from16 v7, v19

    .line 300
    .line 301
    move/from16 v10, v20

    .line 302
    .line 303
    move/from16 v11, v21

    .line 304
    .line 305
    goto/16 :goto_2

    .line 306
    .line 307
    :cond_c
    move/from16 v19, v7

    .line 308
    .line 309
    move/from16 v20, v10

    .line 310
    .line 311
    move/from16 v21, v11

    .line 312
    .line 313
    goto :goto_b

    .line 314
    :cond_d
    move/from16 v19, v7

    .line 315
    .line 316
    move/from16 v20, v10

    .line 317
    .line 318
    move/from16 v21, v11

    .line 319
    .line 320
    const/4 v10, 0x1

    .line 321
    iget-object v3, v1, Landroidx/fragment/app/u0;->N:Ljava/util/ArrayList;

    .line 322
    .line 323
    iget-object v7, v14, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 326
    .line 327
    .line 328
    move-result v9

    .line 329
    sub-int/2addr v9, v10

    .line 330
    :goto_9
    if-ltz v9, :cond_10

    .line 331
    .line 332
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v11

    .line 336
    check-cast v11, Landroidx/fragment/app/c1;

    .line 337
    .line 338
    iget v12, v11, Landroidx/fragment/app/c1;->a:I

    .line 339
    .line 340
    if-eq v12, v10, :cond_f

    .line 341
    .line 342
    const/4 v10, 0x3

    .line 343
    if-eq v12, v10, :cond_e

    .line 344
    .line 345
    packed-switch v12, :pswitch_data_0

    .line 346
    .line 347
    .line 348
    goto :goto_a

    .line 349
    :pswitch_0
    iget-object v12, v11, Landroidx/fragment/app/c1;->h:Landroidx/lifecycle/n;

    .line 350
    .line 351
    iput-object v12, v11, Landroidx/fragment/app/c1;->i:Landroidx/lifecycle/n;

    .line 352
    .line 353
    goto :goto_a

    .line 354
    :pswitch_1
    iget-object v8, v11, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 355
    .line 356
    goto :goto_a

    .line 357
    :pswitch_2
    const/4 v8, 0x0

    .line 358
    goto :goto_a

    .line 359
    :cond_e
    :pswitch_3
    iget-object v11, v11, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 360
    .line 361
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    goto :goto_a

    .line 365
    :cond_f
    const/4 v10, 0x3

    .line 366
    :pswitch_4
    iget-object v11, v11, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 367
    .line 368
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    :goto_a
    add-int/lit8 v9, v9, -0x1

    .line 372
    .line 373
    const/4 v10, 0x1

    .line 374
    goto :goto_9

    .line 375
    :cond_10
    :goto_b
    if-nez v21, :cond_12

    .line 376
    .line 377
    iget-boolean v3, v14, Landroidx/fragment/app/a;->g:Z

    .line 378
    .line 379
    if-eqz v3, :cond_11

    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_11
    const/4 v11, 0x0

    .line 383
    goto :goto_d

    .line 384
    :cond_12
    :goto_c
    const/4 v11, 0x1

    .line 385
    :goto_d
    add-int/lit8 v10, v20, 0x1

    .line 386
    .line 387
    move/from16 v3, p3

    .line 388
    .line 389
    move/from16 v7, v19

    .line 390
    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :cond_13
    move/from16 v19, v7

    .line 394
    .line 395
    move/from16 v21, v11

    .line 396
    .line 397
    iget-object v3, v1, Landroidx/fragment/app/u0;->N:Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 400
    .line 401
    .line 402
    if-nez v19, :cond_16

    .line 403
    .line 404
    iget v3, v1, Landroidx/fragment/app/u0;->v:I

    .line 405
    .line 406
    const/4 v10, 0x1

    .line 407
    if-lt v3, v10, :cond_16

    .line 408
    .line 409
    move/from16 v3, p3

    .line 410
    .line 411
    :goto_e
    if-ge v3, v4, :cond_16

    .line 412
    .line 413
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    check-cast v7, Landroidx/fragment/app/a;

    .line 418
    .line 419
    iget-object v7, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 422
    .line 423
    .line 424
    move-result v8

    .line 425
    const/4 v9, 0x0

    .line 426
    :cond_14
    :goto_f
    if-ge v9, v8, :cond_15

    .line 427
    .line 428
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    add-int/lit8 v9, v9, 0x1

    .line 433
    .line 434
    check-cast v10, Landroidx/fragment/app/c1;

    .line 435
    .line 436
    iget-object v10, v10, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 437
    .line 438
    if-eqz v10, :cond_14

    .line 439
    .line 440
    iget-object v11, v10, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 441
    .line 442
    if-eqz v11, :cond_14

    .line 443
    .line 444
    invoke-virtual {v1, v10}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    invoke-virtual {v5, v10}, Lr1/h;->o(Landroidx/fragment/app/b1;)V

    .line 449
    .line 450
    .line 451
    goto :goto_f

    .line 452
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 453
    .line 454
    goto :goto_e

    .line 455
    :cond_16
    const-string v3, "Unknown cmd: "

    .line 456
    .line 457
    move/from16 v5, p3

    .line 458
    .line 459
    :goto_10
    const/4 v7, -0x1

    .line 460
    if-ge v5, v4, :cond_22

    .line 461
    .line 462
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    check-cast v8, Landroidx/fragment/app/a;

    .line 467
    .line 468
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v9

    .line 472
    check-cast v9, Ljava/lang/Boolean;

    .line 473
    .line 474
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 475
    .line 476
    .line 477
    move-result v9

    .line 478
    if-eqz v9, :cond_1e

    .line 479
    .line 480
    invoke-virtual {v8, v7}, Landroidx/fragment/app/a;->c(I)V

    .line 481
    .line 482
    .line 483
    iget-object v7, v8, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/u0;

    .line 484
    .line 485
    iget-object v9, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 486
    .line 487
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    const/4 v11, 0x1

    .line 492
    sub-int/2addr v10, v11

    .line 493
    :goto_11
    if-ltz v10, :cond_1d

    .line 494
    .line 495
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    check-cast v12, Landroidx/fragment/app/c1;

    .line 500
    .line 501
    iget-object v13, v12, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 502
    .line 503
    if-eqz v13, :cond_1c

    .line 504
    .line 505
    iget-object v14, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 506
    .line 507
    if-nez v14, :cond_17

    .line 508
    .line 509
    goto :goto_12

    .line 510
    :cond_17
    invoke-virtual {v13}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 511
    .line 512
    .line 513
    move-result-object v14

    .line 514
    iput-boolean v11, v14, Landroidx/fragment/app/w;->a:Z

    .line 515
    .line 516
    :goto_12
    iget v11, v8, Landroidx/fragment/app/a;->f:I

    .line 517
    .line 518
    const/16 v14, 0x2002

    .line 519
    .line 520
    const/16 v15, 0x1001

    .line 521
    .line 522
    if-eq v11, v15, :cond_1a

    .line 523
    .line 524
    if-eq v11, v14, :cond_19

    .line 525
    .line 526
    const/16 v14, 0x1004

    .line 527
    .line 528
    const/16 v15, 0x2005

    .line 529
    .line 530
    if-eq v11, v15, :cond_1a

    .line 531
    .line 532
    const/16 v15, 0x1003

    .line 533
    .line 534
    if-eq v11, v15, :cond_19

    .line 535
    .line 536
    if-eq v11, v14, :cond_18

    .line 537
    .line 538
    const/4 v14, 0x0

    .line 539
    goto :goto_13

    .line 540
    :cond_18
    const/16 v14, 0x2005

    .line 541
    .line 542
    goto :goto_13

    .line 543
    :cond_19
    move v14, v15

    .line 544
    :cond_1a
    :goto_13
    iget-object v11, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 545
    .line 546
    if-nez v11, :cond_1b

    .line 547
    .line 548
    if-nez v14, :cond_1b

    .line 549
    .line 550
    goto :goto_14

    .line 551
    :cond_1b
    invoke-virtual {v13}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 552
    .line 553
    .line 554
    iget-object v11, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 555
    .line 556
    iput v14, v11, Landroidx/fragment/app/w;->f:I

    .line 557
    .line 558
    :goto_14
    invoke-virtual {v13}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 559
    .line 560
    .line 561
    iget-object v11, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 562
    .line 563
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    :cond_1c
    iget v11, v12, Landroidx/fragment/app/c1;->a:I

    .line 567
    .line 568
    packed-switch v11, :pswitch_data_1

    .line 569
    .line 570
    .line 571
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 572
    .line 573
    new-instance v2, Ljava/lang/StringBuilder;

    .line 574
    .line 575
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    iget v3, v12, Landroidx/fragment/app/c1;->a:I

    .line 579
    .line 580
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    throw v0

    .line 591
    :pswitch_6
    iget-object v11, v13, Landroidx/fragment/app/z;->S:Landroidx/lifecycle/n;

    .line 592
    .line 593
    iput-object v11, v12, Landroidx/fragment/app/c1;->i:Landroidx/lifecycle/n;

    .line 594
    .line 595
    iget-object v11, v12, Landroidx/fragment/app/c1;->h:Landroidx/lifecycle/n;

    .line 596
    .line 597
    invoke-virtual {v7, v13, v11}, Landroidx/fragment/app/u0;->Y(Landroidx/fragment/app/z;Landroidx/lifecycle/n;)V

    .line 598
    .line 599
    .line 600
    :goto_15
    const/4 v11, 0x1

    .line 601
    goto/16 :goto_16

    .line 602
    .line 603
    :pswitch_7
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->Z(Landroidx/fragment/app/z;)V

    .line 604
    .line 605
    .line 606
    goto :goto_15

    .line 607
    :pswitch_8
    const/4 v11, 0x0

    .line 608
    invoke-virtual {v7, v11}, Landroidx/fragment/app/u0;->Z(Landroidx/fragment/app/z;)V

    .line 609
    .line 610
    .line 611
    goto :goto_15

    .line 612
    :pswitch_9
    iget v11, v12, Landroidx/fragment/app/c1;->d:I

    .line 613
    .line 614
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 615
    .line 616
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 617
    .line 618
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 619
    .line 620
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 621
    .line 622
    .line 623
    const/4 v11, 0x1

    .line 624
    invoke-virtual {v7, v13, v11}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/z;Z)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->h(Landroidx/fragment/app/z;)V

    .line 628
    .line 629
    .line 630
    goto :goto_15

    .line 631
    :pswitch_a
    iget v11, v12, Landroidx/fragment/app/c1;->d:I

    .line 632
    .line 633
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 634
    .line 635
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 636
    .line 637
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 638
    .line 639
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->c(Landroidx/fragment/app/z;)V

    .line 643
    .line 644
    .line 645
    goto :goto_15

    .line 646
    :pswitch_b
    iget v11, v12, Landroidx/fragment/app/c1;->d:I

    .line 647
    .line 648
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 649
    .line 650
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 651
    .line 652
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 653
    .line 654
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 655
    .line 656
    .line 657
    const/4 v11, 0x1

    .line 658
    invoke-virtual {v7, v13, v11}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/z;Z)V

    .line 659
    .line 660
    .line 661
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->I(Landroidx/fragment/app/z;)V

    .line 662
    .line 663
    .line 664
    goto :goto_15

    .line 665
    :pswitch_c
    iget v11, v12, Landroidx/fragment/app/c1;->d:I

    .line 666
    .line 667
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 668
    .line 669
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 670
    .line 671
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 672
    .line 673
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 677
    .line 678
    .line 679
    invoke-static {v13}, Landroidx/fragment/app/u0;->b0(Landroidx/fragment/app/z;)V

    .line 680
    .line 681
    .line 682
    goto :goto_15

    .line 683
    :pswitch_d
    iget v11, v12, Landroidx/fragment/app/c1;->d:I

    .line 684
    .line 685
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 686
    .line 687
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 688
    .line 689
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 690
    .line 691
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->a(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 695
    .line 696
    .line 697
    goto :goto_15

    .line 698
    :pswitch_e
    iget v11, v12, Landroidx/fragment/app/c1;->d:I

    .line 699
    .line 700
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 701
    .line 702
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 703
    .line 704
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 705
    .line 706
    invoke-virtual {v13, v11, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 707
    .line 708
    .line 709
    const/4 v11, 0x1

    .line 710
    invoke-virtual {v7, v13, v11}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/z;Z)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->S(Landroidx/fragment/app/z;)V

    .line 714
    .line 715
    .line 716
    :goto_16
    add-int/lit8 v10, v10, -0x1

    .line 717
    .line 718
    goto/16 :goto_11

    .line 719
    .line 720
    :cond_1d
    move-object/from16 v17, v3

    .line 721
    .line 722
    goto/16 :goto_1c

    .line 723
    .line 724
    :cond_1e
    const/4 v11, 0x1

    .line 725
    invoke-virtual {v8, v11}, Landroidx/fragment/app/a;->c(I)V

    .line 726
    .line 727
    .line 728
    iget-object v7, v8, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/u0;

    .line 729
    .line 730
    iget-object v9, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 731
    .line 732
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 733
    .line 734
    .line 735
    move-result v10

    .line 736
    const/4 v11, 0x0

    .line 737
    :goto_17
    if-ge v11, v10, :cond_1d

    .line 738
    .line 739
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v12

    .line 743
    check-cast v12, Landroidx/fragment/app/c1;

    .line 744
    .line 745
    iget-object v13, v12, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 746
    .line 747
    if-eqz v13, :cond_21

    .line 748
    .line 749
    iget-object v14, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 750
    .line 751
    if-nez v14, :cond_1f

    .line 752
    .line 753
    goto :goto_18

    .line 754
    :cond_1f
    invoke-virtual {v13}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 755
    .line 756
    .line 757
    move-result-object v14

    .line 758
    const/4 v15, 0x0

    .line 759
    iput-boolean v15, v14, Landroidx/fragment/app/w;->a:Z

    .line 760
    .line 761
    :goto_18
    iget v14, v8, Landroidx/fragment/app/a;->f:I

    .line 762
    .line 763
    iget-object v15, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 764
    .line 765
    if-nez v15, :cond_20

    .line 766
    .line 767
    if-nez v14, :cond_20

    .line 768
    .line 769
    goto :goto_19

    .line 770
    :cond_20
    invoke-virtual {v13}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 771
    .line 772
    .line 773
    iget-object v15, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 774
    .line 775
    iput v14, v15, Landroidx/fragment/app/w;->f:I

    .line 776
    .line 777
    :goto_19
    invoke-virtual {v13}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 778
    .line 779
    .line 780
    iget-object v14, v13, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 781
    .line 782
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    :cond_21
    iget v14, v12, Landroidx/fragment/app/c1;->a:I

    .line 786
    .line 787
    packed-switch v14, :pswitch_data_2

    .line 788
    .line 789
    .line 790
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 791
    .line 792
    new-instance v2, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    iget v3, v12, Landroidx/fragment/app/c1;->a:I

    .line 798
    .line 799
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    throw v0

    .line 810
    :pswitch_10
    iget-object v14, v13, Landroidx/fragment/app/z;->S:Landroidx/lifecycle/n;

    .line 811
    .line 812
    iput-object v14, v12, Landroidx/fragment/app/c1;->h:Landroidx/lifecycle/n;

    .line 813
    .line 814
    iget-object v12, v12, Landroidx/fragment/app/c1;->i:Landroidx/lifecycle/n;

    .line 815
    .line 816
    invoke-virtual {v7, v13, v12}, Landroidx/fragment/app/u0;->Y(Landroidx/fragment/app/z;Landroidx/lifecycle/n;)V

    .line 817
    .line 818
    .line 819
    :goto_1a
    move-object/from16 v17, v3

    .line 820
    .line 821
    goto/16 :goto_1b

    .line 822
    .line 823
    :pswitch_11
    const/4 v12, 0x0

    .line 824
    invoke-virtual {v7, v12}, Landroidx/fragment/app/u0;->Z(Landroidx/fragment/app/z;)V

    .line 825
    .line 826
    .line 827
    goto :goto_1a

    .line 828
    :pswitch_12
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->Z(Landroidx/fragment/app/z;)V

    .line 829
    .line 830
    .line 831
    goto :goto_1a

    .line 832
    :pswitch_13
    iget v14, v12, Landroidx/fragment/app/c1;->d:I

    .line 833
    .line 834
    iget v15, v12, Landroidx/fragment/app/c1;->e:I

    .line 835
    .line 836
    move-object/from16 v17, v3

    .line 837
    .line 838
    iget v3, v12, Landroidx/fragment/app/c1;->f:I

    .line 839
    .line 840
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 841
    .line 842
    invoke-virtual {v13, v14, v15, v3, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 843
    .line 844
    .line 845
    const/4 v15, 0x0

    .line 846
    invoke-virtual {v7, v13, v15}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/z;Z)V

    .line 847
    .line 848
    .line 849
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->c(Landroidx/fragment/app/z;)V

    .line 850
    .line 851
    .line 852
    goto :goto_1b

    .line 853
    :pswitch_14
    move-object/from16 v17, v3

    .line 854
    .line 855
    iget v3, v12, Landroidx/fragment/app/c1;->d:I

    .line 856
    .line 857
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 858
    .line 859
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 860
    .line 861
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 862
    .line 863
    invoke-virtual {v13, v3, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->h(Landroidx/fragment/app/z;)V

    .line 867
    .line 868
    .line 869
    goto :goto_1b

    .line 870
    :pswitch_15
    move-object/from16 v17, v3

    .line 871
    .line 872
    iget v3, v12, Landroidx/fragment/app/c1;->d:I

    .line 873
    .line 874
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 875
    .line 876
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 877
    .line 878
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 879
    .line 880
    invoke-virtual {v13, v3, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 881
    .line 882
    .line 883
    const/4 v15, 0x0

    .line 884
    invoke-virtual {v7, v13, v15}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/z;Z)V

    .line 885
    .line 886
    .line 887
    invoke-static {v13}, Landroidx/fragment/app/u0;->b0(Landroidx/fragment/app/z;)V

    .line 888
    .line 889
    .line 890
    goto :goto_1b

    .line 891
    :pswitch_16
    move-object/from16 v17, v3

    .line 892
    .line 893
    iget v3, v12, Landroidx/fragment/app/c1;->d:I

    .line 894
    .line 895
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 896
    .line 897
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 898
    .line 899
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 900
    .line 901
    invoke-virtual {v13, v3, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->I(Landroidx/fragment/app/z;)V

    .line 905
    .line 906
    .line 907
    goto :goto_1b

    .line 908
    :pswitch_17
    move-object/from16 v17, v3

    .line 909
    .line 910
    iget v3, v12, Landroidx/fragment/app/c1;->d:I

    .line 911
    .line 912
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 913
    .line 914
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 915
    .line 916
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 917
    .line 918
    invoke-virtual {v13, v3, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 919
    .line 920
    .line 921
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->S(Landroidx/fragment/app/z;)V

    .line 922
    .line 923
    .line 924
    goto :goto_1b

    .line 925
    :pswitch_18
    move-object/from16 v17, v3

    .line 926
    .line 927
    iget v3, v12, Landroidx/fragment/app/c1;->d:I

    .line 928
    .line 929
    iget v14, v12, Landroidx/fragment/app/c1;->e:I

    .line 930
    .line 931
    iget v15, v12, Landroidx/fragment/app/c1;->f:I

    .line 932
    .line 933
    iget v12, v12, Landroidx/fragment/app/c1;->g:I

    .line 934
    .line 935
    invoke-virtual {v13, v3, v14, v15, v12}, Landroidx/fragment/app/z;->w(IIII)V

    .line 936
    .line 937
    .line 938
    const/4 v15, 0x0

    .line 939
    invoke-virtual {v7, v13, v15}, Landroidx/fragment/app/u0;->X(Landroidx/fragment/app/z;Z)V

    .line 940
    .line 941
    .line 942
    invoke-virtual {v7, v13}, Landroidx/fragment/app/u0;->a(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 943
    .line 944
    .line 945
    :goto_1b
    add-int/lit8 v11, v11, 0x1

    .line 946
    .line 947
    move-object/from16 v3, v17

    .line 948
    .line 949
    goto/16 :goto_17

    .line 950
    .line 951
    :goto_1c
    add-int/lit8 v5, v5, 0x1

    .line 952
    .line 953
    move-object/from16 v3, v17

    .line 954
    .line 955
    goto/16 :goto_10

    .line 956
    .line 957
    :cond_22
    add-int/lit8 v3, v4, -0x1

    .line 958
    .line 959
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v3

    .line 963
    check-cast v3, Ljava/lang/Boolean;

    .line 964
    .line 965
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 966
    .line 967
    .line 968
    move-result v3

    .line 969
    if-eqz v21, :cond_29

    .line 970
    .line 971
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 972
    .line 973
    .line 974
    move-result v5

    .line 975
    if-nez v5, :cond_29

    .line 976
    .line 977
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 978
    .line 979
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 983
    .line 984
    .line 985
    move-result v8

    .line 986
    const/4 v9, 0x0

    .line 987
    :goto_1d
    if-ge v9, v8, :cond_23

    .line 988
    .line 989
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v10

    .line 993
    add-int/lit8 v9, v9, 0x1

    .line 994
    .line 995
    check-cast v10, Landroidx/fragment/app/a;

    .line 996
    .line 997
    invoke-static {v10}, Landroidx/fragment/app/u0;->E(Landroidx/fragment/app/a;)Ljava/util/HashSet;

    .line 998
    .line 999
    .line 1000
    move-result-object v10

    .line 1001
    invoke-interface {v5, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1002
    .line 1003
    .line 1004
    goto :goto_1d

    .line 1005
    :cond_23
    iget-object v8, v1, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 1006
    .line 1007
    if-nez v8, :cond_29

    .line 1008
    .line 1009
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1010
    .line 1011
    .line 1012
    move-result v8

    .line 1013
    const/4 v9, 0x0

    .line 1014
    :goto_1e
    if-ge v9, v8, :cond_26

    .line 1015
    .line 1016
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v10

    .line 1020
    add-int/lit8 v9, v9, 0x1

    .line 1021
    .line 1022
    if-nez v10, :cond_25

    .line 1023
    .line 1024
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v10

    .line 1028
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1029
    .line 1030
    .line 1031
    move-result v11

    .line 1032
    if-nez v11, :cond_24

    .line 1033
    .line 1034
    goto :goto_1e

    .line 1035
    :cond_24
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    check-cast v0, Landroidx/fragment/app/z;

    .line 1040
    .line 1041
    const/16 v16, 0x0

    .line 1042
    .line 1043
    throw v16

    .line 1044
    :cond_25
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1045
    .line 1046
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    throw v0

    .line 1050
    :cond_26
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1051
    .line 1052
    .line 1053
    move-result v8

    .line 1054
    const/4 v9, 0x0

    .line 1055
    :goto_1f
    if-ge v9, v8, :cond_29

    .line 1056
    .line 1057
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v10

    .line 1061
    add-int/lit8 v9, v9, 0x1

    .line 1062
    .line 1063
    if-nez v10, :cond_28

    .line 1064
    .line 1065
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v10

    .line 1069
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1070
    .line 1071
    .line 1072
    move-result v11

    .line 1073
    if-nez v11, :cond_27

    .line 1074
    .line 1075
    goto :goto_1f

    .line 1076
    :cond_27
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    check-cast v0, Landroidx/fragment/app/z;

    .line 1081
    .line 1082
    const/16 v16, 0x0

    .line 1083
    .line 1084
    throw v16

    .line 1085
    :cond_28
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1086
    .line 1087
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1088
    .line 1089
    .line 1090
    throw v0

    .line 1091
    :cond_29
    move/from16 v5, p3

    .line 1092
    .line 1093
    :goto_20
    if-ge v5, v4, :cond_2e

    .line 1094
    .line 1095
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v8

    .line 1099
    check-cast v8, Landroidx/fragment/app/a;

    .line 1100
    .line 1101
    if-eqz v3, :cond_2b

    .line 1102
    .line 1103
    iget-object v9, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1104
    .line 1105
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1106
    .line 1107
    .line 1108
    move-result v9

    .line 1109
    const/16 v18, 0x1

    .line 1110
    .line 1111
    add-int/lit8 v9, v9, -0x1

    .line 1112
    .line 1113
    :goto_21
    if-ltz v9, :cond_2d

    .line 1114
    .line 1115
    iget-object v10, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1116
    .line 1117
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v10

    .line 1121
    check-cast v10, Landroidx/fragment/app/c1;

    .line 1122
    .line 1123
    iget-object v10, v10, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 1124
    .line 1125
    if-eqz v10, :cond_2a

    .line 1126
    .line 1127
    invoke-virtual {v1, v10}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v10

    .line 1131
    invoke-virtual {v10}, Landroidx/fragment/app/b1;->j()V

    .line 1132
    .line 1133
    .line 1134
    :cond_2a
    add-int/lit8 v9, v9, -0x1

    .line 1135
    .line 1136
    goto :goto_21

    .line 1137
    :cond_2b
    iget-object v8, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 1138
    .line 1139
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1140
    .line 1141
    .line 1142
    move-result v9

    .line 1143
    const/4 v10, 0x0

    .line 1144
    :cond_2c
    :goto_22
    if-ge v10, v9, :cond_2d

    .line 1145
    .line 1146
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v11

    .line 1150
    add-int/lit8 v10, v10, 0x1

    .line 1151
    .line 1152
    check-cast v11, Landroidx/fragment/app/c1;

    .line 1153
    .line 1154
    iget-object v11, v11, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 1155
    .line 1156
    if-eqz v11, :cond_2c

    .line 1157
    .line 1158
    invoke-virtual {v1, v11}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v11

    .line 1162
    invoke-virtual {v11}, Landroidx/fragment/app/b1;->j()V

    .line 1163
    .line 1164
    .line 1165
    goto :goto_22

    .line 1166
    :cond_2d
    add-int/lit8 v5, v5, 0x1

    .line 1167
    .line 1168
    goto :goto_20

    .line 1169
    :cond_2e
    iget v5, v1, Landroidx/fragment/app/u0;->v:I

    .line 1170
    .line 1171
    const/4 v11, 0x1

    .line 1172
    invoke-virtual {v1, v5, v11}, Landroidx/fragment/app/u0;->O(IZ)V

    .line 1173
    .line 1174
    .line 1175
    move/from16 v5, p3

    .line 1176
    .line 1177
    invoke-virtual {v1, v0, v5, v4}, Landroidx/fragment/app/u0;->f(Ljava/util/ArrayList;II)Ljava/util/HashSet;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v8

    .line 1181
    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v8

    .line 1185
    :goto_23
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1186
    .line 1187
    .line 1188
    move-result v9

    .line 1189
    if-eqz v9, :cond_30

    .line 1190
    .line 1191
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v9

    .line 1195
    check-cast v9, Landroidx/fragment/app/n;

    .line 1196
    .line 1197
    iput-boolean v3, v9, Landroidx/fragment/app/n;->e:Z

    .line 1198
    .line 1199
    iget-object v10, v9, Landroidx/fragment/app/n;->b:Ljava/util/ArrayList;

    .line 1200
    .line 1201
    monitor-enter v10

    .line 1202
    :try_start_0
    invoke-virtual {v9}, Landroidx/fragment/app/n;->f()V

    .line 1203
    .line 1204
    .line 1205
    iget-object v11, v9, Landroidx/fragment/app/n;->b:Ljava/util/ArrayList;

    .line 1206
    .line 1207
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1208
    .line 1209
    .line 1210
    move-result v12

    .line 1211
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v11

    .line 1215
    invoke-interface {v11}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1216
    .line 1217
    .line 1218
    move-result v12

    .line 1219
    if-nez v12, :cond_2f

    .line 1220
    .line 1221
    const/4 v15, 0x0

    .line 1222
    iput-boolean v15, v9, Landroidx/fragment/app/n;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1223
    .line 1224
    monitor-exit v10

    .line 1225
    invoke-virtual {v9}, Landroidx/fragment/app/n;->c()V

    .line 1226
    .line 1227
    .line 1228
    goto :goto_23

    .line 1229
    :catchall_0
    move-exception v0

    .line 1230
    goto :goto_24

    .line 1231
    :cond_2f
    :try_start_1
    invoke-interface {v11}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v0

    .line 1235
    check-cast v0, Landroidx/fragment/app/g1;

    .line 1236
    .line 1237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1238
    .line 1239
    .line 1240
    const/4 v0, 0x0

    .line 1241
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1242
    :goto_24
    monitor-exit v10

    .line 1243
    throw v0

    .line 1244
    :cond_30
    :goto_25
    if-ge v5, v4, :cond_34

    .line 1245
    .line 1246
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    check-cast v3, Landroidx/fragment/app/a;

    .line 1251
    .line 1252
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v8

    .line 1256
    check-cast v8, Ljava/lang/Boolean;

    .line 1257
    .line 1258
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v8

    .line 1262
    if-eqz v8, :cond_31

    .line 1263
    .line 1264
    iget v8, v3, Landroidx/fragment/app/a;->s:I

    .line 1265
    .line 1266
    if-ltz v8, :cond_31

    .line 1267
    .line 1268
    iput v7, v3, Landroidx/fragment/app/a;->s:I

    .line 1269
    .line 1270
    :cond_31
    iget-object v8, v3, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 1271
    .line 1272
    if-eqz v8, :cond_33

    .line 1273
    .line 1274
    const/4 v10, 0x0

    .line 1275
    :goto_26
    iget-object v8, v3, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 1276
    .line 1277
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1278
    .line 1279
    .line 1280
    move-result v8

    .line 1281
    if-ge v10, v8, :cond_32

    .line 1282
    .line 1283
    iget-object v8, v3, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 1284
    .line 1285
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v8

    .line 1289
    check-cast v8, Ljava/lang/Runnable;

    .line 1290
    .line 1291
    invoke-interface {v8}, Ljava/lang/Runnable;->run()V

    .line 1292
    .line 1293
    .line 1294
    add-int/lit8 v10, v10, 0x1

    .line 1295
    .line 1296
    goto :goto_26

    .line 1297
    :cond_32
    const/4 v11, 0x0

    .line 1298
    iput-object v11, v3, Landroidx/fragment/app/a;->p:Ljava/util/ArrayList;

    .line 1299
    .line 1300
    goto :goto_27

    .line 1301
    :cond_33
    const/4 v11, 0x0

    .line 1302
    :goto_27
    add-int/lit8 v5, v5, 0x1

    .line 1303
    .line 1304
    goto :goto_25

    .line 1305
    :cond_34
    if-eqz v21, :cond_36

    .line 1306
    .line 1307
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1308
    .line 1309
    .line 1310
    move-result v0

    .line 1311
    if-gtz v0, :cond_35

    .line 1312
    .line 1313
    goto :goto_28

    .line 1314
    :cond_35
    const/4 v15, 0x0

    .line 1315
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1323
    .line 1324
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    throw v0

    .line 1328
    :cond_36
    :goto_28
    return-void

    .line 1329
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final C(I)Landroidx/fragment/app/z;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 2
    .line 3
    iget-object v1, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/z;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, Landroidx/fragment/app/z;->D:I

    .line 24
    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, Lr1/h;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroidx/fragment/app/b1;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 58
    .line 59
    iget v2, v1, Landroidx/fragment/app/z;->D:I

    .line 60
    .line 61
    if-ne v2, p1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public final D()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/fragment/app/n;

    .line 20
    .line 21
    iget-boolean v2, v1, Landroidx/fragment/app/n;->f:Z

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-static {v2}, Landroidx/fragment/app/u0;->J(I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const-string v2, "FragmentManager"

    .line 33
    .line 34
    const-string v3, "SpecialEffectsController: Forcing postponed operations"

    .line 35
    .line 36
    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 v2, 0x0

    .line 40
    iput-boolean v2, v1, Landroidx/fragment/app/n;->f:Z

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/fragment/app/n;->c()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-void
.end method

.method public final F(Landroidx/fragment/app/z;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Landroidx/fragment/app/z;->E:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/u0;->x:La/a;

    .line 12
    .line 13
    invoke-virtual {v0}, La/a;->s()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/u0;->x:La/a;

    .line 20
    .line 21
    iget p1, p1, Landroidx/fragment/app/z;->E:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, La/a;->r(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final G()Landroidx/fragment/app/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->G()Landroidx/fragment/app/n0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->A:Landroidx/fragment/app/n0;

    .line 13
    .line 14
    return-object v0
.end method

.method public final H()Lt2/i;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->H()Lt2/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->B:Lt2/i;

    .line 13
    .line 14
    return-object v0
.end method

.method public final I(Landroidx/fragment/app/z;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/z;->G:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Landroidx/fragment/app/z;->G:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/z;->P:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Landroidx/fragment/app/z;->P:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->a0(Landroidx/fragment/app/z;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final L()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-boolean v1, v0, Landroidx/fragment/app/z;->q:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/fragment/app/z;->e()Landroidx/fragment/app/u0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->L()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public final O(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, Landroidx/fragment/app/u0;->v:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_2
    iput p1, p0, Landroidx/fragment/app/u0;->v:I

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 27
    .line 28
    iget-object p2, p1, Lr1/h;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/HashMap;

    .line 31
    .line 32
    iget-object v0, p1, Lr1/h;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    move v3, v2

    .line 42
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    check-cast v4, Landroidx/fragment/app/z;

    .line 51
    .line 52
    iget-object v4, v4, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Landroidx/fragment/app/b1;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4}, Landroidx/fragment/app/b1;->j()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroidx/fragment/app/b1;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/b1;->j()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 92
    .line 93
    iget-boolean v3, v1, Landroidx/fragment/app/z;->r:Z

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/fragment/app/z;->i()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lr1/h;->p(Landroidx/fragment/app/b1;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->c0()V

    .line 108
    .line 109
    .line 110
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 115
    .line 116
    if-eqz p1, :cond_7

    .line 117
    .line 118
    iget p2, p0, Landroidx/fragment/app/u0;->v:I

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    if-ne p2, v0, :cond_7

    .line 122
    .line 123
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 124
    .line 125
    invoke-virtual {p1}, Landroidx/activity/s;->invalidateMenu()V

    .line 126
    .line 127
    .line 128
    iput-boolean v2, p0, Landroidx/fragment/app/u0;->G:Z

    .line 129
    .line 130
    :cond_7
    :goto_3
    return-void
.end method

.method public final P()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->H:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->I:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 12
    .line 13
    iput-boolean v0, v1, Landroidx/fragment/app/y0;->i:Z

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 16
    .line 17
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroidx/fragment/app/z;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/fragment/app/u0;->P()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final Q()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/u0;->z(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/fragment/app/z;->c()Landroidx/fragment/app/u0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroidx/fragment/app/u0;->Q()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, Landroidx/fragment/app/u0;->M:Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v4, -0x1

    .line 29
    invoke-virtual {p0, v2, v3, v4, v0}, Landroidx/fragment/app/u0;->R(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 36
    .line 37
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/fragment/app/u0;->M:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/u0;->T(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->d()V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e0()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->v()V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 60
    .line 61
    iget-object v1, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v1, v2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 75
    .line 76
    .line 77
    return v0
.end method

.method public final R(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, -0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    goto :goto_4

    .line 19
    :cond_1
    if-gez p3, :cond_3

    .line 20
    .line 21
    if-eqz p4, :cond_2

    .line 22
    .line 23
    move v3, v1

    .line 24
    goto :goto_4

    .line 25
    :cond_2
    iget-object p3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    add-int/lit8 v3, p3, -0x1

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_3
    iget-object v2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    sub-int/2addr v2, v0

    .line 41
    :goto_1
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v4, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Landroidx/fragment/app/a;

    .line 50
    .line 51
    if-ltz p3, :cond_4

    .line 52
    .line 53
    iget v4, v4, Landroidx/fragment/app/a;->s:I

    .line 54
    .line 55
    if-ne p3, v4, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 62
    .line 63
    move v3, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    if-eqz p4, :cond_7

    .line 66
    .line 67
    move v3, v2

    .line 68
    :goto_3
    if-lez v3, :cond_9

    .line 69
    .line 70
    iget-object p4, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 71
    .line 72
    add-int/lit8 v2, v3, -0x1

    .line 73
    .line 74
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    check-cast p4, Landroidx/fragment/app/a;

    .line 79
    .line 80
    if-ltz p3, :cond_9

    .line 81
    .line 82
    iget p4, p4, Landroidx/fragment/app/a;->s:I

    .line 83
    .line 84
    if-ne p3, p4, :cond_9

    .line 85
    .line 86
    add-int/lit8 v3, v3, -0x1

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    iget-object p3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    sub-int/2addr p3, v0

    .line 96
    if-ne v2, p3, :cond_8

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 100
    .line 101
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 102
    .line 103
    return v1

    .line 104
    :cond_a
    iget-object p3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    sub-int/2addr p3, v0

    .line 111
    :goto_5
    if-lt p3, v3, :cond_b

    .line 112
    .line 113
    iget-object p4, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    check-cast p4, Landroidx/fragment/app/a;

    .line 120
    .line 121
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    add-int/lit8 p3, p3, -0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_b
    return v0
.end method

.method public final S(Landroidx/fragment/app/z;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, Landroidx/fragment/app/z;->y:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/z;->i()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v1, p1, Landroidx/fragment/app/z;->H:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 50
    .line 51
    iget-object v1, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Landroidx/fragment/app/z;->q:Z

    .line 66
    .line 67
    invoke-static {p1}, Landroidx/fragment/app/u0;->K(Landroidx/fragment/app/z;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p1, Landroidx/fragment/app/z;->r:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->a0(Landroidx/fragment/app/z;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p1
.end method

.method public final T(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroidx/fragment/app/a;

    .line 31
    .line 32
    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/u0;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/fragment/app/a;

    .line 74
    .line 75
    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/u0;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/u0;->B(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string p2, "Internal error with the back stack records"

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public final U(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 40
    .line 41
    iget-object v5, v5, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Landroidx/fragment/app/u0;->m:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 101
    .line 102
    iget-object v6, v6, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 122
    .line 123
    iget-object v4, v3, Lr1/h;->i:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/HashMap;

    .line 126
    .line 127
    iget-object v5, v3, Lr1/h;->h:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "state"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Landroidx/fragment/app/w0;

    .line 144
    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 149
    .line 150
    .line 151
    iget-object v4, v1, Landroidx/fragment/app/w0;->g:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    const/4 v8, 0x0

    .line 158
    :cond_5
    :goto_2
    iget-object v9, v0, Landroidx/fragment/app/u0;->o:Landroidx/emoji2/text/p;

    .line 159
    .line 160
    const-string v10, "): "

    .line 161
    .line 162
    const/4 v11, 0x2

    .line 163
    const-string v12, "FragmentManager"

    .line 164
    .line 165
    if-ge v8, v6, :cond_9

    .line 166
    .line 167
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    add-int/lit8 v8, v8, 0x1

    .line 172
    .line 173
    check-cast v13, Ljava/lang/String;

    .line 174
    .line 175
    const/4 v14, 0x0

    .line 176
    invoke-virtual {v3, v14, v13}, Lr1/h;->s(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    if-eqz v13, :cond_5

    .line 181
    .line 182
    invoke-virtual {v13, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    check-cast v14, Landroidx/fragment/app/a1;

    .line 187
    .line 188
    iget-object v15, v0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 189
    .line 190
    iget-object v14, v14, Landroidx/fragment/app/a1;->h:Ljava/lang/String;

    .line 191
    .line 192
    iget-object v15, v15, Landroidx/fragment/app/y0;->d:Ljava/util/HashMap;

    .line 193
    .line 194
    invoke-virtual {v15, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    check-cast v14, Landroidx/fragment/app/z;

    .line 199
    .line 200
    if-eqz v14, :cond_7

    .line 201
    .line 202
    invoke-static {v11}, Landroidx/fragment/app/u0;->J(I)Z

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    if-eqz v15, :cond_6

    .line 207
    .line 208
    new-instance v15, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    move/from16 p1, v11

    .line 211
    .line 212
    const-string v11, "restoreSaveState: re-attaching retained "

    .line 213
    .line 214
    invoke-direct {v15, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-static {v12, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_6
    move/from16 p1, v11

    .line 229
    .line 230
    :goto_3
    new-instance v11, Landroidx/fragment/app/b1;

    .line 231
    .line 232
    invoke-direct {v11, v9, v3, v14, v13}, Landroidx/fragment/app/b1;-><init>(Landroidx/emoji2/text/p;Lr1/h;Landroidx/fragment/app/z;Landroid/os/Bundle;)V

    .line 233
    .line 234
    .line 235
    move-object v9, v13

    .line 236
    goto :goto_4

    .line 237
    :cond_7
    move/from16 p1, v11

    .line 238
    .line 239
    new-instance v15, Landroidx/fragment/app/b1;

    .line 240
    .line 241
    iget-object v9, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 242
    .line 243
    iget-object v9, v9, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 244
    .line 245
    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 246
    .line 247
    .line 248
    move-result-object v18

    .line 249
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->G()Landroidx/fragment/app/n0;

    .line 250
    .line 251
    .line 252
    move-result-object v19

    .line 253
    iget-object v9, v0, Landroidx/fragment/app/u0;->o:Landroidx/emoji2/text/p;

    .line 254
    .line 255
    iget-object v11, v0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 256
    .line 257
    move-object/from16 v16, v9

    .line 258
    .line 259
    move-object/from16 v17, v11

    .line 260
    .line 261
    move-object/from16 v20, v13

    .line 262
    .line 263
    invoke-direct/range {v15 .. v20}, Landroidx/fragment/app/b1;-><init>(Landroidx/emoji2/text/p;Lr1/h;Ljava/lang/ClassLoader;Landroidx/fragment/app/n0;Landroid/os/Bundle;)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v9, v20

    .line 267
    .line 268
    move-object v11, v15

    .line 269
    :goto_4
    iget-object v13, v11, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 270
    .line 271
    iput-object v9, v13, Landroidx/fragment/app/z;->h:Landroid/os/Bundle;

    .line 272
    .line 273
    iput-object v0, v13, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 274
    .line 275
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 276
    .line 277
    .line 278
    move-result v9

    .line 279
    if-eqz v9, :cond_8

    .line 280
    .line 281
    new-instance v9, Ljava/lang/StringBuilder;

    .line 282
    .line 283
    const-string v14, "restoreSaveState: active ("

    .line 284
    .line 285
    invoke-direct {v9, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    iget-object v14, v13, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    invoke-static {v12, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 304
    .line 305
    .line 306
    :cond_8
    iget-object v9, v0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 307
    .line 308
    iget-object v9, v9, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 309
    .line 310
    invoke-virtual {v9}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    invoke-virtual {v11, v9}, Landroidx/fragment/app/b1;->l(Ljava/lang/ClassLoader;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3, v11}, Lr1/h;->o(Landroidx/fragment/app/b1;)V

    .line 318
    .line 319
    .line 320
    iget v9, v0, Landroidx/fragment/app/u0;->v:I

    .line 321
    .line 322
    iput v9, v11, Landroidx/fragment/app/b1;->e:I

    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :cond_9
    move/from16 p1, v11

    .line 327
    .line 328
    iget-object v2, v0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 329
    .line 330
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    new-instance v4, Ljava/util/ArrayList;

    .line 334
    .line 335
    iget-object v2, v2, Landroidx/fragment/app/y0;->d:Ljava/util/HashMap;

    .line 336
    .line 337
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    const/4 v6, 0x0

    .line 349
    :goto_5
    const/4 v8, 0x1

    .line 350
    if-ge v6, v2, :cond_c

    .line 351
    .line 352
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    add-int/lit8 v6, v6, 0x1

    .line 357
    .line 358
    check-cast v11, Landroidx/fragment/app/z;

    .line 359
    .line 360
    iget-object v13, v11, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v5, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v13

    .line 366
    if-eqz v13, :cond_a

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_a
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 370
    .line 371
    .line 372
    move-result v13

    .line 373
    if-eqz v13, :cond_b

    .line 374
    .line 375
    new-instance v13, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v14, "Discarding retained Fragment "

    .line 378
    .line 379
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const-string v14, " that was not found in the set of active Fragments "

    .line 386
    .line 387
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    iget-object v14, v1, Landroidx/fragment/app/w0;->g:Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v13

    .line 399
    invoke-static {v12, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 400
    .line 401
    .line 402
    :cond_b
    iget-object v13, v0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 403
    .line 404
    invoke-virtual {v13, v11}, Landroidx/fragment/app/y0;->f(Landroidx/fragment/app/z;)V

    .line 405
    .line 406
    .line 407
    iput-object v0, v11, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 408
    .line 409
    new-instance v13, Landroidx/fragment/app/b1;

    .line 410
    .line 411
    invoke-direct {v13, v9, v3, v11}, Landroidx/fragment/app/b1;-><init>(Landroidx/emoji2/text/p;Lr1/h;Landroidx/fragment/app/z;)V

    .line 412
    .line 413
    .line 414
    iput v8, v13, Landroidx/fragment/app/b1;->e:I

    .line 415
    .line 416
    invoke-virtual {v13}, Landroidx/fragment/app/b1;->j()V

    .line 417
    .line 418
    .line 419
    iput-boolean v8, v11, Landroidx/fragment/app/z;->r:Z

    .line 420
    .line 421
    invoke-virtual {v13}, Landroidx/fragment/app/b1;->j()V

    .line 422
    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_c
    iget-object v2, v1, Landroidx/fragment/app/w0;->h:Ljava/util/ArrayList;

    .line 426
    .line 427
    iget-object v4, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v4, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 432
    .line 433
    .line 434
    if-eqz v2, :cond_f

    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    const/4 v5, 0x0

    .line 441
    :goto_6
    if-ge v5, v4, :cond_f

    .line 442
    .line 443
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    add-int/lit8 v5, v5, 0x1

    .line 448
    .line 449
    check-cast v6, Ljava/lang/String;

    .line 450
    .line 451
    invoke-virtual {v3, v6}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    if-eqz v9, :cond_e

    .line 456
    .line 457
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 458
    .line 459
    .line 460
    move-result v11

    .line 461
    if-eqz v11, :cond_d

    .line 462
    .line 463
    new-instance v11, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    const-string v13, "restoreSaveState: added ("

    .line 466
    .line 467
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-static {v12, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 484
    .line 485
    .line 486
    :cond_d
    invoke-virtual {v3, v9}, Lr1/h;->c(Landroidx/fragment/app/z;)V

    .line 487
    .line 488
    .line 489
    goto :goto_6

    .line 490
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 491
    .line 492
    const-string v2, "No instantiated fragment for ("

    .line 493
    .line 494
    const-string v3, ")"

    .line 495
    .line 496
    invoke-static {v2, v6, v3}, Ls/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    throw v1

    .line 504
    :cond_f
    iget-object v2, v1, Landroidx/fragment/app/w0;->i:[Landroidx/fragment/app/c;

    .line 505
    .line 506
    if-eqz v2, :cond_17

    .line 507
    .line 508
    new-instance v2, Ljava/util/ArrayList;

    .line 509
    .line 510
    iget-object v4, v1, Landroidx/fragment/app/w0;->i:[Landroidx/fragment/app/c;

    .line 511
    .line 512
    array-length v4, v4

    .line 513
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 514
    .line 515
    .line 516
    iput-object v2, v0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 517
    .line 518
    const/4 v2, 0x0

    .line 519
    :goto_7
    iget-object v4, v1, Landroidx/fragment/app/w0;->i:[Landroidx/fragment/app/c;

    .line 520
    .line 521
    array-length v5, v4

    .line 522
    if-ge v2, v5, :cond_16

    .line 523
    .line 524
    aget-object v4, v4, v2

    .line 525
    .line 526
    iget-object v5, v4, Landroidx/fragment/app/c;->h:Ljava/util/ArrayList;

    .line 527
    .line 528
    new-instance v6, Landroidx/fragment/app/a;

    .line 529
    .line 530
    invoke-direct {v6, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/u0;)V

    .line 531
    .line 532
    .line 533
    iget-object v9, v4, Landroidx/fragment/app/c;->g:[I

    .line 534
    .line 535
    const/4 v11, 0x0

    .line 536
    const/4 v13, 0x0

    .line 537
    :goto_8
    array-length v14, v9

    .line 538
    if-ge v11, v14, :cond_12

    .line 539
    .line 540
    new-instance v14, Landroidx/fragment/app/c1;

    .line 541
    .line 542
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 543
    .line 544
    .line 545
    add-int/lit8 v15, v11, 0x1

    .line 546
    .line 547
    aget v7, v9, v11

    .line 548
    .line 549
    iput v7, v14, Landroidx/fragment/app/c1;->a:I

    .line 550
    .line 551
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    if-eqz v7, :cond_10

    .line 556
    .line 557
    new-instance v7, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    const-string v8, "Instantiate "

    .line 560
    .line 561
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    const-string v8, " op #"

    .line 568
    .line 569
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    const-string v8, " base fragment #"

    .line 576
    .line 577
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    aget v8, v9, v15

    .line 581
    .line 582
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v7

    .line 589
    invoke-static {v12, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 590
    .line 591
    .line 592
    :cond_10
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    .line 593
    .line 594
    .line 595
    move-result-object v7

    .line 596
    iget-object v8, v4, Landroidx/fragment/app/c;->i:[I

    .line 597
    .line 598
    aget v8, v8, v13

    .line 599
    .line 600
    aget-object v7, v7, v8

    .line 601
    .line 602
    iput-object v7, v14, Landroidx/fragment/app/c1;->h:Landroidx/lifecycle/n;

    .line 603
    .line 604
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    iget-object v8, v4, Landroidx/fragment/app/c;->j:[I

    .line 609
    .line 610
    aget v8, v8, v13

    .line 611
    .line 612
    aget-object v7, v7, v8

    .line 613
    .line 614
    iput-object v7, v14, Landroidx/fragment/app/c1;->i:Landroidx/lifecycle/n;

    .line 615
    .line 616
    add-int/lit8 v7, v11, 0x2

    .line 617
    .line 618
    aget v8, v9, v15

    .line 619
    .line 620
    if-eqz v8, :cond_11

    .line 621
    .line 622
    const/4 v8, 0x1

    .line 623
    goto :goto_9

    .line 624
    :cond_11
    const/4 v8, 0x0

    .line 625
    :goto_9
    iput-boolean v8, v14, Landroidx/fragment/app/c1;->c:Z

    .line 626
    .line 627
    add-int/lit8 v8, v11, 0x3

    .line 628
    .line 629
    aget v7, v9, v7

    .line 630
    .line 631
    iput v7, v14, Landroidx/fragment/app/c1;->d:I

    .line 632
    .line 633
    add-int/lit8 v15, v11, 0x4

    .line 634
    .line 635
    aget v8, v9, v8

    .line 636
    .line 637
    iput v8, v14, Landroidx/fragment/app/c1;->e:I

    .line 638
    .line 639
    add-int/lit8 v18, v11, 0x5

    .line 640
    .line 641
    aget v15, v9, v15

    .line 642
    .line 643
    iput v15, v14, Landroidx/fragment/app/c1;->f:I

    .line 644
    .line 645
    add-int/lit8 v11, v11, 0x6

    .line 646
    .line 647
    move-object/from16 v19, v9

    .line 648
    .line 649
    aget v9, v19, v18

    .line 650
    .line 651
    iput v9, v14, Landroidx/fragment/app/c1;->g:I

    .line 652
    .line 653
    iput v7, v6, Landroidx/fragment/app/a;->b:I

    .line 654
    .line 655
    iput v8, v6, Landroidx/fragment/app/a;->c:I

    .line 656
    .line 657
    iput v15, v6, Landroidx/fragment/app/a;->d:I

    .line 658
    .line 659
    iput v9, v6, Landroidx/fragment/app/a;->e:I

    .line 660
    .line 661
    invoke-virtual {v6, v14}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/c1;)V

    .line 662
    .line 663
    .line 664
    add-int/lit8 v13, v13, 0x1

    .line 665
    .line 666
    move-object/from16 v9, v19

    .line 667
    .line 668
    const/4 v8, 0x1

    .line 669
    goto/16 :goto_8

    .line 670
    .line 671
    :cond_12
    iget v7, v4, Landroidx/fragment/app/c;->k:I

    .line 672
    .line 673
    iput v7, v6, Landroidx/fragment/app/a;->f:I

    .line 674
    .line 675
    iget-object v7, v4, Landroidx/fragment/app/c;->l:Ljava/lang/String;

    .line 676
    .line 677
    iput-object v7, v6, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    .line 678
    .line 679
    const/4 v7, 0x1

    .line 680
    iput-boolean v7, v6, Landroidx/fragment/app/a;->g:Z

    .line 681
    .line 682
    iget v7, v4, Landroidx/fragment/app/c;->n:I

    .line 683
    .line 684
    iput v7, v6, Landroidx/fragment/app/a;->i:I

    .line 685
    .line 686
    iget-object v7, v4, Landroidx/fragment/app/c;->o:Ljava/lang/CharSequence;

    .line 687
    .line 688
    iput-object v7, v6, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    .line 689
    .line 690
    iget v7, v4, Landroidx/fragment/app/c;->p:I

    .line 691
    .line 692
    iput v7, v6, Landroidx/fragment/app/a;->k:I

    .line 693
    .line 694
    iget-object v7, v4, Landroidx/fragment/app/c;->q:Ljava/lang/CharSequence;

    .line 695
    .line 696
    iput-object v7, v6, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    .line 697
    .line 698
    iget-object v7, v4, Landroidx/fragment/app/c;->r:Ljava/util/ArrayList;

    .line 699
    .line 700
    iput-object v7, v6, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    .line 701
    .line 702
    iget-object v7, v4, Landroidx/fragment/app/c;->s:Ljava/util/ArrayList;

    .line 703
    .line 704
    iput-object v7, v6, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 705
    .line 706
    iget-boolean v7, v4, Landroidx/fragment/app/c;->t:Z

    .line 707
    .line 708
    iput-boolean v7, v6, Landroidx/fragment/app/a;->o:Z

    .line 709
    .line 710
    iget v4, v4, Landroidx/fragment/app/c;->m:I

    .line 711
    .line 712
    iput v4, v6, Landroidx/fragment/app/a;->s:I

    .line 713
    .line 714
    const/4 v4, 0x0

    .line 715
    :goto_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 716
    .line 717
    .line 718
    move-result v7

    .line 719
    if-ge v4, v7, :cond_14

    .line 720
    .line 721
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v7

    .line 725
    check-cast v7, Ljava/lang/String;

    .line 726
    .line 727
    if-eqz v7, :cond_13

    .line 728
    .line 729
    iget-object v8, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 730
    .line 731
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v8

    .line 735
    check-cast v8, Landroidx/fragment/app/c1;

    .line 736
    .line 737
    invoke-virtual {v3, v7}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 738
    .line 739
    .line 740
    move-result-object v7

    .line 741
    iput-object v7, v8, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 742
    .line 743
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 744
    .line 745
    goto :goto_a

    .line 746
    :cond_14
    const/4 v7, 0x1

    .line 747
    invoke-virtual {v6, v7}, Landroidx/fragment/app/a;->c(I)V

    .line 748
    .line 749
    .line 750
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-eqz v4, :cond_15

    .line 755
    .line 756
    new-instance v4, Ljava/lang/StringBuilder;

    .line 757
    .line 758
    const-string v5, "restoreAllState: back stack #"

    .line 759
    .line 760
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    const-string v5, " (index "

    .line 767
    .line 768
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    iget v5, v6, Landroidx/fragment/app/a;->s:I

    .line 772
    .line 773
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    invoke-static {v12, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 787
    .line 788
    .line 789
    new-instance v4, Landroidx/fragment/app/e1;

    .line 790
    .line 791
    invoke-direct {v4}, Landroidx/fragment/app/e1;-><init>()V

    .line 792
    .line 793
    .line 794
    new-instance v5, Ljava/io/PrintWriter;

    .line 795
    .line 796
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 797
    .line 798
    .line 799
    const-string v4, "  "

    .line 800
    .line 801
    const/4 v8, 0x0

    .line 802
    invoke-virtual {v6, v4, v5, v8}, Landroidx/fragment/app/a;->g(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :cond_15
    const/4 v8, 0x0

    .line 810
    :goto_b
    iget-object v4, v0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 811
    .line 812
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    add-int/lit8 v2, v2, 0x1

    .line 816
    .line 817
    move v8, v7

    .line 818
    goto/16 :goto_7

    .line 819
    .line 820
    :cond_16
    const/4 v8, 0x0

    .line 821
    goto :goto_c

    .line 822
    :cond_17
    const/4 v8, 0x0

    .line 823
    new-instance v2, Ljava/util/ArrayList;

    .line 824
    .line 825
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 826
    .line 827
    .line 828
    iput-object v2, v0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 829
    .line 830
    :goto_c
    iget-object v2, v0, Landroidx/fragment/app/u0;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 831
    .line 832
    iget v4, v1, Landroidx/fragment/app/w0;->j:I

    .line 833
    .line 834
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 835
    .line 836
    .line 837
    iget-object v2, v1, Landroidx/fragment/app/w0;->k:Ljava/lang/String;

    .line 838
    .line 839
    if-eqz v2, :cond_18

    .line 840
    .line 841
    invoke-virtual {v3, v2}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    iput-object v2, v0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 846
    .line 847
    invoke-virtual {v0, v2}, Landroidx/fragment/app/u0;->r(Landroidx/fragment/app/z;)V

    .line 848
    .line 849
    .line 850
    :cond_18
    iget-object v2, v1, Landroidx/fragment/app/w0;->l:Ljava/util/ArrayList;

    .line 851
    .line 852
    if-eqz v2, :cond_19

    .line 853
    .line 854
    move v7, v8

    .line 855
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 856
    .line 857
    .line 858
    move-result v3

    .line 859
    if-ge v7, v3, :cond_19

    .line 860
    .line 861
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    check-cast v3, Ljava/lang/String;

    .line 866
    .line 867
    iget-object v4, v1, Landroidx/fragment/app/w0;->m:Ljava/util/ArrayList;

    .line 868
    .line 869
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v4

    .line 873
    check-cast v4, Landroidx/fragment/app/d;

    .line 874
    .line 875
    iget-object v5, v0, Landroidx/fragment/app/u0;->l:Ljava/util/Map;

    .line 876
    .line 877
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    add-int/lit8 v7, v7, 0x1

    .line 881
    .line 882
    goto :goto_d

    .line 883
    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 884
    .line 885
    iget-object v1, v1, Landroidx/fragment/app/w0;->n:Ljava/util/ArrayList;

    .line 886
    .line 887
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 888
    .line 889
    .line 890
    iput-object v2, v0, Landroidx/fragment/app/u0;->F:Ljava/util/ArrayDeque;

    .line 891
    .line 892
    return-void
.end method

.method public final V()Landroid/os/Bundle;
    .locals 15

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->D()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->x()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {p0, v1}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 14
    .line 15
    .line 16
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 19
    .line 20
    iput-boolean v1, v2, Landroidx/fragment/app/y0;->i:Z

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v3, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x2

    .line 54
    if-eqz v4, :cond_8

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Landroidx/fragment/app/b1;

    .line 61
    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    iget-object v7, v4, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 65
    .line 66
    iget-object v8, v7, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 67
    .line 68
    new-instance v9, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v10, v4, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 74
    .line 75
    iget v11, v10, Landroidx/fragment/app/z;->g:I

    .line 76
    .line 77
    const/4 v12, -0x1

    .line 78
    if-ne v11, v12, :cond_1

    .line 79
    .line 80
    iget-object v11, v10, Landroidx/fragment/app/z;->h:Landroid/os/Bundle;

    .line 81
    .line 82
    if-eqz v11, :cond_1

    .line 83
    .line 84
    invoke-virtual {v9, v11}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    :cond_1
    new-instance v11, Landroidx/fragment/app/a1;

    .line 88
    .line 89
    invoke-direct {v11, v10}, Landroidx/fragment/app/a1;-><init>(Landroidx/fragment/app/z;)V

    .line 90
    .line 91
    .line 92
    const-string v12, "state"

    .line 93
    .line 94
    invoke-virtual {v9, v12, v11}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 95
    .line 96
    .line 97
    iget v11, v10, Landroidx/fragment/app/z;->g:I

    .line 98
    .line 99
    if-lez v11, :cond_6

    .line 100
    .line 101
    new-instance v11, Landroid/os/Bundle;

    .line 102
    .line 103
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10, v11}, Landroidx/fragment/app/z;->q(Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    if-nez v12, :cond_2

    .line 114
    .line 115
    const-string v12, "savedInstanceState"

    .line 116
    .line 117
    invoke-virtual {v9, v12, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 118
    .line 119
    .line 120
    :cond_2
    iget-object v4, v4, Landroidx/fragment/app/b1;->a:Landroidx/emoji2/text/p;

    .line 121
    .line 122
    invoke-virtual {v4, v10, v11, v5}, Landroidx/emoji2/text/p;->t(Landroidx/fragment/app/z;Landroid/os/Bundle;Z)V

    .line 123
    .line 124
    .line 125
    new-instance v4, Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 128
    .line 129
    .line 130
    iget-object v5, v10, Landroidx/fragment/app/z;->V:Lc1/e;

    .line 131
    .line 132
    invoke-virtual {v5, v4}, Lc1/e;->c(Landroid/os/Bundle;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_3

    .line 140
    .line 141
    const-string v5, "registryState"

    .line 142
    .line 143
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    iget-object v4, v10, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 147
    .line 148
    invoke-virtual {v4}, Landroidx/fragment/app/u0;->V()Landroid/os/Bundle;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-nez v5, :cond_4

    .line 157
    .line 158
    const-string v5, "childFragmentManager"

    .line 159
    .line 160
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget-object v4, v10, Landroidx/fragment/app/z;->i:Landroid/util/SparseArray;

    .line 164
    .line 165
    if-eqz v4, :cond_5

    .line 166
    .line 167
    const-string v5, "viewState"

    .line 168
    .line 169
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    iget-object v4, v10, Landroidx/fragment/app/z;->j:Landroid/os/Bundle;

    .line 173
    .line 174
    if-eqz v4, :cond_6

    .line 175
    .line 176
    const-string v5, "viewRegistryState"

    .line 177
    .line 178
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 179
    .line 180
    .line 181
    :cond_6
    iget-object v4, v10, Landroidx/fragment/app/z;->l:Landroid/os/Bundle;

    .line 182
    .line 183
    if-eqz v4, :cond_7

    .line 184
    .line 185
    const-string v5, "arguments"

    .line 186
    .line 187
    invoke-virtual {v9, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    invoke-virtual {v1, v9, v8}, Lr1/h;->s(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 191
    .line 192
    .line 193
    iget-object v4, v7, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    invoke-static {v6}, Landroidx/fragment/app/u0;->J(I)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_0

    .line 203
    .line 204
    const-string v4, "FragmentManager"

    .line 205
    .line 206
    new-instance v5, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v6, "Saved state of "

    .line 209
    .line 210
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v6, ": "

    .line 217
    .line 218
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    iget-object v6, v7, Landroidx/fragment/app/z;->h:Landroid/os/Bundle;

    .line 222
    .line 223
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    .line 232
    .line 233
    goto/16 :goto_0

    .line 234
    .line 235
    :cond_8
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 236
    .line 237
    iget-object v1, v1, Lr1/h;->i:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Ljava/util/HashMap;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eqz v3, :cond_9

    .line 246
    .line 247
    invoke-static {v6}, Landroidx/fragment/app/u0;->J(I)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_12

    .line 252
    .line 253
    const-string v1, "FragmentManager"

    .line 254
    .line 255
    const-string v2, "saveAllState: no fragments!"

    .line 256
    .line 257
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    return-object v0

    .line 261
    :cond_9
    iget-object v3, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 262
    .line 263
    iget-object v4, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v4, Ljava/util/ArrayList;

    .line 266
    .line 267
    monitor-enter v4

    .line 268
    :try_start_0
    iget-object v7, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v7, Ljava/util/ArrayList;

    .line 271
    .line 272
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    const/4 v8, 0x0

    .line 277
    if-eqz v7, :cond_a

    .line 278
    .line 279
    monitor-exit v4

    .line 280
    move-object v7, v8

    .line 281
    goto :goto_2

    .line 282
    :catchall_0
    move-exception v0

    .line 283
    goto/16 :goto_6

    .line 284
    .line 285
    :cond_a
    new-instance v7, Ljava/util/ArrayList;

    .line 286
    .line 287
    iget-object v9, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v9, Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 296
    .line 297
    .line 298
    iget-object v3, v3, Lr1/h;->g:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v3, Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    move v10, v5

    .line 307
    :cond_b
    :goto_1
    if-ge v10, v9, :cond_c

    .line 308
    .line 309
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    add-int/lit8 v10, v10, 0x1

    .line 314
    .line 315
    check-cast v11, Landroidx/fragment/app/z;

    .line 316
    .line 317
    iget-object v12, v11, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    invoke-static {v6}, Landroidx/fragment/app/u0;->J(I)Z

    .line 323
    .line 324
    .line 325
    move-result v12

    .line 326
    if-eqz v12, :cond_b

    .line 327
    .line 328
    const-string v12, "FragmentManager"

    .line 329
    .line 330
    new-instance v13, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    const-string v14, "saveAllState: adding fragment ("

    .line 336
    .line 337
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    iget-object v14, v11, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    const-string v14, "): "

    .line 346
    .line 347
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    invoke-static {v12, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    goto :goto_1

    .line 361
    :cond_c
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 362
    :goto_2
    iget-object v3, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    if-lez v3, :cond_e

    .line 369
    .line 370
    new-array v4, v3, [Landroidx/fragment/app/c;

    .line 371
    .line 372
    :goto_3
    if-ge v5, v3, :cond_f

    .line 373
    .line 374
    new-instance v9, Landroidx/fragment/app/c;

    .line 375
    .line 376
    iget-object v10, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    check-cast v10, Landroidx/fragment/app/a;

    .line 383
    .line 384
    invoke-direct {v9, v10}, Landroidx/fragment/app/c;-><init>(Landroidx/fragment/app/a;)V

    .line 385
    .line 386
    .line 387
    aput-object v9, v4, v5

    .line 388
    .line 389
    invoke-static {v6}, Landroidx/fragment/app/u0;->J(I)Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    if-eqz v9, :cond_d

    .line 394
    .line 395
    const-string v9, "FragmentManager"

    .line 396
    .line 397
    new-instance v10, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    const-string v11, "saveAllState: adding back stack #"

    .line 400
    .line 401
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v11, ": "

    .line 408
    .line 409
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    iget-object v11, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v10

    .line 425
    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 429
    .line 430
    goto :goto_3

    .line 431
    :cond_e
    move-object v4, v8

    .line 432
    :cond_f
    new-instance v3, Landroidx/fragment/app/w0;

    .line 433
    .line 434
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 435
    .line 436
    .line 437
    iput-object v8, v3, Landroidx/fragment/app/w0;->k:Ljava/lang/String;

    .line 438
    .line 439
    new-instance v5, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 442
    .line 443
    .line 444
    iput-object v5, v3, Landroidx/fragment/app/w0;->l:Ljava/util/ArrayList;

    .line 445
    .line 446
    new-instance v6, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 449
    .line 450
    .line 451
    iput-object v6, v3, Landroidx/fragment/app/w0;->m:Ljava/util/ArrayList;

    .line 452
    .line 453
    iput-object v2, v3, Landroidx/fragment/app/w0;->g:Ljava/util/ArrayList;

    .line 454
    .line 455
    iput-object v7, v3, Landroidx/fragment/app/w0;->h:Ljava/util/ArrayList;

    .line 456
    .line 457
    iput-object v4, v3, Landroidx/fragment/app/w0;->i:[Landroidx/fragment/app/c;

    .line 458
    .line 459
    iget-object v2, p0, Landroidx/fragment/app/u0;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 460
    .line 461
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    iput v2, v3, Landroidx/fragment/app/w0;->j:I

    .line 466
    .line 467
    iget-object v2, p0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 468
    .line 469
    if-eqz v2, :cond_10

    .line 470
    .line 471
    iget-object v2, v2, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 472
    .line 473
    iput-object v2, v3, Landroidx/fragment/app/w0;->k:Ljava/lang/String;

    .line 474
    .line 475
    :cond_10
    iget-object v2, p0, Landroidx/fragment/app/u0;->l:Ljava/util/Map;

    .line 476
    .line 477
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 482
    .line 483
    .line 484
    iget-object v2, p0, Landroidx/fragment/app/u0;->l:Ljava/util/Map;

    .line 485
    .line 486
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 491
    .line 492
    .line 493
    new-instance v2, Ljava/util/ArrayList;

    .line 494
    .line 495
    iget-object v4, p0, Landroidx/fragment/app/u0;->F:Ljava/util/ArrayDeque;

    .line 496
    .line 497
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 498
    .line 499
    .line 500
    iput-object v2, v3, Landroidx/fragment/app/w0;->n:Ljava/util/ArrayList;

    .line 501
    .line 502
    const-string v2, "state"

    .line 503
    .line 504
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 505
    .line 506
    .line 507
    iget-object v2, p0, Landroidx/fragment/app/u0;->m:Ljava/util/Map;

    .line 508
    .line 509
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 518
    .line 519
    .line 520
    move-result v3

    .line 521
    if-eqz v3, :cond_11

    .line 522
    .line 523
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v3

    .line 527
    check-cast v3, Ljava/lang/String;

    .line 528
    .line 529
    const-string v4, "result_"

    .line 530
    .line 531
    invoke-static {v4, v3}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    iget-object v5, p0, Landroidx/fragment/app/u0;->m:Ljava/util/Map;

    .line 536
    .line 537
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    check-cast v3, Landroid/os/Bundle;

    .line 542
    .line 543
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 544
    .line 545
    .line 546
    goto :goto_4

    .line 547
    :cond_11
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    if-eqz v3, :cond_12

    .line 560
    .line 561
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    check-cast v3, Ljava/lang/String;

    .line 566
    .line 567
    const-string v4, "fragment_"

    .line 568
    .line 569
    invoke-static {v4, v3}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    check-cast v3, Landroid/os/Bundle;

    .line 578
    .line 579
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 580
    .line 581
    .line 582
    goto :goto_5

    .line 583
    :cond_12
    return-object v0

    .line 584
    :goto_6
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 585
    throw v0
.end method

.method public final W()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 14
    .line 15
    iget-object v1, v1, Landroidx/fragment/app/d0;->o:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Landroidx/fragment/app/u0;->P:Landroidx/fragment/app/o;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 23
    .line 24
    iget-object v1, v1, Landroidx/fragment/app/d0;->o:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/fragment/app/u0;->P:Landroidx/fragment/app/o;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method

.method public final X(Landroidx/fragment/app/z;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->F(Landroidx/fragment/app/z;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/g0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/g0;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/g0;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Y(Landroidx/fragment/app/z;Landroidx/lifecycle/n;)V
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/z;->S:Landroidx/lifecycle/n;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Fragment "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2
.end method

.method public final Z(Landroidx/fragment/app/z;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Fragment "

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 55
    .line 56
    iput-object p1, p0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->r(Landroidx/fragment/app/z;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->r(Landroidx/fragment/app/z;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final a(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/z;->R:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lp0/c;->c(Landroidx/fragment/app/z;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lr1/h;->o(Landroidx/fragment/app/b1;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, Landroidx/fragment/app/z;->H:Z

    .line 46
    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Lr1/h;->c(Landroidx/fragment/app/z;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, Landroidx/fragment/app/z;->r:Z

    .line 54
    .line 55
    iput-boolean v1, p1, Landroidx/fragment/app/z;->P:Z

    .line 56
    .line 57
    invoke-static {p1}, Landroidx/fragment/app/u0;->K(Landroidx/fragment/app/z;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 65
    .line 66
    :cond_2
    return-object v0
.end method

.method public final a0(Landroidx/fragment/app/z;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->F(Landroidx/fragment/app/z;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v3, v1, Landroidx/fragment/app/w;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v4, v1, Landroidx/fragment/app/w;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v4, v3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move v3, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v3, v1, Landroidx/fragment/app/w;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v3, v4

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v1, v1, Landroidx/fragment/app/w;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f0800d1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroidx/fragment/app/z;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/w;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/z;->b()Landroidx/fragment/app/w;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, Landroidx/fragment/app/w;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final b(Landroidx/fragment/app/d0;La/a;Landroidx/fragment/app/z;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/fragment/app/u0;->x:La/a;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/u0;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/o0;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Landroidx/fragment/app/o0;-><init>(Landroidx/fragment/app/z;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroidx/activity/s;->getOnBackPressedDispatcher()Landroidx/activity/f0;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Landroidx/fragment/app/u0;->g:Landroidx/activity/f0;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/u0;->j:Landroidx/fragment/app/l0;

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Landroidx/activity/f0;->a(Landroidx/lifecycle/t;Landroidx/activity/y;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 60
    .line 61
    iget-object p1, p1, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 62
    .line 63
    iget-object v0, p1, Landroidx/fragment/app/y0;->e:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v1, p3, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Landroidx/fragment/app/y0;

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    new-instance v1, Landroidx/fragment/app/y0;

    .line 76
    .line 77
    iget-boolean p1, p1, Landroidx/fragment/app/y0;->g:Z

    .line 78
    .line 79
    invoke-direct {v1, p1}, Landroidx/fragment/app/y0;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz p1, :cond_8

    .line 91
    .line 92
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/activity/s;->getViewModelStore()Landroidx/lifecycle/w0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance v0, Landroidx/emoji2/text/t;

    .line 99
    .line 100
    sget-object v1, Landroidx/fragment/app/y0;->j:Landroidx/fragment/app/x0;

    .line 101
    .line 102
    invoke-direct {v0, p1, v1}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/w0;Landroidx/lifecycle/u0;)V

    .line 103
    .line 104
    .line 105
    const-class p1, Landroidx/fragment/app/y0;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 114
    .line 115
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v1, p1}, Landroidx/emoji2/text/t;->j(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/r0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Landroidx/fragment/app/y0;

    .line 124
    .line 125
    iput-object p1, p0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 129
    .line 130
    const-string p2, "Local and anonymous classes can not be ViewModels"

    .line 131
    .line 132
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_8
    new-instance p1, Landroidx/fragment/app/y0;

    .line 137
    .line 138
    invoke-direct {p1, p2}, Landroidx/fragment/app/y0;-><init>(Z)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 142
    .line 143
    :goto_2
    iget-object p1, p0, Landroidx/fragment/app/u0;->O:Landroidx/fragment/app/y0;

    .line 144
    .line 145
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->H:Z

    .line 146
    .line 147
    if-nez v0, :cond_9

    .line 148
    .line 149
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->I:Z

    .line 150
    .line 151
    if-eqz v0, :cond_a

    .line 152
    .line 153
    :cond_9
    const/4 p2, 0x1

    .line 154
    :cond_a
    iput-boolean p2, p1, Landroidx/fragment/app/y0;->i:Z

    .line 155
    .line 156
    iget-object p2, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 157
    .line 158
    iput-object p1, p2, Lr1/h;->j:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 161
    .line 162
    if-eqz p1, :cond_b

    .line 163
    .line 164
    if-nez p3, :cond_b

    .line 165
    .line 166
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 167
    .line 168
    invoke-virtual {p1}, Landroidx/activity/s;->getSavedStateRegistry()Lc1/d;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    new-instance p2, Landroidx/fragment/app/a0;

    .line 173
    .line 174
    const/4 v0, 0x1

    .line 175
    invoke-direct {p2, p0, v0}, Landroidx/fragment/app/a0;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    const-string v0, "android:support:fragments"

    .line 179
    .line 180
    invoke-virtual {p1, v0, p2}, Lc1/d;->c(Ljava/lang/String;Lc1/c;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lc1/d;->a(Ljava/lang/String;)Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p1, :cond_b

    .line 188
    .line 189
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->U(Landroid/os/Bundle;)V

    .line 190
    .line 191
    .line 192
    :cond_b
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 193
    .line 194
    if-eqz p1, :cond_d

    .line 195
    .line 196
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 197
    .line 198
    invoke-virtual {p1}, Landroidx/activity/s;->getActivityResultRegistry()Ld/h;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    if-eqz p3, :cond_c

    .line 203
    .line 204
    new-instance p2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    iget-object v0, p3, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 210
    .line 211
    const-string v1, ":"

    .line 212
    .line 213
    invoke-static {p2, v0, v1}, Ls/c;->d(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    goto :goto_3

    .line 218
    :cond_c
    const-string p2, ""

    .line 219
    .line 220
    :goto_3
    const-string v0, "FragmentManager:"

    .line 221
    .line 222
    invoke-static {v0, p2}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    const-string v0, "StartActivityForResult"

    .line 227
    .line 228
    invoke-static {p2, v0}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    new-instance v1, Landroidx/fragment/app/p0;

    .line 233
    .line 234
    const/4 v2, 0x2

    .line 235
    invoke-direct {v1, v2}, Landroidx/fragment/app/p0;-><init>(I)V

    .line 236
    .line 237
    .line 238
    new-instance v2, Lu1/f;

    .line 239
    .line 240
    const/4 v3, 0x2

    .line 241
    invoke-direct {v2, p0, v3}, Lu1/f;-><init>(Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v0, v1, v2}, Ld/h;->d(Ljava/lang/String;Le/a;Ld/b;)Ld/g;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iput-object v0, p0, Landroidx/fragment/app/u0;->C:Ld/g;

    .line 249
    .line 250
    const-string v0, "StartIntentSenderForResult"

    .line 251
    .line 252
    invoke-static {p2, v0}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    new-instance v1, Landroidx/fragment/app/p0;

    .line 257
    .line 258
    const/4 v2, 0x0

    .line 259
    invoke-direct {v1, v2}, Landroidx/fragment/app/p0;-><init>(I)V

    .line 260
    .line 261
    .line 262
    new-instance v2, Landroidx/fragment/app/k0;

    .line 263
    .line 264
    const/4 v3, 0x1

    .line 265
    invoke-direct {v2, p0, v3}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, v0, v1, v2}, Ld/h;->d(Ljava/lang/String;Le/a;Ld/b;)Ld/g;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iput-object v0, p0, Landroidx/fragment/app/u0;->D:Ld/g;

    .line 273
    .line 274
    const-string v0, "RequestPermissions"

    .line 275
    .line 276
    invoke-static {p2, v0}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    new-instance v0, Landroidx/fragment/app/p0;

    .line 281
    .line 282
    const/4 v1, 0x1

    .line 283
    invoke-direct {v0, v1}, Landroidx/fragment/app/p0;-><init>(I)V

    .line 284
    .line 285
    .line 286
    new-instance v1, Landroidx/fragment/app/k0;

    .line 287
    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/k0;-><init>(Landroidx/fragment/app/u0;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, p2, v0, v1}, Ld/h;->d(Ljava/lang/String;Le/a;Ld/b;)Ld/g;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iput-object p1, p0, Landroidx/fragment/app/u0;->E:Ld/g;

    .line 297
    .line 298
    :cond_d
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 299
    .line 300
    if-eqz p1, :cond_e

    .line 301
    .line 302
    iget-object p2, p0, Landroidx/fragment/app/u0;->q:Landroidx/fragment/app/j0;

    .line 303
    .line 304
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 305
    .line 306
    invoke-virtual {p1, p2}, Landroidx/activity/s;->addOnConfigurationChangedListener(Le0/a;)V

    .line 307
    .line 308
    .line 309
    :cond_e
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 310
    .line 311
    if-eqz p1, :cond_f

    .line 312
    .line 313
    iget-object p2, p0, Landroidx/fragment/app/u0;->r:Landroidx/fragment/app/j0;

    .line 314
    .line 315
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 316
    .line 317
    invoke-virtual {p1, p2}, Landroidx/activity/s;->addOnTrimMemoryListener(Le0/a;)V

    .line 318
    .line 319
    .line 320
    :cond_f
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 321
    .line 322
    if-eqz p1, :cond_10

    .line 323
    .line 324
    iget-object p2, p0, Landroidx/fragment/app/u0;->s:Landroidx/fragment/app/j0;

    .line 325
    .line 326
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 327
    .line 328
    invoke-virtual {p1, p2}, Landroidx/activity/s;->addOnMultiWindowModeChangedListener(Le0/a;)V

    .line 329
    .line 330
    .line 331
    :cond_10
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 332
    .line 333
    if-eqz p1, :cond_11

    .line 334
    .line 335
    iget-object p2, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/j0;

    .line 336
    .line 337
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 338
    .line 339
    invoke-virtual {p1, p2}, Landroidx/activity/s;->addOnPictureInPictureModeChangedListener(Le0/a;)V

    .line 340
    .line 341
    .line 342
    :cond_11
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 343
    .line 344
    if-eqz p1, :cond_12

    .line 345
    .line 346
    if-nez p3, :cond_12

    .line 347
    .line 348
    iget-object p2, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/m0;

    .line 349
    .line 350
    iget-object p1, p1, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 351
    .line 352
    invoke-virtual {p1, p2}, Landroidx/activity/s;->addMenuProvider(Lf0/o;)V

    .line 353
    .line 354
    .line 355
    :cond_12
    return-void

    .line 356
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 357
    .line 358
    const-string p2, "Already attached"

    .line 359
    .line 360
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw p1
.end method

.method public final c(Landroidx/fragment/app/z;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/z;->H:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/z;->H:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/z;->q:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lr1/h;->c(Landroidx/fragment/app/z;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Landroidx/fragment/app/u0;->J(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/u0;->K(Landroidx/fragment/app/z;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final c0()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/h;->j()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    check-cast v4, Landroidx/fragment/app/b1;

    .line 22
    .line 23
    iget-object v5, v4, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 24
    .line 25
    iget-boolean v6, v5, Landroidx/fragment/app/z;->M:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, Landroidx/fragment/app/u0;->b:Z

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iput-boolean v4, p0, Landroidx/fragment/app/u0;->K:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iput-boolean v2, v5, Landroidx/fragment/app/z;->M:Z

    .line 38
    .line 39
    invoke-virtual {v4}, Landroidx/fragment/app/b1;->j()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/u0;->M:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d0(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/e1;

    .line 16
    .line 17
    invoke-direct {v0}, Landroidx/fragment/app/e1;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 38
    .line 39
    invoke-virtual {v0, v6, v5, v2, v4}, Landroidx/fragment/app/e0;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v6, v5, v2, v0}, Landroidx/fragment/app/u0;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception v0

    .line 55
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1
.end method

.method public final e()Ljava/util/HashSet;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 7
    .line 8
    invoke-virtual {v1}, Lr1/h;->j()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Landroidx/fragment/app/b1;

    .line 26
    .line 27
    iget-object v4, v4, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 28
    .line 29
    iget-object v4, v4, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->H()Lt2/i;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "factory"

    .line 38
    .line 39
    invoke-static {v5, v6}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const v5, 0x7f0800a3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    instance-of v7, v6, Landroidx/fragment/app/n;

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    check-cast v6, Landroidx/fragment/app/n;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance v6, Landroidx/fragment/app/n;

    .line 57
    .line 58
    invoke-direct {v6, v4}, Landroidx/fragment/app/n;-><init>(Landroid/view/ViewGroup;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-object v0
.end method

.method public final e0()V
    .locals 5

    .line 1
    const-string v0, "FragmentManager "

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x1

    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget-object v2, p0, Landroidx/fragment/app/u0;->j:Landroidx/fragment/app/l0;

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Landroidx/activity/y;->setEnabled(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {v3}, Landroidx/fragment/app/u0;->J(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const-string v2, "FragmentManager"

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, " enabling OnBackPressedCallback, caused by non-empty pending actions"

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    :goto_0
    monitor-exit v1

    .line 53
    return-void

    .line 54
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    iget-object v0, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v1, p0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/a;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    move v1, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v1, v2

    .line 69
    :goto_1
    add-int/2addr v0, v1

    .line 70
    if-lez v0, :cond_3

    .line 71
    .line 72
    iget-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 73
    .line 74
    invoke-static {v0}, Landroidx/fragment/app/u0;->N(Landroidx/fragment/app/z;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move v4, v2

    .line 82
    :goto_2
    invoke-static {v3}, Landroidx/fragment/app/u0;->J(I)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    const-string v0, "FragmentManager"

    .line 89
    .line 90
    new-instance v1, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "OnBackPressedCallback for FragmentManager "

    .line 93
    .line 94
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v2, " enabled state is "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/u0;->j:Landroidx/fragment/app/l0;

    .line 116
    .line 117
    invoke-virtual {v0, v4}, Landroidx/activity/y;->setEnabled(Z)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    throw v0
.end method

.method public final f(Ljava/util/ArrayList;II)Ljava/util/HashSet;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-ge p2, p3, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroidx/fragment/app/a;

    .line 13
    .line 14
    iget-object v1, v1, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :cond_0
    :goto_1
    if-ge v3, v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    add-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    check-cast v4, Landroidx/fragment/app/c1;

    .line 30
    .line 31
    iget-object v4, v4, Landroidx/fragment/app/c1;->b:Landroidx/fragment/app/z;

    .line 32
    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v4, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->H()Lt2/i;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-string v6, "fragmentManager.specialEffectsControllerFactory"

    .line 44
    .line 45
    invoke-static {v5, v6}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const v5, 0x7f0800a3

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    instance-of v7, v6, Landroidx/fragment/app/n;

    .line 56
    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    check-cast v6, Landroidx/fragment/app/n;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    new-instance v6, Landroidx/fragment/app/n;

    .line 63
    .line 64
    invoke-direct {v6, v4}, Landroidx/fragment/app/n;-><init>(Landroid/view/ViewGroup;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :goto_2
    invoke-virtual {v0, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-object v0
.end method

.method public final g(Landroidx/fragment/app/z;)Landroidx/fragment/app/b1;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 4
    .line 5
    iget-object v2, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/fragment/app/b1;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/fragment/app/b1;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/fragment/app/u0;->o:Landroidx/emoji2/text/p;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/b1;-><init>(Landroidx/emoji2/text/p;Lr1/h;Landroidx/fragment/app/z;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroidx/fragment/app/b1;->l(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Landroidx/fragment/app/u0;->v:I

    .line 37
    .line 38
    iput p1, v0, Landroidx/fragment/app/b1;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final h(Landroidx/fragment/app/z;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, Landroidx/fragment/app/z;->H:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Landroidx/fragment/app/z;->H:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Landroidx/fragment/app/z;->q:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Landroidx/fragment/app/u0;->J(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 62
    .line 63
    iget-object v1, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Lr1/h;->g:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Landroidx/fragment/app/z;->q:Z

    .line 78
    .line 79
    invoke-static {p1}, Landroidx/fragment/app/u0;->K(Landroidx/fragment/app/z;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, Landroidx/fragment/app/u0;->G:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->a0(Landroidx/fragment/app/z;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_3
    return-void
.end method

.method public final i(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->d0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 21
    .line 22
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroidx/fragment/app/z;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, Landroidx/fragment/app/z;->K:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroidx/fragment/app/u0;->i(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final j()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/z;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/z;->G:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/u0;->j()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final k()Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroidx/fragment/app/z;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Landroidx/fragment/app/u0;->M(Landroidx/fragment/app/z;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Landroidx/fragment/app/z;->G:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 45
    .line 46
    invoke-virtual {v6}, Landroidx/fragment/app/u0;->k()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroidx/fragment/app/z;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final l()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->J:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->x()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iget-object v0, v2, Lr1/h;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/fragment/app/y0;

    .line 19
    .line 20
    iget-boolean v0, v0, Landroidx/fragment/app/y0;->h:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, v1, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    xor-int/2addr v0, v1

    .line 32
    :cond_1
    :goto_0
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/fragment/app/u0;->l:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Landroidx/fragment/app/d;

    .line 55
    .line 56
    iget-object v1, v1, Landroidx/fragment/app/d;->g:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v4, 0x0

    .line 63
    move v5, v4

    .line 64
    :goto_1
    if-ge v5, v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    check-cast v6, Ljava/lang/String;

    .line 73
    .line 74
    iget-object v7, v2, Lr1/h;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v7, Landroidx/fragment/app/y0;

    .line 77
    .line 78
    invoke-virtual {v7, v6, v4}, Landroidx/fragment/app/y0;->d(Ljava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const/4 v0, -0x1

    .line 83
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->u(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/fragment/app/u0;->r:Landroidx/fragment/app/j0;

    .line 91
    .line 92
    iget-object v0, v0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroidx/activity/s;->removeOnTrimMemoryListener(Le0/a;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    iget-object v1, p0, Landroidx/fragment/app/u0;->q:Landroidx/fragment/app/j0;

    .line 102
    .line 103
    iget-object v0, v0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroidx/activity/s;->removeOnConfigurationChangedListener(Le0/a;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    iget-object v1, p0, Landroidx/fragment/app/u0;->s:Landroidx/fragment/app/j0;

    .line 113
    .line 114
    iget-object v0, v0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Landroidx/activity/s;->removeOnMultiWindowModeChangedListener(Le0/a;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    iget-object v1, p0, Landroidx/fragment/app/u0;->t:Landroidx/fragment/app/j0;

    .line 124
    .line 125
    iget-object v0, v0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Landroidx/activity/s;->removeOnPictureInPictureModeChangedListener(Le0/a;)V

    .line 128
    .line 129
    .line 130
    :cond_7
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 131
    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    iget-object v1, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 135
    .line 136
    if-nez v1, :cond_8

    .line 137
    .line 138
    iget-object v1, p0, Landroidx/fragment/app/u0;->u:Landroidx/fragment/app/m0;

    .line 139
    .line 140
    iget-object v0, v0, Landroidx/fragment/app/d0;->q:Lg/k;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Landroidx/activity/s;->removeMenuProvider(Lf0/o;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    const/4 v0, 0x0

    .line 146
    iput-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 147
    .line 148
    iput-object v0, p0, Landroidx/fragment/app/u0;->x:La/a;

    .line 149
    .line 150
    iput-object v0, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 151
    .line 152
    iget-object v1, p0, Landroidx/fragment/app/u0;->g:Landroidx/activity/f0;

    .line 153
    .line 154
    if-eqz v1, :cond_9

    .line 155
    .line 156
    iget-object v1, p0, Landroidx/fragment/app/u0;->j:Landroidx/fragment/app/l0;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroidx/activity/y;->remove()V

    .line 159
    .line 160
    .line 161
    iput-object v0, p0, Landroidx/fragment/app/u0;->g:Landroidx/activity/f0;

    .line 162
    .line 163
    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/u0;->C:Ld/g;

    .line 164
    .line 165
    if-eqz v0, :cond_a

    .line 166
    .line 167
    invoke-virtual {v0}, Ld/g;->b()V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Landroidx/fragment/app/u0;->D:Ld/g;

    .line 171
    .line 172
    invoke-virtual {v0}, Ld/g;->b()V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Landroidx/fragment/app/u0;->E:Ld/g;

    .line 176
    .line 177
    invoke-virtual {v0}, Ld/g;->b()V

    .line 178
    .line 179
    .line 180
    :cond_a
    return-void
.end method

.method public final m(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->d0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 21
    .line 22
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroidx/fragment/app/z;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, Landroidx/fragment/app/z;->K:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroidx/fragment/app/u0;->m(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final n(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->d0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 21
    .line 22
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroidx/fragment/app/z;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, Landroidx/fragment/app/u0;->n(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr1/h;->k()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, Landroidx/fragment/app/z;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Landroidx/fragment/app/z;->h()Z

    .line 25
    .line 26
    .line 27
    iget-object v3, v3, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 28
    .line 29
    invoke-virtual {v3}, Landroidx/fragment/app/u0;->o()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public final p()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/z;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/z;->G:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/u0;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final q()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/fragment/app/z;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, Landroidx/fragment/app/z;->G:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/u0;->q()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final r(Landroidx/fragment/app/z;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroidx/fragment/app/u0;->N(Landroidx/fragment/app/z;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p1, Landroidx/fragment/app/z;->p:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p1, Landroidx/fragment/app/z;->p:Ljava/lang/Boolean;

    .line 41
    .line 42
    iget-object p1, p1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/fragment/app/u0;->e0()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, Landroidx/fragment/app/u0;->z:Landroidx/fragment/app/z;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroidx/fragment/app/u0;->r(Landroidx/fragment/app/z;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final s(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/u0;->d0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 21
    .line 22
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Landroidx/fragment/app/z;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, Landroidx/fragment/app/u0;->s(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final t()Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/fragment/app/u0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr1/h;->m()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/fragment/app/z;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, Landroidx/fragment/app/u0;->M(Landroidx/fragment/app/z;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-boolean v5, v4, Landroidx/fragment/app/z;->G:Z

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    iget-object v4, v4, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/fragment/app/u0;->t()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v4, v1

    .line 51
    :goto_1
    if-eqz v4, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v1, "null"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v1, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final u(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 6
    .line 7
    iget-object v2, v2, Lr1/h;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroidx/fragment/app/b1;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Landroidx/fragment/app/b1;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/u0;->O(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/fragment/app/n;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/n;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroidx/fragment/app/u0;->A(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/u0;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/fragment/app/u0;->K:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->c0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 8
    .line 9
    iget-object v2, v1, Lr1/h;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "    "

    .line 14
    .line 15
    invoke-static {p1, v3}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v1, v1, Lr1/h;->h:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_1b

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v4, "Active Fragments:"

    .line 33
    .line 34
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1b

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Landroidx/fragment/app/b1;

    .line 56
    .line 57
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-eqz v4, :cond_1a

    .line 61
    .line 62
    iget-object v4, v4, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/z;

    .line 63
    .line 64
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v5, "mFragmentId=#"

    .line 74
    .line 75
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget v5, v4, Landroidx/fragment/app/z;->D:I

    .line 79
    .line 80
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v5, " mContainerId=#"

    .line 88
    .line 89
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget v5, v4, Landroidx/fragment/app/z;->E:I

    .line 93
    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v5, " mTag="

    .line 102
    .line 103
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v5, v4, Landroidx/fragment/app/z;->F:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v5, "mState="

    .line 115
    .line 116
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget v5, v4, Landroidx/fragment/app/z;->g:I

    .line 120
    .line 121
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 122
    .line 123
    .line 124
    const-string v5, " mWho="

    .line 125
    .line 126
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v5, v4, Landroidx/fragment/app/z;->k:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v5, " mBackStackNesting="

    .line 135
    .line 136
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget v5, v4, Landroidx/fragment/app/z;->y:I

    .line 140
    .line 141
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string v5, "mAdded="

    .line 148
    .line 149
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v5, v4, Landroidx/fragment/app/z;->q:Z

    .line 153
    .line 154
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 155
    .line 156
    .line 157
    const-string v5, " mRemoving="

    .line 158
    .line 159
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-boolean v5, v4, Landroidx/fragment/app/z;->r:Z

    .line 163
    .line 164
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 165
    .line 166
    .line 167
    const-string v5, " mFromLayout="

    .line 168
    .line 169
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-boolean v5, v4, Landroidx/fragment/app/z;->t:Z

    .line 173
    .line 174
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 175
    .line 176
    .line 177
    const-string v5, " mInLayout="

    .line 178
    .line 179
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v5, v4, Landroidx/fragment/app/z;->u:Z

    .line 183
    .line 184
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const-string v5, "mHidden="

    .line 191
    .line 192
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iget-boolean v5, v4, Landroidx/fragment/app/z;->G:Z

    .line 196
    .line 197
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 198
    .line 199
    .line 200
    const-string v5, " mDetached="

    .line 201
    .line 202
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-boolean v5, v4, Landroidx/fragment/app/z;->H:Z

    .line 206
    .line 207
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 208
    .line 209
    .line 210
    const-string v5, " mMenuVisible="

    .line 211
    .line 212
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-boolean v5, v4, Landroidx/fragment/app/z;->J:Z

    .line 216
    .line 217
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 218
    .line 219
    .line 220
    const-string v5, " mHasMenu="

    .line 221
    .line 222
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v6, "mRetainInstance="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, Landroidx/fragment/app/z;->I:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mUserVisibleHint="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-boolean v6, v4, Landroidx/fragment/app/z;->N:Z

    .line 248
    .line 249
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v6, v4, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 253
    .line 254
    if-eqz v6, :cond_0

    .line 255
    .line 256
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string v6, "mFragmentManager="

    .line 260
    .line 261
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-object v6, v4, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 265
    .line 266
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_0
    iget-object v6, v4, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 270
    .line 271
    if-eqz v6, :cond_1

    .line 272
    .line 273
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v6, "mHost="

    .line 277
    .line 278
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object v6, v4, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 282
    .line 283
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_1
    iget-object v6, v4, Landroidx/fragment/app/z;->C:Landroidx/fragment/app/z;

    .line 287
    .line 288
    if-eqz v6, :cond_2

    .line 289
    .line 290
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v6, "mParentFragment="

    .line 294
    .line 295
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v6, v4, Landroidx/fragment/app/z;->C:Landroidx/fragment/app/z;

    .line 299
    .line 300
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_2
    iget-object v6, v4, Landroidx/fragment/app/z;->l:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v6, :cond_3

    .line 306
    .line 307
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string v6, "mArguments="

    .line 311
    .line 312
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v6, v4, Landroidx/fragment/app/z;->l:Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_3
    iget-object v6, v4, Landroidx/fragment/app/z;->h:Landroid/os/Bundle;

    .line 321
    .line 322
    if-eqz v6, :cond_4

    .line 323
    .line 324
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v6, "mSavedFragmentState="

    .line 328
    .line 329
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v6, v4, Landroidx/fragment/app/z;->h:Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_4
    iget-object v6, v4, Landroidx/fragment/app/z;->i:Landroid/util/SparseArray;

    .line 338
    .line 339
    if-eqz v6, :cond_5

    .line 340
    .line 341
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v6, "mSavedViewState="

    .line 345
    .line 346
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v6, v4, Landroidx/fragment/app/z;->i:Landroid/util/SparseArray;

    .line 350
    .line 351
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/z;->j:Landroid/os/Bundle;

    .line 355
    .line 356
    if-eqz v6, :cond_6

    .line 357
    .line 358
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v6, "mSavedViewRegistryState="

    .line 362
    .line 363
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v6, v4, Landroidx/fragment/app/z;->j:Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/z;->m:Landroidx/fragment/app/z;

    .line 372
    .line 373
    const/4 v7, 0x0

    .line 374
    if-eqz v6, :cond_7

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_7
    iget-object v6, v4, Landroidx/fragment/app/z;->z:Landroidx/fragment/app/u0;

    .line 378
    .line 379
    if-eqz v6, :cond_8

    .line 380
    .line 381
    iget-object v8, v4, Landroidx/fragment/app/z;->n:Ljava/lang/String;

    .line 382
    .line 383
    if-eqz v8, :cond_8

    .line 384
    .line 385
    iget-object v6, v6, Landroidx/fragment/app/u0;->c:Lr1/h;

    .line 386
    .line 387
    invoke-virtual {v6, v8}, Lr1/h;->e(Ljava/lang/String;)Landroidx/fragment/app/z;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    goto :goto_1

    .line 392
    :cond_8
    move-object v6, v7

    .line 393
    :goto_1
    if-eqz v6, :cond_9

    .line 394
    .line 395
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    const-string v8, "mTarget="

    .line 399
    .line 400
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    const-string v6, " mTargetRequestCode="

    .line 407
    .line 408
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget v6, v4, Landroidx/fragment/app/z;->o:I

    .line 412
    .line 413
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 414
    .line 415
    .line 416
    :cond_9
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const-string v6, "mPopDirection="

    .line 420
    .line 421
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 425
    .line 426
    if-nez v6, :cond_a

    .line 427
    .line 428
    move v6, v5

    .line 429
    goto :goto_2

    .line 430
    :cond_a
    iget-boolean v6, v6, Landroidx/fragment/app/w;->a:Z

    .line 431
    .line 432
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 433
    .line 434
    .line 435
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 436
    .line 437
    if-nez v6, :cond_b

    .line 438
    .line 439
    move v6, v5

    .line 440
    goto :goto_3

    .line 441
    :cond_b
    iget v6, v6, Landroidx/fragment/app/w;->b:I

    .line 442
    .line 443
    :goto_3
    if-eqz v6, :cond_d

    .line 444
    .line 445
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    const-string v6, "getEnterAnim="

    .line 449
    .line 450
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 454
    .line 455
    if-nez v6, :cond_c

    .line 456
    .line 457
    move v6, v5

    .line 458
    goto :goto_4

    .line 459
    :cond_c
    iget v6, v6, Landroidx/fragment/app/w;->b:I

    .line 460
    .line 461
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 462
    .line 463
    .line 464
    :cond_d
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 465
    .line 466
    if-nez v6, :cond_e

    .line 467
    .line 468
    move v6, v5

    .line 469
    goto :goto_5

    .line 470
    :cond_e
    iget v6, v6, Landroidx/fragment/app/w;->c:I

    .line 471
    .line 472
    :goto_5
    if-eqz v6, :cond_10

    .line 473
    .line 474
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const-string v6, "getExitAnim="

    .line 478
    .line 479
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 483
    .line 484
    if-nez v6, :cond_f

    .line 485
    .line 486
    move v6, v5

    .line 487
    goto :goto_6

    .line 488
    :cond_f
    iget v6, v6, Landroidx/fragment/app/w;->c:I

    .line 489
    .line 490
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 491
    .line 492
    .line 493
    :cond_10
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 494
    .line 495
    if-nez v6, :cond_11

    .line 496
    .line 497
    move v6, v5

    .line 498
    goto :goto_7

    .line 499
    :cond_11
    iget v6, v6, Landroidx/fragment/app/w;->d:I

    .line 500
    .line 501
    :goto_7
    if-eqz v6, :cond_13

    .line 502
    .line 503
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    const-string v6, "getPopEnterAnim="

    .line 507
    .line 508
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 512
    .line 513
    if-nez v6, :cond_12

    .line 514
    .line 515
    move v6, v5

    .line 516
    goto :goto_8

    .line 517
    :cond_12
    iget v6, v6, Landroidx/fragment/app/w;->d:I

    .line 518
    .line 519
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 520
    .line 521
    .line 522
    :cond_13
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 523
    .line 524
    if-nez v6, :cond_14

    .line 525
    .line 526
    move v6, v5

    .line 527
    goto :goto_9

    .line 528
    :cond_14
    iget v6, v6, Landroidx/fragment/app/w;->e:I

    .line 529
    .line 530
    :goto_9
    if-eqz v6, :cond_16

    .line 531
    .line 532
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    const-string v6, "getPopExitAnim="

    .line 536
    .line 537
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    iget-object v6, v4, Landroidx/fragment/app/z;->O:Landroidx/fragment/app/w;

    .line 541
    .line 542
    if-nez v6, :cond_15

    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_15
    iget v5, v6, Landroidx/fragment/app/w;->e:I

    .line 546
    .line 547
    :goto_a
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 548
    .line 549
    .line 550
    :cond_16
    iget-object v5, v4, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 551
    .line 552
    if-eqz v5, :cond_17

    .line 553
    .line 554
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    const-string v5, "mContainer="

    .line 558
    .line 559
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    iget-object v5, v4, Landroidx/fragment/app/z;->L:Landroid/view/ViewGroup;

    .line 563
    .line 564
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    :cond_17
    iget-object v5, v4, Landroidx/fragment/app/z;->A:Landroidx/fragment/app/d0;

    .line 568
    .line 569
    if-nez v5, :cond_18

    .line 570
    .line 571
    goto :goto_b

    .line 572
    :cond_18
    iget-object v7, v5, Landroidx/fragment/app/d0;->n:Lg/k;

    .line 573
    .line 574
    :goto_b
    if-eqz v7, :cond_19

    .line 575
    .line 576
    invoke-static {v4}, Lr0/a;->a(Landroidx/lifecycle/t;)Lr0/c;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    invoke-virtual {v5, v3, p3}, Lr0/c;->b(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 581
    .line 582
    .line 583
    :cond_19
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    new-instance v5, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    const-string v6, "Child "

    .line 589
    .line 590
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    iget-object v6, v4, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 594
    .line 595
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    const-string v6, ":"

    .line 599
    .line 600
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    iget-object v4, v4, Landroidx/fragment/app/z;->B:Landroidx/fragment/app/v0;

    .line 611
    .line 612
    const-string v5, "  "

    .line 613
    .line 614
    invoke-static {v3, v5}, Landroidx/emoji2/text/u;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    invoke-virtual {v4, v5, p2, p3, p4}, Landroidx/fragment/app/u0;->w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    goto/16 :goto_0

    .line 622
    .line 623
    :cond_1a
    const-string v4, "null"

    .line 624
    .line 625
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    goto/16 :goto_0

    .line 629
    .line 630
    :cond_1b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 631
    .line 632
    .line 633
    move-result p2

    .line 634
    const/4 p4, 0x0

    .line 635
    if-lez p2, :cond_1c

    .line 636
    .line 637
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    const-string v1, "Added Fragments:"

    .line 641
    .line 642
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    move v1, p4

    .line 646
    :goto_c
    if-ge v1, p2, :cond_1c

    .line 647
    .line 648
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    check-cast v3, Landroidx/fragment/app/z;

    .line 653
    .line 654
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    const-string v4, "  #"

    .line 658
    .line 659
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 663
    .line 664
    .line 665
    const-string v4, ": "

    .line 666
    .line 667
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3}, Landroidx/fragment/app/z;->toString()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    add-int/lit8 v1, v1, 0x1

    .line 678
    .line 679
    goto :goto_c

    .line 680
    :cond_1c
    iget-object p2, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 681
    .line 682
    if-eqz p2, :cond_1d

    .line 683
    .line 684
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 685
    .line 686
    .line 687
    move-result p2

    .line 688
    if-lez p2, :cond_1d

    .line 689
    .line 690
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    const-string v1, "Fragments Created Menus:"

    .line 694
    .line 695
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    move v1, p4

    .line 699
    :goto_d
    if-ge v1, p2, :cond_1d

    .line 700
    .line 701
    iget-object v2, p0, Landroidx/fragment/app/u0;->e:Ljava/util/ArrayList;

    .line 702
    .line 703
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    check-cast v2, Landroidx/fragment/app/z;

    .line 708
    .line 709
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    const-string v3, "  #"

    .line 713
    .line 714
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 718
    .line 719
    .line 720
    const-string v3, ": "

    .line 721
    .line 722
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2}, Landroidx/fragment/app/z;->toString()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    add-int/lit8 v1, v1, 0x1

    .line 733
    .line 734
    goto :goto_d

    .line 735
    :cond_1d
    iget-object p2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 736
    .line 737
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 738
    .line 739
    .line 740
    move-result p2

    .line 741
    if-lez p2, :cond_1e

    .line 742
    .line 743
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    const-string v1, "Back Stack:"

    .line 747
    .line 748
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    move v1, p4

    .line 752
    :goto_e
    if-ge v1, p2, :cond_1e

    .line 753
    .line 754
    iget-object v2, p0, Landroidx/fragment/app/u0;->d:Ljava/util/ArrayList;

    .line 755
    .line 756
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    check-cast v2, Landroidx/fragment/app/a;

    .line 761
    .line 762
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    const-string v3, "  #"

    .line 766
    .line 767
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 771
    .line 772
    .line 773
    const-string v3, ": "

    .line 774
    .line 775
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    const/4 v3, 0x1

    .line 786
    invoke-virtual {v2, v0, p3, v3}, Landroidx/fragment/app/a;->g(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 787
    .line 788
    .line 789
    add-int/lit8 v1, v1, 0x1

    .line 790
    .line 791
    goto :goto_e

    .line 792
    :cond_1e
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    new-instance p2, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    const-string v0, "Back Stack Index: "

    .line 798
    .line 799
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    iget-object v0, p0, Landroidx/fragment/app/u0;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 803
    .line 804
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object p2

    .line 815
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    iget-object p2, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 819
    .line 820
    monitor-enter p2

    .line 821
    :try_start_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 822
    .line 823
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-lez v0, :cond_1f

    .line 828
    .line 829
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    const-string v1, "Pending Actions:"

    .line 833
    .line 834
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    :goto_f
    if-ge p4, v0, :cond_1f

    .line 838
    .line 839
    iget-object v1, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 840
    .line 841
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    check-cast v1, Landroidx/fragment/app/r0;

    .line 846
    .line 847
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    const-string v2, "  #"

    .line 851
    .line 852
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 856
    .line 857
    .line 858
    const-string v2, ": "

    .line 859
    .line 860
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    add-int/lit8 p4, p4, 0x1

    .line 867
    .line 868
    goto :goto_f

    .line 869
    :catchall_0
    move-exception p1

    .line 870
    goto :goto_10

    .line 871
    :cond_1f
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 872
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    const-string p2, "FragmentManager misc state:"

    .line 876
    .line 877
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    const-string p2, "  mHost="

    .line 884
    .line 885
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    iget-object p2, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 889
    .line 890
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 894
    .line 895
    .line 896
    const-string p2, "  mContainer="

    .line 897
    .line 898
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    iget-object p2, p0, Landroidx/fragment/app/u0;->x:La/a;

    .line 902
    .line 903
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    iget-object p2, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 907
    .line 908
    if-eqz p2, :cond_20

    .line 909
    .line 910
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    const-string p2, "  mParent="

    .line 914
    .line 915
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    iget-object p2, p0, Landroidx/fragment/app/u0;->y:Landroidx/fragment/app/z;

    .line 919
    .line 920
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    :cond_20
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    const-string p2, "  mCurState="

    .line 927
    .line 928
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    iget p2, p0, Landroidx/fragment/app/u0;->v:I

    .line 932
    .line 933
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 934
    .line 935
    .line 936
    const-string p2, " mStateSaved="

    .line 937
    .line 938
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->H:Z

    .line 942
    .line 943
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 944
    .line 945
    .line 946
    const-string p2, " mStopped="

    .line 947
    .line 948
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->I:Z

    .line 952
    .line 953
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 954
    .line 955
    .line 956
    const-string p2, " mDestroyed="

    .line 957
    .line 958
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->J:Z

    .line 962
    .line 963
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 964
    .line 965
    .line 966
    iget-boolean p2, p0, Landroidx/fragment/app/u0;->G:Z

    .line 967
    .line 968
    if-eqz p2, :cond_21

    .line 969
    .line 970
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    const-string p1, "  mNeedMenuInvalidate="

    .line 974
    .line 975
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->G:Z

    .line 979
    .line 980
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 981
    .line 982
    .line 983
    :cond_21
    return-void

    .line 984
    :goto_10
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 985
    throw p1
.end method

.method public final x()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/fragment/app/n;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/fragment/app/n;->d()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final y(Landroidx/fragment/app/r0;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->J:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->H:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->I:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_3
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "Activity has been destroyed"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_5
    iget-object p2, p0, Landroidx/fragment/app/u0;->a:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/u0;->W()V

    .line 71
    .line 72
    .line 73
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
.end method

.method public final z(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/u0;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->J:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Landroidx/fragment/app/u0;->w:Landroidx/fragment/app/d0;

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/d0;->o:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->H:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    iget-boolean p1, p0, Landroidx/fragment/app/u0;->I:Z

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Landroidx/fragment/app/u0;->L:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Landroidx/fragment/app/u0;->M:Ljava/util/ArrayList;

    .line 79
    .line 80
    :cond_4
    return-void

    .line 81
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "Must be called from main thread of fragment host"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v0, "FragmentManager is already executing transactions"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method
