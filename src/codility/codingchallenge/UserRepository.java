package codility.codingchallenge;

import io.reactivex.Observable;
import io.reactivex.Single;

import java.util.List;

public class UserRepository {

    Single<UserDto> getById(String userId) {
        return Observable.fromIterable(List.of(new UserDto("1212", "112"))).singleOrError();
    }

}
