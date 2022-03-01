package com.programming.techie;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    ContactManager contactManager;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Printed before all tests");
    }

    @BeforeEach
    public void setup(){
        contactManager = new ContactManager();
    }

    @Test
    public void shouldCreateContact(){
        contactManager.addContact("Mario", "Castañeda", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Should not create a contact if the name is null")
    public void testName(){
        Assertions.assertThrows(RuntimeException.class, () -> contactManager.addContact(null, "Castaño", "0123456789"));
    }

    @Test
    @DisplayName("Should not create a contact if the LastName is null")
    public void testLastName(){
        Assertions.assertThrows(RuntimeException.class, () -> contactManager.addContact("Juanes", null, "0123456789"));
    }

    @Test
    @DisplayName("Initial test on mac")
    @EnabledOnOs(value = OS.MAC, disabledReason = "Enabled only on Mac")
    public void shouldCreateContactOnMac(){
        contactManager.addContact("Mario", "Castañeda", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Initial test on windows")
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "Disabled for windows ")
    public void shouldCreateContactNotOnWindows(){
        contactManager.addContact("Mario", "Castañeda", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Test with assumption")
    public void shouldCreateContactOnAssumption(){
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Mario", "Castañeda", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("Test with repetitions")
    @RepeatedTest(value = 5)
    public void shouldCreateContactMultipleTimes(){
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Mario", "Castañeda", "0123456789");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("Test with different parameters")
    @ParameterizedTest
    @ValueSource(strings = {"0123456789","213456789","12345567"})
    public void shouldCreateContactParametrized(String phoneNumber){
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Mario", "Castañeda", phoneNumber);
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("Test with different parameters with method")
    @ParameterizedTest
    @MethodSource("phoneNumbers")
    @Disabled
    public void shouldCreateContactParametrizedWithMethod(String phoneNumber){
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Mario", "Castañeda", phoneNumber);
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("Test with different parameters with method")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    public void shouldCreateContactParametrizedWithCsv(String phoneNumber){
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
        contactManager.addContact("Mario", "Castañeda", phoneNumber);
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    public static List<String> phoneNumbers(){
        return Arrays.asList("0123456789", "1234567891", "1234567");
    }

    @AfterEach
    public void separator(){
        System.out.println("-------------------------");
    }

    @AfterAll
    public static void finish(){
        System.out.println("All the tests are finished");
    }

}