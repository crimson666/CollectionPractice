package dsa;

public class EncryptionShift {
    public static String encryptMessage(int firstSize, int firstRotate, int secondRotate, String message) {
        StringBuilder encryptedMessage = new StringBuilder();

        // Define the two groups of letters
        String firstGroup = "abcdefghijklmnopqrstuvwxyz".substring(0, firstSize);
        String secondGroup = "abcdefghijklmnopqrstuvwxyz".substring(firstSize);

        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                encryptedMessage.append(ch);
            } else if (firstGroup.indexOf(ch) != -1) {
                int rotatedIndex = (firstGroup.indexOf(ch) + firstRotate) % firstGroup.length();
                encryptedMessage.append(firstGroup.charAt(rotatedIndex));
            } else if (secondGroup.indexOf(ch) != -1) {
                int rotatedIndex = (secondGroup.indexOf(ch) + secondRotate) % secondGroup.length();
                encryptedMessage.append(secondGroup.charAt(rotatedIndex));
            } else {
                // For characters other than lowercase letters, leave unchanged
                encryptedMessage.append(ch);
            }
        }

        return encryptedMessage.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(encryptMessage(17, 9, 5, "the quick brown fox jumped over the lazy dog"));
        System.out.println(encryptMessage(13, 0, 0, "this string will not change at all"));
    }
}
