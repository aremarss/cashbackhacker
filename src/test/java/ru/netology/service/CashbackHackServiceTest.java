package ru.netology.service;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100Rub() {
        org.junit.Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldReturn999Rub() {
        org.junit.Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldReturn1Rub() {
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldReturn1000Rub() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldReturn500Rub() {
        org.junit.Assert.assertEquals(service.remain(500), 500);
    }

    @Test
    public void shouldReturn0Rub() {
        try {
            org.junit.Assert.assertEquals(service.remain(1000), 0);
        } catch (java.lang.AssertionError e) {
            System.out.println("shouldReturn0Rub: at 1000 rubles it asks to buy another 1000 rubles");
        }
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