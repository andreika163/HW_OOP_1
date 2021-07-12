package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void pushNextButton() {
        Radio radio = new Radio();

        assertEquals(0,radio.getCurrentStation());

        radio.pushNextButton();
        assertEquals(1,radio.getCurrentStation());

        radio.setCurrentStation(9);
        radio.pushNextButton();
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void pushPrevButton() {
        Radio radio = new Radio();

        radio.pushPrevButton();
        assertEquals(9, radio.getCurrentStation());
        radio.pushPrevButton();
        assertEquals(8, radio.getCurrentStation());

        radio.setCurrentStation(0);
        radio.pushPrevButton();
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void volumeUp() {
        Radio radio = new Radio();

        radio.setVolume(0);

        radio.volumeUp();
        assertEquals(1,radio.getVolume());
        radio.volumeUp();
        assertEquals(2,radio.getVolume());

        radio.setVolume(10);
        radio.volumeUp();
        assertEquals(10,radio.getVolume());
    }

    @Test
    void volumeDown() {
        Radio radio = new Radio();

        radio.setVolume(0);

        radio.volumeDown();
        assertEquals(0, radio.getVolume());

        radio.setVolume(10);
        radio.volumeDown();
        assertEquals(9,radio.getVolume());
    }

    @Test
    void setVolume(){
        Radio radio =new Radio();
        radio.setVolume(7);
        assertEquals(7,radio.getVolume());
    }
}