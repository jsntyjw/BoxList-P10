package sg.edu.rp.c346.boxlist;

/**
 * Created by 16003753 on 23/7/2018.
 */

public class BoxItem {

    private String color;

    public BoxItem(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "BoxItem{" +
                "color='" + color + '\'' +
                '}';
    }
}
