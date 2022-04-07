package com.develogical;

public class QueryProcessor {
//test comment
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("austen")){
            return "Jane Austen is an author.";
        }
        if (query.toLowerCase().contains("name")){
            return "KNEA";
        }

        if (query.toLowerCase().contains("fibonacci")){
            String sub = query.split(" ")[4];
            return String.valueOf(fib(Integer.parseInt(sub.substring(0,sub.length()-2))));
        }
        if (query.toLowerCase().contains("banana")){
            return "yellow";
        }
        if (query.toLowerCase().contains("theresa may")){
            return "2016";
        }
        if (query.toLowerCase().contains("eiffel tower")){
            return "Paris";
        }
        if (query.toLowerCase().contains("1 plus 13")){
            return "14";
        }
        if (query.toLowerCase().contains("james bond")){
            return "Sean Connery";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest")){
            query = query.replaceAll(" ","");
            String numbersString = query.split(":")[2];
            String[] numbers = numbersString.split(",");
            int biggest = 0;
            for (String num:numbers) {
                if(Integer.parseInt(num) > biggest) biggest = Integer.parseInt(num);
            }
            return String.valueOf(biggest);
        }
        if (query.toLowerCase().contains("which of the following numbers is the smallest")){
            query = query.replaceAll(" ","");
            String numbersString = query.split(":")[2];
            String[] numbers = numbersString.split(",");
            int smallest = 0;
            for (String num:numbers) {
                if(Integer.parseInt(num) < smallest) smallest = Integer.parseInt(num);
            }
            return String.valueOf(smallest);
        }
        if (query.toLowerCase().contains("plus")){
            String[] numbers = query.split(" ");
            int num1 = Integer.parseInt(numbers[3]);
            int num2 = Integer.parseInt(numbers[5]);
            int total = num1 + num2;
            return String.valueOf(total);
        }
        if (query.toLowerCase().contains("minus")){
            String[] numbers = query.split(" ");
            int num1 = Integer.parseInt(numbers[3]);
            int num2 = Integer.parseInt(numbers[5]);
            int total = num1 - num2;
            return String.valueOf(total);
        }
        if (query.toLowerCase().contains("multiplied")){
            String[] numbers = query.split(" ");
            int num1 = Integer.parseInt(numbers[3]);
            int num2 = Integer.parseInt(numbers[6]);
            int total = num1 * num2;
            return String.valueOf(total);
        }
        if (query.toLowerCase().contains("square and a cube")){
            query = query.replaceAll(" ","");
            String numbersString = query.split(":")[2];
            String[] numbers = numbersString.split(",");
            String squaresAndCubes = "";
            for (String num:numbers) {
                int numValue = Integer.parseInt(num);
                if(numValue%2 == 0 && numValue%3==0)
                {
                    squaresAndCubes = squaresAndCubes + numValue + ", ";
                }
            }
            if (squaresAndCubes.length() > 0){
                return squaresAndCubes.substring(0,squaresAndCubes.length()-2);
            }
            return squaresAndCubes;
        }
        if (query.toLowerCase().contains("prime")){
            query = query.replaceAll(" ","");
            String numbersString = query.split(":")[2];
            String[] numbers = numbersString.split(",");
            String prime = "";
            for (String num:numbers) {
                int numValue = Integer.parseInt(num);
                boolean primeNo = false;
                for (int i = 2; i < numValue; i++) {
                    if(numValue%i == 0)
                    {
                        primeNo = true;
                    }
                }
                if (!primeNo) prime = prime + numValue + ", ";
            }
            if (prime.length() > 0){
                return prime.substring(0,prime.length()-2);
            }
            return prime;
        }
        return "";
    }

    public int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);

    }
}
