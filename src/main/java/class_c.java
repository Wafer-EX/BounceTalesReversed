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

public final class class_c extends class_f {
    private static int field_c_n;
    public static int field_c_o;
    public static int field_c_p;
    private static short[] field_c_r;
    public float field_c_s;
    public float field_c_t;
    public float field_c_u;
    public float field_c_v;
    public float field_c_w;
    public float field_c_x;
    public float field_c_y;
    private int[] field_c_ac;
    private int[] field_c_ad;
    private int[] field_c_ae;
    private int[] field_c_af;
    private int[] field_c_ag;
    private int[] field_c_ah;
    public float field_c_ai;
    public float field_c_aj;
    public float field_c_ak;
    public float field_c_al;
    private float field_c_am;
    private int field_c_an;
    private static int[] field_c_az;
    private float field_c_bb;
    private float field_c_bc;
    private float field_c_bd;
    private boolean field_c_bf;
    private static int field_c_bg;
    private static int field_c_bh;
    private static int field_c_bi;
    private static boolean field_c_bj;
    private static float field_c_bk;
    private static float field_c_c = -400.0f;
    private static float[] field_c_d = {0.6f, 0.3f, 0.6f};
    private static float[] field_c_e = {0.1f, 0.1f, 0.1f};
    private static float[] field_c_f = {(float) Math.cos(0.9599310755729675d), (float) Math.cos(0.9599310755729675d), (float) Math.cos(0.9599310755729675d)};
    public static final int[] field_c_g = {20, 20, 20};
    public static final float[] field_c_h = {1.0f, 1.4f, 0.5f};
    private static float[] field_c_i = {500.0f, 350.0f, 312.5f};
    private static float[] field_c_j = {280.0f, 350.0f, 150.0f};
    private static float[] field_c_k = {1.5f, 2.5f, 1.2f};
    private static float[] field_c_l = {288.0f, 255.0f, 162.5f};
    public static int[] field_c_m = new int[3];
    private static int[] field_c_q = {458, 460, 454, 452, 456};
    public int field_c_a = 0;
    private int field_c_b = 0;
    public boolean field_c_z = true;
    public boolean field_c_aa = true;
    public boolean field_c_ab = false;
    private final int[] field_c_ao = new int[16];
    private final int[] field_c_ap = new int[16];
    private final int[] field_c_aq = new int[16];
    private final int[] field_c_ar = new int[16];
    private final int[] field_c_as = new int[16];
    private final int[] field_c_at = new int[16];
    private final boolean[] field_c_au = new boolean[16];
    private float field_c_av = 0.5f;
    private int field_c_aw = 15539236;
    private int field_c_ax = 16777215;
    private int field_c_ay = 11473152;
    public int field_c_ba = 0;
    public boolean field_c_be = false;

    public class_c(boolean param1) {
        this.field_c_bf = false;
        this.field_f_ab = (byte) 4;
        this.field_c_bf = param1;
        if (param1) {
            this.field_c_ac = new int[4];
            this.field_c_ad = new int[4];
            this.field_c_ae = new int[4];
            this.field_c_af = new int[4];
            this.field_c_ag = new int[4];
            this.field_c_ah = new int[4];
            method_c_a();
        }
    }

    private void method_c_a() {
        for (int i = 0; i < 4; i++) {
            this.field_c_ac[i] = 0;
            this.field_c_ad[i] = 0;
            this.field_c_ae[i] = 0;
            this.field_c_af[i] = 0;
        }
    }

    public final void method_c_b() {
        float f = 0.0f;
        if (class_b.field_b_dg && this.field_c_ba == 0) {
            f = 50.0f;
        }
        if (this.field_c_be) {
            if (this.field_c_s > (-field_c_j[this.field_c_ba]) - f) {
                this.field_c_v -= field_c_i[this.field_c_ba] + f;
            }
        } else if (this.field_c_s > (-field_c_j[this.field_c_ba]) - f) {
            this.field_c_v -= (field_c_i[this.field_c_ba] + f) / field_c_k[this.field_c_ba];
        }
    }

    public final void method_c_c() {
        float f = 0.0f;
        if (class_b.field_b_dg && this.field_c_ba == 0) {
            f = 50.0f;
        }
        if (this.field_c_be) {
            if (this.field_c_s < field_c_j[this.field_c_ba] + f) {
                this.field_c_v += field_c_i[this.field_c_ba] + f;
            }
        } else if (this.field_c_s < field_c_j[this.field_c_ba] + f) {
            this.field_c_v += (field_c_i[this.field_c_ba] + f) / field_c_k[this.field_c_ba];
        }
    }

    public final void method_c_d(boolean param1) {
        if (this.field_c_bd <= field_c_f[this.field_c_ba] || !this.field_c_be) {
            return;
        }
        if (param1) {
            this.field_c_y += field_c_l[this.field_c_ba] / 2.0f;
        } else {
            this.field_c_y += field_c_l[this.field_c_ba];
        }
        this.field_c_be = false;
        if (this.field_c_bf) {
            if (param1) {
                method_c_e(0, -27);
                method_c_e(1, -27);
                return;
            }
            method_c_e(0, -53);
            method_c_e(1, -53);
        }
    }

    private void method_c_e(int param1, int param2) {
        if (param2 > 0) {
            if (param2 > 70) {
                param2 = 70;
            }
        } else if (param2 < 0 && param2 < -70) {
            param2 = -70;
        }
        int[] iArr = this.field_c_ac;
        iArr[param1] = iArr[param1] + param2;
    }

    @Override
    public final void method_c_f() {
        this.field_f_m = (-field_c_g[this.field_c_ba]) << 16;
        this.field_f_o = field_c_g[this.field_c_ba] << 16;
        this.field_f_n = (-field_c_g[this.field_c_ba]) << 16;
        this.field_f_p = field_c_g[this.field_c_ba] << 16;
    }

