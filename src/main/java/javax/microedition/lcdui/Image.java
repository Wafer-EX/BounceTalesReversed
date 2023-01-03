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

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Image {
    protected final BufferedImage seImage;
    protected final boolean isMutable;

    public Image(BufferedImage image, boolean isMutable) {
        this.seImage = image;
        this.isMutable = isMutable;
    }

    public static Image createImage(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }
        var bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        var graphics = bufferedImage.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, width, height);
        return new Image(bufferedImage, true);
    }

    public static Image createImage(Image source) {
        if (source == null) {
            throw new NullPointerException();
        }
        if (source.isMutable) {
            var bufferedImage = (BufferedImage) source.seImage;
            var colorModel = bufferedImage.getColorModel();
            var isAlphaPremultiplied = colorModel.isAlphaPremultiplied();
            var writableRaster = bufferedImage.copyData(null);
            var bufferedImageClone = new BufferedImage(colorModel, writableRaster, isAlphaPremultiplied, null);
            return new Image(bufferedImageClone, false);
        }
        else {
            return source;
        }
    }

    public static Image createImage(String name) throws IOException {
        if (name == null) {
            throw new NullPointerException();
        }
        var stream = Image.class.getResourceAsStream(name);
        if (stream == null) {
            throw new IOException();
        }
        return new Image(ImageIO.read(stream), false);
    }

    public static Image createImage(byte[] imageData, int imageOffset, int imageLength) {
        if (imageData == null) {
            throw new NullPointerException();
        }
        try {
            var imageInputStream = new ByteArrayInputStream(imageData, imageOffset, imageLength);
            var bufferedImage = ImageIO.read(imageInputStream);
            return new Image(bufferedImage, false);
        }
        catch (IOException exception) {
            throw new IllegalArgumentException(exception);
        }
    }

    public Graphics getGraphics() {
        return new Graphics(seImage.getGraphics());
    }

    public int getWidth() {
        return seImage.getWidth();
    }

    public int getHeight() {
        return seImage.getHeight();
    }

    public static Image createRGBImage(int[] rgb, int width, int height, boolean processAlpha) {
        if (rgb == null) {
            throw new NullPointerException();
        }
        else if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException();
        }
        var image = new BufferedImage(width, height, processAlpha ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB);
        image.setRGB(0, 0, width, height, rgb, 0, width);
        return new Image(image, false);
    }

    public void getRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {
        seImage.getRGB(x, y, width, height, rgbData, offset, scanlength);
    }
}