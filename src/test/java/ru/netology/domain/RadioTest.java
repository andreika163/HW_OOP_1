package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void stationWork() {
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
    void buttonWork() {
        Radio radio = new Radio();

        assertEquals(0, radio.getCurrentStation());

        radio.pushPrevButton();
        assertEquals(9, radio.getCurrentStation());
        radio.pushPrevButton();
        assertEquals(8, radio.getCurrentStation());

        radio.pushNextButton();
        assertEquals(9, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(0, radio.getCurrentStation());
        radio.pushNextButton();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void volumeWork() {
        Radio radio = new Radio();

        assertEquals(0, radio.getVolume());

        radio.volumeDown();
        assertEquals(0, radio.getVolume());

        radio.volumeUp();
        assertEquals(1, radio.getVolume());
        radio.volumeDown();
        assertEquals(0, radio.getVolume());

        int i = 0;
        while (i < 10) {
            radio.volumeUp();
            i++;
        }
        assertEquals(9, radio.getVolume());
    }
}