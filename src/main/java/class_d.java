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

public final class class_d extends class_f {
    private short field_d_a;
    private byte field_d_b;
    private int field_d_c;
    private boolean field_d_d;
    private int field_d_e;
    int field_d_f;
    int field_d_g;
    int field_d_h;
    int field_d_i = 7;
    private static int[] field_d_j = new int[]{500, 100, 300};
    private static int field_d_k = field_d_j[0] + field_d_j[1] + field_d_j[2];
    private static int field_d_l = field_d_j[2];

    public class_d() {
        this.field_f_ab = 7;
    }

    public final int method_d_a(byte[] param1, int param2) {
        param2 = super.method_d_a(param1, param2);
        this.field_d_a = (short)(param1[param2++] << 8 | param1[param2++] & 0xFF);
        this.field_d_b = param1[param2++];
        this.field_d_c = 0;
        this.field_d_d = false;
        this.field_d_e = 0;
        if (this.field_f_c.field_l_a >= 0) {
            this.field_d_d = true;
        }
        return param2;
    }

    @Override
    public final void method_c_f() {
        this.field_f_m = -7864320;
        this.field_f_o = 0x780000;
        this.field_f_n = -7864320;
        this.field_f_p = 0x780000;
        this.field_d_f = -2621440;
        this.field_d_g = 0x280000;
        this.field_d_h = -2621440;
        this.field_d_i = 0x280000;
    }

    public final void method_d_b() {
        if (this.field_d_c == 0 && class_m.field_m_a[1] == 0) {
            class_m.field_m_a[1] = 1;
            class_b.field_b_da = this;
            class_c c2 = (class_c)this.method_f_r().method_f_q(this.field_d_a);
            this.method_f_f(class_f.field_f_a);
            c2.method_c_h(class_f.field_f_a.field_l_c, class_f.field_f_a.field_l_f + 0x230000);
            c2.field_c_z = false;
            c2.field_c_aa = false;
        }
    }

    public final void method_d_c() {
        if (this.field_d_e == 0) {
            float f2 = (float)class_o.field_o_t * 0.001f;
            f2 = 3.0f * f2;
            class_l.field_l_i.method_l_g(f2);
            class_l.field_l_i.field_l_c = 0;
            class_l.field_l_i.field_l_f = 0;
            this.field_f_c.method_l_d(class_l.field_l_i);
            if (this.field_d_d && this.field_f_c.field_l_a < 0) {
                this.field_f_c.field_l_a = 0;
                this.field_f_c.field_l_d = 65536;
                this.field_f_c.field_l_b = -65536;
                this.field_f_c.field_l_e = 0;
            }
            if (!this.field_d_d && this.field_f_c.field_l_a > 0) {
                this.field_f_c.field_l_a = 0;
                this.field_f_c.field_l_d = 65536;
                this.field_f_c.field_l_b = 65536;
                this.field_f_c.field_l_e = 0;
            }
            this.method_f_b();
        }
    }

    public final void method_d_d() {
        if (this.field_d_e == 0) {
            float f2 = (float)class_o.field_o_t * 0.001f;
            f2 = -3.0f * f2;
            class_l.field_l_i.method_l_g(f2);
            class_l.field_l_i.field_l_c = 0;
            class_l.field_l_i.field_l_f = 0;
            this.field_f_c.method_l_d(class_l.field_l_i);
            if (this.field_d_d && this.field_f_c.field_l_b > 0) {
                this.field_f_c.field_l_a = 65536;
                this.field_f_c.field_l_d = 0;
                this.field_f_c.field_l_b = 0;
                this.field_f_c.field_l_e = 65536;
            }
            if (!this.field_d_d && this.field_f_c.field_l_b < 0) {
                this.field_f_c.field_l_a = -65536;
                this.field_f_c.field_l_d = 0;
                this.field_f_c.field_l_b = 0;
                this.field_f_c.field_l_e = 65536;
            }
            this.method_f_b();
        }
    }

    public final void method_d_e() {
        if (this.field_d_e == 0) {
            this.field_d_e = field_d_k;
        }
    }

