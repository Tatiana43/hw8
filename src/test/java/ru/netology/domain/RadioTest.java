package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCheckMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMediumStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckSetStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMaxVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.volumeLevelUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMinVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.volumeLevelDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMediumVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.volumeLevelDown();
        assertEquals(4, radio.getCurrentVolume());
    }

}