    @Override
    public final void method_c_g() {
        float f;
        float f2;
        method_f_b();
        super.method_c_g();
        this.field_f_y = true;
        if (this.field_c_z) {
            this.field_c_v += 0.0f * field_c_h[this.field_c_ba];
            this.field_c_w += field_c_c * field_c_h[this.field_c_ba];
            if (this.field_c_bf) {
                if (!this.field_c_ab) {
                    float f3 = this.field_c_s - this.field_c_ai;
                    float f4 = this.field_c_t - this.field_c_aj;
                    if (f3 > 0.0f) {
                        method_c_e(3, ((((int) f3) >> 2) << 1) / 3);
                    } else {
                        method_c_e(2, (((-((int) f3)) >> 2) << 1) / 3);
                    }
                    if (f4 > 0.0f) {
                        method_c_e(1, ((((int) f4) >> 2) << 1) / 3);
                    } else {
                        method_c_e(0, (((-((int) f4)) >> 2) << 1) / 3);
                    }
                }
                this.field_c_ab = false;
            }
            float f5 = class_o.field_o_t * 0.001f;
            if (this.field_c_bf) {
                this.field_c_ai = this.field_c_s;
                this.field_c_aj = this.field_c_t;
            }
            float f6 = 1.0f / field_c_h[this.field_c_ba];
            this.field_c_s += this.field_c_v * f6 * f5;
            this.field_c_t += this.field_c_w * f6 * f5;
            this.field_c_s += this.field_c_x * f6;
            this.field_c_t += this.field_c_y * f6;
            this.field_f_c.field_l_c += (int) (this.field_c_s * f5 * 65536.0f);
            this.field_f_c.field_l_f += (int) (this.field_c_t * f5 * 65536.0f);
            this.field_c_v = 0.0f;
            this.field_c_w = 0.0f;
            this.field_c_x = 0.0f;
            this.field_c_y = 0.0f;
            float f7 = (this.field_c_ak * this.field_c_bc) + (this.field_c_al * this.field_c_bd);
            float f8 = f7 * this.field_c_bc;
            float f9 = f7 * this.field_c_bd;
            if ((this.field_c_bc * this.field_c_ak) + (this.field_c_bd * this.field_c_al) >= 0.0f) {
                f = this.field_c_ak - f8;
                f2 = this.field_c_al - f9;
            } else {
                f = this.field_c_ak + f8;
                f2 = this.field_c_al + f9;
            }
            float sqrt = (((float) Math.sqrt((f * f) + (f2 * f2))) / field_c_g[this.field_c_ba]) * f5;
            if ((this.field_c_bc * f2) - (f * this.field_c_bd) > 0.0f) {
                sqrt = -sqrt;
            }
            this.field_c_am += sqrt;
            this.field_c_bb += class_o.field_o_t / 1000.0f;
            if (this.field_c_bb > 0.25f) {
                this.field_c_be = false;
            }
            this.field_c_u = (float) Math.sqrt((this.field_c_s * this.field_c_s) + (this.field_c_t * this.field_c_t));
            if (this.field_c_u > 999.0f) {
                float f10 = 999.0f / this.field_c_u;
                this.field_c_s *= f10;
                this.field_c_t *= f10;
                this.field_c_u = 999.0f;
            }
            if (this.field_c_bf) {
                for (int i = 0; i < 4; i++) {
                    int[] iArr = this.field_c_af;
                    int i2 = i;
                    iArr[i2] = iArr[i2] + this.field_c_ac[i];
                    this.field_c_ac[i] = 0;
                    if (this.field_c_af[i] > 70) {
                        this.field_c_af[i] = 70;
                    } else if (this.field_c_af[i] < -70) {
                        this.field_c_af[i] = -70;
                    }
                    int[] iArr2 = this.field_c_ad;
                    int i3 = i;
                    iArr2[i3] = iArr2[i3] + (this.field_c_af[i] * class_o.field_o_t);
                    this.field_c_ae[i] = (this.field_c_ad[i] * class_f.field_f_ag.field_l_a) / 65536;
                    int[] iArr3 = this.field_c_af;
                    int i4 = i;
                    iArr3[i4] = iArr3[i4] + (((class_o.field_o_t * 7) * (-this.field_c_ad[i])) >> 16);
                    int[] iArr4 = this.field_c_af;
                    int i5 = i;
                    iArr4[i5] = iArr4[i5] - (((class_o.field_o_t * 120) * this.field_c_af[i]) >> 16);
                }
            }
            if (this.field_c_bf) {
                if (field_c_n > 0) {
                    field_c_n -= class_o.field_o_t;
                    field_c_o = 3000;
                    if (field_c_n <= 0) {
                        if (field_c_p < 2 || field_c_p > 8) {
                            field_c_n = 0;
                            field_c_p = 0;
                        } else {
                            int abs = Math.abs(class_b.field_b_m.nextInt() % 3) == 0 ? 3 : Math.abs(class_b.field_b_m.nextInt() % 6) + 3;
                            field_c_n = 1500;
                            int i6 = abs;
                            field_c_p = i6;
                            if (i6 == 3) {
                                field_c_n = 600;
                            }
                        }
                    }
                } else if (class_m.field_m_a[0] == 0 && class_m.field_m_a[1] == 0 && Math.abs(this.field_c_s) < 40.0f && Math.abs(this.field_c_t) < 40.0f) {
                    int i7 = field_c_o - class_o.field_o_t;
                    field_c_o = i7;
                    if (i7 <= 0) {
                        field_c_n = 600;
                        field_c_p = 2;
                        field_c_o = 3000;
                    }
                }
                if (Math.abs(this.field_c_s) >= 40.0f || Math.abs(this.field_c_t) >= 40.0f) {
                    if (field_c_p != 1) {
                        field_c_p = 0;
                    }
                    field_c_o = 3000;
                }
            }
            if (this.field_c_a != 0) {
                int i8 = this.field_c_a >>> 24;
                int i9 = class_o.field_o_t / 2;
                int i10 = i9;
                if (i9 <= 0) {
                    i10 = 1;
                }
                int i11 = i8 - i10;
                int i12 = i11;
                if (i11 < 0) {
                    i12 = 0;
                }
                this.field_c_a = i12 << 24;
            }
        }
    }

