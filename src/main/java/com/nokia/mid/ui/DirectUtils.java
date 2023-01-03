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

package com.nokia.mid.ui;

import javax.microedition.lcdui.Graphics;
import java.awt.*;

public class DirectUtils {
    public static DirectGraphics getDirectGraphics(Graphics g) {
        return (xPoints, xOffset, yPoints, yOffset, nPoints, argbColor) -> {
            g.seGraphics.setColor(new Color(argbColor, true));
            g.seGraphics.fillPolygon(xPoints, yPoints, nPoints);
        };
    }
}