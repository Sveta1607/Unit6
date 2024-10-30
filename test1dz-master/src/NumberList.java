import java.util.List;

class NumberList {
    private List<Integer> numbers;

    public NumberList(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public double calculateTheCost() {
        if (numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}
