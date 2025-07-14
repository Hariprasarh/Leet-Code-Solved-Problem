class Solution {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) return "";

        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : arr) {
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }

        return sb.toString().trim();

    }
}