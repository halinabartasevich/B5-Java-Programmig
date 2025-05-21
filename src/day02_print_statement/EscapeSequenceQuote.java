package day02_print_statement;

public class EscapeSequenceQuote {
    public static void main(String[] agrs){
        /*
        Q: To be able to print we need double codes. How do we print double quotes itself?
           Ex: Programming Language "Java" is greate one.
         A: We can use ESCAPE SEQUENCE sequence.---->


        //  \ ----> backwards slash
        //  / -----> forward slash
 */
        System.out.println("Programming language Java is great one");
        System.out.println("Programming language \"Java\" is great one");

        /*
        Q:Since we use BACKWARD SLASH for duoble quotes, how quoteswe print do print the BACJWARDS SLASH itself?
        EX: Today is 05\10\2025
         */

        System.out.println("Today is 05 10 2025");
        System.out.println("Today is 05/10/2025");
        System.out.println("Today is 05\\10\\2025"); // 5\10 is LOST. Some data is LOST


        //How about if I want to printdouble backward slash?
        System.out.println("Today is 05\\\\10\\\\2025");
        System.out.println("Today is 05\'10\'2025"); // Here bacjward slash (\) is redunant. So we can remove it.
    }
}
