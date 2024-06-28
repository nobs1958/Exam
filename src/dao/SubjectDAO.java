package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Subject;

public class SubjectDAO extends DAO{
	public Subject search(String school_cd,String cd, String name)
			throws Exception {
			Subject Subject=null;

			Connection con=getConnection();

			PreparedStatement st;
			st=con.prepareStatement(
				"select * from school where school_cd = ? and cd=? and name=?");
			st.setString(1, school_cd);
			st.setString(2, cd);
			st.setString(3, name);
			ResultSet rs=st.executeQuery();

			while (rs.next()) {
				Subject = new Subject();
				Subject.setSchool_cd(rs.getString("school_cd"));
				Subject.setCd(rs.getString("cd"));
				Subject.setName(rs.getString("name"));
			}

			st.close();
			con.close();
			return Subject;
		}
}
