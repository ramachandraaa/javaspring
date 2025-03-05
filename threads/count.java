package threads;

public class count {
    private int rno;
   private static int co=0;

    public count(int rno) {
        this.rno = rno;
        co++;
    }

    public int getRno()
    {
       // co++;
        return co;

    }

    public static void main(String[] args) {
        count c=new count(1);
        System.out.println(c.getRno());
        count d=new count(10);
        System.out.println(d.getRno());


    }
}
