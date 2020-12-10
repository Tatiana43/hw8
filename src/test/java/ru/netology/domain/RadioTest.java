package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldCheckMaxStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMinStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMediumStation(){
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldCheckMaxVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMinVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldCheckMediumVolume(){
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

}
