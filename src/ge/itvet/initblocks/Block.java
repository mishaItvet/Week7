package ge.itvet.initblocks;

public class Block extends SuperBlock {
    public int five = return5();

    static {
        System.out.println("static int block Block (1)");
    }
    static {
        System.out.println("static int block Block (2)");
    }

    {
        System.out.println("int block Block (1)");
    }
    {
        System.out.println("int block Block (2)");
    }

    public Block() {
        System.out.println("Block's constructor");
        this.five = 55;
    }

    public static int return5() {
        System.out.println("return5");
        return 5;
    }
}
