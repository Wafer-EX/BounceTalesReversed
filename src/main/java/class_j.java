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

public final class class_j extends class_f {
    private short[] field_j_a;
    private short[] field_j_b;
    short[] field_j_c;
    private short[] field_j_d;

    public class_j() {
        this.field_f_ab = (byte) 5;
    }

    @Override
    public final int method_d_a(byte[] arr, int integer) {
        integer = super.method_d_a(arr, integer);
        int integer4 = arr[integer++] & 0xFF;
        this.field_j_a = new short[integer4];
        this.field_j_b = new short[integer4];
        this.field_j_c = new short[integer4];
        this.field_j_d = new short[integer4];
        if (integer4 > 0) {
            int integer5 = arr[integer++] & 0xFF;
            short integer6 = (short)(arr[integer++] << 8 | (arr[integer++] & 0xFF));
            short integer7 = (short)(arr[integer++] << 8 | (arr[integer++] & 0xFF));
            if (integer5 > 0) {
                integer = class_f.method_f_x(this.field_j_a, integer4, integer6, arr, integer, integer5);
                integer = class_f.method_f_x(this.field_j_b, integer4, integer7, arr, integer, integer5);
            }
            else {
                for (integer5 = 0; integer5 < integer4; ++integer5) {
                    this.field_j_a[integer5] = integer6;
                    this.field_j_b[integer5] = integer7;
                }
            }
            integer = class_f.method_f_x(this.field_j_c, integer4, 0, arr, integer, 16);
            for (integer5 = 0; integer5 < integer4; ++integer5) {
                this.field_j_d[integer5] = -1;
            }
        }
        return integer;
    }

    public final void method_j_a() {
        for (int i = 0; i < this.field_j_c.length; i++) {
            short s = -1;
            short s2 = 0;
            switch (this.field_j_c[i]) {
                case 118:
                    s = 485;
                    s2 = 9999;
                    break;
                case 334:
                    s = 474;
                    s2 = 750;
                    break;
                case 342:
                    s = 480;
                    s2 = 9999;
                    break;
            }
            if (s >= 0) {
                this.field_j_d[i] = s;
                this.field_j_c[i] = s2;
            }
        }
    }

    private static int method_j_b(int integer) {
        switch (integer) {
            case 474:
                return 150;
            case 480:
                return 150;
            case 485:
                return 150;
            default:
                return 0;
        }
    }

    @Override
    public final void method_c_f() {
        super.method_c_f();
        for (int i = 0; i < this.field_j_c.length; i++) {
            int method_o_bb = (class_o.method_o_bb(this.field_j_c[i], 0) << 16) / class_f.field_f_ag.field_l_a;
            int method_o_bb2 = (class_o.method_o_bb(this.field_j_c[i], 1) << 16) / class_f.field_f_ag.field_l_a;
            int method_o_bb3 = (class_o.method_o_bb(this.field_j_c[i], 2) << 16) / class_f.field_f_ag.field_l_a;
            int method_o_bb4 = (class_o.method_o_bb(this.field_j_c[i], 3) << 16) / class_f.field_f_ag.field_l_a;
            int i2 = this.field_j_a[i] - method_o_bb3;
            int i3 = i2 + method_o_bb;
            int i4 = this.field_j_b[i] - (method_o_bb2 - method_o_bb4);
            int i5 = i4 + method_o_bb2;
            if (i2 < this.field_f_m) {
                this.field_f_m = i2;
            }
            if (i3 > this.field_f_o) {
                this.field_f_o = i3;
            }
            if (i4 < this.field_f_n) {
                this.field_f_n = i4;
            }
            if (i5 > this.field_f_p) {
                this.field_f_p = i5;
            }
        }
        this.field_f_m <<= 16;
        this.field_f_o <<= 16;
        this.field_f_n <<= 16;
        this.field_f_p <<= 16;
    }

