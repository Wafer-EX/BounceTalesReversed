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

public final class class_n extends class_f {
    private int field_n_a;
    int field_n_b;
    short field_n_c;
    private short field_n_d;
    short field_n_e;
    short field_n_f;
    private short field_n_g;
    private byte[] field_n_h;
    private int[] field_n_i;
    private int[] field_n_j;
    private byte[] field_n_k;
    private byte[] field_n_l;
    private int[] field_n_m;
    private int[] field_n_n;
    private byte field_n_o = 0;
    private byte field_n_p;
    private byte field_n_q;
    private byte field_n_r;
    private int field_n_s = (short)6;
    private int field_n_t;
    private int field_n_u = 0;
    private int field_n_v;
    private int field_n_w;
    int field_n_x;
    private byte field_n_y;

    public class_n() {
        this.field_f_ab = 6;
    }

    @Override
    public final int method_d_a(byte[] param1, int param2) {
        param2 = super.method_d_a(param1, param2);
        this.field_n_c = (short)(param1[param2++] << 8 | param1[param2++] & 0xFF);
        this.field_n_d = (short)(param1[param2++] << 8 | param1[param2++] & 0xFF);
        this.field_n_e = (short)(param1[param2++] << 8 | param1[param2++] & 0xFF);
        this.field_n_f = (short)(param1[param2++] << 8 | param1[param2++] & 0xFF);
        this.field_n_o = param1[param2++];
        this.field_n_p = param1[param2++];
        this.field_n_q = param1[param2++];
        this.field_n_r = param1[param2++];
        int n3 = ++param2;
        int n4 = ++param2;
        int n5 = ++param2;
        ++param2;
        int n6 = param1[n5] & 0xFF;
        this.field_n_s = 0x44000000 | (param1[n3] & 0xFF) << 16 | (param1[n4] & 0xFF) << 8 | n6;
        this.field_n_y = n6 == 16 ? (byte)1 : 0;
        if (this.field_n_s != 0x44000000) {
            this.field_n_s = 0x441111EE;
        }
        this.field_n_g = (short)(this.field_n_e - this.field_n_c);
        if (this.field_n_s != 0x44000000 && this.field_n_y == 0) {
            int n7;
            n6 = this.field_n_g * 50 / 100;
            this.field_n_h = new byte[n6];
            this.field_n_t = n6 << 12;
            this.field_n_w = 0;
            this.field_n_b = n6 + 2;
            for (n7 = 0; n7 < n6; ++n7) {
                this.field_n_h[n7] = 0;
            }
            for (n7 = 0; n7 < this.field_n_a; ++n7) {
                this.field_n_i[n7] = 0;
            }
            this.field_n_a = ((n6 /= 20) << 1) + 2;
            this.field_n_i = new int[this.field_n_a];
            this.field_n_j = new int[this.field_n_a];
            this.field_n_k = new byte[this.field_n_a];
            this.field_n_l = new byte[this.field_n_a];
            this.field_n_m = new int[this.field_n_a];
            this.field_n_n = new int[this.field_n_a];
            for (n7 = 2; n7 <= n6 - 2; ++n7) {
                int n8 = (this.field_n_h.length - 1 << 12) * n7 / n6;
                int n9 = (Math.abs(class_b.field_b_m.nextInt() % 2) + 24 << 12 << 1) / 9;
                int n10 = (Math.abs(class_b.field_b_m.nextInt() % 2) + 10 << 12) / 3;
                int n11 = n9 * 3;
                this.method_n_c(n9, n11, -1, n10, n8, 1);
                n9 = (Math.abs(class_b.field_b_m.nextInt() % 2) + 24 << 12 << 1) / 9;
                n10 = (Math.abs(class_b.field_b_m.nextInt() % 2) + 10 << 12) / 3;
                n11 = n9 * 3;
                this.method_n_c(n9, n11, 1, n10, n8, 1);
            }
        }
        return param2;
    }

