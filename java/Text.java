public class Text {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public AnalysisResult analyze() {
        int numWords = content.split("\\s+").length;
        int numChars = content.length();
        int numLines = content.split("\r\n|\r|\n").length;

        return new AnalysisResult(numWords, numChars, numLines);
    }

    public static class AnalysisResult {
        private final int wordCount;
        private final int charCount;
        private final int lineCount;

        public AnalysisResult(int wordCount, int charCount, int lineCount) {
            this.wordCount = wordCount;
            this.charCount = charCount;
            this.lineCount = lineCount;
        }

        public int getWordCount() {
            return wordCount;
        }

        public int getCharCount() {
            return charCount;
        }

        public int getLineCount() {
            return lineCount;
        }
    }

    public static void main(String[] args) {
        String textContent = "This is an example text.\nIt has multiple lines.\nAnd some characters.";

        Text textAnalyzer = new Text(textContent);
        AnalysisResult result = textAnalyzer.analyze();

        System.out.println("Word Count: " + result.getWordCount());
        System.out.println("Character Count: " + result.getCharCount());
        System.out.println("Line Count: " + result.getLineCount());
    }
}
