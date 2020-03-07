package operatorsandstatements;

public class Main {
    public static void main(String args[]) {
        //Check();
        //AnotherCheck();
        test1();

    }

    public static void test1() {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }


    }

    public static void test() {
        int m = 9, n = 1, x = 0;
        while (m > n) {
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);
    }

    public static void AnotherCheck() {
        int count = 0;

        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
    }

    public static void Check() {
        boolean keepgoing = true;
        int result = 15;
        int i = 10;
        do {
            i--;
            if (i == 8) {
                keepgoing = false;
            }
            result -= 2;
        } while (keepgoing);
        System.out.println(result);
    }
}



