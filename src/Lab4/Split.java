package Lab4;

import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Split {
    public static void main(String[] args) throws Exception {
        String tekst = "Ala ma kota";
        int długość = 4;
        List<String> split1 = new ArrayList<>();
        List<String> split2 = new ArrayList<>();
        split1 = split(tekst, długość);
        split2 = whenSplitStringOnSpecificLength_thenSplit(tekst, długość);
        Assert.assertEquals(split1, split2);

    }

    static List<String> split(String s, int lengt) {
        String message = s;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < message.length(); i += lengt) {
            result.add(message.substring(i, Math.min(i + lengt, message.length())));
        }
        System.out.println(result);
        return result;
    }

    static public List<String> whenSplitStringOnSpecificLength_thenSplit(String s, int lengt) {
        String input = s;
        List<String> result = Splitter.fixedLength(lengt).splitToList(input);
        System.out.println(result);
        return result;
    }
}
