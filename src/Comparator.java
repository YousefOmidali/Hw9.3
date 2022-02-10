import java.util.ArrayList;

public class Comparator {
    public void Comparator(ArrayList<Integer> numbers) {
        ArrayList<Integer> numbersAfterEdit = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 1;
        int temp1;
        int temp2;
        int count = 0;
        if ((numbers.size() % 2) == 0) {
            while (count < (numbers.size() / 2)) {
                temp1 = numbers.get(firstIndex);
                temp2 = numbers.get(secondIndex);
                if (temp1 <= temp2) {
                    numbersAfterEdit.add(temp1);
                    numbersAfterEdit.add(temp2);

                }
                count++;
                firstIndex += 2;
                secondIndex += 2;
            }
        }
        if ((numbers.size() % 2) == 1) {
            numbers.remove(numbers.size() - 1);
            while (count < (numbers.size() / 2)) {
                temp1 = numbers.get(firstIndex);
                temp2 = numbers.get(secondIndex);
                if (temp1 <= temp2) {
                    numbersAfterEdit.add(temp1);
                    numbersAfterEdit.add(temp2);
                }
                count++;
                firstIndex += 2;
                secondIndex += 2;
            }
        }
        for (Integer a:numbersAfterEdit) {
            System.out.println(a);
        }
    }
}