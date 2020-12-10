package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume){
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume){
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

}
