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

public final class class_k extends class_f {
    short field_k_a;
    class_c field_k_b;
    int field_k_c;
    private int field_k_d;
    int field_k_e;
    float field_k_f;
    byte field_k_g;
    boolean field_k_h;

    public class_k() {
        this.field_f_ab = (byte)8;
    }

    @Override
    public final int method_d_a(byte[] param1, int param2) {
        param2 = super.method_d_a(param1, param2);
        this.field_k_a = (short)(param1[param2++] << 8 | param1[param2++] & 0xFF);
        this.field_k_g = param1[param2++];
        this.field_k_c = 0;
        this.field_k_e = 0;
        this.field_k_d = 0;
        int n2 = class_b.method_b_af(class_b.field_b_cu);
        if (n2 == 0) {
            this.field_k_a = (short)497;
        }
        if (n2 == 1) {
            this.field_k_a = (short)509;
        }
        if (n2 == 2) {
            this.field_k_a = (short)490;
        }
        return param2;
    }

    @Override
    public final void method_c_f() {
        this.field_f_m = -4587520;
        this.field_f_o = 0x460000;
        this.field_f_n = 0;
        this.field_f_p = 0x5F0000;
    }

    @Override
    public final void method_c_g() {
        super.method_c_g();
        if (this.field_k_c < this.field_k_e) {
            int n = class_o.field_o_t;
            this.field_k_c += n;
            if (this.field_k_c >= this.field_k_e - this.field_k_e / class_o.method_o_bf(this.field_k_a)) {
                if (!this.field_k_h) {
                    this.field_k_h = true;
                    this.field_k_b.field_c_z = true;
                    this.field_k_b.field_c_t = this.field_k_f;
                    this.field_k_b.field_c_ak = 0.0f;
                    this.field_k_b.field_c_al = 0.0f;
                    this.field_k_b.field_c_ab = true;
                    if (this.field_k_b.equals(class_b.field_b_cz)) {
                        class_m.field_m_a[1] = 0;
                    }
                }
                n = class_o.method_o_bf(this.field_k_a);
                this.field_k_d = this.field_k_c * n / this.field_k_e;
            } else {
                n = class_o.method_o_bf(this.field_k_a);
                this.field_k_d = this.field_k_c * n / this.field_k_e;
                this.method_k_a();
            }
            if (this.field_k_c >= this.field_k_e) {
                this.field_k_c = 0;
                this.field_k_e = 0;
                this.field_k_d = 0;
            }
        }
    }

    public final void method_k_a() {
        this.method_f_f(class_f.field_f_a);
        this.field_k_b.field_f_c.field_l_f = class_f.field_f_a.field_l_f - (65536 * (short)class_o.method_o_bc(class_o.method_o_be(this.field_k_a, this.field_k_d), 0) / class_f.field_f_ag.field_l_a << 16);
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        this.method_f_f(class_f.field_f_a);
        class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
        int n = class_l.field_l_i.field_l_c >> 16;
        int n2 = class_l.field_l_i.field_l_f >> 16;
        class_o.method_o_bd(n, n2, this.field_k_a, this.field_k_d);
    }
}