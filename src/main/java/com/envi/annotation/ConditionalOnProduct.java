package com.envi.annotation;

import com.envi.conditional.OnProductCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnProductCondition.class)
public @interface ConditionalOnProduct {
}
