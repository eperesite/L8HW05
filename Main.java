import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите IP-адрес: ");
        String ipAddress = scanner.nextLine();

        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|\\d)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|\\d)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|\\d)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|\\d)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        if (matcher.matches()) {
            System.out.println("IP-адрес соответствует стандарту");
        } else {
            System.out.println("IP-адрес не соответствует стандарту.");
        }

        scanner.close();
    }
}