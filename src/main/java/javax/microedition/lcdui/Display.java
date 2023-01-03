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

import javax.microedition.midlet.MIDlet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Display {
    public final JFrame frame = new JFrame();
    private static final Display display = new Display();

    public static Display getDisplay(MIDlet midlet) {
        return display;
    }

    public void setCurrent(Displayable nextDisplayable) {
        for (var keyListener : frame.getKeyListeners()) {
            frame.removeKeyListener(keyListener);
        }

        if (nextDisplayable instanceof Canvas canvas) {
            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) { }

                @Override
                public void keyPressed(KeyEvent e) {
                    canvas.keyPressed(switch (e.getKeyCode()) {
                        case KeyEvent.VK_ENTER -> FullCanvas.KEY_SOFTKEY3;
                        case KeyEvent.VK_1 -> FullCanvas.KEY_SOFTKEY1;
                        case KeyEvent.VK_2 -> FullCanvas.KEY_SOFTKEY2;
                        case KeyEvent.VK_Q -> FullCanvas.KEY_STAR;
                        case KeyEvent.VK_W -> FullCanvas.KEY_POUND;
                        case KeyEvent.VK_UP -> FullCanvas.KEY_UP_ARROW;
                        case KeyEvent.VK_DOWN -> FullCanvas.KEY_DOWN_ARROW;
                        case KeyEvent.VK_LEFT -> FullCanvas.KEY_LEFT_ARROW;
                        case KeyEvent.VK_RIGHT -> FullCanvas.KEY_RIGHT_ARROW;
                        default -> 0;
                    });
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    canvas.keyReleased(switch (e.getKeyCode()) {
                        case KeyEvent.VK_ENTER -> FullCanvas.KEY_SOFTKEY3;
                        case KeyEvent.VK_1 -> FullCanvas.KEY_SOFTKEY1;
                        case KeyEvent.VK_2 -> FullCanvas.KEY_SOFTKEY2;
                        case KeyEvent.VK_Q -> FullCanvas.KEY_STAR;
                        case KeyEvent.VK_W -> FullCanvas.KEY_POUND;
                        case KeyEvent.VK_UP -> FullCanvas.KEY_UP_ARROW;
                        case KeyEvent.VK_DOWN -> FullCanvas.KEY_DOWN_ARROW;
                        case KeyEvent.VK_LEFT -> FullCanvas.KEY_LEFT_ARROW;
                        case KeyEvent.VK_RIGHT -> FullCanvas.KEY_RIGHT_ARROW;
                        default -> 0;
                    });
                }
            });

            frame.setContentPane(new JPanel() {
                @Override
                protected void paintComponent(java.awt.Graphics g) {
                    super.paintComponent(g);
                    canvas.paint(new Graphics(g));
                }
            });
            frame.getContentPane().setPreferredSize(new Dimension(canvas.getWidth(), canvas.getHeight()));
        }

        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Bounce Tales");

        frame.pack();
        frame.revalidate();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}