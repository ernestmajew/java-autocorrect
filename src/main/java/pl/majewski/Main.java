package pl.majewski;

public class Main {
    public static void main(String[] args) {
        String[] dictionary = new String[]{"car", "carpet", "java", "javascript", "internet"};

        AutoComplete ac = new AutoComplete(dictionary);
        ac.addToDictionary(new String[]{"carp"});

        System.out.println(ac.autoComplete("car"));
    }
}