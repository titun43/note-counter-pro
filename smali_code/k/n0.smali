.class public final Lk/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic g:Lk/p0;


# direct methods
.method public constructor <init>(Lk/p0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/n0;->g:Lk/p0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .line 1
    iget-object p1, p0, Lk/n0;->g:Lk/p0;

    .line 2
    .line 3
    iget-object p4, p1, Lk/p0;->L:Lk/s0;

    .line 4
    .line 5
    invoke-virtual {p4, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p4}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    .line 9
    .line 10
    .line 11
    move-result-object p5

    .line 12
    if-eqz p5, :cond_0

    .line 13
    .line 14
    iget-object p5, p1, Lk/p0;->I:Lk/m0;

    .line 15
    .line 16
    invoke-virtual {p5, p3}, Lk/m0;->getItemId(I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lk/g2;->dismiss()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
