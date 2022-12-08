import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.sql.Time;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Car, CarInfo> cars = new HashMap<Car, CarInfo>();
        cars.put(
                new Car(1, "07KG777TRR"),
                new CarInfo(LocalDate.of(1995, 3, 26), "Toyota Mark||", 200000,"Red"));

        cars.put(
                new Car(2, "07KG007OOT"),
                new CarInfo(LocalDate.of(1990, 2, 7), "Toyota Supra", 500000,"Black"));

        cars.put(
                new Car(3, "01KG111LLL"),
                new CarInfo(LocalDate.of(2022, 1, 1), "TESLA X", 300000,"White"));
        System.out.println(cars.entrySet());
    }
}