    public final void method_c_h(int param1, int param2) {
        method_c_q();
        this.field_f_c.field_l_c = param1;
        this.field_f_c.field_l_f = param2;
        this.field_f_b.field_l_c = param1;
        this.field_f_b.field_l_f = param2;
        this.field_c_ab = true;
        if (this.field_c_bf) {
            this.field_c_ai = 0.0f;
            this.field_c_aj = 0.0f;
            for (int i = 0; i < 4; i++) {
                this.field_c_ac[i] = 0;
                this.field_c_ad[i] = 0;
                this.field_c_ae[i] = 0;
                this.field_c_af[i] = 0;
            }
        }
        this.field_f_y = true;
    }

    @Override
    public final void method_c_i(class_f param1) {
        int n = 1;
        while (++n < 10) {
            this.field_c_an = 0;
            final int n2 = class_c.field_c_g[this.field_c_ba] << 16;
            final int param2 = class_c.field_c_g[this.field_c_ba] * class_c.field_c_g[this.field_c_ba] << 16;
            final int param3 = this.field_f_c.field_l_c - this.field_f_b.field_l_c;
            final int param4 = this.field_f_c.field_l_f - this.field_f_b.field_l_f;
            class_f class_f = param1;
            while (class_f != null) {
                class_f.field_f_e.method_l_a(this.field_f_b.field_l_c, this.field_f_b.field_l_f);
                final int field_l_g = class_l.field_l_g;
                final int field_l_h = class_l.field_l_h;
                if (class_f.field_f_y) {
                    class_f.method_f_g();
                }
                class_f.field_f_f.method_l_a(this.field_f_c.field_l_c, this.field_f_c.field_l_f);
                final int field_l_g2 = class_l.field_l_g;
                final int field_l_h2 = class_l.field_l_h;
                int n3 = field_l_g;
                int n4 = field_l_g2;
                if (n3 > n4) {
                    n3 = field_l_g2;
                    n4 = field_l_g;
                }
                int n5 = field_l_h;
                int n6 = field_l_h2;
                if (n5 > n6) {
                    n5 = field_l_h2;
                    n6 = field_l_h;
                }
                final int n7 = n3 - n2;
                final int n8 = n5 - n2;
                final int n9 = n4 + n2;
                final int n10 = n6 + n2;
                if (!class_f.method_f_z(class_f.field_f_q, class_f.field_f_r, class_f.field_f_s, class_f.field_f_t, n7, n8, n9, n10)) {
                    class_f = class_f.method_f_j(param1);
                }
                else if ((class_f.field_f_v & 0x20) > 0) {
                    class_f = class_f.method_f_i(param1);
                }
                else {
                    switch (class_f.method_f_a()) {
                        case 6: {
                            final class_n class_n;
                            final int param5 = (class_n = (class_n)class_f).field_n_c << 16;
                            if (method_c_m(param5, class_n.field_n_f << 16, (class_n.field_n_e << 16) - param5, 0, field_l_g, field_l_h, field_l_g2, field_l_h2, 0)) {
                                class_n.method_n_a(class_c.field_c_bi, this.field_c_t, class_c.field_c_g[this.field_c_ba], this);
                            }
                            if (field_l_h2 - n2 < class_n.field_n_x) {
                                class_n.method_n_b(field_l_g2, field_l_h2 - n2, this);
                            }
                            class_f = class_f.method_f_i(param1);
                            continue;
                        }
                        case 8: {
                            final class_k class_k = (class_k)class_f;
                            if (method_c_m(-4587520, 6225920, 9175040, 0, field_l_g, field_l_h, field_l_g2, field_l_h2, 0)) {
                                final class_k class_k2 = class_k;
                                final float field_c_t = this.field_c_t;
                                final class_k class_k3 = class_k2;
                                if (field_c_t < 0.0f) {
                                    int n11;
                                    if ((n11 = -(int)field_c_t) < 100) {
                                        n11 = 100;
                                    }
                                    if (n11 > 1000) {
                                        n11 = 1000;
                                    }
                                    class_k3.field_k_e = (1100 - n11 >> 1) + 20;
                                    class_k3.field_k_c = class_k3.field_k_e / class_o.method_o_bf(class_k3.field_k_a);
                                    class_k3.field_k_b = this;
                                    class_k3.field_k_f = -field_c_t * class_k3.field_k_g * 2.0f / 100.0f;
                                    final float field_k_f = 400.0f * class_k3.field_k_g * 2.0f / 100.0f;
                                    if (class_k3.field_k_f > field_k_f) {
                                        class_k3.field_k_f = field_k_f;
                                    }
                                    class_k3.field_k_b.field_c_z = false;
                                    class_k3.field_k_b.field_c_s = 0.0f;
                                    class_k3.field_k_b.field_c_t = 0.0f;
                                    class_k3.field_k_h = false;
                                    class_k3.method_k_a();
                                    if (class_k3.field_k_b.equals(class_b.field_b_cz)) {
                                        class_m.field_m_a[1] = 2;
                                    }
                                }
                            }
                            class_f = class_f.method_f_i(param1);
                            continue;
                        }
                        case 7: {
                            final class_d class_d = (class_d)class_f;
                            if (class_f.method_f_y(field_l_g, field_l_h, field_l_g2, field_l_h2, class_d.field_d_f, class_d.field_d_h, class_d.field_d_g, class_d.field_d_i)) {
                                class_d.method_d_b();
                            }
                            class_f = class_f.method_f_i(param1);
                            continue;
                        }
                        case 9: {
                            final class_h class_h = (class_h)class_f;
                            final class_f method_f_i = class_f.method_f_i(param1);
                            final int n12 = field_l_g2 >> 16;
                            final int n13 = field_l_h2 >> 16;
                            if (n12 * n12 + n13 * n13 < 2025) {
                                final class_h class_h2;
                                (class_h2 = class_h).method_f_f(class_f.field_f_a);
                                class_b.field_b_bg.method_g_b(8, class_f.field_f_a.field_l_c, class_f.field_f_a.field_l_f, 540, 540, 0);
                                if (class_h2.equals(class_b.field_b_az)) {
                                    ++class_b.field_b_dc;
                                    class_h2.field_f_c.field_l_c = Integer.MAX_VALUE;
                                    class_h2.field_f_c.field_l_f = Integer.MAX_VALUE;
                                    class_h2.field_f_b.method_l_c(class_h2.field_f_c);
                                    class_h2.field_f_b.method_l_f(class_h2.field_f_e);
                                    class_h2.field_f_y = true;
                                }
                                else {
                                    class_h2.method_f_e();
                                    ++class_b.field_b_dc;
                                }
                            }
                            class_f = method_f_i;
                            continue;
                        }
                        case 4: {
                            class_f = class_f.method_f_i(param1);
                            continue;
                        }
                        case 10: {
                            final class_e class_e = (class_e)class_f;
                            final class_f method_f_i2 = class_f.method_f_i(param1);
                            boolean method_f_y = false;
                            if (class_e.field_e_a == 0 || (class_e.field_e_a == 2 && (class_e.field_e_p == 1 || class_e.field_e_o))) {
                                method_f_y = class_f.method_f_y(field_l_g, field_l_h, field_l_g2, field_l_h2, class_e.field_f_m, class_e.field_f_n + (class_e.field_f_p - class_e.field_f_n << 1) / 3, class_e.field_f_o, class_e.field_f_p);
                            }
                            if (method_f_y) {
                                class_e.method_e_d();
                            }
                            else {
                                if (class_f.method_f_y(field_l_g, field_l_h, field_l_g2, field_l_h2, class_e.field_f_m, class_e.field_f_n, class_e.field_f_o, class_e.field_f_p)) {
                                    class_e.method_e_b();
                                }
                                if (class_e.field_e_a == 2 && class_f.method_f_y(field_l_g, field_l_h, field_l_g2, field_l_h2, class_e.field_f_m, class_e.field_f_n, class_e.field_f_o, class_e.field_f_n + (class_e.field_f_p - class_e.field_f_n) * (class_e.field_e_l * 100 / class_e.field_e_m) / 100)) {
                                    class_e.method_e_a();
                                }
                            }
                            class_f = method_f_i2;
                            continue;
                        }
                        case 2: {
                            final class_i param6 = (class_i)class_f;
                            int n14 = 0;
                            int param7 = 0;
                            int param8 = 0;
                            int n15 = 0;
                            int n16 = 0;
                            int n17 = 0;
                            for (int n18 = param6.field_i_h - 1, i = 0; i < n18; ++i) {
                                final int param9 = param6.field_i_e[i];
                                final int param10 = param6.field_i_f[i];
                                final int param11 = param6.field_i_e[i + 1];
                                final int param12 = param6.field_i_f[i + 1];
                                int param13 = param9;
                                int param14 = param11;
                                if (param13 > param14) {
                                    param13 = param11;
                                    param14 = param9;
                                }
                                int param15 = param10;
                                int param16 = param12;
                                if (param15 > param16) {
                                    param15 = param12;
                                    param16 = param10;
                                }
                                if (class_f.method_f_z(param13, param15, param14, param16, n7, n8, n9, n10)) {
                                    if (n14 == 0) {
                                        n14 = 1;
                                        param7 = field_l_g2 - field_l_g;
                                        param8 = field_l_h2 - field_l_h;
                                        if ((n15 = (int)Math.sqrt((double)(param7 * (long)param7 + param8 * (long)param8))) != 0) {
                                            n16 = (int)(((long)param7 << 16) / n15);
                                            n17 = (int)(((long)param8 << 16) / n15);
                                        }
                                    }
                                    final int param17 = param10 - param12;
                                    final int param18 = -(param9 - param11);
                                    final int n19 = (int)Math.sqrt((double)(param17 * (long)param17 + param18 * (long)param18));
                                    final int n20 = (int)((param17 * (long)class_c.field_c_g[this.field_c_ba] << 16) / n19);
                                    final int n21 = (int)((param18 * (long)class_c.field_c_g[this.field_c_ba] << 16) / n19);
                                    final int param19 = param9 + n20;
                                    final int param20 = param10 + n21;
                                    final int param21 = param11 + n20;
                                    final int param22 = param12 + n21;
                                    if (param7 * (long)param17 + param8 * (long)param18 < 0L) {
                                        if (method_c_m(field_l_g, field_l_h, param7, param8, param19, param20, param21, param22, param2)) {
                                            this.method_c_j(param6, class_c.field_c_bi, param3, param4, param17, param18, class_c.field_c_bj);
                                        }
                                        if (method_c_l(field_l_g, field_l_h, n16, n17, n15, param9, param10, class_c.field_c_g[this.field_c_ba])) {
                                            this.method_c_j(param6, class_c.field_c_bi, param3, param4, class_c.field_c_bg - param9, class_c.field_c_bh - param10, class_c.field_c_bj);
                                        }
                                        if (method_c_l(field_l_g, field_l_h, n16, n17, n15, param11, param12, class_c.field_c_g[this.field_c_ba])) {
                                            this.method_c_j(param6, class_c.field_c_bi, param3, param4, class_c.field_c_bg - param11, class_c.field_c_bh - param12, class_c.field_c_bj);
                                        }
                                    }
                                }
                            }
                            class_f = class_f.method_f_i(param1);
                            continue;
                        }
                        default: {
                            class_f = class_f.method_f_i(param1);
                            continue;
                        }
                    }
                }
            }
            if (this.field_c_an == 0) {
                break;
            }
            this.method_c_k();
        }
        this.field_c_bb += class_o.field_o_t / 1000.0f;
        if (this.field_c_bb > 0.25f) {
            this.field_c_be = false;
        }
    }

