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

import javax.microedition.lcdui.Graphics;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

public final class class_s {
    private Vector<class_r> field_s_a;
    private int field_s_b;
    private int field_s_c;
    public int field_s_d;
    public int[] field_s_e;
    public int[] field_s_f;
    private class_q field_s_g;
    private int field_s_h;
    private int field_s_i;
    private int field_s_k;
    private int field_s_l;
    private int[] field_s_m;
    private String[] field_s_n;
    private int[] field_s_o;
    private static final int[] field_s_p;
    private static final int[] field_s_q;
    private static int[] field_s_r;
    private static final int[] field_s_s;
    private static int[] field_s_t;

    public class_s() {
        this.field_s_a = new Vector();
        this.field_s_b = -1;
        this.field_s_c = 0;
        this.field_s_d = 0;
        this.field_s_e = null;
        this.field_s_f = null;
        this.field_s_g = null;
        this.field_s_h = -1;
        this.field_s_i = 0;
        this.field_s_k = 0;
        this.field_s_l = 1;
        this.field_s_m = new int[3];
        this.field_s_n = new String[3];
        this.field_s_o = new int[3];
    }

    public final void method_s_a(class_r param1) {
        int integer4 = this.field_s_a.size();
        this.field_s_a.insertElementAt(param1, integer4);
        param1.field_r_a = this;
        if (this.field_s_b == -1 && this.method_s_c(integer4)) {
            this.method_s_e(integer4);
        }
    }

    public final void method_s_b() {
        this.field_s_a.removeAllElements();
        this.field_s_c = 0;
        this.field_s_b = -1;
    }

    private boolean method_s_c(int param1) {
        class_r class_r3 = this.field_s_a.elementAt(param1);
        return (param1 = this.method_s_l(param1)) >= this.field_s_c && param1 + class_r3.method_r_b() <= this.field_s_c + this.method_s_q();
    }

    public final int method_s_d() {
        return this.field_s_b;
    }

    public final void method_s_e(int param1) {
        if (param1 >= this.field_s_a.size()) {
            param1 = this.field_s_a.size() - 1;
        }
        if (param1 == this.field_s_b) {
            return;
        }
        if (param1 == -1 || ((class_r) this.field_s_a.elementAt(param1)).method_r_c()) {
            int i = this.field_s_b;
            this.field_s_b = param1;
            if (i != -1) {
                this.field_s_a.elementAt(i);
            }
            if (param1 != -1) {
                this.field_s_a.elementAt(param1);
            }
            if (this.field_s_b != -1) {
                int method_s_l = method_s_l(this.field_s_b);
                int method_r_b = method_s_l + ((class_r) this.field_s_a.elementAt(this.field_s_b)).method_r_b();
                int method_s_q = method_s_q();
                if (method_s_l < this.field_s_c) {
                    this.field_s_c = method_s_l;
                } else if (method_r_b > this.field_s_c + method_s_q) {
                    this.field_s_c = method_r_b - method_s_q;
                }
            }
        }
    }

    private class_r method_s_f() {
        class_r class_r2;
        if ((class_r2 = ((this.field_s_b != -1) ? this.field_s_a.elementAt(this.field_s_b) : null)) != null && class_r2.field_r_b) {
            return class_r2;
        }
        return null;
    }

    public final void method_s_g(String param1) {
        int integer3 = this.method_s_w(0) | 0x100;
        this.field_s_g = ((param1 != null && param1.length() > 0) ? new class_q(param1, Integer.MAX_VALUE, this.method_s_w(13), integer3, -1) : null);
        this.field_s_h = -1;
        this.field_s_k = 0;
    }

    public final void method_s_h(int param1, String param2, int param3) {
        this.field_s_m[param1] = (0x110000 | ((short)param3 & 0xFFFF));
        this.field_s_n[param1] = param2;
        this.field_s_o[param1] = 0;
    }

    public final void method_s_i(String param1) {
        if ((this.field_s_m[0] & 0x10000) == 0x10000) {
            this.field_s_n[0] = param1;
            this.field_s_o[0] = 0;
        }
    }

