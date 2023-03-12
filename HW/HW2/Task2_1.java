// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package HW.HW2;

public class Task2_1 {
    public static void main(String[] args) {

        String json_data = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String sql_request = "select * from students where";
        String[] clear_data = json_data
                .replace("{", "")
                .replace("}", "")
                .replaceAll(" ", "")
                .split(",");

        String request_result = json_request(clear_data);
        System.out.println(sql_request + request_result);
    }
    private static String json_request(String[] json_str) {
        StringBuilder builder = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < json_str.length; i++) {
            String key = json_str[i].split(":")[0].replaceAll("\"", "");
            String value = json_str[i].split(":")[1].replaceAll("\"", "'");
            if (!value.equals("'null'") & counter == 0) {
                builder.append(String.join("", " " + key, " = " + value));
            } else {
                builder.append(String.join("", " AND " + key, " = " + value));
            }
            counter++;
        }
        return builder.toString();
    }
}
