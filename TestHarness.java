import java.util.*;

public class TestHarness
{
    public static void main(String[] args)
    {
        ArrayList<String> log = new ArrayList<>();

        log.add("Hello World!");
        log.add("SPAM........");
        log.add("The Eagle has Landed!");
        log.add("SPAM........");
        log.add("SPAM........");
        log.add("SPAM........");

        for(String s : log)
            System.out.println(s);
            
    }
}