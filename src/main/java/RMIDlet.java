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

import javax.microedition.midlet.MIDlet;

public class RMIDlet extends MIDlet {
    @Override
    protected void startApp() {
        if (class_o.field_o_bc == null) {
            class_o.field_o_bc = this;
            class_o.method_o_bm(1);
            return;
        }
        class_o.method_o_bm(3);
    }

    @Override
    protected void pauseApp() {
        class_o.method_o_bm(2);
        this.notifyPaused();
    }

    @Override
    protected void destroyApp(boolean bl) {
        class_o.method_o_c();
    }
}