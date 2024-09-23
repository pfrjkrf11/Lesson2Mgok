import java.util.Scanner;

public class Lesson {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Надо вводить это, чтобы была возможность ввести что-то с клавиатуры//
        //scanner.nextInt()//

        System.out.print("Введите количество гостей:"); // если print то курсор на нужной строке будет//
        int n = scanner.nextInt();

        int countCut = 0;

        if (n==1){
            countCut = 0;
        }else {
            if (n % 2 == 0) {
                countCut = n / 2;
            } else {
                countCut = n;
            }
        }

        System.out.println("нужное количество надрезов = "+ countCut);
        //%d чтобы легче было вывести несоклько данных, %d нужно ввести столько раз, сколько переменных//








    }
}