    @Override
    public final void method_c_f() {
        this.field_f_m = this.field_n_c << 16;
        this.field_f_o = this.field_n_e << 16;
        this.field_f_n = (this.field_n_d << 16) - 1966080;
        this.field_f_p = (this.field_n_f << 16) + 1966080;
        this.field_n_x = this.field_n_f << 16;
    }

    public final void method_n_a(int param1, float param2, int param3, class_c param4) {
        if (this.field_n_s != 1140850688) {
            this.field_n_v = 0;
            if (param2 > 230.0f) {
                param2 = 230.0f;
            }
            else if (param2 < -230.0f) {
                param2 = -230.0f;
            }
            final int n = (int)Math.abs(param2);
            if (this.field_n_y == 0) {
                param1 = (int)((this.field_n_h.length - 1 << 12) * (long)param1 / 65536L);
                final int n3;
                final int n2 = (n3 = (n * 100 << 12) / 1500) << 1;
                this.method_n_c(n3, n2, -1, 20480, param1 - (param3 << 2), 0);
                this.method_n_c(n3, n2, 1, 20480, param1 + (param3 << 2), 0);
            }
            param4.field_c_ak /= 3.0f;
            param4.field_c_al /= 3.0f;
            if (this.field_n_y == 0) {
                this.method_f_f(class_f.field_f_a);
                param3 = class_f.field_f_a.field_l_f + (this.field_n_f << 16);
                param1 = n * 500 / 230;
                final int n4 = n * 6 / 230;
                final int n5 = n * 800 / 230;
                class_b.field_b_bc.method_g_c(n4, class_b.field_b_cz.field_f_c.field_l_c, param3, param1, param1 >> 2, 325, 30, n5, n5 / 6);
                class_b.field_b_bc.method_g_c(n4, class_b.field_b_cz.field_f_c.field_l_c, param3, param1, param1 >> 2, 35, 30, n5, n5 / 6);
            }
        }
    }

