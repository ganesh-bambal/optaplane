package com.myspace.employee_rostering;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Timeslot implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.time.LocalDateTime endTime;
	private java.time.LocalDateTime startTime;

	public Timeslot() {
	}

	public java.time.LocalDateTime getEndTime() {
		return this.endTime;
	}

	public void setEndTime(java.time.LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public java.time.LocalDateTime getStartTime() {
		return this.startTime;
	}

	public void setStartTime(java.time.LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public Timeslot(java.time.LocalDateTime endTime,
			java.time.LocalDateTime startTime) {
		this.endTime = endTime;
		this.startTime = startTime;
	}

}