    @Override
    public final void method_c_g() {
        // TODO: was replaced
        super.method_c_g();
        for (int i = 0; i < this.field_j_c.length; ++i) {
            if (this.field_j_d[i] >= 0) {
                final int field_o_t = class_o.field_o_t;
                if (this.field_j_c[i] != 9999) {
                    final short[] field_j_c = this.field_j_c;
                    final int n = i;
                    field_j_c[n] -= (short)field_o_t;
                }
                if (this.field_j_c[i] <= 0) {
                    if (this.field_j_d[i] != 474) {
                        this.method_f_e();
                        return;
                    }
                    if (this.field_j_c[i] < -1500) {
                        this.method_f_e();
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void method_c_o(Graphics paramGraphics, DirectGraphics paramDirectGraphics, class_l param3) {
        this.method_f_f(class_f.field_f_a);
        class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
        for (int i = 0; i < this.field_j_c.length; ++i) {
            class_l.field_l_i.method_l_a(this.field_j_a[i] << 16, this.field_j_b[i] << 16);
            int n = class_l.field_l_g >> 16;
            int height = class_l.field_l_h >> 16;
            if (this.field_j_d[i] >= 0) {
                int n2 = 0;
                int field_b_n;
                if (this.field_j_c[i] != 9999) {
                    field_b_n = this.field_j_c[i];
                }
                else {
                    field_b_n = class_b.field_b_n;
                }
                if (this.field_j_c[i] <= 0 && this.field_j_d[i] == 474) {
                    field_b_n = 1;
                    n2 = (Math.abs(this.field_j_c[i]) * 255 / 1500 & 0xFF) << 24;
                }
                final int n3 = class_l.field_l_g >> 16;
                final int n4 = class_l.field_l_h >> 16;
                final Graphics method_o_w = class_o.method_o_w();
                if (n2 != 0) {
                    class_b.field_b_cb.setColor(255);
                    class_b.field_b_cb.fillRect(0, 0, class_b.field_b_ca.getWidth(), class_b.field_b_ca.getHeight());
                    n = class_b.field_b_ca.getWidth() >> 1;
                    height = class_b.field_b_ca.getHeight();
                    class_o.method_o_x(class_b.field_b_cb);
                }
                final int method_o_bf = class_o.method_o_bf(this.field_j_d[i]);
                int param4;
                if (this.field_j_c[i] != 9999) {
                    param4 = (switch (this.field_j_d[i]) {
                        case 480,  485 -> 9999;
                        case 474 -> 750;
                        default -> 0;
                    } - field_b_n) / method_j_b(this.field_j_d[i]) % method_o_bf;
                }
                else {
                    param4 = field_b_n / method_j_b(this.field_j_d[i]) % method_o_bf;
                }
                if (param4 > method_o_bf - 1) {
                    param4 = method_o_bf - 1;
                }
                class_o.method_o_bd(n, height, this.field_j_d[i], param4);
                if (n2 != 0) {
                    class_o.method_o_x(method_o_w);
                    class_b.field_b_ca.getRGB(class_b.field_b_cc, 0, class_b.field_b_ca.getWidth(), 0, 0, class_b.field_b_ca.getWidth(), class_b.field_b_ca.getHeight());
                    int n6 = 0;
                    for (int j = 0; j < class_b.field_b_ca.getHeight(); ++j) {
                        for (int k = 0; k < class_b.field_b_ca.getWidth(); ++k) {
                            if (class_b.field_b_cc[n6] == -16776961) {
                                class_b.field_b_cc[n6] = 0;
                            }
                            else {
                                final int[] field_b_cc = class_b.field_b_cc;
                                final int n7 = n6;
                                field_b_cc[n7] -= n2;
                            }
                            ++n6;
                        }
                    }
                    class_o.method_o_w().drawRGB(class_b.field_b_cc, 0, class_b.field_b_ca.getWidth(), n3 - (class_b.field_b_ca.getWidth() >> 1), n4 - class_b.field_b_ca.getHeight(), class_b.field_b_ca.getWidth(), class_b.field_b_ca.getHeight(), true);
                }
            }
            else {
                class_o.method_o_ay(n, height, this.field_j_c[i]);
            }
        }
    }
}