    public final void method_n_b(int n, int n2, class_c class_c2) {
        int n3;
        int n4;
        int n5;
        this.field_n_v += class_o.field_o_t;
        if (class_b.field_b_ay) {
            return;
        }
        float f = (float)(n - this.field_f_m) / (float)(this.field_f_o - this.field_f_m);
        float f2 = (float)(n2 - this.field_f_n) / (float)(this.field_f_p - this.field_f_n);
        if (this.field_n_r < this.field_n_p) {
            n5 = this.field_n_p - this.field_n_r;
            n4 = this.field_n_r + (int)(f * (float)n5);
        } else {
            n5 = this.field_n_r - this.field_n_p;
            n4 = this.field_n_p + (int)((1.0f - f) * (float)n5);
        }
        if (this.field_n_q < this.field_n_o) {
            n5 = this.field_n_o - this.field_n_q;
            n3 = this.field_n_q + (int)(f2 * (float)n5);
        } else {
            n5 = this.field_n_q - this.field_n_o;
            n3 = this.field_n_o + (int)((1.0f - f2) * (float)n5);
        }
        class_c2.field_c_v += (float)(n4 << 5);
        class_c2.field_c_w += (float)(n3 << 5);
        if (class_c2.field_c_ak > 0.0f) {
            class_c2.field_c_ak -= (float)class_o.field_o_t * class_c2.field_c_ak / 400.0f;
            if (class_c2.field_c_ak < 0.0f) {
                class_c2.field_c_ak = 0.0f;
            }
        } else if (class_c2.field_c_ak < 0.0f) {
            class_c2.field_c_ak -= (float)class_o.field_o_t * class_c2.field_c_ak / 400.0f;
            if (class_c2.field_c_ak > 0.0f) {
                class_c2.field_c_ak = 0.0f;
            }
        }
        if (class_c2.field_c_al > 0.0f) {
            class_c2.field_c_al -= (float)class_o.field_o_t * class_c2.field_c_al / 400.0f;
            if (class_c2.field_c_al < 0.0f) {
                class_c2.field_c_al = 0.0f;
            }
        } else if (class_c2.field_c_al < 0.0f) {
            class_c2.field_c_al -= (float)class_o.field_o_t * class_c2.field_c_al / 400.0f;
            if (class_c2.field_c_al > 0.0f) {
                class_c2.field_c_al = 0.0f;
            }
        }
        if (this.field_n_s != 0x44000000) {
            float f3 = 1.0f / class_c.field_c_h[class_b.field_b_cz.field_c_ba];
            float f4 = (float)class_o.field_o_t * 0.0014f;
            if (class_b.field_b_cz.field_c_s > 0.0f) {
                class_b.field_b_cz.field_c_s -= class_b.field_b_cz.field_c_s * f3 * f4;
                if (class_b.field_b_cz.field_c_s < 0.0f) {
                    class_b.field_b_cz.field_c_s = 0.0f;
                }
            } else {
                class_b.field_b_cz.field_c_s -= class_b.field_b_cz.field_c_s * f3 * f4;
                if (class_b.field_b_cz.field_c_s > 0.0f) {
                    class_b.field_b_cz.field_c_s = 0.0f;
                }
            }
            if (class_b.field_b_cz.field_c_t > 0.0f) {
                class_b.field_b_cz.field_c_t -= class_b.field_b_cz.field_c_t * f3 * f4;
                if (class_b.field_b_cz.field_c_t < 0.0f) {
                    class_b.field_b_cz.field_c_t = 0.0f;
                }
            } else {
                class_b.field_b_cz.field_c_t -= class_b.field_b_cz.field_c_t * f3 * f4;
                if (class_b.field_b_cz.field_c_t > 0.0f) {
                    class_b.field_b_cz.field_c_t = 0.0f;
                }
            }
        }
        if (this.field_n_v > 150 && this.field_n_s != 0x44000000) {
            int n6;
            this.method_f_f(class_f.field_f_a);
            class_b.field_b_bd.field_g_o = n6 = class_f.field_f_a.field_l_f + (this.field_n_f << 16);
            class_b.field_b_bd.field_g_p = 60000;
            int n7 = class_m.field_m_a[4] / 60;
            class_b.field_b_bd.method_g_e(n7, class_b.field_b_cz.field_f_c.field_l_c, class_b.field_b_cz.field_f_c.field_l_f, class_c.field_c_g[0] << 15, 4000, 666);
            this.field_n_v = 0;
        }
        if (this.field_n_s != 0x44000000) {
            class_b.field_b_cz.field_f_u = (byte)8;
        }
        class_b.field_b_ay = true;
    }

