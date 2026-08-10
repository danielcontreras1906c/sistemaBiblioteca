/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Message;

/**
 *
 * @author Student
 */
public class Editorial {
    private String name;
    private String code;
    private String adress;
    private String books;

    public Editorial() {
    }

    protected Editorial(String name, String code, String adress, String books) {
        this.name = name;
        this.code = code;
        this.adress = adress;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getAdress() {
        return adress;
    }

    public String getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBooks(String books) {
        this.books = books;
    }
    
    
    
}
