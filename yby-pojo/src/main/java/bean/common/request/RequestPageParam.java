package bean.common.request;

import bean.common.response.PaginationInfo;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 分页请求参数
 * @author guocy
 * 当请求预期结果为分页时应使用该对象作为请求参数接收对象，对应响应结果对象应使用PaginationInfo
 * @see PaginationInfo
 * */
@Data
@ToString
public class RequestPageParam<T> implements Serializable {

    private static final long serialVersionUID = -7572167750871694554L;

    /**
     * 请求业务参数
     * */
    private T param;

    /**
     * 请求分页页码
     * */
    private Long pageNo;

    /**
     * 请求起始行数
     * */
    private Long startLine;

    /**
     * 请求分页大小
     * */
    private Integer pageSize;
}
