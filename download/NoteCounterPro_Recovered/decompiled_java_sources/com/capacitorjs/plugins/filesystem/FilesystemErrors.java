package com.capacitorjs.plugins.filesystem;

import com.google.android.gms.ads.RequestConfiguration;
import g4.i;
import s.c;

/* loaded from: classes.dex */
public final class FilesystemErrors {
    public static final FilesystemErrors INSTANCE;
    private static final ErrorInfo cannotDeleteChildren;
    private static final ErrorInfo filePermissionsDenied;
    private static final ErrorInfo missingParentDirectories;

    public static final class ErrorInfo {
        private final String code;
        private final String message;

        public ErrorInfo(String str, String str2) {
            i.e(str, "code");
            i.e(str2, "message");
            this.code = str;
            this.message = str2;
        }

        public static /* synthetic */ ErrorInfo copy$default(ErrorInfo errorInfo, String str, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = errorInfo.code;
            }
            if ((i5 & 2) != 0) {
                str2 = errorInfo.message;
            }
            return errorInfo.copy(str, str2);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final ErrorInfo copy(String str, String str2) {
            i.e(str, "code");
            i.e(str2, "message");
            return new ErrorInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorInfo)) {
                return false;
            }
            ErrorInfo errorInfo = (ErrorInfo) obj;
            return i.a(this.code, errorInfo.code) && i.a(this.message, errorInfo.message);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.code.hashCode() * 31);
        }

        public String toString() {
            return "ErrorInfo(code=" + this.code + ", message=" + this.message + ")";
        }
    }

    static {
        FilesystemErrors filesystemErrors = new FilesystemErrors();
        INSTANCE = filesystemErrors;
        filePermissionsDenied = new ErrorInfo(filesystemErrors.formatErrorCode(7), "Unable to do file operation, user denied permission request.");
        missingParentDirectories = new ErrorInfo(filesystemErrors.formatErrorCode(11), "Missing parent directory – possibly recursive=false was passed or parent directory creation failed.");
        cannotDeleteChildren = new ErrorInfo(filesystemErrors.formatErrorCode(12), "Cannot delete directory with children; received recursive=false but directory has contents.");
    }

    private FilesystemErrors() {
    }

    private final String formatErrorCode(int i5) {
        CharSequence charSequence;
        String valueOf = String.valueOf(i5);
        i.e(valueOf, "<this>");
        if (4 <= valueOf.length()) {
            charSequence = valueOf.subSequence(0, valueOf.length());
        } else {
            StringBuilder sb = new StringBuilder(4);
            int length = 4 - valueOf.length();
            int i6 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
            sb.append((CharSequence) valueOf);
            charSequence = sb;
        }
        return c.a("OS-PLUG-FILE-", charSequence.toString());
    }

    public final ErrorInfo directoryCreationAlreadyExists(String str) {
        i.e(str, "path");
        return new ErrorInfo(formatErrorCode(10), c.b("Directory ", !n4.i.X(str) ? c.b("at '", str, "' ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "already exists, cannot be overwritten."));
    }

    public final ErrorInfo doesNotExist(String str, String str2) {
        i.e(str, "methodName");
        i.e(str2, "path");
        return new ErrorInfo(formatErrorCode(8), "'" + str + "' failed because file " + (!n4.i.X(str2) ? c.b("at '", str2, "' ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) + "does not exist.");
    }

    public final ErrorInfo getCannotDeleteChildren() {
        return cannotDeleteChildren;
    }

    public final ErrorInfo getFilePermissionsDenied() {
        return filePermissionsDenied;
    }

    public final ErrorInfo getMissingParentDirectories() {
        return missingParentDirectories;
    }

    public final ErrorInfo invalidInputMethod(String str) {
        i.e(str, "methodName");
        return new ErrorInfo(formatErrorCode(5), c.b("The '", str, "' input parameters aren't valid."));
    }

    public final ErrorInfo invalidPath(String str) {
        i.e(str, "path");
        return new ErrorInfo(formatErrorCode(6), c.b("Invalid ", !n4.i.X(str) ? c.b("'", str, "' ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "path."));
    }

    public final ErrorInfo notAllowed(String str, String str2) {
        i.e(str, "methodName");
        i.e(str2, "notAllowedFor");
        return new ErrorInfo(formatErrorCode(9), "'" + str + "' not supported for " + str2 + ".");
    }

    public final ErrorInfo operationFailed(String str, String str2) {
        i.e(str, "methodName");
        i.e(str2, "errorMessage");
        return new ErrorInfo(formatErrorCode(13), "'" + str + "' failed with" + (!n4.i.X(str2) ? ": ".concat(str2) : "an unknown error."));
    }
}
