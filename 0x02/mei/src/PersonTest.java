import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setup(){
        person = new Person("Paul", "McCartney", Date.valueOf("2000-01-01"), true, true, true);
    }

    @Test
    void show_full_name(){
        assertEquals("Paul McCartney", person.fullname());
    }

    @Test
    void test_calculateYearlySalary(){
        person.setSalary(1200);
        assertEquals(14400,person.calculateYearlySalary());
    }

    @Test
    void person_is_MEI(){

        person.setPensioner(true);
        person.setPublicServer(true);
        person.setAnotherCompanyOwner(true);
        person.setSalary(100);

        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI(){

        person.setPensioner(false);
        person.setPublicServer(false);
        person.setAnotherCompanyOwner(false);
        person.setSalary(5000);

        assertFalse(person.isMEI());
    }






}
