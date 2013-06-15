Calendar Service for Android
====

A Calendar Service for retrieving calendar events in a specified time range.

You can either copy the content to your own working directory, or export them to a .JAR file.

Please do not delete the references.

Basic use
---
For accessing the data, simply use CalendarService.readCalendar(class.this); 
this is the basic constructor which provides events for +/- 1 day time range in the calendar.

Please note that you can also simply use the context if you are for instance using fragments.

If you wish, you can also apply specific parameters:

CalendarService.readCalendar(class.this), 2, 5)

This would provide you +/- 2 days and +/- 5 hours respectively.


Authors
---
Created by David Laundav and Christian Orthmann.
