import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonTest {

    Person person;

    @BeforeEach
    public void setup(){

        person = new Person("Paul", "McCartney", 2000, true, true, true);
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

        person.setPensioner(false);
        person.setPublicServer(false);
        person.setAnotherCompanyOwner(false);

        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() throws Exception{

        assertFalse(person.isMEI());
    }






}
