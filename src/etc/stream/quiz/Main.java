package etc.stream.quiz;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        System.out.println("======== 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값) =======");
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(Comparator.comparing(t -> t.getValue()))
                .collect(toList())
                .forEach(System.out::println);


        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        System.out.println("======== 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열 =======");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList())
                .forEach(System.out::println);




        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        System.out.println("======== 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬 =======");
        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .distinct()
                .filter(transaction -> transaction.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(transaction -> transaction.getName()))
                .collect(toList())
                .forEach(System.out::println);




        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        System.out.println("======== 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환 =======");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted(Comparator.comparing(name -> name))
                .collect(toList())
                .forEach(System.out::println);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        System.out.println("======== 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인? =======");
        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("milan 거주 거래자 있는가? " + milan);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        System.out.println("======== 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력 =======");
        Integer total = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.println("total = " + total);

        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
        System.out.println("======== 연습 7: 모든 거래에서 최고 거래액은 얼마인가? =======");
        int maxTransaction = transactions.stream()
                .max(Comparator.comparing(transaction -> transaction.getValue())).get()
                .getValue();
        System.out.println("maxTransaction = " + maxTransaction);


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        System.out.println("======== 연습 8. 가장 작은 거래액을 가진 거래정보 탐색 =======");
        Transaction minTransaction = transactions.stream()
                .min(Comparator.comparing(transaction -> transaction.getValue())).get();
        System.out.println("minTransaction = " + minTransaction);

    }
}