    public final void method_s_j(int param1) {
        this.field_s_m[param1] = 0;
        this.field_s_n[param1] = null;
        this.field_s_o[param1] = 0;
    }

    public final void method_s_k() {
        for (int i = 0; i < 3; ++i) {
            boolean integer3 = (short)this.field_s_m[i] == -2;
            class_r class_r4 = this.method_s_f();
            if ((this.field_s_m[i] & 0x10000) == 0x0 || (this.field_s_m[i] & 0x100000) == 0x0 || (integer3 && class_r4 == null)) {
                class_o.method_o_g(i, null, 0);
            }
            else {
                class_o.method_o_g(i, this.field_s_n[i], this.field_s_o[i]);
            }
        }
    }

    private int method_s_l(int paramInt) {
        int i = 0;
        for (byte b = 0; b < paramInt; b++)
            i += ((class_r)this.field_s_a.elementAt(b)).method_r_b() + method_s_w(19);
        return i;
    }

    private static int method_s_m(class_r param1, int param2) {
        int integer3;
        if ((integer3 = param1.method_r_e(6)) == 512) {
            return param2 - param1.method_r_a();
        }
        if (integer3 == 1024) {
            return param2 - param1.method_r_a() >> 1;
        }
        return 0;
    }

    private int method_s_n() {
        int integer2;
        if ((integer2 = this.method_s_w(11)) > 0) {
            return integer2;
        }
        return class_o.method_o_q() - (class_o.method_o_m() ? class_o.method_o_k() : 0);
    }

    public final int method_s_o() {
        return this.method_s_n() - this.method_s_w(15) - this.method_s_w(16);
    }

    private int method_s_p() {
        if (this.field_s_a.size() > 0) {
            return this.method_s_l(this.field_s_a.size() - 1) + this.field_s_a.lastElement().method_r_b();
        }
        return 0;
    }

    private int method_s_q() {
        int integer2 = this.method_s_r(5);
        if (this.method_s_p() > integer2) {
            return integer2 - this.method_s_r(6) - this.method_s_r(7);
        }
        return integer2;
    }

    private int method_s_r(int param1) {
        switch (param1) {
            case 1: {
                int integer3 = class_o.field_o_ab - (class_o.method_o_n() ? class_o.method_o_j() : 0);
                if (this.method_s_w(3) == 32) {
                    return Math.min(this.method_s_r(2) + this.method_s_p() + this.method_s_w(17) + this.method_s_w(18), integer3);
                }
                if ((param1 = this.method_s_w(12)) > 0) {
                    return param1;
                }
                return integer3;
            }
            case 5: {
                return this.method_s_r(4) - this.method_s_w(17) - this.method_s_w(18);
            }
            case 2: {
                return Math.max((this.field_s_g != null) ? this.field_s_g.field_q_i : 0, (this.field_s_h != -1) ? class_o.method_o_bb(this.field_s_h, 1) : 0) + this.method_s_w(6) + this.method_s_w(7);
            }
            case 4: {
                return this.method_s_r(1) - this.method_s_r(2);
            }
            case 6: {
                return 1 + class_o.method_o_bb(151, 1);
            }
            case 7: {
                return 1 + class_o.method_o_bb(150, 1);
            }
            default: {
                return 0;
            }
        }
    }

