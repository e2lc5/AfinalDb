/**
 * Copyright (c) 2012-2013, Michael Yang 杨福海 (www.yangfuhai.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.tsz.afinal.db.sqlite;

import android.text.TextUtils;

import java.util.HashMap;

public class DbModel {
    private static int DEFAULT_INT = 0;
    private static double DEFAULT_DOUBLE = 0;
    private static float DEFAULT_FLOAT = 0;
    private static long DEFAULT_LONG = 0;
    private static boolean DEFAULT_BOOLEAN = false;

    private HashMap<String, Object> dataMap = new HashMap<String, Object>();

    public Object get(String column) {
        return dataMap.get(column);
    }

    public String getFirstKey() {
        return (String) dataMap.keySet().toArray()[0];
    }

    public String getString(String column) {
        return String.valueOf(get(column));
    }

    public int getInt(String column) {
        if (TextUtils.isEmpty(getString(column))
                || getString(column).equals("null")
                || getString(column).equals("NULL"))
            return DEFAULT_INT;
        else
            return Integer.valueOf(getString(column));
    }

    public boolean getBoolean(String column) {
        if (TextUtils.isEmpty(getString(column))
                || getString(column).equals("null")
                || getString(column).equals("NULL"))
            return DEFAULT_BOOLEAN;
        else
            return Boolean.valueOf(getString(column));
    }

    public double getDouble(String column) {
        if (TextUtils.isEmpty(getString(column))
                || getString(column).equals("null")
                || getString(column).equals("NULL"))
            return DEFAULT_DOUBLE;
        else
            return Double.valueOf(getString(column));
    }

    public float getFloat(String column) {
        if (TextUtils.isEmpty(getString(column))
                || getString(column).equals("null")
                || getString(column).equals("NULL"))
            return DEFAULT_FLOAT;
        else
            return Float.valueOf(getString(column));
    }

    public long getLong(String column) {
        if (TextUtils.isEmpty(getString(column))
                || getString(column).equals("null")
                || getString(column).equals("NULL"))
            return DEFAULT_LONG;
        return Long.valueOf(getString(column));
    }

    public void set(String key, Object value) {
        dataMap.put(key, value);
    }

    public HashMap<String, Object> getDataMap() {
        return dataMap;
    }
}
