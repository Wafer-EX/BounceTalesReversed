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

public final class class_h extends class_f {
    public class_h() {
        this.field_f_ab = (byte)9;
    }

    @Override
    public final int method_d_a(byte[] param1, int param2) {
        return super.method_d_a(param1, param2);
    }

    @Override
    public final void method_c_f() {
        this.field_f_m = -2949120;
        this.field_f_o = 0x2D0000;
        this.field_f_n = -2949120;
        this.field_f_p = 0x2D0000;
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        this.method_f_f(class_f.field_f_a);
        class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
        int n = class_l.field_l_i.field_l_c >> 16;
        int n2 = class_l.field_l_i.field_l_f >> 16;
        class_o.method_o_ay(n, n2, 208);
    }
}