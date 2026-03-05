package com.ktdsuniversity.edu.tmdb.db.helper;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@FunctionalInterface
public interface BindingParameter {

	void bind(PreparedStatement pstmt) throws SQLException;

}