package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100Rub() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldReturn999Rub() {
        assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldReturn1Rub() {
        assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldReturn1000Rub() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldReturn500Rub() {
        assertEquals(service.remain(500), 500);
    }

    @Test
    public void shouldReturn0Rub() {
        assertEquals(service.remain(1000), 0);
    }
}