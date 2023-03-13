package codility.codingchallenge;

import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.List;

public class RetrieveAllPostsFromUser {

    private final PostsRepository postsRepository;
    private final UserRepository userRepository;

    RetrieveAllPostsFromUser(
            PostsRepository postsRepository,
            UserRepository userRepository
    ) {
        this.postsRepository = postsRepository;
        this.userRepository = userRepository;
    }

    Single<List<PostEntity>> getAllPosts() {
        return postsRepository.getAll()
                .flatMap(postDtos -> Observable.fromIterable(postDtos)
                        .flatMapSingle(postDto -> userRepository.getById(postDto.getAuthorId())
                                .map(userDto -> new PostEntity(userDto.getName(), postDto.getContent()))
                                .onErrorReturn(throwable -> new PostEntity(null, postDto.getContent())))
                        .toList());
    }

    public static void main(String[] args) {
        RetrieveAllPostsFromUser teste = new RetrieveAllPostsFromUser(new PostsRepository(), new UserRepository());

        var testePOst = teste.getAllPosts();
        System.out.println("");
    }

}
