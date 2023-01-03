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

import com.nokia.mid.ui.DeviceControl;

import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import java.io.*;
import java.util.Vector;

public final class class_o extends GameCanvas implements Runnable, CommandListener, interface_p {
    private static class_o field_o_a;
    public static boolean field_o_b;
    private static boolean field_o_c;
    private static boolean field_o_d;
    private static int field_o_e;
    private static Object field_o_f;
    private static Object field_o_g;
    public static class_b field_o_h;
    private static int[] field_o_i;
    private static int field_o_j;
    private static int[] field_o_k;
    private static int field_o_l;
    private static boolean field_o_m;
    private static boolean field_o_n;
    private static boolean field_o_o;
    private static boolean field_o_p;
    private static int field_o_q;
    private static int field_o_r;
    private static long field_o_s;
    public static int field_o_t;
    private static int field_o_u;
    private static int field_o_v;
    private static String[] field_o_w;
    private static String[] field_o_x;
    private static int[] field_o_y;
    private static char[] field_o_z;
    public static int field_o_aa;
    public static int field_o_ab;
    private static Graphics field_o_ac;
    private static Graphics field_o_ad;
    private static Font[] field_o_ae;
    private static int[] field_o_af;
    private static int field_o_ag;
    private static int field_o_ah;
    private static Vector<Integer> field_o_ai;
    private static Vector<Integer> field_o_aj;
    private static interface_p[] field_o_ak;
    private static Object[] field_o_al;
    private static boolean[] field_o_am;
    private static String[] field_o_an;
    private static int[] field_o_ao;
    private static short[][] field_o_ap;
    private static short[][] field_o_aq;
    private static short[] field_o_ar;
    private static Image[] field_o_as;
    private static byte[] field_o_at;
    private static final short[] field_o_au;
    private static int field_o_av;
    private static String[] field_o_aw;
    private static int field_o_ax;
    private static boolean field_o_ay;
    private static Player field_o_az;
    private static int field_o_ba;
    private static int field_o_bb;
    public static MIDlet field_o_bc;
    private static int field_o_bd;
    private static int field_o_be;
    private static int field_o_bf;
    private static int field_o_bg;
    private static int[] field_o_bh;
    private static int field_o_bi;
    private static boolean field_o_bj;
    private static long field_o_bk;
    private static int field_o_bl;
    private static int field_o_bm;
    private static long field_o_bn;
    private static boolean field_o_bo;
    private static int field_o_bp;
    private static char field_o_bq;
    private static char[][] field_o_br;

    public class_o() {
        super(false);
    }

    private static void method_o_a(int param1) {
        if (class_o.field_o_j == 20) {
            return;
        }
        class_o.field_o_i[class_o.field_o_j] = param1;
        ++class_o.field_o_j;
    }

    public static void method_o_b(int param1) {
        if (class_o.field_o_l == 40) {
            throw new RuntimeException();
        }
        class_o.field_o_k[class_o.field_o_l] = param1;
        ++class_o.field_o_l;
    }

    public static void method_o_c() {
        class_o.field_o_p = true;
    }

    public static void method_o_d() {
        class_o.field_o_u = 2;
    }

    public static int method_o_e() {
        return class_o.field_o_u;
    }

    public static void method_o_f(int param1) {
        class_o.field_o_r = param1;
    }

    public static void method_o_g(int param1, String param2, int param3) {
        class_o.field_o_w[param1] = param2;
        class_o.field_o_y[param1] = param3;
    }

    public static void method_o_h() {
        for (int i = 0; i < 3; ++i) {
            method_o_g(i, null, -1);
        }
    }

    public static int method_o_i() {
        if ((method_o_l(0) & 0x72) == (method_o_l(1) & 0x72)) {
            if ((method_o_l(0) & 0x20) == 0x20) {
                return 2;
            }
            return 1;
        }
        else {
            if ((method_o_l(0) & 0xD) != (method_o_l(1) & 0xD)) {
                return 0;
            }
            if ((method_o_l(0) & 0x4) == 0x4) {
                return 3;
            }
            return 4;
        }
    }

    public static int method_o_j() {
        if (method_o_i() != 0) {
            return class_b.method_b_ab();
        }
        return 0;
    }

    public static int method_o_k() {
        if (method_o_i() != 0) {
            return -1;
        }
        return 0;
    }

    private static int method_o_l(int param1) {
        switch (param1) {
            case 0: {
                return 33;
            }
            case 1: {
                return 40;
            }
            case 2: {
                return 36;
            }
            default: {
                return -1;
            }
        }
    }

    public static boolean method_o_m() {
        return method_o_i() == 3 || method_o_i() == 4;
    }

    public static boolean method_o_n() {
        return method_o_i() == 1 || method_o_i() == 2;
    }

    public static String[] method_o_o(String param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7) {
        String[] array = new String[5];
        int integer9 = 0;
        int integer10 = 0;
        int integer11 = param5;
        int integer12 = 0;
        int integer13 = param1.length();
        int integer14 = 0;
        while (integer14 < integer13) {
            boolean integer15;
            int integer16;
            if (integer15 = (param4 && method_o_aa(param3) * integer9 < param6)) {
                integer16 = param2 - param5;
                ++integer10;
            }
            else {
                integer16 = param2;
            }
            int integer17 = 0;
            int integer18 = integer14;
            int integer19 = integer13;
            while (integer14 < integer13) {
                int integer20 = integer13;
                int integer21 = integer14;
                while (integer21 < integer13) {
                    int integer22;
                    for (integer22 = 0; integer22 < class_o.field_o_z.length && param1.charAt(integer21) != class_o.field_o_z[integer22]; ++integer22) {}
                    if (integer22 < class_o.field_o_z.length) {
                        integer20 = integer21;
                        if (param1.charAt(integer20) == '-') {
                            ++integer20;
                            break;
                        }
                        break;
                    }
                    else {
                        ++integer21;
                    }
                }
                if (method_o_z(param3, param1, integer18, integer20 - integer18) < integer16) {
                    integer19 = integer20;
                    integer14 = integer20;
                    ++integer17;
                    if (integer19 < integer13 && param1.charAt(integer19) == '\n') {
                        break;
                    }
                    while (integer14 < integer13) {
                        for (integer21 = 0; integer21 < class_o.field_o_z.length && param1.charAt(integer14) != class_o.field_o_z[integer21]; ++integer21) {}
                        if (integer21 >= class_o.field_o_z.length || param1.charAt(integer14) == '-' || param1.charAt(integer14) == '\n') {
                            break;
                        }
                        ++integer14;
                    }
                }
                else {
                    if (integer17 == 0) {
                        for (integer21 = integer18; method_o_z(param3, param1, integer18, integer21 - integer18 + 1) < integer16; ++integer21) {}
                        integer19 = integer21;
                        integer14 = integer21;
                        break;
                    }
                    break;
                }
            }
            int integer20 = method_o_z(param3, param1, integer18, integer19 - integer18);
            if (integer15) {
                integer11 = Math.max(integer11, integer20 + param5);
                integer12 = Math.max(integer12, integer20 + param5);
            }
            else {
                integer12 = Math.max(integer12, integer20);
            }
            if (class_o.field_o_b) {
                array = method_o_p(array, integer9 + 1, '\u200f' + param1.substring(integer18, integer19));
            }
            else {
                array = method_o_p(array, integer9 + 1, param1.substring(integer18, integer19));
            }
            ++integer9;
            if (integer14 < integer13 && param1.charAt(integer14) == '\n') {
                ++integer14;
            }
            try {
                Thread.sleep(1L);
            }
            catch (InterruptedException ex) {}
        }
        int integer1;
        if (param7) {
            integer1 = integer12;
        }
        else {
            integer1 = param2;
        }
        if (param4) {
            param2 = Math.max(integer9 * method_o_aa(param3), param6);
        }
        else {
            param2 = integer9 * method_o_aa(param3) + param6;
        }
        array[0] = "" + integer9 + " " + integer10 + " " + integer11 + " " + integer1 + " " + param2;
        return array;
    }

