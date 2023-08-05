public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        boolean miracast = false;
        byte core = 6;
        short windows = 10;
        int ram = 16;
        long systemType = 64;
        char localDrive = 'C';
        float frequency = 2.90F;
        double osAssembly = 19045.3208;
        System.out.println(miracast + " - проецирование на этот компьютер");
        System.out.println(core + " - количество ядер");
        System.out.println(windows + " - выпуск Windows");
        System.out.println(ram + " - оперативная память");
        System.out.println(systemType + " - тип системы");
        System.out.println(localDrive + " - локальный диск");
        System.out.println(frequency + " - тактовая частота процессора");
        System.out.println(osAssembly + " - сборка ОС");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        float sale = 0.11F;
        int sum = pen + book;
        float sumSale = sum*sale;
        float sumfinal = sum - sumSale;
        System.out.println(sum + " - общая стоимость товаров без скидки");
        System.out.println(sumSale + " - сумма скидки");
        System.out.println(sumfinal + " - общая стоимость товаров со скидкой");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte bt = 127;
        short sht = 32767;
        int i = 2147483647;
        long lng = 9223372036854775807l;
        System.out.print("byte " + bt + ", " + (++bt) + ", " + (--bt));
        System.out.print("\nshort " + sht + ", "+ (++sht) + ", " + (--sht) + ", ");
        System.out.print("\nint " + i + ", " + (++i) + ", " + (--i) + ", ");
        System.out.print("\nlong " +lng + ", " + (++lng) + ", ");

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c;
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных a: " + a + ", " + "b: " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("новые значения переменных a: " + a + ", " + "b: " + b);
        System.out.println("с помощью арифметических операций");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("новые значения переменных a: " + a + ", " + "b: " + b);
        System.out.println("с помощью побитовой операции ");
        a = a^b^(b = a);
        System.out.println("новые значения переменных a: " + a + ", " + "b: " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println(dollar + " " + Integer.toBinaryString(dollar) + "\n" + asterisk +" " +  Integer.toBinaryString(asterisk));
        System.out.println(atSign + " " + Integer.toBinaryString(atSign) + "\n" + verticalBar+" " +  Integer.toBinaryString(verticalBar));
        System.out.println(tilde+ " " + Integer.toBinaryString(tilde));

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char s1 = '/';
        char s2 = '\\';
        char s3 = '(';
        char s4 = ')';
        char s5 = '_';
        System.out.println("    "+ s1 + s2 + "    " + "\n   " + s1 + "  " + s2 + "   " + "\n  " + s1 + s5 + s3 + " " + s4 + s2+"  " + "\n " + s1 + "      " + s2 + " \n" + s1 + s5 + s5 + s5 + s5 + s1 + s2 + s5 + s5 +s2+" ");

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int n = 123;
        int x = n/100;
        int  y = n/10%10;
        int z = n%10;
        System.out.println("Число " + n + " содержит: " + "\nсотен - " + x + "\nдесятков - " + y + "\nединиц - " + z + "\ncумма его цифр = " + (x+y+z) + "\nпроизведение = " + (x*y*z));
        
        System.out.println("\n9.Вывод времени");
        int time = 86399;
        int hours = time/3600;
        int min = time/60%60;
        int sec = time%60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
