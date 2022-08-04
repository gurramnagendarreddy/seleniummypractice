package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utility.LibraryFunctions;

public class filedownloadpage extends LibraryFunctions {
	public static By filedownload=By.xpath("//a[text()='Download' and @type='button']");
}
