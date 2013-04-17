/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yskts.multiconfig.sharedlib.config;

import java.util.List;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author niwong
 */
@Configuration
public class SharedLibConfig implements InitializingBean {
    @Autowired
    private List<SharedLibClientConfig> clientConfigs;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SCANNING CLIENT CONFIG");
        for(SharedLibClientConfig clientConfig : clientConfigs) {
            System.out.println("CLIENT CONFIG NAMESPACE> " + clientConfig.getNamespace());
        }
    }
}
