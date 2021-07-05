package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setCurrentStation(4);
        radio.setCurrentStation(10);
        assertEquals(4, radio.getCurrentStation());

        radio.setCurrentStation(-1);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void pushPrevButton() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentStation());

        radio.pushPrevButton();
        assertEquals(9, radio.getCurrentStation());
        radio.pushPrevButton();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void pushNextButton() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentStation());

        radio.pushNextButton();
        assertEquals(1, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(2, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(3, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(4, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(5, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(6, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(7, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(8, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(9, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void volumeDownAfterZero() {
        Radio radio = new Radio();
        assertEquals(0, radio.getVolume());

        radio.volumeDown();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void increaseVolumeToTen() {
        Radio radio = new Radio();
        int i = 0;
        while (i <= 10) {
            radio.volumeUp();
            i++;
        }
        assertEquals(10, radio.getVolume());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();
        radio.volumeUp();
        assertEquals(1, radio.getVolume());
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();
        radio.volumeUp();
        assertEquals(1, radio.getVolume());
        radio.volumeDown();
        assertEquals(0,radio.getVolume());

    }

}