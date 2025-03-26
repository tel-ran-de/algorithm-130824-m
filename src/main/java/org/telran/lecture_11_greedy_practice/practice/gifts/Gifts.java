package org.telran.lecture_11_greedy_practice.practice.gifts;

// У вас есть список людей, которым нужно подарить подарки.
// У каждого человека есть предпочтения по подаркам, выраженные в виде списка желаемых подарков.
// Каждый подарок можно подарить только одному человеку. Ваша задача - осчастливить как можно больше людей.


public class Gifts {
    public static void main(String[] args) {

        Map<String, List<String>> peoplePreferences = new HashMap<>();
        peoplePreferences.put("Alice", Arrays.asList("Book", "Chocolate", "Flowers"));
        peoplePreferences.put("Bob", Arrays.asList("Chocolate", "Socks","Iphone"));
        peoplePreferences.put("Charlie", Arrays.asList("Iphone","Flowers", "Book"));
        peoplePreferences.put("David", Arrays.asList("Socks", "Book"));

        Set<String> availableGifts = new HashSet<>(Arrays.asList("Iphone", "Book", "Chocolate", "Flowers", "Socks"));

        Map<String, String> giftAssignment = new HashMap<>();

        List<Map.Entry<String, List<String>>> sortedPeople = new ArrayList<>(peoplePreferences.entrySet());
        sortedPeople.sort(Comparator.comparingInt(entry -> entry.getValue().size()));

        for (Map.Entry<String, List<String>> entry : sortedPeople) {
            String person = entry.getKey();
            List<String> preferences = entry.getValue();

            for (String gift : preferences) {
                if (availableGifts.contains(gift)) {
                    giftAssignment.put(person, gift);
                    availableGifts.remove(gift);
                    break;
                }
            }
        }

        for (Map.Entry<String, String> assignment : giftAssignment.entrySet()) {
            System.out.println(assignment.getKey() + " получает " + assignment.getValue());
        }
    }
}
