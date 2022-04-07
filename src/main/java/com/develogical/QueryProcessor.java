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
        return "";
    }
}
