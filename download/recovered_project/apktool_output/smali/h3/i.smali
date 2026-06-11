.class public abstract Lh3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf2/q;

.field public static final b:Lg/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf2/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh3/i;->a:Lf2/q;

    .line 7
    .line 8
    new-instance v0, Lg/q;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lg/q;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lh3/i;->b:Lg/q;

    .line 15
    .line 16
    return-void
.end method
