package com.example.hillel.homework13;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {

  public static void main(String[] args) {
    // Компаратор для сортування у зворотному алфавітному порядку для слів рядка
    Comparator<String> reverseSort = Comparator.reverseOrder();

    // TreeMap з використанням заданого компаратора
    Map<String, Integer> wordCountMap = new TreeMap<>(reverseSort);

    wordCountMap.put("Watermelon", 1);
    wordCountMap.put("Orange", 1);
    wordCountMap.put("Blueberry", 1);

    String text = "Watermelon Watermelon Watermelon Orange Orange Blueberry Blueberry Blueberry Blueberry Blueberry";

    // Виклик методу countWords та отримання результату
    Map<String, Integer> countMap = WordCounter.countWords(text);

    // Додавання результату до TreeMap
    wordCountMap.putAll(countMap);

    // Виведення результату
    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }

}