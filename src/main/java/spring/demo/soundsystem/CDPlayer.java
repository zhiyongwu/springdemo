package spring.demo.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by wuzhiyong on 2017/2/22.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc disc;

    public CDPlayer(CompactDisc disc) {
        this.disc = disc;
    }

    @Override
    public void play() {
        disc.play();
    }
}
