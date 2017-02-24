package com.smartweather.android.db;


import org.litepal.crud.DataSupport;

/**
 * Created by PanShunxing on 2017/2/24.
 */

public class Province extends DataSupport {

    private int id;                 //当前省份的ID
    private String provinceName;    //省的名称
    private int provinceCode;       //省份对应的代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
