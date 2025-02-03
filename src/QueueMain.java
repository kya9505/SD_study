import java.util.Scanner;
//
public class QueueMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QueueArray queue = new QueueArray(64);
        int x = 0;
        while (true){
            System.out.println("현재 데이터 개수 : " + queue.size() + "/" + queue.capacity());
            System.out.println("1. 인큐 2.디큐 3.피크 4.덤프 0.종료 숫자로 선택하세요."  );
            int menu = in.nextInt();
            if(menu==0) break;

            switch (menu) {
                case 1:
                    System.out.print("숫자 데이터를 입력하세요.");
                    x = in.nextInt();
                    try {
                        queue.enque(x);
                    } catch (QueueArray.OverflowInQueueArrayException e) {
                        throw new RuntimeException(e);
                    }

                case 2:
                    x = queue.deque();

                case 3:

            }
        }


    }
}
