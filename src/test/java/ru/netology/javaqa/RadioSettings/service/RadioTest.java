package ru.netology.javaqa.RadioSettings.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {





    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifMMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSizeStation() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(19, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }


    @Test
    public void shouldNextRadioStation() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(23);

        radio.nextStation();

        int expected = 24;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextIfRadioStationMax() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifNextRadioStationAnderMin() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(-1);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevIfIfRadioStationAboveMax() {
        Radio radio = new Radio(5);
        radio.setCurrentRadioStation(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevIfRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


}
