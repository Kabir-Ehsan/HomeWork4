package com.example.HW4.Resource;

import com.example.HW4.Model.Comment;
import com.example.HW4.Model.Photo;
import com.example.HW4.Service.CommentServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/albums/photos/comments")
public class CommentReso {
    @Autowired
    private CommentServ Serv;

    @GetMapping
    public List<Comment> getComment()
    {
        return Serv.getComment();
    }

    @PostMapping
    public void saveComment(@RequestBody Comment comment)
    {
        Serv.save(comment);
    }

    @PutMapping("/{id}")
    public void editComment(@RequestBody Comment comment, @PathVariable("id") String id)
    {
        comment.setId(id);
        Serv.edit(comment);
    }

    @DeleteMapping(value="/{id}")
    public void deleteComment(@PathVariable("id") String id)
    {
        //album.setId(id);
        Serv.delete(id);
    }

    @DeleteMapping
    public void deleteAllComment()
    {
        //album.setId(id);
        Serv.deleteAll(getComment());
    }

}

