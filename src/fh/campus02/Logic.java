package fh.campus02;

public class Logic {
    public static void main(String[] args) {
        boolean sunny = true;
        boolean rainy = false;
        System.out.println(sunny && rainy);
        boolean confused = true;
        boolean wise = false;
        System.out.println(confused||wise);

        //(1 > 3 && (!(3-1< 5)) && 2== 4)

        boolean part1 = 1>3 &&  !(3-1<5);
        boolean part2 = 2 == 4*4;

        boolean result = part1 && part2;
        System.out.println(result);

        System.out.println(part1 || part2);
        System.out.println("hola caracola");
    }
}
