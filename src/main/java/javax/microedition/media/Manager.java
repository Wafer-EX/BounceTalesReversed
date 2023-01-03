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

package javax.microedition.media;

import javax.microedition.media.control.Control;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import java.io.InputStream;

public final class Manager {
    public static Player createPlayer(InputStream stream, String type) {
        return new Player() {
            private int currentState = UNREALIZED;
            private Sequencer sequencer;

            @Override
            public void prefetch() {
                try {
                    if (sequencer == null) {
                        sequencer = MidiSystem.getSequencer();
                        sequencer.open();
                        sequencer.setSequence(stream);
                    }
                    currentState = PREFETCHED;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }

            @Override
            public void start() {
                sequencer.start();
                currentState = STARTED;
            }

            @Override
            public void stop() {
                sequencer.stop();
                currentState = PREFETCHED;
            }

            @Override
            public void deallocate() { }

            @Override
            public void close() {
                sequencer.close();
                currentState = CLOSED;
            }

            @Override
            public int getState() {
                return currentState;
            }

            @Override
            public void setLoopCount(int count) {
                switch (count) {
                    case -1 -> sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
                    default -> sequencer.setLoopCount(count - 1);
                }
            }

            @Override
            public Control getControl(String controlType) {
                return null;
            }
        };
    }
}