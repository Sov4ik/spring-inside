package com.envi.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    Logger logger = LoggerFactory.getLogger(CustomBeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        logger.info(String.valueOf(
                Arrays
                    .stream(configurableListableBeanFactory.getBeanDefinitionNames())
                    .filter(list -> list.contains("handlerAspect"))
                    .count()
                )
        );
    }
}
