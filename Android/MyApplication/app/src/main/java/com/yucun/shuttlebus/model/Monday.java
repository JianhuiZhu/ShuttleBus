package com.yucun.shuttlebus.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by yucunli on 2015-06-29.
 */
@ParseClassName("Monday")
public class Monday extends ParseObject {

    public String getCampus() {
        return getString("campus");
    }

    public void setCampus(String campus) {
        put("campus", campus);
    }

    public String getDepart_time() {
        return getString("depart_time");
    }

    public void setDepart_time(String depart_time) {
        put("depart_time", depart_time);
    }

    public String getTime_order() {
        return getString("time_order");
    }

    public void setTime_order(String time_order) {
        put("time_order", time_order);
    }

    public static ParseQuery<Monday> getQuery() {
        return ParseQuery.getQuery(Monday.class);
    }
}