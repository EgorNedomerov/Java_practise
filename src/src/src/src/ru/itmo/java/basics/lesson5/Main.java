package src.src.src.ru.itmo.java.basics.lesson5;
public class Main {
    public static void main (String [] args) {
        Task5.longWord("Когда что-то достаточно важно вы делаете это даже если шансы не в вашу пользу");
        Task5.palindrom(new StringBuilder("Казак"));
        Task5.censored();
        Task5.entryString ("Встретились Бяка и Бука.\n" +
                "Бяка не издал ни звука.\n",
                "Бяка");
        Task5.inverstString("Sample Output:"+
                "The given string is: This is a test string"+
                "The string reversed word by word is:"+
                "sihT si a tset gnirts");
    }
}
