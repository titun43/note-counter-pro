.class public abstract Landroidx/lifecycle/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/lifecycle/s0;

.field public static final b:Landroidx/lifecycle/s0;

.field public static final c:Landroidx/lifecycle/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/s0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/k0;->a:Landroidx/lifecycle/s0;

    .line 7
    .line 8
    new-instance v0, Landroidx/lifecycle/s0;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Landroidx/lifecycle/k0;->b:Landroidx/lifecycle/s0;

    .line 14
    .line 15
    new-instance v0, Landroidx/lifecycle/s0;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Landroidx/lifecycle/k0;->c:Landroidx/lifecycle/s0;

    .line 21
    .line 22
    return-void
.end method

.method public static final a(Landroidx/lifecycle/r0;Lc1/d;Landroidx/lifecycle/o;)V
    .locals 2

    .line 1
    const-string v0, "registry"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lifecycle"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/lifecycle/r0;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    monitor-enter v1

    .line 20
    :try_start_0
    iget-object p0, p0, Landroidx/lifecycle/r0;->a:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    :goto_0
    check-cast p0, Landroidx/lifecycle/SavedStateHandleController;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->i:Z

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/SavedStateHandleController;->b(Landroidx/lifecycle/o;Lc1/d;)V

    .line 36
    .line 37
    .line 38
    move-object p0, p2

    .line 39
    check-cast p0, Landroidx/lifecycle/v;

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 42
    .line 43
    sget-object v0, Landroidx/lifecycle/n;->h:Landroidx/lifecycle/n;

    .line 44
    .line 45
    if-eq p0, v0, :cond_2

    .line 46
    .line 47
    sget-object v0, Landroidx/lifecycle/n;->j:Landroidx/lifecycle/n;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-ltz p0, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance p0, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;

    .line 57
    .line 58
    invoke-direct {p0, p2, p1}, Landroidx/lifecycle/LegacySavedStateHandleController$tryToAddRecreator$1;-><init>(Landroidx/lifecycle/o;Lc1/d;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lc1/d;->d()V

    .line 66
    .line 67
    .line 68
    :cond_3
    return-void

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p0
.end method

.method public static b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/j0;
    .locals 5

    .line 1
    if-nez p0, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p0, Landroidx/lifecycle/j0;

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/lifecycle/j0;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "key"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lg4/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p1, Landroidx/lifecycle/j0;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Landroidx/lifecycle/j0;-><init>(Ljava/util/HashMap;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    const-string p1, "keys"

    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string v0, "values"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    if-eqz p0, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-ne v0, v1, :cond_4

    .line 80
    .line 81
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    const/4 v2, 0x0

    .line 91
    :goto_1
    if-ge v2, v1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 98
    .line 99
    invoke-static {v3, v4}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    new-instance p0, Landroidx/lifecycle/j0;

    .line 115
    .line 116
    invoke-direct {p0, v0}, Landroidx/lifecycle/j0;-><init>(Ljava/util/HashMap;)V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    const-string p1, "Invalid bundle passed as restored state"

    .line 123
    .line 124
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final c(Lq0/d;)Landroidx/lifecycle/j0;
    .locals 7

    .line 1
    iget-object p0, p0, Lq0/b;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    sget-object v0, Landroidx/lifecycle/k0;->a:Landroidx/lifecycle/s0;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lc1/f;

    .line 10
    .line 11
    if-eqz v0, :cond_8

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/k0;->b:Landroidx/lifecycle/s0;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroidx/lifecycle/x0;

    .line 20
    .line 21
    if-eqz v1, :cond_7

    .line 22
    .line 23
    sget-object v2, Landroidx/lifecycle/k0;->c:Landroidx/lifecycle/s0;

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroid/os/Bundle;

    .line 30
    .line 31
    sget-object v3, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/s0;

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz p0, :cond_6

    .line 40
    .line 41
    invoke-interface {v0}, Lc1/f;->getSavedStateRegistry()Lc1/d;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lc1/d;->b()Lc1/c;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    instance-of v3, v0, Landroidx/lifecycle/m0;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    check-cast v0, Landroidx/lifecycle/m0;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object v0, v4

    .line 58
    :goto_0
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-static {v1}, Landroidx/lifecycle/k0;->e(Landroidx/lifecycle/x0;)Landroidx/lifecycle/n0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Landroidx/lifecycle/n0;->d:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Landroidx/lifecycle/j0;

    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    sget-object v3, Landroidx/lifecycle/j0;->f:[Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/lifecycle/m0;->b()V

    .line 77
    .line 78
    .line 79
    iget-object v3, v0, Landroidx/lifecycle/m0;->c:Landroid/os/Bundle;

    .line 80
    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    goto :goto_1

    .line 88
    :cond_1
    move-object v3, v4

    .line 89
    :goto_1
    iget-object v5, v0, Landroidx/lifecycle/m0;->c:Landroid/os/Bundle;

    .line 90
    .line 91
    if-eqz v5, :cond_2

    .line 92
    .line 93
    invoke-virtual {v5, p0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v5, v0, Landroidx/lifecycle/m0;->c:Landroid/os/Bundle;

    .line 97
    .line 98
    if-eqz v5, :cond_3

    .line 99
    .line 100
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    const/4 v6, 0x1

    .line 105
    if-ne v5, v6, :cond_3

    .line 106
    .line 107
    iput-object v4, v0, Landroidx/lifecycle/m0;->c:Landroid/os/Bundle;

    .line 108
    .line 109
    :cond_3
    invoke-static {v3, v2}, Landroidx/lifecycle/k0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/j0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_4
    return-object v3

    .line 118
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string v0, "enableSavedStateHandles() wasn\'t called prior to createSavedStateHandle() call"

    .line 121
    .line 122
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p0

    .line 126
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_KEY`"

    .line 129
    .line 130
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0

    .line 134
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    const-string v0, "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"

    .line 137
    .line 138
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    const-string v0, "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"

    .line 145
    .line 146
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p0
.end method

.method public static final d(Lc1/f;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/lifecycle/v;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 8
    .line 9
    sget-object v1, Landroidx/lifecycle/n;->h:Landroidx/lifecycle/n;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/n;->i:Landroidx/lifecycle/n;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Failed requirement."

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p0}, Lc1/f;->getSavedStateRegistry()Lc1/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lc1/d;->b()Lc1/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Landroidx/lifecycle/m0;

    .line 37
    .line 38
    invoke-interface {p0}, Lc1/f;->getSavedStateRegistry()Lc1/d;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v2, p0

    .line 43
    check-cast v2, Landroidx/lifecycle/x0;

    .line 44
    .line 45
    invoke-direct {v0, v1, v2}, Landroidx/lifecycle/m0;-><init>(Lc1/d;Landroidx/lifecycle/x0;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Lc1/f;->getSavedStateRegistry()Lc1/d;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 53
    .line 54
    invoke-virtual {v1, v2, v0}, Lc1/d;->c(Ljava/lang/String;Lc1/c;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/m0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method public static final e(Landroidx/lifecycle/x0;)Landroidx/lifecycle/n0;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lg4/o;->a:Lg4/p;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lg4/e;

    .line 12
    .line 13
    const-class v2, Landroidx/lifecycle/n0;

    .line 14
    .line 15
    invoke-direct {v1, v2}, Lg4/e;-><init>(Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lq0/e;

    .line 19
    .line 20
    invoke-interface {v1}, Lg4/d;->a()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    .line 25
    .line 26
    invoke-static {v1, v4}, Lg4/i;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v1}, Lq0/e;-><init>(Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance v1, Lq0/c;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    new-array v3, v3, [Lq0/e;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [Lq0/e;

    .line 45
    .line 46
    array-length v3, v0

    .line 47
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, [Lq0/e;

    .line 52
    .line 53
    invoke-direct {v1, v0}, Lq0/c;-><init>([Lq0/e;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Landroidx/emoji2/text/t;

    .line 57
    .line 58
    invoke-interface {p0}, Landroidx/lifecycle/x0;->getViewModelStore()Landroidx/lifecycle/w0;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    instance-of v4, p0, Landroidx/lifecycle/i;

    .line 63
    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    check-cast p0, Landroidx/lifecycle/i;

    .line 67
    .line 68
    invoke-interface {p0}, Landroidx/lifecycle/i;->getDefaultViewModelCreationExtras()Lq0/b;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    sget-object p0, Lq0/a;->b:Lq0/a;

    .line 74
    .line 75
    :goto_0
    invoke-direct {v0, v3, v1, p0}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/w0;Landroidx/lifecycle/u0;Lq0/b;)V

    .line 76
    .line 77
    .line 78
    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 79
    .line 80
    invoke-virtual {v0, p0, v2}, Landroidx/emoji2/text/t;->j(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/r0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, Landroidx/lifecycle/n0;

    .line 85
    .line 86
    return-object p0
.end method
