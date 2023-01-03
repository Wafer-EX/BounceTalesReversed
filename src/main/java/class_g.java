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

public final class class_g extends class_f {
    private static boolean field_g_a = false;
    private int[] field_g_b;
    private int[] field_g_c;
    private int[] field_g_d;
    private int[] field_g_e;
    private int[] field_g_f;
    private short[] field_g_g;
    private byte[] field_g_h;
    private byte[] field_g_i;
    private int field_g_j;
    private int field_g_k;
    public int field_g_l;
    private int field_g_m;
    private int field_g_n;
    public int field_g_o;
    public int field_g_p;
    private int[] field_g_q;
    private int field_g_r;
    private static int[] field_g_s = new int[2];

    public class_g(int param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        if (!field_g_a) {
            field_g_a = true;
        }
        this.field_g_b = new int[param1];
        this.field_g_c = new int[param1];
        this.field_g_d = new int[param1];
        this.field_g_e = new int[param1];
        this.field_g_f = new int[param1];
        this.field_g_i = new byte[param1];
        if (param4 == 4) {
            this.field_g_g = new short[param1];
            this.field_g_h = new byte[param1];
            for (int i = 0; i < param1; i++) {
                this.field_g_g[i] = 0;
            }
        }
        this.field_g_m = param1;
        this.field_g_j = param2;
        this.field_g_k = param3;
        this.field_g_l = -1;
        this.field_g_n = param4;
        this.field_f_ab = (byte) 11;
        this.field_g_q = param5;
        this.field_g_r = param6;
        this.field_f_u = (byte) param7;

    }

    public final void method_g_a(class_f param1) {
        this.method_f_d(param1);
        this.field_f_c.field_l_a = 65536;
        this.field_f_c.field_l_b = 0;
        this.field_f_c.field_l_c = 0;
        this.field_f_c.field_l_d = 0;
        this.field_f_c.field_l_e = 65536;
        this.field_f_c.field_l_f = 0;
        this.field_f_b.method_l_c((class_l)this.field_f_c);
        this.method_c_f();
    }

