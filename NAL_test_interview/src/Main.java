import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] array = {"aw", "aa", "ee", "oo", "ow", "w", "dd"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String input = scanner.nextLine();

        List<String> str = Arrays.stream(array).filter(element -> input.contains(element))
                .collect(Collectors.toList());

        System.out.println("Số lượng chữ cái tiếng việt có trong chuỗi" + str.size());
        System.out.println("Chữ cái tiếng việt có trong chuỗi" + str);


    }
}