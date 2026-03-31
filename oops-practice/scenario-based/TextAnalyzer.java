package scenario.based;

public class TextAnalyzer {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph. This paragraph is meant to test the TextAnalyzer. The analyzer should find the longest word and replace words.";
        String wordToReplace = "paragraph";
        String replacementWord = "text";
        int wordCount = countWords(paragraph);
        String longestWord = findLongestWord(paragraph);
        String modifiedParagraph = replaceWord(paragraph, wordToReplace, replacementWord);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Modified Paragraph: " + modifiedParagraph);
    }
    public static int countWords(String paragraph) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            return 0;
        }
        String[] words = paragraph.trim().split("\\s+");
        return words.length;
    }
    public static String findLongestWord(String paragraph) {
        String[] words = paragraph.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static String replaceWord(String paragraph, String target, String replacement) {
        return paragraph.replaceAll("\\b" + target + "\\b", replacement);
    }
}

