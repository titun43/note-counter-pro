.class public final Ls4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw3/c;


# static fields
.field public static final g:Ls4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls4/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls4/g;->g:Ls4/g;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getContext()Lw3/h;
    .locals 1

    .line 1
    sget-object v0, Lw3/i;->g:Lw3/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method
