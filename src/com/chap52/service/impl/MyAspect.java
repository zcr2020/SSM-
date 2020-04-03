package com.chap52.service.impl;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * �����࣬ʵ���û�Ȩ�޼�����־��¼
 * @author Administrator
 *
 */
@Aspect
@Component
public class MyAspect {
	@Pointcut("execution(* com.chap52.service.impl.*.*(..))")
	private void myPointCut(){}
	/**
	 * �û�Ȩ�޼��
	 */
	@Before("myPointCut()")
	public void checkPermission(){
		System.out.println("ģ���û�Ȩ�޼��");
	}
	/**
	 * ģ����־��¼
	 */
	@AfterReturning("myPointCut()")
	public void log(){
		System.out.println("ģ����־��¼");
	}

}
