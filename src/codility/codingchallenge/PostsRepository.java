package codility.codingchallenge;

import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.List;

public class PostsRepository {

    Single<List<PostDto>> getAll() {
        return Observable.fromIterable(List.of(new PostDto("1212", "112", "1212"), new PostDto("1212", "112", "1212"))).toList();
    }

}
