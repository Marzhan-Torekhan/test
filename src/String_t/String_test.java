package String_t;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_test {
    //private static String d;

    public static void main(String[] args) {
//        System.out.println("Чтобы узнать длину этой строки в символах, достаточно написать такую команду:".length());

//        String s1 = new String("Строка тоже объект");
//        System.out.println(s1);

        //Раз строки являются объектами, то оператор == будет сравнивать ссылки.
//        String s1 = "Hello!";
//        String s2 = new String("Hello!");
//        System.out.println(s1==s2);

        //Напечатает true. Ведь Java не добавит в пул две одинаковых строки.
        //s1 и s2 ссылаются на один и тот же объект — строку в кавычках (в Java одинаковые строковые константы хранятся в одном экземпляре)
//        String s1 = "Medina";
//        String s2 = "Medina";
//        System.out.println(s1==s2);

//      В первой и пятой строке строится копия строки, во второй и четвертой переменным присваивается ссылка на существующую строку.
//      Сколько объектов создает фрагмент выше?
//      Оказывается, три! Строки s1 и s5 уникальны, s2 и s3 ссылаются на один и тот же объект — строку
//      в кавычках (в Java одинаковые строковые константы хранятся в одном экземпляре) и, наконец,
//      s4 ссылается на тот же объект, что и s1.
//      Раз строки являются объектами, то оператор == будет сравнивать ссылки.

//        String s1 = new String("Строка тоже объект");
//        String s2 = "Строка тоже объект";
//        String s3 = "Строка тоже объект";
//        String s4 = s1;
//        String s5 = new String(s1)
        //Всё это означает лишь одно: строки, как и любые другие объекты, всегда нужно сравнивать с помощью метода equals.
        //В классе String он сравнивает не ссылки, а именно последовательность символов в строках.
        //И если текст в строках одинаковый, неважно, как они были созданы и где хранятся: в пуле строк, или в отдельной области памяти.
//        String s1 = "Java!";
//        String s2 = new String("Java!");
//        System.out.println(s1.equals(s2));

        //Проверка функции
        //System.out.println(mulString("S",10));

        //StringBuilder
//        StringBuilder stringbuilder = new StringBuilder("StringBuilder");
//        stringbuilder.append(" - класс для часто изменяемых строк.");
//        System.out.println(stringbuilder);

        //Регулярные выражения
        //Регулярное выражение (RegEx) — это шаблон для поиска строки в
        // тексте или проверки соответствия текста шаблону. Кроме этого,
        // можно найти все вхождения какой-то строки в тексте.

//        String text = "<strike>Это удалить!</strike>А это хороший текст, его трогать не надо.<strike> и это не нужно!</strike>";
//        Pattern pattern = Pattern.compile("<strike>.*?</strike>");
//
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()){
//            int start = matcher.start();
//            int end = matcher.end();
//            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
//        }
//
//        System.out.println("Clean the text");
//        System.out.println(matcher.replaceAll(""));


        //Используя скобки, можно группировать части найденного фрагмента и заменять частями.

        //Например, мы можем использовать замену регулярными выражениями, если нам надо
        // поменять имя и фамилию местами. Допустим, что строка состоит только из имени
        // и фамилии, разделенных одним пробелом, тогда задача решается таким кодом:

        String text = "Marzhan Torekhan";
        Pattern p = Pattern.compile("(.*) (.*)");
        Matcher m = p.matcher(text);

        System.out.println(m.replaceFirst("$2 $1"));
        System.out.println(m.replaceFirst("$0"));
        System.out.println(m.replaceFirst("$0"));
        System.out.println(m.replaceFirst("$0"));




    }

    static String mulString(String p, int n) {
        String result = "";
        for (int i = 0; i < n; i++)
            result += p;
        return result;
    }
}
