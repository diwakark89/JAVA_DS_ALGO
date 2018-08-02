package com.org.problems;

public class RatMazeProblem {
	final static int N=4;
	public static void main(String[] args) {
		int maze[][]= {
				{1,1,1,1},
				{1,1,0,1},
				{0,0,1,1},
				{1,1,1,1}};
		solveMaze(maze);
		
	}
	
	public static boolean solveMaze(int maze[][]) {
		
		int sol[][]= {{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}};
		if(solveMazeUtil(maze,0,0,sol)==false) {
			System.out.println("Solution does not exists");
			return false;
		}
		printMaze(sol);
		return true;
	}
	
	private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol) {
		if(x==N-1 && y==N-1) {
			sol[x][y]=1;
			return true;
		}
		if(isSafe(x,y,maze)) {
			sol[x][y]=1;
			if(solveMazeUtil(maze, x+1, y, sol))
				return true;
			if(solveMazeUtil(maze, x, y+1, sol))
				return true;
			sol[x][y]=0;
			return false;
		}
		return false;
	}
	public static boolean isSafe(int x,int y,int maze[][]) {
		return ((x>=0 &&x<N)&& (y>=0 &&y<N) && (maze[x][y]==1));
	}
	public static void printMaze(int [][]m) {
		for(int a[]:m) {
			for(int b:a) {
				System.out.print(" "+b);
			}
			System.out.println();
		}
	}

}
