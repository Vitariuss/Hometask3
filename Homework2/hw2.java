package Homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class hw2 {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        List<Map<String, Object>> studentsList = parseJson(json);

        StringBuilder sb = new StringBuilder();
        for (Map<String, Object> student : studentsList) {
            String lastName = (String) student.get("фамилия");
            String grade = (String) student.get("оценка");
            String subject = (String) student.get("предмет");
            sb.append("Студент ").append(lastName).append(" получил ").append(grade).append(" по предмету ").append(subject).append(".\n");
        }
        System.out.println(sb.toString());
    }

    private static List<Map<String, Object>> parseJson(String json) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        int start = 0;
        int end = 0;
        while (start < json.length()) {
            start = json.indexOf('{', start);
            if (start == -1) {
                break;
            }
            end = json.indexOf('}', start);
            if (end == -1) {
                break;
            }
            String studentJson = json.substring(start+1, end);
            Map<String, Object> student = new HashMap<String, Object>();
            String[] keyValuePairs = studentJson.split(",");
            for (String pair : keyValuePairs) {
                String[] keyValue = pair.split(":");
                String key = keyValue[0].replaceAll("\"", "").trim();
                String value = keyValue[1].replaceAll("\"", "").trim();
                student.put(key, value);
            }
            list.add(student);
            start = end + 1;
        }
        return list;
    }
}