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

public class class_f {
    public static final class_l field_f_a = new class_l();
    public final class_l field_f_b;
    public final class_l field_f_c;
    private class_l field_f_d;
    public final class_l field_f_e;
    public final class_l field_f_f;
    private class_f field_f_g;
    private class_f field_f_h;
    private class_f field_f_i;
    private class_f field_f_j;
    private short field_f_k;
    private short field_f_l;
    public int field_f_m;
    public int field_f_n;
    public int field_f_o;
    public int field_f_p;
    public int field_f_q;
    public int field_f_r;
    public int field_f_s;
    public int field_f_t;
    public byte field_f_u;
    public int field_f_v;
    public boolean field_f_w = true;
    private boolean field_f_x = true;
    public boolean field_f_y = true;
    public boolean field_f_z = true;
    private short field_f_aa;
    protected byte field_f_ab = 1;
    private static short field_f_ac;
    private static int field_f_ad;
    public static final class_l field_f_ae;
    private static class_l field_f_af;
    public static final class_l field_f_ag;
    private static class_l field_f_ah;
    private static class_l field_f_ai;
    public static class_f field_f_aj;
    public static int field_f_ak;
    public static int field_f_al;
    public static int field_f_am;
    public static int field_f_an;
    private static int field_f_ao;
    private static class_f[] field_f_ap;
    protected static class_f field_f_aq;

    public class_f() {
        short s = field_f_ac;
        field_f_ac = (short)(s + 1);
        this.field_f_aa = s;
        this.field_f_b = new class_l();
        this.field_f_c = new class_l();
        this.field_f_d = new class_l();
        this.field_f_e = new class_l();
        this.field_f_f = new class_l();
    }

    public final byte method_f_a() {
        return this.field_f_ab;
    }

    public void method_c_g() {
        if (this.field_f_w) {
            if (this.field_f_g != null) {
                class_l.method_l_e(this.field_f_g.field_f_b, this.field_f_c, this.field_f_b);
            } else {
                this.field_f_b.method_l_c(this.field_f_c);
            }
            this.field_f_b.method_l_f(this.field_f_e);
            this.field_f_w = false;
        }
    }

    public final void method_f_b() {
        for (class_f f2 = this; f2 != null; f2 = f2.method_f_i(this)) {
            f2.field_f_w = true;
            f2.field_f_y = true;
            f2.field_f_z = true;
        }
    }

    public final void method_f_c() {
        class_f f2 = this;
        while (f2 != null) {
            f2.field_f_x = true;
            f2 = f2.field_f_g;
        }
    }

    public void method_c_i(class_f param1) {

    }

