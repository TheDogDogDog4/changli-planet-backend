package com.creamakers.usersystem.service;


import com.creamakers.usersystem.dto.request.*;
import com.creamakers.usersystem.po.User;

public interface UserService {

    User getUserByUsername(String username);

    User getUserByEmail(String email);

    void cacheRefreshToken(String username, String deviceId, String refreshToken);

    boolean isRefreshTokenExpired(String username, String deviceId);

    void deleteRefreshToken(String username, String deviceId);

    String getCachedAccessTokenFromBlack(String accessToken);

    int addUser(User newUser);

    User createUserAndInsert(RegisterRequest registerRequest, String encodedPassword);

    boolean updateUserPassword(User user);

    int saveUser(User newUser);

    void addAccessToBlacklist(String accessToken);

    String getFreshTokenByUsernameAndDevicedId(String username, String deviceId);

    boolean updateUserUsername(UsernameUpdateRequest request);


    boolean existsByEmail(String newEmail);

    boolean updateUserEmail(User user);
}
