/*

It's my code,then only .Only I can using him,because have author rights for him
But I am allow for them in order to using him too))))))))))))))))))))

 */

package ru.unum.work;
import java.util.*;


/**
 * @since java 1.8
 * @author Roma
 * @version 1.1
 */


//name to class start
public class Main {
    //enum for Season

    //enum for Month

    //docs for mas int[]


    //this is print in order to can using in program
    public static void main() {
        System.out.println("-------------------------------------------------------------------------- ");
        System.out.println("Натисніть 1 (Чи є такий місяць)"+"                                          |");
        System.out.println("Натисніть 2 (щоб вивести всі місяці з  такою порою року)"+"                 |");
        System.out.println("Натисніть 3 (щоб вивести всі місяці з такою кількістю днів)"+"              |");
        System.out.println("Натисніть 4 (щоб вивести всі місяці які мають найменшу кількість днів)"+"   |");
        System.out.println("Натисніть 5 (щоб вивести всі місяці які мають найбільшу кількість днів)"+"  |");
        System.out.println("Натисніть 6 (щоб вивести на екран наступну пору року)"+"                    |");
        System.out.println("Натисніть 7 (щоб вивести на екран попередню пору року)"+"                   |");
        System.out.println("Натисніть 8 (щоб всі місяці які мають парну кількість днів)"+"              |");
        System.out.println("Натисніть 9 (щоб всі місяці які мають не парну кількість днів)"+"           |");
        System.out.println("-------------------------------------------------------------------------- ");
        System.out.println(" ");
    }

    public static void main(String[] args) throws WrongInputConsoleParametersException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Month> months = new ArrayList<Month>();
        Collections.addAll(months, Month.values());

        ArrayList<Season> seasons = new ArrayList<Season>();
        Collections.addAll(seasons, Season.values());

        while (true){
            main();
            System.out.print("Please print key (1 to 9): ");
            int number = sc.nextInt();
            System.out.println("--------------------------------------------------------------------------");

            if (number==1){
                System.out.print("Enter ");
                String str_months = sc.next();
                MonthTrueChecked(months, str_months);
            }
            if (number==2){
                System.out.print("Please print season: ");
                String str_season = sc.next();
                CheckSeasonForMonth(months, seasons, str_season);
            }
            if (number==3){
                System.out.print("Please print number: ");
                int str_day = sc.nextInt();
                DayForMonth(months, str_day);
            }
            if (number==4){

                ArrayList a = new ArrayList();
                for (Month v:months){
                    a.add(v.getDay());
                }
                int max= (int) Collections.max(a);
                for (Month v:months){
                    if (v.getDay()==max){
                        System.out.println("   -"+v.name());
                    }
                }
            }
            if (number==5){

                ArrayList a = new ArrayList();
                for (Month v:months){
                    a.add(v.getDay());
                }
                int min= (int) Collections.min(a);
                for (Month v:months){
                    if (v.getDay()==min){
                        System.out.println("   -"+v.name());
                    }
                }
            }
            if (number==6){
                while (true){
                    System.out.print("Please print season: ");
                    String str_season1 = sc.next();
                    if (PrintLastSeason(seasons, str_season1)) break;
                }
            }
            if (number==7){
                while (true){
                    System.out.print("Please print season: ");
                    String str_season1 = sc.next();
                    if (PrintAgainSeason(seasons, str_season1)) break;
                }
            }
            if (number==8){
                for (Month s :months){
                    if (s.getDay()%2==0){
                        System.out.println(s.name());
                    }
                }
            }
            if (number==9){
                for (Month s :months){
                    if (s.getDay()%2==1){
                        System.out.println(s.name());
                    }
                }
            }else {
                throw new WrongInputConsoleParametersException("Please print number (1 to 9)");
            }
        }

    }

    private static boolean PrintLastSeason(ArrayList<Season> seasons, String str_season1) throws WrongInputConsoleParametersException {
        boolean flag = false;

        for (Season s: seasons){
            if (s.name().equalsIgnoreCase(str_season1)){
                flag= true;
            }
        }
        if (flag){
            ArrayList a = new ArrayList();
            a.add(Season.WINTER.name());
            a.add(Season.SPRING.name());
            a.add(Season.SUMMER.name());
            a.add(Season.AUTUMN.name());
            boolean flag2 = false;
            for (int i=0;i<a.size();i++){
                if (a.get(i).equals(str_season1)){
                    System.out.println(a.get(i+1));
                    flag2=true;
                }
            }if (!flag2){
                System.out.println("___________________________________");
                System.out.println("Please print season toUpperCase  :)");
                System.out.println("-----------------------------------");
            }
            if (flag2){
                return true;
            }
        }
        if (!flag){
            throw new WrongInputConsoleParametersException("Please print true number");
        }
        return false;
    }

    private static boolean PrintAgainSeason(ArrayList<Season> seasons, String str_season1) throws WrongInputConsoleParametersException {
        boolean flag = false;

        for (Season s: seasons){
            if (s.name().equalsIgnoreCase(str_season1)){
                flag= true;
            }
        }
        if (flag){
            ArrayList a = new ArrayList();
            a.add(Season.WINTER.name());
            a.add(Season.SPRING.name());
            a.add(Season.SUMMER.name());
            a.add(Season.AUTUMN.name());
            boolean flag2 = false;
            for (int i=0;i<a.size();i++){
                if (a.get(i).equals(str_season1)){
                    System.out.println(a.get(i-1));
                    flag2=true;
                }
            }if (!flag2){
                System.out.println("___________________________________");
                System.out.println("Please print season toUpperCase  :)");
                System.out.println("-----------------------------------");
            }
            if (flag2){
                return true;
            }
        }
        if (!flag){
            throw new WrongInputConsoleParametersException("Please print true number");
        }
        return false;
    }

    private static void DayForMonth(ArrayList<Month> months, int str_day) throws WrongInputConsoleParametersException {
        boolean flag = false;

        for (Month m : months){
            if (m.getDay()== str_day){
                flag = true;
            }
        }
        if (flag){
            for (Month m : months){
                if (m.getDay()== str_day){
                    System.out.println("   -"+m.name());
                }
            }
        }
        if (!flag){
            throw new WrongInputConsoleParametersException("Please print true number");
        }
    }

    private static void CheckSeasonForMonth(ArrayList<Month> months, ArrayList<Season> seasons, String str_season) throws WrongInputConsoleParametersException {
        boolean flag = false;

        for (Season m : seasons){
            if (m.name().equalsIgnoreCase(str_season)){
                System.out.println("------------");
                System.out.println("|Сезон існує|");
                System.out.println("------------");
                flag=true;
            }
        }
        if (flag){
            for (Month month : months) {
                if (month.getSeason().name().equalsIgnoreCase(str_season)) {
                    System.out.println("   -" + month.name());
                }
            }
        }
        if (!flag){
            throw new WrongInputConsoleParametersException("Please print month true");
        }
    }

    private static void MonthTrueChecked(ArrayList<Month> months, String str_months) throws WrongInputConsoleParametersException {
        boolean flag = false;

        for (Month m : months){
            if (m.name().equalsIgnoreCase(str_months)){
                System.out.println("------------");
                System.out.println("|Місясь існує|");
                System.out.println("------------");
                flag=true;
            }
        }
        if (!flag){
            throw new WrongInputConsoleParametersException("Please print month true");
        }
    }


    /**
         * @param no input params
         * @exception WrongInputConsoleParametersException
         * @author Roma
         * @return null
         * @see java code convention
         **/

    }









