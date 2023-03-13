package codility.codingchallenge;

public class PostDto {

    public String Id;

    public String authorId;

    public String content;

    public PostDto(String id, String authorId, String content) {
        Id = id;
        this.authorId = authorId;
        this.content = content;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
