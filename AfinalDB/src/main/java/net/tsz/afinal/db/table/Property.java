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
package net.tsz.afinal.db.table;

import android.text.TextUtils;
import android.util.Log;

import net.tsz.afinal.utils.FieldUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author michael Young (www.YangFuhai.com)
 * @version 1.0
 * @title 属性
 * @description 【非主键】的【基本数据类型】 都是属性
 * @created 2012-10-10
 */
public class Property {

    private String fieldName;
    private String column;
    private String defaultValue;
    private Class<?> dataType;
    private Field field;

    private Method get;
    private Method set;

    @SuppressWarnings("null")
    public void setValue(Object receiver, Object value) {
        if (set != null && value != null) {
            try {
                if (dataType == String.class) {
                    set.invoke(receiver, value.toString());
                } else if (dataType == int.class || dataType == Integer.class) {
                    if (value.toString().equals("null") || value.equals("")) {
                        value = "0";
                    }
                    set.invoke(receiver, value.equals("") ? null :
                            Integer.parseInt(value.toString()));
                } else if (dataType == float.class || dataType == Float.class) {
                    set.invoke(receiver, value.equals("") ? null :
                            Float.parseFloat(value.toString()));
                } else if (dataType == double.class || dataType == Double.class) {
                    set.invoke(receiver, value.equals("") ? null :
                            Double.parseDouble(value.equals("null") ? "0.00" : value.toString()));
                } else if (dataType == long.class || dataType == Long.class) {
                    set.invoke(receiver, value.equals("") ? null :
                            Long.parseLong(value.toString()));
                } else if (dataType == java.util.Date.class || dataType == java.sql.Date.class) {
                    set.invoke(receiver, value.equals("") ? null :
                            FieldUtils.stringToDateTime(value.toString()));
                } else if (dataType == boolean.class || dataType == Boolean.class) {
                    set.invoke(receiver, value.equals("") ? null :
                            "1".equals(value.toString()));
                } else if (dataType == BigInteger.class) {
                    set.invoke(receiver, value.equals("") ? null :
                            new BigInteger(value.toString()));
                } else if (dataType == BigDecimal.class) {
                    try {
                        set.invoke(receiver, value.equals("") ? null : new BigDecimal(value.toString()));
                    } catch (NumberFormatException n) {
                        set.invoke(receiver, BigDecimal.ZERO);
                        Log.d(this.getClass().getSimpleName(), "NumberFormatException on " + value);
                    }
                } else {
                    set.invoke(receiver, value);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                field.setAccessible(true);
                field.set(receiver, value);
            } catch (Exception e) {
                System.out.println(field.toString());
                e.printStackTrace();
            }
        }
    }

    /**
     * 获取某个实体执行某个方法的结果
     *
     * @param obj key
     * @return value
     */
    @SuppressWarnings("unchecked")
    public <T> T getValue(Object obj) {
        if (obj != null && get != null) {
            try {
                return (T) get.invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Class<?> getDataType() {
        return dataType;
    }

    public void setDataType(Class<?> dataType) {
        this.dataType = dataType;
    }

    public Method getGet() {
        return get;
    }

    public void setGet(Method get) {
        this.get = get;
    }

    public Method getSet() {
        return set;
    }

    public void setSet(Method set) {
        this.set = set;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

}
