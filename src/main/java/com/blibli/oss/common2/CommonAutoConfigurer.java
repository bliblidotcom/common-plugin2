package com.blibli.oss.common2;

import com.blibli.oss.common2.paging.PagingInterceptor;
import com.blibli.oss.common2.properties.PagingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Eko Kurniawan Khannedy
 */
@Configuration
@EnableConfigurationProperties({PagingProperties.class})
public class CommonAutoConfigurer extends WebMvcConfigurerAdapter {

  @Autowired
  private PagingProperties pagingProperties;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new PagingInterceptor(pagingProperties));
  }
}
