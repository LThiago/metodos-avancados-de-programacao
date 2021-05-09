package Prototype;

import Prototype.Model.Course;

public class App {
    public static void main(String[] args) throws Exception {
        Course gameDesign = new Course("Game Design", "Programming Logic", "Structured Programming",
                "Object Oriented Programming", "Game Engines", 400);

        Course webDesign = gameDesign.clone();
        webDesign.setCourseName("Web Design");
        webDesign.setSpecificDiscipline("Web Development");

        Course mobileApplicationDesign = webDesign.clone();
        mobileApplicationDesign.setCourseName("Mobile Application Design");
        mobileApplicationDesign.setSpecificDiscipline("Mobile Development");

        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println(gameDesign);
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println(webDesign);
        System.out
                .println("------------------------------------------------------------------------------------------");
        System.out.println(mobileApplicationDesign);
        System.out
                .println("------------------------------------------------------------------------------------------");
    }
}
