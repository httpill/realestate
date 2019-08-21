package bean.common.response;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import java.io.Serializable;

/**
 * 响应实体类
 * @author guocy
 * */
@Data
@ToString
public final class ResponseBean<T> implements Serializable {

    private static final long serialVersionUID = 2578404513884660164L;

    /**
     * 响应状态码
     * */
    private Short status;

    /**
     * 响应对象
     * */
    private T obj;

    /**
     * 响应信息
     * */
    private String msg;

    /**
     * 响应实体构造函数 - 无参构造函数默认为请求失败
     * */
    public ResponseBean(){
        this.status = ResponseStatusEnum.FAILED.getCode();
        this.obj = null;
        this.msg = ResponseStatusEnum.FAILED.getPhraseCN();
    }

    /**
     * 响应实体构造函数 - 响应状态以传入响应状态枚举值为准
     * */
    public ResponseBean(ResponseStatusEnum status){
        this.status = status.getCode();
        this.obj = null;
        this.msg = status.getPhraseCN();
    }

    /**
     * 响应实体构造函数 - 传入响应对象及响应信息预定为成功
     * */
    public ResponseBean(T obj, String msg){
        this.status = ResponseStatusEnum.SUCCESS.getCode();
        this.obj = obj == null ? null : (T) obj;
        this.msg = msg == null ? ResponseStatusEnum.SUCCESS.getPhraseCN() : msg;
    }

    /**
     * 响应实体构造函数 - 全参数构造函数以传入响应状态枚举为准
     * */
    public ResponseBean(ResponseStatusEnum status, T obj, String msg){
        this.status = status.getCode();
        this.obj = obj;
        this.msg = msg == null ? status.getPhraseCN() : msg;
    }

    /**
     * 更新响应状态为请求成功
     * */
    public ResponseBean success(){
        this.status = ResponseStatusEnum.SUCCESS.getCode();
        return this;
    }

    /**
     * 更新响应状态为请求失败
     * */
    public ResponseBean failed(){
        this.status = ResponseStatusEnum.FAILED.getCode();
        return this;
    }
}
