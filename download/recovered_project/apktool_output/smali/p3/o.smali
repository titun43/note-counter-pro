.class public final Lp3/o;
.super Ly3/g;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lw3/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lp3/o;->g:I

    iput-object p1, p0, Lp3/o;->i:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ly3/g;-><init>(ILw3/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lw3/c;)Lw3/c;
    .locals 3

    .line 1
    iget v0, p0, Lp3/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lp3/o;

    .line 7
    .line 8
    iget-object v1, p0, Lp3/o;->i:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v0, v1, p2, v2}, Lp3/o;-><init>(Ljava/lang/String;Lw3/c;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lp3/o;->h:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lp3/o;

    .line 18
    .line 19
    iget-object v1, p0, Lp3/o;->i:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, v1, p2, v2}, Lp3/o;-><init>(Ljava/lang/String;Lw3/c;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, Lp3/o;->h:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lp3/o;->g:I

    .line 2
    .line 3
    check-cast p1, Lo4/t;

    .line 4
    .line 5
    check-cast p2, Lw3/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lp3/o;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lp3/o;

    .line 15
    .line 16
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lp3/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lp3/o;->create(Ljava/lang/Object;Lw3/c;)Lw3/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lp3/o;

    .line 28
    .line 29
    sget-object p2, Lt3/h;->a:Lt3/h;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lp3/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lp3/o;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lp3/o;->i:Ljava/lang/String;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 10
    .line 11
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lp3/o;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lo4/t;

    .line 17
    .line 18
    :try_start_0
    new-instance p1, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lb3/g;->u(Ljava/io/File;)Lr3/y;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Lr3/o;

    .line 37
    .line 38
    invoke-direct {p1, v2, v1}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    :goto_0
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_1
    new-instance v0, Lt3/e;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    sget-object v0, Lx3/a;->g:Lx3/a;

    .line 53
    .line 54
    invoke-static {p1}, Lb3/g;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lp3/o;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lo4/t;

    .line 60
    .line 61
    :try_start_1
    new-instance p1, Ljava/io/File;

    .line 62
    .line 63
    invoke-direct {p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    invoke-static {p1}, Lu3/f;->E([Ljava/lang/Object;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    move-exception p1

    .line 90
    goto :goto_5

    .line 91
    :cond_1
    sget-object p1, Lu3/o;->g:Lu3/o;

    .line 92
    .line 93
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :cond_2
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_3

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-static {v0}, Lu3/i;->T(Ljava/lang/Iterable;)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    const/4 v2, 0x0

    .line 132
    :goto_4
    if-ge v2, v1, :cond_5

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    check-cast v3, Ljava/io/File;

    .line 141
    .line 142
    invoke-static {v3}, Lb3/g;->u(Ljava/io/File;)Lr3/y;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_4
    new-instance p1, Lr3/o;

    .line 151
    .line 152
    invoke-direct {p1, v2, v1}, Lr3/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    :goto_5
    invoke-static {p1}, Lb3/g;->g(Ljava/lang/Throwable;)Lt3/d;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    :cond_5
    new-instance v0, Lt3/e;

    .line 161
    .line 162
    invoke-direct {v0, p1}, Lt3/e;-><init>(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
