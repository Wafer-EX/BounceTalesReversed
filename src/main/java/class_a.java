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

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Vector;

public final class class_a {
    private static class_a field_a_a;
    private static DataInputStream field_a_b;
    private static String field_a_c;

    private class_a() {
    }

    private static String method_a_a(String param1, String param2, String param3) {
        int n;
        do {
            if ((n = param1.indexOf(param2)) < 0) continue;
            param1 = param1.substring(0, n) + param3 + param1.substring(n + param2.length());
        } while (n >= 0);
        return param1;
    }

    public static String method_a_b(int param1) {
        return class_a.method_a_c(param1, null);
    }

    public static synchronized String method_a_c(int param1, String[] param2) {
        if (class_a.field_a_c == null) {
            class_a.field_a_c = System.getProperty("javax.microedition.locale");
        }
        int unsignedShort = 0;
        try {
            if (class_a.field_a_a == null) {
                class_a.field_a_a = new class_a();
            }
            if (class_a.field_a_b == null) {
                InputStream in;
                if ((in = class_a.field_a_a.getClass().getResourceAsStream("/lang." + class_a.field_a_c)) == null) {
                    in = class_a.field_a_a.getClass().getResourceAsStream("/lang.xx");
                }
                if (in == null) {
                    return "X";
                }
                (class_a.field_a_b = new DataInputStream(in)).mark(512);
            }
            class_a.field_a_b.skipBytes(param1 << 1);
            unsignedShort = class_a.field_a_b.readUnsignedShort();
            class_a.field_a_b.skipBytes(unsignedShort - (param1 << 1) - 2);
            String s = class_a.field_a_b.readUTF();
            if (!class_a.field_a_b.markSupported()) {
                class_a.field_a_b.close();
                class_a.field_a_b = null;
            }
            else {
                try {
                    class_a.field_a_b.reset();
                }
                catch (final IOException ex) {
                    class_a.field_a_b.close();
                    class_a.field_a_b = null;
                }
            }
            if (param2 != null) {
                if (param2.length == 1) {
                    s = method_a_a(s, "%U", param2[0]);
                }
                else {
                    for (param1 = 0; param1 < param2.length; ++param1) {
                        s = method_a_a(s, "%" + param1 + "U", param2[param1]);
                    }
                }
            }
            return s;
        }
        catch (final IOException ex2) {
            class_a.field_a_b = null;
            return "E:" + unsignedShort;
        }
    }

    private static boolean method_a_d(String param1, String param2) {
        return class_a.method_a_e(param1, param2, 0, 0);
    }

    private static boolean method_a_e(String param1, String param2, int param3, int param4) {
        block4: while (true) {
            if (param3 == param1.length() && param4 == param2.length()) {
                return true;
            }
            if (param3 == param1.length() || param4 == param2.length()) {
                return false;
            }
            switch (param2.charAt(param4)) {
                case '?': {
                    ++param3;
                    ++param4;
                    continue block4;
                }
                case '*': {
                    if (param4 == param2.length() - 1) {
                        return true;
                    }
                    if (class_a.method_a_e(param1, param2, param3, param4 + 1)) {
                        return true;
                    }
                    ++param3;
                    continue block4;
                }
            }
            if (param1.charAt(param3) != param2.charAt(param4)) break;
            ++param3;
            ++param4;
        }
        return false;
    }

    private static StringBuffer method_a_f(InputStream param1) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            int n = 0;
            if ((char)param1.read() != ' ') {
                return stringBuffer;
            }
            while ((n = param1.read()) >= 0) {
                if ((char)n == '\r') continue;
                if ((char)n == '\n') {
                    stringBuffer.append((Object)class_a.method_a_f(param1));
                    break;
                }
                stringBuffer.append((char)n);
            }
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return stringBuffer;
    }

    static {
        block11: {
            InputStream inputStream;
            field_a_a = null;
            field_a_b = null;
            String string = System.getProperty("javax.microedition.platform");
            boolean bl = false;
            Serializable serializable = new StringBuffer();
            if (field_a_a == null) {
                field_a_a = new class_a();
            }
            if ((inputStream = field_a_a.getClass().getResourceAsStream("/META-INF/MANIFEST.MF")) != null) {
                block2: while (true) {
                    try {
                        int n;
                        while ((n = inputStream.read()) >= 0) {
                            if ((char)n == '\r') continue;
                            if ((char)n == '\n') {
                                if (((StringBuffer)serializable).toString().trim().startsWith("Nokia-Platform:")) {
                                    ((StringBuffer)serializable).append((Object)class_a.method_a_f(inputStream));
                                    break block2;
                                }
                                ((StringBuffer)serializable).delete(0, ((StringBuffer)serializable).length());
                                continue;
                            }
                            ((StringBuffer)serializable).append((char)n);
                        }
                        break block11;
                    } catch (IOException iOException) {
                        iOException.printStackTrace();
                        continue;
                    }
                }
                String string2 = ((StringBuffer)serializable).toString().trim().substring(15);
                serializable = new Vector();
                int n = 0;
                while ((n = string2.indexOf("@")) != -1) {
                    ((Vector)serializable).addElement(string2.substring(0, n));
                    string2 = string2.substring(n + 1, string2.length());
                }
                ((Vector)serializable).addElement(string2);
                for (n = 0; n < ((Vector)serializable).size(); ++n) {
                    if (!class_a.method_a_d(string, ((String)((Vector)serializable).elementAt(n)).trim())) continue;
                    bl = true;
                    break;
                }
            }
            if (!bl) {
                System.exit(0);
            }
        }
        field_a_c = null;
    }
}