class Text:
    def __init__(self, content):
        self.content = content
    
    def analyze(self):
        num_words = len(self.content.split())
        num_chars = len(self.content)
        num_lines = self.content.count('\n') + 1
        
        return {
            'word_count': num_words,
            'char_count': num_chars,
            'line_count': num_lines
        }


