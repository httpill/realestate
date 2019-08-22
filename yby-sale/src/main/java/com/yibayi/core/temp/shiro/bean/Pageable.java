package com.yibayi.core.temp.shiro.bean;


import com.yibayi.core.temp.shiro.common.Order;
import com.yibayi.core.temp.shiro.filter.Filter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页条件Pojo
 * 
 * @author lwx
 * @date 2018/05/08
 */
public class Pageable implements Serializable {
	private static final long serialVersionUID = -7231668970566283750L;
	// private static final int DEFAULT_PAGE_NUMBER = 1;
	// private static final int DEFAULT_PAGE_SIZE = 20;
	// private static final int MAX_PAGE_SIZE = 1000;
	private int pageNumber = 1;
	private int pageSize = 20;
	private int start = 0;
	private int opsNo;
	private List<Filter> fList = new ArrayList<Filter>();
	private List<Order> oList = new ArrayList<Order>();

	public Pageable() {
	}

	public Pageable(Integer pageNumber, Integer pageSize) {
		if ((pageNumber != null) && (pageNumber.intValue() >= 1)) {
			this.pageNumber = pageNumber.intValue();
		}
		if ((pageSize != null) && (pageSize.intValue() >= 1) && (pageSize.intValue() <= 1000)) {
			this.pageSize = pageSize.intValue();
		}
	}

	public int getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			pageNumber = 1;
		}
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		if ((pageSize < 1) || (pageSize > 1000)) {
			pageSize = 20;
		}
		this.pageSize = pageSize;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getOpsNo() {
		return this.opsNo;
	}

	public void setOpsNo(int opsNo) {
		this.opsNo = opsNo;
	}

	public List<Filter> getfList() {
		return this.fList;
	}

	public void setfList(List<Filter> fList) {
		this.fList = fList;
	}

	public List<Order> getoList() {
		return this.oList;
	}

	public void setoList(List<Order> oList) {
		this.oList = oList;
	}
}
