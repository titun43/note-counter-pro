.class public final Ly1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ly0/c;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "formattedPrice"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Ly1/g;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "priceAmountMicros"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 15
    .line 16
    .line 17
    const-string v0, "priceCurrencyCode"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ly1/g;->b:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "offerIdToken"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x0

    .line 37
    if-ne v1, v2, :cond_0

    .line 38
    .line 39
    move-object v0, v3

    .line 40
    :cond_0
    iput-object v0, p0, Ly1/g;->c:Ljava/lang/String;

    .line 41
    .line 42
    const-string v0, "offerId"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v0, "purchaseOptionId"

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v0, "offerType"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    const-string v0, "offerTags"

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    move v4, v2

    .line 80
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-ge v4, v5, :cond_1

    .line 85
    .line 86
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    add-int/lit8 v4, v4, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/zzco;->zzk(Ljava/util/Collection;)Lcom/google/android/gms/internal/play_billing/zzco;

    .line 97
    .line 98
    .line 99
    const-string v0, "fullPriceMicros"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 108
    .line 109
    .line 110
    :cond_2
    const-string v0, "discountDisplayInfo"

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    const-string v1, "percentageDiscount"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :cond_3
    const-string v0, "validTimeWindow"

    .line 124
    .line 125
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    const-string v1, "startTimeMillis"

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 134
    .line 135
    .line 136
    const-string v1, "endTimeMillis"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 139
    .line 140
    .line 141
    :cond_4
    const-string v0, "limitedQuantityInfo"

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-eqz v0, :cond_5

    .line 148
    .line 149
    const-string v1, "maximumQuantity"

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    const-string v1, "remainingQuantity"

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    :cond_5
    const-string v0, "serializedDocid"

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, p0, Ly1/g;->d:Ljava/lang/String;

    .line 166
    .line 167
    const-string v0, "preorderDetails"

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    const-string v1, "preorderReleaseTimeMillis"

    .line 176
    .line 177
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 178
    .line 179
    .line 180
    const-string v1, "preorderPresaleEndTimeMillis"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 183
    .line 184
    .line 185
    :cond_6
    const-string v0, "rentalDetails"

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-eqz v0, :cond_7

    .line 192
    .line 193
    const-string v1, "rentalPeriod"

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    const-string v1, "rentalExpirationPeriod"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    :cond_7
    const-string v0, "autoPayDetails"

    .line 208
    .line 209
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-nez p1, :cond_8

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_8
    new-instance v3, Ly0/c;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v0, "type"

    .line 222
    .line 223
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    const-string v0, "balanceThresholds"

    .line 227
    .line 228
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    new-instance v1, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    if-eqz v0, :cond_9

    .line 238
    .line 239
    move v4, v2

    .line 240
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-ge v4, v5, :cond_9

    .line 245
    .line 246
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->getInt(I)I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    add-int/lit8 v4, v4, 0x1

    .line 258
    .line 259
    goto :goto_1

    .line 260
    :cond_9
    const-string v0, "pricingPhases"

    .line 261
    .line 262
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    new-instance v0, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 269
    .line 270
    .line 271
    if-eqz p1, :cond_b

    .line 272
    .line 273
    :goto_2
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-ge v2, v1, :cond_b

    .line 278
    .line 279
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    if-eqz v1, :cond_a

    .line 284
    .line 285
    new-instance v4, Ly0/c;

    .line 286
    .line 287
    invoke-direct {v4, v1}, Ly0/c;-><init>(Lorg/json/JSONObject;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_b
    :goto_3
    iput-object v3, p0, Ly1/g;->e:Ly0/c;

    .line 297
    .line 298
    return-void
.end method
