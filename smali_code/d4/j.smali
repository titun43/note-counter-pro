.class public final Ld4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/d;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ld4/k;

.field public final c:Lf4/p;


# direct methods
.method public constructor <init>(Ljava/io/File;Ld4/k;Ld4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld4/j;->a:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, Ld4/j;->b:Ld4/k;

    .line 7
    .line 8
    iput-object p3, p0, Ld4/j;->c:Lf4/p;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Ld4/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ld4/h;-><init>(Ld4/j;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
