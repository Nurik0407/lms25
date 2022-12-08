import java.awt.*;
import java.time.LocalDate;

public class CarInfo {
    private LocalDate yearOfIssue;
    private String model;
    private int price;
    private String colorAuto;

    public CarInfo(LocalDate yearOfIssue, String model, int price, String colorAuto) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.colorAuto = colorAuto;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(String colorAuto) {
        this.colorAuto = colorAuto;
    }

    @Override
    public String toString() {
        return "\nCarInfo{" +
                "\nyearOfIssue: " + yearOfIssue +
                "\nmodel: " + model +
                "\nprice: " + price +
                "\ncolorAuto: " + colorAuto +"}\n==========================\n";
    }
}
