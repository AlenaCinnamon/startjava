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
    }
}