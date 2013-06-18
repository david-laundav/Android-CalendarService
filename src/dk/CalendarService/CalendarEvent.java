package dk.CalendarService;

import java.util.Date;

/* 
 * Created by David Laundav and contributed by Christian Orthmann
 * 
 * Copyright 2013 Daivd Laundav
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class CalendarEvent implements Comparable<CalendarEvent>{
	
	private String title;
	private Date begin, end;
	private boolean allDay;
	
	public CalendarEvent() {
		
	}
	
	public CalendarEvent(String title, Date begin, Date end, boolean allDay) {
		setTitle(title);
		setBegin(begin);
		setEnd(end);
		setAllDay(allDay);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public boolean isAllDay() {
		return allDay;
	}

	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}
	
	@Override
	public String toString(){
		return getTitle() + " " + getBegin() + " " + getEnd() + " " + isAllDay();
	}

	@Override
	public int compareTo(CalendarEvent other) {
		// -1 = less, 0 = equal, 1 = greater
		return getBegin().compareTo(other.begin);
	}

}
