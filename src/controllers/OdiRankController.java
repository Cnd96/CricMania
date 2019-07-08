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

public class OdiRankController extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException   {
		
		 PlayersService playerService=new PlayersService();
		 ArrayList<Player> playerlistByOdiRank=(ArrayList<Player>) playerService.getOdiRankOfPlayers();
		 
		
		 req.setAttribute("players", playerlistByOdiRank);
		 RequestDispatcher rd=req.getRequestDispatcher("OdiRanks.jsp");
		 rd.forward(req, res);
	}
}
