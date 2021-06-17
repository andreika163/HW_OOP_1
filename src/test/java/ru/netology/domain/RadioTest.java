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
        assertEquals(1, rad.volumeUp);
        assertEquals(0, rad.volumeDown);
        assertEquals(0, rad.stationUp);
        assertEquals(0, rad.stationDown);
    }

    @Test
    public void setStationUp () {
        rad.setCurrentStation(4);
        rad.setStationUp(5);
        int expected = 5;
        int actual = rad.setStationUp(5);
        assertEquals(expected,actual);
    }

    @Test
    public void setStationDown () {
        rad.setCurrentStation(5);
        rad.setStationDown(4);
        int expected = 4;
        int actual = rad.setStationDown(4);
        assertEquals(expected,actual);
    }


    @Test
    public void setVolumeDown () {
        rad.setCurrentVolume(1);
        rad.setVolumeDown(0);
        int expected = 0;
        int actual = rad.setVolumeDown(0);
        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeUp () {
        rad.setCurrentVolume(0);
        rad.setVolumeUp(1);
        int expected = 1;
        int actual = rad.setVolumeUp(1);
        assertEquals(expected, actual);
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