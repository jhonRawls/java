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
		System.out.println("---------------");
		change();
		System.out.println("Hello World!");
	}

	public static void change() {
		Season season = Season.SUMMER;
		switch (season) {
		case SPRING:
			season = Season.SUMMER;
			break;
		case SUMMER:
			season = Season.AUTUMN;
			break;
		case AUTUMN:
			season = Season.WINTER;
			break;
		case WINTER:
			season = Season.SPRING;
			break;
		default:
			break;
		}
		System.out.println(season.ordinal()+season.name());
	}
}
