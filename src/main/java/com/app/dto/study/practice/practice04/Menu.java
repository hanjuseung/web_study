package com.app.dto.study.practice.practice04;

public class Menu {
	String category;
	String menu;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	@Override
	public String toString() {
		return "Menu [category=" + category + ", menu=" + menu + "]";
	}
	
	
}
