package Edu.ClassExtends;

import java.util.ArrayList;

public class EduAbstractClass {
    public static void main(String[] args) {
//        Whale whale = new Whale();
//        System.out.println(whale.birth());
//
//        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
//        System.out.println(flyingSquirrel.residence());

        // 다형성
//        Mammal whale = new Whale();
//        System.out.println(whale.birth());
////        whale.swimming(); 자식한테만 있는거는 사용 불가
//        whale.test(); // 오버라이딩한 자식의 메소드가 실행
//
//        Mammal[] array = new Whale[2];
//        array[0] = new Whale();
//        array[1] = new FlyingSquirrel();

        // 업캐스팅
        Mammal mammal;
        Whale whale = new Whale();
        mammal = (Mammal)whale;
        System.out.println(mammal.birth());

        // 다운캐스팅
        Mammal[] arr = new Mammal[2];
        arr[0] = new Whale();
        arr[1] = new FlyingSquirrel();

        Whale whale2 = (Whale)arr[0];
        System.out.println(whale2.swimming());

        // 타입 다형성
//        ArrayList<Whale> whales = new ArrayList<>();
//        ArrayList<FlyingSquirrel> flyingSquirrels = new ArrayList<>();

        FlyingSquirrel flyingSquirrel = new FlyingSquirrel();
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(flyingSquirrel);
        mammals.add(whale);

        // 파라미터의 다형성
        PrintTest printTest = new PrintTest();
        printTest.instancePrint(whale);
        printTest.instancePrint(flyingSquirrel);
    }
}

// 인터페이스
interface Swim {
    public String swimming();
}

class PrintTest {
    final public void instancePrint(Mammal mammal) {
        System.out.println(mammal.toString());
    }
//    final public void instancePrint(FlyingSquirrel flyingSquirrel) {
//        System.out.println(flyingSquirrel.toString());
//    }
//
//    final public void instancePrint(Whale whale) {
//        System.out.println(whale.toString());
//    }
}

// 추상 클래스
abstract class Mammal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }

    final public String birth() {
        return this.name + "는 출산합니다.";
    }

    // 필수항목을 abstract 설정하여 개발자의 실수를 줄일 수 있음
    abstract public String residence();
    
    public void test() {
        System.out.println("부모 테스트");
    }
}

class Whale extends Mammal implements Swim {
    // 생성자
    public Whale() {
        super("고래");
    }

    public String residence() {
        return this.name + "는 바다에 삽니다.";
    }

    public String swimming() {
        return this.name + "헤엄칩니다.";
    }

    public void test() {
        System.out.println("자식 테스트");
    }
}

class FlyingSquirrel extends Mammal {
    // 생성자
    public FlyingSquirrel() {
        super("날다람쥐");
    }

    public String residence() {
        return this.name + "는 산에 삽니다.";
    }
}

class FlyingFish implements Swim {
    protected String name;

    public FlyingFish() {
        this.name = "날치";
    }

    public String swimming() {
        return this.name + "가 헤엄칩니다.";
    }
}