    public void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) { }

    public final void method_f_d(class_f param1) {
        if (param1.method_f_h(this)) {
            throw new IllegalArgumentException();
        }
        if (param1 == this) {
            throw new IllegalArgumentException();
        }
        this.method_f_e();
        this.field_f_i = param1.field_f_h;
        if (this.field_f_i != null) {
            this.field_f_i.field_f_j = this;
        }
        this.field_f_g = param1;
        this.field_f_g.field_f_h = this;
    }

    public final void method_f_e() {
        if (this.field_f_g != null) {
            if (this.field_f_g.field_f_h == this) {
                this.field_f_g.field_f_h = this.field_f_i;
                if (this.field_f_i != null) {
                    this.field_f_i.field_f_j = null;
                }
            } else {
                if (this.field_f_j != null) {
                    this.field_f_j.field_f_i = this.field_f_i;
                }
                if (this.field_f_i != null) {
                    this.field_f_i.field_f_j = this.field_f_j;
                }
            }
            this.field_f_g = null;
            this.field_f_i = null;
            this.field_f_j = null;
        }
    }

    public final void method_f_f(class_l param1) {
        if (this.field_f_y) {
            this.method_f_g();
        }
        param1.method_l_c(this.field_f_d);
    }

    public final void method_f_g() {
        this.field_f_d.method_l_c(this.field_f_c);
        class_f f2 = this.field_f_g;
        while (f2 != null) {
            class_l.method_l_e(f2.field_f_c, this.field_f_d, this.field_f_d);
            f2 = f2.field_f_g;
        }
        this.field_f_d.method_l_f(this.field_f_f);
        this.field_f_y = false;
    }

    public final boolean method_f_h(class_f paramclass_f) {
        for (class_f class_f1 = this.field_f_g; class_f1 != null; class_f1 = class_f1.field_f_g) {
            if (paramclass_f == class_f1)
                return true;
        }
        return false;
    }

    public final class_f method_f_i(class_f param1) {
        if (param1 == null) {
            return null;
        }
        if (this.field_f_h != null) {
            return this.field_f_h;
        }
        if (this == param1) {
            return null;
        }
        if (this.field_f_i != null) {
            return this.field_f_i;
        }
        class_f f3 = this.field_f_g;
        while (f3 != null && f3 != param1) {
            if (f3.field_f_i != null) {
                return f3.field_f_i;
            }
            f3 = f3.field_f_g;
        }
        return null;
    }

    public final class_f method_f_j(class_f param1) {
        if (param1 == null) {
            return null;
        }
        if (this == param1) {
            return null;
        }
        if (this.field_f_i != null) {
            return this.field_f_i;
        }
        class_f f3 = this.field_f_g;
        while (f3 != null && f3 != param1) {
            if (f3.field_f_i != null) {
                return f3.field_f_i;
            }
            f3 = f3.field_f_g;
        }
        return null;
    }

    public final short method_f_o() {
        return this.field_f_aa;
    }

    public final void method_f_p(short param1) {
        this.field_f_aa = param1;
    }

    public final class_f method_f_q(short param1) {
        class_f f2;
        for (f2 = this; f2 != null && f2.field_f_aa != param1; f2 = f2.method_f_i(this)) {
        }
        return f2;
    }

    public final class_f method_f_r() {
        class_f f2 = this;
        while (f2.field_f_g != null) {
            f2 = f2.field_f_g;
        }
        return f2;
    }

    public void method_c_f() {
        this.field_f_m = Integer.MAX_VALUE;
        this.field_f_n = Integer.MAX_VALUE;
        this.field_f_o = Integer.MIN_VALUE;
        this.field_f_p = Integer.MIN_VALUE;
    }

    public final void method_f_s() {
        if (this.field_f_x) {
            this.field_f_q = this.field_f_m;
            this.field_f_r = this.field_f_n;
            this.field_f_s = this.field_f_o;
            this.field_f_t = this.field_f_p;
            class_f f2 = this.field_f_h;
            while (f2 != null) {
                f2.method_f_s();
                f2.field_f_c.method_l_a(f2.field_f_q, f2.field_f_r);
                if (class_l.field_l_g < this.field_f_q) {
                    this.field_f_q = class_l.field_l_g;
                }
                if (class_l.field_l_h < this.field_f_r) {
                    this.field_f_r = class_l.field_l_h;
                }
                if (class_l.field_l_g > this.field_f_s) {
                    this.field_f_s = class_l.field_l_g;
                }
                if (class_l.field_l_h > this.field_f_t) {
                    this.field_f_t = class_l.field_l_h;
                }
                f2.field_f_c.method_l_a(f2.field_f_q, f2.field_f_t);
                if (class_l.field_l_g < this.field_f_q) {
                    this.field_f_q = class_l.field_l_g;
                }
                if (class_l.field_l_h < this.field_f_r) {
                    this.field_f_r = class_l.field_l_h;
                }
                if (class_l.field_l_g > this.field_f_s) {
                    this.field_f_s = class_l.field_l_g;
                }
                if (class_l.field_l_h > this.field_f_t) {
                    this.field_f_t = class_l.field_l_h;
                }
                f2.field_f_c.method_l_a(f2.field_f_s, f2.field_f_t);
                if (class_l.field_l_g < this.field_f_q) {
                    this.field_f_q = class_l.field_l_g;
                }
                if (class_l.field_l_h < this.field_f_r) {
                    this.field_f_r = class_l.field_l_h;
                }
                if (class_l.field_l_g > this.field_f_s) {
                    this.field_f_s = class_l.field_l_g;
                }
                if (class_l.field_l_h > this.field_f_t) {
                    this.field_f_t = class_l.field_l_h;
                }
                f2.field_f_c.method_l_a(f2.field_f_s, f2.field_f_r);
                if (class_l.field_l_g < this.field_f_q) {
                    this.field_f_q = class_l.field_l_g;
                }
                if (class_l.field_l_h < this.field_f_r) {
                    this.field_f_r = class_l.field_l_h;
                }
                if (class_l.field_l_g > this.field_f_s) {
                    this.field_f_s = class_l.field_l_g;
                }
                if (class_l.field_l_h > this.field_f_t) {
                    this.field_f_t = class_l.field_l_h;
                }
                f2 = f2.field_f_i;
            }
            this.field_f_x = false;
        }
    }

    public int method_d_a(byte[] param1, int param2) {
        this.field_f_k = class_f.method_f_u(param1, param2);
        this.field_f_l = class_f.method_f_u(param1, param2 += 2);
        byte by = param1[param2 += 2];
        ++param2;
        if ((by & 7) == 7) {
            this.field_f_c.field_l_a = class_f.method_f_v(param1, param2);
            this.field_f_c.field_l_b = class_f.method_f_v(param1, param2 += 4);
            this.field_f_c.field_l_c = class_f.method_f_v(param1, param2 += 4);
            this.field_f_c.field_l_d = class_f.method_f_v(param1, param2 += 4);
            this.field_f_c.field_l_e = class_f.method_f_v(param1, param2 += 4);
            this.field_f_c.field_l_f = class_f.method_f_v(param1, param2 += 4);
            param2 += 4;
        } else {
            if ((by & 1) > 0) {
                this.field_f_c.field_l_c = class_f.method_f_u(param1, param2) << 16;
                this.field_f_c.field_l_f = class_f.method_f_u(param1, param2 += 2) << 16;
                param2 += 2;
            }
            if ((by & 2) > 0) {
                this.field_f_c.method_l_g((float)class_f.method_f_v(param1, param2) / 65536.0f);
                param2 += 4;
            }
            if ((by & 4) > 0) {
                this.field_f_c.field_l_a = class_f.method_f_v(param1, param2);
                this.field_f_c.field_l_e = class_f.method_f_v(param1, param2 += 4);
                param2 += 4;
            }
        }
        this.field_f_v = class_f.method_f_v(param1, param2);
        this.field_f_u = (byte)((this.field_f_v & 0x1F) - 16);
        this.field_f_b.field_l_a = this.field_f_c.field_l_a;
        this.field_f_b.field_l_b = this.field_f_c.field_l_b;
        this.field_f_b.field_l_c = this.field_f_c.field_l_c;
        this.field_f_b.field_l_d = this.field_f_c.field_l_d;
        this.field_f_b.field_l_e = this.field_f_c.field_l_e;
        this.field_f_b.field_l_f = this.field_f_c.field_l_f;
        return param2 + 4;
    }

    public static void method_f_t(class_f[] param1) {
        int n;
        for (n = 0; n < param1.length; ++n) {
            class_f f2;
            class_f f3 = param1[n];
            if (f3.field_f_k >= 0) {
                f3.field_f_g = f2 = param1[f3.field_f_k];
                if (f2.field_f_h == null) {
                    f2.field_f_h = f3;
                }
            }
            if (f3.field_f_l < 0) continue;
            f3.field_f_j = f2 = param1[f3.field_f_l];
            f2.field_f_i = f3;
        }
        for (n = 0; n < param1.length; ++n) {
            param1[n].field_f_w = true;
            param1[n].field_f_x = true;
            param1[n].field_f_y = true;
            param1[n].method_f_g();
            param1[n].method_f_f(field_f_a);
            param1[n].field_f_b.method_l_c(field_f_a);
            param1[n].field_f_b.method_l_f(param1[n].field_f_e);
        }
    }

    public static final short method_f_u(byte[] param1, int param2) {
        return (short)((0 | param1[param2]) << 8 | param1[param2 + 1] & 0xFF);
    }

    public static final int method_f_v(byte[] param1, int param2) {
        return (int)((((0L | (long)param1[param2]) << 8 | (long)(param1[param2 + 1] & 0xFF)) << 8 | (long)(param1[param2 + 2] & 0xFF)) << 8 | (long)(param1[param2 + 3] & 0xFF));
    }

    public static int method_f_w(int[] param1, int param2, int param3, byte[] param4, int param5, int param6) {
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 1 << param6 - 1;
        int n9 = (1 << param6) - 1;
        while (n7 < param2) {
            n5 |= param4[param5++] << n6;
            n5 &= (1 << (n6 += 8)) - 1;
            while (n6 >= param6) {
                int n10 = n5 & n9;
                if ((n10 & n8) > 0) {
                    n10 |= ~n9;
                }
                if (n7 < param2) {
                    param1[n7++] = n10 + param3 << 16;
                }
                n6 -= param6;
                n5 >>>= param6;
            }
        }
        return param5;
    }

    public static int method_f_x(short[] param1, int integer2, int integer3, byte[] param4, int integer5, int integer6) {
        int integer7 = 0;
        int integer8 = 0;
        int integer9 = 0;
        int integer10 = 1 << integer6 - 1;
        int integer11 = (1 << integer6) - 1;
        while (integer9 < integer2) {
            int integer12;
            for (integer7 |= param4[integer5++] << integer8, integer8 += 8, integer7 &= (1 << integer8) - 1; integer8 >= integer6; integer8 -= integer6, integer7 >>>= integer6) {
                if (((integer12 = (integer7 & integer11)) & integer10) > 0) {
                    integer12 |= ~integer11;
                }
                if (integer9 < integer2) {
                    param1[integer9++] = (short)(integer12 + integer3);
                }
            }
        }
        return integer5;
    }

    public static final boolean method_f_y(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        long l2;
        long l3;
        long l4 = param7 - param5;
        long l5 = param8 - param6;
        long l6 = param3 - param1;
        long l7 = param4 - param2;
        long l8 = param1 + param3 - param5 - param7;
        long l9 = param2 + param4 - param6 - param8;
        if ((l8 > 0L ? l8 : -l8) > l4 + (l3 = l6 > 0L ? l6 : -l6)) {
            return false;
        }
        if ((l9 > 0L ? l9 : -l9) > l5 + (l2 = l7 > 0L ? l7 : -l7)) {
            return false;
        }
        long l10 = l8 * l7 - l9 * l6;
        return (l10 > 0L ? l10 : -l10) <= l4 * l2 + l5 * l3;
    }

    public static final boolean method_f_z(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param3 < param5 || param1 > param7) {
            return false;
        }
        return param4 >= param6 && param2 <= param8;
    }

    public static boolean method_f_aa(int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 < param3 || param1 > param5) {
            return false;
        }
        return param2 >= param4 && param2 <= param6;
    }

    public static void method_f_ab() {
        field_f_ak = 0;
        field_f_al = 0;
        class_f.method_f_ac(true);
    }

    public static void method_f_ac(boolean boolean1) {
        int integer2 = class_o.field_o_t;
        int integer3 = 0;
        int integer4 = 0;
        class_f.field_f_aj.method_f_f(class_f.field_f_a);
        if (integer2 != 0) {
            integer3 = (class_f.field_f_a.field_l_c - class_f.field_f_aj.field_f_b.field_l_c) / integer2;
            integer4 = (class_f.field_f_a.field_l_f - class_f.field_f_aj.field_f_b.field_l_f) / integer2;
        }
        integer3 <<= 7;
        integer4 = -integer4 << 7;
        int integer5 = class_f.field_f_a.field_l_c;
        int integer6 = class_f.field_f_a.field_l_f;
        int integer7 = -class_o.field_o_ab / 5 << 16;
        class_f.field_f_ag.method_l_f(class_l.field_l_i);
        class_l.field_l_i.method_l_b(0, integer7);
        integer7 = class_l.field_l_g;
        int integer8 = class_l.field_l_h;
        class_l.field_l_i.method_l_b(integer3, integer4);
        integer3 = integer5 + integer7 + integer3 + class_l.field_l_g;
        integer4 = integer6 + integer8 + integer4 + class_l.field_l_h;
        if (boolean1) {
            class_f.field_f_ae.field_l_c = integer3;
            class_f.field_f_ae.field_l_f = integer4;
            return;
        }
        int integer1 = integer3 - class_f.field_f_ae.field_l_c;
        integer3 = integer4 - class_f.field_f_ae.field_l_f;
        if (Math.abs(integer1) < 327680) {
            integer1 = 0;
        }
        if (Math.abs(integer3) < 327680) {
            integer3 = 0;
        }
        class_f.field_f_ad += integer2;
        while (class_f.field_f_ad >= 15) {
            class_l field_f_ae = class_f.field_f_ae;
            field_f_ae.field_l_c += class_f.field_f_ak * 15;
            class_l field_f_ae2 = class_f.field_f_ae;
            field_f_ae2.field_l_f += class_f.field_f_al * 15;
            class_f.field_f_ak += 15 * class_f.field_f_am * (integer1 >> 6) >> 14;
            class_f.field_f_al += 15 * class_f.field_f_am * (integer3 >> 6) >> 14;
            class_f.field_f_ak -= 15 * class_f.field_f_an * class_f.field_f_ak >> 14;
            class_f.field_f_al -= 15 * class_f.field_f_an * class_f.field_f_al >> 14;
            class_f.field_f_ad -= 15;
        }
    }

    public static void method_f_ad(class_f param1, Graphics param2, DirectGraphics param3) {
        class_f.field_f_ae.method_l_f(class_f.field_f_af);
        class_l.method_l_e(class_f.field_f_ag, class_f.field_f_af, class_f.field_f_ah);
        final class_l field_f_ah = class_f.field_f_ah;
        field_f_ah.field_l_c >>= 16;
        final class_l field_f_ah2 = class_f.field_f_ah;
        field_f_ah2.field_l_c <<= 16;
        final class_l field_f_ah3 = class_f.field_f_ah;
        field_f_ah3.field_l_f >>= 16;
        final class_l field_f_ah4 = class_f.field_f_ah;
        field_f_ah4.field_l_f <<= 16;
        class_f.field_f_ah.method_l_f(class_f.field_f_ai);
        param1 = param1;
        class_f.field_f_ai.method_l_a(0, 0);
        int param4 = class_l.field_l_g;
        int param5 = class_l.field_l_h;
        class_f.field_f_ai.method_l_a(class_o.field_o_aa << 16, class_o.field_o_ab << 16);
        int field_l_g = class_l.field_l_g;
        int field_l_h = class_l.field_l_h;
        if (param4 > field_l_g) {
            field_l_g = param4;
            param4 = class_l.field_l_g;
        }
        if (param5 > field_l_h) {
            field_l_h = param5;
            param5 = class_l.field_l_h;
        }
        class_f.field_f_ao = 0;
        class_f class_f = param1;
        while (class_f != null) {
            class_f.method_f_f(class_f.field_f_a);
            class_f.field_f_a.method_l_a(class_f.field_f_q, class_f.field_f_r);
            int param6 = class_l.field_l_g;
            int param7 = class_l.field_l_h;
            int param8 = class_l.field_l_g;
            int param9 = class_l.field_l_h;
            class_f.field_f_a.method_l_a(class_f.field_f_q, class_f.field_f_t);
            if (class_l.field_l_g < param6) {
                param6 = class_l.field_l_g;
            }
            if (class_l.field_l_h < param7) {
                param7 = class_l.field_l_h;
            }
            if (class_l.field_l_g > param8) {
                param8 = class_l.field_l_g;
            }
            if (class_l.field_l_h > param9) {
                param9 = class_l.field_l_h;
            }
            class_f.field_f_a.method_l_a(class_f.field_f_s, class_f.field_f_t);
            if (class_l.field_l_g < param6) {
                param6 = class_l.field_l_g;
            }
            if (class_l.field_l_h < param7) {
                param7 = class_l.field_l_h;
            }
            if (class_l.field_l_g > param8) {
                param8 = class_l.field_l_g;
            }
            if (class_l.field_l_h > param9) {
                param9 = class_l.field_l_h;
            }
            class_f.field_f_a.method_l_a(class_f.field_f_s, class_f.field_f_r);
            if (class_l.field_l_g < param6) {
                param6 = class_l.field_l_g;
            }
            if (class_l.field_l_h < param7) {
                param7 = class_l.field_l_h;
            }
            if (class_l.field_l_g > param8) {
                param8 = class_l.field_l_g;
            }
            if (class_l.field_l_h > param9) {
                param9 = class_l.field_l_h;
            }
            if (class_f.field_f_ab == 11 || method_f_z(param6, param7, param8, param9, param4, param5, field_l_g, field_l_h)) {
                if ((class_f.field_f_v & 0x80) > 0) {
                    class_f = class_f.method_f_i(param1);
                }
                else {
                    class_f.field_f_ap[class_f.field_f_ao] = class_f;
                    ++class_f.field_f_ao;
                    class_f = class_f.method_f_i(param1);
                }
            }
            else {
                class_f = class_f.method_f_j(param1);
            }
        }
        final class_f[] field_f_ap = class_f.field_f_ap;
        final int field_f_ao = class_f.field_f_ao;
        final class_f[] param10 = field_f_ap;
        if (field_f_ap != null && field_f_ao > 1) {
            if (field_f_ao == 2) {
                if (param10[0].field_f_u < param10[1].field_f_u) {
                    final class_f class_f2 = param10[0];
                    param10[0] = param10[1];
                    param10[1] = class_f2;
                }
            }
            else {
                method_f_ae(param10, 0, field_f_ao - 1);
            }
        }
        for (int i = 0; i < class_f.field_f_ao; ++i) {
            class_f.field_f_ap[i].method_c_o(param2, param3, class_f.field_f_ah);
        }
        class_f.field_f_ao = 0;
        for (int j = 0; j < class_f.field_f_ap.length; ++j) {
            class_f.field_f_ap[j] = null;
        }
    }

    private static final void method_f_ae(class_f[] param1, int param2, int param3) {
        while (param2 < param3) {
            class_f[] class_fVarArr = param1;
            int i = param2;
            class_f class_fVar = class_fVarArr[param3];
            int i2 = i - 1;
            while (i < param3) {
                if (class_fVar.field_f_u < class_fVarArr[i].field_f_u) {
                    i2++;
                    class_f class_fVar2 = class_fVarArr[i2];
                    class_fVarArr[i2] = class_fVarArr[i];
                    class_fVarArr[i] = class_fVar2;
                }
                i++;
            }
            class_fVarArr[param3] = class_fVarArr[i2 + 1];
            class_fVarArr[i2 + 1] = class_fVar;
            int i3 = i2 + 1;
            method_f_ae(param1, param2, i3 - 1);
            param2 = i3 + 1;
            param1 = param1;
        }
    }

    static {
        field_f_ad = 0;
        field_f_ae = new class_l();
        field_f_af = new class_l();
        field_f_ag = new class_l();
        field_f_ah = new class_l();
        field_f_ai = new class_l();
        class_f.field_f_ag.field_l_a = 43266;
        class_f.field_f_ag.field_l_e = -43266;
        if (class_o.field_o_aa < 200) {
            class_f.field_f_ag.field_l_a = 22306;
            class_f.field_f_ag.field_l_e = -22306;
        }
        field_f_ao = 0;
        field_f_ap = new class_f[60];
        field_f_aq = new class_f();
    }
}