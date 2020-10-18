package com.john.pattern.template.jdbc;

import javax.sql.DataSource;
import java.util.List;

public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){

        String sql = "select * from member";

        return execQuery(sql, (RowMapper<Member>) (rs, rowNum) -> new Member(
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("nickname"),
                rs.getInt("age"),
                rs.getString("addr")
               ));
    }


}
