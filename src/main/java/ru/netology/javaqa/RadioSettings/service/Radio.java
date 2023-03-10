package ru.netology.javaqa.RadioSettings.service;

public class Radio {
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private final int maxRadioStation;
    private int minRadioStation;
    private int currentRadioStation;

    public Radio() {
        this.maxVolume = 100;
        this.minVolume = 0;
        this.maxRadioStation = 9;
        this.minRadioStation = 0;
    }


    public Radio(int size) {
        this.maxRadioStation = size - 1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            newCurrentRadioStation = maxRadioStation;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            newCurrentRadioStation = minRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume ++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume --;
        }
    }


    public void nextStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }
}
