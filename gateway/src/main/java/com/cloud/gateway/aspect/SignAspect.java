package com.cloud.gateway.aspect;

import com.cloud.gateway.annotation.Sign;
import com.cloud.gateway.utils.SignUtil;
import org.apache.commons.lang.ArrayUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
@Aspect
public class SignAspect {

    @Pointcut("@annotation(com.cloud.gateway.annotation.Sign)")
    public void signPointcut() {
    }

    @Before(value = "signPointcut() ")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        System.out.println("sign do before.....");
        String name = joinPoint.getSignature().getName();
        Object[] list = joinPoint.getArgs();

        String typeName = joinPoint.getSignature().getDeclaringTypeName();
        MethodSignature methodSignature = (MethodSignature) joinPoint.getStaticPart().getSignature();
        String[] params = methodSignature.getParameterNames();

        System.out.println("method name " + name);
        System.out.println("class  name " + typeName);

        System.out.println("param values " + Arrays.toString(list));
        System.out.println("param names " + Arrays.toString(params));

    }
 }
