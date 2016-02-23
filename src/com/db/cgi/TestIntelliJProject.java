package com.db.cgi;

/**
 * Created by divyashree.jagadeesh on 19-02-2016.
 */
public class TestIntelliJProject {

    private int a, b;
    /*private TestIntelliJProject(){

    }*/

    private void add(int a, int b){
        System.out.println("Result of a+b : " + (a + b));
        System.out.println("Result of a+b : " + (a + b));
    }



    public static void main(String[] args) {
        System.out.println("Welcome to IntelliJ ...");
        int i = 5;
        TestIntelliJProject t = new TestIntelliJProject();
        t.add(3,4);
    }
}
