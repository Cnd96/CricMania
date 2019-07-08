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

public class SearchPlayerController extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException   {
		
		String playerName=req.getParameter("playerName");
		
		
		 PlayersService playerService=new PlayersService();
		 Player player=playerService.getPlayer(playerName);
		 
		 req.setAttribute("player", player);
		 RequestDispatcher rd=req.getRequestDispatcher("EditPlayer.jsp");
		 rd.forward(req, res);
	}
}
