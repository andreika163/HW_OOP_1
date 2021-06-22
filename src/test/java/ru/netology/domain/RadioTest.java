package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio rad = new Radio();

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
    for (int st = 0; st <= 9; st++){
    System.out.println(st);
    }
    }

    @Test
    public void tapStationDown() {
    for (int st = 9; st >= 0; st--){
    System.out.println(st);
    }
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
    public void setVolumeDown() {
    for (int volume = 10; volume >=0; volume--) {
    System.out.println(volume);
    }
    }

    @Test
    public void setVolumeUp() {
    for (int volume = 0; volume <= 10; volume ++) {
    System.out.println(volume);
    }
    }
   }