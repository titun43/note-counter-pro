.class public final synthetic Ld4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld4/m;->g:I

    iput-object p1, p0, Ld4/m;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ld4/m;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld4/m;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ls4/j;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    check-cast p2, Lw3/f;

    .line 17
    .line 18
    invoke-interface {p2}, Lw3/f;->getKey()Lw3/g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v0, v0, Ls4/j;->h:Lw3/h;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lw3/h;->d(Lw3/g;)Lw3/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v2, Lo4/s;->h:Lo4/s;

    .line 29
    .line 30
    if-eq p1, v2, :cond_1

    .line 31
    .line 32
    if-eq p2, v0, :cond_0

    .line 33
    .line 34
    const/high16 v1, -0x80000000

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    check-cast v0, Lo4/r0;

    .line 41
    .line 42
    check-cast p2, Lo4/r0;

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    move-object p2, p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    if-ne p2, v0, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    instance-of v2, p2, Lt4/r;

    .line 53
    .line 54
    if-nez v2, :cond_5

    .line 55
    .line 56
    :goto_1
    if-ne p2, v0, :cond_4

    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p2, ", expected child of "

    .line 78
    .line 79
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 86
    .line 87
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_5
    check-cast p2, Lt4/r;

    .line 103
    .line 104
    sget-object v2, Lo4/z0;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 105
    .line 106
    invoke-virtual {v2, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    check-cast p2, Lo4/i;

    .line 111
    .line 112
    if-eqz p2, :cond_6

    .line 113
    .line 114
    invoke-interface {p2}, Lo4/i;->getParent()Lo4/r0;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :cond_6
    move-object p2, p1

    .line 119
    goto :goto_0

    .line 120
    :pswitch_0
    iget-object v0, p0, Ld4/m;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lf4/p;

    .line 123
    .line 124
    check-cast p1, Ljava/io/File;

    .line 125
    .line 126
    check-cast p2, Ljava/io/IOException;

    .line 127
    .line 128
    const-string v1, "f"

    .line 129
    .line 130
    invoke-static {p1, v1}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const-string v1, "e"

    .line 134
    .line 135
    invoke-static {p2, v1}, Lg4/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v0, p1, p2}, Lf4/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    sget-object v0, Ld4/o;->g:Ld4/o;

    .line 143
    .line 144
    if-eq p2, v0, :cond_7

    .line 145
    .line 146
    sget-object p1, Lt3/h;->a:Lt3/h;

    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_7
    new-instance p2, Ld4/p;

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-direct {p2, p1, v0, v0}, Ld4/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p2

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
