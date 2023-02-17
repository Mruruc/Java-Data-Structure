package Java_Collections;
import java.time.LocalDateTime;
import java.util.LinkedList;

/*
Implementing a browser history: You can use a linked list to represent the browsing history of a user.
 Each node in the linked list can represent a visited web page, and the data part of the node can be the URL,
the page title, and the date and time of the visit. The next pointer of each node can point to the next page visited by the user.
This way, you can easily implement the forward and backward buttons in a web browser.

 */
public class Browser {
    private LinkedList<WebPage> history;
    private int currentIndex;
    Browser(){
        history=new LinkedList<>();
        currentIndex=-1;
    }
    public void visit(String url, String title) {
        while (history.size() > currentIndex + 1) {
            history.removeLast();
        }
        history.add(new WebPage(url, title));
        currentIndex++;
    }
    public WebPage back() {
        if (currentIndex > 0) {
            currentIndex--;
            return history.get(currentIndex);
        } else {
            System.out.println("You are already on the first page.");
            return null;
        }
    }
    public WebPage forward() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            return history.get(currentIndex);
        } else {
            System.out.println("You are already on the latest page.");
            return null;
        }
    }


    static class WebPage{
        private String url;
        private String title;
        private LocalDateTime visitTime;

        public WebPage(String url,String title) {
            this.url=url;
            this.title = title;
            this.visitTime=LocalDateTime.now();
        }

        public String getUrl() {
            return url;
        }

        public String getTitle() {
            return title;
        }
        public LocalDateTime getVisitTime(){
            return visitTime;
        }
    }


    public static void main(String[] args) {

            Browser browser = new Browser();

            // Visit some web pages
            browser.visit("https://www.google.com", "Google");
            browser.visit("https://www.facebook.com", "Facebook");
            browser.visit("https://www.youtube.com", "YouTube");
            browser.visit("https://www.github.com", "GitHub");
            browser.visit("https://www.reddit.com", "Reddit");

            // Go back a few pages
            browser.back(); // Returns GitHub
            browser.back(); // Returns YouTube

            // Go forward to the latest page
            browser.forward(); // Returns Reddit

    }
}
