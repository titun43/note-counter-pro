.class public abstract Lr3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr3/d;

    .line 2
    .line 3
    sget-object v1, Ln4/a;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr3/d;-><init>(Ljava/nio/charset/Charset;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr3/e;->a:Lr3/d;

    .line 9
    .line 10
    return-void
.end method
