package bean.common.response;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 响应分页实体类
 * @author guocy
 * @deprecated
 * @see ResponseBean
 * */
@Data
@ToString
public class ResponsePage<T> implements Serializable {

    private static final long serialVersionUID = -1419901409380285620L;

    /**
     * 响应状态码
     * */
    private Short status;

    /**
     * 响应分页信息
     * */
    private PaginationInfo paginationInfo;

    /**
     * 响应分页列表
     * */
    private List<T> obj;

    /**
     * 响应信息
     * */
    private String msg;

    /**
     * 响应实体构建
     * */
    public static<T> ResponsePage response(ResponseStatusEnum status, List<T> obj, String msg){
        ResponsePage responsePage = new ResponsePage();
        responsePage.setStatus(status.getCode());
        responsePage.setObj(obj == null ? new ArrayList<T>() : obj);
        responsePage.setMsg(msg == null ? status.getPhraseCN() : msg);
        return responsePage;
    }

    /**
     * 请求成功
     * */
    public static ResponsePage success(){
        return response(ResponseStatusEnum.SUCCESS, null, ResponseStatusEnum.SUCCESS.getPhraseCN());
    }
    public static<T> ResponsePage success(List<T> obj){
        return response(ResponseStatusEnum.SUCCESS, obj, ResponseStatusEnum.SUCCESS.getPhraseCN());
    }
    public static<T> ResponsePage success(List<T> obj, String msg){
        return response(ResponseStatusEnum.SUCCESS, obj, msg);
    }

    /**
     * 请求失败
     * */
    public static ResponsePage failed(){
        return response(ResponseStatusEnum.FAILED, null, ResponseStatusEnum.FAILED.getPhraseCN());
    }
    public static<T> ResponsePage failed(List<T> obj){
        return response(ResponseStatusEnum.FAILED, obj, ResponseStatusEnum.FAILED.getPhraseCN());
    }
    public static<T> ResponsePage failed(List<T> obj, String msg){
        return response(ResponseStatusEnum.FAILED, obj, msg);
    }
}
