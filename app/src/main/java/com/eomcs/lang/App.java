package com.eomcs.lang;

import java.sql.Date;
import java.util.Scanner;

public class App {
	static Scanner keyboardScanner = new Scanner(System.in);
	static final int LENGTH = 100;
	
	//add Music, list Music
	static String [] musicTitle = new String[LENGTH];
	static String [] artistName = new String[LENGTH];
	static String [] albumName = new String[LENGTH];
	static String [] genre = new String[LENGTH];
	static Date [] releaseDate = new Date[LENGTH];
	static Date [] nowDate = new Date[LENGTH];
	static int musicSize = 0;
	static int number = 0;
	
	//add Playlist, list Playlist
	static String [] songs = {
			"Future - Life is Good(Feat. Dreak)" ,"Roddy Ricch - The Box","AJR - BANG!","Samm Henshaw - All Good","So!YoON! X Phum Viphurit - Wings",
			"Yerin Beak - Hate you", "Lil Nas X - Old Town Road(Feat. Billy Ray Cyrus)", "24kGoldn - Mood(Feat.Iann dior)", "Dua Lipa - Hallucinate"};
	static int playlistSize = 0;
	static final int PLENGTH = 100;
	static int [] songsNum = new int[PLENGTH];
	
	


	static void addMusic() {
		System.out.println("찾는 노래에 대한 검색어를 입력하세요.");
		System.out.println("노래 제목 : ");
		musicTitle[musicSize] = keyboardScanner.nextLine();
		
		System.out.println("아티스트 이름: ");
		artistName[musicSize] = keyboardScanner.nextLine();
		
		System.out.println("앨범 이름 : ");
		albumName[musicSize] = keyboardScanner.nextLine();
		
		System.out.println("장르 : ");
		genre[musicSize] = keyboardScanner.nextLine();
		
		System.out.println("발매일(yyyy-MM-dd) : ");
		releaseDate[musicSize] = Date.valueOf(keyboardScanner.nextLine());
		
		nowDate[musicSize]= new java.sql.Date(System.currentTimeMillis());
		
		musicSize++;
		
		
		}
	
	static void listMusic() {
		System.out.println("최근 검색 목록 : ");
		for(int i =0; i<musicSize; i++) {
			System.out.printf("검색 번호 : %d 검색일 : %s\n",i+1,nowDate[i]);
			System.out.printf("노래 제목 : %s 아티스트 이름 : %s 앨범 이름 : %s  장르 : %s  발매일 : %s\n",musicTitle[i], artistName[i],albumName[i], genre[i], releaseDate[i]);
			
		}
	}
	
	static void addPlaylist() {
		System.out.println("나만의 취향이 들어간 플레이리스트를 만들어 볼까요?");
		System.out.println("내 보관함 바로가기(Y/n)");
		String response = keyboardScanner.nextLine();
		if(response.equalsIgnoreCase("y")) {
			for(int i=0; i<songs.length; i++) {
				System.out.printf("번호 : %d 노래 제목 : %s\n",i+1,songs[i]);
				System.out.println("추가할 노래의 번호를 입력해주세요.");
				System.out.print("노래 번호 : ");
			}
			while(true) {
				songsNum[playlistSize] = Integer.parseInt(keyboardScanner.nextLine());
				System.out.printf("%d번 %s\n 노래가 추가 되었습니다.",songsNum[playlistSize],songs[songsNum[playlistSize]]);
				System.out.println("계속(y/N)");
				
				playlistSize++;
				if(response.equalsIgnoreCase("n")) {
					break;
				}
			}
		}
		System.out.println("종료");
		System.out.println();
	}
	
	static void listPlaylist() {
		System.out.println("플레이리스트 목록 : ");
		for(int i =0; i<playlistSize; i++) {
			
		}
		
	}
	
	public static void main (String [] arg) {
		loop:
		      while (true) {
		        System.out.print("명령> ");
		        String command = keyboardScanner.nextLine();

		        switch (command) {
		          case "/Music/add":
		        	  addMusic();
		        	  break;
		          case "/Music/list":
		          	listMusic();
		          	break;
		          case "/Playlist/add":
		        	  addPlaylist();
		        	  break;
		          case "/Playlist/list":
		        	  listPlaylist();
		        	  break;
		          case "quit":
		          case "exit":
		            System.out.println("서비스를 종료합니다.");
		            break loop;
		          default:
		            System.out.println("실행할 수 없는 명령입니다.");
		            
		        }
		      }

		keyboardScanner.close();
	}
}


