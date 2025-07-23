import java.util.*;

public class UniData implements Comparable<UniData>{
    private String rank2024;
    private String rank2023;
    private String institutionName;
    private String location;
    private String classificationLocation;
    private String classificationSize;
    private String classificationFocus;
    private String classificationResearch;
    private String classificationStatus;
    private String academicReputationScore;
    private String academicReputationRank;
    private String employerReputationScore;
    private String employerReputationRank;
    private String facultyStudentScore;
    private String facultyStudentRank;
    private String citationsPerFacultyScore;
    private String citationsPerFacultyRank;
    private String internationalFacultyScore;
    private String internationalFacultyRank;
    private String internationalStudentsScore;
    private String internationalStudentsRank;
    private String internationalResearchNetworkScore;
    private String internationalResearchNetworkRank;
    private String employmentOutcomesScore;
    private String employmentOutcomesRank;
    private String sustainabilityScore;
    private String sustainabilityRank;
    private String overallScore;

    public UniData(Vector<String> fields) {

        this.rank2024 = fields.get(0);
        this.rank2023 = fields.get(1);
        this.institutionName = fields.get(2);
        this.location = fields.get(3);
        this.classificationLocation = fields.get(4);
        this.classificationSize = fields.get(5);
        this.classificationFocus = fields.get(6);
        this.classificationResearch = fields.get(7);
        this.classificationStatus = fields.get(8);
        this.academicReputationScore = fields.get(9);
        this.academicReputationRank = fields.get(10);
        this.employerReputationScore = fields.get(11);
        this.employerReputationRank = fields.get(12);
        this.facultyStudentScore = fields.get(13);
        this.facultyStudentRank = fields.get(14);
        this.citationsPerFacultyScore = fields.get(15);
        this.citationsPerFacultyRank = fields.get(16);
        this.internationalFacultyScore = fields.get(17);
        this.internationalFacultyRank = fields.get(18);
        this.internationalStudentsScore = fields.get(19);
        this.internationalStudentsRank = fields.get(20);
        this.internationalResearchNetworkScore = fields.get(21);
        this.internationalResearchNetworkRank = fields.get(22);
        this.employmentOutcomesScore = fields.get(23);
        this.employmentOutcomesRank = fields.get(24);
        this.sustainabilityScore = fields.get(25);
        this.sustainabilityRank = fields.get(26);
        this.overallScore = fields.get(27);
    }


    public String getInstitutionName() {
        return institutionName;
    }
    

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }


    @Override
