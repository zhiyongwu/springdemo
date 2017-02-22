package spring.demo.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by wuzhiyong on 2017/2/22.
 */

@Component
public class SgtPeppers implements CompactDisc{
    private String title ;
    private String artist ;

    public SgtPeppers(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
