import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>(Collections.reverseOrder());
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void updateContact(String name, String phoneNumber) {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void printPhoneBook() {
        System.out.println("Телефонная книга:");
        for (String name : contacts.keySet()) {
            List<String> phoneNumbers = contacts.get(name);
            System.out.println("Имя: " + name);
            System.out.println("Номера телефонов:");
            for (String phoneNumber : phoneNumbers) {
                System.out.println("- " + phoneNumber);
            }
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        int choice = 0;
        while (choice != 5) {
            System.out.println("Меню Телефонной книги:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Обновить контакт");
            System.out.println("4. Вывести телефонную книгу");
            System.out.println("5. Выход");
            System.out.print("Введите ваш выбор: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя контакта: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(name, phoneNumber);
                    System.out.println("Контакт добавлен.");
                    break;
                case 2:
                    System.out.print("Введите имя контакта: ");
                    name = scanner.nextLine();
                    phoneBook.removeContact(name);
                    System.out.println("Контакт удален.");
                    break;
                case 3:
                    System.out.print("Введите имя контакта: ");
                    name = scanner.nextLine();
                    System.out.print("Введите новый номер телефона: ");
                    phoneNumber = scanner.nextLine();
                    phoneBook.updateContact(name, phoneNumber);
                    System.out.println("Контакт обновлен.");
                    break;
                case 4:
                    phoneBook.printPhoneBook();
                    break;
                case 5:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, попробуйте снова.");
            }
            System.out.println();
        }
    }
}
