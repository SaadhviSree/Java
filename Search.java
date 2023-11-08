package filemgmt;

interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        // Implement the search logic for a document
        String[] words = content.split("\\s+");
        for (String word : words) {
            if (word.equals(keyword)) {
                return true;
            }
        }
        return false;
    }

}

class Webpage implements Searchable {
    private String url;
    private String htmlContent;

    public Webpage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public boolean search(String keyword) {
        // Implement the search logic for a webpage
        String cleanedHtml = htmlContent.replaceAll("\\<.*?\\>", ""); // Remove HTML tags
        String[] words = cleanedHtml.split("\\s+");
        for (String word : words) {
            if (word.equals(keyword)) {
                return true;
            }
        }
        return false;
    }

}

public class Search {
    public static void main(String[] args) {
        String documentContent = "This is a sample document for searching.";
        Document document = new Document(documentContent);

        String webpageContent = "<html><body><p>This is a sample webpage for searching.</p></body></html>";
        Webpage webpage = new Webpage("https://example.com", webpageContent);

        String searchKeyword = "sample";

        if (document.search(searchKeyword)) {
            System.out.println("Keyword found in the document.");
        } else {
            System.out.println("Keyword not found in the document.");
        }

        if (webpage.search(searchKeyword)) {
            System.out.println("Keyword found in the webpage.");
        } else {
            System.out.println("Keyword not found in the webpage.");
        }
    }
}
