package levvel.io.model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
public class Blog {

    @Id
    String id;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @NonNull
    String author;

    @NonNull
    String title;

    @NonNull
    String text;

    List<Comment> comments = new ArrayList<>();

    //could just use built in getComments() (lombok @Data) and add it to the list, but this helps readability
    public void addComment(Comment comment) {
        if (comment != null) {
            comments.add(comment);
        }
    }

    public Comment getComment(int index) {
        return this.comments.get(index);
    }
}
