package com.john.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> execQuery(String sql, RowMapper<?> rowMapper, Object... values) {
        try {
            //1. 获取链接
            Connection conn = this.getConnection();

            //2. 创建语句集
            PreparedStatement statement = this.createPrepareStatement(conn, sql);

            //3. 执行语句集
            ResultSet rs = this.exec(statement, values);

            //4. 处理结果集
            List<?> result = this.parseResultSet(rs, rowMapper);

            //5. 关闭资源
            this.close(rs, statement, conn);

            return result;

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void close(ResultSet rs, PreparedStatement statement, Connection conn) throws SQLException {
        rs.close();
        statement.close();
        conn.close();

    }

    protected List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws SQLException {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    protected ResultSet exec(PreparedStatement statement, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            statement.setObject(i, values[i]);
        }
        return statement.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    protected Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
