package com.example.myproject;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SamServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain; charset=UTF-8");
//		resp.getWriter().println("Длина должна быть не меньше 2");
		String name = req.getParameter("var1");
		String surname = req.getParameter("var2");
		String sex = req.getParameter("var3");
		String age = req.getParameter("var4");
		String email = req.getParameter("var5");
		String result = "";
		try {
			if (name.length() < 2) {
				throw new LengthException();
			}
		} catch (LengthException s) {
			resp.getWriter().println("Длина должна быть не меньше 2");
		}

		if (name.length() == 0) {
			resp.getWriter().println("Напишите свое имя!");
			if (surname.length() == 0) {
				resp.getWriter().println("Напишите свое имя!");

			}
		}
	}
}