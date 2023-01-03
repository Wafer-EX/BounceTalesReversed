/*
 * Copyright 2022-2023 Kirill Lomakin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.nokia.mid.ui.DirectGraphics;

import javax.microedition.lcdui.Graphics;

public final class class_m extends class_f {
    public static int[] field_m_a;
    private byte[][] field_m_b;
    private byte field_m_d;
    private byte field_m_e;
    private short field_m_f;
    private int field_m_i;
    private int field_m_j;
    private static class_m[] field_m_n;
    private static class_f[] field_m_m = new class_f[2];
    private static int field_m_o = 0;
    private byte field_m_c = 0;
    private byte field_m_g = 0;
    private byte field_m_h = -1;
    private class_f[] field_m_k = new class_f[2];
    private class_f[] field_m_l = new class_f[2];

    public class_m() {
        this.field_f_ab = (byte) 3;
    }

    private boolean method_m_a(byte[] param1) {
        class_f method_f_q;
        switch (param1[0]) {
            case 0:
                short s = class_b.field_b_a[class_f.method_f_u(param1, 1)];
                if (class_b.method_b_c(13)) {
                    return true;
                }
                class_b.method_b_v(s);
                return true;
            case 1:
                class_f method_f_q2 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q2 != null) {
                    ((class_j) method_f_q2).method_j_a();
                    return true;
                }
                return true;
            case 2:
                field_m_n[param1[1]].method_m_b(1);
                return true;
            case 3:
                field_m_n[param1[1]].method_m_b(0);
                return true;
            case 4:
                field_m_n[param1[1]].method_m_b(2);
                return true;
            case 5:
                field_m_n[param1[1]].method_m_b(3);
                return true;
            case 6:
                short method_f_u = class_f.method_f_u(param1, 3);
                if (method_f_u >= 0) {
                    method_m_k(param1, (short) (method_f_u - class_o.field_o_t));
                    return false;
                }
                param1[3] = param1[1];
                param1[4] = param1[2];
                return true;
            case 7:
                if (param1[1] == 1) {
                    method_m_i(param1[2], method_m_j(param1));
                }
                if (param1[1] == 2) {
                    field_m_a[param1[2]] = method_m_g(param1);
                    return true;
                }
                return true;
            case 8:
                if (param1[1] == 1) {
                    method_m_i(param1[2], method_m_h(param1[2]) + method_m_j(param1));
                }
                if (param1[1] == 2) {
                    int[] iArr = field_m_a;
                    byte b = param1[2];
                    iArr[b] = iArr[b] + method_m_g(param1);
                    return true;
                }
                return true;
            case 9:
                if (param1[1] == 1) {
                    method_m_i(param1[2], method_m_h(param1[2]) - method_m_j(param1));
                }
                if (param1[1] == 2) {
                    int[] iArr2 = field_m_a;
                    byte b2 = param1[2];
                    iArr2[b2] = iArr2[b2] - method_m_g(param1);
                    return true;
                }
                return true;
            case 10:
                if (param1[1] == 1) {
                    method_m_i(param1[2], method_m_h(param1[2]) * method_m_j(param1));
                }
                if (param1[1] == 2) {
                    int[] iArr3 = field_m_a;
                    byte b3 = param1[2];
                    iArr3[b3] = iArr3[b3] * method_m_g(param1);
                    return true;
                }
                return true;
            case 11:
                if (param1[1] == 1) {
                    method_m_i(param1[2], method_m_h(param1[2]) / method_m_j(param1));
                }
                if (param1[1] == 2) {
                    int[] iArr4 = field_m_a;
                    byte b4 = param1[2];
                    iArr4[b4] = iArr4[b4] / method_m_g(param1);
                    return true;
                }
                return true;
            case 12:
                if (param1[1] == 2) {
                    if (field_m_a[param1[2]] == method_m_g(param1)) {
                        return true;
                    }
                } else if (param1[1] == 1 && method_m_h(param1[2]) == method_m_j(param1)) {
                    return true;
                }
                this.field_m_h = (byte) (param1[field_m_o] - 2);
                return true;
            case 13:
                if (param1[1] == 2) {
                    if (field_m_a[param1[2]] != method_m_g(param1)) {
                        return true;
                    }
                } else if (param1[1] == 1 && method_m_h(param1[2]) != method_m_j(param1)) {
                    return true;
                }
                this.field_m_h = (byte) (param1[field_m_o] - 2);
                return true;
            case 14:
                if (param1[1] == 2) {
                    if (field_m_a[param1[2]] < method_m_g(param1)) {
                        return true;
                    }
                } else if (param1[1] == 1 && method_m_h(param1[2]) < method_m_j(param1)) {
                    return true;
                }
                this.field_m_h = (byte) (param1[field_m_o] - 2);
                return true;
            case 15:
                if (param1[1] == 2) {
                    if (field_m_a[param1[2]] > method_m_g(param1)) {
                        return true;
                    }
                } else if (param1[1] == 1 && method_m_h(param1[2]) > method_m_j(param1)) {
                    return true;
                }
                this.field_m_h = (byte) (param1[field_m_o] - 2);
                return true;
            case 16:
                class_f method_f_q3 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q3 == null) {
                    return true;
                }
                int method_f_v = class_f.method_f_v(param1, 15);
                int i = class_o.field_o_t;
                if (method_f_v - i <= 0) {
                    param1[15] = param1[11];
                    param1[16] = param1[12];
                    param1[17] = param1[13];
                    param1[18] = param1[14];
                    i = method_f_v;
                }
                method_f_q3.field_f_c.field_l_c += class_f.method_f_v(param1, 3) * i;
                method_f_q3.field_f_c.field_l_f += class_f.method_f_v(param1, 7) * i;
                method_f_q3.method_f_b();
                method_f_q3.method_f_c();
                int i2 = method_f_v - i;
                if (i2 <= 0) {
                    return true;
                }
                method_m_l(param1, 15, i2);
                return false;
            case 17:
                var arr = param1;
                int integer3 = class_f.method_f_u(arr, 1);
                class_f class_f4;
                if ((class_f4 = this.method_f_r().method_f_q((short)integer3)) == null) {
                    return true;
                }
                int integer5 = class_f.method_f_v(arr, 11);
                integer3 = class_f.method_f_v(arr, 7);
                int integer6 = class_o.field_o_t;
                if (integer5 == integer3) {
                    method_m_l(arr, 15, class_f4.field_f_c.field_l_a);
                    method_m_l(arr, 19, class_f4.field_f_c.field_l_b);
                    method_m_l(arr, 23, class_f4.field_f_c.field_l_d);
                    method_m_l(arr, 27, class_f4.field_f_c.field_l_e);
                }
                if (integer5 - integer6 <= 0) {
                    arr[11] = arr[7];
                    arr[12] = arr[8];
                    arr[13] = arr[9];
                    arr[14] = arr[10];
                    integer5 = 0;
                }
                class_l.field_l_i.method_l_g(class_f.method_f_v(arr, 3) * (long)(integer3 - integer5) / integer3 / 65536.0f);
                class_l.field_l_i.field_l_c = 0;
                class_l.field_l_i.field_l_f = 0;
                class_f4.field_f_c.field_l_a = class_f.method_f_v(arr, 15);
                class_f4.field_f_c.field_l_b = class_f.method_f_v(arr, 19);
                class_f4.field_f_c.field_l_d = class_f.method_f_v(arr, 23);
                class_f4.field_f_c.field_l_e = class_f.method_f_v(arr, 27);
                class_f4.field_f_c.method_l_d(class_l.field_l_i);
                class_f4.method_f_b();
                class_f4.method_f_c();
                if ((integer5 -= integer6) <= 0) {
                    return true;
                }
                method_m_l(arr, 11, integer5);
                return  false;
            case 18:
                class_f method_f_q5 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q5 == null) {
                    return true;
                }
                short method_f_u2 = class_f.method_f_u(param1, 3);
                if (method_f_u2 < 0) {
                    method_f_q5.field_f_c.field_l_c = class_f.method_f_v(param1, 5);
                    method_f_q5.field_f_c.field_l_f = class_f.method_f_v(param1, 9);
                } else {
                    class_f method_f_q6 = method_f_r().method_f_q(method_f_u2);
                    if (method_f_q6 != null) {
                        method_f_q6.method_f_f(class_f.field_f_a);
                        int i5 = class_f.field_f_a.field_l_c;
                        int i6 = class_f.field_f_a.field_l_f;
                        method_f_q5.field_f_c.field_l_c = 0;
                        method_f_q5.field_f_c.field_l_f = 0;
                        method_f_q5.field_f_y = true;
                        method_f_q5.method_f_f(class_f.field_f_a);
                        class_f.field_f_a.method_l_f(class_l.field_l_i);
                        class_l.field_l_i.method_l_a(i5, i6);
                        method_f_q5.field_f_c.field_l_c = class_l.field_l_g;
                        method_f_q5.field_f_c.field_l_f = class_l.field_l_h;
                    }
                }
                method_f_q5.method_f_b();
                method_f_q5.method_f_c();
                method_f_q5.method_f_f(method_f_q5.field_f_b);
                return true;
            case 19:
                short method_f_u3 = class_f.method_f_u(param1, 1);
                short method_f_u4 = class_f.method_f_u(param1, 3);
                class_f method_f_r = method_f_r();
                class_f method_f_q7 = class_f.field_f_aq.method_f_q(method_f_u3);
                if (method_f_q7 == null || (method_f_q = method_f_r.method_f_q(method_f_u4)) == null) {
                    return true;
                }
                method_f_q7.method_f_d(method_f_q);
                method_f_q7.method_f_c();
                return true;
            case 20:
                class_f method_f_q8 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q8 == null) {
                    return true;
                }
                method_f_q8.method_f_c();
                method_f_q8.method_f_d(class_f.field_f_aq);
                return true;
            case 21:
                this.field_m_h = (byte) (param1[1] - 2);
                return true;
            case 22:
                return true;
            case 23:
                if (this.field_m_e == 1) {
                    this.field_m_c = (byte) 0;
                    return false;
                }
                this.field_m_c = (byte) 1;
                return false;
            case 24:
                return !method_m_e(this.field_m_l, this.field_m_j, method_f_r().method_f_q(class_f.method_f_u(param1, 1)));
            case 25:
                class_b.field_b_dd = this.field_f_b.field_l_c;
                class_b.field_b_de = this.field_f_b.field_l_f;
                return true;
            case 26:
                class_f method_f_q9 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q9.field_f_ab == 4) {
                    class_c class_cVar = (class_c) method_f_q9;
                    class_cVar.field_c_x += class_f.method_f_u(param1, 3);
                    class_cVar.field_c_y += class_f.method_f_u(param1, 5);
                    return true;
                }
                return true;
            case 27:
                class_f method_f_q10 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q10.field_f_ab == 4) {
                    class_c class_cVar2 = (class_c) method_f_q10;
                    class_cVar2.field_c_v += class_f.method_f_u(param1, 3);
                    class_cVar2.field_c_w += class_f.method_f_u(param1, 5);
                    return true;
                }
                return true;
            case 28:
                class_f method_f_q11 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q11.field_f_ab == 4) {
                    class_c class_cVar3 = (class_c) method_f_q11;
                    class_cVar3.field_c_s += class_f.method_f_u(param1, 3);
                    class_cVar3.field_c_t += class_f.method_f_u(param1, 5);
                    return true;
                }
                return true;
            case 29:
                class_f method_f_q12 = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                if (method_f_q12 == null) {
                    return true;
                }
                int method_f_v4 = class_f.method_f_v(param1, 3);
                int method_f_v5 = class_f.method_f_v(param1, 7);
                if ((method_f_v4 & 1) > 0) {
                    method_f_q12.field_f_v &= -32;
                    method_f_q12.field_f_v |= method_f_v5 & 31;
                    method_f_q12.field_f_u = (byte) ((method_f_q12.field_f_v & 31) - 16);
                }
                if ((method_f_v4 & 32) > 0) {
                    method_f_q12.field_f_v &= -33;
                    method_f_q12.field_f_v |= method_f_v5 & 32;
                }
                if ((method_f_v4 & 128) > 0) {
                    method_f_q12.field_f_v &= -129;
                    method_f_q12.field_f_v |= method_f_v5 & 128;
                    if (method_f_q12.method_f_a() == 5) {
                        class_j class_jVar = (class_j) method_f_q12;
                        if (class_jVar.field_j_c[0] == 358) {
                            class_jVar.method_f_f(class_f.field_f_a);
                            class_b.field_b_bi.method_g_f(24, class_f.field_f_a.field_l_c + class_jVar.field_f_m + 3932160, class_f.field_f_a.field_l_f + class_jVar.field_f_n + 3932160, class_f.field_f_a.field_l_c + (class_jVar.field_f_o - 3932160), class_f.field_f_a.field_l_f + (class_jVar.field_f_p - 3932160), 840, 0, 0, 360, 2040, 510);
                        }
                    }
                }
                if ((method_f_v4 & 256) > 0) {
                    method_f_q12.field_f_v &= -257;
                    method_f_q12.field_f_v |= method_f_v5 & 256;
                    return true;
                }
                return true;
            case 30:
                class_f.field_f_aj = method_f_r().method_f_q(class_f.method_f_u(param1, 1));
                return true;
            case 31:
                class_b.field_b_db = param1[1] == 1;
                class_f.field_f_am = class_f.method_f_u(param1, 2);
                class_f.field_f_an = class_f.method_f_u(param1, 4);
                return true;
            case 32:
                class_b.field_b_db = false;
                class_f.field_f_am = 90;
                class_f.field_f_an = 140;
                return true;
            default:
                return true;
        }
    }

    @Override
    public final int method_d_a(byte[] paramArrayOfbyte, int paramInt) {
        paramInt = super.method_d_a(paramArrayOfbyte, paramInt);
        this.field_f_m = (paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF) << 16;
        this.field_f_p = (paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF) << 16;
        this.field_f_o = (paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF) << 16;
        this.field_f_n = (paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF) << 16;
        this.field_m_c = paramArrayOfbyte[paramInt++];
        if (this.field_m_c == 2)
            this.field_m_h = 0;
        this.field_m_d = paramArrayOfbyte[paramInt++];
        this.field_m_e = paramArrayOfbyte[paramInt++];
        this.field_m_f = method_f_u(paramArrayOfbyte, paramInt);
        paramInt += 2;
        this.field_m_g = paramArrayOfbyte[paramInt++];
        this.field_m_b = new byte[this.field_m_g][];
        for (byte b = 0; b < this.field_m_g; b++) {
            byte b1 = paramArrayOfbyte[paramInt++];
            this.field_m_b[b] = new byte[b1];
            for (byte b2 = 0; b2 < b1; b2++)
                this.field_m_b[b][b2] = paramArrayOfbyte[paramInt++];
        }
        this.field_f_v |= 0x80;
        return paramInt;
    }

    public final void method_m_b(int param1) {
        switch (this.field_m_c) {
            case 0:
                if (param1 == 2) {
                    this.field_m_c = (byte) 2;
                    this.field_m_h = (byte) 0;
                }
                if (param1 == 1) {
                    this.field_m_c = (byte) 1;
                    return;
                }
                return;
            case 1:
                if (param1 == 0) {
                    this.field_m_c = (byte) 0;
                    method_m_c();
                    return;
                }
                return;
            case 2:
                if (param1 == 1) {
                    this.field_m_c = (byte) 1;
                }
                if (param1 == 3) {
                    this.field_m_c = (byte) 3;
                    return;
                }
                return;
            case 3:
                if (param1 == 2) {
                    this.field_m_c = (byte) 2;
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void method_m_c() {
        this.field_m_h = (byte) -1;
        for (int i = 0; i < this.field_m_b.length; i++) {
            byte[] bArr = this.field_m_b[i];
            switch (bArr[0]) {
                case 6:
                    bArr[3] = bArr[1];
                    bArr[4] = bArr[2];
                    break;
                case 16:
                    bArr[15] = bArr[11];
                    bArr[16] = bArr[12];
                    bArr[17] = bArr[13];
                    bArr[18] = bArr[14];
                    break;
                case 17:
                    bArr[11] = bArr[7];
                    bArr[12] = bArr[8];
                    bArr[13] = bArr[9];
                    bArr[14] = bArr[10];
                    break;
            }
        }
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) { }

    public static void method_m_d(class_m[] class_mArray, class_c class_c2) {
        int n = class_c2.field_f_o - class_c2.field_f_m;
        int n2 = class_c2.field_f_p - class_c2.field_f_n;
        n = n < n2 ? n2 >> 1 : n >> 1;
        for (n2 = 0; n2 < class_mArray.length; ++n2) {
            class_m class_m2 = class_mArray[n2];
            if (class_m2.field_m_c == 1) continue;
            class_m2.method_f_f(class_f.field_f_a);
            class_f.field_f_a.method_l_f(class_l.field_l_i);
            class_l.field_l_i.method_l_a(class_c2.field_f_b.field_l_c, class_c2.field_f_b.field_l_f);
            int n3 = class_l.field_l_g;
            int n4 = class_l.field_l_h;
            class_l.field_l_i.method_l_a(class_c2.field_f_c.field_l_c, class_c2.field_f_c.field_l_f);
            int n5 = class_l.field_l_g;
            int n6 = class_l.field_l_h;
            int n7 = class_m2.field_f_m - n;
            int n8 = class_m2.field_f_n - n;
            int n9 = class_m2.field_f_o + n;
            int n10 = class_m2.field_f_p + n;
            if (!(class_f.method_f_y(n3, n4, n5, n6, n7, n8, n9, n10) | class_f.method_f_aa(n5, n6, n7, n8, n9, n10))) continue;
            class_c class_c3 = class_c2;
            if (class_m2.field_m_i >= 2) continue;
            class_m2.field_m_k[class_m2.field_m_i] = class_c3;
            ++class_m2.field_m_i;
        }
    }

    private static final boolean method_m_e(Object[] param1, int param2, Object param3) {
        for (int i = 0; i < param2; i++) {
            if (param1[i] == param3) {
                return true;
            }
        }
        return false;
    }

    public static void method_m_f(class_m[] param1) {
        boolean z;
        field_m_n = param1;
        for (class_m class_mVar : param1) {
            if (class_mVar.field_m_d == 0) {
                for (int i = 0; i < class_mVar.field_m_i; i++) {
                    class_f class_fVar = class_mVar.field_m_k[i];
                    if (!method_m_e(class_mVar.field_m_l, class_mVar.field_m_j, class_fVar)) {
                        field_m_m[i] = class_fVar;
                    }
                }
            } else {
                for (int i2 = 0; i2 < class_mVar.field_m_j; i2++) {
                    class_f class_fVar2 = class_mVar.field_m_l[i2];
                    if (!method_m_e(class_mVar.field_m_k, class_mVar.field_m_i, class_fVar2)) {
                        field_m_m[i2] = class_fVar2;
                    }
                }
            }
            for (int i3 = 0; i3 < field_m_m.length; i3++) {
                if (field_m_m[i3] != null && (class_mVar.field_m_f < 0 || field_m_m[i3].method_f_o() == class_mVar.field_m_f)) {
                    class_mVar.method_m_b(2);
                }
            }
            for (int i4 = 0; i4 < class_mVar.field_m_k.length; i4++) {
                class_mVar.field_m_l[i4] = class_mVar.field_m_k[i4];
                class_mVar.field_m_k[i4] = null;
                field_m_m[i4] = null;
            }
            class_mVar.field_m_j = class_mVar.field_m_i;
            class_mVar.field_m_i = 0;
        }
        for (class_m class_mVar2 : param1) {
            do {
                if (class_mVar2.method_f_h(class_b.field_b_cx) && class_mVar2.field_m_c == 2 && class_mVar2.method_m_a(class_mVar2.field_m_b[class_mVar2.field_m_h])) {
                    if (class_mVar2.field_m_h < -1) {
                        class_mVar2.field_m_h = (byte) -1;
                    }
                    class_mVar2.field_m_h = (byte) (class_mVar2.field_m_h + 1);
                    if (class_mVar2.field_m_h >= class_mVar2.field_m_g) {
                        if (class_mVar2.field_m_e == 1) {
                            class_mVar2.field_m_c = (byte) 0;
                            class_mVar2.method_m_c();
                        } else {
                            class_mVar2.field_m_c = (byte) 1;
                        }
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                } else {
                    z = false;
                    continue;
                }
            } while (z);
        }
    }

    private static final int method_m_g(byte[] param1) {
        byte b = param1[3];
        int i = 0;
        field_m_o = 4;
        switch (b) {
            case 2:
                field_m_o++;
                i = field_m_a[param1[4]];
                break;
            case 32:
                field_m_o += 4;
                i = class_f.method_f_v(param1, 4);
                break;
        }
        return i;
    }

    private static float method_m_h(byte param1) {
        return Float.intBitsToFloat(field_m_a[param1]);
    }

    private static final void method_m_i(byte param1, float param2) {
        field_m_a[param1] = Float.floatToIntBits(param2);
    }

    private static final float method_m_j(byte[] param1) {
        byte b = param1[3];
        float f = 0.0f;
        field_m_o = 4;
        switch (b) {
            case 1:
                field_m_o++;
                f = method_m_h(param1[4]);
                break;
            case 2:
                field_m_o++;
                f = field_m_a[param1[4]];
                break;
            case 16:
                field_m_o += 4;
                f = Float.intBitsToFloat((int) (((((((0 | param1[4]) << 8) | (param1[5] & 255)) << 8) | (param1[6] & 255)) << 8) | (param1[7] & 255)));
                break;
            case 32:
                field_m_o += 4;
                f = class_f.method_f_v(param1, 4);
                break;
        }
        return f;
    }

    private static void method_m_k(byte[] param1, int param2) {
        param1[3] = (byte) (param2 >> 8);
        param1[4] = (byte) param2;
    }

    private static void method_m_l(byte[] param1, int param2, int param3) {
        param1[param2] = (byte) (param3 >> 24);
        param1[param2 + 1] = (byte) (param3 >> 16);
        param1[param2 + 2] = (byte) (param3 >> 8);
        param1[param2 + 3] = (byte) param3;
    }
}