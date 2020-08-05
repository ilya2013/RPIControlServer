package ru.bis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.bis.dao.model.DhtModel;

public class DhtDTO {
    @JsonProperty("device_name")
    private String deviceName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("temperature")
    private String temperature;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("sensor_model")
    private String sensorModel;
    @JsonProperty("pin")
    private String pin;
    @JsonProperty("time")
    private String time;
    @JsonProperty("comment")
    private String comment;

    public static DhtModel toDhtModel(DhtDTO dhtDTO){
        DhtModel dhtModel = new DhtModel();
        dhtModel.setDeviceName(dhtDTO.deviceName);
        dhtModel.setLocation(dhtDTO.location);
        dhtModel.setTemperature(dhtDTO.temperature);
        dhtModel.setHumidity(dhtDTO.humidity);
        dhtModel.setSensorModel(dhtDTO.sensorModel);
        dhtModel.setPin(dhtDTO.pin);
        dhtModel.setTime(dhtDTO.time);
        dhtModel.setComment(dhtDTO.comment);
       return dhtModel;
    }

    @Override
    public String toString() {
        return "DHT{" +
                "deviceName='" + deviceName + '\'' +
                ", location='" + location + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", sensorModel='" + sensorModel + '\'' +
                ", pin='" + pin + '\'' +
                ", time='" + time + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
