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

public final class class_r {
    public class_s field_r_a;
    public boolean field_r_b;
    public int field_r_c;
    public class_q field_r_d;
    private int[] field_r_e;

    public class_r() {
        this.field_r_a = null;
        this.field_r_b = true;
        this.field_r_c = -1;
    }

    public class_r(String param1, int param2, class_s param3, int param4) {
        this.field_r_a = null;
        this.field_r_b = true;
        this.field_r_c = -1;
        this.field_r_a = param3;
        this.field_r_c = param4;
        method_r_f(param1, param2);
    }

    public final int method_r_a() {
        if (method_r_e(5) != 256) {
            if (method_r_e(8) == 4096) {
                if (this.field_r_a != null) {
                    return this.field_r_a.method_s_o();
                }
                return 0;
            }
            return method_r_e(10);
        }
        class_q class_qVar = this.field_r_d;
        if (class_qVar != null) {
            return (class_qVar.field_q_k == null || class_qVar.field_q_k.length() <= 0) ? (class_qVar.field_q_h - class_q.field_q_a) + method_r_e(13) + method_r_e(14) : class_qVar.field_q_h + method_r_e(13) + method_r_e(14);
        } else if (this.field_r_a != null) {
            return this.field_r_a.method_s_o();
        } else {
            return 0;
        }
    }

    public final int method_r_b() {
        class_q class_qVar = this.field_r_d;
        return (class_qVar != null ? class_qVar.field_q_i : 0) + method_r_e(11) + method_r_e(12);
    }

    public final boolean method_r_c() {
        return this.field_r_c != -1;
    }

    public final void method_r_d(int param1, int param2) {
        this.field_r_e = class_s.method_s_ac(param1, param2, this.field_r_e, 1);
    }

    public final int method_r_e(int param1) {
        return (class_s.method_s_ab(param1, this.field_r_e) || this.field_r_a == null) ? class_s.method_s_aa(param1, this.field_r_e, 1) : class_s.method_s_aa(param1, this.field_r_a.field_s_e, 1);
    }

    public final void method_r_f(String param1, int param2) {
        if (param1 == null) {
            param1 = "";
        }
        class_q class_qVar = this.field_r_d;
        this.field_r_d = null;
        int method_r_a = method_r_a();
        this.field_r_d = class_qVar;
        int method_r_e = method_r_a - (method_r_e(13) + method_r_e(14));
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            i |= method_r_e(i2);
        }
        this.field_r_d = new class_q(param1, method_r_e, method_r_e(9), i, param2);
    }
}