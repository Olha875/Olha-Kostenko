package com.example.hillel.homework13;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

  // Метод для підрахунку кіл-ті слів у тексті
  public static Map<String, Integer> countWords(String text) {
    Map<String, Integer> wordCountMap = new HashMap<>();

     // Поч. значення
    int startIndex = 0;
    int endIndex;

    // Проходимо по рядку і розділяємо на слова за допомогою indexOf
    while (startIndex < text.length()) {
      // Знаходимо індекс першого пробілу або кінця рядочка
      endIndex = text.indexOf(' ', startIndex);
      if (endIndex == -1) {
        endIndex = text.length(); // Якщо пробіл не знайдено - встановлюємо кінець рядка
      }

      // Дістаємо слово
      String word = text.substring(startIndex, endIndex);

      // Якщо слово вже є у мапі, оновлюємо кількість даного слова
      if (wordCountMap.containsKey(word)) {
        wordCountMap.put(word, wordCountMap.get(word) + 1);
      }
       else {
        // Якщо слово відсутнє у мапі, додаємо його з кількістю 1
        wordCountMap.put(word, 1);
      }

      // Оновимо поч. індекс для наступної ітерації
      startIndex = endIndex + 1; // Додаємо +1, щоб пропустити пробіл
    }

    return wordCountMap;
  }
}