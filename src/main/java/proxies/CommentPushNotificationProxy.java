package proxies;

import main.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentPushNotificationProxy  implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
