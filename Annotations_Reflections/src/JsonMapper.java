import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonMapper {
    
    public static String toJson(Object obj) {
        try {
            Map<String, Object> jsonMap = new HashMap<>();
            Class<?> clazz = obj.getClass();
            
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                Object value = field.get(obj);
                
                JsonField jsonField = field.getAnnotation(JsonField.class);
                String key;
                
                if (jsonField != null && !jsonField.name().isEmpty()) {
                    key = jsonField.name();
                } else {
                    key = field.getName();
                }
                
                jsonMap.put(key, value);
            }
            
            return buildJsonString(jsonMap);
            
        } catch (Exception e) {
            return "{}";
        }
    }
    
    private static String buildJsonString(Map<String, Object> map) {
        StringBuilder json = new StringBuilder("{");
        boolean first = true;
        
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!first) {
                json.append(", ");
            }
            json.append("\"").append(entry.getKey()).append("\": ");
            
            Object value = entry.getValue();
            if (value instanceof String) {
                json.append("\"").append(value).append("\"");
            } else {
                json.append(value);
            }
            
            first = false;
        }
        
        json.append("}");
        return json.toString();
    }
}
