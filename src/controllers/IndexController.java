package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Player;
import services.PlayersService;

public class IndexController  extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException   {
		
		 PlayersService playerService=new PlayersService();
		 ArrayList<Player> playerlist=(ArrayList<Player>) playerService.getAllPlayers();
		 
		 req.setAttribute("players", playerlist);
		 RequestDispatcher rd=req.getRequestDispatcher("Main.jsp");
		 rd.forward(req, res);
	}
}
