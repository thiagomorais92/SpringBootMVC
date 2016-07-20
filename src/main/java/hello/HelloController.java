package hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
    @RequestMapping("/jsontest")
    public @ResponseBody Map<String,Object> callSomething(){
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> map2 = new HashMap<String,Object>();
        
        map2.put("id", "2");
        map2.put("idade", "22");
        
        map.put("Nome", "Thiago");
        map.put("obj",map2);
        return map;
    }

}