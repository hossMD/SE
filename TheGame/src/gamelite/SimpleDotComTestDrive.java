package gamelite;

import thegame.SimpleDotCom;

/**
 * Created by MaRV on 2/1/2015.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {   //создаем екземпляркласса SimpleDotCom
        SimpleDotCom dot = new SimpleDotCom();
        int[] location = {2, 3, 4};           //содаем массив для местоположения сайта
        dot.setLocationCells(location);     //вызываем сеттер сайта
        String userGuess = "3";             //делаем ход пользователем
        String result = dot.checkYourself(userGuess);       //вызываем метод
        String testResult = "неудача";
        if (result.equals("Попал")) {
            testResult = "пройден";               //если ход ок то значит работает нормально
            System.out.println(testResult);     //вывести поршёл ли тест или нет
        }
    }

//    public String checkYourself(String stringGuess) {
//        int guess = Integer.parseInt(stringGuess);  //преобразовываем стриг в инт
//        String result = "mimo";                  //    содаём переменную для хранения резульата который будкеем возвращать и по дефолту ставим ему момо
//
//        for (int cell : locationCells) { /*повторяем с каждой ячейкой из массива*/
//            if (guess == cell) {     /*сравниваем */
//                result = "попал";
//                numOfHits++;               /*если мы обнаружили попадание */
//                break;          /*выскакием из цикла*/
//            }//end pf if
//
//        }//end of for
//        if numOfHits == locationCells.length)
//        {
//            result = "potopil"; //Проверяем потопил ли полностью если ДА то пишем потопил и выходим
//
//
//        }       /*конец for*/
//
//        System.out.println(result);
//        return result;                  /*return result checkYourself*/
//        for (int i = 0; i < ; i++) {
//
//        }
//    }

    public static class SimpleDotCom {
        int [] locationCells;
        int numOfHits = 0;

        public void setLocationCells(int[] locs) {
            locationCells = locs;
        }
        public String checkYourself(String stringGuess){
            int guess = Integer.parseInt(stringGuess);
            String result = "Мимо";
            for (int cell:locationCells){
                if (guess==cell){
                    result= "Попал";
                    numOfHits++;
                    break;
                }
            }
            if (numOfHits == locationCells.length){
                result = "Потопил";
            }
            System.out.println(result);
            return result;

        }
    }

}
