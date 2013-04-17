/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yskts.multiconfig.web.config;

import com.yskts.multiconfig.alpha.config.AlphaModuleSharedLibConfig;
import com.yskts.multiconfig.sharedlib.config.SharedLibConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author niwong
 */
@Configuration
@Import({AlphaModuleSharedLibConfig.class,
         SharedLibConfig.class})
public class WebConfig {
    
}
