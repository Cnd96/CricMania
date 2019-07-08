package models;

public class Player {
//	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

	  private int age,id,testPoints,odiPoints,testMatches,odiMatches,odiruns,testruns,testHighestScore,odiHighestScore;
	  private String name,country,battingStyle;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTestPoints() {
		return testPoints;
	}
	public void setTestPoints(int testPoints) {
		this.testPoints = testPoints;
	}
	public int getOdiPoints() {
		return odiPoints;
	}
	public void setOdiPoints(int odiPoints) {
		this.odiPoints = odiPoints;
	}
	public int getTestMatches() {
		return testMatches;
	}
	public void setTestMatches(int testMatches) {
		this.testMatches = testMatches;
	}
	public int getOdiMatches() {
		return odiMatches;
	}
	public void setOdiMatches(int odiMatches) {
		this.odiMatches = odiMatches;
	}
	public int getOdiruns() {
		return odiruns;
	}
	public void setOdiruns(int odiruns) {
		this.odiruns = odiruns;
	}
	public int getTestruns() {
		return testruns;
	}
	public void setTestruns(int testruns) {
		this.testruns = testruns;
	}
	public int getTestHighestScore() {
		return testHighestScore;
	}
	public void setTestHighestScore(int testHighestScore) {
		this.testHighestScore = testHighestScore;
	}
	public int getOdiHighestScore() {
		return odiHighestScore;
	}
	public void setOdiHighestScore(int odiHighestScore) {
		this.odiHighestScore = odiHighestScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBattingStyle() {
		return battingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

}
