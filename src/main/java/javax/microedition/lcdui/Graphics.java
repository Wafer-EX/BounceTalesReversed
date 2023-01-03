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

package javax.microedition.lcdui;

import utils.FontUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Graphics {
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;
    public static final int SOLID = 0;
    public static final int DOTTED = 1;

    public final Graphics2D seGraphics;
    private Font meFont;

    public Graphics(java.awt.Graphics seGraphics) {
        this.seGraphics = (Graphics2D) seGraphics;
    }

    public void setColor(int rgb) {
        seGraphics.setColor(new Color(rgb));
    }

    public void setFont(Font font) {
        this.meFont = font;
    }

    public int getClipX() {
        var clipBounds = seGraphics.getClipBounds();
        return clipBounds == null ? 0 : clipBounds.x;
    }

    public int getClipY() {
        var clipBounds = seGraphics.getClipBounds();
        return clipBounds == null ? 0 : clipBounds.y;
    }

    public int getClipWidth() {
        var clipBounds = seGraphics.getClipBounds();
        return clipBounds == null ? 240 : clipBounds.width;
    }

    public int getClipHeight() {
        var clipBounds = seGraphics.getClipBounds();
        return clipBounds == null ? 240 : clipBounds.height;
    }

    public void setClip(int x, int y, int width, int height) {
        seGraphics.setClip(x, y, width, height);
    }

    public void fillRect(int x, int y, int width, int height) {
        seGraphics.fillRect(x, y, width, height);
    }

    public void drawRect(int x, int y, int width, int height) {
        seGraphics.drawRect(x, y, width, height);
    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        seGraphics.fillArc(x, y, width, height, startAngle, arcAngle);
    }

    public void drawSubstring(String str, int offset, int len, int x, int y, int anchor) {
        if (str == null) {
            throw new NullPointerException();
        }
        if (offset < str.length()) {
            if (offset + len > str.length()) {
                len = str.length() - offset;
            }
            String substring = str.substring(offset, offset + len);
            x = FontUtils.alignX(meFont, str, x, anchor);
            y = FontUtils.alignY(meFont, str, y, anchor);
            seGraphics.setFont(meFont.seFont);
            seGraphics.drawString(substring, x, y);
        }
    }

    public void drawRegion(Image src, int x_src, int y_src, int width, int height, int transform, int x_dest, int y_dest, int anchor) {
        if (src != null && width > 0 && height > 0) {
            var imageRegion = src.seImage.getSubimage(x_src, y_src, width, height);
            if (transform == 6) {
                int regionWidth = imageRegion.getHeight();
                int regionHeight = imageRegion.getWidth();

                var rotatedImage = new BufferedImage(regionWidth, regionHeight, BufferedImage.TYPE_INT_ARGB);
                var graphics2D = rotatedImage.createGraphics();
                int translate = (regionWidth - regionHeight) >> 1;

                graphics2D.translate(translate, translate);
                graphics2D.rotate(Math.PI / 2 * 3, width / 2.0, height / 2.0);
                graphics2D.drawRenderedImage(imageRegion, null);

                imageRegion = rotatedImage;
            }
            seGraphics.drawImage(imageRegion, x_dest, y_dest, width, height, null);
        }
    }

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int[] xPoints = new int[] { x1, x2, x3 };
        int[] yPoints = new int[] { y1, y2, y3 };
        seGraphics.fillPolygon(xPoints, yPoints, 3);
    }

    public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height, boolean processAlpha) {
        if (rgbData == null) {
            throw new NullPointerException();
        }
        if (width > 0 && height > 0) {
            var image = new BufferedImage(width, height, processAlpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB);
            image.setRGB(0, 0, width, height, rgbData, offset, scanlength);
            seGraphics.drawImage(image, x, y, null);
        }
    }
}