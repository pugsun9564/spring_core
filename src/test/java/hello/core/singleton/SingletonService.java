package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private로 선언해서 외부에서 new로 생성하는 것을 막는다.
    private SingletonService() {
        
    }
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
