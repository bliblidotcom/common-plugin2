package com.blibli.oss.common2;

import com.blibli.oss.common2.servlet.CommonServletAutoConfigurer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author Eko Kurniawan Khannedy
 */
@SpringBootApplication
@Import(CommonServletAutoConfigurer.class)
public class TestApplication {
}
