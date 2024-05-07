import java.util.*;

public class PhoneBook {

    private HashMap<String, TreeSet<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            TreeSet<String> phoneNumbers = new TreeSet<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        } else {
            contacts.get(name).add(phoneNumber);
        }
    }

    public void displayContacts() {
        List<Map.Entry<String, TreeSet<String>>> sortedContacts = new ArrayList<>(contacts.entrySet());

        sortedContacts.sort(new Comparator<Map.Entry<String, TreeSet<String>>>() {
            @Override
            public int compare(Map.Entry<String, TreeSet<String>> a, Map.Entry<String, TreeSet<String>> b) {
                return b.getValue().size() - a.getValue().size();
            }
        });

        for (Map.Entry<String, TreeSet<String>> entry : sortedContacts) {
            System.out.print(entry.getKey() + ": ");
            for (String number : entry.getValue()) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

}