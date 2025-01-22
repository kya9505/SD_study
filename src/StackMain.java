import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(64);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 수 : %d /%d%n",stack.size(), stack.getCapacity());
            System.out.println("1 push, 2 pop, 3 peek, 4 dump, 0 exit");

            int menu = sc.nextInt();
            if(menu == 0) break;

            int number;
            switch (menu){
                case 1:
                    System.out.println("데이터 : ");
                    number = sc.nextInt();
                    try {
                        stack.push(number);//ctrl + alt + t : try catch
                    } catch (Stack.OverflowInstackException e) {
                        System.out.println("스택이 가득차있어 더이상 데이터 푸시 불가");
                    }
                    break;
                case 2 :
                    System.out.println(stack.getPtr()+"번째 데이터 \"" +stack.peek()+"\" pop");
                    stack.pop();
                    break;
            }
        }
    }
}
