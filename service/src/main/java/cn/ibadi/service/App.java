package cn.ibadi.service;

import cn.ibadi.enmus.Season;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		for (Season season : Season.values()) {
			System.out.println(season.name());
		}
		
		System.out.println("Hello World!");
	}
}