    private void method_c_j(class_i class_i2, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (n > 0) {
            this.field_c_ao[this.field_c_an] = this.field_f_b.field_l_c + (int)((long)n2 * (long)n >> 16);
            this.field_c_ap[this.field_c_an] = this.field_f_b.field_l_f + (int)((long)n3 * (long)n >> 16);
            this.field_c_au[this.field_c_an] = bl;
            class_i2.field_f_b.method_l_b(n4, n5);
            n2 = class_l.field_l_g;
            n3 = class_l.field_l_h;
            class_i2.method_f_f(class_f.field_f_a);
            class_f.field_f_a.method_l_b(n4, n5);
            n4 = class_l.field_l_g;
            n5 = class_l.field_l_h;
            this.field_c_aq[this.field_c_an] = (int)((long)n2 * (long)(65536 - n) + (long)n4 * (long)n >> 16);
            this.field_c_ar[this.field_c_an] = (int)((long)n3 * (long)(65536 - n) + (long)n5 * (long)n >> 16);
        } else {
            if (n < 0) {
                throw new IllegalStateException("t < 0, t: " + n);
            }
            class_i2.field_f_b.method_l_a(field_c_bg, field_c_bh);
            this.field_c_ao[this.field_c_an] = class_l.field_l_g;
            this.field_c_ap[this.field_c_an] = class_l.field_l_h;
            this.field_c_au[this.field_c_an] = bl;
            class_i2.field_f_b.method_l_a(n4, n5);
            this.field_c_aq[this.field_c_an] = class_l.field_l_g;
            this.field_c_ar[this.field_c_an] = class_l.field_l_h;
        }
        class_i2.field_f_b.method_l_a(field_c_bg, field_c_bh);
        n3 = class_l.field_l_g;
        n4 = class_l.field_l_h;
        class_i2.method_f_f(class_f.field_f_a);
        class_f.field_f_a.method_l_a(field_c_bg, field_c_bh);
        this.field_c_as[this.field_c_an] = class_l.field_l_g - n3;
        this.field_c_at[this.field_c_an] = class_l.field_l_h - n4;
        ++this.field_c_an;
        if (class_i2.field_i_k >= 0) {
            ((class_m)this.method_f_r().method_f_q(class_i2.field_i_k)).method_m_b(2);
        }
    }

