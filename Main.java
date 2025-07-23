//672115037 Phutawan Mueangma


import java.util.*;
import java.io.*;

public class Main{
    static Vector<UniData> university = new Vector<>();

    public static void main(String[] args) throws FileNotFoundException{

        File f = new File("2024 QS World University Rankings 1.1 (For qs.com).csv");
        Scanner in = new Scanner(f);
        in.nextLine();
        in.nextLine();
        in.nextLine();
        in.nextLine();
        
        while (in.hasNextLine()) {
    String dataLine = in.nextLine();
    String[] fields = parseCSVLine(dataLine);

    Vector<String> temp = new Vector<>();

    for (int i = 0; i < 28; i++) {
        if (i < fields.length) {
            String token = fields[i].trim();
            if (token.isEmpty()) {
                temp.add("0");
            } else {
                temp.add(token);
            }
        } else {
            temp.add("0");
        }
    }

    university.addElement(new UniData(temp));
    System.out.println(dataLine);
}
        in.close();     
        Print("Chiang Mai University");

        Vector<UniData> universities = university;
        Collections.sort(universities);
        toLowerCase(universities);
        replace(universities);
        roundAllScores(universities);
        removeRange(universities);
         Collections.sort(universities);
        Print(universities);
    }
    public static String[] parseCSVLine(String line) {
    List<String> tokens = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    boolean inQuotes = false;

    for (int i = 0; i < line.length(); i++) {
        char ch = line.charAt(i);

        if (ch == '"') {
            inQuotes = !inQuotes; 
        } else if (ch == ',' && !inQuotes) {
            tokens.add(sb.toString());
            sb.setLength(0);
        } else {
            sb.append(ch);
        }
    }
    tokens.add(sb.toString());
    return tokens.toArray(new String[0]);
}


    public static void Print(String UniversityName) throws FileNotFoundException{
        java.io.File file = new java.io.File("QS_World University Ranking 2024.csv");
        boolean found = false;

        for(UniData u: university){
            if(u.getInstitutionName().equalsIgnoreCase(UniversityName)){
                java.io.PrintWriter output = new java.io.PrintWriter(file);
                output.print(u);
                found = true;
                output.close();
                break;
            }
        }
        if(found == false){
            System.out.println("University not found");
        }
    
        
    }
    public static void toLowerCase(Vector<UniData> UniName){
        String temp;
        for(UniData data:  UniName){
            temp = data.getInstitutionName().toLowerCase();
            data.setInstitutionName(temp);
        }
    }
    public static void replace(Vector<UniData> Data) {
    for (UniData data : Data) {
        if (isEmpty(data.getAcademicReputationScore())) {
            data.setAcademicReputationScore("0");
        }
        if (isEmpty(data.getEmployerReputationScore())) {
            data.setEmployerReputationScore("0");
        }
        if (isEmpty(data.getFacultyStudentScore())) {
            data.setFacultyStudentScore("0");
        }
        if (isEmpty(data.getCitationsPerFacultyScore())) {
            data.setCitationsPerFacultyScore("0");
        }
        if (isEmpty(data.getInternationalFacultyScore())) {
            data.setInternationalFacultyScore("0");
        }
        if (isEmpty(data.getInternationalStudentsScore())) {
            data.setInternationalStudentsScore("0");
        }
        if (isEmpty(data.getInternationalResearchNetworkScore())) {
            data.setInternationalResearchNetworkScore("0");
        }
        if (isEmpty(data.getEmploymentOutcomesScore())) {
            data.setEmploymentOutcomesScore("0");
        }
        if (isEmpty(data.getSustainabilityScore())) {
            data.setSustainabilityScore("0");
        }
        if (isEmpty(data.getOverallScore())) {
            data.setOverallScore("0");
        }
    }
}
        private static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
    public static void roundAllScores(Vector<UniData> uniData) {
    for (UniData data : uniData) {
        data.setAcademicReputationScore(round(data.getAcademicReputationScore()));
        data.setEmployerReputationScore(round(data.getEmployerReputationScore()));
        data.setFacultyStudentScore(round(data.getFacultyStudentScore()));
        data.setCitationsPerFacultyScore(round(data.getCitationsPerFacultyScore()));
        data.setInternationalFacultyScore(round(data.getInternationalFacultyScore()));
        data.setInternationalStudentsScore(round(data.getInternationalStudentsScore()));
        data.setInternationalResearchNetworkScore(round(data.getInternationalResearchNetworkScore()));
        data.setEmploymentOutcomesScore(round(data.getEmploymentOutcomesScore()));
        data.setSustainabilityScore(round(data.getSustainabilityScore()));
        data.setOverallScore(round(data.getOverallScore()));
    }
}

    private static String round(String score) {
        if (score == null || score.trim().isEmpty() || score.trim().equalsIgnoreCase("null")) {
            return "0";
        }
        try {
            double value = Double.parseDouble(score.trim());
            return String.valueOf(Math.round(value));
        } catch (NumberFormatException e) {
            return "0";
        }
    }


   
        public static void removeRange(Vector<UniData> uniData) {
        uniData.removeIf(data -> {
            String rank2023 = data.getRank2023();
            String rank2024 = data.getRank2024();
            return containsRangeSymbol(rank2023) || containsRangeSymbol(rank2024);
        });
    }

    private static boolean containsRangeSymbol(String rank) {
        return rank != null && (rank.contains("-") || rank.contains("=") || rank.contains("+"));
    }

    public static void Print(Vector<UniData> te) throws FileNotFoundException{
        java.io.File file = new java.io.File("QS-World-University-Rankings-2024_updated.csv");
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        for(UniData u: te){
                output.print(u);
            }
            output.close();
        }
}
