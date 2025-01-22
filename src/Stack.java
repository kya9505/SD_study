
//int형 고정길이 스택
public class Stack {
    //자료 저장공간 : 스택용 배열
    private int [] stk;
    //stack pointer : 해당 스택의 자료의 개수와 위치파악가능
    private int ptr;
    //스택 용량
    private  int capacity;

    public Stack(){};
    public Stack(int maxlength){
        //생성자를 이용해서 초기화
        this.ptr=0;
        this.capacity = maxlength;
        try {
            stk = new int[capacity]; //스택 본채용 배열을 생성 stack[0]...stack[capacity-1]
        } catch (Exception e) { //생성할 수 없을 떄의 예외처리 : 정상적 종료를 할 수 있음
            capacity =0;
        }
    }
    //실행시 예외 : 스택이 비어있다.
    public class EmtyIntStackException extends RuntimeException{
        public EmtyIntStackException(){}
    }
    class OverflowInstackException extends RuntimeException{
        public OverflowInstackException() {}
    }
    //데이터 삽입 push
    public int push(int num) throws  OverflowInstackException{
        if(ptr >= capacity) throw new OverflowInstackException();
        return stk[ptr++]=num;//num을 배열에 넣고 ptr을 후치증가
    }


    //데이터 꺼내기 : pop
    public int pop() throws EmtyIntStackException{
        if(ptr <= 0 ) throw  new EmtyIntStackException();
        return stk[--ptr];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPtr() {
        return ptr;
    }

    public int peek() throws EmtyIntStackException{
        if(ptr <= 0 ) throw  new EmtyIntStackException();
        return stk[ptr-1];//스택이 비어있지않다면 꼭대기에 있는 값을 가져올 수 있음 srk[ptr-1]
    }

    //스택에 쌓여 있는 데이터의 개수를 반환하는 메소드 : size()
    public int size() {
        return ptr;
    }

    //스택안의 모든 데이터를 바다부터 꼭대기까지 순서대로 출력하는 기능 dump
    public  void dump(){
        if(ptr <=0){
            System.out.println("스택이 비어이습니다.");
        }else{
            for(int i = 0; i<ptr; i++){
                System.out.printf("stk[%d] + %d",i,stk[i]);
            }
        }
    }
}