    private void method_c_k() {
        long l = Long.MAX_VALUE;
        int n = -1;
        for (int i = 0; i < this.field_c_an; ++i) {
            long l2 = this.field_c_ao[i] - this.field_f_b.field_l_c;
            long l3 = this.field_c_ap[i] - this.field_f_b.field_l_f;
            long l4 = l2 * l2 + l3 * l3;
            if (this.field_c_au[i]) {
                l4 = -l4;
            }
            if (l4 > 42949672960000L) {
                System.out.println("Sanity check failed! Found collision is too far, distance: " + Math.sqrt(l4) / 65536.0);
                continue;
            }
            if (l4 >= l) continue;
            l = l4;
            n = i;
        }
        if (n == -1) {
            return;
        }
        float f = 1000.0f / (float)class_o.field_o_t;
        float f2 = (float)this.field_c_ao[n] * field_c_bk;
        float f3 = (float)this.field_c_ap[n] * field_c_bk;
        float f4 = (float)this.field_c_aq[n] * field_c_bk;
        float f5 = (float)this.field_c_ar[n] * field_c_bk;
        float f6 = 1.0f / (float)Math.sqrt(f4 * f4 + f5 * f5);
        float f7 = (float)this.field_c_as[n] * field_c_bk;
        float f8 = (float)this.field_c_at[n] * field_c_bk;
        float f9 = f7 * (f4 *= f6) + f8 * (f5 *= f6);
        f6 = f9 * f4;
        float f10 = f9 * f5;
        if (f4 * f7 + f5 * f8 < 0.0f) {
            f6 = -f6;
            f10 = -f10;
        }
        float f11 = f7 * f;
        float f12 = f8 * f;
        float f13 = (float)(this.field_f_c.field_l_c - this.field_c_ao[n]) * field_c_bk;
        float f14 = (float)(this.field_f_c.field_l_f - this.field_c_ap[n]) * field_c_bk;
        f7 = f2 + f7;
        f8 = f3 + f8;
        float f15 = f4 * 0.01f;
        float f16 = f5 * 0.01f;
        f9 = f13 * f4 + f14 * f5;
        float f17 = f9 * f4;
        f13 = f13 - f17 - f17 * field_c_e[this.field_c_ba];
        f14 = f14 - (f9 *= f5) - f9 * field_c_e[this.field_c_ba];
        f2 = f2 + f13 + f6 + f15;
        f3 = f3 + f14 + f10 + f16;
        f9 = this.field_c_s * f4 + this.field_c_t * f5;
        f17 = f9 * f4;
        f13 = this.field_c_s - f17 - f17 * field_c_e[this.field_c_ba];
        f14 = this.field_c_t - (f9 *= f5) - f9 * field_c_e[this.field_c_ba];
        f9 = f11 * f4 + f12 * f5;
        f17 = f9 * f4;
        this.field_c_s = f17 + f13;
        this.field_c_t = (f9 *= f5) + f14;
        f14 = this.field_c_s - f11;
        f6 = this.field_c_t - f12;
        f9 = (float)Math.sqrt(f14 * f14 + f6 * f6);
        f10 = f9 != 0.0f ? f14 / f9 : 0.0f;
        f11 = f9 != 0.0f ? f6 / f9 : 0.0f;
        f9 = -(f4 * 0.0f + f5 * field_c_c);
        f9 = field_c_d[this.field_c_ba] * field_c_h[this.field_c_ba] * f9;
        f10 *= f9;
        f11 *= f9;
        f9 = field_c_h[this.field_c_ba] * f;
        f = f14 * f9;
        if (f * f + (f9 = f6 * f9) * f9 < f10 * f10 + f11 * f11) {
            this.field_c_v -= f;
            this.field_c_w -= f9;
        } else {
            this.field_c_v -= f10;
            this.field_c_w -= f11;
        }
        this.field_c_ak = this.field_c_ak * (1.0f - this.field_c_av) + f14 * this.field_c_av;
        this.field_c_al = this.field_c_al * (1.0f - this.field_c_av) + f6 * this.field_c_av;
        this.field_c_bb = 0.0f;
        this.field_c_be = true;
        this.field_c_bc = f4;
        this.field_c_bd = f5;
        this.field_f_b.field_l_c = (int)(f7 * 65536.0f);
        this.field_f_b.field_l_f = (int)(f8 * 65536.0f);
        this.field_f_c.field_l_c = (int)(f2 * 65536.0f);
        this.field_f_c.field_l_f = (int)(f3 * 65536.0f);
        this.method_f_g();
        this.field_f_b.method_l_f(this.field_f_e);
        this.field_c_an = 0;
    }

