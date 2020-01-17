package com.example.HW4.Service;

import com.example.HW4.Model.Album;
import com.example.HW4.Model.Comment;
import com.example.HW4.Model.Photo;
import com.example.HW4.Repository.AlbumRepo;
import com.example.HW4.Repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServ {
    @Autowired
    private CommentRepo repo;

   // @Autowired
    //AlbumRepo albumRepo;

    public List<Comment> getComment()
    {
        return repo.findAll();
        //return new ArrayList<>();
    }

    public void save(Comment comment) {
        repo.save(comment);
    }

    public void edit(Comment comment) {
        repo.save(comment);
    }

    public void delete(String id) {
        repo.deleteById (id);
    }

    public void deleteByPhotoId(String photoId)
    {
        repo.deleteByPhotoId(photoId);
    }
    public void deleteAll(List<Comment>comment)
    {
        repo.deleteAll(comment);
    }

    public void deleteCommentsByAlbumId(String photoId) {
        repo.deleteByPhotoId(photoId);
    }

    //public void deleteByAlbumId(String albumId) {
       //repo.deleteByAlbumId(albumId);
  // }


    //public void deleteComments(Object byAlbumId) {
       //repo.deleteComments(byAlbumId);
    //}
}
