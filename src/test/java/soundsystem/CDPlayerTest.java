package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.demo.soundsystem.CompactDisc;
import spring.demo.soundsystem.MediaPlayer;
import spring.demo.soundsystem.config.CDPlayerConfig;

/**
 * Created by wuzhiyong on 2017/2/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc disc;

    @Test
    public void play(){
        player.play();
    }
}
