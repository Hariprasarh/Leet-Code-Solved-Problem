class Solution {
    public boolean isValid(String word) {
         int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                // digits are allowed, do nothing
            } else {
                // if any special character is present, return false
                return false;
            }
        }

        return word.length() >= 3 && vowels >= 1 && consonants >= 1;
    }
}