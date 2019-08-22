package com.yibayi.core.temp.shiro.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 分页Pojo
 * 
 * @author lwx
 * @date 2018/05/08
 */
public class Page<T> implements Serializable {
	private static final long serialVersionUID = 6830156882680912677L;
	private final List<T> content = new ArrayList<T>();
	private final Long total;
	private final Pageable pageable;

	public Page() {
		this.total = Long.valueOf(0L);
		this.pageable = new Pageable();
	}

	/**
	 * 分页初始化
	 * @param content 泛型列表
	 * @param total	总数
	 * @param pageable 分页搜索
	 */
	public Page(List<T> content, Long total, Pageable pageable) {
		this.content.addAll(content);
		this.total = total;
		this.pageable = pageable;
	}

	public int getPageNumber() {
		return this.pageable.getPageNumber();
	}

	public int getPageSize() {
		return this.pageable.getPageSize();
	}

	public List<T> getContent() {
		return this.content;
	}

	public long getTotal() {
		return this.total.longValue();
	}

	public Pageable getPageable() {
		return this.pageable;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static final <T> Page<T> emptyPage(Pageable pageable) {
		return new Page(Collections.emptyList(), Long.valueOf(0L), pageable);
	}
}
