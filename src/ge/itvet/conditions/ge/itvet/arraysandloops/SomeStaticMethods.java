package ge.itvet.conditions.ge.itvet.arraysandloops;

public class SomeStaticMethods {

    public static long factorialFor(int num) {
        if (num <= 0 || num >= 21) {
            return -1;
        }
        long result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static long factorialWhile(int num) {
        if (num <= 0 || num >= 21) {
            return -1;
        }
        long result = 1;
        while (num > 1) {
            result *= num--;
        }
        return result;
    }


    public static boolean[] multiples(int size, int multiplier) {
        if (size < 0 || multiplier == 0) {
            return new boolean[0];
        }
        boolean[] arr = new boolean[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % multiplier == 0;
        }
        return arr;
    }

    public static boolean[] multiplesWithoutMod(int size, int multiplier) {
        if (size < 0 || multiplier == 0) {
            return new boolean[0];
        }
        boolean[] arr = new boolean[size];
        for (int i = 0; i < arr.length; i += multiplier) {
            arr[i] = true;
        }

        return arr;
    }


    public static String toString(char[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    //    toLong*** პარამეტრად გადმოეცემა სიმბოლოების მასივი.
//    მასივი შევსებული იქნება ციფრების შესაბამისი სიმბოლოებით.
//    პირველი სიმბოლო არის 0-ისგან განსხვავებული.
//    მასივის ზომა არ აღემატება 18-ს.
//    დააბრუნებს მთელ რიცხვს რომელიც ამ მასივშია ჩაწერილი.
//    (მაგ: თუ პარამერტია ['2', '0', '2', '2'] - დააბრუნებთ 2022-ს)

    public static long toLong(char[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] - '0';
            result = result * 10 + num;
        }
        return result;
    }


}
