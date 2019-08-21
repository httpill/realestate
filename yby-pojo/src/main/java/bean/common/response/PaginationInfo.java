package bean.common.response;

import bean.common.request.RequestPageParam;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页响应结果
 *@author guocy
 * 当响应结果应是分页时使用该对象，并赋值到ResponseBean的obj属性。对应接收分页请求参数对象应使用RequestPageParam
 * @see ResponseBean
 * @see RequestPageParam
 * */
@Data
@ToString
public class PaginationInfo<T> implements Serializable {

    private static final long serialVersionUID = -7469270796664381938L;

    /**
     * 页数据
     * */
    private List<T> data;

    /**
     * 页码
     * */
    private Long pageNo;

    /**
     * 分页大小
     * */
    private Integer pageSize;

    /**
     * 起始行
     * */
    private Long startLine;

    /**
     * 总行数
     * */
    private Long totalLines;

    /**
     * 总页数
     * */
    private Long totalPages;

    /**
     * 禁止访问无参构造函数
     * */
    private PaginationInfo(){

    }

    /**
     * 实例化分页信息对象构造函数
     * @param data 页数据 - 当页信息
     * @param totalLines 总行数 - 总数据量
     * @param requestPageParam 请求分页信息 -请求当页数据分页信息
     * */
    public PaginationInfo(List<T> data, Long totalLines, RequestPageParam requestPageParam) {
        if(data == null){
            data = new ArrayList<T>();
        }
        this.data = data;
        this.pageNo = requestPageParam.getPageNo() == null ? 1 : requestPageParam.getPageNo();
        this.pageSize = requestPageParam.getPageSize() == null ? 0 : requestPageParam.getPageSize();
        this.startLine = requestPageParam.getStartLine() == null ? 1 : requestPageParam.getStartLine();
        this.totalLines = totalLines == null ? 0 : totalLines;
        if(this.totalLines % this.pageSize == 0){
            this.totalPages = this.totalLines / this.pageSize;
        }else{
            this.totalPages = this.totalLines / this.pageSize + 1;
        }
    }
}
