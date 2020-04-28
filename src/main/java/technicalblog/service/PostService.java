package technicalblog.service;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;

import java.util.ArrayList;
import java.util.Date;
@Service
public class PostService {
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> postsList = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("First Post");
        post1.setBody("Post Body 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Second Post");
        post2.setBody("Post Body 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Third Post");
        post3.setBody("Post Body 3");
        post3.setDate(new Date());

        postsList.add(post1);
        postsList.add(post2);
        postsList.add(post3);

        return postsList;
    }
}
