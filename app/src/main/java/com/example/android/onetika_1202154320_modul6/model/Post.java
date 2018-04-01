package com.example.android.onetika_1202154320_modul6.model;

public class Post {
    String id;
    private String userID;
    private String username;
    private String titlePost;
    private String post;
    private String imagePost;

    //Wajib kasih Constructor Kosong
    public Post() {
    }

    public Post(String id, String userID, String username, String mImagePost, String titlePost, String post) {
        this.id = id;
        this.username = username;
        this.imagePost = mImagePost;
        this.titlePost = titlePost;
        this.post = post;
        this.userID = userID;
    }

    public String getImagePost() {
        return imagePost;
    }

    public String getUserID() {
        return userID;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getTitlePost() {
        return titlePost;
    }

    public String getPost() {
        return post;
    }
}
