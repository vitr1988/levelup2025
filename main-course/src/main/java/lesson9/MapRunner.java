package lesson9;

import lesson9.dto.Account;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

    public static void main(String[] args) {
//        Map<Integer, String> cityMap = new TreeMap<>();
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(77, "Москва");
        cityMap.put(78, "Санкт-Петербург");
        cityMap.put(63, "Самара");
        cityMap.put(64, null);
        cityMap.put(64, "Саратов");
        cityMap.put(34, "Волгоград");
        cityMap.put(50, "Москвская область");
        cityMap.put(55, "Оренбругская область");
        cityMap.put(null, "Несущевствующая область");
        System.out.println(cityMap);

        System.out.println(cityMap.get(63));
        System.out.println(cityMap.get(64));
        System.out.println(cityMap.getOrDefault(65, "Несущевствующая область"));

//        if (cityMap.get(64) != null) { не всегда будет работать корректно
        if (cityMap.containsKey(64)) {
            System.out.println("Строка с ключом 64 найдена");
        }
        System.out.println("---");
        for (Map.Entry<Integer, String> entry : cityMap.entrySet()) {
            System.out.println("Ключ : %d Значение : %s".formatted(entry.getKey(), entry.getValue()));
        }
        System.out.println("---");
        for (Integer key : cityMap.keySet()) {
            System.out.println("Ключ : %d Значение : %s".formatted(key, cityMap.get(key)));
        }


//        Map<Account, BigDecimal> accountBalances = new TreeMap<>(new Comparator<Account>() {
//            @Override
//            public int compare(Account o1, Account o2) {
//                return -o1.getBalance().compareTo(o2.getBalance());
//            }
//        });
//        Account key = new Account(BigDecimal.ZERO, "2132132");
//        accountBalances.put(key, BigDecimal.ZERO);
//        accountBalances.put(new Account(BigDecimal.ONE, "3132132"), BigDecimal.ONE);
//        accountBalances.put(new Account(BigDecimal.TWO, "4132132"), BigDecimal.TWO);
//        accountBalances.put(new Account(BigDecimal.TEN, "5132132"), BigDecimal.TEN);
//        accountBalances.put(new Account(new BigDecimal("100"), "6132132"), new BigDecimal("100"));
//        System.out.println(accountBalances);
////        accountBalances.put(key, BigDecimal.TEN);
//        accountBalances.putIfAbsent(key, BigDecimal.TEN);
//        System.out.println(accountBalances);
//        accountBalances.remove(key);
//        System.out.println(accountBalances);
    }
}
