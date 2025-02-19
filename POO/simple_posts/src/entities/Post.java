package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static final DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

    private Instant moment;
    private String title;
    private String content;
    private int likes;

    private final List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(Instant moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public String toString() {
        //Tipo utilizado para construir strings, principalmente as maiores...
        StringBuilder sb = new StringBuilder();
        sb.append(this.title).append("\n");
        sb.append(this.likes).append(" Likes - ").append(dtFormat.format(this.moment)).append("\n");
        sb.append(this.content).append("\n");

        if (!comments.isEmpty()) {
            sb.append("----------------------------------------------------").append("\n");
            sb.append("comments:").append("\n");

            for (Comment element : comments) {
                sb.append(element.getText()).append("\n");
            }
        }

        return sb.toString();
    }
}
