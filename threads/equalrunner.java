package threads;

import java.util.Objects;

public class equalrunner {
    private int id;
    public equalrunner(int id)
    {
        this.id=id;
    }

    public static void main(String[] args) {
        equalrunner e=new equalrunner(1);
        equalrunner e1=new equalrunner(1);
        System.out.println(e.equals(e1));
    }
}
