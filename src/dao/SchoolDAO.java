package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.School;

public class SchoolDAO extends DAO{
	public School search(String cd, String name)
			throws Exception {
			School School=null;

			Connection con=getConnection();

			PreparedStatement st;
			st=con.prepareStatement(
				"select * from school where cd=? and name=?");
			st.setString(1, cd);
			st.setString(2, name);
			ResultSet rs=st.executeQuery();

			while (rs.next()) {
				School=new School();
				School.setCd(rs.getString("cd"));
				School.setName(rs.getString("name"));
			}

			st.close();
			con.close();
			return School;
		}

	public School get(String cd) throws Exception {
		School school = new School();
		Connection connection = getConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement("select * from school where cd = ?") ;
			statement.setString(1,cd);
			ResultSet rSet = statement.executeQuery();
			if ( rSet.next()){
				school.getName();
			}
		} catch ( Exception e ){
			throw e;
		} finally {

		}
		return school;
	}
}
