import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class CarTest {
    private Car car1;
    private Car car2;
  @BeforeAll
  public void setUp() {
    car1 = new Car (2015,2002);
    car2 = new Car (2013,2000);
  }
 @Test
 public void shouldSortAsc() {
     ArrayList<Car> sortCarList = new ArrayList<>();
     sortCarList.add(car1);
     sortCarList.add(car2);
     ArrayList<Car> carList = new ArrayList<>();
     carList.add(car1);
     carList.add(car2);
     Collections.sort(sortCarList);
     Assertions.assertNotEquals(carList, sortCarList);
 }
    @Test
    public void testTreeSet() {
        TreeSet<Car> setSort = new TreeSet<>(new EngineCapacityComparator());
        setSort.add(car1);
        setSort.add(car2);
        TreeSet<Car> set2 = new TreeSet<>();
        set2.add(car1);
        set2.add(car2);
        Assertions.assertEquals(set2, setSort);
    }
}


