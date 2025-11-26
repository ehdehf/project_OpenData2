package com.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirQualityDTO {
    private String sidoName;
    private String stationName;
    private String dataTime;
    private int pm10Value;
    private int pm25Value;
    private double o3Value;
    private double no2Value;
    private double so2Value;
    private double coValue;
    private int pm10Grade;
    private int pm25Grade;
    private int o3Grade;
    private int no2Grade;
    private int khaiValue;
    private int khaiGrade;
    private double dmY;
    private double dmX;
}