    public final void method_g_b(int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 + 1 + this.field_g_l > this.field_g_m) {
            param1 = this.field_g_m - this.field_g_l - 1;
        }
        for (int i = 0; i < param1; ++i) {
            int n7 = i * 360 / param1;
            int n8 = n7 + 90 >= 360 ? n7 + 90 - 360 : n7 + 90;
            ++this.field_g_l;
            this.field_g_b[this.field_g_l] = param6 != 0 ? param5 + class_b.field_b_m.nextInt() % param6 : param5;
            this.field_g_c[this.field_g_l] = param2;
            this.field_g_d[this.field_g_l] = param3;
            this.field_g_e[this.field_g_l] = param4 * class_b.field_b_ax[n7];
            this.field_g_f[this.field_g_l] = param4 * class_b.field_b_ax[n8];
            if (this.field_g_n == 3) {
                this.field_g_i[this.field_g_l] = (byte)(i % this.field_g_q.length);
                continue;
            }
            if (this.field_g_n == 4 && this.equals(class_b.field_b_bb)) {
                byte by = (byte)Math.abs(class_b.field_b_m.nextInt() % this.field_g_q.length);
                n7 = by;
                if (by > 1) {
                    n7 = (byte)Math.abs(class_b.field_b_m.nextInt() % this.field_g_q.length);
                }
                this.field_g_i[this.field_g_l] = (byte) n7;
                continue;
            }
            this.field_g_i[this.field_g_l] = (byte)Math.abs(class_b.field_b_m.nextInt() % this.field_g_q.length);
        }
    }

    public final void method_g_c(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (param1 + 1 + this.field_g_l > this.field_g_m) {
            param1 = this.field_g_m - this.field_g_l - 1;
        }
        for (int i = 0; i < param1; ++i) {
            int n10 = param6 + class_b.field_b_m.nextInt() % (param7 / 2 + 1);
            int n11 = n10 - (n10 >= 360 ? 360 : 0);
            int n12 = n11 + (n11 < 0 ? 360 : 0);
            int n13 = n12 + 90 >= 360 ? n12 - 270 : n12 + 90;
            int n14 = param5 != 0 ? param4 + class_b.field_b_m.nextInt() % param5 : param4;
            ++this.field_g_l;
            this.field_g_b[this.field_g_l] = param9 != 0 ? param8 + class_b.field_b_m.nextInt() % param9 : param8;
            this.field_g_c[this.field_g_l] = param2;
            this.field_g_d[this.field_g_l] = param3;
            this.field_g_e[this.field_g_l] = n14 * class_b.field_b_ax[n12];
            this.field_g_f[this.field_g_l] = n14 * class_b.field_b_ax[n13];
            if (this.field_g_n == 0) {
                if (n12 >= 35 && n12 <= 90) {
                    this.field_g_i[this.field_g_l] = 2;
                    continue;
                }
                if (n12 < 35) {
                    this.field_g_i[this.field_g_l] = 3;
                    continue;
                }
                if (n12 > 325) {
                    this.field_g_i[this.field_g_l] = 1;
                    continue;
                }
                this.field_g_i[this.field_g_l] = 0;
                continue;
            }
            if (this.field_g_n == 7) {
                if (param6 == 0 || param6 == 180) {
                    this.field_g_i[this.field_g_l] = 0;
                    continue;
                }
                this.field_g_i[this.field_g_l] = 1;
                continue;
            }
            this.field_g_i[this.field_g_l] = (byte)Math.abs(class_b.field_b_m.nextInt() % this.field_g_q.length);
        }
    }

    public final void method_g_d(int param1, int param2, int param3, int param4, int param5) {
        if (11 + this.field_g_l > this.field_g_m) {
            param1 = this.field_g_m - this.field_g_l - 1;
        }
        for (int i = 0; i < param1; ++i) {
            int n6 = 800 + class_b.field_b_m.nextInt() % 200;
            ++this.field_g_l;
            this.field_g_b[this.field_g_l] = 800 + class_b.field_b_m.nextInt() % 200;
            this.field_g_c[this.field_g_l] = param2;
            this.field_g_d[this.field_g_l] = param3;
            int n7 = param4 + (class_b.field_b_m.nextInt() % 30 << 10);
            int n8 = param5 + (class_b.field_b_m.nextInt() % 30 << 10);
            this.field_g_e[this.field_g_l] = n6 * n7 >> 8;
            this.field_g_f[this.field_g_l] = n6 * n8 >> 8;
            this.field_g_i[this.field_g_l] = (byte)Math.abs(class_b.field_b_m.nextInt() % this.field_g_q.length);
        }
    }

    public final void method_g_e(int param1, int param2, int param3, int param4, int param5, int param6) {
        for (int i = 0; i < param1; ++i) {
            int n7;
            int n8;
            while ((n8 = class_b.field_b_m.nextInt() % ((param4 << 1) + 1)) * n8 + (n7 = class_b.field_b_m.nextInt() % ((param4 << 1) + 1)) * n7 > param4 * param4) {
            }
            n8 = param2 + n8;
            n7 = param3 + n7;
            this.method_g_c(1, n8, n7, 0, 0, 0, 0, param5, param6);
        }
    }

    public final void method_g_f(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        for (int i = 0; i < param1; ++i) {
            int n12 = param2 + Math.abs(class_b.field_b_m.nextInt() % (param4 - param2 + 1));
            int n13 = param3 + Math.abs(class_b.field_b_m.nextInt() % (param5 - param3 + 1));
            this.method_g_c(1, n12, n13, param6, param7, param8, param9, param10, param11);
        }
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        int n = class_o.field_o_t * class_o.method_o_e();
        for (int i = 0; i < this.field_g_l + 1; ++i) {
            int n2;
            int n3 = 0;
            int n4 = i;
            this.field_g_b[n4] = this.field_g_b[n4] - n;
            if (this.field_g_b[i] > 0) {
                if (this.field_g_k != 0) {
                    int n5 = i;
                    this.field_g_e[n5] = this.field_g_e[n5] - (this.field_g_e[i] * this.field_g_k * n >> 14);
                    int n6 = i;
                    this.field_g_f[n6] = this.field_g_f[n6] - (this.field_g_f[i] * this.field_g_k * n >> 14);
                }
                int n7 = i;
                this.field_g_e[n7] = this.field_g_e[n7];
                int n8 = i;
                this.field_g_f[n8] = this.field_g_f[n8] + this.field_g_j * n;
                if (this.field_g_n == 1 && this.field_g_f[i] > this.field_g_p) {
                    this.field_g_f[i] = this.field_g_p;
                } else if (this.field_g_n == 4) {
                    int n9 = i;
                    this.field_g_g[n9] = (short)(this.field_g_g[n9] - n);
                    if (this.field_g_g[i] <= 0) {
                        this.field_g_g[i] = (short)(Math.abs(class_b.field_b_m.nextInt() % 200) + 300);
                        this.field_g_h[i] = (byte)(Math.abs(class_b.field_b_m.nextInt()) & 3);
                    }
                    n2 = n / 2;
                    if (this.field_g_h[i] == 1) {
                        class_g.method_g_g(n2, this.field_g_e[i], this.field_g_f[i]);
                        this.field_g_e[i] = field_g_s[0];
                        this.field_g_f[i] = field_g_s[1];
                    } else if (this.field_g_h[i] == 2) {
                        class_g.method_g_g(359 - n2, this.field_g_e[i], this.field_g_f[i]);
                        this.field_g_e[i] = field_g_s[0];
                        this.field_g_f[i] = field_g_s[1];
                    }
                } else if (this.field_g_n == 5) {
                    class_g.method_g_g(n / 5, this.field_g_e[i], this.field_g_f[i]);
                    this.field_g_e[i] = field_g_s[0];
                    this.field_g_f[i] = field_g_s[1];
                }
                int n10 = i;
                this.field_g_c[n10] = this.field_g_c[n10] + (this.field_g_e[i] * n >> 4);
                int n11 = i;
                this.field_g_d[n11] = this.field_g_d[n11] + (this.field_g_f[i] * n >> 4);
            } else {
                n3 = 1;
            }
            if (this.field_g_n == 1 && this.field_g_d[i] >= this.field_g_o) {
                n3 = 1;
            }
            if (n3 != 0) {
                if (i == this.field_g_l) {
                    --this.field_g_l;
                    continue;
                }
                this.field_g_b[i] = this.field_g_b[this.field_g_l];
                this.field_g_c[i] = this.field_g_c[this.field_g_l];
                this.field_g_d[i] = this.field_g_d[this.field_g_l];
                this.field_g_e[i] = this.field_g_e[this.field_g_l];
                this.field_g_f[i] = this.field_g_f[this.field_g_l];
                --this.field_g_l;
                --i;
                continue;
            }
            n2 = class_o.method_o_bf(this.field_g_q[this.field_g_i[i]]);
            n3 = this.field_g_b[i] * n2 / this.field_g_r;
            if (n3 > n2 - 1) {
                n3 = n2 - 1;
            }
            n3 = n2 - 1 - n3;
            param3.method_l_a(this.field_g_c[i], this.field_g_d[i]);
            n2 = class_l.field_l_g >> 16;
            int n12 = class_l.field_l_h >> 16;
            class_o.method_o_bd(n2, n12, this.field_g_q[this.field_g_i[i]], n3);
        }
    }

    private static void method_g_g(int param1, int param2, int param3) {
        short s2 = class_b.field_b_ax[param1 % 360];
        param1 = class_b.field_b_ax[(param1 + 90) % 360];
        class_g.field_g_s[0] = (param2 * param1 - param3 * s2) / 360;
        class_g.field_g_s[1] = (param2 * s2 + param3 * param1) / 360;
    }
}