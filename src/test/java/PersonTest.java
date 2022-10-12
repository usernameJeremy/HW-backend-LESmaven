import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldAddChild() {
        //arrange object aanmaken
        Person parent = new Person("Bas", "van der", "Kamp", "Male", 23);
        Person child = new Person("Marije", "van der Kamp", "Female", 28);

        List<Person> children = new ArrayList<>();
        children.add(child);

        //act
        parent.addChild(parent, child);


        //assert
        assertEquals("Bas", parent.getName());
        assertEquals("Marije", parent.getChildren().get(0).getName());
        assertEquals("van der Kamp", parent.getChildren().get(0).getLastName());
    }


    @Test
    void shouldAddParents() {
        //arrange OBJECT
        Person father = new Person("jeremy", "koster", "male", 31);
        Person mother = new Person("moeder","vanjade","female",35);
        Person child = new Person("jade", "koster", "female", 11);

        //act welke methodes test je?
        child.addParents(father, mother, child);

        //assert welke uitkomst verwacht je
        assertEquals("jeremy",child.getFather().getName());
        assertEquals("moeder",child.getMother().getName());
        assertEquals("jade",child.getName());
    }



    @Test
    void shouldGetGrandChildren() {
        //arrange OBJECT
        Person grandfather = new Person("piet", "koster", "male",60);
        Person father = new Person("jeremy", "koster", "male", 31);
        Person child1 = new Person("jade", "koster", "female", 11);
        Person child2 = new Person("aurora","koster","female",3);

        List<Person> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(father);
        father.addChild(father,child1);
        father.addChild(father,child2);
        grandfather.addChild(grandfather,father);

        //act welke methodes test je?
        grandfather.getGrandChildren();

        //assert welke uitkomst verwacht je
        assertEquals("jade",grandfather.getChildren().get(0).getChildren().get(0).getName());




    }

    @Test
    void shouldAddPet() {
        //arrange OBJECT aanmaken
        Pet pet = new Pet("Charlie", 2, "golden");
        Person owner = new Person("jade", "koster", "female", 11);
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(pet);
        //act welke methodes test je?
        owner.addPet(pet ,owner);
        //assert welke uitkomst verwacht je
        assertEquals("jade",owner.getName());
        assertEquals("Charlie",owner.getPets().get(0).getName());
    }

    @Test
    void shouldAddSibling() {
        //arrange OBJECT
        Person child1 = new Person("jade", "koster", "female", 11);
        Person child2 = new Person("aurora","koster","female",3);
        List<Person> siblings = new ArrayList<>();

        //act welke methodes test je?
        child1.addsiblings(child1,child2);
        child2.addsiblings(child2,child1);


        //assert welke uitkomst verwacht je
        assertEquals("jade",child1.getName());
        assertEquals("aurora",child2.getName());




    }
}