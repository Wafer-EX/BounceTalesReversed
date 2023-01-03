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

public final class class_l {
    public int field_l_a = 65536;
    public int field_l_b;
    public int field_l_c;
    public int field_l_d;
    public int field_l_e = 65536;
    public int field_l_f;
    public static int field_l_g;
    public static int field_l_h;
    public static class_l field_l_i;

    public final void method_l_a(int param1, int param2) {
        field_l_g = (int)((long)this.field_l_a * (long)param1 + (long)this.field_l_b * (long)param2 >> 16) + this.field_l_c;
        field_l_h = (int)((long)this.field_l_d * (long)param1 + (long)this.field_l_e * (long)param2 >> 16) + this.field_l_f;
    }

    public final void method_l_b(int param1, int param2) {
        field_l_g = (int)((long)this.field_l_a * (long)param1 + (long)this.field_l_b * (long)param2 >> 16);
        field_l_h = (int)((long)this.field_l_d * (long)param1 + (long)this.field_l_e * (long)param2 >> 16);
    }

    public final void method_l_c(class_l param1) {
        this.field_l_a = param1.field_l_a;
        this.field_l_b = param1.field_l_b;
        this.field_l_c = param1.field_l_c;
        this.field_l_d = param1.field_l_d;
        this.field_l_e = param1.field_l_e;
        this.field_l_f = param1.field_l_f;
    }

    public final void method_l_d(class_l param1) {
        int n = (int)((long)this.field_l_a * (long)param1.field_l_a + (long)this.field_l_b * (long)param1.field_l_d >> 16);
        int n2 = (int)((long)this.field_l_a * (long)param1.field_l_b + (long)this.field_l_b * (long)param1.field_l_e >> 16);
        int n3 = (int)(((long)this.field_l_a * (long)param1.field_l_c + (long)this.field_l_b * (long)param1.field_l_f >> 16) + (long)this.field_l_c);
        int n4 = (int)((long)this.field_l_d * (long)param1.field_l_a + (long)this.field_l_e * (long)param1.field_l_d >> 16);
        int n5 = (int)((long)this.field_l_d * (long)param1.field_l_b + (long)this.field_l_e * (long)param1.field_l_e >> 16);
        int n6 = (int)(((long)this.field_l_d * (long)param1.field_l_c + (long)this.field_l_e * (long)param1.field_l_f >> 16) + (long)this.field_l_f);
        this.field_l_a = n;
        this.field_l_b = n2;
        this.field_l_c = n3;
        this.field_l_d = n4;
        this.field_l_e = n5;
        this.field_l_f = n6;
    }

    public static void method_l_e(class_l class_l2, class_l class_l3, class_l class_l4) {
        int n = (int)((long)class_l2.field_l_a * (long)class_l3.field_l_a + (long)class_l2.field_l_b * (long)class_l3.field_l_d >> 16);
        int n2 = (int)((long)class_l2.field_l_a * (long)class_l3.field_l_b + (long)class_l2.field_l_b * (long)class_l3.field_l_e >> 16);
        int n3 = (int)(((long)class_l2.field_l_a * (long)class_l3.field_l_c + (long)class_l2.field_l_b * (long)class_l3.field_l_f >> 16) + (long)class_l2.field_l_c);
        int n4 = (int)((long)class_l2.field_l_d * (long)class_l3.field_l_a + (long)class_l2.field_l_e * (long)class_l3.field_l_d >> 16);
        int n5 = (int)((long)class_l2.field_l_d * (long)class_l3.field_l_b + (long)class_l2.field_l_e * (long)class_l3.field_l_e >> 16);
        int n6 = (int)(((long)class_l2.field_l_d * (long)class_l3.field_l_c + (long)class_l2.field_l_e * (long)class_l3.field_l_f >> 16) + (long)class_l2.field_l_f);
        class_l4.field_l_a = n;
        class_l4.field_l_b = n2;
        class_l4.field_l_c = n3;
        class_l4.field_l_d = n4;
        class_l4.field_l_e = n5;
        class_l4.field_l_f = n6;
    }

    public final void method_l_f(class_l param1) {
        long l3 = (long)this.field_l_a * (long)this.field_l_e - (long)this.field_l_b * (long)this.field_l_d >> 16;
        if (l3 != 0L) {
            param1.field_l_a = (int)(((long)this.field_l_e << 16) / l3);
            param1.field_l_b = (int)(((long)this.field_l_d << 16) / l3);
            param1.field_l_d = (int)(((long)this.field_l_b << 16) / l3);
            param1.field_l_e = (int)(((long)this.field_l_a << 16) / l3);
            param1.field_l_c = -((int)((long)this.field_l_c * (long)param1.field_l_a + (long)this.field_l_f * (long)param1.field_l_b >> 16));
            param1.field_l_f = -((int)((long)this.field_l_c * (long)param1.field_l_d + (long)this.field_l_f * (long)param1.field_l_e >> 16));
            return;
        }
        throw new ArithmeticException("Non-invertible matrix.");
    }

    public final void method_l_g(float param1) {
        int n = (int)((float)Math.cos(param1) * 65536.0f);
        int n2 = (int)((float)Math.sin(param1) * 65536.0f);
        this.field_l_a = n;
        this.field_l_b = -n2;
        this.field_l_d = n2;
        this.field_l_e = n;
    }

    @Override
    public final String toString() {
        return new String(this.field_l_a + " " + this.field_l_b + " " + this.field_l_c + "\n" + this.field_l_d + " " + this.field_l_e + " " + this.field_l_f);
    }

    static {
        field_l_i = new class_l();
    }
}