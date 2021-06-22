package ru.netology.domain;

public class Radio {

  public String selectStation;
    public int currentStation;
    public int currentVolume;
    public int maxStation;
    public int minStation;
    public int maxVolume;
    public int minVolume;

    public String getSelectStation() {
        return selectStation;
    }

    public void setSelectStation(String selectStation){
        this.selectStation = selectStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <= maxStation) {
            if (currentStation >= minStation) {
                this.currentStation = currentStation;
            }
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;

    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= maxVolume) {
            if (currentVolume >= minVolume) {
                this.currentVolume = currentVolume;
            }
        }
    }
}