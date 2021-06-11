package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio rad = new Radio();

    @Test
    void initiateLines() {
        assertEquals(0, rad.currentStation);
        assertEquals(0, rad.currentVolume);
        assertEquals(9, rad.maxStation);
        assertEquals(0, rad.minStation);
        assertEquals(0, rad.minVolume);
        assertEquals(10, rad.maxVolume);
    }

    @Test
    public void setStation() {
        String expected = "3";
        assertNull(rad.getSelectStation());
        rad.setSelectStation("3");
        assertEquals(expected, rad.getSelectStation());
    }

    @Test
    public void minStationAfterMaxStation() {
            rad.setMaxStation(9);
            rad.setMinStation(0);
            rad.setCurrentStation(0);
            rad.setCurrentStation(10);
            int expected = 0;
            int actual = rad.getCurrentStation();
            assertEquals(expected, actual);
        }

    @Test
    public void MaxStationAfterMinStation() {
            rad.setMaxStation(9);
            rad.setMinStation(0);
            rad.setCurrentStation(9);
            rad.setCurrentStation(10);
            int expected = 9;
            int actual = rad.getCurrentStation();
            assertEquals(expected, actual);
        }

    @Test
    public void tapStationUp() {
            rad.setMaxStation(9);
            rad.setMinStation(0);
            rad.setCurrentStation(2);
            rad.setCurrentStation(3);
            int expected = 3;
            int actual = rad.getCurrentStation();
            assertEquals(expected, actual);
        }

    @Test
    public void tapStationDown() {
            rad.setMaxStation(9);
            rad.setMinStation(0);
            rad.setCurrentStation(5);
            rad.setCurrentStation(4);
            int expected = 4;
            int actual = rad.getCurrentStation();
            assertEquals(expected, actual);
        }

    @Test
    public void setCurrentStationMoreMax(){
            rad.setMaxStation(9);
            rad.setMinStation(0);
            rad.setCurrentStation(0);
            rad.setCurrentStation(10);
            int expected = 0;
            int actual = rad.getCurrentStation();
            assertEquals(expected, actual);
        }

    @Test
    public void setCurrentStationMoreMin(){
            rad.setMaxStation(9);
            rad.setMinStation(0);
            rad.setCurrentStation(0);
            rad.setCurrentStation(-1);
            int expected = 0;
            int actual = rad.getCurrentStation();
            assertEquals(expected, actual);
        }

    @Test
    public void setVolumeMoreMax() {
            rad.setMaxVolume(10);
            rad.setMinVolume(0);
            rad.setCurrentVolume(10);
            rad.setCurrentVolume(11);
            int expected = 10;
            int actual = rad.getCurrentVolume();
            assertEquals(expected, actual);
        }

    @Test
    public void setVolumeMoreMin() {
            rad.setMaxVolume(10);
            rad.setMinVolume(0);
            rad.setCurrentVolume(0);
            rad.setCurrentVolume(-1);
            int expected = 0;
            int actual = rad.getCurrentVolume();
            assertEquals(expected, actual);
        }

    @Test
    public void setMaxVolume() {
            rad.setCurrentVolume(5);
            rad.setMaxVolume(10);
            int expected = 10;
            int actual = rad.getMaxVolume();
            assertEquals(expected, actual);
        }

    @Test
    public void setMinVolume() {
            rad.setCurrentVolume(5);
            rad.setMinVolume(0);
            int expected = 0;
            int actual = rad.getMinVolume();
            assertEquals(expected, actual);
        }
}