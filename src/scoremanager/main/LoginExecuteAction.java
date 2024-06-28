package scoremanager.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Teacher;
import dao.TeacherDAO;
import tool.Action;

public class LoginExecuteAction extends Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		String id = request.getParameter("id");
//		String name = request.getParameter("name");
		String password = request.getParameter("password");
//		School school = request.getParameter("school");

		TeacherDAO dao = new TeacherDAO();
		Teacher user = dao.search(id, password);

		if ( user != null ){

			System.out.println(user);

			session.setAttribute("user", user);

			System.out.println(user.getId());
			System.out.println(user.getPassword());
			System.out.println(user.getSchool());

//			request.getRequestDispatcher("StudentList.action").forward(request, response);
			request.getRequestDispatcher("menu.jsp").forward(request, response);
		}
		else {
//		request.getRequestDispatcher("menu.jsp").forward(request, response);
//		request.getRequestDispatcher("StudentList.action").forward(request, response);
		request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}
