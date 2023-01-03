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

public final class class_i extends class_f {
    public static int[] field_i_a;
    public static int[] field_i_b;
    private int[] field_i_c;
    private int[] field_i_d;
    public int[] field_i_e;
    public int[] field_i_f;
    private short[] field_i_g;
    public int field_i_h;
    private int field_i_i;
    private int field_i_j;
    public short field_i_k;

    public class_i() {
        this.field_f_ab = (byte) 2;
    }

    @Override
    public final int method_d_a(byte[] paramArrayOfbyte, int paramInt) {
        paramInt = super.method_d_a(paramArrayOfbyte, paramInt);
        this.field_i_h = (short)(paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF) + 1;
        this.field_i_i = (short)(paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF);
        int i = paramArrayOfbyte[paramInt++] & 0xFF;
        int j = paramArrayOfbyte[paramInt++] & 0xFF;
        int k = paramArrayOfbyte[paramInt++] & 0xFF;
        int m = paramArrayOfbyte[paramInt++] & 0xFF;
        this.field_i_j = i << 24 | j << 16 | k << 8 | m;
        this.field_i_e = new int[this.field_i_h];
        this.field_i_f = new int[this.field_i_h];
        this.field_i_c = new int[this.field_i_h];
        this.field_i_d = new int[this.field_i_h];
        this.field_i_g = new short[this.field_i_i];
        i = (byte)paramArrayOfbyte[paramInt++];
        j = (short)(paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF);
        paramInt = method_f_w(this.field_i_e, this.field_i_h - 1, j, paramArrayOfbyte, paramInt, i);
        j = (short)(paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF);
        paramInt = method_f_w(this.field_i_f, this.field_i_h - 1, j, paramArrayOfbyte, paramInt, i);
        i = (byte)paramArrayOfbyte[paramInt++];
        paramInt = method_f_x(this.field_i_g, this.field_i_i, 0, paramArrayOfbyte, paramInt, i);
        this.field_i_e[this.field_i_h - 1] = this.field_i_e[0];
        this.field_i_f[this.field_i_h - 1] = this.field_i_f[0];
        this.field_i_k = (short)(paramArrayOfbyte[paramInt++] << 8 | paramArrayOfbyte[paramInt++] & 0xFF);
        method_c_f();
        return paramInt;
    }

    @Override
    public final void method_c_f() {
        super.method_c_f();
        for (int i = 0; i < this.field_i_e.length; i++) {
            if (this.field_i_e[i] < this.field_f_m) {
                this.field_f_m = this.field_i_e[i];
            }
            if (this.field_i_e[i] > this.field_f_o) {
                this.field_f_o = this.field_i_e[i];
            }
        }
        for (int i2 = 0; i2 < this.field_i_f.length; i2++) {
            if (this.field_i_f[i2] < this.field_f_n) {
                this.field_f_n = this.field_i_f[i2];
            }
            if (this.field_i_f[i2] > this.field_f_p) {
                this.field_f_p = this.field_i_f[i2];
            }
        }
    }

    @Override
    public final void method_c_o(Graphics param1, DirectGraphics param2, class_l param3) {
        if (this.field_f_z) {
            method_f_f(class_f.field_f_a);
            int i = param3.field_l_c;
            int i2 = param3.field_l_f;
            param3.field_l_c = 0;
            param3.field_l_f = 0;
            class_l.method_l_e(param3, class_f.field_f_a, class_l.field_l_i);
            param3.field_l_c = i;
            param3.field_l_f = i2;
            for (int i3 = 0; i3 < this.field_i_h; i3++) {
                class_l.field_l_i.method_l_a(this.field_i_e[i3], this.field_i_f[i3]);
                this.field_i_c[i3] = class_l.field_l_g >> 16;
                this.field_i_d[i3] = class_l.field_l_h >> 16;
            }
            this.field_f_z = false;
        }
        int i4 = class_o.field_o_aa - 1;
        int i5 = class_o.field_o_ab - 1;
        int i6 = param3.field_l_c >> 16;
        int i7 = param3.field_l_f >> 16;
        param1.setColor(class_b.method_b_am(this.field_i_j));
        for (int i8 = 0; i8 < this.field_i_i; i8 += 3) {
            short s = this.field_i_g[i8];
            short s2 = this.field_i_g[i8 + 1];
            short s3 = this.field_i_g[i8 + 2];
            int i9 = this.field_i_c[s] + i6;
            int i10 = this.field_i_c[s2] + i6;
            int i11 = this.field_i_c[s3] + i6;
            int i12 = this.field_i_d[s] + i7;
            int i13 = this.field_i_d[s2] + i7;
            int i14 = this.field_i_d[s3] + i7;
            if ((i9 >= 0 || i10 >= 0 || i11 >= 0) && ((i12 >= 0 || i13 >= 0 || i14 >= 0) && ((i9 <= i4 || i10 <= i4 || i11 <= i4) && (i12 <= i5 || i13 <= i5 || i14 <= i5)))) {
                param1.fillTriangle(i9, i12, i10, i13, i11, i14);
            }
        }
    }
}