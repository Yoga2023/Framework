package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Add_To_Cart_page;
import com.pom.Address_Page;
import com.pom.Blouse;
import com.pom.Cart_page;
import com.pom.Home_page;
import com.pom.Login_page;
import com.pom.Payment_page;
import com.pom.Proceed_Page;
import com.pom.Quality_Increase_;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;
import com.pom.Women_Page;

public class Page_Object_Manager {
	public static WebDriver driver;
	private  Home_page hp;
	private Login_page lp;
	private Women_Page w;
	private Cart_page adp;
	private Blouse b;
	private Quality_Increase_ qc;
	private Add_To_Cart_page atcp ;
	private Proceed_Page pp;
	private Summary_Page sp;
	private Address_Page ap;
	private Shipping_Page spp;
	private Payment_page ppp;
	
	
	
	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
	}
	public Home_page getHp() {
		 hp=new Home_page(driver);
		return hp;
	}
	public Login_page getLp() {
		lp =new Login_page(driver);
		return lp;
	}
	public  Women_Page getW() {
		w=new Women_Page(driver);
		return w;
	}
	public  Cart_page getAdp() {
		adp = new Cart_page(driver);
		return adp;
	}
	public Blouse getb() {
		b=new Blouse(driver);
		return b;
	}
	
	public  Quality_Increase_ getQc() {
		qc=new Quality_Increase_(driver);
		return qc;
	}
	public  Add_To_Cart_page getAtcp() {
		atcp=new Add_To_Cart_page(driver);
		return atcp;
	}
	public  Proceed_Page getPp() {
		pp =new Proceed_Page(driver);
		return pp;
	}
	public  Summary_Page getSp() {
		sp=new Summary_Page(driver);
		return sp;
	}
	public  Address_Page getAp() {
		ap=new Address_Page(driver);
		return ap;
	}
	public  Shipping_Page getSpp() {
		spp=new  Shipping_Page(driver);
		return spp;
	}
	public  Payment_page getPpp() {
		ppp=new Payment_page(driver);
		return ppp;
	}
}
