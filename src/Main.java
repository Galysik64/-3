public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int one = 1400000;
        byte two = 17;
        short fhree = 10000;
        long four = 100000;
        float five = 0.7f;
        double six = 5.5;
        System.out.println("Значение переменной one с типом int равно " + one);
        System.out.println("Значение переменной two с типом byte равно " + two);
        System.out.println("Значение переменной fhree с типом short равно " + fhree);
        System.out.println("Значение переменной four с типом long равно " + four);
        System.out.println("Значение переменной five с типом float равно " + five);
        System.out.println("Значение переменной six с типом double равно " + six);

        System.out.println("Задание 2");
        double oneOne = 27.12;
        long twoTwo = 987678965549L;
        float threeThree = 2.786f;
        int fourFour = 569;
        short fiveFive =159;
        long sixSix = 27897;
        byte sevenSeven = 67;
        System.out.println(oneOne);
        System.out.println(twoTwo);
        System.out.println(threeThree);
        System.out.println(fourFour);
        System.out.println(fiveFive);
        System.out.println(sixSix);
        System.out.println(sevenSeven);

        System.out.println("Задание 3");
        byte lyda = 23;
        byte anna = 27;
        byte katy = 30;
        int students = lyda + anna + katy;
        int paper = 480;
        int list = paper/students;
        System.out.println("На каждого ученика рассчитано " + list + " листов бумаги.");

        System.out.println("Задание 4");
        int bottlesTwoMinute = 16;
        int bottlesMinute = bottlesTwoMinute / 2; // в минуту
        int time1 = 20;        // минут
        int time2 = 1440;     // минут в сутки
        int time3 = 4320;    // минуты за 3 дня
        int time4 = 43200;  // минуты за 1 месяц
        int result1 = bottlesMinute * time1;
        int result2 = bottlesMinute * time2;
        int result3 = bottlesMinute * time3;
        int result4 = bottlesMinute * time4;
        System.out.println("За 20 минут машина произвела " +  result1 + " штук бутылок.");
        System.out.println("За 1 сутки машина произвела " +  result2 + " штук бутылок.");
        System.out.println("За 3 суток машина произвела " +  result3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " +  result4 + " штук бутылок.");

        System.out.println("Задание 5");
        byte colors = 120;
        byte colorsWhite = 2;
        byte colorsBrown = 4;
        int colorsClass = colorsWhite + colorsBrown;
        int classClass = colors/colorsClass;
        int colorsWhiteclass = classClass * colorsWhite;
        int colorsBrownclass = classClass * colorsBrown;
        System.out.println("В школе, где " + classClass + " классов, нужно " + colorsWhiteclass + " банок белой краски и " + colorsBrownclass + " банок коричневой краски.");

        System.out.println("Задание 6");
        double banan = 5;
        int milk = 200;
        int iceСream = 2;
        int eggs = 4;
        banan = banan * 80;
        milk = milk * 105/100;
        iceСream = iceСream * 100;
        eggs = eggs * 70;
        int gramm = (int)banan + milk + iceСream + eggs;
        double kilogramm = gramm/1000.0;
        System.out.println("Вес в граммах: " + gramm);
        System.out.println("Вес в килограммах: " + kilogramm);

        System.out.println("Задание 7");
        int loseWeight = 7;
        int weightInGrams = 7 * 1000;
        int gramsDay1 = 250;
        int gramsDay2 = 500;
        int numberOfDays1 = weightInGrams / gramsDay1;
        int numberOfDays2 = weightInGrams / gramsDay2;
        System.out.println(numberOfDays1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм." );
        System.out.println(numberOfDays2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм." );
        double averageQuantity = 1.0 *(numberOfDays1 + numberOfDays2) /2;
        System.out.println("В среднем " + averageQuantity + " день потребуется на похудение.");

        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaNew = (int)(masha * 1.1);
        int denisNew = (int)(denis * 1.1);
        int kristinaNew = (int)(kristina * 1.1);
        int mashaInYear = mashaNew * 12;
        int denisInYear = denisNew * 12;
        int kristinaInYear = kristinaNew * 12;
        int mashaOld = masha * 12;
        int denisOld = denis * 12;
        int kristinaOld = kristina * 12;
        int mashaAverage = mashaInYear - mashaOld;
        int denisAverage = denisInYear - denisOld;
        int kristinaAverage = kristinaInYear - kristinaOld;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaAverage + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisAverage + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaAverage + " рублей.");


        System.out.println("Доработка");


    }
}