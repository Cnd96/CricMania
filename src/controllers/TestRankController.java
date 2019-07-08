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



public class TestRankController extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException   {
		 PlayersService playerService=new PlayersService();
		 ArrayList<Player> playerlistByTestRank=(ArrayList<Player>) playerService.getTestRankOfPlayers();
		 
		 req.setAttribute("players", playerlistByTestRank);
		 RequestDispatcher rd=req.getRequestDispatcher("TestRanks.jsp");
		 rd.forward(req, res);
	}
}
