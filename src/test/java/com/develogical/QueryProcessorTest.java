package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutAusten() throws Exception {
        assertThat(queryProcessor.process("Austen"), containsString("author"));
    }

    @Test
    public void sendName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("KNEA"));
    }

    @Test
    public void query1() throws Exception {
        assertThat(queryProcessor.process("what is 1 plus 13"), containsString("14"));
    }

//    @Test
//    public void query2() throws Exception {
//        assertThat(queryProcessor.process("which of the following numbers is the largest: 42,87,223,755"), containsString("755"));
//    }
//
//    @Test
//    public void query2a() throws Exception {
//        assertThat(queryProcessor.process("which of the following numbers is the largest: 42,87,223,755"), containsString("755"));
//    }

    @Test
    public void queryPrime() throws Exception {
        assertThat(queryProcessor.process(":which is prime: 3,4,6"), containsString("3"));
    }

    @Test
    public void querycube() throws Exception {
        assertThat(queryProcessor.process(":which is square and a cube: 350,301,1000000,361"), containsString("1000000"));
    }
}
