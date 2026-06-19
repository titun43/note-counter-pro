package com.getcapacitor.community.admob;

import com.getcapacitor.JSObject;
import e0.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements x2.a, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdMob f855b;

    public /* synthetic */ a(AdMob adMob, int i5) {
        this.f854a = i5;
        this.f855b = adMob;
    }

    @Override // x2.a
    public void a(String str, JSObject jSObject) {
        switch (this.f854a) {
            case 0:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 1:
            default:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 2:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 3:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 4:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 5:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 6:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 7:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 8:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 9:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 10:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 11:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 12:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 13:
                this.f855b.notifyListeners(str, jSObject);
                break;
            case 14:
                this.f855b.notifyListeners(str, jSObject);
                break;
        }
    }

    @Override // e0.d
    public Object get() {
        switch (this.f854a) {
            case 1:
                return this.f855b.getActivity();
            default:
                return this.f855b.getContext();
        }
    }
}
