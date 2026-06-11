.class public final Ls1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/b;
.implements Ll1/a;


# static fields
.field public static final p:Ljava/lang/String;


# instance fields
.field public final g:Ll1/k;

.field public final h:Lw1/a;

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/String;

.field public final k:Ljava/util/LinkedHashMap;

.field public final l:Ljava/util/HashMap;

.field public final m:Ljava/util/HashSet;

.field public final n:Lp1/c;

.field public o:Landroidx/work/impl/foreground/SystemForegroundService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemFgDispatcher"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/work/n;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ls1/b;->p:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ls1/b;->i:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1}, Ll1/k;->Q(Landroid/content/Context;)Ll1/k;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ls1/b;->g:Ll1/k;

    .line 16
    .line 17
    iget-object v1, v0, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 18
    .line 19
    iput-object v1, p0, Ls1/b;->h:Lw1/a;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iput-object v2, p0, Ls1/b;->j:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Ls1/b;->k:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    new-instance v2, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Ls1/b;->m:Ljava/util/HashSet;

    .line 37
    .line 38
    new-instance v2, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Ls1/b;->l:Ljava/util/HashMap;

    .line 44
    .line 45
    new-instance v2, Lp1/c;

    .line 46
    .line 47
    invoke-direct {v2, p1, v1, p0}, Lp1/c;-><init>(Landroid/content/Context;Lw1/a;Lp1/b;)V

    .line 48
    .line 49
    .line 50
    iput-object v2, p0, Ls1/b;->n:Lp1/c;

    .line 51
    .line 52
    iget-object p1, v0, Ll1/k;->h:Ll1/b;

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ll1/b;->a(Ll1/a;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/h;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "ACTION_NOTIFY"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p0, "KEY_NOTIFICATION_ID"

    .line 14
    .line 15
    iget v1, p2, Landroidx/work/h;->a:I

    .line 16
    .line 17
    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    const-string p0, "KEY_FOREGROUND_SERVICE_TYPE"

    .line 21
    .line 22
    iget v1, p2, Landroidx/work/h;->b:I

    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 25
    .line 26
    .line 27
    const-string p0, "KEY_NOTIFICATION"

    .line 28
    .line 29
    iget-object p2, p2, Landroidx/work/h;->c:Landroid/app/Notification;

    .line 30
    .line 31
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 32
    .line 33
    .line 34
    const-string p0, "KEY_WORKSPEC_ID"

    .line 35
    .line 36
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Landroidx/work/h;)Landroid/content/Intent;
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-class v1, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "ACTION_START_FOREGROUND"

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    const-string p0, "KEY_WORKSPEC_ID"

    .line 14
    .line 15
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16
    .line 17
    .line 18
    const-string v1, "KEY_NOTIFICATION_ID"

    .line 19
    .line 20
    iget v2, p2, Landroidx/work/h;->a:I

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 23
    .line 24
    .line 25
    const-string v1, "KEY_FOREGROUND_SERVICE_TYPE"

    .line 26
    .line 27
    iget v2, p2, Landroidx/work/h;->b:I

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    const-string v1, "KEY_NOTIFICATION"

    .line 33
    .line 34
    iget-object p2, p2, Landroidx/work/h;->c:Landroid/app/Notification;

    .line 35
    .line 36
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    iget-object p2, p0, Ls1/b;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    :try_start_0
    iget-object v0, p0, Ls1/b;->l:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lt1/i;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Ls1/b;->m:Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    move v0, v1

    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Ls1/b;->n:Lp1/c;

    .line 29
    .line 30
    iget-object v2, p0, Ls1/b;->m:Ljava/util/HashSet;

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Lp1/c;->b(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    iget-object p2, p0, Ls1/b;->k:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, Landroidx/work/h;

    .line 43
    .line 44
    iget-object v0, p0, Ls1/b;->j:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Ls1/b;->k:Ljava/util/LinkedHashMap;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-lez v0, :cond_3

    .line 59
    .line 60
    iget-object v0, p0, Ls1/b;->k:Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/util/Map$Entry;

    .line 75
    .line 76
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/util/Map$Entry;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Ljava/lang/String;

    .line 94
    .line 95
    iput-object v0, p0, Ls1/b;->j:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v0, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Landroidx/work/h;

    .line 106
    .line 107
    iget-object v2, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 108
    .line 109
    iget v3, v0, Landroidx/work/h;->a:I

    .line 110
    .line 111
    iget v4, v0, Landroidx/work/h;->b:I

    .line 112
    .line 113
    iget-object v5, v0, Landroidx/work/h;->c:Landroid/app/Notification;

    .line 114
    .line 115
    iget-object v6, v2, Landroidx/work/impl/foreground/SystemForegroundService;->h:Landroid/os/Handler;

    .line 116
    .line 117
    new-instance v7, Ln/e;

    .line 118
    .line 119
    invoke-direct {v7, v2, v3, v5, v4}, Ln/e;-><init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 126
    .line 127
    iget v0, v0, Landroidx/work/h;->a:I

    .line 128
    .line 129
    iget-object v3, v2, Landroidx/work/impl/foreground/SystemForegroundService;->h:Landroid/os/Handler;

    .line 130
    .line 131
    new-instance v4, Landroidx/emoji2/text/j;

    .line 132
    .line 133
    const/4 v5, 0x2

    .line 134
    invoke-direct {v4, v2, v0, v5}, Landroidx/emoji2/text/j;-><init>(Ljava/lang/Object;II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 138
    .line 139
    .line 140
    :cond_3
    iget-object v0, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 141
    .line 142
    if-eqz p2, :cond_4

    .line 143
    .line 144
    if-eqz v0, :cond_4

    .line 145
    .line 146
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    sget-object v3, Ls1/b;->p:Ljava/lang/String;

    .line 151
    .line 152
    iget v4, p2, Landroidx/work/h;->a:I

    .line 153
    .line 154
    iget v5, p2, Landroidx/work/h;->b:I

    .line 155
    .line 156
    new-instance v6, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v7, "Removing Notification (id: "

    .line 159
    .line 160
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v4, ", workSpecId: "

    .line 167
    .line 168
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p1, " ,notificationType: "

    .line 175
    .line 176
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p1, ")"

    .line 183
    .line 184
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 192
    .line 193
    invoke-virtual {v2, v3, p1, v1}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    iget p1, p2, Landroidx/work/h;->a:I

    .line 197
    .line 198
    iget-object p2, v0, Landroidx/work/impl/foreground/SystemForegroundService;->h:Landroid/os/Handler;

    .line 199
    .line 200
    new-instance v1, Landroidx/emoji2/text/j;

    .line 201
    .line 202
    const/4 v2, 0x2

    .line 203
    invoke-direct {v1, v0, p1, v2}, Landroidx/emoji2/text/j;-><init>(Ljava/lang/Object;II)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 207
    .line 208
    .line 209
    :cond_4
    return-void

    .line 210
    :goto_2
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    throw p1
.end method

.method public final d(Landroid/content/Intent;)V
    .locals 8

    .line 1
    const-string v0, "KEY_NOTIFICATION_ID"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v2, "KEY_FOREGROUND_SERVICE_TYPE"

    .line 9
    .line 10
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const-string v3, "KEY_WORKSPEC_ID"

    .line 15
    .line 16
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "KEY_NOTIFICATION"

    .line 21
    .line 22
    invoke-virtual {p1, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/app/Notification;

    .line 27
    .line 28
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v6, "Notifying with (id: "

    .line 35
    .line 36
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v6, ", workSpecId: "

    .line 43
    .line 44
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v6, ", notificationType: "

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v6, ")"

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    new-array v6, v1, [Ljava/lang/Throwable;

    .line 68
    .line 69
    sget-object v7, Ls1/b;->p:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v4, v7, v5, v6}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    iget-object v4, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 77
    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    new-instance v4, Landroidx/work/h;

    .line 81
    .line 82
    invoke-direct {v4, v0, p1, v2}, Landroidx/work/h;-><init>(ILandroid/app/Notification;I)V

    .line 83
    .line 84
    .line 85
    iget-object v5, p0, Ls1/b;->k:Ljava/util/LinkedHashMap;

    .line 86
    .line 87
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget-object v4, p0, Ls1/b;->j:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_0

    .line 97
    .line 98
    iput-object v3, p0, Ls1/b;->j:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v1, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 101
    .line 102
    iget-object v3, v1, Landroidx/work/impl/foreground/SystemForegroundService;->h:Landroid/os/Handler;

    .line 103
    .line 104
    new-instance v4, Ln/e;

    .line 105
    .line 106
    invoke-direct {v4, v1, v0, p1, v2}, Ln/e;-><init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_0
    iget-object v3, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 114
    .line 115
    iget-object v4, v3, Landroidx/work/impl/foreground/SystemForegroundService;->h:Landroid/os/Handler;

    .line 116
    .line 117
    new-instance v6, Lk/v0;

    .line 118
    .line 119
    const/4 v7, 0x3

    .line 120
    invoke-direct {v6, v3, v0, p1, v7}, Lk/v0;-><init>(Ljava/lang/Object;ILandroid/os/Parcelable;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 124
    .line 125
    .line 126
    if-eqz v2, :cond_2

    .line 127
    .line 128
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 129
    .line 130
    const/16 v0, 0x1d

    .line 131
    .line 132
    if-lt p1, v0, :cond_2

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_1

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    check-cast v0, Ljava/util/Map$Entry;

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroidx/work/h;

    .line 159
    .line 160
    iget v0, v0, Landroidx/work/h;->b:I

    .line 161
    .line 162
    or-int/2addr v1, v0

    .line 163
    goto :goto_0

    .line 164
    :cond_1
    iget-object p1, p0, Ls1/b;->j:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v5, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Landroidx/work/h;

    .line 171
    .line 172
    if-eqz p1, :cond_2

    .line 173
    .line 174
    iget-object v0, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 175
    .line 176
    iget v2, p1, Landroidx/work/h;->a:I

    .line 177
    .line 178
    iget-object p1, p1, Landroidx/work/h;->c:Landroid/app/Notification;

    .line 179
    .line 180
    iget-object v3, v0, Landroidx/work/impl/foreground/SystemForegroundService;->h:Landroid/os/Handler;

    .line 181
    .line 182
    new-instance v4, Ln/e;

    .line 183
    .line 184
    invoke-direct {v4, v0, v2, p1, v1}, Ln/e;-><init>(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 188
    .line 189
    .line 190
    :cond_2
    return-void
.end method

.method public final e(Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {}, Landroidx/work/n;->e()Landroidx/work/n;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "Constraints unmet for WorkSpec "

    .line 28
    .line 29
    invoke-static {v5, v3}, Ls/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    new-array v6, v1, [Ljava/lang/Throwable;

    .line 34
    .line 35
    sget-object v7, Ls1/b;->p:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v4, v7, v5, v6}, Landroidx/work/n;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, p0, Ls1/b;->g:Ll1/k;

    .line 41
    .line 42
    iget-object v5, v4, Ll1/k;->f:Landroidx/emoji2/text/t;

    .line 43
    .line 44
    new-instance v6, Lu1/j;

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    invoke-direct {v6, v4, v3, v7}, Lu1/j;-><init>(Ll1/k;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v6}, Landroidx/emoji2/text/t;->i(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void
.end method

.method public final f(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ls1/b;->o:Landroidx/work/impl/foreground/SystemForegroundService;

    .line 3
    .line 4
    iget-object v0, p0, Ls1/b;->i:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Ls1/b;->n:Lp1/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Lp1/c;->c()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, Ls1/b;->g:Ll1/k;

    .line 14
    .line 15
    iget-object v0, v0, Ll1/k;->h:Ll1/b;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ll1/b;->e(Ll1/a;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method
