import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 10, 15, 20);
        List<Integer> list2 = List.of(10, 15, 20, 25);

        NumberList numberList1 = new NumberList(list1);
        NumberList numberList2 = new NumberList(list2);

        double averageValues1 = numberList1.calculateTheCost();
        double averageValues2 = numberList2.calculateTheCost();

        if (averageValues1 > averageValues2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (averageValues1 < averageValues2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }
}