package controller;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by 曹 on 2017/5/2.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    //测试guava
    public static void main(String arg[]){
        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);

        Map<String, Integer>  right= ImmutableMap.of("a", 1, "b", 2, "c", 3);

        MapDifference<String, Integer> diff = Maps.difference(left, right);

        diff.entriesInCommon(); // {"b" => 2}
        diff.entriesInCommon(); // {"b" => 2}
        System.out.println(diff.entriesOnlyOnLeft());

        System.out.println( diff.entriesOnlyOnRight());
        System.out.println( diff.entriesOnlyOnRight());
    }
}

