package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Class_num;

public class ClassNumDAO extends DAO {
	public Class_num search(String school_cd, String class_num)
			throws Exception {
			Class_num Class_num=null;

			Connection connection=getConnection();

			PreparedStatement statement;
			statement=connection.prepareStatement(
				"select * from class_num where school_cd=? and class_num=?");
			statement.setString(1, school_cd);
			statement.setString(2, class_num);
			ResultSet rs=statement.executeQuery();

			while (rs.next()) {
				Class_num=new Class_num();
				Class_num.setSchool_cd(rs.getString("school_cd"));
				Class_num.setClass_num(rs.getString("class_num"));
			}

			statement.close();
			connection.close();
			return Class_num;
		}

	public List<Class_num> filter(String school) throws Exception {
		List<Class_num> list = new ArrayList<>();
		Connection connection = getConnection();
		Class_num Class_num=null;

		PreparedStatement statement = null;
		statement=connection.prepareStatement("select * from class_num where school_cd=?");
		statement.setString(1, school);

		ResultSet rs=statement.executeQuery();

		System.out.println("rs:"+rs);
		
		while (rs.next()) {
			Class_num=new Class_num();
			Class_num.setSchool_cd(rs.getString("school_cd"));
			Class_num.setClass_num(rs.getString("class_num"));
			list.add(Class_num);
		}

		statement.close();
		connection.close();
		return list;
	}

}
