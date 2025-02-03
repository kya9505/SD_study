public class QueueArray {
    private int que[];
    private int capacity; // queue의 용량
    private int num; // 데이터 개수

    public QueueArray(int capacity) {
        this.num = 0;
        this.capacity = capacity;
        try {
            que = new int[this.capacity]; // 큐의 배열을 생성
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public class EmptyIntQueueArrayException extends RuntimeException{
        public EmptyIntQueueArrayException(){}
    }
public class OverflowInQueueArrayException extends RuntimeException{
        public OverflowInQueueArrayException(){}
    }

    public int enque(int x) throws  OverflowInQueueArrayException{
        if(this.num >= this.capacity) throw new OverflowInQueueArrayException();
        que[num++] = x;
        return x;
    }

    public int deque() throws EmptyIntQueueArrayException{
        if(num <= 0)throw new EmptyIntQueueArrayException();
        int x = que[0];
        for(int i = 0 ; i < num -1 ; i++) {
            que[i] = que[i + 1];
        }
        num--;
        return x;
    }
    //큐에서 맨 앞 데이터를 들여다봄 (피크)
    public int peek()throws EmptyIntQueueArrayException{
        if(num <=0) throw new EmptyIntQueueArrayException();
        return que[num-1];
    }
    //큐 비우기
    public  void clear(){
        num = 0;
    }

    //큐에서 x를 검색하여 발견하지 못하면 -1을 반환하는 indexOf()기능 구현
    public int indexOf(int x){
        for (int i =0 ; i<num; i++){
            if (que[i]==x){
                return i;  // 검색성공시 인덱스 전달
            }
        }
        return -1; //검색 실패
    }
    //큐의 용량
    public int capacity(){
        return this.capacity;
    }
    //큐가 비어있는지
    public boolean isEmpty(){
        return num <= 0;
    }
    // 큐의 모든 데이터를 맨앞부터 밴뒤까지 출력
    public void dump(){
        if (num<=0) System.out.println("Empty");
        else {
            for(int data : que) System.out.print(data +" ");
            System.out.println();
        }
    }

    // 큐에 쌓여있는 데이터 수를 반환
    public int size(){
        return this.num;
    }
    //큐가 가득 차있는 지 확인
    public boolean isFull(){
        return num >= capacity;
    }
}
