.class public final synthetic Ll2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln2/b;


# instance fields
.field public final synthetic g:Ll2/j;

.field public final synthetic h:Lf2/j;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Ll2/j;Lf2/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/f;->g:Ll2/j;

    iput-object p2, p0, Ll2/f;->h:Lf2/j;

    iput p3, p0, Ll2/f;->i:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ll2/f;->g:Ll2/j;

    .line 2
    .line 3
    iget-object v0, v0, Ll2/j;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/emoji2/text/t;

    .line 6
    .line 7
    iget v1, p0, Ll2/f;->i:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, Ll2/f;->h:Lf2/j;

    .line 13
    .line 14
    invoke-virtual {v0, v3, v1, v2}, Landroidx/emoji2/text/t;->w(Lf2/j;IZ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0
.end method
