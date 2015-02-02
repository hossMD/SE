package thegame;

/**
 * Created by MaRV on 2/2/2015.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuess = 0;/*создаём переменную для того чтобы проследить сколько было попыток*/
        GameHelper helper=new GameHelper();/*специальный класс для ввода пользователем чисел*/
        SimpleDotCom theDotCom = new SimpleDotCom(); /*создаем объект сайт*/
        int randomNum = (int)(Math.random()*5);/*генерация случайного числа*/
        int[] locations = {randomNum, randomNum+1,randomNum+2};/*формирование массива ячеек*/
        theDotCom.setLocationCells(locations); /*передаём местоположение ячееек*/
        boolean isAlive = true;/**/
        while (isAlive==true){/*создаем белевую переменную для слежки не закончился ли цикл*/
            String guess =helper.getUserInput("VVedite");/*полуячаем воод пользователя */
            String result = theDotCom.checkYourself((guess)); /*проверяем что вводит поьлзоваетль попал он или не попал*/
            numOfGuess++;/*увеличиваем колличество попыток если ещё не закончилось потопление*/
                    if(result.equals("Потопил")){/*если срабатывает тру значит выходим из цикла и пишем результат и вывоим его на экран*/
                        isAlive=false;
                        System.out.println("vam potrebovalosi "+ numOfGuess+" popitok");
                    }

        }
    }
}
