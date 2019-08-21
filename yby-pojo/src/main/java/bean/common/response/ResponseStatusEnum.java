package bean.common.response;

/**
 * 相应状态
 * @author guocy
 * */
public enum ResponseStatusEnum {

    SUCCESS((short) 200, "OK", "请求成功"),
    FAILED((short) 400, "Bad Request", "请求失败");

    private final Short code;

    private final String phraseEN;

    private final String phraseCN;


    ResponseStatusEnum(Short code, String phraseEN, String phraseCN) {
        this.code = code;
        this.phraseEN = phraseEN;
        this.phraseCN = phraseCN;
    }

    public Short getCode() {
        return code;
    }

    public String getPhraseEN() {
        return phraseEN;
    }

    public String getPhraseCN() {
        return phraseCN;
    }
}
