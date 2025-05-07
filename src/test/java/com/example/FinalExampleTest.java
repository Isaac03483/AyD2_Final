package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.FinalExample.Order;
import com.example.FinalExample.ReportGenerator;

public class FinalExampleTest {
    
    private final String NAME = "name";
    private final String EMAIL = "email@test.com";
    private final String PHONE = "1234567";
    private final String ADDRESS = "address test";
    private final String CITY = "city";
    private final String ZIP = "zip";
    private final String EXPECTED_NAME_ERROR = "Name cannot be empty";
    private final String EXPECTED_EMAIL_ERROR = "Invalid email";
    private final String EXPECTED_USER_CREATED = "User created: ";
    private final double[] DIMENSIONS = {2, 4};
    private final String CIRCLE = "circle";
    private final String RECTANGLE = "rectangle";
    private final String TRIANGLE = "triangle";
    private final String CUSTOMER = "customer";
    private final List<String> ITEMS = List.of("item1", "item2", "item3");
    private final double TOTAL = 10.00;

    private FinalExample finalExample;
    private ReportGenerator reportGenerator;
    private Order order;

    @BeforeEach
    void setUp() {
        this.finalExample = new FinalExample();
        this.reportGenerator = this.finalExample.new ReportGenerator();
        this.order = this.finalExample.new Order();
    }


    @Test
    void shouldCreateUser() {
        final String EXPECTED = EXPECTED_USER_CREATED + NAME;
        String actual = this.finalExample.createUser(NAME, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void shouldNotCreateUserByNameNull() {
        String actual = this.finalExample.createUser(null, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        assertEquals(EXPECTED_NAME_ERROR, actual);
    }

    @Test
    void shouldNotCreateUserByNameEmpty() {
        String actual = this.finalExample.createUser("", EMAIL, PHONE, ADDRESS, CITY, ZIP);
        assertEquals(EXPECTED_NAME_ERROR, actual);
    }

    @Test
    void shouldNotCreateUserByEmailNull() {
        String actual = this.finalExample.createUser(NAME, null, PHONE, ADDRESS, CITY, ZIP);
        assertEquals(EXPECTED_EMAIL_ERROR, actual);
    }

    @Test
    void shouldNotCreateUserByEmailEmpty() {
        String actual = this.finalExample.createUser(NAME, "", PHONE, ADDRESS, CITY, ZIP);
        assertEquals(EXPECTED_EMAIL_ERROR, actual);
    }

    @Test
    void shouldCalculateCircle() {
        final double EXPECTED = Math.PI * this.DIMENSIONS[0] * this.DIMENSIONS[0];
        double actual = this.finalExample.calculateArea(CIRCLE, this.DIMENSIONS);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void shouldCalculateRectangle() {
        final double EXPECTED = this.DIMENSIONS[0] * this.DIMENSIONS[1];
        double actual = this.finalExample.calculateArea(RECTANGLE, DIMENSIONS);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void shouldCalculateTriangle() {
        final double EXPECTED = this.DIMENSIONS[0] * this.DIMENSIONS[1] / 2;
        double actual = this.finalExample.calculateArea(TRIANGLE, DIMENSIONS);
        assertEquals(EXPECTED, actual);
    }

    @Test
    void shouldNotCalculate() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.finalExample.calculateArea("", this.DIMENSIONS);
        });
    }

    @Test
    void shouldPrintHeader() {
        this.reportGenerator.printHeader(CUSTOMER);
    }

    @Test
    void shouldProccessData() {
        String data = "abcdefghijk,abc,defg";
        this.finalExample.processData(data);
    }
}
