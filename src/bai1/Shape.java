package bai1;

public class Shape {
    private String color;
    private double borderWidth;

    // Constructor mặc định ( tức là phương thức khởi tạo) khác với phương thức thường
    public Shape () {
        this.color = "green";
        this.borderWidth = 1.0;
    }

    // Constructor với tham số
    public Shape ( String color, double borderWidth ) {
        this.color = color;
        this.borderWidth = borderWidth;
    }

    // Getter và setter cho thuộc tính
    public String getColor () {
        return color;
    }

    public void setColor ( String color ) {
        this.color = color;
    }

    public double getBorderWidth () {
        return borderWidth;
    }

    public void setBorderWidth ( double borderWidth ) {
        this.borderWidth = borderWidth;
    }
    public double calculateArea () {
        return 0.0;
    }
    public double calculatePerimeter () {
        return 0.0;
    }

    // Phương thức toString (được cài đè trong các lớp con) cho tiện, sau chỉ cần gọi là tới
    @Override
    public String toString () {
        return "A Shape with color of " + color + " and border width of " + borderWidth;
    }
}