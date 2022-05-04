package ge.itvet.initblocks;

public class Nikolaus {

    static {
        System.out.println("STATIC INIT BLOCK");
    }

    @Deprecated
    public static String returnMyName() {
        return "Nikolaus";
    }

}