    private void method_n_c(int integer2, int integer3, int integer4, int integer5, int integer6, int integer7) {
        for (int i = 0; i < this.field_n_a; ++i) {
            if (this.field_n_i[i] == 0) {
                this.field_n_i[i] = integer2 * 50 / 100;
                this.field_n_j[i] = integer3 * 50 / 100;
                this.field_n_k[i] = (byte)integer4;
                this.field_n_l[i] = (byte)integer7;
                this.field_n_m[i] = integer5 * 50 / 100;
                this.field_n_n[i] = integer6;
                return;
            }
        }
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        int i;
        int i2;
        int i3;
        int method_o_e = class_o.field_o_t * class_o.method_o_e();
        if (this.field_n_s == 1140850688) {
            if (class_b.field_b_ct) {
                return;
            }
            this.field_n_w += method_o_e;
            if (this.field_n_w > 150) {
                method_f_f(class_f.field_f_a);
                int i4 = class_f.field_f_a.field_l_c + (this.field_n_c << 16);
                int i5 = class_f.field_f_a.field_l_c + (this.field_n_e << 16);
                int i6 = class_f.field_f_a.field_l_f + (this.field_n_d << 16);
                int i7 = class_f.field_f_a.field_l_f + (this.field_n_f << 16);
                int i8 = i4;
                int i9 = i5;
                int i10 = i6;
                int i11 = i7;
                int abs = Math.abs((int) this.field_n_r);
                if (Math.abs((int) this.field_n_p) > abs) {
                    abs = Math.abs((int) this.field_n_p);
                }
                int abs2 = Math.abs((int) this.field_n_o);
                if (Math.abs((int) this.field_n_q) > abs2) {
                    abs2 = Math.abs((int) this.field_n_q);
                }
                if (this.field_n_r + this.field_n_p > 0) {
                    i = abs << 7;
                    i2 = 90;
                    i9 = i4;
                } else if (this.field_n_r + this.field_n_p < 0) {
                    i = abs << 7;
                    i2 = 270;
                    i8 = i9;
                } else if (this.field_n_o + this.field_n_q > 0) {
                    i = abs2 << 7;
                    i2 = 0;
                    i11 = i10;
                } else {
                    i = abs2 << 7;
                    i2 = 180;
                    i10 = i7;
                }
                class_b.field_b_br.method_g_f(1, i8, i10, i9, i11, i, i / 8, i2, 0, 2000, 333);
                this.field_n_w = 0;
                return;
            }
            return;
        }
        if (!class_b.field_b_ct) {
            this.field_n_w += method_o_e;
            if (this.field_n_w > 150) {
                method_f_f(class_f.field_f_a);
                int i12 = class_f.field_f_a.field_l_c + (this.field_n_c << 16);
                int i13 = class_f.field_f_a.field_l_c + (this.field_n_e << 16);
                int i14 = class_f.field_f_a.field_l_f + (this.field_n_d << 16);
                class_b.field_b_bd.field_g_o = class_f.field_f_a.field_l_f + (this.field_n_f << 16);
                class_b.field_b_bd.field_g_p = 60000;
                class_b.field_b_bd.method_g_f(1, i12, i14, i13, i14, 0, 0, 0, 0, 4000, 666);
                this.field_n_w = 0;
            }
        }
        if (!class_b.field_b_ct && this.field_n_y == 0) {
            this.field_n_u += method_o_e;
            for (int i15 = 0; i15 < this.field_n_h.length; i15++) {
                this.field_n_h[i15] = 0;
            }
            for (int i16 = 0; i16 < this.field_n_a; i16++) {
                if (this.field_n_i[i16] != 0) {
                    if (this.field_n_l[i16] != 1) {
                        int[] iArr = this.field_n_i;
                        int i17 = i16;
                        iArr[i17] = iArr[i17] - ((method_o_e * 28) >> 3);
                        int[] iArr2 = this.field_n_j;
                        int i18 = i16;
                        iArr2[i18] = iArr2[i18] - ((method_o_e * 12) >> 3);
                        int[] iArr3 = this.field_n_m;
                        int i19 = i16;
                        iArr3[i19] = iArr3[i19] - ((method_o_e << 2) >> 3);
                    }
                    int[] iArr4 = this.field_n_n;
                    int i20 = i16;
                    iArr4[i20] = iArr4[i20] + (((this.field_n_k[i16] * this.field_n_m[i16]) * method_o_e) >> 6);
                    if (this.field_n_j[i16] <= 0 || this.field_n_m[i16] <= 0) {
                        this.field_n_i[i16] = 0;
                    }
                    if (this.field_n_i[i16] <= 0) {
                        this.field_n_i[i16] = 0;
                    } else if (this.field_n_n[i16] < 0 || (this.field_n_n[i16] >> 12) >= (this.field_n_t >> 12)) {
                        byte[] bArr = this.field_n_k;
                        int i21 = i16;
                        bArr[i21] = (byte) (-bArr[i21]);
                        if (this.field_n_n[i16] < 0) {
                            this.field_n_n[i16] = 0;
                        } else if ((this.field_n_n[i16] >> 12) >= (this.field_n_t >> 12)) {
                            this.field_n_n[i16] = ((this.field_n_t >> 12) - 1) << 12;
                        }
                        if (this.field_n_l[i16] != 1) {
                            int[] iArr5 = this.field_n_i;
                            int i22 = i16;
                            iArr5[i22] = iArr5[i22] - ((28 * (method_o_e << 1)) >> 3);
                            int[] iArr6 = this.field_n_j;
                            int i23 = i16;
                            iArr6[i23] = iArr6[i23] - ((12 * (method_o_e << 1)) >> 3);
                            int[] iArr7 = this.field_n_m;
                            int i24 = i16;
                            iArr7[i24] = iArr7[i24] - ((4 * (method_o_e << 1)) >> 3);
                        }
                    }
                    if (this.field_n_i[i16] > 0 && (i3 = this.field_n_n[i16] >> 12) >= 0 && i3 < this.field_n_h.length) {
                        byte[] bArr2 = this.field_n_h;
                        bArr2[i3] = (byte) (bArr2[i3] + (this.field_n_i[i16] >> 12));
                        int i25 = this.field_n_j[i16] >> 12;
                        int i26 = i25;
                        if (i25 == 0) {
                            i26 = 1;
                        }
                        int i27 = 180 / i26;
                        for (int i28 = 1; i28 < i26; i28++) {
                            int i29 = ((this.field_n_i[i16] * ((class_b.field_b_ax[90 + (i27 * i28)] + 360) >> 1)) / 360) >> 12;
                            if (i3 - i28 >= 0) {
                                byte[] bArr3 = this.field_n_h;
                                int i30 = i3 - i28;
                                bArr3[i30] = (byte) (bArr3[i30] + i29);
                            }
                            if (i3 + i28 < this.field_n_h.length) {
                                byte[] bArr4 = this.field_n_h;
                                int i31 = i3 + i28;
                                bArr4[i31] = (byte) (bArr4[i31] + i29);
                            }
                        }
                    }
                }
            }
            for (int i32 = 0; i32 < this.field_n_h.length; i32++) {
                if (i32 > 0 && this.field_n_h[i32 - 1] < this.field_n_h[i32] && i32 < this.field_n_h.length - 1 && this.field_n_h[i32 + 1] < this.field_n_h[i32]) {
                    byte[] bArr5 = this.field_n_h;
                    int i33 = i32;
                    bArr5[i33] = (byte) (bArr5[i33] - 1);
                }
            }
        }
        method_f_f(class_f.field_f_a);
        class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
        class_l.field_l_i.method_l_a(this.field_n_c << 16, this.field_n_f << 16);
        int i34 = class_l.field_l_g >> 16;
        int i35 = class_l.field_l_h >> 16;
        class_l.field_l_i.method_l_a(this.field_n_e << 16, this.field_n_d << 16);
        int i36 = class_l.field_l_g >> 16;
        int i37 = class_l.field_l_h >> 16;
        int i38 = i36 - i34;
        if (this.field_n_y != 0) {
            int method_b_am = class_b.method_b_am(this.field_n_s);
            int[] iArr8 = class_i.field_i_a;
            int[] iArr9 = class_i.field_i_b;
            iArr8[0] = i34;
            iArr9[0] = i35;
            iArr8[1] = i36;
            iArr9[1] = i35;
            iArr8[2] = i36;
            iArr9[2] = i37;
            iArr8[3] = i34;
            iArr9[3] = i37;
            param2.fillPolygon(iArr8, 0, iArr9, 0, 4, method_b_am);
            return;
        }
        int length = (((i38 << 8) << 10) / this.field_n_h.length) >> 8;
        int[] iArr10 = class_i.field_i_a;
        int[] iArr11 = class_i.field_i_b;
        iArr10[0] = i36;
        iArr11[0] = i37;
        iArr10[1] = i34;
        iArr11[1] = i37;
        int i39 = 2;
        int i40 = 2;
        while (i40 < this.field_n_h.length + 2) {
            if (i40 > 2) {
                byte b = this.field_n_h[i40 - 2];
                int i41 = 0;
                for (int i42 = i40 + 1; i42 < this.field_n_h.length + 2 && this.field_n_h[i42 - 2] == b; i42++) {
                    i41++;
                }
                i40 += i41;
            }
            if (i40 == this.field_n_h.length + 1) {
                iArr10[i39] = i36;
                iArr11[i39] = i35;
            } else {
                iArr10[i39] = (((i40 - 2) * length) >> 10) + i34;
                iArr11[i39] = (((-this.field_n_h[i40 - 2]) * length) >> 10) + i35;
            }
            i39++;
            i40++;
        }
        param2.fillPolygon(iArr10, 0, iArr11, 0, i39, class_b.method_b_am(this.field_n_s));
    }
}