    public final void method_s_s(int integer) {
        class_r class_r3 = this.method_s_f();
        switch (integer) {
            case 7: {
                integer = 0;
                break;
            }
            case 5: {
                integer = 1;
                break;
            }
            case 6:
            case 24: {
                integer = 2;
                break;
            }
            case 1: {
                if (this.field_s_a.size() != 0) {
                    int integer3 = 0;
                    Label_0278: {
                        if (this.field_s_b != -1) {
                            int integer8 = this.field_s_b;
                            int integer5 = integer8 - 1;
                            //while (true) {
                                while (integer5 >= 0) {
                                    if (((class_r)this.field_s_a.elementAt(integer5)).method_r_c()) {
                                        int n3;
                                        int n2 = n3 = integer5;
                                        integer3 = n3;
                                        if (n2 != -1) {
                                            if (this.method_s_l(integer3) + ((class_r)this.field_s_a.elementAt(integer3)).method_r_b() < this.field_s_c - this.method_s_w(14)) {
                                                integer3 = -1;
                                            }
                                        }
                                        break Label_0278;
                                    }
                                    else {
                                        --integer5;
                                    }
                                }
                                int n3;
                                int n2 = n3 = -1;
                            //    continue;
                            //}
                        }
                        integer3 = -1;
                        for (int integer4 = 0; integer4 < this.field_s_a.size(); ++integer4) {
                            class_r class_r5 = this.field_s_a.elementAt(integer4);
                            int integer6;
                            int integer7 = (integer6 = this.method_s_l(integer4)) + class_r5.method_r_b();
                            if (integer6 >= this.field_s_c) {
                                break;
                            }
                            if (class_r5.method_r_c() && integer7 > this.field_s_c - this.method_s_w(14)) {
                                integer3 = integer4;
                            }
                        }
                    }
                    if (integer3 == -1) {
                        if (this.method_s_w(5) == 128 && this.field_s_c <= 0) {
                            int integer8 = this.method_s_p();
                            int integer5 = this.method_s_q();
                            this.field_s_c = integer8 - integer5;
                            if (integer8 < this.method_s_r(5)) {
                                this.field_s_c = 0;
                            }
                            for (int integer6 = this.field_s_a.size() - 1; integer6 > 0; --integer6) {
                                if (!this.method_s_c(integer6)) {
                                    this.method_s_e(-1);
                                    return;
                                }
                                if (((class_r)this.field_s_a.elementAt(integer6)).method_r_c()) {
                                    this.method_s_e(integer6);
                                    return;
                                }
                            }
                            return;
                        }
                        this.field_s_c -= this.method_s_w(14);
                        if (this.field_s_c < 0) {
                            this.field_s_c = 0;
                        }
                        if (this.field_s_b != -1 && !this.method_s_c(this.field_s_b)) {
                            this.method_s_e(-1);
                        }
                    }
                    else {
                        this.method_s_e(integer3);
                    }
                }
                return;
            }
            case 2: {
                if (this.field_s_a.size() != 0) {
                    int integer3 = this.method_s_p();
                    int integer4 = this.method_s_q();
                    int integer5 = 0;
                    Label_0677: {
                        if (this.field_s_b != -1) {
                            int integer6 = this.field_s_b;
                            int integer7 = integer6 + 1;
                            //while (true) {
                                while (integer7 < this.field_s_a.size()) {
                                    if (((class_r)this.field_s_a.elementAt(integer7)).method_r_c()) {
                                        int n5;
                                        int n4 = n5 = integer7;
                                        integer5 = n5;
                                        if (n4 != -1) {
                                            if (this.method_s_l(integer5) > this.field_s_c + integer4 + this.method_s_w(14)) {
                                                integer5 = -1;
                                            }
                                        }
                                        break Label_0677;
                                    }
                                    else {
                                        ++integer7;
                                    }
                                }
                                int n5;
                                int n4 = n5 = -1;
                            //    continue;
                            //}
                        }
                        integer5 = -1;
                        for (int integer6 = this.field_s_a.size() - 1; integer6 >= 0; --integer6) {
                            class_r class_r7 = this.field_s_a.elementAt(integer6);
                            //int integer8;
                            //if ((integer8 = this.method_s_l(integer6) + class_r7.method_r_b()) < this.field_s_c + integer4) {
                            //    break;
                            //}
                            int integer8 = this.method_s_l(integer6) + class_r7.method_r_b();
                            if (class_r7.method_r_c() && integer8 <= this.field_s_c + integer4 + this.method_s_w(14)) {
                                integer5 = integer6;
                            }
                        }
                    }
                    if (integer5 == -1) {
                        if (this.method_s_w(5) == 128 && this.field_s_c >= integer3 - integer4) {
                            this.field_s_c = 0;
                            for (int integer6 = 0; integer6 < this.field_s_a.size() - 1; ++integer6) {
                                class_r class_r7 = this.field_s_a.elementAt(integer6);
                                if (!this.method_s_c(integer6)) {
                                    this.method_s_e(-1);
                                    return;
                                }
                                if (class_r7.method_r_c()) {
                                    this.method_s_e(integer6);
                                    return;
                                }
                            }
                            return;
                        }
                        this.field_s_c += this.method_s_w(14);
                        if (integer3 <= integer4) {
                            this.field_s_c = 0;
                        }
                        else if (this.field_s_c > integer3 - integer4) {
                            this.field_s_c = integer3 - integer4;
                        }
                        if (this.field_s_b != -1 && !this.method_s_c(this.field_s_b)) {
                            this.method_s_e(-1);
                        }
                    }
                    else {
                        this.method_s_e(integer5);
                    }
                }
                return;
            }
            default: {
                return;
            }
        }
        if ((this.field_s_m[integer] & 0x10000) != 0x0) {
            if ((integer = (short)this.field_s_m[integer]) == -2) {
                if (class_r3 != null) {
                    class_o.field_o_h.method_b_ag(class_r3.field_r_c);
                }
            }
            else {
                class_o.field_o_h.method_b_ag(integer);
            }
        }
    }

