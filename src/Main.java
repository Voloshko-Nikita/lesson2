public class Main {
    public static void main(String[] args) {
        System.out.println("-----Homework 1");

        int a = 5, b = 19, c = 15;
        int result = a;
        if (b > result){
            result = b;
        }
        if (c > result){
            result = c;
        }
        System.out.println(result);


        System.out.println("-----Homework ");

        int x = 5, y = -7, m = 0;
        result = 0;
        if (y < 0){
            y = -y;
            m = -1;
        }
        else{
            m = 1;
        }

        System.out.println(m + ", " + y);

        while (y > 0){
            if (y % 2 == 0){
                x = x + x;
                y = y / 2;
            }
            else{
                result = result + x;
                y = y - 1;
            }
        }
        if (m < 0)
            result = -result;
        System.out.println(result);
    }
}