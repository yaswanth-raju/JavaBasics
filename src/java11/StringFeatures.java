package java11;

public class StringFeatures {
    public static void main(String[] args) {
//        stringToLines();
//        repeatStr();
        stripAll();
    }

    static void isBlankVSEmpty() {
        System.out.println("isEmpty()");
        System.out.println("Example text".isEmpty());
        System.out.println("".isEmpty());
        System.out.println("  ".isEmpty());
        System.out.println("\t\n\r\f".isEmpty());
        System.out.println("isBlank() consider whitespaces and new lines as empty");
        System.out.println("Example text".isBlank());
        System.out.println("".isBlank());
        System.out.println("  ".isBlank());
        System.out.println("\t\n\r\f ".isBlank());
    }

    static void stringToLines() {
        System.out.println("lines() print in java 11 ");
        String linesStr = " hi \n there \t do u have tab \n no \nok";

        linesStr.lines().forEach(System.out::println);
    }
    static void repeatStr() {
        System.out.println("repeatme ".repeat(20));
    }
    static void stripAll() {
        String str=" stipe me ";
        System.out.println("stipe is >"+str.strip()+"<");
        System.out.println("stipe left >"+str.stripLeading()+"<");
        System.out.println("stipe right >"+str.stripTrailing()+"<");
    }
}
