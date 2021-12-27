package ru.netology.service;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    @org.junit.jupiter.api.Test
    public void shouldReturn100RubJupiter() {
        assertEquals(service.remain(900), 100);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn999RubJupiter() {
        assertEquals(service.remain(1), 999);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn1RubJupiter() {
        assertEquals(service.remain(999), 1);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn1000RubJupiter() {
        assertEquals(service.remain(0), 1000);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn500RubJupiter() {
        assertEquals(service.remain(500), 500);
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0RubJupiter() {
        assertEquals(service.remain(1000), 0);
    }
}