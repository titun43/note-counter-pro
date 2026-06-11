package com.capacitorjs.plugins.filesystem;

import com.capacitorjs.plugins.filesystem.FilesystemErrors;
import com.google.android.gms.ads.RequestConfiguration;
import g4.i;
import r3.f;
import r3.g;
import r3.h;
import r3.j;
import r3.l;
import r3.m;
import r3.n;
import r3.o;
import r3.p;
import r3.q;
import r3.r;
import r3.t;

/* loaded from: classes.dex */
public final class FilesystemErrorsKt {
    public static final FilesystemErrors.ErrorInfo toFilesystemError(Throwable th, String str) {
        i.e(th, "<this>");
        i.e(str, "methodName");
        if (th instanceof t) {
            return FilesystemErrors.INSTANCE.invalidPath(((t) th).f3193g);
        }
        if (th instanceof o) {
            return FilesystemErrors.INSTANCE.doesNotExist(str, ((o) th).f3191g);
        }
        if (th instanceof p) {
            return FilesystemErrors.INSTANCE.notAllowed(str, "content:// URIs");
        }
        if (th instanceof q) {
            return FilesystemErrors.INSTANCE.notAllowed(str, "directories");
        }
        if (th instanceof r) {
            return FilesystemErrors.INSTANCE.notAllowed(str, "files, only directories are supported");
        }
        if (th instanceof l) {
            return FilesystemErrors.INSTANCE.directoryCreationAlreadyExists(((l) th).f3190g);
        }
        if (th instanceof m) {
            return FilesystemErrors.INSTANCE.getMissingParentDirectories();
        }
        if (th instanceof n) {
            return FilesystemErrors.INSTANCE.getCannotDeleteChildren();
        }
        if ((th instanceof h) || (th instanceof g) || (th instanceof j)) {
            return FilesystemErrors.INSTANCE.notAllowed(str, "the provided source and destinations");
        }
        if (th instanceof f) {
            return FilesystemErrors.INSTANCE.directoryCreationAlreadyExists(((f) th).f3183g);
        }
        if (th instanceof r3.i) {
            return FilesystemErrors.INSTANCE.getMissingParentDirectories();
        }
        if (th instanceof IllegalArgumentException) {
            return FilesystemErrors.INSTANCE.invalidInputMethod(str);
        }
        FilesystemErrors filesystemErrors = FilesystemErrors.INSTANCE;
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return filesystemErrors.operationFailed(str, localizedMessage);
    }
}
