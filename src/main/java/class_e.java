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

public final class class_e extends class_f {
    byte field_e_a;
    private int field_e_b;
    private int field_e_c = 10;
    private int field_e_d;
    private int field_e_e;
    private int field_e_f;
    private int field_e_g;
    private byte field_e_h;
    private boolean field_e_i;
    private int field_e_j;
    private int field_e_k;
    int field_e_l;
    int field_e_m;
    private byte field_e_n;
    boolean field_e_o;
    byte field_e_p;
    private static int field_e_q = 2000;
    private static int[] field_e_r = new int[]{6000, 4000, 4000, 10000};
    private static int[] field_e_s = new int[]{100, 50, 80, 150};
    private static int[] field_e_t = new int[]{50, 100, 100, 150};

    public class_e() {
        this.field_f_ab = 10;
    }

    @Override
    public final int method_d_a(byte[] param1, int param2) {
        param2 = super.method_d_a(param1, param2);
        this.field_e_b = ((param1[param2++] << 8 | param1[param2++] & 0xFF) << 16) + this.field_f_c.field_l_c;
        this.field_e_c = ((param1[param2++] << 8 | param1[param2++] & 0xFF) << 16) + this.field_f_c.field_l_f;
        this.field_e_d = ((param1[param2++] << 8 | param1[param2++] & 0xFF) << 16) + this.field_f_c.field_l_c;
        this.field_e_e = ((param1[param2++] << 8 | param1[param2++] & 0xFF) << 16) + this.field_f_c.field_l_f;
        this.field_e_a = param1[param2++];
        this.field_e_h = 0;
        this.field_e_j = 0;
        this.field_e_l = 0;
        this.field_e_i = false;
        if (this.field_e_b < this.field_e_d) {
            this.field_e_i = true;
        }
        this.field_e_p = 1;
        this.field_e_k = 2000;
        this.field_e_n = 1;
        this.field_e_m = 800;
        this.field_e_o = false;
        if (this.field_e_a == 3) {
            this.field_e_j = field_e_q;
            this.field_e_f = this.field_f_c.field_l_c;
            this.field_e_g = this.field_f_c.field_l_f;
            this.field_e_b = this.field_e_f;
            this.field_e_c = this.field_e_g;
            this.field_e_d = this.field_e_f;
            this.field_e_e = this.field_e_g;
        }
        return param2;
    }

    @Override
    public final void method_c_f() {
        this.field_f_m = -field_e_t[this.field_e_a] << 15;
        this.field_f_o = field_e_t[this.field_e_a] << 15;
        this.field_f_n = 0;
        this.field_f_p = field_e_s[this.field_e_a] << 16;
    }

    public final void method_e_a() {
        method_f_f(class_f.field_f_a);
        int i = class_f.field_f_a.field_l_c;
        int i2 = class_b.field_b_cz.field_f_c.field_l_c;
        if (this.field_e_j > 0 || this.field_e_p != 0 || this.field_e_n != 1) {
            if (this.field_e_p == 1) {
                if (i < i2) {
                    class_b.field_b_cz.field_c_x += 100.0f;
                } else {
                    class_c class_cVar = class_b.field_b_cz;
                    class_cVar.field_c_x -= 100.0f;
                }
                class_b.field_b_cz.field_c_s = 0.0f;
                class_b.field_b_cz.field_c_t = 0.0f;
                return;
            }
            return;
        }
        this.field_e_j = 500;
        if (i < i2) {
            class_b.field_b_cz.field_c_x += 200.0f;
            class_b.field_b_cz.field_c_y += 400.0f;
        } else {
            class_c class_cVar2 = class_b.field_b_cz;
            class_cVar2.field_c_x -= 200.0f;
            class_b.field_b_cz.field_c_y += 400.0f;
        }
        class_b.field_b_cz.field_c_s = 0.0f;
        class_b.field_b_cz.field_c_t = 0.0f;
    }

    public final void method_e_b() {
        if (class_b.field_b_cu == 13 && class_m.field_m_a[8] == 5) {
            return;
        }
        switch (this.field_e_a) {
            case 0:
                if (this.field_e_j <= 0) {
                    method_f_f(class_f.field_f_a);
                    if (class_f.field_f_a.field_l_c < class_b.field_b_cz.field_f_c.field_l_c) {
                        class_b.field_b_cz.field_c_x += 500.0f;
                    } else {
                        class_c class_cVar = class_b.field_b_cz;
                        class_cVar.field_c_x -= 500.0f;
                    }
                    class_b.field_b_cz.field_c_s = 0.0f;
                    class_b.field_b_cz.field_c_t = 0.0f;
                    this.field_e_j = 500;
                    return;
                }
                return;
            case 1:
                if (class_b.field_b_cz.field_c_ba == 1) {
                    method_e_c();
                    return;
                } else {
                    class_m.field_m_a[0] = 1;
                    return;
                }
            case 2:
                if (this.field_e_j <= 0 && this.field_e_p == 0 && this.field_e_n == 0) {
                    this.field_e_l = 0;
                    this.field_e_n = (byte) 1;
                    this.field_e_m = 200;
                    return;
                }
                return;
            case 3:
                class_m.field_m_a[0] = 1;
                this.field_f_c.field_l_c = this.field_e_f;
                this.field_f_c.field_l_f = this.field_e_g;
                this.field_e_b = this.field_e_f;
                this.field_e_c = this.field_e_g;
                this.field_e_d = this.field_e_f;
                this.field_e_e = this.field_e_g;
                return;
            default:
                return;
        }
    }

