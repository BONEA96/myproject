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
	static int playlistSize = 0;
	static final int PLENGTH = 100;
	static String [] songs = {
			"Future - Life is Good(Feat. Dreak)" ,"Roddy Ricch - The Box","AJR - BANG!","Samm Henshaw - All Good","So!YoON! X Phum Viphurit - Wings",
			"Yerin Beak - Hate you", "Lil Nas X - Old Town Road(Feat. Billy Ray Cyrus)", "24kGoldn - Mood(Feat.Iann dior)", "Dua Lipa - Hallucinate"};
	static int [] songsNum = new int[PLENGTH];
	
	//add Tag, list Tag
	static final int TLENGTH = 100;
	static final int tagSize = 0;
	static int [] genreTag = new int[TLENGTH];
	static String [] feelingTag = new String[TLENGTH];
	static String [] moodTag = new String[TLENGTH];
	static String [] placeTag = new String[TLENGTH];
	static String [] timeTag = new String[TLENGTH];
	static String [] tempoTag = new String[TLENGTH];
	static String [] userGenre = new String[TLENGTH];
	
	


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
				System.out.printf("%d. %s\n",i+1,songs[i]);
			}
			while(true) {
                System.out.print("노래 번호 : ");
				songsNum[playlistSize] = Integer.parseInt(keyboardScanner.nextLine());
				System.out.printf("%d번 %s\n 노래가 추가 되었습니다.",songsNum[playlistSize],songs[songsNum[playlistSize]-1]);
				System.out.println("계속(y/N)");
				
				playlistSize++;
				
				String response2 = keyboardScanner.nextLine();
				if(response2.equalsIgnoreCase("n")) {
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
		  System.out.println(songs[i]);
			
		}
	}
	
	static void addTag() {
	  System.out.println("플레이리스트에 태그를 추가해 친구들과 공유하고");
	  System.out.println("당신에게 추천하는 플레이리스트를 만나보세요.");
	  System.out.println();
	  System.out.print("장르 태그 : ");
	  System.out.println("1.#발라드");
	  System.out.println("2.#POP");
	  System.out.println("3.#가요");
	  System.out.println("4.#EDM");
	  System.out.println("5.#힙합");
	  System.out.println("6.#트로트");
	  System.out.println("7.#JAZZ");
	  System.out.println("8.#CLASSIC");
	  System.out.println("9.#ROCK");
	  System.out.println("10.직접입력");
	  System.out.print(">");
	  
	  genreTag[tagSize] = Integer.valueOf(keyboardScanner.nextLine());
	  
	  if(genreTag[tagSize]==10) {
	    System.out.print("#");
	    userGenre[tagSize]=keyboardScanner.nextLine();
	  }
	  System.out.println("기분 태그 : ");
	  System.out.print("#");
	  feelingTag[tagSize] = keyboardScanner.nextLine();
	  
	  System.out.println("분위기 태그 : ");
	  System.out.print("#");
	  moodTag[tagSize] = keyboardScanner.nextLine();
	  
	  System.out.println("장소 태그 : ");
	  
	  
	  tagSize++;
	}
	
	static void listTag() {
	  
	}
	
	public static void main (String [] arg) {
		loop:
		      while (true) {
		        System.out.println("명령어 : "+" /Music/add "+" /Music/list "+" /Playlist/add "+" /Playlist/list ");
		        System.out.print("명령> ");
		        String command = keyboardScanner.nextLine();
		        System.out.println();

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
		          case "/Tag/add":
		            addTag();
		            break;
		          case "/Tag/list":
		            listTag();
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


