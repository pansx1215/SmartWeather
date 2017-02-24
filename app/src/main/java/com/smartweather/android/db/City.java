package com.smartweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by PanShunxing on 2017/2/24.
 */

public class City extends DataSupport {

    private int id;                 //城市的ID
    private String cityName;        //城市名称
    private int cityCode;           //城市的代号
    private int provinceId;         //当前城市所属省份的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
