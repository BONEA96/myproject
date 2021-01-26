package com.eomcs.lang;

import com.eomcs.lang.service.MusicService;
import com.eomcs.lang.service.PlaylistService;
import com.eomcs.lang.service.TagService;
import com.eomcs.util.Prompt;

public class App {

  public static void main (String [] arg) {
	  
	  
	PlaylistService playList1 = new PlaylistService();
	PlaylistService playList2 = new PlaylistService();
	PlaylistService playList3 = new PlaylistService();
	PlaylistService playList4 = new PlaylistService();
	
	MusicService MusicList1 = new MusicService();
	MusicService MusicList2 = new MusicService();
	MusicService MusicList3 = new MusicService();
	
	MusicService musicList = new MusicService();
	PlaylistService PlaylistUp = new PlaylistService();
	
	PlaylistService.musicList = musicList;
	
	  
	  
	  
	  
    loop:
      while (true) {
        //GreetingService.Name();
        //GreetingService.Hello();
        System.out.println("명령어 : "+" /Music/search "+" /Music/list "+" /Playlist/add "+" /Playlist/list "+"/Tag/add "+"/Tag/list ");
        String command = Prompt.inputString("명령> ");
        System.out.println();

        switch (command) {
          case "/Music/search":
        	  MusicList1.search();
            break;
          case "/Music/list":
        	  MusicList1.list();
            break;
          case "/Music2/search":
        	  MusicList2.search();
              break;
            case "/Music2/list":
            	MusicList2.list();
              break;
            case "/Music3/search":
            	MusicList3.search();
                break;
              case "/Music3/list":
            	  MusicList3.list();
                break;
          case "/Playlist/add":
        	  playList1.add();
            break;
          case "/Playlist/list":
        	  playList1.list();
            break;
          case "/Playlist2/add":
        	  playList2.add();
            break;
          case "/Playlist2/list":
        	  playList2.list();
            break;
          case "/Playlist3/add":
        	  playList3.add();
            break;
          case "/Playlist3/list":
        	  playList3.list();
            break;
          case "/Playlist4/add":
        	  playList4.add();
            break;
          case "/Playlist4/list":
        	  playList4.list();
            break;
          case "/Tag/add":
            TagService.add();
            break;
          case "/Tag/list":
            TagService.list();
            break;
          case "quit":
          case "exit":
            System.out.println("서비스를 종료합니다.");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");

        }
      }

    Prompt.close();
  }


}


