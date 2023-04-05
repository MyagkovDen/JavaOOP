import java.time.LocalDate;

public class Service {
    private int id;
    FamilyTree familyTree;

    public Service(FamilyTree familyTree) {
        this.familyTree = familyTree;
    }

    public void addHuman(String status, String name, String surname, LocalDate birthDate, Human mother, Human father){
        familyTree.addKin(new Human(id++, status, name, surname, birthDate, mother, father));
    }

    public void addHuman(String status, String name, String surname, LocalDate birthDate){
        familyTree.addKin(new Human(id++, status, name, surname, birthDate));
    }
}
