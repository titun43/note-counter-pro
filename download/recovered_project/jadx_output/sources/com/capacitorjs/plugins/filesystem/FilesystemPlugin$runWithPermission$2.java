package com.capacitorjs.plugins.filesystem;

import com.getcapacitor.PluginCall;
import f4.p;
import f4.q;
import r3.f0;
import r3.g0;
import t3.h;
import w3.c;
import y3.e;
import y3.g;

@e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$2", f = "FilesystemPlugin.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FilesystemPlugin$runWithPermission$2 extends g implements p {
    final /* synthetic */ PluginCall $call;
    final /* synthetic */ q $onPermissionGranted;
    final /* synthetic */ g0 $toUri;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilesystemPlugin this$0;

    @e(c = "com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$2$1", f = "FilesystemPlugin.kt", l = {392}, m = "invokeSuspend", v = 1)
    /* renamed from: com.capacitorjs.plugins.filesystem.FilesystemPlugin$runWithPermission$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends g implements p {
        final /* synthetic */ q $onPermissionGranted;
        final /* synthetic */ f0 $resolvedSourceUri;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, f0 f0Var, c cVar) {
            super(2, cVar);
            this.$onPermissionGranted = qVar;
            this.$resolvedSourceUri = f0Var;
        }

        @Override // y3.a
        public final c create(Object obj, c cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onPermissionGranted, this.$resolvedSourceUri, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // y3.a
        public final Object invokeSuspend(Object obj) {
            f0 f0Var = (f0) this.L$0;
            x3.a aVar = x3.a.f3712g;
            int i5 = this.label;
            if (i5 == 0) {
                b3.g.x(obj);
                q qVar = this.$onPermissionGranted;
                f0 f0Var2 = this.$resolvedSourceUri;
                this.L$0 = null;
                this.label = 1;
                if (qVar.invoke(f0Var2, f0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b3.g.x(obj);
            }
            return h.f3400a;
        }

        @Override // f4.p
        public final Object invoke(f0 f0Var, c cVar) {
            return ((AnonymousClass1) create(f0Var, cVar)).invokeSuspend(h.f3400a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesystemPlugin$runWithPermission$2(FilesystemPlugin filesystemPlugin, g0 g0Var, PluginCall pluginCall, q qVar, c cVar) {
        super(2, cVar);
        this.this$0 = filesystemPlugin;
        this.$toUri = g0Var;
        this.$call = pluginCall;
        this.$onPermissionGranted = qVar;
    }

    @Override // y3.a
    public final c create(Object obj, c cVar) {
        FilesystemPlugin$runWithPermission$2 filesystemPlugin$runWithPermission$2 = new FilesystemPlugin$runWithPermission$2(this.this$0, this.$toUri, this.$call, this.$onPermissionGranted, cVar);
        filesystemPlugin$runWithPermission$2.L$0 = obj;
        return filesystemPlugin$runWithPermission$2;
    }

    @Override // y3.a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var = (f0) this.L$0;
        x3.a aVar = x3.a.f3712g;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b3.g.x(obj);
        this.this$0.runWithPermission(this.$toUri, this.$call, new AnonymousClass1(this.$onPermissionGranted, f0Var, null));
        return h.f3400a;
    }

    @Override // f4.p
    public final Object invoke(f0 f0Var, c cVar) {
        return ((FilesystemPlugin$runWithPermission$2) create(f0Var, cVar)).invokeSuspend(h.f3400a);
    }
}
