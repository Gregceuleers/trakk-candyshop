package be.trakk.candyshop.init;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataBaseInit implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {

        log.info("CHARGEMENT DES UTILISATEURS");



    }
}
