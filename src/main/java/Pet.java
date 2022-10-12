import java.util.ArrayList;
import java.util.List;

public class Pet {

        private String name;
        private int age;
        private String species;
        private Person owner;

        //CONSTRUCTOR

        public Pet(String name, int age, String species) {
            this.name = name;
            this.age = age;
            this.species = species;

        }

        public Pet() {
        }
        //GETTERS

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSpecies() {
            return species;
        }

        public Person getOwner() {
            return owner;
        }
        //SETTERS

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSpecies(String species) {
            this.species = species;
        }

        public void setOwner(Person owner) {
            this.owner = owner;
        }


        public void addPetOwner(Pet pet, Person owner) {
            pet.setOwner(owner);
        }
}



