package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BlogController {
    private PostRepository postRepository;
    @RequestMapping("/")
    public String listPosts(ModelMap modelMap){
        List<Post> posts= new PostRepository().getAllPosts();
        modelMap.put("posts",posts);
        return "home";
    }

    public BlogController(PostRepository postRepository){
        this.postRepository=postRepository;
    }
}
