import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Pet> pets = new ArrayList<>();

    //Constructors//
    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

    //Getters//
    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        child.setFather(father);
        addChild(mother, child);
        addChild(father, child);
    }

    public void addChild(Person parent, Person child) {
        parent.getChildren().add(child);

    }

    public void getGrandChildren() {
        for (Person child : children) {
            for (int i = 0; i < child.getChildren().size(); i++)
                child.getChildren().get(0).getName();
        }
    }
    //pet = een huisdiernaam
    public void addPet(Pet pet, Person owner) {
        owner.pets.add(pet);
    }
    public void addsiblings(Person child1, Person child2){
        child1.getSiblings().add(child2);
        child2.getSiblings().add(child1);
    }
}