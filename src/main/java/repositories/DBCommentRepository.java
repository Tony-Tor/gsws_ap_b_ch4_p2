package repositories;

import main.Comment;

public class DBCommentRepository implements CommetRepository{

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
