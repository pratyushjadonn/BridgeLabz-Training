package scenario.based;

public class StringsSentenceFormatter {
    public static void main(String[] args) {
        String paragraph = "this is a test.  this is only a test!is it working? yes,it is.";
        String formattedParagraph = formatParagraph(paragraph);
        System.out.println(formattedParagraph);
    }
    public static String formatParagraph(String paragraph) {
        // Trim leading and trailing spaces
        paragraph = paragraph.trim();
        // Replace multiple spaces with a single space
        paragraph = paragraph.replaceAll("\\s+", " ");
        // Add space after punctuation 
        paragraph = paragraph.replaceAll("([.!?])([^\\s])", "$1 $2");
        // Capitalize the first letter of sentence
        String[] sentences = paragraph.split("(?<=[.!?])\\s*");
        StringBuilder formatted = new StringBuilder();
        for (String sentence : sentences) {
            if (sentence.length() > 0) {
                formatted.append(Character.toUpperCase(sentence.charAt(0)))
                         .append(sentence.substring(1))
                         .append(" ");
            }
        }
        return formatted.toString().trim();
    }
}

