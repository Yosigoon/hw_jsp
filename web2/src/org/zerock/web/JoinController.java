package org.zerock.web;

import java.io.IOException;
import java.io.RandomAccessFile;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinController
 */
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/WEB-INF/join.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("join post controll..........");
		
		FStore vo = new FStore(request.getParameter("p1"),request.getParameter("p2"),request.getParameter("p3"));
		
		System.out.println(vo);
		
		try(RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\store.raf", "rw")){
			
			raf.seek(raf.length());
			raf.write(vo.getBytes());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/WEB-INF/joinResult.jsp");
		
		dispatcher.forward(request, response);
		
		
	}

}