    private static String[] method_o_p(String[] param1, int param2, String param3) {
        if (param1.length <= param2) {
            String[] array = new String[param1.length + 5];
            System.arraycopy(param1, 0, array, 0, param1.length);
            param1 = array;
        }
        param1[param2] = param3;
        return param1;
    }

    public static int method_o_q() {
        return class_o.field_o_aa;
    }

    public static boolean method_o_r(int param1) {
        return (class_o.field_o_bg & 1 << param1) != 0x0;
    }

    public static void method_o_s() {
        class_o.field_o_be = 0;
        class_o.field_o_bd = 2;
    }

    public static void method_o_t() {
        class_o.field_o_be = 0;
        class_o.field_o_bg = 0;
        class_o.field_o_bf = 0;
        class_o.field_o_bi = 0;
        class_o.field_o_bj = true;
    }

    public static void method_o_u(String param1, byte[] param2) {
        RecordStore __Null3 = null;
        try {
            if ((__Null3 = RecordStore.openRecordStore(param1, true)).getNumRecords() <= 0) {
                __Null3.addRecord((byte[])null, 0, 0);
            }
            byte[] array;
            (array = new byte[param2.length + 2])[0] = 1;
            array[1] = 14;
            System.arraycopy(param2, 0, array, 2, param2.length);
            __Null3.setRecord(1, array, 0, array.length);
            try {
                if (__Null3 != null) {
                    __Null3.closeRecordStore();
                }
            }
            catch (Exception ex) {}
        }
        catch (RecordStoreException ex2) {
            try {
                if (__Null3 != null) {
                    __Null3.closeRecordStore();
                }
            }
            catch (Exception ex3) {}
        }
        catch (Exception ex4) {
            try {
                if (__Null3 != null) {
                    __Null3.closeRecordStore();
                }
            }
            catch (Exception ex5) {}
        }
        finally {
            try {
                if (__Null3 != null) {
                    __Null3.closeRecordStore();
                }
            }
            catch (Exception ex6) {}
        }
    }

