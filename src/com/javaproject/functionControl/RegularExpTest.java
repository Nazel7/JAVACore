package com.javaproject.functionControl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpTest {


    public static void main(String[] args) {
        String challange= "I want a ball.";
        String match= "^(?i)[a-z][ ][a-z]{4}[ ][a-z][ ][a-z]{4}.?$";
        Pattern pattern= Pattern.compile(match);
        Matcher matcher= pattern.matcher(challange);
        System.out.println(matcher.matches());
        String challenge4= "Replace all blank with an underscore.";
        System.out.println(challenge4.replaceAll("\\s", "_"));
        String challenge7= "ksjjs.135";
        System.out.println(challenge7.matches("^(?i)[a-z]+[.][0-9]+$"));
        String challenge8= "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pat= Pattern.compile("(?i)[a-z]+\\.(\\d+)");
        Matcher match1= pat.matcher(challenge8);
        while(match1.find()){
            System.out.println("Occurence : "+match1.start(1)+ ", "+ (match1.end(1)-1));
            System.out.println("Occurence : "+match1.group(1));
        }
        String challenge10= "{0, 2}{0, 5}{1, 3}{2, 4}";
        Pattern pat1= Pattern.compile("\\{(\\d+?, \\d+?)}");
        Matcher mach= pat1.matcher(challenge10);
        while(mach.find()){
            System.out.println("Occurence: "+ mach.group(1));
        }
        String usNumber= "11234-1113";
        Pattern path1= Pattern.compile("^[0-9]{5}-[\\d]{4}$");
        Matcher matc= path1.matcher(usNumber);
        System.out.println("Matches : "+ matc.matches());
    }


}