    private void method_e_c() {
        this.method_f_f(class_f.field_f_a);
        int n = class_f.field_f_a.field_l_c;
        int n2 = class_f.field_f_a.field_l_f;
        class_b.field_b_bh.method_g_b(10, n, n2 + (field_e_s[this.field_e_a] << 15), 370, 920, 230);
        this.method_f_e();
        class_b.field_b_az.field_f_c.field_l_c = n;
        class_b.field_b_az.field_f_c.field_l_f = n2 + 0x1E0000;
        class_b.field_b_az.field_f_b.method_l_c((class_l)this.field_f_c);
        class_b.field_b_az.method_f_g();
        class_b.field_b_az.field_f_b.method_l_f(class_b.field_b_az.field_f_e);
    }

    public final void method_e_d() {
        switch (this.field_e_a) {
            case 0: {
                method_e_e();
                this.method_e_c();
                return;
            }
            case 1:
            case 3: {
                return;
            }
            case 2: {
                method_e_e();
                this.method_e_c();
            }
        }
    }

    private static void method_e_e() {
        if (class_b.field_b_cz.field_c_t < 0.0f) {
            class_b.field_b_cz.field_c_t = -class_b.field_b_cz.field_c_t * 0.5f;
            class_b.field_b_cz.field_c_s *= 0.7f;
            return;
        }
        class_b.field_b_cz.field_c_s = -class_b.field_b_cz.field_c_s * 0.5f;
        class_b.field_b_cz.field_c_t *= 0.7f;
    }

