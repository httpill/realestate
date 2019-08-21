package util.generator;

import java.math.BigInteger;

/**
 * Id生成器
 * @author guocy
 * */
public class IdGenerator {

    /**
     * 生成16位id
     * */
    public static String create16BitNumericId(){
        String timeMillis = String.valueOf(System.currentTimeMillis());

        String result = new BigInteger(timeMillis, 10).toString(32);

        return result;
    }

}
