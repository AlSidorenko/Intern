/**
 * Created on 23.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.streamapi.task001.studentfiltering;

/*
1. Фильтрация учеников.

В школе пришло требование разделить 9А класс на три класса.
У каждого ученика есть общий балл по всем предметам.  int score;
score - может быть в диапазоне от 0 до 100.
Учеников нужно поделить на следующие группы.

10А диапазон балла [70: 100],
10Б диапазон балла [50: 70);
10B диапазон балла (0: 50);

Задание.
1. Создайте класс Student. В классе Student должно быть одно поле int score;
2. Создайте класс School c методом List<Student> collect(List<Student> students, Predict<Student> predict);
3. Создайте класс - тест SchoolTest с тремя методами для получения списка учеников для классов: А, B, C;
4. В этом задании нужно использовать Stream API. метод filter и метод collect(Collectors.toList())
import java.util.stream.Collectors;

 */