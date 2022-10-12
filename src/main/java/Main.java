public class Main {
    public static void main(String[] args) {

        Person person = new Person("jeremy", "koster", "male", 31);
        Person person1 = new Person("jade", "koster", "female", 11);
        Person grandfather = new Person("piet", "koster", "male",60);
        Person father = new Person("jeremy", "koster", "male", 31);
        Person child1 = new Person("jade", "koster", "female", 11);
        Person child2 = new Person("aurora","koster","female",3);
        Pet pet = new Pet("Charlie", 2, "golden");


       father.addChild(father,child1);
       father.addChild(father,child2);
       pet.setOwner(person1);
       child1.addsiblings(child1,child2);

        System.out.println(pet.getName()+" is de hond van  "+pet.getOwner().getName());

        System.out.println(child1.getSiblings().get(0).getName()+" is het zusje van "+ child2.getSiblings().get(0).getName());
    }
}
