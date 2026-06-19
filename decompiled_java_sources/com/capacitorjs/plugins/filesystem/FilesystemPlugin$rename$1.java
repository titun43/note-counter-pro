package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import f4.q;
import g4.i;
import o3.k;
import r3.f0;
import t3.d;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$rename$1", f = "FilesystemPlugin.kt", l = {226}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$rename$1 extends g implements q {
    final /* synthetic */ PluginCall $call;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$rename$1(FilesystemPlugin filesystemPlugin, PluginCall pluginCall, c cVar) {
        super(3, cVar);
        this.this$0 = filesystemPlugin;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object g5;
        f0 f0Var = (f0) this.L$0;
        f0 f0Var2 = (f0) this.L$1;
        x3.a aVar = x3.a.f3712g;
        int i5 = this.label;
        if (i5 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            g5 = controller.g(f0Var, f0Var2, this);
            if (g5 == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            g5 = ((t3.e) obj).f3396g;
        }
        PluginCall pluginCall = this.$call;
        if (!(g5 instanceof d)) {
            PluginResultExtensionsKt.sendSuccess$default(pluginCall, null, false, 3, null);
        }
        PluginCall pluginCall2 = this.$call;
        Throwable a5 = t3.e.a(g5);
        if (a5 != null) {
            String methodName = pluginCall2.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall2, FilesystemErrorsKt.toFilesystemError(a5, methodName));
        }
        return h.f3400a;
    }

    @Override // f4.q
    public final Object invoke(f0 f0Var, f0 f0Var2, c cVar) {
        FilesystemPlugin$rename$1 filesystemPlugin$rename$1 = new FilesystemPlugin$rename$1(this.this$0, this.$call, cVar);
        filesystemPlugin$rename$1.L$0 = f0Var;
        filesystemPlugin$rename$1.L$1 = f0Var2;
        return filesystemPlugin$rename$1.invokeSuspend(h.f3400a);
    }
}
