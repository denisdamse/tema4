package ro.emanuel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class VocaleServlet
 */
@WebServlet("/VocaleServlet")
public class VocaleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VocaleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String vocale = "aeiou";
			int numarVocale=0;
			String result = request.getParameter("a");
			for(int i=0;i<result.length();i++)
			{
				for(int j=0;j<vocale.length();j++)
				{
					if(vocale.charAt(j)==result.charAt(i))
					{
						numarVocale++;
					}
				}
			}
			response.getWriter().append("Avem "+numarVocale+" vocale");
		}catch(NumberFormatException exc)
		{
			System.out.println(exc);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
