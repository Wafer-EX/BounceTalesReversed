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

package javax.microedition.rms;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class RecordStore {
    private static final Hashtable<String, RecordStore> openedRecords = new Hashtable<>();
    public List<byte[]> records = new ArrayList<>();
    private final String recordStoreName = "bounce_tales_saves";

    private RecordStore() { }

    private void writeToFile() {
        try {
            var file = new File(recordStoreName);
            file.delete();

            var fileOutputStream = new FileOutputStream(file, false);
            var objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(records);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try {
            var file = new File(recordStoreName);
            if (file.exists()) {
                var fileInputStream = new FileInputStream(file);
                var objectInputStream = new ObjectInputStream(fileInputStream);
                this.records = (List<byte[]>) objectInputStream.readObject();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static RecordStore openRecordStore(String recordStoreName, boolean createIfNecessary) throws RecordStoreException {
        if (openedRecords.containsKey(recordStoreName)) {
            return openedRecords.get(recordStoreName);
        }
        else {
            var recordStore = new RecordStore();
            recordStore.readFromFile();
            openedRecords.put(recordStoreName, recordStore);
            return recordStore;
        }
    }

    public int getNumRecords() {
        return records.size();
    }

    public int addRecord(byte[] arr, int offset, int numBytes) {
        if (arr == null) {
            arr = new byte[0];
        }
        byte[] subArray = Arrays.copyOfRange(arr, offset, offset + numBytes);
        records.add(subArray);
        writeToFile();
        return records.size();
    }

    public void setRecord(int recordId, byte[] arr, int offset, int numBytes) throws RecordStoreException {
        if (records.size() < recordId) {
            throw new RecordStoreException();
        }
        byte[] subArray = Arrays.copyOfRange(arr, offset, offset + numBytes);
        records.set(recordId - 1, subArray);
        writeToFile();
    }

    public void closeRecordStore() throws RecordStoreException { }

    public byte[] getRecord(int recordId) throws RecordStoreException {
        return records.get(recordId - 1);
    }
}