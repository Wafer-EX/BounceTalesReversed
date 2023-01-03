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

import com.nokia.mid.ui.FullCanvas;

public abstract class Canvas extends Displayable {
    public static final int UP = 1;
    public static final int DOWN = 6;
    public static final int LEFT = 2;
    public static final int RIGHT = 5;
    public static final int FIRE = 8;
    public static final int GAME_A = 9;
    public static final int GAME_B = 10;
    public static final int GAME_C = 11;
    public static final int GAME_D = 12;
    public static final int KEY_NUM1 = 49;
    public static final int KEY_NUM2 = 50;
    public static final int KEY_NUM3 = 51;
    public static final int KEY_NUM4 = 52;
    public static final int KEY_NUM5 = 53;
    public static final int KEY_NUM6 = 54;
    public static final int KEY_NUM7 = 55;
    public static final int KEY_NUM8 = 56;
    public static final int KEY_NUM9 = 57;
    public static final int KEY_STAR = 42;
    public static final int KEY_POUND = 35;

    public int getGameAction(int keyCode) {
        return switch (keyCode) {
            case Canvas.KEY_NUM1, FullCanvas.KEY_SOFTKEY1 -> Canvas.GAME_A;
            case Canvas.KEY_NUM2, FullCanvas.KEY_UP_ARROW -> Canvas.UP;
            case Canvas.KEY_NUM3, FullCanvas.KEY_SOFTKEY2 -> Canvas.GAME_B;
            case Canvas.KEY_NUM4, FullCanvas.KEY_LEFT_ARROW -> Canvas.LEFT;
            case Canvas.KEY_NUM5, FullCanvas.KEY_SOFTKEY3 -> Canvas.FIRE;
            case Canvas.KEY_NUM6, FullCanvas.KEY_RIGHT_ARROW -> Canvas.RIGHT;
            case Canvas.KEY_NUM7 -> Canvas.GAME_C;
            case Canvas.KEY_NUM8, FullCanvas.KEY_DOWN_ARROW -> Canvas.DOWN;
            case Canvas.KEY_NUM9 -> Canvas.GAME_D;
            default -> keyCode;
        };
    }

    protected void setFullScreenMode(boolean mode) { }

    public void keyPressed(int keyCode) { }

    public void keyReleased(int keyCode) { }

    public void showNotify() { }

    public void hideNotify() { }

    public abstract void paint(Graphics g);
}