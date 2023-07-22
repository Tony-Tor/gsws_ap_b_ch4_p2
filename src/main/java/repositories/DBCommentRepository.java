package repositories;

import main.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommetRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