    public final void method_s_t() {
        if (this.field_s_g != null) {
            int integer2 = (this.field_s_h != -1) ? class_o.method_o_bb(this.field_s_h, 0) : 0;
            int integer3 = this.method_s_n() - (this.method_s_w(8) << 1);
            if (this.method_s_w(1) != 8) {
                integer2 = integer3 - integer2;
            }
            else {
                integer2 = integer3;
            }
            if (integer2 < this.field_s_g.field_q_h) {
                if (this.field_s_i >= 3000) {
                    if (this.field_s_l > 0) {
                        this.field_s_k = (this.field_s_i - 3000) * 20 / 1000;
                        if (this.field_s_k > this.field_s_g.field_q_h - integer2) {
                            this.field_s_k = this.field_s_g.field_q_h - integer2;
                            this.field_s_i = 0;
                            this.field_s_l = -1;
                        }
                    }
                    else {
                        this.field_s_k = this.field_s_g.field_q_h - integer2 - (this.field_s_i - 3000) * 20 / 1000;
                        if (this.field_s_k <= 0) {
                            this.field_s_k = 0;
                            this.field_s_i = 0;
                            this.field_s_l = 1;
                        }
                    }
                }
                this.field_s_i += class_o.field_o_t;
            }
        }
    }

    public final void method_s_u() {
        Graphics graphics2 = class_o.method_o_w();
        int integer3 = this.method_s_r(2);
        int integer4 = (this.method_s_w(4) == 64) ? ((class_o.field_o_aa - this.method_s_n() >> 1) + ((class_o.method_o_i() == 3) ? class_o.method_o_k() : 0)) : (this.method_s_w(9) + ((class_o.method_o_i() == 3) ? class_o.method_o_k() : 0));
        int integer5 = (this.method_s_w(4) == 64) ? (class_o.field_o_ab - (class_o.method_o_n() ? class_o.method_o_j() : 0) - this.method_s_r(1) >> 1) : (this.method_s_w(10) + ((class_o.method_o_i() == 1) ? class_o.method_o_j() : 0));
        int integer6 = this.method_s_n();
        int integer7 = this.method_s_r(1);
        if (class_b.method_b_o(this, 1, integer4, integer5, integer6, integer7)) {
            graphics2.setColor(this.method_s_w(22));
            graphics2.fillRect(integer4, integer5, integer6, integer7);
            graphics2.setColor(this.method_s_w(23));
            graphics2.drawRect(integer4, integer5, integer6 - 1, integer7 - 1);
        }
        if (integer3 > 0) {
            graphics2.setClip(integer4, integer5, integer6, integer3);
            if (class_b.method_b_o(this, 2, integer4, integer5, integer6, integer3)) {
                graphics2.setColor(this.method_s_w(20));
                graphics2.fillRect(integer4, integer5, integer6, integer3);
            }
            graphics2.setClip(integer4, integer5, integer6, integer3);
            if (class_b.method_b_o(this, 3, integer4, integer5, integer6, integer3)) {
                graphics2.setClip(integer4, integer5, integer6, integer3);
                int integer8 = this.method_s_w(8);
                int integer9 = (this.field_s_h != -1) ? class_o.method_o_bb(this.field_s_h, 0) : 0;
                int integer10 = (this.field_s_g != null) ? this.field_s_g.field_q_h : 0;
                int integer11 = integer6 - (integer8 << 1);
                int integer12;
                if (this.method_s_w(1) != 8) {
                    integer12 = integer11 - integer9;
                }
                else {
                    integer12 = integer11;
                }
                if (this.field_s_h != -1) {
                    int integer13 = integer8;
                    switch (this.method_s_w(1)) {
                        case 8: {
                            integer13 = integer8 + (integer11 - integer9 >> 1);
                            break;
                        }
                        case 4: {
                            integer13 = integer8 + (integer11 - integer9);
                            break;
                        }
                    }
                    class_o.method_o_az(integer4 + integer13, integer5 + this.method_s_w(6), this.field_s_h, 20);
                }
                if (this.field_s_g != null) {
                    int integer13 = integer8;
                    switch (this.method_s_w(1)) {
                        case 8: {
                            integer13 = integer8 + (Math.max(integer11 - integer10, 0) >> 1);
                            break;
                        }
                        case 4: {
                            integer13 = integer8 + Math.max(integer12 - integer10, 0);
                            break;
                        }
                        case 0: {
                            integer13 = integer8 + integer9;
                            break;
                        }
                    }
                    int integer14 = 0;
                    if (integer6 < class_o.field_o_aa) {
                        integer14 = class_o.field_o_aa - integer6 - (class_o.method_o_m() ? class_o.method_o_k() : 0) >> 1;
                    }
                    graphics2.setClip(integer13 - 1 + integer14, integer5 - 1, integer12 + 2, integer3 + 2);
                    this.field_s_g.method_q_b(integer4 + integer13 - this.field_s_k, integer5 + this.method_s_w(6), this.method_s_w(24), this.method_s_w(25));
                }
            }
        }
        if (this.method_s_w(2) == 16) {
            int integer8 = class_o.method_o_j();
            int integer9 = class_o.method_o_k();
            graphics2.setClip(0, 0, class_o.field_o_aa, class_o.field_o_ab);
            graphics2.setColor(this.method_s_w(21));
            switch (class_o.method_o_i()) {
                case 2: {
                    graphics2.fillRect(0, class_o.field_o_ab - integer8, class_o.field_o_aa, integer8);
                    break;
                }
                case 1: {
                    graphics2.fillRect(0, 0, class_o.field_o_aa, integer8);
                    break;
                }
                case 3: {
                    graphics2.fillRect(0, 0, integer9, class_o.field_o_ab);
                    break;
                }
                case 4: {
                    graphics2.fillRect(class_o.field_o_aa - integer9, 0, class_o.field_o_aa, class_o.field_o_ab);
                    break;
                }
            }
        }
        graphics2.setClip(integer4, integer5 + integer3, integer6, integer7 - integer3);
        class_b.method_b_o(this, 4, integer4, integer5 + integer3, integer6, integer7 - integer3);
        int integer8 = integer4 + this.method_s_w(15);
        int integer9 = integer5 + integer3 + this.method_s_w(17);
        int integer10 = this.method_s_o();
        int integer11 = this.method_s_q();
        int integer12 = this.method_s_p();
        int integer13 = this.method_s_r(5);
        graphics2.setClip(integer8, integer9, integer10, integer13);
        class_b.method_b_o(this, 5, integer8, integer9, integer10, integer13);
        graphics2.setClip(integer8, integer9, integer10, integer13);
        if (this.field_s_c > 0) {
            graphics2.setClip(integer8, integer9, integer10, this.method_s_r(6));
            if (class_b.method_b_o(this, 6, integer8, integer9, integer10, this.method_s_r(6))) {
                class_o.method_o_ay(integer8 + class_o.method_o_bb(151, 2) + (integer10 - class_o.method_o_bb(151, 0) >> 1), integer9 + class_o.method_o_bb(151, 3), 151);
            }
        }
        if (integer11 < integer12) {
            integer9 += this.method_s_r(6);
        }
        if (this.field_s_c < integer12 - integer11) {
            graphics2.setClip(integer8, integer9 + integer11, integer10, this.method_s_r(7));
            if (class_b.method_b_o(this, 7, integer8, integer9 + integer11, integer10, this.method_s_r(7))) {
                class_o.method_o_ay(integer8 + class_o.method_o_bb(150, 2) + (integer10 - class_o.method_o_bb(150, 0) >> 1), integer9 + integer11 + 1 + class_o.method_o_bb(150, 3), 150);
            }
        }
        if ((integer7 = this.field_s_b) != -1 && ((class_r)this.field_s_a.elementAt(integer7)).method_r_e(7) == 2048) {
            class_r class_r6 = this.field_s_a.elementAt(integer7);
            int integer14 = integer8 + method_s_m(class_r6, integer10);
            integer3 = integer9 + this.method_s_l(integer7) - this.field_s_c;
            integer4 = class_r6.method_r_a();
            integer5 = class_r6.method_r_b();
            graphics2.setClip(integer14, integer3, integer4, integer5);
            if (class_b.method_b_o(this, 9, integer14, integer3, integer4, integer5)) {
                graphics2.setColor(class_r6.method_r_e(21));
                graphics2.fillRect(integer14, integer3, integer4, integer5);
                graphics2.setColor(class_r6.method_r_e(22));
                graphics2.drawRect(integer14, integer3, integer4 - 1, integer5 - 1);
            }
        }
        for (integer12 = 0; integer12 < this.field_s_a.size(); ++integer12) {
            class_r class_r6 = this.field_s_a.elementAt(integer12);
            if ((integer3 = this.method_s_l(integer12)) > this.field_s_c + integer11) {
                break;
            }
            integer5 = class_r6.method_r_b();
            if (integer3 + integer5 >= this.field_s_c) {
                int integer14 = integer8 + method_s_m(class_r6, integer10);
                integer3 = integer9 + integer3 - this.field_s_c;
                integer4 = class_r6.method_r_a();
                graphics2.setClip(integer8, integer9, integer10, integer11);
                class_o.method_o_y(integer14, integer3, integer4, integer5, class_s.field_s_p);
                if (class_b.method_b_o(this, 8, integer14, integer3, integer4, integer5)) {
                    class_r class_r = class_r6;
                    int n4 = integer14;
                    int n5 = integer3;
                    boolean boolean6 = integer12 == this.field_s_b;
                    integer4 = n5;
                    integer3 = n4;
                    class_r class_r5 = class_r;
                    class_q class_q13;
                    if ((class_q13 = class_r.field_r_d) != null) {
                        class_q13.method_q_b(integer3 + class_r5.method_r_e(13), integer4 + class_r5.method_r_e(11), class_r5.method_r_e(class_r5.field_r_b ? (boolean6 ? 18 : 15) : (boolean6 ? 20 : 19)), class_r5.method_r_e(16));
                    }
                }
            }
        }
        if (integer7 != -1 && ((class_r)this.field_s_a.elementAt(integer7)).method_r_e(7) == 2048) {
            class_r class_r6 = this.field_s_a.elementAt(integer7);
            int integer14 = integer8 + method_s_m(class_r6, integer10);
            integer3 = integer9 + this.method_s_l(integer7) - this.field_s_c;
            integer4 = class_r6.method_r_a();
            integer5 = class_r6.method_r_b();
            graphics2.setClip(integer14, integer3, integer4, integer5);
            class_b.method_b_o(this, 10, integer14, integer3, integer4, integer5);
        }
    }

