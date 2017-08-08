package org.zerock.web;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodController
 */
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher
		 = request.getRequestDispatcher("/WEB-INF/food.jsp");
		
		List<FStore> list = new ArrayList<>();
		
		try(RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\store.raf", "rw")){
			
			while(true) {
				
				byte[] temp = new byte[500];
				raf.read(temp);
				
				FStore store = new FStore(temp);
				System.out.println(store);
				list.add(store);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		request.setAttribute("list", list);
		
		dispatcher.forward(request, response);
	}

}
