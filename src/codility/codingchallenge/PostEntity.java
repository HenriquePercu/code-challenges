package codility.codingchallenge;

public class PostEntity {

    private final String authorName;
    private final String content;

    public PostEntity(String authorName, String content) {
        this.authorName = authorName;
        this.content = content;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getContent() {
        return content;
    }

}
