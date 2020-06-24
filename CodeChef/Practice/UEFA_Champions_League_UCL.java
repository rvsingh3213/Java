UEFA Champions League Problem Code: UCL


https://www.codechef.com/viewsolution/32012045


/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.*;
import java.io.*;
import java.lang.Comparable;

/* Name of the class has to be "Main" only if the class is public. */
class Team implements Comparable<Team>{
	String name;
	int points;
	int goalDif;
	@Override
	public int compareTo(Team team2) {
		if( this.points == team2.points ) {
			return team2.goalDif-this.goalDif;
		}else {
			return team2.points-this.points;
		}
	}
	
	
}

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
	    try{
			ArrayList<Team>         Teams        ; 
		java.io.BufferedReader bf = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		int T = Integer.parseInt(bf.readLine().trim());
		for( int j=1 ; j<=T ; j++ ) {
			        Teams= new ArrayList<Team>();
			for( int i=1 ; i<=12 ; i++ ) {
				String line = bf.readLine().trim();
				String words[] = line.split(" ");
				String name1 = words[0];
				int G1 = Integer.parseInt(words[1]);
				int G2 = Integer.parseInt(words[3]);
				String name2 = words[4];
				Team team1 = null,team2=null;
				boolean isPresent1=false,isPresent2=false;
				for( Team team :         Teams         ) {
					if( team.name.equals(name1) ) {
						isPresent1=true;
						team1 = team;
					}else if( team.name.equals(name2) ) {
						isPresent2 = true;
						team2 = team;
					}
				}
				if( !isPresent1 ) {
					team1 = new Team();
					team1.name = name1;
					         Teams         .add(team1);
				}
				if( !isPresent2 ) {
					team2 = new Team();
					team2.name = name2;
					        Teams.add(team2);
				}
				if(  G1 > G2  ) {
					team1.points += 3;
				}else if(  G1 < G2  ) {
					team2.points += 3;
				}else {
					team1.points += 1;
					team2.points += 1;
				}
				team1.goalDif +=  G1 - G2 ;
				team2.goalDif +=  G2 - G1 ;
			
			}
			Collections.sort(Teams );
			System.out.println( Teams.get(0).name+" "+Teams.get(1).name);
			        Teams.clear();
		}
		}catch(Exception e){
			return;
		}
		
		}
	}
