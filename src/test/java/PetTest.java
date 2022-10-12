import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void shouldAddPetOwner() {
        //arrange object aanmaken
        Pet pet = new Pet("Charlie", 2, "golden");
        Person person = new Person("jeremy", "koster", "male", 31);

        //act
        pet.addPetOwner(pet,person);
        //assert
        assertEquals("jeremy",pet.getOwner().getName());
    }
}