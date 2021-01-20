package com.eomcs.lang;

public class App {

  public static void main (String [] arg) {
    loop:
      while (true) {
        GreetingService.Name();
        GreetingService.Hello();
        System.out.println("명령어 : "+" /Music/add "+" /Music/list "+" /Playlist/add "+" /Playlist/list "+"/Tag/add "+"/Tag/list ");
        String command = Prompt.inputString("명령> ");
        System.out.println();

        switch (command) {
          case "/Music/add":
            MusicService.addMusic();
            break;
          case "/Music/list":
            MusicService.listMusic();
            break;
          case "/Playlist/add":
            PlaylistService.addPlaylist();
            break;
          case "/Playlist/list":
            PlaylistService.listPlaylist();
            break;
          case "/Tag/add":
            TagService.addTag();
            break;
          case "/Tag/list":
            TagService.listTag();
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


