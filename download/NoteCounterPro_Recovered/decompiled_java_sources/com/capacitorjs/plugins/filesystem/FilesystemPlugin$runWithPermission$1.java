package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import f4.p;
import g4.i;
import o3.k;
import o4.t;
import r3.f0;
import r3.g0;
import t3.d;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$1", f = "FilesystemPlugin.kt", l = {356, 365}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$runWithPermission$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ p $onPermissionGranted;
    final /* synthetic */ g0 $uri;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$runWithPermission$1(FilesystemPlugin filesystemPlugin, g0 g0Var, PluginCall pluginCall, p pVar, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$uri = g0Var;
        this.$call = pluginCall;
        this.$onPermissionGranted = pVar;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        return new FilesystemPlugin$runWithPermission$1(this.this$0, this.$uri, this.$call, this.$onPermissionGranted, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0037, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007c  */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object d5;
        Object obj2;
        boolean isStoragePermissionGranted;
        Throwable a5;
        x3.a aVar = x3.a.f3712g;
        int i5 = this.label;
        if (i5 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            g0 g0Var = this.$uri;
            this.label = 1;
            d5 = controller.d(g0Var, this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                b3.g.x(obj);
                d5 = obj2;
                PluginCall pluginCall = this.$call;
                a5 = t3.e.a(d5);
                if (a5 != null) {
                    String methodName = pluginCall.getMethodName();
                    i.d(methodName, "getMethodName(...)");
                    PluginResultExtensionsKt.sendError(pluginCall, FilesystemErrorsKt.toFilesystemError(a5, methodName));
                }
                return h.f3400a;
            }
            b3.g.x(obj);
            d5 = ((t3.e) obj).f3396g;
        }
        FilesystemPlugin filesystemPlugin = this.this$0;
        g0 g0Var2 = this.$uri;
        PluginCall pluginCall2 = this.$call;
        p pVar = this.$onPermissionGranted;
        if (!(d5 instanceof d)) {
            f0 f0Var = (f0) d5;
            if (f0Var.B()) {
                isStoragePermissionGranted = filesystemPlugin.isStoragePermissionGranted(g0Var2.f3185c == null);
                if (!isStoragePermissionGranted) {
                    filesystemPlugin.requestAllPermissions(pluginCall2, "permissionCallback");
                }
            }
            this.L$0 = d5;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 2;
            if (pVar.invoke(f0Var, this) != aVar) {
                obj2 = d5;
                d5 = obj2;
            }
            return aVar;
        }
        PluginCall pluginCall3 = this.$call;
        a5 = t3.e.a(d5);
        if (a5 != null) {
        }
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(t tVar, c cVar) {
        return ((FilesystemPlugin$runWithPermission$1) create(tVar, cVar)).invokeSuspend(h.f3400a);
    }
}
