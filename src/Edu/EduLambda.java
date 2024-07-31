package Edu;

import java.util.function.*;

@FunctionalInterface
interface InterfacePlus {
    int Plus(int x, int y);
}

//class Plus implements InterfacePlus {
//    public int plus(int x, int y) {
//        return x + y;
//    }
//}

public class EduLambda {
    public static void main(String[] args) {
        // 인터페이스 및 오버라딩 이용
//        Plus p = new Plus();
//        System.out.println(p.Plus(1, 2));

//        // 익명 클래스 이용
//        InterfacePlus obj = new InterfacePlus() {
//            public int Plus(int x, int y) {
//                return x + y;
//            }
//        };
//        System.out.println(obj.Plus(3, 5));
//
//        // 람다식
//        InterfacePlus lambda = (x, y) -> x + y;
//        System.out.println(lambda.Plus(5, 5));

        // 표준 함수형 인터페이스 API
        // 파라미터 1개, 리턴값 있음
        Function<Integer, Integer> funLambda = x -> x + 2;
        System.out.println(funLambda.apply(5));

        // 파라미터 2개, 리턴값 있음
        BiFunction<Integer, Integer, Integer> funBiLambda = (x, y) -> x + y;
        System.out.println(funBiLambda.apply(5, 7));

        // 파라미터 없고, 리턴값 있음
        Supplier<Integer> funSupplierLambda = () -> 5;
        System.out.println(funSupplierLambda.get());

        //파라미터 있고, 리턴값 없음
        Consumer<String> funConsumerLambda = x -> System.out.println(x);
        funConsumerLambda.accept("안녕 자바");

        // 파라미터 있고, 리턴값 있고, 조건식을 표현하는데 사용
        Predicate<Integer> funPredicateLambda = x -> x % 2 == 0;
        System.out.println(funPredicateLambda.test(5));
        System.out.println(funPredicateLambda.test(4));

        // Function 합성
        // andThen
        // x + y 람다식
        BiFunction<Integer, Integer, Integer> biFncPlusLambda = Integer::sum;
        // x - 4 람다식
        Function<Integer, Integer> biFncMinusLambda = x -> x - 4;

        int result1 = biFncPlusLambda.andThen(biFncMinusLambda).apply(6, 4);
        System.out.println(result1);

        // compose
        Function<Integer, Integer> biFncPlusLambda2 = x -> x + 2;
        int result2 = biFncPlusLambda2.compose(biFncMinusLambda).apply(5);
        System.out.println(result2);

        // identity
        Function<Integer, Integer> identityLambda = Function.identity();
        System.out.println(identityLambda.apply(5));

        // Predicate 결합
        Predicate<Integer> greater = x -> x > 0;
        Predicate<Integer> lesser = x -> x < 10;

        // &&
        Predicate<Integer> andPredicate = greater.and(lesser);
        System.out.println(andPredicate.test(5));
        System.out.println(andPredicate.test(11));

        // ||
        Predicate<Integer> orPredicate = greater.or(lesser);
        System.out.println(orPredicate.test(5));
        System.out.println(orPredicate.test(11));

        // !
        Predicate<Integer> notPredicate = greater.negate();
        System.out.println(notPredicate.test(5));
    }
}