    @Override
    public final void method_c_g() {
        this.method_f_b();
        super.method_c_g();
        if (class_b.field_b_cu == 13 && class_m.field_m_a[8] == 5) {
            return;
        }
        final int field_o_t = class_o.field_o_t;
        int field_l_c = this.field_f_c.field_l_c;
        int field_l_f = this.field_f_c.field_l_f;
        if (this.field_e_j > 0) {
            this.field_e_j -= field_o_t;
            if (this.field_e_j <= 0) {
                this.field_e_j = 0;
                if (this.field_e_a == 3) {
                    this.field_e_j = class_e.field_e_q;
                    this.field_e_d = this.field_e_b;
                    this.field_e_e = this.field_e_c;
                    final int n = this.field_e_d - field_l_c;
                    final int n2 = this.field_e_e - field_l_f;
                    final float n3 = (float)(n >> 16);
                    final float n4 = (float)(n2 >> 16);
                    final int n5 = (int)(Math.sqrt(n3 * n3 + n4 * n4) * 65536.0);
                    final int n6;
                    if ((n6 = (class_e.field_e_q << 1) * class_e.field_e_r[this.field_e_a]) > n5) {
                        final double n7 = n6 / (double)n5;
                        this.field_e_d += (int)(n * (n7 - 1.0));
                        this.field_e_e += (int)(n2 * (n7 - 1.0));
                    }
                    this.field_e_b = class_b.field_b_cz.field_f_c.field_l_c;
                    this.field_e_c = class_b.field_b_cz.field_f_c.field_l_f;
                }
            }
        }
        if (this.field_e_a == 3) {
            final int field_e_d = this.field_e_d;
            final int field_e_e = this.field_e_e;
            final int n8 = field_e_d - field_l_c;
            final int n9 = field_e_e - field_l_f;
            final float n10 = (float)(n8 >> 16);
            final float n11 = (float)(n9 >> 16);
            final int n12;
            if ((n12 = (int)(Math.sqrt(n10 * n10 + n11 * n11) * 65536.0)) != 0) {
                final double n13 = field_o_t * class_e.field_e_r[this.field_e_a] / (double)n12;
                field_l_c += (int)(n8 * n13);
                field_l_f += (int)(n9 * n13);
            }
        }
        else {
            if (this.field_e_a == 2) {
                if (this.field_e_k > 0) {
                    this.field_e_k -= field_o_t;
                    if (this.field_e_k <= 0) {
                        if (this.field_e_p == 0) {
                            this.field_e_p = 1;
                            this.field_e_k = 2000;
                            this.field_e_n = 1;
                            this.field_e_m = 800;
                        }
                        else {
                            this.field_e_p = 0;
                            this.field_e_k = 5000;
                            this.field_e_n = 2;
                            this.field_e_m = 800;
                            this.field_e_o = true;
                        }
                    }
                }
                if (this.field_e_n == 1) {
                    this.field_e_l += field_o_t;
                    if (this.field_e_l >= this.field_e_m) {
                        if (this.field_e_p == 0) {
                            this.field_e_n = 2;
                            this.field_e_m = 200;
                        }
                        this.field_e_l = this.field_e_m;
                    }
                }
                else if (this.field_e_n == 2) {
                    this.field_e_l -= field_o_t;
                    if (this.field_e_l <= 0) {
                        this.field_e_n = 0;
                        this.field_e_l = 0;
                        this.field_e_o = false;
                    }
                }
            }
            int n14;
            int n15;
            int n16;
            if (this.field_e_h == 0) {
                n14 = this.field_e_b;
                n15 = this.field_e_c;
                n16 = this.field_e_d;
            }
            else {
                n14 = this.field_e_d;
                n15 = this.field_e_e;
                n16 = this.field_e_b;
            }
            if (this.field_e_a == 0 && Math.abs(field_l_c - n14) > 4587520 && Math.abs(field_l_c - n16) > 4587520) {
                this.method_f_f(class_f.field_f_a);
                final int field_l_c2 = class_f.field_f_a.field_l_c;
                final int field_l_c3;
                if (Math.abs((field_l_c3 = class_b.field_b_cz.field_f_c.field_l_c) - field_l_c2) < 7864320 && ((field_l_c2 < field_l_c3 && n14 < field_l_c) || (field_l_c2 > field_l_c3 && n14 > field_l_c))) {
                    if (this.field_e_h == 0) {
                        n14 = this.field_e_d;
                        n15 = this.field_e_e;
                        this.field_e_h = 1;
                    }
                    else {
                        n14 = this.field_e_b;
                        n15 = this.field_e_c;
                        this.field_e_h = 0;
                    }
                }
            }
            final int n17 = n14 - field_l_c;
            final int n18 = n15 - field_l_f;
            final float n19 = (float)(n17 >> 16);
            final float n20 = (float)(n18 >> 16);
            final int n21 = (int)(Math.sqrt(n19 * n19 + n20 * n20) * 65536.0);
            boolean b = false;
            boolean b2 = false;
            if (n21 != 0) {
                final double n22 = field_o_t * class_e.field_e_r[this.field_e_a] / (double)n21;
                final int n23 = (int)(n17 * n22);
                final int n24 = (int)(n18 * n22);
                field_l_c += n23;
                field_l_f += n24;
                if ((n23 >= 0 && field_l_c >= n14) || (n23 <= 0 && field_l_c <= n14)) {
                    field_l_c = n14;
                    b = true;
                }
                if ((n24 >= 0 && field_l_f >= n15) || (n24 <= 0 && field_l_f <= n15)) {
                    field_l_f = n15;
                    b2 = true;
                }
            }
            if ((b && b2) || n21 == 0) {
                field_l_c = n14;
                field_l_f = n15;
                if (this.field_e_h == 0) {
                    this.field_e_h = 1;
                }
                else {
                    this.field_e_h = 0;
                }
            }
        }
        if (this.field_e_a != 2 || (this.field_e_a == 2 && this.field_e_p == 0 && this.field_e_n == 0)) {
            this.field_e_i = true;
            if (this.field_f_c.field_l_c < field_l_c) {
                this.field_e_i = false;
            }
            this.field_f_c.field_l_c = field_l_c;
            this.field_f_c.field_l_f = field_l_f;
            this.field_f_w = true;
            this.field_f_y = true;
        }
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        this.method_f_f(class_f.field_f_a);
        class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
        int n = class_l.field_l_i.field_l_c >> 16;
        int n2 = class_l.field_l_i.field_l_f >> 16;
        switch (this.field_e_a) {
            case 0: {
                int n3 = class_b.field_b_o / 50 % 6;
                class_o.method_o_bd(n, n2, 467, n3);
                return;
            }
            case 1: {
                if (this.field_e_i) {
                    class_o.method_o_ay(n, n2, -43);
                    return;
                }
                class_o.method_o_ay(n, n2, -44);
                return;
            }
            case 2: {
                if (this.field_e_n != 0) {
                    int n4 = param1.getClipX();
                    int n5 = param1.getClipY();
                    int n6 = param1.getClipWidth();
                    int n7 = n2 - n5;
                    int n8 = param1.getClipHeight();
                    if (n7 > n8) {
                        n7 = n8;
                    }
                    param1.setClip(n4, n5, n6, n7);
                    n7 = this.field_e_l * 61 / this.field_e_m;
                    if (this.field_e_i) {
                        class_o.method_o_ay(n, n2 + 61 - n7, 189);
                    } else {
                        class_o.method_o_ay(n, n2 + 61 - n7, 194);
                    }
                    param1.setClip(n4, n5, n6, n8);
                }
                int n9 = this.field_e_n == 0 ? class_b.field_b_n / 150 % 4 : 0;
                class_o.method_o_bd(n, n2, 504, n9);
                return;
            }
            case 3: {
                class_o.method_o_ay(n, n2, -30);
            }
        }
    }
}