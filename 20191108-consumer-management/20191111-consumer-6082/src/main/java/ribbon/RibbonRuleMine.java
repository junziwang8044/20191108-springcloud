package ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @作者：王君君
 * @项目：20191108-springcloud
 * @包：ribbon
 * @日期：2019-11-11 18:25
 */
//@Configuration
public class RibbonRuleMine {

    /*//@Bean
    public IRule randomRule(){
        return new RandomRule();
    }*/

}