    public final void method_s_v(int param1) {
        byte[] buf;
        if ((buf = (byte[])class_o.method_o_ah(param1)) == null) {
            return;
        }
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(buf));
            this.field_s_e = method_s_z(dataInputStream2, class_s.field_s_q, 15, 22);
            this.field_s_f = method_s_z(dataInputStream2, class_s.field_s_s, 20, 26);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private int method_s_w(int param1) {
        return method_s_aa(param1, this.field_s_f, 2);
    }

    public final void method_s_x(int param1, int param2) {
        this.field_s_e = method_s_ac(param1, param2, this.field_s_e, 1);
    }

    public final void method_s_y(int param1, int param2) {
        this.field_s_f = method_s_ac(param1, param2, this.field_s_f, 2);
    }

    private static int[] method_s_z(DataInputStream param1, int[] param2, int param3, int param4) {
        try {
            int integer5 = param1.readInt();
            int integer2 = param2.length;
            if (integer5 == 0) {
                return null;
            }
            int integer6 = 0;
            for (int n2 = integer2; integer5 >>> n2 - 1 != 0; ++n2) {
                integer6 = n2 - integer2;
            }
            int[] array;
            (array = new int[integer6 + 2])[0] = integer5;
            array[1] = 0;
            if ((integer5 & -1 >>> 32 - integer2) != 0x0) {
                array[1] = param1.readInt();
            }
            for (integer5 = 0; integer5 < integer6; ++integer5) {
                if ((array[0] & 1 << integer5 + integer2) != 0x0) {
                    array[integer5 + 2] = param1.readShort();
                }
            }
            for (integer5 = param3 + 2 - integer2; integer5 <= param4 + 2 - integer2 && integer5 < array.length; ++integer5) {
                array[integer5] = (0x0 | (array[integer5] & 0x7C00) << 9 | (array[integer5] & 0x3E0) << 6 | (array[integer5] & 0x1F) << 3);
            }
            return array;
        }
        catch (Exception e) {
            // TODO: remove try
            e.printStackTrace();
            return null;
        }
    }