public String toString() {
    return escape(rank2024) + "," +
           escape(rank2023) + "," +
           escape(institutionName) + "," +
           escape(location) + "," +
           escape(classificationLocation) + "," +
           escape(classificationSize) + "," +
           escape(classificationFocus) + "," +
           escape(classificationResearch) + "," +
           escape(classificationStatus) + "," +
           escape(academicReputationScore) + "," +
           escape(academicReputationRank) + "," +
           escape(employerReputationScore) + "," +
           escape(employerReputationRank) + "," +
           escape(facultyStudentScore) + "," +
           escape(facultyStudentRank) + "," +
           escape(citationsPerFacultyScore) + "," +
           escape(citationsPerFacultyRank) + "," +
           escape(internationalFacultyScore) + "," +
           escape(internationalFacultyRank) + "," +
           escape(internationalStudentsScore) + "," +
           escape(internationalStudentsRank) + "," +
           escape(internationalResearchNetworkScore) + "," +
           escape(internationalResearchNetworkRank) + "," +
           escape(employmentOutcomesScore) + "," +
           escape(employmentOutcomesRank) + "," +
           escape(sustainabilityScore) + "," +
           escape(sustainabilityRank) + "," +
           escape(overallScore) + "\n";
}

    private String escape(String field) {
        if (field.contains(",")) {
            return "\"" + field + "\"";
        }
        return field;
    }
    @Override
    public int compareTo(UniData o) { 
    return this.institutionName.compareToIgnoreCase(o.institutionName);
    }
    public String getRank2024() {
        return rank2024;
    }


    public void setRank2024(String rank2024) {
        this.rank2024 = rank2024;
    }


    public String getRank2023() {
        return rank2023;
    }


    public void setRank2023(String rank2023) {
        this.rank2023 = rank2023;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getClassificationLocation() {
        return classificationLocation;
    }


    public void setClassificationLocation(String classificationLocation) {
        this.classificationLocation = classificationLocation;
    }


    public String getClassificationSize() {
        return classificationSize;
    }


    public void setClassificationSize(String classificationSize) {
        this.classificationSize = classificationSize;
    }


    public String getClassificationFocus() {
        return classificationFocus;
    }


    public void setClassificationFocus(String classificationFocus) {
        this.classificationFocus = classificationFocus;
    }


    public String getClassificationResearch() {
        return classificationResearch;
    }


    public void setClassificationResearch(String classificationResearch) {
        this.classificationResearch = classificationResearch;
    }


    public String getClassificationStatus() {
        return classificationStatus;
    }


    public void setClassificationStatus(String classificationStatus) {
        this.classificationStatus = classificationStatus;
    }


    public String getAcademicReputationScore() {
        return academicReputationScore;
    }


    public void setAcademicReputationScore(String academicReputationScore) {
        this.academicReputationScore = academicReputationScore;
    }


    public String getAcademicReputationRank() {
        return academicReputationRank;
    }


    public void setAcademicReputationRank(String academicReputationRank) {
        this.academicReputationRank = academicReputationRank;
    }


    public String getEmployerReputationScore() {
        return employerReputationScore;
    }


    public void setEmployerReputationScore(String employerReputationScore) {
        this.employerReputationScore = employerReputationScore;
    }


    public String getEmployerReputationRank() {
        return employerReputationRank;
    }


    public void setEmployerReputationRank(String employerReputationRank) {
        this.employerReputationRank = employerReputationRank;
    }


    public String getFacultyStudentScore() {
        return facultyStudentScore;
    }


    public void setFacultyStudentScore(String facultyStudentScore) {
        this.facultyStudentScore = facultyStudentScore;
    }


    public String getFacultyStudentRank() {
        return facultyStudentRank;
    }


    public void setFacultyStudentRank(String facultyStudentRank) {
        this.facultyStudentRank = facultyStudentRank;
    }


    public String getCitationsPerFacultyScore() {
        return citationsPerFacultyScore;
    }


    public void setCitationsPerFacultyScore(String citationsPerFacultyScore) {
        this.citationsPerFacultyScore = citationsPerFacultyScore;
    }


    public String getCitationsPerFacultyRank() {
        return citationsPerFacultyRank;
    }


    public void setCitationsPerFacultyRank(String citationsPerFacultyRank) {
        this.citationsPerFacultyRank = citationsPerFacultyRank;
    }


    public String getInternationalFacultyScore() {
        return internationalFacultyScore;
    }


    public void setInternationalFacultyScore(String internationalFacultyScore) {
        this.internationalFacultyScore = internationalFacultyScore;
    }


    public String getInternationalFacultyRank() {
        return internationalFacultyRank;
    }


    public void setInternationalFacultyRank(String internationalFacultyRank) {
        this.internationalFacultyRank = internationalFacultyRank;
    }


    public String getInternationalStudentsScore() {
        return internationalStudentsScore;
    }


    public void setInternationalStudentsScore(String internationalStudentsScore) {
        this.internationalStudentsScore = internationalStudentsScore;
    }


    public String getInternationalStudentsRank() {
        return internationalStudentsRank;
    }


    public void setInternationalStudentsRank(String internationalStudentsRank) {
        this.internationalStudentsRank = internationalStudentsRank;
    }


    public String getInternationalResearchNetworkScore() {
        return internationalResearchNetworkScore;
    }


    public void setInternationalResearchNetworkScore(String internationalResearchNetworkScore) {
        this.internationalResearchNetworkScore = internationalResearchNetworkScore;
    }


    public String getInternationalResearchNetworkRank() {
        return internationalResearchNetworkRank;
    }


    public void setInternationalResearchNetworkRank(String internationalResearchNetworkRank) {
        this.internationalResearchNetworkRank = internationalResearchNetworkRank;
    }


    public String getEmploymentOutcomesScore() {
        return employmentOutcomesScore;
    }


    public void setEmploymentOutcomesScore(String employmentOutcomesScore) {
        this.employmentOutcomesScore = employmentOutcomesScore;
    }


    public String getEmploymentOutcomesRank() {
        return employmentOutcomesRank;
    }


    public void setEmploymentOutcomesRank(String employmentOutcomesRank) {
        this.employmentOutcomesRank = employmentOutcomesRank;
    }


    public String getSustainabilityScore() {
        return sustainabilityScore;
    }


    public void setSustainabilityScore(String sustainabilityScore) {
        this.sustainabilityScore = sustainabilityScore;
    }


    public String getSustainabilityRank() {
        return sustainabilityRank;
    }


    public void setSustainabilityRank(String sustainabilityRank) {
        this.sustainabilityRank = sustainabilityRank;
    }


    public String getOverallScore() {
        return overallScore;
    }


    public void setOverallScore(String overallScore) {
        this.overallScore = overallScore;
    }
}