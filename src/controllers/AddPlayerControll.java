package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Player;
import services.PlayersService;

public class AddPlayerControll extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException   {
		String name=req.getParameter("name");
		String country=req.getParameter("country");
		String battingStyle=req.getParameter("battingStyle");
		int age=Integer.parseInt(req.getParameter("age"));
		int testmatches=Integer.parseInt(req.getParameter("testMatches"));
		int odiMatches=Integer.parseInt(req.getParameter("odiMatches"));
		int testPoints=Integer.parseInt(req.getParameter("testPoints"));
		int odiPoints=Integer.parseInt(req.getParameter("odiPoints"));
		int testruns=Integer.parseInt(req.getParameter("testruns"));
		int odiruns=Integer.parseInt(req.getParameter("odiruns"));
		int testHighestScore=Integer.parseInt(req.getParameter("testHighestScore"));
		int odiHighestScore=Integer.parseInt(req.getParameter("odiHighestScore"));
		

		 Player player=new Player();
	        player.setName(name);
	        player.setCountry(country);
	        player.setBattingStyle(battingStyle);
	        player.setAge(age);
	        player.setTestPoints(testPoints);
	        player.setTestMatches(testmatches);
	        player.setTestruns(testruns);
	        player.setTestHighestScore(testHighestScore);
	        player.setOdiPoints(odiPoints);
	        player.setOdiruns(odiruns);
	        player.setOdiMatches(odiMatches);
	        player.setOdiHighestScore(odiHighestScore);
	        
	        
		 PlayersService playerService=new PlayersService();
		 playerService.insertPlayer(player);
	
		 res.sendRedirect("http://localhost:8090/CricketApp/Index");
	}
}
