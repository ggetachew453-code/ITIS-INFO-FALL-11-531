package one.terenin.syntax;

public class Example {
    public static void main(String[] args) {

        // integer vars
        byte b = 127;  // 2^8 -> 256  1000 0001 [255] [-128: 127]
        short s = 1; // 2^16 [-2^15: 2^15]
        int i = 1; // 2^32 [-2^31: 2^31]
        long l = 1L; // 2^64 [-2^63: 2^63]

        // floating
        float f = 1.0F; // 2^32
        double d = 1.0F; // 2^64

        // symbol
        char c = 100; // 2^16

        // bool
        boolean bool = true; // true/false 0/1  0000 0000

        String str = "abc" + "ads";
        System.out.println(str);

        int[] intArray = new int[10];
        intArray[0] = 128;
        int i1 = intArray[0];
        System.out.println(i1);

        // == != >= > < <=
        // || |  && &

        if (intArray[0] == 127 && intArray[0] == 128) {
            System.out.print("Condition");
        }

        int conditionI = intArray[0] == 127 ? 32 : -32;
        System.out.println(conditionI);

        // switch/case

        switch (conditionI) {
            case 32 -> conditionI += 16;
            case -32 -> conditionI -= 16;
        }
        System.out.println(conditionI);

        // loops

        // for/ while

        int idx = 0;
        while (idx < intArray.length) {
            System.out.println(intArray[idx++]);
        }

        String[] stringArray = new String[10];
        for (int j = 0; j < stringArray.length; j += 2) {
            stringArray[j] = "Infinity";
        }

        for (String iter: stringArray) {
            System.out.print(" " + iter + ",");
        }

        // matrix

        int[][] matrix = new int[10][10];
        System.out.println(((int) Math.random()));
        for (int j = 0; j < matrix.length; j++) {
            System.out.println();
            for (int k = 0; k < matrix[j].length; k++) {
                matrix[j][k] = (int) (Math.random() * 100);
                System.out.print("  " + matrix[j][k]);
            }
        }
    }
}