    private static boolean method_c_l(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
        long l1 = (paramInt1 - paramInt6);
        long l2 = (paramInt2 - paramInt7);
        long l3;
        if ((l3 = l1 * paramInt3 + l2 * paramInt4 >> 16L) >= 0L)
            return false;
        long l4;
        if ((l4 = (l1 * l1 + l2 * l2 >> 16L) - (paramInt8 * paramInt8 << 16)) <= 0L) {
            field_c_bi = 0;
            int i = (int)Math.sqrt((l1 * l1 + l2 * l2));
            int j = 0;
            int k = 0;
            if (i != 0) {
                j = (int)((l1 * paramInt8 << 16L) / i);
                k = (int)((l2 * paramInt8 << 16L) / i);
            }
            field_c_bg = paramInt6 + j;
            field_c_bh = paramInt7 + k;
            field_c_bj = true;
            return true;
        }
        long l5;
        if ((l5 = (l3 * l3 >> 16L) - l4) < 0L)
            return false;
        long l6;
        if ((l6 = -l3 - (int)Math.sqrt((l5 << 16L))) <= paramInt5) {
            field_c_bi = (int)((l6 << 16L) / paramInt5);
            field_c_bg = (int)(paramInt1 + (l6 * paramInt3 >> 16L));
            field_c_bh = (int)(paramInt2 + (l6 * paramInt4 >> 16L));
            field_c_bj = false;
            return true;
        }
        return false;
    }

    private static boolean method_c_m(int integer1, int integer2, int integer3, int integer4, int integer5, int integer6, int integer7, int integer8, int integer9) {
        long long10 = integer5 * (long)integer4 >> 16;
        long long12 = integer6 * (long)integer3 >> 16;
        long long18;
        if ((long18 = long10 - long12 - (integer7 * (long)integer4 >> 16) + (integer8 * (long)integer3 >> 16)) == 0L) {
            return false;
        }
        long long20;
        if ((long20 = (long10 - long12 + (integer3 * (long)integer2 >> 16) - (integer4 * (long)integer1 >> 16) << 16) / long18) < 0L || long20 > 65536L) {
            return false;
        }
        long long22;
        if ((long22 = (integer5 * (long)(integer8 - integer2) + integer6 * (long)(integer1 - integer7) + integer7 * (long)integer2 - integer8 * (long)integer1) / long18) >= 0L && long22 <= 65536L) {
            class_c.field_c_bi = (int)long22;
            class_c.field_c_bg = (int)(integer1 + (long22 * integer3 >> 16));
            class_c.field_c_bh = (int)(integer2 + (long22 * integer4 >> 16));
            class_c.field_c_bj = false;
            return true;
        }
        if (long22 >= 0L) {
            return false;
        }
        long long24 = integer7 - integer5;
        long long26 = integer8 - integer6;
        long long32;
        if ((long32 = (integer1 - integer5) * long24 + (integer2 - integer6) * long26 >> 16) <= 0L) {
            return false;
        }
        long long34 = long24 * long24 + long26 * long26 >> 16;
        if (long32 >= long34) {
            return false;
        }
        long32 = (long32 << 16) / long34;
        long long36 = integer5 + (long32 * long24 >> 16);
        long long38 = integer6 + (long32 * long26 >> 16);
        long long40 = long36 - integer1;
        long long42 = long38 - integer2;
        if (long40 * long40 + long42 * long42 >> 16 > integer9) {
            return false;
        }
        class_c.field_c_bi = 0;
        class_c.field_c_bg = (int)long36;
        class_c.field_c_bh = (int)long38;
        return class_c.field_c_bj = true;
    }

