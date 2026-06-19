.class public final enum Ld4/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum g:Ld4/k;

.field public static final enum h:Ld4/k;

.field public static final synthetic i:[Ld4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ld4/k;

    .line 2
    .line 3
    const-string v1, "TOP_DOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ld4/k;->g:Ld4/k;

    .line 10
    .line 11
    new-instance v1, Ld4/k;

    .line 12
    .line 13
    const-string v2, "BOTTOM_UP"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ld4/k;->h:Ld4/k;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ld4/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ld4/k;->i:[Ld4/k;

    .line 26
    .line 27
    invoke-static {v0}, Lz2/b;->g([Ljava/lang/Enum;)Lz3/b;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ld4/k;
    .locals 1

    .line 1
    const-class v0, Ld4/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ld4/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ld4/k;
    .locals 1

    .line 1
    sget-object v0, Ld4/k;->i:[Ld4/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ld4/k;

    .line 8
    .line 9
    return-object v0
.end method
