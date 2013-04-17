/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yskts.multiconfig.alpha.config;

import com.yskts.multiconfig.sharedlib.config.SharedLibBuilder;
import com.yskts.multiconfig.sharedlib.config.SharedLibClientConfig;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author niwong
 */
@Configuration
public class AlphaModuleSharedLibConfig implements SharedLibClientConfig {

    @Override
    public String getNamespace() {
        return "com.yskts.multiconfig.alpha";
    }

    @Override
    public SharedLibBuilder getBuilder() {
        return null;
    }
    
}
