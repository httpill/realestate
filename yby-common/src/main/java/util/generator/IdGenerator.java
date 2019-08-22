package util.generator;

import java.math.BigInteger;
import java.util.Random;

/**
 * Id生成器
 * @author guocy
 * */
public class IdGenerator {

    private static String genStr = "1234567890abcdefghijklmnopqrstuvwxyz";

    /**
     * 生成32位id
     * @return 格式为：时间戳-业务对象-随机值**********-**********-**********
     * */
    public static synchronized String create32BitUId() {

        StringBuilder uId = new StringBuilder();

        //第一部分
        //压缩长度约9位的32进制时间戳
        String timeMillis32Hex = new BigInteger(String.valueOf(System.currentTimeMillis()), 10).toString(32);
        if(timeMillis32Hex.length() <= 10){
            for(int i = 0; i < (10 - timeMillis32Hex.length()); i++){
                Random random = new Random();
                int position = random.nextInt(100) % 36;
                char align = genStr.toCharArray()[0];
                uId.append(align);
            }
            uId.append(timeMillis32Hex);
        }else{
            uId.append(timeMillis32Hex.substring(0, 10));
        }

        uId.append("-");

        //第二部分

        return uId.toString();
    }

}