    public final void method_c_n() {
        method_f_b();
        super.method_c_g();
        method_c_a();
        int i = 3000 - class_b.field_b_t;
        if (i <= 1000) {
            this.field_f_c.field_l_f = class_b.field_b_u + (class_b.field_b_ax[(i / 5) % 360] << 14);
            return;
        }
        this.field_f_c.field_l_f = (class_b.field_b_u + (class_b.field_b_ax[200] << 14)) - ((i - 1000) * 22500);
    }

    @Override
    public final void method_c_o(Graphics paramGraphics, DirectGraphics paramDirectGraphics, class_l paramclass_l) {
        if (!this.field_c_aa)
            return;
        method_f_f(class_f.field_f_a);
        class_l.method_l_e(paramclass_l, class_f.field_f_a, class_l.field_l_i);
        class_l.field_l_i.method_l_a(this.field_f_c.field_l_c, this.field_f_c.field_l_f);
        int i = class_l.field_l_i.field_l_c >> 16;
        int j = class_l.field_l_i.field_l_f >> 16;
        class_l.field_l_i.method_l_a(-(field_c_g[this.field_c_ba] << 16), field_c_g[this.field_c_ba] << 16);
        int k = class_l.field_l_g >> 16;
        int m = class_l.field_l_h >> 16;
        int n = i - k;
        int i1 = j - m;
        int i2 = n >> 2;
        int i3 = i - i2;
        int i4 = j - i2;
        if (this.field_c_bf) {
            if (this.field_c_ba == 0) {
                n = i;
                i1 = j;
                Graphics graphics = class_o.method_o_w();
                if (this.field_c_a != 0) {
                    class_b.field_b_by.setColor(255);
                    class_b.field_b_by.fillRect(0, 0, class_b.field_b_bx.getWidth(), class_b.field_b_bx.getHeight());
                    i = class_b.field_b_bx.getWidth() >> 1;
                    j = class_b.field_b_bx.getHeight() >> 1;
                    class_o.method_o_x(paramGraphics = class_b.field_b_by);
                }
                for (m = 0; m < 4; m++) {
                    this.field_c_ag[m] = 0;
                    for (i2 = 0; i2 < 4; i2++) {
                        if (m != i2)
                            this.field_c_ag[m] = this.field_c_ag[m] - (this.field_c_ae[i2] >> 1);
                    }
                }
                for (m = 0; m < 4; m++)
                    this.field_c_ah[m] = 999;
                method_c_r(i, j, field_c_m[this.field_c_ba] + 2, field_c_m[this.field_c_ba] + 2, -16777216, paramGraphics, false, false);
                method_c_r(i, j, field_c_m[this.field_c_ba], field_c_m[this.field_c_ba], this.field_c_aw, paramGraphics, true, false);
                m = field_c_m[this.field_c_ba] * 90 / 100;
                method_c_r(i, j + 2, m, field_c_m[this.field_c_ba], this.field_c_ay, paramGraphics, false, false);
                method_c_r(i + 1, j - 1, m, field_c_m[this.field_c_ba], this.field_c_aw, paramGraphics, false, true);
                class_l.field_l_i.method_l_g(5.3F);
                m = this.field_c_ah[1] >> 1;
                i2 = this.field_c_ah[1] - m + 1;
                i3 = i + (class_l.field_l_i.field_l_a * i2 >> 16);
                i2 = j + (class_l.field_l_i.field_l_d * i2 >> 16);
                for (i4 = 0; i4 < 12; i4++) {
                    int i5 = 31 + Math.abs(i4 % 2);
                    float f1 = this.field_c_am + i4 * 0.8F;
                    int i7 = 100 - (i4 << 2);
                    int i9 = i5;
                    float f2 = f1;
                    int i8 = i7;
                    i7 = j;
                    int i6 = i;
                    class_c class_c1 = this;
                    class_l.field_l_i.method_l_g(f2);
                    for (byte b = 0; b < 4; b++) {
                        int i10 = class_c1.field_c_ah[b] >> 1 >> 1;
                        i10 = i8 * (class_c1.field_c_ah[b] - i10) / 100;
                        int i11 = i6 + (class_l.field_l_i.field_l_a * i10 >> 16);
                        i10 = i7 + (class_l.field_l_i.field_l_d * i10 >> 16);
                        if (b == 0) {
                            if (i11 >= i6 && i10 <= i7) {
                                class_o.method_o_ay(i11, i10 + (class_c1.field_c_ae[1] + class_c1.field_c_ag[1] >> 10), i9);
                                break;
                            }
                        } else if (b == 1) {
                            if (i11 <= i6 && i10 <= i7) {
                                class_o.method_o_ay(i11, i10 + (class_c1.field_c_ae[1] + class_c1.field_c_ag[1] >> 10), i9);
                                break;
                            }
                        } else if (b == 2) {
                            if (i11 <= i6 && i10 >= i7) {
                                class_o.method_o_ay(i11, i10 + (class_c1.field_c_ae[1] + class_c1.field_c_ag[1] >> 10), i9);
                                break;
                            }
                        } else if (i11 >= i6 && i10 >= i7) {
                            class_o.method_o_ay(i11, i10 + (class_c1.field_c_ae[1] + class_c1.field_c_ag[1] >> 10), i9);
                            break;
                        }
                    }
                }
                class_o.method_o_ay(i, j, 17);
                method_c_r(i3, i2, m >> 1, field_c_m[this.field_c_ba], this.field_c_ax, paramGraphics, false, false);
                class_o.method_o_ay(i, j, 28);
                if (this.field_c_a != 0) {
                    class_o.method_o_x(graphics);
                    class_b.field_b_bx.getRGB(class_b.field_b_bz, 0, class_b.field_b_bx.getWidth(), 0, 0, class_b.field_b_bx.getWidth(), class_b.field_b_bx.getHeight());
                    i4 = 0;
                    int i5;
                    for (i5 = 0; i5 < class_b.field_b_bx.getHeight(); i5++) {
                        for (byte b = 0; b < class_b.field_b_bx.getWidth(); b++) {
                            if (class_b.field_b_bz[i4] == -16776961) {
                                class_b.field_b_bz[i4] = 0;
                            } else {
                                class_b.field_b_bz[i4] = class_b.field_b_bz[i4] - this.field_c_a;
                            }
                            i4++;
                        }
                    }
                    i5 = n - (class_b.field_b_bx.getWidth() >> 1);
                    int i6 = i1 - (class_b.field_b_bx.getHeight() >> 1);
                    class_o.method_o_w().drawRGB(class_b.field_b_bz, 0, class_b.field_b_bx.getWidth(), i5, i6, class_b.field_b_bx.getWidth(), class_b.field_b_bx.getHeight(), true);
                }
                if (class_b.field_b_dg && !class_b.field_b_ct) {
                    i4 = class_o.field_o_t * class_o.method_o_e();
                    this.field_c_b += i4;
                    if (this.field_c_b > 150) {
                        int i5 = class_m.field_m_a[4] / 120;
                        class_b.field_b_be.method_g_e(i5, class_b.field_b_cz.field_f_c.field_l_c, class_b.field_b_cz.field_f_c.field_l_f, field_c_g[0] << 15, 1000, 166);
                        this.field_c_b = 0;
                    }
                }
            } else if (this.field_c_ba == 1) {
                for (i1 = (int)Math.toDegrees(this.field_c_am); i1 < 0; i1 += 360);
                while (i1 > 359)
                    i1 -= 360;
                k = 31 - (int)(i1 / 11.25F);
                class_o.method_o_ay(i, j, field_c_r[k]);
            } else if (this.field_c_ba == 2) {
                n = field_c_m[this.field_c_ba] << 1;
                paramGraphics.setColor(0);
                paramGraphics.fillArc(k - 2, m - 2, n + 4, n + 4, 0, 360);
                for (i1 = 0; i1 < 6; i1++) {
                    paramGraphics.setColor(field_c_az[i1]);
                    paramGraphics.fillArc(k, m, n, n, i1 * 60 - (int)Math.toDegrees(this.field_c_am), 60);
                }
                paramGraphics.setColor(field_c_az[0]);
                paramGraphics.fillArc(i3, i4, i2 << 1, i2 << 1, 0, 360);
                class_o.method_o_ay(i, j, 5);
            }
            if (field_c_p == 1 || class_m.field_m_a[0] == 3) {
                class_o.method_o_ay(i, j, 20);
                return;
            }
            if (field_c_p == 2 || field_c_p == 3) {
                n = 462;
                i1 = 2;
                if (field_c_p == 3) {
                    n = 447;
                    i1 = 4;
                }
                m = i1;
                if ((i2 = field_c_n * m / 600) > m - 1)
                    i2 = m - 1;
                i2 = m - 1 - i2;
                class_o.method_o_bd(i, j, n, i2);
                return;
            }
            if (field_c_p >= 4 && field_c_p <= 8) {
                class_o.method_o_bd(i, j, field_c_q[field_c_p - 4], 0);
                return;
            }
            if (class_m.field_m_a[0] == 4) {
                class_o.method_o_bd(i, j, 465, 0);
                return;
            }
        } else {
            paramGraphics.setColor(this.field_c_aw);
            paramGraphics.fillArc(k, m, n << 1, i1 << 1, 0, 360);
        }
    }