    public static int method_s_aa(int param1, int[] param2, int param3) {
        int[] array;
        int[] array2;
        if (param3 == 1) {
            array = class_s.field_s_r;
            array2 = class_s.field_s_q;
        }
        else {
            array = class_s.field_s_t;
            array2 = class_s.field_s_s;
        }
        int integer5 = array2.length;
        if (!method_s_ab(param1, param2)) {
            param2 = array;
        }
        if (param1 < integer5) {
            return param2[1] & array2[param1];
        }
        return param2[param1 + 2 - integer5];
    }

    public static boolean method_s_ab(int param1, int[] param2) {
        return param2 != null && (param2[0] & 1 << param1) != 0x0;
    }

    public static int[] method_s_ac(int param1, int param2, int[] param3, int param4) {
        int[] array;
        if (param4 == 1) {
            param4 = 16;
            array = class_s.field_s_q;
        }
        else {
            param4 = 23;
            array = class_s.field_s_s;
        }
        if (param3 == null) {
            param3 = new int[param4];
        }
        else if (param3.length < param4) {
            int[] array2 = new int[param4];
            System.arraycopy(param3, 0, array2, 0, param3.length);
            param3 = array2;
        }
        int[] array3 = param3;
        int n = 0;
        array3[n] |= 1 << param1;
        if (param1 < array.length) {
            int[] array4 = param3;
            int n2 = 1;
            array4[n2] &= ~array[param1];
            int[] array5 = param3;
            int n3 = 1;
            array5[n3] |= (param2 & array[param1]);
        }
        else {
            param3[param1 + 2 - array.length] = param2;
        }
        return param3;
    }

    static {
        field_s_p = new int[4];
        field_s_q = new int[] { 3, 12, 48, 64, 128, 256, 1536, 2048, 4096 };
        class_s.field_s_r = new int[] { -1, 7304, -1, -1, 1, 1, 1, 1, 16777215, 0, 0, 6710886, 0, 0, 6710886, 11171584 };
        field_s_s = new int[] { 3, 12, 16, 32, 64, 128 };
        class_s.field_s_t = new int[] { -1, 8, 2, 2, 2, 0, 0, -1, -1, -1, 20, 12, 12, 2, 6, 1, 4456448, 6170113, 68, 10526880, 0, 10027008, 0 };
    }
}