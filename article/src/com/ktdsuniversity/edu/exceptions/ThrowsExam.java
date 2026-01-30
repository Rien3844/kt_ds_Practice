package com.ktdsuniversity.edu.exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ThrowsExam {
	/**
	 * createNewInstance("com.ktdsuniversity.edu.restuarant.Customer") ==> Customer의
	 * 인스턴스가 반환
	 * 
	 * @param classPath
	 * @return
	 */
	public static Object createNewInstance(String classPath) {

		Class clazz = null;

		try {
			clazz = Class.forName(classPath);
		} catch (ClassNotFoundException cnfe) {
			System.out.println(classPath + "존재하지 않는 클래스입니다.");
		}

		if (clazz != null) {// 예외가 발생하지 않았다면
			Constructor constructor = null;
			try {
				constructor = clazz.getConstructor(String.class, int.class);
			} catch (NoSuchMethodException nsme) {
				System.out.println("생성자를 찾을 수 없습니다.");
			}

			if (constructor != null) {// 생성자를 올바르게 찾아왔다면
				try {
					Object instance = constructor.newInstance("리플랙션", 100);
					return instance;
				} catch (InstantiationException e) {
					System.out.println("인스턴스 생성을 실패했습니다.");
				} catch (IllegalAccessException e) {
					System.out.println("접근 권한이 없습니다.");
				} catch (IllegalArgumentException e) {
					System.out.println("생성 파라미터가 잘못되었습니다.");
				} catch (InvocationTargetException e) {
					System.out.println("생성자를 실행할 때 에러가 발생했습니다.");
				}
			}
		}

		return null;
	}
	// ==> 리플랙션을 이용한 instance 생성 방법

	public static void main(String[] args) {
		Customer cust = (Customer) createNewInstance("com.ktdsuniversity.edu.restaurment.Customer");
		System.out.println(cust.getName());
	}

//	public static Object createNewInstance2(String classPath) 
//			throws ClassNotFoundException, NoSuchMethodException, 
//			InstantiationException, IllegalAccessException, 
//			IllegalArgumentException, InvocationTargetException{
//
//		Class clazz = null;
//
//		clazz = Class.forName(classPath);
//
//		if (clazz != null) {// 예외가 발생하지 않았다면
//			Constructor constructor = null;
//			constructor = clazz.getConstructor(String.class, int.class);
//
//			if (constructor != null) {// 생성자를 올바르게 찾아왔다면
//				Object instance = constructor.newInstance("리플랙션", 100);
//				return instance;
//			}
//
//			return null;
//		}
//	}
	//모든 try - catch를 throw로 넘김. ==> 다른 곳에서 해당 코드를 사용할 때 사용할 때 마다 try - catch를 해줘야함.
	//절대절대절대 예외를 위임하지마 절대.
}