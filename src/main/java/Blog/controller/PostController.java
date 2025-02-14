package Blog.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import Blog.Model.Post;
import Blog.service.PostService;

@RestController
@RequestMapping("/posts")

public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/author/{authorId}")
    public List<Post> getPostsByAuthor(@PathVariable Long authorId) {
        return postService.getPostsByAuthor(authorId);
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
}
