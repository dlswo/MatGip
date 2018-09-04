package org.alyab;

public class MatGipVO {

    private String area;
    private String name;
    private String menu;

    public MatGipVO(String area, String name, String menu) {
        this.area = area;
        this.name = name;
        this.menu = menu;
    }

    public boolean checkArea(String area){
        return this.area.contains(area);
    }

    public boolean checkMenu(String menu){
        return this.menu.contains(menu);
    }

    public boolean checkName(String name){
        return this.menu.contains(name);
    }

    @Override
    public String toString() {
        return "MatGipVO{" +
                "area='" + area + '\'' +
                ", name='" + name + '\'' +
                ", menu='" + menu + '\'' +
                '}';
    }
}