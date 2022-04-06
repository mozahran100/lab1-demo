package com.demo.lab1demo.repositories;


public class PostRepoImpl {

//    List<Post> posts;
//
//    public PostRepositoryImpl() {
//        this.posts = new ArrayList<>();
//    }
//
//    @Override
//    public Post get(long id) {
//        return posts.stream()
//                .filter(post -> post.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    @Override
//    public List<Post> getAll() {
//        return posts;
//    }
//
//    @Override
//    public Post create(Post post) {
//        long lastId = 1;
//        if(posts.size() > 0)
//            lastId = posts.get(posts.size()-1).getId();
//
//        post.setId(++lastId);
//
//        posts.add(post);
//        return post;
//    }
//
//    @Override
//    public Post update(Post post) {
////       Optional<Post> oldPost = posts.stream()
////               .filter(p -> p.getId() == post.getId())
////               .findFirst();
////
////       if (!oldPost.isPresent())
////           return null;
////
////       Post modifiedPost = oldPost.get();
////       modifiedPost = post;
////
////       return modifiedPost;
//
//        boolean isExists = false;
//
//        for (Post p: posts) {
//            if(p.getId() == post.getId()) {
//                p = post;
//                isExists = true;
//            }
//        }
//        return isExists ? post : null;
//    }
//
//    @Override
//    public long delete(long id) {
//        Optional<Post> oldPost = posts.stream()
//                .filter(p -> p.getId() == id)
//                .findFirst();
//        if (!oldPost.isPresent())
//            return -1;
//
//        posts.remove(oldPost.get());
//        return id;
//    }
}
