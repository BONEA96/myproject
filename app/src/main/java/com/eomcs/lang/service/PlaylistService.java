package com.eomcs.lang.service;
import com.eomcs.util.Prompt;
import com.eomcs.lang.domain.Playlist;
 
public class PlaylistService {
  static int size = 0;
  static final int LENGTH = 100;
  static Playlist [] playlist = new Playlist [LENGTH];
  
  static String [] songs = {
	      "Future - Life is Good(Feat. Dreak)" ,"Roddy Ricch - The Box","AJR - BANG!","Samm Henshaw - All Good","So!YoON! X Phum Viphurit - Wings",
	      "Yerin Beak - Hate you", "Lil Nas X - Old Town Road(Feat. Billy Ray Cyrus)", "24kGoldn - Mood(Feat.Iann dior)", "Dua Lipa - Hallucinate"};
  static String[] sumPlaylist = new String [LENGTH];


  
  public void add() {
	Playlist p = new Playlist();
    System.out.println("나만의 취향이 들어간 플레이리스트를 만들어 볼까요?");
    String response = Prompt.inputString("내 보관함 바로가기(Y/n)");
    if(response.equalsIgnoreCase("y")) {
      for(int i=0; i<songs.length; i++) {
        System.out.printf("%d. %s\n",i+1, songs[i]);
      }
      while(true) {
        p.songsNum = Prompt.inputInt("노래 번호 : ");
        System.out.printf("%d번 %s\n 노래가 추가 되었습니다.", p.songsNum, songs[p.songsNum-1]);
        String response2 = Prompt.inputString("계속(y/N)");
        this.playlist[this.size++] = p;

        if(response2.equalsIgnoreCase("n")) {
          break;
        }
      }
    }
    System.out.println("종료");
    System.out.println();
  }

  public void list() {
    System.out.println("플레이리스트 목록 : ");
    for(int i =0; i<this.size; i++) {
    	//Playlist p = playlist[i];
      System.out.println(songs[i]);

    }
  }


}