    public final void method_c_p() {
        this.field_c_ba++;
        if (this.field_c_ba > 2) {
            this.field_c_ba = 0;
        }
        if (this.field_c_ba > class_b.method_b_a()) {
            this.field_c_ba = 0;
        }
        method_c_f();
    }

    public final void method_c_q() {
        this.field_c_s = 0.0f;
        this.field_c_t = 0.0f;
        this.field_c_x = 0.0f;
        this.field_c_y = 0.0f;
        this.field_c_v = 0.0f;
        this.field_c_w = 0.0f;
        this.field_c_ak = 0.0f;
        this.field_c_al = 0.0f;
    }

    private void method_c_r(int param1, int param2, int param3, int param4, int param5, Graphics param6, boolean param7, boolean param8) {
        param6.setColor(param5);
        int i = 2;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = param3 - ((param3 * ((this.field_c_ae[i] + this.field_c_ag[i]) >> 10)) / param4);
            int i4 = param3 - ((param3 * ((this.field_c_ae[i2 >> 1] + this.field_c_ag[i2 >> 1]) >> 10)) / param4);
            if (param8) {
                i3++;
            }
            if (param7) {
                this.field_c_ah[i2] = i3;
                if (i4 < i3) {
                    this.field_c_ah[i2] = i4;
                }
            }
            param6.fillArc(param1 - i3, (param2 - i4) + ((this.field_c_ae[1] + this.field_c_ag[1]) >> 10), i3 << 1, i4 << 1, i2 * 90, 90);
            if (i2 == 0) {
                i++;
            }
            if (i2 == 2) {
                i--;
            }
        }
    }

    static {
        field_c_m[0] = ((field_c_g[0] * class_f.field_f_ag.field_l_a) / 65536) + 1;
        field_c_m[1] = ((field_c_g[1] * class_f.field_f_ag.field_l_a) / 65536) + 1;
        field_c_m[2] = ((field_c_g[2] * class_f.field_f_ag.field_l_a) / 65536) + 1;
        field_c_r = new short[]{211, 212, 223, 234, 237, 238, 239, 240, 241, 242, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 235, 236};
        field_c_az = new int[]{15592941, 25788, 15592941, 14752000, 15592941, 15261445};
        field_c_bk = 1.5258789E-5f;
    }
}