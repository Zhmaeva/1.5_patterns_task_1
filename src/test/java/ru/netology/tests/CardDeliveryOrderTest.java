package ru.netology.tests;

import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryOrderTest {

    @BeforeEach
    void beforeTests() {
        open("http://localhost:9999");
    }
}
