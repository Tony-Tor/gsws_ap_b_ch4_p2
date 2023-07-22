package services;

import main.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommetRepository;

@Service
public class CommentService {
    private final CommetRepository commetRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommetRepository commetRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commetRepository = commetRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commetRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
