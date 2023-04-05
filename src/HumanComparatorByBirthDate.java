import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class HumanComparatorByBirthDate implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
