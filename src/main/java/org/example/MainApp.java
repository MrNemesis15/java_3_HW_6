package org.example;

import java.util.Arrays;

//Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

//        Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
//        то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        [ 1 1 1 4 4 1 4 4 ] -> true
//        [ 1 1 1 1 1 1 ] -> false
//        [ 4 4 4 4 ] -> false
//        [ 1 4 4 1 1 4 3 ] -> false

//        * Добавить на серверную сторону сетевого чата логирование событий (сервер запущен, произошла ошибка, клиент подключился, клиент прислал сообщение/команду).


public class MainApp {
    public static void main(String[] args) {
    }


    public static int [] arrayAfter4(int[] arr){
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 4) {
                    return Arrays.copyOfRange (arr, i + 1, arr.length);
                }
            }
            throw new RuntimeException ("Array without 4");
        }

        public static boolean arrayContainsOnly1and4 ( int[] arr){
            boolean has1 = false;
            boolean has4 = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 1 && arr[i] != 4) {
                    return false;
                }
                if (arr[i] == 1) {
                    has1 = true;
                }
                if (arr[i] == 4) {
                    has4 = true;
                }
            }
            return has1 && has4;
        }

    }
