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

public final class class_q {
    public static final int field_q_a;
    private int field_q_b;
    private int field_q_c;
    private int field_q_d;
    private int field_q_e;
    private int field_q_f = 0;
    private int field_q_g;
    public int field_q_h;
    public int field_q_i;
    private int field_q_j;
    String field_q_k;
    private String[] field_q_l;
    private int field_q_m;
    private int field_q_n;
    private boolean field_q_o;

    public class_q(String param1, int param2, int param3, int param4, int param5) {
        this.field_q_c = param4;
        this.field_q_k = param1;
        this.field_q_d = param3;
        switch (this.field_q_c & 3) {
            case 2: {
                this.field_q_e = 3;
                break;
            }
            case 1: {
                this.field_q_e = 2;
                break;
            }
            default: {
                this.field_q_e = 1;
            }
        }
        if (param5 >= 0) {
            this.field_q_b = param5;
            this.field_q_n = class_o.method_o_bb(param5, 0) + field_q_a;
            this.field_q_m = class_o.method_o_bb(param5, 1);
        } else {
            this.field_q_b = -1;
            this.field_q_n = 0;
            this.field_q_m = 0;
        }
        this.field_q_o = param2 > this.field_q_n && (this.field_q_c & 0x80) == 128 && (this.field_q_c & 0x30) != 32;
        param3 = 0;
        if ((this.field_q_c & 0x100) == 256) {
            param3 = 1;
        }
        this.field_q_k = param1 != null ? param1 : "";
        this.field_q_l = class_o.method_o_o(this.field_q_k, param2, this.field_q_d, this.field_q_o, this.field_q_n, this.field_q_m, param3 != 0);
        this.method_q_a(this.field_q_l[0]);
    }

    private void method_q_a(String param1) {
        int[] nArray = new int[4];
        if (param1 != null) {
            int n = 0;
            for (int i = 0; i < param1.length(); ++i) {
                if (param1.charAt(i) != ' ') continue;
                nArray[n] = i;
                ++n;
            }
            try {
                this.field_q_j = Integer.valueOf(param1.substring(0, nArray[0]));
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            try {
                this.field_q_f = Integer.valueOf(param1.substring(nArray[0] + 1, nArray[1]));
            } catch (Exception exception) {
                exception.printStackTrace();
                this.field_q_f = 0;
            }
            try {
                this.field_q_g = Integer.valueOf(param1.substring(nArray[1] + 1, nArray[2]));
            } catch (Exception exception) {
                exception.printStackTrace();
                this.field_q_g = 0;
            }
            try {
                this.field_q_h = Integer.valueOf(param1.substring(nArray[2] + 1, nArray[3]));
            } catch (Exception exception) {
                exception.printStackTrace();
                this.field_q_h = 0;
            }
            try {
                this.field_q_i = Integer.valueOf(param1.substring(nArray[3] + 1, param1.length()));
                return;
            } catch (NumberFormatException numberFormatException) {
                numberFormatException.printStackTrace();
                this.field_q_i = 0;
                return;
            }
        }
        this.field_q_j = 0;
        this.field_q_f = 0;
        this.field_q_g = 0;
        this.field_q_h = 0;
        this.field_q_i = 0;
    }

    public final void method_q_b(int param1, int param2, int param3, int param4) {
        int n5;
        int n6 = this.field_q_j;
        int n7 = param4;
        param4 = param3;
        param3 = param2;
        param2 = param1;
        class_q q2 = this;
        class_o.method_o_ab(q2.field_q_d, q2.field_q_e);
        class_o.method_o_ad(0, param4);
        class_o.method_o_ad(1, n7);
        if (n6 > q2.field_q_j) {
            n6 = q2.field_q_j;
        }
        if ((q2.field_q_c & 0x30) == 32) {
            param4 = q2.field_q_h / 2;
            n7 = 17;
        } else {
            n5 = (q2.field_q_c & 0xC) == 8 ? (q2.field_q_h - q2.field_q_g) / 2 : 0;
            if ((q2.field_q_c & 0x30) == 0) {
                param4 = n5;
                n7 = 20;
            } else {
                param4 = q2.field_q_h - n5;
                n7 = 24;
            }
        }
        n5 = (q2.field_q_c & 0x30) == 0 ? 1 : 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        switch (q2.field_q_c & 0xC) {
            case 0: {
                n9 = 20;
                n11 = 0;
                n8 = 20;
                if (n5 != 0) {
                    n10 = q2.field_q_n;
                    break;
                }
                n10 = 0;
                break;
            }
            case 4: {
                n9 = 24;
                n11 = q2.field_q_h;
                n8 = 24;
                if (n5 != 0) {
                    n10 = q2.field_q_h;
                    break;
                }
                n10 = q2.field_q_h - q2.field_q_n;
                break;
            }
            case 8: {
                n9 = 17;
                n11 = q2.field_q_h / 2;
                if (n5 != 0) {
                    n8 = 20;
                    n10 = (q2.field_q_h - q2.field_q_g) / 2 + q2.field_q_n;
                    break;
                }
                n8 = 24;
                n10 = q2.field_q_h - (q2.field_q_h - q2.field_q_g) / 2 - q2.field_q_n;
            }
        }
        if (q2.field_q_b >= 0) {
            class_o.method_o_az(param2 + param4, param3, q2.field_q_b, n7);
        }
        if (!q2.field_q_o) {
            param3 += q2.field_q_m;
        }
        param4 = 0 * class_o.method_o_aa(q2.field_q_d);
        for (n7 = 0; n7 < n6; ++n7) {
            if (q2.field_q_l[n7 + 1] == null) continue;
            if (n7 < q2.field_q_f) {
                class_o.method_o_ae(q2.field_q_l[n7 + 1], q2.field_q_l[n7 + 1].length(), param2 + n10, param3 + param4, n8);
            } else {
                class_o.method_o_ae(q2.field_q_l[n7 + 1], q2.field_q_l[n7 + 1].length(), param2 + n11, param3 + param4, n9);
            }
            param4 += class_o.method_o_aa(q2.field_q_d);
        }
    }

    static {
        char[] cArray = new char[]{'\n', ' ', '-'};
        field_q_a = class_o.field_o_aa >>> 5;
    }
}