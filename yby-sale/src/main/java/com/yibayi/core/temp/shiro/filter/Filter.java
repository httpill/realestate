package com.yibayi.core.temp.shiro.filter;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * Filter
 * 
 * @author lwx
 * @date 2018/05/08
 */
public class Filter implements Serializable {
	private static final long serialVersionUID = 3999276548299565609L;
	// private static final boolean DEFAULT_IGNORE_CASE = false;
	private String property;
	private Operator operator;
	private Object value;

	public Filter() {
	}

	public static enum Operator {
		eq, ne, gt, lt, ge, le, like, in, isNull, isNotNull, or;
	}

	private Boolean ignoreCase = Boolean.valueOf(false);

	public Filter(String property, Operator operator, Object value) {
		this.property = property;
		this.operator = operator;
		this.value = value;
	}

	public Filter(String property, Operator operator, Object value, boolean ignoreCase) {
		this.property = property;
		this.operator = operator;
		this.value = value;
		this.ignoreCase = Boolean.valueOf(ignoreCase);
	}

	public static Filter eq(String property, Object value) {
		return new Filter(property, Operator.eq, value);
	}

	public static Filter eq(String property, Object value, boolean ignoreCase) {
		return new Filter(property, Operator.eq, value, ignoreCase);
	}

	public static Filter ne(String property, Object value) {
		return new Filter(property, Operator.ne, value);
	}

	public static Filter ne(String property, Object value, boolean ignoreCase) {
		return new Filter(property, Operator.ne, value, ignoreCase);
	}

	public static Filter gt(String property, Object value) {
		return new Filter(property, Operator.gt, value);
	}

	public static Filter lt(String property, Object value) {
		return new Filter(property, Operator.lt, value);
	}

	public static Filter ge(String property, Object value) {
		return new Filter(property, Operator.ge, value);
	}

	public static Filter le(String property, Object value) {
		return new Filter(property, Operator.le, value);
	}

	public static Filter like(String property, Object value) {
		return new Filter(property, Operator.like, value);
	}

	public static Filter in(String property, Object value) {
		return new Filter(property, Operator.in, value);
	}

	public static Filter isNull(String property) {
		return new Filter(property, Operator.isNull, null);
	}

	public static Filter isNotNull(String property) {
		return new Filter(property, Operator.isNotNull, null);
	}

	public Filter ignoreCase() {
		this.ignoreCase = Boolean.valueOf(true);
		return this;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Operator getOperator() {
		return this.operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Boolean getIgnoreCase() {
		return this.ignoreCase;
	}

	public void setIgnoreCase(Boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		Filter other = (Filter) obj;
		return new EqualsBuilder().append(getProperty(), other.getProperty()).append(getOperator(), other.getOperator())
				.append(getValue(), other.getValue()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getProperty()).append(getOperator()).append(getValue()).toHashCode();
	}
}
