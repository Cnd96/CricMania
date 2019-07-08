package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Player;

public class PlayersService {

//	
	
	public Player getPlayer(String playerName) {
		    Database database =Database.getInstance();
	        Player player=new Player();
	        String query="SELECT * FROM players where name='"+playerName+"'";
	        ResultSet rs=database.search(query);
	        
	        try {
				if(rs.next()){
					 player.setId(rs.getInt("Id"));
				     player.setName(rs.getString("Name"));
				     player.setCountry(rs.getString("Country"));
				     player.setBattingStyle(rs.getString("BattingStyle"));
				     player.setAge(rs.getInt("Age"));
				     player.setTestPoints(rs.getInt("TestPoints"));
				     player.setTestruns(rs.getInt("TestRuns"));
				     player.setTestMatches(rs.getInt("TestMatches"));
				     player.setTestHighestScore(rs.getInt("TestHighestScore"));
				     player.setOdiruns(rs.getInt("OdiRuns"));
				     player.setOdiPoints(rs.getInt("OdiPoints"));
				     player.setOdiMatches(rs.getInt("OdiMatches"));
				     player.setOdiHighestScore(rs.getInt("OdiHighestScore"));
				 }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        return player;
	}
	public  List<Player> getAllPlayers(){
        Database database =Database.getInstance();
        Player player;
        String query="SELECT * FROM players ";
        ArrayList<Player> playerslist=new ArrayList();
        
        ResultSet rs=database.search(query);
        
         try
         {
              while( rs.next() ) {
                 player=new Player();
                 player.setId(rs.getInt("Id"));
                 player.setName(rs.getString("Name"));
                 player.setCountry(rs.getString("Country"));
                 player.setBattingStyle(rs.getString("BattingStyle"));
                 player.setAge(rs.getInt("Age"));
                 player.setTestPoints(rs.getInt("TestPoints"));
                 player.setTestruns(rs.getInt("TestRuns"));
                 player.setTestMatches(rs.getInt("TestMatches"));
                 player.setTestHighestScore(rs.getInt("TestHighestScore"));
                 player.setOdiruns(rs.getInt("OdiRuns"));
                 player.setOdiPoints(rs.getInt("OdiPoints"));
                 player.setOdiMatches(rs.getInt("OdiMatches"));
                 player.setOdiHighestScore(rs.getInt("OdiHighestScore"));
                 playerslist.add(player);
             }
             
         }
         catch(SQLException e){
             System.out.println(e);
         } 
         catch(Exception e){
             System.out.println(e+"account error");
         }
         
         return playerslist;
     }
	
	
    public  List<Player> getOdiRankOfPlayers(){
        Database database =Database.getInstance();
        Player player;
        String query="SELECT * FROM players ORDER by OdiPoints DESC LIMIT 10";
        ArrayList<Player> playerslist=new ArrayList();
        
        ResultSet rs=database.search(query);
        
         try
         {
              while( rs.next() ) {
                 player=new Player();
                 player.setId(rs.getInt("Id"));
                 player.setName(rs.getString("Name"));
                 player.setCountry(rs.getString("Country"));
                 player.setBattingStyle(rs.getString("BattingStyle"));
                 player.setAge(rs.getInt("Age"));
                 player.setTestPoints(rs.getInt("TestPoints"));
                 player.setTestruns(rs.getInt("TestRuns"));
                 player.setTestMatches(rs.getInt("TestMatches"));
                 player.setTestHighestScore(rs.getInt("TestHighestScore"));
                 player.setOdiruns(rs.getInt("OdiRuns"));
                 player.setOdiPoints(rs.getInt("OdiPoints"));
                 player.setOdiMatches(rs.getInt("OdiMatches"));
                 player.setOdiHighestScore(rs.getInt("OdiHighestScore"));
                 playerslist.add(player);
             }
             
         }
         catch(SQLException e){
             System.out.println(e);
         } 
         catch(Exception e){
             System.out.println(e+"account error");
         }
         
         return playerslist;
     }
    
    public  List<Player> getTestRankOfPlayers(){
        Database database =Database.getInstance();
        Player player;
        String query="SELECT * FROM players ORDER by TestPoints DESC LIMIT 10";
        ArrayList<Player> playerslist=new ArrayList();
        
        ResultSet rs=database.search(query);
        
         try
         {
              while( rs.next() ) {
                 player=new Player();
                 player.setId(rs.getInt("Id"));
                 player.setName(rs.getString("Name"));
                 player.setCountry(rs.getString("Country"));
                 player.setBattingStyle(rs.getString("BattingStyle"));
                 player.setAge(rs.getInt("Age"));
                 player.setTestPoints(rs.getInt("TestPoints"));
                 player.setTestruns(rs.getInt("TestRuns"));
                 player.setTestMatches(rs.getInt("TestMatches"));
                 player.setTestHighestScore(rs.getInt("TestHighestScore"));
                 player.setOdiruns(rs.getInt("OdiRuns"));
                 player.setOdiPoints(rs.getInt("OdiPoints"));
                 player.setOdiMatches(rs.getInt("OdiMatches"));
                 player.setOdiHighestScore(rs.getInt("OdiHighestScore"));
                 playerslist.add(player);
             }
             
         }
         catch(SQLException e){
             System.out.println(e);
         } 
         catch(Exception e){
             System.out.println(e+"account error");
         }
         
         return playerslist;
     }
    public int insertPlayer( Player player) {
	    Database database =Database.getInstance();
                    
        
        String query="INSERT INTO `players` (`Id`, `Name`, `Country`, `Age`, `TestPoints`, `OdiPoints`, `TestMatches`, `OdiMatches`, "
        	+ "`TestRuns`, `OdiRuns`, `BattingStyle`, `TestHighestScore`, `OdiHighestScore`) VALUES "
        	+ "(NULL,'"+player.getName()+"', '"+player.getCountry()+"', '"+player.getAge()+"', '"+player.getTestPoints()+"', '"+player.getOdiPoints()+"',"
        	+ " '"+player.getTestMatches()+"', '"+player.getOdiMatches()+"', '"+player.getTestruns()+"', '"+player.getOdiruns()+"', '"+player.getBattingStyle()+"', "
        			+ "'"+player.getTestHighestScore()+"', '"+player.getOdiHighestScore()+"');";

       
        int result = 0;
		try {
			result = database.update(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        return result;
    }
    
    public int updatePlayer( Player player) {
	    Database database =Database.getInstance();
                    
        
        String query="UPDATE players SET TestPoints='"+player.getTestPoints()+"',OdiPoints='"+player.getOdiPoints()+"',"
        		+ "TestMatches='"+player.getTestMatches()+"',OdiMatches='"+player.getOdiMatches()+"',"
        		+ "TestRuns='"+player.getTestruns()+"',OdiRuns='"+player.getOdiruns()+"',"
        		+ "TestHighestScore='"+player.getTestHighestScore()+"',OdiHighestScore='"+player.getOdiHighestScore()+"',"
        		+ "Age='"+player.getAge()+"' WHERE Name='"+player.getName()+"'";

       
        int result = 0;
		try {
			result = database.update(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        return result;
    }
}
