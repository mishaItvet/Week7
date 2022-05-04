package ge.itvet.initblocks;

public class SuperBlock {


    static {
        System.out.println("static int block SuperBlock (1)");
    }

    static {
        System.out.println("static int block SuperBlock (2)");
    }

    {
        System.out.println("int block SuperBlock (1)");
    }

    public int four = return4();

    {
        System.out.println("int block SuperBlock (2)");
    }


    public SuperBlock() {
        System.out.println("SuperBlock's constructor");
        four = 44;
    }

    public static int return4() {
        System.out.println("return 4");
        return 4;
    }
}
