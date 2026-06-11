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

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$getUri$1", f = "FilesystemPlugin.kt", l = {200}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$getUri$1 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ g0 $input;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$getUri$1(FilesystemPlugin filesystemPlugin, g0 g0Var, PluginCall pluginCall, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$input = g0Var;
        this.$call = pluginCall;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        return new FilesystemPlugin$getUri$1(this.this$0, this.$input, this.$call, cVar);
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        k controller;
        Object d5;
        x3.a aVar = x3.a.f3712g;
        int i5 = this.label;
        if (i5 == 0) {
            b3.g.x(obj);
            controller = this.this$0.getController();
            g0 g0Var = this.$input;
            this.label = 1;
            d5 = controller.d(g0Var, this);
            if (d5 == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b3.g.x(obj);
            d5 = ((t3.e) obj).f3396g;
        }
        PluginCall pluginCall = this.$call;
        if (!(d5 instanceof d)) {
            PluginResultExtensionsKt.sendSuccess$default(pluginCall, FilesystemMethodResultsKt.toResultObject((f0) d5), false, 2, null);
        }
        PluginCall pluginCall2 = this.$call;
        Throwable a5 = t3.e.a(d5);
        if (a5 != null) {
            String methodName = pluginCall2.getMethodName();
            i.d(methodName, "getMethodName(...)");
            PluginResultExtensionsKt.sendError(pluginCall2, FilesystemErrorsKt.toFilesystemError(a5, methodName));
        }
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(t tVar, c cVar) {
        return ((FilesystemPlugin$getUri$1) create(tVar, cVar)).invokeSuspend(h.f3400a);
    }
}
