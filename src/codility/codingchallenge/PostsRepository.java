package codility.codingchallenge;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;

public class PostsRepository {

    Single<List<PostDto>> getAll() {
        return Observable.fromIterable(List.of(new PostDto("1212", "112", "1212"), new PostDto("1212", "112", "1212"))).toList();
    }

}
