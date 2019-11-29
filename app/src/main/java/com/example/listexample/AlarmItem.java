package com.example.listexample;

public class AlarmItem {
    private String alarmNumber;
    private String alarmName;
    private String alarmInfo;

    public AlarmItem(String alarmNumber, String alarmName, String alarmInfo) {
        this.alarmNumber = alarmNumber;
        this.alarmName = alarmName;
        this.alarmInfo = alarmInfo;
    }

    public String getAlarmNumber() {
        return alarmNumber;
    }

    public void setAlarmNumber(String alarmNumber) {
        this.alarmNumber = alarmNumber;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public String getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(String alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    @Override
    public String toString() {
        return "AlarmItem{" +
                "alarmNumber=" + alarmNumber +
                ", alarmName='" + alarmName + '\'' +
                ", alarmInfo='" + alarmInfo + '\'' +
                '}';
    }
}
