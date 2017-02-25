package com.smartweather.android.util;

import android.text.TextUtils;

import com.smartweather.android.db.City;
import com.smartweather.android.db.County;
import com.smartweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by PanShunxing on 2017/2/25.
 */

public class Utility {

    /**
     * 解析返回的省的数据
     * @param response
     * @return
     */
    public static boolean handleProvinceResponse(String response){
        if (TextUtils.isEmpty(response)){
            try {
                JSONArray allProvince = new JSONArray(response);
                for (int i = 0; i < allProvince.length(); i++) {
                    JSONObject provinceObject = allProvince.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析返回的城市数据
     * @param response
     * @param provinceId
     * @return
     */
    public static boolean handleCityResponse(String response, int provinceId){
        if (TextUtils.isEmpty(response)){
            try {
                JSONArray cityArray = new JSONArray(response);
                for (int i=0;i<cityArray.length();i++){
                    JSONObject cityObject = cityArray.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 解析返回的县级数据
     * @param response
     * @param cityId
     * @return
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if (TextUtils.isEmpty(response)){
            try {
                JSONArray countyArray = new JSONArray(response);
                for (int i=0;i<countyArray.length();i++){
                    JSONObject countyObject = countyArray.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.save();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}