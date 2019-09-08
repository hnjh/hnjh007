package com.web.haina.juhong.request;

public class TaskRequest {
	private String name;
	private int count;
	private String integral;
	private String start_time;
	private String end_time;
	private String type;
	private String image;
	private String steps;
	private String acceptance_conditions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getIntegral() {
		return integral;
	}

	public void setIntegral(String integral) {
		this.integral = integral;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getSteps() {
		return steps;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public String getAcceptance_conditions() {
		return acceptance_conditions;
	}

	public void setAcceptance_conditions(String acceptance_conditions) {
		this.acceptance_conditions = acceptance_conditions;
	}

}
