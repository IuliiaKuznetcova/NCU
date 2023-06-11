package E2E.pages.helpers;

import E2E.tests.BaseTest;
import io.qameta.allure.Step;

public class CourseHelper extends BaseTest {

    @Step("Search course with check Поиск курса с проверкой")
    public void searchCourseWithCheck(String courseName) throws InterruptedException {
        studentCourseList.fillFieldSearch(courseName);
        studentCourseList.searchResultDisplayExactData(courseName);
        studentCourseList.goToCourseFromSearchResult(courseName);
        studentGrowthMarketingCourseDetails.displayTitleCourse(courseName);
    }

    @Step("Search course Поиск курса")
    public void searchCourse(String courseName) {
        studentCourseList.fillFieldSearch(courseName);
        studentCourseList.searchResultDisplayExactData(courseName);
        scrollPageToElement2023NoCode();
    }

    @Step("Search Student with check Поиск студента с проверкой")
    public void searchStudentWithCheck(String searchedStudentName) {
        studentDirectoryPage.fillFieldSearchOnStudentDirectory(searchedStudentName);
        studentDirectoryPage.searchResultStudentDisplayExactData(searchedStudentName);
        studentDirectoryPage.viewProfileButton();
        studentDetailsPage.displayStudenFullNameExactData(searchedStudentName);
    }

    @Step("Search Student Поиск студента")
    public void searchStudent(String searchedStudentName) {
        studentDirectoryPage.fillFieldSearchOnStudentDirectory(searchedStudentName);
        studentDirectoryPage.searchResultStudentDisplayExactData(searchedStudentName);
    }

    @Step("Search Student with check Поиск профессора с проверкой")
    public void searchProfessorWithCheck(String searchedProfessorName) throws InterruptedException {
        studentDirectoryPage.fillFieldSearchOnProfessorDirectory(searchedProfessorName);
        studentDirectoryPage.searchResultProfessorDisplayExactData(searchedProfessorName);
        studentDirectoryPage.viewProfileButton();
        studentDetailsPage.displayProfessorFullNameExactData(searchedProfessorName);
    }

}
