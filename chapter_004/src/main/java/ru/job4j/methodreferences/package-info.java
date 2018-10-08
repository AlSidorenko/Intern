/**
 * Created on 08.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
package ru.job4j.methodreferences;

/*
0.1 Ссылки на методы. [#70608]
  Петр Арсентьев,  14.09.18 4:25
Лямбды ввели только в JDK 1.8. Чтобы применять их в новом проекте нужно переписывать код.

Переписывать код никто просто так не даст. Поэтому разработчики JDK создали возможность использовать уже созданные
методы для подстановки в лямбды выражение.

Давайте вернемся к нашему примеру.

public void multiple(int start, int finish, int value,
                     BiFunction<Integer, Integer, Double> op,
                     Consumer<Double> media) {
    for (int index = start; index != finish; index++) {
        media.accept(op.apply(value, index));
    }
}

Допусти ранее мы создали статические методы для арифметических операций.

package ru.job4j;

public class MathUtil {
    public static double add(int left, int second) {
        return left + second;
    }

    public static double div(int left, int second) {
        return left / second;
    }
}

Эти методы можно заменить на интерфейс
BiFunction<Integer, Integer, Double> op,
два входящих параметра и один выходящий.

Если такое соответствие применимо, то мы можем указать использовать этот метод за место ламбды
Такой вызов называется ссылка на метод.

Синтаксис вызова (Имя класс)::(имя методы)

Важно, здесь не указываются параметры.

Пример.

public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.multiple(
            0, 10, 2,
            MathUtil::add,
            result -> System.out.println(result)
    );
}

Аналогично можно сделать для не статического методы.

(имя переменной)::(имя метода)

Пример в тесте.

public class CalculatorTest {
    @Test
    public void whenAdd1Until3() {
        Calculator calc = new Calculator();
        List<Double> buffer = new ArrayList<>();
        calc.multiple(
                0, 3, 1,
                MathUtil::add, //static call
                buffer::add // non-static call
        );
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }
}

Еще есть интересная особенность связанная с конструктором.
По сути конструктор - это метод принимающий параметры и возвращающий объект.
Его можно описать функциональным методом
Object apply(Object ... params);

Следовательно для конструкторов, тоже можно использовать вызов по ссылке.

Давайте рассмотрим пример. У нас есть список имен, и мы их ходим преобразовать в пользователей.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UserConvert {
    public static class User {
        private final String name;


        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public List<User> convert(List<String> names, Function<String, User> op) {
        List<User> users = new ArrayList<>();
        names.forEach(
                n -> users.add(op.apply(n))
        );
        return users;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Petr", "Nick", "Ban");
        UserConvert users = new UserConvert();
        List<User> data = users.convert(names, User::new);
        data.forEach(System.out::println);

    }
}

Здесь
names.forEach(
                n -> users.add(op.apply(n))
        );
для каждого имени выполнить функцию op.apply и результат записать в список Users.

Вызов

List<User> data = users.convert(names, User::new);

User::new - преобразуется в конструктор new User(String name)
 */