    public static byte[] method_o_v(String param1) {
        RecordStore recordStore = null;
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(param1, false);
            recordStore = openRecordStore;
            if (openRecordStore == null || recordStore.getNumRecords() <= 0) {
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return null;
            }
            byte[] record = recordStore.getRecord(1);
            if (record == null || record.length < 2 || record[0] != 1 || record[1] != 14) {
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    } catch (Exception unused2) {
                        return null;
                    }
                }
                return null;
            }
            byte[] bArr = new byte[record.length - 2];
            System.arraycopy(record, 2, bArr, 0, bArr.length);
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception unused3) {
                }
            }
            return bArr;
        } catch (RecordStoreException unused4) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception unused5) {
                    return null;
                }
            }
            return null;
        } catch (Exception unused6) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception unused7) {
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            if (recordStore != null) {
                try {
                    recordStore.closeRecordStore();
                } catch (Exception unused8) {
                    throw th;
                }
            }
            throw th;
        }
    }

    public static Graphics method_o_w() {
        return class_o.field_o_ad;
    }

    public static void method_o_x(Graphics param1) {
        class_o.field_o_ad = ((param1 != null) ? param1 : class_o.field_o_ac);
    }

    public static boolean method_o_y(int param1, int param2, int param3, int param4, int[] param5) {
        int integer6 = class_o.field_o_ad.getClipX();
        int integer7 = class_o.field_o_ad.getClipY();
        int integer8 = class_o.field_o_ad.getClipWidth();
        int integer9 = class_o.field_o_ad.getClipHeight();
        param5[0] = integer6;
        param5[1] = integer7;
        param5[2] = integer8;
        param5[3] = integer9;
        if (param1 < integer6) {
            param3 -= integer6 - param1;
            param1 = integer6;
        }
        if (param2 < integer7) {
            param4 -= integer7 - param2;
            param2 = integer7;
        }
        if (param1 + param3 > integer6 + integer8) {
            param3 = integer6 + integer8 - param1;
        }
        if (param2 + param4 > integer7 + integer9) {
            param4 = integer7 + integer9 - param2;
        }
        if (param3 > 0 && param4 > 0) {
            class_o.field_o_ad.setClip(param1, param2, param3, param4);
            return true;
        }
        return false;
    }

    public static int method_o_z(int param1, String param2, int param3, int param4) {
        if (param1 == -1) {
            param1 = 0;
        }
        else if (param1 == -2) {
            param1 = 1;
        }
        else {
            if (param1 != -3) {
                return -1;
            }
            param1 = 2;
        }
        return class_o.field_o_ae[param1].substringWidth(param2, param3, param4);
    }

    public static int method_o_aa(int param1) {
        if (param1 == -1) {
            param1 = 0;
        }
        else if (param1 == -2) {
            param1 = 1;
        }
        else {
            if (param1 != -3) {
                return -1;
            }
            param1 = 2;
        }
        return class_o.field_o_ae[param1].getHeight();
    }

    public static void method_o_ab(int param1, int param2) {
        class_o.field_o_ah = param1;
        class_o.field_o_ag = param2;
        class_o.field_o_af[0] = 0;
    }

    public static int method_o_ac() {
        return class_o.field_o_ah;
    }

    public static void method_o_ad(int param1, int param2) {
        class_o.field_o_af[param1] = param2;
    }

    public static void method_o_ae(String param1, int param2, int param3, int param4, int param5) {
        int integer6;
        if (class_o.field_o_ah == -1) {
            integer6 = 0;
        }
        else if (class_o.field_o_ah == -2) {
            integer6 = 1;
        }
        else {
            if (class_o.field_o_ah != -3) {
                return;
            }
            integer6 = 2;
        }
        if ((param5 & 0x2) == 0x2) {
            param5 = ((param5 & 0xFFFFFFFD) | 0x10);
            param4 -= method_o_aa(class_o.field_o_ah) / 2;
        }
        class_o.field_o_ad.setFont(class_o.field_o_ae[integer6]);
        if (class_o.field_o_ag != 1) {
            class_o.field_o_ad.setColor(class_o.field_o_af[1]);
            switch (class_o.field_o_ag) {
                case 3: {
                    integer6 = 0;
                    while (integer6 < 4) {
                        class_o.field_o_ad.drawSubstring(param1, 0, param2, param3 + (integer6 & 0x1) * (integer6 - 2), param4 + (++integer6 & 0x1) * (integer6 - 2), param5);
                    }
                    break;
                }
                case 2: {
                    class_o.field_o_ad.drawSubstring(param1, 0, param2, param3 + 1, param4 + 1, param5);
                    break;
                }
            }
        }
        class_o.field_o_ad.setColor(class_o.field_o_af[0]);
        class_o.field_o_ad.drawSubstring(param1, 0, param2, param3, param4, param5);
    }

    public static void method_o_af(int param1) {
        if (param1 < 0) {
            return;
        }
        Integer integer1 = param1;
        if (!class_o.field_o_ai.contains(integer1)) {
            class_o.field_o_ai.addElement(integer1);
        }
        class_o.field_o_aj.removeElement(integer1);
    }

    public static void method_o_ag(int param1) {
        if (param1 < 0) {
            return;
        }
        Integer integer1 = param1;
        if (!class_o.field_o_aj.contains(integer1)) {
            class_o.field_o_aj.addElement(integer1);
        }
        class_o.field_o_ai.removeElement(integer1);
    }

    public static Object method_o_ah(int param1) {
        if (param1 < 0) {
            return null;
        }
        if (class_o.field_o_al != null) {
            return class_o.field_o_al[param1];
        }
        return null;
    }

    public static boolean method_o_ai(int param1) {
        return param1 >= 0 && (class_o.field_o_am != null && class_o.field_o_am[param1]);
    }

    private static void method_o_aj(DataInputStream param1, int param2) {
        try {
            for (int i = 0; i < param2; i = param1.skipBytes(param2 - i)) {
            }
        }
        catch (Exception e) {
            // TODO: remove try
            e.printStackTrace();
        }
    }

    private static byte[] method_o_ak(InputStream param1, int param2) {
        try {
            if (param2 != -1) {
                byte[] b = new byte[param2];
                for (int i = 0; i < b.length; i += param1.read(b, i, b.length - i)) {
                }
                return b;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] array = new byte[1024];
            int integer4;
            while ((integer4 = param1.read(array)) >= 0) {
                byteArrayOutputStream2.write(array, 0, integer4);
            }
            return byteArrayOutputStream2.toByteArray();
        }
        catch (Exception e) {
            // TODO: remove try
            e.printStackTrace();
            return null;
        }
    }

    private static void method_o_al() {
        if (field_o_an != null) {
            return;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(field_o_bc.getClass().getResourceAsStream("/a"));
            int readShort = dataInputStream.readShort();
            field_o_an = new String[readShort];
            field_o_ao = new int[readShort << 1];
            for (int i = 0; i < readShort; i++) {
                field_o_an[i] = dataInputStream.readUTF();
                field_o_ao[i << 1] = dataInputStream.readInt();
                field_o_ao[(i << 1) + 1] = dataInputStream.readInt();
            }
            int readShort2 = dataInputStream.readShort();
            field_o_ap = new short[readShort2][];
            field_o_al = new Object[readShort2];
            field_o_am = new boolean[readShort2];
            for (int i2 = 0; i2 < readShort2; i2++) {
                short readByte = dataInputStream.readByte();
                byte readByte2 = dataInputStream.readByte();
                field_o_ap[i2] = new short[readByte2 + 2];
                field_o_ap[i2][0] = readByte;
                field_o_ap[i2][1] = dataInputStream.readShort();
                for (int i3 = 0; i3 < readByte2; i3++) {
                    field_o_ap[i2][i3 + 2] = dataInputStream.readShort();
                }
            }
            int readShort3 = dataInputStream.readShort();
            short[] sArr = new short[readShort3];
            short[] sArr2 = new short[readShort3];
            for (int i4 = 0; i4 < readShort3; i4++) {
                sArr[i4] = dataInputStream.readShort();
                sArr2[i4] = dataInputStream.readShort();
            }
            dataInputStream.close();
            for (int i5 = 0; i5 < sArr2.length; i5++) {
                DataInputStream method_o_ap = method_o_ap(sArr2[i5]);
                if (method_o_ap != null) {
                    for (int i6 = 0; i6 < field_o_ak.length && !field_o_ak[i6].interface_p_a(method_o_ap, sArr[i5]); i6++) {
                    }
                    method_o_ap.close();
                }
            }
            field_o_ak[0].interface_p_a(null, -1);
        } catch (IOException unused) {
            unused.printStackTrace();
        }
    }

    private static void method_o_am() {
        Vector vector = new Vector();
        for (int i = 0; i < field_o_ai.size(); i++) {
            int intValue = ((Integer) field_o_ai.elementAt(i)).intValue();
            if (!field_o_am[intValue]) {
                int i2 = 0;
                int i3 = -1;
                while (i3 < field_o_ap[intValue].length - 2) {
                    short s = i3 == -1 ? field_o_ap[intValue][1] : field_o_ap[intValue][i3 + 2];
                    int size = vector.size();
                    int i4 = i2;
                    while (true) {
                        if (i4 >= vector.size()) {
                            break;
                        }
                        int[] iArr = (int[]) vector.elementAt(i4);
                        boolean equals = field_o_an[s].equals(field_o_an[iArr[2]]);
                        boolean z = i4 == vector.size() - 1 || !field_o_an[s].equals(field_o_an[((int[]) vector.elementAt(i4 + 1))[2]]);
                        if (equals && field_o_ao[s << 1] < field_o_ao[iArr[2] << 1]) {
                            size = i4;
                            break;
                        } else if (equals && z) {
                            size = i4 + 1;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i3 == -1) {
                        i2 = size + 1;
                    }
                    vector.insertElementAt(new int[]{intValue, i3, s}, size);
                    i3++;
                }
            }
        }
        DataInputStream dataInputStream = null;
        Object obj = null;
        int i5 = 0;
        for (int i6 = 0; i6 < vector.size(); i6++) {
            try {
                int[] iArr2 = (int[]) vector.elementAt(i6);
                int i7 = iArr2[0];
                int i8 = iArr2[2];
                String str = field_o_an[i8];
                int i9 = field_o_ao[i8 << 1];
                int i10 = field_o_ao[(i8 << 1) + 1];
                if (dataInputStream == null || !str.equals(obj) || i5 > i9) {
                    if (dataInputStream != null) {
                        dataInputStream.close();
                        dataInputStream = null;
                    }
                    if (i9 != -1 && i10 != 0) {
                        dataInputStream = method_o_ap(i8);
                    }
                } else {
                    method_o_aj(dataInputStream, i9 - i5);
                }
                boolean z2 = false;
                if (iArr2[1] == -1) {
                    if (i9 == -1) {
                        dataInputStream = new DataInputStream(field_o_bc.getClass().getResourceAsStream("/" + str));
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= field_o_ak.length) {
                            break;
                        }
                        Object interface_p_b = field_o_ak[i11].interface_p_b(i10 != 0 ? dataInputStream : null, i10, field_o_ap[i7][0], i7);
                        if (interface_p_b != null) {
                            field_o_al[i7] = interface_p_b;
                            z2 = true;
                            break;
                        }
                        i11++;
                    }
                } else if (i10 != 0) {
                    for (int i12 = 0; i12 < field_o_ak.length; i12++) {
                        boolean interface_p_c = field_o_ak[i12].interface_p_c(dataInputStream, i10 == -1 ? str : null, i10, field_o_ap[i7][0], i7, iArr2[1]);
                        z2 = interface_p_c;
                        if (interface_p_c) {
                            break;
                        }
                    }
                }
                if (!z2 && i9 != -1) {
                    method_o_aj(dataInputStream, i10);
                }
                if (dataInputStream != null) {
                    obj = str;
                    i5 = i9 + i10;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            }
            catch (Exception e) {
                // TODO: remove try
                e.printStackTrace();
            }
        }
        for (int i13 = 0; i13 < field_o_ai.size(); i13++) {
            field_o_am[((Integer) field_o_ai.elementAt(i13)).intValue()] = true;
        }
        field_o_ai.removeAllElements();
    }

    private static void method_o_an() {
        for (int i = 0; i < class_o.field_o_aj.size(); ++i) {
            int integer2 = class_o.field_o_aj.elementAt(i);
            if (class_o.field_o_am[integer2]) {
                short integer3 = class_o.field_o_ap[integer2][0];
                for (int n = 0; n < class_o.field_o_ak.length && !class_o.field_o_ak[n].interface_p_d(integer3, integer2); ++n) {}
                class_o.field_o_al[integer2] = null;
                class_o.field_o_am[integer2] = false;
            }
        }
        class_o.field_o_aj.removeAllElements();
    }

    private static short method_o_ao(byte[] param1, int param2) {
        return (short)(param1[param2] << 8 | (param1[param2 + 1] & 0xFF));
    }

    private static DataInputStream method_o_ap(int param1) {
        if (class_o.field_o_ao[(param1 << 1) + 1] != 0) {
            DataInputStream dataInputStream2 = new DataInputStream(class_o.field_o_bc.getClass().getResourceAsStream("/" + class_o.field_o_an[param1]));
            if (class_o.field_o_ao[param1 << 1] != -1) {
                method_o_aj(dataInputStream2, class_o.field_o_ao[param1 << 1]);
            }
            return dataInputStream2;
        }
        return null;
    }

    @Override
    public final boolean interface_p_a(DataInputStream param1, int param2) {
        try {
            switch (param2) {
                case -1: {
                    class_o.field_o_ar = new short[428];
                    class_o.field_o_at = new byte[2282];
                    class_o.field_o_as = new Image[46];
                    for (param2 = 0; param2 < class_o.field_o_ar.length; ++param2) {
                        class_o.field_o_ar[param2] = -1;
                    }
                    for (param2 = 0; param2 < class_o.field_o_at.length; ++param2) {
                        class_o.field_o_at[param2] = -1;
                    }
                    break;
                }
                case 4: {
                    class_o.field_o_ax = param1.readByte();
                    class_o.field_o_aw = new String[param1.readShort()];
                    break;
                }
                case 6: {
                    class_o.field_o_aq = new short[param2 = param1.readShort()][];
                    for (int i = 0; i < param2; ++i) {
                        short integer5 = param1.readShort();
                        class_o.field_o_aq[i] = new short[integer5];
                        for (short n = 0; n < integer5; ++n) {
                            class_o.field_o_aq[i][n] = param1.readShort();
                        }
                    }
                    return true;
                }
                case 7: {
                    return true;
                }
            }
            return false;
        }
        catch (Exception e) {
            // TODO: remove try
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public final Object interface_p_b(DataInputStream param1, int param2, int param3, int param4) {
        try {
            switch (param3) {
                case 2: {
                    param2 = param1.readByte();
                    param3 = param1.readShort();
                    int integer6 = param1.readShort();
                    int integer7 = param1.readShort();
                    int integer8 = param1.readShort();
                    for (int j = 0; j < integer6; ++j) {
                        short integer10 = param1.readShort();
                        class_o.field_o_ar[integer10 - 326 << 1] = (short) param4;
                        class_o.field_o_ar[(integer10 - 326 << 1) + 1] = (short) (param1.readShort() + 4);
                    }
                    ByteArrayOutputStream object9 = new ByteArrayOutputStream(integer7 + 4);
                    DataOutputStream object10;
                    (object10 = new DataOutputStream(object9)).writeShort(param3);
                    object10.writeShort(param3 + param2);
                    for (param2 = 0; param2 < integer7; ++param2) {
                        object10.writeByte(param1.readByte());
                    }
                    param2 = 0;
                    for (param3 = 0; param3 < integer8 << 3; ++param3) {
                        if ((param3 & 0x7) == 0x0) {
                            param2 = 7 * param1.readShort();
                        } else {
                            class_o.field_o_at[param2 + (param3 & 0x7) - 1] = param1.readByte();
                        }
                    }
                    return object9.toByteArray();
                }
                case 4: {
                    param3 = param1.readShort();
                    param2 = param1.readShort();
                    param4 = -999999;
                    int integer6 = -999999;
                    int integer7 = 0;
                    for (int i = 0; i < class_o.field_o_ax + 1; ++i) {
                        if (i == 0) {
                            param4 = param1.readInt();
                        } else {
                            integer7 = param1.readInt();
                            if (i == 1) {
                                integer6 = integer7 - param4;
                            }
                        }
                    }
                    method_o_aj(param1, param4);
                    for (int i = 0; i < param3; ++i) {
                        if (class_o.field_o_aw[param2 + i] == null) {
                            class_o.field_o_aw[param2 + i] = param1.readUTF();
                        } else {
                            param1.readUTF();
                        }
                    }
                    method_o_aj(param1, integer7 - (param4 + integer6));
                    return new short[]{(short) param2, (short) param3};
                }
                case 3: {
                    return new Object();
                }
                default: {
                    return method_o_ak((InputStream) param1, param2);
                }
            }
        }
        catch (Exception exception) {
            // TODO: remove try
            exception.printStackTrace();
            return null;
        }
    }

    @Override
    public final boolean interface_p_c(DataInputStream param1, String param2, int param3, int param4, int param5, int param6) {
        switch (param4) {
            case 2: {
                param4 = method_o_ao((byte[])method_o_ah(param5), 0) + param6;
                if (param1 != null) {
                    byte[] a = method_o_ak((InputStream)param1, param3);
                    class_o.field_o_as[param4] = Image.createImage(a, 0, a.length);
                }
                else {
                    try {
                        class_o.field_o_as[param4] = Image.createImage("/" + param2);
                    }
                    catch (Exception e) {
                        // TODO: remove try
                        e.printStackTrace();
                    }
                }
                return true;
            }
            case 3:
            case 8: {
                if (param1 != null) {
                    method_o_bi(method_o_ak((InputStream)param1, param3), param5, null);
                }
                else {
                    method_o_bi((byte[])null, param5, "/" + param2);
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override
    public final boolean interface_p_d(int param1, int param2) {
        switch (param1) {
            case 2: {
                byte[] array = (byte[])class_o.field_o_al[param2];
                for (short n = 0; n < class_o.field_o_ar.length; n += 2) {
                    if (class_o.field_o_ar[n] == param2) {
                        class_o.field_o_ar[n] = -1;
                        class_o.field_o_ar[n + 1] = -1;
                    }
                }
                short integer4 = method_o_ao(array, 0);
                param2 = method_o_ao(array, 2);
                for (int i = 0; i < class_o.field_o_at.length; i += 7) {
                    byte integer6;
                    if ((integer6 = class_o.field_o_at[i + 6]) >= integer4 && integer6 < param2) {
                        for (int j = 0; j < 7; ++j) {
                            class_o.field_o_at[i + j] = -1;
                        }
                    }
                }
                for (integer4 = method_o_ao(array, 2), param2 = method_o_ao(array, 0); param2 < integer4; ++param2) {
                    class_o.field_o_as[param2] = null;
                }
                return true;
            }
            case 4: {
                short[] array2;
                for (short n = (array2 = (short[])class_o.field_o_al[param2])[0]; n < array2[1] + array2[0]; ++n) {
                    class_o.field_o_aw[n] = null;
                }
                return true;
            }
            case 3: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static void method_o_au() {
        short[] arrayOfShort = field_o_aq[0];
        for (short i : arrayOfShort) method_o_af(i);
    }

    public static Image method_o_av(int param1) {
        if ((param1 = method_o_ax(param1)) >= 0) {
            return class_o.field_o_as[param1];
        }
        return null;
    }

    public static void method_o_aw(int param1, Image param2) {
        if ((param1 = method_o_ax(param1)) >= 0) {
            class_o.field_o_as[param1] = param2;
        }
    }

    private static int method_o_ax(int param1) {
        int i;
        int i2;
        char c;
        if (param1 != -1 && param1 >= -1) {
            byte[] bArr = null;
            if (param1 < 326) {
                i2 = -99;
                c = 0;
                i = 0;
                if (field_o_at[(param1 * 7) + 6] == -1) {
                    return -1;
                }
            } else {
                int i3 = ((param1 - 326) << 1) + 1;
                if (i3 >= field_o_ar.length) {
                    return -1;
                }
                short s = field_o_ar[i3];
                short s2 = field_o_ar[(param1 - 326) << 1];
                if (s2 < 0) {
                    return -1;
                }
                bArr = (byte[]) field_o_al[s2];
                if (s == -1 || bArr == null) {
                    return -1;
                }
                i = s + 1;
                byte b = bArr[s];
                i2 = b & 3;
                c = (b & 4) != 0 ? (char) 2 : (char) 1;
            }
            short s3 = -1;
            if (i2 == 0 || i2 == -99) {
                if (i2 == 0) {
                    int i4 = c == 2 ? i + 12 : i + 6;
                    s3 = (short) ((bArr[i4] << 8) | (bArr[i4 + 1] & 255));
                } else {
                    s3 = field_o_at[(param1 * 7) + 6];
                }
            }
            return s3;
        }
        return -1;
    }

    public static void method_o_ay(int paramInt1, int paramInt2, int paramInt3) {
        int i;
        byte b;
        short s;
        byte[] arrayOfByte = null;
        if (paramInt3 < 326) {
            i = -99;
            b = 0;
            s = 0;
        } else {
            s = field_o_ar[(paramInt3 - 326 << 1) + 1];
            byte b1;
            i = (b1 = (arrayOfByte = (byte[])field_o_al[field_o_ar[paramInt3 - 326 << 1]])[s++]) & 0x3;
            b = (byte) (((b1 & 0x4) != 0) ? 2 : 1);
        }
        if (i == 0 || i == -99) {
            Image image;
            if (i == 0) {
                if (b == 2) {
                    for (paramInt3 = 0; paramInt3 < 6; paramInt3++) {
                        field_o_au[paramInt3] = (short)(arrayOfByte[s] << 8 | arrayOfByte[s + 1] & 0xFF);
                        s += 2;
                    }
                } else {
                    for (paramInt3 = 0; paramInt3 < 6; paramInt3++)
                        field_o_au[paramInt3] = (short)arrayOfByte[s++];
                }
                image = field_o_as[(short)(arrayOfByte[s] << 8 | arrayOfByte[s + 1] & 0xFF)];
            } else {
                paramInt3 *= 7;
                field_o_au[0] = (short)(field_o_at[paramInt3] & 0xFF);
                field_o_au[1] = (short)(field_o_at[paramInt3 + 1] & 0xFF);
                field_o_au[2] = (short)field_o_at[paramInt3 + 2];
                field_o_au[3] = (short)field_o_at[paramInt3 + 3];
                field_o_au[4] = (short)(field_o_at[paramInt3 + 4] & 0xFF);
                field_o_au[5] = (short)(field_o_at[paramInt3 + 5] & 0xFF);
                image = field_o_as[field_o_at[paramInt3 + 6]];
            }
            paramInt1 -= field_o_au[2];
            paramInt2 -= field_o_au[3];
            field_o_ad.getClipX();
            field_o_ad.getClipY();
            field_o_ad.getClipWidth();
            field_o_ad.getClipHeight();
            paramInt3 = field_o_au[0];
            i = field_o_au[1];
            if (paramInt3 > 0 && i > 0) {
                if (field_o_av != -1) {
                    field_o_ad.drawRegion(image, field_o_au[4], field_o_au[5], paramInt3, i, field_o_av, paramInt1, paramInt2, 20);
                    field_o_av = -1;
                    return;
                }
                field_o_ad.drawRegion(image, field_o_au[4], field_o_au[5], paramInt3, i, 0, paramInt1, paramInt2, 20);
            }
            return;
        }
        if (i == 1) {
            int j = s + (b << 2);
            short s1 = (short)(arrayOfByte[j] << 8 | arrayOfByte[j + 1] & 0xFF);
            j += 2;
            if (b == 2) {
                for (paramInt3 = 0; paramInt3 < s1; paramInt3++) {
                    method_o_ay(paramInt1 + (short)(arrayOfByte[j] << 8 | arrayOfByte[j + 1] & 0xFF), paramInt2 + (short)(arrayOfByte[j + 2] << 8 | arrayOfByte[j + 3] & 0xFF), (short)(arrayOfByte[j + 4] << 8 | arrayOfByte[j + 5] & 0xFF));
                    j += 6;
                }
                return;
            }
            for (paramInt3 = 0; paramInt3 < s1; paramInt3++)
                method_o_ay(paramInt1 + arrayOfByte[j++], paramInt2 + arrayOfByte[j++], arrayOfByte[j++]);
        }
    }

    public static void method_o_az(int param1, int param2, int param3, int param4) {
        param1 += method_o_bb(param3, 2);
        param2 += method_o_bb(param3, 3);
        if ((param4 & 0x1) == 0x1) {
            param1 -= method_o_bb(param3, 0) / 2;
        }
        if ((param4 & 0x8) == 0x8) {
            param1 -= method_o_bb(param3, 0);
        }
        if ((param4 & 0x2) == 0x2) {
            param2 -= method_o_bb(param3, 1) / 2;
        }
        if ((param4 & 0x20) == 0x20) {
            param2 -= method_o_bb(param3, 1);
        }
        method_o_ay(param1, param2, param3);
    }

    public static void method_o_ba(int param1, int param4) {
        class_o.field_o_av = 6;
        method_o_az(param1, param4, 12, 24);
    }

    public static int method_o_bb(int param1, int param2) {
        if (param1 < 326) {
            if (param2 == 2 || param2 == 3) {
                return class_o.field_o_at[param1 * 7 + param2];
            }
            return class_o.field_o_at[param1 * 7 + param2] & 0xFF;
        }
        else {
            int integer3 = class_o.field_o_ar[(param1 - 326 << 1) + 1];
            byte[] array;
            if (((((array = (byte[])class_o.field_o_al[class_o.field_o_ar[param1 - 326 << 1]])[integer3++] & 0x4) != 0x0) ? 2 : 1) == 2) {
                integer3 += param2 << 1;
                return (short)(array[integer3] << 8 | (array[integer3 + 1] & 0xFF));
            }
            return array[integer3 + param2];
        }
    }

    public static int method_o_bc(int paramInt1, int paramInt2) {
        short s = field_o_ar[(paramInt1 - 326 << 1) + 1];
        byte[] arrayOfByte;
        byte b;
        int i = (b = (arrayOfByte = (byte[])field_o_al[field_o_ar[paramInt1 - 326 << 1]])[s++]) & 0x3;
        b = (byte) (((b & 0x4) != 0) ? 2 : 1);
        if (i == 1) {
            int j = s + (b << 2);
            i = method_o_ao(arrayOfByte, j);
            j += 2;
            j = j + b * 3 * i + (b << 1) * paramInt2;
            return (b == 1) ? (arrayOfByte[j] << 16 & 0xFFFF0000 | arrayOfByte[j + 1] & 0xFFFF) : (method_o_ao(arrayOfByte, j) << 16 & 0xFFFF0000 | method_o_ao(arrayOfByte, j + 2) & 0xFFFF);
        }
        return 0;
    }

    public static void method_o_bd(int param1, int param2, int param3, int param4) {
        method_o_ay(param1, param2, method_o_be(param3, param4));
    }

    public static int method_o_be(int n, int n2) {
        // get id of image?
        int n3 = field_o_ar[(n - 326 << 1) + 1];
        byte[] byArray = (byte[])field_o_al[field_o_ar[n - 326 << 1]];
        n3 += 3;
        return byArray[n3 += n2 << 1] << 8 | byArray[n3 + 1] & 0xFF;
    }

    public static int method_o_bf(int param1) {
        int integer2 = class_o.field_o_ar[(param1 - 326 << 1) + 1];
        byte[] arr = (byte[])class_o.field_o_al[class_o.field_o_ar[param1 - 326 << 1]];
        ++integer2;
        return method_o_ao(arr, integer2);
    }

    public static void method_o_bg() {
        class_o.field_o_ay = true;
    }

    public static boolean method_o_bh() {
        return class_o.field_o_ay;
    }

    private static void method_o_bi(byte[] param1, int param2, String param3) {
        if (param1 == null) {
            InputStream inputStream3 = class_o.field_o_bc.getClass().getResourceAsStream(param3);
            try {
                param1 = method_o_ak(inputStream3, -1);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        byte[] array = param1;
        if (param2 >= 0) {
            class_o.field_o_al[param2] = array;
            class_o.field_o_am[param2] = (array != null);
        }
    }

    public static void method_o_bj(int param1, int param2) {
        synchronized (class_o.field_o_g) {
            if (class_o.field_o_n) {
                if (param2 == -1) {
                    class_o.field_o_q = param1;
                }
                else {
                    class_o.field_o_q = -1;
                }
                return;
            }
            class_o.field_o_q = -1;
            byte[] buf;
            if ((buf = (byte[])method_o_ah(param1)) == null) {
                return;
            }
            method_o_bk();
            if (class_o.field_o_ay) {
                try {
                    if (param2 == -1) {
                        param2 = -1;
                        class_o.field_o_bb = param1;
                    }
                    (class_o.field_o_az = Manager.createPlayer((InputStream)new ByteArrayInputStream(buf), "audio/midi")).prefetch();
                    VolumeControl volumeControl1;
                    if ((volumeControl1 = (VolumeControl)class_o.field_o_az.getControl("VolumeControl")) != null) {
                        volumeControl1.setLevel(class_o.field_o_ba);
                    }
                    class_o.field_o_az.setLoopCount(param2);
                    class_o.field_o_az.start();
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void method_o_bk() {
        synchronized (class_o.field_o_g) {
            class_o.field_o_q = -1;
            if (class_o.field_o_ay && class_o.field_o_az != null) {
                try {
                    if (class_o.field_o_az.getState() != 0) {
                        class_o.field_o_az.stop();
                        class_o.field_o_az.deallocate();
                        class_o.field_o_az.close();
                    }
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
                class_o.field_o_bb = -1;
                class_o.field_o_az = null;
            }
        }
    }

    public static void method_o_bl() {
        DeviceControl.setLights(0, 100);
    }

    public static void method_o_bm(int param1) {
        synchronized (class_o.field_o_g) {
            class_o.field_o_be = 0;
            class_o.field_o_bg = 0;
            class_o.field_o_bf = 0;
            if (param1 == 1) {
                class_o.field_o_a = new class_o();
                new Thread(class_o.field_o_a).start();
                return;
            }
            if (class_o.field_o_a == null) {
                return;
            }
            if (param1 == 2 || param1 == 4) {
                if (!class_o.field_o_m) {
                    class_o.field_o_m = true;
                    class_o.field_o_n = true;
                    param1 = class_o.field_o_bb;
                    method_o_bk();
                    class_o.field_o_q = param1;
                }
            }
            else if ((param1 == 3 || param1 == 5) && class_o.field_o_m) {
                class_o.field_o_m = false;
                class_o.field_o_g.notifyAll();
            }
        }
    }

    @Override
    public final void run() {
        try {
            if (class_o.field_o_c) {
                synchronized (class_o.field_o_f) {
                    try {
                        class_o.field_o_f.wait(500L);
                        while (class_o.field_o_o) {
                            method_o_bq();
                            method_o_br(2);
                            class_o.field_o_f.wait(class_o.field_o_e);
                        }
                    }
                    catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    return;
                }
            }
            class_o.field_o_c = true;
            class_o.field_o_i = new int[20];
            class_o.field_o_j = 0;
            class_o.field_o_k = new int[40];
            class_o.field_o_l = 0;
            class_o.field_o_bh = new int[20];
            class_o.field_o_bi = 0;
            class_o.field_o_w = new String[3];
            class_o.field_o_x = new String[3];
            class_o.field_o_y = new int[3];
            Display.getDisplay(class_o.field_o_bc).setCurrent((Displayable)this);
            super.setFullScreenMode(true);
            method_o_bq();
            class_o.field_o_ai = new Vector<Integer>();
            class_o.field_o_aj = new Vector<>();
            (class_o.field_o_ak = new interface_p[] { null })[0] = class_o.field_o_a;
            class_o.field_o_h = new class_b();
            method_o_a(1);
            method_o_bn();
            while (!class_o.field_o_p) {
                try {
                    while (true) {
                        System.currentTimeMillis();
                        if (!class_o.field_o_d) {
                            class_o.field_o_n = true;
                        }
                        method_o_bq();
                        if (class_o.field_o_j > 0) {
                            synchronized (class_o.field_o_i) {
                                for (int i = 0; i < class_o.field_o_j; ++i) {
                                    class_o.field_o_h.method_b_ac(class_o.field_o_i[i]);
                                    class_o.field_o_i[i] = 0;
                                }
                                class_o.field_o_j = 0;
                            }
                            synchronized (class_o.field_o_g) {
                                if (class_o.field_o_q != -1) {
                                    method_o_bj(class_o.field_o_q, -1);
                                    class_o.field_o_q = -1;
                                }
                            }
                        }
                        if (method_o_bo()) {
                            for (int j = 0; j < class_o.field_o_w.length; ++j) {
                                class_o.field_o_x[j] = null;
                            }
                            method_o_bp();
                            System.currentTimeMillis();
                        }
                        if (class_o.field_o_n) {
                            method_o_bt();
                        }
                        else {
                            for (int j = 0; j < class_o.field_o_w.length; ++j) {
                                if (class_o.field_o_x[j] != class_o.field_o_w[j]) {
                                    if (class_o.field_o_x[j] == null || !class_o.field_o_x[j].equals(class_o.field_o_w[j])) {
                                        class_o.field_o_x[j] = class_o.field_o_w[j];
                                    }
                                    else {
                                        class_o.field_o_w[j] = class_o.field_o_x[j];
                                    }
                                }
                            }
                            method_o_br(1);
                            if (class_o.field_o_n) {
                                method_o_bt();
                            }
                            else {
                                method_o_bs();
                                if (class_o.field_o_p) {
                                    break;
                                }
                                int integer2;
                                if (class_o.field_o_bo && (integer2 = class_o.field_o_bp) >= 10 && integer2 <= 19 && System.currentTimeMillis() - class_o.field_o_bn > 500L) {
                                    method_o_bw(integer2);
                                }
                                if (class_o.field_o_n) {
                                    method_o_bt();
                                }
                                else {
                                    Thread.sleep(1L);
                                }
                            }
                        }
                    }
                }
                catch (Throwable t) {
                    t.printStackTrace();
                }
            }
            class_o.field_o_h = null;
            method_o_bk();
            for (int integer2 = 0; integer2 < class_o.field_o_al.length; ++integer2) {
                class_o.field_o_aj.addElement(integer2);
            }
            method_o_an();
            class_o.field_o_bc.notifyDestroyed();
        }
        catch (Throwable t2) {
            t2.printStackTrace();
        }
    }

    private static void method_o_bn() {
        class_o.field_o_s = 0L;
        class_o.field_o_t = 0;
        method_o_t();
    }

    private static boolean method_o_bo() {
        return class_o.field_o_ai.size() > 0 || class_o.field_o_aj.size() > 0 || class_o.field_o_l > 0;
    }

    private static void method_o_bp() {
        class_o.field_o_o = true;
        new Thread(class_o.field_o_a).start();
        method_o_al();
        int integer1 = 0;
        int integer2 = 0;
        while (integer1 < class_o.field_o_l || !class_o.field_o_ai.isEmpty() || !class_o.field_o_aj.isEmpty()) {
            if (!class_o.field_o_aj.isEmpty()) {
                method_o_an();
                System.gc();
            }
            if (!class_o.field_o_ai.isEmpty()) {
                method_o_am();
                System.gc();
            }
            if (integer1 < class_o.field_o_l && (integer2 = class_o.field_o_h.method_b_ad(class_o.field_o_k[integer1], integer2)) == 0) {
                ++integer1;
            }
        }
        synchronized (class_o.field_o_f) {
            class_o.field_o_o = false;
            class_o.field_o_f.notify();
        }
        class_o.field_o_l = 0;
        method_o_bn();
    }

    private static void method_o_bq() {
        int integer1 = class_o.field_o_a.getWidth();
        int integer2 = class_o.field_o_a.getHeight();
        if (class_o.field_o_aa != integer1 || class_o.field_o_ab != integer2) {
            class_o.field_o_aa = integer1;
            class_o.field_o_ab = integer2;
            if (class_o.field_o_h != null) {
                method_o_a(2);
            }
        }
    }

    private static void method_o_br(int param1) {
        field_o_v = param1;
        Graphics graphics = field_o_a.getGraphics();
        if (field_o_v != 0)
            try {
                field_o_ac = graphics;
                field_o_ad = graphics;
                graphics.setClip(0, 0, field_o_aa, field_o_ab);
                if (field_o_h == null) {
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, field_o_aa, field_o_ab);
                } else {
                    if (!field_o_d) {
                        field_o_a.flushGraphics();
                        field_o_v = 0;
                        return;
                    }
                    field_o_h.method_b_z(field_o_v);
                }
                graphics.setClip(0, 0, field_o_aa, field_o_ab);
                for (byte b = 0; b < 3; b++) {
                    String str;
                    if ((str = field_o_x[b]) != null) {
                        int i = method_o_l(b);
                        int j = 0;
                        int k = 0;
                        if ((i & 0x4) == 4)
                            j = 2;
                        if ((i & 0x8) == 8)
                            j = field_o_aa - 2;
                        if ((i & 0x1) == 1)
                            j = field_o_aa >> 1;
                        if ((i & 0x10) == 16)
                            k = 2;
                        if ((i & 0x20) == 32)
                            k = field_o_ab - 2;
                        if ((i & 0x2) == 2)
                            k = field_o_ab >> 1;
                        class_b.method_b_aa(str, field_o_y[b], j, k, i);
                    }
                }
            } catch (Throwable throwable) { throwable.printStackTrace(); }
        field_o_a.flushGraphics();
        field_o_v = 0;
    }

    private static void method_o_bs() {
        long long1 = System.currentTimeMillis();
        if (class_o.field_o_s != 0L) {
            if ((class_o.field_o_t = (class_o.field_o_t = (int)(long1 - class_o.field_o_s)) / class_o.field_o_u) > class_o.field_o_r) {
                class_o.field_o_t = class_o.field_o_r;
            }
        }
        else {
            class_o.field_o_t = 0;
        }
        class_o.field_o_s = long1;
        class_o.field_o_bj = false;
        for (int i = 0; i < class_o.field_o_u; ++i) {
            for (int j = 0; j < class_o.field_o_bi; ++j) {
                class_o.field_o_h.method_b_x(class_o.field_o_bh[j]);
                class_o.field_o_bh[j] = -1;
            }
            class_o.field_o_bi = 0;
            class_o.field_o_bg = (class_o.field_o_be | class_o.field_o_bf);
            class_o.field_o_bf = 0;
            class_o.field_o_h.method_b_y();
            if (method_o_bo()) {
                break;
            }
        }
    }

    private static void method_o_bt() {
        synchronized (class_o.field_o_g) {
            if (!method_o_bo()) {
                class_o.field_o_n = false;
                method_o_a(3);
            }
            if (class_o.field_o_m) {
                try {
                    class_o.field_o_g.wait();
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        method_o_bn();
    }

    private static int method_o_bu(int param1) {
        if (param1 == -7) {
            return 5;
        }
        if (param1 == -6) {
            return 6;
        }
        if (param1 == -5) {
            return 7;
        }
        switch (param1) {
            case 48: {
                return 10;
            }
            case 49: {
                return 11;
            }
            case 50: {
                return 12;
            }
            case 51: {
                return 13;
            }
            case 52: {
                return 14;
            }
            case 53: {
                return 15;
            }
            case 54: {
                return 16;
            }
            case 55: {
                return 17;
            }
            case 56: {
                return 18;
            }
            case 57: {
                return 19;
            }
            case 42: {
                return 20;
            }
            case 35: {
                return 21;
            }
            default: {
                try {
                    param1 = class_o.field_o_a.getGameAction(param1);
                }
                catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return -1;
                }
                switch (param1) {
                    case 6: {
                        return 2;
                    }
                    case 1: {
                        return 1;
                    }
                    case 2: {
                        return 3;
                    }
                    case 5: {
                        return 4;
                    }
                    default: {
                        return -1;
                    }
                }
            }
        }
    }

    private static void method_o_bv(int param1, int param2) {
        if (!field_o_bj && field_o_d) {
            try {
                if ((param2 & 8) == 8) {
                    param1 = method_o_bu(param1);
                }
                if (field_o_bd == 2) {
                    if (param1 == 15) {
                        param1 = 7;
                    } else if (param1 == 12) {
                        param1 = 1;
                    } else if (param1 == 14) {
                        param1 = 3;
                    } else if (param1 == 18) {
                        param1 = 2;
                    } else if (param1 == 16) {
                        param1 = 4;
                    }
                }
                if (field_o_bd != 3 || ((param1 < 10 || param1 > 21) && param1 != 21)) {
                    if ((param2 & 1) != 1) {
                        if ((param2 & 2) != 2 || param1 == -1) {
                            return;
                        }
                        field_o_be &= (1 << param1) ^ (-1);
                        return;
                    }
                    if (field_o_bi < 20) {
                        field_o_bh[field_o_bi] = param1;
                        field_o_bi++;
                    }
                    if (param1 != -1) {
                        field_o_be |= 1 << param1;
                        field_o_bf |= 1 << param1;
                    }
                } else if ((param2 & 1) != 1) {
                    if ((param2 & 2) == 2) {
                        int i = param1;
                        if (i >= 10 && i <= 19 && System.currentTimeMillis() - field_o_bk > 1200) {
                            field_o_bm = 0;
                            field_o_bk = 0L;
                        }
                        method_o_bw(i);
                    }
                } else {
                    int i2 = param1;
                    if (i2 != 21) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - field_o_bk >= 700 || i2 != field_o_bl) {
                            field_o_bm = 0;
                        } else {
                            field_o_bm++;
                        }
                        int i3 = i2 - 10;
                        if (field_o_br[i3].length == 0 || i3 < 0) {
                            return;
                        }
                        field_o_bk = currentTimeMillis;
                        field_o_bl = i2;
                        char c = field_o_br[i3][field_o_bm % field_o_br[i3].length];
                        if ((i2 == field_o_bp && c == field_o_bq) || field_o_bo) {
                            return;
                        }
                        field_o_bp = i2;
                        field_o_bq = c;
                        field_o_bn = System.currentTimeMillis();
                        field_o_bo = true;
                    }
                }
            } catch (Throwable unused) {
                unused.printStackTrace();
            }
        }
    }

    private static void method_o_bw(int param1) {
        if (param1 == class_o.field_o_bp && class_o.field_o_bo) {
            class_o.field_o_bo = false;
            class_o.field_o_bp = 999;
            class_o.field_o_bq = ' ';
        }
    }

    @Override
    public final void keyPressed(int param1) {
        method_o_bv(param1, 9);
    }

    @Override
    public final void keyReleased(int param1) {
        method_o_bv(param1, 10);
    }

    @Override
    public final void showNotify() {
        method_o_bm(5);
    }

    @Override
    public final void hideNotify() {
        method_o_bm(4);
    }

    @Override
    public final void paint(Graphics graphics) {
        super.paint(graphics);
    }

    static {
        class_o.field_o_a = null;
        class_o.field_o_b = false;
        class_o.field_o_c = false;
        class_o.field_o_d = true;
        class_o.field_o_e = 500;
        class_o.field_o_f = new Object();
        class_o.field_o_g = new Object();
        class_o.field_o_m = false;
        class_o.field_o_n = false;
        class_o.field_o_o = false;
        class_o.field_o_p = false;
        class_o.field_o_q = -1;
        class_o.field_o_r = 500;
        class_o.field_o_u = 1;
        class_o.field_o_v = 0;
        class_o.field_o_z = new char[] { '\n', ' ', '-' };
        class_o.field_o_aa = 240;
        class_o.field_o_ab = 320;
        class_o.field_o_ac = null;
        class_o.field_o_ad = null;
        class_o.field_o_ae = new Font[] { Font.getFont(64, 2, 0), Font.getFont(64, 1, 0), Font.getFont(64, 0, 0) };
        class_o.field_o_af = new int[2];
        class_o.field_o_ah = -1;
        field_o_au = new short[6];
        class_o.field_o_av = -1;
        class_o.field_o_ay = false;
        class_o.field_o_az = null;
        class_o.field_o_ba = 60;
        class_o.field_o_bb = -1;
        class_o.field_o_bd = 1;
        class_o.field_o_be = 0;
        class_o.field_o_bf = 0;
        class_o.field_o_bg = 0;
        class_o.field_o_bk = 0L;
        class_o.field_o_bl = 0;
        class_o.field_o_bm = 0;
        class_o.field_o_bn = 0L;
        class_o.field_o_bo = false;
        class_o.field_o_br = new char[][] { { ' ', '0' }, { '.', ',', '?', '!', '\'', '-', '(', ')', '@', '/', ':', '_', '1' }, { 'a', 'b', 'c', '\u00e4', '\u00e5', '2' }, { 'd', 'e', 'f', '3' }, { 'g', 'h', 'i', '4' }, { 'j', 'k', 'l', '5' }, { 'm', 'n', 'o', '\u00f6', '6' }, { 'p', 'q', 'r', 's', '7' }, { 't', 'u', 'v', '8' }, { 'w', 'x', 'y', 'z', '9' }, new char[0], new char[0] };
    }
}
