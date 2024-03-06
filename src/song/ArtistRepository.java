package song;

import util.Utility;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static util.Utility.FILE_PATH;

public class ArtistRepository {

    // key: 가수이름, value: Artist 객체
    private static Map<String, Artist> artistList;

    static {
        artistList = new HashMap<>();
    }

    // 가수명을 전달 받아 이미 있는 가수인지 여부를 반환하는 기능
    public boolean isRegistered(String artistName) {
        return artistList.containsKey(artistName);
    }

    // 새 객체 생성
    public void addNewArtist(String artistName, String songName) {
        // 1. 신규 가수 정보 생성 -> Set 객체 전달
        Artist artist = new Artist(artistName, new HashSet<>());
        // 2. 생성된 노래
        artist.getSongList().add(songName);

        artistList.put(artistName, artist);
    }

    /**
     * 기존 가수 정보에 노래만 추가하는 기능
     *
     * @param artistName - 사용자의 입력 가수 이름
     * @param songName   - 사용자의 입력 노래 제목
     * @return - 곡명이 중복이면 false,
     * 곡이 정상 추가되면 true
     */
    public boolean addNewSong(String artistName, String songName) {
        //Map에서 기존 가수 객체부터 찾자.
        Artist artist = artistList.get(artistName);
        //set의 add는 add의 실행 결과를 boolean으로 리턴
        // add 성공 -> true, add 실패 -> false
        boolean flag = artist.getSongList().add(songName);
        return flag;
    }

    public static Map<String, Artist> getArtistList() {
        return artistList;
    }

    public void showSongList(String artistName) {
        Artist artist = artistList.get(artistName);

        for (String song : artist.getSongList()) {
            System.out.println(song);
        }
    }

    // 세이브 기능
    public void saveData() {
        // 폴더 경로는 Utility 클래스에 상수로 선언되어 있음.
        // 폴더가 실존하지 않는 경우 생성을 하고 세이브 파일을 생성해야 합니다.
        // 파일명은 song.sav로 진행합니다.

        File file = new File(FILE_PATH);
        if (!file.exists()) file.mkdirs();

        try (FileOutputStream fos = new FileOutputStream(FILE_PATH + "/song.sav")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistList);
            System.out.println("파일 저장 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 로드 기능
    public void loadData() {
        // 세이브 파일이 존재하는지부터 체크합니다.
        // 존재한다면 로드를 진행해서 artistList에 할당(대입)합니다.
        File file = new File(FILE_PATH + "/song.sav");
        if (file.exists()) {
            try (FileInputStream fis = new FileInputStream(FILE_PATH + "/song.sav")){
                ObjectInputStream ois = new ObjectInputStream(fis);

                artistList = (Map<String, Artist>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("기존에 저장된 파일이 없네요. 새로 만들어 봐요!");
        }
    }
}