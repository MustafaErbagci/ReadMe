package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage extends BasePage {

    @FindBy(xpath = "//thead/tr[1]/th")
    public List<WebElement> tableTitles;

    @FindBy(xpath = "//a [@href='#dashboard']/span")
    public WebElement dashboardModule;

    @FindBy(xpath = "//a [@href='#users']/span")
    public WebElement usersModule;

    @FindBy(xpath = "//a [@href='#books']/span")
    public WebElement booksModule;


    @FindBy(partialLinkText = "Add Bo")
    public WebElement AddBook;

    @FindBy(css = "#book_categories")
    public WebElement BookCategories;

    @FindBy(css = "#book_categories>option")
    public  List<WebElement> bookCategoriesList;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBook;

@FindBy(xpath = "//table[@id='tbl_books']")
    public WebElement Table;

@FindBy(xpath = "//*[contains(@class, 'btn btn-primary btn-sm')]")
    public WebElement EditBook;

@FindBy(xpath = "//button[contains(text(),'Save changes')]")
    public WebElement SaveChanges;

@FindBy(xpath = "//button[contains(text(),'Close')]")
    public WebElement Close;


    @FindBy(xpath = "//table[@id='tbl_books']/tbody/tr[1]/td[3]")
    public WebElement bookNameBox;

    @FindBy(xpath = "//table[@id='tbl_books']/tbody/tr[1]/td[4]")
    public WebElement authorNAmeBox;

}
