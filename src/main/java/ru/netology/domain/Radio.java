package ru.netology.domain;

public class Radio {
    private int currentStation;
    public int volume;

    public void pushNextButton() {
        if (this.currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    public void pushPrevButton() {
        if (this.currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation--;
        }
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    private boolean volumeMax() {
        return this.volume == 9;
    }

    private boolean volumeMin() {
        return this.volume == 0;
    }

    public void volumeUp() {
        if (this.volumeMax()) {
            return;
        }
        this.volume++;
    }

    public void volumeDown() {
        if (this.volumeMin()) {
            return;
        }
        this.volume--;
    }

    public int getVolume() {
        return volume;
    }
}
