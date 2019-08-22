package com.yibayi.core.temp.shiro.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yibayi.core.temp.shiro.common.Order;
import com.yibayi.core.temp.shiro.filter.Filter;
import com.yibayi.core.temp.shiro.util.NumberUtil;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataTable分页工具类
 * 
 * @author lwx
 * @date 2018/05/08
 */
public class PageableUtil {
	
	public static final int pageSize = 10;
	public static final int pageNumber = 1;
	
	public static Map<String, Object> getResultMap(Page<?> page) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("iTotalRecords", Long.valueOf(page.getTotal()));
		resultMap.put("iTotalDisplayRecords", Long.valueOf(page.getTotal()));
		resultMap.put("sEcho", Integer.valueOf(page.getPageable().getOpsNo()));
		resultMap.put("aaData", page.getContent());
		return resultMap;
	}

	public static Pageable getPageableParam(HttpServletRequest request) {
		List<Filter> fList = new ArrayList<Filter>();
		List<Order> oList = new ArrayList<Order>();
		Pageable pageable = null;
		String aoData = request.getParameter("aoData");
		if (aoData == null || "".equals(aoData)) {
			return getPageable(pageable);
		}
		try {
			pageable = new Pageable();
			String sortedColIndex = "";
			String sorterDirection = "";
			Map<String, Object> columnNames = new HashMap<String, Object>();
			JSONArray jsonArray = (JSONArray) JSON.toJSON(aoData);
			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject obj = jsonArray.getJSONObject(i);
				String name = obj.getString("name");
				String value = obj.getString("value");
				if (name != null) {
					if ((name.trim().equals("sEcho")) && (NumberUtil.isNumber(value))) {
						pageable.setOpsNo(Integer.parseInt(value));
					}
					if ((name.trim().equals("iDisplayStart")) && (NumberUtil.isNumber(value))) {
						pageable.setPageNumber(Integer.parseInt(value));
					}
					if ((name.trim().equals("iDisplayLength")) && (NumberUtil.isNumber(value))) {
						pageable.setPageSize(Integer.parseInt(value));
					}
					if (name.trim().indexOf("mDataProp_") != -1) {
						String key = name.substring("mDataProp_".length());
						if (NumberUtil.isNumber(key)) {
							columnNames.put(key, value);
						}
					}
					if ((name.trim().indexOf("sSortDir_") != -1) && (value != null) && (!value.trim().equals(""))) {
						sorterDirection = value;
					}
					if ((name.trim().indexOf("iSortCol_") != -1) && (NumberUtil.isNumber(value))) {
						sortedColIndex = value;
					}
					if (name.trim().equals("extraParams")) {
						JSONArray extraParams = (JSONArray) JSON.toJSON(value);
						if (extraParams != null) {
							for (int j = 0; j < extraParams.size(); j++) {
								JSONObject paramObj = extraParams.getJSONObject(j);
								if (NumberUtil.isNumber(paramObj.getString("value"))) {
									fList.add(Filter.eq(paramObj.getString("name"), paramObj.getString("value")));
								} else {
									fList.add(Filter.like(paramObj.getString("name"), "%" + paramObj.getString("value") + "%"));
								}
							}
						}
					}
				}
			}
			if ((!columnNames.isEmpty()) && (columnNames.containsKey(sortedColIndex))) {
				if (sorterDirection.equals("desc")) {
					oList.add(Order.desc(columnNames.get(sortedColIndex).toString()));
				} else {
					oList.add(Order.asc(columnNames.get(sortedColIndex).toString()));
				}
			}
			pageable.setfList(fList);
			pageable.setoList(oList);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return getPageable(pageable);
	}

	private static Pageable getPageable(Pageable pageable) {
		if (pageable == null) {
			pageable = new Pageable();
			pageable.setPageNumber(pageNumber);
			pageable.setPageSize(pageSize);
		}
		int start = pageable.getPageNumber();
		if (start == 1) {
			start -= 1;
		}
		pageable.setStart(start);
		return pageable;
	}
}
