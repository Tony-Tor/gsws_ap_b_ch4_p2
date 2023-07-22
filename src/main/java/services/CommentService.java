package services;

import main.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommetRepository;

@Component
public class CommentService {
    @Autowired
    private final CommetRepository commetRepository;
    @Autowired
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommetRepository commetRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commetRepository = commetRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        commetRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