    @Override
    public final void method_c_g() {
        super.method_c_g();
        this.field_d_c -= class_o.field_o_t;
        if (this.field_d_c < 0) {
            this.field_d_c = 0;
        }
        if (this.field_d_e > 0) {
            this.field_d_e -= class_o.field_o_t;
            if (this.field_d_e <= field_d_l && class_m.field_m_a[1] == 1) {
                class_c c2 = (class_c)this.method_f_r().method_f_q(this.field_d_a);
                ((class_c)this.method_f_r().method_f_q(this.field_d_a)).field_c_ai = 0.0f;
                c2.field_c_aj = 0.0f;
                c2.field_c_s = this.field_d_b * this.field_f_c.field_l_a >> 12;
                c2.field_c_t = this.field_d_b * this.field_f_c.field_l_d >> 12;
                c2.field_c_be = false;
                c2.field_c_ab = true;
                c2.field_c_z = true;
                c2.field_c_aa = true;
                c2.field_c_ak = 0.0f;
                c2.field_c_al = 0.0f;
                class_m.field_m_a[1] = 0;
                this.field_d_c = 500;
                this.method_f_f(class_f.field_f_a);
                class_f.field_f_a.method_l_a(0x780000, 0);
                int n = class_l.field_l_g;
                int n2 = class_l.field_l_h;
                c2.field_f_c.field_l_c = n;
                c2.field_f_c.field_l_f = n2;
                class_b.field_b_bf.method_g_d(10, n, n2, this.field_f_c.field_l_a, this.field_f_c.field_l_d);
            }
            if (this.field_d_e <= 0) {
                this.field_d_e = 0;
                for (int j = 0; j < 3; ++j) {
                    class_i i2 = (class_i)class_b.field_b_cw[j + 9];
                    class_i i3 = (class_i)class_b.field_b_cw[j];
                    for (int k = 0; k < i2.field_i_e.length; ++k) {
                        i2.field_i_e[k] = i3.field_i_e[k];
                        i2.field_i_f[k] = i3.field_i_f[k];
                    }
                }
            }
        }
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        int n;
        if (this.field_d_e > 0) {
            int n2;
            int n3 = field_d_k - this.field_d_e;
            int n4 = 0;
            n = 0;
            for (n2 = 0; n2 < 3 && n3 >= n4 + field_d_j[n2]; ++n2) {
                n4 += field_d_j[n2];
                ++n;
            }
            n2 = n;
            float f2 = (float)(n3 - n4) / (float)field_d_j[n2];
            float f3 = 1.0f - f2;
            for (n = 0; n < 3; ++n) {
                class_i i2 = (class_i)class_b.field_b_cw[n2 * 3 + n];
                class_i i3 = (class_i)class_b.field_b_cw[n + 9];
                class_i i4 = n2 == 2 ? (class_i)class_b.field_b_cw[n] : (class_i)class_b.field_b_cw[(n2 + 1) * 3 + n];
                for (int j = 0; j < i3.field_i_e.length; ++j) {
                    i3.field_i_e[j] = (int)((float)i2.field_i_e[j] * f3 + (float)i4.field_i_e[j] * f2);
                    i3.field_i_f[j] = (int)((float)i2.field_i_f[j] * f3 + (float)i4.field_i_f[j] * f2);
                }
            }
        }
        this.method_f_f(class_f.field_f_a);
        class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
        int n5 = class_l.field_l_i.field_l_c >> 16;
        int n6 = class_l.field_l_i.field_l_f >> 16;
        for (n = 0; n < 3; ++n) {
            class_f f4 = class_b.field_b_cw[n + 9];
            class_b.field_b_cw[n + 9].field_f_c.field_l_c = this.field_f_c.field_l_c;
            f4.field_f_c.field_l_f = this.field_f_c.field_l_f;
            f4.field_f_c.field_l_a = this.field_f_c.field_l_a;
            f4.field_f_c.field_l_d = this.field_f_c.field_l_d;
            f4.field_f_c.field_l_b = this.field_f_c.field_l_b;
            f4.field_f_c.field_l_e = this.field_f_c.field_l_e;
            f4.method_f_b();
            f4.method_c_o(param1, param2, param3);
        }
        class_o.method_o_ay(n5, n6, 48);
    }
}