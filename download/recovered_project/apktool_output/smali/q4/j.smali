.class public abstract Lq4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq4/i;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq4/j;->a:Lq4/i;

    .line 7
    .line 8
    return-void
.end method

.method public static a(ILq4/a;I)Lq4/c;
    .locals 1

    .line 1
    and-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Lq4/a;->g:Lq4/a;

    .line 6
    .line 7
    :cond_0
    const/4 p2, -0x2

    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p0, p2, :cond_7

    .line 10
    .line 11
    const/4 p2, -0x1

    .line 12
    if-eq p0, p2, :cond_5

    .line 13
    .line 14
    if-eqz p0, :cond_3

    .line 15
    .line 16
    const p2, 0x7fffffff

    .line 17
    .line 18
    .line 19
    if-eq p0, p2, :cond_2

    .line 20
    .line 21
    sget-object p2, Lq4/a;->g:Lq4/a;

    .line 22
    .line 23
    if-ne p1, p2, :cond_1

    .line 24
    .line 25
    new-instance p1, Lq4/c;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lq4/c;-><init>(I)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    new-instance p2, Lq4/m;

    .line 32
    .line 33
    invoke-direct {p2, p0, p1}, Lq4/m;-><init>(ILq4/a;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_2
    new-instance p0, Lq4/c;

    .line 38
    .line 39
    invoke-direct {p0, p2}, Lq4/c;-><init>(I)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_3
    sget-object p0, Lq4/a;->g:Lq4/a;

    .line 44
    .line 45
    if-ne p1, p0, :cond_4

    .line 46
    .line 47
    new-instance p0, Lq4/c;

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    invoke-direct {p0, p1}, Lq4/c;-><init>(I)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    new-instance p0, Lq4/m;

    .line 55
    .line 56
    invoke-direct {p0, v0, p1}, Lq4/m;-><init>(ILq4/a;)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_5
    sget-object p0, Lq4/a;->g:Lq4/a;

    .line 61
    .line 62
    if-ne p1, p0, :cond_6

    .line 63
    .line 64
    new-instance p0, Lq4/m;

    .line 65
    .line 66
    sget-object p1, Lq4/a;->h:Lq4/a;

    .line 67
    .line 68
    invoke-direct {p0, v0, p1}, Lq4/m;-><init>(ILq4/a;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    .line 75
    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0

    .line 80
    :cond_7
    sget-object p0, Lq4/a;->g:Lq4/a;

    .line 81
    .line 82
    if-ne p1, p0, :cond_8

    .line 83
    .line 84
    new-instance p0, Lq4/c;

    .line 85
    .line 86
    sget-object p1, Lq4/g;->e:Lq4/f;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget p1, Lq4/f;->b:I

    .line 92
    .line 93
    invoke-direct {p0, p1}, Lq4/c;-><init>(I)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_8
    new-instance p0, Lq4/m;

    .line 98
    .line 99
    invoke-direct {p0, v0, p1}, Lq4/m;-><init>(ILq4/a;)V

    .line 100
    .line 101
    .line 102
    return-object p0
.end method
