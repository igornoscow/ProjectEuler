/*
one - 3
two - 3
three - 5
four - 4
five - 4
six - 3
seven - 5
eight - 5
nine - 4

ten - 3
eleven - 6
twelve - 6
thirteen - 8
fourteen - 8
fifteen - 7
sixteen - 7
seventeen - 9
eighteen - 8
nineteen - 8

twenty - 6
thirty - 6
forty - 5
fifty - 5
sixty - 5
seventy - 7
eighty - 6
ninety - 6

and - 3
hundred - 7

 */

public class Problem017 {
    public static void main(String[] args) {
        int size = 0;
        String[] oneToNine = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] oneToNineteen = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] twentyToNinety = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] numbers = new String[1000];
        numbers[0] = "onethousand";

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = "";
        }

        for (int i = 1; i < 1000; i++) {
            if (i / 100 > 0) {
                numbers[i] = numbers[i] + oneToNine[i / 100 - 1];
                numbers[i] = numbers[i] + "hundred";
                if (i % 100 != 0) {
                    numbers[i] = numbers[i] + "and";
                }
            }

            if (i % 100 >= 20) {
                numbers[i] = numbers[i] + "" + twentyToNinety[i % 100 / 10 - 2];
                if (i % 10 > 0) {
                    numbers[i] = numbers[i] + "" + oneToNine[i % 10 - 1];
                }
            } else if (i % 100 > 0){
                numbers[i] = numbers[i] + "" + oneToNineteen[i % 100 - 1];
            }
        }

        for (String string: numbers) {
            size += string.length();
        }
        System.out.println(size);
    }
}
















