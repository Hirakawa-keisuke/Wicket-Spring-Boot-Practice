package com.example.wsbp.service;

import com.example.wsbp.data.AuthUser;

import java.util.List;

public interface IUserService {

    public void registerUser(String userName, String userPass);

    public void removeUser(String userName, String userPass);

    public boolean existsUser(String userName, String userPass);

    /**
     * ユーザ名とパスワードの一覧を、AuthUser型のリストで検索する
     *
     * @return AuthUser型のListインスタンス
     */
    public List<AuthUser> findAuthUsers();

}
