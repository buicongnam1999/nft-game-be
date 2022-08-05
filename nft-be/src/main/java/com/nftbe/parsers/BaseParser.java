package com.nftbe.parsers;

import org.apache.logging.log4j.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

import static java.lang.Boolean.FALSE;

public abstract class BaseParser<T, U> {
    public abstract T convertJson(U u);
    public abstract T convertJson(String json);
    public abstract U convertObject(T t);

    protected static String getString(JSONObject jsonObject, String key) throws JSONException {
        return jsonObject.has(key) ? jsonObject.getString(key) : Strings.EMPTY;
    }

    protected static int getInt(JSONObject jsonObject, String key) throws JSONException {
        return jsonObject.has(key) ? jsonObject.getInt(key) : 0;
    }

    protected static Long getLong(JSONObject jsonObject, String key) throws JSONException {
        return jsonObject.has(key) ? jsonObject.getLong(key) : 0;
    }

    protected static Double getDouble(JSONObject jsonObject, String key) throws JSONException {
        return jsonObject.has(key) ? jsonObject.getDouble(key) : 0;
    }

    protected static Boolean getBoolean(JSONObject jsonObject, String key) throws JSONException {
        return jsonObject.has(key) ? jsonObject.getBoolean(key) : FALSE;
    }
}
