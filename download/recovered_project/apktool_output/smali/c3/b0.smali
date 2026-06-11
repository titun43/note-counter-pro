.class public final Lc3/b0;
.super Lu2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc3/b0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/fragment/app/b;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/fragment/app/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lc3/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x17

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    if-gt p1, v0, :cond_0

    .line 11
    .line 12
    move v3, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v2

    .line 15
    :goto_0
    const-string v4, "Start hour must be in range [0, 23]."

    .line 16
    .line 17
    invoke-static {v4, v3}, Lcom/google/android/gms/common/internal/b0;->i(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/16 v3, 0x3b

    .line 21
    .line 22
    if-ltz p2, :cond_1

    .line 23
    .line 24
    if-gt p2, v3, :cond_1

    .line 25
    .line 26
    move v4, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v4, v2

    .line 29
    :goto_1
    const-string v5, "Start minute must be in range [0, 59]."

    .line 30
    .line 31
    invoke-static {v5, v4}, Lcom/google/android/gms/common/internal/b0;->i(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    if-ltz p3, :cond_2

    .line 35
    .line 36
    if-gt p3, v0, :cond_2

    .line 37
    .line 38
    move v0, v1

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v0, v2

    .line 41
    :goto_2
    const-string v4, "End hour must be in range [0, 23]."

    .line 42
    .line 43
    invoke-static {v4, v0}, Lcom/google/android/gms/common/internal/b0;->i(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    if-ltz p4, :cond_3

    .line 47
    .line 48
    if-gt p4, v3, :cond_3

    .line 49
    .line 50
    move v0, v1

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move v0, v2

    .line 53
    :goto_3
    const-string v3, "End minute must be in range [0, 59]."

    .line 54
    .line 55
    invoke-static {v3, v0}, Lcom/google/android/gms/common/internal/b0;->i(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    add-int v0, p1, p2

    .line 59
    .line 60
    add-int/2addr v0, p3

    .line 61
    add-int/2addr v0, p4

    .line 62
    if-lez v0, :cond_4

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move v1, v2

    .line 66
    :goto_4
    const-string v0, "Parameters can\'t be all 0."

    .line 67
    .line 68
    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/b0;->i(Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    iput p1, p0, Lc3/b0;->g:I

    .line 72
    .line 73
    iput p2, p0, Lc3/b0;->h:I

    .line 74
    .line 75
    iput p3, p0, Lc3/b0;->i:I

    .line 76
    .line 77
    iput p4, p0, Lc3/b0;->j:I

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lc3/b0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lc3/b0;

    .line 12
    .line 13
    iget v1, p0, Lc3/b0;->g:I

    .line 14
    .line 15
    iget v3, p1, Lc3/b0;->g:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    iget v1, p0, Lc3/b0;->h:I

    .line 20
    .line 21
    iget v3, p1, Lc3/b0;->h:I

    .line 22
    .line 23
    if-ne v1, v3, :cond_2

    .line 24
    .line 25
    iget v1, p0, Lc3/b0;->i:I

    .line 26
    .line 27
    iget v3, p1, Lc3/b0;->i:I

    .line 28
    .line 29
    if-ne v1, v3, :cond_2

    .line 30
    .line 31
    iget v1, p0, Lc3/b0;->j:I

    .line 32
    .line 33
    iget p1, p1, Lc3/b0;->j:I

    .line 34
    .line 35
    if-ne v1, p1, :cond_2

    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lc3/b0;->g:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lc3/b0;->h:I

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lc3/b0;->i:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Lc3/b0;->j:I

    .line 20
    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x75

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "UserPreferredSleepWindow [startHour="

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lc3/b0;->g:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ", startMinute="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lc3/b0;->h:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", endHour="

    .line 29
    .line 30
    const-string v2, ", endMinute="

    .line 31
    .line 32
    iget v3, p0, Lc3/b0;->i:I

    .line 33
    .line 34
    iget v4, p0, Lc3/b0;->j:I

    .line 35
    .line 36
    invoke-static {v0, v1, v3, v2, v4}, Landroidx/emoji2/text/u;->s(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    const/16 v1, 0x5d

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/b0;->g(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x4f45

    .line 5
    .line 6
    invoke-static {p1, p2}, Lz2/b;->O(Landroid/os/Parcel;I)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-static {p1, v0, v1}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lc3/b0;->g:I

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-static {p1, v0, v1}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 22
    .line 23
    .line 24
    iget v0, p0, Lc3/b0;->h:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    invoke-static {p1, v0, v1}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Lc3/b0;->i:I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v1, v1}, Lz2/b;->N(Landroid/os/Parcel;II)V

    .line 39
    .line 40
    .line 41
    iget v0, p0, Lc3/b0;->j:I

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p2}, Lz2/b;->P(Landroid/os/Parcel;I)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
