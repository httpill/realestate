package com.yibayi.core.temp.shiro.common;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * 排序工具类
 * 
 * @author lwx
 * @date 2018/05/08
 */
public class Order implements Serializable {
	private static final long serialVersionUID = 875527615534278268L;

	public Order() {
	}

	public static enum Direction {
		asc, desc;
	}

	private static final Direction DEFAULT_DIRECTION = Direction.desc;
	private String property;
	private Direction direction = DEFAULT_DIRECTION;

	public Order(String property, Direction direction) {
		this.property = property;
		this.direction = direction;
	}

	public static Order asc(String property) {
		return new Order(property, Direction.asc);
	}

	public static Order desc(String property) {
		return new Order(property, Direction.desc);
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
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
		Order other = (Order) obj;
		return new EqualsBuilder().append(getProperty(), other.getProperty())
				.append(getDirection(), other.getDirection()).isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(getProperty()).append(getDirection()).toHashCode();
	}
}
