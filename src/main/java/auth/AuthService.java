package auth;

import io.grpc.stub.StreamObserver;
import auth.Auth.*;
public class AuthService extends AuthServiceGrpc.AuthServiceImplBase {

    @Override
    public void createUser(CreateUserRequest request, StreamObserver<UserTokenResponse> responseObserver) {


        String token = "временный_токен";

        UserTokenResponse response = UserTokenResponse.newBuilder()
                .setToken(token)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void loginUser(LoginUserRequest request, StreamObserver<UserTokenResponse> responseObserver) {


        String token = "временный_токен";

        UserTokenResponse response = UserTokenResponse.newBuilder()
                .setToken(token)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getUserId(GetUserIdRequest request, StreamObserver<GetUserIdResponse> responseObserver) {


        long userId = 12345;

        GetUserIdResponse response = GetUserIdResponse.newBuilder()
                .setUser(userId)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
