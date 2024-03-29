import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest {

    Person person;

    @BeforeAll
    public void setup() {
        person = new Person();
    }

    @ParameterizedTest
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    public void check_user_valid(String user){

        assertTrue(person.checkUser(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    public void check_user_not_valid(String user){
        assertTrue(person.checkUser(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123456789", "#$%1234"})
    public void does_not_have_letters(String user){
        assertFalse(person.checkPassword(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    public void does_not_have_numbers(String user){
        assertFalse(person.checkPassword(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abc@123","12$@hbt"})
    public void does_not_have_eight_chars(String user){
        assertFalse(person.checkPassword(user));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abC123456$","Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    public void check_password_valid(String user){
        assertTrue(person.checkPassword(user));
    }
}
