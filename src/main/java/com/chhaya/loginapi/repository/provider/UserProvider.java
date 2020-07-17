package com.chhaya.loginapi.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {

    public String selectUserSql() {
        return new SQL(){{
            SELECT("*");
            FROM("users");
            WHERE("status = true");
        }}.toString();
    }

    public String selectUserByEmail() {
        return new SQL(){{
            SELECT("*");
            FROM("users");
            WHERE("email = #{email}");
            AND();
            WHERE("status = true");
        }}.toString();
    }

}
