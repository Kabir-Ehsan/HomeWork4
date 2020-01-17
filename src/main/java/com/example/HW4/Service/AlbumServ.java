package com.example.HW4.Service;

import com.example.HW4.Model.Album;
import com.example.HW4.Model.Comment;
import com.example.HW4.Repository.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumServ{

    @Autowired
    AlbumRepo repo;

    @Autowired
    PhotoServ photoServ;

    @Autowired
    CommentServ commentServ;

    public List<Album> getAlbum()
    {
        return repo.findAll();
        //return new ArrayList<>();
    }

    public void save(Album album) {
        repo.save(album);
    }

    public void edit(Album album) {
        repo.save(album);
    }

    public void delete(String id) {
        //commentServ.deleteByAlbumId(id);
        commentServ.deleteCommentsByAlbumId(photoServ.getPhotoByAlbumId(id).getId());
        photoServ.deleteByAlbumId(id);
        repo.deleteById(id);
       // commentServ.deleteByPhotoId(id);
    }

    public void deleteAll(List<Album>album)
    {
        repo.deleteAll(album);
    }

}