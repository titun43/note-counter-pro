package com.getcapacitor.community.admob.helpers;

import z2.b;
import z3.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuthorizationStatusEnum {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthorizationStatusEnum[] $VALUES;
    public static final AuthorizationStatusEnum AUTHORIZED = new AuthorizationStatusEnum("AUTHORIZED", 0, "authorized");
    private final String status;

    private static final /* synthetic */ AuthorizationStatusEnum[] $values() {
        return new AuthorizationStatusEnum[]{AUTHORIZED};
    }

    static {
        AuthorizationStatusEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.g($values);
    }

    private AuthorizationStatusEnum(String str, int i5, String str2) {
        this.status = str2;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AuthorizationStatusEnum valueOf(String str) {
        return (AuthorizationStatusEnum) Enum.valueOf(AuthorizationStatusEnum.class, str);
    }

    public static AuthorizationStatusEnum[] values() {
        return (AuthorizationStatusEnum[]) $VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }
}
