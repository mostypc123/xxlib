#include <iostream>
#include <string>

class Text {
private:
    std::string content;

public:
    Text(std::string content) : content(content) {}

    struct AnalysisResult {
        int wordCount;
        int charCount;
        int lineCount;
    };

    AnalysisResult analyze() {
        int numWords = 0;
        int numChars = content.length();
        int numLines = 1;

        size_t pos = 0;
        while ((pos = content.find(' ', pos)) != std::string::npos) {
            ++numWords;
            ++pos;
        }
        ++numWords; // Count the last word

        pos = 0;
        while ((pos = content.find('\n', pos)) != std::string::npos) {
            ++numLines;
            ++pos;
        }

        AnalysisResult result = { numWords, numChars, numLines };
        return result;
    }
};

int main() {
    std::string textContent = "This is an example text.\nIt has multiple lines.\nAnd some characters.";

    Text textAnalyzer(textContent);
    Text::AnalysisResult result = textAnalyzer.analyze();

    std::cout << "Word Count: " << result.wordCount << std::endl;
    std::cout << "Character Count: " << result.charCount << std::endl;
    std::cout << "Line Count: " << result.lineCount << std::endl;

    return 0;
}
