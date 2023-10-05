package desafioIphoneJava;

import desafioIphoneJava.internet.InternetBrowser;
import desafioIphoneJava.music.MusicPlayer;
import desafioIphoneJava.phone.Telephone;

public class Iphone {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Telephone telephone = new Telephone();
        InternetBrowser internetBrowser = new InternetBrowser();

        musicPlayer.selectMusic();
        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        System.out.println(" ========================================");
        telephone.turnOn();
        telephone.answerCall();
        telephone.startVoiceMail();
        telephone.turnOff();
        System.out.println("=============================================");
        internetBrowser.displayPage();
        internetBrowser.addNewTab();
        internetBrowser.reloadPage();
    }
}
