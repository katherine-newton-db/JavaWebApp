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
        if (query.toLowerCase().contains("1 plus 13")){
            return "14";
        }
        if (query.toLowerCase().contains("which of the following numbers is the largest")){
            query = query.replaceAll(" ","");
            String numbersString = query.split(":")[1];
            String[] numbers = numbersString.split(",");
            int biggest = 0;
            for (String num:numbers) {
                if(Integer.parseInt(num) > biggest) biggest = Integer.parseInt(num);
            }
            return String.valueOf(biggest);
        }
        if (query.toLowerCase().contains("plus")){
            String[] numbers = query.split(" ");
            int num1 = Integer.parseInt(numbers[2]);
            int num2 = Integer.parseInt(numbers[4]);
            int total = num1 + num2;
            return String.valueOf(total);
        }
        return "";
    }
}
